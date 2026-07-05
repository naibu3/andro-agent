package com.reactnativestripesdk.customersheet;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import com.reactnativestripesdk.utils.CreateTokenErrorType;
import com.reactnativestripesdk.utils.ErrorType;
import com.reactnativestripesdk.utils.ErrorsKt;
import com.stripe.android.customersheet.CustomerSheet;
import com.stripe.android.customersheet.CustomerSheetResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: CustomerSheetFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.reactnativestripesdk.customersheet.CustomerSheetFragment$retrievePaymentOptionSelection$1", f = "CustomerSheetFragment.kt", i = {0}, l = {237}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u242"}, s = {"L$1"})
/* loaded from: classes5.dex */
final class CustomerSheetFragment$retrievePaymentOptionSelection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Promise $promise;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CustomerSheetFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerSheetFragment$retrievePaymentOptionSelection$1(CustomerSheetFragment customerSheetFragment, Promise promise, Continuation<? super CustomerSheetFragment$retrievePaymentOptionSelection$1> continuation) {
        super(2, continuation);
        this.this$0 = customerSheetFragment;
        this.$promise = promise;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CustomerSheetFragment$retrievePaymentOptionSelection$1 customerSheetFragment$retrievePaymentOptionSelection$1 = new CustomerSheetFragment$retrievePaymentOptionSelection$1(this.this$0, this.$promise, continuation);
        customerSheetFragment$retrievePaymentOptionSelection$1.L$0 = obj;
        return customerSheetFragment$retrievePaymentOptionSelection$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CustomerSheetFragment$retrievePaymentOptionSelection$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM9118constructorimpl;
        Promise promise;
        Promise promise2;
        CustomerSheetResult customerSheetResult;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CustomerSheetFragment customerSheetFragment = this.this$0;
                promise = this.$promise;
                Result.Companion companion = Result.INSTANCE;
                CustomerSheet customerSheet = customerSheetFragment.customerSheet;
                if (customerSheet != null) {
                    this.L$0 = promise;
                    this.L$1 = coroutineScope;
                    this.label = 1;
                    obj = customerSheet.retrievePaymentOptionSelection(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    promise2 = promise;
                }
                promise.resolve(CustomerSheetFragment.INSTANCE.createMissingInitError$stripe_stripe_react_native_release());
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            promise2 = (Promise) this.L$0;
            ResultKt.throwOnFailure(obj);
            customerSheetResult = (CustomerSheetResult) obj;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (customerSheetResult == null) {
            promise = promise2;
            promise.resolve(CustomerSheetFragment.INSTANCE.createMissingInitError$stripe_stripe_react_native_release());
            return Unit.INSTANCE;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        if (customerSheetResult instanceof CustomerSheetResult.Failed) {
            promise2.resolve(ErrorsKt.createError(ErrorType.Failed.toString(), ((CustomerSheetResult.Failed) customerSheetResult).getException()));
        } else if (customerSheetResult instanceof CustomerSheetResult.Selected) {
            writableMapCreateMap = CustomerSheetFragment.INSTANCE.createPaymentOptionResult$stripe_stripe_react_native_release(((CustomerSheetResult.Selected) customerSheetResult).getSelection());
        } else {
            if (!(customerSheetResult instanceof CustomerSheetResult.Canceled)) {
                throw new NoWhenBranchMatchedException();
            }
            writableMapCreateMap = CustomerSheetFragment.INSTANCE.createPaymentOptionResult$stripe_stripe_react_native_release(((CustomerSheetResult.Canceled) customerSheetResult).getSelection());
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putString("code", ErrorType.Canceled.toString());
            Unit unit = Unit.INSTANCE;
            writableMapCreateMap.putMap("error", writableMapCreateMap2);
        }
        promise2.resolve(writableMapCreateMap);
        objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
        Promise promise3 = this.$promise;
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            promise3.resolve(ErrorsKt.createError(CreateTokenErrorType.Failed.toString(), thM9121exceptionOrNullimpl.getMessage()));
        }
        return Unit.INSTANCE;
    }
}
