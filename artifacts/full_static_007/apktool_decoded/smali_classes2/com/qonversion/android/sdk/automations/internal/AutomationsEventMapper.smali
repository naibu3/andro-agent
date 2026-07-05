.class public final Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;
.super Ljava/lang/Object;
.source "AutomationsEventMapper.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAutomationsEventMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutomationsEventMapper.kt\ncom/qonversion/android/sdk/automations/internal/AutomationsEventMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0008R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;",
        "",
        "logger",
        "Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "(Lcom/qonversion/android/sdk/internal/logger/Logger;)V",
        "getEventFromRemoteMessage",
        "Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;",
        "messageData",
        "",
        "",
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
.field public static final Companion:Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper$Companion;

.field private static final EVENT:Ljava/lang/String; = "qonv.event"

.field private static final EVENT_DATE:Ljava/lang/String; = "happened"

.field private static final EVENT_NAME:Ljava/lang/String; = "name"

.field private static final EVENT_PRODUCT_ID:Ljava/lang/String; = "product_id"


# instance fields
.field private final logger:Lcom/qonversion/android/sdk/internal/logger/Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;->Companion:Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/qonversion/android/sdk/internal/logger/Logger;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    return-void
.end method


# virtual methods
.method public final getEventFromRemoteMessage(Ljava/util/Map;)Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;"
        }
    .end annotation

    const-string v0, "messageData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 15
    :try_start_0
    const-string v1, "qonv.event"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    return-object v0

    .line 17
    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 18
    const-string p1, "name"

    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 19
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v2, p1

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_1

    return-object v0

    .line 23
    :cond_1
    const-string v2, "happened"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-nez v4, :cond_2

    .line 25
    new-instance v2, Ljava/util/Date;

    invoke-static {}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getCurrentTimeInMillis()J

    move-result-wide v3

    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    goto :goto_0

    .line 27
    :cond_2
    new-instance v4, Ljava/util/Date;

    invoke-static {v2, v3}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->secondsToMilliSeconds(J)J

    move-result-wide v2

    invoke-direct {v4, v2, v3}, Ljava/util/Date;-><init>(J)V

    move-object v2, v4

    .line 30
    :goto_0
    const-string v3, "product_id"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 31
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v3, v1

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_3

    goto :goto_1

    :cond_3
    move-object v1, v0

    .line 33
    :goto_1
    sget-object v3, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->Companion:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType$Companion;

    invoke-virtual {v3, p1}, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType$Companion;->fromType(Ljava/lang/String;)Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    move-result-object p1

    .line 34
    sget-object v3, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->Unknown:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    if-eq p1, v3, :cond_4

    .line 35
    new-instance v3, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;

    invoke-direct {v3, p1, v2, v1}, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;-><init>(Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;Ljava/util/Date;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v3

    :cond_4
    return-object v0

    .line 40
    :catch_0
    iget-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    const-string v1, "getEventFromRemoteMessage() -> Failed to retrieve event that triggered push notification"

    invoke-interface {p1, v1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->error(Ljava/lang/String;)V

    return-object v0
.end method
