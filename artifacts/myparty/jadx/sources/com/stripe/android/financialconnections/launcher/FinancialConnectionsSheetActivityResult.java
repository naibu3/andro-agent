package com.stripe.android.financialconnections.launcher;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.AnalyticsEvents;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.Token;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsSheetActivityResult.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0004\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "Landroid/os/Parcelable;", "<init>", "()V", "toBundle", "Landroid/os/Bundle;", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED, "Canceled", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Companion", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Canceled;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Completed;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class FinancialConnectionsSheetActivityResult implements Parcelable {
    public static final String EXTRA_RESULT = "com.stripe.android.financialconnections.ConnectionsSheetContract.extra_result";

    public /* synthetic */ FinancialConnectionsSheetActivityResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FinancialConnectionsSheetActivityResult() {
    }

    /* compiled from: FinancialConnectionsSheetActivityResult.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Completed;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "instantDebits", "Lcom/stripe/android/financialconnections/launcher/InstantDebitsResult;", "financialConnectionsSession", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "token", "Lcom/stripe/android/model/Token;", "<init>", "(Lcom/stripe/android/financialconnections/launcher/InstantDebitsResult;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lcom/stripe/android/model/Token;)V", "getInstantDebits", "()Lcom/stripe/android/financialconnections/launcher/InstantDebitsResult;", "getFinancialConnectionsSession", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "getToken", "()Lcom/stripe/android/model/Token;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Completed extends FinancialConnectionsSheetActivityResult {
        public static final Parcelable.Creator<Completed> CREATOR = new Creator();
        private final FinancialConnectionsSession financialConnectionsSession;
        private final InstantDebitsResult instantDebits;
        private final Token token;

        /* compiled from: FinancialConnectionsSheetActivityResult.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Completed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Completed createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Completed(parcel.readInt() == 0 ? null : InstantDebitsResult.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FinancialConnectionsSession.CREATOR.createFromParcel(parcel) : null, (Token) parcel.readParcelable(Completed.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Completed[] newArray(int i) {
                return new Completed[i];
            }
        }

        public Completed() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Completed copy$default(Completed completed, InstantDebitsResult instantDebitsResult, FinancialConnectionsSession financialConnectionsSession, Token token, int i, Object obj) {
            if ((i & 1) != 0) {
                instantDebitsResult = completed.instantDebits;
            }
            if ((i & 2) != 0) {
                financialConnectionsSession = completed.financialConnectionsSession;
            }
            if ((i & 4) != 0) {
                token = completed.token;
            }
            return completed.copy(instantDebitsResult, financialConnectionsSession, token);
        }

        /* renamed from: component1, reason: from getter */
        public final InstantDebitsResult getInstantDebits() {
            return this.instantDebits;
        }

        /* renamed from: component2, reason: from getter */
        public final FinancialConnectionsSession getFinancialConnectionsSession() {
            return this.financialConnectionsSession;
        }

        /* renamed from: component3, reason: from getter */
        public final Token getToken() {
            return this.token;
        }

        public final Completed copy(InstantDebitsResult instantDebits, FinancialConnectionsSession financialConnectionsSession, Token token) {
            return new Completed(instantDebits, financialConnectionsSession, token);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Completed)) {
                return false;
            }
            Completed completed = (Completed) other;
            return Intrinsics.areEqual(this.instantDebits, completed.instantDebits) && Intrinsics.areEqual(this.financialConnectionsSession, completed.financialConnectionsSession) && Intrinsics.areEqual(this.token, completed.token);
        }

        public int hashCode() {
            InstantDebitsResult instantDebitsResult = this.instantDebits;
            int iHashCode = (instantDebitsResult == null ? 0 : instantDebitsResult.hashCode()) * 31;
            FinancialConnectionsSession financialConnectionsSession = this.financialConnectionsSession;
            int iHashCode2 = (iHashCode + (financialConnectionsSession == null ? 0 : financialConnectionsSession.hashCode())) * 31;
            Token token = this.token;
            return iHashCode2 + (token != null ? token.hashCode() : 0);
        }

        public String toString() {
            return "Completed(instantDebits=" + this.instantDebits + ", financialConnectionsSession=" + this.financialConnectionsSession + ", token=" + this.token + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            InstantDebitsResult instantDebitsResult = this.instantDebits;
            if (instantDebitsResult == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                instantDebitsResult.writeToParcel(dest, flags);
            }
            FinancialConnectionsSession financialConnectionsSession = this.financialConnectionsSession;
            if (financialConnectionsSession == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                financialConnectionsSession.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.token, flags);
        }

        public /* synthetic */ Completed(InstantDebitsResult instantDebitsResult, FinancialConnectionsSession financialConnectionsSession, Token token, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : instantDebitsResult, (i & 2) != 0 ? null : financialConnectionsSession, (i & 4) != 0 ? null : token);
        }

        public final InstantDebitsResult getInstantDebits() {
            return this.instantDebits;
        }

        public final FinancialConnectionsSession getFinancialConnectionsSession() {
            return this.financialConnectionsSession;
        }

        public final Token getToken() {
            return this.token;
        }

        public Completed(InstantDebitsResult instantDebitsResult, FinancialConnectionsSession financialConnectionsSession, Token token) {
            super(null);
            this.instantDebits = instantDebitsResult;
            this.financialConnectionsSession = financialConnectionsSession;
            this.token = token;
        }
    }

    /* compiled from: FinancialConnectionsSheetActivityResult.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Canceled;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Canceled extends FinancialConnectionsSheetActivityResult {
        public static final Canceled INSTANCE = new Canceled();
        public static final Parcelable.Creator<Canceled> CREATOR = new Creator();

        /* compiled from: FinancialConnectionsSheetActivityResult.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Canceled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Canceled.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled[] newArray(int i) {
                return new Canceled[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Canceled)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1375852025;
        }

        public String toString() {
            return "Canceled";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Canceled() {
            super(null);
        }
    }

    /* compiled from: FinancialConnectionsSheetActivityResult.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failed extends FinancialConnectionsSheetActivityResult {
        public static final Parcelable.Creator<Failed> CREATOR = new Creator();
        private final Throwable error;

        /* compiled from: FinancialConnectionsSheetActivityResult.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Failed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Failed((Throwable) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed[] newArray(int i) {
                return new Failed[i];
            }
        }

        public static /* synthetic */ Failed copy$default(Failed failed, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failed.error;
            }
            return failed.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Failed copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Failed(error);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failed) && Intrinsics.areEqual(this.error, ((Failed) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Failed(error=" + this.error + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.error);
        }

        public final Throwable getError() {
            return this.error;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }
    }

    public final Bundle toBundle() {
        return BundleKt.bundleOf(TuplesKt.to(EXTRA_RESULT, this));
    }
}
