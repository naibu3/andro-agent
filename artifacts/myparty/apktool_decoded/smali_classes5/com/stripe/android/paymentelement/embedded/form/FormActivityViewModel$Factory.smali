.class public final Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModel$Factory;
.super Ljava/lang/Object;
.source "FormActivityViewModel.kt"

# interfaces
.implements Landroidx/lifecycle/ViewModelProvider$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J-\u0010\u0007\u001a\u0002H\u0008\"\u0008\u0008\u0000\u0010\u0008*\u00020\t2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u0002H\u00080\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0016\u00a2\u0006\u0002\u0010\u000eR\u0014\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModel$Factory;",
        "Landroidx/lifecycle/ViewModelProvider$Factory;",
        "argSupplier",
        "Lkotlin/Function0;",
        "Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;",
        "<init>",
        "(Lkotlin/jvm/functions/Function0;)V",
        "create",
        "T",
        "Landroidx/lifecycle/ViewModel;",
        "modelClass",
        "Ljava/lang/Class;",
        "extras",
        "Landroidx/lifecycle/viewmodel/CreationExtras;",
        "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;",
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
.field private final argSupplier:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;",
            ">;)V"
        }
    .end annotation

    const-string v0, "argSupplier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModel$Factory;->argSupplier:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public create(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/ViewModel;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Landroidx/lifecycle/viewmodel/CreationExtras;",
            ")TT;"
        }
    .end annotation

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "extras"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModel$Factory;->argSupplier:Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;

    .line 27
    invoke-static {}, Lcom/stripe/android/paymentelement/embedded/form/DaggerFormActivityViewModelComponent;->factory()Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelComponent$Factory;

    move-result-object v0

    .line 28
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;->getPaymentMethodMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v1

    .line 29
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;->getSelectedPaymentMethodCode()Ljava/lang/String;

    move-result-object v2

    .line 30
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;->getHasSavedPaymentMethods()Z

    move-result v3

    .line 31
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;->getConfiguration()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;

    move-result-object v5

    .line 32
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;->getInitializationMode()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    move-result-object v6

    .line 33
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;->getStatusBarColor()Ljava/lang/Integer;

    move-result-object v4

    .line 34
    invoke-static {p2}, Lcom/stripe/android/core/utils/CreationExtrasKtxKt;->requireApplication(Landroidx/lifecycle/viewmodel/CreationExtras;)Landroid/app/Application;

    move-result-object v8

    .line 35
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;->getPaymentElementCallbackIdentifier()Ljava/lang/String;

    move-result-object v7

    .line 36
    invoke-static {p2}, Landroidx/lifecycle/SavedStateHandleSupport;->createSavedStateHandle(Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/SavedStateHandle;

    move-result-object v9

    .line 27
    invoke-interface/range {v0 .. v9}, Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelComponent$Factory;->build(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Ljava/lang/String;ZLjava/lang/Integer;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Ljava/lang/String;Landroid/app/Application;Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelComponent;

    move-result-object p2

    .line 39
    invoke-interface {p2}, Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelComponent;->getSelectionHolder()Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;->getPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->set(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    .line 41
    invoke-interface {p2}, Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelComponent;->getViewModel()Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModel;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type T of com.stripe.android.paymentelement.embedded.form.FormActivityViewModel.Factory.create"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/lifecycle/ViewModel;

    return-object p1
.end method
