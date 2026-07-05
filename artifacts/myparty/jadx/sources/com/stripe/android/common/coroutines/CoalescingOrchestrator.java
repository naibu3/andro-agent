package com.stripe.android.common.coroutines;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.tasks.TasksKt;

/* compiled from: CoalescingOrchestrator.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002BM\u0012\u001c\u0010\u0003\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0014\u001a\u00028\u0000H\u0086P¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R&\u0010\u0003\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;", ExifInterface.GPS_DIRECTION_TRUE, "", "factory", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "keepDataInMemory", "", "awaitListener", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Lkotlin/jvm/functions/Function1;", "data", "Ljava/lang/Object;", "dataInitialized", "deferred", "Lkotlinx/coroutines/Deferred;", "lock", "get", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadDataAsync", "scope", "Lkotlinx/coroutines/CoroutineScope;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CoalescingOrchestrator<T> {
    public static final int $stable = 8;
    private final Function0<Unit> awaitListener;
    private volatile T data;
    private volatile boolean dataInitialized;
    private volatile Deferred<? extends T> deferred;
    private final Function1<Continuation<? super T>, Object> factory;
    private final Function1<T, Boolean> keepDataInMemory;
    private final Object lock;

    /* compiled from: CoalescingOrchestrator.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.common.coroutines.CoalescingOrchestrator", f = "CoalescingOrchestrator.kt", i = {}, l = {35}, m = "get", n = {}, s = {})
    /* renamed from: com.stripe.android.common.coroutines.CoalescingOrchestrator$get$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ CoalescingOrchestrator<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CoalescingOrchestrator<T> coalescingOrchestrator, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = coalescingOrchestrator;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.get(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CoalescingOrchestrator(Function1<? super Continuation<? super T>, ? extends Object> factory, Function1<? super T, Boolean> keepDataInMemory, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(keepDataInMemory, "keepDataInMemory");
        this.factory = factory;
        this.keepDataInMemory = keepDataInMemory;
        this.awaitListener = function0;
        this.lock = new Object();
    }

    public /* synthetic */ CoalescingOrchestrator(Function1 function1, Function1 function12, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i & 2) != 0 ? new Function1() { // from class: com.stripe.android.common.coroutines.CoalescingOrchestrator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CoalescingOrchestrator._init_$lambda$0(obj));
            }
        } : function12, (i & 4) != 0 ? null : function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0069 -> B:24:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Continuation<? super T> continuation) {
        AnonymousClass1 anonymousClass1;
        Ref.ObjectRef objectRef;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, continuation);
            }
        }
        Object objCoroutineScope = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objCoroutineScope);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = this;
            objectRef = objectRef2;
            if (!((CoalescingOrchestrator) objectRef.element).dataInitialized) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objCoroutineScope);
            if (objCoroutineScope == null) {
                return objCoroutineScope;
            }
            objectRef.element = (T) ((CoalescingOrchestrator) objectRef.element);
            if (!((CoalescingOrchestrator) objectRef.element).dataInitialized) {
                T t = ((CoalescingOrchestrator) objectRef.element).data;
                if (t != null) {
                    return t;
                }
                Intrinsics.throwUninitializedPropertyAccessException("data");
                return Unit.INSTANCE;
            }
            CoalescingOrchestrator$get$result$1 coalescingOrchestrator$get$result$1 = new CoalescingOrchestrator$get$result$1(objectRef, null);
            anonymousClass1.L$0 = objectRef;
            anonymousClass1.label = 1;
            objCoroutineScope = CoroutineScopeKt.coroutineScope(coalescingOrchestrator$get$result$1, anonymousClass1);
            if (objCoroutineScope == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (objCoroutineScope == null) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Deferred<T> loadDataAsync(CoroutineScope scope) {
        TasksKt.AnonymousClass3 anonymousClass3 = (Deferred<? extends T>) BuildersKt__Builders_commonKt.async$default(scope, null, CoroutineStart.LAZY, new CoalescingOrchestrator$loadDataAsync$local$1(this, null), 1, null);
        this.deferred = anonymousClass3;
        return anonymousClass3;
    }
}
