.class final Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$onCreate$1$1;
.super Ljava/lang/Object;
.source "FinancialConnectionsSheetLiteActivity.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$onCreate$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic this$0:Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;


# direct methods
.method constructor <init>(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$onCreate$1$1;->this$0:Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 57
    instance-of p2, p1, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect$OpenAuthFlowWithUrl;

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$onCreate$1$1;->this$0:Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;

    invoke-static {p2}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->access$getWebView$p(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;)Landroid/webkit/WebView;

    move-result-object p2

    if-nez p2, :cond_0

    const-string p2, "webView"

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p2, 0x0

    :cond_0
    check-cast p1, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect$OpenAuthFlowWithUrl;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect$OpenAuthFlowWithUrl;->getUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0

    .line 58
    :cond_1
    instance-of p2, p1, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect$FinishWithResult;

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$onCreate$1$1;->this$0:Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;

    check-cast p1, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect$FinishWithResult;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect$FinishWithResult;->getResult()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->access$finishWithResult(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V

    goto :goto_0

    .line 59
    :cond_2
    instance-of p2, p1, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect$OpenCustomTab;

    if-eqz p2, :cond_3

    iget-object p2, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$onCreate$1$1;->this$0:Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;

    check-cast p1, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect$OpenCustomTab;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect$OpenCustomTab;->getUrl()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->access$openCustomTab(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;Ljava/lang/String;)V

    .line 61
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 56
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 55
    check-cast p1, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$onCreate$1$1;->emit(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
