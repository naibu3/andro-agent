.class public final Lcom/reactnativestripesdk/StripeAbstractComposeView$lifecycleOwner$1;
.super Ljava/lang/Object;
.source "StripeAbstractComposeView.kt"

# interfaces
.implements Landroidx/lifecycle/LifecycleOwner;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativestripesdk/StripeAbstractComposeView;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "com/reactnativestripesdk/StripeAbstractComposeView$lifecycleOwner$1",
        "Landroidx/lifecycle/LifecycleOwner;",
        "lifecycle",
        "Landroidx/lifecycle/Lifecycle;",
        "getLifecycle",
        "()Landroidx/lifecycle/Lifecycle;",
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


# instance fields
.field final synthetic this$0:Lcom/reactnativestripesdk/StripeAbstractComposeView;


# direct methods
.method constructor <init>(Lcom/reactnativestripesdk/StripeAbstractComposeView;)V
    .locals 0

    iput-object p1, p0, Lcom/reactnativestripesdk/StripeAbstractComposeView$lifecycleOwner$1;->this$0:Lcom/reactnativestripesdk/StripeAbstractComposeView;

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getLifecycle()Landroidx/lifecycle/Lifecycle;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeAbstractComposeView$lifecycleOwner$1;->this$0:Lcom/reactnativestripesdk/StripeAbstractComposeView;

    invoke-static {v0}, Lcom/reactnativestripesdk/StripeAbstractComposeView;->access$getLifecycleRegistry$p(Lcom/reactnativestripesdk/StripeAbstractComposeView;)Landroidx/lifecycle/LifecycleRegistry;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/Lifecycle;

    return-object v0
.end method
