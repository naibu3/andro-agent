package com.stripe.android.financialconnections.lite.di;

import com.stripe.android.core.ApiVersion;
import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import com.stripe.android.financialconnections.lite.network.FinancialConnectionsLiteRequestExecutor;
import com.stripe.android.financialconnections.lite.repository.FinancialConnectionsLiteRepository;
import com.stripe.android.financialconnections.lite.repository.FinancialConnectionsLiteRepositoryImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* compiled from: Di.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/financialconnections/lite/di/Di;", "", "<init>", "()V", "apiVersion", "Lcom/stripe/android/core/ApiVersion;", "apiRequestFactory", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "json", "Lkotlinx/serialization/json/Json;", "workContext", "Lkotlinx/coroutines/CoroutineDispatcher;", "getWorkContext", "()Lkotlinx/coroutines/CoroutineDispatcher;", "logger", "Lcom/stripe/android/core/Logger;", "getLogger", "()Lcom/stripe/android/core/Logger;", "repository", "Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepository;", "financial-connections-lite_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Di {
    public static final Di INSTANCE = new Di();
    private static final ApiRequest.Factory apiRequestFactory;
    private static final ApiVersion apiVersion;
    private static final Json json;
    private static final Logger logger;
    private static final CoroutineDispatcher workContext;

    private Di() {
    }

    static {
        ApiVersion apiVersion2 = new ApiVersion(SetsKt.setOf("financial_connections_client_api_beta=v1"));
        apiVersion = apiVersion2;
        apiRequestFactory = new ApiRequest.Factory(null, apiVersion2.getCode(), null, 5, null);
        json = JsonKt.Json$default(null, new Function1() { // from class: com.stripe.android.financialconnections.lite.di.Di$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Di.json$lambda$0((JsonBuilder) obj);
            }
        }, 1, null);
        workContext = Dispatchers.getIO();
        logger = Logger.INSTANCE.getInstance(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    public final CoroutineDispatcher getWorkContext() {
        return workContext;
    }

    public final Logger getLogger() {
        return logger;
    }

    public final FinancialConnectionsLiteRepository repository() {
        CoroutineDispatcher coroutineDispatcher = workContext;
        Logger logger2 = logger;
        return new FinancialConnectionsLiteRepositoryImpl(new FinancialConnectionsLiteRequestExecutor(new DefaultStripeNetworkClient(coroutineDispatcher, null, null, 0, logger2, 14, null), json, logger2), apiRequestFactory);
    }
}
