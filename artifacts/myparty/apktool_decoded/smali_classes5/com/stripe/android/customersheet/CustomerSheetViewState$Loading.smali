.class public final Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;
.super Lcom/stripe/android/customersheet/CustomerSheetViewState;
.source "CustomerSheetViewState.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/CustomerSheetViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Loading"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\u00020\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0006\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;",
        "Lcom/stripe/android/customersheet/CustomerSheetViewState;",
        "isLiveMode",
        "",
        "<init>",
        "(Z)V",
        "()Z",
        "topBarState",
        "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;",
        "onEditIconPressed",
        "Lkotlin/Function0;",
        "",
        "component1",
        "copy",
        "equals",
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
.field private final isLiveMode:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 43
    invoke-direct {p0, p1, v0, v0, v1}, Lcom/stripe/android/customersheet/CustomerSheetViewState;-><init>(ZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 42
    iput-boolean p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;->isLiveMode:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;ZILjava/lang/Object;)Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-boolean p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;->isLiveMode:Z

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;->copy(Z)Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;->isLiveMode:Z

    return v0
.end method

.method public final copy(Z)Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;
    .locals 1

    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;

    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;-><init>(Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;

    iget-boolean v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;->isLiveMode:Z

    iget-boolean p1, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;->isLiveMode:Z

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;->isLiveMode:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    return v0
.end method

.method public isLiveMode()Z
    .locals 1

    .line 42
    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;->isLiveMode:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;->isLiveMode:Z

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Loading(isLiveMode="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public topBarState(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;"
        }
    .end annotation

    const-string v0, "onEditIconPressed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    sget-object p1, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateFactory;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateFactory;

    .line 50
    invoke-virtual {p0}, Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;->isLiveMode()Z

    move-result v0

    .line 51
    sget-object v1, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable$Never;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable$Never;

    check-cast v1, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable;

    .line 49
    invoke-virtual {p1, v0, v1}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateFactory;->create(ZLcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable;)Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    move-result-object p1

    return-object p1
.end method
