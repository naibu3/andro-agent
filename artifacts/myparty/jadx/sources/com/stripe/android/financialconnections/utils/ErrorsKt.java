package com.stripe.android.financialconnections.utils;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.core.exception.StripeException;
import expo.modules.notifications.service.NotificationsService;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Errors.kt */
@Metadata(d1 = {"\u0000(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a^\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00052\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000bH\u0080@¢\u0006\u0002\u0010\f\"\u0018\u0010\r\u001a\u00020\b*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"retryOnException", ExifInterface.GPS_DIRECTION_TRUE, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lcom/stripe/android/financialconnections/utils/PollTimingOptions;", "retryCondition", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "", "", "block", "Lkotlin/Function1;", "(Lcom/stripe/android/financialconnections/utils/PollTimingOptions;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldRetry", "getShouldRetry", "(Ljava/lang/Throwable;)Z", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ErrorsKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Errors.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.utils.ErrorsKt$retryOnException$2", f = "Errors.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 3}, l = {23, 30, 38, 35}, m = "invokeSuspend", n = {"$this$channelFlow", "remainingTimes", "$this$channelFlow", "remainingTimes", "$this$channelFlow", "remainingTimes", "$this$channelFlow", "remainingTimes", NotificationsService.EXCEPTION_KEY}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2"})
    /* renamed from: com.stripe.android.financialconnections.utils.ErrorsKt$retryOnException$2, reason: invalid class name */
    static final class AnonymousClass2<T> extends SuspendLambda implements Function2<ProducerScope<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Continuation<? super T>, Object> $block;
        final /* synthetic */ PollTimingOptions $options;
        final /* synthetic */ Function2<Throwable, Continuation<? super Boolean>, Object> $retryCondition;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(PollTimingOptions pollTimingOptions, Function1<? super Continuation<? super T>, ? extends Object> function1, Function2<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$options = pollTimingOptions;
            this.$block = function1;
            this.$retryCondition = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$options, this.$block, this.$retryCondition, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super T> producerScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00eb -> B:49:0x00ec). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            ProducerScope producerScope;
            Ref.IntRef intRef;
            ProducerScope producerScope2;
            Object objM9118constructorimpl;
            ProducerScope producerScope3;
            Ref.IntRef intRef2;
            Throwable thM9121exceptionOrNullimpl;
            long retryInterval;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                producerScope = (ProducerScope) this.L$0;
                intRef = new Ref.IntRef();
                intRef.element = this.$options.getMaxNumberOfRetries() - 1;
                if (!producerScope.isClosedForSend()) {
                }
            } else {
                if (i == 1) {
                    intRef = (Ref.IntRef) this.L$1;
                    producerScope2 = (ProducerScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    Function1<Continuation<? super T>, Object> function1 = this.$block;
                    Result.Companion companion = Result.INSTANCE;
                    this.L$0 = producerScope2;
                    this.L$1 = intRef;
                    this.label = 2;
                    obj = function1.invoke(this);
                    if (obj == coroutine_suspended) {
                    }
                    objM9118constructorimpl = Result.m9118constructorimpl(obj);
                    producerScope3 = producerScope2;
                    intRef2 = intRef;
                    PollTimingOptions pollTimingOptions = this.$options;
                    Function2<Throwable, Continuation<? super Boolean>, Object> function2 = this.$retryCondition;
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                    return coroutine_suspended;
                }
                if (i == 2) {
                    intRef = (Ref.IntRef) this.L$1;
                    producerScope2 = (ProducerScope) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    }
                    objM9118constructorimpl = Result.m9118constructorimpl(obj);
                    producerScope3 = producerScope2;
                    intRef2 = intRef;
                    PollTimingOptions pollTimingOptions2 = this.$options;
                    Function2<Throwable, Continuation<? super Boolean>, Object> function22 = this.$retryCondition;
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                    return coroutine_suspended;
                }
                if (i == 3) {
                    intRef = (Ref.IntRef) this.L$1;
                    ProducerScope producerScope4 = (ProducerScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    producerScope = producerScope4;
                    intRef.element--;
                    if (!producerScope.isClosedForSend()) {
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th2 = (Throwable) this.L$2;
                    intRef2 = (Ref.IntRef) this.L$1;
                    producerScope3 = (ProducerScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        intRef = intRef2;
                        producerScope = producerScope3;
                        intRef.element--;
                        if (!producerScope.isClosedForSend()) {
                            if (intRef.element == this.$options.getMaxNumberOfRetries() - 1) {
                                retryInterval = this.$options.getInitialDelayMs();
                            } else {
                                retryInterval = this.$options.getRetryInterval();
                            }
                            this.L$0 = producerScope;
                            this.L$1 = intRef;
                            this.L$2 = null;
                            this.label = 1;
                            if (DelayKt.delay(retryInterval, this) != coroutine_suspended) {
                                producerScope2 = producerScope;
                                Function1<Continuation<? super T>, Object> function12 = this.$block;
                                Result.Companion companion3 = Result.INSTANCE;
                                this.L$0 = producerScope2;
                                this.L$1 = intRef;
                                this.label = 2;
                                obj = function12.invoke(this);
                                if (obj == coroutine_suspended) {
                                }
                                objM9118constructorimpl = Result.m9118constructorimpl(obj);
                                producerScope3 = producerScope2;
                                intRef2 = intRef;
                                PollTimingOptions pollTimingOptions22 = this.$options;
                                Function2<Throwable, Continuation<? super Boolean>, Object> function222 = this.$retryCondition;
                                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                                if (thM9121exceptionOrNullimpl != null) {
                                    if (intRef2.element == 0) {
                                        throw new PollingReachedMaxRetriesException(pollTimingOptions22);
                                    }
                                    this.L$0 = producerScope3;
                                    this.L$1 = intRef2;
                                    this.L$2 = thM9121exceptionOrNullimpl;
                                    this.label = 4;
                                    obj = function222.invoke(thM9121exceptionOrNullimpl, this);
                                    if (obj != coroutine_suspended) {
                                        th2 = thM9121exceptionOrNullimpl;
                                        if (!((Boolean) obj).booleanValue()) {
                                            throw th2;
                                        }
                                    }
                                } else {
                                    this.L$0 = producerScope3;
                                    this.L$1 = intRef2;
                                    this.label = 3;
                                    if (producerScope3.send(objM9118constructorimpl, this) != coroutine_suspended) {
                                        intRef = intRef2;
                                        producerScope = producerScope3;
                                        intRef.element--;
                                        if (!producerScope.isClosedForSend()) {
                                        }
                                    }
                                }
                            }
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    public static final <T> Object retryOnException(PollTimingOptions pollTimingOptions, Function2<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function2, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        return FlowKt.first(FlowKt.channelFlow(new AnonymousClass2(pollTimingOptions, function1, function2, null)), continuation);
    }

    public static final boolean getShouldRetry(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        StripeException stripeException = th instanceof StripeException ? (StripeException) th : null;
        Integer numValueOf = stripeException != null ? Integer.valueOf(stripeException.getStatusCode()) : null;
        return numValueOf != null && numValueOf.intValue() == 202;
    }
}
