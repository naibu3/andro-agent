.class public interface abstract Lcom/stripe/android/paymentelement/embedded/form/FormActivityModule;
.super Ljava/lang/Object;
.source "FormActivityViewModelComponent.kt"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008a\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/form/FormActivityModule;",
        "",
        "bindsFormConfirmationHelper",
        "Lcom/stripe/android/paymentelement/embedded/form/FormActivityConfirmationHelper;",
        "confirmationHandler",
        "Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;",
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
.method public abstract bindsFormConfirmationHelper(Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;)Lcom/stripe/android/paymentelement/embedded/form/FormActivityConfirmationHelper;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method
