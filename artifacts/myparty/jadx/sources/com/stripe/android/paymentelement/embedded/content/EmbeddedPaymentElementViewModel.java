package com.stripe.android.paymentelement.embedded.content;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.core.injection.ViewModelScope;
import com.stripe.android.core.utils.CreationExtrasKtxKt;
import com.stripe.android.paymentelement.embedded.content.EmbeddedPaymentElementSubcomponent;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: EmbeddedPaymentElementViewModel.kt */
@Singleton
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\fB\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementViewModel;", "Landroidx/lifecycle/ViewModel;", "embeddedPaymentElementSubcomponentFactory", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementSubcomponent$Factory;", "customViewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementSubcomponent$Factory;Lkotlinx/coroutines/CoroutineScope;)V", "getEmbeddedPaymentElementSubcomponentFactory", "()Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementSubcomponent$Factory;", "onCleared", "", "Factory", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EmbeddedPaymentElementViewModel extends ViewModel {
    public static final int $stable = 8;
    private final CoroutineScope customViewModelScope;
    private final EmbeddedPaymentElementSubcomponent.Factory embeddedPaymentElementSubcomponentFactory;

    public final EmbeddedPaymentElementSubcomponent.Factory getEmbeddedPaymentElementSubcomponentFactory() {
        return this.embeddedPaymentElementSubcomponentFactory;
    }

    @Inject
    public EmbeddedPaymentElementViewModel(EmbeddedPaymentElementSubcomponent.Factory embeddedPaymentElementSubcomponentFactory, @ViewModelScope CoroutineScope customViewModelScope) {
        Intrinsics.checkNotNullParameter(embeddedPaymentElementSubcomponentFactory, "embeddedPaymentElementSubcomponentFactory");
        Intrinsics.checkNotNullParameter(customViewModelScope, "customViewModelScope");
        this.embeddedPaymentElementSubcomponentFactory = embeddedPaymentElementSubcomponentFactory;
        this.customViewModelScope = customViewModelScope;
    }

    @Override // androidx.lifecycle.ViewModel
    protected void onCleared() {
        CoroutineScopeKt.cancel$default(this.customViewModelScope, null, 1, null);
    }

    /* compiled from: EmbeddedPaymentElementViewModel.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "paymentElementCallbackIdentifier", "", "statusBarColor", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Lkotlin/reflect/KClass;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Lkotlin/reflect/KClass;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        public static final int $stable = 0;
        private final String paymentElementCallbackIdentifier;
        private final Integer statusBarColor;

        public Factory(String paymentElementCallbackIdentifier, Integer num) {
            Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
            this.paymentElementCallbackIdentifier = paymentElementCallbackIdentifier;
            this.statusBarColor = num;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(KClass<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            EmbeddedPaymentElementViewModel viewModel = DaggerEmbeddedPaymentElementViewModelComponent.factory().build(SavedStateHandleSupport.createSavedStateHandle(extras), CreationExtrasKtxKt.requireApplication(extras), this.paymentElementCallbackIdentifier, this.statusBarColor).getViewModel();
            Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of com.stripe.android.paymentelement.embedded.content.EmbeddedPaymentElementViewModel.Factory.create");
            return viewModel;
        }
    }
}
