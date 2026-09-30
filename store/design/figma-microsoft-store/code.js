// Run in the existing Flint App Store — Screens & Management file.
// Local development plugin: no network, credentials, payments or database access.
const screenIds = ['3:6','3:70','3:136','3:202','3:250','3:298','3:340','3:407','4:92','4:177','4:257','4:326'];
const colors = {bg:'F3F3F3',sidebar:'F3F3F3',panel:'FFFFFF',surface:'F9F9F9',primary:'0067C0',accent:'0067C0',text:'202020',muted:'666666',line:'E5E5E5',hero:'173866',success:'216C38',warning:'805900',danger:'A32C3A'};
const rgb = hex => ({r:parseInt(hex.slice(0,2),16)/255,g:parseInt(hex.slice(2,4),16)/255,b:parseInt(hex.slice(4,6),16)/255});
const solid = hex => ({type:'SOLID',color:rgb(hex)});
const navLabels = {'Khám phá app':'⌂\nTrang chủ','App đã mua':'▤\nThư viện','Đơn thanh toán':'↗\nĐơn mua','Quản lý ứng dụng':'▦\nỨng dụng','Thông tin & giá':'◇\nGiá app','Phát hành JAR':'↑\nPhát hành','Xem storefront':'⌂\nCửa hàng'};
const iconSvg = '<svg xmlns="http://www.w3.org/2000/svg" width="48" height="48" viewBox="0 0 48 48"><rect width="48" height="48" rx="10" fill="#0067c0"/><path d="M13 18h22v22H13zM18 18v-5a6 6 0 0 1 12 0v5M20 24h9m-9 0v10m0-5h7" fill="none" stroke="#fff" stroke-width="2" stroke-linejoin="round"/></svg>';
const phoneSvg = '<svg xmlns="http://www.w3.org/2000/svg" width="260" height="250" viewBox="0 0 260 250"><circle cx="155" cy="125" r="118" fill="#2961a8"/><g transform="translate(95 17) rotate(-9 65 110)"><rect width="130" height="216" rx="18" fill="#102345" stroke="#9fc5fa" stroke-width="2"/><rect x="10" y="20" width="110" height="180" rx="8" fill="#3a56a2"/><rect x="24" y="72" width="35" height="35" rx="7" fill="#657fca"/><rect x="70" y="72" width="35" height="35" rx="7" fill="#657fca"/><rect x="24" y="118" width="35" height="35" rx="7" fill="#657fca"/><rect x="70" y="118" width="35" height="35" rx="7" fill="#657fca"/><path d="m33 87 9-7 9 7v12H33zm44 12V82l19-3v14M34 128h15v15H34zm42 3h21v12H76z" fill="none" stroke="#fff" stroke-width="1.5"/></g></svg>';

async function loadCurrentFonts(nodes) {
  const seen = new Map();
  for (const root of nodes) for (const text of root.findAllWithCriteria({types:['TEXT']})) {
    for (const segment of text.getStyledTextSegments(['fontName'])) seen.set(JSON.stringify(segment.fontName), segment.fontName);
  }
  await Promise.all([...seen.values()].map(font => figma.loadFontAsync(font)));
}

