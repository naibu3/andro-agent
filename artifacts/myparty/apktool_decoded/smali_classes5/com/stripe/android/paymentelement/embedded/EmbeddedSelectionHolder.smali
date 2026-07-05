.class public final Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;
.super Ljava/lang/Object;
.source "EmbeddedSelectionHolder.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder$Companion;
    }
.end annotation

.annotation runtime Ljavax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0008J\u0016\u0010\u0015\u001a\u00020\u00132\u000e\u0010\u0016\u001a\n\u0018\u00010\u000cj\u0004\u0018\u0001`\u0017J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u000fJ\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0016\u001a\u00060\u000cj\u0002`\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\nR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;",
        "",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "<init>",
        "(Landroidx/lifecycle/SavedStateHandle;)V",
        "selection",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "getSelection",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "temporarySelection",
        "",
        "getTemporarySelection",
        "previousNewSelections",
        "Landroid/os/Bundle;",
        "getPreviousNewSelections",
        "()Landroid/os/Bundle;",
        "set",
        "",
        "updatedSelection",
        "setTemporary",
        "code",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "setPreviousNewSelections",
        "bundle",
        "getPreviousNewSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;",
        "Companion",
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

.field public static final Companion:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder$Companion;

.field public static final EMBEDDED_PREVIOUS_SELECTIONS_KEY:Ljava/lang/String; = "EMBEDDED_PREVIOUS_SELECTIONS_KEY"

.field public static final EMBEDDED_SELECTION_KEY:Ljava/lang/String; = "EMBEDDED_SELECTION_KEY"

.field public static final EMBEDDED_TEMPORARY_SELECTION_KEY:Ljava/lang/String; = "EMBEDDED_TEMPORARY_SELECTION_KEY"


# instance fields
.field private final previousNewSelections:Landroid/os/Bundle;

.field private final savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

.field private final selection:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;"
        }
    .end annotation
.end field

.field private final temporarySelection:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->Companion:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/SavedStateHandle;)V
    .locals 2
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "savedStateHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    .line 16
    const-string v0, "EMBEDDED_SELECTION_KEY"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->selection:Lkotlinx/coroutines/flow/StateFlow;

    .line 17
    const-string v0, "EMBEDDED_TEMPORARY_SELECTION_KEY"

    invoke-virtual {p1, v0, v1}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->temporarySelection:Lkotlinx/coroutines/flow/StateFlow;

    .line 18
    const-string v0, "EMBEDDED_PREVIOUS_SELECTIONS_KEY"

    invoke-virtual {p1, v0}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    if-nez p1, :cond_0

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    :cond_0
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->previousNewSelections:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final getPreviousNewSelection(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;
    .locals 1

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->previousNewSelections:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    return-object p1
.end method

.method public final getPreviousNewSelections()Landroid/os/Bundle;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->previousNewSelections:Landroid/os/Bundle;

    return-object v0
.end method

.method public final getSelection()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;"
        }
    .end annotation

    .line 16
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->selection:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getTemporarySelection()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 17
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->temporarySelection:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final set(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V
    .locals 2

    .line 21
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "EMBEDDED_SELECTION_KEY"

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    .line 23
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    if-eqz v0, :cond_0

    .line 24
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->previousNewSelections:Landroid/os/Bundle;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelectionKt;->getPaymentMethodType(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Ljava/lang/String;

    move-result-object v1

    check-cast p1, Landroid/os/Parcelable;

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    return-void
.end method

.method public final setPreviousNewSelections(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "bundle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->previousNewSelections:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    return-void
.end method

.method public final setTemporary(Ljava/lang/String;)V
    .locals 2

    .line 29
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "EMBEDDED_TEMPORARY_SELECTION_KEY"

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
