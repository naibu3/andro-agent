.class public final Lowasp/sat/agoat/InsecureStorageActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "InsecureStorageActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014\u00a8\u0006\u0007"
    }
    d2 = {
        "Lowasp/sat/agoat/InsecureStorageActivity;",
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
.method public static synthetic $r8$lambda$2jqdoNlX-Taek_eFGhlVWiuPjIM(Lowasp/sat/agoat/InsecureStorageActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/InsecureStorageActivity;->onCreate$lambda$2(Lowasp/sat/agoat/InsecureStorageActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$Cx7HtTAx_shX0j79gs0nBbW935I(Lowasp/sat/agoat/InsecureStorageActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/InsecureStorageActivity;->onCreate$lambda$3(Lowasp/sat/agoat/InsecureStorageActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$Jne-oMQQdHnuEoCM_cXlc7vMNnc(Lowasp/sat/agoat/InsecureStorageActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/InsecureStorageActivity;->onCreate$lambda$0(Lowasp/sat/agoat/InsecureStorageActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$eB2zoLOF8BBfKClgUSr6WpDvk_s(Lowasp/sat/agoat/InsecureStorageActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/InsecureStorageActivity;->onCreate$lambda$1(Lowasp/sat/agoat/InsecureStorageActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$upOM7w6q4tni1np6BGtnPkB7u8g(Lowasp/sat/agoat/InsecureStorageActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/InsecureStorageActivity;->onCreate$lambda$4(Lowasp/sat/agoat/InsecureStorageActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private static final onCreate$lambda$0(Lowasp/sat/agoat/InsecureStorageActivity;Landroid/view/View;)V
    .locals 3
    .param p0, "this$0"    # Lowasp/sat/agoat/InsecureStorageActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lowasp/sat/agoat/InsecureStorageSharedPrefs;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/InsecureStorageActivity;->startActivity(Landroid/content/Intent;)V

    .line 16
    return-void
.end method

.method private static final onCreate$lambda$1(Lowasp/sat/agoat/InsecureStorageActivity;Landroid/view/View;)V
    .locals 3
    .param p0, "this$0"    # Lowasp/sat/agoat/InsecureStorageActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lowasp/sat/agoat/InsecureStorageSharedPrefs1Activity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/InsecureStorageActivity;->startActivity(Landroid/content/Intent;)V

    .line 21
    return-void
.end method

.method private static final onCreate$lambda$2(Lowasp/sat/agoat/InsecureStorageActivity;Landroid/view/View;)V
    .locals 3
    .param p0, "this$0"    # Lowasp/sat/agoat/InsecureStorageActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lowasp/sat/agoat/InsecureStorageSQLiteActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/InsecureStorageActivity;->startActivity(Landroid/content/Intent;)V

    .line 26
    return-void
.end method

.method private static final onCreate$lambda$3(Lowasp/sat/agoat/InsecureStorageActivity;Landroid/view/View;)V
    .locals 3
    .param p0, "this$0"    # Lowasp/sat/agoat/InsecureStorageActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lowasp/sat/agoat/InsecureStorageTempActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/InsecureStorageActivity;->startActivity(Landroid/content/Intent;)V

    .line 31
    return-void
.end method

.method private static final onCreate$lambda$4(Lowasp/sat/agoat/InsecureStorageActivity;Landroid/view/View;)V
    .locals 3
    .param p0, "this$0"    # Lowasp/sat/agoat/InsecureStorageActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lowasp/sat/agoat/InsecureStorageSDCardActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/InsecureStorageActivity;->startActivity(Landroid/content/Intent;)V

    .line 36
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 11
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 12
    sget v0, Lowasp/sat/agoat/R$layout;->activity_insecure_storage:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/InsecureStorageActivity;->setContentView(I)V

    .line 13
    sget v0, Lowasp/sat/agoat/R$id;->SPButton:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/InsecureStorageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 14
    .local v0, "spButton":Landroid/widget/Button;
    new-instance v1, Lowasp/sat/agoat/InsecureStorageActivity$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lowasp/sat/agoat/InsecureStorageActivity$$ExternalSyntheticLambda0;-><init>(Lowasp/sat/agoat/InsecureStorageActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    sget v1, Lowasp/sat/agoat/R$id;->SP1Button:I

    invoke-virtual {p0, v1}, Lowasp/sat/agoat/InsecureStorageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    .line 19
    .local v1, "sp1Button":Landroid/widget/Button;
    new-instance v2, Lowasp/sat/agoat/InsecureStorageActivity$$ExternalSyntheticLambda1;

    invoke-direct {v2, p0}, Lowasp/sat/agoat/InsecureStorageActivity$$ExternalSyntheticLambda1;-><init>(Lowasp/sat/agoat/InsecureStorageActivity;)V

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    sget v2, Lowasp/sat/agoat/R$id;->SQLButton:I

    invoke-virtual {p0, v2}, Lowasp/sat/agoat/InsecureStorageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    .line 24
    .local v2, "sqlButton":Landroid/widget/Button;
    new-instance v3, Lowasp/sat/agoat/InsecureStorageActivity$$ExternalSyntheticLambda2;

    invoke-direct {v3, p0}, Lowasp/sat/agoat/InsecureStorageActivity$$ExternalSyntheticLambda2;-><init>(Lowasp/sat/agoat/InsecureStorageActivity;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 28
    sget v3, Lowasp/sat/agoat/R$id;->tempButton:I

    invoke-virtual {p0, v3}, Lowasp/sat/agoat/InsecureStorageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    .line 29
    .local v3, "tempButton":Landroid/widget/Button;
    new-instance v4, Lowasp/sat/agoat/InsecureStorageActivity$$ExternalSyntheticLambda3;

    invoke-direct {v4, p0}, Lowasp/sat/agoat/InsecureStorageActivity$$ExternalSyntheticLambda3;-><init>(Lowasp/sat/agoat/InsecureStorageActivity;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 33
    sget v4, Lowasp/sat/agoat/R$id;->SDcardButton:I

    invoke-virtual {p0, v4}, Lowasp/sat/agoat/InsecureStorageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    .line 34
    .local v4, "sDcardButton":Landroid/widget/Button;
    new-instance v5, Lowasp/sat/agoat/InsecureStorageActivity$$ExternalSyntheticLambda4;

    invoke-direct {v5, p0}, Lowasp/sat/agoat/InsecureStorageActivity$$ExternalSyntheticLambda4;-><init>(Lowasp/sat/agoat/InsecureStorageActivity;)V

    invoke-virtual {v4, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 37
    return-void
.end method
