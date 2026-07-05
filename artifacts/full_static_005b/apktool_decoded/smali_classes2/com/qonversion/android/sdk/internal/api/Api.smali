.class public interface abstract Lcom/qonversion/android/sdk/internal/api/Api;
.super Ljava/lang/Object;
.source "Api.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/api/Api$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008`\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00072\u0014\u0008\u0001\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\tH\'J,\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00032\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0001\u0010\r\u001a\u00020\u000eH\'J\"\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00032\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\u0010\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00120\u00110\u00032\u0008\u0008\u0001\u0010\r\u001a\u00020\u0013H\'J\"\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00032\u0008\u0008\u0001\u0010\r\u001a\u00020\u00152\u0008\u0008\u0003\u0010\u0016\u001a\u00020\u0007H\'J\"\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00032\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007H\'J\"\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00032\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\u0019\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001a0\u00110\u00032\u0008\u0008\u0001\u0010\r\u001a\u00020\u001bH\'J\u001e\u0010\u001c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001e0\u001d0\u00032\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\u001f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u00040\u00032\u0008\u0008\u0001\u0010\r\u001a\u00020!H\'J(\u0010\"\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020#0\u00110\u00032\u0008\u0008\u0001\u0010\r\u001a\u00020$2\u0008\u0008\u0001\u0010%\u001a\u00020\u0007H\'J2\u0010&\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020#0\u00110\u00032\u0008\u0008\u0001\u0010\r\u001a\u00020\'2\u0008\u0008\u0001\u0010%\u001a\u00020\u00072\u0008\u0008\u0001\u0010(\u001a\u00020)H\'J$\u0010*\u001a\u0008\u0012\u0004\u0012\u00020+0\u00032\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00072\n\u0008\u0001\u0010,\u001a\u0004\u0018\u00010\u0007H\'J(\u0010-\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020+0\u001d0\u00032\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0003\u0010.\u001a\u00020/H\'J8\u0010-\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020+0\u001d0\u00032\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00072\u000e\u0008\u0001\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u001d2\u0008\u0008\u0001\u00101\u001a\u00020/H\'J(\u00102\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020#0\u00110\u00032\u0008\u0008\u0001\u0010\r\u001a\u0002032\u0008\u0008\u0001\u0010%\u001a\u00020\u0007H\'J\u001e\u00104\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002050\u00040\u00032\u0008\u0008\u0001\u00106\u001a\u00020\u0007H\'J(\u00107\u001a\u0008\u0012\u0004\u0012\u0002080\u00032\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00072\u000e\u0008\u0001\u00109\u001a\u0008\u0012\u0004\u0012\u00020:0\u001dH\'J\"\u0010;\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00032\u0008\u0008\u0001\u00106\u001a\u00020\u00072\u0008\u0008\u0001\u0010\r\u001a\u00020<H\'\u00a8\u0006="
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/api/Api;",
        "",
        "actionPoints",
        "Lretrofit2/Call;",
        "Lcom/qonversion/android/sdk/internal/dto/Data;",
        "Lcom/qonversion/android/sdk/internal/dto/ActionPoints;",
        "userId",
        "",
        "params",
        "",
        "attachUserToExperiment",
        "Ljava/lang/Void;",
        "experimentId",
        "request",
        "Lcom/qonversion/android/sdk/internal/dto/request/AttachUserRequest;",
        "attachUserToRemoteConfiguration",
        "attribution",
        "Lcom/qonversion/android/sdk/internal/dto/BaseResponse;",
        "Lcom/qonversion/android/sdk/internal/dto/Response;",
        "Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;",
        "crashLogs",
        "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;",
        "url",
        "detachUserFromExperiment",
        "detachUserFromRemoteConfiguration",
        "eligibility",
        "Lcom/qonversion/android/sdk/internal/dto/eligibility/EligibilityResult;",
        "Lcom/qonversion/android/sdk/internal/dto/request/EligibilityRequest;",
        "getProperties",
        "",
        "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;",
        "identify",
        "Lcom/qonversion/android/sdk/internal/dto/identity/IdentityResult;",
        "Lcom/qonversion/android/sdk/internal/dto/request/IdentityRequest;",
        "init",
        "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;",
        "Lcom/qonversion/android/sdk/internal/dto/request/InitRequest;",
        "trigger",
        "purchase",
        "Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;",
        "attemptNumber",
        "",
        "remoteConfig",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
        "contextKey",
        "remoteConfigList",
        "allContextKeys",
        "",
        "contextKeys",
        "includeEmptyContextKey",
        "restore",
        "Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;",
        "screens",
        "Lcom/qonversion/android/sdk/internal/dto/automations/Screen;",
        "screenId",
        "sendProperties",
        "Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;",
        "properties",
        "Lcom/qonversion/android/sdk/internal/dto/request/data/UserPropertyRequestData;",
        "views",
        "Lcom/qonversion/android/sdk/internal/dto/request/ViewsRequest;",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract actionPoints(Ljava/lang/String;Ljava/util/Map;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Path;
            value = "id"
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation runtime Lretrofit2/http/QueryMap;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/qonversion/android/sdk/internal/dto/Data<",
            "Lcom/qonversion/android/sdk/internal/dto/ActionPoints;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v2/users/{id}/action-points"
    .end annotation
.end method

.method public abstract attachUserToExperiment(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/request/AttachUserRequest;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Path;
            value = "id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Path;
            value = "user_id"
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/internal/dto/request/AttachUserRequest;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/dto/request/AttachUserRequest;",
            ")",
            "Lretrofit2/Call<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v3/experiments/{id}/users/{user_id}"
    .end annotation
.end method

.method public abstract attachUserToRemoteConfiguration(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Path;
            value = "id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Path;
            value = "user_id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v3/remote-configurations/{id}/users/{user_id}"
    .end annotation
.end method

.method public abstract attribution(Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;)Lretrofit2/Call;
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/qonversion/android/sdk/internal/dto/BaseResponse<",
            "Lcom/qonversion/android/sdk/internal/dto/Response;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "attribution"
    .end annotation
.end method

.method public abstract crashLogs(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Url;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/Headers;
        value = {
            "Content-Type: application/json"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
    .end annotation
.end method

.method public abstract detachUserFromExperiment(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Path;
            value = "id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Path;
            value = "user_id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/DELETE;
        value = "v3/experiments/{id}/users/{user_id}"
    .end annotation
.end method

.method public abstract detachUserFromRemoteConfiguration(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Path;
            value = "id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Path;
            value = "user_id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/DELETE;
        value = "v3/remote-configurations/{id}/users/{user_id}"
    .end annotation
.end method

.method public abstract eligibility(Lcom/qonversion/android/sdk/internal/dto/request/EligibilityRequest;)Lretrofit2/Call;
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/request/EligibilityRequest;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/dto/request/EligibilityRequest;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/qonversion/android/sdk/internal/dto/BaseResponse<",
            "Lcom/qonversion/android/sdk/internal/dto/eligibility/EligibilityResult;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/products/get"
    .end annotation
.end method

.method public abstract getProperties(Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Path;
            value = "user_id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v3/users/{user_id}/properties"
    .end annotation
.end method

.method public abstract identify(Lcom/qonversion/android/sdk/internal/dto/request/IdentityRequest;)Lretrofit2/Call;
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/request/IdentityRequest;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/dto/request/IdentityRequest;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/qonversion/android/sdk/internal/dto/Data<",
            "Lcom/qonversion/android/sdk/internal/dto/identity/IdentityResult;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v2/identities"
    .end annotation
.end method

.method public abstract init(Lcom/qonversion/android/sdk/internal/dto/request/InitRequest;Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/request/InitRequest;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Header;
            value = "Trigger"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/dto/request/InitRequest;",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/qonversion/android/sdk/internal/dto/BaseResponse<",
            "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/user/init"
    .end annotation
.end method

.method public abstract purchase(Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;Ljava/lang/String;I)Lretrofit2/Call;
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Header;
            value = "Trigger"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lretrofit2/http/Header;
            value = "Attempt"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;",
            "Ljava/lang/String;",
            "I)",
            "Lretrofit2/Call<",
            "Lcom/qonversion/android/sdk/internal/dto/BaseResponse<",
            "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/user/purchase"
    .end annotation
.end method

.method public abstract remoteConfig(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "user_id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "context_key"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v3/remote-config"
    .end annotation
.end method

.method public abstract remoteConfigList(Ljava/lang/String;Ljava/util/List;Z)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "user_id"
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation runtime Lretrofit2/http/Query;
            value = "context_key"
        .end annotation
    .end param
    .param p3    # Z
        .annotation runtime Lretrofit2/http/Query;
            value = "with_empty_context_key"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)",
            "Lretrofit2/Call<",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v3/remote-configs"
    .end annotation
.end method

.method public abstract remoteConfigList(Ljava/lang/String;Z)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "user_id"
        .end annotation
    .end param
    .param p2    # Z
        .annotation runtime Lretrofit2/http/Query;
            value = "all_context_keys"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Lretrofit2/Call<",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v3/remote-configs"
    .end annotation
.end method

.method public abstract restore(Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Header;
            value = "Trigger"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/qonversion/android/sdk/internal/dto/BaseResponse<",
            "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/user/restore"
    .end annotation
.end method

.method public abstract screens(Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Path;
            value = "id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/qonversion/android/sdk/internal/dto/Data<",
            "Lcom/qonversion/android/sdk/internal/dto/automations/Screen;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v2/screens/{id}"
    .end annotation
.end method

.method public abstract sendProperties(Ljava/lang/String;Ljava/util/List;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Path;
            value = "user_id"
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/dto/request/data/UserPropertyRequestData;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v3/users/{user_id}/properties"
    .end annotation
.end method

.method public abstract views(Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/request/ViewsRequest;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Path;
            value = "id"
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/dto/request/ViewsRequest;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/dto/request/ViewsRequest;",
            ")",
            "Lretrofit2/Call<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v2/screens/{id}/views"
    .end annotation
.end method
