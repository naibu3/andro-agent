.class public final enum Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;
.super Ljava/lang/Enum;
.source "ConfirmVerification.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "EMAIL_CODE_EXPIRED",
        "SMS_CODE_EXPIRED",
        "CODE_INVALID",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;

.field public static final enum CODE_INVALID:Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;

.field public static final enum EMAIL_CODE_EXPIRED:Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;

.field public static final enum SMS_CODE_EXPIRED:Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;
    .locals 3

    sget-object v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;->EMAIL_CODE_EXPIRED:Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;

    sget-object v1, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;->SMS_CODE_EXPIRED:Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;

    sget-object v2, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;->CODE_INVALID:Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;

    filled-new-array {v0, v1, v2}, [Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 71
    new-instance v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;

    const-string v1, "EMAIL_CODE_EXPIRED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;->EMAIL_CODE_EXPIRED:Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;

    .line 72
    new-instance v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;

    const-string v1, "SMS_CODE_EXPIRED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;->SMS_CODE_EXPIRED:Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;

    .line 73
    new-instance v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;

    const-string v1, "CODE_INVALID"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;->CODE_INVALID:Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;

    invoke-static {}, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;->$values()[Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;->$VALUES:[Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 70
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;
    .locals 1

    const-class v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 74
    check-cast p0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;->$VALUES:[Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 74
    check-cast v0, [Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;

    return-object v0
.end method
