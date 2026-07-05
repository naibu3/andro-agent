.class public final Lcom/stripe/android/payments/bankaccount/CollectBankAccountForInstantDebitsLauncher$Companion;
.super Ljava/lang/Object;
.source "CollectBankAccountForInstantDebitsLauncher.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/bankaccount/CollectBankAccountForInstantDebitsLauncher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0008\u0087\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J6\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00052\u0008\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/payments/bankaccount/CollectBankAccountForInstantDebitsLauncher$Companion;",
        "",
        "<init>",
        "()V",
        "LAUNCHER_KEY",
        "",
        "createForPaymentSheet",
        "Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;",
        "hostedSurface",
        "financialConnectionsAvailability",
        "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;",
        "activityResultRegistryOwner",
        "Landroidx/activity/result/ActivityResultRegistryOwner;",
        "callback",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult;",
        "",
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


# direct methods
.method public static synthetic $r8$lambda$UdX9vBFEAHeZXi9L8Tq_5lHqI-4(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountForInstantDebitsLauncher$Companion;->createForPaymentSheet$lambda$0(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountForInstantDebitsLauncher$Companion;-><init>()V

    return-void
.end method

.method private static final createForPaymentSheet$lambda$0(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    invoke-static {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResultKt;->toInstantDebitsResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final createForPaymentSheet(Ljava/lang/String;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Landroidx/activity/result/ActivityResultRegistryOwner;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;",
            "Landroidx/activity/result/ActivityResultRegistryOwner;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult;",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;"
        }
    .end annotation

    const-string v0, "hostedSurface"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityResultRegistryOwner"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    invoke-interface {p3}, Landroidx/activity/result/ActivityResultRegistryOwner;->getActivityResultRegistry()Landroidx/activity/result/ActivityResultRegistry;

    move-result-object p3

    .line 127
    new-instance v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract;

    invoke-direct {v0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract;-><init>()V

    check-cast v0, Landroidx/activity/result/contract/ActivityResultContract;

    .line 125
    new-instance v1, Lcom/stripe/android/payments/bankaccount/CollectBankAccountForInstantDebitsLauncher$Companion$$ExternalSyntheticLambda0;

    invoke-direct {v1, p4}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountForInstantDebitsLauncher$Companion$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function1;)V

    const-string p4, "CollectBankAccountForInstantDebitsLauncher"

    invoke-virtual {p3, p4, v0, v1}, Landroidx/activity/result/ActivityResultRegistry;->register(Ljava/lang/String;Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object p3

    .line 120
    new-instance p4, Lcom/stripe/android/payments/bankaccount/CollectBankAccountForInstantDebitsLauncher;

    invoke-direct {p4, p3, p2, p1}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountForInstantDebitsLauncher;-><init>(Landroidx/activity/result/ActivityResultLauncher;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Ljava/lang/String;)V

    check-cast p4, Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;

    return-object p4
.end method
