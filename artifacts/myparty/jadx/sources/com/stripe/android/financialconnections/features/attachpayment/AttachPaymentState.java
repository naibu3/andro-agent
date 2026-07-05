package com.stripe.android.financialconnections.features.attachpayment;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.presentation.Async;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AttachPaymentViewModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;", "", "linkPaymentAccount", "Lcom/stripe/android/financialconnections/presentation/Async;", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "<init>", "(Lcom/stripe/android/financialconnections/presentation/Async;)V", "getLinkPaymentAccount", "()Lcom/stripe/android/financialconnections/presentation/Async;", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AttachPaymentState {
    public static final int $stable = 0;
    private final Async<LinkAccountSessionPaymentAccount> linkPaymentAccount;

    /* JADX WARN: Multi-variable type inference failed */
    public AttachPaymentState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AttachPaymentState copy$default(AttachPaymentState attachPaymentState, Async async, int i, Object obj) {
        if ((i & 1) != 0) {
            async = attachPaymentState.linkPaymentAccount;
        }
        return attachPaymentState.copy(async);
    }

    public final Async<LinkAccountSessionPaymentAccount> component1() {
        return this.linkPaymentAccount;
    }

    public final AttachPaymentState copy(Async<LinkAccountSessionPaymentAccount> linkPaymentAccount) {
        Intrinsics.checkNotNullParameter(linkPaymentAccount, "linkPaymentAccount");
        return new AttachPaymentState(linkPaymentAccount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AttachPaymentState) && Intrinsics.areEqual(this.linkPaymentAccount, ((AttachPaymentState) other).linkPaymentAccount);
    }

    public int hashCode() {
        return this.linkPaymentAccount.hashCode();
    }

    public String toString() {
        return "AttachPaymentState(linkPaymentAccount=" + this.linkPaymentAccount + ")";
    }

    public AttachPaymentState(Async<LinkAccountSessionPaymentAccount> linkPaymentAccount) {
        Intrinsics.checkNotNullParameter(linkPaymentAccount, "linkPaymentAccount");
        this.linkPaymentAccount = linkPaymentAccount;
    }

    public /* synthetic */ AttachPaymentState(Async.Uninitialized uninitialized, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Async.Uninitialized.INSTANCE : uninitialized);
    }

    public final Async<LinkAccountSessionPaymentAccount> getLinkPaymentAccount() {
        return this.linkPaymentAccount;
    }
}
