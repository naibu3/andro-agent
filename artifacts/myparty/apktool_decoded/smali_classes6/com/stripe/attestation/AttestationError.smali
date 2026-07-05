.class public final Lcom/stripe/attestation/AttestationError;
.super Ljava/lang/Exception;
.source "AttestationError.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/attestation/AttestationError$Companion;,
        Lcom/stripe/attestation/AttestationError$ErrorType;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0002\r\u000eB#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/attestation/AttestationError;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "errorType",
        "Lcom/stripe/attestation/AttestationError$ErrorType;",
        "message",
        "",
        "cause",
        "",
        "<init>",
        "(Lcom/stripe/attestation/AttestationError$ErrorType;Ljava/lang/String;Ljava/lang/Throwable;)V",
        "getErrorType",
        "()Lcom/stripe/attestation/AttestationError$ErrorType;",
        "ErrorType",
        "Companion",
        "stripe-attestation_release"
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
.field public static final Companion:Lcom/stripe/attestation/AttestationError$Companion;

.field private static final errorCodeToErrorTypeMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/stripe/attestation/AttestationError$ErrorType;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final errorType:Lcom/stripe/attestation/AttestationError$ErrorType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/attestation/AttestationError$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/attestation/AttestationError$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/attestation/AttestationError;->Companion:Lcom/stripe/attestation/AttestationError$Companion;

    const/16 v0, 0x11

    .line 58
    new-array v0, v0, [Lkotlin/Pair;

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/stripe/attestation/AttestationError$ErrorType;->API_NOT_AVAILABLE:Lcom/stripe/attestation/AttestationError$ErrorType;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, -0x5

    .line 59
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v3, Lcom/stripe/attestation/AttestationError$ErrorType;->APP_NOT_INSTALLED:Lcom/stripe/attestation/AttestationError$ErrorType;

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const/4 v1, -0x7

    .line 60
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v3, Lcom/stripe/attestation/AttestationError$ErrorType;->APP_UID_MISMATCH:Lcom/stripe/attestation/AttestationError$ErrorType;

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    const/16 v1, -0x9

    .line 61
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v3, Lcom/stripe/attestation/AttestationError$ErrorType;->CANNOT_BIND_TO_SERVICE:Lcom/stripe/attestation/AttestationError$ErrorType;

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v0, v3

    const/16 v1, -0x12

    .line 62
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v3, Lcom/stripe/attestation/AttestationError$ErrorType;->CLIENT_TRANSIENT_ERROR:Lcom/stripe/attestation/AttestationError$ErrorType;

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x4

    aput-object v1, v0, v3

    const/16 v1, -0x10

    .line 63
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v3, Lcom/stripe/attestation/AttestationError$ErrorType;->CLOUD_PROJECT_NUMBER_IS_INVALID:Lcom/stripe/attestation/AttestationError$ErrorType;

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x5

    aput-object v1, v0, v3

    const/16 v1, -0xc

    .line 64
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v3, Lcom/stripe/attestation/AttestationError$ErrorType;->GOOGLE_SERVER_UNAVAILABLE:Lcom/stripe/attestation/AttestationError$ErrorType;

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x6

    aput-object v1, v0, v3

    const/16 v1, -0x13

    .line 65
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v3, Lcom/stripe/attestation/AttestationError$ErrorType;->INTEGRITY_TOKEN_PROVIDER_INVALID:Lcom/stripe/attestation/AttestationError$ErrorType;

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x7

    aput-object v1, v0, v3

    const/16 v1, -0x64

    .line 66
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v3, Lcom/stripe/attestation/AttestationError$ErrorType;->INTERNAL_ERROR:Lcom/stripe/attestation/AttestationError$ErrorType;

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x8

    aput-object v1, v0, v3

    const/4 v1, -0x3

    .line 67
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v3, Lcom/stripe/attestation/AttestationError$ErrorType;->NETWORK_ERROR:Lcom/stripe/attestation/AttestationError$ErrorType;

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x9

    aput-object v1, v0, v3

    .line 68
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/stripe/attestation/AttestationError$ErrorType;->NO_ERROR:Lcom/stripe/attestation/AttestationError$ErrorType;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const/4 v1, -0x6

    .line 69
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/stripe/attestation/AttestationError$ErrorType;->PLAY_SERVICES_NOT_FOUND:Lcom/stripe/attestation/AttestationError$ErrorType;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const/16 v1, -0xf

    .line 70
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/stripe/attestation/AttestationError$ErrorType;->PLAY_SERVICES_VERSION_OUTDATED:Lcom/stripe/attestation/AttestationError$ErrorType;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const/4 v1, -0x2

    .line 71
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/stripe/attestation/AttestationError$ErrorType;->PLAY_STORE_NOT_FOUND:Lcom/stripe/attestation/AttestationError$ErrorType;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const/16 v1, -0xe

    .line 72
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/stripe/attestation/AttestationError$ErrorType;->PLAY_STORE_VERSION_OUTDATED:Lcom/stripe/attestation/AttestationError$ErrorType;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const/16 v1, -0x11

    .line 73
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/stripe/attestation/AttestationError$ErrorType;->REQUEST_HASH_TOO_LONG:Lcom/stripe/attestation/AttestationError$ErrorType;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const/4 v1, -0x8

    .line 74
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/stripe/attestation/AttestationError$ErrorType;->TOO_MANY_REQUESTS:Lcom/stripe/attestation/AttestationError$ErrorType;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x10

    aput-object v1, v0, v2

    .line 57
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/stripe/attestation/AttestationError;->errorCodeToErrorTypeMap:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/attestation/AttestationError$ErrorType;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "errorType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0, p2, p3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 9
    iput-object p1, p0, Lcom/stripe/attestation/AttestationError;->errorType:Lcom/stripe/attestation/AttestationError$ErrorType;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/attestation/AttestationError$ErrorType;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 8
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/attestation/AttestationError;-><init>(Lcom/stripe/attestation/AttestationError$ErrorType;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final synthetic access$getErrorCodeToErrorTypeMap$cp()Ljava/util/Map;
    .locals 1

    .line 7
    sget-object v0, Lcom/stripe/attestation/AttestationError;->errorCodeToErrorTypeMap:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public final getErrorType()Lcom/stripe/attestation/AttestationError$ErrorType;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/stripe/attestation/AttestationError;->errorType:Lcom/stripe/attestation/AttestationError$ErrorType;

    return-object v0
.end method
