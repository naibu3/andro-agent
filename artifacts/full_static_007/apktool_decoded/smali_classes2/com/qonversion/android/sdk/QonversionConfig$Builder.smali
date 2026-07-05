.class public final Lcom/qonversion/android/sdk/QonversionConfig$Builder;
.super Ljava/lang/Object;
.source "QonversionConfig.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/QonversionConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0006\u00100\u001a\u000201J\u0006\u00102\u001a\u00020\u0000J\u0006\u00103\u001a\u00020\u0000J\u000e\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u00020\nJ\u000e\u00106\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u00107\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u00108\u001a\u00020\u00002\u0008\u0008\u0001\u00109\u001a\u00020\u001cJ\u000e\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\"\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 R\u001a\u0010\"\u001a\u00020#X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010(\u001a\u0004\u0018\u00010\u0005X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008)\u0010*\"\u0004\u0008+\u0010,R\u001a\u0010-\u001a\u00020#X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008.\u0010%\"\u0004\u0008/\u0010\'\u00a8\u0006<"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/QonversionConfig$Builder;",
        "",
        "context",
        "Landroid/content/Context;",
        "projectKey",
        "",
        "launchMode",
        "Lcom/qonversion/android/sdk/dto/QLaunchMode;",
        "(Landroid/content/Context;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QLaunchMode;)V",
        "entitlementsCacheLifetime",
        "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;",
        "getEntitlementsCacheLifetime$sdk_release",
        "()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;",
        "setEntitlementsCacheLifetime$sdk_release",
        "(Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;)V",
        "entitlementsUpdateListener",
        "Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;",
        "getEntitlementsUpdateListener$sdk_release",
        "()Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;",
        "setEntitlementsUpdateListener$sdk_release",
        "(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V",
        "environment",
        "Lcom/qonversion/android/sdk/dto/QEnvironment;",
        "getEnvironment$sdk_release",
        "()Lcom/qonversion/android/sdk/dto/QEnvironment;",
        "setEnvironment$sdk_release",
        "(Lcom/qonversion/android/sdk/dto/QEnvironment;)V",
        "fallbackFileIdentifier",
        "",
        "getFallbackFileIdentifier$sdk_release",
        "()Ljava/lang/Integer;",
        "setFallbackFileIdentifier$sdk_release",
        "(Ljava/lang/Integer;)V",
        "Ljava/lang/Integer;",
        "isKidsMode",
        "",
        "isKidsMode$sdk_release",
        "()Z",
        "setKidsMode$sdk_release",
        "(Z)V",
        "proxyUrl",
        "getProxyUrl$sdk_release",
        "()Ljava/lang/String;",
        "setProxyUrl$sdk_release",
        "(Ljava/lang/String;)V",
        "sendFbAttribution",
        "getSendFbAttribution$sdk_release",
        "setSendFbAttribution$sdk_release",
        "build",
        "Lcom/qonversion/android/sdk/QonversionConfig;",
        "disableFacebookAttribution",
        "enableKidsMode",
        "setEntitlementsCacheLifetime",
        "lifetime",
        "setEntitlementsUpdateListener",
        "setEnvironment",
        "setFallbackFileIdentifier",
        "id",
        "setProxyURL",
        "url",
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


# instance fields
.field private final context:Landroid/content/Context;

.field private entitlementsCacheLifetime:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

.field private entitlementsUpdateListener:Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;

.field private environment:Lcom/qonversion/android/sdk/dto/QEnvironment;

.field private fallbackFileIdentifier:Ljava/lang/Integer;

.field private isKidsMode:Z

.field private final launchMode:Lcom/qonversion/android/sdk/dto/QLaunchMode;

.field private final projectKey:Ljava/lang/String;

.field private proxyUrl:Ljava/lang/String;

