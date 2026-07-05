.class public final Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "ManageViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u000cB\u001b\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0008\u0010\n\u001a\u00020\u000bH\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "component",
        "Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent;",
        "customViewModelScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "<init>",
        "(Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent;Lkotlinx/coroutines/CoroutineScope;)V",
        "getComponent",
        "()Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent;",
        "onCleared",
        "",
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


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final component:Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent;

.field private final customViewModelScope:Lkotlinx/coroutines/CoroutineScope;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent;Lkotlinx/coroutines/CoroutineScope;)V
    .locals 1
    .param p2    # Lkotlinx/coroutines/CoroutineScope;
        .annotation runtime Lcom/stripe/android/core/injection/ViewModelScope;
        .end annotation
    .end param
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "component"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customViewModelScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;->component:Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent;

    .line 15
    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;->customViewModelScope:Lkotlinx/coroutines/CoroutineScope;

    return-void
.end method


# virtual methods
.method public final getComponent()Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;->component:Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent;

    return-object v0
.end method

.method protected onCleared()V
    .locals 3

    .line 18
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;->customViewModelScope:Lkotlinx/coroutines/CoroutineScope;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/CoroutineScopeKt;->cancel$default(Lkotlinx/coroutines/CoroutineScope;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method
