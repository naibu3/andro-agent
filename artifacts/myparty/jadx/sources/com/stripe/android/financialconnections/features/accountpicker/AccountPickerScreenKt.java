package com.stripe.android.financialconnections.features.accountpicker;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.tooling.preview.PreviewParameter;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.financialconnections.R;
import com.stripe.android.financialconnections.exception.AccountLoadError;
import com.stripe.android.financialconnections.exception.AccountNoneEligibleForPaymentMethodError;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.features.common.AccountItemKt;
import com.stripe.android.financialconnections.features.common.ErrorContentKt;
import com.stripe.android.financialconnections.features.common.InstitutionIconKt;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.ComposeExtensionsKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModelKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.CompositionLocalKt;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.components.ButtonKt;
import com.stripe.android.financialconnections.ui.sdui.ServerDrivenUiKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import com.stripe.android.financialconnections.ui.theme.LayoutKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: AccountPickerScreen.kt */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001a\u0089\u0001\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0012\u001aa\u0010\u0013\u001a\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0003¢\u0006\u0002\u0010\u0019\u001aB\u0010\u001a\u001a\u00020\u0001*\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0002\u001aW\u0010 \u001a\u00020\u00012\b\u0010!\u001a\u0004\u0018\u00010\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001fH\u0003¢\u0006\u0002\u0010%\u001a)\u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\n2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010)\u001a\u0017\u0010*\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010+¨\u0006,"}, d2 = {"AccountPickerScreen", "", "(Landroidx/compose/runtime/Composer;I)V", "AccountPickerContent", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;", "onAccountClicked", "Lkotlin/Function1;", "Lcom/stripe/android/financialconnections/model/PartnerAccount;", "onClickableTextClick", "", "onSubmit", "Lkotlin/Function0;", "onSelectAnotherBank", "onEnterDetailsManually", "onLoadAccountsAgain", "onCloseFromErrorClick", "", "(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "AccountPickerLoaded", "payload", "Lcom/stripe/android/financialconnections/presentation/Async;", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "accountPickerContent", "Landroidx/compose/foundation/lazy/LazyListScope;", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "selectedIds", "", "Footer", "dataAccessDisclaimer", "submitEnabled", "", "submitLoading", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function0;Ljava/util/Set;Landroidx/compose/runtime/Composer;I)V", "DataAccessDisclaimerText", "text", "onLearnMoreClick", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "AccountPickerPreview", "(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Landroidx/compose/runtime/Composer;I)V", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AccountPickerScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountPickerContent$lambda$16(AccountPickerState accountPickerState, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function1 function13, int i, Composer composer, int i2) {
        AccountPickerContent(accountPickerState, function1, function12, function0, function02, function03, function04, function13, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountPickerLoaded$lambda$20(Async async, AccountPickerState accountPickerState, LazyListState lazyListState, Function1 function1, Function1 function12, Function0 function0, int i, Composer composer, int i2) {
        AccountPickerLoaded(async, accountPickerState, lazyListState, function1, function12, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountPickerPreview$lambda$26(AccountPickerState accountPickerState, int i, Composer composer, int i2) {
        AccountPickerPreview(accountPickerState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountPickerScreen$lambda$12(int i, Composer composer, int i2) {
        AccountPickerScreen(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DataAccessDisclaimerText$lambda$25(String str, Function1 function1, int i, Composer composer, int i2) {
        DataAccessDisclaimerText(str, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Footer$lambda$24(String str, Function1 function1, boolean z, boolean z2, Function0 function0, Set set, int i, Composer composer, int i2) {
        Footer(str, function1, z, z2, function0, set, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AccountPickerScreen(Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(-11072579);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-11072579, i, -1, "com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreen (AccountPickerScreen.kt:60)");
            }
            composerStartRestartGroup.startReplaceGroup(1481344674);
            ViewModelProvider.Factory factory = AccountPickerViewModel.INSTANCE.factory(ComposeExtensionsKt.parentActivity(composerStartRestartGroup, 0).getViewModel().getActivityRetainedComponent());
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
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(AccountPickerViewModel.class), current, (String) null, factory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceGroup();
            AccountPickerViewModel accountPickerViewModel = (AccountPickerViewModel) ((FinancialConnectionsViewModel) viewModel);
            FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModelParentViewModel = FinancialConnectionsSheetNativeViewModelKt.parentViewModel(composerStartRestartGroup, 0);
            State stateCollectAsState = StateFlowsComposeKt.collectAsState(accountPickerViewModel.getStateFlow(), null, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(1706070356);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BackHandlerKt.BackHandler(true, (Function0) objRememberedValue, composerStartRestartGroup, 54, 0);
            ProvidableCompositionLocal<UriHandler> localUriHandler = CompositionLocalsKt.getLocalUriHandler();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localUriHandler);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            UriHandler uriHandler = (UriHandler) objConsume;
            AccountPickerState.ViewEffect viewEffect = ((AccountPickerState) stateCollectAsState.getValue()).getViewEffect();
            composerStartRestartGroup.startReplaceGroup(1706073078);
            if (viewEffect != null) {
                composerStartRestartGroup.startReplaceGroup(-885474920);
                boolean zChanged = composerStartRestartGroup.changed(viewEffect) | composerStartRestartGroup.changedInstance(uriHandler) | composerStartRestartGroup.changedInstance(accountPickerViewModel);
                AccountPickerScreenKt$AccountPickerScreen$2$1$1 accountPickerScreenKt$AccountPickerScreen$2$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || accountPickerScreenKt$AccountPickerScreen$2$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    accountPickerScreenKt$AccountPickerScreen$2$1$1RememberedValue = new AccountPickerScreenKt$AccountPickerScreen$2$1$1(viewEffect, uriHandler, accountPickerViewModel, null);
                    composerStartRestartGroup.updateRememberedValue(accountPickerScreenKt$AccountPickerScreen$2$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(viewEffect, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) accountPickerScreenKt$AccountPickerScreen$2$1$1RememberedValue, composerStartRestartGroup, 0);
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            AccountPickerState accountPickerState = (AccountPickerState) stateCollectAsState.getValue();
            composerStartRestartGroup.startReplaceGroup(1706082861);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(accountPickerViewModel);
            AccountPickerScreenKt$AccountPickerScreen$3$1 accountPickerScreenKt$AccountPickerScreen$3$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || accountPickerScreenKt$AccountPickerScreen$3$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                accountPickerScreenKt$AccountPickerScreen$3$1RememberedValue = new AccountPickerScreenKt$AccountPickerScreen$3$1(accountPickerViewModel);
                composerStartRestartGroup.updateRememberedValue(accountPickerScreenKt$AccountPickerScreen$3$1RememberedValue);
            }
            KFunction kFunction = (KFunction) accountPickerScreenKt$AccountPickerScreen$3$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1706084389);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(accountPickerViewModel);
            AccountPickerScreenKt$AccountPickerScreen$4$1 accountPickerScreenKt$AccountPickerScreen$4$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || accountPickerScreenKt$AccountPickerScreen$4$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                accountPickerScreenKt$AccountPickerScreen$4$1RememberedValue = new AccountPickerScreenKt$AccountPickerScreen$4$1(accountPickerViewModel);
                composerStartRestartGroup.updateRememberedValue(accountPickerScreenKt$AccountPickerScreen$4$1RememberedValue);
            }
            KFunction kFunction2 = (KFunction) accountPickerScreenKt$AccountPickerScreen$4$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1706086030);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(accountPickerViewModel);
            AccountPickerScreenKt$AccountPickerScreen$5$1 accountPickerScreenKt$AccountPickerScreen$5$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || accountPickerScreenKt$AccountPickerScreen$5$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                accountPickerScreenKt$AccountPickerScreen$5$1RememberedValue = new AccountPickerScreenKt$AccountPickerScreen$5$1(accountPickerViewModel);
                composerStartRestartGroup.updateRememberedValue(accountPickerScreenKt$AccountPickerScreen$5$1RememberedValue);
            }
            KFunction kFunction3 = (KFunction) accountPickerScreenKt$AccountPickerScreen$5$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1706088051);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(accountPickerViewModel);
            AccountPickerScreenKt$AccountPickerScreen$6$1 accountPickerScreenKt$AccountPickerScreen$6$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || accountPickerScreenKt$AccountPickerScreen$6$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                accountPickerScreenKt$AccountPickerScreen$6$1RememberedValue = new AccountPickerScreenKt$AccountPickerScreen$6$1(accountPickerViewModel);
                composerStartRestartGroup.updateRememberedValue(accountPickerScreenKt$AccountPickerScreen$6$1RememberedValue);
            }
            KFunction kFunction4 = (KFunction) accountPickerScreenKt$AccountPickerScreen$6$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1706090128);
            boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(accountPickerViewModel);
            AccountPickerScreenKt$AccountPickerScreen$7$1 accountPickerScreenKt$AccountPickerScreen$7$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance5 || accountPickerScreenKt$AccountPickerScreen$7$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                accountPickerScreenKt$AccountPickerScreen$7$1RememberedValue = new AccountPickerScreenKt$AccountPickerScreen$7$1(accountPickerViewModel);
                composerStartRestartGroup.updateRememberedValue(accountPickerScreenKt$AccountPickerScreen$7$1RememberedValue);
            }
            KFunction kFunction5 = (KFunction) accountPickerScreenKt$AccountPickerScreen$7$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1706092145);
            boolean zChangedInstance6 = composerStartRestartGroup.changedInstance(accountPickerViewModel);
            AccountPickerScreenKt$AccountPickerScreen$8$1 accountPickerScreenKt$AccountPickerScreen$8$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance6 || accountPickerScreenKt$AccountPickerScreen$8$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                accountPickerScreenKt$AccountPickerScreen$8$1RememberedValue = new AccountPickerScreenKt$AccountPickerScreen$8$1(accountPickerViewModel);
                composerStartRestartGroup.updateRememberedValue(accountPickerScreenKt$AccountPickerScreen$8$1RememberedValue);
            }
            Function1 function1 = (Function1) accountPickerScreenKt$AccountPickerScreen$8$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1706094232);
            boolean zChangedInstance7 = composerStartRestartGroup.changedInstance(financialConnectionsSheetNativeViewModelParentViewModel);
            AccountPickerScreenKt$AccountPickerScreen$9$1 accountPickerScreenKt$AccountPickerScreen$9$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance7 || accountPickerScreenKt$AccountPickerScreen$9$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                accountPickerScreenKt$AccountPickerScreen$9$1RememberedValue = new AccountPickerScreenKt$AccountPickerScreen$9$1(financialConnectionsSheetNativeViewModelParentViewModel);
                composerStartRestartGroup.updateRememberedValue(accountPickerScreenKt$AccountPickerScreen$9$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            AccountPickerContent(accountPickerState, (Function1) kFunction, function1, (Function0) kFunction2, (Function0) kFunction3, (Function0) kFunction4, (Function0) kFunction5, (Function1) ((KFunction) accountPickerScreenKt$AccountPickerScreen$9$1RememberedValue), composerStartRestartGroup, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountPickerScreenKt.AccountPickerScreen$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountPickerContent(final AccountPickerState accountPickerState, final Function1<? super PartnerAccount, Unit> function1, final Function1<? super String, Unit> function12, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final Function0<Unit> function04, final Function1<? super Throwable, Unit> function13, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1035240073);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(accountPickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function03) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function04) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function13) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1035240073, i2, -1, "com.stripe.android.financialconnections.features.accountpicker.AccountPickerContent (AccountPickerScreen.kt:99)");
            }
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int i3 = i2;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Async<AccountPickerState.Payload> payload = accountPickerState.getPayload();
            if (payload instanceof Async.Fail) {
                composerStartRestartGroup.startReplaceGroup(1925041878);
                final Throwable error = ((Async.Fail) payload).getError();
                if (error instanceof AccountNoneEligibleForPaymentMethodError) {
                    composerStartRestartGroup.startReplaceGroup(-1046276526);
                    ErrorContentKt.NoSupportedPaymentMethodTypeAccountsErrorContent((AccountNoneEligibleForPaymentMethodError) error, function02, composerStartRestartGroup, (i3 >> 9) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (error instanceof AccountLoadError) {
                    composerStartRestartGroup.startReplaceGroup(1925404330);
                    ErrorContentKt.NoAccountsAvailableErrorContent((AccountLoadError) error, function02, function03, function04, composerStartRestartGroup, (i3 >> 9) & 8176);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1046258709);
                    composerStartRestartGroup.startReplaceGroup(-1046257934);
                    boolean zChangedInstance = ((i3 & 29360128) == 8388608) | composerStartRestartGroup.changedInstance(error);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AccountPickerScreenKt.AccountPickerContent$lambda$15$lambda$14$lambda$13(function13, error);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ErrorContentKt.UnclassifiedErrorContent(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(payload instanceof Async.Loading) && !(payload instanceof Async.Uninitialized) && !(payload instanceof Async.Success)) {
                    composerStartRestartGroup.startReplaceGroup(-1046282003);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-1046252997);
                int i4 = i3 << 6;
                AccountPickerLoaded(payload, accountPickerState, lazyListStateRememberLazyListState, function1, function12, function0, composerStartRestartGroup, ((i3 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
                composerStartRestartGroup.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountPickerScreenKt.AccountPickerContent$lambda$16(accountPickerState, function1, function12, function0, function02, function03, function04, function13, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountPickerContent$lambda$15$lambda$14$lambda$13(Function1 function1, Throwable th) {
        function1.invoke(th);
        return Unit.INSTANCE;
    }

    private static final void AccountPickerLoaded(final Async<AccountPickerState.Payload> async, final AccountPickerState accountPickerState, final LazyListState lazyListState, final Function1<? super PartnerAccount, Unit> function1, final Function1<? super String, Unit> function12, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1607640131);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(async) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(accountPickerState) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(lazyListState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1607640131, i2, -1, "com.stripe.android.financialconnections.features.accountpicker.AccountPickerLoaded (AccountPickerScreen.kt:145)");
            }
            final AccountPickerState.Payload payloadInvoke = async.invoke();
            if (payloadInvoke == null || payloadInvoke.getShouldSkipPane()) {
                payloadInvoke = null;
            }
            boolean z = async instanceof Async.Loading;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(16));
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1856761424, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt.AccountPickerLoaded.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1856761424, i3, -1, "com.stripe.android.financialconnections.features.accountpicker.AccountPickerLoaded.<anonymous> (AccountPickerScreen.kt:162)");
                        }
                        AccountPickerState.Payload payload = payloadInvoke;
                        if (payload != null) {
                            Function1<String, Unit> function13 = function12;
                            AccountPickerState accountPickerState2 = accountPickerState;
                            AccountPickerScreenKt.Footer(payload.getDataAccessDisclaimer(), function13, accountPickerState2.getSubmitEnabled(), accountPickerState2.getSubmitLoading(), function0, accountPickerState2.getSelectedIds(), composer3, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceGroup(-331089299);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(accountPickerState) | composerStartRestartGroup.changedInstance(payloadInvoke) | ((i2 & 7168) == 2048);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountPickerScreenKt.AccountPickerLoaded$lambda$19$lambda$18(accountPickerState, payloadInvoke, function1, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            LayoutKt.LazyLayout(null, null, false, z, true, horizontalOrVerticalM900spacedBy0680j_4, false, lazyListState, composableLambdaRememberComposableLambda, (Function1) objRememberedValue, composer2, ((i2 << 15) & 29360128) | 100884480, 71);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountPickerScreenKt.AccountPickerLoaded$lambda$20(async, accountPickerState, lazyListState, function1, function12, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountPickerLoaded$lambda$19$lambda$18(AccountPickerState accountPickerState, AccountPickerState.Payload payload, Function1 function1, LazyListScope LazyLayout) {
        Intrinsics.checkNotNullParameter(LazyLayout, "$this$LazyLayout");
        accountPickerContent(LazyLayout, accountPickerState.getInstitution().invoke(), payload, accountPickerState.getSelectedIds(), function1);
        return Unit.INSTANCE;
    }

    private static final void accountPickerContent(LazyListScope lazyListScope, final FinancialConnectionsInstitution financialConnectionsInstitution, final AccountPickerState.Payload payload, final Set<String> set, final Function1<? super PartnerAccount, Unit> function1) {
        LazyListScope.item$default(lazyListScope, PaymentSheetAppearanceKeys.ICON, null, ComposableLambdaKt.composableLambdaInstance(-2135426354, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt.accountPickerContent.3
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Image icon;
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) != 16 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2135426354, i, -1, "com.stripe.android.financialconnections.features.accountpicker.accountPickerContent.<anonymous> (AccountPickerScreen.kt:183)");
                    }
                    FinancialConnectionsInstitution financialConnectionsInstitution2 = financialConnectionsInstitution;
                    InstitutionIconKt.InstitutionIcon((financialConnectionsInstitution2 == null || (icon = financialConnectionsInstitution2.getIcon()) == null) ? null : icon.getDefault(), PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(16), 0.0f, 0.0f, 13, null), true, composer, 432, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }), 2, null);
        LazyListScope.item$default(lazyListScope, "header", null, ComposableLambdaKt.composableLambdaInstance(-174756233, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt.accountPickerContent.4

            /* compiled from: AccountPickerScreen.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$accountPickerContent$4$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[AccountPickerState.SelectionMode.values().length];
                    try {
                        iArr[AccountPickerState.SelectionMode.Single.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AccountPickerState.SelectionMode.Multiple.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                int i2;
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) != 16 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-174756233, i, -1, "com.stripe.android.financialconnections.features.accountpicker.accountPickerContent.<anonymous> (AccountPickerScreen.kt:191)");
                    }
                    if (payload != null) {
                        composer.startReplaceGroup(1308789946);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        int i3 = WhenMappings.$EnumSwitchMapping$0[payload.getSelectionMode().ordinal()];
                        if (i3 == 1) {
                            i2 = R.string.stripe_account_picker_singleselect_account;
                        } else {
                            if (i3 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i2 = R.string.stripe_account_picker_multiselect_account;
                        }
                        TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(i2, composer, 0), modifierFillMaxWidth$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composer, 6).getHeadingXLarge(), composer, 48, 0, 65532);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(1309285016);
                        TextKt.m2076Text4IGK_g("Retrieving accounts", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composer, 6).getHeadingXLarge(), composer, 54, 0, 65532);
                        composer.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }), 2, null);
        if (payload != null) {
            final List<PartnerAccount> accounts = payload.getAccounts();
            final Function1 function12 = new Function1() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountPickerScreenKt.accountPickerContent$lambda$21((PartnerAccount) obj);
                }
            };
            final AccountPickerScreenKt$accountPickerContent$$inlined$items$default$1 accountPickerScreenKt$accountPickerContent$$inlined$items$default$1 = new Function1() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$accountPickerContent$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(PartnerAccount partnerAccount) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((PartnerAccount) obj);
                }
            };
            lazyListScope.items(accounts.size(), new Function1<Integer, Object>() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$accountPickerContent$$inlined$items$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return function12.invoke(accounts.get(i));
                }
            }, new Function1<Integer, Object>() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$accountPickerContent$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return accountPickerScreenKt$accountPickerContent$$inlined$items$default$1.invoke(accounts.get(i));
                }
            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$accountPickerContent$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                    int i3;
                    ComposerKt.sourceInformation(composer, "C152@7074L22:LazyDsl.kt#428nma");
                    if ((i2 & 6) == 0) {
                        i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= composer.changed(i) ? 32 : 16;
                    }
                    if ((i3 & 147) == 146 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                    }
                    PartnerAccount partnerAccount = (PartnerAccount) accounts.get(i);
                    composer.startReplaceGroup(1309607541);
                    AccountItemKt.AccountItem(set.contains(partnerAccount.getId()), false, function1, partnerAccount, null, composer, 48, 16);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            return;
        }
        LazyListScope.items$default(lazyListScope, 3, null, null, ComposableSingletons$AccountPickerScreenKt.INSTANCE.m7304getLambda2$financial_connections_release(), 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object accountPickerContent$lambda$21(PartnerAccount it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Footer(final String str, final Function1<? super String, Unit> function1, final boolean z, final boolean z2, final Function0<Unit> function0, final Set<String> set, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(422975109);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(set) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(422975109, i2, -1, "com.stripe.android.financialconnections.features.accountpicker.Footer (AccountPickerScreen.kt:243)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-810688406);
            if (str != null) {
                DataAccessDisclaimerText(str, function1, composerStartRestartGroup, i2 & WebSocketProtocol.PAYLOAD_SHORT);
                SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(12)), composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i3 = i2 << 6;
            ButtonKt.FinancialConnectionsButton(function0, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, z, z2, ComposableLambdaKt.rememberComposableLambda(-1274958764, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$Footer$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope FinancialConnectionsButton, Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
                    if ((i4 & 17) != 16 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1274958764, i4, -1, "com.stripe.android.financialconnections.features.accountpicker.Footer.<anonymous>.<anonymous> (AccountPickerScreen.kt:259)");
                        }
                        TextKt.m2076Text4IGK_g(com.stripe.android.financialconnections.ui.components.TextKt.pluralStringResource(R.string.stripe_account_picker_cta_link_singular, R.string.stripe_account_picker_cta_link_plural, set.size(), new Object[0], composer2, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (57344 & i3) | ((i2 >> 12) & 14) | 1572912 | (i3 & 458752), 12);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountPickerScreenKt.Footer$lambda$24(str, function1, z, z2, function0, set, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void DataAccessDisclaimerText(final String str, final Function1<? super String, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(285181872);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(285181872, i2, -1, "com.stripe.android.financialconnections.features.accountpicker.DataAccessDisclaimerText (AccountPickerScreen.kt:274)");
            }
            com.stripe.android.financialconnections.ui.components.TextKt.m7586AnnotatedTextrm0N8CA(new TextResource.Text(ServerDrivenUiKt.fromHtml(str)), function1, TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLabelSmall(), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m6006getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, 0, 0, composerStartRestartGroup, (i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 3072, OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountPickerScreenKt.DataAccessDisclaimerText$lambda$25(str, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AccountPickerScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$AccountPickerPreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C08611 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ AccountPickerState $state;

        C08611(AccountPickerState accountPickerState) {
            this.$state = accountPickerState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1407760032, i, -1, "com.stripe.android.financialconnections.features.accountpicker.AccountPickerPreview.<anonymous> (AccountPickerScreen.kt:295)");
                }
                AccountPickerState accountPickerState = this.$state;
                composer.startReplaceGroup(-863024989);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$AccountPickerPreview$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AccountPickerScreenKt.C08611.invoke$lambda$1$lambda$0((PartnerAccount) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-863017853);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$AccountPickerPreview$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AccountPickerScreenKt.C08611.invoke$lambda$3$lambda$2((String) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function1 function12 = (Function1) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-863024125);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$AccountPickerPreview$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                Function0 function0 = (Function0) objRememberedValue3;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-863022909);
                Object objRememberedValue4 = composer.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$AccountPickerPreview$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                Function0 function02 = (Function0) objRememberedValue4;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-863021597);
                Object objRememberedValue5 = composer.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$AccountPickerPreview$1$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                Function0 function03 = (Function0) objRememberedValue5;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-863020381);
                Object objRememberedValue6 = composer.rememberedValue();
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$AccountPickerPreview$1$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue6);
                }
                Function0 function04 = (Function0) objRememberedValue6;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-863019101);
                Object objRememberedValue7 = composer.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function1() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$AccountPickerPreview$1$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AccountPickerScreenKt.C08611.invoke$lambda$13$lambda$12((Throwable) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue7);
                }
                composer.endReplaceGroup();
                AccountPickerScreenKt.AccountPickerContent(accountPickerState, function1, function12, function0, function02, function03, function04, (Function1) objRememberedValue7, composer, 14380464);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(PartnerAccount it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$13$lambda$12(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final void AccountPickerPreview(@PreviewParameter(provider = AccountPickerPreviewParameterProvider.class) final AccountPickerState state, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(891199281);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(891199281, i2, -1, "com.stripe.android.financialconnections.features.accountpicker.AccountPickerPreview (AccountPickerScreen.kt:293)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(null, false, ComposableLambdaKt.rememberComposableLambda(-1407760032, true, new C08611(state), composerStartRestartGroup, 54), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountPickerScreenKt.AccountPickerPreview$lambda$26(state, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
