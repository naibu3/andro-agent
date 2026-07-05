.class public interface abstract Lcom/stripe/android/paymentelement/confirmation/injection/PaymentElementConfirmationModule;
.super Ljava/lang/Object;
.source "PaymentElementConfirmationModule.kt"


# annotations
.annotation runtime Ldagger/Module;
    includes = {
        Lcom/stripe/android/paymentelement/confirmation/injection/DefaultConfirmationModule;,
        Lcom/stripe/android/paymentelement/confirmation/bacs/BacsConfirmationModule;,
        Lcom/stripe/android/paymentelement/confirmation/epms/ExternalPaymentMethodConfirmationModule;,
        Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodConfirmationModule;,
        Lcom/stripe/android/paymentelement/confirmation/gpay/GooglePayConfirmationModule;,
        Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationModule;,
        Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationModule;,
        Lcom/stripe/android/paymentelement/confirmation/shoppay/ShopPayConfirmationModule;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0008a\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/confirmation/injection/PaymentElementConfirmationModule;",
        "",
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
