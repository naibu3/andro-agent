package com.stripe.android.payments.core.authentication.threeds2;

import android.app.Application;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.instantapps.InstantApps;
import com.stripe.android.core.utils.CreationExtrasKtxKt;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.injection.DaggerStripe3ds2TransactionViewModelFactoryComponent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Stripe3ds2TransactionViewModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "argsSupplier", "Lkotlin/Function0;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Stripe3ds2TransactionViewModelFactory implements ViewModelProvider.Factory {
    public static final int $stable = 0;
    private final Function0<Stripe3ds2TransactionContract.Args> argsSupplier;

    public Stripe3ds2TransactionViewModelFactory(Function0<Stripe3ds2TransactionContract.Args> argsSupplier) {
        Intrinsics.checkNotNullParameter(argsSupplier, "argsSupplier");
        this.argsSupplier = argsSupplier;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        final Stripe3ds2TransactionContract.Args argsInvoke = this.argsSupplier.invoke();
        Application applicationRequireApplication = CreationExtrasKtxKt.requireApplication(extras);
        Application application = applicationRequireApplication;
        Stripe3ds2TransactionViewModel viewModel = DaggerStripe3ds2TransactionViewModelFactoryComponent.builder().context(application).enableLogging(argsInvoke.getEnableLogging()).publishableKeyProvider(new Function0() { // from class: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return argsInvoke.getPublishableKey();
            }
        }).productUsage(argsInvoke.getProductUsage()).isInstantApp(InstantApps.isInstantApp(application)).build().getSubcomponentBuilder().args(argsInvoke).savedStateHandle(SavedStateHandleSupport.createSavedStateHandle(extras)).application(applicationRequireApplication).build().getViewModel();
        Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory.create");
        return viewModel;
    }
}
