.class public final Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher$register$2;
.super Ljava/lang/Object;
.source "AutocompleteLauncher.kt"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;->register(Landroidx/activity/result/ActivityResultCaller;Landroidx/lifecycle/LifecycleOwner;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher$register$2",
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
.field final synthetic this$0:Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher$register$2;->this$0:Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;

    .line 164
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDestroy(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher$register$2;->this$0:Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;->access$getActivityLauncher$p(Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/activity/result/ActivityResultLauncher;->unregister()V

    .line 167
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher$register$2;->this$0:Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;->access$setActivityLauncher$p(Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;Landroidx/activity/result/ActivityResultLauncher;)V

    return-void
.end method
