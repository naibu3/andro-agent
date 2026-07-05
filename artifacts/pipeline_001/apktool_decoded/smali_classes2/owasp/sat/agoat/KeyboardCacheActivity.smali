.class public final Lowasp/sat/agoat/KeyboardCacheActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "KeyboardCacheActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014\u00a8\u0006\u0007"
    }
    d2 = {
        "Lowasp/sat/agoat/KeyboardCacheActivity;",
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
.method public static synthetic $r8$lambda$3CiaVASdlnoYL7tTo3a5AucO0NQ(Lowasp/sat/agoat/KeyboardCacheActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/KeyboardCacheActivity;->onCreate$lambda$0(Lowasp/sat/agoat/KeyboardCacheActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private static final onCreate$lambda$0(Lowasp/sat/agoat/KeyboardCacheActivity;Landroid/view/View;)V
    .locals 3
    .param p0, "this$0"    # Lowasp/sat/agoat/KeyboardCacheActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-virtual {p0}, Lowasp/sat/agoat/KeyboardCacheActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "Please wait while verifying your credentials"

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 20
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 12
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 13
    sget v0, Lowasp/sat/agoat/R$layout;->activity_keyboard_cache:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/KeyboardCacheActivity;->setContentView(I)V

    .line 14
    sget v0, Lowasp/sat/agoat/R$id;->userName:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/KeyboardCacheActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    .line 15
    .local v0, "username":Landroid/widget/EditText;
    sget v1, Lowasp/sat/agoat/R$id;->password:I

    invoke-virtual {p0, v1}, Lowasp/sat/agoat/KeyboardCacheActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    .line 16
    .local v1, "password":Landroid/widget/EditText;
    sget v2, Lowasp/sat/agoat/R$id;->Logging1:I

    invoke-virtual {p0, v2}, Lowasp/sat/agoat/KeyboardCacheActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    .line 18
    .local v2, "loginButton":Landroid/widget/Button;
    new-instance v3, Lowasp/sat/agoat/KeyboardCacheActivity$$ExternalSyntheticLambda0;

    invoke-direct {v3, p0}, Lowasp/sat/agoat/KeyboardCacheActivity$$ExternalSyntheticLambda0;-><init>(Lowasp/sat/agoat/KeyboardCacheActivity;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    return-void
.end method
