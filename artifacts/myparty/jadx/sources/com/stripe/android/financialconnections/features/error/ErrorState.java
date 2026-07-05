package com.stripe.android.financialconnections.features.error;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.presentation.Async;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorViewModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/financialconnections/features/error/ErrorState;", "", "payload", "Lcom/stripe/android/financialconnections/presentation/Async;", "Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;", "<init>", "(Lcom/stripe/android/financialconnections/presentation/Async;)V", "getPayload", "()Lcom/stripe/android/financialconnections/presentation/Async;", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Payload", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ErrorState {
    public static final int $stable = 8;
    private final Async<Payload> payload;

    /* JADX WARN: Multi-variable type inference failed */
    public ErrorState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ErrorState copy$default(ErrorState errorState, Async async, int i, Object obj) {
        if ((i & 1) != 0) {
            async = errorState.payload;
        }
        return errorState.copy(async);
    }

    public final Async<Payload> component1() {
        return this.payload;
    }

    public final ErrorState copy(Async<Payload> payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return new ErrorState(payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ErrorState) && Intrinsics.areEqual(this.payload, ((ErrorState) other).payload);
    }

    public int hashCode() {
        return this.payload.hashCode();
    }

    public String toString() {
        return "ErrorState(payload=" + this.payload + ")";
    }

    public ErrorState(Async<Payload> payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.payload = payload;
    }

    public /* synthetic */ ErrorState(Async.Uninitialized uninitialized, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Async.Uninitialized.INSTANCE : uninitialized);
    }

    public final Async<Payload> getPayload() {
        return this.payload;
    }

    /* compiled from: ErrorViewModel.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;", "", "error", "", "disableLinkMoreAccounts", "", "allowManualEntry", "<init>", "(Ljava/lang/Throwable;ZZ)V", "getError", "()Ljava/lang/Throwable;", "getDisableLinkMoreAccounts", "()Z", "getAllowManualEntry", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Payload {
        public static final int $stable = 8;
        private final boolean allowManualEntry;
        private final boolean disableLinkMoreAccounts;
        private final Throwable error;

        public static /* synthetic */ Payload copy$default(Payload payload, Throwable th, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                th = payload.error;
            }
            if ((i & 2) != 0) {
                z = payload.disableLinkMoreAccounts;
            }
            if ((i & 4) != 0) {
                z2 = payload.allowManualEntry;
            }
            return payload.copy(th, z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getDisableLinkMoreAccounts() {
            return this.disableLinkMoreAccounts;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getAllowManualEntry() {
            return this.allowManualEntry;
        }

        public final Payload copy(Throwable error, boolean disableLinkMoreAccounts, boolean allowManualEntry) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Payload(error, disableLinkMoreAccounts, allowManualEntry);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return Intrinsics.areEqual(this.error, payload.error) && this.disableLinkMoreAccounts == payload.disableLinkMoreAccounts && this.allowManualEntry == payload.allowManualEntry;
        }

        public int hashCode() {
            return (((this.error.hashCode() * 31) + Boolean.hashCode(this.disableLinkMoreAccounts)) * 31) + Boolean.hashCode(this.allowManualEntry);
        }

        public String toString() {
            return "Payload(error=" + this.error + ", disableLinkMoreAccounts=" + this.disableLinkMoreAccounts + ", allowManualEntry=" + this.allowManualEntry + ")";
        }

        public Payload(Throwable error, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
            this.disableLinkMoreAccounts = z;
            this.allowManualEntry = z2;
        }

        public final Throwable getError() {
            return this.error;
        }

        public final boolean getDisableLinkMoreAccounts() {
            return this.disableLinkMoreAccounts;
        }

        public final boolean getAllowManualEntry() {
            return this.allowManualEntry;
        }
    }
}
