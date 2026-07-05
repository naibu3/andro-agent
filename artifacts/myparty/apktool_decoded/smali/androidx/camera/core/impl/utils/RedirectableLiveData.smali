.class public final Landroidx/camera/core/impl/utils/RedirectableLiveData;
.super Landroidx/camera/core/impl/utils/MappingRedirectableLiveData;
.source "LiveDataUtil.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/camera/core/impl/utils/MappingRedirectableLiveData<",
        "TT;TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/camera/core/impl/utils/RedirectableLiveData;",
        "T",
        "Landroidx/camera/core/impl/utils/MappingRedirectableLiveData;",
        "initialValue",
        "<init>",
        "(Ljava/lang/Object;)V",
        "Ljava/lang/Object;",
        "camera-core_release"
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
.field private final initialValue:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$hUN_yGnBCuf0W2kN-hVfETioGEc(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Landroidx/camera/core/impl/utils/RedirectableLiveData;->_init_$lambda$0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 56
    new-instance v0, Landroidx/camera/core/impl/utils/RedirectableLiveData$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Landroidx/camera/core/impl/utils/RedirectableLiveData$$ExternalSyntheticLambda0;-><init>()V

    invoke-direct {p0, p1, v0}, Landroidx/camera/core/impl/utils/MappingRedirectableLiveData;-><init>(Ljava/lang/Object;Landroidx/arch/core/util/Function;)V

    .line 55
    iput-object p1, p0, Landroidx/camera/core/impl/utils/RedirectableLiveData;->initialValue:Ljava/lang/Object;

    return-void
.end method

.method private static final _init_$lambda$0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p0
.end method
