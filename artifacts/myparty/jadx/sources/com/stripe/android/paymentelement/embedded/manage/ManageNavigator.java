package com.stripe.android.paymentelement.embedded.manage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentelement.embedded.manage.ManageNavigator;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.navigation.NavigationHandler;
import com.stripe.android.paymentsheet.ui.PaymentSheetTopBarState;
import com.stripe.android.paymentsheet.ui.UpdatePaymentMethodInteractor;
import com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUIKt;
import com.stripe.android.paymentsheet.utils.ComposeUtilsKt;
import com.stripe.android.paymentsheet.verticalmode.ManageScreenInteractor;
import com.stripe.android.paymentsheet.verticalmode.ManageScreenUIKt;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: ManageNavigator.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002!\"B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\fJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u0006H\u0002J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006#"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;", "", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "navigationHandler", "Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;", "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "initialScreen", "(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;Lcom/stripe/android/paymentsheet/analytics/EventReporter;)V", "screen", "Lkotlinx/coroutines/flow/StateFlow;", "getScreen", "()Lkotlinx/coroutines/flow/StateFlow;", "canGoBack", "", "getCanGoBack", "()Z", "_result", "Lkotlinx/coroutines/flow/MutableSharedFlow;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lkotlinx/coroutines/flow/SharedFlow;", "getResult", "()Lkotlinx/coroutines/flow/SharedFlow;", "performAction", "", "action", "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action;", "onScreenShown", "onScreenHidden", com.swmansion.rnscreens.Screen.TAG, "Action", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ManageNavigator {
    public static final int $stable = 8;
    private final MutableSharedFlow<Boolean> _result;
    private final EventReporter eventReporter;
    private final NavigationHandler<Screen> navigationHandler;
    private final SharedFlow<Boolean> result;
    private final StateFlow<Screen> screen;

    private ManageNavigator(EventReporter eventReporter, NavigationHandler<Screen> navigationHandler) {
        this.eventReporter = eventReporter;
        this.navigationHandler = navigationHandler;
        StateFlow<Screen> currentScreen = navigationHandler.getCurrentScreen();
        this.screen = currentScreen;
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this._result = mutableSharedFlowMutableSharedFlow$default;
        this.result = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        onScreenShown(currentScreen.getValue());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ManageNavigator(CoroutineScope coroutineScope, Screen initialScreen, EventReporter eventReporter) {
        this(eventReporter, new NavigationHandler(coroutineScope, initialScreen, false, new Function1() { // from class: com.stripe.android.paymentelement.embedded.manage.ManageNavigator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ManageNavigator._init_$lambda$0((ManageNavigator.Screen) obj);
            }
        }));
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(initialScreen, "initialScreen");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(Screen it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final StateFlow<Screen> getScreen() {
        return this.screen;
    }

    public final boolean getCanGoBack() {
        return this.navigationHandler.getCanGoBack();
    }

    public final SharedFlow<Boolean> getResult() {
        return this.result;
    }

    public final void performAction(Action action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof Action.Back) {
            onScreenHidden(this.screen.getValue());
            if (this.navigationHandler.getCanGoBack()) {
                this.navigationHandler.pop();
                return;
            } else {
                this._result.tryEmit(null);
                return;
            }
        }
        if (action instanceof Action.Close) {
            onScreenHidden(this.screen.getValue());
            this._result.tryEmit(Boolean.valueOf(((Action.Close) action).getShouldInvokeRowSelectionCallback()));
        } else {
            if (!(action instanceof Action.GoToScreen)) {
                throw new NoWhenBranchMatchedException();
            }
            Action.GoToScreen goToScreen = (Action.GoToScreen) action;
            this.navigationHandler.transitionToWithDelay(goToScreen.getScreen());
            onScreenShown(goToScreen.getScreen());
        }
    }

    private final void onScreenShown(Screen screen) {
        if (screen instanceof Screen.All) {
            this.eventReporter.onShowManageSavedPaymentMethods();
        } else {
            if (!(screen instanceof Screen.Update)) {
                throw new NoWhenBranchMatchedException();
            }
            this.eventReporter.onShowEditablePaymentOption();
        }
    }

    private final void onScreenHidden(Screen screen) {
        if (screen instanceof Screen.All) {
            return;
        }
        if (!(screen instanceof Screen.Update)) {
            throw new NoWhenBranchMatchedException();
        }
        this.eventReporter.onHideEditablePaymentOption();
    }

    /* compiled from: ManageNavigator.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H'¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH&J\u0010\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH&J\b\u0010\f\u001a\u00020\rH&\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;", "", "<init>", "()V", "Content", "", "(Landroidx/compose/runtime/Composer;I)V", "topBarState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;", "title", "Lcom/stripe/android/core/strings/ResolvableString;", "isPerformingNetworkOperation", "", "All", "Update", "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen$All;", "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen$Update;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Screen {
        public static final int $stable = 0;

        public /* synthetic */ Screen(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract void Content(Composer composer, int i);

        public abstract boolean isPerformingNetworkOperation();

        public abstract StateFlow<ResolvableString> title();

        public abstract StateFlow<PaymentSheetTopBarState> topBarState();

        private Screen() {
        }

        /* compiled from: ManageNavigator.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0016J\u0010\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\r\u0010\u000e\u001a\u00020\u000fH\u0017¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen$All;", "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;", "Ljava/io/Closeable;", "interactor", "Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor;", "<init>", "(Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor;)V", "topBarState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;", "title", "Lcom/stripe/android/core/strings/ResolvableString;", "isPerformingNetworkOperation", "", "Content", "", "(Landroidx/compose/runtime/Composer;I)V", "close", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class All extends Screen implements Closeable {
            public static final int $stable = 8;
            private final ManageScreenInteractor interactor;

            @Override // com.stripe.android.paymentelement.embedded.manage.ManageNavigator.Screen
            public boolean isPerformingNetworkOperation() {
                return false;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public All(ManageScreenInteractor interactor) {
                super(null);
                Intrinsics.checkNotNullParameter(interactor, "interactor");
                this.interactor = interactor;
            }

            @Override // com.stripe.android.paymentelement.embedded.manage.ManageNavigator.Screen
            public StateFlow<PaymentSheetTopBarState> topBarState() {
                return StateFlowsKt.mapAsStateFlow(this.interactor.getState(), new Function1() { // from class: com.stripe.android.paymentelement.embedded.manage.ManageNavigator$Screen$All$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ManageNavigator.Screen.All.topBarState$lambda$0(this.f$0, (ManageScreenInteractor.State) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final PaymentSheetTopBarState topBarState$lambda$0(All all, ManageScreenInteractor.State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return state.topBarState(all.interactor);
            }

            @Override // com.stripe.android.paymentelement.embedded.manage.ManageNavigator.Screen
            public StateFlow<ResolvableString> title() {
                return StateFlowsKt.mapAsStateFlow(this.interactor.getState(), new Function1() { // from class: com.stripe.android.paymentelement.embedded.manage.ManageNavigator$Screen$All$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ManageNavigator.Screen.All.title$lambda$1((ManageScreenInteractor.State) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ResolvableString title$lambda$1(ManageScreenInteractor.State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return state.getTitle();
            }

            @Override // com.stripe.android.paymentelement.embedded.manage.ManageNavigator.Screen
            public void Content(Composer composer, int i) {
                composer.startReplaceGroup(-1339058932);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1339058932, i, -1, "com.stripe.android.paymentelement.embedded.manage.ManageNavigator.Screen.All.Content (ManageNavigator.kt:119)");
                }
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer);
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ManageScreenUIKt.ManageScreenUI(this.interactor, composer, 0);
                ComposeUtilsKt.m8559PaymentSheetContentPaddingkHDZbjc(Dp.m6117constructorimpl(12), composer, 6, 0);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.interactor.close();
            }
        }

        /* compiled from: ManageNavigator.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0016J\u0010\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\r\u0010\r\u001a\u00020\u000eH\u0017¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen$Update;", "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;", "interactor", "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;", "<init>", "(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;)V", "topBarState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;", "title", "Lcom/stripe/android/core/strings/ResolvableString;", "isPerformingNetworkOperation", "", "Content", "", "(Landroidx/compose/runtime/Composer;I)V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Update extends Screen {
            public static final int $stable = 8;
            private final UpdatePaymentMethodInteractor interactor;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Update(UpdatePaymentMethodInteractor interactor) {
                super(null);
                Intrinsics.checkNotNullParameter(interactor, "interactor");
                this.interactor = interactor;
            }

            @Override // com.stripe.android.paymentelement.embedded.manage.ManageNavigator.Screen
            public StateFlow<PaymentSheetTopBarState> topBarState() {
                return StateFlowsKt.stateFlowOf(this.interactor.getTopBarState());
            }

            @Override // com.stripe.android.paymentelement.embedded.manage.ManageNavigator.Screen
            public StateFlow<ResolvableString> title() {
                return StateFlowsKt.stateFlowOf(this.interactor.getScreenTitle());
            }

            @Override // com.stripe.android.paymentelement.embedded.manage.ManageNavigator.Screen
            public boolean isPerformingNetworkOperation() {
                return this.interactor.getState().getValue().getStatus().getIsPerformingNetworkOperation();
            }

            @Override // com.stripe.android.paymentelement.embedded.manage.ManageNavigator.Screen
            public void Content(Composer composer, int i) {
                composer.startReplaceGroup(1472404668);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1472404668, i, -1, "com.stripe.android.paymentelement.embedded.manage.ManageNavigator.Screen.Update.Content (ManageNavigator.kt:145)");
                }
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer);
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                UpdatePaymentMethodUIKt.UpdatePaymentMethodUI(this.interactor, Modifier.INSTANCE, composer, 48);
                ComposeUtilsKt.m8559PaymentSheetContentPaddingkHDZbjc(Dp.m6117constructorimpl(16), composer, 6, 0);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
            }
        }
    }

    /* compiled from: ManageNavigator.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action;", "", "<init>", "()V", "Back", "Close", "GoToScreen", "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action$Back;", "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action$Close;", "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action$GoToScreen;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {
        public static final int $stable = 0;

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: ManageNavigator.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action$Back;", "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Back extends Action {
            public static final int $stable = 0;
            public static final Back INSTANCE = new Back();

            private Back() {
                super(null);
            }
        }

        private Action() {
        }

        /* compiled from: ManageNavigator.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action$Close;", "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action;", "shouldInvokeRowSelectionCallback", "", "<init>", "(Z)V", "getShouldInvokeRowSelectionCallback", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Close extends Action {
            public static final int $stable = 0;
            private final boolean shouldInvokeRowSelectionCallback;

            public Close() {
                this(false, 1, null);
            }

            public static /* synthetic */ Close copy$default(Close close, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = close.shouldInvokeRowSelectionCallback;
                }
                return close.copy(z);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getShouldInvokeRowSelectionCallback() {
                return this.shouldInvokeRowSelectionCallback;
            }

            public final Close copy(boolean shouldInvokeRowSelectionCallback) {
                return new Close(shouldInvokeRowSelectionCallback);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Close) && this.shouldInvokeRowSelectionCallback == ((Close) other).shouldInvokeRowSelectionCallback;
            }

            public int hashCode() {
                return Boolean.hashCode(this.shouldInvokeRowSelectionCallback);
            }

            public String toString() {
                return "Close(shouldInvokeRowSelectionCallback=" + this.shouldInvokeRowSelectionCallback + ")";
            }

            public Close(boolean z) {
                super(null);
                this.shouldInvokeRowSelectionCallback = z;
            }

            public /* synthetic */ Close(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z);
            }

            public final boolean getShouldInvokeRowSelectionCallback() {
                return this.shouldInvokeRowSelectionCallback;
            }
        }

        /* compiled from: ManageNavigator.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action$GoToScreen;", "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action;", "screen", "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;", "<init>", "(Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;)V", "getScreen", "()Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class GoToScreen extends Action {
            public static final int $stable = 0;
            private final Screen screen;

            public static /* synthetic */ GoToScreen copy$default(GoToScreen goToScreen, Screen screen, int i, Object obj) {
                if ((i & 1) != 0) {
                    screen = goToScreen.screen;
                }
                return goToScreen.copy(screen);
            }

            /* renamed from: component1, reason: from getter */
            public final Screen getScreen() {
                return this.screen;
            }

            public final GoToScreen copy(Screen screen) {
                Intrinsics.checkNotNullParameter(screen, "screen");
                return new GoToScreen(screen);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GoToScreen) && Intrinsics.areEqual(this.screen, ((GoToScreen) other).screen);
            }

            public int hashCode() {
                return this.screen.hashCode();
            }

            public String toString() {
                return "GoToScreen(screen=" + this.screen + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GoToScreen(Screen screen) {
                super(null);
                Intrinsics.checkNotNullParameter(screen, "screen");
                this.screen = screen;
            }

            public final Screen getScreen() {
                return this.screen;
            }
        }
    }
}
