package com.stripe.android.lpmfoundations.paymentmethod.definitions;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.link.ui.LinkTermsKt;
import com.stripe.android.link.ui.inline.InlineSignupViewState;
import com.stripe.android.link.ui.inline.LinkSignupMode;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.ui.core.elements.MandateTextUIKt;
import com.stripe.android.ui.core.elements.RenderableFormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import com.stripe.android.uicore.utils.StateFlowsKt;
import expo.modules.notifications.service.NotificationsService;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CardDefinition.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u00110\u00100\u000bH\u0016J\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007H\u0017¢\u0006\u0002\u0010\u0019R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015¨\u0006\u001a²\u0006\f\u0010\u001b\u001a\u0004\u0018\u00010\fX\u008a\u0084\u0002"}, d2 = {"Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CombinedLinkMandateElement;", "Lcom/stripe/android/ui/core/elements/RenderableFormElement;", NotificationsService.IDENTIFIER_KEY, "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "signupMode", "Lcom/stripe/android/link/ui/inline/LinkSignupMode;", "canChangeSaveForFutureUse", "", "merchantName", "", "linkSignupStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/link/ui/inline/LinkSignupMode;ZLjava/lang/String;Lkotlinx/coroutines/flow/StateFlow;)V", "getFormFieldValueFlow", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "topPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ComposeUI", "", ViewProps.ENABLED, "(ZLandroidx/compose/runtime/Composer;I)V", "paymentsheet_release", "linkState"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CombinedLinkMandateElement extends RenderableFormElement {
    public static final int $stable = 8;
    private final StateFlow<InlineSignupViewState> linkSignupStateFlow;
    private final String merchantName;
    private final float topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedLinkMandateElement(IdentifierSpec identifier, LinkSignupMode linkSignupMode, boolean z, String merchantName, StateFlow<InlineSignupViewState> linkSignupStateFlow) {
        float fM6117constructorimpl;
        super(identifier, false);
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(linkSignupStateFlow, "linkSignupStateFlow");
        this.merchantName = merchantName;
        this.linkSignupStateFlow = linkSignupStateFlow;
        if (linkSignupMode != LinkSignupMode.AlongsideSaveForFutureUse) {
            if (linkSignupMode == LinkSignupMode.InsteadOfSaveForFutureUse) {
                fM6117constructorimpl = Dp.m6117constructorimpl(4);
            } else if (z) {
                fM6117constructorimpl = Dp.m6117constructorimpl(6);
            } else {
                fM6117constructorimpl = Dp.m6117constructorimpl(2);
            }
        } else {
            fM6117constructorimpl = Dp.m6117constructorimpl(0);
        }
        this.topPadding = fM6117constructorimpl;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public StateFlow<List<Pair<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        return StateFlowsKt.stateFlowOf(CollectionsKt.emptyList());
    }

    @Override // com.stripe.android.ui.core.elements.RenderableFormElement
    public void ComposeUI(boolean z, Composer composer, int i) {
        String strReplaceHyperlinks;
        composer.startReplaceGroup(-1594081525);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1594081525, i, -1, "com.stripe.android.lpmfoundations.paymentmethod.definitions.CombinedLinkMandateElement.ComposeUI (CardDefinition.kt:312)");
        }
        InlineSignupViewState inlineSignupViewStateComposeUI$lambda$0 = ComposeUI$lambda$0(StateFlowsComposeKt.collectAsState(this.linkSignupStateFlow, null, composer, 0, 1));
        if (inlineSignupViewStateComposeUI$lambda$0 != null && inlineSignupViewStateComposeUI$lambda$0.isExpanded$paymentsheet_release()) {
            composer.startReplaceGroup(1568874641);
            strReplaceHyperlinks = LinkTermsKt.replaceHyperlinks(StringResources_androidKt.stringResource(R.string.stripe_paymentsheet_card_mandate_signup_toggle_on, new Object[]{this.merchantName}, composer, 0));
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1569115728);
            strReplaceHyperlinks = LinkTermsKt.replaceHyperlinks(StringResources_androidKt.stringResource(R.string.stripe_paymentsheet_card_mandate_signup_toggle_off, new Object[]{this.merchantName}, composer, 0));
            composer.endReplaceGroup();
        }
        MandateTextUIKt.m8662MandateJ7GKdg(strReplaceHyperlinks, PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, this.topPadding, 0.0f, 0.0f, 13, null), 0, 0, null, composer, 0, 28);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    private static final InlineSignupViewState ComposeUI$lambda$0(State<InlineSignupViewState> state) {
        return state.getValue();
    }
}
