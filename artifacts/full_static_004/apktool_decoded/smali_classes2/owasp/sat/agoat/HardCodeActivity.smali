.class public final Lowasp/sat/agoat/HardCodeActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "HardCodeActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lowasp/sat/agoat/HardCodeActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "promoCode",
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
.field private final promoCode:Ljava/lang/String;


# direct methods
.method public static synthetic $r8$lambda$BjBmOjcSefxtQTAYylgYV0_N9dk(Landroid/widget/EditText;Lowasp/sat/agoat/HardCodeActivity;Landroid/widget/TextView;Landroidx/appcompat/app/AlertDialog$Builder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lowasp/sat/agoat/HardCodeActivity;->onCreate$lambda$1(Landroid/widget/EditText;Lowasp/sat/agoat/HardCodeActivity;Landroid/widget/TextView;Landroidx/appcompat/app/AlertDialog$Builder;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$DNzVak68POIpC2HksUC10_xqFPw(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/HardCodeActivity;->onCreate$lambda$1$lambda$0(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 13
    const-string v0, "NEW2019"

    iput-object v0, p0, Lowasp/sat/agoat/HardCodeActivity;->promoCode:Ljava/lang/String;

    .line 11
    return-void
.end method

.method private static final onCreate$lambda$1(Landroid/widget/EditText;Lowasp/sat/agoat/HardCodeActivity;Landroid/widget/TextView;Landroidx/appcompat/app/AlertDialog$Builder;Landroid/view/View;)V
    .locals 3
    .param p0, "$promoCodeValue"    # Landroid/widget/EditText;
    .param p1, "this$0"    # Lowasp/sat/agoat/HardCodeActivity;
    .param p2, "$priceValue"    # Landroid/widget/TextView;
    .param p3, "$builder"    # Landroidx/appcompat/app/AlertDialog$Builder;
    .param p4, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$builder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lowasp/sat/agoat/HardCodeActivity;->promoCode:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 25
    const-string v0, "0"

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    const-string v0, "Congratulations! You got this product for free"

    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {p3, v1}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 27
    move-object v1, p1

    check-cast v1, Landroid/content/Context;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 29
    :cond_0
    const-string v0, "Sorry! Incorrect Promocode was entered"

    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {p3, v1}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 30
    move-object v1, p1

    check-cast v1, Landroid/content/Context;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 31
    const-string v0, "2000"

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    :goto_0
    const-string v0, "OK"

    check-cast v0, Ljava/lang/CharSequence;

    new-instance v1, Lowasp/sat/agoat/HardCodeActivity$$ExternalSyntheticLambda1;

    invoke-direct {v1}, Lowasp/sat/agoat/HardCodeActivity$$ExternalSyntheticLambda1;-><init>()V

    invoke-virtual {p3, v0, v1}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 36
    invoke-virtual {p3}, Landroidx/appcompat/app/AlertDialog$Builder;->create()Landroidx/appcompat/app/AlertDialog;

    move-result-object v0

    const-string v1, "builder.create()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .local v0, "dialog":Landroidx/appcompat/app/AlertDialog;
    invoke-virtual {v0}, Landroidx/appcompat/app/AlertDialog;->show()V

    .line 38
    return-void
.end method

.method private static final onCreate$lambda$1$lambda$0(Landroid/content/DialogInterface;I)V
    .locals 0
    .param p0, "dialog"    # Landroid/content/DialogInterface;

    .line 34
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 35
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 16
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 17
    sget v0, Lowasp/sat/agoat/R$layout;->activity_hard_code:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/HardCodeActivity;->setContentView(I)V

    .line 18
    sget v0, Lowasp/sat/agoat/R$id;->hardcode1:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/HardCodeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 19
    .local v0, "verifyButton":Landroid/widget/Button;
    sget v1, Lowasp/sat/agoat/R$id;->price:I

    invoke-virtual {p0, v1}, Lowasp/sat/agoat/HardCodeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 20
    .local v1, "priceValue":Landroid/widget/TextView;
    sget v2, Lowasp/sat/agoat/R$id;->promocode:I

    invoke-virtual {p0, v2}, Lowasp/sat/agoat/HardCodeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    .line 21
    .local v2, "promoCodeValue":Landroid/widget/EditText;
    new-instance v3, Landroidx/appcompat/app/AlertDialog$Builder;

    move-object v4, p0

    check-cast v4, Landroid/content/Context;

    invoke-direct {v3, v4}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 22
    .local v3, "builder":Landroidx/appcompat/app/AlertDialog$Builder;
    const-string v4, "Alert!"

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v3, v4}, Landroidx/appcompat/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 23
    new-instance v4, Lowasp/sat/agoat/HardCodeActivity$$ExternalSyntheticLambda0;

    invoke-direct {v4, v2, p0, v1, v3}, Lowasp/sat/agoat/HardCodeActivity$$ExternalSyntheticLambda0;-><init>(Landroid/widget/EditText;Lowasp/sat/agoat/HardCodeActivity;Landroid/widget/TextView;Landroidx/appcompat/app/AlertDialog$Builder;)V

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 40
    return-void
.end method
