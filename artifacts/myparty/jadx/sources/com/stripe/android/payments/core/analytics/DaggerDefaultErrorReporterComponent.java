package com.stripe.android.payments.core.analytics;

import android.content.Context;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.core.analytics.DefaultErrorReporterComponent;
import dagger.internal.Preconditions;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class DaggerDefaultErrorReporterComponent {
    private DaggerDefaultErrorReporterComponent() {
    }

    public static DefaultErrorReporterComponent.Builder builder() {
        return new Builder();
    }

    private static final class Builder implements DefaultErrorReporterComponent.Builder {
        private Context context;
        private Set<String> productUsage;

        private Builder() {
        }

        @Override // com.stripe.android.payments.core.analytics.DefaultErrorReporterComponent.Builder
        public /* bridge */ /* synthetic */ DefaultErrorReporterComponent.Builder productUsage(Set set) {
            return productUsage((Set<String>) set);
        }

        @Override // com.stripe.android.payments.core.analytics.DefaultErrorReporterComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) Preconditions.checkNotNull(context);
            return this;
        }

        @Override // com.stripe.android.payments.core.analytics.DefaultErrorReporterComponent.Builder
        public Builder productUsage(Set<String> set) {
            this.productUsage = (Set) Preconditions.checkNotNull(set);
            return this;
        }

        @Override // com.stripe.android.payments.core.analytics.DefaultErrorReporterComponent.Builder
        public DefaultErrorReporterComponent build() {
            Preconditions.checkBuilderRequirement(this.context, Context.class);
            Preconditions.checkBuilderRequirement(this.productUsage, Set.class);
            return new DefaultErrorReporterComponentImpl(this.context, this.productUsage);
        }
    }

    private static final class DefaultErrorReporterComponentImpl implements DefaultErrorReporterComponent {
        private final Context context;
        private final DefaultErrorReporterComponentImpl defaultErrorReporterComponentImpl;
        private final Set<String> productUsage;

        private DefaultErrorReporterComponentImpl(Context context, Set<String> set) {
            this.defaultErrorReporterComponentImpl = this;
            this.context = context;
            this.productUsage = set;
        }

        private DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
            return new DefaultAnalyticsRequestExecutor(DefaultErrorReporterModule_Companion_ProvideLoggerFactory.provideLogger(), DefaultErrorReporterModule_Companion_ProvideIoContextFactory.provideIoContext());
        }

        private Function0<String> namedFunction0OfString() {
            return DefaultErrorReporterModule_Companion_ProvidePublishableKeyFactory.providePublishableKey(this.context);
        }

        private PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory() {
            return new PaymentAnalyticsRequestFactory(this.context, namedFunction0OfString(), this.productUsage);
        }

        private RealErrorReporter realErrorReporter() {
            return new RealErrorReporter(defaultAnalyticsRequestExecutor(), paymentAnalyticsRequestFactory());
        }

        @Override // com.stripe.android.payments.core.analytics.DefaultErrorReporterComponent
        public ErrorReporter getErrorReporter() {
            return realErrorReporter();
        }
    }
}
