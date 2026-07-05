.class final Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;
.super Ljava/lang/Object;
.source "DaggerStripeCustomerAdapterComponent.java"

# interfaces
.implements Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Builder"
.end annotation


# instance fields
.field private context:Landroid/content/Context;

.field private customerEphemeralKeyProvider:Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;

.field private paymentMethodTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private setupIntentClientSecretProvider:Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent-IA;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent;
    .locals 10

    .line 95
    iget-object v0, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;->context:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 96
    iget-object v0, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;->customerEphemeralKeyProvider:Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;

    const-class v1, Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 97
    new-instance v2, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;

    new-instance v3, Lcom/stripe/android/core/injection/CoroutineContextModule;

    invoke-direct {v3}, Lcom/stripe/android/core/injection/CoroutineContextModule;-><init>()V

    new-instance v4, Lcom/stripe/android/core/injection/CoreCommonModule;

    invoke-direct {v4}, Lcom/stripe/android/core/injection/CoreCommonModule;-><init>()V

    iget-object v5, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;->context:Landroid/content/Context;

    iget-object v6, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;->customerEphemeralKeyProvider:Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;

    iget-object v7, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;->setupIntentClientSecretProvider:Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;

    iget-object v8, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;->paymentMethodTypes:Ljava/util/List;

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v9}, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;-><init>(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/content/Context;Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;Ljava/util/List;Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent-IA;)V

    return-object v2
.end method

.method public context(Landroid/content/Context;)Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;
    .locals 0

    .line 69
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;->context:Landroid/content/Context;

    return-object p0
.end method

.method public bridge synthetic context(Landroid/content/Context;)Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent$Builder;
    .locals 0

    .line 58
    invoke-virtual {p0, p1}, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;->context(Landroid/content/Context;)Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public customerEphemeralKeyProvider(Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;)Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;
    .locals 0

    .line 76
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;->customerEphemeralKeyProvider:Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;

    return-object p0
.end method

.method public bridge synthetic customerEphemeralKeyProvider(Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;)Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent$Builder;
    .locals 0

    .line 58
    invoke-virtual {p0, p1}, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;->customerEphemeralKeyProvider(Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;)Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public paymentMethodTypes(Ljava/util/List;)Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;"
        }
    .end annotation

    .line 89
    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;->paymentMethodTypes:Ljava/util/List;

    return-object p0
.end method

.method public bridge synthetic paymentMethodTypes(Ljava/util/List;)Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent$Builder;
    .locals 0

    .line 58
    invoke-virtual {p0, p1}, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;->paymentMethodTypes(Ljava/util/List;)Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setupIntentClientSecretProvider(Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;)Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;->setupIntentClientSecretProvider:Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;

    return-object p0
.end method

.method public bridge synthetic setupIntentClientSecretProvider(Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;)Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent$Builder;
    .locals 0

    .line 58
    invoke-virtual {p0, p1}, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;->setupIntentClientSecretProvider(Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;)Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;

    move-result-object p1

    return-object p1
.end method
