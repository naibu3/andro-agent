.class public final Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;
.super Ljava/lang/Object;
.source "TextFieldController.kt"

# interfaces
.implements Lcom/stripe/android/uicore/elements/SingleChoiceDropdownItem;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Item"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\tH\u00c6\u0003J1\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\t2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0008\u001a\u00020\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;",
        "Lcom/stripe/android/uicore/elements/SingleChoiceDropdownItem;",
        "id",
        "",
        "label",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "icon",
        "",
        "enabled",
        "",
        "<init>",
        "(Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;IZ)V",
        "getId",
        "()Ljava/lang/String;",
        "getLabel",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "getIcon",
        "()Ljava/lang/Integer;",
        "getEnabled",
        "()Z",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "stripe-ui-core_release"
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

.field private final icon:I

.field private final id:Ljava/lang/String;

.field private final label:Lcom/stripe/android/core/strings/ResolvableString;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;IZ)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    iput-object p1, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->id:Ljava/lang/String;

    .line 109
    iput-object p2, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->label:Lcom/stripe/android/core/strings/ResolvableString;

    .line 110
    iput p3, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->icon:I

    .line 111
    iput-boolean p4, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->enabled:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x1

    .line 107
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;-><init>(Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;IZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;IZILjava/lang/Object;)Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->label:Lcom/stripe/android/core/strings/ResolvableString;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->icon:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->enabled:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->copy(Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;IZ)Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->label:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->icon:I

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->enabled:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;IZ)Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;-><init>(Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;IZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->label:Lcom/stripe/android/core/strings/ResolvableString;

    iget-object v3, p1, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->label:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->icon:I

    iget v3, p1, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->icon:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->enabled:Z

    iget-boolean p1, p1, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->enabled:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public getEnabled()Z
    .locals 1

    .line 111
    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->enabled:Z

    return v0
.end method

.method public getIcon()Ljava/lang/Integer;
    .locals 1

    .line 110
    iget v0, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->icon:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getLabel()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->label:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->label:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->icon:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->enabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->label:Lcom/stripe/android/core/strings/ResolvableString;

    iget v2, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->icon:I

    iget-boolean v3, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->enabled:Z

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Item(id="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", label="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", icon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", enabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
