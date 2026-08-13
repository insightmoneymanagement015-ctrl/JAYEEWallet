# Build JAYEE Wallet APK

## Android Studio
1. Extract `JAYEEWallet-ready-build.zip`.
2. Open the extracted `JAYEEWallet` folder in Android Studio.
3. Let Gradle sync and install the requested Android SDK components if Android Studio asks.
4. Select **Build > Build Bundle(s) / APK(s) > Build APK(s)**.
5. The debug APK will normally be created under:
   `app/build/outputs/apk/debug/app-debug.apk`

## Important
This project is a UI prototype. It does not yet create or store real seed phrases/private keys,
and it does not send real blockchain transactions. Do not use it with real funds.
