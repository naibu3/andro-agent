package com.stripe.android.financialconnections.features.success;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.common.util.UriUtil;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.ui.TextResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SuccessViewModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B'\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/financialconnections/features/success/SuccessState;", "", "payload", "Lcom/stripe/android/financialconnections/presentation/Async;", "Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;", "completeSession", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "<init>", "(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;)V", "getPayload", "()Lcom/stripe/android/financialconnections/presentation/Async;", "getCompleteSession", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Payload", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SuccessState {
    public static final int $stable = 8;
    private final Async<FinancialConnectionsSession> completeSession;
    private final Async<Payload> payload;

    /* JADX WARN: Multi-variable type inference failed */
    public SuccessState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuccessState copy$default(SuccessState successState, Async async, Async async2, int i, Object obj) {
        if ((i & 1) != 0) {
            async = successState.payload;
        }
        if ((i & 2) != 0) {
            async2 = successState.completeSession;
        }
        return successState.copy(async, async2);
    }

    public final Async<Payload> component1() {
        return this.payload;
    }

    public final Async<FinancialConnectionsSession> component2() {
        return this.completeSession;
    }

    public final SuccessState copy(Async<Payload> payload, Async<FinancialConnectionsSession> completeSession) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(completeSession, "completeSession");
        return new SuccessState(payload, completeSession);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuccessState)) {
            return false;
        }
        SuccessState successState = (SuccessState) other;
        return Intrinsics.areEqual(this.payload, successState.payload) && Intrinsics.areEqual(this.completeSession, successState.completeSession);
    }

    public int hashCode() {
        return (this.payload.hashCode() * 31) + this.completeSession.hashCode();
    }

    public String toString() {
        return "SuccessState(payload=" + this.payload + ", completeSession=" + this.completeSession + ")";
    }

    public SuccessState(Async<Payload> payload, Async<FinancialConnectionsSession> completeSession) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(completeSession, "completeSession");
        this.payload = payload;
        this.completeSession = completeSession;
    }

    public /* synthetic */ SuccessState(Async.Uninitialized uninitialized, Async.Uninitialized uninitialized2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Async.Uninitialized.INSTANCE : uninitialized, (i & 2) != 0 ? Async.Uninitialized.INSTANCE : uninitialized2);
    }

    public final Async<Payload> getPayload() {
        return this.payload;
    }

    public final Async<FinancialConnectionsSession> getCompleteSession() {
        return this.completeSession;
    }

    /* compiled from: SuccessViewModel.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;", "", "businessName", "", "title", "Lcom/stripe/android/financialconnections/ui/TextResource;", UriUtil.LOCAL_CONTENT_SCHEME, "skipSuccessPane", "", "<init>", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;Z)V", "getBusinessName", "()Ljava/lang/String;", "getTitle", "()Lcom/stripe/android/financialconnections/ui/TextResource;", "getContent", "getSkipSuccessPane", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Payload {
        public static final int $stable = 0;
        private final String businessName;
        private final TextResource content;
        private final boolean skipSuccessPane;
        private final TextResource title;

        public static /* synthetic */ Payload copy$default(Payload payload, String str, TextResource textResource, TextResource textResource2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = payload.businessName;
            }
            if ((i & 2) != 0) {
                textResource = payload.title;
            }
            if ((i & 4) != 0) {
                textResource2 = payload.content;
            }
            if ((i & 8) != 0) {
                z = payload.skipSuccessPane;
            }
            return payload.copy(str, textResource, textResource2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBusinessName() {
            return this.businessName;
        }

        /* renamed from: component2, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final TextResource getContent() {
            return this.content;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getSkipSuccessPane() {
            return this.skipSuccessPane;
        }

        public final Payload copy(String businessName, TextResource title, TextResource content, boolean skipSuccessPane) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(content, "content");
            return new Payload(businessName, title, content, skipSuccessPane);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return Intrinsics.areEqual(this.businessName, payload.businessName) && Intrinsics.areEqual(this.title, payload.title) && Intrinsics.areEqual(this.content, payload.content) && this.skipSuccessPane == payload.skipSuccessPane;
        }

        public int hashCode() {
            String str = this.businessName;
            return ((((((str == null ? 0 : str.hashCode()) * 31) + this.title.hashCode()) * 31) + this.content.hashCode()) * 31) + Boolean.hashCode(this.skipSuccessPane);
        }

        public String toString() {
            return "Payload(businessName=" + this.businessName + ", title=" + this.title + ", content=" + this.content + ", skipSuccessPane=" + this.skipSuccessPane + ")";
        }

        public Payload(String str, TextResource title, TextResource content, boolean z) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(content, "content");
            this.businessName = str;
            this.title = title;
            this.content = content;
            this.skipSuccessPane = z;
        }

        public final String getBusinessName() {
            return this.businessName;
        }

        public final TextResource getTitle() {
            return this.title;
        }

        public final TextResource getContent() {
            return this.content;
        }

        public final boolean getSkipSuccessPane() {
            return this.skipSuccessPane;
        }
    }
}
