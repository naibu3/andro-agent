.class public interface abstract Lcom/stripe/android/paymentelement/confirmation/gpay/GooglePayConfirmationModule;
.super Ljava/lang/Object;
.source "GooglePayConfirmationModule.kt"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008a\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u0012\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/confirmation/gpay/GooglePayConfirmationModule;",
        "",
        "bindsGooglePayConfirmationDefinition",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;",
        "definition",
        "Lcom/stripe/android/paymentelement/confirmation/gpay/GooglePayConfirmationDefinition;",
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
.method public abstract bindsGooglePayConfirmationDefinition(Lcom/stripe/android/paymentelement/confirmation/gpay/GooglePayConfirmationDefinition;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;
    .annotation runtime Ldagger/Binds;
    .end annotation

    .annotation runtime Ldagger/multibindings/IntoSet;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentelement/confirmation/gpay/GooglePayConfirmationDefinition;",
            ")",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition<",
            "****>;"
        }
    .end annotation
.end method
