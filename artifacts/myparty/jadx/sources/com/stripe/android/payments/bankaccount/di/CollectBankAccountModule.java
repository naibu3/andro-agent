package com.stripe.android.payments.bankaccount.di;

import android.app.Application;
import android.content.Context;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import dagger.Module;
import dagger.Provides;
import java.util.Set;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectBankAccountModule.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountModule;", "", "<init>", "()V", "providesAppContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "providePublishableKey", "Lkotlin/Function0;", "", CardScanActivity.ARGS, "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "providesProductUsage", "", "providesEnableLogging", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class CollectBankAccountModule {
    public static final int $stable = 0;
    public static final CollectBankAccountModule INSTANCE = new CollectBankAccountModule();

    @Provides
    @Named(NamedConstantsKt.ENABLE_LOGGING)
    public final boolean providesEnableLogging() {
        return false;
    }

    private CollectBankAccountModule() {
    }

    @Provides
    public final Context providesAppContext(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return application;
    }

    @Provides
    @Named("publishableKey")
    public final Function0<String> providePublishableKey(final CollectBankAccountContract.Args args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return new Function0() { // from class: com.stripe.android.payments.bankaccount.di.CollectBankAccountModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return args.getPublishableKey();
            }
        };
    }

    @Provides
    @Named(com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE)
    public final Set<String> providesProductUsage() {
        return SetsKt.emptySet();
    }
}
