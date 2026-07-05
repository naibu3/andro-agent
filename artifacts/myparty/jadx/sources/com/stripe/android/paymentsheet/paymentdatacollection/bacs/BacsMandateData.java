package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.paymentelement.confirmation.bacs.BacsConfirmationOption;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BacsMandateData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateData;", "", "name", "", "email", "accountNumber", "sortCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getEmail", "getAccountNumber", "getSortCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BacsMandateData {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String accountNumber;
    private final String email;
    private final String name;
    private final String sortCode;

    public static /* synthetic */ BacsMandateData copy$default(BacsMandateData bacsMandateData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bacsMandateData.name;
        }
        if ((i & 2) != 0) {
            str2 = bacsMandateData.email;
        }
        if ((i & 4) != 0) {
            str3 = bacsMandateData.accountNumber;
        }
        if ((i & 8) != 0) {
            str4 = bacsMandateData.sortCode;
        }
        return bacsMandateData.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSortCode() {
        return this.sortCode;
    }

    public final BacsMandateData copy(String name, String email, String accountNumber, String sortCode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(sortCode, "sortCode");
        return new BacsMandateData(name, email, accountNumber, sortCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BacsMandateData)) {
            return false;
        }
        BacsMandateData bacsMandateData = (BacsMandateData) other;
        return Intrinsics.areEqual(this.name, bacsMandateData.name) && Intrinsics.areEqual(this.email, bacsMandateData.email) && Intrinsics.areEqual(this.accountNumber, bacsMandateData.accountNumber) && Intrinsics.areEqual(this.sortCode, bacsMandateData.sortCode);
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.email.hashCode()) * 31) + this.accountNumber.hashCode()) * 31) + this.sortCode.hashCode();
    }

    public String toString() {
        return "BacsMandateData(name=" + this.name + ", email=" + this.email + ", accountNumber=" + this.accountNumber + ", sortCode=" + this.sortCode + ")";
    }

    public BacsMandateData(String name, String email, String accountNumber, String sortCode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(sortCode, "sortCode");
        this.name = name;
        this.email = email;
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
    }

    public final String getName() {
        return this.name;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getSortCode() {
        return this.sortCode;
    }

    /* compiled from: BacsMandateData.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateData$Companion;", "", "<init>", "()V", "fromConfirmationOption", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateData;", "confirmationOption", "Lcom/stripe/android/paymentelement/confirmation/bacs/BacsConfirmationOption;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BacsMandateData fromConfirmationOption(BacsConfirmationOption confirmationOption) {
            Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
            PaymentMethodCreateParams createParams = confirmationOption.getCreateParams();
            PaymentMethodCreateParams.BacsDebit bacsDebitCreateBacsFromParams = PaymentMethodCreateParams.INSTANCE.createBacsFromParams(createParams);
            String nameFromParams = PaymentMethodCreateParams.INSTANCE.getNameFromParams(createParams);
            String emailFromParams = PaymentMethodCreateParams.INSTANCE.getEmailFromParams(createParams);
            if (bacsDebitCreateBacsFromParams == null || nameFromParams == null || emailFromParams == null) {
                return null;
            }
            return new BacsMandateData(nameFromParams, emailFromParams, bacsDebitCreateBacsFromParams.getAccountNumber(), bacsDebitCreateBacsFromParams.getSortCode());
        }
    }
}
