package com.stripe.android.lpmfoundations.paymentmethod.link;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.LinkConfigurationCoordinator;
import com.stripe.android.link.ui.inline.InlineSignupViewState;
import com.stripe.android.link.ui.inline.LinkElementKt;
import com.stripe.android.link.ui.inline.LinkSignupMode;
import com.stripe.android.link.ui.inline.UserInput;
import com.stripe.android.ui.core.elements.RenderableFormElement;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: LinkFormElement.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00130\u00120\u0011H\u0016J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018H\u0017¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/lpmfoundations/paymentmethod/link/LinkFormElement;", "Lcom/stripe/android/ui/core/elements/RenderableFormElement;", "signupMode", "Lcom/stripe/android/link/ui/inline/LinkSignupMode;", "configuration", "Lcom/stripe/android/link/LinkConfiguration;", "linkConfigurationCoordinator", "Lcom/stripe/android/link/LinkConfigurationCoordinator;", "initialLinkUserInput", "Lcom/stripe/android/link/ui/inline/UserInput;", "onLinkInlineSignupStateChanged", "Lkotlin/Function1;", "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;", "", "<init>", "(Lcom/stripe/android/link/ui/inline/LinkSignupMode;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/LinkConfigurationCoordinator;Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/jvm/functions/Function1;)V", "getFormFieldValueFlow", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "ComposeUI", ViewProps.ENABLED, "", "(ZLandroidx/compose/runtime/Composer;I)V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkFormElement extends RenderableFormElement {
    public static final int $stable = 8;
    private final LinkConfiguration configuration;
    private final UserInput initialLinkUserInput;
    private final LinkConfigurationCoordinator linkConfigurationCoordinator;
    private final Function1<InlineSignupViewState, Unit> onLinkInlineSignupStateChanged;
    private final LinkSignupMode signupMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LinkFormElement(LinkSignupMode signupMode, LinkConfiguration configuration, LinkConfigurationCoordinator linkConfigurationCoordinator, UserInput userInput, Function1<? super InlineSignupViewState, Unit> onLinkInlineSignupStateChanged) {
        super(IdentifierSpec.INSTANCE.Generic("link_form"), true);
        Intrinsics.checkNotNullParameter(signupMode, "signupMode");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        Intrinsics.checkNotNullParameter(onLinkInlineSignupStateChanged, "onLinkInlineSignupStateChanged");
        this.signupMode = signupMode;
        this.configuration = configuration;
        this.linkConfigurationCoordinator = linkConfigurationCoordinator;
        this.initialLinkUserInput = userInput;
        this.onLinkInlineSignupStateChanged = onLinkInlineSignupStateChanged;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public StateFlow<List<Pair<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        return StateFlowsKt.stateFlowOf(CollectionsKt.emptyList());
    }

    @Override // com.stripe.android.ui.core.elements.RenderableFormElement
    public void ComposeUI(boolean z, Composer composer, int i) {
        Modifier.Companion companionM1022paddingVpY3zN4$default;
        composer.startReplaceGroup(-736893023);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-736893023, i, -1, "com.stripe.android.lpmfoundations.paymentmethod.link.LinkFormElement.ComposeUI (LinkFormElement.kt:34)");
        }
        composer.startReplaceGroup(-1298472076);
        Modifier.Companion companion = Modifier.INSTANCE;
        ProvidableCompositionLocal<Float> localSectionSpacing = StripeThemeKt.getLocalSectionSpacing();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localSectionSpacing);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (objConsume == null) {
            companionM1022paddingVpY3zN4$default = PaddingKt.m1022paddingVpY3zN4$default(companion, 0.0f, Dp.m6117constructorimpl(6), 1, null);
        } else {
            companionM1022paddingVpY3zN4$default = companion;
        }
        composer.endReplaceGroup();
        LinkElementKt.LinkElement(this.initialLinkUserInput, this.linkConfigurationCoordinator, this.configuration, this.signupMode, z, this.onLinkInlineSignupStateChanged, companionM1022paddingVpY3zN4$default, composer, (i << 12) & 57344, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
