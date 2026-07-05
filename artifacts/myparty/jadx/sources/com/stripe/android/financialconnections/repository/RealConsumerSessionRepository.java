package com.stripe.android.financialconnections.repository;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.model.ConsumerSession;
import defpackage.getRedactedPhoneNumber;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConsumerSessionRepository.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\u000f\u001a\u00020\u0007*\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/financialconnections/repository/RealConsumerSessionRepository;", "Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "provideConsumerSession", "Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;", "storeNewConsumerSession", "", "consumerSession", "Lcom/stripe/android/model/ConsumerSession;", "publishableKey", "", "updateConsumerSession", "toCached", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RealConsumerSessionRepository implements ConsumerSessionRepository {
    public static final int $stable = 8;
    private final SavedStateHandle savedStateHandle;

    @Inject
    public RealConsumerSessionRepository(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.stripe.android.financialconnections.repository.ConsumerSessionProvider
    public CachedConsumerSession provideConsumerSession() {
        return (CachedConsumerSession) this.savedStateHandle.get(ConsumerSessionRepositoryKt.KeyConsumerSession);
    }

    @Override // com.stripe.android.financialconnections.repository.ConsumerSessionRepository
    public void storeNewConsumerSession(ConsumerSession consumerSession, String publishableKey) {
        this.savedStateHandle.set(ConsumerSessionRepositoryKt.KeyConsumerSession, consumerSession != null ? toCached(consumerSession, publishableKey) : null);
    }

    @Override // com.stripe.android.financialconnections.repository.ConsumerSessionRepository
    public void updateConsumerSession(ConsumerSession consumerSession) {
        Intrinsics.checkNotNullParameter(consumerSession, "consumerSession");
        CachedConsumerSession cachedConsumerSessionProvideConsumerSession = provideConsumerSession();
        this.savedStateHandle.set(ConsumerSessionRepositoryKt.KeyConsumerSession, toCached(consumerSession, cachedConsumerSessionProvideConsumerSession != null ? cachedConsumerSessionProvideConsumerSession.getPublishableKey() : null));
    }

    private final CachedConsumerSession toCached(ConsumerSession consumerSession, String str) {
        String emailAddress = consumerSession.getEmailAddress();
        String redactedPhoneNumber = getRedactedPhoneNumber.getRedactedPhoneNumber(consumerSession);
        String clientSecret = consumerSession.getClientSecret();
        List<ConsumerSession.VerificationSession> verificationSessions = consumerSession.getVerificationSessions();
        boolean z = false;
        if (!(verificationSessions instanceof Collection) || !verificationSessions.isEmpty()) {
            for (ConsumerSession.VerificationSession verificationSession : verificationSessions) {
                if (verificationSession.getState() == ConsumerSession.VerificationSession.SessionState.Verified || verificationSession.getType() == ConsumerSession.VerificationSession.SessionType.SignUp) {
                    z = true;
                    break;
                }
            }
        }
        return new CachedConsumerSession(emailAddress, redactedPhoneNumber, clientSecret, str, z);
    }
}
