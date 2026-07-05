.class public final Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy$createActivityEventListener$listener$1;
.super Lcom/facebook/react/bridge/BaseActivityEventListener;
.source "PushProvisioningProxy.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;->createActivityEventListener(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPushProvisioningProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushProvisioningProxy.kt\ncom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy$createActivityEventListener$listener$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,146:1\n1#2:147\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0010\t\u001a\u0004\u0018\u00010\nH\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "com/reactnativestripesdk/pushprovisioning/PushProvisioningProxy$createActivityEventListener$listener$1",
        "Lcom/facebook/react/bridge/BaseActivityEventListener;",
        "onActivityResult",
        "",
        "activity",
        "Landroid/app/Activity;",
        "requestCode",
        "",
        "resultCode",
        "data",
        "Landroid/content/Intent;",
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
.field final synthetic $view:Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;


# direct methods
.method constructor <init>(Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;)V
    .locals 0

    iput-object p1, p0, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy$createActivityEventListener$listener$1;->$view:Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;

    .line 78
    invoke-direct {p0}, Lcom/facebook/react/bridge/BaseActivityEventListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)V
    .locals 9

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    invoke-super {p0, p1, p2, p3, p4}, Lcom/facebook/react/bridge/BaseActivityEventListener;->onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)V

    const/16 v0, 0x1f40

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-eq p2, v0, :cond_2

    const p1, 0x1631d

    if-eq p2, p1, :cond_0

    goto :goto_1

    .line 87
    :cond_0
    iget-object p1, p0, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy$createActivityEventListener$listener$1;->$view:Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;

    if-ne p3, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 91
    const-string v3, "Failed"

    const-string v4, "Failed to verify identity."

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/reactnativestripesdk/utils/ErrorsKt;->mapError(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v1

    .line 87
    :goto_0
    invoke-virtual {p1, v1}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;->dispatchEvent(Lcom/facebook/react/bridge/WritableMap;)V

    return-void

    :cond_2
    if-eq p3, v2, :cond_5

    const/16 p1, 0x1f4

    if-eq p3, p1, :cond_3

    goto :goto_1

    :cond_3
    if-eqz p4, :cond_4

    .line 119
    iget-object p1, p0, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy$createActivityEventListener$listener$1;->$view:Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;

    .line 121
    invoke-static {p4}, Lcom/stripe/android/pushProvisioning/PushProvisioningActivityStarter$Error;->fromIntent(Landroid/content/Intent;)Lcom/stripe/android/pushProvisioning/PushProvisioningActivityStarter$Error;

    move-result-object p2

    const-string p3, "fromIntent(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    iget-object p3, p2, Lcom/stripe/android/pushProvisioning/PushProvisioningActivityStarter$Error;->code:Lcom/stripe/android/pushProvisioning/PushProvisioningActivity$g;

    invoke-virtual {p3}, Lcom/stripe/android/pushProvisioning/PushProvisioningActivity$g;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p2, Lcom/stripe/android/pushProvisioning/PushProvisioningActivityStarter$Error;->message:Ljava/lang/String;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/reactnativestripesdk/utils/ErrorsKt;->mapError(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p2

    .line 122
    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;->dispatchEvent(Lcom/facebook/react/bridge/WritableMap;)V

    :cond_4
    :goto_1
    return-void

    .line 96
    :cond_5
    invoke-static {}, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;->access$getTokenRequiringTokenization$p()Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p2

    if-eqz p2, :cond_8

    iget-object p3, p0, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy$createActivityEventListener$listener$1;->$view:Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;

    .line 97
    const-string p4, "id"

    invoke-interface {p2, p4}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    .line 98
    move-object v0, p4

    check-cast v0, Ljava/lang/CharSequence;

    if-eqz v0, :cond_7

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_2

    .line 110
    :cond_6
    sget-object p3, Lcom/reactnativestripesdk/pushprovisioning/TapAndPayProxy;->INSTANCE:Lcom/reactnativestripesdk/pushprovisioning/TapAndPayProxy;

    .line 114
    invoke-static {}, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;->access$getDescription$p()Ljava/lang/String;

    move-result-object v0

    .line 110
    invoke-virtual {p3, p1, p4, p2, v0}, Lcom/reactnativestripesdk/pushprovisioning/TapAndPayProxy;->tokenize(Landroid/app/Activity;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)V

    return-void

    :cond_7
    :goto_2
    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 100
    const-string v1, "Failed"

    const-string v2, "Token object passed to `<AddToWalletButton />` is missing the `id` field."

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/reactnativestripesdk/utils/ErrorsKt;->mapError(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 99
    invoke-virtual {p3, p1}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;->dispatchEvent(Lcom/facebook/react/bridge/WritableMap;)V

    return-void

    .line 117
    :cond_8
    iget-object p1, p0, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy$createActivityEventListener$listener$1;->$view:Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;

    move-object p2, p0

    check-cast p2, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy$createActivityEventListener$listener$1;

    invoke-virtual {p1, v1}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;->dispatchEvent(Lcom/facebook/react/bridge/WritableMap;)V

    return-void
.end method
