package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.facebook.hermes.intl.Constants;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestV2Executor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestV2Executor;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import com.stripe.android.core.networking.RealAnalyticsRequestV2Storage;
import com.stripe.android.core.utils.IsWorkManagerAvailable;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeRepositoryModule.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H!¢\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH!¢\u0006\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/payments/core/injection/StripeRepositoryModule;", "", "<init>", "()V", "bindsAnalyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", Constants.COLLATION_DEFAULT, "Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;", "bindsAnalyticsRequestExecutor$payments_core_release", "bindsStripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "stripeApiRepository", "Lcom/stripe/android/networking/StripeApiRepository;", "bindsStripeRepository$payments_core_release", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public abstract class StripeRepositoryModule {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Binds
    public abstract AnalyticsRequestExecutor bindsAnalyticsRequestExecutor$payments_core_release(DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor);

    @Binds
    public abstract StripeRepository bindsStripeRepository$payments_core_release(StripeApiRepository stripeApiRepository);

    /* compiled from: StripeRepositoryModule.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/stripe/android/payments/core/injection/StripeRepositoryModule$Companion;", "", "<init>", "()V", "providesAnalyticsRequestV2Executor", "Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;", "application", "Landroid/content/Context;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "logger", "Lcom/stripe/android/core/Logger;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Provides
        public final AnalyticsRequestV2Executor providesAnalyticsRequestV2Executor(Context application, @IOContext CoroutineContext coroutineContext, Logger logger) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
            Intrinsics.checkNotNullParameter(logger, "logger");
            return new DefaultAnalyticsRequestV2Executor(application, new DefaultStripeNetworkClient(coroutineContext, null, null, 0, logger, 14, null), logger, new RealAnalyticsRequestV2Storage(application), new IsWorkManagerAvailable() { // from class: com.stripe.android.payments.core.injection.StripeRepositoryModule$Companion$providesAnalyticsRequestV2Executor$1
                @Override // com.stripe.android.core.utils.IsWorkManagerAvailable
                public final Object invoke(Continuation<? super Boolean> continuation) {
                    return Boxing.boxBoolean(false);
                }
            });
        }
    }
}
