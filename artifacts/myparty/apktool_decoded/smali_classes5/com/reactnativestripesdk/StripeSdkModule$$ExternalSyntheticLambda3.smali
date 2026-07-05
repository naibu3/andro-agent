.class public final synthetic Lcom/reactnativestripesdk/StripeSdkModule$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/facebook/react/bridge/Promise;

.field public final synthetic f$1:Z

.field public final synthetic f$2:Lcom/reactnativestripesdk/StripeSdkModule;

.field public final synthetic f$3:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/bridge/Promise;ZLcom/reactnativestripesdk/StripeSdkModule;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/reactnativestripesdk/StripeSdkModule$$ExternalSyntheticLambda3;->f$0:Lcom/facebook/react/bridge/Promise;

    iput-boolean p2, p0, Lcom/reactnativestripesdk/StripeSdkModule$$ExternalSyntheticLambda3;->f$1:Z

    iput-object p3, p0, Lcom/reactnativestripesdk/StripeSdkModule$$ExternalSyntheticLambda3;->f$2:Lcom/reactnativestripesdk/StripeSdkModule;

    iput-object p4, p0, Lcom/reactnativestripesdk/StripeSdkModule$$ExternalSyntheticLambda3;->f$3:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule$$ExternalSyntheticLambda3;->f$0:Lcom/facebook/react/bridge/Promise;

    iget-boolean v1, p0, Lcom/reactnativestripesdk/StripeSdkModule$$ExternalSyntheticLambda3;->f$1:Z

    iget-object v2, p0, Lcom/reactnativestripesdk/StripeSdkModule$$ExternalSyntheticLambda3;->f$2:Lcom/reactnativestripesdk/StripeSdkModule;

    iget-object v3, p0, Lcom/reactnativestripesdk/StripeSdkModule$$ExternalSyntheticLambda3;->f$3:Ljava/lang/String;

    move-object v4, p1

    check-cast v4, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;

    move-object v5, p2

    check-cast v5, Lcom/facebook/react/bridge/WritableMap;

    invoke-static/range {v0 .. v5}, Lcom/reactnativestripesdk/StripeSdkModule;->$r8$lambda$mZb1s5a_RxDXI72furORjOKbKLE(Lcom/facebook/react/bridge/Promise;ZLcom/reactnativestripesdk/StripeSdkModule;Ljava/lang/String;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;Lcom/facebook/react/bridge/WritableMap;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
