.class public final Lowasp/sat/agoat/BinaryPatchingActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "BinaryPatchingActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lowasp/sat/agoat/BinaryPatchingActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "isAdmin",
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
.field private final isAdmin:Z


# direct methods
.method public static synthetic $r8$lambda$wNsKbx2cESar0-T24GGQegJ6xIw(Lowasp/sat/agoat/BinaryPatchingActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/BinaryPatchingActivity;->onCreate$lambda$0(Lowasp/sat/agoat/BinaryPatchingActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private static final onCreate$lambda$0(Lowasp/sat/agoat/BinaryPatchingActivity;Landroid/view/View;)V
    .locals 3
    .param p0, "this$0"    # Lowasp/sat/agoat/BinaryPatchingActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    const-string v1, "You clicked on Administration button"

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 26
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 13
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 14
    sget v0, Lowasp/sat/agoat/R$layout;->activity_binary_patching:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/BinaryPatchingActivity;->setContentView(I)V

    .line 15
    sget v0, Lowasp/sat/agoat/R$id;->isAdminText:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/BinaryPatchingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 16
    .local v0, "isAdminText":Landroid/widget/TextView;
    sget v1, Lowasp/sat/agoat/R$id;->adminButton:I

    invoke-virtual {p0, v1}, Lowasp/sat/agoat/BinaryPatchingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    .line 18
    .local v1, "adminButton":Landroid/widget/Button;
    iget-boolean v2, p0, Lowasp/sat/agoat/BinaryPatchingActivity;->isAdmin:Z

    if-eqz v2, :cond_0

    .line 19
    const-string v2, "You are Admin Now"

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    const-string v2, "#000000"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundColor(I)V

    .line 21
    const-string v2, "#FFFFFF"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V

    .line 22
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setEnabled(Z)V

    .line 24
    :cond_0
    new-instance v2, Lowasp/sat/agoat/BinaryPatchingActivity$$ExternalSyntheticLambda0;

    invoke-direct {v2, p0}, Lowasp/sat/agoat/BinaryPatchingActivity$$ExternalSyntheticLambda0;-><init>(Lowasp/sat/agoat/BinaryPatchingActivity;)V

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 27
    return-void
.end method
