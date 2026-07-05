.class public final Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;
.super Ljava/lang/Object;
.source "StripeCardScanProxy.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/ui/core/StripeCardScanProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JS\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072!\u0010\u0008\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0008(\r\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00122\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014JS\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162!\u0010\u0008\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0008(\r\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00122\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;",
        "",
        "<init>",
        "()V",
        "create",
        "Lcom/stripe/android/ui/core/StripeCardScanProxy;",
        "fragment",
        "Landroidx/fragment/app/Fragment;",
        "onFinished",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;",
        "Lkotlin/ParameterName;",
        "name",
        "cardScanSheetResult",
        "",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "provider",
        "Lkotlin/Function0;",
        "isStripeCardScanAvailable",
        "Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;",
        "activity",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "removeCardScanFragment",
        "supportFragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "payments-ui-core_release"
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
.field static final synthetic $$INSTANCE:Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;


# direct methods
.method public static synthetic $r8$lambda$_Umlinrzf34kvjYtJtE5JTd4efY(Landroidx/appcompat/app/AppCompatActivity;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;->create$lambda$1(Landroidx/appcompat/app/AppCompatActivity;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$oo2jR6uXKAY8Y8oPu8OSxPgxMA8(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;->create$lambda$0(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;->$$INSTANCE:Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic create$default(Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;Landroidx/appcompat/app/AppCompatActivity;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;ILjava/lang/Object;)Lcom/stripe/android/ui/core/StripeCardScanProxy;
    .locals 6

    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    .line 50
    new-instance p4, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion$$ExternalSyntheticLambda1;

    invoke-direct {p4, p1, p2}, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion$$ExternalSyntheticLambda1;-><init>(Landroidx/appcompat/app/AppCompatActivity;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    .line 53
    new-instance p4, Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;

    invoke-direct {p4}, Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;-><init>()V

    move-object p5, p4

    check-cast p5, Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    .line 46
    invoke-virtual/range {v0 .. v5}, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;->create(Landroidx/appcompat/app/AppCompatActivity;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;)Lcom/stripe/android/ui/core/StripeCardScanProxy;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic create$default(Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;ILjava/lang/Object;)Lcom/stripe/android/ui/core/StripeCardScanProxy;
    .locals 6

    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    .line 34
    new-instance p4, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion$$ExternalSyntheticLambda0;

    invoke-direct {p4, p1, p2}, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion$$ExternalSyntheticLambda0;-><init>(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    .line 37
    new-instance p4, Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;

    invoke-direct {p4}, Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;-><init>()V

    move-object p5, p4

    check-cast p5, Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    .line 30
    invoke-virtual/range {v0 .. v5}, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;->create(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;)Lcom/stripe/android/ui/core/StripeCardScanProxy;

    move-result-object p0

    return-object p0
.end method

.method private static final create$lambda$0(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;
    .locals 7

    .line 35
    new-instance v0, Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;

    sget-object v1, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;->Companion:Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet$Companion;

    new-instance v2, Lcom/stripe/android/ui/core/StripeCardScanProxy$sam$com_stripe_android_stripecardscan_cardscan_CardScanSheet_CardScanResultCallback$0;

    invoke-direct {v2, p1}, Lcom/stripe/android/ui/core/StripeCardScanProxy$sam$com_stripe_android_stripecardscan_cardscan_CardScanSheet_CardScanResultCallback$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet$CardScanResultCallback;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet$Companion;->create$default(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet$Companion;Landroidx/fragment/app/Fragment;Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet$CardScanResultCallback;Landroidx/activity/result/ActivityResultRegistry;ILjava/lang/Object;)Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;-><init>(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;)V

    return-object v0
.end method

.method private static final create$lambda$1(Landroidx/appcompat/app/AppCompatActivity;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;
    .locals 7

    .line 51
    new-instance v0, Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;

    sget-object v1, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;->Companion:Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet$Companion;

    move-object v2, p0

    check-cast v2, Landroidx/activity/ComponentActivity;

    new-instance p0, Lcom/stripe/android/ui/core/StripeCardScanProxy$sam$com_stripe_android_stripecardscan_cardscan_CardScanSheet_CardScanResultCallback$0;

    invoke-direct {p0, p1}, Lcom/stripe/android/ui/core/StripeCardScanProxy$sam$com_stripe_android_stripecardscan_cardscan_CardScanSheet_CardScanResultCallback$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    move-object v3, p0

    check-cast v3, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet$CardScanResultCallback;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet$Companion;->create$default(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet$Companion;Landroidx/activity/ComponentActivity;Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet$CardScanResultCallback;Landroidx/activity/result/ActivityResultRegistry;ILjava/lang/Object;)Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;-><init>(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;)V

    return-object v0
.end method

.method public static synthetic removeCardScanFragment$default(Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;Landroidx/fragment/app/FragmentManager;Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 64
    new-instance p2, Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;

    invoke-direct {p2}, Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;-><init>()V

    check-cast p2, Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;

    .line 62
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;->removeCardScanFragment(Landroidx/fragment/app/FragmentManager;Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;)V

    return-void
.end method


# virtual methods
.method public final create(Landroidx/appcompat/app/AppCompatActivity;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;)Lcom/stripe/android/ui/core/StripeCardScanProxy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/appcompat/app/AppCompatActivity;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Lcom/stripe/android/ui/core/StripeCardScanProxy;",
            ">;",
            "Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;",
            ")",
            "Lcom/stripe/android/ui/core/StripeCardScanProxy;"
        }
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onFinished"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "errorReporter"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "provider"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "isStripeCardScanAvailable"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-interface {p5}, Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;->invoke()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 56
    invoke-interface {p4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/ui/core/StripeCardScanProxy;

    return-object p1

    .line 58
    :cond_0
    new-instance p1, Lcom/stripe/android/ui/core/UnsupportedStripeCardScanProxy;

    invoke-direct {p1, p3}, Lcom/stripe/android/ui/core/UnsupportedStripeCardScanProxy;-><init>(Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V

    check-cast p1, Lcom/stripe/android/ui/core/StripeCardScanProxy;

    return-object p1
.end method

.method public final create(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;)Lcom/stripe/android/ui/core/StripeCardScanProxy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/Fragment;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Lcom/stripe/android/ui/core/StripeCardScanProxy;",
            ">;",
            "Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;",
            ")",
            "Lcom/stripe/android/ui/core/StripeCardScanProxy;"
        }
    .end annotation

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onFinished"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "errorReporter"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "provider"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "isStripeCardScanAvailable"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    invoke-interface {p5}, Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;->invoke()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 40
    invoke-interface {p4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/ui/core/StripeCardScanProxy;

    return-object p1

    .line 42
    :cond_0
    new-instance p1, Lcom/stripe/android/ui/core/UnsupportedStripeCardScanProxy;

    invoke-direct {p1, p3}, Lcom/stripe/android/ui/core/UnsupportedStripeCardScanProxy;-><init>(Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V

    check-cast p1, Lcom/stripe/android/ui/core/StripeCardScanProxy;

    return-object p1
.end method

.method public final removeCardScanFragment(Landroidx/fragment/app/FragmentManager;Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;)V
    .locals 1

    const-string v0, "supportFragmentManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isStripeCardScanAvailable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    invoke-interface {p2}, Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;->invoke()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 67
    sget-object p2, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;->Companion:Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet$Companion;

    invoke-virtual {p2, p1}, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet$Companion;->removeCardScanFragment(Landroidx/fragment/app/FragmentManager;)V

    :cond_0
    return-void
.end method
