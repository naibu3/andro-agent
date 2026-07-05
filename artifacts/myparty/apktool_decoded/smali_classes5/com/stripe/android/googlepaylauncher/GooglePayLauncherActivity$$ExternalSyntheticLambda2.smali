.class public final synthetic Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$$ExternalSyntheticLambda2;->f$0:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$$ExternalSyntheticLambda2;->f$0:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;

    check-cast p1, Lcom/google/android/gms/wallet/contract/ApiTaskResult;

    invoke-static {v0, p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->$r8$lambda$_qUgfznXVJOTcCNWIJlSEyalNGU(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;Lcom/google/android/gms/wallet/contract/ApiTaskResult;)V

    return-void
.end method
