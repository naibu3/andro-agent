.class public final Lcom/qonversion/android/sdk/internal/EnvironmentProvider;
.super Ljava/lang/Object;
.source "EnvironmentProvider.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/EnvironmentProvider$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\n \u0008*\u0004\u0018\u00010\u00060\u0006H\u0002J\u0008\u0010\t\u001a\u00020\u0006H\u0003J\u0012\u0010\n\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\n \u0008*\u0004\u0018\u00010\u00060\u0006H\u0002J\u0010\u0010\u000e\u001a\n \u0008*\u0004\u0018\u00010\u00060\u0006H\u0002J\u0006\u0010\u000f\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/EnvironmentProvider;",
        "",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "getCarrier",
        "",
        "getCountry",
        "kotlin.jvm.PlatformType",
        "getDeviceId",
        "getInfo",
        "Lcom/qonversion/android/sdk/internal/dto/Environment;",
        "idfa",
        "getLocale",
        "getTimeZone",
        "getVersionName",
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
.field public static final Companion:Lcom/qonversion/android/sdk/internal/EnvironmentProvider$Companion;

.field private static final UNKNOWN:Ljava/lang/String; = "UNKNOWN"


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/internal/EnvironmentProvider$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/EnvironmentProvider$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;->Companion:Lcom/qonversion/android/sdk/internal/EnvironmentProvider$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;->context:Landroid/content/Context;

    return-void
.end method

.method private final getCarrier()Ljava/lang/String;
    .locals 2

    .line 58
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;->context:Landroid/content/Context;

    const-string v1, "phone"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.telephony.TelephonyManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 59
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getNetworkOperatorName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final getCountry()Ljava/lang/String;
    .locals 1

    .line 64
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final getDeviceId()Ljava/lang/String;
    .locals 2

    .line 55
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "android_id"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic getInfo$default(Lcom/qonversion/android/sdk/internal/EnvironmentProvider;Ljava/lang/String;ILjava/lang/Object;)Lcom/qonversion/android/sdk/internal/dto/Environment;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 20
    :cond_0
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;->getInfo(Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/Environment;

    move-result-object p0

    return-object p0
.end method

.method private final getLocale()Ljava/lang/String;
    .locals 1

    .line 62
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final getTimeZone()Ljava/lang/String;
    .locals 1

    .line 66
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final getInfo(Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/Environment;
    .locals 14

    .line 20
    new-instance v13, Lcom/qonversion/android/sdk/internal/dto/Environment;

    .line 21
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;->getVersionName()Ljava/lang/String;

    move-result-object v1

    .line 22
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;->getCarrier()Ljava/lang/String;

    move-result-object v2

    .line 23
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;->getDeviceId()Ljava/lang/String;

    move-result-object v3

    .line 24
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;->getLocale()Ljava/lang/String;

    move-result-object v4

    const-string v0, "getLocale(...)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    sget-object v5, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v0, "MANUFACTURER"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v0, "MODEL"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/device/Os;

    const/4 v7, 0x0

    const/4 v8, 0x3

    invoke-direct {v0, v7, v7, v8, v7}, Lcom/qonversion/android/sdk/internal/dto/device/Os;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/device/Os;->getName()Ljava/lang/String;

    move-result-object v9

    .line 28
    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/device/Os;

    invoke-direct {v0, v7, v7, v8, v7}, Lcom/qonversion/android/sdk/internal/dto/device/Os;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/device/Os;->getVersion()Ljava/lang/String;

    move-result-object v8

    .line 29
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;->getTimeZone()Ljava/lang/String;

    move-result-object v10

    const-string v0, "getTimeZone(...)"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;->getCountry()Ljava/lang/String;

    move-result-object v11

    const-string v0, "getCountry(...)"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    const-string v12, "android"

    move-object v0, v13

    move-object v7, v9

    move-object v9, v10

    move-object v10, v12

    move-object v12, p1

    invoke-direct/range {v0 .. v12}, Lcom/qonversion/android/sdk/internal/dto/Environment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v13
.end method

.method public final getVersionName()Ljava/lang/String;
    .locals 4

    .line 37
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    .line 38
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 39
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-wide/16 v2, 0x0

    .line 40
    invoke-static {v2, v3}, Landroid/content/pm/PackageManager$PackageInfoFlags;->of(J)Landroid/content/pm/PackageManager$PackageInfoFlags;

    move-result-object v2

    .line 38
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;Landroid/content/pm/PackageManager$PackageInfoFlags;)Landroid/content/pm/PackageInfo;

    move-result-object v0

    goto :goto_0

    .line 44
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 47
    :goto_0
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 36
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 49
    :catchall_0
    const-string v0, "UNKNOWN"

    :goto_1
    return-object v0
.end method
