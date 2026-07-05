.class public final Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;
.super Lcom/stripe/android/uicore/elements/TextFieldIcon;
.source "TextFieldController.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/TextFieldIcon;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Dropdown"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u0001 B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00070\tH\u00c6\u0003J7\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\tH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006!"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;",
        "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
        "title",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "hide",
        "",
        "currentItem",
        "Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;",
        "items",
        "",
        "<init>",
        "(Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;Ljava/util/List;)V",
        "getTitle",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "getHide",
        "()Z",
        "getCurrentItem",
        "()Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;",
        "getItems",
        "()Ljava/util/List;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
        "Item",
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
.field private final currentItem:Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;

.field private final hide:Z

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;",
            ">;"
        }
    .end annotation
.end field

.field private final title:Lcom/stripe/android/core/strings/ResolvableString;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            "Z",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;",
            ">;)V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentItem"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 105
    invoke-direct {p0, v0}, Lcom/stripe/android/uicore/elements/TextFieldIcon;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 101
    iput-object p1, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->title:Lcom/stripe/android/core/strings/ResolvableString;

    .line 102
    iput-boolean p2, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->hide:Z

    .line 103
    iput-object p3, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->currentItem:Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;

    .line 104
    iput-object p4, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->items:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->title:Lcom/stripe/android/core/strings/ResolvableString;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p2, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->hide:Z

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->currentItem:Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->items:Ljava/util/List;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->copy(Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;Ljava/util/List;)Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->title:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->hide:Z

    return v0
.end method

.method public final component3()Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->currentItem:Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->items:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;Ljava/util/List;)Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            "Z",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;",
            ">;)",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentItem"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;-><init>(Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->title:Lcom/stripe/android/core/strings/ResolvableString;

    iget-object v3, p1, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->title:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->hide:Z

    iget-boolean v3, p1, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->hide:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->currentItem:Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;

    iget-object v3, p1, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->currentItem:Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->items:Ljava/util/List;

    iget-object p1, p1, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->items:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCurrentItem()Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->currentItem:Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;

    return-object v0
.end method

.method public final getHide()Z
    .locals 1

    .line 102
    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->hide:Z

    return v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;",
            ">;"
        }
    .end annotation

    .line 104
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getTitle()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->title:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->title:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->hide:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->currentItem:Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->items:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->title:Lcom/stripe/android/core/strings/ResolvableString;

    iget-boolean v1, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->hide:Z

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->currentItem:Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;

    iget-object v3, p0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;->items:Ljava/util/List;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Dropdown(title="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", hide="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", currentItem="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", items="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
