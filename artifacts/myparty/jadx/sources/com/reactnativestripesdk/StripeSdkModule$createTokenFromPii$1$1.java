package com.reactnativestripesdk;

import com.facebook.react.bridge.Promise;
import com.reactnativestripesdk.utils.CreateTokenErrorType;
import com.reactnativestripesdk.utils.ErrorsKt;
import com.reactnativestripesdk.utils.MappersKt;
import com.stripe.android.Stripe;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: StripeSdkModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.reactnativestripesdk.StripeSdkModule$createTokenFromPii$1$1", f = "StripeSdkModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class StripeSdkModule$createTokenFromPii$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $it;
    final /* synthetic */ Promise $promise;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StripeSdkModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripeSdkModule$createTokenFromPii$1$1(StripeSdkModule stripeSdkModule, String str, Promise promise, Continuation<? super StripeSdkModule$createTokenFromPii$1$1> continuation) {
        super(2, continuation);
        this.this$0 = stripeSdkModule;
        this.$it = str;
        this.$promise = promise;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StripeSdkModule$createTokenFromPii$1$1 stripeSdkModule$createTokenFromPii$1$1 = new StripeSdkModule$createTokenFromPii$1$1(this.this$0, this.$it, this.$promise, continuation);
        stripeSdkModule$createTokenFromPii$1$1.L$0 = obj;
        return stripeSdkModule$createTokenFromPii$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StripeSdkModule$createTokenFromPii$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM9118constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        StripeSdkModule stripeSdkModule = this.this$0;
        String str = this.$it;
        Promise promise = this.$promise;
        try {
            Result.Companion companion = Result.INSTANCE;
            Stripe stripe = stripeSdkModule.stripe;
            if (stripe == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stripe");
                stripe = null;
            }
            promise.resolve(MappersKt.createResult("token", MappersKt.mapFromToken(stripe.createPiiTokenSynchronous(str, null, stripeSdkModule.stripeAccountId))));
            objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Promise promise2 = this.$promise;
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            promise2.resolve(ErrorsKt.createError(CreateTokenErrorType.Failed.toString(), thM9121exceptionOrNullimpl.getMessage()));
        }
        return Unit.INSTANCE;
    }
}
