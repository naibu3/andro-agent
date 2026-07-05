.class public final Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivityKt;
.super Ljava/lang/Object;
.source "FinancialConnectionsSheetLiteActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u00a8\u0006\u0006"
    }
    d2 = {
        "intentBuilder",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;",
        "Landroid/content/Intent;",
        "context",
        "Landroid/content/Context;",
        "financial-connections-lite_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic $r8$lambda$X5BMU0R-OXCqZaVPjhxa6CqkpdQ(Landroid/content/Context;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;)Landroid/content/Intent;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivityKt;->intentBuilder$lambda$0(Landroid/content/Context;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static final intentBuilder(Landroid/content/Context;)Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    new-instance v0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivityKt$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivityKt$$ExternalSyntheticLambda0;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private static final intentBuilder$lambda$0(Landroid/content/Context;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;)Landroid/content/Intent;
    .locals 1

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    sget-object v0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->Companion:Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$Companion;

    invoke-virtual {v0, p0, p1}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$Companion;->intent(Landroid/content/Context;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method
