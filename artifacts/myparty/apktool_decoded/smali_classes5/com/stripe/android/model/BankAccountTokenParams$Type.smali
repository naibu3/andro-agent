.class public final enum Lcom/stripe/android/model/BankAccountTokenParams$Type;
.super Ljava/lang/Enum;
.source "BankAccountTokenParams.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/BankAccountTokenParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/BankAccountTokenParams$Type$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/model/BankAccountTokenParams$Type;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/model/BankAccountTokenParams$Type;",
        "",
        "code",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getCode$payments_core_release",
        "()Ljava/lang/String;",
        "Individual",
        "Company",
        "Companion",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/model/BankAccountTokenParams$Type;

.field public static final Companion:Lcom/stripe/android/model/BankAccountTokenParams$Type$Companion;

.field public static final enum Company:Lcom/stripe/android/model/BankAccountTokenParams$Type;

.field public static final enum Individual:Lcom/stripe/android/model/BankAccountTokenParams$Type;


# instance fields
.field private final code:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/model/BankAccountTokenParams$Type;
    .locals 2

    sget-object v0, Lcom/stripe/android/model/BankAccountTokenParams$Type;->Individual:Lcom/stripe/android/model/BankAccountTokenParams$Type;

    sget-object v1, Lcom/stripe/android/model/BankAccountTokenParams$Type;->Company:Lcom/stripe/android/model/BankAccountTokenParams$Type;

    filled-new-array {v0, v1}, [Lcom/stripe/android/model/BankAccountTokenParams$Type;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 58
    new-instance v0, Lcom/stripe/android/model/BankAccountTokenParams$Type;

    const/4 v1, 0x0

    const-string v2, "individual"

    const-string v3, "Individual"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/BankAccountTokenParams$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/BankAccountTokenParams$Type;->Individual:Lcom/stripe/android/model/BankAccountTokenParams$Type;

    .line 59
    new-instance v0, Lcom/stripe/android/model/BankAccountTokenParams$Type;

    const/4 v1, 0x1

    const-string v2, "company"

    const-string v3, "Company"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/BankAccountTokenParams$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/BankAccountTokenParams$Type;->Company:Lcom/stripe/android/model/BankAccountTokenParams$Type;

    invoke-static {}, Lcom/stripe/android/model/BankAccountTokenParams$Type;->$values()[Lcom/stripe/android/model/BankAccountTokenParams$Type;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/BankAccountTokenParams$Type;->$VALUES:[Lcom/stripe/android/model/BankAccountTokenParams$Type;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/BankAccountTokenParams$Type;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/stripe/android/model/BankAccountTokenParams$Type$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/model/BankAccountTokenParams$Type$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/BankAccountTokenParams$Type;->Companion:Lcom/stripe/android/model/BankAccountTokenParams$Type$Companion;

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

    .line 57
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/model/BankAccountTokenParams$Type;->code:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/model/BankAccountTokenParams$Type;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/model/BankAccountTokenParams$Type;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/model/BankAccountTokenParams$Type;
    .locals 1

    const-class v0, Lcom/stripe/android/model/BankAccountTokenParams$Type;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 67
    check-cast p0, Lcom/stripe/android/model/BankAccountTokenParams$Type;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/model/BankAccountTokenParams$Type;
    .locals 1

    sget-object v0, Lcom/stripe/android/model/BankAccountTokenParams$Type;->$VALUES:[Lcom/stripe/android/model/BankAccountTokenParams$Type;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 67
    check-cast v0, [Lcom/stripe/android/model/BankAccountTokenParams$Type;

    return-object v0
.end method


# virtual methods
.method public final getCode$payments_core_release()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/stripe/android/model/BankAccountTokenParams$Type;->code:Ljava/lang/String;

    return-object v0
.end method
