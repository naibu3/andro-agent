.class public final Lcom/stripe/android/uicore/CustomTypefaceSpan;
.super Landroid/text/style/MetricAffectingSpan;
.source "StripeTheme.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/CustomTypefaceSpan$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u0000 \u000c2\u00020\u0001:\u0001\u000cB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/uicore/CustomTypefaceSpan;",
        "Landroid/text/style/MetricAffectingSpan;",
        "typeface",
        "Landroid/graphics/Typeface;",
        "<init>",
        "(Landroid/graphics/Typeface;)V",
        "updateDrawState",
        "",
        "ds",
        "Landroid/text/TextPaint;",
        "updateMeasureState",
        "paint",
        "Companion",
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
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/uicore/CustomTypefaceSpan$Companion;


# instance fields
.field private final typeface:Landroid/graphics/Typeface;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/uicore/CustomTypefaceSpan$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/uicore/CustomTypefaceSpan$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/CustomTypefaceSpan;->Companion:Lcom/stripe/android/uicore/CustomTypefaceSpan$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/uicore/CustomTypefaceSpan;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Typeface;)V
    .locals 1

    const-string v0, "typeface"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 681
    invoke-direct {p0}, Landroid/text/style/MetricAffectingSpan;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/uicore/CustomTypefaceSpan;->typeface:Landroid/graphics/Typeface;

    return-void
.end method


# virtual methods
.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 2

    const-string v0, "ds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 683
    sget-object v0, Lcom/stripe/android/uicore/CustomTypefaceSpan;->Companion:Lcom/stripe/android/uicore/CustomTypefaceSpan$Companion;

    check-cast p1, Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/stripe/android/uicore/CustomTypefaceSpan;->typeface:Landroid/graphics/Typeface;

    invoke-static {v0, p1, v1}, Lcom/stripe/android/uicore/CustomTypefaceSpan$Companion;->access$applyCustomTypeFace(Lcom/stripe/android/uicore/CustomTypefaceSpan$Companion;Landroid/graphics/Paint;Landroid/graphics/Typeface;)V

    return-void
.end method

.method public updateMeasureState(Landroid/text/TextPaint;)V
    .locals 2

    const-string v0, "paint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 687
    sget-object v0, Lcom/stripe/android/uicore/CustomTypefaceSpan;->Companion:Lcom/stripe/android/uicore/CustomTypefaceSpan$Companion;

    check-cast p1, Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/stripe/android/uicore/CustomTypefaceSpan;->typeface:Landroid/graphics/Typeface;

    invoke-static {v0, p1, v1}, Lcom/stripe/android/uicore/CustomTypefaceSpan$Companion;->access$applyCustomTypeFace(Lcom/stripe/android/uicore/CustomTypefaceSpan$Companion;Landroid/graphics/Paint;Landroid/graphics/Typeface;)V

    return-void
.end method
