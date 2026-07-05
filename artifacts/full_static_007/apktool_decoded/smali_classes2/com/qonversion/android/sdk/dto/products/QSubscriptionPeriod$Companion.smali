.class public final Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;
.super Ljava/lang/Object;
.source "QSubscriptionPeriod.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQSubscriptionPeriod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QSubscriptionPeriod.kt\ncom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;",
        "",
        "()V",
        "from",
        "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;",
        "isoPeriod",
        "",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;-><init>()V

    return-void
.end method

.method private static final from$toPeriodCount(Ljava/lang/String;)I
    .locals 2

    .line 24
    move-object v0, p0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 25
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    invoke-virtual {v0, v1, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string v0, "substring(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_1

    .line 26
    invoke-static {p0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 24
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :cond_1
    return v1
.end method


# virtual methods
.method public final from(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;
    .locals 6

    const-string v0, "isoPeriod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/text/Regex;

    .line 28
    const-string v1, "^P(?!$)(\\d+Y)?(\\d+M)?(\\d+W)?(\\d+D)?$"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 29
    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lkotlin/text/Regex;->matchEntire(Ljava/lang/CharSequence;)Lkotlin/text/MatchResult;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 30
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    sget-object v2, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Unknown:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    invoke-direct {v0, v1, v2, p1}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;-><init>(ILcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;Ljava/lang/String;)V

    return-object v0

    .line 32
    :cond_0
    invoke-interface {v0}, Lkotlin/text/MatchResult;->getDestructured()Lkotlin/text/MatchResult$Destructured;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/text/MatchResult$Destructured;->getMatch()Lkotlin/text/MatchResult;

    move-result-object v2

    invoke-interface {v2}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x1

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0}, Lkotlin/text/MatchResult$Destructured;->getMatch()Lkotlin/text/MatchResult;

    move-result-object v3

    invoke-interface {v3}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x2

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0}, Lkotlin/text/MatchResult$Destructured;->getMatch()Lkotlin/text/MatchResult;

    move-result-object v4

    invoke-interface {v4}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x3

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0}, Lkotlin/text/MatchResult$Destructured;->getMatch()Lkotlin/text/MatchResult;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v0

    const/4 v5, 0x4

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 33
    invoke-static {v2}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;->from$toPeriodCount(Ljava/lang/String;)I

    move-result v2

    .line 34
    invoke-static {v3}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;->from$toPeriodCount(Ljava/lang/String;)I

    move-result v3

    .line 35
    invoke-static {v4}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;->from$toPeriodCount(Ljava/lang/String;)I

    move-result v4

    .line 36
    invoke-static {v0}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;->from$toPeriodCount(Ljava/lang/String;)I

    move-result v0

    if-lez v2, :cond_1

    .line 39
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    sget-object v1, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Year:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    invoke-direct {v0, v2, v1, p1}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;-><init>(ILcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    if-lez v3, :cond_2

    .line 40
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    sget-object v1, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Month:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    invoke-direct {v0, v3, v1, p1}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;-><init>(ILcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    if-lez v4, :cond_3

    .line 41
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    sget-object v1, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Week:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    invoke-direct {v0, v4, v1, p1}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;-><init>(ILcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    if-lez v0, :cond_4

    .line 42
    new-instance v1, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    sget-object v2, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Day:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    invoke-direct {v1, v0, v2, p1}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;-><init>(ILcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;Ljava/lang/String;)V

    move-object v0, v1

    goto :goto_0

    .line 43
    :cond_4
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    sget-object v2, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Unknown:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    invoke-direct {v0, v1, v2, p1}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;-><init>(ILcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method
