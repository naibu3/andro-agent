package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.StripeModel;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

/* compiled from: FinancialConnectionsAccountList.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0002<=B=\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBQ\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0012J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJJ\u0010(\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010)J\u0006\u0010*\u001a\u00020\u000bJ\u0013\u0010+\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\u000bHÖ\u0001J\t\u0010/\u001a\u00020\tHÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u000bJ%\u00105\u001a\u0002012\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0001¢\u0006\u0002\b;R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u001cR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010 \u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u001fR \u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010 \u0012\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u001f¨\u0006>"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;", "Lcom/stripe/android/core/model/StripeModel;", "Landroid/os/Parcelable;", "data", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;", "hasMore", "", "url", "", NewHtcHomeBadger.COUNT, "", "totalCount", "<init>", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getData$annotations", "()V", "getData", "()Ljava/util/List;", "getHasMore$annotations", "getHasMore", "()Z", "getUrl$annotations", "getUrl", "()Ljava/lang/String;", "getCount$annotations", "getCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalCount$annotations", "getTotalCount", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;", "describeContents", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_core_release", "$serializer", "Companion", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class FinancialConnectionsAccountList implements StripeModel, Parcelable {
    private final Integer count;
    private final List<FinancialConnectionsAccount> data;
    private final boolean hasMore;
    private final Integer totalCount;
    private final String url;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<FinancialConnectionsAccountList> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(FinancialConnectionsAccount$$serializer.INSTANCE), null, null, null, null};

    /* compiled from: FinancialConnectionsAccountList.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FinancialConnectionsAccountList> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsAccountList createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(FinancialConnectionsAccount.CREATOR.createFromParcel(parcel));
            }
            return new FinancialConnectionsAccountList(arrayList, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsAccountList[] newArray(int i) {
            return new FinancialConnectionsAccountList[i];
        }
    }

    public static /* synthetic */ FinancialConnectionsAccountList copy$default(FinancialConnectionsAccountList financialConnectionsAccountList, List list, boolean z, String str, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = financialConnectionsAccountList.data;
        }
        if ((i & 2) != 0) {
            z = financialConnectionsAccountList.hasMore;
        }
        if ((i & 4) != 0) {
            str = financialConnectionsAccountList.url;
        }
        if ((i & 8) != 0) {
            num = financialConnectionsAccountList.count;
        }
        if ((i & 16) != 0) {
            num2 = financialConnectionsAccountList.totalCount;
        }
        Integer num3 = num2;
        String str2 = str;
        return financialConnectionsAccountList.copy(list, z, str2, num, num3);
    }

    @SerialName(NewHtcHomeBadger.COUNT)
    public static /* synthetic */ void getCount$annotations() {
    }

    @SerialName("data")
    public static /* synthetic */ void getData$annotations() {
    }

    @SerialName("has_more")
    public static /* synthetic */ void getHasMore$annotations() {
    }

    @SerialName("total_count")
    public static /* synthetic */ void getTotalCount$annotations() {
    }

    @SerialName("url")
    public static /* synthetic */ void getUrl$annotations() {
    }

    public final List<FinancialConnectionsAccount> component1() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public final FinancialConnectionsAccountList copy(List<FinancialConnectionsAccount> data, boolean hasMore, String url, Integer count, Integer totalCount) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(url, "url");
        return new FinancialConnectionsAccountList(data, hasMore, url, count, totalCount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsAccountList)) {
            return false;
        }
        FinancialConnectionsAccountList financialConnectionsAccountList = (FinancialConnectionsAccountList) other;
        return Intrinsics.areEqual(this.data, financialConnectionsAccountList.data) && this.hasMore == financialConnectionsAccountList.hasMore && Intrinsics.areEqual(this.url, financialConnectionsAccountList.url) && Intrinsics.areEqual(this.count, financialConnectionsAccountList.count) && Intrinsics.areEqual(this.totalCount, financialConnectionsAccountList.totalCount);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int iHashCode = ((((this.data.hashCode() * 31) + Boolean.hashCode(this.hasMore)) * 31) + this.url.hashCode()) * 31;
        Integer num = this.count;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalCount;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "FinancialConnectionsAccountList(data=" + this.data + ", hasMore=" + this.hasMore + ", url=" + this.url + ", count=" + this.count + ", totalCount=" + this.totalCount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<FinancialConnectionsAccount> list = this.data;
        dest.writeInt(list.size());
        Iterator<FinancialConnectionsAccount> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeInt(this.hasMore ? 1 : 0);
        dest.writeString(this.url);
        Integer num = this.count;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.totalCount;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
    }

    /* compiled from: FinancialConnectionsAccountList.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FinancialConnectionsAccountList> serializer() {
            return FinancialConnectionsAccountList$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FinancialConnectionsAccountList(int i, List list, boolean z, String str, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, FinancialConnectionsAccountList$$serializer.INSTANCE.getDescriptor());
        }
        this.data = list;
        this.hasMore = z;
        this.url = str;
        if ((i & 8) == 0) {
            this.count = null;
        } else {
            this.count = num;
        }
        if ((i & 16) == 0) {
            this.totalCount = null;
        } else {
            this.totalCount = num2;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_core_release(FinancialConnectionsAccountList self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0], self.data);
        output.encodeBooleanElement(serialDesc, 1, self.hasMore);
        output.encodeStringElement(serialDesc, 2, self.url);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.count != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, IntSerializer.INSTANCE, self.count);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.totalCount == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, IntSerializer.INSTANCE, self.totalCount);
    }

    public FinancialConnectionsAccountList(List<FinancialConnectionsAccount> data, boolean z, String url, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(url, "url");
        this.data = data;
        this.hasMore = z;
        this.url = url;
        this.count = num;
        this.totalCount = num2;
    }

    public /* synthetic */ FinancialConnectionsAccountList(List list, boolean z, String str, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, z, str, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2);
    }

    public final List<FinancialConnectionsAccount> getData() {
        return this.data;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Integer getCount() {
        return this.count;
    }

    public final Integer getTotalCount() {
        return this.totalCount;
    }
}
