.class public final synthetic Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/core/networking/ApiRequest$Options;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/core/networking/ApiRequest$Options;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/core/networking/ApiRequest$Options;

    return-void
.end method


# virtual methods
.method public final invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/core/networking/ApiRequest$Options;

    invoke-static {v0, p1}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule;->$r8$lambda$pJf_OECsFGsCoRSAIUA14P8Ak_A(Lcom/stripe/android/core/networking/ApiRequest$Options;Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object p1

    return-object p1
.end method
