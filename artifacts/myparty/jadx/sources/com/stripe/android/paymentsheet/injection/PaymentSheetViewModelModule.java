package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.paymentsheet.DefaultPrefsRepository;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.PrefsRepository;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: PaymentSheetViewModelModule.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0003H\u0007J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\tJ\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule;", "", "starterArgs", "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;)V", "provideArgs", "providesStatusBarColor", "", "()Ljava/lang/Integer;", "providePrefsRepository", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "appContext", "Landroid/content/Context;", "workContext", "Lkotlin/coroutines/CoroutineContext;", NamedConstantsKt.IS_LIVE_MODE, "Lkotlin/Function0;", "", "paymentConfiguration", "Ljavax/inject/Provider;", "Lcom/stripe/android/PaymentConfiguration;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class PaymentSheetViewModelModule {
    public static final int $stable = 8;
    private final PaymentSheetContractV2.Args starterArgs;

    public PaymentSheetViewModelModule(PaymentSheetContractV2.Args starterArgs) {
        Intrinsics.checkNotNullParameter(starterArgs, "starterArgs");
        this.starterArgs = starterArgs;
    }

    @Provides
    /* renamed from: provideArgs, reason: from getter */
    public final PaymentSheetContractV2.Args getStarterArgs() {
        return this.starterArgs;
    }

    @Provides
    @Named(com.stripe.android.payments.core.injection.NamedConstantsKt.STATUS_BAR_COLOR)
    public final Integer providesStatusBarColor() {
        return this.starterArgs.getStatusBarColor$paymentsheet_release();
    }

    @Provides
    public final PrefsRepository providePrefsRepository(Context appContext, @IOContext CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        PaymentSheet.CustomerConfiguration customer = this.starterArgs.getConfig$paymentsheet_release().getCustomer();
        return new DefaultPrefsRepository(appContext, customer != null ? customer.getId() : null, workContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isLiveMode$lambda$0(Provider provider) {
        return StringsKt.startsWith$default(((PaymentConfiguration) provider.get()).getPublishableKey(), "pk_live", false, 2, (Object) null);
    }

    @Provides
    @Named(NamedConstantsKt.IS_LIVE_MODE)
    public final Function0<Boolean> isLiveMode(final Provider<PaymentConfiguration> paymentConfiguration) {
        Intrinsics.checkNotNullParameter(paymentConfiguration, "paymentConfiguration");
        return new Function0() { // from class: com.stripe.android.paymentsheet.injection.PaymentSheetViewModelModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(PaymentSheetViewModelModule.isLiveMode$lambda$0(paymentConfiguration));
            }
        };
    }
}
