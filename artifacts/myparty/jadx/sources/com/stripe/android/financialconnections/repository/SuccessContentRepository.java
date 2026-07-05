package com.stripe.android.financialconnections.repository;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.di.ActivityRetainedScope;
import com.stripe.android.financialconnections.ui.TextResource;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SuccessContentRepository.kt */
@ActivityRetainedScope
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;", "Lcom/stripe/android/financialconnections/repository/PersistingRepository;", "Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "set", "", "message", "Lcom/stripe/android/financialconnections/ui/TextResource;", "heading", "State", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SuccessContentRepository extends PersistingRepository<State> {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public SuccessContentRepository(SavedStateHandle savedStateHandle) {
        super(savedStateHandle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
    }

    public static /* synthetic */ void set$default(SuccessContentRepository successContentRepository, TextResource textResource, TextResource textResource2, int i, Object obj) {
        if ((i & 2) != 0) {
            textResource2 = null;
        }
        successContentRepository.set(textResource, textResource2);
    }

    public final void set(TextResource message, TextResource heading) {
        set(new State(message, heading));
    }

    /* compiled from: SuccessContentRepository.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;", "Landroid/os/Parcelable;", "message", "Lcom/stripe/android/financialconnections/ui/TextResource;", "heading", "<init>", "(Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;)V", "getMessage", "()Lcom/stripe/android/financialconnections/ui/TextResource;", "getHeading", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class State implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<State> CREATOR = new Creator();
        private final TextResource heading;
        private final TextResource message;

        /* compiled from: SuccessContentRepository.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<State> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new State((TextResource) parcel.readParcelable(State.class.getClassLoader()), (TextResource) parcel.readParcelable(State.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public static /* synthetic */ State copy$default(State state, TextResource textResource, TextResource textResource2, int i, Object obj) {
            if ((i & 1) != 0) {
                textResource = state.message;
            }
            if ((i & 2) != 0) {
                textResource2 = state.heading;
            }
            return state.copy(textResource, textResource2);
        }

        /* renamed from: component1, reason: from getter */
        public final TextResource getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final TextResource getHeading() {
            return this.heading;
        }

        public final State copy(TextResource message, TextResource heading) {
            return new State(message, heading);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.areEqual(this.message, state.message) && Intrinsics.areEqual(this.heading, state.heading);
        }

        public int hashCode() {
            TextResource textResource = this.message;
            int iHashCode = (textResource == null ? 0 : textResource.hashCode()) * 31;
            TextResource textResource2 = this.heading;
            return iHashCode + (textResource2 != null ? textResource2.hashCode() : 0);
        }

        public String toString() {
            return "State(message=" + this.message + ", heading=" + this.heading + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.message, flags);
            dest.writeParcelable(this.heading, flags);
        }

        public State(TextResource textResource, TextResource textResource2) {
            this.message = textResource;
            this.heading = textResource2;
        }

        public final TextResource getMessage() {
            return this.message;
        }

        public final TextResource getHeading() {
            return this.heading;
        }
    }
}
