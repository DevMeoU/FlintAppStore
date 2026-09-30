# Render + Turso demo

Repository: https://github.com/DevMeoU/FlintAppStore

Deploy branch: `deploy/flint-app-store-render`. Root `render.yaml` creates one **free** Node web service (`flint-app-store-demo`) in Singapore. Gateway binds `0.0.0.0:$PORT`; User/App/Order remain on loopback. Build runs `npm ci --omit=dev` from `store`, start runs `npm start`, readiness uses `/api/health` and queries all three databases.

Three dedicated databases in Turso organization `devmeou`:

| Environment prefix | Database |
| --- | --- |
| `TURSO_USER_SERVICE` | `flint-app-store-users` |
| `TURSO_APP_SERVICE` | `flint-app-store-apps` |
| `TURSO_ORDER_SERVICE` | `flint-app-store-orders` |

Each prefix requires `_URL` and a **database-scoped** `_TOKEN` stored in Render environment variables. `REQUIRE_TURSO=true` stops startup if any credentials are absent, preventing fallback to disposable Render filesystem databases. The existing library databases are separate.

`JWT_SECRET` and `INTERNAL_SERVICE_SECRET` are random Render-generated values. Set a strong `ADMIN_PASSWORD` before the first start; the public deployment creates only admin and never creates `customer/123456`. Visitors can register their own customer accounts. Tokens, passwords, local `.env` and database files must not be committed.

This deployment deliberately sets `NODE_ENV=production`, `DEPLOYMENT_MODE=demo` and `PAYMENT_MODE=demo`: click-to-pay is simulated and transfers no real money. Real production without the explicit demo flag rejects mock payments. Switching to real payment requires `PAYMENT_MODE=manual` and removing `DEPLOYMENT_MODE=demo`.

## JAR data

`node scripts/export-app-db.js` creates a consistent local `data/turso-app-seed.db`, checks every release hash/size/manifest, and excludes download history from the copy. With the app URL/token in the environment, `node scripts/import-turso-snapshot.js` imports app/release rows and reads every remote BLOB back to verify its hash. Conflicting rows are not overwritten, and completed imports can be resumed. Do not copy the local user database with demo credentials. Schema and admin initialization run when the services start.

After publishing, verify the HTTPS homepage and `/api/health`, inspect the remote database backend, compare downloaded JAR SHA-256 with its remote BLOB, and exercise register → paid order → simulated payment → download. Restart and verify entitlements/data persist. Keep automatic deploys off for the trial.

Tests use a versioned free UI JAR fixture inside `store/tests/fixtures`, so a fresh GitHub checkout does not depend on the other chat's untracked Java workspace.

References: [Render Blueprints](https://render.com/docs/blueprint-spec), [port binding](https://render.com/docs/web-services#port-binding), [libSQL client](https://tursodatabase.github.io/libsql-client-ts/interfaces/Client.html).
