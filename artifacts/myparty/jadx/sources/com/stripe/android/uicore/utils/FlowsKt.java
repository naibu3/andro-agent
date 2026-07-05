package com.stripe.android.uicore.utils;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Flows.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\\\u0010\u0000\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001H\u0007¨\u0006\t"}, d2 = {"combine", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Triple;", "T1", "T2", "T3", "flow1", "flow2", "flow3", "stripe-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FlowsKt {

    /* JADX INFO: Add missing generic type declarations: [T1, T2, T3] */
    /* compiled from: Flows.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u00032\u0006\u0010\u0007\u001a\u0002H\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Triple;", "T1", "T2", "T3", "flow1Value", "flow2Value", "flow3Value"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.utils.FlowsKt$combine$1", f = "Flows.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.uicore.utils.FlowsKt$combine$1, reason: invalid class name */
    static final class AnonymousClass1<T1, T2, T3> extends SuspendLambda implements Function4<T1, T2, T3, Continuation<? super Triple<? extends T1, ? extends T2, ? extends T3>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(4, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((AnonymousClass1<T1, T2, T3>) obj, obj2, obj3, (Continuation<? super Triple<? extends AnonymousClass1<T1, T2, T3>, ? extends Object, ? extends Object>>) obj4);
        }

        public final Object invoke(T1 t1, T2 t2, T3 t3, Continuation<? super Triple<? extends T1, ? extends T2, ? extends T3>> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = t1;
            anonymousClass1.L$1 = t2;
            anonymousClass1.L$2 = t3;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new Triple(this.L$0, this.L$1, this.L$2);
        }
    }

    public static final <T1, T2, T3> Flow<Triple<T1, T2, T3>> combine(Flow<? extends T1> flow1, Flow<? extends T2> flow2, Flow<? extends T3> flow3) {
        Intrinsics.checkNotNullParameter(flow1, "flow1");
        Intrinsics.checkNotNullParameter(flow2, "flow2");
        Intrinsics.checkNotNullParameter(flow3, "flow3");
        return FlowKt.combine(flow1, flow2, flow3, new AnonymousClass1(null));
    }
}
