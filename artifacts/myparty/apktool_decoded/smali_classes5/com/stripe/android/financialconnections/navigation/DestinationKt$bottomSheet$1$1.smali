.class final Lcom/stripe/android/financialconnections/navigation/DestinationKt$bottomSheet$1$1;
.super Ljava/lang/Object;
.source "Destination.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/navigation/DestinationKt$bottomSheet$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $destination:Lcom/stripe/android/financialconnections/navigation/Destination;

.field final synthetic $navBackStackEntry:Landroidx/navigation/NavBackStackEntry;


# direct methods
.method constructor <init>(Lcom/stripe/android/financialconnections/navigation/Destination;Landroidx/navigation/NavBackStackEntry;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/navigation/DestinationKt$bottomSheet$1$1;->$destination:Lcom/stripe/android/financialconnections/navigation/Destination;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/navigation/DestinationKt$bottomSheet$1$1;->$navBackStackEntry:Landroidx/navigation/NavBackStackEntry;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 277
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/navigation/DestinationKt$bottomSheet$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 278
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.financialconnections.navigation.bottomSheet.<anonymous>.<anonymous> (Destination.kt:277)"

    const v2, -0x498b7900

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, Lcom/stripe/android/financialconnections/navigation/DestinationKt$bottomSheet$1$1;->$destination:Lcom/stripe/android/financialconnections/navigation/Destination;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/navigation/DestinationKt$bottomSheet$1$1;->$navBackStackEntry:Landroidx/navigation/NavBackStackEntry;

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Lcom/stripe/android/financialconnections/navigation/Destination;->Composable(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    return-void
.end method
