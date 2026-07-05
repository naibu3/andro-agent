package com.stripe.android.payments.core.authentication;

import android.content.Context;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultPaymentNextActionHandlerRegistry.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a?\u0010\u0007\u001a)\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001j\u0002`\t\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\n¢\u0006\u0002\b\u00060\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002*\u001c\b\u0002\u0010\u0000\"\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001*\"\b\u0002\u0010\u0003\"\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00062\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¨\u0006\u000f"}, d2 = {"NextActionHandlerKey", "Ljava/lang/Class;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "NextActionHandler", "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;", "Lcom/stripe/android/model/StripeIntent;", "Lkotlin/jvm/JvmSuppressWildcards;", "paymentSheetNextActionHandlers", "", "Lcom/stripe/android/payments/core/authentication/NextActionHandlerKey;", "Lcom/stripe/android/payments/core/authentication/NextActionHandler;", "includePaymentSheetNextActionHandlers", "", "applicationContext", "Landroid/content/Context;", "payments-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultPaymentNextActionHandlerRegistryKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<Class<? extends StripeIntent.NextActionData>, PaymentNextActionHandler<StripeIntent>> paymentSheetNextActionHandlers(boolean z, Context context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (z) {
                Object obj = Class.forName("com.stripe.android.paymentsheet.PaymentSheetNextActionHandlers").getDeclaredField("INSTANCE").get(null);
                Object objInvoke = obj.getClass().getDeclaredMethod("get", new Class[0]).invoke(obj, new Object[0]);
                Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.collections.Map<java.lang.Class<out com.stripe.android.model.StripeIntent.NextActionData>, @[JvmSuppressWildcards(suppress = <null>)] com.stripe.android.payments.core.authentication.PaymentNextActionHandler<com.stripe.android.model.StripeIntent>>");
                return (Map) objInvoke;
            }
            return MapsKt.emptyMap();
        } catch (Exception e) {
            ErrorReporter.DefaultImpls.report$default(ErrorReporter.Companion.createFallbackInstance$default(ErrorReporter.INSTANCE, context, null, 2, null), ErrorReporter.UnexpectedErrorEvent.PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND, StripeException.INSTANCE.create(e), null, 4, null);
            return MapsKt.emptyMap();
        }
    }
}
