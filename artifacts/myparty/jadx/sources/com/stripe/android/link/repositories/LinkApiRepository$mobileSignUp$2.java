package com.stripe.android.link.repositories;

import com.stripe.android.model.ConsumerSessionSignup;
import com.stripe.android.model.ConsumerSignUpConsentAction;
import com.stripe.android.model.IncentiveEligibilitySession;
import com.stripe.android.model.SignUpParams;
import com.stripe.android.repository.ConsumersApiService;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LinkApiRepository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/ConsumerSessionSignup;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.repositories.LinkApiRepository$mobileSignUp$2", f = "LinkApiRepository.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class LinkApiRepository$mobileSignUp$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends ConsumerSessionSignup>>, Object> {
    final /* synthetic */ Long $amount;
    final /* synthetic */ String $appId;
    final /* synthetic */ ConsumerSignUpConsentAction $consentAction;
    final /* synthetic */ String $country;
    final /* synthetic */ String $currency;
    final /* synthetic */ String $email;
    final /* synthetic */ IncentiveEligibilitySession $incentiveEligibilitySession;
    final /* synthetic */ String $name;
    final /* synthetic */ String $phoneNumber;
    final /* synthetic */ String $verificationToken;
    int label;
    final /* synthetic */ LinkApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LinkApiRepository$mobileSignUp$2(LinkApiRepository linkApiRepository, String str, String str2, String str3, String str4, Long l, String str5, IncentiveEligibilitySession incentiveEligibilitySession, ConsumerSignUpConsentAction consumerSignUpConsentAction, String str6, String str7, Continuation<? super LinkApiRepository$mobileSignUp$2> continuation) {
        super(2, continuation);
        this.this$0 = linkApiRepository;
        this.$email = str;
        this.$phoneNumber = str2;
        this.$country = str3;
        this.$name = str4;
        this.$amount = l;
        this.$currency = str5;
        this.$incentiveEligibilitySession = incentiveEligibilitySession;
        this.$consentAction = consumerSignUpConsentAction;
        this.$verificationToken = str6;
        this.$appId = str7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LinkApiRepository$mobileSignUp$2(this.this$0, this.$email, this.$phoneNumber, this.$country, this.$name, this.$amount, this.$currency, this.$incentiveEligibilitySession, this.$consentAction, this.$verificationToken, this.$appId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends ConsumerSessionSignup>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<ConsumerSessionSignup>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<ConsumerSessionSignup>> continuation) {
        return ((LinkApiRepository$mobileSignUp$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ConsumersApiService consumersApiService = this.this$0.consumersApiService;
            Locale locale = this.this$0.locale;
            this.label = 1;
            Object objMo8600mobileSignUp0E7RQCE = consumersApiService.mo8600mobileSignUp0E7RQCE(new SignUpParams(this.$email, this.$phoneNumber, this.$country, this.$name, locale, this.$amount, this.$currency, this.$incentiveEligibilitySession, LinkApiRepository.REQUEST_SURFACE, this.$consentAction, this.$verificationToken, this.$appId), LinkApiRepository.buildRequestOptions$default(this.this$0, null, 1, null), this);
            if (objMo8600mobileSignUp0E7RQCE == coroutine_suspended) {
                return coroutine_suspended;
            }
            value = objMo8600mobileSignUp0E7RQCE;
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
