.class public final synthetic Lcom/reactnativestripesdk/StripeSdkModule$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lcom/reactnativestripesdk/StripeSdkModule;

.field public final synthetic f$1:Lcom/facebook/react/bridge/Promise;


# direct methods
.method public synthetic constructor <init>(Lcom/reactnativestripesdk/StripeSdkModule;Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/reactnativestripesdk/StripeSdkModule$$ExternalSyntheticLambda2;->f$0:Lcom/reactnativestripesdk/StripeSdkModule;

    iput-object p2, p0, Lcom/reactnativestripesdk/StripeSdkModule$$ExternalSyntheticLambda2;->f$1:Lcom/facebook/react/bridge/Promise;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule$$ExternalSyntheticLambda2;->f$0:Lcom/reactnativestripesdk/StripeSdkModule;

    iget-object v1, p0, Lcom/reactnativestripesdk/StripeSdkModule$$ExternalSyntheticLambda2;->f$1:Lcom/facebook/react/bridge/Promise;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lcom/facebook/react/bridge/WritableMap;

    check-cast p3, Lcom/facebook/react/bridge/WritableMap;

    invoke-static {v0, v1, p1, p2, p3}, Lcom/reactnativestripesdk/StripeSdkModule;->$r8$lambda$mwD6Rd5mr-mxSYlTYhtSZb26HTM(Lcom/reactnativestripesdk/StripeSdkModule;Lcom/facebook/react/bridge/Promise;ZLcom/facebook/react/bridge/WritableMap;Lcom/facebook/react/bridge/WritableMap;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
