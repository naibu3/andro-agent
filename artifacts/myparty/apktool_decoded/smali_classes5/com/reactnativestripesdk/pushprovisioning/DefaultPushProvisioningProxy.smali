.class public final Lcom/reactnativestripesdk/pushprovisioning/DefaultPushProvisioningProxy;
.super Ljava/lang/Object;
.source "PushProvisioningProxy.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/reactnativestripesdk/pushprovisioning/DefaultPushProvisioningProxy;",
        "",
        "<init>",
        "()V",
        "beginPushProvisioning",
        "",
        "activity",
        "Landroid/app/Activity;",
        "description",
        "",
        "provider",
        "Lcom/reactnativestripesdk/pushprovisioning/EphemeralKeyProvider;",
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


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final beginPushProvisioning(Landroid/app/Activity;Ljava/lang/String;Lcom/reactnativestripesdk/pushprovisioning/EphemeralKeyProvider;)V
    .locals 3

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "provider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    new-instance v0, Lcom/stripe/android/pushProvisioning/PushProvisioningActivityStarter;

    .line 142
    new-instance v1, Lcom/stripe/android/pushProvisioning/PushProvisioningActivityStarter$Args;

    check-cast p3, Lcom/stripe/android/pushProvisioning/PushProvisioningEphemeralKeyProvider;

    const/4 v2, 0x0

    invoke-direct {v1, p2, p3, v2}, Lcom/stripe/android/pushProvisioning/PushProvisioningActivityStarter$Args;-><init>(Ljava/lang/String;Lcom/stripe/android/pushProvisioning/PushProvisioningEphemeralKeyProvider;Z)V

    .line 140
    invoke-direct {v0, p1, v1}, Lcom/stripe/android/pushProvisioning/PushProvisioningActivityStarter;-><init>(Landroid/app/Activity;Lcom/stripe/android/pushProvisioning/PushProvisioningActivityStarter$Args;)V

    .line 143
    invoke-virtual {v0}, Lcom/stripe/android/pushProvisioning/PushProvisioningActivityStarter;->startForResult()V

    return-void
.end method
