package com.stripe.android.shoppay;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.os.BundleKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.webkit.WebViewAssetLoader;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.common.ui.ElementsBottomSheetLayoutKt;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.shoppay.ShopPayActivity;
import com.stripe.android.shoppay.ShopPayActivityResult;
import com.stripe.android.shoppay.ShopPayViewModel;
import com.stripe.android.shoppay.webview.EceWebView;
import com.stripe.android.shoppay.webview.PopUpWebChromeClient;
import com.stripe.android.shoppay.webview.PopUpWebViewClient;
import com.stripe.android.ui.core.CircularProgressIndicatorKt;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import com.stripe.android.uicore.StripeColors;
import com.stripe.android.uicore.StripeTheme;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: ShopPayActivity.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001cH\u0014J\r\u0010\u001f\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010 J\r\u0010!\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010 J\u0015\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010$J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020'H\u0002R$\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017¨\u0006)²\u0006\f\u0010\u0011\u001a\u0004\u0018\u00010\u0013X\u008a\u0084\u0002"}, d2 = {"Lcom/stripe/android/shoppay/ShopPayActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory$paymentsheet_release$annotations", "getViewModelFactory$paymentsheet_release", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory$paymentsheet_release", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "viewModel", "Lcom/stripe/android/shoppay/ShopPayViewModel;", "getViewModel", "()Lcom/stripe/android/shoppay/ShopPayViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "popupWebView", "Landroidx/compose/runtime/MutableState;", "Landroid/webkit/WebView;", "eceWebView", "Lcom/stripe/android/shoppay/webview/EceWebView;", "getEceWebView", "()Lcom/stripe/android/shoppay/webview/EceWebView;", "eceWebView$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "Content", "(Landroidx/compose/runtime/Composer;I)V", "ShopPayWebView", "PopupWebViewDialog", "webView", "(Landroid/webkit/WebView;Landroidx/compose/runtime/Composer;I)V", "dismissWithResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/shoppay/ShopPayActivityResult;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShopPayActivity extends ComponentActivity {
    public static final String EXTRA_ARGS = "shop_pay_args";
    public static final int RESULT_COMPLETE = 63636;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private ViewModelProvider.Factory viewModelFactory = ShopPayViewModel.Companion.factory$default(ShopPayViewModel.INSTANCE, null, 1, null);
    private final MutableState<WebView> popupWebView = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: eceWebView$delegate, reason: from kotlin metadata */
    private final Lazy eceWebView = LazyKt.lazy(new Function0() { // from class: com.stripe.android.shoppay.ShopPayActivity$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ShopPayActivity.eceWebView_delegate$lambda$2(this.f$0);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$4(ShopPayActivity shopPayActivity, int i, Composer composer, int i2) {
        shopPayActivity.Content(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PopupWebViewDialog$lambda$14(ShopPayActivity shopPayActivity, WebView webView, int i, Composer composer, int i2) {
        shopPayActivity.PopupWebViewDialog(webView, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShopPayWebView$lambda$10(ShopPayActivity shopPayActivity, int i, Composer composer, int i2) {
        shopPayActivity.ShopPayWebView(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getViewModelFactory$paymentsheet_release$annotations() {
    }

    public ShopPayActivity() {
        final Function0 function0 = null;
        final ShopPayActivity shopPayActivity = this;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ShopPayViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.shoppay.ShopPayActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return shopPayActivity.getStore();
            }
        }, new Function0() { // from class: com.stripe.android.shoppay.ShopPayActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.viewModelFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.shoppay.ShopPayActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? shopPayActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    /* renamed from: getViewModelFactory$paymentsheet_release, reason: from getter */
    public final ViewModelProvider.Factory getViewModelFactory() {
        return this.viewModelFactory;
    }

    public final void setViewModelFactory$paymentsheet_release(ViewModelProvider.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.viewModelFactory = factory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShopPayViewModel getViewModel() {
        return (ShopPayViewModel) this.viewModel.getValue();
    }

    private final EceWebView getEceWebView() {
        return (EceWebView) this.eceWebView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EceWebView eceWebView_delegate$lambda$2(final ShopPayActivity shopPayActivity) {
        ShopPayActivity shopPayActivity2 = shopPayActivity;
        WebViewAssetLoader webViewAssetLoaderAssetLoader = shopPayActivity.getViewModel().assetLoader(shopPayActivity2);
        return new EceWebView(shopPayActivity2, shopPayActivity.getViewModel().getBridgeHandler(), new PopUpWebViewClient(webViewAssetLoaderAssetLoader, new ShopPayActivity$eceWebView$2$1(shopPayActivity.getViewModel())), new PopUpWebChromeClient(shopPayActivity2, shopPayActivity.getViewModel().getBridgeHandler(), webViewAssetLoaderAssetLoader, new Function1() { // from class: com.stripe.android.shoppay.ShopPayActivity$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShopPayActivity.eceWebView_delegate$lambda$2$lambda$1(this.f$0, (WebView) obj);
            }
        }, new ShopPayActivity$eceWebView$2$3(shopPayActivity.getViewModel()), new ShopPayActivity$eceWebView$2$4(shopPayActivity.getViewModel())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit eceWebView_delegate$lambda$2$lambda$1(ShopPayActivity shopPayActivity, WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        shopPayActivity.popupWebView.setValue(webView);
        return Unit.INSTANCE;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            if (savedInstanceState != null) {
                getEceWebView().restoreState(savedInstanceState);
            } else {
                getViewModel().loadUrl(getEceWebView());
            }
        } catch (ShopPayViewModel.NoArgsException e) {
            Logger.INSTANCE.getInstance(false).error("Failed to create ShopPayViewModel", e);
            dismissWithResult(new ShopPayActivityResult.Failed(new Throwable("Failed to create ShopPayViewModel")));
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(2124675811, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.shoppay.ShopPayActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2124675811, i, -1, "com.stripe.android.shoppay.ShopPayActivity.onCreate.<anonymous> (ShopPayActivity.kt:86)");
                }
                ShopPayActivity.this.Content(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 1, null);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        getEceWebView().saveState(outState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Content(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1272665958);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1272665958, i2, -1, "com.stripe.android.shoppay.ShopPayActivity.Content (ShopPayActivity.kt:96)");
            }
            StripeBottomSheetState stripeBottomSheetStateRememberStripeBottomSheetState = StripeBottomSheetStateKt.rememberStripeBottomSheetState(null, null, composerStartRestartGroup, 0, 3);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1695437582);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(stripeBottomSheetStateRememberStripeBottomSheetState);
            ShopPayActivity$Content$1$1 shopPayActivity$Content$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || shopPayActivity$Content$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                shopPayActivity$Content$1$1RememberedValue = new ShopPayActivity$Content$1$1(this, coroutineScope, stripeBottomSheetStateRememberStripeBottomSheetState, null);
                composerStartRestartGroup.updateRememberedValue(shopPayActivity$Content$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) shopPayActivity$Content$1$1RememberedValue, composerStartRestartGroup, 6);
            StripeThemeKt.StripeTheme(StripeTheme.INSTANCE.getColors(false), null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1683633104, true, new AnonymousClass2(stripeBottomSheetStateRememberStripeBottomSheetState, coroutineScope, this), composerStartRestartGroup, 54), composerStartRestartGroup, StripeColors.$stable | 12582912, WebSocketProtocol.PAYLOAD_SHORT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.shoppay.ShopPayActivity$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ShopPayActivity.Content$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Content$dismiss(CoroutineScope coroutineScope, StripeBottomSheetState stripeBottomSheetState, ShopPayActivity shopPayActivity, ShopPayActivityResult shopPayActivityResult) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ShopPayActivity$Content$dismiss$1(stripeBottomSheetState, shopPayActivity, shopPayActivityResult, null), 3, null);
    }

    /* compiled from: ShopPayActivity.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.shoppay.ShopPayActivity$Content$2, reason: invalid class name */
    static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ StripeBottomSheetState $bottomSheetState;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ ShopPayActivity this$0;

        AnonymousClass2(StripeBottomSheetState stripeBottomSheetState, CoroutineScope coroutineScope, ShopPayActivity shopPayActivity) {
            this.$bottomSheetState = stripeBottomSheetState;
            this.$scope = coroutineScope;
            this.this$0 = shopPayActivity;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1683633104, i, -1, "com.stripe.android.shoppay.ShopPayActivity.Content.<anonymous> (ShopPayActivity.kt:117)");
                }
                StripeBottomSheetState stripeBottomSheetState = this.$bottomSheetState;
                composer.startReplaceGroup(1623078571);
                boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$bottomSheetState) | composer.changedInstance(this.this$0);
                final CoroutineScope coroutineScope = this.$scope;
                final StripeBottomSheetState stripeBottomSheetState2 = this.$bottomSheetState;
                final ShopPayActivity shopPayActivity = this.this$0;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.shoppay.ShopPayActivity$Content$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ShopPayActivity.AnonymousClass2.invoke$lambda$1$lambda$0(coroutineScope, stripeBottomSheetState2, shopPayActivity);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                final ShopPayActivity shopPayActivity2 = this.this$0;
                ElementsBottomSheetLayoutKt.m7218ElementsBottomSheetLayoutTN_CM5M(stripeBottomSheetState, null, 0.0f, (Function0) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(1782822280, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.shoppay.ShopPayActivity.Content.2.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1782822280, i2, -1, "com.stripe.android.shoppay.ShopPayActivity.Content.<anonymous>.<anonymous> (ShopPayActivity.kt:123)");
                        }
                        shopPayActivity2.ShopPayWebView(composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, StripeBottomSheetState.$stable | 24576, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(CoroutineScope coroutineScope, StripeBottomSheetState stripeBottomSheetState, ShopPayActivity shopPayActivity) {
            ShopPayActivity.Content$dismiss(coroutineScope, stripeBottomSheetState, shopPayActivity, ShopPayActivityResult.Canceled.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ShopPayWebView(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-655850928);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-655850928, i2, -1, "com.stripe.android.shoppay.ShopPayActivity.ShopPayWebView (ShopPayActivity.kt:129)");
            }
            composerStartRestartGroup.startReplaceGroup(-2132251199);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = this.popupWebView;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Unit unit = null;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            WebView webViewShopPayWebView$lambda$6 = ShopPayWebView$lambda$6(mutableState);
            composerStartRestartGroup.startReplaceGroup(-1562536772);
            if (webViewShopPayWebView$lambda$6 != null) {
                PopupWebViewDialog(webViewShopPayWebView$lambda$6, composerStartRestartGroup, (i2 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
                unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1562536953);
            if (unit == null) {
                CircularProgressIndicatorKt.m8618CircularProgressIndicatorLxG7B9w(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(64)), ShopPayButtonKt.getShopPayBackgroundColor(), Dp.m6117constructorimpl(4), 0L, 0, composerStartRestartGroup, 438, 24);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.shoppay.ShopPayActivity$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ShopPayActivity.ShopPayWebView$lambda$10(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final WebView ShopPayWebView$lambda$6(MutableState<WebView> mutableState) {
        return mutableState.getValue();
    }

    private final void PopupWebViewDialog(final WebView webView, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1364686289);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(webView) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1364686289, i2, -1, "com.stripe.android.shoppay.ShopPayActivity.PopupWebViewDialog (ShopPayActivity.kt:152)");
            }
            final int iM3711toArgb8_81llA = ColorKt.m3711toArgb8_81llA(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1826getBackground0d7_KjU());
            composerStartRestartGroup.startReplaceGroup(-2112488780);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(webView) | composerStartRestartGroup.changed(iM3711toArgb8_81llA);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.shoppay.ShopPayActivity$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShopPayActivity.PopupWebViewDialog$lambda$13$lambda$12(webView, iM3711toArgb8_81llA, (Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            AndroidView_androidKt.AndroidView((Function1) objRememberedValue, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, composerStartRestartGroup, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.shoppay.ShopPayActivity$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ShopPayActivity.PopupWebViewDialog$lambda$14(this.f$0, webView, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView PopupWebViewDialog$lambda$13$lambda$12(WebView webView, int i, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        webView.setBackgroundColor(i);
        return webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissWithResult(ShopPayActivityResult result) {
        setResult(RESULT_COMPLETE, new Intent().putExtras(BundleKt.bundleOf(TuplesKt.to(ShopPayActivityContract.EXTRA_RESULT, result))));
        finish();
    }

    /* compiled from: ShopPayActivity.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/shoppay/ShopPayActivity$Companion;", "", "<init>", "()V", "EXTRA_ARGS", "", "RESULT_COMPLETE", "", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", CardScanActivity.ARGS, "Lcom/stripe/android/shoppay/ShopPayArgs;", "createIntent$paymentsheet_release", "getArgs", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "getArgs$paymentsheet_release", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent createIntent$paymentsheet_release(Context context, ShopPayArgs args) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(args, "args");
            Intent intentPutExtra = new Intent(context, (Class<?>) ShopPayActivity.class).putExtra(ShopPayActivity.EXTRA_ARGS, args);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        public final ShopPayArgs getArgs$paymentsheet_release(SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return (ShopPayArgs) savedStateHandle.get(ShopPayActivity.EXTRA_ARGS);
        }
    }
}
