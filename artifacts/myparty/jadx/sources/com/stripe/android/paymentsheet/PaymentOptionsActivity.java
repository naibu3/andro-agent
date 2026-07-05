package com.stripe.android.paymentsheet;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.common.ui.ElementsBottomSheetLayoutKt;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.PaymentOptionsActivity;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.ui.BaseSheetActivity;
import com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt;
import com.stripe.android.paymentsheet.utils.ActivityUtilsKt;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PaymentOptionsActivity.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0013H\u0002J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0002H\u0016R$\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;", "Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;", "Lcom/stripe/android/paymentsheet/PaymentOptionsActivityResult;", "<init>", "()V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory$paymentsheet_release$annotations", "getViewModelFactory$paymentsheet_release", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory$paymentsheet_release", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "viewModel", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;", "getViewModel", "()Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "starterArgs", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "getStarterArgs", "()Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "starterArgs$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initializeStarterArgs", "setActivityResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "paymentsheet_release", "isProcessing", ""}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentOptionsActivity extends BaseSheetActivity<PaymentOptionsActivityResult> {
    public static final int $stable = 8;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;
    private ViewModelProvider.Factory viewModelFactory = new PaymentOptionsViewModel.Factory(new Function0() { // from class: com.stripe.android.paymentsheet.PaymentOptionsActivity$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PaymentOptionsActivity.viewModelFactory$lambda$0(this.f$0);
        }
    });

    /* renamed from: starterArgs$delegate, reason: from kotlin metadata */
    private final Lazy starterArgs = LazyKt.lazy(new Function0() { // from class: com.stripe.android.paymentsheet.PaymentOptionsActivity$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PaymentOptionsActivity.starterArgs_delegate$lambda$2(this.f$0);
        }
    });

    public static /* synthetic */ void getViewModelFactory$paymentsheet_release$annotations() {
    }

    public PaymentOptionsActivity() {
        final PaymentOptionsActivity paymentOptionsActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PaymentOptionsViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.paymentsheet.PaymentOptionsActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return paymentOptionsActivity.getStore();
            }
        }, new Function0() { // from class: com.stripe.android.paymentsheet.PaymentOptionsActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.viewModelFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.paymentsheet.PaymentOptionsActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? paymentOptionsActivity.getDefaultViewModelCreationExtras() : creationExtras;
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
    public static final PaymentOptionContract.Args viewModelFactory$lambda$0(PaymentOptionsActivity paymentOptionsActivity) {
        PaymentOptionContract.Args starterArgs = paymentOptionsActivity.getStarterArgs();
        if (starterArgs != null) {
            return starterArgs;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity
    public PaymentOptionsViewModel getViewModel() {
        return (PaymentOptionsViewModel) this.viewModel.getValue();
    }

    private final PaymentOptionContract.Args getStarterArgs() {
        return (PaymentOptionContract.Args) this.starterArgs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentOptionContract.Args starterArgs_delegate$lambda$2(PaymentOptionsActivity paymentOptionsActivity) {
        PaymentOptionContract.Args.Companion companion = PaymentOptionContract.Args.INSTANCE;
        Intent intent = paymentOptionsActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return companion.fromIntent$paymentsheet_release(intent);
    }

    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        PaymentOptionContract.Args argsInitializeStarterArgs = initializeStarterArgs();
        super.onCreate(savedInstanceState);
        if (argsInitializeStarterArgs == null) {
            finish();
            return;
        }
        if (!ActivityUtilsKt.applicationIsTaskOwner(this)) {
            getViewModel().getAnalyticsListener().cannotProperlyReturnFromLinkAndOtherLPMs();
        }
        getViewModel().registerForActivityResult(this, this);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1719713842, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.PaymentOptionsActivity.onCreate.1

            /* compiled from: PaymentOptionsActivity.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
            static final class C01981 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ PaymentOptionsActivity this$0;

                C01981(PaymentOptionsActivity paymentOptionsActivity) {
                    this.this$0 = paymentOptionsActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1453511964, i, -1, "com.stripe.android.paymentsheet.PaymentOptionsActivity.onCreate.<anonymous>.<anonymous> (PaymentOptionsActivity.kt:57)");
                        }
                        final State stateCollectAsState = StateFlowsComposeKt.collectAsState(this.this$0.getViewModel().getProcessing(), null, composer, 0, 1);
                        composer.startReplaceGroup(1788266447);
                        boolean zChanged = composer.changed(stateCollectAsState);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.stripe.android.paymentsheet.PaymentOptionsActivity$onCreate$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Boolean.valueOf(PaymentOptionsActivity.AnonymousClass1.C01981.invoke$lambda$2$lambda$1(stateCollectAsState, (ModalBottomSheetValue) obj));
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        StripeBottomSheetState stripeBottomSheetStateRememberStripeBottomSheetState = StripeBottomSheetStateKt.rememberStripeBottomSheetState(null, (Function1) objRememberedValue, composer, 0, 1);
                        Unit unit = Unit.INSTANCE;
                        composer.startReplaceGroup(1788269174);
                        boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changedInstance(stripeBottomSheetStateRememberStripeBottomSheetState);
                        PaymentOptionsActivity paymentOptionsActivity = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = (Function2) new PaymentOptionsActivity$onCreate$1$1$1$1(paymentOptionsActivity, stripeBottomSheetStateRememberStripeBottomSheetState, null);
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 6);
                        Object viewModel = this.this$0.getViewModel();
                        composer.startReplaceGroup(1788283861);
                        boolean zChangedInstance2 = composer.changedInstance(viewModel);
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = (KFunction) new PaymentOptionsActivity$onCreate$1$1$2$1(viewModel);
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        composer.endReplaceGroup();
                        final PaymentOptionsActivity paymentOptionsActivity2 = this.this$0;
                        ElementsBottomSheetLayoutKt.m7218ElementsBottomSheetLayoutTN_CM5M(stripeBottomSheetStateRememberStripeBottomSheetState, null, 0.0f, (Function0) ((KFunction) objRememberedValue3), ComposableLambdaKt.rememberComposableLambda(-1016729028, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.PaymentOptionsActivity.onCreate.1.1.3
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
                                    ComposerKt.traceEventStart(-1016729028, i2, -1, "com.stripe.android.paymentsheet.PaymentOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (PaymentOptionsActivity.kt:76)");
                                }
                                PaymentSheetScreenKt.PaymentSheetScreen(paymentOptionsActivity2.getViewModel(), composer2, 0);
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
                public static final boolean invoke$lambda$2$lambda$1(State state, ModalBottomSheetValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return !invoke$lambda$0(state);
                }

                private static final boolean invoke$lambda$0(State<Boolean> state) {
                    return state.getValue().booleanValue();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1719713842, i, -1, "com.stripe.android.paymentsheet.PaymentOptionsActivity.onCreate.<anonymous> (PaymentOptionsActivity.kt:56)");
                    }
                    StripeThemeKt.StripeTheme(null, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1453511964, true, new C01981(PaymentOptionsActivity.this), composer, 54), composer, 12582912, 127);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }), 1, null);
    }

    private final PaymentOptionContract.Args initializeStarterArgs() {
        PaymentSheet.Configuration configuration;
        PaymentSheet.Appearance appearance;
        PaymentOptionContract.Args starterArgs = getStarterArgs();
        if (starterArgs != null && (configuration = starterArgs.getConfiguration()) != null && (appearance = configuration.getAppearance()) != null) {
            PaymentSheetConfigurationKtxKt.parseAppearance(appearance);
        }
        setEarlyExitDueToIllegalState(getStarterArgs() == null);
        return getStarterArgs();
    }

    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity
    public void setActivityResult(PaymentOptionsActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        setResult(result.getResultCode(), new Intent().putExtras(result.toBundle()));
    }
}
