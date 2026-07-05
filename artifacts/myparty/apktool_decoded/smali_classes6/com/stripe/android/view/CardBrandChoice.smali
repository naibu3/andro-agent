.class public final Lcom/stripe/android/view/CardBrandChoice;
.super Ljava/lang/Object;
.source "CardBrandChoice.kt"

# interfaces
.implements Lcom/stripe/android/uicore/elements/SingleChoiceDropdownItem;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0010\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0081\u0008\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003J.\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/stripe/android/view/CardBrandChoice;",
        "Lcom/stripe/android/uicore/elements/SingleChoiceDropdownItem;",
        "label",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "icon",
        "",
        "enabled",
        "",
        "<init>",
        "(Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/Integer;Z)V",
        "getLabel",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "getIcon",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getEnabled",
        "()Z",
        "component1",
        "component2",
        "component3",
        "copy",
        "(Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/Integer;Z)Lcom/stripe/android/view/CardBrandChoice;",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "payments-core_release"
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
.field private final enabled:Z

.field private final icon:Ljava/lang/Integer;

.field private final label:Lcom/stripe/android/core/strings/ResolvableString;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/Integer;Z)V
    .locals 1

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lcom/stripe/android/view/CardBrandChoice;->label:Lcom/stripe/android/core/strings/ResolvableString;

    .line 8
    iput-object p2, p0, Lcom/stripe/android/view/CardBrandChoice;->icon:Ljava/lang/Integer;

    .line 9
    iput-boolean p3, p0, Lcom/stripe/android/view/CardBrandChoice;->enabled:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/view/CardBrandChoice;Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/Integer;ZILjava/lang/Object;)Lcom/stripe/android/view/CardBrandChoice;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/view/CardBrandChoice;->label:Lcom/stripe/android/core/strings/ResolvableString;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/view/CardBrandChoice;->icon:Ljava/lang/Integer;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Lcom/stripe/android/view/CardBrandChoice;->enabled:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/view/CardBrandChoice;->copy(Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/Integer;Z)Lcom/stripe/android/view/CardBrandChoice;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardBrandChoice;->label:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardBrandChoice;->icon:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/CardBrandChoice;->enabled:Z

    return v0
.end method

.method public final copy(Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/Integer;Z)Lcom/stripe/android/view/CardBrandChoice;
    .locals 1

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/view/CardBrandChoice;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/view/CardBrandChoice;-><init>(Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/Integer;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/view/CardBrandChoice;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/view/CardBrandChoice;

    iget-object v1, p0, Lcom/stripe/android/view/CardBrandChoice;->label:Lcom/stripe/android/core/strings/ResolvableString;

    iget-object v3, p1, Lcom/stripe/android/view/CardBrandChoice;->label:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/view/CardBrandChoice;->icon:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/stripe/android/view/CardBrandChoice;->icon:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/view/CardBrandChoice;->enabled:Z

    iget-boolean p1, p1, Lcom/stripe/android/view/CardBrandChoice;->enabled:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public getEnabled()Z
    .locals 1

    .line 9
    iget-boolean v0, p0, Lcom/stripe/android/view/CardBrandChoice;->enabled:Z

    return v0
.end method

.method public getIcon()Ljava/lang/Integer;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/stripe/android/view/CardBrandChoice;->icon:Ljava/lang/Integer;

    return-object v0
.end method

.method public getLabel()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/stripe/android/view/CardBrandChoice;->label:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/view/CardBrandChoice;->label:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/view/CardBrandChoice;->icon:Ljava/lang/Integer;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/view/CardBrandChoice;->enabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/view/CardBrandChoice;->label:Lcom/stripe/android/core/strings/ResolvableString;

    iget-object v1, p0, Lcom/stripe/android/view/CardBrandChoice;->icon:Ljava/lang/Integer;

    iget-boolean v2, p0, Lcom/stripe/android/view/CardBrandChoice;->enabled:Z

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "CardBrandChoice(label="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", icon="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", enabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
