.class public final Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;
.super Ljava/lang/Object;
.source "SelectSavedPaymentMethodsInteractor.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "State"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0016\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B?\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003JM\u0010\u001a\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0011R\u0011\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0011\u00a8\u0006!"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;",
        "",
        "paymentOptionsItems",
        "",
        "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
        "selectedPaymentOptionsItem",
        "isEditing",
        "",
        "isProcessing",
        "canEdit",
        "canRemove",
        "<init>",
        "(Ljava/util/List;Lcom/stripe/android/paymentsheet/PaymentOptionsItem;ZZZZ)V",
        "getPaymentOptionsItems",
        "()Ljava/util/List;",
        "getSelectedPaymentOptionsItem",
        "()Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
        "()Z",
        "getCanEdit",
        "getCanRemove",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "other",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final canEdit:Z

.field private final canRemove:Z

.field private final isEditing:Z

.field private final isProcessing:Z

.field private final paymentOptionsItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
            ">;"
        }
    .end annotation
.end field

.field private final selectedPaymentOptionsItem:Lcom/stripe/android/paymentsheet/PaymentOptionsItem;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lcom/stripe/android/paymentsheet/PaymentOptionsItem;ZZZZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
            ">;",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
            "ZZZZ)V"
        }
    .end annotation

    const-string v0, "paymentOptionsItems"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->paymentOptionsItems:Ljava/util/List;

    .line 37
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->selectedPaymentOptionsItem:Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    .line 38
    iput-boolean p3, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->isEditing:Z

    .line 39
    iput-boolean p4, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->isProcessing:Z

    .line 40
    iput-boolean p5, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->canEdit:Z

    .line 41
    iput-boolean p6, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->canRemove:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;Ljava/util/List;Lcom/stripe/android/paymentsheet/PaymentOptionsItem;ZZZZILjava/lang/Object;)Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->paymentOptionsItems:Ljava/util/List;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->selectedPaymentOptionsItem:Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-boolean p3, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->isEditing:Z

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-boolean p4, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->isProcessing:Z

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-boolean p5, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->canEdit:Z

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-boolean p6, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->canRemove:Z

    :cond_5
    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->copy(Ljava/util/List;Lcom/stripe/android/paymentsheet/PaymentOptionsItem;ZZZZ)Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->paymentOptionsItems:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/paymentsheet/PaymentOptionsItem;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->selectedPaymentOptionsItem:Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->isEditing:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->isProcessing:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->canEdit:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->canRemove:Z

    return v0
.end method

.method public final copy(Ljava/util/List;Lcom/stripe/android/paymentsheet/PaymentOptionsItem;ZZZZ)Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
            ">;",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
            "ZZZZ)",
            "Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;"
        }
    .end annotation

    const-string v0, "paymentOptionsItems"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;-><init>(Ljava/util/List;Lcom/stripe/android/paymentsheet/PaymentOptionsItem;ZZZZ)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->paymentOptionsItems:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->paymentOptionsItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->selectedPaymentOptionsItem:Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->selectedPaymentOptionsItem:Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->isEditing:Z

    iget-boolean v3, p1, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->isEditing:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->isProcessing:Z

    iget-boolean v3, p1, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->isProcessing:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->canEdit:Z

    iget-boolean v3, p1, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->canEdit:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->canRemove:Z

    iget-boolean p1, p1, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->canRemove:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getCanEdit()Z
    .locals 1

    .line 40
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->canEdit:Z

    return v0
.end method

.method public final getCanRemove()Z
    .locals 1

    .line 41
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->canRemove:Z

    return v0
.end method

.method public final getPaymentOptionsItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
            ">;"
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->paymentOptionsItems:Ljava/util/List;

    return-object v0
.end method

.method public final getSelectedPaymentOptionsItem()Lcom/stripe/android/paymentsheet/PaymentOptionsItem;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->selectedPaymentOptionsItem:Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->paymentOptionsItems:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->selectedPaymentOptionsItem:Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->isEditing:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->isProcessing:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->canEdit:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->canRemove:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isEditing()Z
    .locals 1

    .line 38
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->isEditing:Z

    return v0
.end method

.method public final isProcessing()Z
    .locals 1

    .line 39
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->isProcessing:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->paymentOptionsItems:Ljava/util/List;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->selectedPaymentOptionsItem:Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->isEditing:Z

    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->isProcessing:Z

    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->canEdit:Z

    iget-boolean v5, p0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->canRemove:Z

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "State(paymentOptionsItems="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, ", selectedPaymentOptionsItem="

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isEditing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isProcessing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", canEdit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", canRemove="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
