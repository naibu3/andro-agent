package com.stripe.android.financialconnections.features.accountupdate;

import android.os.Bundle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.presentation.Async;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountUpdateRequiredViewModel.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;", "", Destination.KEY_REFERRER, "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "payload", "Lcom/stripe/android/financialconnections/presentation/Async;", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;)V", "arguments", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "getReferrer", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getPayload", "()Lcom/stripe/android/financialconnections/presentation/Async;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AccountUpdateRequiredState {
    public static final int $stable = 8;
    private final Async<NoticeSheetState.NoticeSheetContent.UpdateRequired> payload;
    private final FinancialConnectionsSessionManifest.Pane referrer;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountUpdateRequiredState copy$default(AccountUpdateRequiredState accountUpdateRequiredState, FinancialConnectionsSessionManifest.Pane pane, Async async, int i, Object obj) {
        if ((i & 1) != 0) {
            pane = accountUpdateRequiredState.referrer;
        }
        if ((i & 2) != 0) {
            async = accountUpdateRequiredState.payload;
        }
        return accountUpdateRequiredState.copy(pane, async);
    }

    /* renamed from: component1, reason: from getter */
    public final FinancialConnectionsSessionManifest.Pane getReferrer() {
        return this.referrer;
    }

    public final Async<NoticeSheetState.NoticeSheetContent.UpdateRequired> component2() {
        return this.payload;
    }

    public final AccountUpdateRequiredState copy(FinancialConnectionsSessionManifest.Pane referrer, Async<NoticeSheetState.NoticeSheetContent.UpdateRequired> payload) {
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        Intrinsics.checkNotNullParameter(payload, "payload");
        return new AccountUpdateRequiredState(referrer, payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountUpdateRequiredState)) {
            return false;
        }
        AccountUpdateRequiredState accountUpdateRequiredState = (AccountUpdateRequiredState) other;
        return this.referrer == accountUpdateRequiredState.referrer && Intrinsics.areEqual(this.payload, accountUpdateRequiredState.payload);
    }

    public int hashCode() {
        return (this.referrer.hashCode() * 31) + this.payload.hashCode();
    }

    public String toString() {
        return "AccountUpdateRequiredState(referrer=" + this.referrer + ", payload=" + this.payload + ")";
    }

    public AccountUpdateRequiredState(FinancialConnectionsSessionManifest.Pane referrer, Async<NoticeSheetState.NoticeSheetContent.UpdateRequired> payload) {
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.referrer = referrer;
        this.payload = payload;
    }

    public final FinancialConnectionsSessionManifest.Pane getReferrer() {
        return this.referrer;
    }

    public /* synthetic */ AccountUpdateRequiredState(FinancialConnectionsSessionManifest.Pane pane, Async.Uninitialized uninitialized, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pane, (i & 2) != 0 ? Async.Uninitialized.INSTANCE : uninitialized);
    }

    public final Async<NoticeSheetState.NoticeSheetContent.UpdateRequired> getPayload() {
        return this.payload;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public AccountUpdateRequiredState(Bundle bundle) {
        FinancialConnectionsSessionManifest.Pane paneReferrer$financial_connections_release = Destination.INSTANCE.referrer$financial_connections_release(bundle);
        Intrinsics.checkNotNull(paneReferrer$financial_connections_release);
        this(paneReferrer$financial_connections_release, null, 2, 0 == true ? 1 : 0);
    }
}
