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
import com.stripe.android.common.model.CommonConfigurationKt;
import com.stripe.android.common.ui.ElementsBottomSheetLayoutKt;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentsheet.PaymentSheetActivity;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.PaymentSheetResult;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
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
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PaymentSheetActivity.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0017\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0002H\u0016J\u0012\u0010!\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\f\u0010$\u001a\u00060%j\u0002`&H\u0002R$\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015¨\u0006'²\u0006\n\u0010(\u001a\u00020)X\u008a\u0084\u0002"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetActivity;", "Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "<init>", "()V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory$paymentsheet_release$annotations", "getViewModelFactory$paymentsheet_release", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory$paymentsheet_release", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "viewModel", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "getViewModel", "()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "starterArgs", "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;", "getStarterArgs", "()Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;", "starterArgs$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initializeArgs", "Lkotlin/Result;", "initializeArgs-d1pmJ48", "()Ljava/lang/Object;", "setActivityResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "finishWithError", "error", "", "defaultInitializationError", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "paymentsheet_release", "isProcessing", ""}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentSheetActivity extends BaseSheetActivity<PaymentSheetResult> {
    public static final int $stable = 8;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;
    private ViewModelProvider.Factory viewModelFactory = new PaymentSheetViewModel.Factory(new Function0() { // from class: com.stripe.android.paymentsheet.PaymentSheetActivity$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PaymentSheetActivity.viewModelFactory$lambda$0(this.f$0);
        }
    });

    /* renamed from: starterArgs$delegate, reason: from kotlin metadata */
    private final Lazy starterArgs = LazyKt.lazy(new Function0() { // from class: com.stripe.android.paymentsheet.PaymentSheetActivity$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PaymentSheetActivity.starterArgs_delegate$lambda$2(this.f$0);
        }
    });

    public static /* synthetic */ void getViewModelFactory$paymentsheet_release$annotations() {
    }

    public PaymentSheetActivity() {
        final PaymentSheetActivity paymentSheetActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PaymentSheetViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.paymentsheet.PaymentSheetActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return paymentSheetActivity.getStore();
            }
        }, new Function0() { // from class: com.stripe.android.paymentsheet.PaymentSheetActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.viewModelFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.paymentsheet.PaymentSheetActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? paymentSheetActivity.getDefaultViewModelCreationExtras() : creationExtras;
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
    public static final PaymentSheetContractV2.Args viewModelFactory$lambda$0(PaymentSheetActivity paymentSheetActivity) {
        PaymentSheetContractV2.Args starterArgs = paymentSheetActivity.getStarterArgs();
        if (starterArgs != null) {
            return starterArgs;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity
    public PaymentSheetViewModel getViewModel() {
        return (PaymentSheetViewModel) this.viewModel.getValue();
    }

    private final PaymentSheetContractV2.Args getStarterArgs() {
        return (PaymentSheetContractV2.Args) this.starterArgs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentSheetContractV2.Args starterArgs_delegate$lambda$2(PaymentSheetActivity paymentSheetActivity) {
        PaymentSheetContractV2.Args.Companion companion = PaymentSheetContractV2.Args.INSTANCE;
        Intent intent = paymentSheetActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return companion.fromIntent$paymentsheet_release(intent);
    }

    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Object objM8223initializeArgsd1pmJ48 = m8223initializeArgsd1pmJ48();
        if (((PaymentSheetContractV2.Args) (Result.m9124isFailureimpl(objM8223initializeArgsd1pmJ48) ? null : objM8223initializeArgsd1pmJ48)) == null) {
            finishWithError(Result.m9121exceptionOrNullimpl(objM8223initializeArgsd1pmJ48));
            return;
        }
        getViewModel().registerForActivityResult(this, this);
        if (!ActivityUtilsKt.applicationIsTaskOwner(this)) {
            getViewModel().getAnalyticsListener().cannotProperlyReturnFromLinkAndOtherLPMs();
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(485212172, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.PaymentSheetActivity.onCreate.1

            /* compiled from: PaymentSheetActivity.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
            static final class C01991 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ PaymentSheetActivity this$0;

                C01991(PaymentSheetActivity paymentSheetActivity) {
                    this.this$0 = paymentSheetActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-680090078, i, -1, "com.stripe.android.paymentsheet.PaymentSheetActivity.onCreate.<anonymous>.<anonymous> (PaymentSheetActivity.kt:57)");
                        }
                        final State stateCollectAsState = StateFlowsComposeKt.collectAsState(this.this$0.getViewModel().getProcessing(), null, composer, 0, 1);
                        composer.startReplaceGroup(2130492206);
                        boolean zChanged = composer.changed(stateCollectAsState);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.stripe.android.paymentsheet.PaymentSheetActivity$onCreate$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Boolean.valueOf(PaymentSheetActivity.AnonymousClass1.C01991.invoke$lambda$2$lambda$1(stateCollectAsState, (ModalBottomSheetValue) obj));
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        StripeBottomSheetState stripeBottomSheetStateRememberStripeBottomSheetState = StripeBottomSheetStateKt.rememberStripeBottomSheetState(null, (Function1) objRememberedValue, composer, 0, 1);
                        Unit unit = Unit.INSTANCE;
                        composer.startReplaceGroup(2130494923);
                        boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changedInstance(stripeBottomSheetStateRememberStripeBottomSheetState);
                        PaymentSheetActivity paymentSheetActivity = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = (Function2) new PaymentSheetActivity$onCreate$1$1$1$1(paymentSheetActivity, stripeBottomSheetStateRememberStripeBottomSheetState, null);
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 6);
                        Object viewModel = this.this$0.getViewModel();
                        composer.startReplaceGroup(2130509300);
                        boolean zChangedInstance2 = composer.changedInstance(viewModel);
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = (KFunction) new PaymentSheetActivity$onCreate$1$1$2$1(viewModel);
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        composer.endReplaceGroup();
                        final PaymentSheetActivity paymentSheetActivity2 = this.this$0;
                        ElementsBottomSheetLayoutKt.m7218ElementsBottomSheetLayoutTN_CM5M(stripeBottomSheetStateRememberStripeBottomSheetState, null, 0.0f, (Function0) ((KFunction) objRememberedValue3), ComposableLambdaKt.rememberComposableLambda(-1359423110, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.PaymentSheetActivity.onCreate.1.1.3
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
                                    ComposerKt.traceEventStart(-1359423110, i2, -1, "com.stripe.android.paymentsheet.PaymentSheetActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (PaymentSheetActivity.kt:76)");
                                }
                                PaymentSheetScreenKt.PaymentSheetScreen(paymentSheetActivity2.getViewModel(), composer2, 0);
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
                        ComposerKt.traceEventStart(485212172, i, -1, "com.stripe.android.paymentsheet.PaymentSheetActivity.onCreate.<anonymous> (PaymentSheetActivity.kt:56)");
                    }
                    StripeThemeKt.StripeTheme(null, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-680090078, true, new C01991(PaymentSheetActivity.this), composer, 54), composer, 12582912, 127);
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

    /* renamed from: initializeArgs-d1pmJ48, reason: not valid java name */
    private final Object m8223initializeArgsd1pmJ48() {
        Object objM9118constructorimpl;
        PaymentSheetContractV2.Args starterArgs = getStarterArgs();
        if (starterArgs == null) {
            Result.Companion companion = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(defaultInitializationError()));
        } else {
            try {
                starterArgs.getInitializationMode$paymentsheet_release().validate();
                CommonConfigurationKt.asCommonConfiguration(starterArgs.getConfig$paymentsheet_release()).validate(getViewModel().isLiveModeProvider().invoke().booleanValue());
                PaymentSheetConfigurationKtxKt.parseAppearance(starterArgs.getConfig$paymentsheet_release().getAppearance());
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(starterArgs);
            } catch (IllegalArgumentException e) {
                Result.Companion companion3 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(e));
            }
        }
        setEarlyExitDueToIllegalState(Result.m9124isFailureimpl(objM9118constructorimpl));
        return objM9118constructorimpl;
    }

    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity
    public void setActivityResult(PaymentSheetResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        setResult(-1, new Intent().putExtras(new PaymentSheetContractV2.Result(result).toBundle()));
    }

    private final void finishWithError(Throwable error) {
        if (error == null) {
            error = defaultInitializationError();
        }
        setActivityResult((PaymentSheetResult) new PaymentSheetResult.Failed(error));
        finish();
    }

    private final IllegalArgumentException defaultInitializationError() {
        return new IllegalArgumentException("PaymentSheet started without arguments.");
    }
}
