package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.common.ui.BottomSheetScaffoldKt;
import com.stripe.android.common.ui.ElementsBottomSheetLayoutKt;
import com.stripe.android.paymentsheet.PaymentSheetConfigurationKtxKt;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationContract;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationViewAction;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationViewModel;
import com.stripe.android.paymentsheet.ui.PaymentSheetTopBarKt;
import com.stripe.android.paymentsheet.ui.PaymentSheetTopBarState;
import com.stripe.android.paymentsheet.utils.EdgeToEdgeKt;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt;
import com.stripe.android.uicore.utils.AnimationConstantsKt;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BacsMandateConfirmationActivity.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "starterArgs", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationContract$Args;", "getStarterArgs", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationContract$Args;", "starterArgs$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationViewModel;", "getViewModel", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationViewModel;", "viewModel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "finish", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BacsMandateConfirmationActivity extends AppCompatActivity {
    public static final int $stable = 8;

    /* renamed from: starterArgs$delegate, reason: from kotlin metadata */
    private final Lazy starterArgs = LazyKt.lazy(new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BacsMandateConfirmationActivity.starterArgs_delegate$lambda$0(this.f$0);
        }
    });

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public BacsMandateConfirmationActivity() {
        final BacsMandateConfirmationActivity bacsMandateConfirmationActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(BacsMandateConfirmationViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return bacsMandateConfirmationActivity.getStore();
            }
        }, new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BacsMandateConfirmationActivity.viewModel_delegate$lambda$1(this.f$0);
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? bacsMandateConfirmationActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    private final BacsMandateConfirmationContract.Args getStarterArgs() {
        return (BacsMandateConfirmationContract.Args) this.starterArgs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BacsMandateConfirmationContract.Args starterArgs_delegate$lambda$0(BacsMandateConfirmationActivity bacsMandateConfirmationActivity) {
        BacsMandateConfirmationContract.Args.Companion companion = BacsMandateConfirmationContract.Args.INSTANCE;
        Intent intent = bacsMandateConfirmationActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        BacsMandateConfirmationContract.Args argsFromIntent = companion.fromIntent(intent);
        if (argsFromIntent != null) {
            return argsFromIntent;
        }
        throw new IllegalStateException("Cannot start Bacs mandate confirmation flow without arguments");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BacsMandateConfirmationViewModel getViewModel() {
        return (BacsMandateConfirmationViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory viewModel_delegate$lambda$1(BacsMandateConfirmationActivity bacsMandateConfirmationActivity) {
        return new BacsMandateConfirmationViewModel.Factory(bacsMandateConfirmationActivity.getStarterArgs());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdgeKt.renderEdgeToEdge(this);
        OnBackPressedDispatcherKt.addCallback$default(getOnBackPressedDispatcher(), null, false, new Function1() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BacsMandateConfirmationActivity.onCreate$lambda$2(this.f$0, (OnBackPressedCallback) obj);
            }
        }, 3, null);
        PaymentSheetConfigurationKtxKt.parseAppearance(getStarterArgs().getAppearance());
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1408942397, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity.onCreate.2

            /* compiled from: BacsMandateConfirmationActivity.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$onCreate$2$1, reason: invalid class name */
            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ BacsMandateConfirmationActivity this$0;

                AnonymousClass1(BacsMandateConfirmationActivity bacsMandateConfirmationActivity) {
                    this.this$0 = bacsMandateConfirmationActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1769676313, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity.onCreate.<anonymous>.<anonymous> (BacsMandateConfirmationActivity.kt:47)");
                        }
                        StripeBottomSheetState stripeBottomSheetStateRememberStripeBottomSheetState = StripeBottomSheetStateKt.rememberStripeBottomSheetState(null, null, composer, 0, 3);
                        composer.startReplaceGroup(-1893484512);
                        boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changedInstance(stripeBottomSheetStateRememberStripeBottomSheetState);
                        BacsMandateConfirmationActivity bacsMandateConfirmationActivity = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = (Function2) new BacsMandateConfirmationActivity$onCreate$2$1$1$1(bacsMandateConfirmationActivity, stripeBottomSheetStateRememberStripeBottomSheetState, null);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        EffectsKt.LaunchedEffect(stripeBottomSheetStateRememberStripeBottomSheetState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer, StripeBottomSheetState.$stable);
                        composer.startReplaceGroup(-1893468780);
                        boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                        final BacsMandateConfirmationActivity bacsMandateConfirmationActivity2 = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$onCreate$2$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return BacsMandateConfirmationActivity.AnonymousClass2.AnonymousClass1.invoke$lambda$2$lambda$1(bacsMandateConfirmationActivity2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        final BacsMandateConfirmationActivity bacsMandateConfirmationActivity3 = this.this$0;
                        ElementsBottomSheetLayoutKt.m7218ElementsBottomSheetLayoutTN_CM5M(stripeBottomSheetStateRememberStripeBottomSheetState, null, 0.0f, (Function0) objRememberedValue2, ComposableLambdaKt.rememberComposableLambda(-643028593, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity.onCreate.2.1.3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* compiled from: BacsMandateConfirmationActivity.kt */
                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$onCreate$2$1$3$1, reason: invalid class name and collision with other inner class name */
                            static final class C02071 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ BacsMandateConfirmationActivity this$0;

                                C02071(BacsMandateConfirmationActivity bacsMandateConfirmationActivity) {
                                    this.this$0 = bacsMandateConfirmationActivity;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer, int i) {
                                    if ((i & 3) != 2 || !composer.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1765080658, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BacsMandateConfirmationActivity.kt:66)");
                                        }
                                        composer.startReplaceGroup(-637932825);
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$onCreate$2$1$3$1$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        PaymentSheetTopBarState paymentSheetTopBarState = new PaymentSheetTopBarState(false, false, false, (Function0) objRememberedValue);
                                        composer.startReplaceGroup(-637926378);
                                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                                        final BacsMandateConfirmationActivity bacsMandateConfirmationActivity = this.this$0;
                                        Object objRememberedValue2 = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$onCreate$2$1$3$1$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return BacsMandateConfirmationActivity.AnonymousClass2.AnonymousClass1.AnonymousClass3.C02071.invoke$lambda$3$lambda$2(bacsMandateConfirmationActivity);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer.endReplaceGroup();
                                        PaymentSheetTopBarKt.m8492PaymentSheetTopBarFJfuzF0(paymentSheetTopBarState, false, true, (Function0) objRememberedValue2, 0.0f, composer, 432, 16);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer.skipToGroupEnd();
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$3$lambda$2(BacsMandateConfirmationActivity bacsMandateConfirmationActivity) {
                                    bacsMandateConfirmationActivity.getViewModel().handleViewAction(BacsMandateConfirmationViewAction.OnBackPressed.INSTANCE);
                                    return Unit.INSTANCE;
                                }
                            }

                            public final void invoke(Composer composer2, int i2) {
                                if ((i2 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-643028593, i2, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (BacsMandateConfirmationActivity.kt:64)");
                                    }
                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1765080658, true, new C02071(bacsMandateConfirmationActivity3), composer2, 54);
                                    final BacsMandateConfirmationActivity bacsMandateConfirmationActivity4 = bacsMandateConfirmationActivity3;
                                    BottomSheetScaffoldKt.BottomSheetScaffold(composableLambdaRememberComposableLambda, ComposableLambdaKt.rememberComposableLambda(2109767693, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity.onCreate.2.1.3.2
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
                                                ComposerKt.traceEventStart(2109767693, i3, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BacsMandateConfirmationActivity.kt:81)");
                                            }
                                            BacsMandateConfirmationFormKt.BacsMandateConfirmationFormScreen(bacsMandateConfirmationActivity4.getViewModel(), composer3, 0, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer2, 54), null, null, composer2, 54, 12);
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
                public static final Unit invoke$lambda$2$lambda$1(BacsMandateConfirmationActivity bacsMandateConfirmationActivity) {
                    bacsMandateConfirmationActivity.getViewModel().handleViewAction(BacsMandateConfirmationViewAction.OnBackPressed.INSTANCE);
                    return Unit.INSTANCE;
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
                        ComposerKt.traceEventStart(1408942397, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity.onCreate.<anonymous> (BacsMandateConfirmationActivity.kt:46)");
                    }
                    StripeThemeKt.StripeTheme(null, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1769676313, true, new AnonymousClass1(BacsMandateConfirmationActivity.this), composer, 54), composer, 12582912, 127);
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
    public static final Unit onCreate$lambda$2(BacsMandateConfirmationActivity bacsMandateConfirmationActivity, OnBackPressedCallback addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        bacsMandateConfirmationActivity.getViewModel().handleViewAction(BacsMandateConfirmationViewAction.OnBackPressed.INSTANCE);
        return Unit.INSTANCE;
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        AnimationConstantsKt.fadeOut(this);
    }
}
