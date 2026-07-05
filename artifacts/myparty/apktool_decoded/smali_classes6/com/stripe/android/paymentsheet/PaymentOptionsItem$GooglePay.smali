.class public final Lcom/stripe/android/paymentsheet/PaymentOptionsItem$GooglePay;
.super Lcom/stripe/android/paymentsheet/PaymentOptionsItem;
.source "PaymentOptionsItem.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentOptionsItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "GooglePay"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u00020\tX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$GooglePay;",
        "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
        "<init>",
        "()V",
        "viewType",
        "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;",
        "getViewType",
        "()Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;",
        "isEnabledDuringEditing",
        "",
        "()Z",
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

.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$GooglePay;

.field private static final isEnabledDuringEditing:Z

.field private static final viewType:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$GooglePay;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$GooglePay;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$GooglePay;->INSTANCE:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$GooglePay;

    .line 18
    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;->GooglePay:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$GooglePay;->viewType:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 17
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public getViewType()Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;
    .locals 1

    .line 18
    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$GooglePay;->viewType:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    return-object v0
.end method

.method public isEnabledDuringEditing()Z
    .locals 1

    .line 19
    sget-boolean v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$GooglePay;->isEnabledDuringEditing:Z

    return v0
.end method
