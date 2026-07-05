.class public final Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;
.super Lcom/stripe/android/uicore/navigation/NavigationIntent;
.source "NavigationManager.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/navigation/NavigationIntent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "NavigateTo"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J)\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u000e\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;",
        "Lcom/stripe/android/uicore/navigation/NavigationIntent;",
        "route",
        "",
        "popUpTo",
        "Lcom/stripe/android/uicore/navigation/PopUpToBehavior;",
        "isSingleTop",
        "",
        "<init>",
        "(Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;Z)V",
        "getRoute",
        "()Ljava/lang/String;",
        "getPopUpTo",
        "()Lcom/stripe/android/uicore/navigation/PopUpToBehavior;",
        "()Z",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "",
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
.field private final isSingleTop:Z

.field private final popUpTo:Lcom/stripe/android/uicore/navigation/PopUpToBehavior;

.field private final route:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;Z)V
    .locals 1

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 51
    invoke-direct {p0, v0}, Lcom/stripe/android/uicore/navigation/NavigationIntent;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 48
    iput-object p1, p0, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;->route:Ljava/lang/String;

    .line 49
    iput-object p2, p0, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;->popUpTo:Lcom/stripe/android/uicore/navigation/PopUpToBehavior;

    .line 50
    iput-boolean p3, p0, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;->isSingleTop:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;->route:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;->popUpTo:Lcom/stripe/android/uicore/navigation/PopUpToBehavior;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;->isSingleTop:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;->copy(Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;Z)Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;->route:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/uicore/navigation/PopUpToBehavior;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;->popUpTo:Lcom/stripe/android/uicore/navigation/PopUpToBehavior;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;->isSingleTop:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;Z)Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;
    .locals 1

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;-><init>(Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;

    iget-object v1, p0, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;->route:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;->route:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;->popUpTo:Lcom/stripe/android/uicore/navigation/PopUpToBehavior;

    iget-object v3, p1, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;->popUpTo:Lcom/stripe/android/uicore/navigation/PopUpToBehavior;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;->isSingleTop:Z

    iget-boolean p1, p1, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;->isSingleTop:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getPopUpTo()Lcom/stripe/android/uicore/navigation/PopUpToBehavior;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;->popUpTo:Lcom/stripe/android/uicore/navigation/PopUpToBehavior;

    return-object v0
.end method

.method public final getRoute()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;->route:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;->route:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;->popUpTo:Lcom/stripe/android/uicore/navigation/PopUpToBehavior;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;->isSingleTop:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isSingleTop()Z
    .locals 1

    .line 50
    iget-boolean v0, p0, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;->isSingleTop:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;->route:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;->popUpTo:Lcom/stripe/android/uicore/navigation/PopUpToBehavior;

    iget-boolean v2, p0, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;->isSingleTop:Z

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "NavigateTo(route="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", popUpTo="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isSingleTop="

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
