package com.stripe.android.financialconnections.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import java.util.List;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: PartnerAccountsList.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0002-.B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0019J4\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\fHÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J%\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0001¢\u0006\u0002\b,R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001a\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019¨\u0006/"}, d2 = {"Lcom/stripe/android/financialconnections/model/PartnerAccountsList;", "", "data", "", "Lcom/stripe/android/financialconnections/model/PartnerAccount;", "nextPane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "skipAccountSelection", "", "<init>", "(Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/Boolean;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getData$annotations", "()V", "getData", "()Ljava/util/List;", "getNextPane$annotations", "getNextPane", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getSkipAccountSelection$annotations", "getSkipAccountSelection", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/Boolean;)Lcom/stripe/android/financialconnections/model/PartnerAccountsList;", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class PartnerAccountsList {
    private final List<PartnerAccount> data;
    private final FinancialConnectionsSessionManifest.Pane nextPane;
    private final Boolean skipAccountSelection;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(PartnerAccount$$serializer.INSTANCE), null, null};

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PartnerAccountsList copy$default(PartnerAccountsList partnerAccountsList, List list, FinancialConnectionsSessionManifest.Pane pane, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = partnerAccountsList.data;
        }
        if ((i & 2) != 0) {
            pane = partnerAccountsList.nextPane;
        }
        if ((i & 4) != 0) {
            bool = partnerAccountsList.skipAccountSelection;
        }
        return partnerAccountsList.copy(list, pane, bool);
    }

    @SerialName("data")
    @Required
    public static /* synthetic */ void getData$annotations() {
    }

    @SerialName("next_pane")
    @Required
    public static /* synthetic */ void getNextPane$annotations() {
    }

    @SerialName("skip_account_selection")
    public static /* synthetic */ void getSkipAccountSelection$annotations() {
    }

    public final List<PartnerAccount> component1() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final FinancialConnectionsSessionManifest.Pane getNextPane() {
        return this.nextPane;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getSkipAccountSelection() {
        return this.skipAccountSelection;
    }

    public final PartnerAccountsList copy(List<PartnerAccount> data, FinancialConnectionsSessionManifest.Pane nextPane, Boolean skipAccountSelection) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(nextPane, "nextPane");
        return new PartnerAccountsList(data, nextPane, skipAccountSelection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartnerAccountsList)) {
            return false;
        }
        PartnerAccountsList partnerAccountsList = (PartnerAccountsList) other;
        return Intrinsics.areEqual(this.data, partnerAccountsList.data) && this.nextPane == partnerAccountsList.nextPane && Intrinsics.areEqual(this.skipAccountSelection, partnerAccountsList.skipAccountSelection);
    }

    public int hashCode() {
        int iHashCode = ((this.data.hashCode() * 31) + this.nextPane.hashCode()) * 31;
        Boolean bool = this.skipAccountSelection;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "PartnerAccountsList(data=" + this.data + ", nextPane=" + this.nextPane + ", skipAccountSelection=" + this.skipAccountSelection + ")";
    }

    /* compiled from: PartnerAccountsList.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/PartnerAccountsList$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PartnerAccountsList> serializer() {
            return PartnerAccountsList$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PartnerAccountsList(int i, List list, FinancialConnectionsSessionManifest.Pane pane, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, PartnerAccountsList$$serializer.INSTANCE.getDescriptor());
        }
        this.data = list;
        this.nextPane = pane;
        if ((i & 4) == 0) {
            this.skipAccountSelection = null;
        } else {
            this.skipAccountSelection = bool;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_release(PartnerAccountsList self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0], self.data);
        output.encodeSerializableElement(serialDesc, 1, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, self.nextPane);
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.skipAccountSelection == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, self.skipAccountSelection);
    }

    public PartnerAccountsList(List<PartnerAccount> data, FinancialConnectionsSessionManifest.Pane nextPane, Boolean bool) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(nextPane, "nextPane");
        this.data = data;
        this.nextPane = nextPane;
        this.skipAccountSelection = bool;
    }

    public /* synthetic */ PartnerAccountsList(List list, FinancialConnectionsSessionManifest.Pane pane, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, pane, (i & 4) != 0 ? null : bool);
    }

    public final List<PartnerAccount> getData() {
        return this.data;
    }

    public final FinancialConnectionsSessionManifest.Pane getNextPane() {
        return this.nextPane;
    }

    public final Boolean getSkipAccountSelection() {
        return this.skipAccountSelection;
    }
}
