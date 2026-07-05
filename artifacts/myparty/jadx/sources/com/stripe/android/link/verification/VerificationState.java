package com.stripe.android.link.verification;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.ui.verification.VerificationViewState;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkInlineState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/link/verification/VerificationState;", "Landroid/os/Parcelable;", "<init>", "()V", "Loading", "Render2FA", "RenderButton", "Lcom/stripe/android/link/verification/VerificationState$Loading;", "Lcom/stripe/android/link/verification/VerificationState$Render2FA;", "Lcom/stripe/android/link/verification/VerificationState$RenderButton;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class VerificationState implements Parcelable {
    public static final int $stable = 0;

    public /* synthetic */ VerificationState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private VerificationState() {
    }

    /* compiled from: LinkInlineState.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/link/verification/VerificationState$Loading;", "Lcom/stripe/android/link/verification/VerificationState;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Loading extends VerificationState {
        public static final Loading INSTANCE = new Loading();
        public static final Parcelable.Creator<Loading> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: LinkInlineState.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Loading> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Loading.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Loading[] newArray(int i) {
                return new Loading[i];
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

        private Loading() {
            super(null);
        }
    }

    /* compiled from: LinkInlineState.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/link/verification/VerificationState$Render2FA;", "Lcom/stripe/android/link/verification/VerificationState;", "viewState", "Lcom/stripe/android/link/ui/verification/VerificationViewState;", "linkConfiguration", "Lcom/stripe/android/link/LinkConfiguration;", "<init>", "(Lcom/stripe/android/link/ui/verification/VerificationViewState;Lcom/stripe/android/link/LinkConfiguration;)V", "getViewState", "()Lcom/stripe/android/link/ui/verification/VerificationViewState;", "getLinkConfiguration", "()Lcom/stripe/android/link/LinkConfiguration;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Render2FA extends VerificationState {
        private final LinkConfiguration linkConfiguration;
        private final VerificationViewState viewState;
        public static final Parcelable.Creator<Render2FA> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: LinkInlineState.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Render2FA> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Render2FA createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Render2FA(VerificationViewState.CREATOR.createFromParcel(parcel), LinkConfiguration.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Render2FA[] newArray(int i) {
                return new Render2FA[i];
            }
        }

        public static /* synthetic */ Render2FA copy$default(Render2FA render2FA, VerificationViewState verificationViewState, LinkConfiguration linkConfiguration, int i, Object obj) {
            if ((i & 1) != 0) {
                verificationViewState = render2FA.viewState;
            }
            if ((i & 2) != 0) {
                linkConfiguration = render2FA.linkConfiguration;
            }
            return render2FA.copy(verificationViewState, linkConfiguration);
        }

        /* renamed from: component1, reason: from getter */
        public final VerificationViewState getViewState() {
            return this.viewState;
        }

        /* renamed from: component2, reason: from getter */
        public final LinkConfiguration getLinkConfiguration() {
            return this.linkConfiguration;
        }

        public final Render2FA copy(VerificationViewState viewState, LinkConfiguration linkConfiguration) {
            Intrinsics.checkNotNullParameter(viewState, "viewState");
            Intrinsics.checkNotNullParameter(linkConfiguration, "linkConfiguration");
            return new Render2FA(viewState, linkConfiguration);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Render2FA)) {
                return false;
            }
            Render2FA render2FA = (Render2FA) other;
            return Intrinsics.areEqual(this.viewState, render2FA.viewState) && Intrinsics.areEqual(this.linkConfiguration, render2FA.linkConfiguration);
        }

        public int hashCode() {
            return (this.viewState.hashCode() * 31) + this.linkConfiguration.hashCode();
        }

        public String toString() {
            return "Render2FA(viewState=" + this.viewState + ", linkConfiguration=" + this.linkConfiguration + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.viewState.writeToParcel(dest, flags);
            this.linkConfiguration.writeToParcel(dest, flags);
        }

        public final VerificationViewState getViewState() {
            return this.viewState;
        }

        public final LinkConfiguration getLinkConfiguration() {
            return this.linkConfiguration;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Render2FA(VerificationViewState viewState, LinkConfiguration linkConfiguration) {
            super(null);
            Intrinsics.checkNotNullParameter(viewState, "viewState");
            Intrinsics.checkNotNullParameter(linkConfiguration, "linkConfiguration");
            this.viewState = viewState;
            this.linkConfiguration = linkConfiguration;
        }
    }

    /* compiled from: LinkInlineState.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/link/verification/VerificationState$RenderButton;", "Lcom/stripe/android/link/verification/VerificationState;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RenderButton extends VerificationState {
        public static final RenderButton INSTANCE = new RenderButton();
        public static final Parcelable.Creator<RenderButton> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: LinkInlineState.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RenderButton> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RenderButton createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RenderButton.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RenderButton[] newArray(int i) {
                return new RenderButton[i];
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

        private RenderButton() {
            super(null);
        }
    }
}
