package com.stripe.android.paymentelement.embedded.content;

import com.stripe.android.paymentsheet.LinkHandler;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: EmbeddedLinkHelper.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedLinkHelper;", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedLinkHelper;", "linkHandler", "Lcom/stripe/android/paymentsheet/LinkHandler;", "<init>", "(Lcom/stripe/android/paymentsheet/LinkHandler;)V", "linkEmail", "Lkotlinx/coroutines/flow/StateFlow;", "", "getLinkEmail", "()Lkotlinx/coroutines/flow/StateFlow;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultEmbeddedLinkHelper implements EmbeddedLinkHelper {
    public static final int $stable = 8;
    private final StateFlow<String> linkEmail;

    @Inject
    public DefaultEmbeddedLinkHelper(LinkHandler linkHandler) {
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        this.linkEmail = linkHandler.getLinkConfigurationCoordinator().getEmailFlow();
    }

    @Override // com.stripe.android.paymentelement.embedded.content.EmbeddedLinkHelper
    public StateFlow<String> getLinkEmail() {
        return this.linkEmail;
    }
}
