package com.stripe.android.financialconnections.features.success;

import androidx.activity.compose.BackHandlerKt;
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
import com.stripe.android.financialconnections.features.success.SuccessState;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.ComposeExtensionsKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: SuccessScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"SuccessScreen", "", "(Landroidx/compose/runtime/Composer;I)V", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SuccessScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SuccessScreen$lambda$4(int i, Composer composer, int i2) {
        SuccessScreen(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SuccessScreen(Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1677297867);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1677297867, i, -1, "com.stripe.android.financialconnections.features.success.SuccessScreen (SuccessScreen.kt:9)");
            }
            composerStartRestartGroup.startReplaceGroup(1481344674);
            ViewModelProvider.Factory factory = SuccessViewModel.INSTANCE.factory(ComposeExtensionsKt.parentActivity(composerStartRestartGroup, 0).getViewModel().getActivityRetainedComponent());
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
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(SuccessViewModel.class), current, (String) null, factory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceGroup();
            SuccessViewModel successViewModel = (SuccessViewModel) ((FinancialConnectionsViewModel) viewModel);
            State stateCollectAsState = StateFlowsComposeKt.collectAsState(successViewModel.getStateFlow(), null, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(-33931804);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.success.SuccessScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BackHandlerKt.BackHandler(true, (Function0) objRememberedValue, composerStartRestartGroup, 54, 0);
            Async<FinancialConnectionsSession> completeSession = ((SuccessState) stateCollectAsState.getValue()).getCompleteSession();
            Async<SuccessState.Payload> payload = ((SuccessState) stateCollectAsState.getValue()).getPayload();
            composerStartRestartGroup.startReplaceGroup(-33927016);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(successViewModel);
            SuccessScreenKt$SuccessScreen$2$1 successScreenKt$SuccessScreen$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || successScreenKt$SuccessScreen$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                successScreenKt$SuccessScreen$2$1RememberedValue = new SuccessScreenKt$SuccessScreen$2$1(successViewModel);
                composerStartRestartGroup.updateRememberedValue(successScreenKt$SuccessScreen$2$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            SuccessContentKt.SuccessContent(completeSession, payload, (Function0) successScreenKt$SuccessScreen$2$1RememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.success.SuccessScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SuccessScreenKt.SuccessScreen$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
