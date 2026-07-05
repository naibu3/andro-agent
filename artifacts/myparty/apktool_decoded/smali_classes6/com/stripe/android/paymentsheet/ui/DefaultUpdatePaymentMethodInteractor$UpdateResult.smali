.class public abstract Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult;
.super Ljava/lang/Object;
.source "UpdatePaymentMethodInteractor.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "UpdateResult"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult$Error;,
        Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult$NoUpdatesMade;,
        Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult$Success;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0003\u0007\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult;",
        "",
        "<init>",
        "()V",
        "Error",
        "Success",
        "NoUpdatesMade",
        "Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult$Error;",
        "Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult$NoUpdatesMade;",
        "Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult$Success;",
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


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 360
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult;-><init>()V

    return-void
.end method
