.class public final Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel_Factory;
.super Ljava/lang/Object;
.source "AddressElementViewModel_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;",
        ">;"
    }
.end annotation


# instance fields
.field private final autoCompleteViewModelSubcomponentBuilderProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent$Builder;",
            ">;"
        }
    .end annotation
.end field

.field private final inputAddressViewModelSubcomponentBuilderProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/injection/InputAddressViewModelSubcomponent$Builder;",
            ">;"
        }
    .end annotation
.end field

.field private final navigatorProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/injection/InputAddressViewModelSubcomponent$Builder;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent$Builder;",
            ">;)V"
        }
    .end annotation

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel_Factory;->navigatorProvider:Ldagger/internal/Provider;

    .line 40
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel_Factory;->inputAddressViewModelSubcomponentBuilderProvider:Ldagger/internal/Provider;

    .line 41
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel_Factory;->autoCompleteViewModelSubcomponentBuilderProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/injection/InputAddressViewModelSubcomponent$Builder;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent$Builder;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel_Factory;"
        }
    .end annotation

    .line 60
    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel_Factory;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentsheet/injection/InputAddressViewModelSubcomponent$Builder;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent$Builder;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel_Factory;"
        }
    .end annotation

    .line 53
    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel_Factory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-static {p1}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    invoke-static {p2}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p2

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentsheet/injection/InputAddressViewModelSubcomponent$Builder;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent$Builder;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;"
        }
    .end annotation

    .line 66
    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;-><init>(Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;
    .locals 3

    .line 46
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel_Factory;->navigatorProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel_Factory;->inputAddressViewModelSubcomponentBuilderProvider:Ldagger/internal/Provider;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel_Factory;->autoCompleteViewModelSubcomponentBuilderProvider:Ldagger/internal/Provider;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel_Factory;->newInstance(Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel_Factory;->get()Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;

    move-result-object v0

    return-object v0
.end method
