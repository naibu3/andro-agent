package com.stripe.android.paymentsheet.model;

import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.model.Address;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.LinkPaymentDetails;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.ui.PaymentMethodsUiExtensionKt;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentSelection.kt */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\f\u0010\u001d\u001a\u00020\u001e*\u00020\u001aH\u0000\u001a\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u0013*\u00020\u000b2\u0006\u0010 \u001a\u00020!H\u0000\u001a\u0016\u0010\"\u001a\u0004\u0018\u00010#*\u00020$2\u0006\u0010%\u001a\u00020\u0001H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u001a\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0010\u001a\u0004\u0018\u00010\r*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f\"\u0018\u0010\u0012\u001a\u00020\u0013*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0018\u0010\u0017\u001a\u00020\r*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000f\"\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u001a*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"\u0018\u0010&\u001a\u00020\u0001*\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010(¨\u0006)"}, d2 = {"isLink", "", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Z", "isSaved", "drawableResourceId", "", "getDrawableResourceId", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)I", "getSavedIcon", BaseSheetViewModel.SAVE_SELECTION, "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;", "lightThemeIconUrl", "", "getLightThemeIconUrl", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Ljava/lang/String;", "darkThemeIconUrl", "getDarkThemeIconUrl", "label", "Lcom/stripe/android/core/strings/ResolvableString;", "getLabel", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/core/strings/ResolvableString;", "getSavedLabel", "paymentMethodType", "getPaymentMethodType", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "getBillingDetails", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "toPaymentSheetBillingDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "mandateTextFromPaymentMethodMetadata", "metadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "getSetupFutureUseValue", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "hasIntentToSetup", "isLinkCardBrand", "Lcom/stripe/android/model/PaymentMethod;", "(Lcom/stripe/android/model/PaymentMethod;)Z", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentSelectionKt {

    /* compiled from: PaymentSelection.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PaymentSelection.Saved.WalletType.values().length];
            try {
                iArr[PaymentSelection.Saved.WalletType.Link.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentSelection.Saved.WalletType.GooglePay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConfirmPaymentIntentParams.SetupFutureUsage.values().length];
            try {
                iArr2[ConfirmPaymentIntentParams.SetupFutureUsage.OffSession.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final boolean isLink(PaymentSelection paymentSelection) {
        Intrinsics.checkNotNullParameter(paymentSelection, "<this>");
        if (paymentSelection instanceof PaymentSelection.GooglePay) {
            return false;
        }
        if ((paymentSelection instanceof PaymentSelection.Link) || (paymentSelection instanceof PaymentSelection.New.LinkInline)) {
            return true;
        }
        if (paymentSelection instanceof PaymentSelection.New) {
            return false;
        }
        if (paymentSelection instanceof PaymentSelection.Saved) {
            return ((PaymentSelection.Saved) paymentSelection).getWalletType() == PaymentSelection.Saved.WalletType.Link;
        }
        if ((paymentSelection instanceof PaymentSelection.CustomPaymentMethod) || (paymentSelection instanceof PaymentSelection.ExternalPaymentMethod) || (paymentSelection instanceof PaymentSelection.ShopPay)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean isSaved(PaymentSelection paymentSelection) {
        Intrinsics.checkNotNullParameter(paymentSelection, "<this>");
        return paymentSelection instanceof PaymentSelection.Saved;
    }

    public static final int getDrawableResourceId(PaymentSelection paymentSelection) {
        Intrinsics.checkNotNullParameter(paymentSelection, "<this>");
        if (paymentSelection instanceof PaymentSelection.ExternalPaymentMethod) {
            return ((PaymentSelection.ExternalPaymentMethod) paymentSelection).getIconResource();
        }
        if (paymentSelection instanceof PaymentSelection.CustomPaymentMethod) {
            return 0;
        }
        if (Intrinsics.areEqual(paymentSelection, PaymentSelection.GooglePay.INSTANCE)) {
            return R.drawable.stripe_google_pay_mark;
        }
        if (paymentSelection instanceof PaymentSelection.Link) {
            return PaymentMethodsUiExtensionKt.getLinkIcon$default(null, true, 1, null);
        }
        if (paymentSelection instanceof PaymentSelection.New.Card) {
            return PaymentMethodsUiExtensionKt.getCardBrandIcon(((PaymentSelection.New.Card) paymentSelection).getBrand());
        }
        if (paymentSelection instanceof PaymentSelection.New.GenericPaymentMethod) {
            return ((PaymentSelection.New.GenericPaymentMethod) paymentSelection).getIconResource();
        }
        if (paymentSelection instanceof PaymentSelection.New.LinkInline) {
            return PaymentMethodsUiExtensionKt.getCardBrandIcon(((PaymentSelection.New.LinkInline) paymentSelection).getBrand());
        }
        if (paymentSelection instanceof PaymentSelection.New.USBankAccount) {
            return ((PaymentSelection.New.USBankAccount) paymentSelection).getIconResource();
        }
        if (paymentSelection instanceof PaymentSelection.Saved) {
            return getSavedIcon((PaymentSelection.Saved) paymentSelection);
        }
        if (paymentSelection instanceof PaymentSelection.ShopPay) {
            return R.drawable.stripe_shop_pay_logo_white;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final int getSavedIcon(PaymentSelection.Saved saved) {
        if (isLinkCardBrand(saved.getPaymentMethod())) {
            return R.drawable.stripe_ic_paymentsheet_link_arrow;
        }
        int savedPaymentMethodIcon$default = PaymentMethodsUiExtensionKt.getSavedPaymentMethodIcon$default(saved.getPaymentMethod(), false, (Boolean) null, 3, (Object) null);
        if (savedPaymentMethodIcon$default == R.drawable.stripe_ic_paymentsheet_card_unknown_ref) {
            PaymentSelection.Saved.WalletType walletType = saved.getWalletType();
            int i = walletType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[walletType.ordinal()];
            if (i == 1) {
                return PaymentMethodsUiExtensionKt.getLinkIcon$default(null, false, 3, null);
            }
            if (i == 2) {
                return R.drawable.stripe_google_pay_mark;
            }
        }
        return savedPaymentMethodIcon$default;
    }

    public static final String getLightThemeIconUrl(PaymentSelection paymentSelection) {
        Intrinsics.checkNotNullParameter(paymentSelection, "<this>");
        if (paymentSelection instanceof PaymentSelection.ExternalPaymentMethod) {
            return ((PaymentSelection.ExternalPaymentMethod) paymentSelection).getLightThemeIconUrl();
        }
        if (paymentSelection instanceof PaymentSelection.CustomPaymentMethod) {
            return ((PaymentSelection.CustomPaymentMethod) paymentSelection).getLightThemeIconUrl();
        }
        if (Intrinsics.areEqual(paymentSelection, PaymentSelection.GooglePay.INSTANCE) || (paymentSelection instanceof PaymentSelection.Link) || (paymentSelection instanceof PaymentSelection.New.Card)) {
            return null;
        }
        if (paymentSelection instanceof PaymentSelection.New.GenericPaymentMethod) {
            return ((PaymentSelection.New.GenericPaymentMethod) paymentSelection).getLightThemeIconUrl();
        }
        if ((paymentSelection instanceof PaymentSelection.New.LinkInline) || (paymentSelection instanceof PaymentSelection.New.USBankAccount) || (paymentSelection instanceof PaymentSelection.Saved) || (paymentSelection instanceof PaymentSelection.ShopPay)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String getDarkThemeIconUrl(PaymentSelection paymentSelection) {
        Intrinsics.checkNotNullParameter(paymentSelection, "<this>");
        if (paymentSelection instanceof PaymentSelection.ExternalPaymentMethod) {
            return ((PaymentSelection.ExternalPaymentMethod) paymentSelection).getDarkThemeIconUrl();
        }
        if (paymentSelection instanceof PaymentSelection.CustomPaymentMethod) {
            return ((PaymentSelection.CustomPaymentMethod) paymentSelection).getDarkThemeIconUrl();
        }
        if (Intrinsics.areEqual(paymentSelection, PaymentSelection.GooglePay.INSTANCE) || (paymentSelection instanceof PaymentSelection.Link) || (paymentSelection instanceof PaymentSelection.New.Card)) {
            return null;
        }
        if (paymentSelection instanceof PaymentSelection.New.GenericPaymentMethod) {
            return ((PaymentSelection.New.GenericPaymentMethod) paymentSelection).getDarkThemeIconUrl();
        }
        if ((paymentSelection instanceof PaymentSelection.New.LinkInline) || (paymentSelection instanceof PaymentSelection.New.USBankAccount) || (paymentSelection instanceof PaymentSelection.Saved) || (paymentSelection instanceof PaymentSelection.ShopPay)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ResolvableString getLabel(PaymentSelection paymentSelection) {
        Intrinsics.checkNotNullParameter(paymentSelection, "<this>");
        if (paymentSelection instanceof PaymentSelection.ExternalPaymentMethod) {
            return ((PaymentSelection.ExternalPaymentMethod) paymentSelection).getLabel();
        }
        if (paymentSelection instanceof PaymentSelection.CustomPaymentMethod) {
            return ((PaymentSelection.CustomPaymentMethod) paymentSelection).getLabel();
        }
        if (Intrinsics.areEqual(paymentSelection, PaymentSelection.GooglePay.INSTANCE)) {
            return ResolvableStringUtilsKt.getResolvableString(com.stripe.android.R.string.stripe_google_pay);
        }
        if (paymentSelection instanceof PaymentSelection.Link) {
            return ResolvableStringUtilsKt.getResolvableString(com.stripe.android.R.string.stripe_link);
        }
        if (paymentSelection instanceof PaymentSelection.New.Card) {
            return ResolvableStringUtilsKt.orEmpty(PaymentMethodsUiExtensionKt.createCardLabel(((PaymentSelection.New.Card) paymentSelection).getLast4()));
        }
        if (paymentSelection instanceof PaymentSelection.New.GenericPaymentMethod) {
            return ((PaymentSelection.New.GenericPaymentMethod) paymentSelection).getLabel();
        }
        if (paymentSelection instanceof PaymentSelection.New.LinkInline) {
            return ResolvableStringUtilsKt.orEmpty(PaymentMethodsUiExtensionKt.createCardLabel(((PaymentSelection.New.LinkInline) paymentSelection).getLast4()));
        }
        if (paymentSelection instanceof PaymentSelection.New.USBankAccount) {
            return ResolvableStringUtilsKt.getResolvableString(((PaymentSelection.New.USBankAccount) paymentSelection).getLabel());
        }
        if (paymentSelection instanceof PaymentSelection.Saved) {
            return ResolvableStringUtilsKt.orEmpty(getSavedLabel((PaymentSelection.Saved) paymentSelection));
        }
        if (paymentSelection instanceof PaymentSelection.ShopPay) {
            return ResolvableStringUtilsKt.getResolvableString(com.stripe.android.R.string.stripe_shop_pay);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final ResolvableString getSavedLabel(PaymentSelection.Saved saved) {
        ResolvableString label = PaymentMethodsUiExtensionKt.getLabel(saved.getPaymentMethod(), true);
        if (label != null) {
            return label;
        }
        PaymentSelection.Saved.WalletType walletType = saved.getWalletType();
        int i = walletType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[walletType.ordinal()];
        if (i == 1) {
            return ResolvableStringUtilsKt.getResolvableString(com.stripe.android.R.string.stripe_link);
        }
        if (i != 2) {
            return null;
        }
        return ResolvableStringUtilsKt.getResolvableString(com.stripe.android.R.string.stripe_google_pay);
    }

    public static final String getPaymentMethodType(PaymentSelection paymentSelection) {
        String str;
        Intrinsics.checkNotNullParameter(paymentSelection, "<this>");
        if (paymentSelection instanceof PaymentSelection.ExternalPaymentMethod) {
            return ((PaymentSelection.ExternalPaymentMethod) paymentSelection).getType();
        }
        if (paymentSelection instanceof PaymentSelection.CustomPaymentMethod) {
            return ((PaymentSelection.CustomPaymentMethod) paymentSelection).getId();
        }
        if (Intrinsics.areEqual(paymentSelection, PaymentSelection.GooglePay.INSTANCE)) {
            return "google_pay";
        }
        if (paymentSelection instanceof PaymentSelection.Link) {
            return "link";
        }
        if (paymentSelection instanceof PaymentSelection.New) {
            return ((PaymentSelection.New) paymentSelection).getPaymentMethodCreateParams().getTypeCode();
        }
        if (paymentSelection instanceof PaymentSelection.Saved) {
            PaymentMethod.Type type = ((PaymentSelection.Saved) paymentSelection).getPaymentMethod().type;
            return (type == null || (str = type.code) == null) ? "card" : str;
        }
        if (paymentSelection instanceof PaymentSelection.ShopPay) {
            return "shop_pay";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final PaymentMethod.BillingDetails getBillingDetails(PaymentSelection paymentSelection) {
        Intrinsics.checkNotNullParameter(paymentSelection, "<this>");
        if (paymentSelection instanceof PaymentSelection.ExternalPaymentMethod) {
            return ((PaymentSelection.ExternalPaymentMethod) paymentSelection).getBillingDetails();
        }
        if (paymentSelection instanceof PaymentSelection.CustomPaymentMethod) {
            return ((PaymentSelection.CustomPaymentMethod) paymentSelection).getBillingDetails();
        }
        if (Intrinsics.areEqual(paymentSelection, PaymentSelection.GooglePay.INSTANCE)) {
            return null;
        }
        if (paymentSelection instanceof PaymentSelection.Link) {
            return ((PaymentSelection.Link) paymentSelection).getBillingDetails();
        }
        if (paymentSelection instanceof PaymentSelection.New) {
            return ((PaymentSelection.New) paymentSelection).getPaymentMethodCreateParams().getBillingDetails();
        }
        if (paymentSelection instanceof PaymentSelection.Saved) {
            return ((PaymentSelection.Saved) paymentSelection).getPaymentMethod().billingDetails;
        }
        if (paymentSelection instanceof PaymentSelection.ShopPay) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final PaymentSheet.BillingDetails toPaymentSheetBillingDetails(PaymentMethod.BillingDetails billingDetails) {
        Intrinsics.checkNotNullParameter(billingDetails, "<this>");
        Address address = billingDetails.address;
        String city = address != null ? address.getCity() : null;
        Address address2 = billingDetails.address;
        String country = address2 != null ? address2.getCountry() : null;
        Address address3 = billingDetails.address;
        String line1 = address3 != null ? address3.getLine1() : null;
        Address address4 = billingDetails.address;
        String line2 = address4 != null ? address4.getLine2() : null;
        Address address5 = billingDetails.address;
        String postalCode = address5 != null ? address5.getPostalCode() : null;
        Address address6 = billingDetails.address;
        return new PaymentSheet.BillingDetails(new PaymentSheet.Address(city, country, line1, line2, postalCode, address6 != null ? address6.getState() : null), billingDetails.email, billingDetails.name, billingDetails.phone);
    }

    public static final ResolvableString mandateTextFromPaymentMethodMetadata(PaymentSelection.Saved saved, PaymentMethodMetadata metadata) {
        String str;
        Intrinsics.checkNotNullParameter(saved, "<this>");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        String merchantName = metadata.getMerchantName();
        PaymentMethod.Type type = saved.getPaymentMethod().type;
        if (type == null || (str = type.code) == null) {
            str = "";
        }
        return saved.mandateText(merchantName, metadata.hasIntentToSetup(str));
    }

    public static final ConfirmPaymentIntentParams.SetupFutureUsage getSetupFutureUseValue(PaymentSelection.CustomerRequestedSave customerRequestedSave, boolean z) {
        Intrinsics.checkNotNullParameter(customerRequestedSave, "<this>");
        ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage = customerRequestedSave.getSetupFutureUsage();
        if ((setupFutureUsage == null ? -1 : WhenMappings.$EnumSwitchMapping$1[setupFutureUsage.ordinal()]) == 1) {
            return customerRequestedSave.getSetupFutureUsage();
        }
        ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage2 = customerRequestedSave.getSetupFutureUsage();
        if (z) {
            return null;
        }
        return setupFutureUsage2;
    }

    private static final boolean isLinkCardBrand(PaymentMethod paymentMethod) {
        return paymentMethod.type == PaymentMethod.Type.Card && (paymentMethod.getLinkPaymentDetails() instanceof LinkPaymentDetails.BankAccount);
    }
}
