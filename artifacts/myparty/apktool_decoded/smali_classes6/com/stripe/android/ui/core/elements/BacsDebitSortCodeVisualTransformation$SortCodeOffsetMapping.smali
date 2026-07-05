.class final Lcom/stripe/android/ui/core/elements/BacsDebitSortCodeVisualTransformation$SortCodeOffsetMapping;
.super Ljava/lang/Object;
.source "BacsDebitSortCodeVisualTransformation.kt"

# interfaces
.implements Landroidx/compose/ui/text/input/OffsetMapping;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/ui/core/elements/BacsDebitSortCodeVisualTransformation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "SortCodeOffsetMapping"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/BacsDebitSortCodeVisualTransformation$SortCodeOffsetMapping;",
        "Landroidx/compose/ui/text/input/OffsetMapping;",
        "<init>",
        "()V",
        "DIVISIBLE",
        "",
        "originalToTransformed",
        "offset",
        "transformedToOriginal",
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
.field private static final DIVISIBLE:I = 0x2

.field public static final INSTANCE:Lcom/stripe/android/ui/core/elements/BacsDebitSortCodeVisualTransformation$SortCodeOffsetMapping;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/ui/core/elements/BacsDebitSortCodeVisualTransformation$SortCodeOffsetMapping;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/elements/BacsDebitSortCodeVisualTransformation$SortCodeOffsetMapping;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/elements/BacsDebitSortCodeVisualTransformation$SortCodeOffsetMapping;->INSTANCE:Lcom/stripe/android/ui/core/elements/BacsDebitSortCodeVisualTransformation$SortCodeOffsetMapping;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public originalToTransformed(I)I
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 32
    :cond_0
    div-int/lit8 v0, p1, 0x2

    add-int/2addr v0, p1

    .line 34
    rem-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    add-int/lit8 v0, v0, -0x1

    :cond_1
    return v0
.end method

.method public transformedToOriginal(I)I
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 45
    :cond_0
    div-int/lit8 v0, p1, 0x3

    sub-int/2addr p1, v0

    return p1
.end method
