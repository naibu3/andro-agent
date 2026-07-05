package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.common.ui.ElementsBottomSheetLayoutKt;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingContract;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt;
import com.stripe.android.uicore.utils.AnimationConstantsKt;
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
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PollingActivity.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0016H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u0084\u0002"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", CardScanActivity.ARGS, "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;", "getArgs", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;", "args$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory$paymentsheet_release", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory$paymentsheet_release", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "viewModel", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;", "getViewModel", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;", "viewModel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "finishWithResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "finish", "paymentsheet_release", "uiState", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PollingActivity extends AppCompatActivity {
    public static final int $stable = 8;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final Lazy args = LazyKt.lazy(new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PollingActivity.args_delegate$lambda$0(this.f$0);
        }
    });
    private ViewModelProvider.Factory viewModelFactory = new PollingViewModel.Factory(new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PollingActivity.viewModelFactory$lambda$1(this.f$0);
        }
    });

    public PollingActivity() {
        final PollingActivity pollingActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PollingViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return pollingActivity.getViewModelStore();
            }
        }, new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.viewModelFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? pollingActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PollingContract.Args getArgs() {
        return (PollingContract.Args) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PollingContract.Args args_delegate$lambda$0(PollingActivity pollingActivity) {
        PollingContract.Args.Companion companion = PollingContract.Args.INSTANCE;
        Intent intent = pollingActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        PollingContract.Args argsFromIntent = companion.fromIntent(intent);
        if (argsFromIntent != null) {
            return argsFromIntent;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
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
    public static final PollingViewModel.Args viewModelFactory$lambda$1(PollingActivity pollingActivity) {
        String clientSecret = pollingActivity.getArgs().getClientSecret();
        Duration.Companion companion = Duration.INSTANCE;
        long duration = DurationKt.toDuration(pollingActivity.getArgs().getTimeLimitInSeconds(), DurationUnit.SECONDS);
        Duration.Companion companion2 = Duration.INSTANCE;
        return new PollingViewModel.Args(clientSecret, duration, DurationKt.toDuration(pollingActivity.getArgs().getInitialDelayInSeconds(), DurationUnit.SECONDS), pollingActivity.getArgs().getMaxAttempts(), pollingActivity.getArgs().getCtaText(), pollingActivity.getArgs().getStripeAccountId(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PollingViewModel getViewModel() {
        return (PollingViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-684927091, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity.onCreate.1

            /* compiled from: PollingActivity.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
            static final class C02111 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ PollingActivity this$0;

                C02111(PollingActivity pollingActivity) {
                    this.this$0 = pollingActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1785583267, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity.onCreate.<anonymous>.<anonymous> (PollingActivity.kt:50)");
                        }
                        final State stateCollectAsState = StateFlowsComposeKt.collectAsState(this.this$0.getViewModel().getUiState(), null, composer, 0, 1);
                        composer.startReplaceGroup(1911404891);
                        boolean zChanged = composer.changed(stateCollectAsState);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity$onCreate$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Boolean.valueOf(PollingActivity.AnonymousClass1.C02111.invoke$lambda$2$lambda$1(stateCollectAsState, (ModalBottomSheetValue) obj));
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        StripeBottomSheetState stripeBottomSheetStateRememberStripeBottomSheetState = StripeBottomSheetStateKt.rememberStripeBottomSheetState(null, (Function1) objRememberedValue, composer, 0, 1);
                        composer.startReplaceGroup(1911415916);
                        boolean zChanged2 = composer.changed(stateCollectAsState) | composer.changedInstance(this.this$0);
                        final PollingActivity pollingActivity = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity$onCreate$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PollingActivity.AnonymousClass1.C02111.invoke$lambda$4$lambda$3(pollingActivity, stateCollectAsState);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        BackHandlerKt.BackHandler(true, (Function0) objRememberedValue2, composer, 6, 0);
                        PollingState pollingState = invoke$lambda$0(stateCollectAsState).getPollingState();
                        composer.startReplaceGroup(1911426164);
                        boolean zChanged3 = composer.changed(stateCollectAsState) | composer.changedInstance(this.this$0) | composer.changedInstance(stripeBottomSheetStateRememberStripeBottomSheetState);
                        PollingActivity pollingActivity2 = this.this$0;
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = (Function2) new PollingActivity$onCreate$1$1$2$1(pollingActivity2, stripeBottomSheetStateRememberStripeBottomSheetState, stateCollectAsState, null);
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        composer.endReplaceGroup();
                        EffectsKt.LaunchedEffect(pollingState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer, 0);
                        composer.startReplaceGroup(1911437343);
                        Object objRememberedValue4 = composer.rememberedValue();
                        if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity$onCreate$1$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        composer.endReplaceGroup();
                        final PollingActivity pollingActivity3 = this.this$0;
                        ElementsBottomSheetLayoutKt.m7218ElementsBottomSheetLayoutTN_CM5M(stripeBottomSheetStateRememberStripeBottomSheetState, null, 0.0f, (Function0) objRememberedValue4, ComposableLambdaKt.rememberComposableLambda(980217339, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity.onCreate.1.1.4
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
                                    ComposerKt.traceEventStart(980217339, i2, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (PollingActivity.kt:82)");
                                }
                                PollingScreenKt.PollingScreen(pollingActivity3.getViewModel(), null, composer2, 0, 2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer, 54), composer, StripeBottomSheetState.$stable | 27648, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final boolean invoke$lambda$2$lambda$1(State state, ModalBottomSheetValue proposedValue) {
                    Intrinsics.checkNotNullParameter(proposedValue, "proposedValue");
                    return (proposedValue == ModalBottomSheetValue.Hidden && invoke$lambda$0(state).getPollingState() == PollingState.Active) ? false : true;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$4$lambda$3(PollingActivity pollingActivity, State state) {
                    if (invoke$lambda$0(state).getPollingState() == PollingState.Failed) {
                        pollingActivity.getViewModel().handleCancel();
                    }
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final PollingUiState invoke$lambda$0(State<PollingUiState> state) {
                    return state.getValue();
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
                        ComposerKt.traceEventStart(-684927091, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity.onCreate.<anonymous> (PollingActivity.kt:49)");
                    }
                    StripeThemeKt.StripeTheme(null, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1785583267, true, new C02111(PollingActivity.this), composer, 54), composer, 12582912, 127);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(PaymentFlowResult.Unvalidated result) {
        setResult(-1, new Intent().putExtras(result.toBundle()));
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        AnimationConstantsKt.fadeOut(this);
    }
}
