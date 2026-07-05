.class public final Lowasp/sat/agoat/CloudServicesActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "CloudServicesActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0004X\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0008\u00a8\u0006\u000f"
    }
    d2 = {
        "Lowasp/sat/agoat/CloudServicesActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "aws_access_key_id",
        "",
        "aws_secret_access_key",
        "output",
        "getOutput",
        "()Ljava/lang/String;",
        "region",
        "getRegion",
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
.field private final aws_access_key_id:Ljava/lang/String;

.field private final aws_secret_access_key:Ljava/lang/String;

.field private final output:Ljava/lang/String;

.field private final region:Ljava/lang/String;


# direct methods
.method public static synthetic $r8$lambda$DYQH0M6REgFH2zKp-qlPBUEUzMI(Landroidx/appcompat/app/AlertDialog$Builder;Lowasp/sat/agoat/CloudServicesActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lowasp/sat/agoat/CloudServicesActivity;->onCreate$lambda$1(Landroidx/appcompat/app/AlertDialog$Builder;Lowasp/sat/agoat/CloudServicesActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$e_hZjHOeIpNkB4QJus3cis6PulI(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/CloudServicesActivity;->onCreate$lambda$1$lambda$0(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 13
    const-string v0, "AKIAX56QKKOLPQ7G7ABC"

    iput-object v0, p0, Lowasp/sat/agoat/CloudServicesActivity;->aws_access_key_id:Ljava/lang/String;

    .line 14
    const-string v0, "OviCwsFNWeoCSDKl3ZoD8j4BPnc1kCsfV+lOABCw"

    iput-object v0, p0, Lowasp/sat/agoat/CloudServicesActivity;->aws_secret_access_key:Ljava/lang/String;

    .line 15
    const-string v0, "json"

    iput-object v0, p0, Lowasp/sat/agoat/CloudServicesActivity;->output:Ljava/lang/String;

    .line 16
    const-string v0, "ap-south-2"

    iput-object v0, p0, Lowasp/sat/agoat/CloudServicesActivity;->region:Ljava/lang/String;

    .line 12
    return-void
.end method

.method private static final onCreate$lambda$1(Landroidx/appcompat/app/AlertDialog$Builder;Lowasp/sat/agoat/CloudServicesActivity;Landroid/view/View;)V
    .locals 6
    .param p0, "$builder"    # Landroidx/appcompat/app/AlertDialog$Builder;
    .param p1, "this$0"    # Lowasp/sat/agoat/CloudServicesActivity;
    .param p2, "it"    # Landroid/view/View;

    const-string v0, "$builder"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    iget-object v0, p1, Lowasp/sat/agoat/CloudServicesActivity;->aws_access_key_id:Ljava/lang/String;

    iget-object v1, p1, Lowasp/sat/agoat/CloudServicesActivity;->aws_secret_access_key:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Connected to AWS account using Access key "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " and secret key "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 26
    const-string v0, "OK"

    check-cast v0, Ljava/lang/CharSequence;

    new-instance v1, Lowasp/sat/agoat/CloudServicesActivity$$ExternalSyntheticLambda1;

    invoke-direct {v1}, Lowasp/sat/agoat/CloudServicesActivity$$ExternalSyntheticLambda1;-><init>()V

    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 29
    invoke-virtual {p0}, Landroidx/appcompat/app/AlertDialog$Builder;->create()Landroidx/appcompat/app/AlertDialog;

    move-result-object v0

    const-string v1, "builder.create()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .local v0, "dialog":Landroidx/appcompat/app/AlertDialog;
    invoke-virtual {v0}, Landroidx/appcompat/app/AlertDialog;->show()V

    .line 32
    iget-object v1, p1, Lowasp/sat/agoat/CloudServicesActivity;->aws_access_key_id:Ljava/lang/String;

    iget-object v4, p1, Lowasp/sat/agoat/CloudServicesActivity;->aws_secret_access_key:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "[Info]"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    sget v1, Lowasp/sat/agoat/R$layout;->activity_cloud_services_view:I

    invoke-virtual {p1, v1}, Lowasp/sat/agoat/CloudServicesActivity;->setContentView(I)V

    .line 34
    return-void
.end method

.method private static final onCreate$lambda$1$lambda$0(Landroid/content/DialogInterface;I)V
    .locals 0
    .param p0, "dialog"    # Landroid/content/DialogInterface;

    .line 27
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 28
    return-void
.end method


# virtual methods
.method public final getOutput()Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Lowasp/sat/agoat/CloudServicesActivity;->output:Ljava/lang/String;

    return-object v0
.end method

.method public final getRegion()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lowasp/sat/agoat/CloudServicesActivity;->region:Ljava/lang/String;

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 18
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 19
    move-object v0, p0

    check-cast v0, Landroidx/activity/ComponentActivity;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-static {v0, v1, v1, v2, v1}, Landroidx/activity/EdgeToEdge;->enable$default(Landroidx/activity/ComponentActivity;Landroidx/activity/SystemBarStyle;Landroidx/activity/SystemBarStyle;ILjava/lang/Object;)V

    .line 20
    sget v0, Lowasp/sat/agoat/R$layout;->activity_cloud_services:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/CloudServicesActivity;->setContentView(I)V

    .line 21
    sget v0, Lowasp/sat/agoat/R$id;->viewCloudServices:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/CloudServicesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 22
    .local v0, "cloudServices":Landroid/widget/Button;
    new-instance v1, Landroidx/appcompat/app/AlertDialog$Builder;

    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    invoke-direct {v1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 23
    .local v1, "builder":Landroidx/appcompat/app/AlertDialog$Builder;
    const-string v2, "Login"

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 24
    new-instance v2, Lowasp/sat/agoat/CloudServicesActivity$$ExternalSyntheticLambda0;

    invoke-direct {v2, v1, p0}, Lowasp/sat/agoat/CloudServicesActivity$$ExternalSyntheticLambda0;-><init>(Landroidx/appcompat/app/AlertDialog$Builder;Lowasp/sat/agoat/CloudServicesActivity;)V

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 35
    return-void
.end method
