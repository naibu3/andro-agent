.class public final Lowasp/sat/agoat/InsecureStorageTempActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "InsecureStorageTempActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014\u00a8\u0006\u0007"
    }
    d2 = {
        "Lowasp/sat/agoat/InsecureStorageTempActivity;",
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
.method public static synthetic $r8$lambda$PIA0yISvbkCVOnqaQcltJf_LPG0(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/InsecureStorageTempActivity;->onCreate$lambda$1$lambda$0(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic $r8$lambda$ZUVbifqzhx7tb6FFqgsOm0qWUck(Lowasp/sat/agoat/InsecureStorageTempActivity;Landroid/widget/EditText;Landroid/widget/EditText;Landroidx/appcompat/app/AlertDialog$Builder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lowasp/sat/agoat/InsecureStorageTempActivity;->onCreate$lambda$1(Lowasp/sat/agoat/InsecureStorageTempActivity;Landroid/widget/EditText;Landroid/widget/EditText;Landroidx/appcompat/app/AlertDialog$Builder;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private static final onCreate$lambda$1(Lowasp/sat/agoat/InsecureStorageTempActivity;Landroid/widget/EditText;Landroid/widget/EditText;Landroidx/appcompat/app/AlertDialog$Builder;Landroid/view/View;)V
    .locals 8
    .param p0, "this$0"    # Lowasp/sat/agoat/InsecureStorageTempActivity;
    .param p1, "$username"    # Landroid/widget/EditText;
    .param p2, "$password"    # Landroid/widget/EditText;
    .param p3, "$builder"    # Landroidx/appcompat/app/AlertDialog$Builder;
    .param p4, "it"    # Landroid/view/View;

    const-string v0, "Username and Password are verified"

    const-string v1, "\n"

    const-string/jumbo v2, "this$0"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$builder"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    nop

    .line 25
    const/4 v2, 0x1

    :try_start_0
    const-string/jumbo v3, "users"

    const-string/jumbo v4, "tmp"

    new-instance v5, Ljava/io/File;

    invoke-virtual {p0}, Lowasp/sat/agoat/InsecureStorageTempActivity;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v6

    iget-object v6, v6, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    invoke-direct {v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v3, v4, v5}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v3

    .line 26
    .local v3, "userinfo":Ljava/io/File;
    invoke-virtual {v3, v2}, Ljava/io/File;->setReadable(Z)Z

    .line 27
    invoke-virtual {v3, v2}, Ljava/io/File;->setWritable(Z)Z

    .line 28
    new-instance v4, Ljava/io/FileWriter;

    invoke-direct {v4, v3}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V

    .line 29
    .local v4, "fw":Ljava/io/FileWriter;
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v7, "username is "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/io/FileWriter;->write(Ljava/lang/String;)V

    .line 30
    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v7, "password is "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/io/FileWriter;->write(Ljava/lang/String;)V

    .line 31
    invoke-virtual {v4}, Ljava/io/FileWriter;->close()V

    .line 32
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {p3, v1}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 33
    invoke-virtual {p0}, Lowasp/sat/agoat/InsecureStorageTempActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .end local v3    # "userinfo":Ljava/io/File;
    .end local v4    # "fw":Ljava/io/FileWriter;
    goto :goto_0

    .line 34
    :catch_0
    move-exception v0

    .line 35
    .local v0, "e":Ljava/lang/Exception;
    const-string v1, "There is an issue while verifying the username and password"

    move-object v3, v1

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {p3, v3}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 36
    invoke-virtual {p0}, Lowasp/sat/agoat/InsecureStorageTempActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v3, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 37
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 39
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_0
    const-string v0, "OK"

    check-cast v0, Ljava/lang/CharSequence;

    new-instance v1, Lowasp/sat/agoat/InsecureStorageTempActivity$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lowasp/sat/agoat/InsecureStorageTempActivity$$ExternalSyntheticLambda0;-><init>()V

    invoke-virtual {p3, v0, v1}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 42
    invoke-virtual {p3}, Landroidx/appcompat/app/AlertDialog$Builder;->create()Landroidx/appcompat/app/AlertDialog;

    move-result-object v0

    const-string v1, "builder.create()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .local v0, "dialog":Landroidx/appcompat/app/AlertDialog;
    invoke-virtual {v0}, Landroidx/appcompat/app/AlertDialog;->show()V

    .line 44
    return-void
.end method

.method private static final onCreate$lambda$1$lambda$0(Landroid/content/DialogInterface;I)V
    .locals 0
    .param p0, "dialog"    # Landroid/content/DialogInterface;

    .line 40
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 41
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 16
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 17
    sget v0, Lowasp/sat/agoat/R$layout;->activity_insecure_storage_temp:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/InsecureStorageTempActivity;->setContentView(I)V

    .line 18
    sget v0, Lowasp/sat/agoat/R$id;->TempViewButton:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/InsecureStorageTempActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 19
    .local v0, "savebutton":Landroid/widget/Button;
    sget v1, Lowasp/sat/agoat/R$id;->userName:I

    invoke-virtual {p0, v1}, Lowasp/sat/agoat/InsecureStorageTempActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    .line 20
    .local v1, "username":Landroid/widget/EditText;
    sget v2, Lowasp/sat/agoat/R$id;->password:I

    invoke-virtual {p0, v2}, Lowasp/sat/agoat/InsecureStorageTempActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    .line 21
    .local v2, "password":Landroid/widget/EditText;
    new-instance v3, Landroidx/appcompat/app/AlertDialog$Builder;

    move-object v4, p0

    check-cast v4, Landroid/content/Context;

    invoke-direct {v3, v4}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 22
    .local v3, "builder":Landroidx/appcompat/app/AlertDialog$Builder;
    const-string v4, "Login"

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v3, v4}, Landroidx/appcompat/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 23
    new-instance v4, Lowasp/sat/agoat/InsecureStorageTempActivity$$ExternalSyntheticLambda1;

    invoke-direct {v4, p0, v1, v2, v3}, Lowasp/sat/agoat/InsecureStorageTempActivity$$ExternalSyntheticLambda1;-><init>(Lowasp/sat/agoat/InsecureStorageTempActivity;Landroid/widget/EditText;Landroid/widget/EditText;Landroidx/appcompat/app/AlertDialog$Builder;)V

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 46
    return-void
.end method
