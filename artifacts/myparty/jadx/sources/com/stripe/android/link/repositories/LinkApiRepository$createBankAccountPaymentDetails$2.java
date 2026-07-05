package com.stripe.android.link.repositories;

import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerPaymentDetailsCreateParams;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LinkApiRepository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.repositories.LinkApiRepository$createBankAccountPaymentDetails$2", f = "LinkApiRepository.kt", i = {}, l = {219}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class LinkApiRepository$createBankAccountPaymentDetails$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends ConsumerPaymentDetails.PaymentDetails>>, Object> {
    final /* synthetic */ String $bankAccountId;
    final /* synthetic */ String $consumerSessionClientSecret;
    final /* synthetic */ String $userEmail;
    int label;
    final /* synthetic */ LinkApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LinkApiRepository$createBankAccountPaymentDetails$2(LinkApiRepository linkApiRepository, String str, String str2, String str3, Continuation<? super LinkApiRepository$createBankAccountPaymentDetails$2> continuation) {
        super(2, continuation);
        this.this$0 = linkApiRepository;
        this.$consumerSessionClientSecret = str;
        this.$bankAccountId = str2;
        this.$userEmail = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LinkApiRepository$createBankAccountPaymentDetails$2(this.this$0, this.$consumerSessionClientSecret, this.$bankAccountId, this.$userEmail, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends ConsumerPaymentDetails.PaymentDetails>> continuation) {
        return ((LinkApiRepository$createBankAccountPaymentDetails$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objMo8599createPaymentDetailsyxL6bBk;
        Object objM9118constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            objMo8599createPaymentDetailsyxL6bBk = this.this$0.consumersApiService.mo8599createPaymentDetailsyxL6bBk(this.$consumerSessionClientSecret, new ConsumerPaymentDetailsCreateParams.BankAccount(this.$bankAccountId, null, this.$userEmail), LinkApiRepository.REQUEST_SURFACE, LinkApiRepository.buildRequestOptions$default(this.this$0, null, 1, null), this);
            if (objMo8599createPaymentDetailsyxL6bBk == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo8599createPaymentDetailsyxL6bBk = ((Result) obj).getValue();
        }
        if (Result.m9125isSuccessimpl(objMo8599createPaymentDetailsyxL6bBk)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl((ConsumerPaymentDetails.PaymentDetails) CollectionsKt.first((List) ((ConsumerPaymentDetails) objMo8599createPaymentDetailsyxL6bBk).getPaymentDetails()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objMo8599createPaymentDetailsyxL6bBk = ResultKt.createFailure(th);
            }
        } else {
            objM9118constructorimpl = Result.m9118constructorimpl(objMo8599createPaymentDetailsyxL6bBk);
        }
        LinkApiRepository linkApiRepository = this.this$0;
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            ErrorReporter.DefaultImpls.report$default(linkApiRepository.errorReporter, ErrorReporter.ExpectedErrorEvent.LINK_CREATE_PAYMENT_DETAILS_FAILURE, StripeException.INSTANCE.create(thM9121exceptionOrNullimpl), null, 4, null);
        }
        return Result.m9117boximpl(objM9118constructorimpl);
    }
}
