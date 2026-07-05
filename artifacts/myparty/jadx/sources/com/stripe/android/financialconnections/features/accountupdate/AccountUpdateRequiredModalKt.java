package com.stripe.android.financialconnections.features.accountupdate;

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
import androidx.navigation.NavBackStackEntry;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.financialconnections.features.common.ModalBottomSheetContentKt;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.presentation.ComposeExtensionsKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.CompositionLocalKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import defpackage.FinancialConnectionsGenericInfoScreen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;

/* compiled from: AccountUpdateRequiredModal.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a3\u0010\u0005\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, d2 = {"AccountUpdateRequiredModal", "", "backStackEntry", "Landroidx/navigation/NavBackStackEntry;", "(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V", "AccountUpdateRequiredModalContent", "payload", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired;", "onContinue", "Lkotlin/Function0;", "onCancel", "(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AccountUpdateRequiredModalPreview", "(Landroidx/compose/runtime/Composer;I)V", "financial-connections_release", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AccountUpdateRequiredModalKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountUpdateRequiredModal$lambda$4(NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        AccountUpdateRequiredModal(navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountUpdateRequiredModalContent$lambda$7(NoticeSheetState.NoticeSheetContent.UpdateRequired updateRequired, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        AccountUpdateRequiredModalContent(updateRequired, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountUpdateRequiredModalPreview$lambda$8(int i, Composer composer, int i2) {
        AccountUpdateRequiredModalPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AccountUpdateRequiredModal(final NavBackStackEntry backStackEntry, Composer composer, final int i) {
        int i2;
        CreationExtras.Empty defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(1641380532);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(backStackEntry) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1641380532, i2, -1, "com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredModal (AccountUpdateRequiredModal.kt:24)");
            }
            composerStartRestartGroup.startReplaceGroup(1481344674);
            ViewModelProvider.Factory factory = AccountUpdateRequiredViewModel.INSTANCE.factory(ComposeExtensionsKt.parentActivity(composerStartRestartGroup, 0).getViewModel().getActivityRetainedComponent(), backStackEntry.getArguments());
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
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(AccountUpdateRequiredViewModel.class), current, (String) null, factory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceGroup();
            AccountUpdateRequiredViewModel accountUpdateRequiredViewModel = (AccountUpdateRequiredViewModel) ((FinancialConnectionsViewModel) viewModel);
            NoticeSheetState.NoticeSheetContent.UpdateRequired updateRequiredInvoke = AccountUpdateRequiredModal$lambda$1(StateFlowsComposeKt.collectAsState(accountUpdateRequiredViewModel.getStateFlow(), null, composerStartRestartGroup, 0, 1)).getPayload().invoke();
            composerStartRestartGroup.startReplaceGroup(-264972885);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(accountUpdateRequiredViewModel);
            AccountUpdateRequiredModalKt$AccountUpdateRequiredModal$1$1 accountUpdateRequiredModalKt$AccountUpdateRequiredModal$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || accountUpdateRequiredModalKt$AccountUpdateRequiredModal$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                accountUpdateRequiredModalKt$AccountUpdateRequiredModal$1$1RememberedValue = new AccountUpdateRequiredModalKt$AccountUpdateRequiredModal$1$1(accountUpdateRequiredViewModel);
                composerStartRestartGroup.updateRememberedValue(accountUpdateRequiredModalKt$AccountUpdateRequiredModal$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0 function0 = (Function0) ((KFunction) accountUpdateRequiredModalKt$AccountUpdateRequiredModal$1$1RememberedValue);
            composerStartRestartGroup.startReplaceGroup(-264971415);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(accountUpdateRequiredViewModel);
            AccountUpdateRequiredModalKt$AccountUpdateRequiredModal$2$1 accountUpdateRequiredModalKt$AccountUpdateRequiredModal$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || accountUpdateRequiredModalKt$AccountUpdateRequiredModal$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                accountUpdateRequiredModalKt$AccountUpdateRequiredModal$2$1RememberedValue = new AccountUpdateRequiredModalKt$AccountUpdateRequiredModal$2$1(accountUpdateRequiredViewModel);
                composerStartRestartGroup.updateRememberedValue(accountUpdateRequiredModalKt$AccountUpdateRequiredModal$2$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            AccountUpdateRequiredModalContent(updateRequiredInvoke, function0, (Function0) ((KFunction) accountUpdateRequiredModalKt$AccountUpdateRequiredModal$2$1RememberedValue), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredModalKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountUpdateRequiredModalKt.AccountUpdateRequiredModal$lambda$4(backStackEntry, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountUpdateRequiredModalContent(final NoticeSheetState.NoticeSheetContent.UpdateRequired updateRequired, Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function03;
        final Function0<Unit> function04;
        Composer composerStartRestartGroup = composer.startRestartGroup(139634609);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(updateRequired) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(139634609, i2, -1, "com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredModalContent (AccountUpdateRequiredModal.kt:43)");
            }
            if ((updateRequired != null ? updateRequired.getGeneric() : null) != null) {
                FinancialConnectionsGenericInfoScreen generic = updateRequired.getGeneric();
                composerStartRestartGroup.startReplaceGroup(-1157165463);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredModalKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AccountUpdateRequiredModalKt.AccountUpdateRequiredModalContent$lambda$6$lambda$5((String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i3 = i2 << 3;
                function03 = function0;
                function04 = function02;
                ModalBottomSheetContentKt.GenericBottomSheetContent(generic, (Function1) objRememberedValue, function03, function04, composerStartRestartGroup, (i3 & 896) | 48 | (i3 & 7168));
            } else {
                function03 = function0;
                function04 = function02;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function03 = function0;
            function04 = function02;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredModalKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountUpdateRequiredModalKt.AccountUpdateRequiredModalContent$lambda$7(updateRequired, function03, function04, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountUpdateRequiredModalContent$lambda$6$lambda$5(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final void AccountUpdateRequiredModalPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1546055424);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1546055424, i, -1, "com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredModalPreview (AccountUpdateRequiredModal.kt:59)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(null, false, ComposableSingletons$AccountUpdateRequiredModalKt.INSTANCE.m7308getLambda1$financial_connections_release(), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredModalKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountUpdateRequiredModalKt.AccountUpdateRequiredModalPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final AccountUpdateRequiredState AccountUpdateRequiredModal$lambda$1(State<AccountUpdateRequiredState> state) {
        return state.getValue();
    }
}
