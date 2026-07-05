.class final Lcom/stripe/android/customersheet/ui/DefaultCardBrandDisallowedReporter;
.super Ljava/lang/Object;
.source "CustomerSheetScreen.kt"

# interfaces
.implements Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/ui/DefaultCardBrandDisallowedReporter;",
        "Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;",
        "viewActionHandler",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/customersheet/CustomerSheetViewAction;",
        "",
        "<init>",
        "(Lkotlin/jvm/functions/Function1;)V",
        "onDisallowedCardBrandEntered",
        "brand",
        "Lcom/stripe/android/model/CardBrand;",
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


# instance fields
.field private final viewActionHandler:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/customersheet/CustomerSheetViewAction;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/customersheet/CustomerSheetViewAction;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "viewActionHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 361
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 362
    iput-object p1, p0, Lcom/stripe/android/customersheet/ui/DefaultCardBrandDisallowedReporter;->viewActionHandler:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public onDisallowedCardBrandEntered(Lcom/stripe/android/model/CardBrand;)V
    .locals 2

    const-string v0, "brand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 365
    iget-object v0, p0, Lcom/stripe/android/customersheet/ui/DefaultCardBrandDisallowedReporter;->viewActionHandler:Lkotlin/jvm/functions/Function1;

    new-instance v1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnDisallowedCardBrandEntered;

    invoke-direct {v1, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnDisallowedCardBrandEntered;-><init>(Lcom/stripe/android/model/CardBrand;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
