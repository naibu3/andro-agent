package com.stripe.android.financialconnections.presentation;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import defpackage.FinancialConnectionsGenericInfoScreen;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: FinancialConnectionsViewModel.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\b!\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0014Jv\u0010\u0015\u001a\u00020\u0016\"\n\b\u0001\u0010\u0017*\u0004\u0018\u00010\u0018*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00192\u001c\b\u0002\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u001d\u0018\u00010\u001c2#\u0010\u001e\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u001d\u0012\u0004\u0012\u00028\u00000\u001f¢\u0006\u0002\b H\u0014¢\u0006\u0002\u0010!J+\u0010\"\u001a\u00020\u00132!\u0010#\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00130\u0019H\u0004Jy\u0010&\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u00172\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u001d0\u001c2$\b\u0002\u0010(\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u001f2$\b\u0002\u0010)\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u001fH\u0014¢\u0006\u0002\u0010+J!\u0010,\u001a\u00020\u00132\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0002\b H\u0004R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006-"}, d2 = {"Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;", ExifInterface.LATITUDE_SOUTH, "Landroidx/lifecycle/ViewModel;", "initialState", "nativeAuthFlowCoordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "<init>", "(Ljava/lang/Object;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V", "_stateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "stateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "updateTopAppBar", "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;", ServerProtocol.DIALOG_PARAM_STATE, "(Ljava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;", "updateHostWithTopAppBarState", "", "(Ljava/lang/Object;)V", "execute", "Lkotlinx/coroutines/Job;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "retainValue", "Lkotlin/reflect/KProperty1;", "Lcom/stripe/android/financialconnections/presentation/Async;", "reducer", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "withState", "action", "Lkotlin/ParameterName;", "name", "onAsync", "prop", "onSuccess", "onFail", "", "(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "setState", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class FinancialConnectionsViewModel<S> extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<S> _stateFlow;
    private final NativeAuthFlowCoordinator nativeAuthFlowCoordinator;
    private final StateFlow<S> stateFlow;

    public abstract TopAppBarStateUpdate updateTopAppBar(S state);

    public FinancialConnectionsViewModel(S s, NativeAuthFlowCoordinator nativeAuthFlowCoordinator) {
        Intrinsics.checkNotNullParameter(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        this.nativeAuthFlowCoordinator = nativeAuthFlowCoordinator;
        MutableStateFlow<S> MutableStateFlow = StateFlowKt.MutableStateFlow(s);
        this._stateFlow = MutableStateFlow;
        this.stateFlow = FlowKt.asStateFlow(MutableStateFlow);
        updateHostWithTopAppBarState(s);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(this, null), 3, null);
    }

    public final StateFlow<S> getStateFlow() {
        return this.stateFlow;
    }

    /* compiled from: FinancialConnectionsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$1", f = "FinancialConnectionsViewModel.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ FinancialConnectionsViewModel<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FinancialConnectionsViewModel<S> financialConnectionsViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = financialConnectionsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: FinancialConnectionsViewModel.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$1$1, reason: invalid class name and collision with other inner class name */
        /* synthetic */ class C01581 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ FinancialConnectionsViewModel<S> $tmp0;

            C01581(FinancialConnectionsViewModel<S> financialConnectionsViewModel) {
                this.$tmp0 = financialConnectionsViewModel;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, FinancialConnectionsViewModel.class, "updateHostWithTopAppBarState", "updateHostWithTopAppBarState(Ljava/lang/Object;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(S s, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$updateHostWithTopAppBarState = AnonymousClass1.invokeSuspend$updateHostWithTopAppBarState(this.$tmp0, s, continuation);
                return objInvokeSuspend$updateHostWithTopAppBarState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$updateHostWithTopAppBarState : Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (this.this$0.getStateFlow().collect(new C01581(this.this$0), this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$updateHostWithTopAppBarState(FinancialConnectionsViewModel financialConnectionsViewModel, Object obj, Continuation continuation) {
            financialConnectionsViewModel.updateHostWithTopAppBarState(obj);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: FinancialConnectionsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$updateHostWithTopAppBarState$1", f = "FinancialConnectionsViewModel.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$updateHostWithTopAppBarState$1, reason: invalid class name and case insensitive filesystem */
    static final class C09911 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ S $state;
        int label;
        final /* synthetic */ FinancialConnectionsViewModel<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09911(FinancialConnectionsViewModel<S> financialConnectionsViewModel, S s, Continuation<? super C09911> continuation) {
            super(2, continuation);
            this.this$0 = financialConnectionsViewModel;
            this.$state = s;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C09911(this.this$0, this.$state, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TopAppBarStateUpdate topAppBarStateUpdateUpdateTopAppBar = this.this$0.updateTopAppBar(this.$state);
                if (topAppBarStateUpdateUpdateTopAppBar == null) {
                    return Unit.INSTANCE;
                }
                this.label = 1;
                if (((FinancialConnectionsViewModel) this.this$0).nativeAuthFlowCoordinator.invoke().emit(new NativeAuthFlowCoordinator.Message.UpdateTopAppBar(topAppBarStateUpdateUpdateTopAppBar), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateHostWithTopAppBarState(S state) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C09911(this, state, null), 3, null);
    }

    public static /* synthetic */ Job execute$default(FinancialConnectionsViewModel financialConnectionsViewModel, Function1 function1, KProperty1 kProperty1, Function2 function2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
        }
        if ((i & 1) != 0) {
            kProperty1 = null;
        }
        return financialConnectionsViewModel.execute(function1, kProperty1, function2);
    }

    /* compiled from: FinancialConnectionsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$execute$1", f = "FinancialConnectionsViewModel.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$execute$1, reason: invalid class name and case insensitive filesystem */
    static final class C09891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<S, Async<? extends T>, S> $reducer;
        final /* synthetic */ KProperty1<S, Async<T>> $retainValue;
        final /* synthetic */ Function1<Continuation<? super T>, Object> $this_execute;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FinancialConnectionsViewModel<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C09891(FinancialConnectionsViewModel<S> financialConnectionsViewModel, Function2<? super S, ? super Async<? extends T>, ? extends S> function2, KProperty1<S, ? extends Async<? extends T>> kProperty1, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super C09891> continuation) {
            super(2, continuation);
            this.this$0 = financialConnectionsViewModel;
            this.$reducer = function2;
            this.$retainValue = kProperty1;
            this.$this_execute = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C09891 c09891 = new C09891(this.this$0, this.$reducer, this.$retainValue, this.$this_execute, continuation);
            c09891.L$0 = obj;
            return c09891;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final Object objM9118constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FinancialConnectionsViewModel<S> financialConnectionsViewModel = this.this$0;
                    final Function2<S, Async<? extends T>, S> function2 = this.$reducer;
                    final KProperty1<S, Async<T>> kProperty1 = this.$retainValue;
                    financialConnectionsViewModel.setState(new Function1() { // from class: com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$execute$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return FinancialConnectionsViewModel.C09891.invokeSuspend$lambda$0(function2, kProperty1, obj2);
                        }
                    });
                    Function1<Continuation<? super T>, Object> function1 = this.$this_execute;
                    Result.Companion companion = Result.INSTANCE;
                    this.label = 1;
                    obj = function1.invoke(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM9118constructorimpl = Result.m9118constructorimpl(obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            FinancialConnectionsViewModel<S> financialConnectionsViewModel2 = this.this$0;
            final Function2<S, Async<? extends T>, S> function22 = this.$reducer;
            final Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl == null) {
                financialConnectionsViewModel2.setState(new Function1() { // from class: com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$execute$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return FinancialConnectionsViewModel.C09891.invokeSuspend$lambda$3$lambda$2(function22, objM9118constructorimpl, obj2);
                    }
                });
            } else {
                financialConnectionsViewModel2.setState(new Function1() { // from class: com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$execute$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return FinancialConnectionsViewModel.C09891.invokeSuspend$lambda$5$lambda$4(function22, thM9121exceptionOrNullimpl, obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invokeSuspend$lambda$0(Function2 function2, KProperty1 kProperty1, Object obj) {
            Async async;
            return function2.invoke(obj, new Async.Loading((kProperty1 == null || (async = (Async) kProperty1.get(obj)) == null) ? null : async.invoke()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invokeSuspend$lambda$3$lambda$2(Function2 function2, Object obj, Object obj2) {
            return function2.invoke(obj2, new Async.Success(obj));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invokeSuspend$lambda$5$lambda$4(Function2 function2, Throwable th, Object obj) {
            return function2.invoke(obj, new Async.Fail(th));
        }
    }

    protected <T> Job execute(Function1<? super Continuation<? super T>, ? extends Object> function1, KProperty1<S, ? extends Async<? extends T>> kProperty1, Function2<? super S, ? super Async<? extends T>, ? extends S> reducer) {
        Intrinsics.checkNotNullParameter(function1, "<this>");
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C09891(this, reducer, kProperty1, function1, null), 3, null);
    }

    protected final void withState(Function1<? super S, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        action.invoke(this.stateFlow.getValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FinancialConnectionsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$onAsync$1", f = "FinancialConnectionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$onAsync$1, reason: invalid class name and case insensitive filesystem */
    protected static final class C09901<T> extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {
        int label;

        C09901(Continuation<? super C09901> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C09901(continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return invoke2((C09901<T>) obj, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(T t, Continuation<? super Unit> continuation) {
            return ((C09901) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FinancialConnectionsViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$onAsync$2", f = "FinancialConnectionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$onAsync$2, reason: invalid class name */
    protected static final class AnonymousClass2 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onAsync$default(FinancialConnectionsViewModel financialConnectionsViewModel, KProperty1 kProperty1, Function2 function2, Function2 function22, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAsync");
        }
        if ((i & 2) != 0) {
            function2 = new C09901(null);
        }
        if ((i & 4) != 0) {
            function22 = new AnonymousClass2(null);
        }
        financialConnectionsViewModel.onAsync(kProperty1, function2, function22);
    }

    /* compiled from: FinancialConnectionsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$onAsync$3", f = "FinancialConnectionsViewModel.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$onAsync$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<Throwable, Continuation<? super Unit>, Object> $onFail;
        final /* synthetic */ Function2<T, Continuation<? super Unit>, Object> $onSuccess;
        final /* synthetic */ KProperty1<S, Async<T>> $prop;
        int label;
        final /* synthetic */ FinancialConnectionsViewModel<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(FinancialConnectionsViewModel<S> financialConnectionsViewModel, KProperty1<S, ? extends Async<? extends T>> kProperty1, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Function2<? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function22, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = financialConnectionsViewModel;
            this.$prop = kProperty1;
            this.$onSuccess = function2;
            this.$onFail = function22;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$prop, this.$onSuccess, this.$onFail, continuation);
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
                final StateFlow<S> stateFlow = this.this$0.getStateFlow();
                final KProperty1<S, Async<T>> kProperty1 = this.$prop;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Async<? extends T>>() { // from class: com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$onAsync$3$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$onAsync$3$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ KProperty1 $prop$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$onAsync$3$invokeSuspend$$inlined$map$1$2", f = "FinancialConnectionsViewModel.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                        /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$onAsync$3$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, KProperty1 kProperty1) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$prop$inlined = kProperty1;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label -= Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = anonymousClass1.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Object obj3 = this.$prop$inlined.get(obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector, kProperty1), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                final Function2<T, Continuation<? super Unit>, Object> function2 = this.$onSuccess;
                final Function2<Throwable, Continuation<? super Unit>, Object> function22 = this.$onFail;
                this.label = 1;
                if (flowDistinctUntilChanged.collect(new FlowCollector() { // from class: com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel.onAsync.3.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Async) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Async<? extends T> async, Continuation<? super Unit> continuation) {
                        if (async instanceof Async.Success) {
                            Object objInvoke = function2.invoke(((Async.Success) async).invoke(), continuation);
                            return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
                        }
                        if (async instanceof Async.Fail) {
                            Object objInvoke2 = function22.invoke(((Async.Fail) async).getError(), continuation);
                            return objInvoke2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke2 : Unit.INSTANCE;
                        }
                        if (!(async instanceof Async.Loading) && !Intrinsics.areEqual(async, Async.Uninitialized.INSTANCE)) {
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
            return Unit.INSTANCE;
        }
    }

    protected <T> void onAsync(KProperty1<S, ? extends Async<? extends T>> prop, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> onSuccess, Function2<? super Throwable, ? super Continuation<? super Unit>, ? extends Object> onFail) {
        Intrinsics.checkNotNullParameter(prop, "prop");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass3(this, prop, onSuccess, onFail, null), 3, null);
    }

    protected final void setState(Function1<? super S, ? extends S> reducer) {
        FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen;
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        MutableStateFlow<S> mutableStateFlow = this._stateFlow;
        do {
            financialConnectionsGenericInfoScreen = (Object) mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(financialConnectionsGenericInfoScreen, reducer.invoke(financialConnectionsGenericInfoScreen)));
    }
}
