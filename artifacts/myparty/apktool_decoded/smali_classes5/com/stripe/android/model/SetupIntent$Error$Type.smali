.class public final enum Lcom/stripe/android/model/SetupIntent$Error$Type;
.super Ljava/lang/Enum;
.source "SetupIntent.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/SetupIntent$Error;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/SetupIntent$Error$Type$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/model/SetupIntent$Error$Type;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u0000 \u000f2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/model/SetupIntent$Error$Type;",
        "",
        "code",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getCode",
        "()Ljava/lang/String;",
        "ApiConnectionError",
        "ApiError",
        "AuthenticationError",
        "CardError",
        "IdempotencyError",
        "InvalidRequestError",
        "RateLimitError",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/model/SetupIntent$Error$Type;

.field public static final enum ApiConnectionError:Lcom/stripe/android/model/SetupIntent$Error$Type;

.field public static final enum ApiError:Lcom/stripe/android/model/SetupIntent$Error$Type;

.field public static final enum AuthenticationError:Lcom/stripe/android/model/SetupIntent$Error$Type;

.field public static final enum CardError:Lcom/stripe/android/model/SetupIntent$Error$Type;

.field public static final Companion:Lcom/stripe/android/model/SetupIntent$Error$Type$Companion;

.field public static final enum IdempotencyError:Lcom/stripe/android/model/SetupIntent$Error$Type;

.field public static final enum InvalidRequestError:Lcom/stripe/android/model/SetupIntent$Error$Type;

.field public static final enum RateLimitError:Lcom/stripe/android/model/SetupIntent$Error$Type;


# instance fields
.field private final code:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/model/SetupIntent$Error$Type;
    .locals 7

    sget-object v0, Lcom/stripe/android/model/SetupIntent$Error$Type;->ApiConnectionError:Lcom/stripe/android/model/SetupIntent$Error$Type;

    sget-object v1, Lcom/stripe/android/model/SetupIntent$Error$Type;->ApiError:Lcom/stripe/android/model/SetupIntent$Error$Type;

    sget-object v2, Lcom/stripe/android/model/SetupIntent$Error$Type;->AuthenticationError:Lcom/stripe/android/model/SetupIntent$Error$Type;

    sget-object v3, Lcom/stripe/android/model/SetupIntent$Error$Type;->CardError:Lcom/stripe/android/model/SetupIntent$Error$Type;

    sget-object v4, Lcom/stripe/android/model/SetupIntent$Error$Type;->IdempotencyError:Lcom/stripe/android/model/SetupIntent$Error$Type;

    sget-object v5, Lcom/stripe/android/model/SetupIntent$Error$Type;->InvalidRequestError:Lcom/stripe/android/model/SetupIntent$Error$Type;

    sget-object v6, Lcom/stripe/android/model/SetupIntent$Error$Type;->RateLimitError:Lcom/stripe/android/model/SetupIntent$Error$Type;

    filled-new-array/range {v0 .. v6}, [Lcom/stripe/android/model/SetupIntent$Error$Type;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 222
    new-instance v0, Lcom/stripe/android/model/SetupIntent$Error$Type;

    const/4 v1, 0x0

    const-string v2, "api_connection_error"

    const-string v3, "ApiConnectionError"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/SetupIntent$Error$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/SetupIntent$Error$Type;->ApiConnectionError:Lcom/stripe/android/model/SetupIntent$Error$Type;

    .line 223
    new-instance v0, Lcom/stripe/android/model/SetupIntent$Error$Type;

    const/4 v1, 0x1

    const-string v2, "api_error"

    const-string v3, "ApiError"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/SetupIntent$Error$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/SetupIntent$Error$Type;->ApiError:Lcom/stripe/android/model/SetupIntent$Error$Type;

    .line 224
    new-instance v0, Lcom/stripe/android/model/SetupIntent$Error$Type;

    const/4 v1, 0x2

    const-string v2, "authentication_error"

    const-string v3, "AuthenticationError"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/SetupIntent$Error$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/SetupIntent$Error$Type;->AuthenticationError:Lcom/stripe/android/model/SetupIntent$Error$Type;

    .line 225
    new-instance v0, Lcom/stripe/android/model/SetupIntent$Error$Type;

    const/4 v1, 0x3

    const-string v2, "card_error"

    const-string v3, "CardError"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/SetupIntent$Error$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/SetupIntent$Error$Type;->CardError:Lcom/stripe/android/model/SetupIntent$Error$Type;

    .line 226
    new-instance v0, Lcom/stripe/android/model/SetupIntent$Error$Type;

    const/4 v1, 0x4

    const-string v2, "idempotency_error"

    const-string v3, "IdempotencyError"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/SetupIntent$Error$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/SetupIntent$Error$Type;->IdempotencyError:Lcom/stripe/android/model/SetupIntent$Error$Type;

    .line 227
    new-instance v0, Lcom/stripe/android/model/SetupIntent$Error$Type;

    const/4 v1, 0x5

    const-string v2, "invalid_request_error"

    const-string v3, "InvalidRequestError"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/SetupIntent$Error$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/SetupIntent$Error$Type;->InvalidRequestError:Lcom/stripe/android/model/SetupIntent$Error$Type;

    .line 228
    new-instance v0, Lcom/stripe/android/model/SetupIntent$Error$Type;

    const/4 v1, 0x6

    const-string v2, "rate_limit_error"

    const-string v3, "RateLimitError"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/SetupIntent$Error$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/SetupIntent$Error$Type;->RateLimitError:Lcom/stripe/android/model/SetupIntent$Error$Type;

    invoke-static {}, Lcom/stripe/android/model/SetupIntent$Error$Type;->$values()[Lcom/stripe/android/model/SetupIntent$Error$Type;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/SetupIntent$Error$Type;->$VALUES:[Lcom/stripe/android/model/SetupIntent$Error$Type;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/SetupIntent$Error$Type;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/stripe/android/model/SetupIntent$Error$Type$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/model/SetupIntent$Error$Type$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/SetupIntent$Error$Type;->Companion:Lcom/stripe/android/model/SetupIntent$Error$Type$Companion;

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

    .line 221
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/model/SetupIntent$Error$Type;->code:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/model/SetupIntent$Error$Type;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/model/SetupIntent$Error$Type;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/model/SetupIntent$Error$Type;
    .locals 1

    const-class v0, Lcom/stripe/android/model/SetupIntent$Error$Type;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 235
    check-cast p0, Lcom/stripe/android/model/SetupIntent$Error$Type;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/model/SetupIntent$Error$Type;
    .locals 1

    sget-object v0, Lcom/stripe/android/model/SetupIntent$Error$Type;->$VALUES:[Lcom/stripe/android/model/SetupIntent$Error$Type;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 235
    check-cast v0, [Lcom/stripe/android/model/SetupIntent$Error$Type;

    return-object v0
.end method


# virtual methods
.method public final getCode()Ljava/lang/String;
    .locals 1

    .line 221
    iget-object v0, p0, Lcom/stripe/android/model/SetupIntent$Error$Type;->code:Ljava/lang/String;

    return-object v0
.end method
