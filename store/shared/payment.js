const crypto = require('node:crypto');
const config = require('./config');

// A link grants access to one invoice/demo payment, never account or download access.
function paymentToken(order) {
  return crypto.createHmac('sha256', config.internalServiceSecret)
    .update(`flint-order-payment:v1:${order.id}:${order.payment_code}`)
    .digest('hex');
}
function validPaymentToken(order, token) {
  return !!order && typeof token === 'string' && /^[a-f0-9]{64}$/.test(token)
    && crypto.timingSafeEqual(Buffer.from(token, 'hex'), Buffer.from(paymentToken(order), 'hex'));
}
function publicInvoice(order) {
  return { id: order.id, app_name: order.app_name, amount_vnd: order.amount_vnd,
    currency: order.currency, status: order.status, payment_code: order.payment_code,
    payment_source: order.payment_source, paid_at: order.paid_at };
}
module.exports = { paymentToken, validPaymentToken, publicInvoice };
