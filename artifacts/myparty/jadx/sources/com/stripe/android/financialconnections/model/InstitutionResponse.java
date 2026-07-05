package com.stripe.android.financialconnections.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: InstitutionResponse.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002'(B!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J*\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\nHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J%\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b&R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0012\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0015¨\u0006)"}, d2 = {"Lcom/stripe/android/financialconnections/model/InstitutionResponse;", "", "showManualEntry", "", "data", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Boolean;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getShowManualEntry$annotations", "()V", "getShowManualEntry", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getData$annotations", "getData", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/util/List;)Lcom/stripe/android/financialconnections/model/InstitutionResponse;", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class InstitutionResponse {
    private final List<FinancialConnectionsInstitution> data;
    private final Boolean showManualEntry;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(FinancialConnectionsInstitution$$serializer.INSTANCE)};

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InstitutionResponse copy$default(InstitutionResponse institutionResponse, Boolean bool, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = institutionResponse.showManualEntry;
        }
        if ((i & 2) != 0) {
            list = institutionResponse.data;
        }
        return institutionResponse.copy(bool, list);
    }

    @SerialName("data")
    public static /* synthetic */ void getData$annotations() {
    }

    @SerialName("show_manual_entry")
    public static /* synthetic */ void getShowManualEntry$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getShowManualEntry() {
        return this.showManualEntry;
    }

    public final List<FinancialConnectionsInstitution> component2() {
        return this.data;
    }

    public final InstitutionResponse copy(Boolean showManualEntry, List<FinancialConnectionsInstitution> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new InstitutionResponse(showManualEntry, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstitutionResponse)) {
            return false;
        }
        InstitutionResponse institutionResponse = (InstitutionResponse) other;
        return Intrinsics.areEqual(this.showManualEntry, institutionResponse.showManualEntry) && Intrinsics.areEqual(this.data, institutionResponse.data);
    }

    public int hashCode() {
        Boolean bool = this.showManualEntry;
        return ((bool == null ? 0 : bool.hashCode()) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "InstitutionResponse(showManualEntry=" + this.showManualEntry + ", data=" + this.data + ")";
    }

    /* compiled from: InstitutionResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/InstitutionResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/InstitutionResponse;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InstitutionResponse> serializer() {
            return InstitutionResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InstitutionResponse(int i, Boolean bool, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, InstitutionResponse$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.showManualEntry = false;
        } else {
            this.showManualEntry = bool;
        }
        this.data = list;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_release(InstitutionResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual((Object) self.showManualEntry, (Object) false)) {
            output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.showManualEntry);
        }
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.data);
    }

    public InstitutionResponse(Boolean bool, List<FinancialConnectionsInstitution> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.showManualEntry = bool;
        this.data = data;
    }

    public /* synthetic */ InstitutionResponse(Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : bool, list);
    }

    public final Boolean getShowManualEntry() {
        return this.showManualEntry;
    }

    public final List<FinancialConnectionsInstitution> getData() {
        return this.data;
    }
}
