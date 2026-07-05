.class public final Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Builder;
.super Ljava/lang/Object;
.source "PaymentSheet.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0006\u0010\u0008\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Builder;",
        "",
        "<init>",
        "()V",
        "display",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;",
        "collectMissingBillingDetailsForExistingPaymentMethods",
        "",
        "build",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;",
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
.field private collectMissingBillingDetailsForExistingPaymentMethods:Z

.field private display:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 3173
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3174
    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;->Automatic:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Builder;->display:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    const/4 v0, 0x1

    .line 3175
    iput-boolean v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Builder;->collectMissingBillingDetailsForExistingPaymentMethods:Z

    return-void
.end method


# virtual methods
.method public final build()Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;
    .locals 4

    .line 3189
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;

    .line 3190
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Builder;->display:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    .line 3192
    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Builder;->collectMissingBillingDetailsForExistingPaymentMethods:Z

    const/4 v3, 0x1

    .line 3189
    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;ZZ)V

    return-object v0
.end method

.method public final collectMissingBillingDetailsForExistingPaymentMethods(Z)Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Builder;
    .locals 1

    .line 3184
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Builder;

    .line 3185
    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Builder;->collectMissingBillingDetailsForExistingPaymentMethods:Z

    return-object p0
.end method

.method public final display(Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;)Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Builder;
    .locals 1

    const-string v0, "display"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3177
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Builder;

    .line 3178
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Builder;->display:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    return-object p0
.end method
