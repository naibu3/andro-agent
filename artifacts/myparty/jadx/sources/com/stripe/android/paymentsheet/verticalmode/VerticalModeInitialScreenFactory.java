package com.stripe.android.paymentsheet.verticalmode;

import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.paymentsheet.CustomerStateHolder;
import com.stripe.android.paymentsheet.DefaultFormHelper;
import com.stripe.android.paymentsheet.FormHelper;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.navigation.PaymentSheetScreen;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerticalModeInitialScreenFactory.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/verticalmode/VerticalModeInitialScreenFactory;", "", "<init>", "()V", "create", "", "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;", "viewModel", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "customerStateHolder", "Lcom/stripe/android/paymentsheet/CustomerStateHolder;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VerticalModeInitialScreenFactory {
    public static final int $stable = 0;
    public static final VerticalModeInitialScreenFactory INSTANCE = new VerticalModeInitialScreenFactory();

    private VerticalModeInitialScreenFactory() {
    }

    public final List<PaymentSheetScreen> create(BaseSheetViewModel viewModel, PaymentMethodMetadata paymentMethodMetadata, CustomerStateHolder customerStateHolder) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
        Intrinsics.checkNotNullParameter(customerStateHolder, "customerStateHolder");
        List<String> listSupportedPaymentMethodTypes = paymentMethodMetadata.supportedPaymentMethodTypes();
        BankFormInteractor bankFormInteractorCreate = BankFormInteractor.INSTANCE.create(viewModel);
        if (listSupportedPaymentMethodTypes.size() == 1 && customerStateHolder.getPaymentMethods().getValue().isEmpty()) {
            return CollectionsKt.listOf(new PaymentSheetScreen.VerticalModeForm(DefaultVerticalModeFormInteractor.INSTANCE.create((String) CollectionsKt.first((List) listSupportedPaymentMethodTypes), viewModel, paymentMethodMetadata, customerStateHolder, bankFormInteractorCreate), true));
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(new PaymentSheetScreen.VerticalMode(DefaultPaymentMethodVerticalLayoutInteractor.INSTANCE.create(viewModel, paymentMethodMetadata, customerStateHolder, bankFormInteractorCreate)));
        PaymentSelection value = viewModel.getSelection$paymentsheet_release().getValue();
        DefaultConstructorMarker defaultConstructorMarker = null;
        PaymentSelection.New r11 = value instanceof PaymentSelection.New ? (PaymentSelection.New) value : null;
        if (r11 != null) {
            String typeCode = r11.getPaymentMethodCreateParams().getTypeCode();
            if (Intrinsics.areEqual(DefaultFormHelper.Companion.create$default(DefaultFormHelper.INSTANCE, viewModel, paymentMethodMetadata, null, 4, null).formTypeForCode(typeCode), FormHelper.FormType.UserInteractionRequired.INSTANCE)) {
                listCreateListBuilder.add(new PaymentSheetScreen.VerticalModeForm(DefaultVerticalModeFormInteractor.INSTANCE.create(typeCode, viewModel, paymentMethodMetadata, customerStateHolder, bankFormInteractorCreate), false, 2, defaultConstructorMarker));
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }
}
