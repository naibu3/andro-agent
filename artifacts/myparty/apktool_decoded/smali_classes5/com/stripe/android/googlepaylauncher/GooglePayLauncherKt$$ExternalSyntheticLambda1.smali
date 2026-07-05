.class public final synthetic Lcom/stripe/android/googlepaylauncher/GooglePayLauncherKt$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Landroid/content/Context;

.field public final synthetic f$1:Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherKt$$ExternalSyntheticLambda1;->f$0:Landroid/content/Context;

    iput-object p2, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherKt$$ExternalSyntheticLambda1;->f$1:Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherKt$$ExternalSyntheticLambda1;->f$0:Landroid/content/Context;

    iget-object v1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherKt$$ExternalSyntheticLambda1;->f$1:Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    check-cast p1, Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

    invoke-static {v0, v1, p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherKt;->$r8$lambda$Q_iOe-JArGcKKRIKjDkeVm6-hrE(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;)Lcom/stripe/android/googlepaylauncher/GooglePayRepository;

    move-result-object p1

    return-object p1
.end method
