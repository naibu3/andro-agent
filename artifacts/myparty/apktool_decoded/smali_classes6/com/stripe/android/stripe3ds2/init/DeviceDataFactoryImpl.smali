.class public final Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;
.super Ljava/lang/Object;
.source "DeviceDataFactoryImpl.kt"

# interfaces
.implements Lcom/stripe/android/stripe3ds2/init/DeviceDataFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B!\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ,\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\"0!2\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020%H\u0097@\u00a2\u0006\u0002\u0010&J\n\u0010\'\u001a\u0004\u0018\u00010\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u000c\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0016\u001a\n \u000e*\u0004\u0018\u00010\u00170\u0017X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0013X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u001c\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u001d\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;",
        "Lcom/stripe/android/stripe3ds2/init/DeviceDataFactory;",
        "context",
        "Landroid/content/Context;",
        "appInfoRepository",
        "Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;",
        "messageVersionRegistry",
        "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;",
        "<init>",
        "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;)V",
        "displayMetrics",
        "Landroid/util/DisplayMetrics;",
        "defaultUserAgent",
        "",
        "kotlin.jvm.PlatformType",
        "Ljava/lang/String;",
        "telephonyManager",
        "Landroid/telephony/TelephonyManager;",
        "secureFRPMode",
        "",
        "audioManager",
        "Landroid/media/AudioManager;",
        "packageManager",
        "Landroid/content/pm/PackageManager;",
        "Landroid/content/pm/PackageManager;",
        "apiVersion",
        "dateFormat",
        "Ljava/text/SimpleDateFormat;",
        "dateTime",
        "codeName",
        "osName",
        "timeZone",
        "create",
        "",
        "",
        "sdkReferenceNumber",
        "sdkTransactionId",
        "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;",
        "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "buildCodeName",
        "Companion",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$Companion;

.field private static final MILLIS_IN_SECOND:I = 0x3e8

.field private static final SECONDS_IN_MINUTE:I = 0x3c


# instance fields
.field private final apiVersion:I

.field private final appInfoRepository:Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;

.field private final audioManager:Landroid/media/AudioManager;

.field private final codeName:Ljava/lang/String;

.field private final dateFormat:Ljava/text/SimpleDateFormat;

.field private final dateTime:Ljava/lang/String;

.field private final defaultUserAgent:Ljava/lang/String;

.field private final displayMetrics:Landroid/util/DisplayMetrics;

.field private final messageVersionRegistry:Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;

.field private final osName:Ljava/lang/String;

.field private final packageManager:Landroid/content/pm/PackageManager;

.field private final secureFRPMode:I

.field private final telephonyManager:Landroid/telephony/TelephonyManager;

