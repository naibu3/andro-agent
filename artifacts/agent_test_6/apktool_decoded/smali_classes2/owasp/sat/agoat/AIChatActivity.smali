.class public final Lowasp/sat/agoat/AIChatActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "AIChatActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lowasp/sat/agoat/AIChatActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "openAIApiKey",
        "",
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
.field private final openAIApiKey:Ljava/lang/String;


# direct methods
.method public static synthetic $r8$lambda$f2z4AXJ0Rl_QW2XF-i7nLRrK3Zo(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/AIChatActivity;->onCreate$lambda$1$lambda$0(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic $r8$lambda$srxQlDilYeQ3I4mV_1_ssjmKDwc(Landroidx/appcompat/app/AlertDialog$Builder;Lowasp/sat/agoat/AIChatActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lowasp/sat/agoat/AIChatActivity;->onCreate$lambda$1(Landroidx/appcompat/app/AlertDialog$Builder;Lowasp/sat/agoat/AIChatActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 11
    const-string/jumbo v0, "sk-abcdef1234567890abcdef1234567890abcdef12"

    iput-object v0, p0, Lowasp/sat/agoat/AIChatActivity;->openAIApiKey:Ljava/lang/String;

    .line 9
    return-void
.end method

.method private static final onCreate$lambda$1(Landroidx/appcompat/app/AlertDialog$Builder;Lowasp/sat/agoat/AIChatActivity;Landroid/view/View;)V
    .locals 6
    .param p0, "$builder"    # Landroidx/appcompat/app/AlertDialog$Builder;
    .param p1, "this$0"    # Lowasp/sat/agoat/AIChatActivity;
    .param p2, "it"    # Landroid/view/View;

    const-string v0, "$builder"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    iget-object v0, p1, Lowasp/sat/agoat/AIChatActivity;->openAIApiKey:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Connected to OpenAI using key "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ". Please finish the objective"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 23
    const-string v0, "OK"

    check-cast v0, Ljava/lang/CharSequence;

    new-instance v2, Lowasp/sat/agoat/AIChatActivity$$ExternalSyntheticLambda1;

    invoke-direct {v2}, Lowasp/sat/agoat/AIChatActivity$$ExternalSyntheticLambda1;-><init>()V

    invoke-virtual {p0, v0, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 26
    invoke-virtual {p0}, Landroidx/appcompat/app/AlertDialog$Builder;->create()Landroidx/appcompat/app/AlertDialog;

    move-result-object v0

    const-string v2, "builder.create()"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .local v0, "dialog":Landroidx/appcompat/app/AlertDialog;
    invoke-virtual {v0}, Landroidx/appcompat/app/AlertDialog;->show()V

    .line 28
    move-object v2, p1

    check-cast v2, Landroid/content/Context;

    iget-object v3, p1, Lowasp/sat/agoat/AIChatActivity;->openAIApiKey:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Connected to OpenAI using key"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v3, 0x1

    invoke-static {v2, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 29
    return-void
.end method

.method private static final onCreate$lambda$1$lambda$0(Landroid/content/DialogInterface;I)V
    .locals 0
    .param p0, "dialog"    # Landroid/content/DialogInterface;

    .line 24
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 25
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 14
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 15
    sget v0, Lowasp/sat/agoat/R$layout;->activity_ai_chat:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/AIChatActivity;->setContentView(I)V

    .line 17
    sget v0, Lowasp/sat/agoat/R$id;->promptEditText:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/AIChatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    .line 18
    .local v0, "promptEditText":Landroid/widget/EditText;
    sget v1, Lowasp/sat/agoat/R$id;->postButton:I

    invoke-virtual {p0, v1}, Lowasp/sat/agoat/AIChatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    .line 19
    .local v1, "postButton":Landroid/widget/Button;
    new-instance v2, Landroidx/appcompat/app/AlertDialog$Builder;

    move-object v3, p0

    check-cast v3, Landroid/content/Context;

    invoke-direct {v2, v3}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 20
    .local v2, "builder":Landroidx/appcompat/app/AlertDialog$Builder;
    const-string v3, "Login"

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Landroidx/appcompat/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 21
    new-instance v3, Lowasp/sat/agoat/AIChatActivity$$ExternalSyntheticLambda0;

    invoke-direct {v3, v2, p0}, Lowasp/sat/agoat/AIChatActivity$$ExternalSyntheticLambda0;-><init>(Landroidx/appcompat/app/AlertDialog$Builder;Lowasp/sat/agoat/AIChatActivity;)V

    invoke-virtual {v1, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 30
    return-void
.end method
