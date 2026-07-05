.class public final Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory;
.super Ljava/lang/Object;
.source "IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/paymentsheet/CreateIntentCallback;",
        ">;"
    }
.end annotation


# instance fields
.field private final paymentElementCallbackIdentifierProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Ljava/lang/String;",
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
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory;->paymentElementCallbackIdentifierProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory;"
        }
    .end annotation

    .line 48
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory;"
        }
    .end annotation

    .line 43
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static providesCreateIntentCallback(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/CreateIntentCallback;
    .locals 1

    .line 53
    sget-object v0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule;->Companion:Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule$Companion;->providesCreateIntentCallback(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/CreateIntentCallback;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentsheet/CreateIntentCallback;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory;->paymentElementCallbackIdentifierProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory;->providesCreateIntentCallback(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/CreateIntentCallback;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory;->get()Lcom/stripe/android/paymentsheet/CreateIntentCallback;

    move-result-object v0

    return-object v0
.end method
