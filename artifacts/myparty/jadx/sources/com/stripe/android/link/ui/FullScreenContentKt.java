package com.stripe.android.link.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.stripe.android.common.ui.ElementsBottomSheetLayoutKt;
import com.stripe.android.link.LinkAction;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkScreen;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.link.ui.FullScreenContentKt;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.utils.EventReporterProviderUtilKt;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt;
import com.stripe.android.uicore.navigation.KeyboardController;
import com.stripe.android.uicore.navigation.KeyboardControllerKt;
import com.stripe.android.uicore.navigation.NavBackStackEntryUpdate;
import com.stripe.android.uicore.navigation.NavigationEffectsKt;
import com.stripe.android.uicore.navigation.NavigationIntent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: FullScreenContent.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a\u0093\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u000f26\u0010\u0019\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00010\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00010\u000f2\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\r2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0001¢\u0006\u0002\u0010&¨\u0006'²\u0006(\u0010(\u001a \u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`,¢\u0006\u0002\b*¢\u0006\u0002\b+X\u008a\u008e\u0002"}, d2 = {"FullScreenContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "bottomSheetState", "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;", "initialDestination", "Lcom/stripe/android/link/LinkScreen;", "appBarState", "Lcom/stripe/android/link/ui/LinkAppBarState;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "onBackPressed", "Lkotlin/Function0;", "moveToWeb", "Lkotlin/Function1;", "", "goBack", "onNavBackStackEntryChanged", "Lcom/stripe/android/uicore/navigation/NavBackStackEntryUpdate;", "navigationChannel", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/stripe/android/uicore/navigation/NavigationIntent;", "handleViewAction", "Lcom/stripe/android/link/LinkAction;", "navigate", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "route", "", "clearStack", "dismiss", "dismissWithResult", "Lcom/stripe/android/link/LinkActivityResult;", "getLinkAccount", "Lcom/stripe/android/link/model/LinkAccount;", "changeEmail", "(Landroidx/compose/ui/Modifier;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lcom/stripe/android/link/LinkScreen;Lcom/stripe/android/link/ui/LinkAppBarState;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "paymentsheet_release", "linkContentBottomSheetContent", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "Lcom/stripe/android/link/ui/BottomSheetContent;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FullScreenContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FullScreenContent$lambda$6(Modifier modifier, StripeBottomSheetState stripeBottomSheetState, LinkScreen linkScreen, LinkAppBarState linkAppBarState, EventReporter eventReporter, Function0 function0, Function1 function1, Function0 function02, Function1 function12, SharedFlow sharedFlow, Function1 function13, Function2 function2, Function0 function03, Function1 function14, Function0 function04, Function0 function05, int i, int i2, Composer composer, int i3) {
        FullScreenContent(modifier, stripeBottomSheetState, linkScreen, linkAppBarState, eventReporter, function0, function1, function02, function12, sharedFlow, function13, function2, function03, function14, function04, function05, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    public static final void FullScreenContent(final Modifier modifier, final StripeBottomSheetState bottomSheetState, final LinkScreen initialDestination, final LinkAppBarState appBarState, EventReporter eventReporter, final Function0<Unit> onBackPressed, final Function1<? super Throwable, Unit> moveToWeb, final Function0<Unit> goBack, final Function1<? super NavBackStackEntryUpdate, Unit> onNavBackStackEntryChanged, final SharedFlow<? extends NavigationIntent> navigationChannel, final Function1<? super LinkAction, Unit> handleViewAction, final Function2<? super LinkScreen, ? super Boolean, Unit> navigate, final Function0<Unit> dismiss, final Function1<? super LinkActivityResult, Unit> dismissWithResult, final Function0<LinkAccount> getLinkAccount, final Function0<Unit> changeEmail, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Composer composer2;
        final EventReporter eventReporter2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(initialDestination, "initialDestination");
        Intrinsics.checkNotNullParameter(appBarState, "appBarState");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Intrinsics.checkNotNullParameter(moveToWeb, "moveToWeb");
        Intrinsics.checkNotNullParameter(goBack, "goBack");
        Intrinsics.checkNotNullParameter(onNavBackStackEntryChanged, "onNavBackStackEntryChanged");
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(handleViewAction, "handleViewAction");
        Intrinsics.checkNotNullParameter(navigate, "navigate");
        Intrinsics.checkNotNullParameter(dismiss, "dismiss");
        Intrinsics.checkNotNullParameter(dismissWithResult, "dismissWithResult");
        Intrinsics.checkNotNullParameter(getLinkAccount, "getLinkAccount");
        Intrinsics.checkNotNullParameter(changeEmail, "changeEmail");
        Composer composerStartRestartGroup = composer.startRestartGroup(498725081);
        if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(bottomSheetState) : composerStartRestartGroup.changedInstance(bottomSheetState) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(initialDestination) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(appBarState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(eventReporter) : composerStartRestartGroup.changedInstance(eventReporter) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(moveToWeb) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(goBack) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onNavBackStackEntryChanged) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navigationChannel) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(handleViewAction) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(navigate) ? 32 : 16;
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(dismiss) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(dismissWithResult) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(getLinkAccount) ? 16384 : 8192;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(changeEmail) ? 131072 : 65536;
        }
        int i6 = i4;
        if ((i5 & 306783379) != 306783378 || (74899 & i6) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(498725081, i5, i6, "com.stripe.android.link.ui.FullScreenContent (FullScreenContent.kt:46)");
            }
            NavHostController navHostControllerRememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], composerStartRestartGroup, 0);
            KeyboardController keyboardControllerRememberKeyboardController = KeyboardControllerKt.rememberKeyboardController(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-12391521);
            boolean z = (i6 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.link.ui.FullScreenContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FullScreenContentKt.FullScreenContent$lambda$1$lambda$0(dismiss, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i7 = i5 >> 12;
            NavigationEffectsKt.NavigationEffects(navigationChannel, navHostControllerRememberNavController, keyboardControllerRememberKeyboardController, (Function1) objRememberedValue, onNavBackStackEntryChanged, composerStartRestartGroup, ((i5 >> 27) & 14) | (KeyboardController.$stable << 6) | (i7 & 57344), 0);
            composerStartRestartGroup.startReplaceGroup(-12387077);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            StripeBottomSheetState stripeBottomSheetStateRememberStripeBottomSheetState = StripeBottomSheetStateKt.rememberStripeBottomSheetState(null, null, composerStartRestartGroup, 0, 3);
            Function3<ColumnScope, Composer, Integer, Unit> function3FullScreenContent$lambda$3 = FullScreenContent$lambda$3(mutableState);
            composerStartRestartGroup.startReplaceGroup(-12381382);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(stripeBottomSheetStateRememberStripeBottomSheetState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = (Function2) new FullScreenContentKt$FullScreenContent$2$1(stripeBottomSheetStateRememberStripeBottomSheetState, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(function3FullScreenContent$lambda$3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            eventReporter2 = eventReporter;
            EventReporterProviderUtilKt.EventReporterProvider(eventReporter2, ComposableLambdaKt.rememberComposableLambda(1093060281, true, new AnonymousClass3(bottomSheetState, dismiss, modifier, navHostControllerRememberNavController, appBarState, stripeBottomSheetStateRememberStripeBottomSheetState, handleViewAction, navigate, dismissWithResult, getLinkAccount, onBackPressed, moveToWeb, goBack, changeEmail, initialDestination, mutableState), composer2, 54), composer2, (i7 & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            eventReporter2 = eventReporter;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.FullScreenContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FullScreenContentKt.FullScreenContent$lambda$6(modifier, bottomSheetState, initialDestination, appBarState, eventReporter2, onBackPressed, moveToWeb, goBack, onNavBackStackEntryChanged, navigationChannel, handleViewAction, navigate, dismiss, dismissWithResult, getLinkAccount, changeEmail, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FullScreenContent$lambda$1$lambda$0(Function0 function0, boolean z) {
        if (!z) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3<ColumnScope, Composer, Integer, Unit> FullScreenContent$lambda$3(MutableState<Function3<ColumnScope, Composer, Integer, Unit>> mutableState) {
        return mutableState.getValue();
    }

    /* compiled from: FullScreenContent.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.link.ui.FullScreenContentKt$FullScreenContent$3, reason: invalid class name */
    static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ LinkAppBarState $appBarState;
        final /* synthetic */ StripeBottomSheetState $bottomSheetState;
        final /* synthetic */ Function0<Unit> $changeEmail;
        final /* synthetic */ Function0<Unit> $dismiss;
        final /* synthetic */ Function1<LinkActivityResult, Unit> $dismissWithResult;
        final /* synthetic */ Function0<LinkAccount> $getLinkAccount;
        final /* synthetic */ Function0<Unit> $goBack;
        final /* synthetic */ Function1<LinkAction, Unit> $handleViewAction;
        final /* synthetic */ LinkScreen $initialDestination;
        final /* synthetic */ MutableState<Function3<ColumnScope, Composer, Integer, Unit>> $linkContentBottomSheetContent$delegate;
        final /* synthetic */ StripeBottomSheetState $linkContentBottomSheetState;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<Throwable, Unit> $moveToWeb;
        final /* synthetic */ NavHostController $navController;
        final /* synthetic */ Function2<LinkScreen, Boolean, Unit> $navigate;
        final /* synthetic */ Function0<Unit> $onBackPressed;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(StripeBottomSheetState stripeBottomSheetState, Function0<Unit> function0, Modifier modifier, NavHostController navHostController, LinkAppBarState linkAppBarState, StripeBottomSheetState stripeBottomSheetState2, Function1<? super LinkAction, Unit> function1, Function2<? super LinkScreen, ? super Boolean, Unit> function2, Function1<? super LinkActivityResult, Unit> function12, Function0<LinkAccount> function02, Function0<Unit> function03, Function1<? super Throwable, Unit> function13, Function0<Unit> function04, Function0<Unit> function05, LinkScreen linkScreen, MutableState<Function3<ColumnScope, Composer, Integer, Unit>> mutableState) {
            this.$bottomSheetState = stripeBottomSheetState;
            this.$dismiss = function0;
            this.$modifier = modifier;
            this.$navController = navHostController;
            this.$appBarState = linkAppBarState;
            this.$linkContentBottomSheetState = stripeBottomSheetState2;
            this.$handleViewAction = function1;
            this.$navigate = function2;
            this.$dismissWithResult = function12;
            this.$getLinkAccount = function02;
            this.$onBackPressed = function03;
            this.$moveToWeb = function13;
            this.$goBack = function04;
            this.$changeEmail = function05;
            this.$initialDestination = linkScreen;
            this.$linkContentBottomSheetContent$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1093060281, i, -1, "com.stripe.android.link.ui.FullScreenContent.<anonymous> (FullScreenContent.kt:71)");
                }
                float f = 24;
                ElementsBottomSheetLayoutKt.m7218ElementsBottomSheetLayoutTN_CM5M(this.$bottomSheetState, null, Dp.m6117constructorimpl(f), this.$dismiss, ComposableLambdaKt.rememberComposableLambda(-585057695, true, new AnonymousClass1(this.$modifier, this.$navController, this.$appBarState, this.$linkContentBottomSheetState, this.$handleViewAction, this.$navigate, this.$dismissWithResult, this.$getLinkAccount, this.$onBackPressed, this.$moveToWeb, this.$goBack, this.$changeEmail, this.$initialDestination, this.$linkContentBottomSheetContent$delegate), composer, 54), composer, StripeBottomSheetState.$stable | 24960, 2);
                final Function3 function3FullScreenContent$lambda$3 = FullScreenContentKt.FullScreenContent$lambda$3(this.$linkContentBottomSheetContent$delegate);
                if (function3FullScreenContent$lambda$3 != null) {
                    StripeBottomSheetState stripeBottomSheetState = this.$linkContentBottomSheetState;
                    final MutableState<Function3<ColumnScope, Composer, Integer, Unit>> mutableState = this.$linkContentBottomSheetContent$delegate;
                    float fM6117constructorimpl = Dp.m6117constructorimpl(f);
                    composer.startReplaceGroup(-645216949);
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.stripe.android.link.ui.FullScreenContentKt$FullScreenContent$3$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FullScreenContentKt.AnonymousClass3.invoke$lambda$2$lambda$1$lambda$0(mutableState);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    ElementsBottomSheetLayoutKt.m7218ElementsBottomSheetLayoutTN_CM5M(stripeBottomSheetState, null, fM6117constructorimpl, (Function0) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(1590282394, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.FullScreenContentKt$FullScreenContent$3$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            if ((i2 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1590282394, i2, -1, "com.stripe.android.link.ui.FullScreenContent.<anonymous>.<anonymous>.<anonymous> (FullScreenContent.kt:105)");
                                }
                                final Function3<ColumnScope, Composer, Integer, Unit> function3 = function3FullScreenContent$lambda$3;
                                ThemeKt.DefaultLinkTheme(false, ComposableLambdaKt.rememberComposableLambda(-1052613098, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.FullScreenContentKt$FullScreenContent$3$2$2.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i3) {
                                        if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1052613098, i3, -1, "com.stripe.android.link.ui.FullScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FullScreenContent.kt:106)");
                                        }
                                        Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
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
                                        function32.invoke(ColumnScopeInstance.INSTANCE, composer3, 6);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, 48, 1);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, composer, 54), composer, StripeBottomSheetState.$stable | 28032, 2);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* compiled from: FullScreenContent.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.stripe.android.link.ui.FullScreenContentKt$FullScreenContent$3$1, reason: invalid class name */
        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ LinkAppBarState $appBarState;
            final /* synthetic */ Function0<Unit> $changeEmail;
            final /* synthetic */ Function1<LinkActivityResult, Unit> $dismissWithResult;
            final /* synthetic */ Function0<LinkAccount> $getLinkAccount;
            final /* synthetic */ Function0<Unit> $goBack;
            final /* synthetic */ Function1<LinkAction, Unit> $handleViewAction;
            final /* synthetic */ LinkScreen $initialDestination;
            final /* synthetic */ MutableState<Function3<ColumnScope, Composer, Integer, Unit>> $linkContentBottomSheetContent$delegate;
            final /* synthetic */ StripeBottomSheetState $linkContentBottomSheetState;
            final /* synthetic */ Modifier $modifier;
            final /* synthetic */ Function1<Throwable, Unit> $moveToWeb;
            final /* synthetic */ NavHostController $navController;
            final /* synthetic */ Function2<LinkScreen, Boolean, Unit> $navigate;
            final /* synthetic */ Function0<Unit> $onBackPressed;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Modifier modifier, NavHostController navHostController, LinkAppBarState linkAppBarState, StripeBottomSheetState stripeBottomSheetState, Function1<? super LinkAction, Unit> function1, Function2<? super LinkScreen, ? super Boolean, Unit> function2, Function1<? super LinkActivityResult, Unit> function12, Function0<LinkAccount> function0, Function0<Unit> function02, Function1<? super Throwable, Unit> function13, Function0<Unit> function03, Function0<Unit> function04, LinkScreen linkScreen, MutableState<Function3<ColumnScope, Composer, Integer, Unit>> mutableState) {
                this.$modifier = modifier;
                this.$navController = navHostController;
                this.$appBarState = linkAppBarState;
                this.$linkContentBottomSheetState = stripeBottomSheetState;
                this.$handleViewAction = function1;
                this.$navigate = function2;
                this.$dismissWithResult = function12;
                this.$getLinkAccount = function0;
                this.$onBackPressed = function02;
                this.$moveToWeb = function13;
                this.$goBack = function03;
                this.$changeEmail = function04;
                this.$initialDestination = linkScreen;
                this.$linkContentBottomSheetContent$delegate = mutableState;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-585057695, i, -1, "com.stripe.android.link.ui.FullScreenContent.<anonymous>.<anonymous> (FullScreenContent.kt:76)");
                    }
                    Function3 function3FullScreenContent$lambda$3 = FullScreenContentKt.FullScreenContent$lambda$3(this.$linkContentBottomSheetContent$delegate);
                    Modifier modifier = this.$modifier;
                    NavHostController navHostController = this.$navController;
                    LinkAppBarState linkAppBarState = this.$appBarState;
                    composer.startReplaceGroup(-645239907);
                    final MutableState<Function3<ColumnScope, Composer, Integer, Unit>> mutableState = this.$linkContentBottomSheetContent$delegate;
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.stripe.android.link.ui.FullScreenContentKt$FullScreenContent$3$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return FullScreenContentKt.AnonymousClass3.AnonymousClass1.invoke$lambda$1$lambda$0(mutableState, (Function3) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function1 = (Function1) objRememberedValue;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(-645235667);
                    boolean zChangedInstance = composer.changedInstance(this.$linkContentBottomSheetState);
                    StripeBottomSheetState stripeBottomSheetState = this.$linkContentBottomSheetState;
                    FullScreenContentKt$FullScreenContent$3$1$2$1 fullScreenContentKt$FullScreenContent$3$1$2$1RememberedValue = composer.rememberedValue();
                    if (zChangedInstance || fullScreenContentKt$FullScreenContent$3$1$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                        fullScreenContentKt$FullScreenContent$3$1$2$1RememberedValue = new FullScreenContentKt$FullScreenContent$3$1$2$1(stripeBottomSheetState, null);
                        composer.updateRememberedValue(fullScreenContentKt$FullScreenContent$3$1$2$1RememberedValue);
                    }
                    composer.endReplaceGroup();
                    LinkContentKt.LinkContent(modifier, navHostController, linkAppBarState, function3FullScreenContent$lambda$3, function1, (Function1) fullScreenContentKt$FullScreenContent$3$1$2$1RememberedValue, this.$handleViewAction, this.$navigate, this.$dismissWithResult, this.$getLinkAccount, this.$onBackPressed, this.$moveToWeb, this.$goBack, this.$changeEmail, this.$initialDestination, composer, 24576, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(MutableState mutableState, Function3 content) {
                Intrinsics.checkNotNullParameter(content, "content");
                FullScreenContentKt.FullScreenContent$lambda$4(mutableState, content);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(MutableState mutableState) {
            FullScreenContentKt.FullScreenContent$lambda$4(mutableState, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void FullScreenContent$lambda$4(MutableState<Function3<ColumnScope, Composer, Integer, Unit>> mutableState, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3) {
        mutableState.setValue(function3);
    }
}
