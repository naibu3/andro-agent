package com.stripe.android.paymentsheet.addresselement;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavType;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.stripe.android.common.ui.ElementsBottomSheetLayoutKt;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetConfigurationKtxKt;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivity;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.addresselement.AddressElementScreen;
import com.stripe.android.paymentsheet.addresselement.AddressElementViewModel;
import com.stripe.android.paymentsheet.addresselement.AddressLauncher;
import com.stripe.android.paymentsheet.addresselement.AddressLauncherResult;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt;
import com.stripe.android.uicore.utils.AnimationConstantsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AddressElementActivity.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u001d\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0003¢\u0006\u0002\u0010\u001fJ\u0012\u0010 \u001a\u00020\u00172\b\b\u0002\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\u0017H\u0016R$\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory$paymentsheet_release$annotations", "getViewModelFactory$paymentsheet_release", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory$paymentsheet_release", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "viewModel", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;", "getViewModel", "()Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "starterArgs", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "getStarterArgs", "()Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "starterArgs$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "AddressElementUi", "bottomSheetState", "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;", "navController", "Landroidx/navigation/NavHostController;", "(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;I)V", "setResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;", "finish", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressElementActivity extends ComponentActivity {
    public static final int $stable = 8;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;
    private ViewModelProvider.Factory viewModelFactory = new AddressElementViewModel.Factory(new Function0() { // from class: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AddressElementActivity.viewModelFactory$lambda$0(this.f$0);
        }
    }, new Function0() { // from class: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AddressElementActivity.viewModelFactory$lambda$1(this.f$0);
        }
    });

    /* renamed from: starterArgs$delegate, reason: from kotlin metadata */
    private final Lazy starterArgs = LazyKt.lazy(new Function0() { // from class: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AddressElementActivity.starterArgs_delegate$lambda$3(this.f$0);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddressElementUi$lambda$4(AddressElementActivity addressElementActivity, StripeBottomSheetState stripeBottomSheetState, NavHostController navHostController, int i, Composer composer, int i2) {
        addressElementActivity.AddressElementUi(stripeBottomSheetState, navHostController, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getViewModelFactory$paymentsheet_release$annotations() {
    }

    public AddressElementActivity() {
        final AddressElementActivity addressElementActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AddressElementViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return addressElementActivity.getStore();
            }
        }, new Function0() { // from class: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.viewModelFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? addressElementActivity.getDefaultViewModelCreationExtras() : creationExtras;
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
    public static final Application viewModelFactory$lambda$0(AddressElementActivity addressElementActivity) {
        Application application = addressElementActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        return application;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddressElementActivityContract.Args viewModelFactory$lambda$1(AddressElementActivity addressElementActivity) {
        AddressElementActivityContract.Args starterArgs = addressElementActivity.getStarterArgs();
        if (starterArgs != null) {
            return starterArgs;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddressElementViewModel getViewModel() {
        return (AddressElementViewModel) this.viewModel.getValue();
    }

    private final AddressElementActivityContract.Args getStarterArgs() {
        return (AddressElementActivityContract.Args) this.starterArgs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddressElementActivityContract.Args starterArgs_delegate$lambda$3(AddressElementActivity addressElementActivity) {
        AddressElementActivityContract.Args.Companion companion = AddressElementActivityContract.Args.INSTANCE;
        Intent intent = addressElementActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return companion.fromIntent$paymentsheet_release(intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        PaymentSheet.Appearance appearance;
        super.onCreate(savedInstanceState);
        AddressElementActivityContract.Args starterArgs = getStarterArgs();
        if (starterArgs == null) {
            finish();
            return;
        }
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        AddressLauncher.Configuration config$paymentsheet_release = starterArgs.getConfig$paymentsheet_release();
        if (config$paymentsheet_release != null && (appearance = config$paymentsheet_release.getAppearance()) != null) {
            PaymentSheetConfigurationKtxKt.parseAppearance(appearance);
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1953035352, true, new C11141()), 1, null);
    }

    /* compiled from: AddressElementActivity.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$onCreate$1, reason: invalid class name and case insensitive filesystem */
    static final class C11141 implements Function2<Composer, Integer, Unit> {
        C11141() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1953035352, i, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.<anonymous> (AddressElementActivity.kt:60)");
                }
                ComposerKt.sourceInformationMarkerStart(composer, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(composer, -954367824, "CC(remember):Effects.kt#9igjgp");
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                    composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                ComposerKt.sourceInformationMarkerEnd(composer);
                NavHostController navHostControllerRememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], composer, 0);
                AddressElementActivity.this.getViewModel().getNavigator().setNavigationController(navHostControllerRememberNavController);
                final StripeBottomSheetState stripeBottomSheetStateRememberStripeBottomSheetState = StripeBottomSheetStateKt.rememberStripeBottomSheetState(null, null, composer, 0, 3);
                composer.startReplaceGroup(-897730999);
                boolean zChangedInstance = composer.changedInstance(AddressElementActivity.this);
                final AddressElementActivity addressElementActivity = AddressElementActivity.this;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$onCreate$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AddressElementActivity.C11141.invoke$lambda$1$lambda$0(addressElementActivity);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                BackHandlerKt.BackHandler(false, (Function0) objRememberedValue2, composer, 0, 1);
                NavHostAddressElementNavigator navigator = AddressElementActivity.this.getViewModel().getNavigator();
                composer.startReplaceGroup(-897727473);
                boolean zChangedInstance2 = composer.changedInstance(coroutineScope) | composer.changedInstance(stripeBottomSheetStateRememberStripeBottomSheetState) | composer.changedInstance(AddressElementActivity.this);
                final AddressElementActivity addressElementActivity2 = AddressElementActivity.this;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$onCreate$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AddressElementActivity.C11141.invoke$lambda$3$lambda$2(coroutineScope, stripeBottomSheetStateRememberStripeBottomSheetState, addressElementActivity2, (AddressLauncherResult) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                navigator.setOnDismiss((Function1) objRememberedValue3);
                AddressElementActivity.this.AddressElementUi(stripeBottomSheetStateRememberStripeBottomSheetState, navHostControllerRememberNavController, composer, StripeBottomSheetState.$stable);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(AddressElementActivity addressElementActivity) {
            addressElementActivity.getViewModel().getNavigator().onBack();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(CoroutineScope coroutineScope, StripeBottomSheetState stripeBottomSheetState, AddressElementActivity addressElementActivity, AddressLauncherResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AddressElementActivity$onCreate$1$2$1$1(stripeBottomSheetState, addressElementActivity, result, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AddressElementUi(final StripeBottomSheetState stripeBottomSheetState, final NavHostController navHostController, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1137646869);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(stripeBottomSheetState) : composerStartRestartGroup.changedInstance(stripeBottomSheetState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(navHostController) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1137646869, i2, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.AddressElementUi (AddressElementActivity.kt:87)");
            }
            StripeThemeKt.StripeTheme(null, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1539938881, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.addresselement.AddressElementActivity.AddressElementUi.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1539938881, i3, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.AddressElementUi.<anonymous> (AddressElementActivity.kt:89)");
                        }
                        StripeBottomSheetState stripeBottomSheetState2 = stripeBottomSheetState;
                        NavHostAddressElementNavigator navigator = this.getViewModel().getNavigator();
                        composer2.startReplaceGroup(582905322);
                        boolean zChangedInstance = composer2.changedInstance(navigator);
                        AddressElementActivity$AddressElementUi$1$1$1 addressElementActivity$AddressElementUi$1$1$1RememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || addressElementActivity$AddressElementUi$1$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                            addressElementActivity$AddressElementUi$1$1$1RememberedValue = new AddressElementActivity$AddressElementUi$1$1$1(navigator);
                            composer2.updateRememberedValue(addressElementActivity$AddressElementUi$1$1$1RememberedValue);
                        }
                        Function0 function0 = (Function0) addressElementActivity$AddressElementUi$1$1$1RememberedValue;
                        composer2.endReplaceGroup();
                        final NavHostController navHostController2 = navHostController;
                        final AddressElementActivity addressElementActivity = this;
                        ElementsBottomSheetLayoutKt.m7218ElementsBottomSheetLayoutTN_CM5M(stripeBottomSheetState2, null, 0.0f, function0, ComposableLambdaKt.rememberComposableLambda(589712743, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.addresselement.AddressElementActivity.AddressElementUi.1.2

                            /* compiled from: AddressElementActivity.kt */
                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$AddressElementUi$1$2$1, reason: invalid class name and collision with other inner class name */
                            static final class C02011 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ NavHostController $navController;
                                final /* synthetic */ AddressElementActivity this$0;

                                C02011(NavHostController navHostController, AddressElementActivity addressElementActivity) {
                                    this.$navController = navHostController;
                                    this.this$0 = addressElementActivity;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer, int i) {
                                    if ((i & 3) != 2 || !composer.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(754384291, i, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.AddressElementUi.<anonymous>.<anonymous>.<anonymous> (AddressElementActivity.kt:94)");
                                        }
                                        NavHostController navHostController = this.$navController;
                                        String route = AddressElementScreen.InputAddress.INSTANCE.getRoute();
                                        composer.startReplaceGroup(1051396892);
                                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                                        final AddressElementActivity addressElementActivity = this.this$0;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function1() { // from class: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$AddressElementUi$1$2$1$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return AddressElementActivity.AnonymousClass1.AnonymousClass2.C02011.invoke$lambda$2$lambda$1(addressElementActivity, (NavGraphBuilder) obj);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        NavHostKt.NavHost(navHostController, route, null, null, null, null, null, null, null, null, (Function1) objRememberedValue, composer, 0, 0, PointerIconCompat.TYPE_GRAB);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer.skipToGroupEnd();
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$2$lambda$1(final AddressElementActivity addressElementActivity, NavGraphBuilder NavHost) {
                                    Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
                                    NavGraphBuilderKt.composable$default(NavHost, AddressElementScreen.InputAddress.INSTANCE.getRoute(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(538748256, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$AddressElementUi$1$2$1$1$1$1
                                        @Override // kotlin.jvm.functions.Function4
                                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                                            invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
                                            Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(538748256, i, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.AddressElementUi.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressElementActivity.kt:99)");
                                            }
                                            InputAddressScreenKt.InputAddressScreen(addressElementActivity.getViewModel().getInputAddressViewModelSubcomponentBuilderProvider(), composer, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), 254, null);
                                    NavGraphBuilderKt.composable$default(NavHost, AddressElementScreen.Autocomplete.route, CollectionsKt.listOf(NamedNavArgumentKt.navArgument("country", new Function1() { // from class: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$AddressElementUi$1$2$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return AddressElementActivity.AnonymousClass1.AnonymousClass2.C02011.invoke$lambda$2$lambda$1$lambda$0((NavArgumentBuilder) obj);
                                        }
                                    })), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(501268297, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$AddressElementUi$1$2$1$1$1$3
                                        @Override // kotlin.jvm.functions.Function4
                                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                                            invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(AnimatedContentScope composable, NavBackStackEntry backStackEntry, Composer composer, int i) {
                                            Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(501268297, i, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.AddressElementUi.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressElementActivity.kt:109)");
                                            }
                                            Bundle arguments = backStackEntry.getArguments();
                                            AutocompleteScreenKt.AutocompleteScreen(addressElementActivity.getViewModel().getAutoCompleteViewModelSubcomponentBuilderProvider(), addressElementActivity.getViewModel().getNavigator(), arguments != null ? arguments.getString("country") : null, composer, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), 252, null);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$2$lambda$1$lambda$0(NavArgumentBuilder navArgument) {
                                    Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
                                    navArgument.setType(NavType.StringType);
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i4) {
                                if ((i4 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(589712743, i4, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.AddressElementUi.<anonymous>.<anonymous> (AddressElementActivity.kt:93)");
                                    }
                                    SurfaceKt.m2015SurfaceFjzlyU(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, 0L, 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(754384291, true, new C02011(navHostController2, addressElementActivity), composer3, 54), composer3, 1572870, 62);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composer2, 54), composer2, StripeBottomSheetState.$stable | 24576, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, 127);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AddressElementActivity.AddressElementUi$lambda$4(this.f$0, stripeBottomSheetState, navHostController, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static /* synthetic */ void setResult$default(AddressElementActivity addressElementActivity, AddressLauncherResult addressLauncherResult, int i, Object obj) {
        if ((i & 1) != 0) {
            addressLauncherResult = AddressLauncherResult.Canceled.INSTANCE;
        }
        addressElementActivity.setResult(addressLauncherResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setResult(AddressLauncherResult result) {
        setResult(result.getResultCode$paymentsheet_release(), new Intent().putExtras(new AddressElementActivityContract.Result(result).toBundle()));
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        AnimationConstantsKt.fadeOut(this);
    }
}
