package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BacsMandateConfirmationViewState.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006$"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationViewState;", "", "email", "", "nameOnAccount", "sortCode", "accountNumber", "payer", "Lcom/stripe/android/core/strings/ResolvableString;", "supportAddressAsHtml", "debitGuaranteeAsHtml", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;)V", "getEmail", "()Ljava/lang/String;", "getNameOnAccount", "getSortCode", "getAccountNumber", "getPayer", "()Lcom/stripe/android/core/strings/ResolvableString;", "getSupportAddressAsHtml", "getDebitGuaranteeAsHtml", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BacsMandateConfirmationViewState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final ResolvableString debitGuaranteeAsHtml;
    private final String email;
    private final String nameOnAccount;
    private final ResolvableString payer;
    private final String sortCode;
    private final ResolvableString supportAddressAsHtml;

    public static /* synthetic */ BacsMandateConfirmationViewState copy$default(BacsMandateConfirmationViewState bacsMandateConfirmationViewState, String str, String str2, String str3, String str4, ResolvableString resolvableString, ResolvableString resolvableString2, ResolvableString resolvableString3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bacsMandateConfirmationViewState.email;
        }
        if ((i & 2) != 0) {
            str2 = bacsMandateConfirmationViewState.nameOnAccount;
        }
        if ((i & 4) != 0) {
            str3 = bacsMandateConfirmationViewState.sortCode;
        }
        if ((i & 8) != 0) {
            str4 = bacsMandateConfirmationViewState.accountNumber;
        }
        if ((i & 16) != 0) {
            resolvableString = bacsMandateConfirmationViewState.payer;
        }
        if ((i & 32) != 0) {
            resolvableString2 = bacsMandateConfirmationViewState.supportAddressAsHtml;
        }
        if ((i & 64) != 0) {
            resolvableString3 = bacsMandateConfirmationViewState.debitGuaranteeAsHtml;
        }
        ResolvableString resolvableString4 = resolvableString2;
        ResolvableString resolvableString5 = resolvableString3;
        ResolvableString resolvableString6 = resolvableString;
        String str5 = str3;
        return bacsMandateConfirmationViewState.copy(str, str2, str5, str4, resolvableString6, resolvableString4, resolvableString5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNameOnAccount() {
        return this.nameOnAccount;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSortCode() {
        return this.sortCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final ResolvableString getPayer() {
        return this.payer;
    }

    /* renamed from: component6, reason: from getter */
    public final ResolvableString getSupportAddressAsHtml() {
        return this.supportAddressAsHtml;
    }

    /* renamed from: component7, reason: from getter */
    public final ResolvableString getDebitGuaranteeAsHtml() {
        return this.debitGuaranteeAsHtml;
    }

    public final BacsMandateConfirmationViewState copy(String email, String nameOnAccount, String sortCode, String accountNumber, ResolvableString payer, ResolvableString supportAddressAsHtml, ResolvableString debitGuaranteeAsHtml) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(nameOnAccount, "nameOnAccount");
        Intrinsics.checkNotNullParameter(sortCode, "sortCode");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(payer, "payer");
        Intrinsics.checkNotNullParameter(supportAddressAsHtml, "supportAddressAsHtml");
        Intrinsics.checkNotNullParameter(debitGuaranteeAsHtml, "debitGuaranteeAsHtml");
        return new BacsMandateConfirmationViewState(email, nameOnAccount, sortCode, accountNumber, payer, supportAddressAsHtml, debitGuaranteeAsHtml);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BacsMandateConfirmationViewState)) {
            return false;
        }
        BacsMandateConfirmationViewState bacsMandateConfirmationViewState = (BacsMandateConfirmationViewState) other;
        return Intrinsics.areEqual(this.email, bacsMandateConfirmationViewState.email) && Intrinsics.areEqual(this.nameOnAccount, bacsMandateConfirmationViewState.nameOnAccount) && Intrinsics.areEqual(this.sortCode, bacsMandateConfirmationViewState.sortCode) && Intrinsics.areEqual(this.accountNumber, bacsMandateConfirmationViewState.accountNumber) && Intrinsics.areEqual(this.payer, bacsMandateConfirmationViewState.payer) && Intrinsics.areEqual(this.supportAddressAsHtml, bacsMandateConfirmationViewState.supportAddressAsHtml) && Intrinsics.areEqual(this.debitGuaranteeAsHtml, bacsMandateConfirmationViewState.debitGuaranteeAsHtml);
    }

    public int hashCode() {
        return (((((((((((this.email.hashCode() * 31) + this.nameOnAccount.hashCode()) * 31) + this.sortCode.hashCode()) * 31) + this.accountNumber.hashCode()) * 31) + this.payer.hashCode()) * 31) + this.supportAddressAsHtml.hashCode()) * 31) + this.debitGuaranteeAsHtml.hashCode();
    }

    public String toString() {
        return "BacsMandateConfirmationViewState(email=" + this.email + ", nameOnAccount=" + this.nameOnAccount + ", sortCode=" + this.sortCode + ", accountNumber=" + this.accountNumber + ", payer=" + this.payer + ", supportAddressAsHtml=" + this.supportAddressAsHtml + ", debitGuaranteeAsHtml=" + this.debitGuaranteeAsHtml + ")";
    }

    public BacsMandateConfirmationViewState(String email, String nameOnAccount, String sortCode, String accountNumber, ResolvableString payer, ResolvableString supportAddressAsHtml, ResolvableString debitGuaranteeAsHtml) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(nameOnAccount, "nameOnAccount");
        Intrinsics.checkNotNullParameter(sortCode, "sortCode");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(payer, "payer");
        Intrinsics.checkNotNullParameter(supportAddressAsHtml, "supportAddressAsHtml");
        Intrinsics.checkNotNullParameter(debitGuaranteeAsHtml, "debitGuaranteeAsHtml");
        this.email = email;
        this.nameOnAccount = nameOnAccount;
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        this.payer = payer;
        this.supportAddressAsHtml = supportAddressAsHtml;
        this.debitGuaranteeAsHtml = debitGuaranteeAsHtml;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getNameOnAccount() {
        return this.nameOnAccount;
    }

    public final String getSortCode() {
        return this.sortCode;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final ResolvableString getPayer() {
        return this.payer;
    }

    public final ResolvableString getSupportAddressAsHtml() {
        return this.supportAddressAsHtml;
    }

    public final ResolvableString getDebitGuaranteeAsHtml() {
        return this.debitGuaranteeAsHtml;
    }
}
