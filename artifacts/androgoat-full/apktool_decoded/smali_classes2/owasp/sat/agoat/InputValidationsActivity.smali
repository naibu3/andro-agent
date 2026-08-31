.class public final Lowasp/sat/agoat/InputValidationsActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "InputValidationsActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014\u00a8\u0006\u0007"
    }
    d2 = {
        "Lowasp/sat/agoat/InputValidationsActivity;",
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
.method public static synthetic $r8$lambda$3hgWgwQ0ArD2GM202_HEgW_djT8(Lowasp/sat/agoat/InputValidationsActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/InputValidationsActivity;->onCreate$lambda$1(Lowasp/sat/agoat/InputValidationsActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$IGypnCBMNCXnWGA_Y6J6iIlRRS0(Lowasp/sat/agoat/InputValidationsActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/InputValidationsActivity;->onCreate$lambda$2(Lowasp/sat/agoat/InputValidationsActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$pFQN-0aEYVVyyYVpvG7-Irv10cs(Lowasp/sat/agoat/InputValidationsActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/InputValidationsActivity;->onCreate$lambda$3(Lowasp/sat/agoat/InputValidationsActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$x9YiFPT82NMtrt61lLM9Avvb0U0(Lowasp/sat/agoat/InputValidationsActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/InputValidationsActivity;->onCreate$lambda$0(Lowasp/sat/agoat/InputValidationsActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private static final onCreate$lambda$0(Lowasp/sat/agoat/InputValidationsActivity;Landroid/view/View;)V
    .locals 3
    .param p0, "this$0"    # Lowasp/sat/agoat/InputValidationsActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lowasp/sat/agoat/XSSActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/InputValidationsActivity;->startActivity(Landroid/content/Intent;)V

    .line 17
    return-void
.end method

.method private static final onCreate$lambda$1(Lowasp/sat/agoat/InputValidationsActivity;Landroid/view/View;)V
    .locals 3
    .param p0, "this$0"    # Lowasp/sat/agoat/InputValidationsActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lowasp/sat/agoat/SQLinjectionActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/InputValidationsActivity;->startActivity(Landroid/content/Intent;)V

    .line 22
    return-void
.end method

.method private static final onCreate$lambda$2(Lowasp/sat/agoat/InputValidationsActivity;Landroid/view/View;)V
    .locals 3
    .param p0, "this$0"    # Lowasp/sat/agoat/InputValidationsActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lowasp/sat/agoat/InputValidationsWebViewURLActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/InputValidationsActivity;->startActivity(Landroid/content/Intent;)V

    .line 27
    return-void
.end method

.method private static final onCreate$lambda$3(Lowasp/sat/agoat/InputValidationsActivity;Landroid/view/View;)V
    .locals 3
    .param p0, "this$0"    # Lowasp/sat/agoat/InputValidationsActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lowasp/sat/agoat/QRCodeXSSActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/InputValidationsActivity;->startActivity(Landroid/content/Intent;)V

    .line 32
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 11
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 12
    sget v0, Lowasp/sat/agoat/R$layout;->activity_input_validations:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/InputValidationsActivity;->setContentView(I)V

    .line 14
    sget v0, Lowasp/sat/agoat/R$id;->xssBtn:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/InputValidationsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 15
    .local v0, "xssBtn":Landroid/widget/Button;
    new-instance v1, Lowasp/sat/agoat/InputValidationsActivity$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lowasp/sat/agoat/InputValidationsActivity$$ExternalSyntheticLambda0;-><init>(Lowasp/sat/agoat/InputValidationsActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    sget v1, Lowasp/sat/agoat/R$id;->sqliButton:I

    invoke-virtual {p0, v1}, Lowasp/sat/agoat/InputValidationsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    .line 20
    .local v1, "sqliButton":Landroid/widget/Button;
    new-instance v2, Lowasp/sat/agoat/InputValidationsActivity$$ExternalSyntheticLambda1;

    invoke-direct {v2, p0}, Lowasp/sat/agoat/InputValidationsActivity$$ExternalSyntheticLambda1;-><init>(Lowasp/sat/agoat/InputValidationsActivity;)V

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    sget v2, Lowasp/sat/agoat/R$id;->wbUrl:I

    invoke-virtual {p0, v2}, Lowasp/sat/agoat/InputValidationsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    .line 25
    .local v2, "wbUrl":Landroid/widget/Button;
    new-instance v3, Lowasp/sat/agoat/InputValidationsActivity$$ExternalSyntheticLambda2;

    invoke-direct {v3, p0}, Lowasp/sat/agoat/InputValidationsActivity$$ExternalSyntheticLambda2;-><init>(Lowasp/sat/agoat/InputValidationsActivity;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29
    sget v3, Lowasp/sat/agoat/R$id;->qrcode:I

    invoke-virtual {p0, v3}, Lowasp/sat/agoat/InputValidationsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    .line 30
    .local v3, "qrcode":Landroid/widget/Button;
    new-instance v4, Lowasp/sat/agoat/InputValidationsActivity$$ExternalSyntheticLambda3;

    invoke-direct {v4, p0}, Lowasp/sat/agoat/InputValidationsActivity$$ExternalSyntheticLambda3;-><init>(Lowasp/sat/agoat/InputValidationsActivity;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 33
    return-void
.end method
