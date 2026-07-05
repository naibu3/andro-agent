package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.networking.AnalyticsFields;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: ConsumerSessionLookup.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u00029:B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fBK\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010'\u001a\u00020\u000eJ\u0013\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u000eHÖ\u0001J\t\u0010,\u001a\u00020\u0007HÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u000eJ%\u00102\u001a\u00020.2\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0001¢\u0006\u0002\b8R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u001bR\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010 ¨\u0006;"}, d2 = {"Lcom/stripe/android/model/ConsumerSessionLookup;", "Lcom/stripe/android/core/model/StripeModel;", "exists", "", "consumerSession", "Lcom/stripe/android/model/ConsumerSession;", "errorMessage", "", "publishableKey", "displayablePaymentDetails", "Lcom/stripe/android/model/DisplayablePaymentDetails;", "<init>", "(ZLcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getExists$annotations", "()V", "getExists", "()Z", "getConsumerSession$annotations", "getConsumerSession", "()Lcom/stripe/android/model/ConsumerSession;", "getErrorMessage$annotations", "getErrorMessage", "()Ljava/lang/String;", "getPublishableKey$annotations", "getPublishableKey", "getDisplayablePaymentDetails$annotations", "getDisplayablePaymentDetails", "()Lcom/stripe/android/model/DisplayablePaymentDetails;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_model_release", "$serializer", "Companion", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class ConsumerSessionLookup implements StripeModel {
    private final ConsumerSession consumerSession;
    private final DisplayablePaymentDetails displayablePaymentDetails;
    private final String errorMessage;
    private final boolean exists;
    private final String publishableKey;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ConsumerSessionLookup> CREATOR = new Creator();

    /* compiled from: ConsumerSessionLookup.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ConsumerSessionLookup> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsumerSessionLookup createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConsumerSessionLookup(parcel.readInt() != 0, parcel.readInt() == 0 ? null : ConsumerSession.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? DisplayablePaymentDetails.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsumerSessionLookup[] newArray(int i) {
            return new ConsumerSessionLookup[i];
        }
    }

    public static /* synthetic */ ConsumerSessionLookup copy$default(ConsumerSessionLookup consumerSessionLookup, boolean z, ConsumerSession consumerSession, String str, String str2, DisplayablePaymentDetails displayablePaymentDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            z = consumerSessionLookup.exists;
        }
        if ((i & 2) != 0) {
            consumerSession = consumerSessionLookup.consumerSession;
        }
        if ((i & 4) != 0) {
            str = consumerSessionLookup.errorMessage;
        }
        if ((i & 8) != 0) {
            str2 = consumerSessionLookup.publishableKey;
        }
        if ((i & 16) != 0) {
            displayablePaymentDetails = consumerSessionLookup.displayablePaymentDetails;
        }
        DisplayablePaymentDetails displayablePaymentDetails2 = displayablePaymentDetails;
        String str3 = str;
        return consumerSessionLookup.copy(z, consumerSession, str3, str2, displayablePaymentDetails2);
    }

    @SerialName("consumer_session")
    public static /* synthetic */ void getConsumerSession$annotations() {
    }

    @SerialName("displayable_payment_details")
    public static /* synthetic */ void getDisplayablePaymentDetails$annotations() {
    }

    @SerialName("error_message")
    public static /* synthetic */ void getErrorMessage$annotations() {
    }

    @SerialName("exists")
    public static /* synthetic */ void getExists$annotations() {
    }

    @SerialName(AnalyticsFields.PUBLISHABLE_KEY)
    public static /* synthetic */ void getPublishableKey$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getExists() {
        return this.exists;
    }

    /* renamed from: component2, reason: from getter */
    public final ConsumerSession getConsumerSession() {
        return this.consumerSession;
    }

    /* renamed from: component3, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPublishableKey() {
        return this.publishableKey;
    }

    /* renamed from: component5, reason: from getter */
    public final DisplayablePaymentDetails getDisplayablePaymentDetails() {
        return this.displayablePaymentDetails;
    }

    public final ConsumerSessionLookup copy(boolean exists, ConsumerSession consumerSession, String errorMessage, String publishableKey, DisplayablePaymentDetails displayablePaymentDetails) {
        return new ConsumerSessionLookup(exists, consumerSession, errorMessage, publishableKey, displayablePaymentDetails);
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
        if (!(other instanceof ConsumerSessionLookup)) {
            return false;
        }
        ConsumerSessionLookup consumerSessionLookup = (ConsumerSessionLookup) other;
        return this.exists == consumerSessionLookup.exists && Intrinsics.areEqual(this.consumerSession, consumerSessionLookup.consumerSession) && Intrinsics.areEqual(this.errorMessage, consumerSessionLookup.errorMessage) && Intrinsics.areEqual(this.publishableKey, consumerSessionLookup.publishableKey) && Intrinsics.areEqual(this.displayablePaymentDetails, consumerSessionLookup.displayablePaymentDetails);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.exists) * 31;
        ConsumerSession consumerSession = this.consumerSession;
        int iHashCode2 = (iHashCode + (consumerSession == null ? 0 : consumerSession.hashCode())) * 31;
        String str = this.errorMessage;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.publishableKey;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DisplayablePaymentDetails displayablePaymentDetails = this.displayablePaymentDetails;
        return iHashCode4 + (displayablePaymentDetails != null ? displayablePaymentDetails.hashCode() : 0);
    }

    public String toString() {
        return "ConsumerSessionLookup(exists=" + this.exists + ", consumerSession=" + this.consumerSession + ", errorMessage=" + this.errorMessage + ", publishableKey=" + this.publishableKey + ", displayablePaymentDetails=" + this.displayablePaymentDetails + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.exists ? 1 : 0);
        ConsumerSession consumerSession = this.consumerSession;
        if (consumerSession == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            consumerSession.writeToParcel(dest, flags);
        }
        dest.writeString(this.errorMessage);
        dest.writeString(this.publishableKey);
        DisplayablePaymentDetails displayablePaymentDetails = this.displayablePaymentDetails;
        if (displayablePaymentDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            displayablePaymentDetails.writeToParcel(dest, flags);
        }
    }

    /* compiled from: ConsumerSessionLookup.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/ConsumerSessionLookup$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/model/ConsumerSessionLookup;", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ConsumerSessionLookup> serializer() {
            return ConsumerSessionLookup$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConsumerSessionLookup(int i, boolean z, ConsumerSession consumerSession, String str, String str2, DisplayablePaymentDetails displayablePaymentDetails, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, ConsumerSessionLookup$$serializer.INSTANCE.getDescriptor());
        }
        this.exists = z;
        if ((i & 2) == 0) {
            this.consumerSession = null;
        } else {
            this.consumerSession = consumerSession;
        }
        if ((i & 4) == 0) {
            this.errorMessage = null;
        } else {
            this.errorMessage = str;
        }
        if ((i & 8) == 0) {
            this.publishableKey = null;
        } else {
            this.publishableKey = str2;
        }
        if ((i & 16) == 0) {
            this.displayablePaymentDetails = null;
        } else {
            this.displayablePaymentDetails = displayablePaymentDetails;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_model_release(ConsumerSessionLookup self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.exists);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.consumerSession != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, ConsumerSession$$serializer.INSTANCE, self.consumerSession);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.errorMessage != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.errorMessage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.publishableKey != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.publishableKey);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.displayablePaymentDetails == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, DisplayablePaymentDetails$$serializer.INSTANCE, self.displayablePaymentDetails);
    }

    public ConsumerSessionLookup(boolean z, ConsumerSession consumerSession, String str, String str2, DisplayablePaymentDetails displayablePaymentDetails) {
        this.exists = z;
        this.consumerSession = consumerSession;
        this.errorMessage = str;
        this.publishableKey = str2;
        this.displayablePaymentDetails = displayablePaymentDetails;
    }

    public /* synthetic */ ConsumerSessionLookup(boolean z, ConsumerSession consumerSession, String str, String str2, DisplayablePaymentDetails displayablePaymentDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : consumerSession, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : displayablePaymentDetails);
    }

    public final boolean getExists() {
        return this.exists;
    }

    public final ConsumerSession getConsumerSession() {
        return this.consumerSession;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getPublishableKey() {
        return this.publishableKey;
    }

    public final DisplayablePaymentDetails getDisplayablePaymentDetails() {
        return this.displayablePaymentDetails;
    }
}
