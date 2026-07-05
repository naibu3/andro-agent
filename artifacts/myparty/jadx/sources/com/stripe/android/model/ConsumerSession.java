package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.core.model.StripeModel;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: ConsumerSession.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0003?@ABQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rBg\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JY\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0006\u0010,\u001a\u00020\u000fJ\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\u000fHÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u000fJ%\u00108\u001a\u0002042\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0001¢\u0006\u0002\b>R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016R\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010#¨\u0006B"}, d2 = {"Lcom/stripe/android/model/ConsumerSession;", "Lcom/stripe/android/core/model/StripeModel;", "clientSecret", "", HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "redactedFormattedPhoneNumber", "redactedPhoneNumber", "unredactedPhoneNumber", "phoneNumberCountry", "verificationSessions", "", "Lcom/stripe/android/model/ConsumerSession$VerificationSession;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getClientSecret$annotations", "()V", "getClientSecret", "()Ljava/lang/String;", "getEmailAddress$annotations", "getEmailAddress", "getRedactedFormattedPhoneNumber$annotations", "getRedactedFormattedPhoneNumber", "getRedactedPhoneNumber$annotations", "getRedactedPhoneNumber", "getUnredactedPhoneNumber$annotations", "getUnredactedPhoneNumber", "getPhoneNumberCountry$annotations", "getPhoneNumberCountry", "getVerificationSessions$annotations", "getVerificationSessions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_model_release", "VerificationSession", "$serializer", "Companion", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class ConsumerSession implements StripeModel {
    private final String clientSecret;
    private final String emailAddress;
    private final String phoneNumberCountry;
    private final String redactedFormattedPhoneNumber;
    private final String redactedPhoneNumber;
    private final String unredactedPhoneNumber;
    private final List<VerificationSession> verificationSessions;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ConsumerSession> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(ConsumerSession$VerificationSession$$serializer.INSTANCE)};

    /* compiled from: ConsumerSession.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ConsumerSession> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsumerSession createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(VerificationSession.CREATOR.createFromParcel(parcel));
            }
            return new ConsumerSession(string, string2, string3, string4, string5, string6, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsumerSession[] newArray(int i) {
            return new ConsumerSession[i];
        }
    }

    public static /* synthetic */ ConsumerSession copy$default(ConsumerSession consumerSession, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = consumerSession.clientSecret;
        }
        if ((i & 2) != 0) {
            str2 = consumerSession.emailAddress;
        }
        if ((i & 4) != 0) {
            str3 = consumerSession.redactedFormattedPhoneNumber;
        }
        if ((i & 8) != 0) {
            str4 = consumerSession.redactedPhoneNumber;
        }
        if ((i & 16) != 0) {
            str5 = consumerSession.unredactedPhoneNumber;
        }
        if ((i & 32) != 0) {
            str6 = consumerSession.phoneNumberCountry;
        }
        if ((i & 64) != 0) {
            list = consumerSession.verificationSessions;
        }
        String str7 = str6;
        List list2 = list;
        String str8 = str5;
        String str9 = str3;
        return consumerSession.copy(str, str2, str9, str4, str8, str7, list2);
    }

    @SerialName("client_secret")
    public static /* synthetic */ void getClientSecret$annotations() {
    }

    @SerialName("email_address")
    public static /* synthetic */ void getEmailAddress$annotations() {
    }

    @SerialName("phone_number_country")
    public static /* synthetic */ void getPhoneNumberCountry$annotations() {
    }

    @SerialName("redacted_formatted_phone_number")
    public static /* synthetic */ void getRedactedFormattedPhoneNumber$annotations() {
    }

    @SerialName("redacted_phone_number")
    public static /* synthetic */ void getRedactedPhoneNumber$annotations() {
    }

    @SerialName("unredacted_phone_number")
    public static /* synthetic */ void getUnredactedPhoneNumber$annotations() {
    }

    @SerialName("verification_sessions")
    public static /* synthetic */ void getVerificationSessions$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getClientSecret() {
        return this.clientSecret;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRedactedFormattedPhoneNumber() {
        return this.redactedFormattedPhoneNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRedactedPhoneNumber() {
        return this.redactedPhoneNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUnredactedPhoneNumber() {
        return this.unredactedPhoneNumber;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPhoneNumberCountry() {
        return this.phoneNumberCountry;
    }

    public final List<VerificationSession> component7() {
        return this.verificationSessions;
    }

    public final ConsumerSession copy(String clientSecret, String emailAddress, String redactedFormattedPhoneNumber, String redactedPhoneNumber, String unredactedPhoneNumber, String phoneNumberCountry, List<VerificationSession> verificationSessions) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(emailAddress, "emailAddress");
        Intrinsics.checkNotNullParameter(redactedFormattedPhoneNumber, "redactedFormattedPhoneNumber");
        Intrinsics.checkNotNullParameter(redactedPhoneNumber, "redactedPhoneNumber");
        Intrinsics.checkNotNullParameter(verificationSessions, "verificationSessions");
        return new ConsumerSession(clientSecret, emailAddress, redactedFormattedPhoneNumber, redactedPhoneNumber, unredactedPhoneNumber, phoneNumberCountry, verificationSessions);
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
        if (!(other instanceof ConsumerSession)) {
            return false;
        }
        ConsumerSession consumerSession = (ConsumerSession) other;
        return Intrinsics.areEqual(this.clientSecret, consumerSession.clientSecret) && Intrinsics.areEqual(this.emailAddress, consumerSession.emailAddress) && Intrinsics.areEqual(this.redactedFormattedPhoneNumber, consumerSession.redactedFormattedPhoneNumber) && Intrinsics.areEqual(this.redactedPhoneNumber, consumerSession.redactedPhoneNumber) && Intrinsics.areEqual(this.unredactedPhoneNumber, consumerSession.unredactedPhoneNumber) && Intrinsics.areEqual(this.phoneNumberCountry, consumerSession.phoneNumberCountry) && Intrinsics.areEqual(this.verificationSessions, consumerSession.verificationSessions);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int iHashCode = ((((((this.clientSecret.hashCode() * 31) + this.emailAddress.hashCode()) * 31) + this.redactedFormattedPhoneNumber.hashCode()) * 31) + this.redactedPhoneNumber.hashCode()) * 31;
        String str = this.unredactedPhoneNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phoneNumberCountry;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.verificationSessions.hashCode();
    }

    public String toString() {
        return "ConsumerSession(clientSecret=" + this.clientSecret + ", emailAddress=" + this.emailAddress + ", redactedFormattedPhoneNumber=" + this.redactedFormattedPhoneNumber + ", redactedPhoneNumber=" + this.redactedPhoneNumber + ", unredactedPhoneNumber=" + this.unredactedPhoneNumber + ", phoneNumberCountry=" + this.phoneNumberCountry + ", verificationSessions=" + this.verificationSessions + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.clientSecret);
        dest.writeString(this.emailAddress);
        dest.writeString(this.redactedFormattedPhoneNumber);
        dest.writeString(this.redactedPhoneNumber);
        dest.writeString(this.unredactedPhoneNumber);
        dest.writeString(this.phoneNumberCountry);
        List<VerificationSession> list = this.verificationSessions;
        dest.writeInt(list.size());
        Iterator<VerificationSession> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    /* compiled from: ConsumerSession.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/ConsumerSession$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/model/ConsumerSession;", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ConsumerSession> serializer() {
            return ConsumerSession$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConsumerSession(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (14 != (i & 14)) {
            PluginExceptionsKt.throwMissingFieldException(i, 14, ConsumerSession$$serializer.INSTANCE.getDescriptor());
        }
        this.clientSecret = (i & 1) == 0 ? "" : str;
        this.emailAddress = str2;
        this.redactedFormattedPhoneNumber = str3;
        this.redactedPhoneNumber = str4;
        if ((i & 16) == 0) {
            this.unredactedPhoneNumber = null;
        } else {
            this.unredactedPhoneNumber = str5;
        }
        if ((i & 32) == 0) {
            this.phoneNumberCountry = null;
        } else {
            this.phoneNumberCountry = str6;
        }
        if ((i & 64) == 0) {
            this.verificationSessions = CollectionsKt.emptyList();
        } else {
            this.verificationSessions = list;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_model_release(ConsumerSession self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.clientSecret, "")) {
            output.encodeStringElement(serialDesc, 0, self.clientSecret);
        }
        output.encodeStringElement(serialDesc, 1, self.emailAddress);
        output.encodeStringElement(serialDesc, 2, self.redactedFormattedPhoneNumber);
        output.encodeStringElement(serialDesc, 3, self.redactedPhoneNumber);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.unredactedPhoneNumber != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.unredactedPhoneNumber);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.phoneNumberCountry != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.phoneNumberCountry);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && Intrinsics.areEqual(self.verificationSessions, CollectionsKt.emptyList())) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 6, kSerializerArr[6], self.verificationSessions);
    }

    public ConsumerSession(String clientSecret, String emailAddress, String redactedFormattedPhoneNumber, String redactedPhoneNumber, String str, String str2, List<VerificationSession> verificationSessions) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(emailAddress, "emailAddress");
        Intrinsics.checkNotNullParameter(redactedFormattedPhoneNumber, "redactedFormattedPhoneNumber");
        Intrinsics.checkNotNullParameter(redactedPhoneNumber, "redactedPhoneNumber");
        Intrinsics.checkNotNullParameter(verificationSessions, "verificationSessions");
        this.clientSecret = clientSecret;
        this.emailAddress = emailAddress;
        this.redactedFormattedPhoneNumber = redactedFormattedPhoneNumber;
        this.redactedPhoneNumber = redactedPhoneNumber;
        this.unredactedPhoneNumber = str;
        this.phoneNumberCountry = str2;
        this.verificationSessions = verificationSessions;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public /* synthetic */ ConsumerSession(String str, String str2, String str3, String str4, String str5, String str6, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final String getEmailAddress() {
        return this.emailAddress;
    }

    public final String getRedactedFormattedPhoneNumber() {
        return this.redactedFormattedPhoneNumber;
    }

    public final String getRedactedPhoneNumber() {
        return this.redactedPhoneNumber;
    }

    public final String getUnredactedPhoneNumber() {
        return this.unredactedPhoneNumber;
    }

    public final String getPhoneNumberCountry() {
        return this.phoneNumberCountry;
    }

    public final List<VerificationSession> getVerificationSessions() {
        return this.verificationSessions;
    }

    /* compiled from: ConsumerSession.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0004()*+B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\tJ\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\tJ%\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006,"}, d2 = {"Lcom/stripe/android/model/ConsumerSession$VerificationSession;", "Lcom/stripe/android/core/model/StripeModel;", "type", "Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;", "<init>", "(Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType", "()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;", "getState", "()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_model_release", "SessionType", "SessionState", "$serializer", "Companion", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final /* data */ class VerificationSession implements StripeModel {
        private final SessionState state;
        private final SessionType type;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<VerificationSession> CREATOR = new Creator();
        private static final KSerializer<Object>[] $childSerializers = {EnumsKt.createSimpleEnumSerializer("com.stripe.android.model.ConsumerSession.VerificationSession.SessionType", SessionType.values()), EnumsKt.createSimpleEnumSerializer("com.stripe.android.model.ConsumerSession.VerificationSession.SessionState", SessionState.values())};

        /* compiled from: ConsumerSession.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<VerificationSession> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerificationSession createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VerificationSession(SessionType.CREATOR.createFromParcel(parcel), SessionState.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerificationSession[] newArray(int i) {
                return new VerificationSession[i];
            }
        }

        public static /* synthetic */ VerificationSession copy$default(VerificationSession verificationSession, SessionType sessionType, SessionState sessionState, int i, Object obj) {
            if ((i & 1) != 0) {
                sessionType = verificationSession.type;
            }
            if ((i & 2) != 0) {
                sessionState = verificationSession.state;
            }
            return verificationSession.copy(sessionType, sessionState);
        }

        /* renamed from: component1, reason: from getter */
        public final SessionType getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final SessionState getState() {
            return this.state;
        }

        public final VerificationSession copy(SessionType type, SessionState state) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(state, "state");
            return new VerificationSession(type, state);
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
            if (!(other instanceof VerificationSession)) {
                return false;
            }
            VerificationSession verificationSession = (VerificationSession) other;
            return this.type == verificationSession.type && this.state == verificationSession.state;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            return (this.type.hashCode() * 31) + this.state.hashCode();
        }

        public String toString() {
            return "VerificationSession(type=" + this.type + ", state=" + this.state + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.type.writeToParcel(dest, flags);
            this.state.writeToParcel(dest, flags);
        }

        /* compiled from: ConsumerSession.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/ConsumerSession$VerificationSession$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/model/ConsumerSession$VerificationSession;", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<VerificationSession> serializer() {
                return ConsumerSession$VerificationSession$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ VerificationSession(int i, SessionType sessionType, SessionState sessionState, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, ConsumerSession$VerificationSession$$serializer.INSTANCE.getDescriptor());
            }
            this.type = sessionType;
            this.state = sessionState;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_model_release(VerificationSession self, CompositeEncoder output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.type);
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.state);
        }

        public VerificationSession(SessionType type, SessionState state) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(state, "state");
            this.type = type;
            this.state = state;
        }

        public final SessionType getType() {
            return this.type;
        }

        public final SessionState getState() {
            return this.state;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ConsumerSession.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;", "Landroid/os/Parcelable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, "SignUp", "Email", "Sms", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SessionType implements Parcelable {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ SessionType[] $VALUES;
            public static final Parcelable.Creator<SessionType> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final String value;
            public static final SessionType Unknown = new SessionType(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, 0, "");
            public static final SessionType SignUp = new SessionType("SignUp", 1, "signup");
            public static final SessionType Email = new SessionType("Email", 2, "email");
            public static final SessionType Sms = new SessionType("Sms", 3, "sms");

            /* compiled from: ConsumerSession.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SessionType> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SessionType createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return SessionType.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SessionType[] newArray(int i) {
                    return new SessionType[i];
                }
            }

            private static final /* synthetic */ SessionType[] $values() {
                return new SessionType[]{Unknown, SignUp, Email, Sms};
            }

            public static EnumEntries<SessionType> getEntries() {
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

            private SessionType(String str, int i, String str2) {
                this.value = str2;
            }

            public final String getValue() {
                return this.value;
            }

            static {
                SessionType[] sessionTypeArr$values = $values();
                $VALUES = sessionTypeArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(sessionTypeArr$values);
                INSTANCE = new Companion(null);
                CREATOR = new Creator();
            }

            /* compiled from: ConsumerSession.kt */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType$Companion;", "", "<init>", "()V", "fromValue", "Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;", "value", "", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final SessionType fromValue(String value) {
                    SessionType next;
                    Intrinsics.checkNotNullParameter(value, "value");
                    Iterator<SessionType> it = SessionType.getEntries().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (StringsKt.equals(next.getValue(), value, true)) {
                            break;
                        }
                    }
                    SessionType sessionType = next;
                    return sessionType == null ? SessionType.Unknown : sessionType;
                }
            }

            public static SessionType valueOf(String str) {
                return (SessionType) Enum.valueOf(SessionType.class, str);
            }

            public static SessionType[] values() {
                return (SessionType[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ConsumerSession.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00162\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;", "Landroid/os/Parcelable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, "Started", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Verified", "Canceled", "Expired", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SessionState implements Parcelable {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ SessionState[] $VALUES;
            public static final Parcelable.Creator<SessionState> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final String value;
            public static final SessionState Unknown = new SessionState(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, 0, "");
            public static final SessionState Started = new SessionState("Started", 1, "started");
            public static final SessionState Failed = new SessionState(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, 2, "failed");
            public static final SessionState Verified = new SessionState("Verified", 3, "verified");
            public static final SessionState Canceled = new SessionState("Canceled", 4, "canceled");
            public static final SessionState Expired = new SessionState("Expired", 5, "expired");

            /* compiled from: ConsumerSession.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SessionState> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SessionState createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return SessionState.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SessionState[] newArray(int i) {
                    return new SessionState[i];
                }
            }

            private static final /* synthetic */ SessionState[] $values() {
                return new SessionState[]{Unknown, Started, Failed, Verified, Canceled, Expired};
            }

            public static EnumEntries<SessionState> getEntries() {
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

            private SessionState(String str, int i, String str2) {
                this.value = str2;
            }

            public final String getValue() {
                return this.value;
            }

            static {
                SessionState[] sessionStateArr$values = $values();
                $VALUES = sessionStateArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(sessionStateArr$values);
                INSTANCE = new Companion(null);
                CREATOR = new Creator();
            }

            /* compiled from: ConsumerSession.kt */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState$Companion;", "", "<init>", "()V", "fromValue", "Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;", "value", "", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final SessionState fromValue(String value) {
                    SessionState next;
                    Intrinsics.checkNotNullParameter(value, "value");
                    Iterator<SessionState> it = SessionState.getEntries().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (StringsKt.equals(next.getValue(), value, true)) {
                            break;
                        }
                    }
                    SessionState sessionState = next;
                    return sessionState == null ? SessionState.Unknown : sessionState;
                }
            }

            public static SessionState valueOf(String str) {
                return (SessionState) Enum.valueOf(SessionState.class, str);
            }

            public static SessionState[] values() {
                return (SessionState[]) $VALUES.clone();
            }
        }
    }
}
