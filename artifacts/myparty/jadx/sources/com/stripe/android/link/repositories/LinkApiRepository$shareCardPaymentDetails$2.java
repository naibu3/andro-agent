package com.stripe.android.link.repositories;

import com.stripe.android.core.exception.StripeException;
import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.link.utils.LinkBillingDetailsUtilsKt;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerPaymentDetailsCreateParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.payments.core.analytics.ErrorReporter;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/link/LinkPaymentDetails$Saved;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.repositories.LinkApiRepository$shareCardPaymentDetails$2", f = "LinkApiRepository.kt", i = {}, l = {253}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class LinkApiRepository$shareCardPaymentDetails$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends LinkPaymentDetails.Saved>>, Object> {
    final /* synthetic */ String $consumerSessionClientSecret;
    final /* synthetic */ String $id;
    final /* synthetic */ PaymentMethodCreateParams $paymentMethodCreateParams;
    int label;
    final /* synthetic */ LinkApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LinkApiRepository$shareCardPaymentDetails$2(PaymentMethodCreateParams paymentMethodCreateParams, LinkApiRepository linkApiRepository, String str, String str2, Continuation<? super LinkApiRepository$shareCardPaymentDetails$2> continuation) {
        super(2, continuation);
        this.$paymentMethodCreateParams = paymentMethodCreateParams;
        this.this$0 = linkApiRepository;
        this.$consumerSessionClientSecret = str;
        this.$id = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LinkApiRepository$shareCardPaymentDetails$2(this.$paymentMethodCreateParams, this.this$0, this.$consumerSessionClientSecret, this.$id, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends LinkPaymentDetails.Saved>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<LinkPaymentDetails.Saved>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<LinkPaymentDetails.Saved>> continuation) {
        return ((LinkApiRepository$shareCardPaymentDetails$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map mapEmptyMap;
        Map mapEmptyMap2;
        Object objMo8057sharePaymentDetailsyxL6bBk;
        String str;
        Object objM9118constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PaymentMethod.AllowRedisplay allowRedisplay = this.$paymentMethodCreateParams.getAllowRedisplay();
            if (allowRedisplay == null || (mapEmptyMap = MapsKt.mapOf(TuplesKt.to(LinkApiRepository.ALLOW_REDISPLAY_PARAM, allowRedisplay.getValue()))) == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            PaymentMethod.BillingDetails billingDetails = this.$paymentMethodCreateParams.getBillingDetails();
            if (billingDetails == null || (str = billingDetails.phone) == null || (mapEmptyMap2 = MapsKt.mapOf(TuplesKt.to("billing_phone", str))) == null) {
                mapEmptyMap2 = MapsKt.emptyMap();
            }
            Map mapMapOf = MapsKt.mapOf(TuplesKt.to("expand", CollectionsKt.listOf("payment_method")));
            this.label = 1;
            objMo8057sharePaymentDetailsyxL6bBk = this.this$0.stripeRepository.mo8057sharePaymentDetailsyxL6bBk(this.$consumerSessionClientSecret, this.$id, MapsKt.plus(MapsKt.plus(MapsKt.plus(MapsKt.mapOf(TuplesKt.to("payment_method_options", ConsumerPaymentDetailsCreateParams.Card.INSTANCE.extraConfirmationParams(this.$paymentMethodCreateParams.toParamMap()))), mapEmptyMap), mapEmptyMap2), mapMapOf), LinkApiRepository.buildRequestOptions$default(this.this$0, null, 1, null), this);
            if (objMo8057sharePaymentDetailsyxL6bBk == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo8057sharePaymentDetailsyxL6bBk = ((Result) obj).getValue();
        }
        LinkApiRepository linkApiRepository = this.this$0;
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8057sharePaymentDetailsyxL6bBk);
        if (thM9121exceptionOrNullimpl != null) {
            ErrorReporter.DefaultImpls.report$default(linkApiRepository.errorReporter, ErrorReporter.ExpectedErrorEvent.LINK_SHARE_CARD_FAILURE, StripeException.INSTANCE.create(thM9121exceptionOrNullimpl), null, 4, null);
        }
        PaymentMethodCreateParams paymentMethodCreateParams = this.$paymentMethodCreateParams;
        String str2 = this.$id;
        String str3 = this.$consumerSessionClientSecret;
        if (!Result.m9125isSuccessimpl(objMo8057sharePaymentDetailsyxL6bBk)) {
            objM9118constructorimpl = Result.m9118constructorimpl(objMo8057sharePaymentDetailsyxL6bBk);
        } else {
            Result.Companion companion = Result.INSTANCE;
            PaymentMethod paymentMethod = (PaymentMethod) objMo8057sharePaymentDetailsyxL6bBk;
            String str4 = paymentMethod.id;
            if (str4 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            String strCardLast4 = paymentMethodCreateParams.cardLast4();
            if (strCardLast4 == null) {
                strCardLast4 = "";
            }
            String str5 = strCardLast4;
            PaymentMethod.BillingDetails billingDetails2 = paymentMethod.billingDetails;
            String str6 = billingDetails2 != null ? billingDetails2.email : null;
            PaymentMethod.BillingDetails billingDetails3 = paymentMethod.billingDetails;
            objM9118constructorimpl = Result.m9118constructorimpl(new LinkPaymentDetails.Saved(new ConsumerPaymentDetails.Passthrough(str2, str4, str5, billingDetails3 != null ? LinkBillingDetailsUtilsKt.toConsumerBillingAddress(billingDetails3) : null, str6), PaymentMethodCreateParams.Companion.createLink$default(PaymentMethodCreateParams.INSTANCE, str4, str3, null, ConsumerPaymentDetailsCreateParams.Card.INSTANCE.extraConfirmationParams(paymentMethodCreateParams.toParamMap()), null, 20, null)));
        }
        return Result.m9117boximpl(objM9118constructorimpl);
    }
}
