package com.stripe.android.stripe3ds2.security;

import com.nimbusds.jose.crypto.impl.ConcatKDF;
import com.nimbusds.jose.crypto.impl.ECDH;
import com.nimbusds.jose.util.Base64URL;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeDiffieHellmanKeyGenerator.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/StripeDiffieHellmanKeyGenerator;", "Lcom/stripe/android/stripe3ds2/security/DiffieHellmanKeyGenerator;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "<init>", "(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "generate", "Ljavax/crypto/SecretKey;", "acsPublicKey", "Ljava/security/interfaces/ECPublicKey;", "sdkPrivateKey", "Ljava/security/interfaces/ECPrivateKey;", "agreementInfo", "", "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StripeDiffieHellmanKeyGenerator implements DiffieHellmanKeyGenerator {
    private static final Companion Companion = new Companion(null);
    private static final String HASH_ALGO = "SHA-256";
    private static final int KEY_LENGTH = 256;
    private final ErrorReporter errorReporter;

    public StripeDiffieHellmanKeyGenerator(ErrorReporter errorReporter) {
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        this.errorReporter = errorReporter;
    }

    @Override // com.stripe.android.stripe3ds2.security.DiffieHellmanKeyGenerator
    public SecretKey generate(ECPublicKey acsPublicKey, ECPrivateKey sdkPrivateKey, String agreementInfo) {
        Object objM9118constructorimpl;
        Intrinsics.checkNotNullParameter(acsPublicKey, "acsPublicKey");
        Intrinsics.checkNotNullParameter(sdkPrivateKey, "sdkPrivateKey");
        Intrinsics.checkNotNullParameter(agreementInfo, "agreementInfo");
        try {
            Result.Companion companion = Result.INSTANCE;
            StripeDiffieHellmanKeyGenerator stripeDiffieHellmanKeyGenerator = this;
            objM9118constructorimpl = Result.m9118constructorimpl(new ConcatKDF("SHA-256").deriveKey(ECDH.deriveSharedSecret(acsPublicKey, sdkPrivateKey, null), 256, ConcatKDF.encodeStringData(null), ConcatKDF.encodeDataWithLength((Base64URL) null), ConcatKDF.encodeDataWithLength(Base64URL.encode(agreementInfo)), ConcatKDF.encodeIntData(256), ConcatKDF.encodeNoData()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            this.errorReporter.reportError(thM9121exceptionOrNullimpl);
        }
        Throwable thM9121exceptionOrNullimpl2 = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl2 != null) {
            throw new SDKRuntimeException(thM9121exceptionOrNullimpl2);
        }
        Intrinsics.checkNotNullExpressionValue(objM9118constructorimpl, "getOrElse(...)");
        return (SecretKey) objM9118constructorimpl;
    }

    /* compiled from: StripeDiffieHellmanKeyGenerator.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/StripeDiffieHellmanKeyGenerator$Companion;", "", "<init>", "()V", "HASH_ALGO", "", "KEY_LENGTH", "", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
