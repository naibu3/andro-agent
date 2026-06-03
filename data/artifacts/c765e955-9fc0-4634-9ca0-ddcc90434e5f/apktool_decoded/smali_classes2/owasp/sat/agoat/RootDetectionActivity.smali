.class public final Lowasp/sat/agoat/RootDetectionActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "RootDetectionActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0012\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0014\u00a8\u0006\n"
    }
    d2 = {
        "Lowasp/sat/agoat/RootDetectionActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "isRooted",
        "",
        "isRooted1",
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
.method public static synthetic $r8$lambda$qyjTQg9mXMXWnrytzZ1Z9K8nfAo(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/RootDetectionActivity;->onCreate$lambda$1$lambda$0(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic $r8$lambda$uo5BvzdozvRWU5Orj1ULtlz4pQ0(Lowasp/sat/agoat/RootDetectionActivity;Landroidx/appcompat/app/AlertDialog$Builder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lowasp/sat/agoat/RootDetectionActivity;->onCreate$lambda$1(Lowasp/sat/agoat/RootDetectionActivity;Landroidx/appcompat/app/AlertDialog$Builder;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private static final onCreate$lambda$1(Lowasp/sat/agoat/RootDetectionActivity;Landroidx/appcompat/app/AlertDialog$Builder;Landroid/view/View;)V
    .locals 4
    .param p0, "this$0"    # Lowasp/sat/agoat/RootDetectionActivity;
    .param p1, "$builder"    # Landroidx/appcompat/app/AlertDialog$Builder;
    .param p2, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-virtual {p0}, Lowasp/sat/agoat/RootDetectionActivity;->isRooted()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 23
    const-string v0, "Device is rooted"

    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {p1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 24
    invoke-virtual {p0}, Lowasp/sat/agoat/RootDetectionActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p0}, Lowasp/sat/agoat/RootDetectionActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "Device is not rooted"

    move-object v3, v2

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v0, v3, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 29
    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {p1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 31
    :goto_0
    const-string v0, "OK"

    check-cast v0, Ljava/lang/CharSequence;

    new-instance v1, Lowasp/sat/agoat/RootDetectionActivity$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lowasp/sat/agoat/RootDetectionActivity$$ExternalSyntheticLambda0;-><init>()V

    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 34
    invoke-virtual {p1}, Landroidx/appcompat/app/AlertDialog$Builder;->create()Landroidx/appcompat/app/AlertDialog;

    move-result-object v0

    const-string v1, "builder.create()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .local v0, "dialog":Landroidx/appcompat/app/AlertDialog;
    invoke-virtual {v0}, Landroidx/appcompat/app/AlertDialog;->show()V

    .line 37
    return-void
.end method

.method private static final onCreate$lambda$1$lambda$0(Landroid/content/DialogInterface;I)V
    .locals 0
    .param p0, "dialog"    # Landroid/content/DialogInterface;

    .line 32
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 33
    return-void
.end method


# virtual methods
.method public final isRooted()Z
    .locals 13

    .line 43
    nop

    .line 44
    nop

    .line 43
    nop

    .line 44
    nop

    .line 43
    nop

    .line 44
    nop

    .line 43
    nop

    .line 44
    nop

    .line 43
    nop

    .line 44
    const-string v12, "/data/app/eu.chainfire.supersu-1/base.apk"

    const-string v0, "/system/app/Superuser/Superuser.apk"

    const-string v1, "/system/app/Superuser.apk"

    const-string v2, "/sbin/su"

    const-string v3, "/system/bin/su"

    const-string v4, "/system/xbin/su"

    const-string v5, "/data/local/xbin/su"

    const-string v6, "/data/local/bin/su"

    const-string v7, "/system/sd/xbin/su"

    const-string v8, "/system/bin/failsafe/su"

    const-string v9, "/data/local/su"

    const-string v10, "/su/bin/su"

    const-string/jumbo v11, "re.robv.android.xposed.installer-1.apk"

    filled-new-array/range {v0 .. v12}, [Ljava/lang/String;

    move-result-object v0

    .line 43
    nop

    .line 45
    .local v0, "file":[Ljava/lang/String;
    const/4 v1, 0x0

    .line 46
    .local v1, "result":Z
    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    .line 47
    .local v4, "files":Ljava/lang/String;
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 48
    .local v5, "f":Ljava/io/File;
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    goto :goto_1

    .line 46
    .end local v4    # "files":Ljava/lang/String;
    .end local v5    # "f":Ljava/io/File;
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 53
    :cond_1
    :goto_1
    return v1
.end method

.method public final isRooted1()Z
    .locals 4

    .line 57
    const/4 v0, 0x0

    .line 58
    .local v0, "result":Z
    nop

    .line 59
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    const-string/jumbo v2, "su"

    const-string v3, "ls /data/data/"

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Runtime;->exec([Ljava/lang/String;)Ljava/lang/Process;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    const/4 v0, 0x1

    goto :goto_0

    .line 62
    :catch_0
    move-exception v1

    .line 64
    .local v1, "e":Ljava/io/IOException;
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 66
    .end local v1    # "e":Ljava/io/IOException;
    :goto_0
    return v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 15
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 16
    sget v0, Lowasp/sat/agoat/R$layout;->activity_root_detection:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/RootDetectionActivity;->setContentView(I)V

    .line 17
    sget v0, Lowasp/sat/agoat/R$id;->rootCheck:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/RootDetectionActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 18
    .local v0, "rootBt":Landroid/widget/Button;
    new-instance v1, Landroidx/appcompat/app/AlertDialog$Builder;

    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    invoke-direct {v1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 19
    .local v1, "builder":Landroidx/appcompat/app/AlertDialog$Builder;
    const-string v2, "Root Detection"

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 20
    new-instance v2, Lowasp/sat/agoat/RootDetectionActivity$$ExternalSyntheticLambda1;

    invoke-direct {v2, p0, v1}, Lowasp/sat/agoat/RootDetectionActivity$$ExternalSyntheticLambda1;-><init>(Lowasp/sat/agoat/RootDetectionActivity;Landroidx/appcompat/app/AlertDialog$Builder;)V

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    return-void
.end method
