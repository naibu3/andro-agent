.class final Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$SheetContentHost$2;
.super Ljava/lang/Object;
.source "SheetContentHost.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt;->SheetContentHost(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/material/ModalBottomSheetState;Landroidx/compose/runtime/saveable/SaveableStateHolder;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $backStackEntry:Landroidx/navigation/NavBackStackEntry;

.field final synthetic $this_SheetContentHost:Landroidx/compose/foundation/layout/ColumnScope;


# direct methods
.method constructor <init>(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/foundation/layout/ColumnScope;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$SheetContentHost$2;->$backStackEntry:Landroidx/navigation/NavBackStackEntry;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$SheetContentHost$2;->$this_SheetContentHost:Landroidx/compose/foundation/layout/ColumnScope;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 71
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$SheetContentHost$2;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 72
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 74
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 72
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.financialconnections.navigation.bottomsheet.SheetContentHost.<anonymous> (SheetContentHost.kt:71)"

    const v2, 0x3c596754

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 73
    :cond_2
    iget-object p2, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$SheetContentHost$2;->$backStackEntry:Landroidx/navigation/NavBackStackEntry;

    invoke-virtual {p2}, Landroidx/navigation/NavBackStackEntry;->getDestination()Landroidx/navigation/NavDestination;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator.Destination"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$Destination;

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$Destination;->getContent$financial_connections_release()Lkotlin/jvm/functions/Function4;

    move-result-object p2

    .line 74
    iget-object v0, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$SheetContentHost$2;->$this_SheetContentHost:Landroidx/compose/foundation/layout/ColumnScope;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$SheetContentHost$2;->$backStackEntry:Landroidx/navigation/NavBackStackEntry;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p2, v0, v1, p1, v2}, Lkotlin/jvm/functions/Function4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    return-void
.end method
