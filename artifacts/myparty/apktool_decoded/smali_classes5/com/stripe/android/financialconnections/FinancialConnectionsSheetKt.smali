.class public final Lcom/stripe/android/financialconnections/FinancialConnectionsSheetKt;
.super Ljava/lang/Object;
.source "FinancialConnectionsSheet.kt"


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
        "financial-connections_release"
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
.method public static synthetic $r8$lambda$ke-pvvd5AMil61jL8T5t1JV9ODg(Landroid/content/Context;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;)Landroid/content/Intent;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetKt;->intentBuilder$lambda$0(Landroid/content/Context;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;)Landroid/content/Intent;

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

    .line 151
    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetKt$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetKt$$ExternalSyntheticLambda0;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private static final intentBuilder$lambda$0(Landroid/content/Context;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;)Landroid/content/Intent;
    .locals 1

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    sget-object v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->Companion:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$Companion;

    invoke-virtual {v0, p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$Companion;->intent(Landroid/content/Context;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method
