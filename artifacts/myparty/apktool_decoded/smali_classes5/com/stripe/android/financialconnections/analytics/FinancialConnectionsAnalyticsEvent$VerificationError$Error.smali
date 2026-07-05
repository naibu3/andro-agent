.class public final enum Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;
.super Ljava/lang/Enum;
.source "FinancialConnectionsAnalyticsEvent.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Error"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "ConsumerNotFoundError",
        "LookupConsumerSession",
        "StartVerificationSessionError",
        "ConfirmVerificationSessionError",
        "MarkLinkVerifiedError",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

.field public static final enum ConfirmVerificationSessionError:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

.field public static final enum ConsumerNotFoundError:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

.field public static final enum LookupConsumerSession:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

.field public static final enum MarkLinkVerifiedError:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

.field public static final enum StartVerificationSessionError:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;
    .locals 5

    sget-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;->ConsumerNotFoundError:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

    sget-object v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;->LookupConsumerSession:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

    sget-object v2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;->StartVerificationSessionError:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

    sget-object v3, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;->ConfirmVerificationSessionError:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

    sget-object v4, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;->MarkLinkVerifiedError:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 286
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

    const-string v1, "ConsumerNotFoundError"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;->ConsumerNotFoundError:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

    .line 287
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

    const-string v1, "LookupConsumerSession"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;->LookupConsumerSession:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

    .line 288
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

    const-string v1, "StartVerificationSessionError"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;->StartVerificationSessionError:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

    .line 289
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

    const-string v1, "ConfirmVerificationSessionError"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;->ConfirmVerificationSessionError:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

    .line 290
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

    const-string v1, "MarkLinkVerifiedError"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;->MarkLinkVerifiedError:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

    invoke-static {}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;->$values()[Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;->$VALUES:[Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    .line 285
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;->value:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;
    .locals 1

    const-class v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 291
    check-cast p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;->$VALUES:[Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 291
    check-cast v0, [Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    .line 285
    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;->value:Ljava/lang/String;

    return-object v0
.end method
