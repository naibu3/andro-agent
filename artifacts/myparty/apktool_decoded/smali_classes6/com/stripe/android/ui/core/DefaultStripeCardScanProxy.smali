.class public final Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;
.super Ljava/lang/Object;
.source "StripeCardScanProxy.kt"

# interfaces
.implements Lcom/stripe/android/ui/core/StripeCardScanProxy;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016JC\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0013\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\u0008(\u0016\u0012\u0004\u0012\u00020\u00070\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;",
        "Lcom/stripe/android/ui/core/StripeCardScanProxy;",
        "cardScanSheet",
        "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;",
        "<init>",
        "(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;)V",
        "present",
        "",
        "configuration",
        "Lcom/stripe/android/stripecardscan/cardscan/CardScanConfiguration;",
        "attachCardScanFragment",
        "lifecycleOwner",
        "Landroidx/lifecycle/LifecycleOwner;",
        "supportFragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "fragmentContainer",
        "",
        "onFinished",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;",
        "Lkotlin/ParameterName;",
        "name",
        "cardScanSheetResult",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final cardScanSheet:Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;)V
    .locals 1

    const-string v0, "cardScanSheet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    iput-object p1, p0, Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;->cardScanSheet:Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;

    return-void
.end method


# virtual methods
.method public attachCardScanFragment(Landroidx/lifecycle/LifecycleOwner;Landroidx/fragment/app/FragmentManager;ILkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LifecycleOwner;",
            "Landroidx/fragment/app/FragmentManager;",
            "I",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "lifecycleOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supportFragmentManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onFinished"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    iget-object v0, p0, Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;->cardScanSheet:Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;->attachCardScanFragment(Landroidx/lifecycle/LifecycleOwner;Landroidx/fragment/app/FragmentManager;ILkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public present(Lcom/stripe/android/stripecardscan/cardscan/CardScanConfiguration;)V
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    iget-object v0, p0, Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;->cardScanSheet:Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;

    invoke-virtual {v0, p1}, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;->present(Lcom/stripe/android/stripecardscan/cardscan/CardScanConfiguration;)V

    return-void
.end method
