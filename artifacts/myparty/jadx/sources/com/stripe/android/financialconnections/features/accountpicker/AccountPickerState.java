package com.stripe.android.financialconnections.features.accountpicker;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.model.PartnerAccountsList;
import com.stripe.android.financialconnections.presentation.Async;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountPickerViewModel.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003,-.B]\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003J_\u0010&\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\rHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u001e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0016¨\u0006/"}, d2 = {"Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;", "", "institution", "Lcom/stripe/android/financialconnections/presentation/Async;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "payload", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;", "canRetry", "", "selectAccounts", "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;", "selectedIds", "", "", "viewEffect", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;", "<init>", "(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ZLcom/stripe/android/financialconnections/presentation/Async;Ljava/util/Set;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;)V", "getInstitution", "()Lcom/stripe/android/financialconnections/presentation/Async;", "getPayload", "getCanRetry", "()Z", "getSelectAccounts", "getSelectedIds", "()Ljava/util/Set;", "getViewEffect", "()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;", "submitLoading", "getSubmitLoading", "submitEnabled", "getSubmitEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Payload", "SelectionMode", "ViewEffect", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AccountPickerState {
    public static final int $stable = 8;
    private final boolean canRetry;
    private final Async<FinancialConnectionsInstitution> institution;
    private final Async<Payload> payload;
    private final Async<PartnerAccountsList> selectAccounts;
    private final Set<String> selectedIds;
    private final ViewEffect viewEffect;

    public AccountPickerState() {
        this(null, null, false, null, null, null, 63, null);
    }

    public static /* synthetic */ AccountPickerState copy$default(AccountPickerState accountPickerState, Async async, Async async2, boolean z, Async async3, Set set, ViewEffect viewEffect, int i, Object obj) {
        if ((i & 1) != 0) {
            async = accountPickerState.institution;
        }
        if ((i & 2) != 0) {
            async2 = accountPickerState.payload;
        }
        if ((i & 4) != 0) {
            z = accountPickerState.canRetry;
        }
        if ((i & 8) != 0) {
            async3 = accountPickerState.selectAccounts;
        }
        if ((i & 16) != 0) {
            set = accountPickerState.selectedIds;
        }
        if ((i & 32) != 0) {
            viewEffect = accountPickerState.viewEffect;
        }
        Set set2 = set;
        ViewEffect viewEffect2 = viewEffect;
        return accountPickerState.copy(async, async2, z, async3, set2, viewEffect2);
    }

    public final Async<FinancialConnectionsInstitution> component1() {
        return this.institution;
    }

    public final Async<Payload> component2() {
        return this.payload;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCanRetry() {
        return this.canRetry;
    }

    public final Async<PartnerAccountsList> component4() {
        return this.selectAccounts;
    }

    public final Set<String> component5() {
        return this.selectedIds;
    }

    /* renamed from: component6, reason: from getter */
    public final ViewEffect getViewEffect() {
        return this.viewEffect;
    }

    public final AccountPickerState copy(Async<FinancialConnectionsInstitution> institution, Async<Payload> payload, boolean canRetry, Async<PartnerAccountsList> selectAccounts, Set<String> selectedIds, ViewEffect viewEffect) {
        Intrinsics.checkNotNullParameter(institution, "institution");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(selectAccounts, "selectAccounts");
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        return new AccountPickerState(institution, payload, canRetry, selectAccounts, selectedIds, viewEffect);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountPickerState)) {
            return false;
        }
        AccountPickerState accountPickerState = (AccountPickerState) other;
        return Intrinsics.areEqual(this.institution, accountPickerState.institution) && Intrinsics.areEqual(this.payload, accountPickerState.payload) && this.canRetry == accountPickerState.canRetry && Intrinsics.areEqual(this.selectAccounts, accountPickerState.selectAccounts) && Intrinsics.areEqual(this.selectedIds, accountPickerState.selectedIds) && Intrinsics.areEqual(this.viewEffect, accountPickerState.viewEffect);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.institution.hashCode() * 31) + this.payload.hashCode()) * 31) + Boolean.hashCode(this.canRetry)) * 31) + this.selectAccounts.hashCode()) * 31) + this.selectedIds.hashCode()) * 31;
        ViewEffect viewEffect = this.viewEffect;
        return iHashCode + (viewEffect == null ? 0 : viewEffect.hashCode());
    }

    public String toString() {
        return "AccountPickerState(institution=" + this.institution + ", payload=" + this.payload + ", canRetry=" + this.canRetry + ", selectAccounts=" + this.selectAccounts + ", selectedIds=" + this.selectedIds + ", viewEffect=" + this.viewEffect + ")";
    }

    public AccountPickerState(Async<FinancialConnectionsInstitution> institution, Async<Payload> payload, boolean z, Async<PartnerAccountsList> selectAccounts, Set<String> selectedIds, ViewEffect viewEffect) {
        Intrinsics.checkNotNullParameter(institution, "institution");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(selectAccounts, "selectAccounts");
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        this.institution = institution;
        this.payload = payload;
        this.canRetry = z;
        this.selectAccounts = selectAccounts;
        this.selectedIds = selectedIds;
        this.viewEffect = viewEffect;
    }

    public /* synthetic */ AccountPickerState(Async.Uninitialized uninitialized, Async.Uninitialized uninitialized2, boolean z, Async.Uninitialized uninitialized3, Set set, ViewEffect viewEffect, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Async.Uninitialized.INSTANCE : uninitialized, (i & 2) != 0 ? Async.Uninitialized.INSTANCE : uninitialized2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? Async.Uninitialized.INSTANCE : uninitialized3, (i & 16) != 0 ? SetsKt.emptySet() : set, (i & 32) != 0 ? null : viewEffect);
    }

    public final Async<FinancialConnectionsInstitution> getInstitution() {
        return this.institution;
    }

    public final Async<Payload> getPayload() {
        return this.payload;
    }

    public final boolean getCanRetry() {
        return this.canRetry;
    }

    public final Async<PartnerAccountsList> getSelectAccounts() {
        return this.selectAccounts;
    }

    public final Set<String> getSelectedIds() {
        return this.selectedIds;
    }

    public final ViewEffect getViewEffect() {
        return this.viewEffect;
    }

    public final boolean getSubmitLoading() {
        return (this.payload instanceof Async.Loading) || (this.selectAccounts instanceof Async.Loading);
    }

    public final boolean getSubmitEnabled() {
        return !this.selectedIds.isEmpty();
    }

    /* compiled from: AccountPickerViewModel.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003Jo\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010/\u001a\u00020\u00032\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0016R\u0011\u0010#\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010\u0014¨\u00064"}, d2 = {"Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;", "", "skipAccountSelection", "", "accounts", "", "Lcom/stripe/android/financialconnections/model/PartnerAccount;", "dataAccessDisclaimer", "", "dataAccessNotice", "Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "selectionMode", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;", "singleAccount", "stripeDirect", "businessName", "userSelectedSingleAccountInInstitution", "<init>", "(ZLjava/util/List;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;ZZLjava/lang/String;Z)V", "getSkipAccountSelection", "()Z", "getAccounts", "()Ljava/util/List;", "getDataAccessDisclaimer", "()Ljava/lang/String;", "getDataAccessNotice", "()Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "getSelectionMode", "()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;", "getSingleAccount", "getStripeDirect", "getBusinessName", "getUserSelectedSingleAccountInInstitution", "selectableAccounts", "getSelectableAccounts", "shouldSkipPane", "getShouldSkipPane", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Payload {
        public static final int $stable = 8;
        private final List<PartnerAccount> accounts;
        private final String businessName;
        private final String dataAccessDisclaimer;
        private final DataAccessNotice dataAccessNotice;
        private final SelectionMode selectionMode;
        private final boolean singleAccount;
        private final boolean skipAccountSelection;
        private final boolean stripeDirect;
        private final boolean userSelectedSingleAccountInInstitution;

        public static /* synthetic */ Payload copy$default(Payload payload, boolean z, List list, String str, DataAccessNotice dataAccessNotice, SelectionMode selectionMode, boolean z2, boolean z3, String str2, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                z = payload.skipAccountSelection;
            }
            if ((i & 2) != 0) {
                list = payload.accounts;
            }
            if ((i & 4) != 0) {
                str = payload.dataAccessDisclaimer;
            }
            if ((i & 8) != 0) {
                dataAccessNotice = payload.dataAccessNotice;
            }
            if ((i & 16) != 0) {
                selectionMode = payload.selectionMode;
            }
            if ((i & 32) != 0) {
                z2 = payload.singleAccount;
            }
            if ((i & 64) != 0) {
                z3 = payload.stripeDirect;
            }
            if ((i & 128) != 0) {
                str2 = payload.businessName;
            }
            if ((i & 256) != 0) {
                z4 = payload.userSelectedSingleAccountInInstitution;
            }
            String str3 = str2;
            boolean z5 = z4;
            boolean z6 = z2;
            boolean z7 = z3;
            SelectionMode selectionMode2 = selectionMode;
            String str4 = str;
            return payload.copy(z, list, str4, dataAccessNotice, selectionMode2, z6, z7, str3, z5);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSkipAccountSelection() {
            return this.skipAccountSelection;
        }

        public final List<PartnerAccount> component2() {
            return this.accounts;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDataAccessDisclaimer() {
            return this.dataAccessDisclaimer;
        }

        /* renamed from: component4, reason: from getter */
        public final DataAccessNotice getDataAccessNotice() {
            return this.dataAccessNotice;
        }

        /* renamed from: component5, reason: from getter */
        public final SelectionMode getSelectionMode() {
            return this.selectionMode;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getSingleAccount() {
            return this.singleAccount;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getStripeDirect() {
            return this.stripeDirect;
        }

        /* renamed from: component8, reason: from getter */
        public final String getBusinessName() {
            return this.businessName;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getUserSelectedSingleAccountInInstitution() {
            return this.userSelectedSingleAccountInInstitution;
        }

        public final Payload copy(boolean skipAccountSelection, List<PartnerAccount> accounts, String dataAccessDisclaimer, DataAccessNotice dataAccessNotice, SelectionMode selectionMode, boolean singleAccount, boolean stripeDirect, String businessName, boolean userSelectedSingleAccountInInstitution) {
            Intrinsics.checkNotNullParameter(accounts, "accounts");
            Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
            return new Payload(skipAccountSelection, accounts, dataAccessDisclaimer, dataAccessNotice, selectionMode, singleAccount, stripeDirect, businessName, userSelectedSingleAccountInInstitution);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return this.skipAccountSelection == payload.skipAccountSelection && Intrinsics.areEqual(this.accounts, payload.accounts) && Intrinsics.areEqual(this.dataAccessDisclaimer, payload.dataAccessDisclaimer) && Intrinsics.areEqual(this.dataAccessNotice, payload.dataAccessNotice) && this.selectionMode == payload.selectionMode && this.singleAccount == payload.singleAccount && this.stripeDirect == payload.stripeDirect && Intrinsics.areEqual(this.businessName, payload.businessName) && this.userSelectedSingleAccountInInstitution == payload.userSelectedSingleAccountInInstitution;
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.skipAccountSelection) * 31) + this.accounts.hashCode()) * 31;
            String str = this.dataAccessDisclaimer;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            DataAccessNotice dataAccessNotice = this.dataAccessNotice;
            int iHashCode3 = (((((((iHashCode2 + (dataAccessNotice == null ? 0 : dataAccessNotice.hashCode())) * 31) + this.selectionMode.hashCode()) * 31) + Boolean.hashCode(this.singleAccount)) * 31) + Boolean.hashCode(this.stripeDirect)) * 31;
            String str2 = this.businessName;
            return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.userSelectedSingleAccountInInstitution);
        }

        public String toString() {
            return "Payload(skipAccountSelection=" + this.skipAccountSelection + ", accounts=" + this.accounts + ", dataAccessDisclaimer=" + this.dataAccessDisclaimer + ", dataAccessNotice=" + this.dataAccessNotice + ", selectionMode=" + this.selectionMode + ", singleAccount=" + this.singleAccount + ", stripeDirect=" + this.stripeDirect + ", businessName=" + this.businessName + ", userSelectedSingleAccountInInstitution=" + this.userSelectedSingleAccountInInstitution + ")";
        }

        public Payload(boolean z, List<PartnerAccount> accounts, String str, DataAccessNotice dataAccessNotice, SelectionMode selectionMode, boolean z2, boolean z3, String str2, boolean z4) {
            Intrinsics.checkNotNullParameter(accounts, "accounts");
            Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
            this.skipAccountSelection = z;
            this.accounts = accounts;
            this.dataAccessDisclaimer = str;
            this.dataAccessNotice = dataAccessNotice;
            this.selectionMode = selectionMode;
            this.singleAccount = z2;
            this.stripeDirect = z3;
            this.businessName = str2;
            this.userSelectedSingleAccountInInstitution = z4;
        }

        public final boolean getSkipAccountSelection() {
            return this.skipAccountSelection;
        }

        public final List<PartnerAccount> getAccounts() {
            return this.accounts;
        }

        public final String getDataAccessDisclaimer() {
            return this.dataAccessDisclaimer;
        }

        public final DataAccessNotice getDataAccessNotice() {
            return this.dataAccessNotice;
        }

        public final SelectionMode getSelectionMode() {
            return this.selectionMode;
        }

        public final boolean getSingleAccount() {
            return this.singleAccount;
        }

        public final boolean getStripeDirect() {
            return this.stripeDirect;
        }

        public final String getBusinessName() {
            return this.businessName;
        }

        public final boolean getUserSelectedSingleAccountInInstitution() {
            return this.userSelectedSingleAccountInInstitution;
        }

        public final List<PartnerAccount> getSelectableAccounts() {
            List<PartnerAccount> list = this.accounts;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((PartnerAccount) obj).getAllowSelection$financial_connections_release()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        public final boolean getShouldSkipPane() {
            return this.skipAccountSelection || this.userSelectedSingleAccountInInstitution;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AccountPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;", "", "<init>", "(Ljava/lang/String;I)V", "Single", "Multiple", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SelectionMode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SelectionMode[] $VALUES;
        public static final SelectionMode Single = new SelectionMode("Single", 0);
        public static final SelectionMode Multiple = new SelectionMode("Multiple", 1);

        private static final /* synthetic */ SelectionMode[] $values() {
            return new SelectionMode[]{Single, Multiple};
        }

        public static EnumEntries<SelectionMode> getEntries() {
            return $ENTRIES;
        }

        private SelectionMode(String str, int i) {
        }

        static {
            SelectionMode[] selectionModeArr$values = $values();
            $VALUES = selectionModeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(selectionModeArr$values);
        }

        public static SelectionMode valueOf(String str) {
            return (SelectionMode) Enum.valueOf(SelectionMode.class, str);
        }

        public static SelectionMode[] values() {
            return (SelectionMode[]) $VALUES.clone();
        }
    }

    /* compiled from: AccountPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;", "", "<init>", "()V", "OpenUrl", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class ViewEffect {
        public static final int $stable = 0;

        public /* synthetic */ ViewEffect(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ViewEffect() {
        }

        /* compiled from: AccountPickerViewModel.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;", "url", "", "id", "", "<init>", "(Ljava/lang/String;J)V", "getUrl", "()Ljava/lang/String;", "getId", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
