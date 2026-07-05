package com.stripe.android.link.ui.inline;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserInput.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/ui/inline/UserInput;", "Landroid/os/Parcelable;", "<init>", "()V", "SignIn", "SignUp", "Lcom/stripe/android/link/ui/inline/UserInput$SignIn;", "Lcom/stripe/android/link/ui/inline/UserInput$SignUp;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class UserInput implements Parcelable {
    public static final int $stable = 0;

    public /* synthetic */ UserInput(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UserInput() {
    }

    /* compiled from: UserInput.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/link/ui/inline/UserInput$SignIn;", "Lcom/stripe/android/link/ui/inline/UserInput;", "email", "", "<init>", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SignIn extends UserInput {
        private final String email;
        public static final Parcelable.Creator<SignIn> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: UserInput.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SignIn> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SignIn createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SignIn(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SignIn[] newArray(int i) {
                return new SignIn[i];
            }
        }

        public static /* synthetic */ SignIn copy$default(SignIn signIn, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = signIn.email;
            }
            return signIn.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        public final SignIn copy(String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            return new SignIn(email);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SignIn) && Intrinsics.areEqual(this.email, ((SignIn) other).email);
        }

        public int hashCode() {
            return this.email.hashCode();
        }

        public String toString() {
            return "SignIn(email=" + this.email + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.email);
        }

        public final String getEmail() {
            return this.email;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignIn(String email) {
            super(null);
            Intrinsics.checkNotNullParameter(email, "email");
            this.email = email;
        }
    }

    /* compiled from: UserInput.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, d2 = {"Lcom/stripe/android/link/ui/inline/UserInput$SignUp;", "Lcom/stripe/android/link/ui/inline/UserInput;", "email", "", "phone", "country", "name", "consentAction", "Lcom/stripe/android/link/ui/inline/SignUpConsentAction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/SignUpConsentAction;)V", "getEmail", "()Ljava/lang/String;", "getPhone", "getCountry", "getName", "getConsentAction", "()Lcom/stripe/android/link/ui/inline/SignUpConsentAction;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SignUp extends UserInput {
        private final SignUpConsentAction consentAction;
        private final String country;
        private final String email;
        private final String name;
        private final String phone;
        public static final Parcelable.Creator<SignUp> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: UserInput.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SignUp> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SignUp createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SignUp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), SignUpConsentAction.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SignUp[] newArray(int i) {
                return new SignUp[i];
            }
        }

        public static /* synthetic */ SignUp copy$default(SignUp signUp, String str, String str2, String str3, String str4, SignUpConsentAction signUpConsentAction, int i, Object obj) {
            if ((i & 1) != 0) {
                str = signUp.email;
            }
            if ((i & 2) != 0) {
                str2 = signUp.phone;
            }
            if ((i & 4) != 0) {
                str3 = signUp.country;
            }
            if ((i & 8) != 0) {
                str4 = signUp.name;
            }
            if ((i & 16) != 0) {
                signUpConsentAction = signUp.consentAction;
            }
            SignUpConsentAction signUpConsentAction2 = signUpConsentAction;
            String str5 = str3;
            return signUp.copy(str, str2, str5, str4, signUpConsentAction2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        /* renamed from: component4, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component5, reason: from getter */
        public final SignUpConsentAction getConsentAction() {
            return this.consentAction;
        }

        public final SignUp copy(String email, String phone, String country, String name, SignUpConsentAction consentAction) {
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(consentAction, "consentAction");
            return new SignUp(email, phone, country, name, consentAction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SignUp)) {
                return false;
            }
            SignUp signUp = (SignUp) other;
            return Intrinsics.areEqual(this.email, signUp.email) && Intrinsics.areEqual(this.phone, signUp.phone) && Intrinsics.areEqual(this.country, signUp.country) && Intrinsics.areEqual(this.name, signUp.name) && this.consentAction == signUp.consentAction;
        }

        public int hashCode() {
            int iHashCode = this.email.hashCode() * 31;
            String str = this.phone;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.country;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.name;
            return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.consentAction.hashCode();
        }

        public String toString() {
            return "SignUp(email=" + this.email + ", phone=" + this.phone + ", country=" + this.country + ", name=" + this.name + ", consentAction=" + this.consentAction + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.email);
            dest.writeString(this.phone);
            dest.writeString(this.country);
            dest.writeString(this.name);
            dest.writeString(this.consentAction.name());
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final String getCountry() {
            return this.country;
        }

        public final String getName() {
            return this.name;
        }

        public final SignUpConsentAction getConsentAction() {
            return this.consentAction;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignUp(String email, String str, String str2, String str3, SignUpConsentAction consentAction) {
            super(null);
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(consentAction, "consentAction");
            this.email = email;
            this.phone = str;
            this.country = str2;
            this.name = str3;
            this.consentAction = consentAction;
        }
    }
}
