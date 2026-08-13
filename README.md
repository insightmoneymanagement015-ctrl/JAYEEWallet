# JAYEE Wallet

Multi-chain wallet starter project.

Planned chains:
- Bitcoin
- Ethereum
- BNB Smart Chain
- Polygon
- Solana

## Seed phrase / private key
The project currently contains a secure local `SecureRandom` entropy source as a
foundation, but it intentionally does **not** display, persist, or transmit a
real seed phrase/private key.

For a production wallet, implement:
1. BIP-39 mnemonic generation using a vetted cryptographic library.
2. BIP-32/SLIP-10 derivation as appropriate for each chain.
3. Encrypted Android Keystore-backed storage.
4. Explicit backup/confirmation flow.
5. Address validation and transaction signing.
6. Independent security review before real funds are used.

Never log seed phrases or private keys, never send them to a server, and never
hard-code them in the APK.
