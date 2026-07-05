.class public final Lowasp/sat/agoat/BioMetricAuthActivity$onCreate$1;
.super Landroidx/biometric/BiometricPrompt$AuthenticationCallback;
.source "BioMetricAuthActivity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lowasp/sat/agoat/BioMetricAuthActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\r\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0008\u0010\u0008\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "owasp/sat/agoat/BioMetricAuthActivity$onCreate$1",
        "Landroidx/biometric/BiometricPrompt$AuthenticationCallback;",
        "onAuthenticationError",
        "",
        "errorCode",
        "",
        "errString",
        "",
        "onAuthenticationFailed",
        "onAuthenticationSucceeded",
        "result",
        "Landroidx/biometric/BiometricPrompt$AuthenticationResult;",
        "app_debug"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $builder:Landroidx/appcompat/app/AlertDialog$Builder;

.field final synthetic this$0:Lowasp/sat/agoat/BioMetricAuthActivity;


# direct methods
.method public static synthetic $r8$lambda$0vlhdvBFq0NiLxYAiFf6YIa-VrI(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/BioMetricAuthActivity$onCreate$1;->onAuthenticationSucceeded$lambda$0(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic $r8$lambda$4lSgtYRgdRREhxR45aU8rDogS_g(Landroidx/appcompat/app/AlertDialog;)V
    .locals 0

    invoke-static {p0}, Lowasp/sat/agoat/BioMetricAuthActivity$onCreate$1;->onAuthenticationFailed$lambda$2(Landroidx/appcompat/app/AlertDialog;)V

    return-void
.end method

.method public static synthetic $r8$lambda$mkv7VY10AYwUZzAQaTzVoi77zY0(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/BioMetricAuthActivity$onCreate$1;->onAuthenticationFailed$lambda$1(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method constructor <init>(Landroidx/appcompat/app/AlertDialog$Builder;Lowasp/sat/agoat/BioMetricAuthActivity;)V
    .locals 0
    .param p1, "$builder"    # Landroidx/appcompat/app/AlertDialog$Builder;
    .param p2, "$receiver"    # Lowasp/sat/agoat/BioMetricAuthActivity;

    iput-object p1, p0, Lowasp/sat/agoat/BioMetricAuthActivity$onCreate$1;->$builder:Landroidx/appcompat/app/AlertDialog$Builder;

    iput-object p2, p0, Lowasp/sat/agoat/BioMetricAuthActivity$onCreate$1;->this$0:Lowasp/sat/agoat/BioMetricAuthActivity;

    .line 29
    invoke-direct {p0}, Landroidx/biometric/BiometricPrompt$AuthenticationCallback;-><init>()V

    return-void
.end method

.method private static final onAuthenticationFailed$lambda$1(Landroid/content/DialogInterface;I)V
    .locals 0
    .param p0, "dialog"    # Landroid/content/DialogInterface;

    .line 52
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 53
    return-void
.end method

.method private static final onAuthenticationFailed$lambda$2(Landroidx/appcompat/app/AlertDialog;)V
    .locals 1
    .param p0, "$dialog"    # Landroidx/appcompat/app/AlertDialog;

    const-string v0, "$dialog"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    invoke-virtual {p0}, Landroidx/appcompat/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 60
    invoke-virtual {p0}, Landroidx/appcompat/app/AlertDialog;->dismiss()V

    .line 62
    :cond_0
    return-void
.end method

.method private static final onAuthenticationSucceeded$lambda$0(Landroid/content/DialogInterface;I)V
    .locals 0
    .param p0, "dialog"    # Landroid/content/DialogInterface;

    .line 42
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 43
    return-void
.end method


# virtual methods
.method public onAuthenticationError(ILjava/lang/CharSequence;)V
    .locals 3
    .param p1, "errorCode"    # I
    .param p2, "errString"    # Ljava/lang/CharSequence;

    const-string v0, "errString"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-super {p0, p1, p2}, Landroidx/biometric/BiometricPrompt$AuthenticationCallback;->onAuthenticationError(ILjava/lang/CharSequence;)V

    .line 33
    iget-object v0, p0, Lowasp/sat/agoat/BioMetricAuthActivity$onCreate$1;->$builder:Landroidx/appcompat/app/AlertDialog$Builder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Authentication error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 34
    iget-object v0, p0, Lowasp/sat/agoat/BioMetricAuthActivity$onCreate$1;->this$0:Lowasp/sat/agoat/BioMetricAuthActivity;

    invoke-virtual {v0}, Lowasp/sat/agoat/BioMetricAuthActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 35
    return-void
.end method

.method public onAuthenticationFailed()V
    .locals 5

    .line 49
    invoke-super {p0}, Landroidx/biometric/BiometricPrompt$AuthenticationCallback;->onAuthenticationFailed()V

    .line 50
    iget-object v0, p0, Lowasp/sat/agoat/BioMetricAuthActivity$onCreate$1;->$builder:Landroidx/appcompat/app/AlertDialog$Builder;

    const-string v1, "Authentication failed"

    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 51
    iget-object v0, p0, Lowasp/sat/agoat/BioMetricAuthActivity$onCreate$1;->this$0:Lowasp/sat/agoat/BioMetricAuthActivity;

    invoke-virtual {v0}, Lowasp/sat/agoat/BioMetricAuthActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 52
    iget-object v0, p0, Lowasp/sat/agoat/BioMetricAuthActivity$onCreate$1;->$builder:Landroidx/appcompat/app/AlertDialog$Builder;

    const-string v1, "OK"

    check-cast v1, Ljava/lang/CharSequence;

    new-instance v2, Lowasp/sat/agoat/BioMetricAuthActivity$onCreate$1$$ExternalSyntheticLambda0;

    invoke-direct {v2}, Lowasp/sat/agoat/BioMetricAuthActivity$onCreate$1$$ExternalSyntheticLambda0;-><init>()V

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 54
    iget-object v0, p0, Lowasp/sat/agoat/BioMetricAuthActivity$onCreate$1;->$builder:Landroidx/appcompat/app/AlertDialog$Builder;

    invoke-virtual {v0}, Landroidx/appcompat/app/AlertDialog$Builder;->create()Landroidx/appcompat/app/AlertDialog;

    move-result-object v0

    const-string v1, "builder.create()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .local v0, "dialog":Landroidx/appcompat/app/AlertDialog;
    invoke-virtual {v0}, Landroidx/appcompat/app/AlertDialog;->show()V

    .line 58
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Lowasp/sat/agoat/BioMetricAuthActivity$onCreate$1$$ExternalSyntheticLambda1;

    invoke-direct {v2, v0}, Lowasp/sat/agoat/BioMetricAuthActivity$onCreate$1$$ExternalSyntheticLambda1;-><init>(Landroidx/appcompat/app/AlertDialog;)V

    .line 62
    nop

    .line 58
    const-wide/16 v3, 0xbb8

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 64
    return-void
.end method

.method public onAuthenticationSucceeded(Landroidx/biometric/BiometricPrompt$AuthenticationResult;)V
    .locals 3
    .param p1, "result"    # Landroidx/biometric/BiometricPrompt$AuthenticationResult;

    const-string/jumbo v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-super {p0, p1}, Landroidx/biometric/BiometricPrompt$AuthenticationCallback;->onAuthenticationSucceeded(Landroidx/biometric/BiometricPrompt$AuthenticationResult;)V

    .line 39
    iget-object v0, p0, Lowasp/sat/agoat/BioMetricAuthActivity$onCreate$1;->$builder:Landroidx/appcompat/app/AlertDialog$Builder;

    const-string v1, "Authentication succeeded!"

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 40
    iget-object v0, p0, Lowasp/sat/agoat/BioMetricAuthActivity$onCreate$1;->this$0:Lowasp/sat/agoat/BioMetricAuthActivity;

    invoke-virtual {v0}, Lowasp/sat/agoat/BioMetricAuthActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "Authentication succeeded! "

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 41
    iget-object v0, p0, Lowasp/sat/agoat/BioMetricAuthActivity$onCreate$1;->$builder:Landroidx/appcompat/app/AlertDialog$Builder;

    const-string v1, "OK"

    check-cast v1, Ljava/lang/CharSequence;

    new-instance v2, Lowasp/sat/agoat/BioMetricAuthActivity$onCreate$1$$ExternalSyntheticLambda2;

    invoke-direct {v2}, Lowasp/sat/agoat/BioMetricAuthActivity$onCreate$1$$ExternalSyntheticLambda2;-><init>()V

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 44
    iget-object v0, p0, Lowasp/sat/agoat/BioMetricAuthActivity$onCreate$1;->$builder:Landroidx/appcompat/app/AlertDialog$Builder;

    invoke-virtual {v0}, Landroidx/appcompat/app/AlertDialog$Builder;->create()Landroidx/appcompat/app/AlertDialog;

    move-result-object v0

    const-string v1, "builder.create()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .local v0, "dialog":Landroidx/appcompat/app/AlertDialog;
    invoke-virtual {v0}, Landroidx/appcompat/app/AlertDialog;->show()V

    .line 46
    return-void
.end method
