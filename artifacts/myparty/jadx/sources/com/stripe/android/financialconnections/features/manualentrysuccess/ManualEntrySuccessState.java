package com.stripe.android.financialconnections.features.manualentrysuccess;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.features.success.SuccessState;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.presentation.Async;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ManualEntrySuccessViewModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessState;", "", "payload", "Lcom/stripe/android/financialconnections/presentation/Async;", "Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;", "completeSession", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "<init>", "(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;)V", "getPayload", "()Lcom/stripe/android/financialconnections/presentation/Async;", "getCompleteSession", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ManualEntrySuccessState {
    public static final int $stable = 8;
    private final Async<FinancialConnectionsSession> completeSession;
    private final Async<SuccessState.Payload> payload;

    /* JADX WARN: Multi-variable type inference failed */
    public ManualEntrySuccessState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ManualEntrySuccessState copy$default(ManualEntrySuccessState manualEntrySuccessState, Async async, Async async2, int i, Object obj) {
        if ((i & 1) != 0) {
            async = manualEntrySuccessState.payload;
        }
        if ((i & 2) != 0) {
            async2 = manualEntrySuccessState.completeSession;
        }
        return manualEntrySuccessState.copy(async, async2);
    }

    public final Async<SuccessState.Payload> component1() {
        return this.payload;
    }

    public final Async<FinancialConnectionsSession> component2() {
        return this.completeSession;
    }

    public final ManualEntrySuccessState copy(Async<SuccessState.Payload> payload, Async<FinancialConnectionsSession> completeSession) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(completeSession, "completeSession");
        return new ManualEntrySuccessState(payload, completeSession);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManualEntrySuccessState)) {
            return false;
        }
        ManualEntrySuccessState manualEntrySuccessState = (ManualEntrySuccessState) other;
        return Intrinsics.areEqual(this.payload, manualEntrySuccessState.payload) && Intrinsics.areEqual(this.completeSession, manualEntrySuccessState.completeSession);
    }

    public int hashCode() {
        return (this.payload.hashCode() * 31) + this.completeSession.hashCode();
    }

    public String toString() {
        return "ManualEntrySuccessState(payload=" + this.payload + ", completeSession=" + this.completeSession + ")";
    }

    public ManualEntrySuccessState(Async<SuccessState.Payload> payload, Async<FinancialConnectionsSession> completeSession) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(completeSession, "completeSession");
        this.payload = payload;
        this.completeSession = completeSession;
    }

    public /* synthetic */ ManualEntrySuccessState(Async.Uninitialized uninitialized, Async.Uninitialized uninitialized2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Async.Uninitialized.INSTANCE : uninitialized, (i & 2) != 0 ? Async.Uninitialized.INSTANCE : uninitialized2);
    }

    public final Async<SuccessState.Payload> getPayload() {
        return this.payload;
    }

    public final Async<FinancialConnectionsSession> getCompleteSession() {
        return this.completeSession;
    }
}
