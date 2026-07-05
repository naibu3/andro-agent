package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChallengeAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "Landroid/os/Parcelable;", "<init>", "()V", "NativeForm", "HtmlForm", "Oob", "Resend", "Cancel", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$Cancel;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$HtmlForm;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$NativeForm;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$Oob;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$Resend;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ChallengeAction implements Parcelable {
    public /* synthetic */ ChallengeAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ChallengeAction() {
    }

    /* compiled from: ChallengeAction.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\r\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0004\b\u0010\u0010\u000bJ$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$NativeForm;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "userEntry", "", "whitelistingValue", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getUserEntry$3ds2sdk_release", "()Ljava/lang/String;", "getWhitelistingValue$3ds2sdk_release", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component1$3ds2sdk_release", "component2", "component2$3ds2sdk_release", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$NativeForm;", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NativeForm extends ChallengeAction {
        public static final Parcelable.Creator<NativeForm> CREATOR = new Creator();
        private final String userEntry;
        private final Boolean whitelistingValue;

        /* compiled from: ChallengeAction.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NativeForm> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NativeForm createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NativeForm(string, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NativeForm[] newArray(int i) {
                return new NativeForm[i];
            }
        }

        public static /* synthetic */ NativeForm copy$default(NativeForm nativeForm, String str, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = nativeForm.userEntry;
            }
            if ((i & 2) != 0) {
                bool = nativeForm.whitelistingValue;
            }
            return nativeForm.copy(str, bool);
        }

        /* renamed from: component1$3ds2sdk_release, reason: from getter */
        public final String getUserEntry() {
            return this.userEntry;
        }

        /* renamed from: component2$3ds2sdk_release, reason: from getter */
        public final Boolean getWhitelistingValue() {
            return this.whitelistingValue;
        }

        public final NativeForm copy(String userEntry, Boolean whitelistingValue) {
            Intrinsics.checkNotNullParameter(userEntry, "userEntry");
            return new NativeForm(userEntry, whitelistingValue);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NativeForm)) {
                return false;
            }
            NativeForm nativeForm = (NativeForm) other;
            return Intrinsics.areEqual(this.userEntry, nativeForm.userEntry) && Intrinsics.areEqual(this.whitelistingValue, nativeForm.whitelistingValue);
        }

        public int hashCode() {
            int iHashCode = this.userEntry.hashCode() * 31;
            Boolean bool = this.whitelistingValue;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            return "NativeForm(userEntry=" + this.userEntry + ", whitelistingValue=" + this.whitelistingValue + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            int iBooleanValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.userEntry);
            Boolean bool = this.whitelistingValue;
            if (bool == null) {
                iBooleanValue = 0;
            } else {
                dest.writeInt(1);
                iBooleanValue = bool.booleanValue();
            }
            dest.writeInt(iBooleanValue);
        }

        public final String getUserEntry$3ds2sdk_release() {
            return this.userEntry;
        }

        public final Boolean getWhitelistingValue$3ds2sdk_release() {
            return this.whitelistingValue;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NativeForm(String userEntry, Boolean bool) {
            super(null);
            Intrinsics.checkNotNullParameter(userEntry, "userEntry");
            this.userEntry = userEntry;
            this.whitelistingValue = bool;
        }
    }

    /* compiled from: ChallengeAction.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\tJ\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$HtmlForm;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "userEntry", "", "<init>", "(Ljava/lang/String;)V", "getUserEntry$3ds2sdk_release", "()Ljava/lang/String;", "component1", "component1$3ds2sdk_release", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HtmlForm extends ChallengeAction {
        public static final Parcelable.Creator<HtmlForm> CREATOR = new Creator();
        private final String userEntry;

        /* compiled from: ChallengeAction.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HtmlForm> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HtmlForm createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HtmlForm(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HtmlForm[] newArray(int i) {
                return new HtmlForm[i];
            }
        }

        public static /* synthetic */ HtmlForm copy$default(HtmlForm htmlForm, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = htmlForm.userEntry;
            }
            return htmlForm.copy(str);
        }

        /* renamed from: component1$3ds2sdk_release, reason: from getter */
        public final String getUserEntry() {
            return this.userEntry;
        }

        public final HtmlForm copy(String userEntry) {
            Intrinsics.checkNotNullParameter(userEntry, "userEntry");
            return new HtmlForm(userEntry);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HtmlForm) && Intrinsics.areEqual(this.userEntry, ((HtmlForm) other).userEntry);
        }

        public int hashCode() {
            return this.userEntry.hashCode();
        }

        public String toString() {
            return "HtmlForm(userEntry=" + this.userEntry + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.userEntry);
        }

        public final String getUserEntry$3ds2sdk_release() {
            return this.userEntry;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HtmlForm(String userEntry) {
            super(null);
            Intrinsics.checkNotNullParameter(userEntry, "userEntry");
            this.userEntry = userEntry;
        }
    }

    /* compiled from: ChallengeAction.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0004\b\n\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$Oob;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "whitelistingValue", "", "<init>", "(Ljava/lang/Boolean;)V", "getWhitelistingValue$3ds2sdk_release", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component1$3ds2sdk_release", "copy", "(Ljava/lang/Boolean;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$Oob;", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Oob extends ChallengeAction {
        public static final Parcelable.Creator<Oob> CREATOR = new Creator();
        private final Boolean whitelistingValue;

        /* compiled from: ChallengeAction.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Oob> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Oob createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Oob(boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Oob[] newArray(int i) {
                return new Oob[i];
            }
        }

        public static /* synthetic */ Oob copy$default(Oob oob, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = oob.whitelistingValue;
            }
            return oob.copy(bool);
        }

        /* renamed from: component1$3ds2sdk_release, reason: from getter */
        public final Boolean getWhitelistingValue() {
            return this.whitelistingValue;
        }

        public final Oob copy(Boolean whitelistingValue) {
            return new Oob(whitelistingValue);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Oob) && Intrinsics.areEqual(this.whitelistingValue, ((Oob) other).whitelistingValue);
        }

        public int hashCode() {
            Boolean bool = this.whitelistingValue;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            return "Oob(whitelistingValue=" + this.whitelistingValue + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            int iBooleanValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            Boolean bool = this.whitelistingValue;
            if (bool == null) {
                iBooleanValue = 0;
            } else {
                dest.writeInt(1);
                iBooleanValue = bool.booleanValue();
            }
            dest.writeInt(iBooleanValue);
        }

        public final Boolean getWhitelistingValue$3ds2sdk_release() {
            return this.whitelistingValue;
        }

        public Oob(Boolean bool) {
            super(null);
            this.whitelistingValue = bool;
        }
    }

    /* compiled from: ChallengeAction.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$Resend;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Resend extends ChallengeAction {
        public static final Resend INSTANCE = new Resend();
        public static final Parcelable.Creator<Resend> CREATOR = new Creator();

        /* compiled from: ChallengeAction.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Resend> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Resend createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Resend.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Resend[] newArray(int i) {
                return new Resend[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Resend() {
            super(null);
        }
    }

    /* compiled from: ChallengeAction.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$Cancel;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cancel extends ChallengeAction {
        public static final Cancel INSTANCE = new Cancel();
        public static final Parcelable.Creator<Cancel> CREATOR = new Creator();

        /* compiled from: ChallengeAction.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Cancel> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cancel createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Cancel.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cancel[] newArray(int i) {
                return new Cancel[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Cancel() {
            super(null);
        }
    }
}
