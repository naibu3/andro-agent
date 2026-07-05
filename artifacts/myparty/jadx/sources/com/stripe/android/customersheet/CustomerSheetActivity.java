package com.stripe.android.customersheet;

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
import com.stripe.android.customersheet.CustomerSheetActivity;
import com.stripe.android.customersheet.CustomerSheetContract;
import com.stripe.android.customersheet.CustomerSheetViewAction;
import com.stripe.android.customersheet.CustomerSheetViewModel;
import com.stripe.android.customersheet.InternalCustomerSheetResult;
import com.stripe.android.customersheet.ui.CustomerSheetScreenKt;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CustomerSheetActivity.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0018H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f²\u0006\f\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u008a\u0084\u0002"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheetActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", CardScanActivity.ARGS, "Lcom/stripe/android/customersheet/CustomerSheetContract$Args;", "getArgs", "()Lcom/stripe/android/customersheet/CustomerSheetContract$Args;", "args$delegate", "Lkotlin/Lazy;", "viewModelFactoryProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactoryProducer$paymentsheet_release$annotations", "getViewModelFactoryProducer$paymentsheet_release", "()Lkotlin/jvm/functions/Function0;", "setViewModelFactoryProducer$paymentsheet_release", "(Lkotlin/jvm/functions/Function0;)V", "viewModel", "Lcom/stripe/android/customersheet/CustomerSheetViewModel;", "getViewModel", "()Lcom/stripe/android/customersheet/CustomerSheetViewModel;", "viewModel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "finishWithResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/customersheet/InternalCustomerSheetResult;", "finish", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomerSheetActivity extends AppCompatActivity {
    public static final int $stable = 8;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final Lazy args = LazyKt.lazy(new Function0() { // from class: com.stripe.android.customersheet.CustomerSheetActivity$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CustomerSheetActivity.args_delegate$lambda$0(this.f$0);
        }
    });
    private Function0<? extends ViewModelProvider.Factory> viewModelFactoryProducer = new Function0() { // from class: com.stripe.android.customersheet.CustomerSheetActivity$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CustomerSheetActivity.viewModelFactoryProducer$lambda$1(this.f$0);
        }
    };

    public static /* synthetic */ void getViewModelFactoryProducer$paymentsheet_release$annotations() {
    }

    public CustomerSheetActivity() {
        final CustomerSheetActivity customerSheetActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(CustomerSheetViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.customersheet.CustomerSheetActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return customerSheetActivity.getStore();
            }
        }, new Function0() { // from class: com.stripe.android.customersheet.CustomerSheetActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CustomerSheetActivity.viewModel_delegate$lambda$2(this.f$0);
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.customersheet.CustomerSheetActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? customerSheetActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    private final CustomerSheetContract.Args getArgs() {
        return (CustomerSheetContract.Args) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomerSheetContract.Args args_delegate$lambda$0(CustomerSheetActivity customerSheetActivity) {
        CustomerSheetContract.Args.Companion companion = CustomerSheetContract.Args.INSTANCE;
        Intent intent = customerSheetActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return companion.fromIntent(intent);
    }

    public final Function0<ViewModelProvider.Factory> getViewModelFactoryProducer$paymentsheet_release() {
        return this.viewModelFactoryProducer;
    }

    public final void setViewModelFactoryProducer$paymentsheet_release(Function0<? extends ViewModelProvider.Factory> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.viewModelFactoryProducer = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomerSheetViewModel.Factory viewModelFactoryProducer$lambda$1(CustomerSheetActivity customerSheetActivity) {
        CustomerSheetContract.Args args = customerSheetActivity.getArgs();
        Intrinsics.checkNotNull(args);
        return new CustomerSheetViewModel.Factory(args);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomerSheetViewModel getViewModel() {
        return (CustomerSheetViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory viewModel_delegate$lambda$2(CustomerSheetActivity customerSheetActivity) {
        return customerSheetActivity.viewModelFactoryProducer.invoke();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        if (getArgs() == null) {
            finishWithResult(new InternalCustomerSheetResult.Error(new IllegalStateException("No CustomerSheetContract.Args provided")));
        } else {
            getViewModel().registerFromActivity(this, this);
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(602239828, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.customersheet.CustomerSheetActivity.onCreate.1

                /* compiled from: CustomerSheetActivity.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.stripe.android.customersheet.CustomerSheetActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
                static final class C01471 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ CustomerSheetActivity this$0;

                    C01471(CustomerSheetActivity customerSheetActivity) {
                        this.this$0 = customerSheetActivity;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) != 2 || !composer.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1303563646, i, -1, "com.stripe.android.customersheet.CustomerSheetActivity.onCreate.<anonymous>.<anonymous> (CustomerSheetActivity.kt:69)");
                            }
                            composer.startReplaceGroup(-1294835918);
                            boolean zChangedInstance = composer.changedInstance(this.this$0);
                            final CustomerSheetActivity customerSheetActivity = this.this$0;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.stripe.android.customersheet.CustomerSheetActivity$onCreate$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return Boolean.valueOf(CustomerSheetActivity.AnonymousClass1.C01471.invoke$lambda$1$lambda$0(customerSheetActivity, (ModalBottomSheetValue) obj));
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            StripeBottomSheetState stripeBottomSheetStateRememberStripeBottomSheetState = StripeBottomSheetStateKt.rememberStripeBottomSheetState(null, (Function1) objRememberedValue, composer, 0, 1);
                            State stateCollectAsState = StateFlowsComposeKt.collectAsState(this.this$0.getViewModel().getResult(), null, composer, 0, 1);
                            InternalCustomerSheetResult internalCustomerSheetResultInvoke$lambda$2 = invoke$lambda$2(stateCollectAsState);
                            composer.startReplaceGroup(-1294823987);
                            boolean zChanged = composer.changed(stateCollectAsState) | composer.changedInstance(stripeBottomSheetStateRememberStripeBottomSheetState) | composer.changedInstance(this.this$0);
                            CustomerSheetActivity customerSheetActivity2 = this.this$0;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = (Function2) new CustomerSheetActivity$onCreate$1$1$1$1(stateCollectAsState, stripeBottomSheetStateRememberStripeBottomSheetState, customerSheetActivity2, null);
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            EffectsKt.LaunchedEffect(internalCustomerSheetResultInvoke$lambda$2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 0);
                            composer.startReplaceGroup(-1294817280);
                            boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                            final CustomerSheetActivity customerSheetActivity3 = this.this$0;
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.stripe.android.customersheet.CustomerSheetActivity$onCreate$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CustomerSheetActivity.AnonymousClass1.C01471.invoke$lambda$5$lambda$4(customerSheetActivity3);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            composer.endReplaceGroup();
                            BackHandlerKt.BackHandler(false, (Function0) objRememberedValue3, composer, 0, 1);
                            composer.startReplaceGroup(-1294809982);
                            boolean zChangedInstance3 = composer.changedInstance(this.this$0);
                            final CustomerSheetActivity customerSheetActivity4 = this.this$0;
                            Object objRememberedValue4 = composer.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function0() { // from class: com.stripe.android.customersheet.CustomerSheetActivity$onCreate$1$1$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CustomerSheetActivity.AnonymousClass1.C01471.invoke$lambda$7$lambda$6(customerSheetActivity4);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue4);
                            }
                            composer.endReplaceGroup();
                            final CustomerSheetActivity customerSheetActivity5 = this.this$0;
                            ElementsBottomSheetLayoutKt.m7218ElementsBottomSheetLayoutTN_CM5M(stripeBottomSheetStateRememberStripeBottomSheetState, null, 0.0f, (Function0) objRememberedValue4, ComposableLambdaKt.rememberComposableLambda(1179106086, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.customersheet.CustomerSheetActivity.onCreate.1.1.4
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
                                        ComposerKt.traceEventStart(1179106086, i2, -1, "com.stripe.android.customersheet.CustomerSheetActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CustomerSheetActivity.kt:96)");
                                    }
                                    CustomerSheetScreenKt.CustomerSheetScreen(customerSheetActivity5.getViewModel(), composer2, 0);
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
                    public static final boolean invoke$lambda$1$lambda$0(CustomerSheetActivity customerSheetActivity, ModalBottomSheetValue it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it == ModalBottomSheetValue.Hidden) {
                            return customerSheetActivity.getViewModel().bottomSheetConfirmStateChange();
                        }
                        return true;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$4(CustomerSheetActivity customerSheetActivity) {
                        customerSheetActivity.getViewModel().handleViewAction(CustomerSheetViewAction.OnBackPressed.INSTANCE);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$7$lambda$6(CustomerSheetActivity customerSheetActivity) {
                        customerSheetActivity.getViewModel().handleViewAction(CustomerSheetViewAction.OnDismissed.INSTANCE);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final InternalCustomerSheetResult invoke$lambda$2(State<? extends InternalCustomerSheetResult> state) {
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
                            ComposerKt.traceEventStart(602239828, i, -1, "com.stripe.android.customersheet.CustomerSheetActivity.onCreate.<anonymous> (CustomerSheetActivity.kt:68)");
                        }
                        StripeThemeKt.StripeTheme(null, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1303563646, true, new C01471(CustomerSheetActivity.this), composer, 54), composer, 12582912, 127);
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(InternalCustomerSheetResult result) {
        setResult(-1, new Intent().putExtras(result.toBundle$paymentsheet_release()));
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        AnimationConstantsKt.fadeOut(this);
    }
}
