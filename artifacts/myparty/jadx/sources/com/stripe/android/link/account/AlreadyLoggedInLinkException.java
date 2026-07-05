package com.stripe.android.link.account;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.link.model.AccountStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AlreadyLoggedInLinkException.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\u0003H\u0016J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/link/account/AlreadyLoggedInLinkException;", "Lcom/stripe/android/core/exception/StripeException;", "email", "", "accountStatus", "Lcom/stripe/android/link/model/AccountStatus;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/link/model/AccountStatus;)V", "getEmail", "()Ljava/lang/String;", "getAccountStatus", "()Lcom/stripe/android/link/model/AccountStatus;", "analyticsValue", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AlreadyLoggedInLinkException extends StripeException {
    public static final int $stable = 0;
    private final AccountStatus accountStatus;
    private final String email;

    public static /* synthetic */ AlreadyLoggedInLinkException copy$default(AlreadyLoggedInLinkException alreadyLoggedInLinkException, String str, AccountStatus accountStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alreadyLoggedInLinkException.email;
        }
        if ((i & 2) != 0) {
            accountStatus = alreadyLoggedInLinkException.accountStatus;
        }
        return alreadyLoggedInLinkException.copy(str, accountStatus);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component2, reason: from getter */
    public final AccountStatus getAccountStatus() {
        return this.accountStatus;
    }

    public final AlreadyLoggedInLinkException copy(String email, AccountStatus accountStatus) {
        Intrinsics.checkNotNullParameter(accountStatus, "accountStatus");
        return new AlreadyLoggedInLinkException(email, accountStatus);
    }

    @Override // com.stripe.android.core.exception.StripeException
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlreadyLoggedInLinkException)) {
            return false;
        }
        AlreadyLoggedInLinkException alreadyLoggedInLinkException = (AlreadyLoggedInLinkException) other;
        return Intrinsics.areEqual(this.email, alreadyLoggedInLinkException.email) && this.accountStatus == alreadyLoggedInLinkException.accountStatus;
    }

    @Override // com.stripe.android.core.exception.StripeException
    public int hashCode() {
        String str = this.email;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.accountStatus.hashCode();
    }

    @Override // com.stripe.android.core.exception.StripeException, java.lang.Throwable
    public String toString() {
        return "AlreadyLoggedInLinkException(email=" + this.email + ", accountStatus=" + this.accountStatus + ")";
    }

    public final String getEmail() {
        return this.email;
    }

    public final AccountStatus getAccountStatus() {
        return this.accountStatus;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlreadyLoggedInLinkException(String str, AccountStatus accountStatus) {
        super(null, null, 0, null, null, 31, null);
        Intrinsics.checkNotNullParameter(accountStatus, "accountStatus");
        this.email = str;
        this.accountStatus = accountStatus;
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String analyticsValue() {
        return "alreadyLoggedIntoLinkError";
    }
}
