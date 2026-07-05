.class public final Lcom/reactnativestripesdk/CustomPaymentMethodActivity;
.super Lcom/facebook/react/ReactActivity;
.source "CustomPaymentMethodActivity.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativestripesdk/CustomPaymentMethodActivity$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\n\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0014J\u0012\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u000e\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u0016J\u0008\u0010\u000f\u001a\u00020\u0005H\u0014J\u0008\u0010\u0010\u001a\u00020\u0005H\u0016J\u0008\u0010\u0011\u001a\u00020\u0005H\u0014\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/reactnativestripesdk/CustomPaymentMethodActivity;",
        "Lcom/facebook/react/ReactActivity;",
        "<init>",
        "()V",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "getMainComponentName",
        "",
        "onTouchEvent",
        "",
        "event",
        "Landroid/view/MotionEvent;",
        "dispatchTouchEvent",
        "onResume",
        "finish",
        "onStart",
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

.field public static final Companion:Lcom/reactnativestripesdk/CustomPaymentMethodActivity$Companion;

.field private static volatile currentActivityRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/reactnativestripesdk/CustomPaymentMethodActivity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/reactnativestripesdk/CustomPaymentMethodActivity$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/reactnativestripesdk/CustomPaymentMethodActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/reactnativestripesdk/CustomPaymentMethodActivity;->Companion:Lcom/reactnativestripesdk/CustomPaymentMethodActivity$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/reactnativestripesdk/CustomPaymentMethodActivity;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/facebook/react/ReactActivity;-><init>()V

    return-void
.end method

.method public static final synthetic access$getCurrentActivityRef$cp()Ljava/lang/ref/WeakReference;
    .locals 1

    .line 22
    sget-object v0, Lcom/reactnativestripesdk/CustomPaymentMethodActivity;->currentActivityRef:Ljava/lang/ref/WeakReference;

    return-object v0
.end method


# virtual methods
.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 44
    invoke-super {p0, p1}, Lcom/facebook/react/ReactActivity;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public finish()V
    .locals 2

    .line 54
    invoke-super {p0}, Lcom/facebook/react/ReactActivity;->finish()V

    const/4 v0, 0x0

    .line 56
    invoke-virtual {p0, v0, v0}, Lcom/reactnativestripesdk/CustomPaymentMethodActivity;->overridePendingTransition(II)V

    .line 59
    sget-object v0, Lcom/reactnativestripesdk/CustomPaymentMethodActivity;->currentActivityRef:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/reactnativestripesdk/CustomPaymentMethodActivity;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 60
    sput-object v1, Lcom/reactnativestripesdk/CustomPaymentMethodActivity;->currentActivityRef:Ljava/lang/ref/WeakReference;

    :cond_1
    return-void
.end method

.method protected getMainComponentName()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x0

    .line 25
    invoke-virtual {p0, v0, v0}, Lcom/reactnativestripesdk/CustomPaymentMethodActivity;->overridePendingTransition(II)V

    .line 26
    invoke-super {p0, p1}, Lcom/facebook/react/ReactActivity;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method protected onResume()V
    .locals 1

    .line 48
    invoke-super {p0}, Lcom/facebook/react/ReactActivity;->onResume()V

    .line 50
    invoke-virtual {p0}, Lcom/reactnativestripesdk/CustomPaymentMethodActivity;->getCurrentFocus()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    :cond_0
    return-void
.end method

.method protected onStart()V
    .locals 1

    .line 78
    invoke-super {p0}, Lcom/facebook/react/ReactActivity;->onStart()V

    .line 79
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/reactnativestripesdk/CustomPaymentMethodActivity;->currentActivityRef:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 39
    invoke-super {p0, p1}, Lcom/facebook/react/ReactActivity;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
