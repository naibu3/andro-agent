.class public final Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;
.super Ljava/lang/Object;
.source "NewPaymentOptionSelection.kt"

# interfaces
.implements Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "New"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000c\u0010\u0008\u001a\u00060\tj\u0002`\nH\u0016J\u0008\u0010\u000b\u001a\u00020\tH\u0016J\u0008\u0010\u000c\u001a\u00020\rH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\tH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;",
        "Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;",
        "paymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)V",
        "getPaymentSelection",
        "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;",
        "getPaymentMethodCode",
        "",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "getType",
        "getPaymentMethodCreateParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "getPaymentMethodExtraParams",
        "Lcom/stripe/android/model/PaymentMethodExtraParams;",
        "getPaymentMethodOptionParams",
        "Lcom/stripe/android/model/PaymentMethodOptionsParams;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
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
.field private final paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)V
    .locals 1

    const-string v0, "paymentSelection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;->paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;->paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;->copy(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;->paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;
    .locals 1

    const-string v0, "paymentSelection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;-><init>(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;->paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;->paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public getPaymentMethodCode()Ljava/lang/String;
    .locals 2

    .line 26
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;->getPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    move-result-object v0

    .line 27
    instance-of v1, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;

    if-eqz v1, :cond_0

    sget-object v0, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v0, v0, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    return-object v0

    .line 28
    :cond_0
    instance-of v1, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;

    if-nez v1, :cond_2

    .line 29
    instance-of v1, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    if-nez v1, :cond_2

    .line 30
    instance-of v0, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$GenericPaymentMethod;

    if-eqz v0, :cond_1

    goto :goto_0

    .line 26
    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 30
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;->getPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentMethodCreateParams;->getTypeCode()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;
    .locals 1

    .line 37
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;->getPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v0

    return-object v0
.end method

.method public getPaymentMethodExtraParams()Lcom/stripe/android/model/PaymentMethodExtraParams;
    .locals 1

    .line 40
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;->getPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;->getPaymentMethodExtraParams()Lcom/stripe/android/model/PaymentMethodExtraParams;

    move-result-object v0

    return-object v0
.end method

.method public getPaymentMethodOptionParams()Lcom/stripe/android/model/PaymentMethodOptionsParams;
    .locals 1

    .line 43
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;->getPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;->getPaymentMethodOptionsParams()Lcom/stripe/android/model/PaymentMethodOptionsParams;

    move-result-object v0

    return-object v0
.end method

.method public getPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;->paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    return-object v0
.end method

.method public bridge synthetic getPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;
    .locals 1

    .line 24
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;->getPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 34
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;->getPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentMethodCreateParams;->getTypeCode()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;->paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;->paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "New(paymentSelection="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
