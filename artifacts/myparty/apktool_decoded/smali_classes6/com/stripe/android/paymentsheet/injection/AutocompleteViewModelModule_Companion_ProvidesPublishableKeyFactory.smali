.class public final Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule_Companion_ProvidesPublishableKeyFactory;
.super Ljava/lang/Object;
.source "AutocompleteViewModelModule_Companion_ProvidesPublishableKeyFactory.java"

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
.field private final contextProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Landroid/content/Context;",
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
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule_Companion_ProvidesPublishableKeyFactory;->contextProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;)Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule_Companion_ProvidesPublishableKeyFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Landroid/content/Context;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule_Companion_ProvidesPublishableKeyFactory;"
        }
    .end annotation

    .line 50
    new-instance v0, Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule_Companion_ProvidesPublishableKeyFactory;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule_Companion_ProvidesPublishableKeyFactory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule_Companion_ProvidesPublishableKeyFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule_Companion_ProvidesPublishableKeyFactory;"
        }
    .end annotation

    .line 45
    new-instance v0, Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule_Companion_ProvidesPublishableKeyFactory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule_Companion_ProvidesPublishableKeyFactory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static providesPublishableKey(Landroid/content/Context;)Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 54
    sget-object v0, Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule;->Companion:Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule$Companion;->providesPublishableKey(Landroid/content/Context;)Lkotlin/jvm/functions/Function0;

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
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule_Companion_ProvidesPublishableKeyFactory;->get()Lkotlin/jvm/functions/Function0;

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
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule_Companion_ProvidesPublishableKeyFactory;->contextProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule_Companion_ProvidesPublishableKeyFactory;->providesPublishableKey(Landroid/content/Context;)Lkotlin/jvm/functions/Function0;

    move-result-object v0

    return-object v0
.end method
