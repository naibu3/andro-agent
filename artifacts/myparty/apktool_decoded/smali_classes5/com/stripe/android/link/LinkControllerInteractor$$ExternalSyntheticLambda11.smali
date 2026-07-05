.class public final synthetic Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda11;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/link/LinkControllerInteractor;

.field public final synthetic f$1:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/link/LinkControllerInteractor;Landroid/content/Context;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda11;->f$0:Lcom/stripe/android/link/LinkControllerInteractor;

    iput-object p2, p0, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda11;->f$1:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda11;->f$0:Lcom/stripe/android/link/LinkControllerInteractor;

    iget-object v1, p0, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda11;->f$1:Landroid/content/Context;

    check-cast p1, Lcom/stripe/android/link/LinkController$LinkAccount;

    check-cast p2, Lcom/stripe/android/link/LinkControllerInteractor$State;

    invoke-static {v0, v1, p1, p2}, Lcom/stripe/android/link/LinkControllerInteractor;->$r8$lambda$cxrGiB8DLrrleU2uAT642EXLhvE(Lcom/stripe/android/link/LinkControllerInteractor;Landroid/content/Context;Lcom/stripe/android/link/LinkController$LinkAccount;Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkController$State;

    move-result-object p1

    return-object p1
.end method
