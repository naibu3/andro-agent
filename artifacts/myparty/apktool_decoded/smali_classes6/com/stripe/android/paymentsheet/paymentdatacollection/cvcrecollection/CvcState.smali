.class public final Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;
.super Ljava/lang/Object;
.source "CvcState.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u000f2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0012H\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006!"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;",
        "",
        "cvc",
        "",
        "cardBrand",
        "Lcom/stripe/android/model/CardBrand;",
        "<init>",
        "(Ljava/lang/String;Lcom/stripe/android/model/CardBrand;)V",
        "getCvc",
        "()Ljava/lang/String;",
        "getCardBrand",
        "()Lcom/stripe/android/model/CardBrand;",
        "cvcTextFieldConfig",
        "Lcom/stripe/android/ui/core/elements/CvcConfig;",
        "isValid",
        "",
        "()Z",
        "label",
        "",
        "getLabel",
        "()I",
        "cvcIcon",
        "Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;",
        "getCvcIcon",
        "()Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;",
        "updateCvc",
        "component1",
        "component2",
        "copy",
        "equals",
        "other",
        "hashCode",
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
.field private final cardBrand:Lcom/stripe/android/model/CardBrand;

.field private final cvc:Ljava/lang/String;

.field private final cvcIcon:Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;

.field private final cvcTextFieldConfig:Lcom/stripe/android/ui/core/elements/CvcConfig;

.field private final isValid:Z

.field private final label:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/model/CardBrand;)V
    .locals 7

    const-string v0, "cvc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardBrand"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;->cvc:Ljava/lang/String;

    .line 12
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;->cardBrand:Lcom/stripe/android/model/CardBrand;

    .line 14
    new-instance v0, Lcom/stripe/android/ui/core/elements/CvcConfig;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/elements/CvcConfig;-><init>()V

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;->cvcTextFieldConfig:Lcom/stripe/android/ui/core/elements/CvcConfig;

    .line 19
    invoke-virtual {p2}, Lcom/stripe/android/model/CardBrand;->getMaxCvcLength()I

    move-result v1

    .line 16
    invoke-virtual {v0, p2, p1, v1}, Lcom/stripe/android/ui/core/elements/CvcConfig;->determineState(Lcom/stripe/android/model/CardBrand;Ljava/lang/String;I)Lcom/stripe/android/uicore/elements/TextFieldState;

    move-result-object p1

    .line 20
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldState;->isValid()Z

    move-result p1

    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;->isValid:Z

    .line 22
    sget-object p1, Lcom/stripe/android/model/CardBrand;->AmericanExpress:Lcom/stripe/android/model/CardBrand;

    if-ne p2, p1, :cond_0

    .line 23
    sget p1, Lcom/stripe/android/R$string;->stripe_cvc_amex_hint:I

    goto :goto_0

    .line 25
    :cond_0
    sget p1, Lcom/stripe/android/R$string;->stripe_cvc_number_hint:I

    .line 22
    :goto_0
    iput p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;->label:I

    .line 28
    new-instance v0, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;

    invoke-virtual {p2}, Lcom/stripe/android/model/CardBrand;->getCvcIcon()I

    move-result v1

    const/16 v5, 0xa

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;-><init>(ILjava/lang/Integer;ZLkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;->cvcIcon:Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;Ljava/lang/String;Lcom/stripe/android/model/CardBrand;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;->cvc:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;->cardBrand:Lcom/stripe/android/model/CardBrand;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;->copy(Ljava/lang/String;Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;->cvc:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/model/CardBrand;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;->cardBrand:Lcom/stripe/android/model/CardBrand;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;
    .locals 1

    const-string v0, "cvc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardBrand"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;-><init>(Ljava/lang/String;Lcom/stripe/android/model/CardBrand;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;->cvc:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;->cvc:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;->cardBrand:Lcom/stripe/android/model/CardBrand;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;->cardBrand:Lcom/stripe/android/model/CardBrand;

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getCardBrand()Lcom/stripe/android/model/CardBrand;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;->cardBrand:Lcom/stripe/android/model/CardBrand;

    return-object v0
.end method

.method public final getCvc()Ljava/lang/String;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;->cvc:Ljava/lang/String;

    return-object v0
.end method

.method public final getCvcIcon()Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;->cvcIcon:Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;

    return-object v0
.end method

.method public final getLabel()I
    .locals 1

    .line 22
    iget v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;->label:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;->cvc:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;->cardBrand:Lcom/stripe/android/model/CardBrand;

    invoke-virtual {v1}, Lcom/stripe/android/model/CardBrand;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isValid()Z
    .locals 1

    .line 16
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;->isValid:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;->cvc:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;->cardBrand:Lcom/stripe/android/model/CardBrand;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "CvcState(cvc="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", cardBrand="

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

.method public final updateCvc(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;
    .locals 2

    const-string v0, "cvc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;->cardBrand:Lcom/stripe/android/model/CardBrand;

    invoke-virtual {v1}, Lcom/stripe/android/model/CardBrand;->getMaxCvcLength()I

    move-result v1

    if-le v0, v1, :cond_0

    return-object p0

    .line 32
    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;

    .line 34
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;->cardBrand:Lcom/stripe/android/model/CardBrand;

    .line 32
    invoke-direct {v0, p1, v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;-><init>(Ljava/lang/String;Lcom/stripe/android/model/CardBrand;)V

    return-object v0
.end method
