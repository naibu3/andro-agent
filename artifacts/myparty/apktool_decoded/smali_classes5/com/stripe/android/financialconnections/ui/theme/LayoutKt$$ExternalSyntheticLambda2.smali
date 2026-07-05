.class public final synthetic Lcom/stripe/android/financialconnections/ui/theme/LayoutKt$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Landroidx/compose/ui/Modifier;

.field public final synthetic f$1:Landroidx/compose/foundation/layout/PaddingValues;

.field public final synthetic f$10:I

.field public final synthetic f$11:I

.field public final synthetic f$2:Z

.field public final synthetic f$3:Z

.field public final synthetic f$4:Z

.field public final synthetic f$5:Landroidx/compose/foundation/layout/Arrangement$Vertical;

.field public final synthetic f$6:Z

.field public final synthetic f$7:Landroidx/compose/foundation/ScrollState;

.field public final synthetic f$8:Lkotlin/jvm/functions/Function2;

.field public final synthetic f$9:Lkotlin/jvm/functions/Function3;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;ZZZLandroidx/compose/foundation/layout/Arrangement$Vertical;ZLandroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/ui/theme/LayoutKt$$ExternalSyntheticLambda2;->f$0:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/ui/theme/LayoutKt$$ExternalSyntheticLambda2;->f$1:Landroidx/compose/foundation/layout/PaddingValues;

    iput-boolean p3, p0, Lcom/stripe/android/financialconnections/ui/theme/LayoutKt$$ExternalSyntheticLambda2;->f$2:Z

    iput-boolean p4, p0, Lcom/stripe/android/financialconnections/ui/theme/LayoutKt$$ExternalSyntheticLambda2;->f$3:Z

    iput-boolean p5, p0, Lcom/stripe/android/financialconnections/ui/theme/LayoutKt$$ExternalSyntheticLambda2;->f$4:Z

    iput-object p6, p0, Lcom/stripe/android/financialconnections/ui/theme/LayoutKt$$ExternalSyntheticLambda2;->f$5:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    iput-boolean p7, p0, Lcom/stripe/android/financialconnections/ui/theme/LayoutKt$$ExternalSyntheticLambda2;->f$6:Z

    iput-object p8, p0, Lcom/stripe/android/financialconnections/ui/theme/LayoutKt$$ExternalSyntheticLambda2;->f$7:Landroidx/compose/foundation/ScrollState;

    iput-object p9, p0, Lcom/stripe/android/financialconnections/ui/theme/LayoutKt$$ExternalSyntheticLambda2;->f$8:Lkotlin/jvm/functions/Function2;

    iput-object p10, p0, Lcom/stripe/android/financialconnections/ui/theme/LayoutKt$$ExternalSyntheticLambda2;->f$9:Lkotlin/jvm/functions/Function3;

    iput p11, p0, Lcom/stripe/android/financialconnections/ui/theme/LayoutKt$$ExternalSyntheticLambda2;->f$10:I

    iput p12, p0, Lcom/stripe/android/financialconnections/ui/theme/LayoutKt$$ExternalSyntheticLambda2;->f$11:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/ui/theme/LayoutKt$$ExternalSyntheticLambda2;->f$0:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/ui/theme/LayoutKt$$ExternalSyntheticLambda2;->f$1:Landroidx/compose/foundation/layout/PaddingValues;

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/ui/theme/LayoutKt$$ExternalSyntheticLambda2;->f$2:Z

    iget-boolean v3, p0, Lcom/stripe/android/financialconnections/ui/theme/LayoutKt$$ExternalSyntheticLambda2;->f$3:Z

    iget-boolean v4, p0, Lcom/stripe/android/financialconnections/ui/theme/LayoutKt$$ExternalSyntheticLambda2;->f$4:Z

    iget-object v5, p0, Lcom/stripe/android/financialconnections/ui/theme/LayoutKt$$ExternalSyntheticLambda2;->f$5:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    iget-boolean v6, p0, Lcom/stripe/android/financialconnections/ui/theme/LayoutKt$$ExternalSyntheticLambda2;->f$6:Z

    iget-object v7, p0, Lcom/stripe/android/financialconnections/ui/theme/LayoutKt$$ExternalSyntheticLambda2;->f$7:Landroidx/compose/foundation/ScrollState;

    iget-object v8, p0, Lcom/stripe/android/financialconnections/ui/theme/LayoutKt$$ExternalSyntheticLambda2;->f$8:Lkotlin/jvm/functions/Function2;

    iget-object v9, p0, Lcom/stripe/android/financialconnections/ui/theme/LayoutKt$$ExternalSyntheticLambda2;->f$9:Lkotlin/jvm/functions/Function3;

    iget v10, p0, Lcom/stripe/android/financialconnections/ui/theme/LayoutKt$$ExternalSyntheticLambda2;->f$10:I

    iget v11, p0, Lcom/stripe/android/financialconnections/ui/theme/LayoutKt$$ExternalSyntheticLambda2;->f$11:I

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    invoke-static/range {v0 .. v13}, Lcom/stripe/android/financialconnections/ui/theme/LayoutKt;->$r8$lambda$s7dCwBYiwYNd5mEYalSSARWgN9A(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;ZZZLandroidx/compose/foundation/layout/Arrangement$Vertical;ZLandroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
