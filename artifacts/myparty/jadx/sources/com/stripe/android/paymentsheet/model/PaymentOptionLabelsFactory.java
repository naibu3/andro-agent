package com.stripe.android.paymentsheet.model;

import android.content.Context;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.link.LinkPaymentMethod;
import com.stripe.android.link.ui.wallet.PaymentDetailsNicknameKt;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.LinkPaymentDetails;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.model.PaymentOption;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.BankFormScreenState;
import com.stripe.android.paymentsheet.ui.PaymentMethodsUiExtensionKt;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.ui.core.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentOptionLabelsFactory.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000bH\u0002J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u001a\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentOptionLabelsFactory;", "", "<init>", "()V", "create", "Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;", "context", "Landroid/content/Context;", BaseSheetViewModel.SAVE_SELECTION, "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "newCard", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;", "newUSBankAccount", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;", "savedLink", "linkDetails", "Lcom/stripe/android/model/LinkPaymentDetails;", "savedCard", "card", "Lcom/stripe/android/model/PaymentMethod$Card;", "savedUSBankAccount", "usBankAccount", "Lcom/stripe/android/model/PaymentMethod$USBankAccount;", "label", "", "link", "paymentMethod", "Lcom/stripe/android/link/LinkPaymentMethod;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentOptionLabelsFactory {
    public static final int $stable = 0;
    public static final PaymentOptionLabelsFactory INSTANCE = new PaymentOptionLabelsFactory();

    private PaymentOptionLabelsFactory() {
    }

    public final PaymentOption.Labels create(Context context, PaymentSelection selection) {
        PaymentOption.Labels labelsSavedLink;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(selection, "selection");
        String strResolve = PaymentSelectionKt.getLabel(selection).resolve(context);
        PaymentOption.Labels labels = new PaymentOption.Labels(strResolve, null);
        if (!(selection instanceof PaymentSelection.CustomPaymentMethod) && !(selection instanceof PaymentSelection.ExternalPaymentMethod) && !(selection instanceof PaymentSelection.GooglePay) && !(selection instanceof PaymentSelection.ShopPay) && !(selection instanceof PaymentSelection.New.GenericPaymentMethod)) {
            if (selection instanceof PaymentSelection.New.Card) {
                return newCard(context, (PaymentSelection.New.Card) selection);
            }
            if (selection instanceof PaymentSelection.New.LinkInline) {
                return newCard(context, (PaymentSelection.New.LinkInline) selection);
            }
            if (selection instanceof PaymentSelection.New.USBankAccount) {
                return newUSBankAccount(context, (PaymentSelection.New.USBankAccount) selection);
            }
            if (selection instanceof PaymentSelection.Saved) {
                PaymentMethod paymentMethod = ((PaymentSelection.Saved) selection).getPaymentMethod();
                LinkPaymentDetails linkPaymentDetails = paymentMethod.getLinkPaymentDetails();
                if (linkPaymentDetails != null && (labelsSavedLink = INSTANCE.savedLink(context, linkPaymentDetails)) != null) {
                    return labelsSavedLink;
                }
                PaymentMethod.Card card = paymentMethod.card;
                if (card != null) {
                    return INSTANCE.savedCard(context, card);
                }
                PaymentMethod.USBankAccount uSBankAccount = paymentMethod.usBankAccount;
                PaymentOption.Labels labelsSavedUSBankAccount = uSBankAccount != null ? INSTANCE.savedUSBankAccount(uSBankAccount, strResolve) : null;
                if (labelsSavedUSBankAccount != null) {
                    return labelsSavedUSBankAccount;
                }
            } else {
                if (!(selection instanceof PaymentSelection.Link)) {
                    throw new NoWhenBranchMatchedException();
                }
                return link(context, ((PaymentSelection.Link) selection).getSelectedPayment());
            }
        }
        return labels;
    }

    private final PaymentOption.Labels newCard(Context context, PaymentSelection.New.Card selection) {
        return new PaymentOption.Labels(selection.getBrand().getDisplayName(), PaymentSelectionKt.getLabel(selection).resolve(context));
    }

    private final PaymentOption.Labels newCard(Context context, PaymentSelection.New.LinkInline selection) {
        return new PaymentOption.Labels(selection.getBrand().getDisplayName(), PaymentSelectionKt.getLabel(selection).resolve(context));
    }

    private final PaymentOption.Labels newUSBankAccount(Context context, PaymentSelection.New.USBankAccount selection) {
        String label = selection.getLabel();
        BankFormScreenState.LinkedBankAccount linkedBankAccount = selection.getScreenState().getLinkedBankAccount();
        String bankName = linkedBankAccount != null ? linkedBankAccount.getBankName() : null;
        if (bankName == null) {
            bankName = ResolvableStringUtilsKt.getResolvableString(R.string.stripe_payment_method_bank).resolve(context);
        }
        return new PaymentOption.Labels(bankName, label);
    }

    private final PaymentOption.Labels savedLink(Context context, LinkPaymentDetails linkDetails) {
        return new PaymentOption.Labels(ResolvableStringUtilsKt.getResolvableString(com.stripe.android.R.string.stripe_link).resolve(context), PaymentDetailsNicknameKt.getPaymentOptionLabel(linkDetails).resolve(context));
    }

    private final PaymentOption.Labels savedCard(Context context, PaymentMethod.Card card) {
        CardBrand cardBrandFromCode;
        String str = card.displayBrand;
        if (str == null || (cardBrandFromCode = CardBrand.INSTANCE.fromCode(str)) == null) {
            cardBrandFromCode = card.brand;
        }
        if (cardBrandFromCode == CardBrand.Unknown) {
            cardBrandFromCode = null;
        }
        ResolvableString resolvableStringCreateCardLabel = PaymentMethodsUiExtensionKt.createCardLabel(card.last4);
        String strResolve = resolvableStringCreateCardLabel != null ? resolvableStringCreateCardLabel.resolve(context) : null;
        if (strResolve == null) {
            strResolve = "";
        }
        if (cardBrandFromCode != null) {
            return new PaymentOption.Labels(cardBrandFromCode.getDisplayName(), strResolve);
        }
        return new PaymentOption.Labels(strResolve, null);
    }

    private final PaymentOption.Labels savedUSBankAccount(PaymentMethod.USBankAccount usBankAccount, String label) {
        String str = usBankAccount.bankName;
        if (str != null) {
            return new PaymentOption.Labels(str, label);
        }
        return new PaymentOption.Labels(label, null);
    }

    private final PaymentOption.Labels link(Context context, LinkPaymentMethod paymentMethod) {
        ConsumerPaymentDetails.PaymentDetails details;
        ResolvableString paymentOptionLabel;
        return new PaymentOption.Labels(ResolvableStringUtilsKt.getResolvableString(com.stripe.android.R.string.stripe_link).resolve(context), (paymentMethod == null || (details = paymentMethod.getDetails()) == null || (paymentOptionLabel = PaymentDetailsNicknameKt.getPaymentOptionLabel(details)) == null) ? null : paymentOptionLabel.resolve(context));
    }
}
