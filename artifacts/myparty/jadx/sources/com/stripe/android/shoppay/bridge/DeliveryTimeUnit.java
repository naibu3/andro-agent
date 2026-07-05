package com.stripe.android.shoppay.bridge;

import android.os.Parcel;
import android.os.Parcelable;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ECETypes.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "HOUR", "DAY", "BUSINESS_DAY", "WEEK", "MONTH", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeliveryTimeUnit implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeliveryTimeUnit[] $VALUES;
    public static final Parcelable.Creator<DeliveryTimeUnit> CREATOR;
    public static final DeliveryTimeUnit HOUR = new DeliveryTimeUnit("HOUR", 0);
    public static final DeliveryTimeUnit DAY = new DeliveryTimeUnit("DAY", 1);
    public static final DeliveryTimeUnit BUSINESS_DAY = new DeliveryTimeUnit("BUSINESS_DAY", 2);
    public static final DeliveryTimeUnit WEEK = new DeliveryTimeUnit("WEEK", 3);
    public static final DeliveryTimeUnit MONTH = new DeliveryTimeUnit("MONTH", 4);

    private static final /* synthetic */ DeliveryTimeUnit[] $values() {
        return new DeliveryTimeUnit[]{HOUR, DAY, BUSINESS_DAY, WEEK, MONTH};
    }

    public static EnumEntries<DeliveryTimeUnit> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }

    private DeliveryTimeUnit(String str, int i) {
    }

    static {
        DeliveryTimeUnit[] deliveryTimeUnitArr$values = $values();
        $VALUES = deliveryTimeUnitArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(deliveryTimeUnitArr$values);
        CREATOR = new Parcelable.Creator<DeliveryTimeUnit>() { // from class: com.stripe.android.shoppay.bridge.DeliveryTimeUnit.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeliveryTimeUnit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return DeliveryTimeUnit.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeliveryTimeUnit[] newArray(int i) {
                return new DeliveryTimeUnit[i];
            }
        };
    }

    public static DeliveryTimeUnit valueOf(String str) {
        return (DeliveryTimeUnit) Enum.valueOf(DeliveryTimeUnit.class, str);
    }

    public static DeliveryTimeUnit[] values() {
        return (DeliveryTimeUnit[]) $VALUES.clone();
    }
}
