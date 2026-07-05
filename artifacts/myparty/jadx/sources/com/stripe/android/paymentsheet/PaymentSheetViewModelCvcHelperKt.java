package com.stripe.android.paymentsheet;

import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.navigation.PaymentSheetScreen;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentSheetViewModelCvcHelper.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\"\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0002¨\u0006\n"}, d2 = {"shouldLaunchCvcRecollectionScreen", "", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", BaseSheetViewModel.SAVE_SELECTION, "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;", "shouldAttachCvc", "isCvcRecollectionEnabled", "requiresCvcRecollection", "extraRequirements", "Lkotlin/Function0;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentSheetViewModelCvcHelperKt {
    public static final boolean shouldLaunchCvcRecollectionScreen(final PaymentSheetViewModel paymentSheetViewModel, PaymentSelection.Saved selection) {
        Intrinsics.checkNotNullParameter(paymentSheetViewModel, "<this>");
        Intrinsics.checkNotNullParameter(selection, "selection");
        return requiresCvcRecollection(paymentSheetViewModel, selection, new Function0() { // from class: com.stripe.android.paymentsheet.PaymentSheetViewModelCvcHelperKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(PaymentSheetViewModelCvcHelperKt.shouldLaunchCvcRecollectionScreen$lambda$0(paymentSheetViewModel));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldLaunchCvcRecollectionScreen$lambda$0(PaymentSheetViewModel paymentSheetViewModel) {
        return (paymentSheetViewModel.getConfig().getPaymentMethodLayout$paymentsheet_release() == PaymentSheet.PaymentMethodLayout.Horizontal || (paymentSheetViewModel.getNavigationHandler().getCurrentScreen().getValue() instanceof PaymentSheetScreen.CvcRecollection)) ? false : true;
    }

    public static final boolean shouldAttachCvc(final PaymentSheetViewModel paymentSheetViewModel, PaymentSelection.Saved selection) {
        Intrinsics.checkNotNullParameter(paymentSheetViewModel, "<this>");
        Intrinsics.checkNotNullParameter(selection, "selection");
        return requiresCvcRecollection(paymentSheetViewModel, selection, new Function0() { // from class: com.stripe.android.paymentsheet.PaymentSheetViewModelCvcHelperKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(PaymentSheetViewModelCvcHelperKt.shouldAttachCvc$lambda$1(paymentSheetViewModel));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldAttachCvc$lambda$1(PaymentSheetViewModel paymentSheetViewModel) {
        return paymentSheetViewModel.getConfig().getPaymentMethodLayout$paymentsheet_release() == PaymentSheet.PaymentMethodLayout.Horizontal;
    }

    public static final boolean isCvcRecollectionEnabled(PaymentSheetViewModel paymentSheetViewModel) {
        Intrinsics.checkNotNullParameter(paymentSheetViewModel, "<this>");
        PaymentMethodMetadata value = paymentSheetViewModel.getPaymentMethodMetadata$paymentsheet_release().getValue();
        if (value != null) {
            return paymentSheetViewModel.getCvcRecollectionHandler().cvcRecollectionEnabled(value.getStripeIntent(), paymentSheetViewModel.getArgs().getInitializationMode$paymentsheet_release());
        }
        return false;
    }

    private static final boolean requiresCvcRecollection(PaymentSheetViewModel paymentSheetViewModel, PaymentSelection.Saved saved, Function0<Boolean> function0) {
        PaymentMethodMetadata value = paymentSheetViewModel.getPaymentMethodMetadata$paymentsheet_release().getValue();
        return value != null && paymentSheetViewModel.getCvcRecollectionHandler().requiresCVCRecollection(value.getStripeIntent(), saved.getPaymentMethod(), saved.getPaymentMethodOptionsParams(), paymentSheetViewModel.getArgs().getInitializationMode$paymentsheet_release()) && function0.invoke().booleanValue();
    }
}
