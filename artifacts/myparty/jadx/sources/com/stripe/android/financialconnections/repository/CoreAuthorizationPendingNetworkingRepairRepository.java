package com.stripe.android.financialconnections.repository;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.di.ActivityRetainedScope;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CoreAuthorizationPendingNetworkingRepairRepository.kt */
@ActivityRetainedScope
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;", "Lcom/stripe/android/financialconnections/repository/PersistingRepository;", "Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository$State;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "logger", "Lcom/stripe/android/core/Logger;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/core/Logger;)V", "set", "", "coreAuthorization", "", "State", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CoreAuthorizationPendingNetworkingRepairRepository extends PersistingRepository<State> {
    public static final int $stable = 8;
    private final Logger logger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public CoreAuthorizationPendingNetworkingRepairRepository(SavedStateHandle savedStateHandle, Logger logger) {
        super(savedStateHandle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
    }

    public final void set(String coreAuthorization) {
        Intrinsics.checkNotNullParameter(coreAuthorization, "coreAuthorization");
        this.logger.debug("core authorization set to " + coreAuthorization);
        set((CoreAuthorizationPendingNetworkingRepairRepository) new State(coreAuthorization));
    }

    /* compiled from: CoreAuthorizationPendingNetworkingRepairRepository.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository$State;", "Landroid/os/Parcelable;", "coreAuthorization", "", "<init>", "(Ljava/lang/String;)V", "getCoreAuthorization", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class State implements Parcelable {
        private final String coreAuthorization;
        public static final Parcelable.Creator<State> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: CoreAuthorizationPendingNetworkingRepairRepository.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<State> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new State(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public static /* synthetic */ State copy$default(State state, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = state.coreAuthorization;
            }
            return state.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCoreAuthorization() {
            return this.coreAuthorization;
        }

        public final State copy(String coreAuthorization) {
            Intrinsics.checkNotNullParameter(coreAuthorization, "coreAuthorization");
            return new State(coreAuthorization);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof State) && Intrinsics.areEqual(this.coreAuthorization, ((State) other).coreAuthorization);
        }

        public int hashCode() {
            return this.coreAuthorization.hashCode();
        }

        public String toString() {
            return "State(coreAuthorization=" + this.coreAuthorization + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.coreAuthorization);
        }

        public State(String coreAuthorization) {
            Intrinsics.checkNotNullParameter(coreAuthorization, "coreAuthorization");
            this.coreAuthorization = coreAuthorization;
        }

        public final String getCoreAuthorization() {
            return this.coreAuthorization;
        }
    }
}
