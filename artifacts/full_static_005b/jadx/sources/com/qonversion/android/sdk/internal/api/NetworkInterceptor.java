package com.qonversion.android.sdk.internal.api;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.internal.HttpError;
import com.qonversion.android.sdk.internal.InternalConfig;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: NetworkInterceptor.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;", "Lokhttp3/Interceptor;", "headersProvider", "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;", "apiHelper", "Lcom/qonversion/android/sdk/internal/api/ApiHelper;", "config", "Lcom/qonversion/android/sdk/internal/InternalConfig;", "(Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/qonversion/android/sdk/internal/api/ApiHelper;Lcom/qonversion/android/sdk/internal/InternalConfig;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class NetworkInterceptor implements Interceptor {
    private static final List<Integer> FATAL_ERRORS = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(TypedValues.CycleType.TYPE_CURVE_FIT), Integer.valueOf(TypedValues.CycleType.TYPE_VISIBILITY), Integer.valueOf(TypedValues.CycleType.TYPE_ALPHA)});
    private final ApiHelper apiHelper;
    private final InternalConfig config;
    private final ApiHeadersProvider headersProvider;

    @Inject
    public NetworkInterceptor(ApiHeadersProvider headersProvider, ApiHelper apiHelper, InternalConfig config) {
        Intrinsics.checkNotNullParameter(headersProvider, "headersProvider");
        Intrinsics.checkNotNullParameter(apiHelper, "apiHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        this.headersProvider = headersProvider;
        this.apiHelper = apiHelper;
        this.config = config;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        HttpError fatalError = this.config.getFatalError();
        if (fatalError != null) {
            Response responseBuild = new Response.Builder().code(fatalError.getCode()).body(ResponseBody.create((MediaType) null, "")).protocol(Protocol.HTTP_2).message(fatalError.getMessage()).request(chain.request()).build();
            Intrinsics.checkNotNull(responseBuild);
            return responseBuild;
        }
        Request request = chain.request();
        Request.Builder builderNewBuilder = request.newBuilder();
        ApiHeadersProvider apiHeadersProvider = this.headersProvider;
        Headers headers = request.headers();
        Intrinsics.checkNotNullExpressionValue(headers, "headers(...)");
        Request requestBuild = builderNewBuilder.headers(apiHeadersProvider.getHeaders(headers)).build();
        Response responseProceed = chain.proceed(requestBuild);
        if (FATAL_ERRORS.contains(Integer.valueOf(responseProceed.code()))) {
            ApiHelper apiHelper = this.apiHelper;
            Intrinsics.checkNotNull(requestBuild);
            if (apiHelper.isDeprecatedEndpoint(requestBuild)) {
                InternalConfig internalConfig = this.config;
                int iCode = responseProceed.code();
                String strMessage = responseProceed.message();
                Intrinsics.checkNotNullExpressionValue(strMessage, "message(...)");
                internalConfig.setFatalError(new HttpError(iCode, strMessage));
            }
        }
        Intrinsics.checkNotNull(responseProceed);
        return responseProceed;
    }
}
