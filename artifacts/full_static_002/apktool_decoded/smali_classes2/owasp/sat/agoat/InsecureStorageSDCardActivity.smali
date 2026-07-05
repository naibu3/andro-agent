.class public final Lowasp/sat/agoat/InsecureStorageSDCardActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "InsecureStorageSDCardActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014\u00a8\u0006\u0007"
    }
    d2 = {
        "Lowasp/sat/agoat/InsecureStorageSDCardActivity;",
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
.method public static synthetic $r8$lambda$NO1-zPYgyiMzwW_GmFCD-qCuPEM(Landroid/widget/EditText;Landroid/widget/EditText;Lowasp/sat/agoat/InsecureStorageSDCardActivity;Landroidx/appcompat/app/AlertDialog$Builder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lowasp/sat/agoat/InsecureStorageSDCardActivity;->onCreate$lambda$1(Landroid/widget/EditText;Landroid/widget/EditText;Lowasp/sat/agoat/InsecureStorageSDCardActivity;Landroidx/appcompat/app/AlertDialog$Builder;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$fsX2Vsv4NllhnwEKsZV5BbAj_k4(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/InsecureStorageSDCardActivity;->onCreate$lambda$1$lambda$0(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private static final onCreate$lambda$1(Landroid/widget/EditText;Landroid/widget/EditText;Lowasp/sat/agoat/InsecureStorageSDCardActivity;Landroidx/appcompat/app/AlertDialog$Builder;Landroid/view/View;)V
    .locals 8
    .param p0, "$username"    # Landroid/widget/EditText;
    .param p1, "$password"    # Landroid/widget/EditText;
    .param p2, "this$0"    # Lowasp/sat/agoat/InsecureStorageSDCardActivity;
    .param p3, "$builder"    # Landroidx/appcompat/app/AlertDialog$Builder;
    .param p4, "it"    # Landroid/view/View;

    const-string v0, "Username and Password are verified"

    const-string/jumbo v1, "this$0"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$builder"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    const-string v1, "mounted"

    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 26
    nop

    .line 27
    :try_start_0
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "This data is stored in SdCard on "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, ": \n Username - "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " Password -"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "\n"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 28
    .local v1, "data":Ljava/lang/String;
    const-string/jumbo v3, "users"

    const-string v4, "_tmp"

    const/4 v5, 0x0

    invoke-virtual {p2, v5}, Lowasp/sat/agoat/InsecureStorageSDCardActivity;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v5

    invoke-static {v3, v4, v5}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v3

    .line 29
    .local v3, "userinfo":Ljava/io/File;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "userinfo "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v5, v4}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 30
    invoke-virtual {v3, v2}, Ljava/io/File;->setReadable(Z)Z

    .line 31
    invoke-virtual {v3, v2}, Ljava/io/File;->setWritable(Z)Z

    .line 32
    new-instance v4, Ljava/io/FileWriter;

    invoke-direct {v4, v3}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V

    .line 33
    .local v4, "fw":Ljava/io/FileWriter;
    invoke-virtual {v4, v1}, Ljava/io/FileWriter;->write(Ljava/lang/String;)V

    .line 34
    invoke-virtual {v4}, Ljava/io/FileWriter;->close()V

    .line 35
    move-object v5, v0

    check-cast v5, Ljava/lang/CharSequence;

    invoke-virtual {p3, v5}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 36
    invoke-virtual {p2}, Lowasp/sat/agoat/InsecureStorageSDCardActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v5, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 37
    const-string v0, "Info"

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Data saved to"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 38
    .end local v1    # "data":Ljava/lang/String;
    .end local v3    # "userinfo":Ljava/io/File;
    .end local v4    # "fw":Ljava/io/FileWriter;
    :catch_0
    move-exception v0

    .line 39
    .local v0, "e":Ljava/io/IOException;
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 40
    const-string v1, "There is an issue while verifying the username and password"

    move-object v3, v1

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {p3, v3}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 41
    invoke-virtual {p2}, Lowasp/sat/agoat/InsecureStorageSDCardActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v3, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .end local v0    # "e":Ljava/io/IOException;
    goto :goto_0

    .line 44
    :cond_0
    const-string v0, "External storage not available"

    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {p3, v1}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 45
    invoke-virtual {p2}, Lowasp/sat/agoat/InsecureStorageSDCardActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 47
    :goto_0
    const-string v0, "OK"

    check-cast v0, Ljava/lang/CharSequence;

    new-instance v1, Lowasp/sat/agoat/InsecureStorageSDCardActivity$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lowasp/sat/agoat/InsecureStorageSDCardActivity$$ExternalSyntheticLambda0;-><init>()V

    invoke-virtual {p3, v0, v1}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 50
    invoke-virtual {p3}, Landroidx/appcompat/app/AlertDialog$Builder;->create()Landroidx/appcompat/app/AlertDialog;

    move-result-object v0

    const-string v1, "builder.create()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .local v0, "dialog":Landroidx/appcompat/app/AlertDialog;
    invoke-virtual {v0}, Landroidx/appcompat/app/AlertDialog;->show()V

    .line 52
    return-void
.end method

.method private static final onCreate$lambda$1$lambda$0(Landroid/content/DialogInterface;I)V
    .locals 0
    .param p0, "dialog"    # Landroid/content/DialogInterface;

    .line 48
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 49
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 16
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 17
    sget v0, Lowasp/sat/agoat/R$layout;->activity_insecure_storage_sdcard:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/InsecureStorageSDCardActivity;->setContentView(I)V

    .line 19
    sget v0, Lowasp/sat/agoat/R$id;->SDcardSaveButton:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/InsecureStorageSDCardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 20
    .local v0, "saveButton":Landroid/widget/Button;
    sget v1, Lowasp/sat/agoat/R$id;->userName:I

    invoke-virtual {p0, v1}, Lowasp/sat/agoat/InsecureStorageSDCardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    .line 21
    .local v1, "username":Landroid/widget/EditText;
    sget v2, Lowasp/sat/agoat/R$id;->password:I

    invoke-virtual {p0, v2}, Lowasp/sat/agoat/InsecureStorageSDCardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    .line 22
    .local v2, "password":Landroid/widget/EditText;
    new-instance v3, Landroidx/appcompat/app/AlertDialog$Builder;

    move-object v4, p0

    check-cast v4, Landroid/content/Context;

    invoke-direct {v3, v4}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 23
    .local v3, "builder":Landroidx/appcompat/app/AlertDialog$Builder;
    const-string v4, "Login"

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v3, v4}, Landroidx/appcompat/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 24
    new-instance v4, Lowasp/sat/agoat/InsecureStorageSDCardActivity$$ExternalSyntheticLambda1;

    invoke-direct {v4, v1, v2, p0, v3}, Lowasp/sat/agoat/InsecureStorageSDCardActivity$$ExternalSyntheticLambda1;-><init>(Landroid/widget/EditText;Landroid/widget/EditText;Lowasp/sat/agoat/InsecureStorageSDCardActivity;Landroidx/appcompat/app/AlertDialog$Builder;)V

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 53
    return-void
.end method
