package com.stripe.android.payments.bankaccount.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetInstantDebitsResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetLauncher;
import com.stripe.android.payments.bankaccount.domain.BuildFinancialConnectionsLauncher;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResultInternal;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewEffect;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel;
import com.stripe.android.payments.financialconnections.FinancialConnectionsAvailability;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: CollectBankAccountActivity.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\f\u0010\u0015\u001a\u00020\u0012*\u00020\u0016H\u0002J\f\u0010\u0015\u001a\u00020\u0012*\u00020\u0017H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "starterArgs", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "getStarterArgs", "()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "starterArgs$delegate", "Lkotlin/Lazy;", "financialConnectionsLauncher", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;", "viewModel", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;", "getViewModel", "()Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;", "viewModel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "launch", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$FinishWithResult;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CollectBankAccountActivity extends AppCompatActivity {
    public static final int $stable = 8;
    private FinancialConnectionsSheetLauncher financialConnectionsLauncher;

    /* renamed from: starterArgs$delegate, reason: from kotlin metadata */
    private final Lazy starterArgs = LazyKt.lazy(new Function0() { // from class: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CollectBankAccountActivity.starterArgs_delegate$lambda$0(this.f$0);
        }
    });

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public CollectBankAccountActivity() {
        final CollectBankAccountActivity collectBankAccountActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(CollectBankAccountViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return collectBankAccountActivity.getStore();
            }
        }, new Function0() { // from class: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CollectBankAccountActivity.viewModel_delegate$lambda$2(this.f$0);
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? collectBankAccountActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    private final CollectBankAccountContract.Args getStarterArgs() {
        return (CollectBankAccountContract.Args) this.starterArgs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CollectBankAccountContract.Args starterArgs_delegate$lambda$0(CollectBankAccountActivity collectBankAccountActivity) {
        CollectBankAccountContract.Args.Companion companion = CollectBankAccountContract.Args.INSTANCE;
        Intent intent = collectBankAccountActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return companion.fromIntent(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CollectBankAccountViewModel getViewModel() {
        return (CollectBankAccountViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory viewModel_delegate$lambda$2(final CollectBankAccountActivity collectBankAccountActivity) {
        return new CollectBankAccountViewModel.Factory(new Function0() { // from class: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CollectBankAccountActivity.viewModel_delegate$lambda$2$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CollectBankAccountContract.Args viewModel_delegate$lambda$2$lambda$1(CollectBankAccountActivity collectBankAccountActivity) {
        CollectBankAccountContract.Args starterArgs = collectBankAccountActivity.getStarterArgs();
        if (starterArgs != null) {
            return starterArgs;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CollectBankAccountContract.Args starterArgs = getStarterArgs();
        if ((starterArgs != null ? starterArgs.getConfiguration() : null) == null) {
            launch(new CollectBankAccountViewEffect.FinishWithResult(new CollectBankAccountResultInternal.Failed(new IllegalStateException("Configuration not provided"))));
            return;
        }
        CollectBankAccountContract.Args starterArgs2 = getStarterArgs();
        if (starterArgs2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        FinancialConnectionsAvailability financialConnectionsAvailability = starterArgs2.getFinancialConnectionsAvailability();
        if (financialConnectionsAvailability == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        this.financialConnectionsLauncher = BuildFinancialConnectionsLauncher.INSTANCE.invoke(this, starterArgs2.getConfiguration(), financialConnectionsAvailability, new AnonymousClass1(getViewModel()), new AnonymousClass2(getViewModel()));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new AnonymousClass3(null));
    }

    /* compiled from: CollectBankAccountActivity.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$onCreate$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<FinancialConnectionsSheetInstantDebitsResult, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, CollectBankAccountViewModel.class, "onConnectionsForInstantDebitsResult", "onConnectionsForInstantDebitsResult(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FinancialConnectionsSheetInstantDebitsResult financialConnectionsSheetInstantDebitsResult) {
            invoke2(financialConnectionsSheetInstantDebitsResult);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FinancialConnectionsSheetInstantDebitsResult p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CollectBankAccountViewModel) this.receiver).onConnectionsForInstantDebitsResult(p0);
        }
    }

    /* compiled from: CollectBankAccountActivity.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$onCreate$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<FinancialConnectionsSheetResult, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, CollectBankAccountViewModel.class, "onConnectionsForACHResult", "onConnectionsForACHResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FinancialConnectionsSheetResult financialConnectionsSheetResult) {
            invoke2(financialConnectionsSheetResult);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FinancialConnectionsSheetResult p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CollectBankAccountViewModel) this.receiver).onConnectionsForACHResult(p0);
        }
    }

    /* compiled from: CollectBankAccountActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$onCreate$3", f = "CollectBankAccountActivity.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$onCreate$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CollectBankAccountActivity.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<CollectBankAccountViewEffect> viewEffect = CollectBankAccountActivity.this.getViewModel().getViewEffect();
                final CollectBankAccountActivity collectBankAccountActivity = CollectBankAccountActivity.this;
                this.label = 1;
                if (viewEffect.collect(new FlowCollector() { // from class: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity.onCreate.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((CollectBankAccountViewEffect) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(CollectBankAccountViewEffect collectBankAccountViewEffect, Continuation<? super Unit> continuation) {
                        if (collectBankAccountViewEffect instanceof CollectBankAccountViewEffect.OpenConnectionsFlow) {
                            collectBankAccountActivity.launch((CollectBankAccountViewEffect.OpenConnectionsFlow) collectBankAccountViewEffect);
                        } else if (collectBankAccountViewEffect instanceof CollectBankAccountViewEffect.FinishWithResult) {
                            collectBankAccountActivity.launch((CollectBankAccountViewEffect.FinishWithResult) collectBankAccountViewEffect);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launch(CollectBankAccountViewEffect.OpenConnectionsFlow openConnectionsFlow) {
        FinancialConnectionsSheetLauncher financialConnectionsSheetLauncher = this.financialConnectionsLauncher;
        if (financialConnectionsSheetLauncher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("financialConnectionsLauncher");
            financialConnectionsSheetLauncher = null;
        }
        financialConnectionsSheetLauncher.present(new FinancialConnectionsSheetConfiguration(openConnectionsFlow.getFinancialConnectionsSessionSecret(), openConnectionsFlow.getPublishableKey(), openConnectionsFlow.getStripeAccountId()), openConnectionsFlow.getElementsSessionContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launch(CollectBankAccountViewEffect.FinishWithResult finishWithResult) {
        setResult(-1, new Intent().putExtras(new CollectBankAccountContract.Result(finishWithResult.getResult()).toBundle()));
        finish();
    }
}
