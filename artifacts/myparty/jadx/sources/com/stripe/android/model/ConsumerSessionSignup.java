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

/* compiled from: ConsumerSessionSignup.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002*+B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\tJ\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\tJ%\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0001¢\u0006\u0002\b)R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006,"}, d2 = {"Lcom/stripe/android/model/ConsumerSessionSignup;", "Lcom/stripe/android/core/model/StripeModel;", "consumerSession", "Lcom/stripe/android/model/ConsumerSession;", "publishableKey", "", "<init>", "(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getConsumerSession$annotations", "()V", "getConsumerSession", "()Lcom/stripe/android/model/ConsumerSession;", "getPublishableKey$annotations", "getPublishableKey", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_model_release", "$serializer", "Companion", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class ConsumerSessionSignup implements StripeModel {
    private final ConsumerSession consumerSession;
    private final String publishableKey;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ConsumerSessionSignup> CREATOR = new Creator();

    /* compiled from: ConsumerSessionSignup.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ConsumerSessionSignup> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsumerSessionSignup createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConsumerSessionSignup(ConsumerSession.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsumerSessionSignup[] newArray(int i) {
            return new ConsumerSessionSignup[i];
        }
    }

    public static /* synthetic */ ConsumerSessionSignup copy$default(ConsumerSessionSignup consumerSessionSignup, ConsumerSession consumerSession, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            consumerSession = consumerSessionSignup.consumerSession;
        }
        if ((i & 2) != 0) {
            str = consumerSessionSignup.publishableKey;
        }
        return consumerSessionSignup.copy(consumerSession, str);
    }

    @SerialName("consumer_session")
    public static /* synthetic */ void getConsumerSession$annotations() {
    }

    @SerialName(AnalyticsFields.PUBLISHABLE_KEY)
    public static /* synthetic */ void getPublishableKey$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final ConsumerSession getConsumerSession() {
        return this.consumerSession;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPublishableKey() {
        return this.publishableKey;
    }

    public final ConsumerSessionSignup copy(ConsumerSession consumerSession, String publishableKey) {
        Intrinsics.checkNotNullParameter(consumerSession, "consumerSession");
        return new ConsumerSessionSignup(consumerSession, publishableKey);
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
        if (!(other instanceof ConsumerSessionSignup)) {
            return false;
        }
        ConsumerSessionSignup consumerSessionSignup = (ConsumerSessionSignup) other;
        return Intrinsics.areEqual(this.consumerSession, consumerSessionSignup.consumerSession) && Intrinsics.areEqual(this.publishableKey, consumerSessionSignup.publishableKey);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int iHashCode = this.consumerSession.hashCode() * 31;
        String str = this.publishableKey;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ConsumerSessionSignup(consumerSession=" + this.consumerSession + ", publishableKey=" + this.publishableKey + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.consumerSession.writeToParcel(dest, flags);
        dest.writeString(this.publishableKey);
    }

    /* compiled from: ConsumerSessionSignup.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/ConsumerSessionSignup$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/model/ConsumerSessionSignup;", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ConsumerSessionSignup> serializer() {
            return ConsumerSessionSignup$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConsumerSessionSignup(int i, ConsumerSession consumerSession, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, ConsumerSessionSignup$$serializer.INSTANCE.getDescriptor());
        }
        this.consumerSession = consumerSession;
        if ((i & 2) == 0) {
            this.publishableKey = null;
        } else {
            this.publishableKey = str;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_model_release(ConsumerSessionSignup self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, ConsumerSession$$serializer.INSTANCE, self.consumerSession);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.publishableKey == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.publishableKey);
    }

    public ConsumerSessionSignup(ConsumerSession consumerSession, String str) {
        Intrinsics.checkNotNullParameter(consumerSession, "consumerSession");
        this.consumerSession = consumerSession;
        this.publishableKey = str;
    }

    public /* synthetic */ ConsumerSessionSignup(ConsumerSession consumerSession, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(consumerSession, (i & 2) != 0 ? null : str);
    }

    public final ConsumerSession getConsumerSession() {
        return this.consumerSession;
    }

    public final String getPublishableKey() {
        return this.publishableKey;
    }
}
