.class public interface abstract Lcom/stripe/android/paymentelement/embedded/content/EmbeddedSelectionChooser;
.super Ljava/lang/Object;
.source "EmbeddedSelectionChooser.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00e0\u0080\u0001\u0018\u00002\u00020\u0001JF\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00072\u0008\u0010\t\u001a\u0004\u0018\u00010\u00032\u0008\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedSelectionChooser;",
        "",
        "choose",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "paymentMethodMetadata",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
        "paymentMethods",
        "",
        "Lcom/stripe/android/model/PaymentMethod;",
        "previousSelection",
        "newSelection",
        "newConfiguration",
        "Lcom/stripe/android/common/model/CommonConfiguration;",
        "formSheetAction",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$FormSheetAction;",
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


# virtual methods
.method public abstract choose(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$FormSheetAction;)Lcom/stripe/android/paymentsheet/model/PaymentSelection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lcom/stripe/android/common/model/CommonConfiguration;",
            "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$FormSheetAction;",
            ")",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;"
        }
    .end annotation
.end method
