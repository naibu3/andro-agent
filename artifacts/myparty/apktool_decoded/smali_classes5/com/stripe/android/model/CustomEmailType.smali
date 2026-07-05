.class public final enum Lcom/stripe/android/model/CustomEmailType;
.super Ljava/lang/Enum;
.source "Verification.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/model/CustomEmailType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0087\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/model/CustomEmailType;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "LINK_OTP_EMAIL",
        "NETWORKED_CONNECTIONS_OTP_EMAIL",
        "payments-model_release"
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/model/CustomEmailType;

.field public static final enum LINK_OTP_EMAIL:Lcom/stripe/android/model/CustomEmailType;

.field public static final enum NETWORKED_CONNECTIONS_OTP_EMAIL:Lcom/stripe/android/model/CustomEmailType;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/model/CustomEmailType;
    .locals 2

    sget-object v0, Lcom/stripe/android/model/CustomEmailType;->LINK_OTP_EMAIL:Lcom/stripe/android/model/CustomEmailType;

    sget-object v1, Lcom/stripe/android/model/CustomEmailType;->NETWORKED_CONNECTIONS_OTP_EMAIL:Lcom/stripe/android/model/CustomEmailType;

    filled-new-array {v0, v1}, [Lcom/stripe/android/model/CustomEmailType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 12
    new-instance v0, Lcom/stripe/android/model/CustomEmailType;

    const-string v1, "LINK_OTP_EMAIL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, Lcom/stripe/android/model/CustomEmailType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/CustomEmailType;->LINK_OTP_EMAIL:Lcom/stripe/android/model/CustomEmailType;

    .line 13
    new-instance v0, Lcom/stripe/android/model/CustomEmailType;

    const-string v1, "NETWORKED_CONNECTIONS_OTP_EMAIL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lcom/stripe/android/model/CustomEmailType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/CustomEmailType;->NETWORKED_CONNECTIONS_OTP_EMAIL:Lcom/stripe/android/model/CustomEmailType;

    invoke-static {}, Lcom/stripe/android/model/CustomEmailType;->$values()[Lcom/stripe/android/model/CustomEmailType;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/CustomEmailType;->$VALUES:[Lcom/stripe/android/model/CustomEmailType;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/CustomEmailType;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    .line 11
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/model/CustomEmailType;->value:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/model/CustomEmailType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/model/CustomEmailType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/model/CustomEmailType;
    .locals 1

    const-class v0, Lcom/stripe/android/model/CustomEmailType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 14
    check-cast p0, Lcom/stripe/android/model/CustomEmailType;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/model/CustomEmailType;
    .locals 1

    sget-object v0, Lcom/stripe/android/model/CustomEmailType;->$VALUES:[Lcom/stripe/android/model/CustomEmailType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 14
    check-cast v0, [Lcom/stripe/android/model/CustomEmailType;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/stripe/android/model/CustomEmailType;->value:Ljava/lang/String;

    return-object v0
.end method
