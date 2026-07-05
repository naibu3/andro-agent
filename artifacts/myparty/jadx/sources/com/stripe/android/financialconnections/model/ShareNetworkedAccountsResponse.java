package com.stripe.android.financialconnections.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: ShareNetworkedAccountsResponse.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002%&B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, d2 = {"Lcom/stripe/android/financialconnections/model/ShareNetworkedAccountsResponse;", "", "nextPane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "display", "Lcom/stripe/android/financialconnections/model/Display;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/Display;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/Display;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getNextPane$annotations", "()V", "getNextPane", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getDisplay$annotations", "getDisplay", "()Lcom/stripe/android/financialconnections/model/Display;", "component1", "component2", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class ShareNetworkedAccountsResponse {
    private final Display display;
    private final FinancialConnectionsSessionManifest.Pane nextPane;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public ShareNetworkedAccountsResponse() {
        this((FinancialConnectionsSessionManifest.Pane) null, (Display) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ ShareNetworkedAccountsResponse copy$default(ShareNetworkedAccountsResponse shareNetworkedAccountsResponse, FinancialConnectionsSessionManifest.Pane pane, Display display, int i, Object obj) {
        if ((i & 1) != 0) {
            pane = shareNetworkedAccountsResponse.nextPane;
        }
        if ((i & 2) != 0) {
            display = shareNetworkedAccountsResponse.display;
        }
        return shareNetworkedAccountsResponse.copy(pane, display);
    }

    @SerialName("display_text")
    public static /* synthetic */ void getDisplay$annotations() {
    }

    @SerialName("next_pane")
    public static /* synthetic */ void getNextPane$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final FinancialConnectionsSessionManifest.Pane getNextPane() {
        return this.nextPane;
    }

    /* renamed from: component2, reason: from getter */
    public final Display getDisplay() {
        return this.display;
    }

    public final ShareNetworkedAccountsResponse copy(FinancialConnectionsSessionManifest.Pane nextPane, Display display) {
        return new ShareNetworkedAccountsResponse(nextPane, display);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareNetworkedAccountsResponse)) {
            return false;
        }
        ShareNetworkedAccountsResponse shareNetworkedAccountsResponse = (ShareNetworkedAccountsResponse) other;
        return this.nextPane == shareNetworkedAccountsResponse.nextPane && Intrinsics.areEqual(this.display, shareNetworkedAccountsResponse.display);
    }

    public int hashCode() {
        FinancialConnectionsSessionManifest.Pane pane = this.nextPane;
        int iHashCode = (pane == null ? 0 : pane.hashCode()) * 31;
        Display display = this.display;
        return iHashCode + (display != null ? display.hashCode() : 0);
    }

    public String toString() {
        return "ShareNetworkedAccountsResponse(nextPane=" + this.nextPane + ", display=" + this.display + ")";
    }

    /* compiled from: ShareNetworkedAccountsResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/ShareNetworkedAccountsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/ShareNetworkedAccountsResponse;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ShareNetworkedAccountsResponse> serializer() {
            return ShareNetworkedAccountsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ShareNetworkedAccountsResponse(int i, FinancialConnectionsSessionManifest.Pane pane, Display display, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.nextPane = null;
        } else {
            this.nextPane = pane;
        }
        if ((i & 2) == 0) {
            this.display = null;
        } else {
            this.display = display;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_release(ShareNetworkedAccountsResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.nextPane != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, self.nextPane);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.display == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, Display$$serializer.INSTANCE, self.display);
    }

    public ShareNetworkedAccountsResponse(FinancialConnectionsSessionManifest.Pane pane, Display display) {
        this.nextPane = pane;
        this.display = display;
    }

    public /* synthetic */ ShareNetworkedAccountsResponse(FinancialConnectionsSessionManifest.Pane pane, Display display, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : pane, (i & 2) != 0 ? null : display);
    }

    public final FinancialConnectionsSessionManifest.Pane getNextPane() {
        return this.nextPane;
    }

    public final Display getDisplay() {
        return this.display;
    }
}
