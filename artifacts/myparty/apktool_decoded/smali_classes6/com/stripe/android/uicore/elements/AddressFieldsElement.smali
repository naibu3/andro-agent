.class public interface abstract Lcom/stripe/android/uicore/elements/AddressFieldsElement;
.super Ljava/lang/Object;
.source "AddressFieldsElement.kt"

# interfaces
.implements Lcom/stripe/android/uicore/elements/SectionFieldElement;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008g\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0008X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/AddressFieldsElement;",
        "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
        "addressController",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/uicore/elements/AddressController;",
        "getAddressController",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "countryElement",
        "Lcom/stripe/android/uicore/elements/CountryElement;",
        "getCountryElement",
        "()Lcom/stripe/android/uicore/elements/CountryElement;",
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
.method public abstract getAddressController()Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/AddressController;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getCountryElement()Lcom/stripe/android/uicore/elements/CountryElement;
.end method
