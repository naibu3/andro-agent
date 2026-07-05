package com.stripe.android.financialconnections.features.linkaccountpicker;

import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.stripe.android.core.networking.NetworkConstantsKt;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerState;
import com.stripe.android.financialconnections.model.AddNewAccount;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.NetworkedAccount;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.model.ReturningNetworkingUserAccountPicker;
import com.stripe.android.financialconnections.presentation.Async;
import defpackage.FinancialConnectionsGenericInfoScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: LinkAccountPickerPreviewParameterProvider.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "canonical", "loading", "oneAccount", "accountSelected", "partnerAccountList", "", "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;", "display", "Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkAccountPickerPreviewParameterProvider implements PreviewParameterProvider<LinkAccountPickerState> {
    public static final int $stable = 8;
    private final Sequence<LinkAccountPickerState> values = SequencesKt.sequenceOf(canonical(), loading(), accountSelected(), oneAccount());

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public Sequence<LinkAccountPickerState> getValues() {
        return this.values;
    }

    private final LinkAccountPickerState canonical() {
        String title = display().getTitle();
        List<LinkedAccount> listPartnerAccountList = partnerAccountList();
        List listEmptyList = CollectionsKt.emptyList();
        AddNewAccount addNewAccount = display().getAddNewAccount();
        if (addNewAccount != null) {
            return new LinkAccountPickerState(new Async.Success(new LinkAccountPickerState.Payload(title, listPartnerAccountList, listEmptyList, addNewAccount, "secret", display().getDefaultCta(), FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER, MapsKt.emptyMap(), true, display().getMultipleAccountTypesSelectedDataAccessNotice(), display().getAboveCta(), null, false)), null, null, 6, null);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final LinkAccountPickerState loading() {
        return new LinkAccountPickerState(new Async.Loading(null, 1, null), null, null, 6, null);
    }

    private final LinkAccountPickerState oneAccount() {
        String title = display().getTitle();
        List<LinkedAccount> listSubList = partnerAccountList().subList(0, 1);
        List listEmptyList = CollectionsKt.emptyList();
        AddNewAccount addNewAccount = display().getAddNewAccount();
        if (addNewAccount != null) {
            return new LinkAccountPickerState(new Async.Success(new LinkAccountPickerState.Payload(title, listSubList, listEmptyList, addNewAccount, "secret", display().getDefaultCta(), FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER, MapsKt.emptyMap(), true, display().getMultipleAccountTypesSelectedDataAccessNotice(), display().getAboveCta(), null, false)), null, null, 6, null);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final LinkAccountPickerState accountSelected() {
        String title = display().getTitle();
        List<LinkedAccount> listPartnerAccountList = partnerAccountList();
        List listListOf = CollectionsKt.listOf(((LinkedAccount) CollectionsKt.first((List) partnerAccountList())).getAccount().getId());
        AddNewAccount addNewAccount = display().getAddNewAccount();
        if (addNewAccount != null) {
            return new LinkAccountPickerState(new Async.Success(new LinkAccountPickerState.Payload(title, listPartnerAccountList, listListOf, addNewAccount, "secret", display().getDefaultCta(), FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER, MapsKt.emptyMap(), true, display().getMultipleAccountTypesSelectedDataAccessNotice(), display().getAboveCta(), null, false)), null, null, 6, null);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final List<LinkedAccount> partnerAccountList() {
        FinancialConnectionsAccount.Category category = FinancialConnectionsAccount.Category.CASH;
        FinancialConnectionsAccount.Status status = FinancialConnectionsAccount.Status.ACTIVE;
        FinancialConnectionsInstitution financialConnectionsInstitutionInstitution = institution();
        return CollectionsKt.listOf((Object[]) new LinkedAccount[]{new LinkedAccount(new PartnerAccount(NetworkConstantsKt.HEADER_AUTHORIZATION, category, "id0", "Repairable Account", FinancialConnectionsAccount.Subcategory.CHECKING, CollectionsKt.emptyList(), (Integer) 1000, "USD", financialConnectionsInstitutionInstitution, "1234", (Integer) null, (String) null, (Boolean) true, "", FinancialConnectionsSessionManifest.Pane.BANK_AUTH_REPAIR, (String) null, (String) null, (String) null, status, 232448, (DefaultConstructorMarker) null), new NetworkedAccount("id0", true, "Select to repair and connect", "Repair and connect account", new Image("https://b.stripecdn.com/connections-statics-srv/assets/SailIcon--warning-orange-3x.png"), (Image) null, (Image) null, (DataAccessNotice) null, (FinancialConnectionsGenericInfoScreen) null, 480, (DefaultConstructorMarker) null)), new LinkedAccount(new PartnerAccount(NetworkConstantsKt.HEADER_AUTHORIZATION, FinancialConnectionsAccount.Category.CASH, "id1", "With balance", FinancialConnectionsAccount.Subcategory.CHECKING, CollectionsKt.emptyList(), (Integer) 1000, "USD", institution(), "1234", (Integer) null, (String) null, (Boolean) true, "", (FinancialConnectionsSessionManifest.Pane) null, (String) null, (String) null, (String) null, FinancialConnectionsAccount.Status.ACTIVE, 248832, (DefaultConstructorMarker) null), new NetworkedAccount("id1", true, (String) null, (String) null, (Image) null, (Image) null, (Image) null, (DataAccessNotice) null, (FinancialConnectionsGenericInfoScreen) null, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, (DefaultConstructorMarker) null)), new LinkedAccount(new PartnerAccount(NetworkConstantsKt.HEADER_AUTHORIZATION, FinancialConnectionsAccount.Category.CASH, "id2", "With balance disabled", FinancialConnectionsAccount.Subcategory.SAVINGS, CollectionsKt.emptyList(), (Integer) 1000, (String) null, institution(), (String) null, (Integer) null, (String) null, (Boolean) false, "Disconnected", (FinancialConnectionsSessionManifest.Pane) null, (String) null, (String) null, (String) null, (FinancialConnectionsAccount.Status) null, 511616, (DefaultConstructorMarker) null), new NetworkedAccount("id2", false, (String) null, (String) null, (Image) null, (Image) null, (Image) null, (DataAccessNotice) null, (FinancialConnectionsGenericInfoScreen) null, TypedValues.PositionType.TYPE_CURVE_FIT, (DefaultConstructorMarker) null)), new LinkedAccount(new PartnerAccount(NetworkConstantsKt.HEADER_AUTHORIZATION, FinancialConnectionsAccount.Category.CASH, "id3", "No balance", FinancialConnectionsAccount.Subcategory.CREDIT_CARD, CollectionsKt.emptyList(), (Integer) null, (String) null, institution(), "1234", (Integer) null, (String) null, (Boolean) true, "", (FinancialConnectionsSessionManifest.Pane) null, (String) null, (String) null, (String) null, (FinancialConnectionsAccount.Status) null, 511168, (DefaultConstructorMarker) null), new NetworkedAccount("id3", true, (String) null, (String) null, (Image) null, (Image) null, (Image) null, (DataAccessNotice) null, (FinancialConnectionsGenericInfoScreen) null, TypedValues.PositionType.TYPE_CURVE_FIT, (DefaultConstructorMarker) null)), new LinkedAccount(new PartnerAccount(NetworkConstantsKt.HEADER_AUTHORIZATION, FinancialConnectionsAccount.Category.CASH, "id4", "No balance disabled", FinancialConnectionsAccount.Subcategory.CHECKING, CollectionsKt.emptyList(), (Integer) null, (String) null, institution(), "1234", (Integer) null, (String) null, (Boolean) false, "Disconnected", (FinancialConnectionsSessionManifest.Pane) null, (String) null, (String) null, (String) null, (FinancialConnectionsAccount.Status) null, 511168, (DefaultConstructorMarker) null), new NetworkedAccount("id4", false, (String) null, (String) null, (Image) null, (Image) null, (Image) null, (DataAccessNotice) null, (FinancialConnectionsGenericInfoScreen) null, TypedValues.PositionType.TYPE_CURVE_FIT, (DefaultConstructorMarker) null)), new LinkedAccount(new PartnerAccount(NetworkConstantsKt.HEADER_AUTHORIZATION, FinancialConnectionsAccount.Category.CASH, "id5", "Very long institution that is already linked", FinancialConnectionsAccount.Subcategory.CHECKING, CollectionsKt.emptyList(), (Integer) null, (String) null, institution(), "1234", (Integer) null, (String) null, (Boolean) true, (String) null, (FinancialConnectionsSessionManifest.Pane) null, (String) null, "linkedAccountId", (String) null, (FinancialConnectionsAccount.Status) null, 453824, (DefaultConstructorMarker) null), new NetworkedAccount("id5", true, (String) null, (String) null, (Image) null, (Image) null, (Image) null, (DataAccessNotice) null, (FinancialConnectionsGenericInfoScreen) null, TypedValues.PositionType.TYPE_CURVE_FIT, (DefaultConstructorMarker) null))});
    }

    public final ReturningNetworkingUserAccountPicker display() {
        return new ReturningNetworkingUserAccountPicker("Select account", "Connect account", new AddNewAccount("New bank account", new Image("https://b.stripecdn.com/connections-statics-srv/assets/SailIcon--add-purple-3x.png")), CollectionsKt.emptyList(), "Above CTA coming from backend.", (DataAccessNotice) null, 32, (DefaultConstructorMarker) null);
    }

    public final FinancialConnectionsInstitution institution() {
        return new FinancialConnectionsInstitution(true, "in_123", true, "Bank of America", new Image("https://b.stripecdn.com/connections-statics-srv/assets/InstitutionIcons/bankofamerica.png"), (Image) null, (Integer) null, (String) null, 224, (DefaultConstructorMarker) null);
    }
}
