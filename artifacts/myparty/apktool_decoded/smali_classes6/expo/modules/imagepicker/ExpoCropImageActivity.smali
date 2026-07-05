.class public final Lexpo/modules/imagepicker/ExpoCropImageActivity;
.super Lcom/canhub/cropper/CropImageActivity;
.source "ExpoCropImageActivity.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nExpoCropImageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpoCropImageActivity.kt\nexpo/modules/imagepicker/ExpoCropImageActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n1#2:84\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u001d\u0010\u0014\u001a\u0010\u0012\u000c\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lexpo/modules/imagepicker/ExpoCropImageActivity;",
        "Lcom/canhub/cropper/CropImageActivity;",
        "<init>",
        "()V",
        "currentIconColor",
        "",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onCreateOptionsMenu",
        "",
        "menu",
        "Landroid/view/Menu;",
        "onPrepareOptionsMenu",
        "applyPalette",
        "isNight",
        "opts",
        "Lcom/canhub/cropper/CropImageOptions;",
        "getCropOptions",
        "invokeSetCustomizations",
        "Lkotlin/Result;",
        "",
        "kotlin.jvm.PlatformType",
        "invokeSetCustomizations-d1pmJ48",
        "()Ljava/lang/Object;",
        "tintAllMenuItems",
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


# instance fields
.field private currentIconColor:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Lcom/canhub/cropper/CropImageActivity;-><init>()V

    const/high16 v0, -0x1000000

    .line 17
    iput v0, p0, Lexpo/modules/imagepicker/ExpoCropImageActivity;->currentIconColor:I

    return-void
.end method

.method private final applyPalette(ZLcom/canhub/cropper/CropImageOptions;)V
    .locals 4

    .line 47
    sget-object v0, Lexpo/modules/imagepicker/ExpoCropImageUtils;->INSTANCE:Lexpo/modules/imagepicker/ExpoCropImageUtils;

    invoke-virtual {p0}, Lexpo/modules/imagepicker/ExpoCropImageActivity;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const-string v2, "getTheme(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lexpo/modules/imagepicker/ExpoCropImageActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const-string v3, "getResources(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2, p1, p2}, Lexpo/modules/imagepicker/ExpoCropImageUtils;->applyPaletteToOptions(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;ZLcom/canhub/cropper/CropImageOptions;)I

    move-result v0

    .line 50
    iput v0, p0, Lexpo/modules/imagepicker/ExpoCropImageActivity;->currentIconColor:I

    if-eqz p1, :cond_0

    const/high16 v0, -0x1000000

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    .line 54
    :goto_0
    iget-object p2, p2, Lcom/canhub/cropper/CropImageOptions;->toolbarColor:Ljava/lang/Integer;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 55
    :cond_1
    sget-object p2, Lexpo/modules/imagepicker/ExpoCropImageUtils;->INSTANCE:Lexpo/modules/imagepicker/ExpoCropImageUtils;

    invoke-virtual {p0}, Lexpo/modules/imagepicker/ExpoCropImageActivity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const-string v2, "getWindow(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v1, v0, p1}, Lexpo/modules/imagepicker/ExpoCropImageUtils;->applyWindowTheming(Landroid/view/Window;IZ)V

    .line 58
    invoke-virtual {p0}, Lexpo/modules/imagepicker/ExpoCropImageActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object p1

    if-eqz p1, :cond_2

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroidx/appcompat/app/ActionBar;->setElevation(F)V

    :cond_2
    return-void
.end method

.method private final getCropOptions()Lcom/canhub/cropper/CropImageOptions;
    .locals 3

    const/4 v0, 0x0

    .line 63
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v1, p0

    check-cast v1, Lexpo/modules/imagepicker/ExpoCropImageActivity;

    .line 64
    const-class v1, Lcom/canhub/cropper/CropImageActivity;

    const-string v2, "cropImageOptions"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    const/4 v2, 0x1

    .line 65
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 66
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 64
    instance-of v2, v1, Lcom/canhub/cropper/CropImageOptions;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/canhub/cropper/CropImageOptions;

    goto :goto_0

    :cond_0
    move-object v1, v0

    .line 63
    :goto_0
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 67
    :goto_1
    invoke-static {v1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_2

    :cond_1
    move-object v0, v1

    :goto_2
    check-cast v0, Lcom/canhub/cropper/CropImageOptions;

    return-object v0
.end method

.method private final invokeSetCustomizations-d1pmJ48()Ljava/lang/Object;
    .locals 4

    .line 70
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lexpo/modules/imagepicker/ExpoCropImageActivity;

    .line 71
    const-class v0, Lcom/canhub/cropper/CropImageActivity;

    const-string v1, "setCustomizations"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x1

    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 73
    new-array v1, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 70
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private final tintAllMenuItems(Landroid/view/Menu;)V
    .locals 4

    .line 77
    invoke-interface {p1}, Landroid/view/Menu;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 78
    invoke-interface {p1, v1}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_0

    iget v3, p0, Lexpo/modules/imagepicker/ExpoCropImageActivity;->currentIconColor:I

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 21
    invoke-super {p0, p1}, Lcom/canhub/cropper/CropImageActivity;->onCreate(Landroid/os/Bundle;)V

    .line 24
    invoke-direct {p0}, Lexpo/modules/imagepicker/ExpoCropImageActivity;->getCropOptions()Lcom/canhub/cropper/CropImageOptions;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 25
    invoke-virtual {p0}, Lexpo/modules/imagepicker/ExpoCropImageActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v0, v0, 0x30

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 26
    :goto_0
    invoke-direct {p0, v0, p1}, Lexpo/modules/imagepicker/ExpoCropImageActivity;->applyPalette(ZLcom/canhub/cropper/CropImageOptions;)V

    .line 27
    invoke-direct {p0}, Lexpo/modules/imagepicker/ExpoCropImageActivity;->invokeSetCustomizations-d1pmJ48()Ljava/lang/Object;

    .line 28
    invoke-virtual {p0}, Lexpo/modules/imagepicker/ExpoCropImageActivity;->invalidateOptionsMenu()V

    :cond_1
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 1

    const-string v0, "menu"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-super {p0, p1}, Lcom/canhub/cropper/CropImageActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    .line 34
    invoke-direct {p0, p1}, Lexpo/modules/imagepicker/ExpoCropImageActivity;->tintAllMenuItems(Landroid/view/Menu;)V

    return v0
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 1

    const-string v0, "menu"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    invoke-super {p0, p1}, Lcom/canhub/cropper/CropImageActivity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    .line 40
    invoke-direct {p0, p1}, Lexpo/modules/imagepicker/ExpoCropImageActivity;->tintAllMenuItems(Landroid/view/Menu;)V

    return v0
.end method
