package com.stripe.android.financialconnections.features.exit;

import android.os.Bundle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExitViewModel.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001eB'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB\u0013\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\rJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J/\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/financialconnections/features/exit/ExitState;", "", Destination.KEY_REFERRER, "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "payload", "Lcom/stripe/android/financialconnections/presentation/Async;", "Lcom/stripe/android/financialconnections/features/exit/ExitState$Payload;", "closing", "", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;Z)V", CardScanActivity.ARGS, "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "getReferrer", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getPayload", "()Lcom/stripe/android/financialconnections/presentation/Async;", "getClosing", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Payload", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ExitState {
    public static final int $stable = 8;
    private final boolean closing;
    private final Async<Payload> payload;
    private final FinancialConnectionsSessionManifest.Pane referrer;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExitState copy$default(ExitState exitState, FinancialConnectionsSessionManifest.Pane pane, Async async, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            pane = exitState.referrer;
        }
        if ((i & 2) != 0) {
            async = exitState.payload;
        }
        if ((i & 4) != 0) {
            z = exitState.closing;
        }
        return exitState.copy(pane, async, z);
    }

    /* renamed from: component1, reason: from getter */
    public final FinancialConnectionsSessionManifest.Pane getReferrer() {
        return this.referrer;
    }

    public final Async<Payload> component2() {
        return this.payload;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getClosing() {
        return this.closing;
    }

    public final ExitState copy(FinancialConnectionsSessionManifest.Pane referrer, Async<Payload> payload, boolean closing) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return new ExitState(referrer, payload, closing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExitState)) {
            return false;
        }
        ExitState exitState = (ExitState) other;
        return this.referrer == exitState.referrer && Intrinsics.areEqual(this.payload, exitState.payload) && this.closing == exitState.closing;
    }

    public int hashCode() {
        FinancialConnectionsSessionManifest.Pane pane = this.referrer;
        return ((((pane == null ? 0 : pane.hashCode()) * 31) + this.payload.hashCode()) * 31) + Boolean.hashCode(this.closing);
    }

    public String toString() {
        return "ExitState(referrer=" + this.referrer + ", payload=" + this.payload + ", closing=" + this.closing + ")";
    }

    public ExitState(FinancialConnectionsSessionManifest.Pane pane, Async<Payload> payload, boolean z) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.referrer = pane;
        this.payload = payload;
        this.closing = z;
    }

    public final FinancialConnectionsSessionManifest.Pane getReferrer() {
        return this.referrer;
    }

    public final Async<Payload> getPayload() {
        return this.payload;
    }

    public final boolean getClosing() {
        return this.closing;
    }

    /* compiled from: ExitViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/financialconnections/features/exit/ExitState$Payload;", "", "description", "Lcom/stripe/android/financialconnections/ui/TextResource;", "<init>", "(Lcom/stripe/android/financialconnections/ui/TextResource;)V", "getDescription", "()Lcom/stripe/android/financialconnections/ui/TextResource;", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Payload {
        public static final int $stable = 8;
        private final TextResource description;

        public static /* synthetic */ Payload copy$default(Payload payload, TextResource textResource, int i, Object obj) {
            if ((i & 1) != 0) {
                textResource = payload.description;
            }
            return payload.copy(textResource);
        }

        /* renamed from: component1, reason: from getter */
        public final TextResource getDescription() {
            return this.description;
        }

        public final Payload copy(TextResource description) {
            Intrinsics.checkNotNullParameter(description, "description");
            return new Payload(description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Payload) && Intrinsics.areEqual(this.description, ((Payload) other).description);
        }

        public int hashCode() {
            return this.description.hashCode();
        }

        public String toString() {
            return "Payload(description=" + this.description + ")";
        }

        public Payload(TextResource description) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.description = description;
        }

        public final TextResource getDescription() {
            return this.description;
        }
    }

    public ExitState(Bundle bundle) {
        this(Destination.INSTANCE.referrer$financial_connections_release(bundle), Async.Uninitialized.INSTANCE, false);
    }
}
