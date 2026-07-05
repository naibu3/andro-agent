.class public final Lcom/stripe/android/customersheet/CustomerSheet$1;
.super Ljava/lang/Object;
.source "CustomerSheet.kt"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/customersheet/CustomerSheet;-><init>(Landroid/app/Application;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/ActivityResultRegistryOwner;Landroidx/lifecycle/ViewModelStoreOwner;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Lcom/stripe/android/customersheet/CustomerSheetResultCallback;Lkotlin/jvm/functions/Function0;)V
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
        "com/stripe/android/customersheet/CustomerSheet$1",
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
.field final synthetic this$0:Lcom/stripe/android/customersheet/CustomerSheet;


# direct methods
.method constructor <init>(Lcom/stripe/android/customersheet/CustomerSheet;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheet$1;->this$0:Lcom/stripe/android/customersheet/CustomerSheet;

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDestroy(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$1;->this$0:Lcom/stripe/android/customersheet/CustomerSheet;

    invoke-static {v0}, Lcom/stripe/android/customersheet/CustomerSheet;->access$getCustomerSheetActivityLauncher$p(Lcom/stripe/android/customersheet/CustomerSheet;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/activity/result/ActivityResultLauncher;->unregister()V

    .line 60
    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onDestroy(Landroidx/lifecycle/LifecycleOwner;)V

    return-void
.end method
