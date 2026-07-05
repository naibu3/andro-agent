.class public final enum Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;
.super Ljava/lang/Enum;
.source "FinancialConnectionsEvent.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ErrorCode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0010\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "ACCOUNT_NUMBERS_UNAVAILABLE",
        "ACCOUNTS_UNAVAILABLE",
        "NO_DEBITABLE_ACCOUNT",
        "AUTHORIZATION_FAILED",
        "INSTITUTION_UNAVAILABLE_PLANNED",
        "INSTITUTION_UNAVAILABLE_UNPLANNED",
        "INSTITUTION_TIMEOUT",
        "UNEXPECTED_ERROR",
        "SESSION_EXPIRED",
        "FAILED_BOT_DETECTION",
        "WEB_BROWSER_UNAVAILABLE",
        "financial-connections_release"
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
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

.field public static final enum ACCOUNTS_UNAVAILABLE:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

.field public static final enum ACCOUNT_NUMBERS_UNAVAILABLE:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

.field public static final enum AUTHORIZATION_FAILED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

.field public static final enum FAILED_BOT_DETECTION:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

.field public static final enum INSTITUTION_TIMEOUT:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

.field public static final enum INSTITUTION_UNAVAILABLE_PLANNED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

.field public static final enum INSTITUTION_UNAVAILABLE_UNPLANNED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

.field public static final enum NO_DEBITABLE_ACCOUNT:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

.field public static final enum SESSION_EXPIRED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

.field public static final enum UNEXPECTED_ERROR:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

.field public static final enum WEB_BROWSER_UNAVAILABLE:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;
    .locals 11

    sget-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->ACCOUNT_NUMBERS_UNAVAILABLE:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    sget-object v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->ACCOUNTS_UNAVAILABLE:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    sget-object v2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->NO_DEBITABLE_ACCOUNT:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    sget-object v3, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->AUTHORIZATION_FAILED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    sget-object v4, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->INSTITUTION_UNAVAILABLE_PLANNED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    sget-object v5, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->INSTITUTION_UNAVAILABLE_UNPLANNED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    sget-object v6, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->INSTITUTION_TIMEOUT:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    sget-object v7, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->UNEXPECTED_ERROR:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    sget-object v8, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->SESSION_EXPIRED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    sget-object v9, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->FAILED_BOT_DETECTION:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    sget-object v10, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->WEB_BROWSER_UNAVAILABLE:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    filled-new-array/range {v0 .. v10}, [Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 93
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    const/4 v1, 0x0

    const-string v2, "account_numbers_unavailable"

    const-string v3, "ACCOUNT_NUMBERS_UNAVAILABLE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->ACCOUNT_NUMBERS_UNAVAILABLE:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    .line 98
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    const/4 v1, 0x1

    const-string v2, "accounts_unavailable"

    const-string v3, "ACCOUNTS_UNAVAILABLE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->ACCOUNTS_UNAVAILABLE:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    .line 103
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    const/4 v1, 0x2

    const-string v2, "no_debitable_account"

    const-string v3, "NO_DEBITABLE_ACCOUNT"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->NO_DEBITABLE_ACCOUNT:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    .line 108
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    const/4 v1, 0x3

    const-string v2, "authorization_failed"

    const-string v3, "AUTHORIZATION_FAILED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->AUTHORIZATION_FAILED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    .line 113
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    const/4 v1, 0x4

    const-string v2, "institution_unavailable_planned"

    const-string v3, "INSTITUTION_UNAVAILABLE_PLANNED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->INSTITUTION_UNAVAILABLE_PLANNED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    .line 118
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    const/4 v1, 0x5

    const-string v2, "institution_unavailable_unplanned"

    const-string v3, "INSTITUTION_UNAVAILABLE_UNPLANNED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->INSTITUTION_UNAVAILABLE_UNPLANNED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    .line 123
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    const/4 v1, 0x6

    const-string v2, "institution_timeout"

    const-string v3, "INSTITUTION_TIMEOUT"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->INSTITUTION_TIMEOUT:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    .line 128
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    const/4 v1, 0x7

    const-string v2, "unexpected_error"

    const-string v3, "UNEXPECTED_ERROR"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->UNEXPECTED_ERROR:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    .line 133
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    const/16 v1, 0x8

    const-string v2, "session_expired"

    const-string v3, "SESSION_EXPIRED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->SESSION_EXPIRED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    .line 138
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    const/16 v1, 0x9

    const-string v2, "failed_bot_detection"

    const-string v3, "FAILED_BOT_DETECTION"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->FAILED_BOT_DETECTION:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    .line 143
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    const/16 v1, 0xa

    const-string v2, "web_browser_unavailable"

    const-string v3, "WEB_BROWSER_UNAVAILABLE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->WEB_BROWSER_UNAVAILABLE:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    invoke-static {}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->$values()[Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->$VALUES:[Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 89
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->value:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;
    .locals 1

    const-class v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 144
    check-cast p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->$VALUES:[Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 144
    check-cast v0, [Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->value:Ljava/lang/String;

    return-object v0
.end method
