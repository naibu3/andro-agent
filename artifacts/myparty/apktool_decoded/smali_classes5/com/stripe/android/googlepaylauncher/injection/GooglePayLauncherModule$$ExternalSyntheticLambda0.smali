.class public final synthetic Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Landroid/content/Context;

.field public final synthetic f$1:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

.field public final synthetic f$2:Lcom/stripe/android/core/Logger;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/core/Logger;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule$$ExternalSyntheticLambda0;->f$0:Landroid/content/Context;

    iput-object p2, p0, Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    iput-object p3, p0, Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule$$ExternalSyntheticLambda0;->f$2:Lcom/stripe/android/core/Logger;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule$$ExternalSyntheticLambda0;->f$0:Landroid/content/Context;

    iget-object v1, p0, Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    iget-object v2, p0, Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule$$ExternalSyntheticLambda0;->f$2:Lcom/stripe/android/core/Logger;

    check-cast p1, Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

    invoke-static {v0, v1, v2, p1}, Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule;->$r8$lambda$RC32aBNdfMCJok4PkUNBgH8sb6U(Landroid/content/Context;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/core/Logger;Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;)Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;

    move-result-object p1

    return-object p1
.end method
