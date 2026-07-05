.class public final Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;
.super Ljava/lang/Object;
.source "ScreenProcessor.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nScreenProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenProcessor.kt\ncom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n1855#2,2:118\n*S KotlinDebug\n*F\n+ 1 ScreenProcessor.kt\ncom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor\n*L\n39#1:118,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0006H\u0002Jd\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\r\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u0013\u0012\u0004\u0012\u00020\u000b0\u00102!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0015\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u0016\u0012\u0004\u0012\u00020\u000b0\u0010H\u0002JT\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\r2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\r\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u0013\u0012\u0004\u0012\u00020\u000b0\u00102!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0015\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u0016\u0012\u0004\u0012\u00020\u000b0\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;",
        "",
        "()V",
        "logger",
        "Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;",
        "convertMatchResultToMacros",
        "",
        "Lcom/qonversion/android/sdk/automations/internal/macros/Macros;",
        "matchResults",
        "Lkotlin/text/MatchResult;",
        "processMacroses",
        "",
        "originalHtml",
        "",
        "macroses",
        "onComplete",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "processedHtml",
        "onError",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "error",
        "processScreen",
        "html",
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
.field public static final Companion:Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$Companion;

.field private static final MACROS_BRACKETS_NUMBER:I = 0x2

.field private static final MACROS_CATEGORY_KEY:Ljava/lang/String; = "category"

.field private static final MACROS_ID_KEY:Ljava/lang/String; = "uid"

.field private static final MACROS_PRODUCT_CATEGORY:Ljava/lang/String; = "product"

.field private static final MACROS_REGEX:Ljava/lang/String; = "\\[\\[.*?\\]\\]"

.field private static final MACROS_TYPE_KEY:Ljava/lang/String; = "type"


# instance fields
.field private final logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;->Companion:Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;-><init>()V

    iput-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    return-void
.end method

.method private final convertMatchResultToMacros(Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lkotlin/text/MatchResult;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/automations/internal/macros/Macros;",
            ">;"
        }
    .end annotation

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    .line 39
    check-cast p1, Ljava/lang/Iterable;

    .line 118
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/text/MatchResult;

    .line 40
    invoke-interface {v1}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x2

    .line 42
    invoke-static {v1, v2}, Lkotlin/text/StringsKt;->drop(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/text/StringsKt;->dropLast(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    .line 45
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 47
    const-string v2, "category"

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 48
    const-string v4, "type"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 49
    const-string v5, "uid"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 51
    const-string v5, "product"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v2, v3

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    .line 56
    :cond_0
    sget-object v2, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;->Companion:Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType$Companion;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, v4}, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType$Companion;->fromType(Ljava/lang/String;)Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;

    move-result-object v2

    .line 57
    new-instance v4, Lcom/qonversion/android/sdk/automations/internal/macros/Macros;

    invoke-direct {v4, v2, v3, v1}, Lcom/qonversion/android/sdk/automations/internal/macros/Macros;-><init>(Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 52
    :cond_1
    :goto_1
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    const-string v2, "Invalid macros value"

    invoke-virtual {v1, v2}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->error(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 60
    iget-object v2, p0, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to parse screen macros. "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->error(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private final processMacroses(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/automations/internal/macros/Macros;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 74
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 75
    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 79
    :cond_0
    sget-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object v0

    new-instance v1, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$processMacroses$1;

    invoke-direct {v1, p1, p2, p3, p4}, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$processMacroses$1;-><init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;

    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/Qonversion;->products(Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;)V

    return-void
.end method


# virtual methods
.method public final processScreen(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "html"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onComplete"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onError"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "\\[\\[.*?\\]\\]"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 21
    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lkotlin/text/Regex;->findAll(Ljava/lang/CharSequence;I)Lkotlin/sequences/Sequence;

    move-result-object v0

    .line 22
    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->toList(Lkotlin/sequences/Sequence;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;->convertMatchResultToMacros(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 24
    new-instance v1, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$processScreen$1;

    invoke-direct {v1, p2}, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$processScreen$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    new-instance p2, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$processScreen$2;

    invoke-direct {p2, p3}, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$processScreen$2;-><init>(Lkotlin/jvm/functions/Function1;)V

    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, p1, v0, v1, p2}, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;->processMacroses(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
