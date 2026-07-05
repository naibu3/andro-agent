.class public final Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;
.super Ljava/lang/Object;
.source "CardDetailsEntry.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0016\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003J\u0006\u0010\u0011\u001a\u00020\rJ\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\r2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;",
        "",
        "cardBrandChoice",
        "Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;",
        "expiryDateState",
        "Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;)V",
        "getCardBrandChoice",
        "()Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;",
        "getExpiryDateState",
        "()Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;",
        "hasChanged",
        "",
        "editCardPayload",
        "Lcom/stripe/android/paymentsheet/ui/EditCardPayload;",
        "originalCardBrandChoice",
        "isComplete",
        "expiryDateHasChanged",
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
.field public static final $stable:I


# instance fields
.field private final cardBrandChoice:Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

.field private final expiryDateState:Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;)V
    .locals 1

    const-string v0, "cardBrandChoice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expiryDateState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->cardBrandChoice:Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    .line 14
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->expiryDateState:Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->cardBrandChoice:Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->expiryDateState:Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->copy(Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;)Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;

    move-result-object p0

    return-object p0
.end method

.method private final expiryDateHasChanged(Lcom/stripe/android/paymentsheet/ui/EditCardPayload;)Z
    .locals 2

    .line 36
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/EditCardPayload;->getExpiryMonth()Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->expiryDateState:Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->getExpiryMonth()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 37
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/EditCardPayload;->getExpiryYear()Ljava/lang/Integer;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->expiryDateState:Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->getExpiryYear()Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->cardBrandChoice:Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->expiryDateState:Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;)Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;
    .locals 1

    const-string v0, "cardBrandChoice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expiryDateState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;-><init>(Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->cardBrandChoice:Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->cardBrandChoice:Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->expiryDateState:Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->expiryDateState:Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getCardBrandChoice()Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->cardBrandChoice:Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    return-object v0
.end method

.method public final getExpiryDateState()Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->expiryDateState:Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;

    return-object v0
.end method

.method public final hasChanged(Lcom/stripe/android/paymentsheet/ui/EditCardPayload;Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;)Z
    .locals 1

    const-string v0, "editCardPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originalCardBrandChoice"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->cardBrandChoice:Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 27
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->expiryDateHasChanged(Lcom/stripe/android/paymentsheet/ui/EditCardPayload;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->cardBrandChoice:Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->expiryDateState:Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isComplete()Z
    .locals 2

    .line 31
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->expiryDateState:Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->getEnabled()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    .line 32
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->expiryDateState:Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->getExpiryMonth()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->expiryDateState:Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->getExpiryYear()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->cardBrandChoice:Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->expiryDateState:Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "CardDetailsEntry(cardBrandChoice="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", expiryDateState="

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
