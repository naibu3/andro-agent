package com.stripe.android.link.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.webkit.ProxyConfig;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.DisplayablePaymentDetails;
import com.stripe.android.uicore.elements.PhoneNumberFormatterKt;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: LinkAccount.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010&\u001a\u00020\u001b*\u00020\u0003H\u0002J\f\u0010'\u001a\u00020\u001b*\u00020\u0003H\u0002J\f\u0010(\u001a\u00020\u001b*\u00020\u0003H\u0002J\u0006\u0010)\u001a\u00020*J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020*R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u0005¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0014\u001a\u00020\u0005¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0017\u001a\u00020\u0005¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u000bR\u0017\u0010\u001a\u001a\u00020\u001b¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001a\u0010\u001dR\u0017\u0010\u001e\u001a\u00020\u001b¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010\u001dR\u0017\u0010!\u001a\u00020\"¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0010\u001a\u0004\b$\u0010%¨\u00060"}, d2 = {"Lcom/stripe/android/link/model/LinkAccount;", "Landroid/os/Parcelable;", "consumerSession", "Lcom/stripe/android/model/ConsumerSession;", "consumerPublishableKey", "", "displayablePaymentDetails", "Lcom/stripe/android/model/DisplayablePaymentDetails;", "<init>", "(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;)V", "getConsumerPublishableKey", "()Ljava/lang/String;", "getDisplayablePaymentDetails", "()Lcom/stripe/android/model/DisplayablePaymentDetails;", "redactedPhoneNumber", "getRedactedPhoneNumber$annotations", "()V", "getRedactedPhoneNumber", "unredactedPhoneNumber", "getUnredactedPhoneNumber", "clientSecret", "getClientSecret$annotations", "getClientSecret", "email", "getEmail$annotations", "getEmail", "isVerified", "", "isVerified$annotations", "()Z", "completedSignup", "getCompletedSignup$annotations", "getCompletedSignup", "accountStatus", "Lcom/stripe/android/link/model/AccountStatus;", "getAccountStatus$annotations", "getAccountStatus", "()Lcom/stripe/android/link/model/AccountStatus;", "containsSMSSessionStarted", "containsVerifiedSMSSession", "isVerifiedForSignup", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkAccount implements Parcelable {
    private final AccountStatus accountStatus;
    private final String clientSecret;
    private final boolean completedSignup;
    private final String consumerPublishableKey;
    private final ConsumerSession consumerSession;
    private final DisplayablePaymentDetails displayablePaymentDetails;
    private final String email;
    private final boolean isVerified;
    private final String redactedPhoneNumber;
    public static final Parcelable.Creator<LinkAccount> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: LinkAccount.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkAccount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkAccount createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkAccount((ConsumerSession) parcel.readParcelable(LinkAccount.class.getClassLoader()), parcel.readString(), (DisplayablePaymentDetails) parcel.readParcelable(LinkAccount.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkAccount[] newArray(int i) {
            return new LinkAccount[i];
        }
    }

    public static /* synthetic */ void getAccountStatus$annotations() {
    }

    public static /* synthetic */ void getClientSecret$annotations() {
    }

    public static /* synthetic */ void getCompletedSignup$annotations() {
    }

    public static /* synthetic */ void getEmail$annotations() {
    }

    public static /* synthetic */ void getRedactedPhoneNumber$annotations() {
    }

    public static /* synthetic */ void isVerified$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkAccount)) {
            return false;
        }
        LinkAccount linkAccount = (LinkAccount) obj;
        return Intrinsics.areEqual(this.consumerSession, linkAccount.consumerSession) && Intrinsics.areEqual(this.consumerPublishableKey, linkAccount.consumerPublishableKey) && Intrinsics.areEqual(this.displayablePaymentDetails, linkAccount.displayablePaymentDetails);
    }

    public int hashCode() {
        int iHashCode = this.consumerSession.hashCode() * 31;
        String str = this.consumerPublishableKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DisplayablePaymentDetails displayablePaymentDetails = this.displayablePaymentDetails;
        return iHashCode2 + (displayablePaymentDetails != null ? displayablePaymentDetails.hashCode() : 0);
    }

    public String toString() {
        return "LinkAccount(consumerSession=" + this.consumerSession + ", consumerPublishableKey=" + this.consumerPublishableKey + ", displayablePaymentDetails=" + this.displayablePaymentDetails + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.consumerSession, flags);
        dest.writeString(this.consumerPublishableKey);
        dest.writeParcelable(this.displayablePaymentDetails, flags);
    }

    public LinkAccount(ConsumerSession consumerSession, String str, DisplayablePaymentDetails displayablePaymentDetails) {
        AccountStatus accountStatus;
        Intrinsics.checkNotNullParameter(consumerSession, "consumerSession");
        this.consumerSession = consumerSession;
        this.consumerPublishableKey = str;
        this.displayablePaymentDetails = displayablePaymentDetails;
        this.redactedPhoneNumber = StringsKt.replace$default(consumerSession.getRedactedFormattedPhoneNumber(), ProxyConfig.MATCH_ALL_SCHEMES, "•", false, 4, (Object) null);
        this.clientSecret = consumerSession.getClientSecret();
        this.email = consumerSession.getEmailAddress();
        boolean z = containsVerifiedSMSSession(consumerSession) || isVerifiedForSignup(consumerSession);
        this.isVerified = z;
        this.completedSignup = isVerifiedForSignup(consumerSession);
        if (z) {
            accountStatus = AccountStatus.Verified;
        } else if (containsSMSSessionStarted(consumerSession)) {
            accountStatus = AccountStatus.VerificationStarted;
        } else {
            accountStatus = AccountStatus.NeedsVerification;
        }
        this.accountStatus = accountStatus;
    }

    public /* synthetic */ LinkAccount(ConsumerSession consumerSession, String str, DisplayablePaymentDetails displayablePaymentDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(consumerSession, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : displayablePaymentDetails);
    }

    public final String getConsumerPublishableKey() {
        return this.consumerPublishableKey;
    }

    public final DisplayablePaymentDetails getDisplayablePaymentDetails() {
        return this.displayablePaymentDetails;
    }

    public final String getRedactedPhoneNumber() {
        return this.redactedPhoneNumber;
    }

    public final String getUnredactedPhoneNumber() {
        String unredactedPhoneNumber = this.consumerSession.getUnredactedPhoneNumber();
        String phoneNumberCountry = this.consumerSession.getPhoneNumberCountry();
        if (unredactedPhoneNumber == null || phoneNumberCountry == null) {
            return null;
        }
        return PhoneNumberFormatterKt.convertPhoneNumberToE164(unredactedPhoneNumber, phoneNumberCountry);
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final String getEmail() {
        return this.email;
    }

    /* renamed from: isVerified, reason: from getter */
    public final boolean getIsVerified() {
        return this.isVerified;
    }

    public final boolean getCompletedSignup() {
        return this.completedSignup;
    }

    public final AccountStatus getAccountStatus() {
        return this.accountStatus;
    }

    private final boolean containsSMSSessionStarted(ConsumerSession consumerSession) {
        Object next;
        Iterator<T> it = consumerSession.getVerificationSessions().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ConsumerSession.VerificationSession verificationSession = (ConsumerSession.VerificationSession) next;
            if (verificationSession.getType() == ConsumerSession.VerificationSession.SessionType.Sms && verificationSession.getState() == ConsumerSession.VerificationSession.SessionState.Started) {
                break;
            }
        }
        return next != null;
    }

    private final boolean containsVerifiedSMSSession(ConsumerSession consumerSession) {
        Object next;
        Iterator<T> it = consumerSession.getVerificationSessions().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ConsumerSession.VerificationSession verificationSession = (ConsumerSession.VerificationSession) next;
            if (verificationSession.getType() == ConsumerSession.VerificationSession.SessionType.Sms && verificationSession.getState() == ConsumerSession.VerificationSession.SessionState.Verified) {
                break;
            }
        }
        return next != null;
    }

    private final boolean isVerifiedForSignup(ConsumerSession consumerSession) {
        Object next;
        Iterator<T> it = consumerSession.getVerificationSessions().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ConsumerSession.VerificationSession verificationSession = (ConsumerSession.VerificationSession) next;
            if (verificationSession.getType() == ConsumerSession.VerificationSession.SessionType.SignUp && verificationSession.getState() == ConsumerSession.VerificationSession.SessionState.Started) {
                break;
            }
        }
        return next != null;
    }
}
