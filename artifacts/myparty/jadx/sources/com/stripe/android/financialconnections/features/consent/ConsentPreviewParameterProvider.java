package com.stripe.android.financialconnections.features.consent;

import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.financialconnections.features.consent.ConsentState;
import com.stripe.android.financialconnections.model.Bullet;
import com.stripe.android.financialconnections.model.ConnectedAccessNotice;
import com.stripe.android.financialconnections.model.ConsentPane;
import com.stripe.android.financialconnections.model.ConsentPaneBody;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.DataAccessNoticeBody;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.LegalDetailsBody;
import com.stripe.android.financialconnections.model.LegalDetailsNotice;
import com.stripe.android.financialconnections.model.ServerLink;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.ui.theme.Theme;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

/* compiled from: ConsentPreviewParameterProvider.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider$ConsentPreviewState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", NewHtcHomeBadger.COUNT, "", "getCount", "()I", "withPlatformLogos", "withConnectedAccountLogos", "manualEntryPlusMicrodeposits", "instantDebits", "sampleConsent", "Lcom/stripe/android/financialconnections/model/ConsentPane;", "bullets", "", "Lcom/stripe/android/financialconnections/model/Bullet;", "ConsentPreviewState", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConsentPreviewParameterProvider implements PreviewParameterProvider<ConsentPreviewState> {
    public static final int $stable = 8;
    private final Sequence<ConsentPreviewState> values = SequencesKt.sequenceOf(withPlatformLogos(), withConnectedAccountLogos(), manualEntryPlusMicrodeposits(), instantDebits());

    /* compiled from: ConsentPreviewParameterProvider.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider$ConsentPreviewState;", "", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/financialconnections/features/consent/ConsentState;", "theme", "Lcom/stripe/android/financialconnections/ui/theme/Theme;", "<init>", "(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Lcom/stripe/android/financialconnections/ui/theme/Theme;)V", "getState", "()Lcom/stripe/android/financialconnections/features/consent/ConsentState;", "getTheme", "()Lcom/stripe/android/financialconnections/ui/theme/Theme;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConsentPreviewState {
        public static final int $stable = 8;
        private final ConsentState state;
        private final Theme theme;

        public static /* synthetic */ ConsentPreviewState copy$default(ConsentPreviewState consentPreviewState, ConsentState consentState, Theme theme, int i, Object obj) {
            if ((i & 1) != 0) {
                consentState = consentPreviewState.state;
            }
            if ((i & 2) != 0) {
                theme = consentPreviewState.theme;
            }
            return consentPreviewState.copy(consentState, theme);
        }

        /* renamed from: component1, reason: from getter */
        public final ConsentState getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final Theme getTheme() {
            return this.theme;
        }

        public final ConsentPreviewState copy(ConsentState state, Theme theme) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(theme, "theme");
            return new ConsentPreviewState(state, theme);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConsentPreviewState)) {
                return false;
            }
            ConsentPreviewState consentPreviewState = (ConsentPreviewState) other;
            return Intrinsics.areEqual(this.state, consentPreviewState.state) && this.theme == consentPreviewState.theme;
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.theme.hashCode();
        }

        public String toString() {
            return "ConsentPreviewState(state=" + this.state + ", theme=" + this.theme + ")";
        }

        public ConsentPreviewState(ConsentState state, Theme theme) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(theme, "theme");
            this.state = state;
            this.theme = theme;
        }

        public final ConsentState getState() {
            return this.state;
        }

        public final Theme getTheme() {
            return this.theme;
        }
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public Sequence<ConsentPreviewState> getValues() {
        return this.values;
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public int getCount() {
        return super.getCount();
    }

    private final ConsentPreviewState withPlatformLogos() {
        return new ConsentPreviewState(new ConsentState(new Async.Success(new ConsentState.Payload(ConsentPane.copy$default(sampleConsent(), null, null, null, null, null, null, null, 125, null), CollectionsKt.listOf((Object[]) new String[]{"www.logo1.com", "www.logo2.com"}), true, true)), null, null, null, 14, null), Theme.DefaultLight);
    }

    private final ConsentPreviewState withConnectedAccountLogos() {
        return new ConsentPreviewState(new ConsentState(new Async.Success(new ConsentState.Payload(ConsentPane.copy$default(sampleConsent(), null, null, null, null, null, null, null, 125, null), CollectionsKt.listOf((Object[]) new String[]{"www.logo1.com", "www.logo2.com", "www.logo3.com"}), true, true)), null, null, null, 14, null), Theme.DefaultLight);
    }

    private final ConsentPreviewState manualEntryPlusMicrodeposits() {
        return new ConsentPreviewState(new ConsentState(new Async.Success(new ConsentState.Payload(sampleConsent(), CollectionsKt.listOf((Object[]) new String[]{"www.logo1.com", "www.logo2.com"}), false, true)), null, null, null, 14, null), Theme.DefaultLight);
    }

    private final ConsentPreviewState instantDebits() {
        return new ConsentPreviewState(new ConsentState(new Async.Success(new ConsentState.Payload(sampleConsent(), CollectionsKt.listOf((Object[]) new String[]{"www.logo1.com", "www.logo2.com"}), false, false)), null, null, null, 14, null), Theme.LinkLight);
    }

    private final ConsentPane sampleConsent() {
        return new ConsentPane("Manually verify instead (takes 1-2 business days)", "Stripe will allow Goldilocks to access only the data requested. We never share your login details with them.", new ConsentPaneBody(CollectionsKt.listOf((Object[]) new Bullet[]{new Bullet("Stripe will allow Goldilocks to access only the data requested", new Image("https://www.cdn.stripe.com/12321312321.png"), "Stripe will allow Goldilocks to access only the data requested"), new Bullet((String) null, new Image("https://www.cdn.stripe.com/12321312321.png"), "Stripe will allow Goldilocks to access only the data requested", 1, (DefaultConstructorMarker) null), new Bullet((String) null, new Image("https://www.cdn.stripe.com/12321312321.png"), "Stripe will allow Goldilocks to access only the data requested", 1, (DefaultConstructorMarker) null)})), "Agree", new DataAccessNotice(new Image("https://www.cdn.stripe.com/12321312321.png"), "Goldilocks uses Stripe to link your accounts", "Goldilocks will use your account and routing number, balances and transactions:", new DataAccessNoticeBody(bullets()), new ConnectedAccessNotice("Connected account placeholder", new DataAccessNoticeBody(bullets())), "Learn more about data access", "OK"), new LegalDetailsNotice(new Image("https://www.cdn.stripe.com/12321312321.png"), "Terms and privacy policy", "Stripe only uses your data and credentials as described in the Terms, such as to improve its services, manage loss, and mitigate fraud.", new LegalDetailsBody(CollectionsKt.listOf((Object[]) new ServerLink[]{new ServerLink("Terms", (String) null, 2, (DefaultConstructorMarker) null), new ServerLink("Privacy Policy", (String) null, 2, (DefaultConstructorMarker) null)})), "OK", "Learn more"), "Goldilocks uses Stripe to link your accounts");
    }

    private final List<Bullet> bullets() {
        return CollectionsKt.listOf((Object[]) new Bullet[]{new Bullet(null, new Image("https://www.cdn.stripe.com/12321312321.png"), "Account details"), new Bullet(null, new Image("https://www.cdn.stripe.com/12321312321.png"), "Balances"), new Bullet(null, new Image("https://www.cdn.stripe.com/12321312321.png"), "Transactions")});
    }
}
