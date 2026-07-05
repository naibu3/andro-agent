.class public final Lcom/stripe/android/paymentsheet/addresselement/PaymentElementAutocompleteAddressInteractor;
.super Ljava/lang/Object;
.source "PaymentElementAutocompleteAddressInteractor.kt"

# interfaces
.implements Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;
.implements Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncherResultHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/addresselement/PaymentElementAutocompleteAddressInteractor$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001c\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000cH\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/PaymentElementAutocompleteAddressInteractor;",
        "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncherResultHandler;",
        "launcher",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;",
        "autocompleteConfig",
        "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;)V",
        "getAutocompleteConfig",
        "()Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;",
        "eventListener",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event;",
        "",
        "register",
        "onEvent",
        "onAutocomplete",
        "country",
        "",
        "onAutocompleteLauncherResult",
        "result",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher$Result;",
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
.field private final autocompleteConfig:Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;

.field private eventListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final launcher:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;)V
    .locals 1

    const-string v0, "launcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autocompleteConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/PaymentElementAutocompleteAddressInteractor;->launcher:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;

    .line 7
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/PaymentElementAutocompleteAddressInteractor;->autocompleteConfig:Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;

    return-void
.end method


# virtual methods
.method public getAutocompleteConfig()Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/PaymentElementAutocompleteAddressInteractor;->autocompleteConfig:Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;

    return-object v0
.end method

.method public onAutocomplete(Ljava/lang/String;)V
    .locals 3

    const-string v0, "country"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/addresselement/PaymentElementAutocompleteAddressInteractor;->getAutocompleteConfig()Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;->getGooglePlacesApiKey()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 17
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/PaymentElementAutocompleteAddressInteractor;->launcher:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;

    .line 20
    move-object v2, p0

    check-cast v2, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncherResultHandler;

    .line 17
    invoke-interface {v1, p1, v0, v2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;->launch(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncherResultHandler;)V

    :cond_0
    return-void
.end method

.method public onAutocompleteLauncherResult(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher$Result;)V
    .locals 3

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-interface {p1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher$Result;->getAddressDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetailsKt;->toIdentifierMap$default(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;ILjava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 29
    :goto_0
    instance-of v2, p1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher$Result$EnterManually;

    if-eqz v2, :cond_1

    .line 30
    new-instance p1, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event$OnExpandForm;

    invoke-direct {p1, v0}, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event$OnExpandForm;-><init>(Ljava/util/Map;)V

    check-cast p1, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event;

    goto :goto_1

    .line 32
    :cond_1
    instance-of p1, p1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher$Result$OnBack;

    if-eqz p1, :cond_4

    if-eqz v0, :cond_2

    .line 33
    new-instance v1, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event$OnValues;

    invoke-direct {v1, v0}, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event$OnValues;-><init>(Ljava/util/Map;)V

    .line 32
    :cond_2
    move-object p1, v1

    check-cast p1, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event;

    :goto_1
    if-eqz p1, :cond_3

    .line 38
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/PaymentElementAutocompleteAddressInteractor;->eventListener:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_3

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-void

    .line 28
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public register(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/PaymentElementAutocompleteAddressInteractor;->eventListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method
