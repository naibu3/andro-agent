.class public final Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/ComposableSingletons$NetworkingLinkLoginWarmupScreenKt;
.super Ljava/lang/Object;
.source "NetworkingLinkLoginWarmupScreen.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/ComposableSingletons$NetworkingLinkLoginWarmupScreenKt;

.field private static lambda-1:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/foundation/lazy/LazyItemScope;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private static lambda-2:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/foundation/layout/RowScope;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/ComposableSingletons$NetworkingLinkLoginWarmupScreenKt;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/ComposableSingletons$NetworkingLinkLoginWarmupScreenKt;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/ComposableSingletons$NetworkingLinkLoginWarmupScreenKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/ComposableSingletons$NetworkingLinkLoginWarmupScreenKt;

    .line 81
    sget-object v0, Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/ComposableSingletons$NetworkingLinkLoginWarmupScreenKt$lambda-1$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/ComposableSingletons$NetworkingLinkLoginWarmupScreenKt$lambda-1$1;

    const v1, 0x6470cc21

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function3;

    sput-object v0, Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/ComposableSingletons$NetworkingLinkLoginWarmupScreenKt;->lambda-1:Lkotlin/jvm/functions/Function3;

    const v0, -0x2033f781

    .line 139
    sget-object v1, Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/ComposableSingletons$NetworkingLinkLoginWarmupScreenKt$lambda-2$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/ComposableSingletons$NetworkingLinkLoginWarmupScreenKt$lambda-2$1;

    invoke-static {v0, v2, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function3;

    sput-object v0, Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/ComposableSingletons$NetworkingLinkLoginWarmupScreenKt;->lambda-2:Lkotlin/jvm/functions/Function3;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getLambda-1$financial_connections_release()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/foundation/lazy/LazyItemScope;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/ComposableSingletons$NetworkingLinkLoginWarmupScreenKt;->lambda-1:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method

.method public final getLambda-2$financial_connections_release()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/foundation/layout/RowScope;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/ComposableSingletons$NetworkingLinkLoginWarmupScreenKt;->lambda-2:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method
