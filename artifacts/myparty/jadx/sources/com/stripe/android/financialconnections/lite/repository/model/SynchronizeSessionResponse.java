package com.stripe.android.financialconnections.lite.repository.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SynchronizeSessionResponse.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J%\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b\u001eR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, d2 = {"Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;", "", "manifest", "Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;", "<init>", "(Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getManifest$annotations", "()V", "getManifest", "()Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;", "component1", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_lite_release", "$serializer", "Companion", "financial-connections-lite_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class SynchronizeSessionResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final FinancialConnectionsSessionManifest manifest;

    public static /* synthetic */ SynchronizeSessionResponse copy$default(SynchronizeSessionResponse synchronizeSessionResponse, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, int i, Object obj) {
        if ((i & 1) != 0) {
            financialConnectionsSessionManifest = synchronizeSessionResponse.manifest;
        }
        return synchronizeSessionResponse.copy(financialConnectionsSessionManifest);
    }

    @SerialName("manifest")
    public static /* synthetic */ void getManifest$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final FinancialConnectionsSessionManifest getManifest() {
        return this.manifest;
    }

    public final SynchronizeSessionResponse copy(FinancialConnectionsSessionManifest manifest) {
        Intrinsics.checkNotNullParameter(manifest, "manifest");
        return new SynchronizeSessionResponse(manifest);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SynchronizeSessionResponse) && Intrinsics.areEqual(this.manifest, ((SynchronizeSessionResponse) other).manifest);
    }

    public int hashCode() {
        return this.manifest.hashCode();
    }

    public String toString() {
        return "SynchronizeSessionResponse(manifest=" + this.manifest + ")";
    }

    /* compiled from: SynchronizeSessionResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;", "financial-connections-lite_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SynchronizeSessionResponse> serializer() {
            return SynchronizeSessionResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SynchronizeSessionResponse(int i, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, SynchronizeSessionResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.manifest = financialConnectionsSessionManifest;
    }

    public SynchronizeSessionResponse(FinancialConnectionsSessionManifest manifest) {
        Intrinsics.checkNotNullParameter(manifest, "manifest");
        this.manifest = manifest;
    }

    public final FinancialConnectionsSessionManifest getManifest() {
        return this.manifest;
    }
}
