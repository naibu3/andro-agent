package com.stripe.android.financialconnections.launcher;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsSheetNativeActivityArgs.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;", "Landroid/os/Parcelable;", "flowType", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "initialSyncResponse", "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "elementsSessionContext", "Lcom/stripe/android/financialconnections/ElementsSessionContext;", "<init>", "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lcom/stripe/android/financialconnections/ElementsSessionContext;)V", "getFlowType", "()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;", "getConfiguration", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "getInitialSyncResponse", "()Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "getElementsSessionContext", "()Lcom/stripe/android/financialconnections/ElementsSessionContext;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FinancialConnectionsSheetNativeActivityArgs implements Parcelable {
    private final FinancialConnectionsSheetConfiguration configuration;
    private final ElementsSessionContext elementsSessionContext;
    private final FinancialConnectionsSheetFlowType flowType;
    private final SynchronizeSessionResponse initialSyncResponse;
    public static final Parcelable.Creator<FinancialConnectionsSheetNativeActivityArgs> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: FinancialConnectionsSheetNativeActivityArgs.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FinancialConnectionsSheetNativeActivityArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsSheetNativeActivityArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FinancialConnectionsSheetNativeActivityArgs(FinancialConnectionsSheetFlowType.valueOf(parcel.readString()), (FinancialConnectionsSheetConfiguration) parcel.readParcelable(FinancialConnectionsSheetNativeActivityArgs.class.getClassLoader()), SynchronizeSessionResponse.CREATOR.createFromParcel(parcel), (ElementsSessionContext) parcel.readParcelable(FinancialConnectionsSheetNativeActivityArgs.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsSheetNativeActivityArgs[] newArray(int i) {
            return new FinancialConnectionsSheetNativeActivityArgs[i];
        }
    }

    public static /* synthetic */ FinancialConnectionsSheetNativeActivityArgs copy$default(FinancialConnectionsSheetNativeActivityArgs financialConnectionsSheetNativeActivityArgs, FinancialConnectionsSheetFlowType financialConnectionsSheetFlowType, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, SynchronizeSessionResponse synchronizeSessionResponse, ElementsSessionContext elementsSessionContext, int i, Object obj) {
        if ((i & 1) != 0) {
            financialConnectionsSheetFlowType = financialConnectionsSheetNativeActivityArgs.flowType;
        }
        if ((i & 2) != 0) {
            financialConnectionsSheetConfiguration = financialConnectionsSheetNativeActivityArgs.configuration;
        }
        if ((i & 4) != 0) {
            synchronizeSessionResponse = financialConnectionsSheetNativeActivityArgs.initialSyncResponse;
        }
        if ((i & 8) != 0) {
            elementsSessionContext = financialConnectionsSheetNativeActivityArgs.elementsSessionContext;
        }
        return financialConnectionsSheetNativeActivityArgs.copy(financialConnectionsSheetFlowType, financialConnectionsSheetConfiguration, synchronizeSessionResponse, elementsSessionContext);
    }

    /* renamed from: component1, reason: from getter */
    public final FinancialConnectionsSheetFlowType getFlowType() {
        return this.flowType;
    }

    /* renamed from: component2, reason: from getter */
    public final FinancialConnectionsSheetConfiguration getConfiguration() {
        return this.configuration;
    }

    /* renamed from: component3, reason: from getter */
    public final SynchronizeSessionResponse getInitialSyncResponse() {
        return this.initialSyncResponse;
    }

    /* renamed from: component4, reason: from getter */
    public final ElementsSessionContext getElementsSessionContext() {
        return this.elementsSessionContext;
    }

    public final FinancialConnectionsSheetNativeActivityArgs copy(FinancialConnectionsSheetFlowType flowType, FinancialConnectionsSheetConfiguration configuration, SynchronizeSessionResponse initialSyncResponse, ElementsSessionContext elementsSessionContext) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(initialSyncResponse, "initialSyncResponse");
        return new FinancialConnectionsSheetNativeActivityArgs(flowType, configuration, initialSyncResponse, elementsSessionContext);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsSheetNativeActivityArgs)) {
            return false;
        }
        FinancialConnectionsSheetNativeActivityArgs financialConnectionsSheetNativeActivityArgs = (FinancialConnectionsSheetNativeActivityArgs) other;
        return this.flowType == financialConnectionsSheetNativeActivityArgs.flowType && Intrinsics.areEqual(this.configuration, financialConnectionsSheetNativeActivityArgs.configuration) && Intrinsics.areEqual(this.initialSyncResponse, financialConnectionsSheetNativeActivityArgs.initialSyncResponse) && Intrinsics.areEqual(this.elementsSessionContext, financialConnectionsSheetNativeActivityArgs.elementsSessionContext);
    }

    public int hashCode() {
        int iHashCode = ((((this.flowType.hashCode() * 31) + this.configuration.hashCode()) * 31) + this.initialSyncResponse.hashCode()) * 31;
        ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
        return iHashCode + (elementsSessionContext == null ? 0 : elementsSessionContext.hashCode());
    }

    public String toString() {
        return "FinancialConnectionsSheetNativeActivityArgs(flowType=" + this.flowType + ", configuration=" + this.configuration + ", initialSyncResponse=" + this.initialSyncResponse + ", elementsSessionContext=" + this.elementsSessionContext + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.flowType.name());
        dest.writeParcelable(this.configuration, flags);
        this.initialSyncResponse.writeToParcel(dest, flags);
        dest.writeParcelable(this.elementsSessionContext, flags);
    }

    public FinancialConnectionsSheetNativeActivityArgs(FinancialConnectionsSheetFlowType flowType, FinancialConnectionsSheetConfiguration configuration, SynchronizeSessionResponse initialSyncResponse, ElementsSessionContext elementsSessionContext) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(initialSyncResponse, "initialSyncResponse");
        this.flowType = flowType;
        this.configuration = configuration;
        this.initialSyncResponse = initialSyncResponse;
        this.elementsSessionContext = elementsSessionContext;
    }

    public /* synthetic */ FinancialConnectionsSheetNativeActivityArgs(FinancialConnectionsSheetFlowType financialConnectionsSheetFlowType, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, SynchronizeSessionResponse synchronizeSessionResponse, ElementsSessionContext elementsSessionContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(financialConnectionsSheetFlowType, financialConnectionsSheetConfiguration, synchronizeSessionResponse, (i & 8) != 0 ? null : elementsSessionContext);
    }

    public final FinancialConnectionsSheetFlowType getFlowType() {
        return this.flowType;
    }

    public final FinancialConnectionsSheetConfiguration getConfiguration() {
        return this.configuration;
    }

    public final SynchronizeSessionResponse getInitialSyncResponse() {
        return this.initialSyncResponse;
    }

    public final ElementsSessionContext getElementsSessionContext() {
        return this.elementsSessionContext;
    }
}
