package com.stripe.android.paymentelement.embedded.content;

import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.paymentsheet.LinkHandler;
import com.stripe.android.paymentsheet.model.GooglePayButtonType;
import com.stripe.android.paymentsheet.state.WalletsState;
import com.stripe.android.uicore.utils.StateFlowsKt;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: EmbeddedWalletsHelper.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedWalletsHelper;", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedWalletsHelper;", "linkHandler", "Lcom/stripe/android/paymentsheet/LinkHandler;", "<init>", "(Lcom/stripe/android/paymentsheet/LinkHandler;)V", "walletsState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/paymentsheet/state/WalletsState;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultEmbeddedWalletsHelper implements EmbeddedWalletsHelper {
    public static final int $stable = 8;
    private final LinkHandler linkHandler;

    @Inject
    public DefaultEmbeddedWalletsHelper(LinkHandler linkHandler) {
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        this.linkHandler = linkHandler;
    }

    @Override // com.stripe.android.paymentelement.embedded.content.EmbeddedWalletsHelper
    public StateFlow<WalletsState> walletsState(final PaymentMethodMetadata paymentMethodMetadata) {
        Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
        this.linkHandler.setupLink(paymentMethodMetadata.getLinkState());
        return StateFlowsKt.combineAsStateFlow(this.linkHandler.isLinkEnabled(), this.linkHandler.getLinkConfigurationCoordinator().getEmailFlow(), new Function2() { // from class: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedWalletsHelper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DefaultEmbeddedWalletsHelper.walletsState$lambda$2(paymentMethodMetadata, (Boolean) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WalletsState walletsState$lambda$2(PaymentMethodMetadata paymentMethodMetadata, Boolean bool, String str) {
        return WalletsState.INSTANCE.create(bool, str, paymentMethodMetadata.isGooglePayReady(), GooglePayButtonType.Pay, true, paymentMethodMetadata.supportedPaymentMethodTypes(), null, new Function0() { // from class: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedWalletsHelper$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DefaultEmbeddedWalletsHelper.walletsState$lambda$2$lambda$0();
            }
        }, new Function0() { // from class: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedWalletsHelper$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DefaultEmbeddedWalletsHelper.walletsState$lambda$2$lambda$1();
            }
        }, paymentMethodMetadata.getStripeIntent() instanceof SetupIntent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit walletsState$lambda$2$lambda$0() {
        throw new IllegalStateException("Not possible.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit walletsState$lambda$2$lambda$1() {
        throw new IllegalStateException("Not possible.");
    }
}
