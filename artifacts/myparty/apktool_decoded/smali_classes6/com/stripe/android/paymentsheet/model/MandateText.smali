.class public final Lcom/stripe/android/paymentsheet/model/MandateText;
.super Ljava/lang/Object;
.source "MandateText.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/model/MandateText;",
        "",
        "text",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "showAbovePrimaryButton",
        "",
        "<init>",
        "(Lcom/stripe/android/core/strings/ResolvableString;Z)V",
        "getText",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "getShowAbovePrimaryButton",
        "()Z",
        "component1",
        "component2",
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
.field private final showAbovePrimaryButton:Z

.field private final text:Lcom/stripe/android/core/strings/ResolvableString;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/core/strings/ResolvableString;Z)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/model/MandateText;->text:Lcom/stripe/android/core/strings/ResolvableString;

    .line 7
    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/model/MandateText;->showAbovePrimaryButton:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/model/MandateText;Lcom/stripe/android/core/strings/ResolvableString;ZILjava/lang/Object;)Lcom/stripe/android/paymentsheet/model/MandateText;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/model/MandateText;->text:Lcom/stripe/android/core/strings/ResolvableString;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Lcom/stripe/android/paymentsheet/model/MandateText;->showAbovePrimaryButton:Z

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/model/MandateText;->copy(Lcom/stripe/android/core/strings/ResolvableString;Z)Lcom/stripe/android/paymentsheet/model/MandateText;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/model/MandateText;->text:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/model/MandateText;->showAbovePrimaryButton:Z

    return v0
.end method

.method public final copy(Lcom/stripe/android/core/strings/ResolvableString;Z)Lcom/stripe/android/paymentsheet/model/MandateText;
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/model/MandateText;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/paymentsheet/model/MandateText;-><init>(Lcom/stripe/android/core/strings/ResolvableString;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/model/MandateText;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/model/MandateText;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/model/MandateText;->text:Lcom/stripe/android/core/strings/ResolvableString;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/model/MandateText;->text:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/model/MandateText;->showAbovePrimaryButton:Z

    iget-boolean p1, p1, Lcom/stripe/android/paymentsheet/model/MandateText;->showAbovePrimaryButton:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getShowAbovePrimaryButton()Z
    .locals 1

    .line 7
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/model/MandateText;->showAbovePrimaryButton:Z

    return v0
.end method

.method public final getText()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/model/MandateText;->text:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/model/MandateText;->text:Lcom/stripe/android/core/strings/ResolvableString;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/model/MandateText;->showAbovePrimaryButton:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/model/MandateText;->text:Lcom/stripe/android/core/strings/ResolvableString;

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/model/MandateText;->showAbovePrimaryButton:Z

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "MandateText(text="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", showAbovePrimaryButton="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
