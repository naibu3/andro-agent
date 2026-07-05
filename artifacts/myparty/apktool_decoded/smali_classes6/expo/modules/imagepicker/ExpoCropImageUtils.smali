.class public final Lexpo/modules/imagepicker/ExpoCropImageUtils;
.super Ljava/lang/Object;
.source "ExpoCropImageUtils.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0010\u0006\u001a\u00060\u0007R\u00020\u00082\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\nJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000c\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000eJ*\u0010\u000f\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007R\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011\u00a8\u0006\u0019"
    }
    d2 = {
        "Lexpo/modules/imagepicker/ExpoCropImageUtils;",
        "",
        "<init>",
        "()V",
        "getThemeColor",
        "",
        "theme",
        "Landroid/content/res/Resources$Theme;",
        "Landroid/content/res/Resources;",
        "attr",
        "(Landroid/content/res/Resources$Theme;I)Ljava/lang/Integer;",
        "getColorResource",
        "resources",
        "colorResId",
        "(Landroid/content/res/Resources;I)Ljava/lang/Integer;",
        "applyPaletteToOptions",
        "isNight",
        "",
        "options",
        "Lcom/canhub/cropper/CropImageOptions;",
        "applyWindowTheming",
        "",
        "window",
        "Landroid/view/Window;",
        "toolbarColor",
        "expo-image-picker_release"
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
.field public static final INSTANCE:Lexpo/modules/imagepicker/ExpoCropImageUtils;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lexpo/modules/imagepicker/ExpoCropImageUtils;

    invoke-direct {v0}, Lexpo/modules/imagepicker/ExpoCropImageUtils;-><init>()V

    sput-object v0, Lexpo/modules/imagepicker/ExpoCropImageUtils;->INSTANCE:Lexpo/modules/imagepicker/ExpoCropImageUtils;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyPaletteToOptions(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;ZLcom/canhub/cropper/CropImageOptions;)I
    .locals 6

    const-string v0, "theme"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resources"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    sget v0, Lexpo/modules/imagepicker/R$attr;->expoCropToolbarColor:I

    invoke-virtual {p0, p1, v0}, Lexpo/modules/imagepicker/ExpoCropImageUtils;->getThemeColor(Landroid/content/res/Resources$Theme;I)Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_0

    .line 50
    sget v0, Lexpo/modules/imagepicker/R$color;->expoCropToolbarColor:I

    invoke-virtual {p0, p2, v0}, Lexpo/modules/imagepicker/ExpoCropImageUtils;->getColorResource(Landroid/content/res/Resources;I)Ljava/lang/Integer;

    move-result-object v0

    .line 51
    :cond_0
    sget v1, Lexpo/modules/imagepicker/R$attr;->expoCropToolbarIconColor:I

    invoke-virtual {p0, p1, v1}, Lexpo/modules/imagepicker/ExpoCropImageUtils;->getThemeColor(Landroid/content/res/Resources$Theme;I)Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_1

    .line 52
    sget v1, Lexpo/modules/imagepicker/R$color;->expoCropToolbarIconColor:I

    invoke-virtual {p0, p2, v1}, Lexpo/modules/imagepicker/ExpoCropImageUtils;->getColorResource(Landroid/content/res/Resources;I)Ljava/lang/Integer;

    move-result-object v1

    .line 53
    :cond_1
    sget v2, Lexpo/modules/imagepicker/R$attr;->expoCropToolbarActionTextColor:I

    invoke-virtual {p0, p1, v2}, Lexpo/modules/imagepicker/ExpoCropImageUtils;->getThemeColor(Landroid/content/res/Resources$Theme;I)Ljava/lang/Integer;

    move-result-object v2

    if-nez v2, :cond_2

    .line 54
    sget v2, Lexpo/modules/imagepicker/R$color;->expoCropToolbarActionTextColor:I

    invoke-virtual {p0, p2, v2}, Lexpo/modules/imagepicker/ExpoCropImageUtils;->getColorResource(Landroid/content/res/Resources;I)Ljava/lang/Integer;

    move-result-object v2

    .line 55
    :cond_2
    sget v3, Lexpo/modules/imagepicker/R$attr;->expoCropBackButtonIconColor:I

    invoke-virtual {p0, p1, v3}, Lexpo/modules/imagepicker/ExpoCropImageUtils;->getThemeColor(Landroid/content/res/Resources$Theme;I)Ljava/lang/Integer;

    move-result-object v3

    if-nez v3, :cond_3

    .line 56
    sget v3, Lexpo/modules/imagepicker/R$color;->expoCropBackButtonIconColor:I

    invoke-virtual {p0, p2, v3}, Lexpo/modules/imagepicker/ExpoCropImageUtils;->getColorResource(Landroid/content/res/Resources;I)Ljava/lang/Integer;

    move-result-object v3

    .line 57
    :cond_3
    sget v4, Lexpo/modules/imagepicker/R$attr;->expoCropBackgroundColor:I

    invoke-virtual {p0, p1, v4}, Lexpo/modules/imagepicker/ExpoCropImageUtils;->getThemeColor(Landroid/content/res/Resources$Theme;I)Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_4

    .line 58
    sget p1, Lexpo/modules/imagepicker/R$color;->expoCropBackgroundColor:I

    invoke-virtual {p0, p2, p1}, Lexpo/modules/imagepicker/ExpoCropImageUtils;->getColorResource(Landroid/content/res/Resources;I)Ljava/lang/Integer;

    move-result-object p1

    :cond_4
    const/high16 p2, -0x1000000

    const/4 v4, -0x1

    if-eqz p3, :cond_5

    move v5, p2

    goto :goto_0

    :cond_5
    move v5, v4

    :goto_0
    if-eqz v1, :cond_6

    .line 61
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_1

    :cond_6
    if-eqz p3, :cond_7

    move v1, v4

    goto :goto_1

    :cond_7
    move v1, p2

    :goto_1
    if-eqz p1, :cond_8

    .line 63
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_2

    :cond_8
    move p1, v5

    :goto_2
    iput p1, p4, Lcom/canhub/cropper/CropImageOptions;->activityBackgroundColor:I

    if-nez v0, :cond_9

    .line 64
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_9
    iput-object v0, p4, Lcom/canhub/cropper/CropImageOptions;->toolbarColor:Ljava/lang/Integer;

    .line 65
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p4, Lcom/canhub/cropper/CropImageOptions;->toolbarTitleColor:Ljava/lang/Integer;

    if-nez v3, :cond_a

    .line 66
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    :cond_a
    iput-object v3, p4, Lcom/canhub/cropper/CropImageOptions;->toolbarBackButtonColor:Ljava/lang/Integer;

    .line 67
    iput v1, p4, Lcom/canhub/cropper/CropImageOptions;->activityMenuIconColor:I

    if-nez v2, :cond_c

    if-eqz p3, :cond_b

    move p2, v4

    .line 68
    :cond_b
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :cond_c
    iput-object v2, p4, Lcom/canhub/cropper/CropImageOptions;->activityMenuTextColor:Ljava/lang/Integer;

    return v1
.end method

.method public final applyWindowTheming(Landroid/view/Window;IZ)V
    .locals 1

    const-string v0, "window"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    invoke-virtual {p1, p2}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 85
    new-instance p2, Landroidx/core/view/WindowInsetsControllerCompat;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Landroidx/core/view/WindowInsetsControllerCompat;-><init>(Landroid/view/Window;Landroid/view/View;)V

    xor-int/lit8 p1, p3, 0x1

    invoke-virtual {p2, p1}, Landroidx/core/view/WindowInsetsControllerCompat;->setAppearanceLightStatusBars(Z)V

    return-void
.end method

.method public final getColorResource(Landroid/content/res/Resources;I)Ljava/lang/Integer;
    .locals 2

    const-string v0, "resources"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 30
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v1, p0

    check-cast v1, Lexpo/modules/imagepicker/ExpoCropImageUtils;

    .line 31
    invoke-virtual {p1, p2, v0}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 30
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 32
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_1

    :cond_0
    move-object v0, p1

    :goto_1
    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public final getThemeColor(Landroid/content/res/Resources$Theme;I)Ljava/lang/Integer;
    .locals 3

    const-string v0, "theme"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 19
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v1, p0

    check-cast v1, Lexpo/modules/imagepicker/ExpoCropImageUtils;

    .line 20
    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    const/4 v2, 0x1

    .line 21
    invoke-virtual {p1, p2, v1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    iget p1, v1, Landroid/util/TypedValue;->data:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    .line 19
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 22
    :goto_1
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_2

    :cond_1
    move-object v0, p1

    :goto_2
    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method
