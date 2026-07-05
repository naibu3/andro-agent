.class public final Lcom/stripe/android/payments/bankaccount/domain/BuildFinancialConnectionsLauncher;
.super Ljava/lang/Object;
.source "BuildFinancialConnectionsLauncher.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JI\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\rH\u0086\u0002\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/payments/bankaccount/domain/BuildFinancialConnectionsLauncher;",
        "",
        "<init>",
        "()V",
        "invoke",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;",
        "activity",
        "Landroidx/activity/ComponentActivity;",
        "configuration",
        "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;",
        "financialConnectionsAvailability",
        "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;",
        "onConnectionsForInstantDebitsResult",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult;",
        "",
        "onConnectionsForACHResult",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/payments/bankaccount/domain/BuildFinancialConnectionsLauncher;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/payments/bankaccount/domain/BuildFinancialConnectionsLauncher;

    invoke-direct {v0}, Lcom/stripe/android/payments/bankaccount/domain/BuildFinancialConnectionsLauncher;-><init>()V

    sput-object v0, Lcom/stripe/android/payments/bankaccount/domain/BuildFinancialConnectionsLauncher;->INSTANCE:Lcom/stripe/android/payments/bankaccount/domain/BuildFinancialConnectionsLauncher;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/activity/ComponentActivity;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/activity/ComponentActivity;",
            "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;",
            "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;"
        }
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "financialConnectionsAvailability"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onConnectionsForInstantDebitsResult"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onConnectionsForACHResult"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    instance-of v0, p2, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;

    if-eqz v0, :cond_0

    .line 25
    move-object p2, p1

    check-cast p2, Landroid/content/Context;

    invoke-static {p3, p2}, Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailabilityKt;->getIntentBuilder(Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Landroid/content/Context;)Lkotlin/jvm/functions/Function1;

    move-result-object p2

    .line 22
    new-instance p3, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForInstantDebitsLauncher;

    invoke-direct {p3, p1, p2, p4}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForInstantDebitsLauncher;-><init>(Landroidx/activity/ComponentActivity;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    check-cast p3, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;

    return-object p3

    .line 28
    :cond_0
    instance-of p4, p2, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;

    if-nez p4, :cond_2

    .line 29
    instance-of p2, p2, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccountInternal;

    if-eqz p2, :cond_1

    goto :goto_0

    .line 21
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 29
    :cond_2
    :goto_0
    new-instance p2, Lcom/stripe/android/payments/bankaccount/domain/BuildFinancialConnectionsLauncher$sam$com_stripe_android_financialconnections_FinancialConnectionsSheetResultCallback$0;

    .line 31
    invoke-direct {p2, p5}, Lcom/stripe/android/payments/bankaccount/domain/BuildFinancialConnectionsLauncher$sam$com_stripe_android_financialconnections_FinancialConnectionsSheetResultCallback$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    check-cast p2, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultCallback;

    .line 32
    move-object p4, p1

    check-cast p4, Landroid/content/Context;

    invoke-static {p3, p4}, Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailabilityKt;->getIntentBuilder(Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Landroid/content/Context;)Lkotlin/jvm/functions/Function1;

    move-result-object p3

    .line 29
    new-instance p4, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForDataLauncher;

    invoke-direct {p4, p1, p3, p2}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForDataLauncher;-><init>(Landroidx/activity/ComponentActivity;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultCallback;)V

    check-cast p4, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;

    return-object p4
.end method
