.class public final synthetic Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda7;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Ljava/lang/String;

.field public final synthetic f$1:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda7;->f$0:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda7;->f$1:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda7;->f$0:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda7;->f$1:Z

    check-cast p1, Lcom/stripe/android/link/LinkControllerInteractor$State;

    invoke-static {v0, v1, p1}, Lcom/stripe/android/link/LinkControllerInteractor;->$r8$lambda$UlNM1EEEi5_gWyCXcaPpbwFH78M(Ljava/lang/String;ZLcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkControllerInteractor$State;

    move-result-object p1

    return-object p1
.end method
