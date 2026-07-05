package com.stripe.android.financialconnections.features.manualentry;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.presentation.Async;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ManualEntryViewModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B'\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;", "", "payload", "Lcom/stripe/android/financialconnections/presentation/Async;", "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;", "linkPaymentAccount", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "<init>", "(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;)V", "getPayload", "()Lcom/stripe/android/financialconnections/presentation/Async;", "getLinkPaymentAccount", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Payload", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ManualEntryState {
    public static final int $stable = 0;
    private final Async<LinkAccountSessionPaymentAccount> linkPaymentAccount;
    private final Async<Payload> payload;

    /* JADX WARN: Multi-variable type inference failed */
    public ManualEntryState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ManualEntryState copy$default(ManualEntryState manualEntryState, Async async, Async async2, int i, Object obj) {
        if ((i & 1) != 0) {
            async = manualEntryState.payload;
        }
        if ((i & 2) != 0) {
            async2 = manualEntryState.linkPaymentAccount;
        }
        return manualEntryState.copy(async, async2);
    }

    public final Async<Payload> component1() {
        return this.payload;
    }

    public final Async<LinkAccountSessionPaymentAccount> component2() {
        return this.linkPaymentAccount;
    }

    public final ManualEntryState copy(Async<Payload> payload, Async<LinkAccountSessionPaymentAccount> linkPaymentAccount) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(linkPaymentAccount, "linkPaymentAccount");
        return new ManualEntryState(payload, linkPaymentAccount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManualEntryState)) {
            return false;
        }
        ManualEntryState manualEntryState = (ManualEntryState) other;
        return Intrinsics.areEqual(this.payload, manualEntryState.payload) && Intrinsics.areEqual(this.linkPaymentAccount, manualEntryState.linkPaymentAccount);
    }

    public int hashCode() {
        return (this.payload.hashCode() * 31) + this.linkPaymentAccount.hashCode();
    }

    public String toString() {
        return "ManualEntryState(payload=" + this.payload + ", linkPaymentAccount=" + this.linkPaymentAccount + ")";
    }

    public ManualEntryState(Async<Payload> payload, Async<LinkAccountSessionPaymentAccount> linkPaymentAccount) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(linkPaymentAccount, "linkPaymentAccount");
        this.payload = payload;
        this.linkPaymentAccount = linkPaymentAccount;
    }

    public /* synthetic */ ManualEntryState(Async.Uninitialized uninitialized, Async.Uninitialized uninitialized2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Async.Uninitialized.INSTANCE : uninitialized, (i & 2) != 0 ? Async.Uninitialized.INSTANCE : uninitialized2);
    }

    public final Async<Payload> getPayload() {
        return this.payload;
    }

    public final Async<LinkAccountSessionPaymentAccount> getLinkPaymentAccount() {
        return this.linkPaymentAccount;
    }

    /* compiled from: ManualEntryViewModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;", "", "verifyWithMicrodeposits", "", "customManualEntry", "testMode", "<init>", "(ZZZ)V", "getVerifyWithMicrodeposits", "()Z", "getCustomManualEntry", "getTestMode", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Payload {
        public static final int $stable = 0;
        private final boolean customManualEntry;
        private final boolean testMode;
        private final boolean verifyWithMicrodeposits;

        public static /* synthetic */ Payload copy$default(Payload payload, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = payload.verifyWithMicrodeposits;
            }
            if ((i & 2) != 0) {
                z2 = payload.customManualEntry;
            }
            if ((i & 4) != 0) {
                z3 = payload.testMode;
            }
            return payload.copy(z, z2, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getVerifyWithMicrodeposits() {
            return this.verifyWithMicrodeposits;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getCustomManualEntry() {
            return this.customManualEntry;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getTestMode() {
            return this.testMode;
        }

        public final Payload copy(boolean verifyWithMicrodeposits, boolean customManualEntry, boolean testMode) {
            return new Payload(verifyWithMicrodeposits, customManualEntry, testMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return this.verifyWithMicrodeposits == payload.verifyWithMicrodeposits && this.customManualEntry == payload.customManualEntry && this.testMode == payload.testMode;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.verifyWithMicrodeposits) * 31) + Boolean.hashCode(this.customManualEntry)) * 31) + Boolean.hashCode(this.testMode);
        }

        public String toString() {
            return "Payload(verifyWithMicrodeposits=" + this.verifyWithMicrodeposits + ", customManualEntry=" + this.customManualEntry + ", testMode=" + this.testMode + ")";
        }

        public Payload(boolean z, boolean z2, boolean z3) {
            this.verifyWithMicrodeposits = z;
            this.customManualEntry = z2;
            this.testMode = z3;
        }

        public final boolean getVerifyWithMicrodeposits() {
            return this.verifyWithMicrodeposits;
        }

        public final boolean getCustomManualEntry() {
            return this.customManualEntry;
        }

        public final boolean getTestMode() {
            return this.testMode;
        }
    }
}
