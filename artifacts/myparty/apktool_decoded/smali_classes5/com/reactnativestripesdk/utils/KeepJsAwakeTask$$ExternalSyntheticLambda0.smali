.class public final synthetic Lcom/reactnativestripesdk/utils/KeepJsAwakeTask$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;

.field public final synthetic f$1:Lcom/facebook/react/jstasks/HeadlessJsTaskContext;


# direct methods
.method public synthetic constructor <init>(Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;Lcom/facebook/react/jstasks/HeadlessJsTaskContext;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask$$ExternalSyntheticLambda0;->f$0:Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;

    iput-object p2, p0, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask$$ExternalSyntheticLambda0;->f$1:Lcom/facebook/react/jstasks/HeadlessJsTaskContext;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask$$ExternalSyntheticLambda0;->f$0:Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;

    iget-object v1, p0, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask$$ExternalSyntheticLambda0;->f$1:Lcom/facebook/react/jstasks/HeadlessJsTaskContext;

    invoke-static {v0, v1}, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;->$r8$lambda$UFtiLgAch7vQxTEuI0BQC_dTKzw(Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;Lcom/facebook/react/jstasks/HeadlessJsTaskContext;)V

    return-void
.end method
