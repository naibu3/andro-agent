package com.stripe.android.financialconnections.repository;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.common.util.UriUtil;
import com.stripe.android.financialconnections.di.ActivityRetainedScope;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NoticeSheetContentRepository.kt */
@ActivityRetainedScope
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;", "Lcom/stripe/android/financialconnections/repository/PersistingRepository;", "Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository$State;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "set", "", UriUtil.LOCAL_CONTENT_SCHEME, "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;", "State", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NoticeSheetContentRepository extends PersistingRepository<State> {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public NoticeSheetContentRepository(SavedStateHandle savedStateHandle) {
        super(savedStateHandle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
    }

    public final void set(NoticeSheetState.NoticeSheetContent content) {
        Intrinsics.checkNotNullParameter(content, "content");
        set((NoticeSheetContentRepository) new State(content));
    }

    /* compiled from: NoticeSheetContentRepository.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository$State;", "Landroid/os/Parcelable;", UriUtil.LOCAL_CONTENT_SCHEME, "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;", "<init>", "(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;)V", "getContent", "()Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class State implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<State> CREATOR = new Creator();
        private final NoticeSheetState.NoticeSheetContent content;

        /* compiled from: NoticeSheetContentRepository.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<State> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new State((NoticeSheetState.NoticeSheetContent) parcel.readParcelable(State.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public State() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ State copy$default(State state, NoticeSheetState.NoticeSheetContent noticeSheetContent, int i, Object obj) {
            if ((i & 1) != 0) {
                noticeSheetContent = state.content;
            }
            return state.copy(noticeSheetContent);
        }

        /* renamed from: component1, reason: from getter */
        public final NoticeSheetState.NoticeSheetContent getContent() {
            return this.content;
        }

        public final State copy(NoticeSheetState.NoticeSheetContent content) {
            return new State(content);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof State) && Intrinsics.areEqual(this.content, ((State) other).content);
        }

        public int hashCode() {
            NoticeSheetState.NoticeSheetContent noticeSheetContent = this.content;
            if (noticeSheetContent == null) {
                return 0;
            }
            return noticeSheetContent.hashCode();
        }

        public String toString() {
            return "State(content=" + this.content + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.content, flags);
        }

        public State(NoticeSheetState.NoticeSheetContent noticeSheetContent) {
            this.content = noticeSheetContent;
        }

        public /* synthetic */ State(NoticeSheetState.NoticeSheetContent noticeSheetContent, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : noticeSheetContent);
        }

        public final NoticeSheetState.NoticeSheetContent getContent() {
            return this.content;
        }
    }
}
