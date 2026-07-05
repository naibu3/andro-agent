package com.stripe.android.ui.core;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.stripe.android.stripecardscan.cardscan.CardScanConfiguration;
import com.stripe.android.stripecardscan.cardscan.CardScanSheet;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeCardScanProxy.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016JC\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00070\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;", "Lcom/stripe/android/ui/core/StripeCardScanProxy;", "cardScanSheet", "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;", "<init>", "(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;)V", "present", "", "configuration", "Lcom/stripe/android/stripecardscan/cardscan/CardScanConfiguration;", "attachCardScanFragment", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "supportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "fragmentContainer", "", "onFinished", "Lkotlin/Function1;", "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;", "Lkotlin/ParameterName;", "name", "cardScanSheetResult", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultStripeCardScanProxy implements StripeCardScanProxy {
    public static final int $stable = 8;
    private final CardScanSheet cardScanSheet;

    public DefaultStripeCardScanProxy(CardScanSheet cardScanSheet) {
        Intrinsics.checkNotNullParameter(cardScanSheet, "cardScanSheet");
        this.cardScanSheet = cardScanSheet;
    }

    @Override // com.stripe.android.ui.core.StripeCardScanProxy
    public void present(CardScanConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.cardScanSheet.present(configuration);
    }

    @Override // com.stripe.android.ui.core.StripeCardScanProxy
    public void attachCardScanFragment(LifecycleOwner lifecycleOwner, FragmentManager supportFragmentManager, int fragmentContainer, Function1<? super CardScanSheetResult, Unit> onFinished) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "supportFragmentManager");
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        this.cardScanSheet.attachCardScanFragment(lifecycleOwner, supportFragmentManager, fragmentContainer, onFinished);
    }
}
