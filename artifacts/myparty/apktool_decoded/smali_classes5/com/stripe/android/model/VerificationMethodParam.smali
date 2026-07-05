.class public final enum Lcom/stripe/android/model/VerificationMethodParam;
.super Ljava/lang/Enum;
.source "CreateFinancialConnectionsSessionForDeferredPaymentParams.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/model/VerificationMethodParam;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0087\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/model/VerificationMethodParam;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "Automatic",
        "Skip",
        "Microdeposits",
        "Instant",
        "InstantOrSkip",
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
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/stripe/android/model/VerificationMethodParam;

.field public static final enum Automatic:Lcom/stripe/android/model/VerificationMethodParam;

.field public static final enum Instant:Lcom/stripe/android/model/VerificationMethodParam;

.field public static final enum InstantOrSkip:Lcom/stripe/android/model/VerificationMethodParam;

.field public static final enum Microdeposits:Lcom/stripe/android/model/VerificationMethodParam;

.field public static final enum Skip:Lcom/stripe/android/model/VerificationMethodParam;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/model/VerificationMethodParam;
    .locals 5

    sget-object v0, Lcom/stripe/android/model/VerificationMethodParam;->Automatic:Lcom/stripe/android/model/VerificationMethodParam;

    sget-object v1, Lcom/stripe/android/model/VerificationMethodParam;->Skip:Lcom/stripe/android/model/VerificationMethodParam;

    sget-object v2, Lcom/stripe/android/model/VerificationMethodParam;->Microdeposits:Lcom/stripe/android/model/VerificationMethodParam;

    sget-object v3, Lcom/stripe/android/model/VerificationMethodParam;->Instant:Lcom/stripe/android/model/VerificationMethodParam;

    sget-object v4, Lcom/stripe/android/model/VerificationMethodParam;->InstantOrSkip:Lcom/stripe/android/model/VerificationMethodParam;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/stripe/android/model/VerificationMethodParam;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 56
    new-instance v0, Lcom/stripe/android/model/VerificationMethodParam;

    const/4 v1, 0x0

    const-string v2, "automatic"

    const-string v3, "Automatic"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/VerificationMethodParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/VerificationMethodParam;->Automatic:Lcom/stripe/android/model/VerificationMethodParam;

    .line 57
    new-instance v0, Lcom/stripe/android/model/VerificationMethodParam;

    const/4 v1, 0x1

    const-string v2, "skip"

    const-string v3, "Skip"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/VerificationMethodParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/VerificationMethodParam;->Skip:Lcom/stripe/android/model/VerificationMethodParam;

    .line 58
    new-instance v0, Lcom/stripe/android/model/VerificationMethodParam;

    const/4 v1, 0x2

    const-string v2, "microdeposits"

    const-string v3, "Microdeposits"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/VerificationMethodParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/VerificationMethodParam;->Microdeposits:Lcom/stripe/android/model/VerificationMethodParam;

    .line 59
    new-instance v0, Lcom/stripe/android/model/VerificationMethodParam;

    const/4 v1, 0x3

    const-string v2, "instant"

    const-string v3, "Instant"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/VerificationMethodParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/VerificationMethodParam;->Instant:Lcom/stripe/android/model/VerificationMethodParam;

    .line 60
    new-instance v0, Lcom/stripe/android/model/VerificationMethodParam;

    const/4 v1, 0x4

    const-string v2, "instant_or_skip"

    const-string v3, "InstantOrSkip"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/VerificationMethodParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/VerificationMethodParam;->InstantOrSkip:Lcom/stripe/android/model/VerificationMethodParam;

    invoke-static {}, Lcom/stripe/android/model/VerificationMethodParam;->$values()[Lcom/stripe/android/model/VerificationMethodParam;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/VerificationMethodParam;->$VALUES:[Lcom/stripe/android/model/VerificationMethodParam;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/VerificationMethodParam;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    .line 55
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/model/VerificationMethodParam;->value:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/model/VerificationMethodParam;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/model/VerificationMethodParam;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/model/VerificationMethodParam;
    .locals 1

    const-class v0, Lcom/stripe/android/model/VerificationMethodParam;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 61
    check-cast p0, Lcom/stripe/android/model/VerificationMethodParam;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/model/VerificationMethodParam;
    .locals 1

    sget-object v0, Lcom/stripe/android/model/VerificationMethodParam;->$VALUES:[Lcom/stripe/android/model/VerificationMethodParam;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 61
    check-cast v0, [Lcom/stripe/android/model/VerificationMethodParam;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/stripe/android/model/VerificationMethodParam;->value:Ljava/lang/String;

    return-object v0
.end method
