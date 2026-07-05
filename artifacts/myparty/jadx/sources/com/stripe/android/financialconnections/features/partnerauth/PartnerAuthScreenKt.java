package com.stripe.android.financialconnections.features.partnerauth;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.presentation.ComposeExtensionsKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;

/* compiled from: PartnerAuthScreen.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"PartnerAuthScreen", "", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "inModal", "", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZLandroidx/compose/runtime/Composer;I)V", "financial-connections_release", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PartnerAuthScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PartnerAuthScreen$lambda$7(FinancialConnectionsSessionManifest.Pane pane, boolean z, int i, Composer composer, int i2) {
        PartnerAuthScreen(pane, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void PartnerAuthScreen(final FinancialConnectionsSessionManifest.Pane pane, boolean z, Composer composer, final int i) {
        int i2;
        CreationExtras.Empty defaultViewModelCreationExtras;
        final boolean z2;
        Intrinsics.checkNotNullParameter(pane, "pane");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1976805972);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(pane) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1976805972, i2, -1, "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthScreen (PartnerAuthScreen.kt:13)");
            }
            composerStartRestartGroup.startReplaceGroup(1481344674);
            ViewModelProvider.Factory factory = PartnerAuthViewModel.INSTANCE.factory(ComposeExtensionsKt.parentActivity(composerStartRestartGroup, 0).getViewModel().getActivityRetainedComponent(), new PartnerAuthViewModel.Args(z, pane));
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*54@2502L7,64@2877L63:ViewModel.kt#3tja67");
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PartnerAuthViewModel.class), current, (String) null, factory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceGroup();
            PartnerAuthViewModel partnerAuthViewModel = (PartnerAuthViewModel) ((FinancialConnectionsViewModel) viewModel);
            SharedPartnerAuthState sharedPartnerAuthStatePartnerAuthScreen$lambda$1 = PartnerAuthScreen$lambda$1(StateFlowsComposeKt.collectAsState(partnerAuthViewModel.getStateFlow(), null, composerStartRestartGroup, 0, 1));
            composerStartRestartGroup.startReplaceGroup(1235375224);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(partnerAuthViewModel);
            PartnerAuthScreenKt$PartnerAuthScreen$1$1 partnerAuthScreenKt$PartnerAuthScreen$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || partnerAuthScreenKt$PartnerAuthScreen$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                partnerAuthScreenKt$PartnerAuthScreen$1$1RememberedValue = new PartnerAuthScreenKt$PartnerAuthScreen$1$1(partnerAuthViewModel);
                composerStartRestartGroup.updateRememberedValue(partnerAuthScreenKt$PartnerAuthScreen$1$1RememberedValue);
            }
            KFunction kFunction = (KFunction) partnerAuthScreenKt$PartnerAuthScreen$1$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1235376948);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(partnerAuthViewModel);
            PartnerAuthScreenKt$PartnerAuthScreen$2$1 partnerAuthScreenKt$PartnerAuthScreen$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || partnerAuthScreenKt$PartnerAuthScreen$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                partnerAuthScreenKt$PartnerAuthScreen$2$1RememberedValue = new PartnerAuthScreenKt$PartnerAuthScreen$2$1(partnerAuthViewModel);
                composerStartRestartGroup.updateRememberedValue(partnerAuthScreenKt$PartnerAuthScreen$2$1RememberedValue);
            }
            KFunction kFunction2 = (KFunction) partnerAuthScreenKt$PartnerAuthScreen$2$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1235378779);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(partnerAuthViewModel);
            PartnerAuthScreenKt$PartnerAuthScreen$3$1 partnerAuthScreenKt$PartnerAuthScreen$3$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || partnerAuthScreenKt$PartnerAuthScreen$3$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                partnerAuthScreenKt$PartnerAuthScreen$3$1RememberedValue = new PartnerAuthScreenKt$PartnerAuthScreen$3$1(partnerAuthViewModel);
                composerStartRestartGroup.updateRememberedValue(partnerAuthScreenKt$PartnerAuthScreen$3$1RememberedValue);
            }
            Function1 function1 = (Function1) partnerAuthScreenKt$PartnerAuthScreen$3$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1235380860);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(partnerAuthViewModel);
            PartnerAuthScreenKt$PartnerAuthScreen$4$1 partnerAuthScreenKt$PartnerAuthScreen$4$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || partnerAuthScreenKt$PartnerAuthScreen$4$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                partnerAuthScreenKt$PartnerAuthScreen$4$1RememberedValue = new PartnerAuthScreenKt$PartnerAuthScreen$4$1(partnerAuthViewModel);
                composerStartRestartGroup.updateRememberedValue(partnerAuthScreenKt$PartnerAuthScreen$4$1RememberedValue);
            }
            KFunction kFunction3 = (KFunction) partnerAuthScreenKt$PartnerAuthScreen$4$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1235382939);
            boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(partnerAuthViewModel);
            PartnerAuthScreenKt$PartnerAuthScreen$5$1 partnerAuthScreenKt$PartnerAuthScreen$5$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance5 || partnerAuthScreenKt$PartnerAuthScreen$5$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                partnerAuthScreenKt$PartnerAuthScreen$5$1RememberedValue = new PartnerAuthScreenKt$PartnerAuthScreen$5$1(partnerAuthViewModel);
                composerStartRestartGroup.updateRememberedValue(partnerAuthScreenKt$PartnerAuthScreen$5$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            z2 = z;
            SharedPartnerAuthKt.SharedPartnerAuth(sharedPartnerAuthStatePartnerAuthScreen$lambda$1, (Function0) kFunction, (Function0) kFunction2, function1, (Function1) kFunction3, (Function0) ((KFunction) partnerAuthScreenKt$PartnerAuthScreen$5$1RememberedValue), z2, composerStartRestartGroup, (i2 << 15) & 3670016);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z2 = z;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PartnerAuthScreenKt.PartnerAuthScreen$lambda$7(pane, z2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final SharedPartnerAuthState PartnerAuthScreen$lambda$1(State<SharedPartnerAuthState> state) {
        return state.getValue();
    }
}
