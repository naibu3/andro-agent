package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.StripeModel;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdateAvailableIncentives.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/model/UpdateAvailableIncentives;", "Lcom/stripe/android/core/model/StripeModel;", "data", "", "Lcom/stripe/android/model/LinkConsumerIncentive;", "<init>", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UpdateAvailableIncentives implements StripeModel {
    public static final Parcelable.Creator<UpdateAvailableIncentives> CREATOR = new Creator();
    private final List<LinkConsumerIncentive> data;

    /* compiled from: UpdateAvailableIncentives.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UpdateAvailableIncentives> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpdateAvailableIncentives createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(LinkConsumerIncentive.CREATOR.createFromParcel(parcel));
            }
            return new UpdateAvailableIncentives(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpdateAvailableIncentives[] newArray(int i) {
            return new UpdateAvailableIncentives[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateAvailableIncentives copy$default(UpdateAvailableIncentives updateAvailableIncentives, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = updateAvailableIncentives.data;
        }
        return updateAvailableIncentives.copy(list);
    }

    public final List<LinkConsumerIncentive> component1() {
        return this.data;
    }

    public final UpdateAvailableIncentives copy(List<LinkConsumerIncentive> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new UpdateAvailableIncentives(data);
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
        return (other instanceof UpdateAvailableIncentives) && Intrinsics.areEqual(this.data, ((UpdateAvailableIncentives) other).data);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "UpdateAvailableIncentives(data=" + this.data + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<LinkConsumerIncentive> list = this.data;
        dest.writeInt(list.size());
        Iterator<LinkConsumerIncentive> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public UpdateAvailableIncentives(List<LinkConsumerIncentive> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public final List<LinkConsumerIncentive> getData() {
        return this.data;
    }
}
