.class public final enum Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;
.super Ljava/lang/Enum;
.source "FinancialConnectionsEvent.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Name"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0010\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "OPEN",
        "FLOW_LAUNCHED_IN_BROWSER",
        "MANUAL_ENTRY_INITIATED",
        "CONSENT_ACQUIRED",
        "SEARCH_INITIATED",
        "INSTITUTION_SELECTED",
        "INSTITUTION_AUTHORIZED",
        "ACCOUNTS_SELECTED",
        "SUCCESS",
        "ERROR",
        "CANCEL",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

.field public static final enum ACCOUNTS_SELECTED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

.field public static final enum CANCEL:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

.field public static final enum CONSENT_ACQUIRED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

.field public static final enum ERROR:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

.field public static final enum FLOW_LAUNCHED_IN_BROWSER:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

.field public static final enum INSTITUTION_AUTHORIZED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

.field public static final enum INSTITUTION_SELECTED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

.field public static final enum MANUAL_ENTRY_INITIATED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

.field public static final enum OPEN:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

.field public static final enum SEARCH_INITIATED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

.field public static final enum SUCCESS:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;
    .locals 11

    sget-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->OPEN:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    sget-object v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->FLOW_LAUNCHED_IN_BROWSER:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    sget-object v2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->MANUAL_ENTRY_INITIATED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    sget-object v3, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->CONSENT_ACQUIRED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    sget-object v4, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->SEARCH_INITIATED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    sget-object v5, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->INSTITUTION_SELECTED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    sget-object v6, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->INSTITUTION_AUTHORIZED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    sget-object v7, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->ACCOUNTS_SELECTED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    sget-object v8, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->SUCCESS:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    sget-object v9, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->ERROR:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    sget-object v10, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->CANCEL:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    filled-new-array/range {v0 .. v10}, [Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 31
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    const/4 v1, 0x0

    const-string v2, "open"

    const-string v3, "OPEN"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->OPEN:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    .line 38
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    const/4 v1, 0x1

    const-string v2, "flow_launched_in_browser"

    const-string v3, "FLOW_LAUNCHED_IN_BROWSER"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->FLOW_LAUNCHED_IN_BROWSER:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    .line 43
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    const/4 v1, 0x2

    const-string v2, "manual_entry_initiated"

    const-string v3, "MANUAL_ENTRY_INITIATED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->MANUAL_ENTRY_INITIATED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    .line 48
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    const/4 v1, 0x3

    const-string v2, "consent_acquired"

    const-string v3, "CONSENT_ACQUIRED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->CONSENT_ACQUIRED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    .line 53
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    const/4 v1, 0x4

    const-string v2, "search_initiated"

    const-string v3, "SEARCH_INITIATED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->SEARCH_INITIATED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    .line 58
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    const/4 v1, 0x5

    const-string v2, "institution_selected"

    const-string v3, "INSTITUTION_SELECTED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->INSTITUTION_SELECTED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    .line 63
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    const/4 v1, 0x6

    const-string v2, "institution_authorized"

    const-string v3, "INSTITUTION_AUTHORIZED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->INSTITUTION_AUTHORIZED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    .line 68
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    const/4 v1, 0x7

    const-string v2, "accounts_selected"

    const-string v3, "ACCOUNTS_SELECTED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->ACCOUNTS_SELECTED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    .line 73
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    const/16 v1, 0x8

    const-string v2, "success"

    const-string v3, "SUCCESS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->SUCCESS:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    .line 78
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    const/16 v1, 0x9

    const-string v2, "error"

    const-string v3, "ERROR"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->ERROR:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    .line 83
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    const/16 v1, 0xa

    const-string v2, "cancel"

    const-string v3, "CANCEL"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->CANCEL:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    invoke-static {}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->$values()[Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->$VALUES:[Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    .line 27
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->value:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;
    .locals 1

    const-class v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 84
    check-cast p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->$VALUES:[Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 84
    check-cast v0, [Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->value:Ljava/lang/String;

    return-object v0
.end method
