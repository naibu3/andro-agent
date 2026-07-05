.class public final Lcom/reactnativestripesdk/GooglePayButtonManager;
.super Lcom/facebook/react/uimanager/SimpleViewManager;
.source "GooglePayButtonManager.kt"

# interfaces
.implements Lcom/facebook/react/viewmanagers/GooglePayButtonManagerInterface;


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "GooglePayButton"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativestripesdk/GooglePayButtonManager$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/SimpleViewManager<",
        "Lcom/reactnativestripesdk/GooglePayButtonView;",
        ">;",
        "Lcom/facebook/react/viewmanagers/GooglePayButtonManagerInterface<",
        "Lcom/reactnativestripesdk/GooglePayButtonView;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u00192\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0019B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\t\u001a\u00020\nH\u0016J$\u0010\u000b\u001a\u001e\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00020\u0002\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\u0010\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0014J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0014H\u0017J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0014H\u0017R*\u0010\u0006\u001a\u001e\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00020\u0002\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/reactnativestripesdk/GooglePayButtonManager;",
        "Lcom/facebook/react/uimanager/SimpleViewManager;",
        "Lcom/reactnativestripesdk/GooglePayButtonView;",
        "Lcom/facebook/react/viewmanagers/GooglePayButtonManagerInterface;",
        "<init>",
        "()V",
        "delegate",
        "Lcom/facebook/react/viewmanagers/GooglePayButtonManagerDelegate;",
        "kotlin.jvm.PlatformType",
        "getName",
        "",
        "getDelegate",
        "createViewInstance",
        "reactContext",
        "Lcom/facebook/react/uimanager/ThemedReactContext;",
        "onAfterUpdateTransaction",
        "",
        "view",
        "setType",
        "buttonType",
        "",
        "setAppearance",
        "appearance",
        "setBorderRadius",
        "borderRadius",
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

.field public static final Companion:Lcom/reactnativestripesdk/GooglePayButtonManager$Companion;

.field public static final REACT_CLASS:Ljava/lang/String; = "GooglePayButton"


# instance fields
.field private final delegate:Lcom/facebook/react/viewmanagers/GooglePayButtonManagerDelegate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/react/viewmanagers/GooglePayButtonManagerDelegate<",
            "Lcom/reactnativestripesdk/GooglePayButtonView;",
            "Lcom/reactnativestripesdk/GooglePayButtonManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/reactnativestripesdk/GooglePayButtonManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/reactnativestripesdk/GooglePayButtonManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/reactnativestripesdk/GooglePayButtonManager;->Companion:Lcom/reactnativestripesdk/GooglePayButtonManager$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/reactnativestripesdk/GooglePayButtonManager;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 12
    invoke-direct {p0}, Lcom/facebook/react/uimanager/SimpleViewManager;-><init>()V

    .line 14
    new-instance v0, Lcom/facebook/react/viewmanagers/GooglePayButtonManagerDelegate;

    move-object v1, p0

    check-cast v1, Lcom/facebook/react/uimanager/BaseViewManager;

    invoke-direct {v0, v1}, Lcom/facebook/react/viewmanagers/GooglePayButtonManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

    iput-object v0, p0, Lcom/reactnativestripesdk/GooglePayButtonManager;->delegate:Lcom/facebook/react/viewmanagers/GooglePayButtonManagerDelegate;

    return-void
.end method


# virtual methods
.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/View;
    .locals 0

    .line 10
    invoke-virtual {p0, p1}, Lcom/reactnativestripesdk/GooglePayButtonManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/reactnativestripesdk/GooglePayButtonView;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/reactnativestripesdk/GooglePayButtonView;
    .locals 1

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    new-instance v0, Lcom/reactnativestripesdk/GooglePayButtonView;

    invoke-direct {v0, p1}, Lcom/reactnativestripesdk/GooglePayButtonView;-><init>(Lcom/facebook/react/uimanager/ThemedReactContext;)V

    return-object v0
.end method

.method public bridge synthetic getDelegate()Lcom/facebook/react/uimanager/ViewManagerDelegate;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/reactnativestripesdk/GooglePayButtonManager;->getDelegate()Lcom/facebook/react/viewmanagers/GooglePayButtonManagerDelegate;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/uimanager/ViewManagerDelegate;

    return-object v0
.end method

.method protected getDelegate()Lcom/facebook/react/viewmanagers/GooglePayButtonManagerDelegate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/viewmanagers/GooglePayButtonManagerDelegate<",
            "Lcom/reactnativestripesdk/GooglePayButtonView;",
            "Lcom/reactnativestripesdk/GooglePayButtonManager;",
            ">;"
        }
    .end annotation

    .line 18
    iget-object v0, p0, Lcom/reactnativestripesdk/GooglePayButtonManager;->delegate:Lcom/facebook/react/viewmanagers/GooglePayButtonManagerDelegate;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 16
    const-string v0, "GooglePayButton"

    return-object v0
.end method

.method public bridge synthetic onAfterUpdateTransaction(Landroid/view/View;)V
    .locals 0

    .line 10
    check-cast p1, Lcom/reactnativestripesdk/GooglePayButtonView;

    invoke-virtual {p0, p1}, Lcom/reactnativestripesdk/GooglePayButtonManager;->onAfterUpdateTransaction(Lcom/reactnativestripesdk/GooglePayButtonView;)V

    return-void
.end method

.method protected onAfterUpdateTransaction(Lcom/reactnativestripesdk/GooglePayButtonView;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    move-object v0, p1

    check-cast v0, Landroid/view/View;

    invoke-super {p0, v0}, Lcom/facebook/react/uimanager/SimpleViewManager;->onAfterUpdateTransaction(Landroid/view/View;)V

    .line 25
    invoke-virtual {p1}, Lcom/reactnativestripesdk/GooglePayButtonView;->initialize()V

    return-void
.end method

.method public bridge synthetic setAppearance(Landroid/view/View;I)V
    .locals 0

    .line 10
    check-cast p1, Lcom/reactnativestripesdk/GooglePayButtonView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/GooglePayButtonManager;->setAppearance(Lcom/reactnativestripesdk/GooglePayButtonView;I)V

    return-void
.end method

.method public setAppearance(Lcom/reactnativestripesdk/GooglePayButtonView;I)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "appearance"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/GooglePayButtonView;->setAppearance(I)V

    return-void
.end method

.method public bridge synthetic setBorderRadius(Landroid/view/View;I)V
    .locals 0

    .line 10
    check-cast p1, Lcom/reactnativestripesdk/GooglePayButtonView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/GooglePayButtonManager;->setBorderRadius(Lcom/reactnativestripesdk/GooglePayButtonView;I)V

    return-void
.end method

.method public setBorderRadius(Lcom/reactnativestripesdk/GooglePayButtonView;I)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "borderRadius"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/GooglePayButtonView;->setBorderRadius(I)V

    return-void
.end method

.method public bridge synthetic setType(Landroid/view/View;I)V
    .locals 0

    .line 10
    check-cast p1, Lcom/reactnativestripesdk/GooglePayButtonView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/GooglePayButtonManager;->setType(Lcom/reactnativestripesdk/GooglePayButtonView;I)V

    return-void
.end method

.method public setType(Lcom/reactnativestripesdk/GooglePayButtonView;I)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "type"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/GooglePayButtonView;->setType(I)V

    return-void
.end method
