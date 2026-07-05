.class public final Lcom/stripe/android/customersheet/CustomerSheetResult$Canceled;
.super Lcom/stripe/android/customersheet/CustomerSheetResult;
.source "CustomerSheetResult.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/CustomerSheetResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Canceled"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0013\u0008\u0000\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerSheetResult$Canceled;",
        "Lcom/stripe/android/customersheet/CustomerSheetResult;",
        "selection",
        "Lcom/stripe/android/customersheet/PaymentOptionSelection;",
        "<init>",
        "(Lcom/stripe/android/customersheet/PaymentOptionSelection;)V",
        "getSelection",
        "()Lcom/stripe/android/customersheet/PaymentOptionSelection;",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final selection:Lcom/stripe/android/customersheet/PaymentOptionSelection;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/customersheet/PaymentOptionSelection;)V
    .locals 1

    const/4 v0, 0x0

    .line 23
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/CustomerSheetResult;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 22
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetResult$Canceled;->selection:Lcom/stripe/android/customersheet/PaymentOptionSelection;

    return-void
.end method


# virtual methods
.method public final getSelection()Lcom/stripe/android/customersheet/PaymentOptionSelection;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetResult$Canceled;->selection:Lcom/stripe/android/customersheet/PaymentOptionSelection;

    return-object v0
.end method
