package com.stripe.android.financialconnections.features.accountpicker;

import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import androidx.exifinterface.media.ExifInterface;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.networking.NetworkConstantsKt;
import com.stripe.android.financialconnections.exception.AccountNoneEligibleForPaymentMethodError;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.model.Bullet;
import com.stripe.android.financialconnections.model.ConnectedAccessNotice;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.DataAccessNoticeBody;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.presentation.Async;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

/* compiled from: AccountPickerPreviewParameterProvider.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014H\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", NewHtcHomeBadger.COUNT, "", "getCount", "()I", "loading", "error", "multiSelect", "singleSelect", "dataAccessNotice", "Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "bullets", "", "Lcom/stripe/android/financialconnections/model/Bullet;", "partnerAccountList", "Lcom/stripe/android/financialconnections/model/PartnerAccount;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AccountPickerPreviewParameterProvider implements PreviewParameterProvider<AccountPickerState> {
    public static final int $stable = 8;
    private final Sequence<AccountPickerState> values = SequencesKt.sequenceOf(loading(), error(), multiSelect(), singleSelect());

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public Sequence<AccountPickerState> getValues() {
        return this.values;
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public int getCount() {
        return super.getCount();
    }

    private final AccountPickerState loading() {
        return new AccountPickerState(null, new Async.Loading(null, 1, null), false, null, SetsKt.emptySet(), null, 45, null);
    }

    private final AccountPickerState error() {
        return new AccountPickerState(null, new Async.Fail(new AccountNoneEligibleForPaymentMethodError(1, new FinancialConnectionsInstitution(false, ExifInterface.GPS_MEASUREMENT_2D, false, "Institution 2", null, null, null, "Institution 2 url"), "Merchant name", new APIException(null, null, 0, null, null, 31, null))), false, null, SetsKt.emptySet(), null, 45, null);
    }

    private final AccountPickerState multiSelect() {
        return new AccountPickerState(new Async.Success(new FinancialConnectionsInstitution(false, "1", false, "Institution 1", new Image(""), null, null, "Institution 1 url")), new Async.Success(new AccountPickerState.Payload(false, partnerAccountList(), "My business can access account details, balances, account ownership details and transactions. <a href=\"https://stripe.com\">Learn more</a>", dataAccessNotice(), AccountPickerState.SelectionMode.Multiple, false, false, "Random business", false)), false, null, SetsKt.setOf((Object[]) new String[]{"id1", "id3"}), null, 44, null);
    }

    private final AccountPickerState singleSelect() {
        return new AccountPickerState(new Async.Success(new FinancialConnectionsInstitution(false, "1", false, "Institution 1", new Image(""), null, null, "Institution 1 url")), new Async.Success(new AccountPickerState.Payload(false, partnerAccountList(), null, dataAccessNotice(), AccountPickerState.SelectionMode.Single, true, false, "Random business", false)), false, null, SetsKt.setOf("id1"), null, 44, null);
    }

    private final DataAccessNotice dataAccessNotice() {
        return new DataAccessNotice(new Image("https://www.cdn.stripe.com/12321312321.png"), "Goldilocks uses Stripe to link your accounts", "Goldilocks will use your account and routing number, balances and transactions:", new DataAccessNoticeBody(bullets()), new ConnectedAccessNotice("Connected account placeholder", new DataAccessNoticeBody(bullets())), "Learn more about data access", "OK");
    }

    private final List<Bullet> bullets() {
        return CollectionsKt.listOf((Object[]) new Bullet[]{new Bullet("Account number, routing number, account type, account nickname.", new Image("https://www.cdn.stripe.com/12321312321.png"), "Account details"), new Bullet("Account number, routing number, account type, account nickname.", new Image("https://www.cdn.stripe.com/12321312321.png"), "Account details")});
    }

    private final List<PartnerAccount> partnerAccountList() {
        return CollectionsKt.listOf((Object[]) new PartnerAccount[]{new PartnerAccount(NetworkConstantsKt.HEADER_AUTHORIZATION, FinancialConnectionsAccount.Category.CASH, "id1", "With balance", FinancialConnectionsAccount.Subcategory.CHECKING, CollectionsKt.emptyList(), (Integer) 1000, "$", (FinancialConnectionsInstitution) null, "1234", (Integer) null, (String) null, (Boolean) true, "", (FinancialConnectionsSessionManifest.Pane) null, (String) null, (String) null, (String) null, (FinancialConnectionsAccount.Status) null, 511232, (DefaultConstructorMarker) null), new PartnerAccount(NetworkConstantsKt.HEADER_AUTHORIZATION, FinancialConnectionsAccount.Category.CASH, "id2", "With balance disabled", FinancialConnectionsAccount.Subcategory.SAVINGS, CollectionsKt.emptyList(), (Integer) 1000, (String) null, (FinancialConnectionsInstitution) null, (String) null, (Integer) null, (String) null, (Boolean) false, "Cannot be selected", (FinancialConnectionsSessionManifest.Pane) null, (String) null, (String) null, (String) null, (FinancialConnectionsAccount.Status) null, 511872, (DefaultConstructorMarker) null), new PartnerAccount(NetworkConstantsKt.HEADER_AUTHORIZATION, FinancialConnectionsAccount.Category.CASH, "id3", "No balance", FinancialConnectionsAccount.Subcategory.CREDIT_CARD, CollectionsKt.emptyList(), (Integer) null, (String) null, (FinancialConnectionsInstitution) null, "1234", (Integer) null, (String) null, (Boolean) true, "Cannot be selected", (FinancialConnectionsSessionManifest.Pane) null, (String) null, (String) null, (String) null, (FinancialConnectionsAccount.Status) null, 511424, (DefaultConstructorMarker) null), new PartnerAccount(NetworkConstantsKt.HEADER_AUTHORIZATION, FinancialConnectionsAccount.Category.CASH, "id4", "No balance disabled", FinancialConnectionsAccount.Subcategory.CHECKING, CollectionsKt.emptyList(), (Integer) null, (String) null, (FinancialConnectionsInstitution) null, "1234", (Integer) null, (String) null, (Boolean) false, "Cannot be selected", (FinancialConnectionsSessionManifest.Pane) null, (String) null, (String) null, (String) null, (FinancialConnectionsAccount.Status) null, 511424, (DefaultConstructorMarker) null), new PartnerAccount(NetworkConstantsKt.HEADER_AUTHORIZATION, FinancialConnectionsAccount.Category.CASH, "id5", "Very long institution that is already linked", FinancialConnectionsAccount.Subcategory.CHECKING, CollectionsKt.emptyList(), (Integer) null, (String) null, (FinancialConnectionsInstitution) null, "1234", (Integer) null, (String) null, (Boolean) true, (String) null, (FinancialConnectionsSessionManifest.Pane) null, (String) null, "linkedAccountId", (String) null, (FinancialConnectionsAccount.Status) null, 454080, (DefaultConstructorMarker) null)});
    }
}
