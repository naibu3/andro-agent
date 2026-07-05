.class public final synthetic Lcom/stripe/android/link/LinkActivity$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/link/LinkActivityViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/link/LinkActivityViewModel;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivity$$ExternalSyntheticLambda1;->f$0:Lcom/stripe/android/link/LinkActivityViewModel;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivity$$ExternalSyntheticLambda1;->f$0:Lcom/stripe/android/link/LinkActivityViewModel;

    check-cast p1, Lcom/stripe/android/link/LinkActivityResult;

    invoke-static {v0, p1}, Lcom/stripe/android/link/LinkActivity;->$r8$lambda$sOfHXjg-Gja70L6nHdLtdONjs_0(Lcom/stripe/android/link/LinkActivityViewModel;Lcom/stripe/android/link/LinkActivityResult;)V

    return-void
.end method
