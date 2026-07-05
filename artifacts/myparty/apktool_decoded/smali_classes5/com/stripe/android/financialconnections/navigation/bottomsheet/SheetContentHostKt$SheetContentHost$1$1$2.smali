.class final Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$SheetContentHost$1$1$2;
.super Ljava/lang/Object;
.source "SheetContentHost.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$SheetContentHost$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/FlowCollector;"
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

.field final synthetic $currentOnSheetDismissed$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/navigation/NavBackStackEntry;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $currentOnSheetShown$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/navigation/NavBackStackEntry;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavBackStackEntry;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/navigation/NavBackStackEntry;",
            "Lkotlin/Unit;",
            ">;>;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/navigation/NavBackStackEntry;",
            "Lkotlin/Unit;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$SheetContentHost$1$1$2;->$backStackEntry:Landroidx/navigation/NavBackStackEntry;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$SheetContentHost$1$1$2;->$currentOnSheetShown$delegate:Landroidx/compose/runtime/State;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$SheetContentHost$1$1$2;->$currentOnSheetDismissed$delegate:Landroidx/compose/runtime/State;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 63
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$SheetContentHost$1$1$2;->emit(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final emit(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 65
    iget-object p1, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$SheetContentHost$1$1$2;->$currentOnSheetShown$delegate:Landroidx/compose/runtime/State;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt;->access$SheetContentHost$lambda$0(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$SheetContentHost$1$1$2;->$backStackEntry:Landroidx/navigation/NavBackStackEntry;

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 67
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$SheetContentHost$1$1$2;->$currentOnSheetDismissed$delegate:Landroidx/compose/runtime/State;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt;->access$SheetContentHost$lambda$1(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt$SheetContentHost$1$1$2;->$backStackEntry:Landroidx/navigation/NavBackStackEntry;

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
