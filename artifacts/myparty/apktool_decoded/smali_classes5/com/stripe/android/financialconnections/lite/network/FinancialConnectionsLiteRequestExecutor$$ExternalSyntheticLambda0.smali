.class public final synthetic Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;

.field public final synthetic f$1:Lkotlinx/serialization/KSerializer;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;Lkotlinx/serialization/KSerializer;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$$ExternalSyntheticLambda0;->f$1:Lkotlinx/serialization/KSerializer;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$$ExternalSyntheticLambda0;->f$1:Lkotlinx/serialization/KSerializer;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;->$r8$lambda$pFL2sws7AqJRvhHGhK0QAExz0Ko(Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;Lkotlinx/serialization/KSerializer;Ljava/lang/String;)Lkotlin/Result;

    move-result-object p1

    return-object p1
.end method
