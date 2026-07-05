package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.StripeIntentKtxKt;
import com.stripe.android.view.AuthActivityStarterHost;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnsupportedNextActionHandler.kt */
@Singleton
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u001d\b\u0007\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0094@¢\u0006\u0002\u0010\u000fR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler;", "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;", "Lcom/stripe/android/model/StripeIntent;", "paymentRelayStarterFactory", "Lkotlin/Function1;", "Lcom/stripe/android/view/AuthActivityStarterHost;", "Lcom/stripe/android/PaymentRelayStarter;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "performNextActionOnResumed", "", "host", "actionable", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnsupportedNextActionHandler extends PaymentNextActionHandler<StripeIntent> {
    public static final int $stable = 0;
    private final Function1<AuthActivityStarterHost, PaymentRelayStarter> paymentRelayStarterFactory;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<Class<? extends StripeIntent.NextActionData>, String> ACTION_DEPENDENCY_MAP = MapsKt.mapOf(TuplesKt.to(StripeIntent.NextActionData.WeChatPayRedirect.class, "com.stripe:stripe-wechatpay:21.22.2"));

    @Override // com.stripe.android.payments.core.authentication.PaymentNextActionHandler
    public /* bridge */ /* synthetic */ Object performNextActionOnResumed(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation continuation) {
        return performNextActionOnResumed2(authActivityStarterHost, stripeIntent, options, (Continuation<Unit>) continuation);
    }

    @Inject
    public UnsupportedNextActionHandler(Function1<AuthActivityStarterHost, PaymentRelayStarter> paymentRelayStarterFactory) {
        Intrinsics.checkNotNullParameter(paymentRelayStarterFactory, "paymentRelayStarterFactory");
        this.paymentRelayStarterFactory = paymentRelayStarterFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0040  */
    /* renamed from: performNextActionOnResumed, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Object performNextActionOnResumed2(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation<Unit> continuation) {
        StripeException stripeExceptionCreate;
        StripeIntent.NextActionData nextActionData = stripeIntent.getNextActionData();
        if (nextActionData != null) {
            Class<?> cls = nextActionData.getClass();
            stripeExceptionCreate = StripeException.INSTANCE.create(new IllegalArgumentException(cls.getSimpleName() + " type is not supported, add " + ((Object) ACTION_DEPENDENCY_MAP.get(cls)) + " in build.gradle to support it"));
            if (stripeExceptionCreate == null) {
                stripeExceptionCreate = StripeException.INSTANCE.create(new IllegalArgumentException("stripeIntent.nextActionData is null"));
            }
        }
        this.paymentRelayStarterFactory.invoke(authActivityStarterHost).start(new PaymentRelayStarter.Args.ErrorArgs(stripeExceptionCreate, StripeIntentKtxKt.getRequestCode(stripeIntent)));
        return Unit.INSTANCE;
    }

    /* compiled from: UnsupportedNextActionHandler.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u0004\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler$Companion;", "", "<init>", "()V", "ACTION_DEPENDENCY_MAP", "", "Ljava/lang/Class;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "", "getACTION_DEPENDENCY_MAP", "()Ljava/util/Map;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Map<Class<? extends StripeIntent.NextActionData>, String> getACTION_DEPENDENCY_MAP() {
            return UnsupportedNextActionHandler.ACTION_DEPENDENCY_MAP;
        }
    }
}
