package com.stripe.android.paymentelement.confirmation;

import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.LinkLaunchMode;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentSheetCardBrandFilter;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodExtraParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.PaymentMethodConfirmationOption;
import com.stripe.android.paymentelement.confirmation.bacs.BacsConfirmationOption;
import com.stripe.android.paymentelement.confirmation.cpms.CustomPaymentMethodConfirmationOption;
import com.stripe.android.paymentelement.confirmation.epms.ExternalPaymentMethodConfirmationOption;
import com.stripe.android.paymentelement.confirmation.gpay.GooglePayConfirmationOption;
import com.stripe.android.paymentelement.confirmation.link.LinkConfirmationOption;
import com.stripe.android.paymentelement.confirmation.linkinline.LinkInlineSignupConfirmationOption;
import com.stripe.android.paymentelement.confirmation.shoppay.ShopPayConfirmationOption;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfirmationOptionKtx.kt */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0007*\u00020\bH\u0002\u001a\f\u0010\u0000\u001a\u00020\t*\u00020\nH\u0002\u001a\f\u0010\u0000\u001a\u00020\u000b*\u00020\fH\u0002\u001a\u0018\u0010\u0000\u001a\u0004\u0018\u00010\r*\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u000fH\u0002\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0010*\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0018\u0010\u0000\u001a\u0004\u0018\u00010\u0012*\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0014*\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0016*\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0018"}, d2 = {"toConfirmationOption", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "configuration", "Lcom/stripe/android/common/model/CommonConfiguration;", "linkConfiguration", "Lcom/stripe/android/link/LinkConfiguration;", "Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$Saved;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;", "Lcom/stripe/android/paymentelement/confirmation/epms/ExternalPaymentMethodConfirmationOption;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$ExternalPaymentMethod;", "Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;", "Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "Lcom/stripe/android/paymentelement/confirmation/gpay/GooglePayConfirmationOption;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;", "Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;", "Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodConfirmationOption;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomPaymentMethod;", "Lcom/stripe/android/paymentelement/confirmation/shoppay/ShopPayConfirmationOption;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$ShopPay;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConfirmationOptionKtxKt {

    /* compiled from: ConfirmationOptionKtx.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentSelection.CustomerRequestedSave.values().length];
            try {
                iArr[PaymentSelection.CustomerRequestedSave.RequestReuse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentSelection.CustomerRequestedSave.RequestNoReuse.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentSelection.CustomerRequestedSave.NoRequest.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ConfirmationHandler.Option toConfirmationOption(PaymentSelection paymentSelection, CommonConfiguration configuration, LinkConfiguration linkConfiguration) {
        Intrinsics.checkNotNullParameter(paymentSelection, "<this>");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        if (paymentSelection instanceof PaymentSelection.Saved) {
            return toConfirmationOption((PaymentSelection.Saved) paymentSelection);
        }
        if (paymentSelection instanceof PaymentSelection.ExternalPaymentMethod) {
            return toConfirmationOption((PaymentSelection.ExternalPaymentMethod) paymentSelection);
        }
        if (paymentSelection instanceof PaymentSelection.CustomPaymentMethod) {
            return toConfirmationOption((PaymentSelection.CustomPaymentMethod) paymentSelection, configuration);
        }
        if (paymentSelection instanceof PaymentSelection.New.USBankAccount) {
            return toConfirmationOption((PaymentSelection.New.USBankAccount) paymentSelection);
        }
        if (paymentSelection instanceof PaymentSelection.New.LinkInline) {
            return toConfirmationOption((PaymentSelection.New.LinkInline) paymentSelection, linkConfiguration);
        }
        if (paymentSelection instanceof PaymentSelection.New) {
            return toConfirmationOption((PaymentSelection.New) paymentSelection);
        }
        if (paymentSelection instanceof PaymentSelection.GooglePay) {
            return toConfirmationOption((PaymentSelection.GooglePay) paymentSelection, configuration);
        }
        if (paymentSelection instanceof PaymentSelection.Link) {
            return toConfirmationOption((PaymentSelection.Link) paymentSelection, linkConfiguration);
        }
        if (paymentSelection instanceof PaymentSelection.ShopPay) {
            return toConfirmationOption((PaymentSelection.ShopPay) paymentSelection, configuration);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final PaymentMethodConfirmationOption.Saved toConfirmationOption(PaymentSelection.Saved saved) {
        return new PaymentMethodConfirmationOption.Saved(saved.getPaymentMethod(), saved.getPaymentMethodOptionsParams(), false, 4, null);
    }

    private static final ExternalPaymentMethodConfirmationOption toConfirmationOption(PaymentSelection.ExternalPaymentMethod externalPaymentMethod) {
        return new ExternalPaymentMethodConfirmationOption(externalPaymentMethod.getType(), externalPaymentMethod.getBillingDetails());
    }

    private static final PaymentMethodConfirmationOption toConfirmationOption(PaymentSelection.New.USBankAccount uSBankAccount) {
        if (uSBankAccount.getInstantDebits() != null) {
            return new PaymentMethodConfirmationOption.Saved(uSBankAccount.getInstantDebits().getPaymentMethod(), uSBankAccount.getPaymentMethodOptionsParams(), false, 4, null);
        }
        return new PaymentMethodConfirmationOption.New(uSBankAccount.getPaymentMethodCreateParams(), uSBankAccount.getPaymentMethodOptionsParams(), uSBankAccount.getPaymentMethodExtraParams(), uSBankAccount.getCustomerRequestedSave() == PaymentSelection.CustomerRequestedSave.RequestReuse, null, 16, null);
    }

    private static final LinkInlineSignupConfirmationOption toConfirmationOption(PaymentSelection.New.LinkInline linkInline, LinkConfiguration linkConfiguration) {
        LinkInlineSignupConfirmationOption.PaymentMethodSaveOption paymentMethodSaveOption;
        if (linkConfiguration == null) {
            return null;
        }
        PaymentMethodCreateParams paymentMethodCreateParams = linkInline.getPaymentMethodCreateParams();
        PaymentMethodOptionsParams paymentMethodOptionsParams = linkInline.getPaymentMethodOptionsParams();
        PaymentMethodExtraParams paymentMethodExtraParams = linkInline.getPaymentMethodExtraParams();
        int i = WhenMappings.$EnumSwitchMapping$0[linkInline.getCustomerRequestedSave().ordinal()];
        if (i == 1) {
            paymentMethodSaveOption = LinkInlineSignupConfirmationOption.PaymentMethodSaveOption.RequestedReuse;
        } else if (i == 2) {
            paymentMethodSaveOption = LinkInlineSignupConfirmationOption.PaymentMethodSaveOption.RequestedNoReuse;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            paymentMethodSaveOption = LinkInlineSignupConfirmationOption.PaymentMethodSaveOption.NoRequest;
        }
        return new LinkInlineSignupConfirmationOption(paymentMethodCreateParams, paymentMethodOptionsParams, paymentMethodExtraParams, paymentMethodSaveOption, linkConfiguration, linkInline.getInput());
    }

    private static final ConfirmationHandler.Option toConfirmationOption(PaymentSelection.New r9) {
        if (Intrinsics.areEqual(r9.getPaymentMethodCreateParams().getTypeCode(), PaymentMethod.Type.BacsDebit.code)) {
            return new BacsConfirmationOption(r9.getPaymentMethodCreateParams(), r9.getPaymentMethodOptionsParams());
        }
        return new PaymentMethodConfirmationOption.New(r9.getPaymentMethodCreateParams(), r9.getPaymentMethodOptionsParams(), r9.getPaymentMethodExtraParams(), r9.getCustomerRequestedSave() == PaymentSelection.CustomerRequestedSave.RequestReuse, null, 16, null);
    }

    private static final GooglePayConfirmationOption toConfirmationOption(PaymentSelection.GooglePay googlePay, CommonConfiguration commonConfiguration) {
        PaymentSheet.GooglePayConfiguration googlePay2 = commonConfiguration.getGooglePay();
        if (googlePay2 != null) {
            return new GooglePayConfirmationOption(new GooglePayConfirmationOption.Config(googlePay2.getEnvironment(), commonConfiguration.getMerchantDisplayName(), googlePay2.getCountryCode(), googlePay2.getCurrencyCode(), googlePay2.getAmount(), googlePay2.getLabel(), commonConfiguration.getBillingDetailsCollectionConfiguration(), new PaymentSheetCardBrandFilter(commonConfiguration.getCardBrandAcceptance())));
        }
        return null;
    }

    private static final LinkConfirmationOption toConfirmationOption(PaymentSelection.Link link, LinkConfiguration linkConfiguration) {
        if (linkConfiguration == null) {
            return null;
        }
        return new LinkConfirmationOption(linkConfiguration, link.getSelectedPayment() != null ? new LinkLaunchMode.Confirmation(link.getSelectedPayment()) : LinkLaunchMode.Full.INSTANCE, link.getLinkExpressMode());
    }

    private static final CustomPaymentMethodConfirmationOption toConfirmationOption(PaymentSelection.CustomPaymentMethod customPaymentMethod, CommonConfiguration commonConfiguration) {
        Object next;
        Iterator<T> it = commonConfiguration.getCustomPaymentMethods().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((PaymentSheet.CustomPaymentMethod) next).getId(), customPaymentMethod.getId())) {
                break;
            }
        }
        PaymentSheet.CustomPaymentMethod customPaymentMethod2 = (PaymentSheet.CustomPaymentMethod) next;
        if (customPaymentMethod2 != null) {
            return new CustomPaymentMethodConfirmationOption(customPaymentMethod2, customPaymentMethod.getBillingDetails());
        }
        return null;
    }

    private static final ShopPayConfirmationOption toConfirmationOption(PaymentSelection.ShopPay shopPay, CommonConfiguration commonConfiguration) {
        PaymentSheet.CustomerConfiguration customer = commonConfiguration.getCustomer();
        PaymentSheet.CustomerAccessType accessType$paymentsheet_release = customer != null ? customer.getAccessType$paymentsheet_release() : null;
        if (!(accessType$paymentsheet_release instanceof PaymentSheet.CustomerAccessType.CustomerSession)) {
            return null;
        }
        String customerSessionClientSecret = ((PaymentSheet.CustomerAccessType.CustomerSession) accessType$paymentsheet_release).getCustomerSessionClientSecret();
        PaymentSheet.ShopPayConfiguration shopPayConfiguration = commonConfiguration.getShopPayConfiguration();
        if (shopPayConfiguration != null) {
            return new ShopPayConfirmationOption(shopPayConfiguration, customerSessionClientSecret, commonConfiguration.getMerchantDisplayName());
        }
        return null;
    }
}
