.class public final Lcom/reactnativestripesdk/AuBECSDebitFormViewManager;
.super Lcom/facebook/react/uimanager/SimpleViewManager;
.source "AuBECSDebitFormViewManager.kt"

# interfaces
.implements Lcom/facebook/react/viewmanagers/AuBECSDebitFormManagerInterface;


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "AuBECSDebitForm"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativestripesdk/AuBECSDebitFormViewManager$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/SimpleViewManager<",
        "Lcom/reactnativestripesdk/AuBECSDebitFormView;",
        ">;",
        "Lcom/facebook/react/viewmanagers/AuBECSDebitFormManagerInterface<",
        "Lcom/reactnativestripesdk/AuBECSDebitFormView;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \u00192\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0019B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\t\u001a\u00020\nH\u0016J$\u0010\u000b\u001a\u001e\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00020\u0002\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\u0014\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0008\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0017J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0014R*\u0010\u0006\u001a\u001e\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00020\u0002\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/reactnativestripesdk/AuBECSDebitFormViewManager;",
        "Lcom/facebook/react/uimanager/SimpleViewManager;",
        "Lcom/reactnativestripesdk/AuBECSDebitFormView;",
        "Lcom/facebook/react/viewmanagers/AuBECSDebitFormManagerInterface;",
        "<init>",
        "()V",
        "delegate",
        "Lcom/facebook/react/viewmanagers/AuBECSDebitFormManagerDelegate;",
        "kotlin.jvm.PlatformType",
        "getName",
        "",
        "getDelegate",
        "getExportedCustomDirectEventTypeConstants",
        "",
        "",
        "setCompanyName",
        "",
        "view",
        "name",
        "setFormStyle",
        "style",
        "Lcom/facebook/react/bridge/Dynamic;",
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

.field public static final Companion:Lcom/reactnativestripesdk/AuBECSDebitFormViewManager$Companion;

.field public static final REACT_CLASS:Ljava/lang/String; = "AuBECSDebitForm"


# instance fields
.field private final delegate:Lcom/facebook/react/viewmanagers/AuBECSDebitFormManagerDelegate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/react/viewmanagers/AuBECSDebitFormManagerDelegate<",
            "Lcom/reactnativestripesdk/AuBECSDebitFormView;",
            "Lcom/reactnativestripesdk/AuBECSDebitFormViewManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/reactnativestripesdk/AuBECSDebitFormViewManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/reactnativestripesdk/AuBECSDebitFormViewManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/reactnativestripesdk/AuBECSDebitFormViewManager;->Companion:Lcom/reactnativestripesdk/AuBECSDebitFormViewManager$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/reactnativestripesdk/AuBECSDebitFormViewManager;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 14
    invoke-direct {p0}, Lcom/facebook/react/uimanager/SimpleViewManager;-><init>()V

    .line 16
    new-instance v0, Lcom/facebook/react/viewmanagers/AuBECSDebitFormManagerDelegate;

    move-object v1, p0

    check-cast v1, Lcom/facebook/react/uimanager/BaseViewManager;

    invoke-direct {v0, v1}, Lcom/facebook/react/viewmanagers/AuBECSDebitFormManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

    iput-object v0, p0, Lcom/reactnativestripesdk/AuBECSDebitFormViewManager;->delegate:Lcom/facebook/react/viewmanagers/AuBECSDebitFormManagerDelegate;

    return-void
.end method


# virtual methods
.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/View;
    .locals 0

    .line 12
    invoke-virtual {p0, p1}, Lcom/reactnativestripesdk/AuBECSDebitFormViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/reactnativestripesdk/AuBECSDebitFormView;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/reactnativestripesdk/AuBECSDebitFormView;
    .locals 1

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    new-instance v0, Lcom/reactnativestripesdk/AuBECSDebitFormView;

    invoke-direct {v0, p1}, Lcom/reactnativestripesdk/AuBECSDebitFormView;-><init>(Lcom/facebook/react/uimanager/ThemedReactContext;)V

    return-object v0
.end method

.method public bridge synthetic getDelegate()Lcom/facebook/react/uimanager/ViewManagerDelegate;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/reactnativestripesdk/AuBECSDebitFormViewManager;->getDelegate()Lcom/facebook/react/viewmanagers/AuBECSDebitFormManagerDelegate;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/uimanager/ViewManagerDelegate;

    return-object v0
.end method

.method protected getDelegate()Lcom/facebook/react/viewmanagers/AuBECSDebitFormManagerDelegate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/viewmanagers/AuBECSDebitFormManagerDelegate<",
            "Lcom/reactnativestripesdk/AuBECSDebitFormView;",
            "Lcom/reactnativestripesdk/AuBECSDebitFormViewManager;",
            ">;"
        }
    .end annotation

    .line 20
    iget-object v0, p0, Lcom/reactnativestripesdk/AuBECSDebitFormViewManager;->delegate:Lcom/facebook/react/viewmanagers/AuBECSDebitFormManagerDelegate;

    return-object v0
.end method

.method public getExportedCustomDirectEventTypeConstants()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 24
    new-array v1, v0, [Lkotlin/Pair;

    .line 25
    new-array v0, v0, [Lkotlin/Pair;

    const-string v2, "registrationName"

    const-string v3, "onCompleteAction"

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v0, v3

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mutableMapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 24
    const-string v2, "topCompleteAction"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v1, v3

    .line 23
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mutableMapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 18
    const-string v0, "AuBECSDebitForm"

    return-object v0
.end method

.method public bridge synthetic setCompanyName(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 12
    check-cast p1, Lcom/reactnativestripesdk/AuBECSDebitFormView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/AuBECSDebitFormViewManager;->setCompanyName(Lcom/reactnativestripesdk/AuBECSDebitFormView;Ljava/lang/String;)V

    return-void
.end method

.method public setCompanyName(Lcom/reactnativestripesdk/AuBECSDebitFormView;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "companyName"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/AuBECSDebitFormView;->setCompanyName(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setFormStyle(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 12
    check-cast p1, Lcom/reactnativestripesdk/AuBECSDebitFormView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/AuBECSDebitFormViewManager;->setFormStyle(Lcom/reactnativestripesdk/AuBECSDebitFormView;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setFormStyle(Lcom/reactnativestripesdk/AuBECSDebitFormView;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "formStyle"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-static {p2}, Lcom/reactnativestripesdk/utils/ExtensionsKt;->asMapOrNull(Lcom/facebook/react/bridge/Dynamic;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/AuBECSDebitFormView;->setFormStyle(Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method
