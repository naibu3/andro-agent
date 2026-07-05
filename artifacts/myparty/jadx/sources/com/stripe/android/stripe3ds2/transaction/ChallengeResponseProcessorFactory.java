package com.stripe.android.stripe3ds2.transaction;

import androidx.webkit.Profile;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.MessageTransformer;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.ChallengeResponseProcessor;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChallengeResponseProcessorFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bà\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessorFactory;", "", "create", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessor;", "secretKey", "Ljavax/crypto/SecretKey;", Profile.DEFAULT_PROFILE_NAME, "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChallengeResponseProcessorFactory {
    ChallengeResponseProcessor create(SecretKey secretKey);

    /* compiled from: ChallengeResponseProcessorFactory.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessorFactory$Default;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessorFactory;", "messageTransformer", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "creqExecutorConfig", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "<init>", "(Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;)V", "create", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessor$Default;", "secretKey", "Ljavax/crypto/SecretKey;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Default implements ChallengeResponseProcessorFactory {
        private final ChallengeRequestExecutor.Config creqExecutorConfig;
        private final ErrorReporter errorReporter;
        private final MessageTransformer messageTransformer;

        public Default(MessageTransformer messageTransformer, ErrorReporter errorReporter, ChallengeRequestExecutor.Config creqExecutorConfig) {
            Intrinsics.checkNotNullParameter(messageTransformer, "messageTransformer");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(creqExecutorConfig, "creqExecutorConfig");
            this.messageTransformer = messageTransformer;
            this.errorReporter = errorReporter;
            this.creqExecutorConfig = creqExecutorConfig;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResponseProcessorFactory
        public ChallengeResponseProcessor.Default create(SecretKey secretKey) {
            Intrinsics.checkNotNullParameter(secretKey, "secretKey");
            return new ChallengeResponseProcessor.Default(this.messageTransformer, secretKey, this.errorReporter, this.creqExecutorConfig);
        }
    }
}
