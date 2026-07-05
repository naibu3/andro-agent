.class public final Lcom/stripe/android/paymentsheet/addresselement/PaymentElementAutocompleteAddressInteractor$Factory;
.super Ljava/lang/Object;
.source "PaymentElementAutocompleteAddressInteractor.kt"

# interfaces
.implements Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/addresselement/PaymentElementAutocompleteAddressInteractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0008\u0010\u0008\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/PaymentElementAutocompleteAddressInteractor$Factory;",
        "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;",
        "launcher",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;",
        "autocompleteConfig",
        "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;)V",
        "create",
        "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;",
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
.field public static final $stable:I


# instance fields
.field private final autocompleteConfig:Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;

.field private final launcher:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;->$stable:I

    sput v0, Lcom/stripe/android/paymentsheet/addresselement/PaymentElementAutocompleteAddressInteractor$Factory;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;)V
    .locals 1

    const-string v0, "launcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autocompleteConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/PaymentElementAutocompleteAddressInteractor$Factory;->launcher:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;

    .line 44
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/PaymentElementAutocompleteAddressInteractor$Factory;->autocompleteConfig:Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;

    return-void
.end method


# virtual methods
.method public create()Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;
    .locals 3

    .line 47
    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/PaymentElementAutocompleteAddressInteractor;

    .line 48
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/PaymentElementAutocompleteAddressInteractor$Factory;->launcher:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;

    .line 49
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/addresselement/PaymentElementAutocompleteAddressInteractor$Factory;->autocompleteConfig:Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;

    .line 47
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/addresselement/PaymentElementAutocompleteAddressInteractor;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;)V

    check-cast v0, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;

    return-object v0
.end method
