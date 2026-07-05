.class public final Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;
.super Ljava/lang/Object;
.source "EditPaymentMethodViewEffect.kt"

# interfaces
.implements Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OnUpdateRequested"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;",
        "Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect;",
        "paymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
        "brand",
        "Lcom/stripe/android/model/CardBrand;",
        "<init>",
        "(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/CardBrand;)V",
        "getPaymentMethod",
        "()Lcom/stripe/android/model/PaymentMethod;",
        "getBrand",
        "()Lcom/stripe/android/model/CardBrand;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
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

.field private final paymentMethod:Lcom/stripe/android/model/PaymentMethod;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/stripe/android/model/PaymentMethod;->$stable:I

    sput v0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/CardBrand;)V
    .locals 1

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "brand"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    .line 13
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;->brand:Lcom/stripe/android/model/CardBrand;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/CardBrand;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;->brand:Lcom/stripe/android/model/CardBrand;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;->copy(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/model/PaymentMethod;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/model/CardBrand;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;->brand:Lcom/stripe/android/model/CardBrand;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;
    .locals 1

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "brand"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;-><init>(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/CardBrand;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;->brand:Lcom/stripe/android/model/CardBrand;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;->brand:Lcom/stripe/android/model/CardBrand;

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getBrand()Lcom/stripe/android/model/CardBrand;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;->brand:Lcom/stripe/android/model/CardBrand;

    return-object v0
.end method

.method public final getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentMethod;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;->brand:Lcom/stripe/android/model/CardBrand;

    invoke-virtual {v1}, Lcom/stripe/android/model/CardBrand;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;->brand:Lcom/stripe/android/model/CardBrand;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "OnUpdateRequested(paymentMethod="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", brand="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
