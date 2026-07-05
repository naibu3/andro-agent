.class public final synthetic Lcom/stripe/android/financialconnections/features/common/LoadingContentKt$$ExternalSyntheticLambda11;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:F

.field public final synthetic f$1:Landroidx/compose/runtime/State;

.field public final synthetic f$2:Landroidx/compose/ui/graphics/Brush;


# direct methods
.method public synthetic constructor <init>(FLandroidx/compose/runtime/State;Landroidx/compose/ui/graphics/Brush;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt$$ExternalSyntheticLambda11;->f$0:F

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt$$ExternalSyntheticLambda11;->f$1:Landroidx/compose/runtime/State;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt$$ExternalSyntheticLambda11;->f$2:Landroidx/compose/ui/graphics/Brush;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget v0, p0, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt$$ExternalSyntheticLambda11;->f$0:F

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt$$ExternalSyntheticLambda11;->f$1:Landroidx/compose/runtime/State;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt$$ExternalSyntheticLambda11;->f$2:Landroidx/compose/ui/graphics/Brush;

    check-cast p1, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    invoke-static {v0, v1, v2, p1}, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt;->$r8$lambda$i39oIKsU5nuD2MPE-n65bZ_-udA(FLandroidx/compose/runtime/State;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/drawscope/DrawScope;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
