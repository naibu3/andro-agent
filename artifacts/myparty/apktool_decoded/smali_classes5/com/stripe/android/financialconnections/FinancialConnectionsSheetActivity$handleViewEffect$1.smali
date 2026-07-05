.class final Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$handleViewEffect$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "FinancialConnectionsSheetActivity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->handleViewEffect(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.financialconnections.FinancialConnectionsSheetActivity"
    f = "FinancialConnectionsSheetActivity.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x8b
    }
    m = "handleViewEffect"
    n = {
        "this",
        "viewEffect"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;


# direct methods
.method constructor <init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$handleViewEffect$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$handleViewEffect$1;->this$0:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$handleViewEffect$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$handleViewEffect$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$handleViewEffect$1;->label:I

    iget-object p1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$handleViewEffect$1;->this$0:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;

    const/4 v0, 0x0

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-static {p1, v0, v0, v1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->access$handleViewEffect(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
