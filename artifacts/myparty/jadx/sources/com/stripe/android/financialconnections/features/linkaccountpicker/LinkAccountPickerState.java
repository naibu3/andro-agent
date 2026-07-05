package com.stripe.android.financialconnections.features.linkaccountpicker;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.financialconnections.model.AddNewAccount;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.NetworkedAccount;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.ui.TextResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkAccountPickerViewModel.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002#$B3\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;", "", "payload", "Lcom/stripe/android/financialconnections/presentation/Async;", "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;", "selectNetworkedAccountAsync", "", "viewEffect", "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$ViewEffect;", "<init>", "(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$ViewEffect;)V", "getPayload", "()Lcom/stripe/android/financialconnections/presentation/Async;", "getSelectNetworkedAccountAsync", "getViewEffect", "()Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$ViewEffect;", "activeDataAccessNotice", "Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "getActiveDataAccessNotice", "()Lcom/stripe/android/financialconnections/model/DataAccessNotice;", SDKConstants.PARAM_GAME_REQUESTS_CTA, "Lcom/stripe/android/financialconnections/ui/TextResource;", "getCta", "()Lcom/stripe/android/financialconnections/ui/TextResource;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Payload", "ViewEffect", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LinkAccountPickerState {
    public static final int $stable = 8;
    private final Async<Payload> payload;
    private final Async<Unit> selectNetworkedAccountAsync;
    private final ViewEffect viewEffect;

    public LinkAccountPickerState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinkAccountPickerState copy$default(LinkAccountPickerState linkAccountPickerState, Async async, Async async2, ViewEffect viewEffect, int i, Object obj) {
        if ((i & 1) != 0) {
            async = linkAccountPickerState.payload;
        }
        if ((i & 2) != 0) {
            async2 = linkAccountPickerState.selectNetworkedAccountAsync;
        }
        if ((i & 4) != 0) {
            viewEffect = linkAccountPickerState.viewEffect;
        }
        return linkAccountPickerState.copy(async, async2, viewEffect);
    }

    public final Async<Payload> component1() {
        return this.payload;
    }

    public final Async<Unit> component2() {
        return this.selectNetworkedAccountAsync;
    }

    /* renamed from: component3, reason: from getter */
    public final ViewEffect getViewEffect() {
        return this.viewEffect;
    }

    public final LinkAccountPickerState copy(Async<Payload> payload, Async<Unit> selectNetworkedAccountAsync, ViewEffect viewEffect) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(selectNetworkedAccountAsync, "selectNetworkedAccountAsync");
        return new LinkAccountPickerState(payload, selectNetworkedAccountAsync, viewEffect);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkAccountPickerState)) {
            return false;
        }
        LinkAccountPickerState linkAccountPickerState = (LinkAccountPickerState) other;
        return Intrinsics.areEqual(this.payload, linkAccountPickerState.payload) && Intrinsics.areEqual(this.selectNetworkedAccountAsync, linkAccountPickerState.selectNetworkedAccountAsync) && Intrinsics.areEqual(this.viewEffect, linkAccountPickerState.viewEffect);
    }

    public int hashCode() {
        int iHashCode = ((this.payload.hashCode() * 31) + this.selectNetworkedAccountAsync.hashCode()) * 31;
        ViewEffect viewEffect = this.viewEffect;
        return iHashCode + (viewEffect == null ? 0 : viewEffect.hashCode());
    }

    public String toString() {
        return "LinkAccountPickerState(payload=" + this.payload + ", selectNetworkedAccountAsync=" + this.selectNetworkedAccountAsync + ", viewEffect=" + this.viewEffect + ")";
    }

    public LinkAccountPickerState(Async<Payload> payload, Async<Unit> selectNetworkedAccountAsync, ViewEffect viewEffect) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(selectNetworkedAccountAsync, "selectNetworkedAccountAsync");
        this.payload = payload;
        this.selectNetworkedAccountAsync = selectNetworkedAccountAsync;
        this.viewEffect = viewEffect;
    }

    public /* synthetic */ LinkAccountPickerState(Async.Uninitialized uninitialized, Async.Uninitialized uninitialized2, ViewEffect viewEffect, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Async.Uninitialized.INSTANCE : uninitialized, (i & 2) != 0 ? Async.Uninitialized.INSTANCE : uninitialized2, (i & 4) != 0 ? null : viewEffect);
    }

    public final Async<Payload> getPayload() {
        return this.payload;
    }

    public final Async<Unit> getSelectNetworkedAccountAsync() {
        return this.selectNetworkedAccountAsync;
    }

    public final ViewEffect getViewEffect() {
        return this.viewEffect;
    }

    /* compiled from: LinkAccountPickerViewModel.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u00102\u001a\u00020\tHÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J\t\u00107\u001a\u00020\u0011HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010;\u001a\u00020\u0011HÆ\u0003J\u00ad\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0011HÆ\u0001J\u0013\u0010=\u001a\u00020\u00112\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020@HÖ\u0001J\t\u0010A\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0011\u0010\u0016\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b,\u0010'R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b.\u0010\u001c¨\u0006B"}, d2 = {"Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;", "", "title", "", "accounts", "", "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;", "selectedAccountIds", "addNewAccount", "Lcom/stripe/android/financialconnections/model/AddNewAccount;", "consumerSessionClientSecret", "defaultCta", "nextPaneOnNewAccount", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "partnerToCoreAuths", "", "singleAccount", "", "multipleAccountTypesSelectedDataAccessNotice", "Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "aboveCta", "defaultDataAccessNotice", "acquireConsentOnPrimaryCtaClick", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/financialconnections/model/AddNewAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ZLcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Z)V", "getTitle", "()Ljava/lang/String;", "getAccounts", "()Ljava/util/List;", "getSelectedAccountIds", "getAddNewAccount", "()Lcom/stripe/android/financialconnections/model/AddNewAccount;", "getConsumerSessionClientSecret", "getDefaultCta", "getNextPaneOnNewAccount", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getPartnerToCoreAuths", "()Ljava/util/Map;", "getSingleAccount", "()Z", "getMultipleAccountTypesSelectedDataAccessNotice", "()Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "getAboveCta", "getDefaultDataAccessNotice", "getAcquireConsentOnPrimaryCtaClick", "selectedAccounts", "getSelectedAccounts", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Payload {
        public static final int $stable = 8;
        private final String aboveCta;
        private final List<LinkedAccount> accounts;
        private final boolean acquireConsentOnPrimaryCtaClick;
        private final AddNewAccount addNewAccount;
        private final String consumerSessionClientSecret;
        private final String defaultCta;
        private final DataAccessNotice defaultDataAccessNotice;
        private final DataAccessNotice multipleAccountTypesSelectedDataAccessNotice;
        private final FinancialConnectionsSessionManifest.Pane nextPaneOnNewAccount;
        private final Map<String, String> partnerToCoreAuths;
        private final List<String> selectedAccountIds;
        private final boolean singleAccount;
        private final String title;

        public static /* synthetic */ Payload copy$default(Payload payload, String str, List list, List list2, AddNewAccount addNewAccount, String str2, String str3, FinancialConnectionsSessionManifest.Pane pane, Map map, boolean z, DataAccessNotice dataAccessNotice, String str4, DataAccessNotice dataAccessNotice2, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = payload.title;
            }
            return payload.copy(str, (i & 2) != 0 ? payload.accounts : list, (i & 4) != 0 ? payload.selectedAccountIds : list2, (i & 8) != 0 ? payload.addNewAccount : addNewAccount, (i & 16) != 0 ? payload.consumerSessionClientSecret : str2, (i & 32) != 0 ? payload.defaultCta : str3, (i & 64) != 0 ? payload.nextPaneOnNewAccount : pane, (i & 128) != 0 ? payload.partnerToCoreAuths : map, (i & 256) != 0 ? payload.singleAccount : z, (i & 512) != 0 ? payload.multipleAccountTypesSelectedDataAccessNotice : dataAccessNotice, (i & 1024) != 0 ? payload.aboveCta : str4, (i & 2048) != 0 ? payload.defaultDataAccessNotice : dataAccessNotice2, (i & 4096) != 0 ? payload.acquireConsentOnPrimaryCtaClick : z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component10, reason: from getter */
        public final DataAccessNotice getMultipleAccountTypesSelectedDataAccessNotice() {
            return this.multipleAccountTypesSelectedDataAccessNotice;
        }

        /* renamed from: component11, reason: from getter */
        public final String getAboveCta() {
            return this.aboveCta;
        }

        /* renamed from: component12, reason: from getter */
        public final DataAccessNotice getDefaultDataAccessNotice() {
            return this.defaultDataAccessNotice;
        }

        /* renamed from: component13, reason: from getter */
        public final boolean getAcquireConsentOnPrimaryCtaClick() {
            return this.acquireConsentOnPrimaryCtaClick;
        }

        public final List<LinkedAccount> component2() {
            return this.accounts;
        }

        public final List<String> component3() {
            return this.selectedAccountIds;
        }

        /* renamed from: component4, reason: from getter */
        public final AddNewAccount getAddNewAccount() {
            return this.addNewAccount;
        }

        /* renamed from: component5, reason: from getter */
        public final String getConsumerSessionClientSecret() {
            return this.consumerSessionClientSecret;
        }

        /* renamed from: component6, reason: from getter */
        public final String getDefaultCta() {
            return this.defaultCta;
        }

        /* renamed from: component7, reason: from getter */
        public final FinancialConnectionsSessionManifest.Pane getNextPaneOnNewAccount() {
            return this.nextPaneOnNewAccount;
        }

        public final Map<String, String> component8() {
            return this.partnerToCoreAuths;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getSingleAccount() {
            return this.singleAccount;
        }

        public final Payload copy(String title, List<LinkedAccount> accounts, List<String> selectedAccountIds, AddNewAccount addNewAccount, String consumerSessionClientSecret, String defaultCta, FinancialConnectionsSessionManifest.Pane nextPaneOnNewAccount, Map<String, String> partnerToCoreAuths, boolean singleAccount, DataAccessNotice multipleAccountTypesSelectedDataAccessNotice, String aboveCta, DataAccessNotice defaultDataAccessNotice, boolean acquireConsentOnPrimaryCtaClick) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(accounts, "accounts");
            Intrinsics.checkNotNullParameter(selectedAccountIds, "selectedAccountIds");
            Intrinsics.checkNotNullParameter(addNewAccount, "addNewAccount");
            Intrinsics.checkNotNullParameter(consumerSessionClientSecret, "consumerSessionClientSecret");
            Intrinsics.checkNotNullParameter(defaultCta, "defaultCta");
            return new Payload(title, accounts, selectedAccountIds, addNewAccount, consumerSessionClientSecret, defaultCta, nextPaneOnNewAccount, partnerToCoreAuths, singleAccount, multipleAccountTypesSelectedDataAccessNotice, aboveCta, defaultDataAccessNotice, acquireConsentOnPrimaryCtaClick);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return Intrinsics.areEqual(this.title, payload.title) && Intrinsics.areEqual(this.accounts, payload.accounts) && Intrinsics.areEqual(this.selectedAccountIds, payload.selectedAccountIds) && Intrinsics.areEqual(this.addNewAccount, payload.addNewAccount) && Intrinsics.areEqual(this.consumerSessionClientSecret, payload.consumerSessionClientSecret) && Intrinsics.areEqual(this.defaultCta, payload.defaultCta) && this.nextPaneOnNewAccount == payload.nextPaneOnNewAccount && Intrinsics.areEqual(this.partnerToCoreAuths, payload.partnerToCoreAuths) && this.singleAccount == payload.singleAccount && Intrinsics.areEqual(this.multipleAccountTypesSelectedDataAccessNotice, payload.multipleAccountTypesSelectedDataAccessNotice) && Intrinsics.areEqual(this.aboveCta, payload.aboveCta) && Intrinsics.areEqual(this.defaultDataAccessNotice, payload.defaultDataAccessNotice) && this.acquireConsentOnPrimaryCtaClick == payload.acquireConsentOnPrimaryCtaClick;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.title.hashCode() * 31) + this.accounts.hashCode()) * 31) + this.selectedAccountIds.hashCode()) * 31) + this.addNewAccount.hashCode()) * 31) + this.consumerSessionClientSecret.hashCode()) * 31) + this.defaultCta.hashCode()) * 31;
            FinancialConnectionsSessionManifest.Pane pane = this.nextPaneOnNewAccount;
            int iHashCode2 = (iHashCode + (pane == null ? 0 : pane.hashCode())) * 31;
            Map<String, String> map = this.partnerToCoreAuths;
            int iHashCode3 = (((iHashCode2 + (map == null ? 0 : map.hashCode())) * 31) + Boolean.hashCode(this.singleAccount)) * 31;
            DataAccessNotice dataAccessNotice = this.multipleAccountTypesSelectedDataAccessNotice;
            int iHashCode4 = (iHashCode3 + (dataAccessNotice == null ? 0 : dataAccessNotice.hashCode())) * 31;
            String str = this.aboveCta;
            int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            DataAccessNotice dataAccessNotice2 = this.defaultDataAccessNotice;
            return ((iHashCode5 + (dataAccessNotice2 != null ? dataAccessNotice2.hashCode() : 0)) * 31) + Boolean.hashCode(this.acquireConsentOnPrimaryCtaClick);
        }

        public String toString() {
            return "Payload(title=" + this.title + ", accounts=" + this.accounts + ", selectedAccountIds=" + this.selectedAccountIds + ", addNewAccount=" + this.addNewAccount + ", consumerSessionClientSecret=" + this.consumerSessionClientSecret + ", defaultCta=" + this.defaultCta + ", nextPaneOnNewAccount=" + this.nextPaneOnNewAccount + ", partnerToCoreAuths=" + this.partnerToCoreAuths + ", singleAccount=" + this.singleAccount + ", multipleAccountTypesSelectedDataAccessNotice=" + this.multipleAccountTypesSelectedDataAccessNotice + ", aboveCta=" + this.aboveCta + ", defaultDataAccessNotice=" + this.defaultDataAccessNotice + ", acquireConsentOnPrimaryCtaClick=" + this.acquireConsentOnPrimaryCtaClick + ")";
        }

        public Payload(String title, List<LinkedAccount> accounts, List<String> selectedAccountIds, AddNewAccount addNewAccount, String consumerSessionClientSecret, String defaultCta, FinancialConnectionsSessionManifest.Pane pane, Map<String, String> map, boolean z, DataAccessNotice dataAccessNotice, String str, DataAccessNotice dataAccessNotice2, boolean z2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(accounts, "accounts");
            Intrinsics.checkNotNullParameter(selectedAccountIds, "selectedAccountIds");
            Intrinsics.checkNotNullParameter(addNewAccount, "addNewAccount");
            Intrinsics.checkNotNullParameter(consumerSessionClientSecret, "consumerSessionClientSecret");
            Intrinsics.checkNotNullParameter(defaultCta, "defaultCta");
            this.title = title;
            this.accounts = accounts;
            this.selectedAccountIds = selectedAccountIds;
            this.addNewAccount = addNewAccount;
            this.consumerSessionClientSecret = consumerSessionClientSecret;
            this.defaultCta = defaultCta;
            this.nextPaneOnNewAccount = pane;
            this.partnerToCoreAuths = map;
            this.singleAccount = z;
            this.multipleAccountTypesSelectedDataAccessNotice = dataAccessNotice;
            this.aboveCta = str;
            this.defaultDataAccessNotice = dataAccessNotice2;
            this.acquireConsentOnPrimaryCtaClick = z2;
        }

        public final String getTitle() {
            return this.title;
        }

        public final List<LinkedAccount> getAccounts() {
            return this.accounts;
        }

        public final List<String> getSelectedAccountIds() {
            return this.selectedAccountIds;
        }

        public final AddNewAccount getAddNewAccount() {
            return this.addNewAccount;
        }

        public final String getConsumerSessionClientSecret() {
            return this.consumerSessionClientSecret;
        }

        public final String getDefaultCta() {
            return this.defaultCta;
        }

        public final FinancialConnectionsSessionManifest.Pane getNextPaneOnNewAccount() {
            return this.nextPaneOnNewAccount;
        }

        public final Map<String, String> getPartnerToCoreAuths() {
            return this.partnerToCoreAuths;
        }

        public final boolean getSingleAccount() {
            return this.singleAccount;
        }

        public final DataAccessNotice getMultipleAccountTypesSelectedDataAccessNotice() {
            return this.multipleAccountTypesSelectedDataAccessNotice;
        }

        public final String getAboveCta() {
            return this.aboveCta;
        }

        public final DataAccessNotice getDefaultDataAccessNotice() {
            return this.defaultDataAccessNotice;
        }

        public final boolean getAcquireConsentOnPrimaryCtaClick() {
            return this.acquireConsentOnPrimaryCtaClick;
        }

        public final List<LinkedAccount> getSelectedAccounts() {
            List<LinkedAccount> list = this.accounts;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (this.selectedAccountIds.contains(((LinkedAccount) obj).getAccount().getId())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    public final DataAccessNotice getActiveDataAccessNotice() {
        NetworkedAccount display;
        DataAccessNotice dataAccessNotice;
        Payload payloadInvoke = this.payload.invoke();
        if (payloadInvoke == null) {
            return null;
        }
        List<LinkedAccount> selectedAccounts = payloadInvoke.getSelectedAccounts();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = selectedAccounts.iterator();
        while (it.hasNext()) {
            String type = ((LinkedAccount) it.next()).getType();
            if (type != null) {
                arrayList.add(type);
            }
        }
        if (CollectionsKt.toSet(arrayList).size() > 1) {
            return payloadInvoke.getMultipleAccountTypesSelectedDataAccessNotice();
        }
        LinkedAccount linkedAccount = (LinkedAccount) CollectionsKt.firstOrNull((List) payloadInvoke.getSelectedAccounts());
        return (linkedAccount == null || (display = linkedAccount.getDisplay()) == null || (dataAccessNotice = display.getDataAccessNotice()) == null) ? payloadInvoke.getDefaultDataAccessNotice() : dataAccessNotice;
    }

    public final TextResource getCta() {
        String defaultCta;
        Payload payloadInvoke = this.payload.invoke();
        if (payloadInvoke != null && payloadInvoke.getSingleAccount()) {
            LinkedAccount linkedAccount = (LinkedAccount) CollectionsKt.singleOrNull((List) payloadInvoke.getSelectedAccounts());
            NetworkedAccount display = linkedAccount != null ? linkedAccount.getDisplay() : null;
            if (display == null || (defaultCta = display.getSelectionCta()) == null) {
                defaultCta = payloadInvoke.getDefaultCta();
            }
            return new TextResource.Text(defaultCta);
        }
        String defaultCta2 = payloadInvoke != null ? payloadInvoke.getDefaultCta() : null;
        if (defaultCta2 == null) {
            defaultCta2 = "";
        }
        return new TextResource.Text(defaultCta2);
    }

    /* compiled from: LinkAccountPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$ViewEffect;", "", "<init>", "()V", "OpenUrl", "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$ViewEffect$OpenUrl;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class ViewEffect {
        public static final int $stable = 0;

        public /* synthetic */ ViewEffect(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ViewEffect() {
        }

        /* compiled from: LinkAccountPickerViewModel.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$ViewEffect$OpenUrl;", "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$ViewEffect;", "url", "", "id", "", "<init>", "(Ljava/lang/String;J)V", "getUrl", "()Ljava/lang/String;", "getId", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenUrl extends ViewEffect {
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

            public final String getUrl() {
                return this.url;
            }

            public final long getId() {
                return this.id;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenUrl(String url, long j) {
                super(null);
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
                this.id = j;
            }
        }
    }
}
