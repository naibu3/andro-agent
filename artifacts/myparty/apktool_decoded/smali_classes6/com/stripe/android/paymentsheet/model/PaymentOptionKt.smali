.class public final Lcom/stripe/android/paymentsheet/model/PaymentOptionKt;
.super Ljava/lang/Object;
.source "PaymentOption.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\"&\u0010\u0000\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "errorImageLoader",
        "Lkotlin/Function1;",
        "Lkotlin/coroutines/Continuation;",
        "Landroid/graphics/drawable/Drawable;",
        "",
        "Lkotlin/jvm/functions/Function1;",
        "paymentsheet_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final errorImageLoader:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroid/graphics/drawable/Drawable;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 112
    new-instance v0, Lcom/stripe/android/paymentsheet/model/PaymentOptionKt$errorImageLoader$1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/model/PaymentOptionKt$errorImageLoader$1;-><init>(Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    sput-object v0, Lcom/stripe/android/paymentsheet/model/PaymentOptionKt;->errorImageLoader:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public static final synthetic access$getErrorImageLoader$p()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    sget-object v0, Lcom/stripe/android/paymentsheet/model/PaymentOptionKt;->errorImageLoader:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method
