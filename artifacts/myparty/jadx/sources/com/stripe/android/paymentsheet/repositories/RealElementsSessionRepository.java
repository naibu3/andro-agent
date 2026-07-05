package com.stripe.android.paymentsheet.repositories;

import com.facebook.internal.NativeProtocol;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.common.di.MobileSessionIdModuleKt;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.ElementsSessionParams;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* compiled from: ElementsSessionRepository.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJN\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0082@¢\u0006\u0004\b%\u0010&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006'"}, d2 = {"Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;", "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "lazyPaymentConfig", "Ljavax/inject/Provider;", "Lcom/stripe/android/PaymentConfiguration;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "mobileSessionIdProvider", "", "appId", "<init>", "(Lcom/stripe/android/networking/StripeRepository;Ljavax/inject/Provider;Lkotlin/coroutines/CoroutineContext;Ljavax/inject/Provider;Ljava/lang/String;)V", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "getRequestOptions", "()Lcom/stripe/android/core/networking/ApiRequest$Options;", "get", "Lkotlin/Result;", "Lcom/stripe/android/model/ElementsSession;", "initializationMode", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "customer", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "customPaymentMethods", "", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;", "externalPaymentMethods", "savedPaymentMethodSelectionId", "get-hUnOzRk", "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fallback", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/stripe/android/model/ElementsSessionParams;", "elementsSessionFailure", "", "fallback-0E7RQCE", "(Lcom/stripe/android/model/ElementsSessionParams;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RealElementsSessionRepository implements ElementsSessionRepository {
    public static final int $stable = 8;
    private final String appId;
    private final Provider<PaymentConfiguration> lazyPaymentConfig;
    private final Provider<String> mobileSessionIdProvider;
    private final StripeRepository stripeRepository;
    private final CoroutineContext workContext;

    @Inject
    public RealElementsSessionRepository(StripeRepository stripeRepository, Provider<PaymentConfiguration> lazyPaymentConfig, @IOContext CoroutineContext workContext, @Named(MobileSessionIdModuleKt.MOBILE_SESSION_ID) Provider<String> mobileSessionIdProvider, @Named("application_id") String appId) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(lazyPaymentConfig, "lazyPaymentConfig");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(mobileSessionIdProvider, "mobileSessionIdProvider");
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.stripeRepository = stripeRepository;
        this.lazyPaymentConfig = lazyPaymentConfig;
        this.workContext = workContext;
        this.mobileSessionIdProvider = mobileSessionIdProvider;
        this.appId = appId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ApiRequest.Options getRequestOptions() {
        return new ApiRequest.Options(this.lazyPaymentConfig.get().getPublishableKey(), this.lazyPaymentConfig.get().getStripeAccountId(), null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.paymentsheet.repositories.ElementsSessionRepository
    /* renamed from: get-hUnOzRk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8420gethUnOzRk(PaymentElementLoader.InitializationMode initializationMode, PaymentSheet.CustomerConfiguration customerConfiguration, List<PaymentSheet.CustomPaymentMethod> list, List<String> list2, String str, Continuation<? super Result<ElementsSession>> continuation) {
        RealElementsSessionRepository$get$1 realElementsSessionRepository$get$1;
        ElementsSessionParams elementsSessionParams;
        Object objMo8046retrieveElementsSession0E7RQCE;
        RealElementsSessionRepository realElementsSessionRepository;
        if (continuation instanceof RealElementsSessionRepository$get$1) {
            realElementsSessionRepository$get$1 = (RealElementsSessionRepository$get$1) continuation;
            if ((realElementsSessionRepository$get$1.label & Integer.MIN_VALUE) != 0) {
                realElementsSessionRepository$get$1.label -= Integer.MIN_VALUE;
            } else {
                realElementsSessionRepository$get$1 = new RealElementsSessionRepository$get$1(this, continuation);
            }
        }
        Object obj = realElementsSessionRepository$get$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = realElementsSessionRepository$get$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str2 = this.mobileSessionIdProvider.get();
            Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
            elementsSessionParams = ElementsSessionRepositoryKt.toElementsSessionParams(initializationMode, customerConfiguration, list, list2, str, str2, this.appId);
            StripeRepository stripeRepository = this.stripeRepository;
            ApiRequest.Options requestOptions = getRequestOptions();
            realElementsSessionRepository$get$1.L$0 = this;
            realElementsSessionRepository$get$1.L$1 = elementsSessionParams;
            realElementsSessionRepository$get$1.label = 1;
            objMo8046retrieveElementsSession0E7RQCE = stripeRepository.mo8046retrieveElementsSession0E7RQCE(elementsSessionParams, requestOptions, realElementsSessionRepository$get$1);
            if (objMo8046retrieveElementsSession0E7RQCE != coroutine_suspended) {
                realElementsSessionRepository = this;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        elementsSessionParams = (ElementsSessionParams) realElementsSessionRepository$get$1.L$1;
        realElementsSessionRepository = (RealElementsSessionRepository) realElementsSessionRepository$get$1.L$0;
        ResultKt.throwOnFailure(obj);
        objMo8046retrieveElementsSession0E7RQCE = ((Result) obj).getValue();
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8046retrieveElementsSession0E7RQCE);
        if (thM9121exceptionOrNullimpl == null) {
            return objMo8046retrieveElementsSession0E7RQCE;
        }
        realElementsSessionRepository$get$1.L$0 = null;
        realElementsSessionRepository$get$1.L$1 = null;
        realElementsSessionRepository$get$1.label = 2;
        Object objM8422fallback0E7RQCE = realElementsSessionRepository.m8422fallback0E7RQCE(elementsSessionParams, thM9121exceptionOrNullimpl, realElementsSessionRepository$get$1);
        return objM8422fallback0E7RQCE == coroutine_suspended ? coroutine_suspended : objM8422fallback0E7RQCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: fallback-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8422fallback0E7RQCE(ElementsSessionParams elementsSessionParams, Throwable th, Continuation<? super Result<ElementsSession>> continuation) {
        RealElementsSessionRepository$fallback$1 realElementsSessionRepository$fallback$1;
        if (continuation instanceof RealElementsSessionRepository$fallback$1) {
            realElementsSessionRepository$fallback$1 = (RealElementsSessionRepository$fallback$1) continuation;
            if ((realElementsSessionRepository$fallback$1.label & Integer.MIN_VALUE) != 0) {
                realElementsSessionRepository$fallback$1.label -= Integer.MIN_VALUE;
            } else {
                realElementsSessionRepository$fallback$1 = new RealElementsSessionRepository$fallback$1(this, continuation);
            }
        }
        Object objWithContext = realElementsSessionRepository$fallback$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = realElementsSessionRepository$fallback$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            RealElementsSessionRepository$fallback$2 realElementsSessionRepository$fallback$2 = new RealElementsSessionRepository$fallback$2(elementsSessionParams, this, th, null);
            realElementsSessionRepository$fallback$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, realElementsSessionRepository$fallback$2, realElementsSessionRepository$fallback$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }
}
