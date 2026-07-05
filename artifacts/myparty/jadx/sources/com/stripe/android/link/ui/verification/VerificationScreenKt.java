package com.stripe.android.link.ui.verification;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.uicore.elements.OTPElement;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: VerificationScreen.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"VerificationScreen", "", "viewModel", "Lcom/stripe/android/link/ui/verification/VerificationViewModel;", "(Lcom/stripe/android/link/ui/verification/VerificationViewModel;Landroidx/compose/runtime/Composer;I)V", "VerificationPreview", "(Landroidx/compose/runtime/Composer;I)V", "paymentsheet_release", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/link/ui/verification/VerificationViewState;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerificationScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerificationPreview$lambda$7(int i, Composer composer, int i2) {
        VerificationPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerificationScreen$lambda$6(VerificationViewModel verificationViewModel, int i, Composer composer, int i2) {
        VerificationScreen(verificationViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void VerificationScreen(final VerificationViewModel viewModel, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-662325773);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-662325773, i2, -1, "com.stripe.android.link.ui.verification.VerificationScreen (VerificationScreen.kt:16)");
            }
            VerificationViewState verificationViewStateVerificationScreen$lambda$0 = VerificationScreen$lambda$0(StateFlowsComposeKt.collectAsState(viewModel.getViewState(), null, composerStartRestartGroup, 0, 1));
            OTPElement otpElement = viewModel.getOtpElement();
            composerStartRestartGroup.startReplaceGroup(1187132626);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewModel);
            VerificationScreenKt$VerificationScreen$1$1 verificationScreenKt$VerificationScreen$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || verificationScreenKt$VerificationScreen$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                verificationScreenKt$VerificationScreen$1$1RememberedValue = new VerificationScreenKt$VerificationScreen$1$1(viewModel);
                composerStartRestartGroup.updateRememberedValue(verificationScreenKt$VerificationScreen$1$1RememberedValue);
            }
            KFunction kFunction = (KFunction) verificationScreenKt$VerificationScreen$1$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1187134182);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(viewModel);
            VerificationScreenKt$VerificationScreen$2$1 verificationScreenKt$VerificationScreen$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || verificationScreenKt$VerificationScreen$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                verificationScreenKt$VerificationScreen$2$1RememberedValue = new VerificationScreenKt$VerificationScreen$2$1(viewModel);
                composerStartRestartGroup.updateRememberedValue(verificationScreenKt$VerificationScreen$2$1RememberedValue);
            }
            KFunction kFunction2 = (KFunction) verificationScreenKt$VerificationScreen$2$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1187136310);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(viewModel);
            VerificationScreenKt$VerificationScreen$3$1 verificationScreenKt$VerificationScreen$3$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || verificationScreenKt$VerificationScreen$3$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                verificationScreenKt$VerificationScreen$3$1RememberedValue = new VerificationScreenKt$VerificationScreen$3$1(viewModel);
                composerStartRestartGroup.updateRememberedValue(verificationScreenKt$VerificationScreen$3$1RememberedValue);
            }
            KFunction kFunction3 = (KFunction) verificationScreenKt$VerificationScreen$3$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1187137916);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(viewModel);
            VerificationScreenKt$VerificationScreen$4$1 verificationScreenKt$VerificationScreen$4$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || verificationScreenKt$VerificationScreen$4$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                verificationScreenKt$VerificationScreen$4$1RememberedValue = new VerificationScreenKt$VerificationScreen$4$1(viewModel);
                composerStartRestartGroup.updateRememberedValue(verificationScreenKt$VerificationScreen$4$1RememberedValue);
            }
            KFunction kFunction4 = (KFunction) verificationScreenKt$VerificationScreen$4$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1187140071);
            boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(viewModel);
            VerificationScreenKt$VerificationScreen$5$1 verificationScreenKt$VerificationScreen$5$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance5 || verificationScreenKt$VerificationScreen$5$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                verificationScreenKt$VerificationScreen$5$1RememberedValue = new VerificationScreenKt$VerificationScreen$5$1(viewModel);
                composerStartRestartGroup.updateRememberedValue(verificationScreenKt$VerificationScreen$5$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            VerificationBodyKt.VerificationBody(verificationViewStateVerificationScreen$lambda$0, otpElement, (Function0) kFunction, (Function0) kFunction4, (Function0) ((KFunction) verificationScreenKt$VerificationScreen$5$1RememberedValue), (Function0) kFunction2, (Function0) kFunction3, composerStartRestartGroup, OTPElement.$stable << 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.verification.VerificationScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return VerificationScreenKt.VerificationScreen$lambda$6(viewModel, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void VerificationPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-610945658);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-610945658, i, -1, "com.stripe.android.link.ui.verification.VerificationPreview (VerificationScreen.kt:32)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$VerificationScreenKt.INSTANCE.m7930getLambda1$paymentsheet_release(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.verification.VerificationScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return VerificationScreenKt.VerificationPreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final VerificationViewState VerificationScreen$lambda$0(State<VerificationViewState> state) {
        return state.getValue();
    }
}
