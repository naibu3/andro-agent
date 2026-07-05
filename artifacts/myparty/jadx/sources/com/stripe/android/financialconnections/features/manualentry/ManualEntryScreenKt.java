package com.stripe.android.financialconnections.features.manualentry;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
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
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.tooling.preview.PreviewParameter;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.R;
import com.stripe.android.financialconnections.features.common.ErrorContentKt;
import com.stripe.android.financialconnections.features.common.LoadingContentKt;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryPreviewParameterProvider;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryState;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.ComposeExtensionsKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModelKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.CompositionLocalKt;
import com.stripe.android.financialconnections.ui.components.ButtonKt;
import com.stripe.android.financialconnections.ui.components.TestModeBannerKt;
import com.stripe.android.financialconnections.ui.components.TextFieldKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import com.stripe.android.financialconnections.ui.theme.LayoutKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;

/* compiled from: ManualEntryScreen.kt */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001aÓ\u0001\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018H\u0003¢\u0006\u0002\u0010\u001c\u001a¹\u0001\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00142\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018H\u0003¢\u0006\u0002\u0010\u001e\u001a\u0015\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010!\u001a\r\u0010\"\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002\u001a\u0087\u0001\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00142\u0006\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00142\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0014H\u0003¢\u0006\u0002\u0010%\u001a+\u0010&\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018H\u0003¢\u0006\u0002\u0010(\u001aM\u0010)\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u00052\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u00072\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00052\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0014H\u0003¢\u0006\u0002\u0010.\u001a\u0017\u0010/\u001a\u00020\u00012\b\b\u0001\u00100\u001a\u000201H\u0001¢\u0006\u0002\u00102¨\u00063²\u0006\n\u00104\u001a\u000205X\u008a\u0084\u0002²\u0006\n\u00106\u001a\u000207X\u008a\u0084\u0002"}, d2 = {"ManualEntryScreen", "", "(Landroidx/compose/runtime/Composer;I)V", "ManualEntryContent", "routing", "", "routingError", "", "account", "accountError", "accountConfirm", "accountConfirmError", "isValidForm", "", "payload", "Lcom/stripe/android/financialconnections/presentation/Async;", "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;", "linkPaymentAccountStatus", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "onRoutingEntered", "Lkotlin/Function1;", "onAccountEntered", "onAccountConfirmEntered", "onSubmit", "Lkotlin/Function0;", "onCloseFromErrorClick", "", "onTestFill", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;ZLcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ManualEntryLoaded", "(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;Lcom/stripe/android/financialconnections/presentation/Async;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ErrorMessage", "error", "(Ljava/lang/Throwable;Landroidx/compose/runtime/Composer;I)V", "Title", "AccountForm", ViewProps.ENABLED, "(ZLjava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ManualEntryFooter", "loading", "(ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "InputWithError", "input", "label", "testTag", "onInputChanged", "(ZLjava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ManualEntryPreview", "previewState", "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;", "(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;Landroidx/compose/runtime/Composer;I)V", "financial-connections_release", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;", "form", "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ManualEntryScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountForm$lambda$18(boolean z, String str, Integer num, Function1 function1, String str2, Integer num2, Function1 function12, String str3, Integer num3, Function1 function13, int i, Composer composer, int i2) {
        AccountForm(z, str, num, function1, str2, num2, function12, str3, num3, function13, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorMessage$lambda$15(Throwable th, int i, Composer composer, int i2) {
        ErrorMessage(th, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputWithError$lambda$24(boolean z, String str, Integer num, int i, String str2, Function1 function1, int i2, Composer composer, int i3) {
        InputWithError(z, str, num, i, str2, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ManualEntryContent$lambda$13(String str, Integer num, String str2, Integer num2, String str3, Integer num3, boolean z, Async async, Async async2, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function1 function14, Function0 function02, int i, int i2, Composer composer, int i3) {
        ManualEntryContent(str, num, str2, num2, str3, num3, z, async, async2, function1, function12, function13, function0, function14, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ManualEntryFooter$lambda$20(boolean z, boolean z2, Function0 function0, int i, Composer composer, int i2) {
        ManualEntryFooter(z, z2, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ManualEntryLoaded$lambda$14(ManualEntryState.Payload payload, Async async, String str, Integer num, String str2, Integer num2, String str3, Integer num3, Function1 function1, Function1 function12, Function1 function13, boolean z, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        ManualEntryLoaded(payload, async, str, num, str2, num2, str3, num3, function1, function12, function13, z, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ManualEntryPreview$lambda$25(ManualEntryPreviewParameterProvider.PreviewState previewState, int i, Composer composer, int i2) {
        ManualEntryPreview(previewState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ManualEntryScreen$lambda$9(int i, Composer composer, int i2) {
        ManualEntryScreen(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Title$lambda$16(int i, Composer composer, int i2) {
        Title(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ManualEntryScreen(Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1219089844);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1219089844, i, -1, "com.stripe.android.financialconnections.features.manualentry.ManualEntryScreen (ManualEntryScreen.kt:48)");
            }
            composerStartRestartGroup.startReplaceGroup(1481344674);
            ViewModelProvider.Factory factory = ManualEntryViewModel.INSTANCE.factory(ComposeExtensionsKt.parentActivity(composerStartRestartGroup, 0).getViewModel().getActivityRetainedComponent());
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
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(ManualEntryViewModel.class), current, (String) null, factory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceGroup();
            ManualEntryViewModel manualEntryViewModel = (ManualEntryViewModel) ((FinancialConnectionsViewModel) viewModel);
            FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModelParentViewModel = FinancialConnectionsSheetNativeViewModelKt.parentViewModel(composerStartRestartGroup, 0);
            State stateCollectAsState = StateFlowsComposeKt.collectAsState(manualEntryViewModel.getStateFlow(), null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState2 = StateFlowsComposeKt.collectAsState(manualEntryViewModel.getForm(), null, composerStartRestartGroup, 0, 1);
            String routing = manualEntryViewModel.getRouting();
            Integer routingError = ManualEntryScreen$lambda$2(stateCollectAsState2).getRoutingError();
            String account = manualEntryViewModel.getAccount();
            Integer accountError = ManualEntryScreen$lambda$2(stateCollectAsState2).getAccountError();
            String accountConfirm = manualEntryViewModel.getAccountConfirm();
            Integer accountConfirmError = ManualEntryScreen$lambda$2(stateCollectAsState2).getAccountConfirmError();
            boolean zIsValid = ManualEntryScreen$lambda$2(stateCollectAsState2).isValid();
            Async<ManualEntryState.Payload> payload = ManualEntryScreen$lambda$1(stateCollectAsState).getPayload();
            Async<LinkAccountSessionPaymentAccount> linkPaymentAccount = ManualEntryScreen$lambda$1(stateCollectAsState).getLinkPaymentAccount();
            composerStartRestartGroup.startReplaceGroup(-1443440945);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(manualEntryViewModel);
            ManualEntryScreenKt$ManualEntryScreen$1$1 manualEntryScreenKt$ManualEntryScreen$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || manualEntryScreenKt$ManualEntryScreen$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                manualEntryScreenKt$ManualEntryScreen$1$1RememberedValue = new ManualEntryScreenKt$ManualEntryScreen$1$1(manualEntryViewModel);
                composerStartRestartGroup.updateRememberedValue(manualEntryScreenKt$ManualEntryScreen$1$1RememberedValue);
            }
            KFunction kFunction = (KFunction) manualEntryScreenKt$ManualEntryScreen$1$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1443439153);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(manualEntryViewModel);
            ManualEntryScreenKt$ManualEntryScreen$2$1 manualEntryScreenKt$ManualEntryScreen$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || manualEntryScreenKt$ManualEntryScreen$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                manualEntryScreenKt$ManualEntryScreen$2$1RememberedValue = new ManualEntryScreenKt$ManualEntryScreen$2$1(manualEntryViewModel);
                composerStartRestartGroup.updateRememberedValue(manualEntryScreenKt$ManualEntryScreen$2$1RememberedValue);
            }
            KFunction kFunction2 = (KFunction) manualEntryScreenKt$ManualEntryScreen$2$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1443437130);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(manualEntryViewModel);
            ManualEntryScreenKt$ManualEntryScreen$3$1 manualEntryScreenKt$ManualEntryScreen$3$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || manualEntryScreenKt$ManualEntryScreen$3$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                manualEntryScreenKt$ManualEntryScreen$3$1RememberedValue = new ManualEntryScreenKt$ManualEntryScreen$3$1(manualEntryViewModel);
                composerStartRestartGroup.updateRememberedValue(manualEntryScreenKt$ManualEntryScreen$3$1RememberedValue);
            }
            KFunction kFunction3 = (KFunction) manualEntryScreenKt$ManualEntryScreen$3$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1443435385);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(manualEntryViewModel);
            ManualEntryScreenKt$ManualEntryScreen$4$1 manualEntryScreenKt$ManualEntryScreen$4$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || manualEntryScreenKt$ManualEntryScreen$4$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                manualEntryScreenKt$ManualEntryScreen$4$1RememberedValue = new ManualEntryScreenKt$ManualEntryScreen$4$1(manualEntryViewModel);
                composerStartRestartGroup.updateRememberedValue(manualEntryScreenKt$ManualEntryScreen$4$1RememberedValue);
            }
            KFunction kFunction4 = (KFunction) manualEntryScreenKt$ManualEntryScreen$4$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1443434039);
            boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(manualEntryViewModel);
            ManualEntryScreenKt$ManualEntryScreen$5$1 manualEntryScreenKt$ManualEntryScreen$5$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance5 || manualEntryScreenKt$ManualEntryScreen$5$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                manualEntryScreenKt$ManualEntryScreen$5$1RememberedValue = new ManualEntryScreenKt$ManualEntryScreen$5$1(manualEntryViewModel);
                composerStartRestartGroup.updateRememberedValue(manualEntryScreenKt$ManualEntryScreen$5$1RememberedValue);
            }
            KFunction kFunction5 = (KFunction) manualEntryScreenKt$ManualEntryScreen$5$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1443432262);
            boolean zChangedInstance6 = composerStartRestartGroup.changedInstance(financialConnectionsSheetNativeViewModelParentViewModel);
            ManualEntryScreenKt$ManualEntryScreen$6$1 manualEntryScreenKt$ManualEntryScreen$6$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance6 || manualEntryScreenKt$ManualEntryScreen$6$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                manualEntryScreenKt$ManualEntryScreen$6$1RememberedValue = new ManualEntryScreenKt$ManualEntryScreen$6$1(financialConnectionsSheetNativeViewModelParentViewModel);
                composerStartRestartGroup.updateRememberedValue(manualEntryScreenKt$ManualEntryScreen$6$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            ManualEntryContent(routing, routingError, account, accountError, accountConfirm, accountConfirmError, zIsValid, payload, linkPaymentAccount, (Function1) kFunction, (Function1) kFunction2, (Function1) kFunction3, (Function0) kFunction4, (Function1) ((KFunction) manualEntryScreenKt$ManualEntryScreen$6$1RememberedValue), (Function0) kFunction5, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ManualEntryScreenKt.ManualEntryScreen$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ManualEntryContent(final String str, final Integer num, final String str2, final Integer num2, final String str3, final Integer num3, final boolean z, final Async<ManualEntryState.Payload> async, final Async<LinkAccountSessionPaymentAccount> async2, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function12, final Function1<? super String, Unit> function13, final Function0<Unit> function0, final Function1<? super Throwable, Unit> function14, final Function0<Unit> function02, Composer composer, final int i, final int i2) {
        int i3;
        Integer num4;
        String str4;
        String str5;
        int i4;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1757899721);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            num4 = num;
            i3 |= composerStartRestartGroup.changed(num4) ? 32 : 16;
        } else {
            num4 = num;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            str4 = str2;
            i3 |= composerStartRestartGroup.changed(str4) ? 256 : 128;
        } else {
            str4 = str2;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(num2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            str5 = str3;
            i3 |= composerStartRestartGroup.changed(str5) ? 16384 : 8192;
        } else {
            str5 = str3;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= composerStartRestartGroup.changed(num3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changed(async) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changed(async2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(function12) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function13) ? 32 : 16;
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function14) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        int i5 = i4;
        if ((i3 & 306783379) != 306783378 || (i5 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1757899721, i3, i5, "com.stripe.android.financialconnections.features.manualentry.ManualEntryContent (ManualEntryScreen.kt:91)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i6 = i3;
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
            if ((async instanceof Async.Loading) || Intrinsics.areEqual(async, Async.Uninitialized.INSTANCE)) {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(-215383062);
                LoadingContentKt.FullScreenGenericLoading(composer2, 0);
                composer2.endReplaceGroup();
            } else if (!(async instanceof Async.Fail)) {
                if (!(async instanceof Async.Success)) {
                    composerStartRestartGroup.startReplaceGroup(-215383847);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(1913228188);
                Async.Success success = (Async.Success) async;
                boolean customManualEntry = ((ManualEntryState.Payload) success.invoke()).getCustomManualEntry();
                if (customManualEntry) {
                    composerStartRestartGroup.startReplaceGroup(-215376534);
                    LoadingContentKt.FullScreenGenericLoading(composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                } else {
                    if (customManualEntry) {
                        composerStartRestartGroup.startReplaceGroup(-215377626);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(1913336347);
                    int i7 = i6 << 6;
                    int i8 = i5 >> 3;
                    ManualEntryLoaded((ManualEntryState.Payload) success.invoke(), async2, str, num4, str4, num2, str5, num3, function1, function12, function13, z, function0, function02, composerStartRestartGroup, (29360128 & i7) | ((i6 >> 21) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (3670016 & i7) | ((i6 >> 3) & 234881024) | ((i5 << 27) & 1879048192), (i5 & 896) | (i8 & 14) | ((i6 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i8 & 7168));
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                }
                composer2.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-215381423);
                composerStartRestartGroup.startReplaceGroup(-215380648);
                boolean z2 = ((i5 & 7168) == 2048) | ((i6 & 29360128) == 8388608);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ManualEntryScreenKt.ManualEntryContent$lambda$12$lambda$11$lambda$10(function14, async);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                ErrorContentKt.UnclassifiedErrorContent(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ManualEntryScreenKt.ManualEntryContent$lambda$13(str, num, str2, num2, str3, num3, z, async, async2, function1, function12, function13, function0, function14, function02, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ManualEntryContent$lambda$12$lambda$11$lambda$10(Function1 function1, Async async) {
        function1.invoke(((Async.Fail) async).getError());
        return Unit.INSTANCE;
    }

    private static final void ManualEntryLoaded(final ManualEntryState.Payload payload, final Async<LinkAccountSessionPaymentAccount> async, final String str, final Integer num, final String str2, final Integer num2, final String str3, final Integer num3, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function12, final Function1<? super String, Unit> function13, final boolean z, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i, final int i2) {
        ManualEntryState.Payload payload2;
        int i3;
        String str4;
        Integer num4;
        final String str5;
        int i4;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-877904560);
        if ((i & 6) == 0) {
            payload2 = payload;
            i3 = (composerStartRestartGroup.changed(payload2) ? 4 : 2) | i;
        } else {
            payload2 = payload;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(async) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            str4 = str;
            i3 |= composerStartRestartGroup.changed(str4) ? 256 : 128;
        } else {
            str4 = str;
        }
        if ((i & 3072) == 0) {
            num4 = num;
            i3 |= composerStartRestartGroup.changed(num4) ? 2048 : 1024;
        } else {
            num4 = num;
        }
        if ((i & 24576) == 0) {
            str5 = str2;
            i3 |= composerStartRestartGroup.changed(str5) ? 16384 : 8192;
        } else {
            str5 = str2;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= composerStartRestartGroup.changed(num2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changed(str3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changed(num3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function12) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(function13) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        int i5 = i4;
        if ((i3 & 306783379) != 306783378 || (i5 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-877904560, i3, i5, "com.stripe.android.financialconnections.features.manualentry.ManualEntryLoaded (ManualEntryScreen.kt:136)");
            }
            final boolean z2 = async instanceof Async.Loading;
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1557836879, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt.ManualEntryLoaded.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num5) {
                    invoke(composer3, num5.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1557836879, i6, -1, "com.stripe.android.financialconnections.features.manualentry.ManualEntryLoaded.<anonymous> (ManualEntryScreen.kt:180)");
                        }
                        ManualEntryScreenKt.ManualEntryFooter(z, z2, function0, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            final ManualEntryState.Payload payload3 = payload2;
            final Integer num5 = num4;
            final String str6 = str4;
            composer2 = composerStartRestartGroup;
            LayoutKt.Layout(null, null, false, false, false, null, false, scrollStateRememberScrollState, composableLambdaRememberComposableLambda, ComposableLambdaKt.rememberComposableLambda(1284592512, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt.ManualEntryLoaded.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num6) {
                    invoke(columnScope, composer3, num6.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope Layout, Composer composer3, int i6) {
                    float f;
                    float f2;
                    int i7;
                    int i8;
                    Composer composer4 = composer3;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    if ((i6 & 17) != 16 || !composer4.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1284592512, i6, -1, "com.stripe.android.financialconnections.features.manualentry.ManualEntryLoaded.<anonymous> (ManualEntryScreen.kt:142)");
                        }
                        float f3 = 8;
                        SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f3)), composer4, 6);
                        ManualEntryScreenKt.Title(composer4, 0);
                        float f4 = 16;
                        SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f4)), composer4, 6);
                        composer4.startReplaceGroup(1950677136);
                        if (payload3.getVerifyWithMicrodeposits()) {
                            SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f3)), composer4, 6);
                            f2 = f4;
                            f = f3;
                            TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_manualentry_microdeposits_desc, composer4, 0), (Modifier) null, FinancialConnectionsTheme.INSTANCE.getColors(composer4, 6).m7645getTextDefault0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composer4, 6).getBodyMedium(), composer3, 0, 0, 65530);
                            composer4 = composer3;
                        } else {
                            f = f3;
                            f2 = f4;
                        }
                        composer4.endReplaceGroup();
                        composer4.startReplaceGroup(1950689910);
                        if (payload3.getTestMode()) {
                            i8 = 6;
                            SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f)), composer4, 6);
                            i7 = 0;
                            TestModeBannerKt.TestModeBanner(!z2, StringResources_androidKt.stringResource(R.string.stripe_manualentry_test_banner, composer4, 0), function02, null, null, composer4, 0, 24);
                        } else {
                            i7 = 0;
                            i8 = 6;
                        }
                        composer4.endReplaceGroup();
                        SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(24)), composer4, i8);
                        ManualEntryScreenKt.AccountForm(!z2, str6, num5, function1, str5, num2, function12, str3, num3, function13, composer3, 0);
                        if (async instanceof Async.Fail) {
                            SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f2)), composer3, i8);
                            ManualEntryScreenKt.ErrorMessage(((Async.Fail) async).getError(), composer3, i7);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer4.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composer2, 905969664, 127);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ManualEntryScreenKt.ManualEntryLoaded$lambda$14(payload, async, str, num, str2, num2, str3, num3, function1, function12, function13, z, function0, function02, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ErrorMessage(final Throwable th, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(672431123);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(th) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(672431123, i2, -1, "com.stripe.android.financialconnections.features.manualentry.ErrorMessage (ManualEntryScreen.kt:192)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            int iM6006getCentere0LSkKk = TextAlign.INSTANCE.m6006getCentere0LSkKk();
            StripeException stripeException = th instanceof StripeException ? (StripeException) th : null;
            String message = stripeException != null ? stripeException.getMessage() : null;
            composerStartRestartGroup.startReplaceGroup(-1751270454);
            if (message == null) {
                message = StringResources_androidKt.stringResource(R.string.stripe_error_generic_title, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            TextKt.m2076Text4IGK_g(message, modifierFillMaxWidth$default, FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7644getTextCritical0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5999boximpl(iM6006getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getBodyMedium(), composer2, 48, 0, 65016);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ManualEntryScreenKt.ErrorMessage$lambda$15(th, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Title(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(492801228);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(492801228, i, -1, "com.stripe.android.financialconnections.features.manualentry.Title (ManualEntryScreen.kt:204)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_manualentry_title, composerStartRestartGroup, 0), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getHeadingXLarge(), composer2, 48, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ManualEntryScreenKt.Title$lambda$16(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountForm(final boolean z, final String str, final Integer num, final Function1<? super String, Unit> function1, final String str2, final Integer num2, final Function1<? super String, Unit> function12, final String str3, final Integer num3, final Function1<? super String, Unit> function13, Composer composer, final int i) {
        int i2;
        Function1<? super String, Unit> function14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1215456808);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(num) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function14 = function1;
            i2 |= composerStartRestartGroup.changedInstance(function14) ? 2048 : 1024;
        } else {
            function14 = function1;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(num2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(num3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function13) ? 536870912 : 268435456;
        }
        if ((306783379 & i2) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1215456808, i2, -1, "com.stripe.android.financialconnections.features.manualentry.AccountForm (ManualEntryScreen.kt:225)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            int i3 = (i2 & 14) | 24576;
            int i4 = i2;
            InputWithError(z, str, num, R.string.stripe_manualentry_routing, "RoutingInput", function14, composerStartRestartGroup, (i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | i3 | (i2 & 896) | ((i2 << 6) & 458752));
            int i5 = i4 >> 9;
            InputWithError(z, str2, num2, R.string.stripe_manualentry_account, "AccountInput", function12, composerStartRestartGroup, (i5 & 896) | (i5 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | i3 | ((i4 >> 3) & 458752));
            int i6 = i4 >> 18;
            InputWithError(z, str3, num3, R.string.stripe_manualentry_accountconfirm, "ConfirmAccountInput", function13, composerStartRestartGroup, i3 | (i6 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i6 & 896) | ((i4 >> 12) & 458752));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ManualEntryScreenKt.AccountForm$lambda$18(z, str, num, function1, str2, num2, function12, str3, num3, function13, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ManualEntryFooter(boolean z, boolean z2, Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        final boolean z3;
        final boolean z4;
        final Function0<Unit> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(1245181295);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1245181295, i2, -1, "com.stripe.android.financialconnections.features.manualentry.ManualEntryFooter (ManualEntryScreen.kt:262)");
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
            int i3 = ((i2 >> 6) & 14) | 1572912;
            int i4 = i2 << 12;
            z3 = z;
            z4 = z2;
            function02 = function0;
            ButtonKt.FinancialConnectionsButton(function02, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, z3, z4, ComposableSingletons$ManualEntryScreenKt.INSTANCE.m7426getLambda1$financial_connections_release(), composerStartRestartGroup, i3 | (57344 & i4) | (i4 & 458752), 12);
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
            z3 = z;
            z4 = z2;
            function02 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ManualEntryScreenKt.ManualEntryFooter$lambda$20(z3, z4, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void InputWithError(final boolean z, final String str, final Integer num, final int i, final String str2, final Function1<? super String, Unit> function1, Composer composer, final int i2) {
        int i3;
        String str3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(221756411);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            str3 = str;
            i3 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changed(num) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(221756411, i3, -1, "com.stripe.android.financialconnections.features.manualentry.InputWithError (ManualEntryScreen.kt:285)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(4));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.INSTANCE.m5837getNumberPjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (DefaultConstructorMarker) null);
            boolean z2 = num != null;
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1491598682);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ManualEntryScreenKt.InputWithError$lambda$23$lambda$22$lambda$21((SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierTestTag = TestTagKt.testTag(SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), str2);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(777987353, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt$InputWithError$1$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num2) {
                    invoke(composer3, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    if ((i4 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(777987353, i4, -1, "com.stripe.android.financialconnections.features.manualentry.InputWithError.<anonymous>.<anonymous> (ManualEntryScreen.kt:297)");
                        }
                        TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(i, composer3, 0), (Modifier) null, FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7647getTextSubdued0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composer3, 6).getLabelLarge(), composer3, 0, 0, 65530);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            int i4 = ((i3 >> 3) & 14) | 102236160 | ((i3 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
            int i5 = i3 >> 6;
            TextFieldKt.FinancialConnectionsOutlinedTextField(str3, z, modifierTestTag, function1, false, z2, keyboardOptions, null, composableLambdaRememberComposableLambda, null, null, null, null, composerStartRestartGroup, i4 | (i5 & 7168), 0, 7824);
            composerStartRestartGroup.startReplaceGroup(1491601596);
            if (num != null) {
                composer2 = composerStartRestartGroup;
                TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(num.intValue(), composerStartRestartGroup, i5 & 14), (Modifier) null, FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7644getTextCritical0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLabelSmall(), composer2, 0, 0, 65530);
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ManualEntryScreenKt.InputWithError$lambda$24(z, str, num, i, str2, function1, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputWithError$lambda$23$lambda$22$lambda$21(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }

    /* compiled from: ManualEntryScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt$ManualEntryPreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C09181 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ManualEntryPreviewParameterProvider.PreviewState $previewState;

        C09181(ManualEntryPreviewParameterProvider.PreviewState previewState) {
            this.$previewState = previewState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(900506020, i, -1, "com.stripe.android.financialconnections.features.manualentry.ManualEntryPreview.<anonymous> (ManualEntryScreen.kt:327)");
                }
                String routing = this.$previewState.getRouting();
                Integer routingError = this.$previewState.getRoutingError();
                String account = this.$previewState.getAccount();
                Integer accountError = this.$previewState.getAccountError();
                String accountConfirm = this.$previewState.getAccountConfirm();
                Integer accountConfirmError = this.$previewState.getAccountConfirmError();
                Async<ManualEntryState.Payload> payload = this.$previewState.getState().getPayload();
                Async<LinkAccountSessionPaymentAccount> linkPaymentAccount = this.$previewState.getState().getLinkPaymentAccount();
                composer.startReplaceGroup(-32067327);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt$ManualEntryPreview$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ManualEntryScreenKt.C09181.invoke$lambda$1$lambda$0((String) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-32066207);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt$ManualEntryPreview$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ManualEntryScreenKt.C09181.invoke$lambda$3$lambda$2((String) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function1 function12 = (Function1) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-32064863);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt$ManualEntryPreview$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ManualEntryScreenKt.C09181.invoke$lambda$5$lambda$4((String) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                Function1 function13 = (Function1) objRememberedValue3;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-32063071);
                Object objRememberedValue4 = composer.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt$ManualEntryPreview$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                Function0 function0 = (Function0) objRememberedValue4;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-32061791);
                Object objRememberedValue5 = composer.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt$ManualEntryPreview$1$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ManualEntryScreenKt.C09181.invoke$lambda$9$lambda$8((Throwable) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                Function1 function14 = (Function1) objRememberedValue5;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-32063935);
                Object objRememberedValue6 = composer.rememberedValue();
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt$ManualEntryPreview$1$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue6);
                }
                composer.endReplaceGroup();
                ManualEntryScreenKt.ManualEntryContent(routing, routingError, account, accountError, accountConfirm, accountConfirmError, true, payload, linkPaymentAccount, function1, function12, function13, function0, function14, (Function0) objRememberedValue6, composer, 806879232, 28086);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final void ManualEntryPreview(@PreviewParameter(provider = ManualEntryPreviewParameterProvider.class) final ManualEntryPreviewParameterProvider.PreviewState previewState, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(previewState, "previewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1825478411);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(previewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1825478411, i2, -1, "com.stripe.android.financialconnections.features.manualentry.ManualEntryPreview (ManualEntryScreen.kt:325)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(null, false, ComposableLambdaKt.rememberComposableLambda(900506020, true, new C09181(previewState), composerStartRestartGroup, 54), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ManualEntryScreenKt.ManualEntryPreview$lambda$25(previewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final ManualEntryState ManualEntryScreen$lambda$1(State<ManualEntryState> state) {
        return state.getValue();
    }

    private static final ManualEntryFormState ManualEntryScreen$lambda$2(State<ManualEntryFormState> state) {
        return state.getValue();
    }
}
