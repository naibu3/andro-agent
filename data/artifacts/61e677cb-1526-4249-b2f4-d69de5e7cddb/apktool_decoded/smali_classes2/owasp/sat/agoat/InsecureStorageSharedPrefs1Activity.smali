.class public final Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "InsecureStorageSharedPrefs1Activity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0008\u0010\u000b\u001a\u00020\u0004H\u0002J\u0012\u0010\u000c\u001a\u00020\t2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002\u00a8\u0006\u0010"
    }
    d2 = {
        "Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "calculateScore",
        "",
        "score",
        "checkScore",
        "",
        "displayScore",
        "",
        "level",
        "getScoreFromSP",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "updateScoreInSP",
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
.method public static synthetic $r8$lambda$2H4ydL3uz0BZd0EJ6ox1DKc3dZI(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity;->onCreate$lambda$1$lambda$0(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic $r8$lambda$yxigiDPTsEGKUhq_d8IEVgm7EbA(Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity;ILandroid/widget/Button;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity;->onCreate$lambda$1(Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity;ILandroid/widget/Button;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private final calculateScore(I)I
    .locals 1
    .param p1, "score"    # I

    .line 48
    add-int/lit8 v0, p1, 0x1

    return v0
.end method

.method private final checkScore(I)Z
    .locals 1
    .param p1, "score"    # I

    .line 52
    const/16 v0, 0x2710

    if-le p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final displayScore(II)V
    .locals 4
    .param p1, "score"    # I
    .param p2, "level"    # I

    .line 56
    sget v0, Lowasp/sat/agoat/R$id;->score:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 57
    .local v0, "scoreTv":Landroid/widget/TextView;
    sget v1, Lowasp/sat/agoat/R$id;->level:I

    invoke-virtual {p0, v1}, Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 58
    .local v1, "levelTv":Landroid/widget/TextView;
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Score "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 61
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Level "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 62
    return-void
.end method

.method private final getScoreFromSP()I
    .locals 7

    .line 73
    const/4 v0, 0x0

    .line 74
    .local v0, "score":I
    const/4 v1, 0x1

    .line 75
    .local v1, "level":I
    const-string/jumbo v2, "score"

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3}, Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 76
    .local v4, "sharedPreferences":Landroid/content/SharedPreferences;
    invoke-interface {v4, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "level"

    invoke-interface {v4, v5, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v6

    if-eqz v6, :cond_0

    .line 77
    invoke-interface {v4, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 78
    invoke-interface {v4, v5, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 80
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Score is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " and Level is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 81
    return v0
.end method

.method private static final onCreate$lambda$1(Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity;ILandroid/widget/Button;Landroid/view/View;)V
    .locals 8
    .param p0, "this$0"    # Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity;
    .param p1, "$currentLevel"    # I
    .param p2, "$ScoreButton"    # Landroid/widget/Button;
    .param p3, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p0}, Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity;->getScoreFromSP()I

    move-result v0

    .line 23
    .local v0, "scoreValue":I
    move v1, p1

    .line 24
    .local v1, "levelValue":I
    invoke-direct {p0, v0}, Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity;->calculateScore(I)I

    move-result v2

    .line 25
    .local v2, "newScore":I
    new-instance v3, Landroidx/appcompat/app/AlertDialog$Builder;

    move-object v4, p0

    check-cast v4, Landroid/content/Context;

    invoke-direct {v3, v4}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 26
    .local v3, "builder":Landroidx/appcompat/app/AlertDialog$Builder;
    const-string v4, "Hurray!"

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v3, v4}, Landroidx/appcompat/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 27
    invoke-direct {p0, v2}, Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity;->checkScore(I)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-virtual {p2, v5}, Landroid/widget/Button;->setClickable(Z)V

    .line 30
    const-string v4, "You won the game"

    move-object v5, v4

    check-cast v5, Ljava/lang/CharSequence;

    invoke-virtual {v3, v5}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 31
    const-string v5, "OK"

    check-cast v5, Ljava/lang/CharSequence;

    new-instance v6, Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity$$ExternalSyntheticLambda0;

    invoke-direct {v6}, Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity$$ExternalSyntheticLambda0;-><init>()V

    invoke-virtual {v3, v5, v6}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 34
    invoke-virtual {v3}, Landroidx/appcompat/app/AlertDialog$Builder;->create()Landroidx/appcompat/app/AlertDialog;

    move-result-object v5

    const-string v6, "builder.create()"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .local v5, "dialog":Landroidx/appcompat/app/AlertDialog;
    invoke-virtual {v5}, Landroidx/appcompat/app/AlertDialog;->show()V

    .line 36
    move-object v6, v4

    check-cast v6, Ljava/lang/CharSequence;

    invoke-virtual {p2, v6}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 37
    invoke-virtual {p0}, Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    check-cast v4, Ljava/lang/CharSequence;

    const/4 v7, 0x1

    invoke-static {v6, v4, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v4

    invoke-virtual {v4}, Landroid/widget/Toast;->show()V

    .end local v5    # "dialog":Landroidx/appcompat/app/AlertDialog;
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {p0}, Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Score is "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ". Try hard"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v4, v6, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v4

    invoke-virtual {v4}, Landroid/widget/Toast;->show()V

    .line 42
    :goto_0
    invoke-direct {p0, v2, v1}, Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity;->displayScore(II)V

    .line 43
    invoke-direct {p0, v2, v1}, Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity;->updateScoreInSP(II)V

    .line 44
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

.method private final updateScoreInSP(II)V
    .locals 3
    .param p1, "score"    # I
    .param p2, "level"    # I

    .line 65
    const/4 v0, 0x0

    const-string/jumbo v1, "score"

    invoke-virtual {p0, v1, v0}, Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 66
    .local v0, "sharedPreference":Landroid/content/SharedPreferences;
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    .line 67
    .local v2, "editor":Landroid/content/SharedPreferences$Editor;
    invoke-interface {v2, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 68
    const-string v1, "level"

    invoke-interface {v2, v1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 69
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 70
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 12
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 13
    sget v0, Lowasp/sat/agoat/R$layout;->activity_insecure_storage_shared_prefs1:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity;->setContentView(I)V

    .line 15
    invoke-direct {p0}, Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity;->getScoreFromSP()I

    move-result v0

    .line 16
    .local v0, "currentScore":I
    const-string/jumbo v1, "score"

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 17
    .local v1, "sharedPreferences":Landroid/content/SharedPreferences;
    const-string v2, "level"

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    .line 18
    .local v2, "currentLevel":I
    invoke-direct {p0, v0, v2}, Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity;->displayScore(II)V

    .line 20
    sget v3, Lowasp/sat/agoat/R$id;->getScore:I

    invoke-virtual {p0, v3}, Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    .line 21
    .local v3, "ScoreButton":Landroid/widget/Button;
    new-instance v4, Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity$$ExternalSyntheticLambda1;

    invoke-direct {v4, p0, v2, v3}, Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity$$ExternalSyntheticLambda1;-><init>(Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity;ILandroid/widget/Button;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 45
    return-void
.end method
