package com.stripe.android.financialconnections.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Required;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: NetworkedAccountsList.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 :2\u00020\u0001:\u00029:BQ\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fB_\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000e\u0010\u0014J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010$JZ\u0010+\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0011HÖ\u0001J\t\u00100\u001a\u00020\u000bHÖ\u0001J%\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0001¢\u0006\u0002\b8R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u001eR*\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010!R \u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010%\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010$¨\u0006;"}, d2 = {"Lcom/stripe/android/financialconnections/model/NetworkedAccountsList;", "", "data", "", "Lcom/stripe/android/financialconnections/model/PartnerAccount;", "display", "Lcom/stripe/android/financialconnections/model/Display;", "nextPaneOnAddAccount", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "partnerToCoreAuths", "", "", "acquireConsentOnPrimaryCtaClick", "", "<init>", "(Ljava/util/List;Lcom/stripe/android/financialconnections/model/Display;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;Ljava/lang/Boolean;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lcom/stripe/android/financialconnections/model/Display;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getData$annotations", "()V", "getData", "()Ljava/util/List;", "getDisplay$annotations", "getDisplay", "()Lcom/stripe/android/financialconnections/model/Display;", "getNextPaneOnAddAccount$annotations", "getNextPaneOnAddAccount", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getPartnerToCoreAuths$annotations", "getPartnerToCoreAuths", "()Ljava/util/Map;", "getAcquireConsentOnPrimaryCtaClick$annotations", "getAcquireConsentOnPrimaryCtaClick", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Lcom/stripe/android/financialconnections/model/Display;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;Ljava/lang/Boolean;)Lcom/stripe/android/financialconnections/model/NetworkedAccountsList;", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class NetworkedAccountsList {
    private final Boolean acquireConsentOnPrimaryCtaClick;
    private final List<PartnerAccount> data;
    private final Display display;
    private final FinancialConnectionsSessionManifest.Pane nextPaneOnAddAccount;
    private final Map<String, String> partnerToCoreAuths;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(PartnerAccount$$serializer.INSTANCE), null, null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, StringSerializer.INSTANCE), null};

    public static /* synthetic */ NetworkedAccountsList copy$default(NetworkedAccountsList networkedAccountsList, List list, Display display, FinancialConnectionsSessionManifest.Pane pane, Map map, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = networkedAccountsList.data;
        }
        if ((i & 2) != 0) {
            display = networkedAccountsList.display;
        }
        if ((i & 4) != 0) {
            pane = networkedAccountsList.nextPaneOnAddAccount;
        }
        if ((i & 8) != 0) {
            map = networkedAccountsList.partnerToCoreAuths;
        }
        if ((i & 16) != 0) {
            bool = networkedAccountsList.acquireConsentOnPrimaryCtaClick;
        }
        Boolean bool2 = bool;
        FinancialConnectionsSessionManifest.Pane pane2 = pane;
        return networkedAccountsList.copy(list, display, pane2, map, bool2);
    }

    @SerialName("acquire_consent_on_primary_cta_click")
    public static /* synthetic */ void getAcquireConsentOnPrimaryCtaClick$annotations() {
    }

    @SerialName("data")
    @Required
    public static /* synthetic */ void getData$annotations() {
    }

    @SerialName("display")
    public static /* synthetic */ void getDisplay$annotations() {
    }

    @SerialName("next_pane_on_add_account")
    public static /* synthetic */ void getNextPaneOnAddAccount$annotations() {
    }

    @SerialName("partner_to_core_auths")
    public static /* synthetic */ void getPartnerToCoreAuths$annotations() {
    }

    public final List<PartnerAccount> component1() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final Display getDisplay() {
        return this.display;
    }

    /* renamed from: component3, reason: from getter */
    public final FinancialConnectionsSessionManifest.Pane getNextPaneOnAddAccount() {
        return this.nextPaneOnAddAccount;
    }

    public final Map<String, String> component4() {
        return this.partnerToCoreAuths;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getAcquireConsentOnPrimaryCtaClick() {
        return this.acquireConsentOnPrimaryCtaClick;
    }

    public final NetworkedAccountsList copy(List<PartnerAccount> data, Display display, FinancialConnectionsSessionManifest.Pane nextPaneOnAddAccount, Map<String, String> partnerToCoreAuths, Boolean acquireConsentOnPrimaryCtaClick) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new NetworkedAccountsList(data, display, nextPaneOnAddAccount, partnerToCoreAuths, acquireConsentOnPrimaryCtaClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkedAccountsList)) {
            return false;
        }
        NetworkedAccountsList networkedAccountsList = (NetworkedAccountsList) other;
        return Intrinsics.areEqual(this.data, networkedAccountsList.data) && Intrinsics.areEqual(this.display, networkedAccountsList.display) && this.nextPaneOnAddAccount == networkedAccountsList.nextPaneOnAddAccount && Intrinsics.areEqual(this.partnerToCoreAuths, networkedAccountsList.partnerToCoreAuths) && Intrinsics.areEqual(this.acquireConsentOnPrimaryCtaClick, networkedAccountsList.acquireConsentOnPrimaryCtaClick);
    }

    public int hashCode() {
        int iHashCode = this.data.hashCode() * 31;
        Display display = this.display;
        int iHashCode2 = (iHashCode + (display == null ? 0 : display.hashCode())) * 31;
        FinancialConnectionsSessionManifest.Pane pane = this.nextPaneOnAddAccount;
        int iHashCode3 = (iHashCode2 + (pane == null ? 0 : pane.hashCode())) * 31;
        Map<String, String> map = this.partnerToCoreAuths;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.acquireConsentOnPrimaryCtaClick;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "NetworkedAccountsList(data=" + this.data + ", display=" + this.display + ", nextPaneOnAddAccount=" + this.nextPaneOnAddAccount + ", partnerToCoreAuths=" + this.partnerToCoreAuths + ", acquireConsentOnPrimaryCtaClick=" + this.acquireConsentOnPrimaryCtaClick + ")";
    }

    /* compiled from: NetworkedAccountsList.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/NetworkedAccountsList$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/NetworkedAccountsList;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NetworkedAccountsList> serializer() {
            return NetworkedAccountsList$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NetworkedAccountsList(int i, List list, Display display, FinancialConnectionsSessionManifest.Pane pane, Map map, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, NetworkedAccountsList$$serializer.INSTANCE.getDescriptor());
        }
        this.data = list;
        if ((i & 2) == 0) {
            this.display = null;
        } else {
            this.display = display;
        }
        if ((i & 4) == 0) {
            this.nextPaneOnAddAccount = null;
        } else {
            this.nextPaneOnAddAccount = pane;
        }
        if ((i & 8) == 0) {
            this.partnerToCoreAuths = null;
        } else {
            this.partnerToCoreAuths = map;
        }
        if ((i & 16) == 0) {
            this.acquireConsentOnPrimaryCtaClick = false;
        } else {
            this.acquireConsentOnPrimaryCtaClick = bool;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_release(NetworkedAccountsList self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.data);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.display != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, Display$$serializer.INSTANCE, self.display);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.nextPaneOnAddAccount != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, self.nextPaneOnAddAccount);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.partnerToCoreAuths != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, kSerializerArr[3], self.partnerToCoreAuths);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && Intrinsics.areEqual((Object) self.acquireConsentOnPrimaryCtaClick, (Object) false)) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, self.acquireConsentOnPrimaryCtaClick);
    }

    public NetworkedAccountsList(List<PartnerAccount> data, Display display, FinancialConnectionsSessionManifest.Pane pane, Map<String, String> map, Boolean bool) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.display = display;
        this.nextPaneOnAddAccount = pane;
        this.partnerToCoreAuths = map;
        this.acquireConsentOnPrimaryCtaClick = bool;
    }

    public final List<PartnerAccount> getData() {
        return this.data;
    }

    public final Display getDisplay() {
        return this.display;
    }

    public final FinancialConnectionsSessionManifest.Pane getNextPaneOnAddAccount() {
        return this.nextPaneOnAddAccount;
    }

    public final Map<String, String> getPartnerToCoreAuths() {
        return this.partnerToCoreAuths;
    }

    public /* synthetic */ NetworkedAccountsList(List list, Display display, FinancialConnectionsSessionManifest.Pane pane, Map map, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : display, (i & 4) != 0 ? null : pane, (i & 8) != 0 ? null : map, (i & 16) != 0 ? false : bool);
    }

    public final Boolean getAcquireConsentOnPrimaryCtaClick() {
        return this.acquireConsentOnPrimaryCtaClick;
    }
}
