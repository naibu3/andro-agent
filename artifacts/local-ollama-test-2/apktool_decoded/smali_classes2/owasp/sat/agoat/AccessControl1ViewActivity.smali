.class public final Lowasp/sat/agoat/AccessControl1ViewActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "AccessControl1ViewActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014\u00a8\u0006\u0007"
    }
    d2 = {
        "Lowasp/sat/agoat/AccessControl1ViewActivity;",
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
.method public static synthetic $r8$lambda$geolQGm6nu24EooSHG7juMR2I1g(Lowasp/sat/agoat/AccessControl1ViewActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/AccessControl1ViewActivity;->onCreate$lambda$0(Lowasp/sat/agoat/AccessControl1ViewActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private static final onCreate$lambda$0(Lowasp/sat/agoat/AccessControl1ViewActivity;Landroid/view/View;)V
    .locals 3
    .param p0, "this$0"    # Lowasp/sat/agoat/AccessControl1ViewActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lowasp/sat/agoat/DownloadInvoiceService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 16
    .local v0, "serviceIntent":Landroid/content/Intent;
    invoke-virtual {p0, v0}, Lowasp/sat/agoat/AccessControl1ViewActivity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 17
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 11
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 12
    sget v0, Lowasp/sat/agoat/R$layout;->activity_access_control1_view:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/AccessControl1ViewActivity;->setContentView(I)V

    .line 13
    sget v0, Lowasp/sat/agoat/R$id;->downLoad:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/AccessControl1ViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 14
    .local v0, "downloadInvoice":Landroid/widget/Button;
    new-instance v1, Lowasp/sat/agoat/AccessControl1ViewActivity$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lowasp/sat/agoat/AccessControl1ViewActivity$$ExternalSyntheticLambda0;-><init>(Lowasp/sat/agoat/AccessControl1ViewActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    return-void
.end method
