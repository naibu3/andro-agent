package com.stripe.android.stripe3ds2.security;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.JWEObject;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.crypto.DirectDecrypter;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException;
import com.stripe.android.stripe3ds2.transactions.ProtocolError;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DefaultMessageTransformer.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 02\u00020\u0001:\u00010B!\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0001¢\u0006\u0002\b\u0015J\u001d\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\b\u0017J\u0015\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\u001bJ\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u000bH\u0002J\u001d\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0001¢\u0006\u0002\b\"J\u001d\u0010#\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0001¢\u0006\u0002\b$J\t\u0010%\u001a\u00020\u0003HÂ\u0003J\t\u0010&\u001a\u00020\u0005HÂ\u0003J\t\u0010'\u001a\u00020\u0005HÂ\u0003J,\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÀ\u0001¢\u0006\u0002\b)J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u000bHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", NamedConstantsKt.IS_LIVE_MODE, "", "counterSdkToAcs", "", "counterAcsToSdk", "<init>", "(ZBB)V", "(Z)V", "encrypt", "", "challengeRequest", "Lorg/json/JSONObject;", "secretKey", "Ljavax/crypto/SecretKey;", "decrypt", "message", "validateAcsToSdkCounter", "", "cres", "validateAcsToSdkCounter$3ds2sdk_release", "decryptMessage", "decryptMessage$3ds2sdk_release", "createEncryptionHeader", "Lcom/nimbusds/jose/JWEHeader;", "keyId", "createEncryptionHeader$3ds2sdk_release", "isValidPayloadPart", "part", "getDecryptionKey", "", "encryptionMethod", "Lcom/nimbusds/jose/EncryptionMethod;", "getDecryptionKey$3ds2sdk_release", "getEncryptionKey", "getEncryptionKey$3ds2sdk_release", "component1", "component2", "component3", "copy", "copy$3ds2sdk_release", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class DefaultMessageTransformer implements MessageTransformer {
    public static final int BITS_IN_BYTE = 8;
    private static final EncryptionMethod ENCRYPTION_METHOD = EncryptionMethod.A128CBC_HS256;
    public static final String FIELD_ACS_COUNTER_ACS_TO_SDK = "acsCounterAtoS";
    public static final String FIELD_SDK_COUNTER_SDK_TO_ACS = "sdkCounterStoA";
    private byte counterAcsToSdk;
    private byte counterSdkToAcs;
    private final boolean isLiveMode;

    /* renamed from: component1, reason: from getter */
    private final boolean getIsLiveMode() {
        return this.isLiveMode;
    }

    /* renamed from: component2, reason: from getter */
    private final byte getCounterSdkToAcs() {
        return this.counterSdkToAcs;
    }

    /* renamed from: component3, reason: from getter */
    private final byte getCounterAcsToSdk() {
        return this.counterAcsToSdk;
    }

    public static /* synthetic */ DefaultMessageTransformer copy$3ds2sdk_release$default(DefaultMessageTransformer defaultMessageTransformer, boolean z, byte b, byte b2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = defaultMessageTransformer.isLiveMode;
        }
        if ((i & 2) != 0) {
            b = defaultMessageTransformer.counterSdkToAcs;
        }
        if ((i & 4) != 0) {
            b2 = defaultMessageTransformer.counterAcsToSdk;
        }
        return defaultMessageTransformer.copy$3ds2sdk_release(z, b, b2);
    }

    public final DefaultMessageTransformer copy$3ds2sdk_release(boolean isLiveMode, byte counterSdkToAcs, byte counterAcsToSdk) {
        return new DefaultMessageTransformer(isLiveMode, counterSdkToAcs, counterAcsToSdk);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultMessageTransformer)) {
            return false;
        }
        DefaultMessageTransformer defaultMessageTransformer = (DefaultMessageTransformer) other;
        return this.isLiveMode == defaultMessageTransformer.isLiveMode && this.counterSdkToAcs == defaultMessageTransformer.counterSdkToAcs && this.counterAcsToSdk == defaultMessageTransformer.counterAcsToSdk;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isLiveMode) * 31) + Byte.hashCode(this.counterSdkToAcs)) * 31) + Byte.hashCode(this.counterAcsToSdk);
    }

    public String toString() {
        return "DefaultMessageTransformer(isLiveMode=" + this.isLiveMode + ", counterSdkToAcs=" + ((int) this.counterSdkToAcs) + ", counterAcsToSdk=" + ((int) this.counterAcsToSdk) + ")";
    }

    public DefaultMessageTransformer(boolean z, byte b, byte b2) {
        this.isLiveMode = z;
        this.counterSdkToAcs = b;
        this.counterAcsToSdk = b2;
    }

    public DefaultMessageTransformer(boolean z) {
        this(z, (byte) 0, (byte) 0);
    }

    @Override // com.stripe.android.stripe3ds2.security.MessageTransformer
    public String encrypt(JSONObject challengeRequest, SecretKey secretKey) throws JSONException, JOSEException {
        Intrinsics.checkNotNullParameter(challengeRequest, "challengeRequest");
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        String string = challengeRequest.getString(ChallengeRequestData.FIELD_ACS_TRANS_ID);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        JWEHeader jWEHeaderCreateEncryptionHeader$3ds2sdk_release = createEncryptionHeader$3ds2sdk_release(string);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.ROOT, "%03d", Arrays.copyOf(new Object[]{Byte.valueOf(this.counterSdkToAcs)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        challengeRequest.put(FIELD_SDK_COUNTER_SDK_TO_ACS, str);
        JWEObject jWEObject = new JWEObject(jWEHeaderCreateEncryptionHeader$3ds2sdk_release, new Payload(challengeRequest.toString()));
        EncryptionMethod encryptionMethod = jWEHeaderCreateEncryptionHeader$3ds2sdk_release.getEncryptionMethod();
        Intrinsics.checkNotNullExpressionValue(encryptionMethod, "getEncryptionMethod(...)");
        jWEObject.encrypt(new TransactionEncrypter(getEncryptionKey$3ds2sdk_release(secretKey, encryptionMethod), this.counterSdkToAcs));
        byte b = (byte) (this.counterSdkToAcs + 1);
        this.counterSdkToAcs = b;
        if (b == 0) {
            throw new IllegalArgumentException("SDK to ACS counter is zero".toString());
        }
        String strSerialize = jWEObject.serialize();
        Intrinsics.checkNotNullExpressionValue(strSerialize, "serialize(...)");
        return strSerialize;
    }

    @Override // com.stripe.android.stripe3ds2.security.MessageTransformer
    public JSONObject decrypt(String message, SecretKey secretKey) throws JSONException, ChallengeResponseParseException, JOSEException, ParseException {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        JSONObject jSONObjectDecryptMessage$3ds2sdk_release = decryptMessage$3ds2sdk_release(message, secretKey);
        validateAcsToSdkCounter$3ds2sdk_release(jSONObjectDecryptMessage$3ds2sdk_release);
        byte b = (byte) (this.counterAcsToSdk + 1);
        this.counterAcsToSdk = b;
        if (b != 0) {
            return jSONObjectDecryptMessage$3ds2sdk_release;
        }
        throw new IllegalArgumentException("ACS to SDK counter is zero".toString());
    }

    public final void validateAcsToSdkCounter$3ds2sdk_release(JSONObject cres) throws JSONException, ChallengeResponseParseException {
        Object objM9118constructorimpl;
        Intrinsics.checkNotNullParameter(cres, "cres");
        if (this.isLiveMode) {
            if (!cres.has(FIELD_ACS_COUNTER_ACS_TO_SDK)) {
                throw ChallengeResponseParseException.INSTANCE.createRequiredDataElementMissing(FIELD_ACS_COUNTER_ACS_TO_SDK);
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                DefaultMessageTransformer defaultMessageTransformer = this;
                String string = cres.getString(FIELD_ACS_COUNTER_ACS_TO_SDK);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                objM9118constructorimpl = Result.m9118constructorimpl(Byte.valueOf(Byte.parseByte(string)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl) != null) {
                throw ChallengeResponseParseException.INSTANCE.createInvalidDataElementFormat(FIELD_ACS_COUNTER_ACS_TO_SDK);
            }
            byte bByteValue = ((Number) objM9118constructorimpl).byteValue();
            if (this.counterAcsToSdk == bByteValue) {
                return;
            }
            throw new ChallengeResponseParseException(ProtocolError.DataDecryptionFailure, "Counters are not equal. SDK counter: " + ((int) this.counterAcsToSdk) + ", ACS counter: " + ((int) bByteValue));
        }
    }

    public final JSONObject decryptMessage$3ds2sdk_release(String message, SecretKey secretKey) throws JSONException, ChallengeResponseParseException, JOSEException, ParseException {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        JWEObject jWEObject = JWEObject.parse(message);
        EncryptionMethod encryptionMethod = jWEObject.getHeader().getEncryptionMethod();
        Intrinsics.checkNotNullExpressionValue(encryptionMethod, "getEncryptionMethod(...)");
        jWEObject.decrypt(new DirectDecrypter(getDecryptionKey$3ds2sdk_release(secretKey, encryptionMethod)));
        String string = jWEObject.getHeader().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (isValidPayloadPart(string)) {
            String string2 = jWEObject.getIV().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            if (isValidPayloadPart(string2)) {
                String string3 = jWEObject.getCipherText().toString();
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                if (isValidPayloadPart(string3)) {
                    String string4 = jWEObject.getAuthTag().toString();
                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                    if (isValidPayloadPart(string4)) {
                        return new JSONObject(jWEObject.getPayload().toString());
                    }
                }
            }
        }
        throw new ChallengeResponseParseException(ProtocolError.DataDecryptionFailure, "Invalid encryption.");
    }

    public final JWEHeader createEncryptionHeader$3ds2sdk_release(String keyId) {
        Intrinsics.checkNotNullParameter(keyId, "keyId");
        JWEHeader jWEHeaderBuild = new JWEHeader.Builder(JWEAlgorithm.DIR, ENCRYPTION_METHOD).keyID(keyId).build();
        Intrinsics.checkNotNullExpressionValue(jWEHeaderBuild, "build(...)");
        return jWEHeaderBuild;
    }

    private final boolean isValidPayloadPart(String part) {
        if (!StringsKt.endsWith$default(part, "=", false, 2, (Object) null)) {
            String str = part;
            if (!StringsKt.contains$default((CharSequence) str, (CharSequence) " ", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "+", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "\n", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "/", false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    public final byte[] getDecryptionKey$3ds2sdk_release(SecretKey secretKey, EncryptionMethod encryptionMethod) {
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        Intrinsics.checkNotNullParameter(encryptionMethod, "encryptionMethod");
        byte[] encoded = secretKey.getEncoded();
        if (EncryptionMethod.A128GCM == encryptionMethod) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(encoded, encoded.length - (EncryptionMethod.A128GCM.cekBitLength() / 8), encoded.length);
            Intrinsics.checkNotNull(bArrCopyOfRange);
            return bArrCopyOfRange;
        }
        Intrinsics.checkNotNull(encoded);
        return encoded;
    }

    public final byte[] getEncryptionKey$3ds2sdk_release(SecretKey secretKey, EncryptionMethod encryptionMethod) {
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        Intrinsics.checkNotNullParameter(encryptionMethod, "encryptionMethod");
        byte[] encoded = secretKey.getEncoded();
        if (EncryptionMethod.A128GCM == encryptionMethod) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(encoded, 0, EncryptionMethod.A128GCM.cekBitLength() / 8);
            Intrinsics.checkNotNull(bArrCopyOfRange);
            return bArrCopyOfRange;
        }
        Intrinsics.checkNotNull(encoded);
        return encoded;
    }
}
