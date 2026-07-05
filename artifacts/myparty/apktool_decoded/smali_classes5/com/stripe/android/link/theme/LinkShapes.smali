.class public final Lcom/stripe/android/link/theme/LinkShapes;
.super Ljava/lang/Object;
.source "LinkShapes.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLinkShapes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkShapes.kt\ncom/stripe/android/link/theme/LinkShapes\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,10:1\n149#2:11\n149#2:12\n*S KotlinDebug\n*F\n+ 1 LinkShapes.kt\ncom/stripe/android/link/theme/LinkShapes\n*L\n7#1:11\n8#1:12\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/link/theme/LinkShapes;",
        "",
        "<init>",
        "()V",
        "extraSmall",
        "Landroidx/compose/foundation/shape/RoundedCornerShape;",
        "getExtraSmall",
        "()Landroidx/compose/foundation/shape/RoundedCornerShape;",
        "default",
        "getDefault",
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

.field public static final INSTANCE:Lcom/stripe/android/link/theme/LinkShapes;

.field private static final default:Landroidx/compose/foundation/shape/RoundedCornerShape;

.field private static final extraSmall:Landroidx/compose/foundation/shape/RoundedCornerShape;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/theme/LinkShapes;

    invoke-direct {v0}, Lcom/stripe/android/link/theme/LinkShapes;-><init>()V

    sput-object v0, Lcom/stripe/android/link/theme/LinkShapes;->INSTANCE:Lcom/stripe/android/link/theme/LinkShapes;

    const/4 v0, 0x4

    int-to-float v0, v0

    .line 11
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 7
    invoke-static {v0}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/theme/LinkShapes;->extraSmall:Landroidx/compose/foundation/shape/RoundedCornerShape;

    const/16 v0, 0xc

    int-to-float v0, v0

    .line 12
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 8
    invoke-static {v0}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/theme/LinkShapes;->default:Landroidx/compose/foundation/shape/RoundedCornerShape;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getDefault()Landroidx/compose/foundation/shape/RoundedCornerShape;
    .locals 1

    .line 8
    sget-object v0, Lcom/stripe/android/link/theme/LinkShapes;->default:Landroidx/compose/foundation/shape/RoundedCornerShape;

    return-object v0
.end method

.method public final getExtraSmall()Landroidx/compose/foundation/shape/RoundedCornerShape;
    .locals 1

    .line 7
    sget-object v0, Lcom/stripe/android/link/theme/LinkShapes;->extraSmall:Landroidx/compose/foundation/shape/RoundedCornerShape;

    return-object v0
.end method
