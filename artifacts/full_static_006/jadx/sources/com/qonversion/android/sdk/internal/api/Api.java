package com.qonversion.android.sdk.internal.api;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.automations.mvp.ScreenActivity;
import com.qonversion.android.sdk.dto.QRemoteConfig;
import com.qonversion.android.sdk.dto.properties.QUserProperty;
import com.qonversion.android.sdk.internal.Constants;
import com.qonversion.android.sdk.internal.dto.ActionPoints;
import com.qonversion.android.sdk.internal.dto.BaseResponse;
import com.qonversion.android.sdk.internal.dto.Data;
import com.qonversion.android.sdk.internal.dto.QLaunchResult;
import com.qonversion.android.sdk.internal.dto.Response;
import com.qonversion.android.sdk.internal.dto.SendPropertiesResult;
import com.qonversion.android.sdk.internal.dto.automations.Screen;
import com.qonversion.android.sdk.internal.dto.eligibility.EligibilityResult;
import com.qonversion.android.sdk.internal.dto.identity.IdentityResult;
import com.qonversion.android.sdk.internal.dto.request.AttachUserRequest;
import com.qonversion.android.sdk.internal.dto.request.AttributionRequest;
import com.qonversion.android.sdk.internal.dto.request.CrashRequest;
import com.qonversion.android.sdk.internal.dto.request.EligibilityRequest;
import com.qonversion.android.sdk.internal.dto.request.IdentityRequest;
import com.qonversion.android.sdk.internal.dto.request.InitRequest;
import com.qonversion.android.sdk.internal.dto.request.PurchaseRequest;
import com.qonversion.android.sdk.internal.dto.request.RestoreRequest;
import com.qonversion.android.sdk.internal.dto.request.ViewsRequest;
import com.qonversion.android.sdk.internal.dto.request.data.UserPropertyRequestData;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/* compiled from: Api.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\tH'J,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\u000eH'J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001e\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00032\b\b\u0001\u0010\r\u001a\u00020\u0013H'J\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\r\u001a\u00020\u00152\b\b\u0003\u0010\u0016\u001a\u00020\u0007H'J\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001e\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00110\u00032\b\b\u0001\u0010\r\u001a\u00020\u001bH'J\u001e\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001e\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00040\u00032\b\b\u0001\u0010\r\u001a\u00020!H'J(\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00110\u00032\b\b\u0001\u0010\r\u001a\u00020$2\b\b\u0001\u0010%\u001a\u00020\u0007H'J2\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00110\u00032\b\b\u0001\u0010\r\u001a\u00020'2\b\b\u0001\u0010%\u001a\u00020\u00072\b\b\u0001\u0010(\u001a\u00020)H'J$\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\u0007H'J(\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001d0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010.\u001a\u00020/H'J8\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001d0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u000e\b\u0001\u00100\u001a\b\u0012\u0004\u0012\u00020\u00070\u001d2\b\b\u0001\u00101\u001a\u00020/H'J(\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00110\u00032\b\b\u0001\u0010\r\u001a\u0002032\b\b\u0001\u0010%\u001a\u00020\u0007H'J\u001e\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u00040\u00032\b\b\u0001\u00106\u001a\u00020\u0007H'J(\u00107\u001a\b\u0012\u0004\u0012\u0002080\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u000e\b\u0001\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u001dH'J\"\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u00106\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020<H'¨\u0006="}, d2 = {"Lcom/qonversion/android/sdk/internal/api/Api;", "", "actionPoints", "Lretrofit2/Call;", "Lcom/qonversion/android/sdk/internal/dto/Data;", "Lcom/qonversion/android/sdk/internal/dto/ActionPoints;", "userId", "", "params", "", "attachUserToExperiment", "Ljava/lang/Void;", "experimentId", "request", "Lcom/qonversion/android/sdk/internal/dto/request/AttachUserRequest;", "attachUserToRemoteConfiguration", "attribution", "Lcom/qonversion/android/sdk/internal/dto/BaseResponse;", "Lcom/qonversion/android/sdk/internal/dto/Response;", "Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;", "crashLogs", "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;", "url", "detachUserFromExperiment", "detachUserFromRemoteConfiguration", "eligibility", "Lcom/qonversion/android/sdk/internal/dto/eligibility/EligibilityResult;", "Lcom/qonversion/android/sdk/internal/dto/request/EligibilityRequest;", "getProperties", "", "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;", "identify", "Lcom/qonversion/android/sdk/internal/dto/identity/IdentityResult;", "Lcom/qonversion/android/sdk/internal/dto/request/IdentityRequest;", "init", "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;", "Lcom/qonversion/android/sdk/internal/dto/request/InitRequest;", "trigger", "purchase", "Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;", "attemptNumber", "", "remoteConfig", "Lcom/qonversion/android/sdk/dto/QRemoteConfig;", "contextKey", "remoteConfigList", "allContextKeys", "", "contextKeys", "includeEmptyContextKey", "restore", "Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;", "screens", "Lcom/qonversion/android/sdk/internal/dto/automations/Screen;", ScreenActivity.INTENT_SCREEN_ID, "sendProperties", "Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;", "properties", "Lcom/qonversion/android/sdk/internal/dto/request/data/UserPropertyRequestData;", "views", "Lcom/qonversion/android/sdk/internal/dto/request/ViewsRequest;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface Api {
    @GET("v2/users/{id}/action-points")
    Call<Data<ActionPoints>> actionPoints(@Path("id") String userId, @QueryMap Map<String, String> params);

    @POST("v3/experiments/{id}/users/{user_id}")
    Call<Void> attachUserToExperiment(@Path("id") String experimentId, @Path("user_id") String userId, @Body AttachUserRequest request);

    @POST("v3/remote-configurations/{id}/users/{user_id}")
    Call<Void> attachUserToRemoteConfiguration(@Path("id") String experimentId, @Path("user_id") String userId);

    @POST("attribution")
    Call<BaseResponse<Response>> attribution(@Body AttributionRequest request);

    @Headers({"Content-Type: application/json"})
    @POST
    Call<Void> crashLogs(@Body CrashRequest request, @Url String url);

    @DELETE("v3/experiments/{id}/users/{user_id}")
    Call<Void> detachUserFromExperiment(@Path("id") String experimentId, @Path("user_id") String userId);

    @DELETE("v3/remote-configurations/{id}/users/{user_id}")
    Call<Void> detachUserFromRemoteConfiguration(@Path("id") String experimentId, @Path("user_id") String userId);

    @POST("v1/products/get")
    Call<BaseResponse<EligibilityResult>> eligibility(@Body EligibilityRequest request);

    @GET("v3/users/{user_id}/properties")
    Call<List<QUserProperty>> getProperties(@Path("user_id") String userId);

    @POST("v2/identities")
    Call<Data<IdentityResult>> identify(@Body IdentityRequest request);

    @POST("v1/user/init")
    Call<BaseResponse<QLaunchResult>> init(@Body InitRequest request, @Header("Trigger") String trigger);

    @POST("v1/user/purchase")
    Call<BaseResponse<QLaunchResult>> purchase(@Body PurchaseRequest request, @Header("Trigger") String trigger, @Header("Attempt") int attemptNumber);

    @GET("v3/remote-config")
    Call<QRemoteConfig> remoteConfig(@Query("user_id") String userId, @Query("context_key") String contextKey);

    @GET("v3/remote-configs")
    Call<List<QRemoteConfig>> remoteConfigList(@Query("user_id") String userId, @Query("context_key") List<String> contextKeys, @Query("with_empty_context_key") boolean includeEmptyContextKey);

    @GET("v3/remote-configs")
    Call<List<QRemoteConfig>> remoteConfigList(@Query("user_id") String userId, @Query("all_context_keys") boolean allContextKeys);

    @POST("v1/user/restore")
    Call<BaseResponse<QLaunchResult>> restore(@Body RestoreRequest request, @Header("Trigger") String trigger);

    @GET("v2/screens/{id}")
    Call<Data<Screen>> screens(@Path("id") String screenId);

    @POST("v3/users/{user_id}/properties")
    Call<SendPropertiesResult> sendProperties(@Path("user_id") String userId, @Body List<UserPropertyRequestData> properties);

    @POST("/v2/screens/{id}/views")
    Call<Void> views(@Path("id") String screenId, @Body ViewsRequest request);

    /* compiled from: Api.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ Call crashLogs$default(Api api, CrashRequest crashRequest, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: crashLogs");
            }
            if ((i & 2) != 0) {
                str = Constants.CRASH_LOGS_URL;
            }
            return api.crashLogs(crashRequest, str);
        }

        public static /* synthetic */ Call remoteConfigList$default(Api api, String str, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: remoteConfigList");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return api.remoteConfigList(str, z);
        }
    }
}
