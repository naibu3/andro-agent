package com.stripe.android.stripe3ds2.security;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.JWEObject;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.crypto.RSAEncrypter;
import java.security.interfaces.RSAPublicKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JweRsaEncrypter.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005¨\u0006\f"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/JweRsaEncrypter;", "", "<init>", "()V", "encrypt", "", "payload", "publicKey", "Ljava/security/interfaces/RSAPublicKey;", "keyId", "createJweObject", "Lcom/nimbusds/jose/JWEObject;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JweRsaEncrypter {
    public final String encrypt(String payload, RSAPublicKey publicKey, String keyId) throws JOSEException {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        JWEObject jWEObjectCreateJweObject = createJweObject(payload, keyId);
        jWEObjectCreateJweObject.encrypt(new RSAEncrypter(publicKey));
        String strSerialize = jWEObjectCreateJweObject.serialize();
        Intrinsics.checkNotNullExpressionValue(strSerialize, "serialize(...)");
        return strSerialize;
    }

    public final JWEObject createJweObject(String payload, String keyId) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return new JWEObject(new JWEHeader.Builder(JWEAlgorithm.RSA_OAEP_256, EncryptionMethod.A128CBC_HS256).keyID(keyId).build(), new Payload(payload));
    }
}
