.class public final Landroidx/camera/core/impl/utils/LiveDataUtil;
.super Ljava/lang/Object;
.source "LiveDataUtil.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J<\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\u0008\u0000\u0010\u0007\"\u0004\u0008\u0001\u0010\u00062\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u0002H\u00070\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u00060\nH\u0007\u00a8\u0006\u000b"
    }
    d2 = {
        "Landroidx/camera/core/impl/utils/LiveDataUtil;",
        "",
        "<init>",
        "()V",
        "map",
        "Landroidx/lifecycle/LiveData;",
        "O",
        "I",
        "source",
        "mapFunction",
        "Landroidx/arch/core/util/Function;",
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


# static fields
.field public static final INSTANCE:Landroidx/camera/core/impl/utils/LiveDataUtil;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/camera/core/impl/utils/LiveDataUtil;

    invoke-direct {v0}, Landroidx/camera/core/impl/utils/LiveDataUtil;-><init>()V

    sput-object v0, Landroidx/camera/core/impl/utils/LiveDataUtil;->INSTANCE:Landroidx/camera/core/impl/utils/LiveDataUtil;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final map(Landroidx/lifecycle/LiveData;Landroidx/arch/core/util/Function;)Landroidx/lifecycle/LiveData;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/lifecycle/LiveData<",
            "TI;>;",
            "Landroidx/arch/core/util/Function<",
            "TI;TO;>;)",
            "Landroidx/lifecycle/LiveData<",
            "TO;>;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string/jumbo v0, "source"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapFunction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    new-instance v0, Landroidx/camera/core/impl/utils/MappingRedirectableLiveData;

    invoke-virtual {p0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Landroidx/arch/core/util/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroidx/camera/core/impl/utils/MappingRedirectableLiveData;-><init>(Ljava/lang/Object;Landroidx/arch/core/util/Function;)V

    .line 38
    invoke-virtual {v0, p0}, Landroidx/camera/core/impl/utils/MappingRedirectableLiveData;->redirectTo(Landroidx/lifecycle/LiveData;)V

    .line 39
    check-cast v0, Landroidx/lifecycle/LiveData;

    return-object v0
.end method
