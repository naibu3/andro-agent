package com.stripe.android.financialconnections.features.networkinglinksignup;

import android.R;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
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
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.financialconnections.features.common.ErrorContentKt;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.common.LoadingContentKt;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel;
import com.stripe.android.financialconnections.model.Bullet;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.ComposeExtensionsKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModelKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.CompositionLocalKt;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.components.ButtonKt;
import com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.stripe.android.financialconnections.ui.sdui.BulletUI;
import com.stripe.android.financialconnections.ui.sdui.ServerDrivenUiKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import com.stripe.android.financialconnections.ui.theme.LayoutKt;
import com.stripe.android.financialconnections.ui.theme.StripeThemeForConnectionsKt;
import com.stripe.android.financialconnections.ui.theme.Theme;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.elements.TextFieldController;
import com.stripe.android.uicore.elements.TextFieldUIKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NetworkingLinkSignupScreen.kt */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001aY\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0003¢\u0006\u0002\u0010\u000e\u001ak\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00112\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0003¢\u0006\u0002\u0010\u0019\u001aU\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0003¢\u0006\u0002\u0010\u001b\u001a\u001d\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eH\u0003¢\u0006\u0002\u0010\u001f\u001a\u0015\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\"\u001a\u0015\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\"\u001a5\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020(2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eH\u0001¢\u0006\u0002\u0010*\u001a\"\u0010+\u001a\u00020\u0001*\u00020,2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.H\u0082@¢\u0006\u0002\u00100\u001a\u0017\u00101\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u00102¨\u00063²\u0006\n\u0010\u0004\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u00104\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u00104\u001a\u00020\u0011X\u008a\u008e\u0002"}, d2 = {"NetworkingLinkSignupScreen", "", "(Landroidx/compose/runtime/Composer;I)V", "NetworkingLinkSignupContent", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;", "onCloseFromErrorClick", "Lkotlin/Function1;", "", "onClickableTextClick", "", "onSaveToLink", "Lkotlin/Function0;", "onSkipClick", "(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "NetworkingLinkSignupLoaded", "validForm", "", "payload", "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;", "isLoading", "lookupAccountSync", "Lcom/stripe/android/financialconnections/presentation/Async;", "Lcom/stripe/android/model/ConsumerSessionLookup;", "showFullForm", "(ZLcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;ZLcom/stripe/android/financialconnections/presentation/Async;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "NetworkingLinkSignupFooter", "(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PhoneNumberSection", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;I)V", "Title", "title", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Body", "body", "EmailSection", ViewProps.ENABLED, "emailController", "Lcom/stripe/android/uicore/elements/TextFieldController;", "loading", "(ZLcom/stripe/android/uicore/elements/TextFieldController;ZZLandroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;I)V", "animateScrollToBottom", "Landroidx/compose/foundation/ScrollState;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "(Landroidx/compose/foundation/ScrollState;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "NetworkingLinkSignupScreenPreview", "(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Landroidx/compose/runtime/Composer;I)V", "financial-connections_release", "focused"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NetworkingLinkSignupScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Body$lambda$33(String str, int i, Composer composer, int i2) {
        Body(str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailSection$lambda$37(boolean z, TextFieldController textFieldController, boolean z2, boolean z3, FocusRequester focusRequester, int i, Composer composer, int i2) {
        EmailSection(z, textFieldController, z2, z3, focusRequester, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NetworkingLinkSignupContent$lambda$13(NetworkingLinkSignupState networkingLinkSignupState, Function1 function1, Function1 function12, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        NetworkingLinkSignupContent(networkingLinkSignupState, function1, function12, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NetworkingLinkSignupFooter$lambda$22(NetworkingLinkSignupState.Payload payload, Function1 function1, boolean z, boolean z2, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        NetworkingLinkSignupFooter(payload, function1, z, z2, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NetworkingLinkSignupLoaded$lambda$18(boolean z, NetworkingLinkSignupState.Payload payload, boolean z2, Async async, boolean z3, Function1 function1, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        NetworkingLinkSignupLoaded(z, payload, z2, async, z3, function1, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NetworkingLinkSignupScreen$lambda$9(int i, Composer composer, int i2) {
        NetworkingLinkSignupScreen(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NetworkingLinkSignupScreenPreview$lambda$38(NetworkingLinkSignupState networkingLinkSignupState, int i, Composer composer, int i2) {
        NetworkingLinkSignupScreenPreview(networkingLinkSignupState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PhoneNumberSection$lambda$27(NetworkingLinkSignupState.Payload payload, FocusRequester focusRequester, int i, Composer composer, int i2) {
        PhoneNumberSection(payload, focusRequester, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Title$lambda$30(String str, int i, Composer composer, int i2) {
        Title(str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void NetworkingLinkSignupScreen(Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1489011962);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1489011962, i, -1, "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreen (NetworkingLinkSignupScreen.kt:73)");
            }
            NetworkingLinkSignupViewModel.Companion companion = NetworkingLinkSignupViewModel.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1481344674);
            ViewModelProvider.Factory factory = companion.factory(ComposeExtensionsKt.parentActivity(composerStartRestartGroup, 0).getViewModel().getActivityRetainedComponent());
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
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(NetworkingLinkSignupViewModel.class), current, (String) null, factory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceGroup();
            NetworkingLinkSignupViewModel networkingLinkSignupViewModel = (NetworkingLinkSignupViewModel) ((FinancialConnectionsViewModel) viewModel);
            FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModelParentViewModel = FinancialConnectionsSheetNativeViewModelKt.parentViewModel(composerStartRestartGroup, 0);
            State stateCollectAsState = StateFlowsComposeKt.collectAsState(networkingLinkSignupViewModel.getStateFlow(), null, composerStartRestartGroup, 0, 1);
            ProvidableCompositionLocal<UriHandler> localUriHandler = CompositionLocalsKt.getLocalUriHandler();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localUriHandler);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            UriHandler uriHandler = (UriHandler) objConsume;
            boolean zIsInstantDebits = true ^ NetworkingLinkSignupScreen$lambda$0(stateCollectAsState).isInstantDebits();
            composerStartRestartGroup.startReplaceGroup(2097548442);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BackHandlerKt.BackHandler(zIsInstantDebits, (Function0) objRememberedValue, composerStartRestartGroup, 48, 0);
            NetworkingLinkSignupState.ViewEffect viewEffect = NetworkingLinkSignupScreen$lambda$0(stateCollectAsState).getViewEffect();
            composerStartRestartGroup.startReplaceGroup(2097555452);
            if (viewEffect != null) {
                composerStartRestartGroup.startReplaceGroup(2011311262);
                boolean zChanged = composerStartRestartGroup.changed(viewEffect) | composerStartRestartGroup.changedInstance(uriHandler) | composerStartRestartGroup.changedInstance(networkingLinkSignupViewModel);
                NetworkingLinkSignupScreenKt$NetworkingLinkSignupScreen$2$1$1 networkingLinkSignupScreenKt$NetworkingLinkSignupScreen$2$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || networkingLinkSignupScreenKt$NetworkingLinkSignupScreen$2$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    networkingLinkSignupScreenKt$NetworkingLinkSignupScreen$2$1$1RememberedValue = new NetworkingLinkSignupScreenKt$NetworkingLinkSignupScreen$2$1$1(viewEffect, uriHandler, networkingLinkSignupViewModel, null);
                    composerStartRestartGroup.updateRememberedValue(networkingLinkSignupScreenKt$NetworkingLinkSignupScreen$2$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(viewEffect, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) networkingLinkSignupScreenKt$NetworkingLinkSignupScreen$2$1$1RememberedValue, composerStartRestartGroup, 0);
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            NetworkingLinkSignupState networkingLinkSignupStateNetworkingLinkSignupScreen$lambda$0 = NetworkingLinkSignupScreen$lambda$0(stateCollectAsState);
            composerStartRestartGroup.startReplaceGroup(2097565438);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(financialConnectionsSheetNativeViewModelParentViewModel);
            NetworkingLinkSignupScreenKt$NetworkingLinkSignupScreen$3$1 networkingLinkSignupScreenKt$NetworkingLinkSignupScreen$3$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || networkingLinkSignupScreenKt$NetworkingLinkSignupScreen$3$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                networkingLinkSignupScreenKt$NetworkingLinkSignupScreen$3$1RememberedValue = new NetworkingLinkSignupScreenKt$NetworkingLinkSignupScreen$3$1(financialConnectionsSheetNativeViewModelParentViewModel);
                composerStartRestartGroup.updateRememberedValue(networkingLinkSignupScreenKt$NetworkingLinkSignupScreen$3$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function1 function1 = (Function1) ((KFunction) networkingLinkSignupScreenKt$NetworkingLinkSignupScreen$3$1RememberedValue);
            composerStartRestartGroup.startReplaceGroup(2097567703);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(networkingLinkSignupViewModel);
            NetworkingLinkSignupScreenKt$NetworkingLinkSignupScreen$4$1 networkingLinkSignupScreenKt$NetworkingLinkSignupScreen$4$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || networkingLinkSignupScreenKt$NetworkingLinkSignupScreen$4$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                networkingLinkSignupScreenKt$NetworkingLinkSignupScreen$4$1RememberedValue = new NetworkingLinkSignupScreenKt$NetworkingLinkSignupScreen$4$1(networkingLinkSignupViewModel);
                composerStartRestartGroup.updateRememberedValue(networkingLinkSignupScreenKt$NetworkingLinkSignupScreen$4$1RememberedValue);
            }
            Function1 function12 = (Function1) networkingLinkSignupScreenKt$NetworkingLinkSignupScreen$4$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(2097569488);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(networkingLinkSignupViewModel);
            NetworkingLinkSignupScreenKt$NetworkingLinkSignupScreen$5$1 networkingLinkSignupScreenKt$NetworkingLinkSignupScreen$5$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || networkingLinkSignupScreenKt$NetworkingLinkSignupScreen$5$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                networkingLinkSignupScreenKt$NetworkingLinkSignupScreen$5$1RememberedValue = new NetworkingLinkSignupScreenKt$NetworkingLinkSignupScreen$5$1(networkingLinkSignupViewModel);
                composerStartRestartGroup.updateRememberedValue(networkingLinkSignupScreenKt$NetworkingLinkSignupScreen$5$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0 function0 = (Function0) ((KFunction) networkingLinkSignupScreenKt$NetworkingLinkSignupScreen$5$1RememberedValue);
            composerStartRestartGroup.startReplaceGroup(2097571022);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(networkingLinkSignupViewModel);
            NetworkingLinkSignupScreenKt$NetworkingLinkSignupScreen$6$1 networkingLinkSignupScreenKt$NetworkingLinkSignupScreen$6$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || networkingLinkSignupScreenKt$NetworkingLinkSignupScreen$6$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                networkingLinkSignupScreenKt$NetworkingLinkSignupScreen$6$1RememberedValue = new NetworkingLinkSignupScreenKt$NetworkingLinkSignupScreen$6$1(networkingLinkSignupViewModel);
                composerStartRestartGroup.updateRememberedValue(networkingLinkSignupScreenKt$NetworkingLinkSignupScreen$6$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            NetworkingLinkSignupContent(networkingLinkSignupStateNetworkingLinkSignupScreen$lambda$0, function1, function12, function0, (Function0) networkingLinkSignupScreenKt$NetworkingLinkSignupScreen$6$1RememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NetworkingLinkSignupScreenKt.NetworkingLinkSignupScreen$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NetworkingLinkSignupContent(NetworkingLinkSignupState networkingLinkSignupState, final Function1<? super Throwable, Unit> function1, final Function1<? super String, Unit> function12, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        final NetworkingLinkSignupState networkingLinkSignupState2;
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1361537896);
        if ((i & 6) == 0) {
            networkingLinkSignupState2 = networkingLinkSignupState;
            i2 = (composerStartRestartGroup.changedInstance(networkingLinkSignupState2) ? 4 : 2) | i;
        } else {
            networkingLinkSignupState2 = networkingLinkSignupState;
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
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1361537896, i2, -1, "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupContent (NetworkingLinkSignupScreen.kt:110)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
            final Async<NetworkingLinkSignupState.Payload> payload = networkingLinkSignupState2.getPayload();
            if (Intrinsics.areEqual(payload, Async.Uninitialized.INSTANCE) || (payload instanceof Async.Loading)) {
                composerStartRestartGroup.startReplaceGroup(-1440928666);
                LoadingContentKt.FullScreenGenericLoading(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (payload instanceof Async.Success) {
                composerStartRestartGroup.startReplaceGroup(-1719050305);
                NetworkingLinkSignupLoaded(networkingLinkSignupState2.getValid(), (NetworkingLinkSignupState.Payload) ((Async.Success) payload).invoke(), networkingLinkSignupState2.getSaveAccountToLink() instanceof Async.Loading, networkingLinkSignupState2.getLookupAccount(), networkingLinkSignupState2.getShowFullForm(), function12, function0, function02, composerStartRestartGroup, (i2 << 9) & R.attr.shouldUseDefaultUnfoldTransition);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(payload instanceof Async.Fail)) {
                    composerStartRestartGroup.startReplaceGroup(-1440930518);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-1440912083);
                composerStartRestartGroup.startReplaceGroup(-1440911308);
                boolean zChangedInstance = ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32) | composerStartRestartGroup.changedInstance(payload);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NetworkingLinkSignupScreenKt.NetworkingLinkSignupContent$lambda$12$lambda$11$lambda$10(function1, payload);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                ErrorContentKt.UnclassifiedErrorContent(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NetworkingLinkSignupScreenKt.NetworkingLinkSignupContent$lambda$13(networkingLinkSignupState2, function1, function12, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NetworkingLinkSignupContent$lambda$12$lambda$11$lambda$10(Function1 function1, Async async) {
        function1.invoke(((Async.Fail) async).getError());
        return Unit.INSTANCE;
    }

    private static final void NetworkingLinkSignupLoaded(final boolean z, final NetworkingLinkSignupState.Payload payload, final boolean z2, final Async<ConsumerSessionLookup> async, final boolean z3, final Function1<? super String, Unit> function1, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        FocusRequester focusRequester;
        FocusRequester focusRequester2;
        ScrollState scrollState;
        boolean z4;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-274221274);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(payload) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(async) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if ((4793491 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-274221274, i3, -1, "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupLoaded (NetworkingLinkSignupScreen.kt:140)");
            }
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(60357614);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            FocusRequester focusRequester3 = (FocusRequester) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(60359726);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            FocusRequester focusRequester4 = (FocusRequester) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(60360941);
            if (payload.getFocusEmailField()) {
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(60362795);
                NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$1$1 networkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                focusRequester = focusRequester4;
                if (networkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    networkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$1$1RememberedValue = new NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$1$1(focusRequester3, null);
                    composerStartRestartGroup.updateRememberedValue(networkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) networkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$1$1RememberedValue, composerStartRestartGroup, 6);
            } else {
                focusRequester = focusRequester4;
            }
            composerStartRestartGroup.endReplaceGroup();
            Boolean boolValueOf = Boolean.valueOf(z3);
            composerStartRestartGroup.startReplaceGroup(60366118);
            boolean zChanged = ((57344 & i3) == 16384) | composerStartRestartGroup.changed(scrollStateRememberScrollState) | composerStartRestartGroup.changedInstance(payload);
            NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1 networkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || networkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                focusRequester2 = focusRequester3;
                scrollState = scrollStateRememberScrollState;
                z4 = true;
                networkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1RememberedValue = new NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1(z3, scrollStateRememberScrollState, payload, focusRequester, null);
                composerStartRestartGroup.updateRememberedValue(networkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1RememberedValue);
            } else {
                focusRequester2 = focusRequester3;
                scrollState = scrollStateRememberScrollState;
                z4 = true;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) networkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1RememberedValue, composerStartRestartGroup, (i3 >> 12) & 14);
            boolean z5 = z4;
            final FocusRequester focusRequester5 = focusRequester2;
            final FocusRequester focusRequester6 = focusRequester;
            composer2 = composerStartRestartGroup;
            LayoutKt.Layout(null, null, false, false, false, null, false, scrollState, ComposableLambdaKt.rememberComposableLambda(1194072775, z5, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt.NetworkingLinkSignupLoaded.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    if ((i4 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1194072775, i4, -1, "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupLoaded.<anonymous> (NetworkingLinkSignupScreen.kt:195)");
                        }
                        NetworkingLinkSignupScreenKt.NetworkingLinkSignupFooter(payload, function1, z2, z, function0, function02, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(932825430, z5, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt.NetworkingLinkSignupLoaded.4
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                    invoke(columnScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope Layout, Composer composer3, int i4) {
                    int i5;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    if ((i4 & 6) == 0) {
                        i5 = (composer3.changed(Layout) ? 4 : 2) | i4;
                    } else {
                        i5 = i4;
                    }
                    if ((i5 & 19) != 18 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(932825430, i5, -1, "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupLoaded.<anonymous> (NetworkingLinkSignupScreen.kt:163)");
                        }
                        NetworkingLinkSignupScreenKt.Title(payload.getContent().getTitle(), composer3, 0);
                        float f = 24;
                        SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f)), composer3, 6);
                        composer3.startReplaceGroup(-444134006);
                        if (payload.getContent().getMessage() != null) {
                            NetworkingLinkSignupScreenKt.Body(payload.getContent().getMessage(), composer3, 0);
                            SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f)), composer3, 6);
                        }
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(-444128513);
                        Iterator<Bullet> it = payload.getContent().getBullets().iterator();
                        while (it.hasNext()) {
                            ListItemKt.ListItem(BulletUI.INSTANCE.from(it.next()), function1, composer3, 0);
                            SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(16)), composer3, 6);
                        }
                        composer3.endReplaceGroup();
                        NetworkingLinkSignupScreenKt.EmailSection(true, payload.getEmailController(), z3, async instanceof Async.Loading, focusRequester5, composer3, (SimpleTextFieldController.$stable << 3) | 24582);
                        boolean z6 = z3;
                        final NetworkingLinkSignupState.Payload payload2 = payload;
                        final FocusRequester focusRequester7 = focusRequester6;
                        AnimatedVisibilityKt.AnimatedVisibility(Layout, z6, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(2132771198, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt.NetworkingLinkSignupLoaded.4.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                                invoke(animatedVisibilityScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i6) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2132771198, i6, -1, "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupLoaded.<anonymous>.<anonymous> (NetworkingLinkSignupScreen.kt:188)");
                                }
                                NetworkingLinkSignupScreenKt.PhoneNumberSection(payload2, focusRequester7, composer4, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, (i5 & 14) | 1572864, 30);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NetworkingLinkSignupScreenKt.NetworkingLinkSignupLoaded$lambda$18(z, payload, z2, async, z3, function1, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NetworkingLinkSignupFooter(final NetworkingLinkSignupState.Payload payload, final Function1<? super String, Unit> function1, final boolean z, final boolean z2, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        boolean z3;
        boolean z4;
        Function0<Unit> function03;
        Composer composerStartRestartGroup = composer.startRestartGroup(357624048);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(payload) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            z3 = z;
            i2 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
        } else {
            z3 = z;
        }
        if ((i & 3072) == 0) {
            z4 = z2;
            i2 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
        } else {
            z4 = z2;
        }
        if ((i & 24576) == 0) {
            function03 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function03) ? 16384 : 8192;
        } else {
            function03 = function0;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(357624048, i2, -1, "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupFooter (NetworkingLinkSignupScreen.kt:216)");
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
            int i3 = i2;
            TextKt.m7586AnnotatedTextrm0N8CA(new TextResource.Text(ServerDrivenUiKt.fromHtml(payload.getContent().getAboveCta())), function1, TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLabelSmall(), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m6006getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, 0, 0, composerStartRestartGroup, (i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 3072, OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
            SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(16)), composerStartRestartGroup, 6);
            ButtonKt.FinancialConnectionsButton(function03, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), FinancialConnectionsButton.Type.Primary.INSTANCE, null, z4, z3, ComposableLambdaKt.rememberComposableLambda(-1113135103, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$NetworkingLinkSignupFooter$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope FinancialConnectionsButton, Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
                    if ((i4 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1113135103, i4, -1, "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupFooter.<anonymous>.<anonymous> (NetworkingLinkSignupScreen.kt:235)");
                    }
                    androidx.compose.material.TextKt.m2076Text4IGK_g(payload.getContent().getCta(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 12) & 14) | 1573296 | ((i3 << 3) & 57344) | ((i3 << 9) & 458752), 8);
            composerStartRestartGroup.startReplaceGroup(743780398);
            if (payload.getContent().getSkipCta() != null) {
                SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(8)), composerStartRestartGroup, 6);
                FinancialConnectionsButton.Type.Secondary secondary = FinancialConnectionsButton.Type.Secondary.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(743789925);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NetworkingLinkSignupScreenKt.NetworkingLinkSignupFooter$lambda$21$lambda$20$lambda$19((SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                ButtonKt.FinancialConnectionsButton(function02, TestTagKt.testTag(SemanticsModifierKt.semantics$default(modifierFillMaxWidth$default, false, (Function1) objRememberedValue, 1, null), "skip_cta"), secondary, null, false, false, ComposableLambdaKt.rememberComposableLambda(-614143034, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$NetworkingLinkSignupFooter$1$3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope FinancialConnectionsButton, Composer composer2, int i4) {
                        Intrinsics.checkNotNullParameter(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
                        if ((i4 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-614143034, i4, -1, "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupFooter.<anonymous>.<anonymous> (NetworkingLinkSignupScreen.kt:249)");
                        }
                        androidx.compose.material.TextKt.m2076Text4IGK_g(payload.getContent().getSkipCta(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 15) & 14) | 1573248, 56);
            }
            composerStartRestartGroup.endReplaceGroup();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NetworkingLinkSignupScreenKt.NetworkingLinkSignupFooter$lambda$22(payload, function1, z, z2, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NetworkingLinkSignupFooter$lambda$21$lambda$20$lambda$19(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PhoneNumberSection(final NetworkingLinkSignupState.Payload payload, final FocusRequester focusRequester, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-874903828);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(payload) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-874903828, i2, -1, "com.stripe.android.financialconnections.features.networkinglinksignup.PhoneNumberSection (NetworkingLinkSignupScreen.kt:258)");
            }
            composerStartRestartGroup.startReplaceGroup(360561270);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
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
            StripeThemeForConnectionsKt.StripeThemeForConnections(ComposableLambdaKt.rememberComposableLambda(761906335, true, new NetworkingLinkSignupScreenKt$PhoneNumberSection$1$1(payload, focusRequester, mutableState), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NetworkingLinkSignupScreenKt.PhoneNumberSection$lambda$27(payload, focusRequester, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PhoneNumberSection$lambda$24(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PhoneNumberSection$lambda$25(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Title(final String str, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1534405939);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1534405939, i2, -1, "com.stripe.android.financialconnections.features.networkinglinksignup.Title (NetworkingLinkSignupScreen.kt:287)");
            }
            TextResource.Text text = new TextResource.Text(ServerDrivenUiKt.fromHtml(str));
            TextStyle textStyleM5615copyp1EtxEg$default = TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getHeadingXLarge(), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            TextResource.Text text2 = text;
            composerStartRestartGroup.startReplaceGroup(1987973044);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NetworkingLinkSignupScreenKt.Title$lambda$29$lambda$28((String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            TextKt.m7586AnnotatedTextrm0N8CA(text2, (Function1) objRememberedValue, textStyleM5615copyp1EtxEg$default, null, null, 0, 0, composerStartRestartGroup, 48, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NetworkingLinkSignupScreenKt.Title$lambda$30(str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Title$lambda$29$lambda$28(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Body(final String str, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1942722393);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1942722393, i2, -1, "com.stripe.android.financialconnections.features.networkinglinksignup.Body (NetworkingLinkSignupScreen.kt:298)");
            }
            TextResource.Text text = new TextResource.Text(ServerDrivenUiKt.fromHtml(str));
            TextStyle textStyleM5615copyp1EtxEg$default = TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getBodyMedium(), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            TextResource.Text text2 = text;
            composerStartRestartGroup.startReplaceGroup(-307214006);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NetworkingLinkSignupScreenKt.Body$lambda$32$lambda$31((String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            TextKt.m7586AnnotatedTextrm0N8CA(text2, (Function1) objRememberedValue, textStyleM5615copyp1EtxEg$default, null, null, 0, 0, composerStartRestartGroup, 48, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NetworkingLinkSignupScreenKt.Body$lambda$33(str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Body$lambda$32$lambda$31(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final void EmailSection(final boolean z, final TextFieldController emailController, final boolean z2, final boolean z3, final FocusRequester focusRequester, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(emailController, "emailController");
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        Composer composerStartRestartGroup = composer.startRestartGroup(-257691582);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(emailController) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-257691582, i2, -1, "com.stripe.android.financialconnections.features.networkinglinksignup.EmailSection (NetworkingLinkSignupScreen.kt:315)");
            }
            composerStartRestartGroup.startReplaceGroup(255763377);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            StripeThemeForConnectionsKt.StripeThemeForConnections(ComposableLambdaKt.rememberComposableLambda(589066431, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt.EmailSection.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(589066431, i3, -1, "com.stripe.android.financialconnections.features.networkinglinksignup.EmailSection.<anonymous> (NetworkingLinkSignupScreen.kt:318)");
                        }
                        float f = 0;
                        Modifier modifierM1020padding3ABfNKs = PaddingKt.m1020padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6117constructorimpl(f));
                        Alignment centerEnd = Alignment.INSTANCE.getCenterEnd();
                        TextFieldController textFieldController = emailController;
                        boolean z4 = z3;
                        MutableState<Boolean> mutableState2 = mutableState;
                        FocusRequester focusRequester2 = focusRequester;
                        boolean z5 = z2;
                        boolean z6 = z;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerEnd, false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1020padding3ABfNKs);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer2);
                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        float f2 = 8;
                        TextFieldUIKt.TextFieldSection(PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(f2), 1, null), textFieldController, NetworkingLinkSignupScreenKt.EmailSection$lambda$35(mutableState2), null, ComposableLambdaKt.rememberComposableLambda(-763771920, true, new NetworkingLinkSignupScreenKt$EmailSection$1$1$1(focusRequester2, z5, textFieldController, z6, mutableState2), composer2, 54), composer2, 24582, 8);
                        composer2.startReplaceGroup(-1880853559);
                        if (z4) {
                            ProgressIndicatorKt.m1958CircularProgressIndicatorLxG7B9w(PaddingKt.m1023paddingqDBjuR0(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(32)), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f2), Dp.m6117constructorimpl(16), Dp.m6117constructorimpl(f2)), FinancialConnectionsTheme.INSTANCE.getColors(composer2, 6).m7637getIconTint0d7_KjU(), Dp.m6117constructorimpl(2), 0L, 0, composer2, 390, 24);
                        }
                        composer2.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NetworkingLinkSignupScreenKt.EmailSection$lambda$37(z, emailController, z2, z3, focusRequester, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean EmailSection$lambda$35(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EmailSection$lambda$36(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    static /* synthetic */ Object animateScrollToBottom$default(ScrollState scrollState, AnimationSpec animationSpec, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            animationSpec = AnimationSpecKt.tween$default(0, 0, null, 7, null);
        }
        return animateScrollToBottom(scrollState, animationSpec, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateScrollToBottom(ScrollState scrollState, AnimationSpec<Float> animationSpec, Continuation<? super Unit> continuation) {
        Object objAnimateScrollBy = ScrollExtensionsKt.animateScrollBy(scrollState, Float.MAX_VALUE, animationSpec, continuation);
        return objAnimateScrollBy == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateScrollBy : Unit.INSTANCE;
    }

    public static final void NetworkingLinkSignupScreenPreview(@PreviewParameter(provider = NetworkingLinkSignupPreviewParameterProvider.class) final NetworkingLinkSignupState state, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-110928151);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-110928151, i2, -1, "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenPreview (NetworkingLinkSignupScreen.kt:368)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(state.isInstantDebits() ? Theme.LinkLight : Theme.DefaultLight, false, ComposableLambdaKt.rememberComposableLambda(-2088977064, true, new C09301(state), composerStartRestartGroup, 54), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NetworkingLinkSignupScreenKt.NetworkingLinkSignupScreenPreview$lambda$38(state, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: NetworkingLinkSignupScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$NetworkingLinkSignupScreenPreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C09301 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ NetworkingLinkSignupState $state;

        C09301(NetworkingLinkSignupState networkingLinkSignupState) {
            this.$state = networkingLinkSignupState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2088977064, i, -1, "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenPreview.<anonymous> (NetworkingLinkSignupScreen.kt:372)");
                }
                NetworkingLinkSignupState networkingLinkSignupState = this.$state;
                composer.startReplaceGroup(1100464657);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$NetworkingLinkSignupScreenPreview$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NetworkingLinkSignupScreenKt.C09301.invoke$lambda$1$lambda$0((Throwable) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1100463377);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$NetworkingLinkSignupScreenPreview$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NetworkingLinkSignupScreenKt.C09301.invoke$lambda$3$lambda$2((String) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function1 function12 = (Function1) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1100462129);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$NetworkingLinkSignupScreenPreview$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                Function0 function0 = (Function0) objRememberedValue3;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1100465617);
                Object objRememberedValue4 = composer.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$NetworkingLinkSignupScreenPreview$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                NetworkingLinkSignupScreenKt.NetworkingLinkSignupContent(networkingLinkSignupState, function1, function12, function0, (Function0) objRememberedValue4, composer, 28080);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    private static final NetworkingLinkSignupState NetworkingLinkSignupScreen$lambda$0(State<NetworkingLinkSignupState> state) {
        return state.getValue();
    }
}
