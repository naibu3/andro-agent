.class public final synthetic Lcom/stripe/android/payments/StripeBrowserLauncherActivity$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/payments/StripeBrowserLauncherActivity;

.field public final synthetic f$1:Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/payments/StripeBrowserLauncherActivity;Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/payments/StripeBrowserLauncherActivity$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/payments/StripeBrowserLauncherActivity;

    iput-object p2, p0, Lcom/stripe/android/payments/StripeBrowserLauncherActivity$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/stripe/android/payments/StripeBrowserLauncherActivity$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/payments/StripeBrowserLauncherActivity;

    iget-object v1, p0, Lcom/stripe/android/payments/StripeBrowserLauncherActivity$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    check-cast p1, Landroidx/activity/result/ActivityResult;

    invoke-static {v0, v1, p1}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->$r8$lambda$LWAcU6wfsPjE4-5BhQxaEYNuVjM(Lcom/stripe/android/payments/StripeBrowserLauncherActivity;Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;Landroidx/activity/result/ActivityResult;)V

    return-void
.end method
