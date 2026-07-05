.class public final Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$FourteenAndFifteenPanLength;
.super Ljava/lang/Object;
.source "CardNumberVisualTransformations.kt"

# interfaces
.implements Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "FourteenAndFifteenPanLength"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000c\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$FourteenAndFifteenPanLength;",
        "Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations;",
        "separator",
        "",
        "<init>",
        "(C)V",
        "getSeparator",
        "()C",
        "filter",
        "Landroidx/compose/ui/text/input/TransformedText;",
        "text",
        "Landroidx/compose/ui/text/AnnotatedString;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
        "payments-ui-core_release"
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
.field private final separator:C


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(C)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-char p1, p0, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$FourteenAndFifteenPanLength;->separator:C

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$FourteenAndFifteenPanLength;CILjava/lang/Object;)Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$FourteenAndFifteenPanLength;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-char p1, p0, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$FourteenAndFifteenPanLength;->separator:C

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$FourteenAndFifteenPanLength;->copy(C)Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$FourteenAndFifteenPanLength;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()C
    .locals 1

    iget-char v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$FourteenAndFifteenPanLength;->separator:C

    return v0
.end method

.method public final copy(C)Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$FourteenAndFifteenPanLength;
    .locals 1

    new-instance v0, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$FourteenAndFifteenPanLength;

    invoke-direct {v0, p1}, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$FourteenAndFifteenPanLength;-><init>(C)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$FourteenAndFifteenPanLength;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$FourteenAndFifteenPanLength;

    iget-char v1, p0, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$FourteenAndFifteenPanLength;->separator:C

    iget-char p1, p1, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$FourteenAndFifteenPanLength;->separator:C

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public filter(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;
    .locals 9

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const-string v1, ""

    const/4 v2, 0x0

    move-object v4, v1

    :goto_0
    if-ge v2, v0, :cond_1

    .line 52
    invoke-virtual {p1, v2}, Landroidx/compose/ui/text/AnnotatedString;->charAt(I)C

    move-result v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x3

    if-eq v2, v3, :cond_0

    const/16 v3, 0x9

    if-eq v2, v3, :cond_0

    :goto_1
    move-object v4, v1

    goto :goto_2

    .line 53
    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$FourteenAndFifteenPanLength;->getSeparator()C

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 65
    :cond_1
    new-instance p1, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$FourteenAndFifteenPanLength$filter$creditCardOffsetTranslator$1;

    invoke-direct {p1}, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$FourteenAndFifteenPanLength$filter$creditCardOffsetTranslator$1;-><init>()V

    .line 79
    new-instance v0, Landroidx/compose/ui/text/input/TransformedText;

    new-instance v3, Landroidx/compose/ui/text/AnnotatedString;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p1, Landroidx/compose/ui/text/input/OffsetMapping;

    invoke-direct {v0, v3, p1}, Landroidx/compose/ui/text/input/TransformedText;-><init>(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/input/OffsetMapping;)V

    return-object v0
.end method

.method public getSeparator()C
    .locals 1

    .line 48
    iget-char v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$FourteenAndFifteenPanLength;->separator:C

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-char v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$FourteenAndFifteenPanLength;->separator:C

    invoke-static {v0}, Ljava/lang/Character;->hashCode(C)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-char v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$FourteenAndFifteenPanLength;->separator:C

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "FourteenAndFifteenPanLength(separator="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
