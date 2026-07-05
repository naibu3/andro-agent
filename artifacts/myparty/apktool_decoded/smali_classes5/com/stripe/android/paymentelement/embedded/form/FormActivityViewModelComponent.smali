.class public interface abstract Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelComponent;
.super Ljava/lang/Object;
.source "FormActivityViewModelComponent.kt"


# annotations
.annotation runtime Ldagger/Component;
    modules = {
        Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule;,
        Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelModule;,
        Lcom/stripe/android/paymentelement/confirmation/injection/ExtendedPaymentElementConfirmationModule;,
        Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule;,
        Lcom/stripe/android/ui/core/di/CardScanModule;,
        Lcom/stripe/android/paymentelement/embedded/EmbeddedLinkExtrasModule;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelComponent$Factory;
    }
.end annotation

.annotation runtime Ljavax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008a\u0018\u00002\u00020\u0001:\u0001\u000eR\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelComponent;",
        "",
        "viewModel",
        "Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModel;",
        "getViewModel",
        "()Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModel;",
        "selectionHolder",
        "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;",
        "getSelectionHolder",
        "()Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;",
        "subcomponentFactory",
        "Lcom/stripe/android/paymentelement/embedded/form/FormActivitySubcomponent$Factory;",
        "getSubcomponentFactory",
        "()Lcom/stripe/android/paymentelement/embedded/form/FormActivitySubcomponent$Factory;",
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


# virtual methods
.method public abstract getSelectionHolder()Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;
.end method

.method public abstract getSubcomponentFactory()Lcom/stripe/android/paymentelement/embedded/form/FormActivitySubcomponent$Factory;
.end method

.method public abstract getViewModel()Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModel;
.end method
