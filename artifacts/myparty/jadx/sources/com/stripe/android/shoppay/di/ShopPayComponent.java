package com.stripe.android.shoppay.di;

import android.content.Context;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackIdentifier;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.shoppay.ShopPayArgs;
import com.stripe.android.shoppay.ShopPayViewModel;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import dagger.BindsInstance;
import dagger.Component;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: ShopPayComponent.kt */
@Component(modules = {ShopPayModule.class, CoreCommonModule.class, CoroutineContextModule.class})
@Singleton
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/shoppay/di/ShopPayComponent;", "", "viewModel", "Lcom/stripe/android/shoppay/ShopPayViewModel;", "getViewModel", "()Lcom/stripe/android/shoppay/ShopPayViewModel;", "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ShopPayComponent {

    /* compiled from: ShopPayComponent.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\u0019\u0010\u0004\u001a\u00020\u00002\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00002\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH'J\u0018\u0010\n\u001a\u00020\u00002\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH'J\u0012\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\u000b\u001a\u00020\tH'J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eH'J\b\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/shoppay/di/ShopPayComponent$Builder;", "", "context", "Landroid/content/Context;", "statusBarColor", "", "(Ljava/lang/Integer;)Lcom/stripe/android/shoppay/di/ShopPayComponent$Builder;", "stripeAccountIdProvider", "Lkotlin/Function0;", "", "publishableKeyProvider", "paymentElementCallbackIdentifier", "shopPayArgs", CardScanActivity.ARGS, "Lcom/stripe/android/shoppay/ShopPayArgs;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/shoppay/di/ShopPayComponent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Component.Builder
    public interface Builder {
        ShopPayComponent build();

        @BindsInstance
        Builder context(Context context);

        @BindsInstance
        Builder paymentElementCallbackIdentifier(@PaymentElementCallbackIdentifier String paymentElementCallbackIdentifier);

        @BindsInstance
        Builder publishableKeyProvider(@Named("publishableKey") Function0<String> publishableKeyProvider);

        @BindsInstance
        Builder shopPayArgs(ShopPayArgs args);

        @BindsInstance
        Builder statusBarColor(@Named(NamedConstantsKt.STATUS_BAR_COLOR) Integer statusBarColor);

        @BindsInstance
        Builder stripeAccountIdProvider(@Named(com.stripe.android.core.injection.NamedConstantsKt.STRIPE_ACCOUNT_ID) Function0<String> stripeAccountIdProvider);
    }

    ShopPayViewModel getViewModel();
}
