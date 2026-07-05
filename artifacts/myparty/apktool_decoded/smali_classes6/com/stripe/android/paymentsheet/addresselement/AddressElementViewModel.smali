.class public final Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "AddressElementViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0010B-\u0008\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0005\u00a2\u0006\u0004\u0008\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000e\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "navigator",
        "Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;",
        "inputAddressViewModelSubcomponentBuilderProvider",
        "Ljavax/inject/Provider;",
        "Lcom/stripe/android/paymentsheet/injection/InputAddressViewModelSubcomponent$Builder;",
        "autoCompleteViewModelSubcomponentBuilderProvider",
        "Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent$Builder;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;Ljavax/inject/Provider;Ljavax/inject/Provider;)V",
        "getNavigator",
        "()Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;",
        "getInputAddressViewModelSubcomponentBuilderProvider",
        "()Ljavax/inject/Provider;",
        "getAutoCompleteViewModelSubcomponentBuilderProvider",
        "Factory",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final autoCompleteViewModelSubcomponentBuilderProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent$Builder;",
            ">;"
        }
    .end annotation
.end field

.field private final inputAddressViewModelSubcomponentBuilderProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentsheet/injection/InputAddressViewModelSubcomponent$Builder;",
            ">;"
        }
    .end annotation
.end field

.field private final navigator:Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
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
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inputAddressViewModelSubcomponentBuilderProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autoCompleteViewModelSubcomponentBuilderProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;->navigator:Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;

    .line 14
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;->inputAddressViewModelSubcomponentBuilderProvider:Ljavax/inject/Provider;

    .line 15
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;->autoCompleteViewModelSubcomponentBuilderProvider:Ljavax/inject/Provider;

    return-void
.end method


# virtual methods
.method public final getAutoCompleteViewModelSubcomponentBuilderProvider()Ljavax/inject/Provider;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent$Builder;",
            ">;"
        }
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;->autoCompleteViewModelSubcomponentBuilderProvider:Ljavax/inject/Provider;

    return-object v0
.end method

.method public final getInputAddressViewModelSubcomponentBuilderProvider()Ljavax/inject/Provider;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentsheet/injection/InputAddressViewModelSubcomponent$Builder;",
            ">;"
        }
    .end annotation

    .line 14
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;->inputAddressViewModelSubcomponentBuilderProvider:Ljavax/inject/Provider;

    return-object v0
.end method

.method public final getNavigator()Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;->navigator:Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;

    return-object v0
.end method
