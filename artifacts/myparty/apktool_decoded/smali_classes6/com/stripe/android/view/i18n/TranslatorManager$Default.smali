.class final Lcom/stripe/android/view/i18n/TranslatorManager$Default;
.super Ljava/lang/Object;
.source "TranslatorManager.kt"

# interfaces
.implements Lcom/stripe/android/view/i18n/ErrorMessageTranslator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/view/i18n/TranslatorManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Default"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00052\u0008\u0010\t\u001a\u0004\u0018\u00010\nH\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/view/i18n/TranslatorManager$Default;",
        "Lcom/stripe/android/view/i18n/ErrorMessageTranslator;",
        "<init>",
        "()V",
        "translate",
        "",
        "httpCode",
        "",
        "errorMessage",
        "stripeError",
        "Lcom/stripe/android/core/StripeError;",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public translate(ILjava/lang/String;Lcom/stripe/android/core/StripeError;)Ljava/lang/String;
    .locals 0

    if-nez p2, :cond_0

    .line 44
    const-string p1, ""

    return-object p1

    :cond_0
    return-object p2
.end method
