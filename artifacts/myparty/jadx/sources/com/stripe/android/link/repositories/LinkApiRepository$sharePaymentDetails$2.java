package com.stripe.android.link.repositories;

import com.stripe.android.core.frauddetection.FraudDetectionData;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.SharePaymentDetails;
import com.stripe.android.repository.ConsumersApiService;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LinkApiRepository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/SharePaymentDetails;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.repositories.LinkApiRepository$sharePaymentDetails$2", f = "LinkApiRepository.kt", i = {}, l = {294}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class LinkApiRepository$sharePaymentDetails$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends SharePaymentDetails>>, Object> {
    final /* synthetic */ String $billingPhone;
    final /* synthetic */ String $consumerSessionClientSecret;
    final /* synthetic */ String $cvc;
    final /* synthetic */ String $expectedPaymentMethodType;
    final /* synthetic */ String $paymentDetailsId;
    int label;
    final /* synthetic */ LinkApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LinkApiRepository$sharePaymentDetails$2(LinkApiRepository linkApiRepository, String str, String str2, String str3, String str4, String str5, Continuation<? super LinkApiRepository$sharePaymentDetails$2> continuation) {
        super(2, continuation);
        this.this$0 = linkApiRepository;
        this.$cvc = str;
        this.$consumerSessionClientSecret = str2;
        this.$paymentDetailsId = str3;
        this.$expectedPaymentMethodType = str4;
        this.$billingPhone = str5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LinkApiRepository$sharePaymentDetails$2(this.this$0, this.$cvc, this.$consumerSessionClientSecret, this.$paymentDetailsId, this.$expectedPaymentMethodType, this.$billingPhone, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends SharePaymentDetails>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<SharePaymentDetails>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<SharePaymentDetails>> continuation) {
        return ((LinkApiRepository$sharePaymentDetails$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map mapEmptyMap;
        Object value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FraudDetectionData cached = this.this$0.fraudDetectionDataRepository.getCached();
            Map<String, String> params = cached != null ? cached.getParams() : null;
            if (params == null) {
                params = MapsKt.emptyMap();
            }
            Map mapMapOf = MapsKt.mapOf(TuplesKt.to("expand", CollectionsKt.listOf("payment_method")));
            String str = this.$cvc;
            if (str == null || (mapEmptyMap = MapsKt.mapOf(TuplesKt.to("payment_method_options", MapsKt.mapOf(TuplesKt.to("card", MapsKt.mapOf(TuplesKt.to("cvc", str))))))) == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            ConsumersApiService consumersApiService = this.this$0.consumersApiService;
            ApiRequest.Options optionsBuildRequestOptions$default = LinkApiRepository.buildRequestOptions$default(this.this$0, null, 1, null);
            Map<String, ? extends Object> mapPlus = MapsKt.plus(MapsKt.plus(mapMapOf, params), mapEmptyMap);
            this.label = 1;
            Object objMo8601sharePaymentDetailseH_QyT8 = consumersApiService.mo8601sharePaymentDetailseH_QyT8(this.$consumerSessionClientSecret, this.$paymentDetailsId, this.$expectedPaymentMethodType, this.$billingPhone, LinkApiRepository.REQUEST_SURFACE, optionsBuildRequestOptions$default, mapPlus, this);
            if (objMo8601sharePaymentDetailseH_QyT8 == coroutine_suspended) {
                return coroutine_suspended;
            }
            value = objMo8601sharePaymentDetailseH_QyT8;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            value = ((Result) obj).getValue();
        }
        return Result.m9117boximpl(value);
    }
}
