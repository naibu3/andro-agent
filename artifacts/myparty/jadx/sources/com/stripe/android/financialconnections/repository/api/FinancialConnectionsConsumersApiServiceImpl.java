package com.stripe.android.financialconnections.repository.api;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.utils.CollectionsKt;
import com.stripe.android.model.ConsumerSessionLookup;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsConsumersApiService.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiServiceImpl;", "Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService;", "requestExecutor", "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;", "apiOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "apiRequestFactory", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "<init>", "(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/networking/ApiRequest$Factory;)V", "postConsumerSession", "Lcom/stripe/android/model/ConsumerSessionLookup;", "email", "", "clientSecret", "requestSurface", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class FinancialConnectionsConsumersApiServiceImpl implements FinancialConnectionsConsumersApiService {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String consumerSessionsUrl = "https://api.stripe.com/v1/connections/link_account_sessions/consumer_sessions";
    private final ApiRequest.Options apiOptions;
    private final ApiRequest.Factory apiRequestFactory;
    private final FinancialConnectionsRequestExecutor requestExecutor;

    public FinancialConnectionsConsumersApiServiceImpl(FinancialConnectionsRequestExecutor requestExecutor, ApiRequest.Options apiOptions, ApiRequest.Factory apiRequestFactory) {
        Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
        Intrinsics.checkNotNullParameter(apiOptions, "apiOptions");
        Intrinsics.checkNotNullParameter(apiRequestFactory, "apiRequestFactory");
        this.requestExecutor = requestExecutor;
        this.apiOptions = apiOptions;
        this.apiRequestFactory = apiRequestFactory;
    }

    @Override // com.stripe.android.financialconnections.repository.api.FinancialConnectionsConsumersApiService
    public Object postConsumerSession(String str, String str2, String str3, Continuation<? super ConsumerSessionLookup> continuation) {
        ApiRequest.Factory factory = this.apiRequestFactory;
        ApiRequest.Options options = this.apiOptions;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return this.requestExecutor.execute(ApiRequest.Factory.createPost$default(factory, consumerSessionsUrl, options, CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("email_address", lowerCase), TuplesKt.to("client_secret", str2), TuplesKt.to("request_surface", str3))), false, 8, null), ConsumerSessionLookup.INSTANCE.serializer(), continuation);
    }

    /* compiled from: FinancialConnectionsConsumersApiService.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiServiceImpl$Companion;", "", "<init>", "()V", "consumerSessionsUrl", "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
