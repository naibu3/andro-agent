.class public final enum Lcom/stripe/android/link/model/AccountStatus;
.super Ljava/lang/Enum;
.source "AccountStatus.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/link/model/AccountStatus;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/link/model/AccountStatus;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Verified",
        "NeedsVerification",
        "VerificationStarted",
        "SignedOut",
        "Error",
        "paymentsheet_release"
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/link/model/AccountStatus;

.field public static final enum Error:Lcom/stripe/android/link/model/AccountStatus;

.field public static final enum NeedsVerification:Lcom/stripe/android/link/model/AccountStatus;

.field public static final enum SignedOut:Lcom/stripe/android/link/model/AccountStatus;

.field public static final enum VerificationStarted:Lcom/stripe/android/link/model/AccountStatus;

.field public static final enum Verified:Lcom/stripe/android/link/model/AccountStatus;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/link/model/AccountStatus;
    .locals 5

    sget-object v0, Lcom/stripe/android/link/model/AccountStatus;->Verified:Lcom/stripe/android/link/model/AccountStatus;

    sget-object v1, Lcom/stripe/android/link/model/AccountStatus;->NeedsVerification:Lcom/stripe/android/link/model/AccountStatus;

    sget-object v2, Lcom/stripe/android/link/model/AccountStatus;->VerificationStarted:Lcom/stripe/android/link/model/AccountStatus;

    sget-object v3, Lcom/stripe/android/link/model/AccountStatus;->SignedOut:Lcom/stripe/android/link/model/AccountStatus;

    sget-object v4, Lcom/stripe/android/link/model/AccountStatus;->Error:Lcom/stripe/android/link/model/AccountStatus;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/stripe/android/link/model/AccountStatus;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 6
    new-instance v0, Lcom/stripe/android/link/model/AccountStatus;

    const-string v1, "Verified"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/link/model/AccountStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/link/model/AccountStatus;->Verified:Lcom/stripe/android/link/model/AccountStatus;

    .line 7
    new-instance v0, Lcom/stripe/android/link/model/AccountStatus;

    const-string v1, "NeedsVerification"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/link/model/AccountStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/link/model/AccountStatus;->NeedsVerification:Lcom/stripe/android/link/model/AccountStatus;

    .line 8
    new-instance v0, Lcom/stripe/android/link/model/AccountStatus;

    const-string v1, "VerificationStarted"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/link/model/AccountStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/link/model/AccountStatus;->VerificationStarted:Lcom/stripe/android/link/model/AccountStatus;

    .line 9
    new-instance v0, Lcom/stripe/android/link/model/AccountStatus;

    const-string v1, "SignedOut"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/link/model/AccountStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/link/model/AccountStatus;->SignedOut:Lcom/stripe/android/link/model/AccountStatus;

    .line 10
    new-instance v0, Lcom/stripe/android/link/model/AccountStatus;

    const-string v1, "Error"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/link/model/AccountStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/link/model/AccountStatus;->Error:Lcom/stripe/android/link/model/AccountStatus;

    invoke-static {}, Lcom/stripe/android/link/model/AccountStatus;->$values()[Lcom/stripe/android/link/model/AccountStatus;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/model/AccountStatus;->$VALUES:[Lcom/stripe/android/link/model/AccountStatus;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/model/AccountStatus;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 5
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/link/model/AccountStatus;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/link/model/AccountStatus;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/link/model/AccountStatus;
    .locals 1

    const-class v0, Lcom/stripe/android/link/model/AccountStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 11
    check-cast p0, Lcom/stripe/android/link/model/AccountStatus;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/link/model/AccountStatus;
    .locals 1

    sget-object v0, Lcom/stripe/android/link/model/AccountStatus;->$VALUES:[Lcom/stripe/android/link/model/AccountStatus;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 11
    check-cast v0, [Lcom/stripe/android/link/model/AccountStatus;

    return-object v0
.end method
