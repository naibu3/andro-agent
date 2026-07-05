.class public final enum Lcom/stripe/hcaptcha/HCaptchaError;
.super Ljava/lang/Enum;
.source "HCaptchaError.kt"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/hcaptcha/HCaptchaError$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/hcaptcha/HCaptchaError;",
        ">;",
        "Ljava/io/Serializable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0014\u0008\u0087\u0081\u0002\u0018\u0000 \u00192\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0019B\u0019\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0008\u0010\u0018\u001a\u00020\u0006H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/hcaptcha/HCaptchaError;",
        "Ljava/io/Serializable;",
        "",
        "errorId",
        "",
        "message",
        "",
        "<init>",
        "(Ljava/lang/String;IILjava/lang/String;)V",
        "getErrorId",
        "()I",
        "getMessage",
        "()Ljava/lang/String;",
        "NETWORK_ERROR",
        "INVALID_DATA",
        "CHALLENGE_ERROR",
        "INTERNAL_ERROR",
        "SESSION_TIMEOUT",
        "TOKEN_TIMEOUT",
        "CHALLENGE_CLOSED",
        "RATE_LIMITED",
        "INVALID_CUSTOM_THEME",
        "INSECURE_HTTP_REQUEST_ERROR",
        "ERROR",
        "toString",
        "Companion",
        "hcaptcha_release"
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

