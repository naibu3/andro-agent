.class public final Lcom/stripe/android/financialconnections/domain/RealIsLinkWithStripe_Factory;
.super Ljava/lang/Object;
.source "RealIsLinkWithStripe_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/financialconnections/domain/RealIsLinkWithStripe;",
        ">;"
    }
.end annotation


# instance fields
.field private final initialStateProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;",
            ">;)V"
        }
    .end annotation

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/RealIsLinkWithStripe_Factory;->initialStateProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;)Lcom/stripe/android/financialconnections/domain/RealIsLinkWithStripe_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;",
            ">;)",
            "Lcom/stripe/android/financialconnections/domain/RealIsLinkWithStripe_Factory;"
        }
    .end annotation

    .line 48
    new-instance v0, Lcom/stripe/android/financialconnections/domain/RealIsLinkWithStripe_Factory;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/domain/RealIsLinkWithStripe_Factory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/stripe/android/financialconnections/domain/RealIsLinkWithStripe_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;",
            ">;)",
            "Lcom/stripe/android/financialconnections/domain/RealIsLinkWithStripe_Factory;"
        }
    .end annotation

    .line 43
    new-instance v0, Lcom/stripe/android/financialconnections/domain/RealIsLinkWithStripe_Factory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/domain/RealIsLinkWithStripe_Factory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/domain/RealIsLinkWithStripe;
    .locals 1

    .line 53
    new-instance v0, Lcom/stripe/android/financialconnections/domain/RealIsLinkWithStripe;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/domain/RealIsLinkWithStripe;-><init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/financialconnections/domain/RealIsLinkWithStripe;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/RealIsLinkWithStripe_Factory;->initialStateProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    invoke-static {v0}, Lcom/stripe/android/financialconnections/domain/RealIsLinkWithStripe_Factory;->newInstance(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/domain/RealIsLinkWithStripe;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/domain/RealIsLinkWithStripe_Factory;->get()Lcom/stripe/android/financialconnections/domain/RealIsLinkWithStripe;

    move-result-object v0

    return-object v0
.end method
