package com.stripe.android.financialconnections.repository;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.di.ActivityRetainedScope;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountUpdateRequiredContentRepository.kt */
@ActivityRetainedScope
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/repository/AccountUpdateRequiredContentRepository;", "Lcom/stripe/android/financialconnections/repository/PersistingRepository;", "Lcom/stripe/android/financialconnections/repository/AccountUpdateRequiredContentRepository$State;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "set", "", "payload", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired;", "State", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AccountUpdateRequiredContentRepository extends PersistingRepository<State> {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public AccountUpdateRequiredContentRepository(SavedStateHandle savedStateHandle) {
        super(savedStateHandle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
    }

    public final void set(NoticeSheetState.NoticeSheetContent.UpdateRequired payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        set((AccountUpdateRequiredContentRepository) new State(payload));
    }

    /* compiled from: AccountUpdateRequiredContentRepository.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/financialconnections/repository/AccountUpdateRequiredContentRepository$State;", "Landroid/os/Parcelable;", "payload", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired;", "<init>", "(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired;)V", "getPayload", "()Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class State implements Parcelable {
        private final NoticeSheetState.NoticeSheetContent.UpdateRequired payload;
        public static final Parcelable.Creator<State> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: AccountUpdateRequiredContentRepository.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<State> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new State(NoticeSheetState.NoticeSheetContent.UpdateRequired.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public static /* synthetic */ State copy$default(State state, NoticeSheetState.NoticeSheetContent.UpdateRequired updateRequired, int i, Object obj) {
            if ((i & 1) != 0) {
                updateRequired = state.payload;
            }
            return state.copy(updateRequired);
        }

        /* renamed from: component1, reason: from getter */
        public final NoticeSheetState.NoticeSheetContent.UpdateRequired getPayload() {
            return this.payload;
        }

        public final State copy(NoticeSheetState.NoticeSheetContent.UpdateRequired payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            return new State(payload);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof State) && Intrinsics.areEqual(this.payload, ((State) other).payload);
        }

        public int hashCode() {
            return this.payload.hashCode();
        }

        public String toString() {
            return "State(payload=" + this.payload + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.payload.writeToParcel(dest, flags);
        }

        public State(NoticeSheetState.NoticeSheetContent.UpdateRequired payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.payload = payload;
        }

        public final NoticeSheetState.NoticeSheetContent.UpdateRequired getPayload() {
            return this.payload;
        }
    }
}
