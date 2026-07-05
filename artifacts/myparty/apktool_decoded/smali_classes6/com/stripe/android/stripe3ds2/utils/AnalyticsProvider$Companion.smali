.class public final Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider$Companion;
.super Ljava/lang/Object;
.source "AnalyticsProvider.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider$Companion;",
        "",
        "<init>",
        "()V",
        "provider",
        "Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;",
        "instance",
        "getInstance",
        "()Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getInstance()Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;
    .locals 2

    .line 21
    invoke-static {}, Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;->access$getProvider$cp()Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 23
    :cond_0
    invoke-static {}, Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;->access$getProvider$cp()Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;

    move-result-object v1

    if-nez v1, :cond_1

    .line 24
    invoke-static {v0}, Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;->access$setProvider$cp(Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;)V

    :cond_1
    return-object v0
.end method
