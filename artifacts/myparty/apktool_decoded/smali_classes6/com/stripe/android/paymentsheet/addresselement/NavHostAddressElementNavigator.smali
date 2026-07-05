.class public final Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;
.super Ljava/lang/Object;
.source "AddressElementNavigator.kt"

# interfaces
.implements Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u0001B\t\u0008\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J$\u0010\u001a\u001a\n\u0012\u0004\u0012\u0002H\u001c\u0018\u00010\u001b\"\n\u0008\u0000\u0010\u001c*\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u000cH\u0016J\u0008\u0010\u001f\u001a\u00020\rH\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011\u00a8\u0006 "
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;",
        "<init>",
        "()V",
        "navigationController",
        "Landroidx/navigation/NavHostController;",
        "getNavigationController",
        "()Landroidx/navigation/NavHostController;",
        "setNavigationController",
        "(Landroidx/navigation/NavHostController;)V",
        "onDismiss",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;",
        "",
        "getOnDismiss",
        "()Lkotlin/jvm/functions/Function1;",
        "setOnDismiss",
        "(Lkotlin/jvm/functions/Function1;)V",
        "navigateTo",
        "target",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementScreen;",
        "setResult",
        "key",
        "",
        "value",
        "",
        "getResultFlow",
        "Lkotlinx/coroutines/flow/Flow;",
        "T",
        "dismiss",
        "result",
        "onBack",
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
.field public static final $stable:I = 0x8


# instance fields
.field private navigationController:Landroidx/navigation/NavHostController;

.field private onDismiss:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dismiss(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;->onDismiss:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final getNavigationController()Landroidx/navigation/NavHostController;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;->navigationController:Landroidx/navigation/NavHostController;

    return-object v0
.end method

.method public final getOnDismiss()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 46
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;->onDismiss:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public getResultFlow(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/Flow<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;->navigationController:Landroidx/navigation/NavHostController;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/navigation/NavHostController;->getCurrentBackStackEntry()Landroidx/navigation/NavBackStackEntry;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 61
    :cond_0
    invoke-virtual {v0}, Landroidx/navigation/NavBackStackEntry;->getSavedStateHandle()Landroidx/lifecycle/SavedStateHandle;

    move-result-object v0

    .line 62
    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    check-cast p1, Lkotlinx/coroutines/flow/Flow;

    .line 63
    invoke-static {p1}, Lkotlinx/coroutines/flow/FlowKt;->filterNotNull(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    return-object v1
.end method

.method public navigateTo(Lcom/stripe/android/paymentsheet/addresselement/AddressElementScreen;)V
    .locals 7

    const-string v0, "target"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;->navigationController:Landroidx/navigation/NavHostController;

    if-eqz v0, :cond_0

    move-object v1, v0

    check-cast v1, Landroidx/navigation/NavController;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementScreen;->getRoute()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Landroidx/navigation/NavController;->navigate$default(Landroidx/navigation/NavController;Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onBack()V
    .locals 3

    .line 71
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;->navigationController:Landroidx/navigation/NavHostController;

    if-eqz v0, :cond_0

    .line 72
    invoke-virtual {v0}, Landroidx/navigation/NavHostController;->popBackStack()Z

    move-result v0

    if-nez v0, :cond_0

    .line 73
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator$DefaultImpls;->dismiss$default(Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final setNavigationController(Landroidx/navigation/NavHostController;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;->navigationController:Landroidx/navigation/NavHostController;

    return-void
.end method

.method public final setOnDismiss(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 46
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;->onDismiss:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public setResult(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;->navigationController:Landroidx/navigation/NavHostController;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/navigation/NavHostController;->getPreviousBackStackEntry()Landroidx/navigation/NavBackStackEntry;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/navigation/NavBackStackEntry;->getSavedStateHandle()Landroidx/lifecycle/SavedStateHandle;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
