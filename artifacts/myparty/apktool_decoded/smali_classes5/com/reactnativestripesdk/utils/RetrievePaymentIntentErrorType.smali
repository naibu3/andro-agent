.class public final enum Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;
.super Ljava/lang/Enum;
.source "Errors.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0004\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Unknown",
        "stripe_stripe-react-native_release"
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

.field private static final synthetic $VALUES:[Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;

.field public static final enum Unknown:Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;


# direct methods
.method private static final synthetic $values()[Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;
    .locals 1

    sget-object v0, Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;->Unknown:Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;

    filled-new-array {v0}, [Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 35
    new-instance v0, Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;

    const-string v1, "Unknown"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;->Unknown:Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;

    invoke-static {}, Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;->$values()[Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;

    move-result-object v0

    sput-object v0, Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;->$VALUES:[Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 34
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;
    .locals 1

    const-class v0, Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 36
    check-cast p0, Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;

    return-object p0
.end method

.method public static values()[Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;
    .locals 1

    sget-object v0, Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;->$VALUES:[Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 36
    check-cast v0, [Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;

    return-object v0
.end method
