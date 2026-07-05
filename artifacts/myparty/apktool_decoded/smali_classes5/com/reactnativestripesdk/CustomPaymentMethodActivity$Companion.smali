.class public final Lcom/reactnativestripesdk/CustomPaymentMethodActivity$Companion;
.super Ljava/lang/Object;
.source "CustomPaymentMethodActivity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/reactnativestripesdk/CustomPaymentMethodActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\u0008R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/reactnativestripesdk/CustomPaymentMethodActivity$Companion;",
        "",
        "<init>",
        "()V",
        "currentActivityRef",
        "Ljava/lang/ref/WeakReference;",
        "Lcom/reactnativestripesdk/CustomPaymentMethodActivity;",
        "finishCurrent",
        "",
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


# direct methods
.method public static synthetic $r8$lambda$jL4PzH8xLiD4az-2T-yA6kJaJ-s(Lcom/reactnativestripesdk/CustomPaymentMethodActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/reactnativestripesdk/CustomPaymentMethodActivity$Companion;->finishCurrent$lambda$1$lambda$0(Lcom/reactnativestripesdk/CustomPaymentMethodActivity;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/reactnativestripesdk/CustomPaymentMethodActivity$Companion;-><init>()V

    return-void
.end method

.method private static final finishCurrent$lambda$1$lambda$0(Lcom/reactnativestripesdk/CustomPaymentMethodActivity;)V
    .locals 0

    .line 71
    invoke-virtual {p0}, Lcom/reactnativestripesdk/CustomPaymentMethodActivity;->finish()V

    return-void
.end method


# virtual methods
.method public final finishCurrent()V
    .locals 2

    .line 69
    invoke-static {}, Lcom/reactnativestripesdk/CustomPaymentMethodActivity;->access$getCurrentActivityRef$cp()Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/reactnativestripesdk/CustomPaymentMethodActivity;

    if-eqz v0, :cond_0

    .line 70
    new-instance v1, Lcom/reactnativestripesdk/CustomPaymentMethodActivity$Companion$$ExternalSyntheticLambda0;

    invoke-direct {v1, v0}, Lcom/reactnativestripesdk/CustomPaymentMethodActivity$Companion$$ExternalSyntheticLambda0;-><init>(Lcom/reactnativestripesdk/CustomPaymentMethodActivity;)V

    invoke-virtual {v0, v1}, Lcom/reactnativestripesdk/CustomPaymentMethodActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
