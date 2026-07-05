.class public final synthetic Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda6;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/link/injection/LinkComponent;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/link/injection/LinkComponent;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda6;->f$0:Lcom/stripe/android/link/injection/LinkComponent;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda6;->f$0:Lcom/stripe/android/link/injection/LinkComponent;

    check-cast p1, Lcom/stripe/android/link/LinkControllerInteractor$State;

    invoke-static {v0, p1}, Lcom/stripe/android/link/LinkControllerInteractor;->$r8$lambda$BJu-PL78ApESxfawc8b90YUvzg8(Lcom/stripe/android/link/injection/LinkComponent;Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkControllerInteractor$State;

    move-result-object p1

    return-object p1
.end method