.field private sendFbAttribution:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QLaunchMode;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "projectKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "launchMode"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->context:Landroid/content/Context;

    .line 45
    iput-object p2, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->projectKey:Ljava/lang/String;

    .line 46
    iput-object p3, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->launchMode:Lcom/qonversion/android/sdk/dto/QLaunchMode;

    .line 48
    sget-object p1, Lcom/qonversion/android/sdk/dto/QEnvironment;->Production:Lcom/qonversion/android/sdk/dto/QEnvironment;

    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->environment:Lcom/qonversion/android/sdk/dto/QEnvironment;

    .line 49
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->Month:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->entitlementsCacheLifetime:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    const/4 p1, 0x1

    .line 53
    iput-boolean p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->sendFbAttribution:Z

    return-void
.end method


# virtual methods
.method public final build()Lcom/qonversion/android/sdk/QonversionConfig;
    .locals 13

    .line 154
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->projectKey:Ljava/lang/String;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 157
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->environment:Lcom/qonversion/android/sdk/dto/QEnvironment;

    sget-object v1, Lcom/qonversion/android/sdk/dto/QEnvironment;->Production:Lcom/qonversion/android/sdk/dto/QEnvironment;

    const-string v2, "Qonversion"

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->isDebuggable(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 158
    const-string v0, "Environment level is set to Production for debug build."

    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 159
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->environment:Lcom/qonversion/android/sdk/dto/QEnvironment;

    sget-object v1, Lcom/qonversion/android/sdk/dto/QEnvironment;->Sandbox:Lcom/qonversion/android/sdk/dto/QEnvironment;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->isDebuggable(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 160
    const-string v0, "Environment level is set to Sandbox for release build."

    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 163
    :cond_1
    :goto_0
    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    iget-object v4, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->projectKey:Ljava/lang/String;

    iget-object v5, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->launchMode:Lcom/qonversion/android/sdk/dto/QLaunchMode;

    iget-object v6, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->environment:Lcom/qonversion/android/sdk/dto/QEnvironment;

    iget-object v7, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->proxyUrl:Ljava/lang/String;

    iget-boolean v8, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->isKidsMode:Z

    iget-boolean v9, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->sendFbAttribution:Z

    const/16 v11, 0x40

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v12}, Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;-><init>(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QLaunchMode;Lcom/qonversion/android/sdk/dto/QEnvironment;Ljava/lang/String;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 164
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;

    iget-object v2, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->entitlementsCacheLifetime:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    iget-object v3, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->fallbackFileIdentifier:Ljava/lang/Integer;

    invoke-direct {v1, v2, v3}, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;-><init>(Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;Ljava/lang/Integer;)V

    .line 166
    new-instance v2, Lcom/qonversion/android/sdk/QonversionConfig;

    .line 167
    iget-object v3, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->context:Landroid/content/Context;

    invoke-static {v3}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->getApplication(Landroid/content/Context;)Landroid/app/Application;

    move-result-object v3

    .line 170
    iget-object v4, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->entitlementsUpdateListener:Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;

    .line 166
    invoke-direct {v2, v3, v0, v1, v4}, Lcom/qonversion/android/sdk/QonversionConfig;-><init>(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V

    return-object v2

    .line 155
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Project key is empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final disableFacebookAttribution()Lcom/qonversion/android/sdk/QonversionConfig$Builder;
    .locals 1

    .line 142
    move-object v0, p0

    check-cast v0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;

    const/4 v0, 0x0

    .line 143
    iput-boolean v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->sendFbAttribution:Z

    return-object p0
.end method

.method public final enableKidsMode()Lcom/qonversion/android/sdk/QonversionConfig$Builder;
    .locals 1

    .line 133
    move-object v0, p0

    check-cast v0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;

    const/4 v0, 0x1

    .line 134
    iput-boolean v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->isKidsMode:Z

    return-object p0
.end method

.method public final getEntitlementsCacheLifetime$sdk_release()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->entitlementsCacheLifetime:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    return-object v0
.end method

.method public final getEntitlementsUpdateListener$sdk_release()Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->entitlementsUpdateListener:Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;

    return-object v0
.end method

.method public final getEnvironment$sdk_release()Lcom/qonversion/android/sdk/dto/QEnvironment;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->environment:Lcom/qonversion/android/sdk/dto/QEnvironment;

    return-object v0
.end method

.method public final getFallbackFileIdentifier$sdk_release()Ljava/lang/Integer;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->fallbackFileIdentifier:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getProxyUrl$sdk_release()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->proxyUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getSendFbAttribution$sdk_release()Z
    .locals 1

    .line 53
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->sendFbAttribution:Z

    return v0
.end method

.method public final isKidsMode$sdk_release()Z
    .locals 1

    .line 52
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->isKidsMode:Z

    return v0
.end method

.method public final setEntitlementsCacheLifetime(Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;)Lcom/qonversion/android/sdk/QonversionConfig$Builder;
    .locals 1

    const-string v0, "lifetime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    move-object v0, p0

    check-cast v0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;

    .line 76
    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->entitlementsCacheLifetime:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    return-object p0
.end method

.method public final setEntitlementsCacheLifetime$sdk_release(Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->entitlementsCacheLifetime:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    return-void
.end method

.method public final setEntitlementsUpdateListener(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)Lcom/qonversion/android/sdk/QonversionConfig$Builder;
    .locals 1

    const-string v0, "entitlementsUpdateListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    move-object v0, p0

    check-cast v0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;

    .line 107
    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->entitlementsUpdateListener:Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;

    return-object p0
.end method

.method public final setEntitlementsUpdateListener$sdk_release(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->entitlementsUpdateListener:Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;

    return-void
.end method

.method public final setEnvironment(Lcom/qonversion/android/sdk/dto/QEnvironment;)Lcom/qonversion/android/sdk/QonversionConfig$Builder;
    .locals 1

    const-string v0, "environment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    move-object v0, p0

    check-cast v0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;

    .line 64
    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->environment:Lcom/qonversion/android/sdk/dto/QEnvironment;

    return-object p0
.end method

.method public final setEnvironment$sdk_release(Lcom/qonversion/android/sdk/dto/QEnvironment;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->environment:Lcom/qonversion/android/sdk/dto/QEnvironment;

    return-void
.end method

.method public final setFallbackFileIdentifier(I)Lcom/qonversion/android/sdk/QonversionConfig$Builder;
    .locals 1

    .line 92
    move-object v0, p0

    check-cast v0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;

    .line 93
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->fallbackFileIdentifier:Ljava/lang/Integer;

    return-object p0
.end method

.method public final setFallbackFileIdentifier$sdk_release(Ljava/lang/Integer;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->fallbackFileIdentifier:Ljava/lang/Integer;

    return-void
.end method

.method public final setKidsMode$sdk_release(Z)V
    .locals 0

    .line 52
    iput-boolean p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->isKidsMode:Z

    return-void
.end method

.method public final setProxyURL(Ljava/lang/String;)Lcom/qonversion/android/sdk/QonversionConfig$Builder;
    .locals 6

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    move-object v0, p0

    check-cast v0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;

    .line 119
    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->proxyUrl:Ljava/lang/String;

    .line 120
    const-string v0, "http://"

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "https://"

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 121
    iget-object v4, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->proxyUrl:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->proxyUrl:Ljava/lang/String;

    .line 124
    :cond_0
    const-string v0, "/"

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 125
    iget-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->proxyUrl:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->proxyUrl:Ljava/lang/String;

    :cond_1
    return-object p0
.end method

.method public final setProxyUrl$sdk_release(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->proxyUrl:Ljava/lang/String;

    return-void
.end method

.method public final setSendFbAttribution$sdk_release(Z)V
    .locals 0

    .line 53
    iput-boolean p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->sendFbAttribution:Z

    return-void
.end method
