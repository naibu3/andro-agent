.class public final Lowasp/sat/agoat/InsecureLoggingActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "InsecureLoggingActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014\u00a8\u0006\u0007"
    }
    d2 = {
        "Lowasp/sat/agoat/InsecureLoggingActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
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


# direct methods
.method public static synthetic $r8$lambda$-qGXGYQyYnXqIs6PRrxVredyNrU(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/InsecureLoggingActivity;->onCreate$lambda$1$lambda$0(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic $r8$lambda$e0z-Cj2Fu2VDX5BALB-L6csTF-o(Landroid/widget/EditText;Landroid/widget/EditText;Landroidx/appcompat/app/AlertDialog$Builder;Lowasp/sat/agoat/InsecureLoggingActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lowasp/sat/agoat/InsecureLoggingActivity;->onCreate$lambda$1(Landroid/widget/EditText;Landroid/widget/EditText;Landroidx/appcompat/app/AlertDialog$Builder;Lowasp/sat/agoat/InsecureLoggingActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private static final onCreate$lambda$1(Landroid/widget/EditText;Landroid/widget/EditText;Landroidx/appcompat/app/AlertDialog$Builder;Lowasp/sat/agoat/InsecureLoggingActivity;Landroid/view/View;)V
    .locals 5
    .param p0, "$username"    # Landroid/widget/EditText;
    .param p1, "$password"    # Landroid/widget/EditText;
    .param p2, "$builder"    # Landroidx/appcompat/app/AlertDialog$Builder;
    .param p3, "this$0"    # Lowasp/sat/agoat/InsecureLoggingActivity;
    .param p4, "it"    # Landroid/view/View;

    const-string v0, "$builder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "this$0"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Username: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " and Password: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " are verified"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 22
    .local v0, "logMessage":Ljava/lang/String;
    const-string v1, "Info:"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 24
    const-string v1, "Username and Password are verified"

    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {p2, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 25
    const-string v2, "OK"

    check-cast v2, Ljava/lang/CharSequence;

    new-instance v3, Lowasp/sat/agoat/InsecureLoggingActivity$$ExternalSyntheticLambda1;

    invoke-direct {v3}, Lowasp/sat/agoat/InsecureLoggingActivity$$ExternalSyntheticLambda1;-><init>()V

    invoke-virtual {p2, v2, v3}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 28
    invoke-virtual {p2}, Landroidx/appcompat/app/AlertDialog$Builder;->create()Landroidx/appcompat/app/AlertDialog;

    move-result-object v2

    const-string v3, "builder.create()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .local v2, "dialog":Landroidx/appcompat/app/AlertDialog;
    invoke-virtual {v2}, Landroidx/appcompat/app/AlertDialog;->show()V

    .line 30
    move-object v3, p3

    check-cast v3, Landroid/content/Context;

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v4, 0x1

    invoke-static {v3, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 31
    return-void
.end method

.method private static final onCreate$lambda$1$lambda$0(Landroid/content/DialogInterface;I)V
    .locals 0
    .param p0, "dialog"    # Landroid/content/DialogInterface;

    .line 26
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 27
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 13
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 14
    sget v0, Lowasp/sat/agoat/R$layout;->activity_insecure_logging:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/InsecureLoggingActivity;->setContentView(I)V

    .line 15
    sget v0, Lowasp/sat/agoat/R$id;->userName:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/InsecureLoggingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    .line 16
    .local v0, "username":Landroid/widget/EditText;
    sget v1, Lowasp/sat/agoat/R$id;->password:I

    invoke-virtual {p0, v1}, Lowasp/sat/agoat/InsecureLoggingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    .line 17
    .local v1, "password":Landroid/widget/EditText;
    sget v2, Lowasp/sat/agoat/R$id;->Logging1:I

    invoke-virtual {p0, v2}, Lowasp/sat/agoat/InsecureLoggingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    .line 18
    .local v2, "loggingButton":Landroid/widget/Button;
    new-instance v3, Landroidx/appcompat/app/AlertDialog$Builder;

    move-object v4, p0

    check-cast v4, Landroid/content/Context;

    invoke-direct {v3, v4}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 19
    .local v3, "builder":Landroidx/appcompat/app/AlertDialog$Builder;
    const-string v4, "Login"

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v3, v4}, Landroidx/appcompat/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 20
    new-instance v4, Lowasp/sat/agoat/InsecureLoggingActivity$$ExternalSyntheticLambda0;

    invoke-direct {v4, v0, v1, v3, p0}, Lowasp/sat/agoat/InsecureLoggingActivity$$ExternalSyntheticLambda0;-><init>(Landroid/widget/EditText;Landroid/widget/EditText;Landroidx/appcompat/app/AlertDialog$Builder;Lowasp/sat/agoat/InsecureLoggingActivity;)V

    invoke-virtual {v2, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 32
    return-void
.end method
