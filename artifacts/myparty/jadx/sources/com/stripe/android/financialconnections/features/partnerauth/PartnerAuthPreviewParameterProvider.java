package com.stripe.android.financialconnections.features.partnerauth;

import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import com.stripe.android.financialconnections.features.partnerauth.SharedPartnerAuthState;
import com.stripe.android.financialconnections.model.AccountPickerPane;
import com.stripe.android.financialconnections.model.Body;
import com.stripe.android.financialconnections.model.ConsentPane;
import com.stripe.android.financialconnections.model.Cta;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.Display;
import com.stripe.android.financialconnections.model.Entry;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.IDConsentContentPane;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.LinkLoginPane;
import com.stripe.android.financialconnections.model.NetworkingLinkSignupPane;
import com.stripe.android.financialconnections.model.OauthPrepane;
import com.stripe.android.financialconnections.model.PartnerNotice;
import com.stripe.android.financialconnections.model.ReturningNetworkingUserAccountPicker;
import com.stripe.android.financialconnections.model.SuccessPane;
import com.stripe.android.financialconnections.model.TextUpdate;
import com.stripe.android.financialconnections.presentation.Async;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

/* compiled from: PartnerAuthPreviewParameterProvider.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", NewHtcHomeBadger.COUNT, "", "getCount", "()I", "canonical", "prepaneLoading", "browserLoading", "session", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "oauthPrepane", "Lcom/stripe/android/financialconnections/model/OauthPrepane;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PartnerAuthPreviewParameterProvider implements PreviewParameterProvider<SharedPartnerAuthState> {
    public static final int $stable = 8;
    private final Sequence<SharedPartnerAuthState> values = SequencesKt.sequenceOf(canonical(), prepaneLoading(), browserLoading());

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public Sequence<SharedPartnerAuthState> getValues() {
        return this.values;
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public int getCount() {
        return super.getCount();
    }

    private final SharedPartnerAuthState canonical() {
        return new SharedPartnerAuthState(FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH, new Async.Success(new SharedPartnerAuthState.Payload(false, new FinancialConnectionsInstitution(true, "id", false, "name", null, null, null, "url"), session())), null, Async.Uninitialized.INSTANCE, false, 16, null);
    }

    private final SharedPartnerAuthState prepaneLoading() {
        return new SharedPartnerAuthState(FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH, new Async.Loading(null, 1, null), null, Async.Uninitialized.INSTANCE, false, 16, null);
    }

    private final SharedPartnerAuthState browserLoading() {
        return new SharedPartnerAuthState(FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH, new Async.Success(new SharedPartnerAuthState.Payload(false, new FinancialConnectionsInstitution(true, "id", false, "name", null, null, null, "url"), session())), null, new Async.Loading(null, 1, null), false, 16, null);
    }

    private final FinancialConnectionsAuthorizationSession session() {
        return new FinancialConnectionsAuthorizationSession("1234", FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH, "FINICITY_CONNECT_V2_OAUTH", (Boolean) null, (Boolean) true, (Boolean) null, (String) null, (String) null, (Boolean) true, new Display(new TextUpdate((AccountPickerPane) null, (ConsentPane) null, (LinkLoginPane) null, (NetworkingLinkSignupPane) null, oauthPrepane(), (ReturningNetworkingUserAccountPicker) null, (SuccessPane) null, (IDConsentContentPane) null, 239, (DefaultConstructorMarker) null)), 232, (DefaultConstructorMarker) null);
    }

    private final OauthPrepane oauthPrepane() {
        return new OauthPrepane(new Body(CollectionsKt.listOf((Object[]) new Entry[]{new Entry.Image(new Image("https://b.stripecdn.com/connections-statics-srv/assets/PrepaneAsset--account_numbers-capitalone-2x.gif")), new Entry.Text("Dynamic content placeholder that will show below image.")})), new Cta(null, "Continue!"), new Image("www.image.url"), new PartnerNotice(new Image("https://b.stripecdn.com/connections-statics-srv/assets/PrepaneAsset--account_numbers-capitalone-2x.gif"), "Stripe works with partners like MX to reliably offer access to thousands of financial institutions. Learn more"), (DataAccessNotice) null, "Sign in with Sample bank", "Next, you'll be prompted to log in and connect your accounts.", 16, (DefaultConstructorMarker) null);
    }
}
