.class public final Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteRedirectActivity;
.super Landroidx/activity/ComponentActivity;
.source "FinancialConnectionsSheetLiteRedirectActivity.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFinancialConnectionsSheetLiteRedirectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSheetLiteRedirectActivity.kt\ncom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteRedirectActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\u000e\u0010\u0008\u001a\u0004\u0018\u00010\t*\u00020\nH\u0002J\u000c\u0010\u000b\u001a\u00020\u000c*\u00020\nH\u0002\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteRedirectActivity;",
        "Landroidx/activity/ComponentActivity;",
        "<init>",
        "()V",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "toIntent",
        "Landroid/content/Intent;",
        "Landroid/net/Uri;",
        "isFinancialConnectionsScheme",
        "",
        "financial-connections-lite_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

    return-void
.end method

.method private final isFinancialConnectionsScheme(Landroid/net/Uri;)Z
    .locals 1

    .line 41
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p1

    const-string v0, "stripe"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private final toIntent(Landroid/net/Uri;)Landroid/content/Intent;
    .locals 2

    .line 31
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteRedirectActivity;->isFinancialConnectionsScheme(Landroid/net/Uri;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object p1, v0

    goto :goto_0

    .line 32
    :cond_0
    const-class p1, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;

    :goto_0
    if-eqz p1, :cond_1

    .line 34
    new-instance v0, Landroid/content/Intent;

    .line 35
    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    .line 34
    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    :cond_1
    return-object v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 14
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 19
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteRedirectActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 20
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteRedirectActivity;->toIntent(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    const/high16 v1, 0x24000000

    .line 21
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 22
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 23
    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteRedirectActivity;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method