.field private final timeZone:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->Companion:Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appInfoRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageVersionRegistry"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->appInfoRepository:Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;

    .line 28
    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->messageVersionRegistry:Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;

    .line 30
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    const-string p3, "getDisplayMetrics(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->displayMetrics:Landroid/util/DisplayMetrics;

    .line 31
    invoke-static {p1}, Landroid/webkit/WebSettings;->getDefaultUserAgent(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->defaultUserAgent:Ljava/lang/String;

    .line 33
    const-string p2, "phone"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    const-string p3, "null cannot be cast to non-null type android.telephony.TelephonyManager"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/telephony/TelephonyManager;

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->telephonyManager:Landroid/telephony/TelephonyManager;

    .line 35
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p2

    const-string p3, "secure_frp_mode"

    const/4 v0, 0x0

    invoke-static {p2, p3, v0}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p2

    iput p2, p0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->secureFRPMode:I

    .line 36
    const-string p2, "audio"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    const-string p3, "null cannot be cast to non-null type android.media.AudioManager"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/media/AudioManager;

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->audioManager:Landroid/media/AudioManager;

    .line 37
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->packageManager:Landroid/content/pm/PackageManager;

    .line 38
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    iput p1, p0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->apiVersion:I

    .line 39
    new-instance p2, Ljava/text/SimpleDateFormat;

    const-string p3, "yyyyMMddHHmmss"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-direct {p2, p3, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->dateFormat:Ljava/text/SimpleDateFormat;

    .line 40
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p3

    invoke-virtual {p3}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->dateTime:Ljava/lang/String;

    .line 42
    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->buildCodeName()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_0

    const-string p2, "UNKNOWN"

    :cond_0
    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->codeName:Ljava/lang/String;

    .line 43
    sget-object p3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Android "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v0, " "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string p3, " API "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->osName:Ljava/lang/String;

    .line 44
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/TimeZone;->getRawOffset()I

    move-result p1

    div-int/lit16 p1, p1, 0x3e8

    div-int/lit8 p1, p1, 0x3c

    iput p1, p0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->timeZone:I

    return-void
.end method

.method private final buildCodeName()Ljava/lang/String;
    .locals 6

    .line 118
    const-class v0, Landroid/os/Build$VERSION_CODES;

    invoke-virtual {v0}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    const-string v1, "getFields(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 120
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "getName(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    :try_start_0
    new-instance v5, Ljava/lang/Object;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v3, v5}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v3
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const/4 v3, -0x1

    .line 130
    :goto_1
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ne v3, v5, :cond_0

    return-object v4

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public create(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$create$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$create$1;

    iget v1, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$create$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$create$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$create$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$create$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$create$1;-><init>(Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$create$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 46
    iget v2, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$create$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$create$1;->I$0:I

    iget-object p2, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$create$1;->L$5:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object v1, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$create$1;->L$4:Ljava/lang/Object;

    check-cast v1, [Lkotlin/Pair;

    iget-object v2, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$create$1;->L$3:Ljava/lang/Object;

    check-cast v2, [Lkotlin/Pair;

    iget-object v4, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$create$1;->L$2:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    iget-object v5, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$create$1;->L$1:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v0, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$create$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    const/16 p3, 0xd

    .line 52
    new-array p3, p3, [Lkotlin/Pair;

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_PLATFORM:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v4, "Android"

    invoke-static {v2, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v4, 0x0

    aput-object v2, p3, v4

    .line 53
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_DEVICE_MODEL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v5, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, "||"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, p3, v3

    .line 54
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_OS_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v5, p0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->osName:Ljava/lang/String;

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v5, 0x2

    aput-object v2, p3, v5

    .line 55
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_OS_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v6, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-static {v2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v6, 0x3

    aput-object v2, p3, v6

    .line 56
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_LOCALE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    .line 57
    new-array v6, v3, [Ljava/util/Locale;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v7

    aput-object v7, v6, v4

    invoke-static {v6}, Landroidx/core/os/LocaleListCompat;->create([Ljava/util/Locale;)Landroidx/core/os/LocaleListCompat;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/core/os/LocaleListCompat;->toLanguageTags()Ljava/lang/String;

    move-result-object v4

    .line 56
    invoke-static {v2, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v4, 0x4

    aput-object v2, p3, v4

    .line 58
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TIME_ZONE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    iget v4, p0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->timeZone:I

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v4, 0x5

    aput-object v2, p3, v4

    .line 59
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SCREEN_RESOLUTION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    .line 60
    sget-object v4, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 61
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 63
    iget-object v6, p0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->displayMetrics:Landroid/util/DisplayMetrics;

    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v6

    .line 64
    iget-object v7, p0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->displayMetrics:Landroid/util/DisplayMetrics;

    iget v7, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array {v6, v7}, [Ljava/lang/Object;

    move-result-object v6

    .line 60
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    const-string v6, "%sx%s"

    invoke-static {v4, v6, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "format(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    invoke-static {v2, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v4, 0x6

    aput-object v2, p3, v4

    .line 66
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SDK_APP_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->appInfoRepository:Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;

    iput-object p0, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$create$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$create$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$create$1;->L$2:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$create$1;->L$3:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$create$1;->L$4:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$create$1;->L$5:Ljava/lang/Object;

    const/4 v5, 0x7

    iput v5, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$create$1;->I$0:I

    iput v3, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl$create$1;->label:I

    invoke-interface {v4, v0}, Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;->get(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move v1, v5

    move-object v5, p1

    move p1, v1

    move-object v4, p2

    move-object v1, p3

    move-object p2, v2

    move-object v2, v1

    move-object p3, v0

    move-object v0, p0

    :goto_1
    check-cast p3, Lcom/stripe/android/stripe3ds2/init/AppInfo;

    invoke-virtual {p3}, Lcom/stripe/android/stripe3ds2/init/AppInfo;->getSdkAppId()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    aput-object p2, v1, p1

    .line 67
    sget-object p1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SDK_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p2, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->messageVersionRegistry:Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;

    invoke-virtual {p2}, Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;->getCurrent()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/16 p2, 0x8

    aput-object p1, v2, p2

    .line 68
    sget-object p1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SDK_REF_NUMBER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/16 p2, 0x9

    aput-object p1, v2, p2

    .line 69
    sget-object p1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_DATE_TIME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p2, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->dateTime:Ljava/lang/String;

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/16 p2, 0xa

    aput-object p1, v2, p2

    .line 70
    sget-object p1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SDK_TRANS_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/16 p2, 0xb

    aput-object p1, v2, p2

    .line 71
    sget-object p1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WEB_VIEW_USER_AGENT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p2, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->defaultUserAgent:Ljava/lang/String;

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/16 p2, 0xc

    aput-object p1, v2, p2

    .line 51
    invoke-static {v2}, Lkotlin/collections/MapsKt;->hashMapOf([Lkotlin/Pair;)Ljava/util/HashMap;

    move-result-object p1

    .line 74
    iget p2, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->apiVersion:I

    const/16 p3, 0x1c

    if-lt p2, p3, :cond_4

    .line 75
    move-object p2, p1

    check-cast p2, Ljava/util/Map;

    sget-object p3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SIM_CARRIER_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {p3}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object p3

    .line 76
    iget-object v1, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->telephonyManager:Landroid/telephony/TelephonyManager;

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getSimCarrierId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, p3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    sget-object p3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SIM_CARRIER_ID_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {p3}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object p3

    .line 78
    iget-object v1, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->telephonyManager:Landroid/telephony/TelephonyManager;

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getSimCarrierIdName()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, p3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    :cond_4
    iget p2, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->apiVersion:I

    const/16 p3, 0x1d

    if-lt p2, p3, :cond_5

    .line 82
    move-object p2, p1

    check-cast p2, Ljava/util/Map;

    sget-object p3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SIM_SPECIFIC_CARRIER_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {p3}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object p3

    .line 83
    iget-object v1, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->telephonyManager:Landroid/telephony/TelephonyManager;

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getSimSpecificCarrierId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, p3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    sget-object p3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SIM_SPECIFIC_CARRIER_ID_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {p3}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object p3

    .line 85
    iget-object v1, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->telephonyManager:Landroid/telephony/TelephonyManager;

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getSimSpecificCarrierIdName()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, p3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    iget-object p3, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->packageManager:Landroid/content/pm/PackageManager;

    const-string v1, "android.hardware.telephony.ims"

    invoke-virtual {p3, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_5

    .line 88
    sget-object p3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_RTT_CALLING_MODE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {p3}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object p3

    .line 89
    iget-object v1, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->telephonyManager:Landroid/telephony/TelephonyManager;

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->isRttSupported()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, p3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    :cond_5
    iget p2, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->apiVersion:I

    const/16 p3, 0x1e

    if-lt p2, p3, :cond_7

    .line 94
    move-object p2, p1

    check-cast p2, Ljava/util/Map;

    sget-object p3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SUBSCRIPTION_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {p3}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object p3

    .line 95
    iget-object v1, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->telephonyManager:Landroid/telephony/TelephonyManager;

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getSubscriptionId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, p3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    sget-object p3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_FRP_MODE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {p3}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object p3

    .line 97
    iget v1, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->secureFRPMode:I

    if-ne v1, v3, :cond_6

    const-string v1, "true"

    goto :goto_2

    :cond_6
    const-string v1, "false"

    :goto_2
    invoke-interface {p2, p3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    :cond_7
    iget p2, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->apiVersion:I

    const/16 p3, 0x1f

    if-lt p2, p3, :cond_8

    .line 101
    move-object p2, p1

    check-cast p2, Ljava/util/Map;

    sget-object p3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_HARDWARE_SKU:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {p3}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object p3

    .line 102
    sget-object v1, Landroid/os/Build;->SKU:Ljava/lang/String;

    invoke-interface {p2, p3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    sget-object p3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SOC_MANUFACTURER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {p3}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object p3

    .line 104
    sget-object v1, Landroid/os/Build;->SOC_MANUFACTURER:Ljava/lang/String;

    invoke-interface {p2, p3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    sget-object p3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SOC_MODEL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {p3}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object p3

    .line 106
    sget-object v1, Landroid/os/Build;->SOC_MODEL:Ljava/lang/String;

    invoke-interface {p2, p3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    :cond_8
    iget p2, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->apiVersion:I

    const/16 p3, 0x21

    if-lt p2, p3, :cond_9

    .line 110
    move-object p2, p1

    check-cast p2, Ljava/util/Map;

    sget-object p3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_APPLY_RAMPING_RINGER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {p3}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object p3

    .line 111
    iget-object v0, v0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->audioManager:Landroid/media/AudioManager;

    invoke-virtual {v0}, Landroid/media/AudioManager;->isRampingRingerEnabled()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    return-object p1
.end method
