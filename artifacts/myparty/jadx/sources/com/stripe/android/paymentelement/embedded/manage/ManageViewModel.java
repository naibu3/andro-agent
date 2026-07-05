package com.stripe.android.paymentelement.embedded.manage;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.core.injection.ViewModelScope;
import com.stripe.android.core.utils.CreationExtrasKtxKt;
import com.stripe.android.paymentelement.embedded.manage.ManageContract;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: ManageViewModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\fB\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;", "Landroidx/lifecycle/ViewModel;", "component", "Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent;", "customViewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent;Lkotlinx/coroutines/CoroutineScope;)V", "getComponent", "()Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent;", "onCleared", "", "Factory", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ManageViewModel extends ViewModel {
    public static final int $stable = 8;
    private final ManageComponent component;
    private final CoroutineScope customViewModelScope;

    public final ManageComponent getComponent() {
        return this.component;
    }

    @Inject
    public ManageViewModel(ManageComponent component, @ViewModelScope CoroutineScope customViewModelScope) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(customViewModelScope, "customViewModelScope");
        this.component = component;
        this.customViewModelScope = customViewModelScope;
    }

    @Override // androidx.lifecycle.ViewModel
    protected void onCleared() {
        CoroutineScopeKt.cancel$default(this.customViewModelScope, null, 1, null);
    }

    /* compiled from: ManageViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "argsSupplier", "Lkotlin/Function0;", "Lcom/stripe/android/paymentelement/embedded/manage/ManageContract$Args;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        public static final int $stable = 0;
        private final Function0<ManageContract.Args> argsSupplier;

        public Factory(Function0<ManageContract.Args> argsSupplier) {
            Intrinsics.checkNotNullParameter(argsSupplier, "argsSupplier");
            this.argsSupplier = argsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            SavedStateHandle savedStateHandleCreateSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(extras);
            ManageContract.Args argsInvoke = this.argsSupplier.invoke();
            ManageComponent manageComponentBuild = DaggerManageComponent.factory().build(savedStateHandleCreateSavedStateHandle, argsInvoke.getPaymentMethodMetadata(), CreationExtrasKtxKt.requireApplication(extras), argsInvoke.getPaymentElementCallbackIdentifier());
            manageComponentBuild.getCustomerStateHolder().setCustomerState(argsInvoke.getCustomerState());
            manageComponentBuild.getSelectionHolder().set(argsInvoke.getSelection());
            ManageViewModel viewModel = manageComponentBuild.getViewModel();
            Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of com.stripe.android.paymentelement.embedded.manage.ManageViewModel.Factory.create");
            return viewModel;
        }
    }
}
