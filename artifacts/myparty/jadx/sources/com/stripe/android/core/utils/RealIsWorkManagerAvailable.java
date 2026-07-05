package com.stripe.android.core.utils;

import androidx.work.WorkManager;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsWorkManagerAvailable.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u001c\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\n\u001a\u00020\u0005H\u0096B¢\u0006\u0002\u0010\u000bR&\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\f"}, d2 = {"Lcom/stripe/android/core/utils/RealIsWorkManagerAvailable;", "Lcom/stripe/android/core/utils/IsWorkManagerAvailable;", "isEnabledForMerchant", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RealIsWorkManagerAvailable implements IsWorkManagerAvailable {
    private final Function1<Continuation<? super Boolean>, Object> isEnabledForMerchant;

    /* compiled from: IsWorkManagerAvailable.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.core.utils.RealIsWorkManagerAvailable", f = "IsWorkManagerAvailable.kt", i = {0}, l = {21}, m = "invoke", n = {"workManagerInClasspath"}, s = {"Z$0"})
    /* renamed from: com.stripe.android.core.utils.RealIsWorkManagerAvailable$invoke$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealIsWorkManagerAvailable.this.invoke(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public RealIsWorkManagerAvailable(Function1<? super Continuation<? super Boolean>, ? extends Object> isEnabledForMerchant) {
        Intrinsics.checkNotNullParameter(isEnabledForMerchant, "isEnabledForMerchant");
        this.isEnabledForMerchant = isEnabledForMerchant;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.core.utils.IsWorkManagerAvailable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(Continuation<? super Boolean> continuation) {
        AnonymousClass1 anonymousClass1;
        Object objM9118constructorimpl;
        boolean z;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                Result.Companion companion = Result.INSTANCE;
                RealIsWorkManagerAvailable realIsWorkManagerAvailable = this;
                objM9118constructorimpl = Result.m9118constructorimpl(Class.forName("androidx.work.WorkManager"));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            boolean zM9125isSuccessimpl = Result.m9125isSuccessimpl(objM9118constructorimpl);
            Function1<Continuation<? super Boolean>, Object> function1 = this.isEnabledForMerchant;
            anonymousClass1.Z$0 = zM9125isSuccessimpl;
            anonymousClass1.label = 1;
            Object objInvoke = function1.invoke(anonymousClass1);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            z = zM9125isSuccessimpl;
            obj = objInvoke;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = anonymousClass1.Z$0;
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxBoolean(((Boolean) obj).booleanValue() && z && WorkManager.isInitialized());
    }
}
