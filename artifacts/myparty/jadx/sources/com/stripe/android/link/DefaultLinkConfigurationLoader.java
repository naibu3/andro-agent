package com.stripe.android.link;

import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.common.model.CommonConfigurationKt;
import com.stripe.android.core.Logger;
import com.stripe.android.link.LinkController;
import com.stripe.android.link.exceptions.LinkUnavailableException;
import com.stripe.android.link.gate.LinkGate;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.state.LinkState;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkConfigurationLoader.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/link/DefaultLinkConfigurationLoader;", "Lcom/stripe/android/link/LinkConfigurationLoader;", "logger", "Lcom/stripe/android/core/Logger;", "paymentElementLoader", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;", "linkGateFactory", "Lcom/stripe/android/link/gate/LinkGate$Factory;", "<init>", "(Lcom/stripe/android/core/Logger;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;Lcom/stripe/android/link/gate/LinkGate$Factory;)V", "tag", "", "load", "Lkotlin/Result;", "Lcom/stripe/android/link/LinkConfiguration;", "configuration", "Lcom/stripe/android/link/LinkController$Configuration;", "load-gIAlu-s", "(Lcom/stripe/android/link/LinkController$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultLinkConfigurationLoader implements LinkConfigurationLoader {
    public static final int $stable = 8;
    private final LinkGate.Factory linkGateFactory;
    private final Logger logger;
    private final PaymentElementLoader paymentElementLoader;
    private final String tag;

    @Inject
    public DefaultLinkConfigurationLoader(Logger logger, PaymentElementLoader paymentElementLoader, LinkGate.Factory linkGateFactory) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(paymentElementLoader, "paymentElementLoader");
        Intrinsics.checkNotNullParameter(linkGateFactory, "linkGateFactory");
        this.logger = logger;
        this.paymentElementLoader = paymentElementLoader;
        this.linkGateFactory = linkGateFactory;
        this.tag = "LinkConfigurationLoader";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.LinkConfigurationLoader
    /* renamed from: load-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7675loadgIAlus(LinkController.Configuration configuration, Continuation<? super Result<LinkConfiguration>> continuation) {
        DefaultLinkConfigurationLoader$load$1 defaultLinkConfigurationLoader$load$1;
        Object objMo8425loadBWLJW6A;
        DefaultLinkConfigurationLoader defaultLinkConfigurationLoader;
        Object objM9118constructorimpl;
        if (continuation instanceof DefaultLinkConfigurationLoader$load$1) {
            defaultLinkConfigurationLoader$load$1 = (DefaultLinkConfigurationLoader$load$1) continuation;
            if ((defaultLinkConfigurationLoader$load$1.label & Integer.MIN_VALUE) != 0) {
                defaultLinkConfigurationLoader$load$1.label -= Integer.MIN_VALUE;
            } else {
                defaultLinkConfigurationLoader$load$1 = new DefaultLinkConfigurationLoader$load$1(this, continuation);
            }
        }
        Object obj = defaultLinkConfigurationLoader$load$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultLinkConfigurationLoader$load$1.label;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PaymentElementLoader paymentElementLoader = this.paymentElementLoader;
            PaymentElementLoader.InitializationMode.DeferredIntent deferredIntent = new PaymentElementLoader.InitializationMode.DeferredIntent(new PaymentSheet.IntentConfiguration(new PaymentSheet.IntentConfiguration.Mode.Setup(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0), null, null, null, false, 30, null));
            CommonConfiguration commonConfigurationAsCommonConfiguration = CommonConfigurationKt.asCommonConfiguration(configuration);
            PaymentElementLoader.Metadata metadata = new PaymentElementLoader.Metadata(false, false);
            defaultLinkConfigurationLoader$load$1.L$0 = this;
            defaultLinkConfigurationLoader$load$1.label = 1;
            objMo8425loadBWLJW6A = paymentElementLoader.mo8425loadBWLJW6A(deferredIntent, commonConfigurationAsCommonConfiguration, metadata, defaultLinkConfigurationLoader$load$1);
            if (objMo8425loadBWLJW6A == coroutine_suspended) {
                return coroutine_suspended;
            }
            defaultLinkConfigurationLoader = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defaultLinkConfigurationLoader = (DefaultLinkConfigurationLoader) defaultLinkConfigurationLoader$load$1.L$0;
            ResultKt.throwOnFailure(obj);
            objMo8425loadBWLJW6A = ((Result) obj).getValue();
        }
        if (Result.m9125isSuccessimpl(objMo8425loadBWLJW6A)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                try {
                    LinkState linkState = ((PaymentElementLoader.State) objMo8425loadBWLJW6A).getPaymentMethodMetadata().getLinkState();
                    LinkConfiguration configuration2 = linkState != null ? linkState.getConfiguration() : null;
                    if (configuration2 == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    if (defaultLinkConfigurationLoader.linkGateFactory.create(configuration2).getUseNativeLink()) {
                        objM9118constructorimpl = Result.m9118constructorimpl(configuration2);
                    } else {
                        throw new IllegalStateException("Native Link is not available".toString());
                    }
                } catch (Throwable th) {
                    throw new LinkUnavailableException(th);
                }
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objMo8425loadBWLJW6A = ResultKt.createFailure(th2);
            }
        } else {
            objM9118constructorimpl = Result.m9118constructorimpl(objMo8425loadBWLJW6A);
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            defaultLinkConfigurationLoader.logger.error(defaultLinkConfigurationLoader.tag + ": Failed to load LinkConfiguration", thM9121exceptionOrNullimpl);
        }
        return objM9118constructorimpl;
    }
}
