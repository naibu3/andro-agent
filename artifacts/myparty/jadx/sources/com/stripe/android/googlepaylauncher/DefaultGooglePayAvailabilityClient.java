package com.stripe.android.googlepaylauncher;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.stripe.android.googlepaylauncher.GooglePayAvailabilityClient;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GooglePayAvailabilityClient.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000bB\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient;", "Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient;", "paymentsClient", "Lcom/google/android/gms/wallet/PaymentsClient;", "<init>", "(Lcom/google/android/gms/wallet/PaymentsClient;)V", "isReady", "", "request", "Lcom/google/android/gms/wallet/IsReadyToPayRequest;", "(Lcom/google/android/gms/wallet/IsReadyToPayRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Factory", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultGooglePayAvailabilityClient implements GooglePayAvailabilityClient {
    public static final int $stable = 8;
    private final PaymentsClient paymentsClient;

    /* compiled from: GooglePayAvailabilityClient.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.googlepaylauncher.DefaultGooglePayAvailabilityClient", f = "GooglePayAvailabilityClient.kt", i = {}, l = {22}, m = "isReady", n = {}, s = {})
    /* renamed from: com.stripe.android.googlepaylauncher.DefaultGooglePayAvailabilityClient$isReady$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultGooglePayAvailabilityClient.this.isReady(null, this);
        }
    }

    public DefaultGooglePayAvailabilityClient(PaymentsClient paymentsClient) {
        Intrinsics.checkNotNullParameter(paymentsClient, "paymentsClient");
        this.paymentsClient = paymentsClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.googlepaylauncher.GooglePayAvailabilityClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object isReady(IsReadyToPayRequest isReadyToPayRequest, Continuation<? super Boolean> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objAwait = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objAwait);
            Task<Boolean> taskIsReadyToPay = this.paymentsClient.isReadyToPay(isReadyToPayRequest);
            Intrinsics.checkNotNullExpressionValue(taskIsReadyToPay, "isReadyToPay(...)");
            anonymousClass1.label = 1;
            objAwait = kotlinx.coroutines.tasks.TasksKt.await(taskIsReadyToPay, anonymousClass1);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwait);
        }
        Intrinsics.checkNotNullExpressionValue(objAwait, "await(...)");
        return objAwait;
    }

    /* compiled from: GooglePayAvailabilityClient.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient$Factory;", "Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient$Factory;", "<init>", "()V", "create", "Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient;", "paymentsClient", "Lcom/google/android/gms/wallet/PaymentsClient;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements GooglePayAvailabilityClient.Factory {
        public static final int $stable = 0;

        @Override // com.stripe.android.googlepaylauncher.GooglePayAvailabilityClient.Factory
        public GooglePayAvailabilityClient create(PaymentsClient paymentsClient) {
            Intrinsics.checkNotNullParameter(paymentsClient, "paymentsClient");
            return new DefaultGooglePayAvailabilityClient(paymentsClient);
        }
    }
}
