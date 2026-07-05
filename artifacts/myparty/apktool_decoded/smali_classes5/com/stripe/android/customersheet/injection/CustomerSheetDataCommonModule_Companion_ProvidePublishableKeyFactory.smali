.class public final Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidePublishableKeyFactory;
.super Ljava/lang/Object;
.source "CustomerSheetDataCommonModule_Companion_ProvidePublishableKeyFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final paymentConfigurationProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/PaymentConfiguration;",
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
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;)V"
        }
    .end annotation

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidePublishableKeyFactory;->paymentConfigurationProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;)Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidePublishableKeyFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;)",
            "Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidePublishableKeyFactory;"
        }
    .end annotation

    .line 50
    new-instance v0, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidePublishableKeyFactory;

    invoke-direct {v0, p0}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidePublishableKeyFactory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidePublishableKeyFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;)",
            "Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidePublishableKeyFactory;"
        }
    .end annotation

    .line 45
    new-instance v0, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidePublishableKeyFactory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidePublishableKeyFactory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static providePublishableKey(Ljavax/inject/Provider;)Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;)",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 55
    sget-object v0, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule;->Companion:Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule$Companion;->providePublishableKey(Ljavax/inject/Provider;)Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-static {p0}, Ldagger/internal/Preconditions;->checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/jvm/functions/Function0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidePublishableKeyFactory;->get()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    return-object v0
.end method

.method public get()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 40
    iget-object v0, p0, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidePublishableKeyFactory;->paymentConfigurationProvider:Ldagger/internal/Provider;

    invoke-static {v0}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidePublishableKeyFactory;->providePublishableKey(Ljavax/inject/Provider;)Lkotlin/jvm/functions/Function0;

    move-result-object v0

    return-object v0
.end method
