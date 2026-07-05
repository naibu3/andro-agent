.class public final synthetic Lcom/stripe/android/link/ui/MinScreenHeightBoxKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:F

.field public final synthetic f$1:Lkotlin/jvm/functions/Function3;

.field public final synthetic f$2:I


# direct methods
.method public synthetic constructor <init>(FLkotlin/jvm/functions/Function3;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/stripe/android/link/ui/MinScreenHeightBoxKt$$ExternalSyntheticLambda0;->f$0:F

    iput-object p2, p0, Lcom/stripe/android/link/ui/MinScreenHeightBoxKt$$ExternalSyntheticLambda0;->f$1:Lkotlin/jvm/functions/Function3;

    iput p3, p0, Lcom/stripe/android/link/ui/MinScreenHeightBoxKt$$ExternalSyntheticLambda0;->f$2:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget v0, p0, Lcom/stripe/android/link/ui/MinScreenHeightBoxKt$$ExternalSyntheticLambda0;->f$0:F

    iget-object v1, p0, Lcom/stripe/android/link/ui/MinScreenHeightBoxKt$$ExternalSyntheticLambda0;->f$1:Lkotlin/jvm/functions/Function3;

    iget v2, p0, Lcom/stripe/android/link/ui/MinScreenHeightBoxKt$$ExternalSyntheticLambda0;->f$2:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Lcom/stripe/android/link/ui/MinScreenHeightBoxKt;->$r8$lambda$zJKNXNEOJPZB817PVPyOElZhAx0(FLkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
