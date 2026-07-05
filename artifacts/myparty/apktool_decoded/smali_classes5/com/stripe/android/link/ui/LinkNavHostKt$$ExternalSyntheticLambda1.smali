.class public final synthetic Lcom/stripe/android/link/ui/LinkNavHostKt$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Landroidx/compose/ui/unit/IntSize;

.field public final synthetic f$1:Lkotlin/jvm/functions/Function2;

.field public final synthetic f$2:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/unit/IntSize;Lkotlin/jvm/functions/Function2;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/ui/LinkNavHostKt$$ExternalSyntheticLambda1;->f$0:Landroidx/compose/ui/unit/IntSize;

    iput-object p2, p0, Lcom/stripe/android/link/ui/LinkNavHostKt$$ExternalSyntheticLambda1;->f$1:Lkotlin/jvm/functions/Function2;

    iput p3, p0, Lcom/stripe/android/link/ui/LinkNavHostKt$$ExternalSyntheticLambda1;->f$2:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/stripe/android/link/ui/LinkNavHostKt$$ExternalSyntheticLambda1;->f$0:Landroidx/compose/ui/unit/IntSize;

    iget-object v1, p0, Lcom/stripe/android/link/ui/LinkNavHostKt$$ExternalSyntheticLambda1;->f$1:Lkotlin/jvm/functions/Function2;

    iget v2, p0, Lcom/stripe/android/link/ui/LinkNavHostKt$$ExternalSyntheticLambda1;->f$2:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Lcom/stripe/android/link/ui/LinkNavHostKt;->$r8$lambda$UJ5X-X5qs18Q4TFCWz4hXjimUYs(Landroidx/compose/ui/unit/IntSize;Lkotlin/jvm/functions/Function2;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
