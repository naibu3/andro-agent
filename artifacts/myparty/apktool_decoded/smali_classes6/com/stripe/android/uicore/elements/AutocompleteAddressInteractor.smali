.class public interface abstract Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;
.super Ljava/lang/Object;
.source "AutocompleteAddressInteractor.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;,
        Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event;,
        Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008g\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010J\u001c\u0010\u0006\u001a\u00020\u00072\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\tH&J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\rH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;",
        "",
        "autocompleteConfig",
        "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;",
        "getAutocompleteConfig",
        "()Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;",
        "register",
        "",
        "onEvent",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event;",
        "onAutocomplete",
        "country",
        "",
        "Config",
        "Event",
        "Factory",
        "stripe-ui-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract getAutocompleteConfig()Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;
.end method

.method public abstract onAutocomplete(Ljava/lang/String;)V
.end method

.method public abstract register(Lkotlin/jvm/functions/Function1;)V
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
.end method
