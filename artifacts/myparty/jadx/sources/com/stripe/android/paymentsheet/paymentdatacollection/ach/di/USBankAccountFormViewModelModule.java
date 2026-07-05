package com.stripe.android.paymentsheet.paymentdatacollection.ach.di;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.injection.NamedConstantsKt;
import dagger.Module;
import dagger.Provides;
import java.util.Set;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: USBankAccountFormViewModelModule.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0005H\u0007J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\n\u001a\u00020\u0005H\u0007J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/di/USBankAccountFormViewModelModule;", "", "<init>", "()V", "providesAppContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "providePaymentConfiguration", "Lcom/stripe/android/PaymentConfiguration;", "appContext", "providesResources", "Landroid/content/res/Resources;", "providePublishableKey", "Lkotlin/Function0;", "", "providesProductUsage", "", "providesEnableLogging", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module(subcomponents = {USBankAccountFormViewModelSubcomponent.class})
/* loaded from: classes6.dex */
public final class USBankAccountFormViewModelModule {
    public static final int $stable = 0;

    @Provides
    @Named(NamedConstantsKt.ENABLE_LOGGING)
    public final boolean providesEnableLogging() {
        return false;
    }

    @Provides
    public final Context providesAppContext(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return application;
    }

    @Provides
    public final PaymentConfiguration providePaymentConfiguration(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        return PaymentConfiguration.INSTANCE.getInstance(appContext);
    }

    @Provides
    public final Resources providesResources(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Resources resources = appContext.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return resources;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String providePublishableKey$lambda$0(Context context) {
        return PaymentConfiguration.INSTANCE.getInstance(context).getPublishableKey();
    }

    @Provides
    @Named("publishableKey")
    public final Function0<String> providePublishableKey(final Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        return new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormViewModelModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return USBankAccountFormViewModelModule.providePublishableKey$lambda$0(appContext);
            }
        };
    }

    @Provides
    @Named(com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE)
    public final Set<String> providesProductUsage() {
        return SetsKt.emptySet();
    }
}
