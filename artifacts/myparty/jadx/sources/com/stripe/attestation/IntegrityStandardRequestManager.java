package com.stripe.attestation;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntegrityStandardRequestManager.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0016H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u0082@¢\u0006\u0004\b\u001f\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/stripe/attestation/IntegrityStandardRequestManager;", "Lcom/stripe/attestation/IntegrityRequestManager;", "cloudProjectNumber", "", "logError", "Lkotlin/Function2;", "", "", "", "factory", "Lcom/stripe/attestation/StandardIntegrityManagerFactory;", "<init>", "(JLkotlin/jvm/functions/Function2;Lcom/stripe/attestation/StandardIntegrityManagerFactory;)V", "standardIntegrityManager", "Lcom/google/android/play/core/integrity/StandardIntegrityManager;", "getStandardIntegrityManager", "()Lcom/google/android/play/core/integrity/StandardIntegrityManager;", "standardIntegrityManager$delegate", "Lkotlin/Lazy;", "integrityTokenProvider", "Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenProvider;", "prepare", "Lkotlin/Result;", "prepare-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestToken", "requestIdentifier", "requestToken-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "request", "requestHash", "request-gIAlu-s", "stripe-attestation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntegrityStandardRequestManager implements IntegrityRequestManager {
    private final long cloudProjectNumber;
    private final StandardIntegrityManagerFactory factory;
    private StandardIntegrityManager.StandardIntegrityTokenProvider integrityTokenProvider;
    private final Function2<String, Throwable, Unit> logError;

    /* renamed from: standardIntegrityManager$delegate, reason: from kotlin metadata */
    private final Lazy standardIntegrityManager;

    /* JADX WARN: Multi-variable type inference failed */
    public IntegrityStandardRequestManager(long j, Function2<? super String, ? super Throwable, Unit> logError, StandardIntegrityManagerFactory factory) {
        Intrinsics.checkNotNullParameter(logError, "logError");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.cloudProjectNumber = j;
        this.logError = logError;
        this.factory = factory;
        this.standardIntegrityManager = LazyKt.lazy(new Function0() { // from class: com.stripe.attestation.IntegrityStandardRequestManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntegrityStandardRequestManager.standardIntegrityManager_delegate$lambda$0(this.f$0);
            }
        });
    }

    private final StandardIntegrityManager getStandardIntegrityManager() {
        return (StandardIntegrityManager) this.standardIntegrityManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StandardIntegrityManager standardIntegrityManager_delegate$lambda$0(IntegrityStandardRequestManager integrityStandardRequestManager) {
        return integrityStandardRequestManager.factory.create();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.attestation.IntegrityRequestManager
    /* renamed from: prepare-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8934prepareIoAF18A(Continuation<? super Result<Unit>> continuation) {
        IntegrityStandardRequestManager$prepare$1 integrityStandardRequestManager$prepare$1;
        IntegrityStandardRequestManager integrityStandardRequestManager;
        IntegrityStandardRequestManager integrityStandardRequestManager2;
        Object objM9118constructorimpl;
        Throwable thM9121exceptionOrNullimpl;
        if (continuation instanceof IntegrityStandardRequestManager$prepare$1) {
            integrityStandardRequestManager$prepare$1 = (IntegrityStandardRequestManager$prepare$1) continuation;
            if ((integrityStandardRequestManager$prepare$1.label & Integer.MIN_VALUE) != 0) {
                integrityStandardRequestManager$prepare$1.label -= Integer.MIN_VALUE;
            } else {
                integrityStandardRequestManager$prepare$1 = new IntegrityStandardRequestManager$prepare$1(this, continuation);
            }
        }
        Object objAwaitTask$default = integrityStandardRequestManager$prepare$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = integrityStandardRequestManager$prepare$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objAwaitTask$default);
            try {
                Result.Companion companion = Result.INSTANCE;
                IntegrityStandardRequestManager integrityStandardRequestManager3 = this;
                if (this.integrityTokenProvider != null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m9118constructorimpl(Unit.INSTANCE);
                }
                Task<StandardIntegrityManager.StandardIntegrityTokenProvider> taskPrepareIntegrityToken = getStandardIntegrityManager().prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.cloudProjectNumber).build());
                Intrinsics.checkNotNullExpressionValue(taskPrepareIntegrityToken, "prepareIntegrityToken(...)");
                integrityStandardRequestManager$prepare$1.L$0 = this;
                integrityStandardRequestManager$prepare$1.L$1 = this;
                integrityStandardRequestManager$prepare$1.label = 1;
                objAwaitTask$default = TaskExtensionsKt.awaitTask$default(taskPrepareIntegrityToken, null, integrityStandardRequestManager$prepare$1, 1, null);
                if (objAwaitTask$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                integrityStandardRequestManager = this;
                integrityStandardRequestManager2 = integrityStandardRequestManager;
            } catch (Throwable th) {
                th = th;
                integrityStandardRequestManager = this;
                Result.Companion companion3 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                }
                Object objM9118constructorimpl2 = Result.m9118constructorimpl(objM9118constructorimpl);
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl2);
                if (thM9121exceptionOrNullimpl == null) {
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            integrityStandardRequestManager2 = (IntegrityStandardRequestManager) integrityStandardRequestManager$prepare$1.L$1;
            integrityStandardRequestManager = (IntegrityStandardRequestManager) integrityStandardRequestManager$prepare$1.L$0;
            try {
                ResultKt.throwOnFailure(objAwaitTask$default);
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion32 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                }
                Object objM9118constructorimpl22 = Result.m9118constructorimpl(objM9118constructorimpl);
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl22);
                if (thM9121exceptionOrNullimpl == null) {
                }
            }
        }
        Object result = TaskExtensionsKt.toResult((Task) objAwaitTask$default);
        if (Result.m9125isSuccessimpl(result)) {
            integrityStandardRequestManager2.integrityTokenProvider = (StandardIntegrityManager.StandardIntegrityTokenProvider) result;
        }
        ResultKt.throwOnFailure(result);
        objM9118constructorimpl = Result.m9118constructorimpl((StandardIntegrityManager.StandardIntegrityTokenProvider) result);
        if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
            Result.Companion companion4 = Result.INSTANCE;
            objM9118constructorimpl = Unit.INSTANCE;
        }
        Object objM9118constructorimpl222 = Result.m9118constructorimpl(objM9118constructorimpl);
        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl222);
        if (thM9121exceptionOrNullimpl == null) {
            return objM9118constructorimpl222;
        }
        try {
            Result.Companion companion5 = Result.INSTANCE;
            integrityStandardRequestManager.logError.invoke("Integrity - Failed to prepare integrity token", thM9121exceptionOrNullimpl);
            throw AttestationError.INSTANCE.fromException(thM9121exceptionOrNullimpl);
        } catch (Throwable th3) {
            Result.Companion companion6 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(th3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.attestation.IntegrityRequestManager
    /* renamed from: requestToken-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8935requestTokengIAlus(String str, Continuation<? super Result<String>> continuation) {
        IntegrityStandardRequestManager$requestToken$1 integrityStandardRequestManager$requestToken$1;
        if (continuation instanceof IntegrityStandardRequestManager$requestToken$1) {
            integrityStandardRequestManager$requestToken$1 = (IntegrityStandardRequestManager$requestToken$1) continuation;
            if ((integrityStandardRequestManager$requestToken$1.label & Integer.MIN_VALUE) != 0) {
                integrityStandardRequestManager$requestToken$1.label -= Integer.MIN_VALUE;
            } else {
                integrityStandardRequestManager$requestToken$1 = new IntegrityStandardRequestManager$requestToken$1(this, continuation);
            }
        }
        Object obj = integrityStandardRequestManager$requestToken$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = integrityStandardRequestManager$requestToken$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        integrityStandardRequestManager$requestToken$1.label = 1;
        Object objM8938requestgIAlus = m8938requestgIAlus(str, integrityStandardRequestManager$requestToken$1);
        return objM8938requestgIAlus == coroutine_suspended ? coroutine_suspended : objM8938requestgIAlus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: request-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8938requestgIAlus(String str, Continuation<? super Result<String>> continuation) {
        IntegrityStandardRequestManager$request$1 integrityStandardRequestManager$request$1;
        IntegrityStandardRequestManager integrityStandardRequestManager;
        Object objM9118constructorimpl;
        Throwable thM9121exceptionOrNullimpl;
        if (continuation instanceof IntegrityStandardRequestManager$request$1) {
            integrityStandardRequestManager$request$1 = (IntegrityStandardRequestManager$request$1) continuation;
            if ((integrityStandardRequestManager$request$1.label & Integer.MIN_VALUE) != 0) {
                integrityStandardRequestManager$request$1.label -= Integer.MIN_VALUE;
            } else {
                integrityStandardRequestManager$request$1 = new IntegrityStandardRequestManager$request$1(this, continuation);
            }
        }
        Object objAwaitTask$default = integrityStandardRequestManager$request$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = integrityStandardRequestManager$request$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objAwaitTask$default);
            try {
                Result.Companion companion = Result.INSTANCE;
                IntegrityStandardRequestManager integrityStandardRequestManager2 = this;
                StandardIntegrityManager.StandardIntegrityTokenProvider standardIntegrityTokenProvider = this.integrityTokenProvider;
                if (standardIntegrityTokenProvider == null) {
                    throw new IllegalArgumentException("Integrity token provider is not initialized. Call prepare() first.".toString());
                }
                Task<StandardIntegrityManager.StandardIntegrityToken> taskRequest = standardIntegrityTokenProvider.request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build());
                Intrinsics.checkNotNullExpressionValue(taskRequest, "request(...)");
                integrityStandardRequestManager$request$1.L$0 = this;
                integrityStandardRequestManager$request$1.label = 1;
                objAwaitTask$default = TaskExtensionsKt.awaitTask$default(taskRequest, null, integrityStandardRequestManager$request$1, 1, null);
                if (objAwaitTask$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                integrityStandardRequestManager = this;
            } catch (Throwable th) {
                th = th;
                integrityStandardRequestManager = this;
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                }
                Object objM9118constructorimpl2 = Result.m9118constructorimpl(objM9118constructorimpl);
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl2);
                if (thM9121exceptionOrNullimpl == null) {
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            integrityStandardRequestManager = (IntegrityStandardRequestManager) integrityStandardRequestManager$request$1.L$0;
            try {
                ResultKt.throwOnFailure(objAwaitTask$default);
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion22 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                }
                Object objM9118constructorimpl22 = Result.m9118constructorimpl(objM9118constructorimpl);
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl22);
                if (thM9121exceptionOrNullimpl == null) {
                }
            }
        }
        Object result = TaskExtensionsKt.toResult((Task) objAwaitTask$default);
        ResultKt.throwOnFailure(result);
        objM9118constructorimpl = Result.m9118constructorimpl((StandardIntegrityManager.StandardIntegrityToken) result);
        if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
            Result.Companion companion3 = Result.INSTANCE;
            objM9118constructorimpl = ((StandardIntegrityManager.StandardIntegrityToken) objM9118constructorimpl).token();
        }
        Object objM9118constructorimpl222 = Result.m9118constructorimpl(objM9118constructorimpl);
        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl222);
        if (thM9121exceptionOrNullimpl == null) {
            return objM9118constructorimpl222;
        }
        try {
            Result.Companion companion4 = Result.INSTANCE;
            integrityStandardRequestManager.logError.invoke("Integrity - Failed to request integrity token", thM9121exceptionOrNullimpl);
            throw AttestationError.INSTANCE.fromException(thM9121exceptionOrNullimpl);
        } catch (Throwable th3) {
            Result.Companion companion5 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(th3));
        }
    }
}
