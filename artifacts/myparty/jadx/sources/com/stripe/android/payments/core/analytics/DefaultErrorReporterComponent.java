package com.stripe.android.payments.core.analytics;

import android.content.Context;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import dagger.BindsInstance;
import dagger.Component;
import java.util.Set;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: ErrorReporter.kt */
@Component(modules = {DefaultErrorReporterModule.class})
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterComponent;", "", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "getErrorReporter", "()Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "Builder", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DefaultErrorReporterComponent {

    /* compiled from: ErrorReporter.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\u0018\u0010\u0004\u001a\u00020\u00002\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\b\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterComponent$Builder;", "", "context", "Landroid/content/Context;", NamedConstantsKt.PRODUCT_USAGE, "", "", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterComponent;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Component.Builder
    public interface Builder {
        DefaultErrorReporterComponent build();

        @BindsInstance
        Builder context(Context context);

        @BindsInstance
        Builder productUsage(@Named(NamedConstantsKt.PRODUCT_USAGE) Set<String> productUsage);
    }

    ErrorReporter getErrorReporter();
}
