.class Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl$2;
.super Ljava/lang/Object;
.source "DaggerLinkControllerComponent.java"

# interfaces
.implements Ldagger/internal/Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;->initialize2(Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule;Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/common/di/MobileSessionIdModule;Lcom/stripe/android/paymentsheet/injection/LinkHoldbackExposureModule;Landroid/app/Application;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Provider<",
        "Lcom/stripe/android/link/injection/LinkControllerPresenterComponent$Factory;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;


# direct methods
.method constructor <init>(Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;)V
    .locals 0

    .line 517
    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl$2;->this$0:Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Lcom/stripe/android/link/injection/LinkControllerPresenterComponent$Factory;
    .locals 3

    .line 520
    new-instance v0, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerPresenterComponentFactory;

    iget-object v1, p0, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl$2;->this$0:Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;

    invoke-static {v1}, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;->-$$Nest$fgetlinkControllerComponentImpl(Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;)Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerPresenterComponentFactory;-><init>(Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;Lcom/stripe/android/link/injection/DaggerLinkControllerComponent-IA;)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 517
    invoke-virtual {p0}, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl$2;->get()Lcom/stripe/android/link/injection/LinkControllerPresenterComponent$Factory;

    move-result-object v0

    return-object v0
.end method
