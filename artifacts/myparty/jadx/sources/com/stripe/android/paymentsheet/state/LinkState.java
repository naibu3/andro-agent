package com.stripe.android.paymentsheet.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.ui.inline.LinkSignupMode;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkState.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\"B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006#"}, d2 = {"Lcom/stripe/android/paymentsheet/state/LinkState;", "Landroid/os/Parcelable;", "configuration", "Lcom/stripe/android/link/LinkConfiguration;", "loginState", "Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;", "signupMode", "Lcom/stripe/android/link/ui/inline/LinkSignupMode;", "<init>", "(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;Lcom/stripe/android/link/ui/inline/LinkSignupMode;)V", "getConfiguration", "()Lcom/stripe/android/link/LinkConfiguration;", "getLoginState", "()Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;", "getSignupMode", "()Lcom/stripe/android/link/ui/inline/LinkSignupMode;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "LoginState", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class LinkState implements Parcelable {
    private final LinkConfiguration configuration;
    private final LoginState loginState;
    private final LinkSignupMode signupMode;
    public static final Parcelable.Creator<LinkState> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: LinkState.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkState(LinkConfiguration.CREATOR.createFromParcel(parcel), LoginState.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : LinkSignupMode.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkState[] newArray(int i) {
            return new LinkState[i];
        }
    }

    public static /* synthetic */ LinkState copy$default(LinkState linkState, LinkConfiguration linkConfiguration, LoginState loginState, LinkSignupMode linkSignupMode, int i, Object obj) {
        if ((i & 1) != 0) {
            linkConfiguration = linkState.configuration;
        }
        if ((i & 2) != 0) {
            loginState = linkState.loginState;
        }
        if ((i & 4) != 0) {
            linkSignupMode = linkState.signupMode;
        }
        return linkState.copy(linkConfiguration, loginState, linkSignupMode);
    }

    /* renamed from: component1, reason: from getter */
    public final LinkConfiguration getConfiguration() {
        return this.configuration;
    }

    /* renamed from: component2, reason: from getter */
    public final LoginState getLoginState() {
        return this.loginState;
    }

    /* renamed from: component3, reason: from getter */
    public final LinkSignupMode getSignupMode() {
        return this.signupMode;
    }

    public final LinkState copy(LinkConfiguration configuration, LoginState loginState, LinkSignupMode signupMode) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(loginState, "loginState");
        return new LinkState(configuration, loginState, signupMode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkState)) {
            return false;
        }
        LinkState linkState = (LinkState) other;
        return Intrinsics.areEqual(this.configuration, linkState.configuration) && this.loginState == linkState.loginState && this.signupMode == linkState.signupMode;
    }

    public int hashCode() {
        int iHashCode = ((this.configuration.hashCode() * 31) + this.loginState.hashCode()) * 31;
        LinkSignupMode linkSignupMode = this.signupMode;
        return iHashCode + (linkSignupMode == null ? 0 : linkSignupMode.hashCode());
    }

    public String toString() {
        return "LinkState(configuration=" + this.configuration + ", loginState=" + this.loginState + ", signupMode=" + this.signupMode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.configuration.writeToParcel(dest, flags);
        dest.writeString(this.loginState.name());
        LinkSignupMode linkSignupMode = this.signupMode;
        if (linkSignupMode == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(linkSignupMode.name());
        }
    }

    public LinkState(LinkConfiguration configuration, LoginState loginState, LinkSignupMode linkSignupMode) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(loginState, "loginState");
        this.configuration = configuration;
        this.loginState = loginState;
        this.signupMode = linkSignupMode;
    }

    public final LinkConfiguration getConfiguration() {
        return this.configuration;
    }

    public final LoginState getLoginState() {
        return this.loginState;
    }

    public final LinkSignupMode getSignupMode() {
        return this.signupMode;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LinkState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;", "", "<init>", "(Ljava/lang/String;I)V", "LoggedIn", "NeedsVerification", "LoggedOut", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LoginState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LoginState[] $VALUES;
        public static final LoginState LoggedIn = new LoginState("LoggedIn", 0);
        public static final LoginState NeedsVerification = new LoginState("NeedsVerification", 1);
        public static final LoginState LoggedOut = new LoginState("LoggedOut", 2);

        private static final /* synthetic */ LoginState[] $values() {
            return new LoginState[]{LoggedIn, NeedsVerification, LoggedOut};
        }

        public static EnumEntries<LoginState> getEntries() {
            return $ENTRIES;
        }

        private LoginState(String str, int i) {
        }

        static {
            LoginState[] loginStateArr$values = $values();
            $VALUES = loginStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(loginStateArr$values);
        }

        public static LoginState valueOf(String str) {
            return (LoginState) Enum.valueOf(LoginState.class, str);
        }

        public static LoginState[] values() {
            return (LoginState[]) $VALUES.clone();
        }
    }
}
