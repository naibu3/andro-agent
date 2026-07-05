.class public final Lcom/stripe/android/view/ThemeConfig;
.super Ljava/lang/Object;
.source "ThemeConfig.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0015\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0001\u00a2\u0006\u0002\u0008\u0015J\u0015\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0001\u00a2\u0006\u0002\u0008\u0017J\u0015\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0001\u00a2\u0006\u0002\u0008\u0019J$\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0001\u0010\u001b\u001a\u00020\t2\u0008\u0008\u0001\u0010\u001c\u001a\u00020\tH\u0003R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u00020\t8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\t8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\t8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000c\u001a\u00020\t8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\t8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/view/ThemeConfig;",
        "",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "colorUtils",
        "Lcom/stripe/android/view/StripeColorUtils;",
        "selectedColorInt",
        "",
        "unselectedColorInt",
        "unselectedTextColorInt",
        "selectedTextAlphaColorInt",
        "unselectedTextAlphaColorInt",
        "textColorValues",
        "",
        "getTextColorValues$payments_core_release",
        "()[I",
        "getTintColor",
        "isSelected",
        "",
        "getTintColor$payments_core_release",
        "getTextColor",
        "getTextColor$payments_core_release",
        "getTextAlphaColor",
        "getTextAlphaColor$payments_core_release",
        "determineColor",
        "defaultColor",
        "colorIfTransparent",
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
.field private final colorUtils:Lcom/stripe/android/view/StripeColorUtils;

.field private final selectedColorInt:I

.field private final selectedTextAlphaColorInt:I

.field private final textColorValues:[I

.field private final unselectedColorInt:I

.field private final unselectedTextAlphaColorInt:I

.field private final unselectedTextColorInt:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Lcom/stripe/android/view/StripeColorUtils;

    invoke-direct {v0, p1}, Lcom/stripe/android/view/StripeColorUtils;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/stripe/android/view/ThemeConfig;->colorUtils:Lcom/stripe/android/view/StripeColorUtils;

    .line 16
    invoke-virtual {v0}, Lcom/stripe/android/view/StripeColorUtils;->getColorAccent()I

    move-result v1

    .line 17
    sget v2, Lcom/stripe/android/R$color;->stripe_accent_color_default:I

    .line 14
    invoke-direct {p0, p1, v1, v2}, Lcom/stripe/android/view/ThemeConfig;->determineColor(Landroid/content/Context;II)I

    move-result v1

    iput v1, p0, Lcom/stripe/android/view/ThemeConfig;->selectedColorInt:I

    .line 23
    invoke-virtual {v0}, Lcom/stripe/android/view/StripeColorUtils;->getColorControlNormal()I

    move-result v2

    .line 24
    sget v3, Lcom/stripe/android/R$color;->stripe_control_normal_color_default:I

    .line 21
    invoke-direct {p0, p1, v2, v3}, Lcom/stripe/android/view/ThemeConfig;->determineColor(Landroid/content/Context;II)I

    move-result v2

    iput v2, p0, Lcom/stripe/android/view/ThemeConfig;->unselectedColorInt:I

    .line 30
    invoke-virtual {v0}, Lcom/stripe/android/view/StripeColorUtils;->getTextColorSecondary()I

    move-result v0

    .line 31
    sget v2, Lcom/stripe/android/R$color;->stripe_color_text_secondary_default:I

    .line 28
    invoke-direct {p0, p1, v0, v2}, Lcom/stripe/android/view/ThemeConfig;->determineColor(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lcom/stripe/android/view/ThemeConfig;->unselectedTextColorInt:I

    .line 37
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/stripe/android/R$integer;->stripe_light_text_alpha_hex:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v2

    .line 35
    invoke-static {v1, v2}, Landroidx/core/graphics/ColorUtils;->setAlphaComponent(II)I

    move-result v2

    iput v2, p0, Lcom/stripe/android/view/ThemeConfig;->selectedTextAlphaColorInt:I

    .line 43
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v3, Lcom/stripe/android/R$integer;->stripe_light_text_alpha_hex:I

    invoke-virtual {p1, v3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p1

    .line 41
    invoke-static {v0, p1}, Landroidx/core/graphics/ColorUtils;->setAlphaComponent(II)I

    move-result p1

    iput p1, p0, Lcom/stripe/android/view/ThemeConfig;->unselectedTextAlphaColorInt:I

    .line 50
    filled-new-array {v1, v2, v0, p1}, [I

    move-result-object p1

    .line 46
    iput-object p1, p0, Lcom/stripe/android/view/ThemeConfig;->textColorValues:[I

    return-void
.end method

.method private final determineColor(Landroid/content/Context;II)I
    .locals 1

    .line 74
    sget-object v0, Lcom/stripe/android/view/StripeColorUtils;->Companion:Lcom/stripe/android/view/StripeColorUtils$Companion;

    invoke-virtual {v0, p2}, Lcom/stripe/android/view/StripeColorUtils$Companion;->isColorTransparent(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 75
    invoke-static {p1, p3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    return p1

    :cond_0
    return p2
.end method


# virtual methods
.method public final getTextAlphaColor$payments_core_release(Z)I
    .locals 0

    if-eqz p1, :cond_0

    .line 65
    iget p1, p0, Lcom/stripe/android/view/ThemeConfig;->selectedTextAlphaColorInt:I

    return p1

    :cond_0
    iget p1, p0, Lcom/stripe/android/view/ThemeConfig;->unselectedTextAlphaColorInt:I

    return p1
.end method

.method public final getTextColor$payments_core_release(Z)I
    .locals 0

    if-eqz p1, :cond_0

    .line 60
    iget p1, p0, Lcom/stripe/android/view/ThemeConfig;->selectedColorInt:I

    return p1

    :cond_0
    iget p1, p0, Lcom/stripe/android/view/ThemeConfig;->unselectedTextColorInt:I

    return p1
.end method

.method public final getTextColorValues$payments_core_release()[I
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/stripe/android/view/ThemeConfig;->textColorValues:[I

    return-object v0
.end method

.method public final getTintColor$payments_core_release(Z)I
    .locals 0

    if-eqz p1, :cond_0

    .line 55
    iget p1, p0, Lcom/stripe/android/view/ThemeConfig;->selectedColorInt:I

    return p1

    :cond_0
    iget p1, p0, Lcom/stripe/android/view/ThemeConfig;->unselectedColorInt:I

    return p1
.end method
