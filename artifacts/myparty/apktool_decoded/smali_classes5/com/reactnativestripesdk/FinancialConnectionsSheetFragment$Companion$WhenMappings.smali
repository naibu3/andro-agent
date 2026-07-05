.class public final synthetic Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Companion$WhenMappings;
.super Ljava/lang/Object;
.source "FinancialConnectionsSheetFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Companion;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "WhenMappings"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I

.field public static final synthetic $EnumSwitchMapping$1:[I

.field public static final synthetic $EnumSwitchMapping$2:[I

.field public static final synthetic $EnumSwitchMapping$3:[I

.field public static final synthetic $EnumSwitchMapping$4:[I

.field public static final synthetic $EnumSwitchMapping$5:[I

.field public static final synthetic $EnumSwitchMapping$6:[I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    invoke-static {}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;->values()[Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    const/4 v1, 0x1

    :try_start_0
    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;->ACTIVE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v2, 0x2

    :try_start_1
    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;->DISCONNECTED:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;->ordinal()I

    move-result v3

    aput v2, v0, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    const/4 v3, 0x3

    :try_start_2
    sget-object v4, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;->INACTIVE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;->ordinal()I

    move-result v4

    aput v3, v0, v4
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    const/4 v4, 0x4

    :try_start_3
    sget-object v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;->ordinal()I

    move-result v5

    aput v4, v0, v5
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    sput-object v0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-static {}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->values()[Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_4
    sget-object v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->CASH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->ordinal()I

    move-result v5

    aput v1, v0, v5
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :try_start_5
    sget-object v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->CREDIT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->ordinal()I

    move-result v5

    aput v2, v0, v5
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :try_start_6
    sget-object v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->INVESTMENT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->ordinal()I

    move-result v5

    aput v3, v0, v5
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    :try_start_7
    sget-object v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->OTHER:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->ordinal()I

    move-result v5

    aput v4, v0, v5
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    :catch_7
    const/4 v5, 0x5

    :try_start_8
    sget-object v6, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->ordinal()I

    move-result v6

    aput v5, v0, v6
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    :catch_8
    sput-object v0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Companion$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-static {}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->values()[Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_9
    sget-object v6, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->CHECKING:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->ordinal()I

    move-result v6

    aput v1, v0, v6
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    :catch_9
    :try_start_a
    sget-object v6, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->CREDIT_CARD:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->ordinal()I

    move-result v6

    aput v2, v0, v6
    :try_end_a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_a} :catch_a

    :catch_a
    :try_start_b
    sget-object v6, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->LINE_OF_CREDIT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->ordinal()I

    move-result v6

    aput v3, v0, v6
    :try_end_b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_b .. :try_end_b} :catch_b

    :catch_b
    :try_start_c
    sget-object v6, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->MORTGAGE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->ordinal()I

    move-result v6

    aput v4, v0, v6
    :try_end_c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_c .. :try_end_c} :catch_c

    :catch_c
    :try_start_d
    sget-object v6, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->OTHER:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->ordinal()I

    move-result v6

    aput v5, v0, v6
    :try_end_d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_d .. :try_end_d} :catch_d

    :catch_d
    const/4 v6, 0x6

    :try_start_e
    sget-object v7, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->SAVINGS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->ordinal()I

    move-result v7

    aput v6, v0, v7
    :try_end_e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_e .. :try_end_e} :catch_e

    :catch_e
    :try_start_f
    sget-object v7, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->ordinal()I

    move-result v7

    const/4 v8, 0x7

    aput v8, v0, v7
    :try_end_f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_f .. :try_end_f} :catch_f

    :catch_f
    sput-object v0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Companion$WhenMappings;->$EnumSwitchMapping$2:[I

    invoke-static {}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->values()[Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_10
    sget-object v7, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->PAYMENT_METHOD:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->ordinal()I

    move-result v7

    aput v1, v0, v7
    :try_end_10
    .catch Ljava/lang/NoSuchFieldError; {:try_start_10 .. :try_end_10} :catch_10

    :catch_10
    :try_start_11
    sget-object v7, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->BALANCES:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->ordinal()I

    move-result v7

    aput v2, v0, v7
    :try_end_11
    .catch Ljava/lang/NoSuchFieldError; {:try_start_11 .. :try_end_11} :catch_11

    :catch_11
    :try_start_12
    sget-object v7, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->OWNERSHIP:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->ordinal()I

    move-result v7

    aput v3, v0, v7
    :try_end_12
    .catch Ljava/lang/NoSuchFieldError; {:try_start_12 .. :try_end_12} :catch_12

    :catch_12
    :try_start_13
    sget-object v7, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->TRANSACTIONS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->ordinal()I

    move-result v7

    aput v4, v0, v7
    :try_end_13
    .catch Ljava/lang/NoSuchFieldError; {:try_start_13 .. :try_end_13} :catch_13

    :catch_13
    :try_start_14
    sget-object v7, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->ACCOUNT_NUMBERS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->ordinal()I

    move-result v7

    aput v5, v0, v7
    :try_end_14
    .catch Ljava/lang/NoSuchFieldError; {:try_start_14 .. :try_end_14} :catch_14

    :catch_14
    :try_start_15
    sget-object v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->ordinal()I

    move-result v5

    aput v6, v0, v5
    :try_end_15
    .catch Ljava/lang/NoSuchFieldError; {:try_start_15 .. :try_end_15} :catch_15

    :catch_15
    sput-object v0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Companion$WhenMappings;->$EnumSwitchMapping$3:[I

    invoke-static {}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;->values()[Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_16
    sget-object v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;->US_BANK_ACCOUNT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;->ordinal()I

    move-result v5

    aput v1, v0, v5
    :try_end_16
    .catch Ljava/lang/NoSuchFieldError; {:try_start_16 .. :try_end_16} :catch_16

    :catch_16
    :try_start_17
    sget-object v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;->LINK:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;->ordinal()I

    move-result v5

    aput v2, v0, v5
    :try_end_17
    .catch Ljava/lang/NoSuchFieldError; {:try_start_17 .. :try_end_17} :catch_17

    :catch_17
    :try_start_18
    sget-object v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;->ordinal()I

    move-result v5

    aput v3, v0, v5
    :try_end_18
    .catch Ljava/lang/NoSuchFieldError; {:try_start_18 .. :try_end_18} :catch_18

    :catch_18
    sput-object v0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Companion$WhenMappings;->$EnumSwitchMapping$4:[I

    invoke-static {}, Lcom/stripe/android/financialconnections/model/Balance$Type;->values()[Lcom/stripe/android/financialconnections/model/Balance$Type;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_19
    sget-object v5, Lcom/stripe/android/financialconnections/model/Balance$Type;->CASH:Lcom/stripe/android/financialconnections/model/Balance$Type;

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/Balance$Type;->ordinal()I

    move-result v5

    aput v1, v0, v5
    :try_end_19
    .catch Ljava/lang/NoSuchFieldError; {:try_start_19 .. :try_end_19} :catch_19

    :catch_19
    :try_start_1a
    sget-object v5, Lcom/stripe/android/financialconnections/model/Balance$Type;->CREDIT:Lcom/stripe/android/financialconnections/model/Balance$Type;

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/Balance$Type;->ordinal()I

    move-result v5

    aput v2, v0, v5
    :try_end_1a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1a .. :try_end_1a} :catch_1a

    :catch_1a
    :try_start_1b
    sget-object v5, Lcom/stripe/android/financialconnections/model/Balance$Type;->UNKNOWN:Lcom/stripe/android/financialconnections/model/Balance$Type;

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/Balance$Type;->ordinal()I

    move-result v5

    aput v3, v0, v5
    :try_end_1b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1b .. :try_end_1b} :catch_1b

    :catch_1b
    sput-object v0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Companion$WhenMappings;->$EnumSwitchMapping$5:[I

    invoke-static {}, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->values()[Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_1c
    sget-object v5, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->SUCCEEDED:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->ordinal()I

    move-result v5

    aput v1, v0, v5
    :try_end_1c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1c .. :try_end_1c} :catch_1c

    :catch_1c
    :try_start_1d
    sget-object v1, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->FAILED:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->ordinal()I

    move-result v1

    aput v2, v0, v1
    :try_end_1d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1d .. :try_end_1d} :catch_1d

    :catch_1d
    :try_start_1e
    sget-object v1, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->PENDING:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->ordinal()I

    move-result v1

    aput v3, v0, v1
    :try_end_1e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1e .. :try_end_1e} :catch_1e

    :catch_1e
    :try_start_1f
    sget-object v1, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->UNKNOWN:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->ordinal()I

    move-result v1

    aput v4, v0, v1
    :try_end_1f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1f .. :try_end_1f} :catch_1f

    :catch_1f
    sput-object v0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Companion$WhenMappings;->$EnumSwitchMapping$6:[I

    return-void
.end method
