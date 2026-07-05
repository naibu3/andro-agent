package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.CustomEmailType;
import com.stripe.android.model.VerificationType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StartVerification.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\nJ \u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0086@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/financialconnections/domain/StartVerification;", "", "consumerSessionRepository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;", "<init>", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;)V", "sms", "Lcom/stripe/android/model/ConsumerSession;", "consumerSessionClientSecret", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "email", "businessName", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StartVerification {
    public static final int $stable = 8;
    private final FinancialConnectionsConsumerSessionRepository consumerSessionRepository;

    @Inject
    public StartVerification(FinancialConnectionsConsumerSessionRepository consumerSessionRepository) {
        Intrinsics.checkNotNullParameter(consumerSessionRepository, "consumerSessionRepository");
        this.consumerSessionRepository = consumerSessionRepository;
    }

    public final Object sms(String str, Continuation<? super ConsumerSession> continuation) {
        return this.consumerSessionRepository.startConsumerVerification(str, null, VerificationType.SMS, null, continuation);
    }

    public final Object email(String str, String str2, Continuation<? super ConsumerSession> continuation) {
        return this.consumerSessionRepository.startConsumerVerification(str, str2, VerificationType.EMAIL, CustomEmailType.NETWORKED_CONNECTIONS_OTP_EMAIL, continuation);
    }
}
