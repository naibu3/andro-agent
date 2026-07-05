package com.stripe.android.financialconnections.repository;

import com.stripe.android.model.ConsumerSession;
import kotlin.Metadata;

/* compiled from: ConsumerSessionRepository.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;", "Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;", "storeNewConsumerSession", "", "consumerSession", "Lcom/stripe/android/model/ConsumerSession;", "publishableKey", "", "updateConsumerSession", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ConsumerSessionRepository extends ConsumerSessionProvider {
    void storeNewConsumerSession(ConsumerSession consumerSession, String publishableKey);

    void updateConsumerSession(ConsumerSession consumerSession);
}
