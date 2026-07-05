.class public final Lcom/stripe/android/view/CardWidgetViewModel$Factory;
.super Ljava/lang/Object;
.source "CardWidgetViewModel.kt"

# interfaces
.implements Landroidx/lifecycle/ViewModelProvider$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/view/CardWidgetViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J-\u0010\u0008\u001a\u0002H\t\"\u0008\u0008\u0000\u0010\t*\u00020\n2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u0002H\t0\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00a2\u0006\u0002\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/view/CardWidgetViewModel$Factory;",
        "Landroidx/lifecycle/ViewModelProvider$Factory;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "getContext",
        "()Landroid/content/Context;",
        "create",
        "T",
        "Landroidx/lifecycle/ViewModel;",
        "modelClass",
        "Ljava/lang/Class;",
        "extras",
        "Landroidx/lifecycle/viewmodel/CreationExtras;",
        "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;",
        "payments-core_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method public static synthetic $r8$lambda$7ew4WODwNC_iIJaTjaimJaovruE(Lcom/stripe/android/view/CardWidgetViewModel$Factory;)Lcom/stripe/android/PaymentConfiguration;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/view/CardWidgetViewModel$Factory;->create$lambda$1(Lcom/stripe/android/view/CardWidgetViewModel$Factory;)Lcom/stripe/android/PaymentConfiguration;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$x9Z_sUJm1uui4cjRhVJAbZsbfZ0(Lcom/stripe/android/view/CardWidgetViewModel$Factory;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/view/CardWidgetViewModel$Factory;->create$lambda$0(Lcom/stripe/android/view/CardWidgetViewModel$Factory;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/view/CardWidgetViewModel$Factory;->context:Landroid/content/Context;

    return-void
.end method

.method private static final create$lambda$0(Lcom/stripe/android/view/CardWidgetViewModel$Factory;)Ljava/lang/String;
    .locals 1

    .line 79
    sget-object v0, Lcom/stripe/android/PaymentConfiguration;->Companion:Lcom/stripe/android/PaymentConfiguration$Companion;

    iget-object p0, p0, Lcom/stripe/android/view/CardWidgetViewModel$Factory;->context:Landroid/content/Context;

    invoke-virtual {v0, p0}, Lcom/stripe/android/PaymentConfiguration$Companion;->getInstance(Landroid/content/Context;)Lcom/stripe/android/PaymentConfiguration;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final create$lambda$1(Lcom/stripe/android/view/CardWidgetViewModel$Factory;)Lcom/stripe/android/PaymentConfiguration;
    .locals 1

    .line 84
    sget-object v0, Lcom/stripe/android/PaymentConfiguration;->Companion:Lcom/stripe/android/PaymentConfiguration$Companion;

    iget-object p0, p0, Lcom/stripe/android/view/CardWidgetViewModel$Factory;->context:Landroid/content/Context;

    invoke-virtual {v0, p0}, Lcom/stripe/android/PaymentConfiguration$Companion;->getInstance(Landroid/content/Context;)Lcom/stripe/android/PaymentConfiguration;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public create(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/ViewModel;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Landroidx/lifecycle/viewmodel/CreationExtras;",
            ")TT;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "modelClass"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "extras"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    new-instance v2, Lcom/stripe/android/networking/StripeApiRepository;

    .line 78
    iget-object v3, v0, Lcom/stripe/android/view/CardWidgetViewModel$Factory;->context:Landroid/content/Context;

    .line 77
    new-instance v4, Lcom/stripe/android/view/CardWidgetViewModel$Factory$$ExternalSyntheticLambda0;

    invoke-direct {v4, v0}, Lcom/stripe/android/view/CardWidgetViewModel$Factory$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/view/CardWidgetViewModel$Factory;)V

    const/16 v18, 0x7ffc

    const/16 v19, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v2 .. v19}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 83
    new-instance v3, Lcom/stripe/android/view/CardWidgetViewModel;

    .line 84
    new-instance v4, Lcom/stripe/android/view/CardWidgetViewModel$Factory$$ExternalSyntheticLambda1;

    invoke-direct {v4, v0}, Lcom/stripe/android/view/CardWidgetViewModel$Factory$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/view/CardWidgetViewModel$Factory;)V

    .line 85
    move-object v5, v2

    check-cast v5, Lcom/stripe/android/networking/StripeRepository;

    const/4 v7, 0x4

    .line 83
    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/view/CardWidgetViewModel;-><init>(Ljavax/inject/Provider;Lcom/stripe/android/networking/StripeRepository;Lkotlinx/coroutines/CoroutineDispatcher;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v3, Landroidx/lifecycle/ViewModel;

    return-object v3
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/stripe/android/view/CardWidgetViewModel$Factory;->context:Landroid/content/Context;

    return-object v0
.end method
