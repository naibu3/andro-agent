.class public final Lcom/stripe/android/link/ui/ComposableSingletons$SecondaryButtonKt;
.super Ljava/lang/Object;
.source "SecondaryButton.kt"


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
.field public static final INSTANCE:Lcom/stripe/android/link/ui/ComposableSingletons$SecondaryButtonKt;

.field private static lambda-1:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
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

    new-instance v0, Lcom/stripe/android/link/ui/ComposableSingletons$SecondaryButtonKt;

    invoke-direct {v0}, Lcom/stripe/android/link/ui/ComposableSingletons$SecondaryButtonKt;-><init>()V

    sput-object v0, Lcom/stripe/android/link/ui/ComposableSingletons$SecondaryButtonKt;->INSTANCE:Lcom/stripe/android/link/ui/ComposableSingletons$SecondaryButtonKt;

    const/4 v0, 0x0

    .line 48
    sget-object v1, Lcom/stripe/android/link/ui/ComposableSingletons$SecondaryButtonKt$lambda-1$1;->INSTANCE:Lcom/stripe/android/link/ui/ComposableSingletons$SecondaryButtonKt$lambda-1$1;

    const v2, 0x4127477f

    invoke-static {v2, v0, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    sput-object v0, Lcom/stripe/android/link/ui/ComposableSingletons$SecondaryButtonKt;->lambda-1:Lkotlin/jvm/functions/Function2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getLambda-1$paymentsheet_release()Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/link/ui/ComposableSingletons$SecondaryButtonKt;->lambda-1:Lkotlin/jvm/functions/Function2;

    return-object v0
.end method
