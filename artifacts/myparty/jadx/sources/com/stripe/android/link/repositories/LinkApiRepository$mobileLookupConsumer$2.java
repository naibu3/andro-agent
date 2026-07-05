package com.stripe.android.link.repositories;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.EmailSource;
import com.stripe.android.repository.ConsumersApiService;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/ConsumerSessionLookup;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.repositories.LinkApiRepository$mobileLookupConsumer$2", f = "LinkApiRepository.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class LinkApiRepository$mobileLookupConsumer$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends ConsumerSessionLookup>>, Object> {
    final /* synthetic */ String $appId;
    final /* synthetic */ String $customerId;
    final /* synthetic */ String $email;
    final /* synthetic */ EmailSource $emailSource;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ String $verificationToken;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LinkApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LinkApiRepository$mobileLookupConsumer$2(LinkApiRepository linkApiRepository, String str, EmailSource emailSource, String str2, String str3, String str4, String str5, Continuation<? super LinkApiRepository$mobileLookupConsumer$2> continuation) {
        super(2, continuation);
        this.this$0 = linkApiRepository;
        this.$email = str;
        this.$emailSource = emailSource;
        this.$verificationToken = str2;
        this.$appId = str3;
        this.$sessionId = str4;
        this.$customerId = str5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LinkApiRepository$mobileLookupConsumer$2 linkApiRepository$mobileLookupConsumer$2 = new LinkApiRepository$mobileLookupConsumer$2(this.this$0, this.$email, this.$emailSource, this.$verificationToken, this.$appId, this.$sessionId, this.$customerId, continuation);
        linkApiRepository$mobileLookupConsumer$2.L$0 = obj;
        return linkApiRepository$mobileLookupConsumer$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends ConsumerSessionLookup>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<ConsumerSessionLookup>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<ConsumerSessionLookup>> continuation) {
        return ((LinkApiRepository$mobileLookupConsumer$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM9118constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LinkApiRepository linkApiRepository = this.this$0;
                String str = this.$email;
                EmailSource emailSource = this.$emailSource;
                String str2 = this.$verificationToken;
                String str3 = this.$appId;
                String str4 = this.$sessionId;
                String str5 = this.$customerId;
                Result.Companion companion = Result.INSTANCE;
                ConsumersApiService consumersApiService = linkApiRepository.consumersApiService;
                ApiRequest.Options optionsBuildRequestOptions$default = LinkApiRepository.buildRequestOptions$default(linkApiRepository, null, 1, null);
                this.label = 1;
                obj = consumersApiService.mobileLookupConsumerSession(str, emailSource, LinkApiRepository.REQUEST_SURFACE, str2, str3, optionsBuildRequestOptions$default, str4, str5, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            objM9118constructorimpl = Result.m9118constructorimpl((ConsumerSessionLookup) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        return Result.m9117boximpl(objM9118constructorimpl);
    }
}
