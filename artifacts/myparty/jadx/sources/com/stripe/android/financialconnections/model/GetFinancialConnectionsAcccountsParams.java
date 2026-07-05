package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: GetFinancialConnectionsAcccountsParams.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002'(B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010J\t\u0010\u0012\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u001f\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\bJ\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\bJ%\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b&R\u0016\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\r¨\u0006)"}, d2 = {"Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;", "Landroid/os/Parcelable;", "clientSecret", "", "startingAfterAccountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getClientSecret$annotations", "()V", "getStartingAfterAccountId$annotations", "toParamMap", "", "", "component1", "component2", "copy", "describeContents", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "Companion", "$serializer", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class GetFinancialConnectionsAcccountsParams implements Parcelable {
    private static final String PARAM_CLIENT_SECRET = "client_secret";
    private static final String PARAM_STARTING_AFTER = "starting_after";
    private final String clientSecret;
    private final String startingAfterAccountId;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GetFinancialConnectionsAcccountsParams> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: GetFinancialConnectionsAcccountsParams.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GetFinancialConnectionsAcccountsParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetFinancialConnectionsAcccountsParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GetFinancialConnectionsAcccountsParams(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetFinancialConnectionsAcccountsParams[] newArray(int i) {
            return new GetFinancialConnectionsAcccountsParams[i];
        }
    }

    /* renamed from: component1, reason: from getter */
    private final String getClientSecret() {
        return this.clientSecret;
    }

    /* renamed from: component2, reason: from getter */
    private final String getStartingAfterAccountId() {
        return this.startingAfterAccountId;
    }

    public static /* synthetic */ GetFinancialConnectionsAcccountsParams copy$default(GetFinancialConnectionsAcccountsParams getFinancialConnectionsAcccountsParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getFinancialConnectionsAcccountsParams.clientSecret;
        }
        if ((i & 2) != 0) {
            str2 = getFinancialConnectionsAcccountsParams.startingAfterAccountId;
        }
        return getFinancialConnectionsAcccountsParams.copy(str, str2);
    }

    @SerialName("client_secret")
    private static /* synthetic */ void getClientSecret$annotations() {
    }

    @SerialName(PARAM_STARTING_AFTER)
    private static /* synthetic */ void getStartingAfterAccountId$annotations() {
    }

    public final GetFinancialConnectionsAcccountsParams copy(String clientSecret, String startingAfterAccountId) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        return new GetFinancialConnectionsAcccountsParams(clientSecret, startingAfterAccountId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetFinancialConnectionsAcccountsParams)) {
            return false;
        }
        GetFinancialConnectionsAcccountsParams getFinancialConnectionsAcccountsParams = (GetFinancialConnectionsAcccountsParams) other;
        return Intrinsics.areEqual(this.clientSecret, getFinancialConnectionsAcccountsParams.clientSecret) && Intrinsics.areEqual(this.startingAfterAccountId, getFinancialConnectionsAcccountsParams.startingAfterAccountId);
    }

    public int hashCode() {
        int iHashCode = this.clientSecret.hashCode() * 31;
        String str = this.startingAfterAccountId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "GetFinancialConnectionsAcccountsParams(clientSecret=" + this.clientSecret + ", startingAfterAccountId=" + this.startingAfterAccountId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.clientSecret);
        dest.writeString(this.startingAfterAccountId);
    }

    public /* synthetic */ GetFinancialConnectionsAcccountsParams(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, GetFinancialConnectionsAcccountsParams$$serializer.INSTANCE.getDescriptor());
        }
        this.clientSecret = str;
        this.startingAfterAccountId = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_release(GetFinancialConnectionsAcccountsParams self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.clientSecret);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.startingAfterAccountId);
    }

    public GetFinancialConnectionsAcccountsParams(String clientSecret, String str) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        this.startingAfterAccountId = str;
    }

    public final Map<String, Object> toParamMap() {
        List<Pair> listListOf = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("client_secret", this.clientSecret), TuplesKt.to(PARAM_STARTING_AFTER, this.startingAfterAccountId)});
        Map<String, Object> mapEmptyMap = MapsKt.emptyMap();
        for (Pair pair : listListOf) {
            String str = (String) pair.component1();
            String str2 = (String) pair.component2();
            Map mapMapOf = str2 != null ? MapsKt.mapOf(TuplesKt.to(str, str2)) : null;
            if (mapMapOf == null) {
                mapMapOf = MapsKt.emptyMap();
            }
            mapEmptyMap = MapsKt.plus(mapEmptyMap, mapMapOf);
        }
        return mapEmptyMap;
    }

    /* compiled from: GetFinancialConnectionsAcccountsParams.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams$Companion;", "", "<init>", "()V", "PARAM_CLIENT_SECRET", "", "PARAM_STARTING_AFTER", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetFinancialConnectionsAcccountsParams> serializer() {
            return GetFinancialConnectionsAcccountsParams$$serializer.INSTANCE;
        }
    }
}
