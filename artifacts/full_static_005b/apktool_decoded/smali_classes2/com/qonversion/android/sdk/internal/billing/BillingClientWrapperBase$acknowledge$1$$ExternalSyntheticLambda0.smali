.class public final synthetic Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$acknowledge$1$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lcom/android/billingclient/api/AcknowledgePurchaseResponseListener;


# instance fields
.field public final synthetic f$0:Ljava/lang/String;

.field public final synthetic f$1:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$acknowledge$1$$ExternalSyntheticLambda0;->f$0:Ljava/lang/String;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$acknowledge$1$$ExternalSyntheticLambda0;->f$1:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;

    return-void
.end method


# virtual methods
.method public final onAcknowledgePurchaseResponse(Lcom/android/billingclient/api/BillingResult;)V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$acknowledge$1$$ExternalSyntheticLambda0;->f$0:Ljava/lang/String;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$acknowledge$1$$ExternalSyntheticLambda0;->f$1:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;

    invoke-static {v0, v1, p1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$acknowledge$1;->$r8$lambda$gRX__IMd7kD_dVamkaXq6npfrng(Ljava/lang/String;Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;Lcom/android/billingclient/api/BillingResult;)V

    return-void
.end method
