.class public final Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;
.super Ljava/lang/Object;
.source "QDependencyInjector.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J%\u0010\u0008\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0000\u00a2\u0006\u0002\u0008\u000fR\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0080.\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;",
        "",
        "()V",
        "<set-?>",
        "Lcom/qonversion/android/sdk/internal/di/component/AppComponent;",
        "appComponent",
        "getAppComponent$sdk_release",
        "()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;",
        "buildAppComponent",
        "context",
        "Landroid/app/Application;",
        "internalConfig",
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "appStateProvider",
        "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;",
        "buildAppComponent$sdk_release",
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
.field public static final INSTANCE:Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;

.field private static appComponent:Lcom/qonversion/android/sdk/internal/di/component/AppComponent;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;

    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;-><init>()V

    sput-object v0, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->INSTANCE:Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final buildAppComponent$sdk_release(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;)Lcom/qonversion/android/sdk/internal/di/component/AppComponent;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "internalConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appStateProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-static {}, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->builder()Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;

    move-result-object v0

    .line 23
    new-instance v1, Lcom/qonversion/android/sdk/internal/di/module/AppModule;

    invoke-direct {v1, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/di/module/AppModule;-><init>(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;)V

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->appModule(Lcom/qonversion/android/sdk/internal/di/module/AppModule;)Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;

    move-result-object p1

    .line 24
    new-instance p2, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

    invoke-direct {p2}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;-><init>()V

    invoke-virtual {p1, p2}, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->repositoryModule(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;)Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;

    move-result-object p1

    .line 25
    new-instance p2, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;

    invoke-direct {p2}, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;-><init>()V

    invoke-virtual {p1, p2}, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->managersModule(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;)Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;

    move-result-object p1

    .line 26
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->build()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    move-result-object p1

    const-string p2, "build(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    sput-object p1, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->appComponent:Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 28
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    move-result-object p1

    return-object p1
.end method

.method public final getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;
    .locals 1

    .line 13
    sget-object v0, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->appComponent:Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "appComponent"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method
