.class public final Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnDisallowedCardBrandEntered;
.super Lcom/stripe/android/customersheet/CustomerSheetViewAction;
.source "CustomerSheetViewAction.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/CustomerSheetViewAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OnDisallowedCardBrandEntered"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnDisallowedCardBrandEntered;",
        "Lcom/stripe/android/customersheet/CustomerSheetViewAction;",
        "brand",
        "Lcom/stripe/android/model/CardBrand;",
        "<init>",
        "(Lcom/stripe/android/model/CardBrand;)V",
        "getBrand",
        "()Lcom/stripe/android/model/CardBrand;",
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
.field public static final $stable:I


# instance fields
.field private final brand:Lcom/stripe/android/model/CardBrand;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/CardBrand;)V
    .locals 1

    const-string v0, "brand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 21
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/CustomerSheetViewAction;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnDisallowedCardBrandEntered;->brand:Lcom/stripe/android/model/CardBrand;

    return-void
.end method


# virtual methods
.method public final getBrand()Lcom/stripe/android/model/CardBrand;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnDisallowedCardBrandEntered;->brand:Lcom/stripe/android/model/CardBrand;

    return-object v0
.end method
