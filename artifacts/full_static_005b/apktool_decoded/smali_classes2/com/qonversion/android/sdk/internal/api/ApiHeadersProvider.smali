.class public final Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;
.super Ljava/lang/Object;
.source "ApiHeadersProvider.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nApiHeadersProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiHeadersProvider.kt\ncom/qonversion/android/sdk/internal/api/ApiHeadersProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n1855#2:84\n1856#2:86\n1#3:85\n*S KotlinDebug\n*F\n+ 1 ApiHeadersProvider.kt\ncom/qonversion/android/sdk/internal/api/ApiHeadersProvider\n*L\n30#1:84\n30#1:86\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\t\u0008\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u000e\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000cJ\u001c\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u000c\u0012\n \u0010*\u0004\u0018\u00010\n0\n0\u000fH\u0002J\u0010\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\n0\nH\u0002J\u0006\u0010\u0012\u001a\u00020\nJ\u0006\u0010\u0013\u001a\u00020\nJ\u0006\u0010\u0014\u001a\u00020\nJ\u0006\u0010\u0015\u001a\u00020\nJ\u0006\u0010\u0016\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;",
        "",
        "config",
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "sharedPreferencesCache",
        "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;",
        "environmentProvider",
        "Lcom/qonversion/android/sdk/internal/EnvironmentProvider;",
        "(Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;)V",
        "projectKey",
        "",
        "getHeaders",
        "Lokhttp3/Headers;",
        "specificHeaders",
        "getHeadersMap",
        "",
        "kotlin.jvm.PlatformType",
        "getLocale",
        "getPlatform",
        "getPlatformVersion",
        "getProjectKey",
        "getSource",
        "getSourceVersion",
        "Companion",
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


# static fields
.field public static final ANDROID_PLATFORM:Ljava/lang/String; = "android"

.field public static final APP_VERSION:Ljava/lang/String; = "app-version"

.field public static final AUTHORIZATION:Ljava/lang/String; = "Authorization"

.field public static final CONTENT_TYPE:Ljava/lang/String; = "Content-Type"

.field public static final Companion:Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider$Companion;

.field public static final DEBUG_MODE_KEY:Ljava/lang/String; = "test_"

.field public static final PLATFORM:Ljava/lang/String; = "Platform"

.field public static final PLATFORM_VERSION:Ljava/lang/String; = "Platform-Version"

.field public static final PREFS_SOURCE_KEY:Ljava/lang/String; = "com.qonversion.keys.source"

.field public static final PREFS_SOURCE_VERSION_KEY:Ljava/lang/String; = "com.qonversion.keys.sourceVersion"

.field public static final SOURCE:Ljava/lang/String; = "Source"

.field public static final SOURCE_VERSION:Ljava/lang/String; = "Source-Version"

.field public static final UID:Ljava/lang/String; = "User-Id"

.field public static final USER_LOCALE:Ljava/lang/String; = "User-Locale"


# instance fields
.field private final config:Lcom/qonversion/android/sdk/internal/InternalConfig;

.field private final environmentProvider:Lcom/qonversion/android/sdk/internal/EnvironmentProvider;

.field private final projectKey:Ljava/lang/String;

.field private final sharedPreferencesCache:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->Companion:Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sharedPreferencesCache"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "environmentProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->config:Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 14
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->sharedPreferencesCache:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    .line 15
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->environmentProvider:Lcom/qonversion/android/sdk/internal/EnvironmentProvider;

    .line 17
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/InternalConfig;->isSandbox()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 18
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getPrimaryConfig()Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    move-result-object p1

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;->getProjectKey()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "test_"

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getPrimaryConfig()Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    move-result-object p1

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;->getProjectKey()Ljava/lang/String;

    move-result-object p1

    .line 17
    :goto_0
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->projectKey:Ljava/lang/String;

    return-void
.end method

.method private final getHeadersMap()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x9

    .line 39
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "Content-Type"

    const-string v2, "application/json"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 40
    sget-object v1, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->Companion:Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider$Companion;

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->getProjectKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider$Companion;->getBearer(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Authorization"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 41
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->environmentProvider:Lcom/qonversion/android/sdk/internal/EnvironmentProvider;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;->getVersionName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "app-version"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 42
    const-string v1, "User-Locale"

    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->getLocale()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 43
    const-string v1, "Source"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->getSource()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 44
    const-string v1, "Source-Version"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->getSourceVersion()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    .line 45
    const-string v1, "Platform"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->getPlatform()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    .line 46
    const-string v1, "Platform-Version"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->getPlatformVersion()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    .line 47
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->config:Lcom/qonversion/android/sdk/internal/InternalConfig;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getUid()Ljava/lang/String;

    move-result-object v1

    const-string v2, "User-Id"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    .line 38
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private final getLocale()Ljava/lang/String;
    .locals 1

    .line 23
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final getHeaders(Lokhttp3/Headers;)Lokhttp3/Headers;
    .locals 4

    const-string v0, "specificHeaders"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    new-instance v0, Lokhttp3/Headers$Builder;

    invoke-direct {v0}, Lokhttp3/Headers$Builder;-><init>()V

    .line 27
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->getHeadersMap()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 28
    invoke-virtual {v0, v3, v2}, Lokhttp3/Headers$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;

    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p1}, Lokhttp3/Headers;->names()Ljava/util/Set;

    move-result-object v1

    const-string v2, "names(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    .line 84
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 31
    invoke-virtual {p1, v2}, Lokhttp3/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 32
    invoke-virtual {v0, v2, v3}, Lokhttp3/Headers$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;

    goto :goto_1

    .line 35
    :cond_2
    invoke-virtual {v0}, Lokhttp3/Headers$Builder;->build()Lokhttp3/Headers;

    move-result-object p1

    const-string v0, "build(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getPlatform()Ljava/lang/String;
    .locals 1

    .line 52
    const-string v0, "android"

    return-object v0
.end method

.method public final getPlatformVersion()Ljava/lang/String;
    .locals 2

    .line 54
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    const-string v1, "RELEASE"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getProjectKey()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->projectKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getSource()Ljava/lang/String;
    .locals 3

    .line 57
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->sharedPreferencesCache:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    const-string v1, "com.qonversion.keys.source"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "android"

    :cond_0
    return-object v0
.end method

.method public final getSourceVersion()Ljava/lang/String;
    .locals 3

    .line 60
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->sharedPreferencesCache:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    const-string v1, "com.qonversion.keys.sourceVersion"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->config:Lcom/qonversion/android/sdk/internal/InternalConfig;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getPrimaryConfig()Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;->getSdkVersion()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method
