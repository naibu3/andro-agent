package com.stripe.android.financialconnections.features.notice;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.common.util.UriUtil;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.LegalDetailsNotice;
import com.stripe.android.financialconnections.navigation.Destination;
import defpackage.FinancialConnectionsGenericInfoScreen;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NoticeSheetViewModel.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0013\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;", "", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", UriUtil.LOCAL_CONTENT_SCHEME, "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;", "viewEffect", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;)V", "arguments", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "getPane", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getContent", "()Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;", "getViewEffect", "()Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "NoticeSheetContent", "ViewEffect", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NoticeSheetState {
    public static final int $stable = 0;
    private final NoticeSheetContent content;
    private final FinancialConnectionsSessionManifest.Pane pane;
    private final ViewEffect viewEffect;

    public static /* synthetic */ NoticeSheetState copy$default(NoticeSheetState noticeSheetState, FinancialConnectionsSessionManifest.Pane pane, NoticeSheetContent noticeSheetContent, ViewEffect viewEffect, int i, Object obj) {
        if ((i & 1) != 0) {
            pane = noticeSheetState.pane;
        }
        if ((i & 2) != 0) {
            noticeSheetContent = noticeSheetState.content;
        }
        if ((i & 4) != 0) {
            viewEffect = noticeSheetState.viewEffect;
        }
        return noticeSheetState.copy(pane, noticeSheetContent, viewEffect);
    }

    /* renamed from: component1, reason: from getter */
    public final FinancialConnectionsSessionManifest.Pane getPane() {
        return this.pane;
    }

    /* renamed from: component2, reason: from getter */
    public final NoticeSheetContent getContent() {
        return this.content;
    }

    /* renamed from: component3, reason: from getter */
    public final ViewEffect getViewEffect() {
        return this.viewEffect;
    }

    public final NoticeSheetState copy(FinancialConnectionsSessionManifest.Pane pane, NoticeSheetContent content, ViewEffect viewEffect) {
        Intrinsics.checkNotNullParameter(pane, "pane");
        return new NoticeSheetState(pane, content, viewEffect);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoticeSheetState)) {
            return false;
        }
        NoticeSheetState noticeSheetState = (NoticeSheetState) other;
        return this.pane == noticeSheetState.pane && Intrinsics.areEqual(this.content, noticeSheetState.content) && Intrinsics.areEqual(this.viewEffect, noticeSheetState.viewEffect);
    }

    public int hashCode() {
        int iHashCode = this.pane.hashCode() * 31;
        NoticeSheetContent noticeSheetContent = this.content;
        int iHashCode2 = (iHashCode + (noticeSheetContent == null ? 0 : noticeSheetContent.hashCode())) * 31;
        ViewEffect viewEffect = this.viewEffect;
        return iHashCode2 + (viewEffect != null ? viewEffect.hashCode() : 0);
    }

    public String toString() {
        return "NoticeSheetState(pane=" + this.pane + ", content=" + this.content + ", viewEffect=" + this.viewEffect + ")";
    }

    public NoticeSheetState(FinancialConnectionsSessionManifest.Pane pane, NoticeSheetContent noticeSheetContent, ViewEffect viewEffect) {
        Intrinsics.checkNotNullParameter(pane, "pane");
        this.pane = pane;
        this.content = noticeSheetContent;
        this.viewEffect = viewEffect;
    }

    public /* synthetic */ NoticeSheetState(FinancialConnectionsSessionManifest.Pane pane, NoticeSheetContent noticeSheetContent, ViewEffect viewEffect, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pane, (i & 2) != 0 ? null : noticeSheetContent, (i & 4) != 0 ? null : viewEffect);
    }

    public final FinancialConnectionsSessionManifest.Pane getPane() {
        return this.pane;
    }

    public final NoticeSheetContent getContent() {
        return this.content;
    }

    public final ViewEffect getViewEffect() {
        return this.viewEffect;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NoticeSheetState(Bundle bundle) {
        FinancialConnectionsSessionManifest.Pane paneReferrer$financial_connections_release = Destination.INSTANCE.referrer$financial_connections_release(bundle);
        Intrinsics.checkNotNull(paneReferrer$financial_connections_release);
        this(paneReferrer$financial_connections_release, null, null, 6, null);
    }

    /* compiled from: NoticeSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;", "Landroid/os/Parcelable;", "Generic", "Legal", "DataAccess", "UpdateRequired", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$DataAccess;", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Generic;", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface NoticeSheetContent extends Parcelable {

        /* compiled from: NoticeSheetViewModel.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Generic;", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;", "generic", "LFinancialConnectionsGenericInfoScreen;", "<init>", "(LFinancialConnectionsGenericInfoScreen;)V", "getGeneric", "()LFinancialConnectionsGenericInfoScreen;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Generic implements NoticeSheetContent {
            private final FinancialConnectionsGenericInfoScreen generic;
            public static final Parcelable.Creator<Generic> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: NoticeSheetViewModel.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Generic> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Generic createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Generic(FinancialConnectionsGenericInfoScreen.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Generic[] newArray(int i) {
                    return new Generic[i];
                }
            }

            public static /* synthetic */ Generic copy$default(Generic generic, FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen, int i, Object obj) {
                if ((i & 1) != 0) {
                    financialConnectionsGenericInfoScreen = generic.generic;
                }
                return generic.copy(financialConnectionsGenericInfoScreen);
            }

            /* renamed from: component1, reason: from getter */
            public final FinancialConnectionsGenericInfoScreen getGeneric() {
                return this.generic;
            }

            public final Generic copy(FinancialConnectionsGenericInfoScreen generic) {
                Intrinsics.checkNotNullParameter(generic, "generic");
                return new Generic(generic);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Generic) && Intrinsics.areEqual(this.generic, ((Generic) other).generic);
            }

            public int hashCode() {
                return this.generic.hashCode();
            }

            public String toString() {
                return "Generic(generic=" + this.generic + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.generic.writeToParcel(dest, flags);
            }

            public Generic(FinancialConnectionsGenericInfoScreen generic) {
                Intrinsics.checkNotNullParameter(generic, "generic");
                this.generic = generic;
            }

            public final FinancialConnectionsGenericInfoScreen getGeneric() {
                return this.generic;
            }
        }

        /* compiled from: NoticeSheetViewModel.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;", "legalDetails", "Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;", "<init>", "(Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;)V", "getLegalDetails", "()Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Legal implements NoticeSheetContent {
            private final LegalDetailsNotice legalDetails;
            public static final Parcelable.Creator<Legal> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: NoticeSheetViewModel.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Legal> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Legal createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Legal(LegalDetailsNotice.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Legal[] newArray(int i) {
                    return new Legal[i];
                }
            }

            public static /* synthetic */ Legal copy$default(Legal legal, LegalDetailsNotice legalDetailsNotice, int i, Object obj) {
                if ((i & 1) != 0) {
                    legalDetailsNotice = legal.legalDetails;
                }
                return legal.copy(legalDetailsNotice);
            }

            /* renamed from: component1, reason: from getter */
            public final LegalDetailsNotice getLegalDetails() {
                return this.legalDetails;
            }

            public final Legal copy(LegalDetailsNotice legalDetails) {
                Intrinsics.checkNotNullParameter(legalDetails, "legalDetails");
                return new Legal(legalDetails);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Legal) && Intrinsics.areEqual(this.legalDetails, ((Legal) other).legalDetails);
            }

            public int hashCode() {
                return this.legalDetails.hashCode();
            }

            public String toString() {
                return "Legal(legalDetails=" + this.legalDetails + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.legalDetails.writeToParcel(dest, flags);
            }

            public Legal(LegalDetailsNotice legalDetails) {
                Intrinsics.checkNotNullParameter(legalDetails, "legalDetails");
                this.legalDetails = legalDetails;
            }

            public final LegalDetailsNotice getLegalDetails() {
                return this.legalDetails;
            }
        }

        /* compiled from: NoticeSheetViewModel.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$DataAccess;", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;", "dataAccess", "Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "<init>", "(Lcom/stripe/android/financialconnections/model/DataAccessNotice;)V", "getDataAccess", "()Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DataAccess implements NoticeSheetContent {
            private final DataAccessNotice dataAccess;
            public static final Parcelable.Creator<DataAccess> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: NoticeSheetViewModel.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<DataAccess> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DataAccess createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DataAccess(DataAccessNotice.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DataAccess[] newArray(int i) {
                    return new DataAccess[i];
                }
            }

            public static /* synthetic */ DataAccess copy$default(DataAccess dataAccess, DataAccessNotice dataAccessNotice, int i, Object obj) {
                if ((i & 1) != 0) {
                    dataAccessNotice = dataAccess.dataAccess;
                }
                return dataAccess.copy(dataAccessNotice);
            }

            /* renamed from: component1, reason: from getter */
            public final DataAccessNotice getDataAccess() {
                return this.dataAccess;
            }

            public final DataAccess copy(DataAccessNotice dataAccess) {
                Intrinsics.checkNotNullParameter(dataAccess, "dataAccess");
                return new DataAccess(dataAccess);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DataAccess) && Intrinsics.areEqual(this.dataAccess, ((DataAccess) other).dataAccess);
            }

            public int hashCode() {
                return this.dataAccess.hashCode();
            }

            public String toString() {
                return "DataAccess(dataAccess=" + this.dataAccess + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.dataAccess.writeToParcel(dest, flags);
            }

            public DataAccess(DataAccessNotice dataAccess) {
                Intrinsics.checkNotNullParameter(dataAccess, "dataAccess");
                this.dataAccess = dataAccess;
            }

            public final DataAccessNotice getDataAccess() {
                return this.dataAccess;
            }
        }

        /* compiled from: NoticeSheetViewModel.kt */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired;", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;", "generic", "LFinancialConnectionsGenericInfoScreen;", "type", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type;", "<init>", "(LFinancialConnectionsGenericInfoScreen;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type;)V", "getGeneric", "()LFinancialConnectionsGenericInfoScreen;", "getType", "()Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Type", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class UpdateRequired implements NoticeSheetContent {
            private final FinancialConnectionsGenericInfoScreen generic;
            private final Type type;
            public static final Parcelable.Creator<UpdateRequired> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: NoticeSheetViewModel.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<UpdateRequired> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpdateRequired createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new UpdateRequired(FinancialConnectionsGenericInfoScreen.CREATOR.createFromParcel(parcel), (Type) parcel.readParcelable(UpdateRequired.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpdateRequired[] newArray(int i) {
                    return new UpdateRequired[i];
                }
            }

            public static /* synthetic */ UpdateRequired copy$default(UpdateRequired updateRequired, FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen, Type type, int i, Object obj) {
                if ((i & 1) != 0) {
                    financialConnectionsGenericInfoScreen = updateRequired.generic;
                }
                if ((i & 2) != 0) {
                    type = updateRequired.type;
                }
                return updateRequired.copy(financialConnectionsGenericInfoScreen, type);
            }

            /* renamed from: component1, reason: from getter */
            public final FinancialConnectionsGenericInfoScreen getGeneric() {
                return this.generic;
            }

            /* renamed from: component2, reason: from getter */
            public final Type getType() {
                return this.type;
            }

            public final UpdateRequired copy(FinancialConnectionsGenericInfoScreen generic, Type type) {
                Intrinsics.checkNotNullParameter(generic, "generic");
                Intrinsics.checkNotNullParameter(type, "type");
                return new UpdateRequired(generic, type);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateRequired)) {
                    return false;
                }
                UpdateRequired updateRequired = (UpdateRequired) other;
                return Intrinsics.areEqual(this.generic, updateRequired.generic) && Intrinsics.areEqual(this.type, updateRequired.type);
            }

            public int hashCode() {
                return (this.generic.hashCode() * 31) + this.type.hashCode();
            }

            public String toString() {
                return "UpdateRequired(generic=" + this.generic + ", type=" + this.type + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.generic.writeToParcel(dest, flags);
                dest.writeParcelable(this.type, flags);
            }

            public UpdateRequired(FinancialConnectionsGenericInfoScreen generic, Type type) {
                Intrinsics.checkNotNullParameter(generic, "generic");
                Intrinsics.checkNotNullParameter(type, "type");
                this.generic = generic;
                this.type = type;
            }

            public final FinancialConnectionsGenericInfoScreen getGeneric() {
                return this.generic;
            }

            public final Type getType() {
                return this.type;
            }

            /* compiled from: NoticeSheetViewModel.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type;", "Landroid/os/Parcelable;", "Repair", "Supportability", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type$Repair;", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type$Supportability;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public interface Type extends Parcelable {

                /* compiled from: NoticeSheetViewModel.kt */
                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type$Repair;", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type;", "authorization", "", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)V", "getAuthorization", "()Ljava/lang/String;", "getInstitution", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final /* data */ class Repair implements Type {
                    public static final int $stable = 0;
                    public static final Parcelable.Creator<Repair> CREATOR = new Creator();
                    private final String authorization;
                    private final FinancialConnectionsInstitution institution;

                    /* compiled from: NoticeSheetViewModel.kt */
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<Repair> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final Repair createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new Repair(parcel.readString(), parcel.readInt() == 0 ? null : FinancialConnectionsInstitution.CREATOR.createFromParcel(parcel));
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final Repair[] newArray(int i) {
                            return new Repair[i];
                        }
                    }

                    public static /* synthetic */ Repair copy$default(Repair repair, String str, FinancialConnectionsInstitution financialConnectionsInstitution, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = repair.authorization;
                        }
                        if ((i & 2) != 0) {
                            financialConnectionsInstitution = repair.institution;
                        }
                        return repair.copy(str, financialConnectionsInstitution);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final String getAuthorization() {
                        return this.authorization;
                    }

                    /* renamed from: component2, reason: from getter */
                    public final FinancialConnectionsInstitution getInstitution() {
                        return this.institution;
                    }

                    public final Repair copy(String authorization, FinancialConnectionsInstitution institution) {
                        return new Repair(authorization, institution);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Repair)) {
                            return false;
                        }
                        Repair repair = (Repair) other;
                        return Intrinsics.areEqual(this.authorization, repair.authorization) && Intrinsics.areEqual(this.institution, repair.institution);
                    }

                    public int hashCode() {
                        String str = this.authorization;
                        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                        FinancialConnectionsInstitution financialConnectionsInstitution = this.institution;
                        return iHashCode + (financialConnectionsInstitution != null ? financialConnectionsInstitution.hashCode() : 0);
                    }

                    public String toString() {
                        return "Repair(authorization=" + this.authorization + ", institution=" + this.institution + ")";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int flags) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeString(this.authorization);
                        FinancialConnectionsInstitution financialConnectionsInstitution = this.institution;
                        if (financialConnectionsInstitution == null) {
                            dest.writeInt(0);
                        } else {
                            dest.writeInt(1);
                            financialConnectionsInstitution.writeToParcel(dest, flags);
                        }
                    }

                    public Repair(String str, FinancialConnectionsInstitution financialConnectionsInstitution) {
                        this.authorization = str;
                        this.institution = financialConnectionsInstitution;
                    }

                    public final String getAuthorization() {
                        return this.authorization;
                    }

                    public final FinancialConnectionsInstitution getInstitution() {
                        return this.institution;
                    }
                }

                /* compiled from: NoticeSheetViewModel.kt */
                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type$Supportability;", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type;", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)V", "getInstitution", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final /* data */ class Supportability implements Type {
                    public static final int $stable = 0;
                    public static final Parcelable.Creator<Supportability> CREATOR = new Creator();
                    private final FinancialConnectionsInstitution institution;

                    /* compiled from: NoticeSheetViewModel.kt */
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<Supportability> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final Supportability createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new Supportability(parcel.readInt() == 0 ? null : FinancialConnectionsInstitution.CREATOR.createFromParcel(parcel));
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final Supportability[] newArray(int i) {
                            return new Supportability[i];
                        }
                    }

                    public static /* synthetic */ Supportability copy$default(Supportability supportability, FinancialConnectionsInstitution financialConnectionsInstitution, int i, Object obj) {
                        if ((i & 1) != 0) {
                            financialConnectionsInstitution = supportability.institution;
                        }
                        return supportability.copy(financialConnectionsInstitution);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final FinancialConnectionsInstitution getInstitution() {
                        return this.institution;
                    }

                    public final Supportability copy(FinancialConnectionsInstitution institution) {
                        return new Supportability(institution);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Supportability) && Intrinsics.areEqual(this.institution, ((Supportability) other).institution);
                    }

                    public int hashCode() {
                        FinancialConnectionsInstitution financialConnectionsInstitution = this.institution;
                        if (financialConnectionsInstitution == null) {
                            return 0;
                        }
                        return financialConnectionsInstitution.hashCode();
                    }

                    public String toString() {
                        return "Supportability(institution=" + this.institution + ")";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int flags) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        FinancialConnectionsInstitution financialConnectionsInstitution = this.institution;
                        if (financialConnectionsInstitution == null) {
                            dest.writeInt(0);
                        } else {
                            dest.writeInt(1);
                            financialConnectionsInstitution.writeToParcel(dest, flags);
                        }
                    }

                    public Supportability(FinancialConnectionsInstitution financialConnectionsInstitution) {
                        this.institution = financialConnectionsInstitution;
                    }

                    public final FinancialConnectionsInstitution getInstitution() {
                        return this.institution;
                    }
                }
            }
        }
    }

    /* compiled from: NoticeSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;", "", "OpenUrl", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect$OpenUrl;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewEffect {

        /* compiled from: NoticeSheetViewModel.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect$OpenUrl;", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;", "url", "", "id", "", "<init>", "(Ljava/lang/String;J)V", "getUrl", "()Ljava/lang/String;", "getId", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenUrl implements ViewEffect {
            public static final int $stable = 0;
            private final long id;
            private final String url;

            public static /* synthetic */ OpenUrl copy$default(OpenUrl openUrl, String str, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = openUrl.url;
                }
                if ((i & 2) != 0) {
                    j = openUrl.id;
                }
                return openUrl.copy(str, j);
            }

            /* renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            /* renamed from: component2, reason: from getter */
            public final long getId() {
                return this.id;
            }

            public final OpenUrl copy(String url, long id) {
                Intrinsics.checkNotNullParameter(url, "url");
                return new OpenUrl(url, id);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OpenUrl)) {
                    return false;
                }
                OpenUrl openUrl = (OpenUrl) other;
                return Intrinsics.areEqual(this.url, openUrl.url) && this.id == openUrl.id;
            }

            public int hashCode() {
                return (this.url.hashCode() * 31) + Long.hashCode(this.id);
            }

            public String toString() {
                return "OpenUrl(url=" + this.url + ", id=" + this.id + ")";
            }

            public OpenUrl(String url, long j) {
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
                this.id = j;
            }

            public final String getUrl() {
                return this.url;
            }

            public final long getId() {
                return this.id;
            }
        }
    }
}