.field private static final synthetic $VALUES:[Lcom/stripe/hcaptcha/HCaptchaError;

.field public static final enum CHALLENGE_CLOSED:Lcom/stripe/hcaptcha/HCaptchaError;

.field public static final enum CHALLENGE_ERROR:Lcom/stripe/hcaptcha/HCaptchaError;

.field public static final Companion:Lcom/stripe/hcaptcha/HCaptchaError$Companion;

.field public static final enum ERROR:Lcom/stripe/hcaptcha/HCaptchaError;

.field public static final enum INSECURE_HTTP_REQUEST_ERROR:Lcom/stripe/hcaptcha/HCaptchaError;

.field public static final enum INTERNAL_ERROR:Lcom/stripe/hcaptcha/HCaptchaError;

.field public static final enum INVALID_CUSTOM_THEME:Lcom/stripe/hcaptcha/HCaptchaError;

.field public static final enum INVALID_DATA:Lcom/stripe/hcaptcha/HCaptchaError;

.field public static final enum NETWORK_ERROR:Lcom/stripe/hcaptcha/HCaptchaError;

.field public static final enum RATE_LIMITED:Lcom/stripe/hcaptcha/HCaptchaError;

.field public static final enum SESSION_TIMEOUT:Lcom/stripe/hcaptcha/HCaptchaError;

.field public static final enum TOKEN_TIMEOUT:Lcom/stripe/hcaptcha/HCaptchaError;


# instance fields
.field private final errorId:I

.field private final message:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/hcaptcha/HCaptchaError;
    .locals 11

    sget-object v0, Lcom/stripe/hcaptcha/HCaptchaError;->NETWORK_ERROR:Lcom/stripe/hcaptcha/HCaptchaError;

    sget-object v1, Lcom/stripe/hcaptcha/HCaptchaError;->INVALID_DATA:Lcom/stripe/hcaptcha/HCaptchaError;

    sget-object v2, Lcom/stripe/hcaptcha/HCaptchaError;->CHALLENGE_ERROR:Lcom/stripe/hcaptcha/HCaptchaError;

    sget-object v3, Lcom/stripe/hcaptcha/HCaptchaError;->INTERNAL_ERROR:Lcom/stripe/hcaptcha/HCaptchaError;

    sget-object v4, Lcom/stripe/hcaptcha/HCaptchaError;->SESSION_TIMEOUT:Lcom/stripe/hcaptcha/HCaptchaError;

    sget-object v5, Lcom/stripe/hcaptcha/HCaptchaError;->TOKEN_TIMEOUT:Lcom/stripe/hcaptcha/HCaptchaError;

    sget-object v6, Lcom/stripe/hcaptcha/HCaptchaError;->CHALLENGE_CLOSED:Lcom/stripe/hcaptcha/HCaptchaError;

    sget-object v7, Lcom/stripe/hcaptcha/HCaptchaError;->RATE_LIMITED:Lcom/stripe/hcaptcha/HCaptchaError;

    sget-object v8, Lcom/stripe/hcaptcha/HCaptchaError;->INVALID_CUSTOM_THEME:Lcom/stripe/hcaptcha/HCaptchaError;

    sget-object v9, Lcom/stripe/hcaptcha/HCaptchaError;->INSECURE_HTTP_REQUEST_ERROR:Lcom/stripe/hcaptcha/HCaptchaError;

    sget-object v10, Lcom/stripe/hcaptcha/HCaptchaError;->ERROR:Lcom/stripe/hcaptcha/HCaptchaError;

    filled-new-array/range {v0 .. v10}, [Lcom/stripe/hcaptcha/HCaptchaError;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 9

    .line 28
    new-instance v0, Lcom/stripe/hcaptcha/HCaptchaError;

    const-string v1, "No internet connection"

    const-string v2, "NETWORK_ERROR"

    const/4 v3, 0x0

    const/4 v4, 0x7

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/stripe/hcaptcha/HCaptchaError;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/stripe/hcaptcha/HCaptchaError;->NETWORK_ERROR:Lcom/stripe/hcaptcha/HCaptchaError;

    .line 33
    new-instance v0, Lcom/stripe/hcaptcha/HCaptchaError;

    const-string v1, "Invalid data is not accepted by endpoints"

    const-string v2, "INVALID_DATA"

    const/4 v3, 0x1

    const/16 v5, 0x8

    invoke-direct {v0, v2, v3, v5, v1}, Lcom/stripe/hcaptcha/HCaptchaError;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/stripe/hcaptcha/HCaptchaError;->INVALID_DATA:Lcom/stripe/hcaptcha/HCaptchaError;

    .line 39
    new-instance v0, Lcom/stripe/hcaptcha/HCaptchaError;

    const-string v1, "Challenge encountered error on setup"

    const-string v2, "CHALLENGE_ERROR"

    const/4 v3, 0x2

    const/16 v6, 0x9

    invoke-direct {v0, v2, v3, v6, v1}, Lcom/stripe/hcaptcha/HCaptchaError;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/stripe/hcaptcha/HCaptchaError;->CHALLENGE_ERROR:Lcom/stripe/hcaptcha/HCaptchaError;

    .line 45
    new-instance v0, Lcom/stripe/hcaptcha/HCaptchaError;

    const-string v1, "hCaptcha client encountered an internal error"

    const-string v2, "INTERNAL_ERROR"

    const/4 v3, 0x3

    const/16 v7, 0xa

    invoke-direct {v0, v2, v3, v7, v1}, Lcom/stripe/hcaptcha/HCaptchaError;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/stripe/hcaptcha/HCaptchaError;->INTERNAL_ERROR:Lcom/stripe/hcaptcha/HCaptchaError;

    .line 50
    new-instance v0, Lcom/stripe/hcaptcha/HCaptchaError;

    const/16 v1, 0xf

    const-string v2, "Session Timeout"

    const-string v3, "SESSION_TIMEOUT"

    const/4 v8, 0x4

    invoke-direct {v0, v3, v8, v1, v2}, Lcom/stripe/hcaptcha/HCaptchaError;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/stripe/hcaptcha/HCaptchaError;->SESSION_TIMEOUT:Lcom/stripe/hcaptcha/HCaptchaError;

    .line 55
    new-instance v0, Lcom/stripe/hcaptcha/HCaptchaError;

    const/16 v1, 0x10

    const-string v2, "Token Timeout"

    const-string v3, "TOKEN_TIMEOUT"

    const/4 v8, 0x5

    invoke-direct {v0, v3, v8, v1, v2}, Lcom/stripe/hcaptcha/HCaptchaError;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/stripe/hcaptcha/HCaptchaError;->TOKEN_TIMEOUT:Lcom/stripe/hcaptcha/HCaptchaError;

    .line 60
    new-instance v0, Lcom/stripe/hcaptcha/HCaptchaError;

    const/16 v1, 0x1e

    const-string v2, "Challenge Closed"

    const-string v3, "CHALLENGE_CLOSED"

    const/4 v8, 0x6

    invoke-direct {v0, v3, v8, v1, v2}, Lcom/stripe/hcaptcha/HCaptchaError;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/stripe/hcaptcha/HCaptchaError;->CHALLENGE_CLOSED:Lcom/stripe/hcaptcha/HCaptchaError;

    .line 65
    new-instance v0, Lcom/stripe/hcaptcha/HCaptchaError;

    const/16 v1, 0x1f

    const-string v2, "Rate Limited"

    const-string v3, "RATE_LIMITED"

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/stripe/hcaptcha/HCaptchaError;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/stripe/hcaptcha/HCaptchaError;->RATE_LIMITED:Lcom/stripe/hcaptcha/HCaptchaError;

    .line 70
    new-instance v0, Lcom/stripe/hcaptcha/HCaptchaError;

    const/16 v1, 0x20

    const-string v2, "Invalid custom theme"

    const-string v3, "INVALID_CUSTOM_THEME"

    invoke-direct {v0, v3, v5, v1, v2}, Lcom/stripe/hcaptcha/HCaptchaError;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/stripe/hcaptcha/HCaptchaError;->INVALID_CUSTOM_THEME:Lcom/stripe/hcaptcha/HCaptchaError;

    .line 75
    new-instance v0, Lcom/stripe/hcaptcha/HCaptchaError;

    const/16 v1, 0x21

    const-string v2, "Insecure resource requested"

    const-string v3, "INSECURE_HTTP_REQUEST_ERROR"

    invoke-direct {v0, v3, v6, v1, v2}, Lcom/stripe/hcaptcha/HCaptchaError;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/stripe/hcaptcha/HCaptchaError;->INSECURE_HTTP_REQUEST_ERROR:Lcom/stripe/hcaptcha/HCaptchaError;

    .line 80
    new-instance v0, Lcom/stripe/hcaptcha/HCaptchaError;

    const/16 v1, 0x1d

    const-string v2, "Unknown error"

    const-string v3, "ERROR"

    invoke-direct {v0, v3, v7, v1, v2}, Lcom/stripe/hcaptcha/HCaptchaError;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/stripe/hcaptcha/HCaptchaError;->ERROR:Lcom/stripe/hcaptcha/HCaptchaError;

    invoke-static {}, Lcom/stripe/hcaptcha/HCaptchaError;->$values()[Lcom/stripe/hcaptcha/HCaptchaError;

    move-result-object v0

    sput-object v0, Lcom/stripe/hcaptcha/HCaptchaError;->$VALUES:[Lcom/stripe/hcaptcha/HCaptchaError;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/hcaptcha/HCaptchaError;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/stripe/hcaptcha/HCaptchaError$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/hcaptcha/HCaptchaError$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/hcaptcha/HCaptchaError;->Companion:Lcom/stripe/hcaptcha/HCaptchaError$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 12
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 16
    iput p3, p0, Lcom/stripe/hcaptcha/HCaptchaError;->errorId:I

    .line 20
    iput-object p4, p0, Lcom/stripe/hcaptcha/HCaptchaError;->message:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/hcaptcha/HCaptchaError;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/hcaptcha/HCaptchaError;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/hcaptcha/HCaptchaError;
    .locals 1

    const-class v0, Lcom/stripe/hcaptcha/HCaptchaError;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 104
    check-cast p0, Lcom/stripe/hcaptcha/HCaptchaError;

    return-object p0
.end method

.method public static values()[Lcom/stripe/hcaptcha/HCaptchaError;
    .locals 1

    sget-object v0, Lcom/stripe/hcaptcha/HCaptchaError;->$VALUES:[Lcom/stripe/hcaptcha/HCaptchaError;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 104
    check-cast v0, [Lcom/stripe/hcaptcha/HCaptchaError;

    return-object v0
.end method


# virtual methods
.method public final getErrorId()I
    .locals 1

    .line 16
    iget v0, p0, Lcom/stripe/hcaptcha/HCaptchaError;->errorId:I

    return v0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptchaError;->message:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptchaError;->message:Ljava/lang/String;

    return-object v0
.end method
