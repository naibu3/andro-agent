.class final synthetic Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$prepare$3;
.super Ljava/lang/Object;
.source "FinancialConnectionsSheetFragment.kt"

# interfaces
.implements Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultCallback;
.implements Lkotlin/jvm/internal/FunctionAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->prepare()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
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


# instance fields
.field final synthetic $tmp0:Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;


# direct methods
.method constructor <init>(Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$prepare$3;->$tmp0:Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultCallback;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    instance-of v0, p1, Lkotlin/jvm/internal/FunctionAdapter;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lkotlin/jvm/internal/FunctionAdapter;

    invoke-interface {v0}, Lkotlin/jvm/internal/FunctionAdapter;->getFunctionDelegate()Lkotlin/Function;

    move-result-object v0

    check-cast p1, Lkotlin/jvm/internal/FunctionAdapter;

    invoke-interface {p1}, Lkotlin/jvm/internal/FunctionAdapter;->getFunctionDelegate()Lkotlin/Function;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    return v1
.end method

.method public final getFunctionDelegate()Lkotlin/Function;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Function<",
            "*>;"
        }
    .end annotation

    new-instance v0, Lkotlin/jvm/internal/FunctionReferenceImpl;

    iget-object v2, p0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$prepare$3;->$tmp0:Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;

    const-class v3, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;

    const-string v5, "onFinancialConnectionsSheetForDataResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;)V"

    const/4 v6, 0x0

    const/4 v1, 0x1

    const-string v4, "onFinancialConnectionsSheetForDataResult"

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v0, Lkotlin/Function;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    move-object v0, p0

    check-cast v0, Lkotlin/jvm/internal/FunctionAdapter;

    invoke-interface {v0}, Lkotlin/jvm/internal/FunctionAdapter;->getFunctionDelegate()Lkotlin/Function;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final onFinancialConnectionsSheetResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    iget-object v0, p0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$prepare$3;->$tmp0:Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;

    invoke-static {v0, p1}, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->access$onFinancialConnectionsSheetForDataResult(Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;)V

    return-void
.end method
