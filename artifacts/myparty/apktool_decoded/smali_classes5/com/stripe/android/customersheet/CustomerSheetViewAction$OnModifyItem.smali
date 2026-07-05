.class public final Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnModifyItem;
.super Lcom/stripe/android/customersheet/CustomerSheetViewAction;
.source "CustomerSheetViewAction.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/CustomerSheetViewAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OnModifyItem"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnModifyItem;",
        "Lcom/stripe/android/customersheet/CustomerSheetViewAction;",
        "paymentMethod",
        "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)V",
        "getPaymentMethod",
        "()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;",
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
.field private final paymentMethod:Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)V
    .locals 1

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 23
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/CustomerSheetViewAction;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnModifyItem;->paymentMethod:Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    return-void
.end method


# virtual methods
.method public final getPaymentMethod()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnModifyItem;->paymentMethod:Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    return-object v0
.end method
