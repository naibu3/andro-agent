.class public final Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;
.super Ljava/lang/Object;
.source "AnalyticsProvider.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000 \u00082\u00020\u0001:\u0001\u0008B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;",
        "",
        "<init>",
        "()V",
        "loader",
        "Ljava/util/ServiceLoader;",
        "Lcom/stripe/android/stripe3ds2/utils/AnalyticsDelegate;",
        "serviceImpl",
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
.field public static final Companion:Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider$Companion;

.field private static provider:Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;


# instance fields
.field private final loader:Ljava/util/ServiceLoader;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ServiceLoader<",
            "Lcom/stripe/android/stripe3ds2/utils/AnalyticsDelegate;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;->Companion:Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    const-class v0, Lcom/stripe/android/stripe3ds2/utils/AnalyticsDelegate;

    invoke-static {v0}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;)Ljava/util/ServiceLoader;

    move-result-object v0

    const-string v1, "load(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;->loader:Ljava/util/ServiceLoader;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;-><init>()V

    return-void
.end method

.method public static final synthetic access$getProvider$cp()Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;
    .locals 1

    .line 5
    sget-object v0, Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;->provider:Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;

    return-object v0
.end method

.method public static final synthetic access$setProvider$cp(Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;)V
    .locals 0

    .line 5
    sput-object p0, Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;->provider:Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;

    return-void
.end method


# virtual methods
.method public final serviceImpl()Lcom/stripe/android/stripe3ds2/utils/AnalyticsDelegate;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;->loader:Ljava/util/ServiceLoader;

    invoke-virtual {v0}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;->loader:Ljava/util/ServiceLoader;

    invoke-virtual {v0}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/stripe3ds2/utils/AnalyticsDelegate;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
