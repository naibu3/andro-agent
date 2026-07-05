package com.stripe.android.link.ui.wallet;

import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.LinkPaymentDetails;
import com.stripe.android.ui.core.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentDetailsNickname.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\u001a\"\u0010\r\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u001c\u0010\u0013\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0002\u001a\u0018\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002\u001a\u001a\u0010\u0016\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u000fH\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004\"\u0018\u0010\t\u001a\u00020\u0001*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\f¨\u0006\u0019"}, d2 = {"paymentOptionLabel", "Lcom/stripe/android/core/strings/ResolvableString;", "Lcom/stripe/android/model/LinkPaymentDetails;", "getPaymentOptionLabel", "(Lcom/stripe/android/model/LinkPaymentDetails;)Lcom/stripe/android/core/strings/ResolvableString;", "label", "getLabel", "sublabel", "getSublabel", "displayName", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "getDisplayName", "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)Lcom/stripe/android/core/strings/ResolvableString;", "makeCardDisplayName", "nickname", "", "funding", "brand", "Lcom/stripe/android/model/CardBrand;", "makeBankAccountDisplayName", "bankName", "makeFallbackCardName", "joinToString", "", "separator", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentDetailsNicknameKt {
    public static final ResolvableString getPaymentOptionLabel(LinkPaymentDetails linkPaymentDetails) {
        Intrinsics.checkNotNullParameter(linkPaymentDetails, "<this>");
        return joinToString(CollectionsKt.listOfNotNull((Object[]) new ResolvableString[]{getLabel(linkPaymentDetails), getSublabel(linkPaymentDetails)}), " ");
    }

    public static final ResolvableString getLabel(LinkPaymentDetails linkPaymentDetails) {
        ResolvableString resolvableString;
        Intrinsics.checkNotNullParameter(linkPaymentDetails, "<this>");
        if (linkPaymentDetails instanceof LinkPaymentDetails.Card) {
            LinkPaymentDetails.Card card = (LinkPaymentDetails.Card) linkPaymentDetails;
            return makeCardDisplayName(card.getNickname(), card.getFunding(), card.getBrand());
        }
        if (!(linkPaymentDetails instanceof LinkPaymentDetails.BankAccount)) {
            throw new NoWhenBranchMatchedException();
        }
        LinkPaymentDetails.BankAccount bankAccount = (LinkPaymentDetails.BankAccount) linkPaymentDetails;
        String bankName = bankAccount.getBankName();
        return (bankName == null || (resolvableString = ResolvableStringUtilsKt.getResolvableString(bankName)) == null) ? ResolvableStringUtilsKt.getResolvableString("••••" + bankAccount.getLast4()) : resolvableString;
    }

    public static final ResolvableString getSublabel(LinkPaymentDetails linkPaymentDetails) {
        Intrinsics.checkNotNullParameter(linkPaymentDetails, "<this>");
        if (linkPaymentDetails instanceof LinkPaymentDetails.Card) {
            return ResolvableStringUtilsKt.getResolvableString("•••• " + ((LinkPaymentDetails.Card) linkPaymentDetails).getLast4());
        }
        if (!(linkPaymentDetails instanceof LinkPaymentDetails.BankAccount)) {
            throw new NoWhenBranchMatchedException();
        }
        LinkPaymentDetails.BankAccount bankAccount = (LinkPaymentDetails.BankAccount) linkPaymentDetails;
        if (bankAccount.getBankName() == null) {
            return null;
        }
        return ResolvableStringUtilsKt.getResolvableString("••••" + bankAccount.getLast4());
    }

    public static final ResolvableString getDisplayName(ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        Intrinsics.checkNotNullParameter(paymentDetails, "<this>");
        if (paymentDetails instanceof ConsumerPaymentDetails.Card) {
            ConsumerPaymentDetails.Card card = (ConsumerPaymentDetails.Card) paymentDetails;
            return makeCardDisplayName(card.getNickname(), card.getFunding(), card.getBrand());
        }
        if (paymentDetails instanceof ConsumerPaymentDetails.BankAccount) {
            ConsumerPaymentDetails.BankAccount bankAccount = (ConsumerPaymentDetails.BankAccount) paymentDetails;
            return makeBankAccountDisplayName(bankAccount.getNickname(), bankAccount.getBankName());
        }
        if (!(paymentDetails instanceof ConsumerPaymentDetails.Passthrough)) {
            throw new NoWhenBranchMatchedException();
        }
        return ResolvableStringUtilsKt.getResolvableString("•••• " + ((ConsumerPaymentDetails.Passthrough) paymentDetails).getLast4());
    }

    public static final ResolvableString getPaymentOptionLabel(ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        List listListOf;
        Intrinsics.checkNotNullParameter(paymentDetails, "<this>");
        if (paymentDetails instanceof ConsumerPaymentDetails.Card) {
            ConsumerPaymentDetails.Card card = (ConsumerPaymentDetails.Card) paymentDetails;
            listListOf = CollectionsKt.listOf((Object[]) new ResolvableString[]{makeCardDisplayName(card.getNickname(), card.getFunding(), card.getBrand()), ResolvableStringUtilsKt.getResolvableString("•••• " + card.getLast4())});
        } else if (paymentDetails instanceof ConsumerPaymentDetails.BankAccount) {
            ConsumerPaymentDetails.BankAccount bankAccount = (ConsumerPaymentDetails.BankAccount) paymentDetails;
            listListOf = CollectionsKt.listOf((Object[]) new ResolvableString[]{makeBankAccountDisplayName(bankAccount.getNickname(), bankAccount.getBankName()), ResolvableStringUtilsKt.getResolvableString("•••• " + bankAccount.getLast4())});
        } else {
            if (!(paymentDetails instanceof ConsumerPaymentDetails.Passthrough)) {
                throw new NoWhenBranchMatchedException();
            }
            listListOf = CollectionsKt.listOf(ResolvableStringUtilsKt.getResolvableString("•••• " + ((ConsumerPaymentDetails.Passthrough) paymentDetails).getLast4()));
        }
        return joinToString(listListOf, " ");
    }

    private static final ResolvableString makeCardDisplayName(String str, String str2, CardBrand cardBrand) {
        ResolvableString resolvableString;
        return (str == null || (resolvableString = ResolvableStringUtilsKt.getResolvableString(str)) == null) ? makeFallbackCardName(str2, cardBrand.getDisplayName()) : resolvableString;
    }

    private static final ResolvableString makeBankAccountDisplayName(String str, String str2) {
        ResolvableString resolvableString;
        if (str != null && (resolvableString = ResolvableStringUtilsKt.getResolvableString(str)) != null) {
            return resolvableString;
        }
        if (str2 != null) {
            return ResolvableStringUtilsKt.getResolvableString(str2);
        }
        return ResolvableStringUtilsKt.getResolvableString(R.string.stripe_payment_method_bank);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r3.equals("FUNDING_INVALID") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r3.equals("CHARGE") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        return com.stripe.android.core.strings.ResolvableStringUtilsKt.resolvableString$default(com.stripe.android.paymentsheet.R.string.stripe_link_card_type_unknown, new java.lang.Object[]{r4}, null, 4, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final ResolvableString makeFallbackCardName(String str, String str2) {
        switch (str.hashCode()) {
            case 64920780:
                if (str.equals("DEBIT")) {
                    return ResolvableStringUtilsKt.resolvableString$default(com.stripe.android.paymentsheet.R.string.stripe_link_card_type_debit, new Object[]{str2}, null, 4, null);
                }
                return ResolvableStringUtilsKt.resolvableString$default(com.stripe.android.paymentsheet.R.string.stripe_link_card_type_unknown, new Object[]{str2}, null, 4, null);
            case 399611855:
                if (str.equals("PREPAID")) {
                    return ResolvableStringUtilsKt.resolvableString$default(com.stripe.android.paymentsheet.R.string.stripe_link_card_type_prepaid, new Object[]{str2}, null, 4, null);
                }
                return ResolvableStringUtilsKt.resolvableString$default(com.stripe.android.paymentsheet.R.string.stripe_link_card_type_unknown, new Object[]{str2}, null, 4, null);
            case 1986664116:
                break;
            case 1987855989:
                break;
            case 1996005113:
                if (str.equals("CREDIT")) {
                    return ResolvableStringUtilsKt.resolvableString$default(com.stripe.android.paymentsheet.R.string.stripe_link_card_type_credit, new Object[]{str2}, null, 4, null);
                }
                return ResolvableStringUtilsKt.resolvableString$default(com.stripe.android.paymentsheet.R.string.stripe_link_card_type_unknown, new Object[]{str2}, null, 4, null);
            default:
                return ResolvableStringUtilsKt.resolvableString$default(com.stripe.android.paymentsheet.R.string.stripe_link_card_type_unknown, new Object[]{str2}, null, 4, null);
        }
    }

    private static final ResolvableString joinToString(List<? extends ResolvableString> list, String str) {
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = ResolvableStringUtilsKt.plus(ResolvableStringUtilsKt.plus((ResolvableString) next, ResolvableStringUtilsKt.getResolvableString(str)), (ResolvableString) it.next());
        }
        return (ResolvableString) next;
    }
}
