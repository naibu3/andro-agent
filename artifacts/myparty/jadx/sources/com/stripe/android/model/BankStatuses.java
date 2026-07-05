package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.view.Bank;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BankStatuses.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÂ\u0003J$\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÀ\u0001¢\u0006\u0002\b\u0011J\u0006\u0010\u0012\u001a\u00020\tJ\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\tHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\tR\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/BankStatuses;", "Lcom/stripe/android/core/model/StripeModel;", "statuses", "", "", "", "<init>", "(Ljava/util/Map;)V", "size", "", "size$payments_core_release", "isOnline", "bank", "Lcom/stripe/android/view/Bank;", "isOnline$payments_core_release", "component1", "copy", "copy$payments_core_release", "describeContents", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BankStatuses implements StripeModel {
    private final Map<String, Boolean> statuses;
    public static final Parcelable.Creator<BankStatuses> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: BankStatuses.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BankStatuses> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankStatuses createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
            }
            return new BankStatuses(linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankStatuses[] newArray(int i) {
            return new BankStatuses[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BankStatuses() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final Map<String, Boolean> component1() {
        return this.statuses;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BankStatuses copy$payments_core_release$default(BankStatuses bankStatuses, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = bankStatuses.statuses;
        }
        return bankStatuses.copy$payments_core_release(map);
    }

    public final BankStatuses copy$payments_core_release(Map<String, Boolean> statuses) {
        Intrinsics.checkNotNullParameter(statuses, "statuses");
        return new BankStatuses(statuses);
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
        return (other instanceof BankStatuses) && Intrinsics.areEqual(this.statuses, ((BankStatuses) other).statuses);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return this.statuses.hashCode();
    }

    public String toString() {
        return "BankStatuses(statuses=" + this.statuses + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Map<String, Boolean> map = this.statuses;
        dest.writeInt(map.size());
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeInt(entry.getValue().booleanValue() ? 1 : 0);
        }
    }

    public BankStatuses(Map<String, Boolean> statuses) {
        Intrinsics.checkNotNullParameter(statuses, "statuses");
        this.statuses = statuses;
    }

    public /* synthetic */ BankStatuses(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map);
    }

    public final int size$payments_core_release() {
        return this.statuses.size();
    }

    public final /* synthetic */ boolean isOnline$payments_core_release(Bank bank) {
        Intrinsics.checkNotNullParameter(bank, "bank");
        Boolean bool = this.statuses.get(bank.getId());
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