async function run() {
  const page = await figma.getNodeByIdAsync('2:2');
  const componentsPage = await figma.getNodeByIdAsync('0:1');
  if (!page || page.type !== 'PAGE' || !componentsPage || componentsPage.type !== 'PAGE') throw new Error('Mở file Flint App Store — Screens & Management trước khi chạy.');
  await figma.setCurrentPageAsync(page);
  const screens = [];
  for (const id of screenIds) {
    const node = await figma.getNodeByIdAsync(id);
    if (!node || node.type !== 'FRAME') throw new Error('Không tìm thấy màn hình '+id+'. Plugin chỉ áp dụng cho file thiết kế đã tạo.');
    screens.push(node);
  }
  // Preflight and font loading precede all mutations.
  await loadCurrentFonts(screens);
  await figma.setCurrentPageAsync(componentsPage);
  await loadCurrentFonts([componentsPage]);
  const available = await figma.listAvailableFontsAsync();
  const preferred = available.some(f=>f.fontName.family==='Segoe UI') ? 'Segoe UI' : 'Inter';
  const styleMap = {};
  for (const requested of ['Regular','Medium','Semi Bold','Bold']) {
    const found = available.find(f=>f.fontName.family===preferred && f.fontName.style.replace(/\s/g,'').toLowerCase()===requested.replace(/\s/g,'').toLowerCase());
    if (found) {styleMap[requested]=found.fontName; await figma.loadFontAsync(found.fontName);}
  }
  const variables = await figma.variables.getLocalVariablesAsync();
  for (const [key,value] of Object.entries(colors)) {
    const variable = variables.find(v=>v.name==='palette/'+key);
    if (!variable) throw new Error('Không tìm thấy palette/'+key);
    for (const modeId of Object.keys(variable.valuesByMode)) variable.setValueForMode(modeId,{...rgb(value),a:1});
  }
  for (const [key,value] of [['radius/control',5],['radius/panel',8]]) {
    const variable=variables.find(v=>v.name===key);
    if (variable) for (const modeId of Object.keys(variable.valuesByMode)) variable.setValueForMode(modeId,value);
  }
  for (const style of await figma.getLocalTextStylesAsync()) if (style.name.startsWith('Flint/')) {
    const font=styleMap[style.fontName.style]; if(font) style.fontName=font;
  }
  const buttonSet=await figma.getNodeByIdAsync('2:50');
  for (const variant of buttonSet.children) for (const text of variant.findAllWithCriteria({types:['TEXT']})) {
    if (variant.name==='State=Primary') text.fills=[solid('FFFFFF')];
  }
  const fieldSet=await figma.getNodeByIdAsync('2:69');
  for (const variant of fieldSet.children) variant.fills=[solid('FFFFFF')];
  const navSet=await figma.getNodeByIdAsync('2:64');
  for (const variant of navSet.children) {
    variant.resize(74,68);variant.layoutMode='VERTICAL';variant.paddingLeft=variant.paddingRight=4;
    variant.primaryAxisAlignItems=variant.counterAxisAlignItems='CENTER';
    variant.fills=variant.name==='State=Selected'?[solid('E7E7E7')]:[];
    for(const text of variant.findAllWithCriteria({types:['TEXT']})) {
      text.fontSize=11;text.lineHeight={unit:'PIXELS',value:18};text.textAlignHorizontal='CENTER';
      text.textAutoResize='HEIGHT';text.resize(66,text.height);
      if(variant.name==='State=Selected')text.fills=[solid('0067C0')];
    }
  }
  const cardSet=await figma.getNodeByIdAsync('2:98');
  for (const variant of cardSet.children) {
    variant.resize(330,340);variant.paddingLeft=variant.paddingRight=20;
    if (!variant.children.some(n=>n.name==='App icon')) {const icon=figma.createNodeFromSvg(iconSvg);icon.name='App icon';variant.insertChild(0,icon);}
  }
  const note=componentsPage.findOne(n=>n.type==='TEXT'&&n.characters.startsWith('Source:'));
  if(note)note.characters='Microsoft Store inspired · Light theme · Editable components, tokens and text. Giá và thanh toán là dữ liệu mô phỏng.';
  await figma.setCurrentPageAsync(page);
  // Re-load fonts after changing style families before touching text or parents.
  await loadCurrentFonts(screens);
  for (const root of screens) {
    for (const instance of root.findAllWithCriteria({types:['INSTANCE']})) {
      const component=await instance.getMainComponentAsync();
      if(component?.parent?.id==='2:98')instance.resize(instance.width,340);
    }
    const side=root.children.find(n=>n.name==='Sidebar'), workspace=root.children.find(n=>n.name==='Workspace');
    if(!side||!workspace)throw new Error('Cấu trúc '+root.name+' đã thay đổi.');
    root.resize(1440,1100);root.paddingTop=72;root.clipsContent=true;
    side.resize(88,1028);side.paddingTop=12;side.paddingBottom=12;side.paddingLeft=side.paddingRight=7;side.itemSpacing=4;
    for(const node of side.children) {
      if(node.type==='INSTANCE') {
        node.resize(74,68);
        const property=Object.keys(node.componentProperties).find(k=>k.startsWith('Label#'));
        const old=node.componentProperties[property]?.value;
        if(property)node.setProperties({[property]:navLabels[old]||old});
      } else node.visible=false;
    }
    workspace.resize(1352,1028);
    const top=workspace.children.find(n=>n.name==='Topbar') || root.children.find(n=>n.name==='Topbar');
    if(top) {
      root.appendChild(top);top.layoutPositioning='ABSOLUTE';top.x=0;top.y=0;top.resize(1440,72);
      top.paddingLeft=top.paddingRight=24;top.paddingTop=top.paddingBottom=15;top.primaryAxisAlignItems='SPACE_BETWEEN';top.fills=[solid('F3F3F3')];
      const brand=top.children.find(n=>n.type==='TEXT');
      if(brand){brand.characters='Flint App Store';brand.fontSize=16;brand.resize(250,brand.height);brand.fills=[solid('202020')];}
      if(!top.children.some(n=>n.name==='Global search')) {
        const input=fieldSet.children[0].createInstance();top.insertChild(1,input);input.name='Global search';input.resize(600,40);
        const key=Object.keys(input.componentProperties).find(k=>k.startsWith('Value#'));
        input.setProperties({[key]:'Tìm kiếm ứng dụng cho FlintOS                    ⌕'});
      }
    }
    const body=workspace.children.find(n=>n.name==='Main content');
    if(body){body.resize(1352,974);body.paddingTop=body.paddingBottom=28;body.paddingLeft=body.paddingRight=36;body.itemSpacing=18;}
    const footer=workspace.children.find(n=>n.name==='Footer');
    if(footer){footer.resize(1352,54);footer.paddingLeft=footer.paddingRight=36;}
    const hero=root.findOne(n=>n.type==='FRAME'&&n.name==='Hero');
    if(hero) {
      hero.resize(1116,260);hero.paddingLeft=hero.paddingRight=32;hero.itemSpacing=12;
      for(const text of hero.findAllWithCriteria({types:['TEXT']})){text.fills=[solid('FFFFFF')];if(text.width>790)text.resize(790,text.height);}
      const title=hero.findOne(n=>n.type==='TEXT'&&n.characters.startsWith('Một kho app.'));
      if(title){title.characters='Nhỏ gọn. Đầy khả năng.';title.fontSize=36;}
      if(!hero.children.some(n=>n.name==='FlintOS device artwork')){const art=figma.createNodeFromSvg(phoneSvg);art.name='FlintOS device artwork';hero.appendChild(art);art.layoutPositioning='ABSOLUTE';art.x=850;art.y=5;}
    }
  }
  figma.currentPage.selection=[screens[0]];figma.viewport.scrollAndZoomIntoView([screens[0]]);
  return {screenIds:screens.map(n=>n.id),screenCount:screens.length,font:preferred,theme:'Microsoft Store light',cloudVerified:false};
}

run().then(result=>figma.closePlugin('Đã đổi '+result.screenCount+' màn hình sang giao diện Microsoft Store.')).catch(error=>figma.closePlugin(error.message));
