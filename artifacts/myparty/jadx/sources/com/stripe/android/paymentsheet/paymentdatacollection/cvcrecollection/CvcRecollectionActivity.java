package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.common.ui.ElementsBottomSheetLayoutKt;
import com.stripe.android.paymentsheet.PaymentSheetConfigurationKtxKt;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionContract;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionViewAction;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionViewModel;
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
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CvcRecollectionActivity.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", CardScanActivity.ARGS, "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionContract$Args;", "getArgs", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionContract$Args;", "args$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionViewModel;", "getViewModel", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionViewModel;", "viewModel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "finish", "paymentsheet_release", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionViewState;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CvcRecollectionActivity extends AppCompatActivity {
    public static final int $stable = 8;

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final Lazy args = LazyKt.lazy(new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CvcRecollectionActivity.args_delegate$lambda$0(this.f$0);
        }
    });

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public CvcRecollectionActivity() {
        final CvcRecollectionActivity cvcRecollectionActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(CvcRecollectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return cvcRecollectionActivity.getStore();
            }
        }, new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CvcRecollectionActivity.viewModel_delegate$lambda$1(this.f$0);
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? cvcRecollectionActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    private final CvcRecollectionContract.Args getArgs() {
        return (CvcRecollectionContract.Args) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CvcRecollectionContract.Args args_delegate$lambda$0(CvcRecollectionActivity cvcRecollectionActivity) {
        CvcRecollectionContract.Args.Companion companion = CvcRecollectionContract.Args.INSTANCE;
        Intent intent = cvcRecollectionActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        CvcRecollectionContract.Args argsFromIntent = companion.fromIntent(intent);
        if (argsFromIntent != null) {
            return argsFromIntent;
        }
        throw new IllegalStateException("Cannot start CVC Recollection flow without args");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CvcRecollectionViewModel getViewModel() {
        return (CvcRecollectionViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory viewModel_delegate$lambda$1(CvcRecollectionActivity cvcRecollectionActivity) {
        return new CvcRecollectionViewModel.Factory(cvcRecollectionActivity.getArgs());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PaymentSheetConfigurationKtxKt.parseAppearance(getArgs().getAppearance());
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1759306475, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity.onCreate.1

            /* compiled from: CvcRecollectionActivity.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
            static final class C02091 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ CvcRecollectionActivity this$0;

                C02091(CvcRecollectionActivity cvcRecollectionActivity) {
                    this.this$0 = cvcRecollectionActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1258848255, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity.onCreate.<anonymous>.<anonymous> (CvcRecollectionActivity.kt:36)");
                        }
                        StripeBottomSheetState stripeBottomSheetStateRememberStripeBottomSheetState = StripeBottomSheetStateKt.rememberStripeBottomSheetState(null, null, composer, 0, 3);
                        final State stateCollectAsState = StateFlowsComposeKt.collectAsState(this.this$0.getViewModel().getViewState(), null, composer, 0, 1);
                        composer.startReplaceGroup(-1122425641);
                        boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changedInstance(stripeBottomSheetStateRememberStripeBottomSheetState);
                        CvcRecollectionActivity cvcRecollectionActivity = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = (Function2) new CvcRecollectionActivity$onCreate$1$1$1$1(cvcRecollectionActivity, stripeBottomSheetStateRememberStripeBottomSheetState, null);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        EffectsKt.LaunchedEffect(stripeBottomSheetStateRememberStripeBottomSheetState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer, StripeBottomSheetState.$stable);
                        composer.startReplaceGroup(-1122410087);
                        boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                        final CvcRecollectionActivity cvcRecollectionActivity2 = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity$onCreate$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CvcRecollectionActivity.AnonymousClass1.C02091.invoke$lambda$3$lambda$2(cvcRecollectionActivity2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        final CvcRecollectionActivity cvcRecollectionActivity3 = this.this$0;
                        ElementsBottomSheetLayoutKt.m7218ElementsBottomSheetLayoutTN_CM5M(stripeBottomSheetStateRememberStripeBottomSheetState, null, 0.0f, (Function0) objRememberedValue2, ComposableLambdaKt.rememberComposableLambda(-8646823, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity.onCreate.1.1.3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i2) {
                                if ((i2 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-8646823, i2, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CvcRecollectionActivity.kt:56)");
                                    }
                                    String lastFour = C02091.invoke$lambda$0(stateCollectAsState).getLastFour();
                                    boolean zIsTestMode = C02091.invoke$lambda$0(stateCollectAsState).isTestMode();
                                    CvcState cvcState = C02091.invoke$lambda$0(stateCollectAsState).getCvcState();
                                    CvcRecollectionViewModel viewModel = cvcRecollectionActivity3.getViewModel();
                                    composer2.startReplaceGroup(-32761376);
                                    boolean zChangedInstance3 = composer2.changedInstance(viewModel);
                                    CvcRecollectionActivity$onCreate$1$1$3$1$1 cvcRecollectionActivity$onCreate$1$1$3$1$1RememberedValue = composer2.rememberedValue();
                                    if (zChangedInstance3 || cvcRecollectionActivity$onCreate$1$1$3$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                        cvcRecollectionActivity$onCreate$1$1$3$1$1RememberedValue = new CvcRecollectionActivity$onCreate$1$1$3$1$1(viewModel);
                                        composer2.updateRememberedValue(cvcRecollectionActivity$onCreate$1$1$3$1$1RememberedValue);
                                    }
                                    composer2.endReplaceGroup();
                                    CvcRecollectionScreenKt.CvcRecollectionScreen(lastFour, zIsTestMode, cvcState, (Function1) ((KFunction) cvcRecollectionActivity$onCreate$1$1$3$1$1RememberedValue), composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
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
                public static final Unit invoke$lambda$3$lambda$2(CvcRecollectionActivity cvcRecollectionActivity) {
                    cvcRecollectionActivity.getViewModel().handleViewAction(CvcRecollectionViewAction.OnBackPressed.INSTANCE);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final CvcRecollectionViewState invoke$lambda$0(State<CvcRecollectionViewState> state) {
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
                        ComposerKt.traceEventStart(1759306475, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity.onCreate.<anonymous> (CvcRecollectionActivity.kt:35)");
                    }
                    StripeThemeKt.StripeTheme(null, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1258848255, true, new C02091(CvcRecollectionActivity.this), composer, 54), composer, 12582912, 127);
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

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        AnimationConstantsKt.fadeOut(this);
    }
}
