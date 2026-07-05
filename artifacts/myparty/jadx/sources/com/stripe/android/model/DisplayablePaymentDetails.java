package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.StripeModel;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: ConsumerSessionLookup.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000245B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J>\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010 J\u0006\u0010!\u001a\u00020\u000bJ\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u000bHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u000bJ%\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0001¢\u0006\u0002\b3R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001a\u0012\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019¨\u00066"}, d2 = {"Lcom/stripe/android/model/DisplayablePaymentDetails;", "Lcom/stripe/android/core/model/StripeModel;", "defaultCardBrand", "", "defaultPaymentType", "last4", "numberOfSavedPaymentDetails", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDefaultCardBrand$annotations", "()V", "getDefaultCardBrand", "()Ljava/lang/String;", "getDefaultPaymentType$annotations", "getDefaultPaymentType", "getLast4$annotations", "getLast4", "getNumberOfSavedPaymentDetails$annotations", "getNumberOfSavedPaymentDetails", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/stripe/android/model/DisplayablePaymentDetails;", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_model_release", "$serializer", "Companion", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class DisplayablePaymentDetails implements StripeModel {
    private final String defaultCardBrand;
    private final String defaultPaymentType;
    private final String last4;
    private final Long numberOfSavedPaymentDetails;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<DisplayablePaymentDetails> CREATOR = new Creator();

    /* compiled from: ConsumerSessionLookup.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DisplayablePaymentDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DisplayablePaymentDetails createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DisplayablePaymentDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DisplayablePaymentDetails[] newArray(int i) {
            return new DisplayablePaymentDetails[i];
        }
    }

    public DisplayablePaymentDetails() {
        this((String) null, (String) null, (String) null, (Long) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ DisplayablePaymentDetails copy$default(DisplayablePaymentDetails displayablePaymentDetails, String str, String str2, String str3, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = displayablePaymentDetails.defaultCardBrand;
        }
        if ((i & 2) != 0) {
            str2 = displayablePaymentDetails.defaultPaymentType;
        }
        if ((i & 4) != 0) {
            str3 = displayablePaymentDetails.last4;
        }
        if ((i & 8) != 0) {
            l = displayablePaymentDetails.numberOfSavedPaymentDetails;
        }
        return displayablePaymentDetails.copy(str, str2, str3, l);
    }

    @SerialName("default_card_brand")
    public static /* synthetic */ void getDefaultCardBrand$annotations() {
    }

    @SerialName("default_payment_type")
    public static /* synthetic */ void getDefaultPaymentType$annotations() {
    }

    @SerialName("last_4")
    public static /* synthetic */ void getLast4$annotations() {
    }

    @SerialName("number_of_saved_payment_details")
    public static /* synthetic */ void getNumberOfSavedPaymentDetails$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getDefaultCardBrand() {
        return this.defaultCardBrand;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDefaultPaymentType() {
        return this.defaultPaymentType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLast4() {
        return this.last4;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getNumberOfSavedPaymentDetails() {
        return this.numberOfSavedPaymentDetails;
    }

    public final DisplayablePaymentDetails copy(String defaultCardBrand, String defaultPaymentType, String last4, Long numberOfSavedPaymentDetails) {
        return new DisplayablePaymentDetails(defaultCardBrand, defaultPaymentType, last4, numberOfSavedPaymentDetails);
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
        if (!(other instanceof DisplayablePaymentDetails)) {
            return false;
        }
        DisplayablePaymentDetails displayablePaymentDetails = (DisplayablePaymentDetails) other;
        return Intrinsics.areEqual(this.defaultCardBrand, displayablePaymentDetails.defaultCardBrand) && Intrinsics.areEqual(this.defaultPaymentType, displayablePaymentDetails.defaultPaymentType) && Intrinsics.areEqual(this.last4, displayablePaymentDetails.last4) && Intrinsics.areEqual(this.numberOfSavedPaymentDetails, displayablePaymentDetails.numberOfSavedPaymentDetails);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        String str = this.defaultCardBrand;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.defaultPaymentType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.last4;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.numberOfSavedPaymentDetails;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "DisplayablePaymentDetails(defaultCardBrand=" + this.defaultCardBrand + ", defaultPaymentType=" + this.defaultPaymentType + ", last4=" + this.last4 + ", numberOfSavedPaymentDetails=" + this.numberOfSavedPaymentDetails + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.defaultCardBrand);
        dest.writeString(this.defaultPaymentType);
        dest.writeString(this.last4);
        Long l = this.numberOfSavedPaymentDetails;
        if (l == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l.longValue());
        }
    }

    /* compiled from: ConsumerSessionLookup.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/DisplayablePaymentDetails$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/model/DisplayablePaymentDetails;", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DisplayablePaymentDetails> serializer() {
            return DisplayablePaymentDetails$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DisplayablePaymentDetails(int i, String str, String str2, String str3, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.defaultCardBrand = null;
        } else {
            this.defaultCardBrand = str;
        }
        if ((i & 2) == 0) {
            this.defaultPaymentType = null;
        } else {
            this.defaultPaymentType = str2;
        }
        if ((i & 4) == 0) {
            this.last4 = null;
        } else {
            this.last4 = str3;
        }
        if ((i & 8) == 0) {
            this.numberOfSavedPaymentDetails = null;
        } else {
            this.numberOfSavedPaymentDetails = l;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_model_release(DisplayablePaymentDetails self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.defaultCardBrand != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.defaultCardBrand);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.defaultPaymentType != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.defaultPaymentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.last4 != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.last4);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.numberOfSavedPaymentDetails == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, LongSerializer.INSTANCE, self.numberOfSavedPaymentDetails);
    }

    public DisplayablePaymentDetails(String str, String str2, String str3, Long l) {
        this.defaultCardBrand = str;
        this.defaultPaymentType = str2;
        this.last4 = str3;
        this.numberOfSavedPaymentDetails = l;
    }

    public /* synthetic */ DisplayablePaymentDetails(String str, String str2, String str3, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l);
    }

    public final String getDefaultCardBrand() {
        return this.defaultCardBrand;
    }

    public final String getDefaultPaymentType() {
        return this.defaultPaymentType;
    }

    public final String getLast4() {
        return this.last4;
    }

    public final Long getNumberOfSavedPaymentDetails() {
        return this.numberOfSavedPaymentDetails;
    }
}
