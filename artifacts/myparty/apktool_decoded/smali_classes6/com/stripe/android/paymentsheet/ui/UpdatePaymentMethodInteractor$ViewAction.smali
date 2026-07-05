.class public abstract Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction;
.super Ljava/lang/Object;
.source "UpdatePaymentMethodInteractor.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "ViewAction"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$CardUpdateParamsChanged;,
        Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$RemovePaymentMethod;,
        Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$SaveButtonPressed;,
        Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$SetAsDefaultCheckboxChanged;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0004\u0008\t\n\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction;",
        "",
        "<init>",
        "()V",
        "RemovePaymentMethod",
        "SaveButtonPressed",
        "SetAsDefaultCheckboxChanged",
        "CardUpdateParamsChanged",
        "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$CardUpdateParamsChanged;",
        "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$RemovePaymentMethod;",
        "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$SaveButtonPressed;",
        "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$SetAsDefaultCheckboxChanged;",
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

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction;-><init>()V

    return-void
.end method
