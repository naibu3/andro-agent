.class public final Lowasp/sat/agoat/InsecureStorageSharedPrefs;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "InsecureStorageSharedPrefs.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014\u00a8\u0006\u0007"
    }
    d2 = {
        "Lowasp/sat/agoat/InsecureStorageSharedPrefs;",
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
.method public static synthetic $r8$lambda$1fWJQgrSHHhkxcyv2jzCJwyAx40(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/InsecureStorageSharedPrefs;->onCreate$lambda$1$lambda$0(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic $r8$lambda$q3hp0UcvCVRYOp1lBXEne7ePPbU(Lowasp/sat/agoat/InsecureStorageSharedPrefs;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lowasp/sat/agoat/InsecureStorageSharedPrefs;->onCreate$lambda$1(Lowasp/sat/agoat/InsecureStorageSharedPrefs;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private static final onCreate$lambda$1(Lowasp/sat/agoat/InsecureStorageSharedPrefs;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/view/View;)V
    .locals 6
    .param p0, "this$0"    # Lowasp/sat/agoat/InsecureStorageSharedPrefs;
    .param p1, "$username"    # Landroid/widget/EditText;
    .param p2, "$password"    # Landroid/widget/EditText;
    .param p3, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    new-instance v0, Landroidx/appcompat/app/AlertDialog$Builder;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 22
    .local v0, "builder":Landroidx/appcompat/app/AlertDialog$Builder;
    const-string v1, "Login"

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 23
    const-string/jumbo v1, "users"

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Lowasp/sat/agoat/InsecureStorageSharedPrefs;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 24
    .local v1, "sharedPreference":Landroid/content/SharedPreferences;
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    .line 25
    .local v2, "editor":Landroid/content/SharedPreferences$Editor;
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const-string/jumbo v4, "username"

    invoke-interface {v2, v4, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 26
    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const-string/jumbo v4, "password"

    invoke-interface {v2, v4, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 27
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    .line 29
    const-string v3, "Username and Password are verified"

    move-object v5, v3

    check-cast v5, Ljava/lang/CharSequence;

    invoke-virtual {v0, v5}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 30
    invoke-virtual {p0}, Lowasp/sat/agoat/InsecureStorageSharedPrefs;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v5, v3, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 34
    :cond_0
    const-string v3, "There is an issue while verifying the username and password"

    move-object v5, v3

    check-cast v5, Ljava/lang/CharSequence;

    invoke-virtual {v0, v5}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 35
    invoke-virtual {p0}, Lowasp/sat/agoat/InsecureStorageSharedPrefs;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v5, v3, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/Toast;->show()V

    .line 37
    :goto_0
    const-string v3, "OK"

    check-cast v3, Ljava/lang/CharSequence;

    new-instance v4, Lowasp/sat/agoat/InsecureStorageSharedPrefs$$ExternalSyntheticLambda0;

    invoke-direct {v4}, Lowasp/sat/agoat/InsecureStorageSharedPrefs$$ExternalSyntheticLambda0;-><init>()V

    invoke-virtual {v0, v3, v4}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 40
    invoke-virtual {v0}, Landroidx/appcompat/app/AlertDialog$Builder;->create()Landroidx/appcompat/app/AlertDialog;

    move-result-object v3

    const-string v4, "builder.create()"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .local v3, "dialog":Landroidx/appcompat/app/AlertDialog;
    invoke-virtual {v3}, Landroidx/appcompat/app/AlertDialog;->show()V

    .line 42
    return-void
.end method

.method private static final onCreate$lambda$1$lambda$0(Landroid/content/DialogInterface;I)V
    .locals 0
    .param p0, "dialog"    # Landroid/content/DialogInterface;

    .line 38
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 39
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 13
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 14
    sget v0, Lowasp/sat/agoat/R$layout;->activity_insecure_storage_shared_prefs:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/InsecureStorageSharedPrefs;->setContentView(I)V

    .line 16
    sget v0, Lowasp/sat/agoat/R$id;->SPViewButton:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/InsecureStorageSharedPrefs;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 17
    .local v0, "savebutton":Landroid/widget/Button;
    sget v1, Lowasp/sat/agoat/R$id;->userName:I

    invoke-virtual {p0, v1}, Lowasp/sat/agoat/InsecureStorageSharedPrefs;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    .line 18
    .local v1, "username":Landroid/widget/EditText;
    sget v2, Lowasp/sat/agoat/R$id;->password:I

    invoke-virtual {p0, v2}, Lowasp/sat/agoat/InsecureStorageSharedPrefs;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    .line 20
    .local v2, "password":Landroid/widget/EditText;
    new-instance v3, Lowasp/sat/agoat/InsecureStorageSharedPrefs$$ExternalSyntheticLambda1;

    invoke-direct {v3, p0, v1, v2}, Lowasp/sat/agoat/InsecureStorageSharedPrefs$$ExternalSyntheticLambda1;-><init>(Lowasp/sat/agoat/InsecureStorageSharedPrefs;Landroid/widget/EditText;Landroid/widget/EditText;)V

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 44
    return-void
.end method
