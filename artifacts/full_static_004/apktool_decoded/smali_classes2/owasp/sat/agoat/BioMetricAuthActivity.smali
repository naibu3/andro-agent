.class public final Lowasp/sat/agoat/BioMetricAuthActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "BioMetricAuthActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lowasp/sat/agoat/BioMetricAuthActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "biometricPrompt",
        "Landroidx/biometric/BiometricPrompt;",
        "executor",
        "Ljava/util/concurrent/Executor;",
        "promptInfo",
        "Landroidx/biometric/BiometricPrompt$PromptInfo;",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
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
.field private biometricPrompt:Landroidx/biometric/BiometricPrompt;

.field private executor:Ljava/util/concurrent/Executor;

.field private promptInfo:Landroidx/biometric/BiometricPrompt$PromptInfo;


# direct methods
.method public static synthetic $r8$lambda$4K8BAYBWQ4qllVgzCWb6Vl3JQP4(Lowasp/sat/agoat/BioMetricAuthActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/BioMetricAuthActivity;->onCreate$lambda$0(Lowasp/sat/agoat/BioMetricAuthActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private static final onCreate$lambda$0(Lowasp/sat/agoat/BioMetricAuthActivity;Landroid/view/View;)V
    .locals 4
    .param p0, "this$0"    # Lowasp/sat/agoat/BioMetricAuthActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Landroidx/biometric/BiometricManager;->from(Landroid/content/Context;)Landroidx/biometric/BiometricManager;

    move-result-object v0

    const-string v1, "from(this)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .local v0, "biometricManager":Landroidx/biometric/BiometricManager;
    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroidx/biometric/BiometricManager;->canAuthenticate(I)I

    move-result v1

    const/4 v2, 0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_1

    .line 83
    :sswitch_0
    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-string v3, "No biometric features available on this device."

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v1, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    goto :goto_1

    .line 87
    :sswitch_1
    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-string v3, "The user hasn\'t associated any biometric credentials."

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v1, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    goto :goto_1

    .line 85
    :sswitch_2
    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-string v3, "Biometric features are currently unavailable."

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v1, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    goto :goto_1

    .line 80
    :sswitch_3
    iget-object v1, p0, Lowasp/sat/agoat/BioMetricAuthActivity;->biometricPrompt:Landroidx/biometric/BiometricPrompt;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const-string v1, "biometricPrompt"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    iget-object v3, p0, Lowasp/sat/agoat/BioMetricAuthActivity;->promptInfo:Landroidx/biometric/BiometricPrompt$PromptInfo;

    if-nez v3, :cond_1

    const-string/jumbo v3, "promptInfo"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    invoke-virtual {v1, v2}, Landroidx/biometric/BiometricPrompt;->authenticate(Landroidx/biometric/BiometricPrompt$PromptInfo;)V

    .line 89
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_3
        0x1 -> :sswitch_2
        0xb -> :sswitch_1
        0xc -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 19
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 20
    sget v0, Lowasp/sat/agoat/R$layout;->activity_bio_metric_auth:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/BioMetricAuthActivity;->setContentView(I)V

    .line 22
    sget v0, Lowasp/sat/agoat/R$id;->bioauth:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/BioMetricAuthActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 23
    .local v0, "bioAuth":Landroid/widget/Button;
    new-instance v1, Landroidx/appcompat/app/AlertDialog$Builder;

    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    invoke-direct {v1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 24
    .local v1, "builder":Landroidx/appcompat/app/AlertDialog$Builder;
    const-string v2, "Biometric login"

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 26
    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    invoke-static {v2}, Landroidx/core/content/ContextCompat;->getMainExecutor(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v2

    const-string v3, "getMainExecutor(this)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Lowasp/sat/agoat/BioMetricAuthActivity;->executor:Ljava/util/concurrent/Executor;

    .line 28
    new-instance v2, Landroidx/biometric/BiometricPrompt;

    move-object v3, p0

    check-cast v3, Landroidx/fragment/app/FragmentActivity;

    iget-object v4, p0, Lowasp/sat/agoat/BioMetricAuthActivity;->executor:Ljava/util/concurrent/Executor;

    if-nez v4, :cond_0

    const-string v4, "executor"

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v4, 0x0

    .line 29
    :cond_0
    new-instance v5, Lowasp/sat/agoat/BioMetricAuthActivity$onCreate$1;

    invoke-direct {v5, v1, p0}, Lowasp/sat/agoat/BioMetricAuthActivity$onCreate$1;-><init>(Landroidx/appcompat/app/AlertDialog$Builder;Lowasp/sat/agoat/BioMetricAuthActivity;)V

    check-cast v5, Landroidx/biometric/BiometricPrompt$AuthenticationCallback;

    .line 28
    invoke-direct {v2, v3, v4, v5}, Landroidx/biometric/BiometricPrompt;-><init>(Landroidx/fragment/app/FragmentActivity;Ljava/util/concurrent/Executor;Landroidx/biometric/BiometricPrompt$AuthenticationCallback;)V

    iput-object v2, p0, Lowasp/sat/agoat/BioMetricAuthActivity;->biometricPrompt:Landroidx/biometric/BiometricPrompt;

    .line 70
    new-instance v2, Landroidx/biometric/BiometricPrompt$PromptInfo$Builder;

    invoke-direct {v2}, Landroidx/biometric/BiometricPrompt$PromptInfo$Builder;-><init>()V

    .line 71
    const-string v3, "Biometric Login"

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Landroidx/biometric/BiometricPrompt$PromptInfo$Builder;->setTitle(Ljava/lang/CharSequence;)Landroidx/biometric/BiometricPrompt$PromptInfo$Builder;

    move-result-object v2

    .line 72
    const-string v3, "Log in using your biometric credential"

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Landroidx/biometric/BiometricPrompt$PromptInfo$Builder;->setSubtitle(Ljava/lang/CharSequence;)Landroidx/biometric/BiometricPrompt$PromptInfo$Builder;

    move-result-object v2

    .line 73
    const-string v3, "Cancel"

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Landroidx/biometric/BiometricPrompt$PromptInfo$Builder;->setNegativeButtonText(Ljava/lang/CharSequence;)Landroidx/biometric/BiometricPrompt$PromptInfo$Builder;

    move-result-object v2

    .line 74
    invoke-virtual {v2}, Landroidx/biometric/BiometricPrompt$PromptInfo$Builder;->build()Landroidx/biometric/BiometricPrompt$PromptInfo;

    move-result-object v2

    const-string v3, "Builder()\n            .s\u2026el\")\n            .build()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    iput-object v2, p0, Lowasp/sat/agoat/BioMetricAuthActivity;->promptInfo:Landroidx/biometric/BiometricPrompt$PromptInfo;

    .line 76
    new-instance v2, Lowasp/sat/agoat/BioMetricAuthActivity$$ExternalSyntheticLambda0;

    invoke-direct {v2, p0}, Lowasp/sat/agoat/BioMetricAuthActivity$$ExternalSyntheticLambda0;-><init>(Lowasp/sat/agoat/BioMetricAuthActivity;)V

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 90
    return-void
.end method
