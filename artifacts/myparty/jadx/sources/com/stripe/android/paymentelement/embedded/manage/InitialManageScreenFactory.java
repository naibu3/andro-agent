package com.stripe.android.paymentelement.embedded.manage;

import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.lpmfoundations.luxe.SupportedPaymentMethod;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentelement.embedded.manage.ManageNavigator;
import com.stripe.android.paymentsheet.CustomerStateHolder;
import com.stripe.android.paymentsheet.DisplayableSavedPaymentMethod;
import com.stripe.android.paymentsheet.state.CustomerState;
import com.stripe.android.ui.core.cbc.CardBrandChoiceEligibility;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InitialManageScreenFactory.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/manage/InitialManageScreenFactory;", "", "customerStateHolder", "Lcom/stripe/android/paymentsheet/CustomerStateHolder;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "updateScreenInteractorFactory", "Lcom/stripe/android/paymentelement/embedded/manage/EmbeddedUpdateScreenInteractorFactory;", "manageInteractorFactory", "Lcom/stripe/android/paymentelement/embedded/manage/EmbeddedManageScreenInteractorFactory;", "<init>", "(Lcom/stripe/android/paymentsheet/CustomerStateHolder;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentelement/embedded/manage/EmbeddedUpdateScreenInteractorFactory;Lcom/stripe/android/paymentelement/embedded/manage/EmbeddedManageScreenInteractorFactory;)V", "createInitialScreen", "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InitialManageScreenFactory {
    public static final int $stable = 8;
    private final CustomerStateHolder customerStateHolder;
    private final EmbeddedManageScreenInteractorFactory manageInteractorFactory;
    private final PaymentMethodMetadata paymentMethodMetadata;
    private final EmbeddedUpdateScreenInteractorFactory updateScreenInteractorFactory;

    @Inject
    public InitialManageScreenFactory(CustomerStateHolder customerStateHolder, PaymentMethodMetadata paymentMethodMetadata, EmbeddedUpdateScreenInteractorFactory updateScreenInteractorFactory, EmbeddedManageScreenInteractorFactory manageInteractorFactory) {
        Intrinsics.checkNotNullParameter(customerStateHolder, "customerStateHolder");
        Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
        Intrinsics.checkNotNullParameter(updateScreenInteractorFactory, "updateScreenInteractorFactory");
        Intrinsics.checkNotNullParameter(manageInteractorFactory, "manageInteractorFactory");
        this.customerStateHolder = customerStateHolder;
        this.paymentMethodMetadata = paymentMethodMetadata;
        this.updateScreenInteractorFactory = updateScreenInteractorFactory;
        this.manageInteractorFactory = manageInteractorFactory;
    }

    public final ManageNavigator.Screen createInitialScreen() {
        String str;
        SupportedPaymentMethod supportedPaymentMethodSupportedPaymentMethodForCode;
        CustomerState value = this.customerStateHolder.getCustomer().getValue();
        ResolvableString displayName = null;
        List<PaymentMethod> paymentMethods = value != null ? value.getPaymentMethods() : null;
        if (paymentMethods != null && paymentMethods.size() == 1) {
            PaymentMethod paymentMethod = (PaymentMethod) CollectionsKt.first((List) paymentMethods);
            PaymentMethod.Type type = paymentMethod.type;
            if (type != null && (str = type.code) != null && (supportedPaymentMethodSupportedPaymentMethodForCode = this.paymentMethodMetadata.supportedPaymentMethodForCode(str)) != null) {
                displayName = supportedPaymentMethodSupportedPaymentMethodForCode.getDisplayName();
            }
            return new ManageNavigator.Screen.Update(this.updateScreenInteractorFactory.createUpdateScreenInteractor(DisplayableSavedPaymentMethod.Companion.create$default(DisplayableSavedPaymentMethod.INSTANCE, ResolvableStringUtilsKt.orEmpty(displayName), paymentMethod, this.paymentMethodMetadata.getCbcEligibility() instanceof CardBrandChoiceEligibility.Eligible, false, 8, null)));
        }
        return new ManageNavigator.Screen.All(this.manageInteractorFactory.createManageScreenInteractor());
    }
}
