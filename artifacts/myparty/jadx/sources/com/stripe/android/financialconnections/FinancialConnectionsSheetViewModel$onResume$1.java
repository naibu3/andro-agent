package com.stripe.android.financialconnections;

import com.stripe.android.financialconnections.FinancialConnectionsSheetState;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: FinancialConnectionsSheetViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$onResume$1", f = "FinancialConnectionsSheetViewModel.kt", i = {0}, l = {628}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class FinancialConnectionsSheetViewModel$onResume$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ FinancialConnectionsSheetViewModel this$0;

    /* compiled from: FinancialConnectionsSheetViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FinancialConnectionsSheetState.AuthFlowStatus.values().length];
            try {
                iArr[FinancialConnectionsSheetState.AuthFlowStatus.ON_EXTERNAL_ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FinancialConnectionsSheetState.AuthFlowStatus.INTERMEDIATE_DEEPLINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FinancialConnectionsSheetState.AuthFlowStatus.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FinancialConnectionsSheetViewModel$onResume$1(FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel, Continuation<? super FinancialConnectionsSheetViewModel$onResume$1> continuation) {
        super(2, continuation);
        this.this$0 = financialConnectionsSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FinancialConnectionsSheetViewModel$onResume$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FinancialConnectionsSheetViewModel$onResume$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutex = this.this$0.mutex;
            FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel2 = this.this$0;
            this.L$0 = mutex;
            this.L$1 = financialConnectionsSheetViewModel2;
            this.label = 1;
            if (mutex.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            financialConnectionsSheetViewModel = financialConnectionsSheetViewModel2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel3 = (FinancialConnectionsSheetViewModel) this.L$1;
            mutex = (Mutex) this.L$0;
            ResultKt.throwOnFailure(obj);
            financialConnectionsSheetViewModel = financialConnectionsSheetViewModel3;
        }
        try {
            FinancialConnectionsSheetState value = financialConnectionsSheetViewModel.getStateFlow().getValue();
            if (!value.getActivityRecreated()) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[value.getWebAuthFlowStatus().ordinal()];
                if (i2 == 1) {
                    FinancialConnectionsSheetViewModel.finishWithResult$default(financialConnectionsSheetViewModel, FinancialConnectionsSheetActivityResult.Canceled.INSTANCE, false, null, 6, null);
                } else if (i2 == 2) {
                    financialConnectionsSheetViewModel.setState(new Function1() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$onResume$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return FinancialConnectionsSheetViewModel$onResume$1.invokeSuspend$lambda$1$lambda$0((FinancialConnectionsSheetState) obj2);
                        }
                    });
                } else if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            Unit unit = Unit.INSTANCE;
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinancialConnectionsSheetState invokeSuspend$lambda$1$lambda$0(FinancialConnectionsSheetState financialConnectionsSheetState) {
        return FinancialConnectionsSheetState.copy$default(financialConnectionsSheetState, null, false, null, FinancialConnectionsSheetState.AuthFlowStatus.ON_EXTERNAL_ACTIVITY, null, 23, null);
    }
}
