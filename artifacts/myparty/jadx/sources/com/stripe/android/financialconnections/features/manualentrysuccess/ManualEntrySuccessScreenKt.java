package com.stripe.android.financialconnections.features.manualentrysuccess;

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
import com.facebook.internal.ServerProtocol;
import com.stripe.android.financialconnections.features.success.SuccessContentKt;
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
import kotlin.reflect.KFunction;

/* compiled from: ManualEntrySuccessScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002¨\u0006\u0003²\u0006\n\u0010\u0004\u001a\u00020\u0005X\u008a\u0084\u0002"}, d2 = {"ManualEntrySuccessScreen", "", "(Landroidx/compose/runtime/Composer;I)V", "financial-connections_release", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessState;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ManualEntrySuccessScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ManualEntrySuccessScreen$lambda$5(int i, Composer composer, int i2) {
        ManualEntrySuccessScreen(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ManualEntrySuccessScreen(Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(1741265075);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1741265075, i, -1, "com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessScreen (ManualEntrySuccessScreen.kt:10)");
            }
            composerStartRestartGroup.startReplaceGroup(1481344674);
            ViewModelProvider.Factory factory = ManualEntrySuccessViewModel.INSTANCE.factory(ComposeExtensionsKt.parentActivity(composerStartRestartGroup, 0).getViewModel().getActivityRetainedComponent());
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
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(ManualEntrySuccessViewModel.class), current, (String) null, factory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceGroup();
            ManualEntrySuccessViewModel manualEntrySuccessViewModel = (ManualEntrySuccessViewModel) ((FinancialConnectionsViewModel) viewModel);
            State stateCollectAsState = StateFlowsComposeKt.collectAsState(manualEntrySuccessViewModel.getStateFlow(), null, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(87066586);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BackHandlerKt.BackHandler(true, (Function0) objRememberedValue, composerStartRestartGroup, 54, 0);
            Async<FinancialConnectionsSession> completeSession = ManualEntrySuccessScreen$lambda$1(stateCollectAsState).getCompleteSession();
            Async<SuccessState.Payload> payload = ManualEntrySuccessScreen$lambda$1(stateCollectAsState).getPayload();
            composerStartRestartGroup.startReplaceGroup(87070987);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(manualEntrySuccessViewModel);
            ManualEntrySuccessScreenKt$ManualEntrySuccessScreen$2$1 manualEntrySuccessScreenKt$ManualEntrySuccessScreen$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || manualEntrySuccessScreenKt$ManualEntrySuccessScreen$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                manualEntrySuccessScreenKt$ManualEntrySuccessScreen$2$1RememberedValue = new ManualEntrySuccessScreenKt$ManualEntrySuccessScreen$2$1(manualEntrySuccessViewModel);
                composerStartRestartGroup.updateRememberedValue(manualEntrySuccessScreenKt$ManualEntrySuccessScreen$2$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            SuccessContentKt.SuccessContent(completeSession, payload, (Function0) ((KFunction) manualEntrySuccessScreenKt$ManualEntrySuccessScreen$2$1RememberedValue), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ManualEntrySuccessScreenKt.ManualEntrySuccessScreen$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final ManualEntrySuccessState ManualEntrySuccessScreen$lambda$1(State<ManualEntrySuccessState> state) {
        return state.getValue();
    }
}
