.class public final Lcom/stripe/android/core/networking/ApiRequest$Factory;
.super Ljava/lang/Object;
.source "ApiRequest.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/core/networking/ApiRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J6\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\r2\u0014\u0008\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\u0008\u0003\u0018\u00010\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0011J6\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\r2\u0014\u0008\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\u0008\u0003\u0018\u00010\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0011J,\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\r2\u0014\u0008\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\u0008\u0003\u0018\u00010\u000fR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
        "",
        "appInfo",
        "Lcom/stripe/android/core/AppInfo;",
        "apiVersion",
        "",
        "sdkVersion",
        "<init>",
        "(Lcom/stripe/android/core/AppInfo;Ljava/lang/String;Ljava/lang/String;)V",
        "createGet",
        "Lcom/stripe/android/core/networking/ApiRequest;",
        "url",
        "options",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "params",
        "",
        "shouldCache",
        "",
        "createPost",
        "createDelete",
        "stripe-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final apiVersion:Ljava/lang/String;

.field private final appInfo:Lcom/stripe/android/core/AppInfo;

.field private final sdkVersion:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/core/networking/ApiRequest$Factory;-><init>(Lcom/stripe/android/core/AppInfo;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/core/AppInfo;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "apiVersion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkVersion"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 142
    iput-object p1, p0, Lcom/stripe/android/core/networking/ApiRequest$Factory;->appInfo:Lcom/stripe/android/core/AppInfo;

    .line 143
    iput-object p2, p0, Lcom/stripe/android/core/networking/ApiRequest$Factory;->apiVersion:Ljava/lang/String;

    .line 144
    iput-object p3, p0, Lcom/stripe/android/core/networking/ApiRequest$Factory;->sdkVersion:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/core/AppInfo;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 143
    sget-object p2, Lcom/stripe/android/core/ApiVersion;->Companion:Lcom/stripe/android/core/ApiVersion$Companion;

    invoke-virtual {p2}, Lcom/stripe/android/core/ApiVersion$Companion;->get()Lcom/stripe/android/core/ApiVersion;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/core/ApiVersion;->getCode()Ljava/lang/String;

    move-result-object p2

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 144
    const-string p3, "AndroidBindings/21.22.2"

    .line 141
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/core/networking/ApiRequest$Factory;-><init>(Lcom/stripe/android/core/AppInfo;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic createDelete$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 182
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createDelete(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const/4 p3, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const/4 p4, 0x0

    .line 146
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;Z)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const/4 p3, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const/4 p4, 0x0

    .line 164
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;Z)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final createDelete(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;)Lcom/stripe/android/core/networking/ApiRequest;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;)",
            "Lcom/stripe/android/core/networking/ApiRequest;"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    new-instance v1, Lcom/stripe/android/core/networking/ApiRequest;

    .line 188
    sget-object v2, Lcom/stripe/android/core/networking/StripeRequest$Method;->DELETE:Lcom/stripe/android/core/networking/StripeRequest$Method;

    .line 192
    iget-object v6, p0, Lcom/stripe/android/core/networking/ApiRequest$Factory;->appInfo:Lcom/stripe/android/core/AppInfo;

    .line 193
    iget-object v7, p0, Lcom/stripe/android/core/networking/ApiRequest$Factory;->apiVersion:Ljava/lang/String;

    .line 194
    iget-object v8, p0, Lcom/stripe/android/core/networking/ApiRequest$Factory;->sdkVersion:Ljava/lang/String;

    const/16 v10, 0x80

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v3, p1

    move-object v5, p2

    move-object v4, p3

    .line 187
    invoke-direct/range {v1 .. v11}, Lcom/stripe/android/core/networking/ApiRequest;-><init>(Lcom/stripe/android/core/networking/StripeRequest$Method;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/AppInfo;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final createGet(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;Z)Lcom/stripe/android/core/networking/ApiRequest;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;Z)",
            "Lcom/stripe/android/core/networking/ApiRequest;"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    new-instance v1, Lcom/stripe/android/core/networking/ApiRequest;

    .line 153
    sget-object v2, Lcom/stripe/android/core/networking/StripeRequest$Method;->GET:Lcom/stripe/android/core/networking/StripeRequest$Method;

    .line 157
    iget-object v6, p0, Lcom/stripe/android/core/networking/ApiRequest$Factory;->appInfo:Lcom/stripe/android/core/AppInfo;

    .line 158
    iget-object v7, p0, Lcom/stripe/android/core/networking/ApiRequest$Factory;->apiVersion:Ljava/lang/String;

    .line 159
    iget-object v8, p0, Lcom/stripe/android/core/networking/ApiRequest$Factory;->sdkVersion:Ljava/lang/String;

    move-object v3, p1

    move-object v5, p2

    move-object v4, p3

    move v9, p4

    .line 152
    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/core/networking/ApiRequest;-><init>(Lcom/stripe/android/core/networking/StripeRequest$Method;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/AppInfo;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v1
.end method

.method public final createPost(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;Z)Lcom/stripe/android/core/networking/ApiRequest;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;Z)",
            "Lcom/stripe/android/core/networking/ApiRequest;"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    new-instance v1, Lcom/stripe/android/core/networking/ApiRequest;

    .line 171
    sget-object v2, Lcom/stripe/android/core/networking/StripeRequest$Method;->POST:Lcom/stripe/android/core/networking/StripeRequest$Method;

    .line 175
    iget-object v6, p0, Lcom/stripe/android/core/networking/ApiRequest$Factory;->appInfo:Lcom/stripe/android/core/AppInfo;

    .line 176
    iget-object v7, p0, Lcom/stripe/android/core/networking/ApiRequest$Factory;->apiVersion:Ljava/lang/String;

    .line 177
    iget-object v8, p0, Lcom/stripe/android/core/networking/ApiRequest$Factory;->sdkVersion:Ljava/lang/String;

    move-object v3, p1

    move-object v5, p2

    move-object v4, p3

    move v9, p4

    .line 170
    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/core/networking/ApiRequest;-><init>(Lcom/stripe/android/core/networking/StripeRequest$Method;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/AppInfo;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v1
.end method
