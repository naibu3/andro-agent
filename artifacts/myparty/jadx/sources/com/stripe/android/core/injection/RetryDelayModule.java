package com.stripe.android.core.injection;

import com.stripe.android.core.networking.ExponentialBackoffRetryDelaySupplier;
import com.stripe.android.core.networking.LinearRetryDelaySupplier;
import com.stripe.android.core.networking.RetryDelaySupplier;
import dagger.Binds;
import dagger.Module;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: RetryDelayModule.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\t"}, d2 = {"Lcom/stripe/android/core/injection/RetryDelayModule;", "", "bindsDefaultRetryDelaySupplier", "Lcom/stripe/android/core/networking/RetryDelaySupplier;", "retryDelaySupplier", "Lcom/stripe/android/core/networking/ExponentialBackoffRetryDelaySupplier;", "bindsLinearRetryDelaySupplier", "Lcom/stripe/android/core/networking/LinearRetryDelaySupplier;", "bindsExponentialBackoffRetryDelaySupplier", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public interface RetryDelayModule {
    @Binds
    RetryDelaySupplier bindsDefaultRetryDelaySupplier(ExponentialBackoffRetryDelaySupplier retryDelaySupplier);

    @Binds
    @Named(NamedConstantsKt.EXPONENTIAL_BACKOFF_DELAY)
    RetryDelaySupplier bindsExponentialBackoffRetryDelaySupplier(ExponentialBackoffRetryDelaySupplier retryDelaySupplier);

    @Binds
    @Named(NamedConstantsKt.LINEAR_DELAY)
    RetryDelaySupplier bindsLinearRetryDelaySupplier(LinearRetryDelaySupplier retryDelaySupplier);
}
