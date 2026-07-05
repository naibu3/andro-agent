.class public interface abstract Lcom/stripe/android/ui/core/StripeCardScanProxy;
.super Ljava/lang/Object;
.source "StripeCardScanProxy.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008`\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&JE\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u000c2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\u000c\u0008\u0010\u0012\u0008\u0008\u0011\u0012\u0004\u0008\u0008(\u0012\u0012\u0004\u0012\u00020\u00030\u000eH&\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/StripeCardScanProxy;",
        "",
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
.field public static final Companion:Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;->$$INSTANCE:Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;

    sput-object v0, Lcom/stripe/android/ui/core/StripeCardScanProxy;->Companion:Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;

    return-void
.end method


# virtual methods
.method public abstract attachCardScanFragment(Landroidx/lifecycle/LifecycleOwner;Landroidx/fragment/app/FragmentManager;ILkotlin/jvm/functions/Function1;)V
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
.end method

.method public abstract present(Lcom/stripe/android/stripecardscan/cardscan/CardScanConfiguration;)V
.end method
