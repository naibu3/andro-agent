.class public final Lowasp/sat/agoat/AccessControlIssue1Activity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "AccessControlIssue1Activity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u0014J\u0008\u0010\r\u001a\u00020\u0004H\u0002J\u0008\u0010\u000e\u001a\u00020\nH\u0002\u00a8\u0006\u000f"
    }
    d2 = {
        "Lowasp/sat/agoat/AccessControlIssue1Activity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "createPIN",
        "",
        "pinValue",
        "",
        "hashPIN",
        "isPinCorrect",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "verifyIfPinSet",
        "verifyPINView",
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
.method public static synthetic $r8$lambda$WLRA-z1HwxqGju_VXNs201exMto(Lowasp/sat/agoat/AccessControlIssue1Activity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/AccessControlIssue1Activity;->verifyPINView$lambda$1(Lowasp/sat/agoat/AccessControlIssue1Activity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$vcf5Hun51rP9QfnPilFkAnbJ7yo(Lowasp/sat/agoat/AccessControlIssue1Activity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/AccessControlIssue1Activity;->onCreate$lambda$0(Lowasp/sat/agoat/AccessControlIssue1Activity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private final createPIN(Ljava/lang/String;)Z
    .locals 4
    .param p1, "pinValue"    # Ljava/lang/String;

    .line 39
    const-string/jumbo v0, "pinDetails"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lowasp/sat/agoat/AccessControlIssue1Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 40
    .local v0, "sharedPreferences":Landroid/content/SharedPreferences;
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 41
    .local v1, "editor1":Landroid/content/SharedPreferences$Editor;
    const-string/jumbo v2, "pinSet"

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 42
    const-string/jumbo v2, "pin"

    invoke-direct {p0, p1}, Lowasp/sat/agoat/AccessControlIssue1Activity;->hashPIN(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 43
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v2

    return v2
.end method

.method private final hashPIN(Ljava/lang/String;)Ljava/lang/String;
    .locals 12
    .param p1, "pinValue"    # Ljava/lang/String;

    .line 68
    const-string v0, "MD5"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    const-string/jumbo v2, "this as java.lang.String).getBytes(charset)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v3

    const-string v0, "getInstance(\"MD5\").digest(pinValue.toByteArray())"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, ""

    move-object v4, v0

    check-cast v4, Ljava/lang/CharSequence;

    sget-object v0, Lowasp/sat/agoat/AccessControlIssue1Activity$hashPIN$md$1;->INSTANCE:Lowasp/sat/agoat/AccessControlIssue1Activity$hashPIN$md$1;

    move-object v9, v0

    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/16 v10, 0x1e

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v11}, Lkotlin/collections/ArraysKt;->joinToString$default([BLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 69
    .local v0, "md":Ljava/lang/String;
    return-object v0
.end method

.method private final isPinCorrect(Ljava/lang/String;)Z
    .locals 4
    .param p1, "pinValue"    # Ljava/lang/String;

    .line 47
    const-string/jumbo v0, "pinDetails"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lowasp/sat/agoat/AccessControlIssue1Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 48
    .local v0, "sharedPreferences":Landroid/content/SharedPreferences;
    const-string/jumbo v2, "pin"

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 49
    .local v2, "storedPin":Ljava/lang/String;
    if-eqz v2, :cond_0

    invoke-direct {p0, p1}, Lowasp/sat/agoat/AccessControlIssue1Activity;->hashPIN(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method private static final onCreate$lambda$0(Lowasp/sat/agoat/AccessControlIssue1Activity;Landroid/view/View;)V
    .locals 4
    .param p0, "this$0"    # Lowasp/sat/agoat/AccessControlIssue1Activity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    sget v0, Lowasp/sat/agoat/R$id;->setpin:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/AccessControlIssue1Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    .line 23
    .local v0, "pinValue":Landroid/widget/EditText;
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lowasp/sat/agoat/AccessControlIssue1Activity;->createPIN(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 24
    invoke-virtual {p0}, Lowasp/sat/agoat/AccessControlIssue1Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v3, "PIN created. Please Login"

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v1, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 25
    invoke-direct {p0}, Lowasp/sat/agoat/AccessControlIssue1Activity;->verifyPINView()V

    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p0}, Lowasp/sat/agoat/AccessControlIssue1Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v3, "PIN not created"

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v1, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 29
    :goto_0
    return-void
.end method

.method private final verifyIfPinSet()Z
    .locals 3

    .line 34
    const-string/jumbo v0, "pinDetails"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lowasp/sat/agoat/AccessControlIssue1Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 35
    .local v0, "sharedPreferences":Landroid/content/SharedPreferences;
    const-string/jumbo v2, "pinSet"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    return v1
.end method

.method private final verifyPINView()V
    .locals 2

    .line 53
    sget v0, Lowasp/sat/agoat/R$layout;->activity_access_verify_pin:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/AccessControlIssue1Activity;->setContentView(I)V

    .line 54
    sget v0, Lowasp/sat/agoat/R$id;->verifyPIN:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/AccessControlIssue1Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 55
    .local v0, "verifyPINButton":Landroid/widget/Button;
    new-instance v1, Lowasp/sat/agoat/AccessControlIssue1Activity$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0}, Lowasp/sat/agoat/AccessControlIssue1Activity$$ExternalSyntheticLambda1;-><init>(Lowasp/sat/agoat/AccessControlIssue1Activity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 65
    return-void
.end method

.method private static final verifyPINView$lambda$1(Lowasp/sat/agoat/AccessControlIssue1Activity;Landroid/view/View;)V
    .locals 4
    .param p0, "this$0"    # Lowasp/sat/agoat/AccessControlIssue1Activity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    sget v0, Lowasp/sat/agoat/R$id;->pinValue:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/AccessControlIssue1Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    .line 57
    .local v0, "pinValue":Landroid/widget/EditText;
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lowasp/sat/agoat/AccessControlIssue1Activity;->isPinCorrect(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 58
    invoke-virtual {p0}, Lowasp/sat/agoat/AccessControlIssue1Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v3, "PIN Verified"

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v1, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 59
    new-instance v1, Landroid/content/Intent;

    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    const-class v3, Lowasp/sat/agoat/AccessControl1ViewActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 60
    .local v1, "myIntent":Landroid/content/Intent;
    invoke-virtual {p0, v1}, Lowasp/sat/agoat/AccessControlIssue1Activity;->startActivity(Landroid/content/Intent;)V

    .end local v1    # "myIntent":Landroid/content/Intent;
    goto :goto_0

    .line 62
    :cond_0
    invoke-virtual {p0}, Lowasp/sat/agoat/AccessControlIssue1Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v3, "Incorrect PIN entered"

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v1, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 64
    :goto_0
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 15
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 16
    invoke-direct {p0}, Lowasp/sat/agoat/AccessControlIssue1Activity;->verifyIfPinSet()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 17
    invoke-direct {p0}, Lowasp/sat/agoat/AccessControlIssue1Activity;->verifyPINView()V

    goto :goto_0

    .line 19
    :cond_0
    sget v0, Lowasp/sat/agoat/R$layout;->activity_access_control_issue1:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/AccessControlIssue1Activity;->setContentView(I)V

    .line 20
    sget v0, Lowasp/sat/agoat/R$id;->setPIN:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/AccessControlIssue1Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 21
    .local v0, "setPINButton":Landroid/widget/Button;
    new-instance v1, Lowasp/sat/agoat/AccessControlIssue1Activity$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lowasp/sat/agoat/AccessControlIssue1Activity$$ExternalSyntheticLambda0;-><init>(Lowasp/sat/agoat/AccessControlIssue1Activity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 31
    .end local v0    # "setPINButton":Landroid/widget/Button;
    :goto_0
    return-void
.end method
