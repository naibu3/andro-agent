.class public final Landroidx/camera/extensions/internal/compat/workaround/PostviewFormatValidator;
.super Ljava/lang/Object;
.source "PostviewFormatValidator.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/camera/extensions/internal/compat/workaround/PostviewFormatValidator;",
        "",
        "<init>",
        "()V",
        "quirk",
        "Landroidx/camera/core/impl/Quirk;",
        "getPostviewFormatSelector",
        "Landroidx/camera/core/impl/CameraConfig$PostviewFormatSelector;",
        "camera-extensions_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final quirk:Landroidx/camera/core/impl/Quirk;


# direct methods
.method public static synthetic $r8$lambda$ZS5lyjmRH9Qe8ylgemg_-2XrGVg(ILjava/util/List;)I
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/extensions/internal/compat/workaround/PostviewFormatValidator;->getPostviewFormatSelector$lambda$1$lambda$0(ILjava/util/List;)I

    move-result p0

    return p0
.end method

.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const-class v0, Landroidx/camera/extensions/internal/compat/quirk/EnsurePostviewFormatEquivalenceQuirk;

    invoke-static {v0}, Landroidx/camera/extensions/internal/compat/quirk/DeviceQuirks;->get(Ljava/lang/Class;)Landroidx/camera/core/impl/Quirk;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/extensions/internal/compat/workaround/PostviewFormatValidator;->quirk:Landroidx/camera/core/impl/Quirk;

    return-void
.end method

.method private static final getPostviewFormatSelector$lambda$1$lambda$0(ILjava/util/List;)I
    .locals 1

    const-string/jumbo v0, "supportedPostviewFormats"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final getPostviewFormatSelector()Landroidx/camera/core/impl/CameraConfig$PostviewFormatSelector;
    .locals 2

    .line 30
    iget-object v0, p0, Landroidx/camera/extensions/internal/compat/workaround/PostviewFormatValidator;->quirk:Landroidx/camera/core/impl/Quirk;

    if-eqz v0, :cond_0

    .line 31
    new-instance v0, Landroidx/camera/extensions/internal/compat/workaround/PostviewFormatValidator$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Landroidx/camera/extensions/internal/compat/workaround/PostviewFormatValidator$$ExternalSyntheticLambda0;-><init>()V

    return-object v0

    .line 37
    :cond_0
    sget-object v0, Landroidx/camera/core/impl/CameraConfig;->DEFAULT_POSTVIEW_FORMAT_SELECTOR:Landroidx/camera/core/impl/CameraConfig$PostviewFormatSelector;

    const-string v1, "DEFAULT_POSTVIEW_FORMAT_SELECTOR"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
