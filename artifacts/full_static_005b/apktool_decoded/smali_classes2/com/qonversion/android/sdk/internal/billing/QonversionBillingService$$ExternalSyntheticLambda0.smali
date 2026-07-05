.class public final synthetic Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$1:Lcom/qonversion/android/sdk/internal/billing/BillingError;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/qonversion/android/sdk/internal/billing/BillingError;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$$ExternalSyntheticLambda0;->f$0:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$$ExternalSyntheticLambda0;->f$1:Lcom/qonversion/android/sdk/internal/billing/BillingError;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$$ExternalSyntheticLambda0;->f$0:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$$ExternalSyntheticLambda0;->f$1:Lcom/qonversion/android/sdk/internal/billing/BillingError;

    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->$r8$lambda$Da89vBYQgXlsHm22lWCypY_qcRY(Lkotlin/jvm/functions/Function1;Lcom/qonversion/android/sdk/internal/billing/BillingError;)V

    return-void
.end method
