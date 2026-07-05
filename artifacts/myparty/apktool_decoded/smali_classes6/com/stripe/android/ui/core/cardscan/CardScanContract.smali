.class public final Lcom/stripe/android/ui/core/cardscan/CardScanContract;
.super Landroidx/activity/result/contract/ActivityResultContract;
.source "CardScanContract.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ui/core/cardscan/CardScanContract$Args;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/activity/result/contract/ActivityResultContract<",
        "Lcom/stripe/android/ui/core/cardscan/CardScanContract$Args;",
        "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/cardscan/CardScanContract;",
        "Landroidx/activity/result/contract/ActivityResultContract;",
        "Lcom/stripe/android/ui/core/cardscan/CardScanContract$Args;",
        "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;",
        "<init>",
        "()V",
        "createIntent",
        "Landroid/content/Intent;",
        "context",
        "Landroid/content/Context;",
        "input",
        "parseResult",
        "resultCode",
        "",
        "intent",
        "Args",
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


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Landroidx/activity/result/contract/ActivityResultContract;-><init>()V

    return-void
.end method


# virtual methods
.method public createIntent(Landroid/content/Context;Lcom/stripe/android/ui/core/cardscan/CardScanContract$Args;)Landroid/content/Intent;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/stripe/android/ui/core/cardscan/CardScanActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 17
    invoke-virtual {p2}, Lcom/stripe/android/ui/core/cardscan/CardScanContract$Args;->getConfiguration()Lcom/stripe/android/stripecardscan/cardscan/CardScanConfiguration;

    move-result-object p1

    check-cast p1, Landroid/os/Parcelable;

    const-string p2, "args"

    invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object v0
.end method

.method public bridge synthetic createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 0

    .line 13
    check-cast p2, Lcom/stripe/android/ui/core/cardscan/CardScanContract$Args;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/ui/core/cardscan/CardScanContract;->createIntent(Landroid/content/Context;Lcom/stripe/android/ui/core/cardscan/CardScanContract$Args;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public parseResult(ILandroid/content/Intent;)Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;
    .locals 2

    .line 22
    new-instance p1, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult$Failed;

    .line 23
    new-instance v0, Lcom/stripe/android/stripecardscan/cardscan/exception/UnknownScanException;

    const-string v1, "No data in the result intent"

    invoke-direct {v0, v1}, Lcom/stripe/android/stripecardscan/cardscan/exception/UnknownScanException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    .line 22
    invoke-direct {p1, v0}, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult$Failed;-><init>(Ljava/lang/Throwable;)V

    if-eqz p2, :cond_2

    .line 25
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 28
    :cond_0
    const-string v0, "CardScanActivityResult"

    .line 29
    const-class v1, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;

    .line 26
    invoke-static {p2, v0, v1}, Landroidx/core/os/BundleCompat;->getParcelable(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;

    if-nez p2, :cond_1

    .line 30
    check-cast p1, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;

    return-object p1

    :cond_1
    return-object p2

    .line 25
    :cond_2
    :goto_0
    check-cast p1, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;

    return-object p1
.end method

.method public bridge synthetic parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    .line 13
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/ui/core/cardscan/CardScanContract;->parseResult(ILandroid/content/Intent;)Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;

    move-result-object p1

    return-object p1
.end method
