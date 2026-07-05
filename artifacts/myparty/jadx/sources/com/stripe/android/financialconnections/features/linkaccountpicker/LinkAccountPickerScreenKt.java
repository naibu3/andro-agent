package com.stripe.android.financialconnections.features.linkaccountpicker;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.res.PainterResources_androidKt;
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
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.financialconnections.R;
import com.stripe.android.financialconnections.features.common.AccountItemKt;
import com.stripe.android.financialconnections.features.common.ErrorContentKt;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerState;
import com.stripe.android.financialconnections.model.AddNewAccount;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.ComposeExtensionsKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModelKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.CompositionLocalKt;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.components.ButtonKt;
import com.stripe.android.financialconnections.ui.components.MultipleEventsCutterKt;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.stripe.android.financialconnections.ui.sdui.ServerDrivenUiKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import com.stripe.android.financialconnections.ui.theme.LayoutKt;
import com.stripe.android.uicore.image.StripeImageKt;
import com.stripe.android.uicore.image.StripeImageLoader;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.util.List;
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

/* compiled from: LinkAccountPickerScreen.kt */
@Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001am\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0010\u001a}\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0003¢\u0006\u0002\u0010\u001a\u001aD\u0010\u001b\u001a\u00020\u0001*\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0002\u001a\f\u0010\u001d\u001a\u00020\u0001*\u00020\u001cH\u0002\u001a1\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\"\u001a\u00020#H\u0003¢\u0006\u0002\u0010$\u001a#\u0010%\u001a\u00020\u00012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010'\u001a\u00020(H\u0003¢\u0006\u0002\u0010)\u001a\u001f\u0010*\u001a\u00020\u00012\b\u0010+\u001a\u0004\u0018\u00010\n2\u0006\u0010,\u001a\u00020\nH\u0007¢\u0006\u0002\u0010-\u001a\u0017\u0010.\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010/¨\u00060²\u0006\n\u0010\u0004\u001a\u00020\u0005X\u008a\u0084\u0002"}, d2 = {"LinkAccountPickerScreen", "", "(Landroidx/compose/runtime/Composer;I)V", "LinkAccountPickerContent", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;", "onCloseFromErrorClick", "Lkotlin/Function1;", "", "onClickableTextClick", "", "onNewBankAccountClick", "Lkotlin/Function0;", "onSelectAccountClick", "onAccountClick", "Lcom/stripe/android/financialconnections/model/PartnerAccount;", "(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "LinkAccountPickerLoaded", "scrollState", "Landroidx/compose/foundation/lazy/LazyListState;", "payload", "Lcom/stripe/android/financialconnections/presentation/Async;", "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;", "selectNetworkedAccountAsync", SDKConstants.PARAM_GAME_REQUESTS_CTA, "Lcom/stripe/android/financialconnections/ui/TextResource;", "(Landroidx/compose/foundation/lazy/LazyListState;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/ui/TextResource;Landroidx/compose/runtime/Composer;I)V", "loadedContent", "Landroidx/compose/foundation/lazy/LazyListScope;", "loadingContent", "NetworkedAccountItem", "account", "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;", "onAccountClicked", "selected", "", "(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)V", "SelectNewAccount", ViewProps.ON_CLICK, "text", "Lcom/stripe/android/financialconnections/model/AddNewAccount;", "(Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/model/AddNewAccount;Landroidx/compose/runtime/Composer;I)V", "SelectNewAccountIcon", PaymentSheetAppearanceKeys.ICON, "contentDescription", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "LinkAccountPickerScreenPreview", "(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;Landroidx/compose/runtime/Composer;I)V", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkAccountPickerScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkAccountPickerContent$lambda$15(LinkAccountPickerState linkAccountPickerState, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Function1 function13, int i, Composer composer, int i2) {
        LinkAccountPickerContent(linkAccountPickerState, function1, function12, function0, function02, function13, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkAccountPickerLoaded$lambda$19(LazyListState lazyListState, Async async, Async async2, Function1 function1, Function0 function0, Function1 function12, Function0 function02, TextResource textResource, int i, Composer composer, int i2) {
        LinkAccountPickerLoaded(lazyListState, async, async2, function1, function0, function12, function02, textResource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkAccountPickerScreen$lambda$11(int i, Composer composer, int i2) {
        LinkAccountPickerScreen(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkAccountPickerScreenPreview$lambda$31(LinkAccountPickerState linkAccountPickerState, int i, Composer composer, int i2) {
        LinkAccountPickerScreenPreview(linkAccountPickerState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NetworkedAccountItem$lambda$22(LinkedAccount linkedAccount, Function1 function1, boolean z, int i, Composer composer, int i2) {
        NetworkedAccountItem(linkedAccount, function1, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectNewAccount$lambda$28(Function0 function0, AddNewAccount addNewAccount, int i, Composer composer, int i2) {
        SelectNewAccount(function0, addNewAccount, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectNewAccountIcon$lambda$30(String str, String str2, int i, Composer composer, int i2) {
        SelectNewAccountIcon(str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void LinkAccountPickerScreen(Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(-85990089);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-85990089, i, -1, "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreen (LinkAccountPickerScreen.kt:81)");
            }
            composerStartRestartGroup.startReplaceGroup(1481344674);
            ViewModelProvider.Factory factory = LinkAccountPickerViewModel.INSTANCE.factory(ComposeExtensionsKt.parentActivity(composerStartRestartGroup, 0).getViewModel().getActivityRetainedComponent());
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
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(LinkAccountPickerViewModel.class), current, (String) null, factory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceGroup();
            LinkAccountPickerViewModel linkAccountPickerViewModel = (LinkAccountPickerViewModel) ((FinancialConnectionsViewModel) viewModel);
            FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModelParentViewModel = FinancialConnectionsSheetNativeViewModelKt.parentViewModel(composerStartRestartGroup, 0);
            State stateCollectAsState = StateFlowsComposeKt.collectAsState(linkAccountPickerViewModel.getStateFlow(), null, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(1577571424);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$$ExternalSyntheticLambda6
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
            LinkAccountPickerState.ViewEffect viewEffect = LinkAccountPickerScreen$lambda$1(stateCollectAsState).getViewEffect();
            composerStartRestartGroup.startReplaceGroup(1577573954);
            if (viewEffect != null) {
                composerStartRestartGroup.startReplaceGroup(-1606305308);
                boolean zChanged = composerStartRestartGroup.changed(viewEffect) | composerStartRestartGroup.changedInstance(uriHandler) | composerStartRestartGroup.changedInstance(linkAccountPickerViewModel);
                LinkAccountPickerScreenKt$LinkAccountPickerScreen$2$1$1 linkAccountPickerScreenKt$LinkAccountPickerScreen$2$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || linkAccountPickerScreenKt$LinkAccountPickerScreen$2$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    linkAccountPickerScreenKt$LinkAccountPickerScreen$2$1$1RememberedValue = new LinkAccountPickerScreenKt$LinkAccountPickerScreen$2$1$1(viewEffect, uriHandler, linkAccountPickerViewModel, null);
                    composerStartRestartGroup.updateRememberedValue(linkAccountPickerScreenKt$LinkAccountPickerScreen$2$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(viewEffect, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) linkAccountPickerScreenKt$LinkAccountPickerScreen$2$1$1RememberedValue, composerStartRestartGroup, 0);
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            LinkAccountPickerState linkAccountPickerStateLinkAccountPickerScreen$lambda$1 = LinkAccountPickerScreen$lambda$1(stateCollectAsState);
            composerStartRestartGroup.startReplaceGroup(1577583844);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(financialConnectionsSheetNativeViewModelParentViewModel);
            LinkAccountPickerScreenKt$LinkAccountPickerScreen$3$1 linkAccountPickerScreenKt$LinkAccountPickerScreen$3$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || linkAccountPickerScreenKt$LinkAccountPickerScreen$3$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                linkAccountPickerScreenKt$LinkAccountPickerScreen$3$1RememberedValue = new LinkAccountPickerScreenKt$LinkAccountPickerScreen$3$1(financialConnectionsSheetNativeViewModelParentViewModel);
                composerStartRestartGroup.updateRememberedValue(linkAccountPickerScreenKt$LinkAccountPickerScreen$3$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function1 function1 = (Function1) ((KFunction) linkAccountPickerScreenKt$LinkAccountPickerScreen$3$1RememberedValue);
            composerStartRestartGroup.startReplaceGroup(1577586109);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(linkAccountPickerViewModel);
            LinkAccountPickerScreenKt$LinkAccountPickerScreen$4$1 linkAccountPickerScreenKt$LinkAccountPickerScreen$4$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || linkAccountPickerScreenKt$LinkAccountPickerScreen$4$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                linkAccountPickerScreenKt$LinkAccountPickerScreen$4$1RememberedValue = new LinkAccountPickerScreenKt$LinkAccountPickerScreen$4$1(linkAccountPickerViewModel);
                composerStartRestartGroup.updateRememberedValue(linkAccountPickerScreenKt$LinkAccountPickerScreen$4$1RememberedValue);
            }
            Function1 function12 = (Function1) linkAccountPickerScreenKt$LinkAccountPickerScreen$4$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1577588190);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(linkAccountPickerViewModel);
            LinkAccountPickerScreenKt$LinkAccountPickerScreen$5$1 linkAccountPickerScreenKt$LinkAccountPickerScreen$5$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || linkAccountPickerScreenKt$LinkAccountPickerScreen$5$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                linkAccountPickerScreenKt$LinkAccountPickerScreen$5$1RememberedValue = new LinkAccountPickerScreenKt$LinkAccountPickerScreen$5$1(linkAccountPickerViewModel);
                composerStartRestartGroup.updateRememberedValue(linkAccountPickerScreenKt$LinkAccountPickerScreen$5$1RememberedValue);
            }
            Function0 function0 = (Function0) linkAccountPickerScreenKt$LinkAccountPickerScreen$5$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1577590270);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(linkAccountPickerViewModel);
            LinkAccountPickerScreenKt$LinkAccountPickerScreen$6$1 linkAccountPickerScreenKt$LinkAccountPickerScreen$6$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || linkAccountPickerScreenKt$LinkAccountPickerScreen$6$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                linkAccountPickerScreenKt$LinkAccountPickerScreen$6$1RememberedValue = new LinkAccountPickerScreenKt$LinkAccountPickerScreen$6$1(linkAccountPickerViewModel);
                composerStartRestartGroup.updateRememberedValue(linkAccountPickerScreenKt$LinkAccountPickerScreen$6$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0 function02 = (Function0) ((KFunction) linkAccountPickerScreenKt$LinkAccountPickerScreen$6$1RememberedValue);
            composerStartRestartGroup.startReplaceGroup(1577592151);
            boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(linkAccountPickerViewModel);
            LinkAccountPickerScreenKt$LinkAccountPickerScreen$7$1 linkAccountPickerScreenKt$LinkAccountPickerScreen$7$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance5 || linkAccountPickerScreenKt$LinkAccountPickerScreen$7$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                linkAccountPickerScreenKt$LinkAccountPickerScreen$7$1RememberedValue = new LinkAccountPickerScreenKt$LinkAccountPickerScreen$7$1(linkAccountPickerViewModel);
                composerStartRestartGroup.updateRememberedValue(linkAccountPickerScreenKt$LinkAccountPickerScreen$7$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            LinkAccountPickerContent(linkAccountPickerStateLinkAccountPickerScreen$lambda$1, function1, function12, function0, function02, (Function1) ((KFunction) linkAccountPickerScreenKt$LinkAccountPickerScreen$7$1RememberedValue), composerStartRestartGroup, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkAccountPickerScreenKt.LinkAccountPickerScreen$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LinkAccountPickerContent(final LinkAccountPickerState linkAccountPickerState, final Function1<? super Throwable, Unit> function1, final Function1<? super String, Unit> function12, final Function0<Unit> function0, final Function0<Unit> function02, final Function1<? super PartnerAccount, Unit> function13, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(766768127);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(linkAccountPickerState) ? 4 : 2) | i;
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
            i2 |= composerStartRestartGroup.changedInstance(function13) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(766768127, i2, -1, "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerContent (LinkAccountPickerScreen.kt:116)");
            }
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
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
            final Async<LinkAccountPickerState.Payload> payload = linkAccountPickerState.getPayload();
            if (Intrinsics.areEqual(payload, Async.Uninitialized.INSTANCE) || (payload instanceof Async.Loading) || (payload instanceof Async.Success)) {
                composerStartRestartGroup.startReplaceGroup(661450189);
                composer2 = composerStartRestartGroup;
                LinkAccountPickerLoaded(lazyListStateRememberLazyListState, payload, linkAccountPickerState.getSelectNetworkedAccountAsync(), function13, function0, function12, function02, linkAccountPickerState.getCta(), composer2, ((i2 >> 6) & 7168) | ((i2 << 3) & 57344) | ((i2 << 9) & 458752) | (3670016 & (i2 << 6)));
                composer2.endReplaceGroup();
            } else {
                if (!(payload instanceof Async.Fail)) {
                    composerStartRestartGroup.startReplaceGroup(-1918328981);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-1918310329);
                composerStartRestartGroup.startReplaceGroup(-1918309554);
                boolean zChangedInstance = ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32) | composerStartRestartGroup.changedInstance(payload);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LinkAccountPickerScreenKt.LinkAccountPickerContent$lambda$14$lambda$13$lambda$12(function1, payload);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkAccountPickerScreenKt.LinkAccountPickerContent$lambda$15(linkAccountPickerState, function1, function12, function0, function02, function13, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkAccountPickerContent$lambda$14$lambda$13$lambda$12(Function1 function1, Async async) {
        function1.invoke(((Async.Fail) async).getError());
        return Unit.INSTANCE;
    }

    private static final void LinkAccountPickerLoaded(final LazyListState lazyListState, final Async<LinkAccountPickerState.Payload> async, final Async<Unit> async2, final Function1<? super PartnerAccount, Unit> function1, final Function0<Unit> function0, final Function1<? super String, Unit> function12, final Function0<Unit> function02, final TextResource textResource, Composer composer, final int i) {
        int i2;
        final Function1<? super String, Unit> function13;
        Function0<Unit> function03;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1866610964);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(lazyListState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(async) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(async2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function13 = function12;
            i2 |= composerStartRestartGroup.changedInstance(function13) ? 131072 : 65536;
        } else {
            function13 = function12;
        }
        if ((1572864 & i) == 0) {
            function03 = function02;
            i2 |= composerStartRestartGroup.changedInstance(function03) ? 1048576 : 524288;
        } else {
            function03 = function02;
        }
        if ((i & 12582912) == 0) {
            i2 |= (i & 16777216) == 0 ? composerStartRestartGroup.changed(textResource) : composerStartRestartGroup.changedInstance(textResource) ? 8388608 : 4194304;
        }
        if ((i2 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1866610964, i2, -1, "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerLoaded (LinkAccountPickerScreen.kt:149)");
            }
            boolean z = async instanceof Async.Loading;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(16));
            int i3 = i2;
            final Function0<Unit> function04 = function03;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(2935649, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt.LinkAccountPickerLoaded.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Type inference failed for: r15v1 */
                /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r15v3 */
                public final void invoke(Composer composer3, int i4) {
                    ?? r15;
                    if ((i4 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2935649, i4, -1, "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerLoaded.<anonymous> (LinkAccountPickerScreen.kt:166)");
                        }
                        LinkAccountPickerState.Payload payloadInvoke = async.invoke();
                        if (payloadInvoke != null) {
                            Async<Unit> async3 = async2;
                            Function0<Unit> function05 = function04;
                            Function1<String, Unit> function14 = function13;
                            final TextResource textResource2 = textResource;
                            ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, companion);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer3);
                            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            String aboveCta = payloadInvoke.getAboveCta();
                            composer3.startReplaceGroup(70569723);
                            if (aboveCta == null) {
                                r15 = 1;
                            } else {
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                r15 = 1;
                                TextKt.m7586AnnotatedTextrm0N8CA(new TextResource.Text(ServerDrivenUiKt.fromHtml(aboveCta)), function14, TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composer3, 6).getLabelSmall(), FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7645getTextDefault0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m6006getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null), modifierFillMaxWidth$default, null, 0, 0, composer3, 3072, OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
                                SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(12)), composer3, 6);
                            }
                            composer3.endReplaceGroup();
                            ButtonKt.FinancialConnectionsButton(function05, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, r15, null), null, null, !payloadInvoke.getSelectedAccountIds().isEmpty(), async3 instanceof Async.Loading, ComposableLambdaKt.rememberComposableLambda(-880269207, r15, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$LinkAccountPickerLoaded$1$1$1$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                    invoke(rowScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope FinancialConnectionsButton, Composer composer4, int i5) {
                                    Intrinsics.checkNotNullParameter(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
                                    if ((i5 & 17) == 16 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-880269207, i5, -1, "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerLoaded.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkAccountPickerScreen.kt:187)");
                                    }
                                    androidx.compose.material.TextKt.m2076Text4IGK_g(textResource2.toText(composer4, 0).toString(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 0, 0, 131070);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 1572912, 12);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
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
            composerStartRestartGroup.startReplaceGroup(-459611846);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(async) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LinkAccountPickerScreenKt.LinkAccountPickerLoaded$lambda$18$lambda$17(async, async2, function1, function0, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            LayoutKt.LazyLayout(null, null, false, z, true, horizontalOrVerticalM900spacedBy0680j_4, false, lazyListState, composableLambdaRememberComposableLambda, (Function1) objRememberedValue, composer2, ((i3 << 21) & 29360128) | 100884480, 71);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkAccountPickerScreenKt.LinkAccountPickerLoaded$lambda$19(lazyListState, async, async2, function1, function0, function12, function02, textResource, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkAccountPickerLoaded$lambda$18$lambda$17(Async async, Async async2, Function1 function1, Function0 function0, LazyListScope LazyLayout) {
        Intrinsics.checkNotNullParameter(LazyLayout, "$this$LazyLayout");
        LinkAccountPickerState.Payload payload = (LinkAccountPickerState.Payload) async.invoke();
        if (payload != null) {
            loadedContent(LazyLayout, payload, async2, function1, function0);
        } else {
            loadingContent(LazyLayout);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: LinkAccountPickerScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$loadedContent$1, reason: invalid class name and case insensitive filesystem */
    static final class C09051 implements Function3<LazyItemScope, Composer, Integer, Unit> {
        final /* synthetic */ LinkAccountPickerState.Payload $payload;

        C09051(LinkAccountPickerState.Payload payload) {
            this.$payload = payload;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-122728680, i, -1, "com.stripe.android.financialconnections.features.linkaccountpicker.loadedContent.<anonymous> (LinkAccountPickerScreen.kt:202)");
                }
                TextResource.Text text = new TextResource.Text(this.$payload.getTitle());
                TextStyle textStyleM5615copyp1EtxEg$default = TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composer, 6).getHeadingXLarge(), FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7645getTextDefault0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                TextResource.Text text2 = text;
                composer.startReplaceGroup(605521254);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$loadedContent$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LinkAccountPickerScreenKt.C09051.invoke$lambda$1$lambda$0((String) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                TextKt.m7586AnnotatedTextrm0N8CA(text2, (Function1) objRememberedValue, textStyleM5615copyp1EtxEg$default, null, null, 0, 0, composer, 48, 120);
                SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(8)), composer, 6);
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
    }

    private static final void loadedContent(LazyListScope lazyListScope, final LinkAccountPickerState.Payload payload, final Async<Unit> async, final Function1<? super PartnerAccount, Unit> function1, Function0<Unit> function0) {
        LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-122728680, true, new C09051(payload)), 3, null);
        final List<LinkedAccount> accounts = payload.getAccounts();
        final LinkAccountPickerScreenKt$loadedContent$$inlined$items$default$1 linkAccountPickerScreenKt$loadedContent$$inlined$items$default$1 = new Function1() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$loadedContent$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(LinkedAccount linkedAccount) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((LinkedAccount) obj);
            }
        };
        lazyListScope.items(accounts.size(), null, new Function1<Integer, Object>() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$loadedContent$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return linkAccountPickerScreenKt$loadedContent$$inlined$items$default$1.invoke(accounts.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$loadedContent$$inlined$items$default$4
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
                LinkedAccount linkedAccount = (LinkedAccount) accounts.get(i);
                composer.startReplaceGroup(1591401169);
                boolean zContains = payload.getSelectedAccountIds().contains(linkedAccount.getAccount().getId());
                composer.startReplaceGroup(605529397);
                boolean zChanged = composer.changed(async) | composer.changed(function1);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Async async2 = async;
                    final Function1 function12 = function1;
                    objRememberedValue = (Function1) new Function1<PartnerAccount, Unit>() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$loadedContent$2$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(PartnerAccount partnerAccount) {
                            invoke2(partnerAccount);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(PartnerAccount selected) {
                            Intrinsics.checkNotNullParameter(selected, "selected");
                            if (async2 instanceof Async.Loading) {
                                return;
                            }
                            function12.invoke(selected);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                LinkAccountPickerScreenKt.NetworkedAccountItem(linkedAccount, (Function1) objRememberedValue, zContains, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-2117045745, true, new AnonymousClass3(payload, async, function0)), 3, null);
    }

    /* compiled from: LinkAccountPickerScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$loadedContent$3, reason: invalid class name */
    static final class AnonymousClass3 implements Function3<LazyItemScope, Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onNewBankAccountClick;
        final /* synthetic */ LinkAccountPickerState.Payload $payload;
        final /* synthetic */ Async<Unit> $selectNetworkedAccountAsync;

        AnonymousClass3(LinkAccountPickerState.Payload payload, Async<Unit> async, Function0<Unit> function0) {
            this.$payload = payload;
            this.$selectNetworkedAccountAsync = async;
            this.$onNewBankAccountClick = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2117045745, i, -1, "com.stripe.android.financialconnections.features.linkaccountpicker.loadedContent.<anonymous> (LinkAccountPickerScreen.kt:221)");
                }
                AddNewAccount addNewAccount = this.$payload.getAddNewAccount();
                composer.startReplaceGroup(605536776);
                boolean zChanged = composer.changed(this.$selectNetworkedAccountAsync) | composer.changed(this.$onNewBankAccountClick);
                final Async<Unit> async = this.$selectNetworkedAccountAsync;
                final Function0<Unit> function0 = this.$onNewBankAccountClick;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$loadedContent$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LinkAccountPickerScreenKt.AnonymousClass3.invoke$lambda$1$lambda$0(async, function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                LinkAccountPickerScreenKt.SelectNewAccount((Function0) objRememberedValue, addNewAccount, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Async async, Function0 function0) {
            if (!(async instanceof Async.Loading)) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    private static final void loadingContent(LazyListScope lazyListScope) {
        LazyListScope.item$default(lazyListScope, null, null, ComposableSingletons$LinkAccountPickerScreenKt.INSTANCE.m7414getLambda1$financial_connections_release(), 3, null);
        LazyListScope.items$default(lazyListScope, 3, null, null, ComposableSingletons$LinkAccountPickerScreenKt.INSTANCE.m7416getLambda3$financial_connections_release(), 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NetworkedAccountItem(final LinkedAccount linkedAccount, Function1<? super PartnerAccount, Unit> function1, boolean z, Composer composer, final int i) {
        int i2;
        final Function1<? super PartnerAccount, Unit> function12;
        final boolean z2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1765813444);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(linkedAccount) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1765813444, i2, -1, "com.stripe.android.financialconnections.features.linkaccountpicker.NetworkedAccountItem (LinkAccountPickerScreen.kt:257)");
            }
            function12 = function1;
            z2 = z;
            AccountItemKt.AccountItem(z2, false, function12, linkedAccount.getAccount(), linkedAccount.getDisplay(), composerStartRestartGroup, ((i2 >> 6) & 14) | ((i2 << 3) & 896), 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function12 = function1;
            z2 = z;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkAccountPickerScreenKt.NetworkedAccountItem$lambda$22(linkedAccount, function12, z2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectNewAccount(final Function0<Unit> function0, final AddNewAccount addNewAccount, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1105026761);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(addNewAccount) : composerStartRestartGroup.changedInstance(addNewAccount) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1105026761, i2, -1, "com.stripe.android.financialconnections.features.linkaccountpicker.SelectNewAccount (LinkAccountPickerScreen.kt:271)");
            }
            composerStartRestartGroup.startReplaceGroup(-2054650626);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(16));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            RoundedCornerShape roundedCornerShape = (RoundedCornerShape) objRememberedValue;
            Modifier modifierM586borderxT4_qwU = BorderKt.m586borderxT4_qwU(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), roundedCornerShape), Dp.m6117constructorimpl(1), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7634getBorderNeutral0d7_KjU(), roundedCornerShape);
            composerStartRestartGroup.startReplaceGroup(-2054641083);
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LinkAccountPickerScreenKt.SelectNewAccount$lambda$25$lambda$24(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            float f = 16;
            Modifier modifierM1020padding3ABfNKs = PaddingKt.m1020padding3ABfNKs(MultipleEventsCutterKt.m7582clickableSingleXHw0xAI$default(modifierM586borderxT4_qwU, false, null, null, (Function0) objRememberedValue2, 7, null), Dp.m6117constructorimpl(f));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1020padding3ABfNKs);
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
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Image icon = addNewAccount.getIcon();
            SelectNewAccountIcon(icon != null ? icon.getDefault() : null, addNewAccount.getBody(), composerStartRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f)), composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            androidx.compose.material.TextKt.m2076Text4IGK_g(addNewAccount.getBody(), (Modifier) null, FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLabelLargeEmphasized(), composer2, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkAccountPickerScreenKt.SelectNewAccount$lambda$28(function0, addNewAccount, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectNewAccount$lambda$25$lambda$24(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void SelectNewAccountIcon(final String str, final String contentDescription, Composer composer, final int i) {
        int i2;
        String str2;
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1028374910);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(contentDescription) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1028374910, i2, -1, "com.stripe.android.financialconnections.features.linkaccountpicker.SelectNewAccountIcon (LinkAccountPickerScreen.kt:306)");
            }
            Alignment center = Alignment.INSTANCE.getCenter();
            Modifier modifierM575backgroundbw27NRU$default = BackgroundKt.m575backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(56)), RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(12))), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7636getIconBackground0d7_KjU(), null, 2, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM575backgroundbw27NRU$default);
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
            final Modifier modifierM1065size3ABfNKs = SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(20));
            final ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(930308442, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$SelectNewAccountIcon$1$placeholderImage$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(930308442, i3, -1, "com.stripe.android.financialconnections.features.linkaccountpicker.SelectNewAccountIcon.<anonymous>.<anonymous> (LinkAccountPickerScreen.kt:316)");
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.stripe_ic_add, composer2, 0), contentDescription, modifierM1065size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m3698tintxETnrds$default(ColorFilter.INSTANCE, FinancialConnectionsTheme.INSTANCE.getColors(composer2, 6).m7637getIconTint0d7_KjU(), 0, 2, null), composer2, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            ProvidableCompositionLocal<Boolean> localInspectionMode = InspectionModeKt.getLocalInspectionMode();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localInspectionMode);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (((Boolean) objConsume).booleanValue() || (str2 = str) == null || str2.length() == 0) {
                composerStartRestartGroup.startReplaceGroup(1003932802);
                composableLambdaRememberComposableLambda.invoke(composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1003934312);
                ProvidableCompositionLocal<StripeImageLoader> localImageLoader = FinancialConnectionsSheetNativeActivityKt.getLocalImageLoader();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume2 = composerStartRestartGroup.consume(localImageLoader);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                StripeImageKt.StripeImage(str, (StripeImageLoader) objConsume2, null, modifierM1065size3ABfNKs, null, null, null, null, false, ComposableLambdaKt.rememberComposableLambda(-665169054, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$SelectNewAccountIcon$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                        invoke(boxWithConstraintsScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BoxWithConstraintsScope StripeImage, Composer composer2, int i3) {
                        Intrinsics.checkNotNullParameter(StripeImage, "$this$StripeImage");
                        if ((i3 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-665169054, i3, -1, "com.stripe.android.financialconnections.features.linkaccountpicker.SelectNewAccountIcon.<anonymous>.<anonymous> (LinkAccountPickerScreen.kt:332)");
                        }
                        composableLambdaRememberComposableLambda.invoke(composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, composerStartRestartGroup, (i2 & 14) | 805309824 | (StripeImageLoader.$stable << 3), 0, 1520);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkAccountPickerScreenKt.SelectNewAccountIcon$lambda$30(str, contentDescription, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: LinkAccountPickerScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$LinkAccountPickerScreenPreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C09041 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ LinkAccountPickerState $state;

        C09041(LinkAccountPickerState linkAccountPickerState) {
            this.$state = linkAccountPickerState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(415273356, i, -1, "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenPreview.<anonymous> (LinkAccountPickerScreen.kt:345)");
                }
                LinkAccountPickerState linkAccountPickerState = this.$state;
                composer.startReplaceGroup(372444267);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$LinkAccountPickerScreenPreview$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LinkAccountPickerScreenKt.C09041.invoke$lambda$1$lambda$0((Throwable) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(372445515);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$LinkAccountPickerScreenPreview$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LinkAccountPickerScreenKt.C09041.invoke$lambda$3$lambda$2((String) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function1 function12 = (Function1) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(372446795);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$LinkAccountPickerScreenPreview$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                Function0 function0 = (Function0) objRememberedValue3;
                composer.endReplaceGroup();
                composer.startReplaceGroup(372448043);
                Object objRememberedValue4 = composer.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$LinkAccountPickerScreenPreview$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                Function0 function02 = (Function0) objRememberedValue4;
                composer.endReplaceGroup();
                composer.startReplaceGroup(372449099);
                Object objRememberedValue5 = composer.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$LinkAccountPickerScreenPreview$1$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LinkAccountPickerScreenKt.C09041.invoke$lambda$9$lambda$8((PartnerAccount) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                composer.endReplaceGroup();
                LinkAccountPickerScreenKt.LinkAccountPickerContent(linkAccountPickerState, function1, function12, function0, function02, (Function1) objRememberedValue5, composer, 224688);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8(PartnerAccount it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final void LinkAccountPickerScreenPreview(@PreviewParameter(provider = LinkAccountPickerPreviewParameterProvider.class) final LinkAccountPickerState state, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(484983965);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(484983965, i2, -1, "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenPreview (LinkAccountPickerScreen.kt:343)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(null, false, ComposableLambdaKt.rememberComposableLambda(415273356, true, new C09041(state), composerStartRestartGroup, 54), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkAccountPickerScreenKt.LinkAccountPickerScreenPreview$lambda$31(state, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final LinkAccountPickerState LinkAccountPickerScreen$lambda$1(State<LinkAccountPickerState> state) {
        return state.getValue();
    }
}
