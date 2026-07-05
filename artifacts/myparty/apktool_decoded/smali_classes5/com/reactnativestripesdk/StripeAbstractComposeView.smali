.class public abstract Lcom/reactnativestripesdk/StripeAbstractComposeView;
.super Landroidx/compose/ui/platform/AbstractComposeView;
.source "StripeAbstractComposeView.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativestripesdk/StripeAbstractComposeView$CompatView;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\'\u0018\u00002\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u000c\u001a\u00020\rH\u0014J\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/reactnativestripesdk/StripeAbstractComposeView;",
        "Landroidx/compose/ui/platform/AbstractComposeView;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "isLifecycleSetup",
        "",
        "lifecycleOwner",
        "Landroidx/lifecycle/LifecycleOwner;",
        "lifecycleRegistry",
        "Landroidx/lifecycle/LifecycleRegistry;",
        "onAttachedToWindow",
        "",
        "handleOnDropViewInstance",
        "CompatView",
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
.field public static final $stable:I = 0x8


# instance fields
.field private isLifecycleSetup:Z

.field private final lifecycleOwner:Landroidx/lifecycle/LifecycleOwner;

.field private lifecycleRegistry:Landroidx/lifecycle/LifecycleRegistry;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    .line 38
    invoke-direct/range {v1 .. v6}, Landroidx/compose/ui/platform/AbstractComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 63
    new-instance p1, Lcom/reactnativestripesdk/StripeAbstractComposeView$lifecycleOwner$1;

    invoke-direct {p1, p0}, Lcom/reactnativestripesdk/StripeAbstractComposeView$lifecycleOwner$1;-><init>(Lcom/reactnativestripesdk/StripeAbstractComposeView;)V

    check-cast p1, Landroidx/lifecycle/LifecycleOwner;

    iput-object p1, v1, Lcom/reactnativestripesdk/StripeAbstractComposeView;->lifecycleOwner:Landroidx/lifecycle/LifecycleOwner;

    .line 68
    new-instance v0, Landroidx/lifecycle/LifecycleRegistry;

    invoke-direct {v0, p1}, Landroidx/lifecycle/LifecycleRegistry;-><init>(Landroidx/lifecycle/LifecycleOwner;)V

    iput-object v0, v1, Lcom/reactnativestripesdk/StripeAbstractComposeView;->lifecycleRegistry:Landroidx/lifecycle/LifecycleRegistry;

    .line 73
    new-instance v0, Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnLifecycleDestroyed;

    invoke-direct {v0, p1}, Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnLifecycleDestroyed;-><init>(Landroidx/lifecycle/LifecycleOwner;)V

    check-cast v0, Landroidx/compose/ui/platform/ViewCompositionStrategy;

    .line 72
    invoke-virtual {p0, v0}, Lcom/reactnativestripesdk/StripeAbstractComposeView;->setViewCompositionStrategy(Landroidx/compose/ui/platform/ViewCompositionStrategy;)V

    .line 75
    move-object v0, v1

    check-cast v0, Landroid/view/View;

    invoke-static {v0, p1}, Landroidx/lifecycle/ViewTreeLifecycleOwner;->set(Landroid/view/View;Landroidx/lifecycle/LifecycleOwner;)V

    .line 78
    move-object p1, v2

    check-cast p1, Lcom/facebook/react/bridge/ReactContext;

    const-class v2, Lcom/reactnativestripesdk/StripeSdkModule;

    invoke-virtual {p1, v2}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p1

    check-cast p1, Lcom/reactnativestripesdk/StripeSdkModule;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/reactnativestripesdk/StripeSdkModule;->getComposeCompatView$stripe_stripe_react_native_release()Lcom/reactnativestripesdk/StripeAbstractComposeView$CompatView;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 79
    check-cast p1, Landroid/view/View;

    invoke-static {p1}, Landroidx/compose/ui/platform/WindowRecomposer_androidKt;->findViewTreeCompositionContext(Landroid/view/View;)Landroidx/compose/runtime/CompositionContext;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/reactnativestripesdk/StripeAbstractComposeView;->setParentCompositionContext(Landroidx/compose/runtime/CompositionContext;)V

    .line 80
    invoke-static {p1}, Landroidx/savedstate/ViewTreeSavedStateRegistryOwner;->get(Landroid/view/View;)Landroidx/savedstate/SavedStateRegistryOwner;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/savedstate/ViewTreeSavedStateRegistryOwner;->set(Landroid/view/View;Landroidx/savedstate/SavedStateRegistryOwner;)V

    .line 81
    invoke-static {p1}, Landroidx/lifecycle/ViewTreeViewModelStoreOwner;->get(Landroid/view/View;)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object p1

    invoke-static {v0, p1}, Landroidx/lifecycle/ViewTreeViewModelStoreOwner;->set(Landroid/view/View;Landroidx/lifecycle/ViewModelStoreOwner;)V

    :cond_0
    return-void
.end method

.method public static final synthetic access$getLifecycleRegistry$p(Lcom/reactnativestripesdk/StripeAbstractComposeView;)Landroidx/lifecycle/LifecycleRegistry;
    .locals 0

    .line 36
    iget-object p0, p0, Lcom/reactnativestripesdk/StripeAbstractComposeView;->lifecycleRegistry:Landroidx/lifecycle/LifecycleRegistry;

    return-object p0
.end method


# virtual methods
.method public final handleOnDropViewInstance()V
    .locals 2

    .line 111
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeAbstractComposeView;->lifecycleRegistry:Landroidx/lifecycle/LifecycleRegistry;

    sget-object v1, Landroidx/lifecycle/Lifecycle$Event;->ON_DESTROY:Landroidx/lifecycle/Lifecycle$Event;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleRegistry;->handleLifecycleEvent(Landroidx/lifecycle/Lifecycle$Event;)V

    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 3

    .line 86
    invoke-super {p0}, Landroidx/compose/ui/platform/AbstractComposeView;->onAttachedToWindow()V

    .line 88
    iget-boolean v0, p0, Lcom/reactnativestripesdk/StripeAbstractComposeView;->isLifecycleSetup:Z

    if-eqz v0, :cond_0

    goto :goto_2

    .line 92
    :cond_0
    invoke-virtual {p0}, Lcom/reactnativestripesdk/StripeAbstractComposeView;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v1, v0, Lcom/facebook/react/bridge/ReactContext;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v2

    :goto_1
    instance-of v1, v0, Landroidx/lifecycle/LifecycleOwner;

    if-eqz v1, :cond_3

    move-object v2, v0

    check-cast v2, Landroidx/lifecycle/LifecycleOwner;

    :cond_3
    if-eqz v2, :cond_4

    const/4 v0, 0x1

    .line 93
    iput-boolean v0, p0, Lcom/reactnativestripesdk/StripeAbstractComposeView;->isLifecycleSetup:Z

    .line 96
    invoke-interface {v2}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object v0

    .line 97
    new-instance v1, Lcom/reactnativestripesdk/StripeAbstractComposeView$onAttachedToWindow$1$1;

    invoke-direct {v1, p0}, Lcom/reactnativestripesdk/StripeAbstractComposeView$onAttachedToWindow$1$1;-><init>(Lcom/reactnativestripesdk/StripeAbstractComposeView;)V

    check-cast v1, Landroidx/lifecycle/LifecycleObserver;

    .line 96
    invoke-virtual {v0, v1}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    :cond_4
    :goto_2
    return-void
.end method
