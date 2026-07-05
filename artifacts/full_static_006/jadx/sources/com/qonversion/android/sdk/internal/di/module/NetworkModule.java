package com.qonversion.android.sdk.internal.di.module;

import android.app.Application;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.api.ApiHeadersProvider;
import com.qonversion.android.sdk.internal.api.ApiHelper;
import com.qonversion.android.sdk.internal.api.NetworkInterceptor;
import com.qonversion.android.sdk.internal.api.RateLimiter;
import com.qonversion.android.sdk.internal.di.scope.ApplicationScope;
import com.qonversion.android.sdk.internal.dto.QDateAdapter;
import com.qonversion.android.sdk.internal.dto.QEligibilityAdapter;
import com.qonversion.android.sdk.internal.dto.QEligibilityStatusAdapter;
import com.qonversion.android.sdk.internal.dto.QEntitlementGrantTypeAdapter;
import com.qonversion.android.sdk.internal.dto.QEntitlementSourceAdapter;
import com.qonversion.android.sdk.internal.dto.QExperimentGroupTypeAdapter;
import com.qonversion.android.sdk.internal.dto.QOfferingAdapter;
import com.qonversion.android.sdk.internal.dto.QOfferingTagAdapter;
import com.qonversion.android.sdk.internal.dto.QOfferingsAdapter;
import com.qonversion.android.sdk.internal.dto.QPermissionsAdapter;
import com.qonversion.android.sdk.internal.dto.QProductRenewStateAdapter;
import com.qonversion.android.sdk.internal.dto.QProductsAdapter;
import com.qonversion.android.sdk.internal.dto.QRemoteConfigListAdapter;
import com.qonversion.android.sdk.internal.dto.QRemoteConfigurationSourceAssignmentTypeAdapter;
import com.qonversion.android.sdk.internal.dto.QRemoteConfigurationSourceTypeAdapter;
import com.qonversion.android.sdk.internal.dto.QTransactionEnvironmentAdapter;
import com.qonversion.android.sdk.internal.dto.QTransactionOwnershipTypeAdapter;
import com.qonversion.android.sdk.internal.dto.QTransactionTypeAdapter;
import com.squareup.moshi.Moshi;
import dagger.Module;
import dagger.Provides;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* compiled from: NetworkModule.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0007J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u001b"}, d2 = {"Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;", "", "()V", "provideApiHelper", "Lcom/qonversion/android/sdk/internal/api/ApiHelper;", "internalConfig", "Lcom/qonversion/android/sdk/internal/InternalConfig;", "provideHeadersInterceptor", "Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;", "apiHeadersProvider", "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;", "config", "apiHelper", "provideMoshi", "Lcom/squareup/moshi/Moshi;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "context", "Landroid/app/Application;", "interceptor", "provideRateLimiter", "Lcom/qonversion/android/sdk/internal/api/RateLimiter;", "provideRetrofit", "Lretrofit2/Retrofit;", "client", "moshi", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Module
/* loaded from: classes2.dex */
public final class NetworkModule {
    private static final long CACHE_SIZE = 10485776;
    private static final int MAX_SIMILAR_API_REQUESTS_PER_SECOND = 5;
    private static final long TIMEOUT = 30;

    @Provides
    @ApplicationScope
    public final Retrofit provideRetrofit(OkHttpClient client, Moshi moshi, InternalConfig internalConfig) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(internalConfig, "internalConfig");
        Retrofit retrofitBuild = new Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(moshi)).baseUrl(internalConfig.getApiUrl()).client(client).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @Provides
    @ApplicationScope
    public final Moshi provideMoshi() {
        Moshi moshiBuild = new Moshi.Builder().add(new QDateAdapter()).add(new QProductsAdapter()).add(new QPermissionsAdapter()).add(new QProductRenewStateAdapter()).add(new QEntitlementSourceAdapter()).add(new QOfferingsAdapter()).add(new QOfferingAdapter()).add(new QOfferingTagAdapter()).add(new QRemoteConfigListAdapter()).add(new QExperimentGroupTypeAdapter()).add(new QRemoteConfigurationSourceTypeAdapter()).add(new QRemoteConfigurationSourceAssignmentTypeAdapter()).add(new QEligibilityStatusAdapter()).add(new QEligibilityAdapter()).add(new QTransactionOwnershipTypeAdapter()).add(new QTransactionTypeAdapter()).add(new QTransactionEnvironmentAdapter()).add(new QEntitlementGrantTypeAdapter()).build();
        Intrinsics.checkNotNullExpressionValue(moshiBuild, "build(...)");
        return moshiBuild;
    }

    @Provides
    @ApplicationScope
    public final OkHttpClient provideOkHttpClient(Application context, NetworkInterceptor interceptor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        OkHttpClient okHttpClientBuild = new OkHttpClient.Builder().cache(new Cache(context.getCacheDir(), CACHE_SIZE)).readTimeout(TIMEOUT, TimeUnit.SECONDS).connectTimeout(TIMEOUT, TimeUnit.SECONDS).addInterceptor(interceptor).build();
        Intrinsics.checkNotNullExpressionValue(okHttpClientBuild, "build(...)");
        return okHttpClientBuild;
    }

    @Provides
    @ApplicationScope
    public final NetworkInterceptor provideHeadersInterceptor(ApiHeadersProvider apiHeadersProvider, InternalConfig config, ApiHelper apiHelper) {
        Intrinsics.checkNotNullParameter(apiHeadersProvider, "apiHeadersProvider");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(apiHelper, "apiHelper");
        return new NetworkInterceptor(apiHeadersProvider, apiHelper, config);
    }

    @Provides
    @ApplicationScope
    public final ApiHelper provideApiHelper(InternalConfig internalConfig) {
        Intrinsics.checkNotNullParameter(internalConfig, "internalConfig");
        return new ApiHelper(internalConfig.getApiUrl());
    }

    @Provides
    @ApplicationScope
    public final RateLimiter provideRateLimiter() {
        return new RateLimiter(5);
    }
}
