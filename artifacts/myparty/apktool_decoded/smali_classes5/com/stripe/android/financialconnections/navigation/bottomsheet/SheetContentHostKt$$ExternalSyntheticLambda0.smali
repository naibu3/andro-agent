.class public final synthetic Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Landroidx/compose/foundation/layout/ColumnScope;

.field public final synthetic f$1:Landroidx/navigation/NavBackStackEntry;

.field public final synthetic f$2:Landroidx/compose/material/ModalBottomSheetState;

.field public final synthetic f$3:Landroidx/compose/runtime/saveable/SaveableStateHolder;

.field public final synthetic f$4:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$5:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$6:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/material/ModalBottomSheetState;Landroidx/compose/runtime/saveable/SaveableStateHolder;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$$ExternalSyntheticLambda0;->f$0:Landroidx/compose/foundation/layout/ColumnScope;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$$ExternalSyntheticLambda0;->f$1:Landroidx/navigation/NavBackStackEntry;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$$ExternalSyntheticLambda0;->f$2:Landroidx/compose/material/ModalBottomSheetState;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$$ExternalSyntheticLambda0;->f$3:Landroidx/compose/runtime/saveable/SaveableStateHolder;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$$ExternalSyntheticLambda0;->f$4:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$$ExternalSyntheticLambda0;->f$5:Lkotlin/jvm/functions/Function1;

    iput p7, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$$ExternalSyntheticLambda0;->f$6:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$$ExternalSyntheticLambda0;->f$0:Landroidx/compose/foundation/layout/ColumnScope;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$$ExternalSyntheticLambda0;->f$1:Landroidx/navigation/NavBackStackEntry;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$$ExternalSyntheticLambda0;->f$2:Landroidx/compose/material/ModalBottomSheetState;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$$ExternalSyntheticLambda0;->f$3:Landroidx/compose/runtime/saveable/SaveableStateHolder;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$$ExternalSyntheticLambda0;->f$4:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$$ExternalSyntheticLambda0;->f$5:Lkotlin/jvm/functions/Function1;

    iget v6, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$$ExternalSyntheticLambda0;->f$6:I

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt;->$r8$lambda$nOU1AXWiuDzzn8MN-HRbH3sK3XE(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/material/ModalBottomSheetState;Landroidx/compose/runtime/saveable/SaveableStateHolder;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
