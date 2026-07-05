package com.stripe.android.paymentsheet.injection;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.paymentelement.confirmation.injection.PaymentElementConfirmationModule;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import dagger.Subcomponent;
import kotlin.Metadata;

/* compiled from: PaymentSheetViewModelSubcomponent.kt */
@Subcomponent(modules = {PaymentSheetViewModelModule.class, PaymentElementConfirmationModule.class})
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelSubcomponent;", "", "viewModel", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "getViewModel", "()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PaymentSheetViewModelSubcomponent {

    /* compiled from: PaymentSheetViewModelSubcomponent.kt */
    @Subcomponent.Builder
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelSubcomponent$Builder;", "", "paymentSheetViewModelModule", "Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelSubcomponent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Builder {
        PaymentSheetViewModelSubcomponent build();

        Builder paymentSheetViewModelModule(PaymentSheetViewModelModule paymentSheetViewModelModule);
    }

    PaymentSheetViewModel getViewModel();
}
