.class public final synthetic Lcom/reactnativestripesdk/pushprovisioning/TapAndPayProxy$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic f$0:Ljava/lang/String;

.field public final synthetic f$1:Lkotlin/jvm/functions/Function3;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/reactnativestripesdk/pushprovisioning/TapAndPayProxy$$ExternalSyntheticLambda0;->f$0:Ljava/lang/String;

    iput-object p2, p0, Lcom/reactnativestripesdk/pushprovisioning/TapAndPayProxy$$ExternalSyntheticLambda0;->f$1:Lkotlin/jvm/functions/Function3;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/reactnativestripesdk/pushprovisioning/TapAndPayProxy$$ExternalSyntheticLambda0;->f$0:Ljava/lang/String;

    iget-object v1, p0, Lcom/reactnativestripesdk/pushprovisioning/TapAndPayProxy$$ExternalSyntheticLambda0;->f$1:Lkotlin/jvm/functions/Function3;

    invoke-static {v0, v1, p1}, Lcom/reactnativestripesdk/pushprovisioning/TapAndPayProxy;->$r8$lambda$4PK6Ztk7fBUZ3sh3EEan9u-PtB0(Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
