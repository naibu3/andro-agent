.class public final Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$register$2;
.super Ljava/lang/Object;
.source "DefaultConfirmationHandler.kt"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->register(Landroidx/activity/result/ActivityResultCaller;Landroidx/lifecycle/LifecycleOwner;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDefaultConfirmationHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultConfirmationHandler.kt\ncom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$register$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,302:1\n1863#2,2:303\n*S KotlinDebug\n*F\n+ 1 DefaultConfirmationHandler.kt\ncom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$register$2\n*L\n75#1:303,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$register$2",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "onDestroy",
        "",
        "owner",
        "Landroidx/lifecycle/LifecycleOwner;",
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


# instance fields
.field final synthetic this$0:Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$register$2;->this$0:Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDestroy(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$register$2;->this$0:Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;

    invoke-static {v0}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->access$getMediators$p(Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 303
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator;

    .line 76
    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator;->unregister()V

    goto :goto_0

    .line 78
    :cond_0
    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onDestroy(Landroidx/lifecycle/LifecycleOwner;)V

    return-void
.end method
