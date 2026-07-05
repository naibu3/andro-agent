.class public final Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$setupBackButtonHandling$1;
.super Landroidx/activity/OnBackPressedCallback;
.source "FinancialConnectionsSheetLiteActivity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->setupBackButtonHandling()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "com/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$setupBackButtonHandling$1",
        "Landroidx/activity/OnBackPressedCallback;",
        "handleOnBackPressed",
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


# instance fields
.field final synthetic this$0:Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;


# direct methods
.method public static synthetic $r8$lambda$D6-_Jkrfl5OJ1aU1O0n8VWMTWJo(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$setupBackButtonHandling$1;->handleOnBackPressed$lambda$1(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic $r8$lambda$DGZjP9fvtdBB2a5VTNIo4RzXc-A(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$setupBackButtonHandling$1;->handleOnBackPressed$lambda$0(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method constructor <init>(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$setupBackButtonHandling$1;->this$0:Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;

    const/4 p1, 0x1

    .line 68
    invoke-direct {p0, p1}, Landroidx/activity/OnBackPressedCallback;-><init>(Z)V

    return-void
.end method

.method private static final handleOnBackPressed$lambda$0(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 76
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->finish()V

    return-void
.end method

.method private static final handleOnBackPressed$lambda$1(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 79
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method


# virtual methods
.method public handleOnBackPressed()V
    .locals 4

    .line 71
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$setupBackButtonHandling$1;->this$0:Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 72
    sget v1, Lcom/stripe/android/financialconnections/lite/R$string;->stripe_fc_lite_exit_title:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 73
    sget v1, Lcom/stripe/android/financialconnections/lite/R$string;->stripe_fc_lite_exit_message:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const/4 v1, 0x1

    .line 74
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 75
    sget v1, Lcom/stripe/android/financialconnections/lite/R$string;->stripe_fc_lite_exit_confirm:I

    iget-object v2, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$setupBackButtonHandling$1;->this$0:Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;

    new-instance v3, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$setupBackButtonHandling$1$$ExternalSyntheticLambda0;

    invoke-direct {v3, v2}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$setupBackButtonHandling$1$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;)V

    invoke-virtual {v0, v1, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 78
    sget v1, Lcom/stripe/android/financialconnections/lite/R$string;->stripe_fc_lite_exit_cancel:I

    new-instance v2, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$setupBackButtonHandling$1$$ExternalSyntheticLambda1;

    invoke-direct {v2}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$setupBackButtonHandling$1$$ExternalSyntheticLambda1;-><init>()V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 81
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 82
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    return-void
.end method
