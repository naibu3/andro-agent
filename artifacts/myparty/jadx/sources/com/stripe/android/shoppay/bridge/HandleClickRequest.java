package com.stripe.android.shoppay.bridge;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.StripeModel;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HandleClickRequest.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/shoppay/bridge/HandleClickRequest;", "Lcom/stripe/android/core/model/StripeModel;", "eventData", "Lcom/stripe/android/shoppay/bridge/HandleClickRequest$EventData;", "<init>", "(Lcom/stripe/android/shoppay/bridge/HandleClickRequest$EventData;)V", "getEventData", "()Lcom/stripe/android/shoppay/bridge/HandleClickRequest$EventData;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "EventData", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class HandleClickRequest implements StripeModel {
    public static final int $stable = 0;
    public static final Parcelable.Creator<HandleClickRequest> CREATOR = new Creator();
    private final EventData eventData;

    /* compiled from: HandleClickRequest.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HandleClickRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HandleClickRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HandleClickRequest(EventData.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HandleClickRequest[] newArray(int i) {
            return new HandleClickRequest[i];
        }
    }

    public static /* synthetic */ HandleClickRequest copy$default(HandleClickRequest handleClickRequest, EventData eventData, int i, Object obj) {
        if ((i & 1) != 0) {
            eventData = handleClickRequest.eventData;
        }
        return handleClickRequest.copy(eventData);
    }

    /* renamed from: component1, reason: from getter */
    public final EventData getEventData() {
        return this.eventData;
    }

    public final HandleClickRequest copy(EventData eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        return new HandleClickRequest(eventData);
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
        return (other instanceof HandleClickRequest) && Intrinsics.areEqual(this.eventData, ((HandleClickRequest) other).eventData);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return this.eventData.hashCode();
    }

    public String toString() {
        return "HandleClickRequest(eventData=" + this.eventData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.eventData.writeToParcel(dest, flags);
    }

    public HandleClickRequest(EventData eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.eventData = eventData;
    }

    public final EventData getEventData() {
        return this.eventData;
    }

    /* compiled from: HandleClickRequest.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/shoppay/bridge/HandleClickRequest$EventData;", "Lcom/stripe/android/core/model/StripeModel;", "expressPaymentType", "", "<init>", "(Ljava/lang/String;)V", "getExpressPaymentType", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EventData implements StripeModel {
        private final String expressPaymentType;
        public static final Parcelable.Creator<EventData> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: HandleClickRequest.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<EventData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EventData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EventData(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EventData[] newArray(int i) {
                return new EventData[i];
            }
        }

        public static /* synthetic */ EventData copy$default(EventData eventData, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = eventData.expressPaymentType;
            }
            return eventData.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getExpressPaymentType() {
            return this.expressPaymentType;
        }

        public final EventData copy(String expressPaymentType) {
            Intrinsics.checkNotNullParameter(expressPaymentType, "expressPaymentType");
            return new EventData(expressPaymentType);
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
            return (other instanceof EventData) && Intrinsics.areEqual(this.expressPaymentType, ((EventData) other).expressPaymentType);
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            return this.expressPaymentType.hashCode();
        }

        public String toString() {
            return "EventData(expressPaymentType=" + this.expressPaymentType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.expressPaymentType);
        }

        public EventData(String expressPaymentType) {
            Intrinsics.checkNotNullParameter(expressPaymentType, "expressPaymentType");
            this.expressPaymentType = expressPaymentType;
        }

        public final String getExpressPaymentType() {
            return this.expressPaymentType;
        }
    }
}
