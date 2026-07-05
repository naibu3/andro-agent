.class public final Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceModule$Companion;
.super Ljava/lang/Object;
.source "CustomerSessionDataSourceModule.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0001\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceModule$Companion;",
        "",
        "<init>",
        "()V",
        "providePrefsRepositoryFactory",
        "Lkotlin/Function1;",
        "",
        "Lcom/stripe/android/paymentsheet/PrefsRepository;",
        "appContext",
        "Landroid/content/Context;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "paymentsheet_release"
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
.field static final synthetic $$INSTANCE:Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceModule$Companion;


# direct methods
.method public static synthetic $r8$lambda$ub4Jk6sVIgXLWsyU1lWnRx6fyCc(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;Ljava/lang/String;)Lcom/stripe/android/paymentsheet/DefaultPrefsRepository;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceModule$Companion;->providePrefsRepositoryFactory$lambda$0(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;Ljava/lang/String;)Lcom/stripe/android/paymentsheet/DefaultPrefsRepository;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceModule$Companion;

    invoke-direct {v0}, Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceModule$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceModule$Companion;->$$INSTANCE:Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceModule$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final providePrefsRepositoryFactory$lambda$0(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;Ljava/lang/String;)Lcom/stripe/android/paymentsheet/DefaultPrefsRepository;
    .locals 1

    const-string v0, "customerId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    new-instance v0, Lcom/stripe/android/paymentsheet/DefaultPrefsRepository;

    invoke-direct {v0, p0, p2, p1}, Lcom/stripe/android/paymentsheet/DefaultPrefsRepository;-><init>(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V

    return-object v0
.end method


# virtual methods
.method public final providePrefsRepositoryFactory(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)Lkotlin/jvm/functions/Function1;
    .locals 1
    .param p2    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/coroutines/CoroutineContext;",
            ")",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;"
        }
    .end annotation

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    new-instance v0, Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceModule$Companion$$ExternalSyntheticLambda0;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceModule$Companion$$ExternalSyntheticLambda0;-><init>(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V

    return-object v0
.end method
