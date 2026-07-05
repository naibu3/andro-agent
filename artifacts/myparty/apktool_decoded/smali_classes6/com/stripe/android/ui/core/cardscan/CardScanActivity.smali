.class public final Lcom/stripe/android/ui/core/cardscan/CardScanActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "CardScanActivity.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ui/core/cardscan/CardScanActivity$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u0014J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/cardscan/CardScanActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "<init>",
        "()V",
        "viewBinding",
        "Lcom/stripe/android/ui/core/databinding/StripeActivityCardScanBinding;",
        "getViewBinding",
        "()Lcom/stripe/android/ui/core/databinding/StripeActivityCardScanBinding;",
        "viewBinding$delegate",
        "Lkotlin/Lazy;",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onScanFinished",
        "result",
        "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;",
        "Companion",
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
.field public static final $stable:I

.field public static final ARGS:Ljava/lang/String; = "args"

.field public static final CARD_SCAN_PARCELABLE_NAME:Ljava/lang/String; = "CardScanActivityResult"

.field public static final Companion:Lcom/stripe/android/ui/core/cardscan/CardScanActivity$Companion;


# instance fields
.field private final viewBinding$delegate:Lkotlin/Lazy;


# direct methods
.method public static synthetic $r8$lambda$LCiZLZF8FpHV2vWrEDOQ7ZHt3MQ(Lcom/stripe/android/ui/core/cardscan/CardScanActivity;)Lcom/stripe/android/ui/core/databinding/StripeActivityCardScanBinding;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/ui/core/cardscan/CardScanActivity;->viewBinding_delegate$lambda$0(Lcom/stripe/android/ui/core/cardscan/CardScanActivity;)Lcom/stripe/android/ui/core/databinding/StripeActivityCardScanBinding;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/ui/core/cardscan/CardScanActivity$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/ui/core/cardscan/CardScanActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/ui/core/cardscan/CardScanActivity;->Companion:Lcom/stripe/android/ui/core/cardscan/CardScanActivity$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/ui/core/cardscan/CardScanActivity;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 14
    new-instance v0, Lcom/stripe/android/ui/core/cardscan/CardScanActivity$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/stripe/android/ui/core/cardscan/CardScanActivity$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/ui/core/cardscan/CardScanActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/ui/core/cardscan/CardScanActivity;->viewBinding$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$onScanFinished(Lcom/stripe/android/ui/core/cardscan/CardScanActivity;Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Lcom/stripe/android/ui/core/cardscan/CardScanActivity;->onScanFinished(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;)V

    return-void
.end method

.method private final getViewBinding()Lcom/stripe/android/ui/core/databinding/StripeActivityCardScanBinding;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/stripe/android/ui/core/cardscan/CardScanActivity;->viewBinding$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/ui/core/databinding/StripeActivityCardScanBinding;

    return-object v0
.end method

.method private final onScanFinished(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;)V
    .locals 2

    .line 42
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 44
    const-string v1, "CardScanActivityResult"

    .line 45
    check-cast p1, Landroid/os/Parcelable;

    .line 43
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "putExtra(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, -0x1

    .line 47
    invoke-virtual {p0, v0, p1}, Lcom/stripe/android/ui/core/cardscan/CardScanActivity;->setResult(ILandroid/content/Intent;)V

    .line 48
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/cardscan/CardScanActivity;->finish()V

    return-void
.end method

.method private static final viewBinding_delegate$lambda$0(Lcom/stripe/android/ui/core/cardscan/CardScanActivity;)Lcom/stripe/android/ui/core/databinding/StripeActivityCardScanBinding;
    .locals 0

    .line 15
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/cardscan/CardScanActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p0

    invoke-static {p0}, Lcom/stripe/android/ui/core/databinding/StripeActivityCardScanBinding;->inflate(Landroid/view/LayoutInflater;)Lcom/stripe/android/ui/core/databinding/StripeActivityCardScanBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 8

    .line 19
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 20
    invoke-direct {p0}, Lcom/stripe/android/ui/core/cardscan/CardScanActivity;->getViewBinding()Lcom/stripe/android/ui/core/databinding/StripeActivityCardScanBinding;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/databinding/StripeActivityCardScanBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lcom/stripe/android/ui/core/cardscan/CardScanActivity;->setContentView(Landroid/view/View;)V

    .line 22
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/cardscan/CardScanActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 23
    const-string v0, "args"

    const-class v1, Lcom/stripe/android/stripecardscan/cardscan/CardScanConfiguration;

    invoke-static {p1, v0, v1}, Landroidx/core/os/BundleCompat;->getParcelable(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/stripecardscan/cardscan/CardScanConfiguration;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    .line 28
    new-instance p1, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult$Failed;

    .line 29
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "CardScanConfiguration not found"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    .line 28
    invoke-direct {p1, v0}, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast p1, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;

    .line 27
    invoke-direct {p0, p1}, Lcom/stripe/android/ui/core/cardscan/CardScanActivity;->onScanFinished(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;)V

    return-void

    .line 34
    :cond_1
    sget-object v0, Lcom/stripe/android/ui/core/StripeCardScanProxy;->Companion:Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;

    .line 35
    move-object v1, p0

    check-cast v1, Landroidx/appcompat/app/AppCompatActivity;

    .line 36
    new-instance v2, Lcom/stripe/android/ui/core/cardscan/CardScanActivity$onCreate$1;

    invoke-direct {v2, p0}, Lcom/stripe/android/ui/core/cardscan/CardScanActivity$onCreate$1;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 37
    sget-object v3, Lcom/stripe/android/payments/core/analytics/ErrorReporter;->Companion:Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/cardscan/CardScanActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    const-string v5, "getApplicationContext(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "CardScan"

    invoke-static {v5}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;->createFallbackInstance(Landroid/content/Context;Ljava/util/Set;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    move-result-object v3

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 34
    invoke-static/range {v0 .. v7}, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;->create$default(Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;Landroidx/appcompat/app/AppCompatActivity;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;ILjava/lang/Object;)Lcom/stripe/android/ui/core/StripeCardScanProxy;

    move-result-object v0

    .line 38
    invoke-interface {v0, p1}, Lcom/stripe/android/ui/core/StripeCardScanProxy;->present(Lcom/stripe/android/stripecardscan/cardscan/CardScanConfiguration;)V

    return-void
.end method
