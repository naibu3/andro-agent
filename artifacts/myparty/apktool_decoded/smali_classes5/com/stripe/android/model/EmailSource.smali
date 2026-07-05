.class public final enum Lcom/stripe/android/model/EmailSource;
.super Ljava/lang/Enum;
.source "EmailSource.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/model/EmailSource;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0087\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/model/EmailSource;",
        "",
        "backendValue",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getBackendValue",
        "()Ljava/lang/String;",
        "USER_ACTION",
        "CUSTOMER_OBJECT",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/model/EmailSource;

.field public static final enum CUSTOMER_OBJECT:Lcom/stripe/android/model/EmailSource;

.field public static final enum USER_ACTION:Lcom/stripe/android/model/EmailSource;


# instance fields
.field private final backendValue:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/model/EmailSource;
    .locals 2

    sget-object v0, Lcom/stripe/android/model/EmailSource;->USER_ACTION:Lcom/stripe/android/model/EmailSource;

    sget-object v1, Lcom/stripe/android/model/EmailSource;->CUSTOMER_OBJECT:Lcom/stripe/android/model/EmailSource;

    filled-new-array {v0, v1}, [Lcom/stripe/android/model/EmailSource;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 8
    new-instance v0, Lcom/stripe/android/model/EmailSource;

    const/4 v1, 0x0

    const-string v2, "user_action"

    const-string v3, "USER_ACTION"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/EmailSource;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/EmailSource;->USER_ACTION:Lcom/stripe/android/model/EmailSource;

    .line 11
    new-instance v0, Lcom/stripe/android/model/EmailSource;

    const/4 v1, 0x1

    const-string v2, "customer_object"

    const-string v3, "CUSTOMER_OBJECT"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/EmailSource;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/EmailSource;->CUSTOMER_OBJECT:Lcom/stripe/android/model/EmailSource;

    invoke-static {}, Lcom/stripe/android/model/EmailSource;->$values()[Lcom/stripe/android/model/EmailSource;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/EmailSource;->$VALUES:[Lcom/stripe/android/model/EmailSource;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/EmailSource;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    .line 6
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/model/EmailSource;->backendValue:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/model/EmailSource;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/model/EmailSource;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/model/EmailSource;
    .locals 1

    const-class v0, Lcom/stripe/android/model/EmailSource;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 12
    check-cast p0, Lcom/stripe/android/model/EmailSource;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/model/EmailSource;
    .locals 1

    sget-object v0, Lcom/stripe/android/model/EmailSource;->$VALUES:[Lcom/stripe/android/model/EmailSource;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 12
    check-cast v0, [Lcom/stripe/android/model/EmailSource;

    return-object v0
.end method


# virtual methods
.method public final getBackendValue()Ljava/lang/String;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/stripe/android/model/EmailSource;->backendValue:Ljava/lang/String;

    return-object v0
.end method
