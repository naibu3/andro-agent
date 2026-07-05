.class public final Lcom/stripe/android/link/LinkControllerInteractor$State;
.super Ljava/lang/Object;
.source "LinkControllerInteractor.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/LinkControllerInteractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "State"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001BC\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bH\u00c6\u0003JE\u0010!\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\u0008\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006("
    }
    d2 = {
        "Lcom/stripe/android/link/LinkControllerInteractor$State;",
        "",
        "linkComponent",
        "Lcom/stripe/android/link/injection/LinkComponent;",
        "emailInput",
        "",
        "selectedPaymentMethod",
        "Lcom/stripe/android/link/LinkPaymentMethod;",
        "createdPaymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
        "currentLaunchMode",
        "Lcom/stripe/android/link/LinkLaunchMode;",
        "<init>",
        "(Lcom/stripe/android/link/injection/LinkComponent;Ljava/lang/String;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/link/LinkLaunchMode;)V",
        "getLinkComponent",
        "()Lcom/stripe/android/link/injection/LinkComponent;",
        "getEmailInput",
        "()Ljava/lang/String;",
        "getSelectedPaymentMethod",
        "()Lcom/stripe/android/link/LinkPaymentMethod;",
        "getCreatedPaymentMethod",
        "()Lcom/stripe/android/model/PaymentMethod;",
        "getCurrentLaunchMode",
        "()Lcom/stripe/android/link/LinkLaunchMode;",
        "linkConfiguration",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "getLinkConfiguration",
        "()Lcom/stripe/android/link/LinkConfiguration;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final createdPaymentMethod:Lcom/stripe/android/model/PaymentMethod;

.field private final currentLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

.field private final emailInput:Ljava/lang/String;

.field private final linkComponent:Lcom/stripe/android/link/injection/LinkComponent;

.field private final selectedPaymentMethod:Lcom/stripe/android/link/LinkPaymentMethod;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/link/LinkControllerInteractor$State;-><init>(Lcom/stripe/android/link/injection/LinkComponent;Ljava/lang/String;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/link/LinkLaunchMode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/injection/LinkComponent;Ljava/lang/String;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/link/LinkLaunchMode;)V
    .locals 0

    .line 464
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 465
    iput-object p1, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->linkComponent:Lcom/stripe/android/link/injection/LinkComponent;

    .line 466
    iput-object p2, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->emailInput:Ljava/lang/String;

    .line 467
    iput-object p3, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->selectedPaymentMethod:Lcom/stripe/android/link/LinkPaymentMethod;

    .line 468
    iput-object p4, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->createdPaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    .line 469
    iput-object p5, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->currentLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/link/injection/LinkComponent;Ljava/lang/String;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/link/LinkLaunchMode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    move-object p6, v0

    goto :goto_0

    :cond_4
    move-object p6, p5

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 464
    invoke-direct/range {p1 .. p6}, Lcom/stripe/android/link/LinkControllerInteractor$State;-><init>(Lcom/stripe/android/link/injection/LinkComponent;Ljava/lang/String;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/link/LinkLaunchMode;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/link/LinkControllerInteractor$State;Lcom/stripe/android/link/injection/LinkComponent;Ljava/lang/String;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/link/LinkLaunchMode;ILjava/lang/Object;)Lcom/stripe/android/link/LinkControllerInteractor$State;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->linkComponent:Lcom/stripe/android/link/injection/LinkComponent;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->emailInput:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->selectedPaymentMethod:Lcom/stripe/android/link/LinkPaymentMethod;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->createdPaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->currentLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/stripe/android/link/LinkControllerInteractor$State;->copy(Lcom/stripe/android/link/injection/LinkComponent;Ljava/lang/String;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/link/LinkLaunchMode;)Lcom/stripe/android/link/LinkControllerInteractor$State;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/link/injection/LinkComponent;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->linkComponent:Lcom/stripe/android/link/injection/LinkComponent;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->emailInput:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/link/LinkPaymentMethod;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->selectedPaymentMethod:Lcom/stripe/android/link/LinkPaymentMethod;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/model/PaymentMethod;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->createdPaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/link/LinkLaunchMode;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->currentLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/link/injection/LinkComponent;Ljava/lang/String;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/link/LinkLaunchMode;)Lcom/stripe/android/link/LinkControllerInteractor$State;
    .locals 6

    new-instance v0, Lcom/stripe/android/link/LinkControllerInteractor$State;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/link/LinkControllerInteractor$State;-><init>(Lcom/stripe/android/link/injection/LinkComponent;Ljava/lang/String;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/link/LinkLaunchMode;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/link/LinkControllerInteractor$State;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/link/LinkControllerInteractor$State;

    iget-object v1, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->linkComponent:Lcom/stripe/android/link/injection/LinkComponent;

    iget-object v3, p1, Lcom/stripe/android/link/LinkControllerInteractor$State;->linkComponent:Lcom/stripe/android/link/injection/LinkComponent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->emailInput:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/LinkControllerInteractor$State;->emailInput:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->selectedPaymentMethod:Lcom/stripe/android/link/LinkPaymentMethod;

    iget-object v3, p1, Lcom/stripe/android/link/LinkControllerInteractor$State;->selectedPaymentMethod:Lcom/stripe/android/link/LinkPaymentMethod;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->createdPaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    iget-object v3, p1, Lcom/stripe/android/link/LinkControllerInteractor$State;->createdPaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->currentLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    iget-object p1, p1, Lcom/stripe/android/link/LinkControllerInteractor$State;->currentLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCreatedPaymentMethod()Lcom/stripe/android/model/PaymentMethod;
    .locals 1

    .line 468
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->createdPaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    return-object v0
.end method

.method public final getCurrentLaunchMode()Lcom/stripe/android/link/LinkLaunchMode;
    .locals 1

    .line 469
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->currentLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    return-object v0
.end method

.method public final getEmailInput()Ljava/lang/String;
    .locals 1

    .line 466
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->emailInput:Ljava/lang/String;

    return-object v0
.end method

.method public final getLinkComponent()Lcom/stripe/android/link/injection/LinkComponent;
    .locals 1

    .line 465
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->linkComponent:Lcom/stripe/android/link/injection/LinkComponent;

    return-object v0
.end method

.method public final getLinkConfiguration()Lcom/stripe/android/link/LinkConfiguration;
    .locals 1

    .line 472
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->linkComponent:Lcom/stripe/android/link/injection/LinkComponent;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/link/injection/LinkComponent;->getConfiguration$paymentsheet_release()Lcom/stripe/android/link/LinkConfiguration;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSelectedPaymentMethod()Lcom/stripe/android/link/LinkPaymentMethod;
    .locals 1

    .line 467
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->selectedPaymentMethod:Lcom/stripe/android/link/LinkPaymentMethod;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->linkComponent:Lcom/stripe/android/link/injection/LinkComponent;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/link/injection/LinkComponent;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->emailInput:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->selectedPaymentMethod:Lcom/stripe/android/link/LinkPaymentMethod;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/stripe/android/link/LinkPaymentMethod;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->createdPaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/stripe/android/model/PaymentMethod;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->currentLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->linkComponent:Lcom/stripe/android/link/injection/LinkComponent;

    iget-object v1, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->emailInput:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->selectedPaymentMethod:Lcom/stripe/android/link/LinkPaymentMethod;

    iget-object v3, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->createdPaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    iget-object v4, p0, Lcom/stripe/android/link/LinkControllerInteractor$State;->currentLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "State(linkComponent="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, ", emailInput="

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", selectedPaymentMethod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", createdPaymentMethod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", currentLaunchMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
