package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AttachConsumerToLinkAccountSession.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096B¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/financialconnections/domain/RealAttachConsumerToLinkAccountSession;", "Lcom/stripe/android/financialconnections/domain/AttachConsumerToLinkAccountSession;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "consumerRepository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;", "<init>", "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;)V", "invoke", "", "consumerSessionClientSecret", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RealAttachConsumerToLinkAccountSession implements AttachConsumerToLinkAccountSession {
    public static final int $stable = 8;
    private final FinancialConnectionsSheetConfiguration configuration;
    private final FinancialConnectionsConsumerSessionRepository consumerRepository;

    @Inject
    public RealAttachConsumerToLinkAccountSession(FinancialConnectionsSheetConfiguration configuration, FinancialConnectionsConsumerSessionRepository consumerRepository) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(consumerRepository, "consumerRepository");
        this.configuration = configuration;
        this.consumerRepository = consumerRepository;
    }

    @Override // com.stripe.android.financialconnections.domain.AttachConsumerToLinkAccountSession
    public Object invoke(String str, Continuation<? super Unit> continuation) {
        Object objAttachLinkConsumerToLinkAccountSession = this.consumerRepository.attachLinkConsumerToLinkAccountSession(str, this.configuration.getFinancialConnectionsSessionClientSecret(), continuation);
        return objAttachLinkConsumerToLinkAccountSession == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAttachLinkConsumerToLinkAccountSession : Unit.INSTANCE;
    }
}
