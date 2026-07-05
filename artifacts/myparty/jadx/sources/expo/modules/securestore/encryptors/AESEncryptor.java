package expo.modules.securestore.encryptors;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.stats.CodePackage;
import expo.modules.securestore.AuthenticationException;
import expo.modules.securestore.AuthenticationHelper;
import expo.modules.securestore.DecryptException;
import expo.modules.securestore.SecureStoreModule;
import expo.modules.securestore.SecureStoreOptions;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyStore;
import java.security.UnrecoverableEntryException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AESEncryptor.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0017J6\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010\u0016J%\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0000¢\u0006\u0002\b\u001cJ6\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010 ¨\u0006\""}, d2 = {"Lexpo/modules/securestore/encryptors/AESEncryptor;", "Lexpo/modules/securestore/encryptors/KeyBasedEncryptor;", "Ljava/security/KeyStore$SecretKeyEntry;", "<init>", "()V", "getKeyStoreAlias", "", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lexpo/modules/securestore/SecureStoreOptions;", "getExtendedKeyStoreAlias", AuthenticationHelper.REQUIRE_AUTHENTICATION_PROPERTY, "", "initializeKeyStoreEntry", "keyStore", "Ljava/security/KeyStore;", "createEncryptedItem", "Lorg/json/JSONObject;", "plaintextValue", "keyStoreEntry", "authenticationPrompt", "authenticationHelper", "Lexpo/modules/securestore/AuthenticationHelper;", "(Ljava/lang/String;Ljava/security/KeyStore$SecretKeyEntry;ZLjava/lang/String;Lexpo/modules/securestore/AuthenticationHelper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createEncryptedItemWithCipher", "cipher", "Ljavax/crypto/Cipher;", "gcmSpec", "Ljavax/crypto/spec/GCMParameterSpec;", "createEncryptedItemWithCipher$expo_secure_store_release", "decryptItem", SDKConstants.PARAM_KEY, "encryptedItem", "(Ljava/lang/String;Lorg/json/JSONObject;Ljava/security/KeyStore$SecretKeyEntry;Lexpo/modules/securestore/SecureStoreOptions;Lexpo/modules/securestore/AuthenticationHelper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "expo-secure-store_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AESEncryptor implements KeyBasedEncryptor<KeyStore.SecretKeyEntry> {
    public static final String AES_CIPHER = "AES/GCM/NoPadding";
    public static final int AES_KEY_SIZE_BITS = 256;
    private static final String CIPHERTEXT_PROPERTY = "ct";
    private static final String GCM_AUTHENTICATION_TAG_LENGTH_PROPERTY = "tlen";
    public static final String IV_PROPERTY = "iv";
    private static final int MIN_GCM_AUTHENTICATION_TAG_LENGTH = 96;
    public static final String NAME = "aes";

    /* compiled from: AESEncryptor.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.securestore.encryptors.AESEncryptor", f = "AESEncryptor.kt", i = {0, 0}, l = {88}, m = "createEncryptedItem", n = {"plaintextValue", "gcmSpec"}, s = {"L$0", "L$1"})
    /* renamed from: expo.modules.securestore.encryptors.AESEncryptor$createEncryptedItem$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AESEncryptor.this.createEncryptedItem((String) null, (KeyStore.SecretKeyEntry) null, false, (String) null, (AuthenticationHelper) null, (Continuation<? super JSONObject>) this);
        }
    }

    /* compiled from: AESEncryptor.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.securestore.encryptors.AESEncryptor", f = "AESEncryptor.kt", i = {0}, l = {131}, m = "decryptItem", n = {"ciphertextBytes"}, s = {"L$0"})
    /* renamed from: expo.modules.securestore.encryptors.AESEncryptor$decryptItem$1, reason: invalid class name and case insensitive filesystem */
    static final class C12321 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C12321(Continuation<? super C12321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AESEncryptor.this.decryptItem((String) null, (JSONObject) null, (KeyStore.SecretKeyEntry) null, (SecureStoreOptions) null, (AuthenticationHelper) null, (Continuation<? super String>) this);
        }
    }

    @Override // expo.modules.securestore.encryptors.KeyBasedEncryptor
    public /* bridge */ /* synthetic */ Object createEncryptedItem(String str, KeyStore.Entry entry, boolean z, String str2, AuthenticationHelper authenticationHelper, Continuation continuation) {
        return createEncryptedItem(str, (KeyStore.SecretKeyEntry) entry, z, str2, authenticationHelper, (Continuation<? super JSONObject>) continuation);
    }

    @Override // expo.modules.securestore.encryptors.KeyBasedEncryptor
    public /* bridge */ /* synthetic */ Object decryptItem(String str, JSONObject jSONObject, KeyStore.Entry entry, SecureStoreOptions secureStoreOptions, AuthenticationHelper authenticationHelper, Continuation continuation) {
        return decryptItem(str, jSONObject, (KeyStore.SecretKeyEntry) entry, secureStoreOptions, authenticationHelper, (Continuation<? super String>) continuation);
    }

    @Override // expo.modules.securestore.encryptors.KeyBasedEncryptor
    public String getKeyStoreAlias(SecureStoreOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        return "AES/GCM/NoPadding:" + options.getKeychainService();
    }

    @Override // expo.modules.securestore.encryptors.KeyBasedEncryptor
    public String getExtendedKeyStoreAlias(SecureStoreOptions options, boolean requireAuthentication) {
        String str;
        Intrinsics.checkNotNullParameter(options, "options");
        if (requireAuthentication) {
            str = SecureStoreModule.AUTHENTICATED_KEYSTORE_SUFFIX;
        } else {
            str = SecureStoreModule.UNAUTHENTICATED_KEYSTORE_SUFFIX;
        }
        return getKeyStoreAlias(options) + ":" + str;
    }

    @Override // expo.modules.securestore.encryptors.KeyBasedEncryptor
    public KeyStore.SecretKeyEntry initializeKeyStoreEntry(KeyStore keyStore, SecureStoreOptions options) throws GeneralSecurityException {
        Intrinsics.checkNotNullParameter(keyStore, "keyStore");
        Intrinsics.checkNotNullParameter(options, "options");
        String extendedKeyStoreAlias = getExtendedKeyStoreAlias(options, options.getRequireAuthentication());
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(extendedKeyStoreAlias, 3).setKeySize(256).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(options.getRequireAuthentication()).build();
        Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "build(...)");
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", keyStore.getProvider());
        keyGenerator.init(keyGenParameterSpecBuild);
        keyGenerator.generateKey();
        KeyStore.Entry entry = keyStore.getEntry(extendedKeyStoreAlias, null);
        KeyStore.SecretKeyEntry secretKeyEntry = entry instanceof KeyStore.SecretKeyEntry ? (KeyStore.SecretKeyEntry) entry : null;
        if (secretKeyEntry != null) {
            return secretKeyEntry;
        }
        throw new UnrecoverableEntryException("Could not retrieve the newly generated secret key entry");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createEncryptedItem(String str, KeyStore.SecretKeyEntry secretKeyEntry, boolean z, String str2, AuthenticationHelper authenticationHelper, Continuation<? super JSONObject> continuation) throws GeneralSecurityException, AuthenticationException {
        AnonymousClass1 anonymousClass1;
        GCMParameterSpec gCMParameterSpec;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objAuthenticateCipher = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objAuthenticateCipher);
            Key secretKey = secretKeyEntry.getSecretKey();
            Cipher cipher = Cipher.getInstance(AES_CIPHER);
            cipher.init(1, secretKey);
            gCMParameterSpec = (GCMParameterSpec) cipher.getParameters().getParameterSpec(GCMParameterSpec.class);
            Intrinsics.checkNotNull(cipher);
            anonymousClass1.L$0 = str;
            anonymousClass1.L$1 = gCMParameterSpec;
            anonymousClass1.label = 1;
            objAuthenticateCipher = authenticationHelper.authenticateCipher(cipher, z, str2, anonymousClass1);
            if (objAuthenticateCipher == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            GCMParameterSpec gCMParameterSpec2 = (GCMParameterSpec) anonymousClass1.L$1;
            String str3 = (String) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objAuthenticateCipher);
            gCMParameterSpec = gCMParameterSpec2;
            str = str3;
        }
        Intrinsics.checkNotNull(gCMParameterSpec);
        return createEncryptedItemWithCipher$expo_secure_store_release(str, (Cipher) objAuthenticateCipher, gCMParameterSpec);
    }

    public final JSONObject createEncryptedItemWithCipher$expo_secure_store_release(String plaintextValue, Cipher cipher, GCMParameterSpec gcmSpec) throws JSONException {
        Intrinsics.checkNotNullParameter(plaintextValue, "plaintextValue");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        Intrinsics.checkNotNullParameter(gcmSpec, "gcmSpec");
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = plaintextValue.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(cipher.doFinal(bytes), 2);
        String strEncodeToString2 = Base64.encodeToString(gcmSpec.getIV(), 2);
        JSONObject jSONObjectPut = new JSONObject().put("ct", strEncodeToString).put("iv", strEncodeToString2).put(GCM_AUTHENTICATION_TAG_LENGTH_PROPERTY, gcmSpec.getTLen());
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object decryptItem(String str, JSONObject jSONObject, KeyStore.SecretKeyEntry secretKeyEntry, SecureStoreOptions secureStoreOptions, AuthenticationHelper authenticationHelper, Continuation<? super String> continuation) throws JSONException, GeneralSecurityException, AuthenticationException, DecryptException {
        C12321 c12321;
        byte[] bArr;
        if (continuation instanceof C12321) {
            c12321 = (C12321) continuation;
            if ((c12321.label & Integer.MIN_VALUE) != 0) {
                c12321.label -= Integer.MIN_VALUE;
            } else {
                c12321 = new C12321(continuation);
            }
        }
        Object obj = c12321.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c12321.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String string = jSONObject.getString("ct");
            String string2 = jSONObject.getString("iv");
            int i2 = jSONObject.getInt(GCM_AUTHENTICATION_TAG_LENGTH_PROPERTY);
            byte[] bArrDecode = Base64.decode(string, 0);
            AlgorithmParameterSpec gCMParameterSpec = new GCMParameterSpec(i2, Base64.decode(string2, 0));
            Cipher cipher = Cipher.getInstance(AES_CIPHER);
            boolean zOptBoolean = jSONObject.optBoolean(AuthenticationHelper.REQUIRE_AUTHENTICATION_PROPERTY);
            if (i2 < 96) {
                throw new DecryptException("Authentication tag length must be at least 96 bits long", str, secureStoreOptions.getKeychainService(), null, 8, null);
            }
            cipher.init(2, secretKeyEntry.getSecretKey(), gCMParameterSpec);
            Intrinsics.checkNotNull(cipher);
            String authenticationPrompt = secureStoreOptions.getAuthenticationPrompt();
            c12321.L$0 = bArrDecode;
            c12321.label = 1;
            Object objAuthenticateCipher = authenticationHelper.authenticateCipher(cipher, zOptBoolean, authenticationPrompt, c12321);
            if (objAuthenticateCipher == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objAuthenticateCipher;
            bArr = bArrDecode;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr = (byte[]) c12321.L$0;
            ResultKt.throwOnFailure(obj);
        }
        byte[] bArrDoFinal = ((Cipher) obj).doFinal(bArr);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        return new String(bArrDoFinal, UTF_8);
    }
}
