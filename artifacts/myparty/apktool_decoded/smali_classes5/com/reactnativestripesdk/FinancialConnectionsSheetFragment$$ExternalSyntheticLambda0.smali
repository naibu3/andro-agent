.class public final synthetic Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventListener;


# instance fields
.field public final synthetic f$0:Lcom/reactnativestripesdk/StripeSdkModule;


# direct methods
.method public synthetic constructor <init>(Lcom/reactnativestripesdk/StripeSdkModule;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$$ExternalSyntheticLambda0;->f$0:Lcom/reactnativestripesdk/StripeSdkModule;

    return-void
.end method


# virtual methods
.method public final onEvent(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;)V
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$$ExternalSyntheticLambda0;->f$0:Lcom/reactnativestripesdk/StripeSdkModule;

    invoke-static {v0, p1}, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->$r8$lambda$YnmAFH2v4B92jTEO5zbUWJMJqI0(Lcom/reactnativestripesdk/StripeSdkModule;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;)V

    return-void
.end method
