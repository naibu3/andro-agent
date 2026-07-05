package com.stripe.android.paymentsheet.state;

import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.LinkConfigurationCoordinator;
import com.stripe.android.link.model.AccountStatus;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: LinkAccountStatusProvider.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096B¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/state/DefaultLinkAccountStatusProvider;", "Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;", "linkConfigurationCoordinator", "Lcom/stripe/android/link/LinkConfigurationCoordinator;", "<init>", "(Lcom/stripe/android/link/LinkConfigurationCoordinator;)V", "invoke", "Lcom/stripe/android/link/model/AccountStatus;", "configuration", "Lcom/stripe/android/link/LinkConfiguration;", "(Lcom/stripe/android/link/LinkConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultLinkAccountStatusProvider implements LinkAccountStatusProvider {
    public static final int $stable = 8;
    private final LinkConfigurationCoordinator linkConfigurationCoordinator;

    @Inject
    public DefaultLinkAccountStatusProvider(LinkConfigurationCoordinator linkConfigurationCoordinator) {
        Intrinsics.checkNotNullParameter(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        this.linkConfigurationCoordinator = linkConfigurationCoordinator;
    }

    @Override // com.stripe.android.paymentsheet.state.LinkAccountStatusProvider
    public Object invoke(LinkConfiguration linkConfiguration, Continuation<? super AccountStatus> continuation) {
        return FlowKt.first(this.linkConfigurationCoordinator.getAccountStatusFlow(linkConfiguration), continuation);
    }
}
