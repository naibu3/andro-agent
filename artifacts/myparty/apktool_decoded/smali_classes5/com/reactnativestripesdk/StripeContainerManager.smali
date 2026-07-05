.class public final Lcom/reactnativestripesdk/StripeContainerManager;
.super Lcom/facebook/react/uimanager/ViewGroupManager;
.source "StripeContainerManager.kt"

# interfaces
.implements Lcom/facebook/react/viewmanagers/StripeContainerManagerInterface;


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "StripeContainer"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativestripesdk/StripeContainerManager$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/ViewGroupManager<",
        "Lcom/reactnativestripesdk/StripeContainerView;",
        ">;",
        "Lcom/facebook/react/viewmanagers/StripeContainerManagerInterface<",
        "Lcom/reactnativestripesdk/StripeContainerView;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \u00142\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0014B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\t\u001a\u00020\nH\u0016J$\u0010\u000b\u001a\u001e\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00020\u0002\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\u0018\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0017J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0014R*\u0010\u0006\u001a\u001e\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00020\u0002\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/reactnativestripesdk/StripeContainerManager;",
        "Lcom/facebook/react/uimanager/ViewGroupManager;",
        "Lcom/reactnativestripesdk/StripeContainerView;",
        "Lcom/facebook/react/viewmanagers/StripeContainerManagerInterface;",
        "<init>",
        "()V",
        "delegate",
        "Lcom/facebook/react/viewmanagers/StripeContainerManagerDelegate;",
        "kotlin.jvm.PlatformType",
        "getName",
        "",
        "getDelegate",
        "setKeyboardShouldPersistTaps",
        "",
        "view",
        "keyboardShouldPersistTaps",
        "",
        "createViewInstance",
        "reactContext",
        "Lcom/facebook/react/uimanager/ThemedReactContext;",
        "Companion",
        "stripe_stripe-react-native_release"
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

.field public static final Companion:Lcom/reactnativestripesdk/StripeContainerManager$Companion;

.field public static final REACT_CLASS:Ljava/lang/String; = "StripeContainer"


# instance fields
.field private final delegate:Lcom/facebook/react/viewmanagers/StripeContainerManagerDelegate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/react/viewmanagers/StripeContainerManagerDelegate<",
            "Lcom/reactnativestripesdk/StripeContainerView;",
            "Lcom/reactnativestripesdk/StripeContainerManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/reactnativestripesdk/StripeContainerManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/reactnativestripesdk/StripeContainerManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/reactnativestripesdk/StripeContainerManager;->Companion:Lcom/reactnativestripesdk/StripeContainerManager$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/reactnativestripesdk/StripeContainerManager;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 12
    invoke-direct {p0, v0, v1, v0}, Lcom/facebook/react/uimanager/ViewGroupManager;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 14
    new-instance v0, Lcom/facebook/react/viewmanagers/StripeContainerManagerDelegate;

    move-object v1, p0

    check-cast v1, Lcom/facebook/react/uimanager/BaseViewManager;

    invoke-direct {v0, v1}, Lcom/facebook/react/viewmanagers/StripeContainerManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

    iput-object v0, p0, Lcom/reactnativestripesdk/StripeContainerManager;->delegate:Lcom/facebook/react/viewmanagers/StripeContainerManagerDelegate;

    return-void
.end method


# virtual methods
.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/View;
    .locals 0

    .line 10
    invoke-virtual {p0, p1}, Lcom/reactnativestripesdk/StripeContainerManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/reactnativestripesdk/StripeContainerView;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/reactnativestripesdk/StripeContainerView;
    .locals 1

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    new-instance v0, Lcom/reactnativestripesdk/StripeContainerView;

    invoke-direct {v0, p1}, Lcom/reactnativestripesdk/StripeContainerView;-><init>(Lcom/facebook/react/uimanager/ThemedReactContext;)V

    return-object v0
.end method

.method public bridge synthetic getDelegate()Lcom/facebook/react/uimanager/ViewManagerDelegate;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/reactnativestripesdk/StripeContainerManager;->getDelegate()Lcom/facebook/react/viewmanagers/StripeContainerManagerDelegate;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/uimanager/ViewManagerDelegate;

    return-object v0
.end method

.method protected getDelegate()Lcom/facebook/react/viewmanagers/StripeContainerManagerDelegate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/viewmanagers/StripeContainerManagerDelegate<",
            "Lcom/reactnativestripesdk/StripeContainerView;",
            "Lcom/reactnativestripesdk/StripeContainerManager;",
            ">;"
        }
    .end annotation

    .line 18
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeContainerManager;->delegate:Lcom/facebook/react/viewmanagers/StripeContainerManagerDelegate;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 16
    const-string v0, "StripeContainer"

    return-object v0
.end method

.method public bridge synthetic setKeyboardShouldPersistTaps(Landroid/view/View;Z)V
    .locals 0

    .line 10
    check-cast p1, Lcom/reactnativestripesdk/StripeContainerView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/StripeContainerManager;->setKeyboardShouldPersistTaps(Lcom/reactnativestripesdk/StripeContainerView;Z)V

    return-void
.end method

.method public setKeyboardShouldPersistTaps(Lcom/reactnativestripesdk/StripeContainerView;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "keyboardShouldPersistTaps"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/StripeContainerView;->setKeyboardShouldPersistTaps(Z)V

    return-void
.end method
