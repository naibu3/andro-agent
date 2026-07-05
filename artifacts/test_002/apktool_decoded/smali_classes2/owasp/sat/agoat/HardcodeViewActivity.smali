.class public final Lowasp/sat/agoat/HardcodeViewActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "HardcodeViewActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014\u00a8\u0006\u0007"
    }
    d2 = {
        "Lowasp/sat/agoat/HardcodeViewActivity;",
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
.method public static synthetic $r8$lambda$7gvzLJE41POtI5gyi3k8ceE4FeA(Lowasp/sat/agoat/HardcodeViewActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/HardcodeViewActivity;->onCreate$lambda$0(Lowasp/sat/agoat/HardcodeViewActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$t1bdeaGzggMd-wKFnG7b-TJt5us(Lowasp/sat/agoat/HardcodeViewActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/HardcodeViewActivity;->onCreate$lambda$2(Lowasp/sat/agoat/HardcodeViewActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$upQ1jYIpsbXRbcHLlka5_J6WlX0(Lowasp/sat/agoat/HardcodeViewActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/HardcodeViewActivity;->onCreate$lambda$1(Lowasp/sat/agoat/HardcodeViewActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private static final onCreate$lambda$0(Lowasp/sat/agoat/HardcodeViewActivity;Landroid/view/View;)V
    .locals 3
    .param p0, "this$0"    # Lowasp/sat/agoat/HardcodeViewActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lowasp/sat/agoat/HardCodeActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 26
    .local v0, "intent":Landroid/content/Intent;
    invoke-virtual {p0, v0}, Lowasp/sat/agoat/HardcodeViewActivity;->startActivity(Landroid/content/Intent;)V

    .line 27
    return-void
.end method

.method private static final onCreate$lambda$1(Lowasp/sat/agoat/HardcodeViewActivity;Landroid/view/View;)V
    .locals 3
    .param p0, "this$0"    # Lowasp/sat/agoat/HardcodeViewActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lowasp/sat/agoat/AIChatActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 31
    .local v0, "intent":Landroid/content/Intent;
    invoke-virtual {p0, v0}, Lowasp/sat/agoat/HardcodeViewActivity;->startActivity(Landroid/content/Intent;)V

    .line 32
    return-void
.end method

.method private static final onCreate$lambda$2(Lowasp/sat/agoat/HardcodeViewActivity;Landroid/view/View;)V
    .locals 3
    .param p0, "this$0"    # Lowasp/sat/agoat/HardcodeViewActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lowasp/sat/agoat/CloudServicesActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 36
    .local v0, "intent":Landroid/content/Intent;
    invoke-virtual {p0, v0}, Lowasp/sat/agoat/HardcodeViewActivity;->startActivity(Landroid/content/Intent;)V

    .line 37
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 17
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 18
    sget v0, Lowasp/sat/agoat/R$layout;->activity_hardcode_view:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/HardcodeViewActivity;->setContentView(I)V

    .line 19
    sget v0, Lowasp/sat/agoat/R$id;->buyProductButton:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/HardcodeViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 20
    .local v0, "buyProductButton":Landroid/widget/Button;
    sget v1, Lowasp/sat/agoat/R$id;->aiChatButton:I

    invoke-virtual {p0, v1}, Lowasp/sat/agoat/HardcodeViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    .line 21
    .local v1, "aiChatButton":Landroid/widget/Button;
    sget v2, Lowasp/sat/agoat/R$id;->CloudButton:I

    invoke-virtual {p0, v2}, Lowasp/sat/agoat/HardcodeViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    .line 24
    .local v2, "cloudServiceButton":Landroid/widget/Button;
    new-instance v3, Lowasp/sat/agoat/HardcodeViewActivity$$ExternalSyntheticLambda0;

    invoke-direct {v3, p0}, Lowasp/sat/agoat/HardcodeViewActivity$$ExternalSyntheticLambda0;-><init>(Lowasp/sat/agoat/HardcodeViewActivity;)V

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29
    new-instance v3, Lowasp/sat/agoat/HardcodeViewActivity$$ExternalSyntheticLambda1;

    invoke-direct {v3, p0}, Lowasp/sat/agoat/HardcodeViewActivity$$ExternalSyntheticLambda1;-><init>(Lowasp/sat/agoat/HardcodeViewActivity;)V

    invoke-virtual {v1, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 34
    new-instance v3, Lowasp/sat/agoat/HardcodeViewActivity$$ExternalSyntheticLambda2;

    invoke-direct {v3, p0}, Lowasp/sat/agoat/HardcodeViewActivity$$ExternalSyntheticLambda2;-><init>(Lowasp/sat/agoat/HardcodeViewActivity;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    return-void
.end method
