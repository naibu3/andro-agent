package com.stripe.android.financialconnections.repository.api;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.domain.IsLinkWithStripe;
import com.stripe.android.financialconnections.repository.CachedConsumerSession;
import com.stripe.android.financialconnections.repository.ConsumerSessionProvider;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProvideApiRequestOptions.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0096\u0002J\n\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/financialconnections/repository/api/RealProvideApiRequestOptions;", "Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;", "consumerSessionProvider", "Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;", "isLinkWithStripe", "Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;", "apiRequestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "<init>", "(Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;Lcom/stripe/android/core/networking/ApiRequest$Options;)V", "invoke", "useConsumerPublishableKey", "", "consumerApiRequestOptions", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RealProvideApiRequestOptions implements ProvideApiRequestOptions {
    public static final int $stable = 8;
    private final ApiRequest.Options apiRequestOptions;
    private final ConsumerSessionProvider consumerSessionProvider;
    private final IsLinkWithStripe isLinkWithStripe;

    @Inject
    public RealProvideApiRequestOptions(ConsumerSessionProvider consumerSessionProvider, IsLinkWithStripe isLinkWithStripe, ApiRequest.Options apiRequestOptions) {
        Intrinsics.checkNotNullParameter(consumerSessionProvider, "consumerSessionProvider");
        Intrinsics.checkNotNullParameter(isLinkWithStripe, "isLinkWithStripe");
        Intrinsics.checkNotNullParameter(apiRequestOptions, "apiRequestOptions");
        this.consumerSessionProvider = consumerSessionProvider;
        this.isLinkWithStripe = isLinkWithStripe;
        this.apiRequestOptions = apiRequestOptions;
    }

    @Override // com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions
    public ApiRequest.Options invoke(boolean useConsumerPublishableKey) {
        if (useConsumerPublishableKey) {
            ApiRequest.Options optionsConsumerApiRequestOptions = consumerApiRequestOptions();
            return optionsConsumerApiRequestOptions == null ? this.apiRequestOptions : optionsConsumerApiRequestOptions;
        }
        return this.apiRequestOptions;
    }

    private final ApiRequest.Options consumerApiRequestOptions() {
        String publishableKey;
        CachedConsumerSession cachedConsumerSessionProvideConsumerSession = this.consumerSessionProvider.provideConsumerSession();
        if (cachedConsumerSessionProvideConsumerSession == null || !cachedConsumerSessionProvideConsumerSession.isVerified()) {
            cachedConsumerSessionProvideConsumerSession = null;
        }
        String str = (cachedConsumerSessionProvideConsumerSession == null || (publishableKey = cachedConsumerSessionProvideConsumerSession.getPublishableKey()) == null || !this.isLinkWithStripe.invoke()) ? null : publishableKey;
        if (str != null) {
            return new ApiRequest.Options(str, null, null, 6, null);
        }
        return null;
    }
}
