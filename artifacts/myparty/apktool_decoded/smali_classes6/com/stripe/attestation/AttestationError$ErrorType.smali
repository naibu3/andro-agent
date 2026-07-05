.class public final enum Lcom/stripe/attestation/AttestationError$ErrorType;
.super Ljava/lang/Enum;
.source "AttestationError.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/attestation/AttestationError;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ErrorType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/attestation/AttestationError$ErrorType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0017\u0008\u0087\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/attestation/AttestationError$ErrorType;",
        "",
        "isRetriable",
        "",
        "<init>",
        "(Ljava/lang/String;IZ)V",
        "()Z",
        "API_NOT_AVAILABLE",
        "APP_NOT_INSTALLED",
        "APP_UID_MISMATCH",
        "CANNOT_BIND_TO_SERVICE",
        "CLIENT_TRANSIENT_ERROR",
        "CLOUD_PROJECT_NUMBER_IS_INVALID",
        "GOOGLE_SERVER_UNAVAILABLE",
        "INTEGRITY_TOKEN_PROVIDER_INVALID",
        "INTERNAL_ERROR",
        "NO_ERROR",
        "NETWORK_ERROR",
        "PLAY_SERVICES_NOT_FOUND",
        "PLAY_SERVICES_VERSION_OUTDATED",
        "PLAY_STORE_NOT_FOUND",
        "PLAY_STORE_VERSION_OUTDATED",
        "REQUEST_HASH_TOO_LONG",
        "TOO_MANY_REQUESTS",
        "BACKEND_VERDICT_FAILED",
        "UNKNOWN",
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
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/stripe/attestation/AttestationError$ErrorType;

.field public static final enum API_NOT_AVAILABLE:Lcom/stripe/attestation/AttestationError$ErrorType;

.field public static final enum APP_NOT_INSTALLED:Lcom/stripe/attestation/AttestationError$ErrorType;

.field public static final enum APP_UID_MISMATCH:Lcom/stripe/attestation/AttestationError$ErrorType;

.field public static final enum BACKEND_VERDICT_FAILED:Lcom/stripe/attestation/AttestationError$ErrorType;

.field public static final enum CANNOT_BIND_TO_SERVICE:Lcom/stripe/attestation/AttestationError$ErrorType;

.field public static final enum CLIENT_TRANSIENT_ERROR:Lcom/stripe/attestation/AttestationError$ErrorType;

.field public static final enum CLOUD_PROJECT_NUMBER_IS_INVALID:Lcom/stripe/attestation/AttestationError$ErrorType;

.field public static final enum GOOGLE_SERVER_UNAVAILABLE:Lcom/stripe/attestation/AttestationError$ErrorType;

.field public static final enum INTEGRITY_TOKEN_PROVIDER_INVALID:Lcom/stripe/attestation/AttestationError$ErrorType;

.field public static final enum INTERNAL_ERROR:Lcom/stripe/attestation/AttestationError$ErrorType;

.field public static final enum NETWORK_ERROR:Lcom/stripe/attestation/AttestationError$ErrorType;

.field public static final enum NO_ERROR:Lcom/stripe/attestation/AttestationError$ErrorType;

.field public static final enum PLAY_SERVICES_NOT_FOUND:Lcom/stripe/attestation/AttestationError$ErrorType;

.field public static final enum PLAY_SERVICES_VERSION_OUTDATED:Lcom/stripe/attestation/AttestationError$ErrorType;

.field public static final enum PLAY_STORE_NOT_FOUND:Lcom/stripe/attestation/AttestationError$ErrorType;

.field public static final enum PLAY_STORE_VERSION_OUTDATED:Lcom/stripe/attestation/AttestationError$ErrorType;

.field public static final enum REQUEST_HASH_TOO_LONG:Lcom/stripe/attestation/AttestationError$ErrorType;

.field public static final enum TOO_MANY_REQUESTS:Lcom/stripe/attestation/AttestationError$ErrorType;

.field public static final enum UNKNOWN:Lcom/stripe/attestation/AttestationError$ErrorType;


# instance fields
.field private final isRetriable:Z


# direct methods
.method private static final synthetic $values()[Lcom/stripe/attestation/AttestationError$ErrorType;
    .locals 20

    sget-object v1, Lcom/stripe/attestation/AttestationError$ErrorType;->API_NOT_AVAILABLE:Lcom/stripe/attestation/AttestationError$ErrorType;

    sget-object v2, Lcom/stripe/attestation/AttestationError$ErrorType;->APP_NOT_INSTALLED:Lcom/stripe/attestation/AttestationError$ErrorType;

    sget-object v3, Lcom/stripe/attestation/AttestationError$ErrorType;->APP_UID_MISMATCH:Lcom/stripe/attestation/AttestationError$ErrorType;

    sget-object v4, Lcom/stripe/attestation/AttestationError$ErrorType;->CANNOT_BIND_TO_SERVICE:Lcom/stripe/attestation/AttestationError$ErrorType;

    sget-object v5, Lcom/stripe/attestation/AttestationError$ErrorType;->CLIENT_TRANSIENT_ERROR:Lcom/stripe/attestation/AttestationError$ErrorType;

    sget-object v6, Lcom/stripe/attestation/AttestationError$ErrorType;->CLOUD_PROJECT_NUMBER_IS_INVALID:Lcom/stripe/attestation/AttestationError$ErrorType;

    sget-object v7, Lcom/stripe/attestation/AttestationError$ErrorType;->GOOGLE_SERVER_UNAVAILABLE:Lcom/stripe/attestation/AttestationError$ErrorType;

    sget-object v8, Lcom/stripe/attestation/AttestationError$ErrorType;->INTEGRITY_TOKEN_PROVIDER_INVALID:Lcom/stripe/attestation/AttestationError$ErrorType;

    sget-object v9, Lcom/stripe/attestation/AttestationError$ErrorType;->INTERNAL_ERROR:Lcom/stripe/attestation/AttestationError$ErrorType;

    sget-object v10, Lcom/stripe/attestation/AttestationError$ErrorType;->NO_ERROR:Lcom/stripe/attestation/AttestationError$ErrorType;

    sget-object v11, Lcom/stripe/attestation/AttestationError$ErrorType;->NETWORK_ERROR:Lcom/stripe/attestation/AttestationError$ErrorType;

    sget-object v12, Lcom/stripe/attestation/AttestationError$ErrorType;->PLAY_SERVICES_NOT_FOUND:Lcom/stripe/attestation/AttestationError$ErrorType;

    sget-object v13, Lcom/stripe/attestation/AttestationError$ErrorType;->PLAY_SERVICES_VERSION_OUTDATED:Lcom/stripe/attestation/AttestationError$ErrorType;

    sget-object v14, Lcom/stripe/attestation/AttestationError$ErrorType;->PLAY_STORE_NOT_FOUND:Lcom/stripe/attestation/AttestationError$ErrorType;

    sget-object v15, Lcom/stripe/attestation/AttestationError$ErrorType;->PLAY_STORE_VERSION_OUTDATED:Lcom/stripe/attestation/AttestationError$ErrorType;

    sget-object v16, Lcom/stripe/attestation/AttestationError$ErrorType;->REQUEST_HASH_TOO_LONG:Lcom/stripe/attestation/AttestationError$ErrorType;

    sget-object v17, Lcom/stripe/attestation/AttestationError$ErrorType;->TOO_MANY_REQUESTS:Lcom/stripe/attestation/AttestationError$ErrorType;

    sget-object v18, Lcom/stripe/attestation/AttestationError$ErrorType;->BACKEND_VERDICT_FAILED:Lcom/stripe/attestation/AttestationError$ErrorType;

    sget-object v19, Lcom/stripe/attestation/AttestationError$ErrorType;->UNKNOWN:Lcom/stripe/attestation/AttestationError$ErrorType;

    filled-new-array/range {v1 .. v19}, [Lcom/stripe/attestation/AttestationError$ErrorType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 19
    new-instance v0, Lcom/stripe/attestation/AttestationError$ErrorType;

    const-string v1, "API_NOT_AVAILABLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/stripe/attestation/AttestationError$ErrorType;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/stripe/attestation/AttestationError$ErrorType;->API_NOT_AVAILABLE:Lcom/stripe/attestation/AttestationError$ErrorType;

    .line 20
    new-instance v0, Lcom/stripe/attestation/AttestationError$ErrorType;

    const-string v1, "APP_NOT_INSTALLED"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v2}, Lcom/stripe/attestation/AttestationError$ErrorType;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/stripe/attestation/AttestationError$ErrorType;->APP_NOT_INSTALLED:Lcom/stripe/attestation/AttestationError$ErrorType;

    .line 21
    new-instance v0, Lcom/stripe/attestation/AttestationError$ErrorType;

    const-string v1, "APP_UID_MISMATCH"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4, v2}, Lcom/stripe/attestation/AttestationError$ErrorType;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/stripe/attestation/AttestationError$ErrorType;->APP_UID_MISMATCH:Lcom/stripe/attestation/AttestationError$ErrorType;

    .line 22
    new-instance v0, Lcom/stripe/attestation/AttestationError$ErrorType;

    const-string v1, "CANNOT_BIND_TO_SERVICE"

    const/4 v4, 0x3

    invoke-direct {v0, v1, v4, v3}, Lcom/stripe/attestation/AttestationError$ErrorType;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/stripe/attestation/AttestationError$ErrorType;->CANNOT_BIND_TO_SERVICE:Lcom/stripe/attestation/AttestationError$ErrorType;

    .line 23
    new-instance v0, Lcom/stripe/attestation/AttestationError$ErrorType;

    const-string v1, "CLIENT_TRANSIENT_ERROR"

    const/4 v4, 0x4

    invoke-direct {v0, v1, v4, v3}, Lcom/stripe/attestation/AttestationError$ErrorType;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/stripe/attestation/AttestationError$ErrorType;->CLIENT_TRANSIENT_ERROR:Lcom/stripe/attestation/AttestationError$ErrorType;

    .line 24
    new-instance v0, Lcom/stripe/attestation/AttestationError$ErrorType;

    const-string v1, "CLOUD_PROJECT_NUMBER_IS_INVALID"

    const/4 v4, 0x5

    invoke-direct {v0, v1, v4, v2}, Lcom/stripe/attestation/AttestationError$ErrorType;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/stripe/attestation/AttestationError$ErrorType;->CLOUD_PROJECT_NUMBER_IS_INVALID:Lcom/stripe/attestation/AttestationError$ErrorType;

    .line 25
    new-instance v0, Lcom/stripe/attestation/AttestationError$ErrorType;

    const-string v1, "GOOGLE_SERVER_UNAVAILABLE"

    const/4 v4, 0x6

    invoke-direct {v0, v1, v4, v3}, Lcom/stripe/attestation/AttestationError$ErrorType;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/stripe/attestation/AttestationError$ErrorType;->GOOGLE_SERVER_UNAVAILABLE:Lcom/stripe/attestation/AttestationError$ErrorType;

    .line 26
    new-instance v0, Lcom/stripe/attestation/AttestationError$ErrorType;

    const-string v1, "INTEGRITY_TOKEN_PROVIDER_INVALID"

    const/4 v4, 0x7

    invoke-direct {v0, v1, v4, v2}, Lcom/stripe/attestation/AttestationError$ErrorType;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/stripe/attestation/AttestationError$ErrorType;->INTEGRITY_TOKEN_PROVIDER_INVALID:Lcom/stripe/attestation/AttestationError$ErrorType;

    .line 27
    new-instance v0, Lcom/stripe/attestation/AttestationError$ErrorType;

    const-string v1, "INTERNAL_ERROR"

    const/16 v4, 0x8

    invoke-direct {v0, v1, v4, v3}, Lcom/stripe/attestation/AttestationError$ErrorType;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/stripe/attestation/AttestationError$ErrorType;->INTERNAL_ERROR:Lcom/stripe/attestation/AttestationError$ErrorType;

    .line 28
    new-instance v0, Lcom/stripe/attestation/AttestationError$ErrorType;

    const-string v1, "NO_ERROR"

    const/16 v4, 0x9

    invoke-direct {v0, v1, v4, v2}, Lcom/stripe/attestation/AttestationError$ErrorType;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/stripe/attestation/AttestationError$ErrorType;->NO_ERROR:Lcom/stripe/attestation/AttestationError$ErrorType;

    .line 29
    new-instance v0, Lcom/stripe/attestation/AttestationError$ErrorType;

    const-string v1, "NETWORK_ERROR"

    const/16 v4, 0xa

    invoke-direct {v0, v1, v4, v3}, Lcom/stripe/attestation/AttestationError$ErrorType;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/stripe/attestation/AttestationError$ErrorType;->NETWORK_ERROR:Lcom/stripe/attestation/AttestationError$ErrorType;

    .line 30
    new-instance v0, Lcom/stripe/attestation/AttestationError$ErrorType;

    const-string v1, "PLAY_SERVICES_NOT_FOUND"

    const/16 v4, 0xb

    invoke-direct {v0, v1, v4, v2}, Lcom/stripe/attestation/AttestationError$ErrorType;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/stripe/attestation/AttestationError$ErrorType;->PLAY_SERVICES_NOT_FOUND:Lcom/stripe/attestation/AttestationError$ErrorType;

    .line 31
    new-instance v0, Lcom/stripe/attestation/AttestationError$ErrorType;

    const-string v1, "PLAY_SERVICES_VERSION_OUTDATED"

    const/16 v4, 0xc

    invoke-direct {v0, v1, v4, v2}, Lcom/stripe/attestation/AttestationError$ErrorType;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/stripe/attestation/AttestationError$ErrorType;->PLAY_SERVICES_VERSION_OUTDATED:Lcom/stripe/attestation/AttestationError$ErrorType;

    .line 32
    new-instance v0, Lcom/stripe/attestation/AttestationError$ErrorType;

    const-string v1, "PLAY_STORE_NOT_FOUND"

    const/16 v4, 0xd

    invoke-direct {v0, v1, v4, v3}, Lcom/stripe/attestation/AttestationError$ErrorType;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/stripe/attestation/AttestationError$ErrorType;->PLAY_STORE_NOT_FOUND:Lcom/stripe/attestation/AttestationError$ErrorType;

    .line 33
    new-instance v0, Lcom/stripe/attestation/AttestationError$ErrorType;

    const-string v1, "PLAY_STORE_VERSION_OUTDATED"

    const/16 v4, 0xe

    invoke-direct {v0, v1, v4, v2}, Lcom/stripe/attestation/AttestationError$ErrorType;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/stripe/attestation/AttestationError$ErrorType;->PLAY_STORE_VERSION_OUTDATED:Lcom/stripe/attestation/AttestationError$ErrorType;

    .line 34
    new-instance v0, Lcom/stripe/attestation/AttestationError$ErrorType;

    const-string v1, "REQUEST_HASH_TOO_LONG"

    const/16 v4, 0xf

    invoke-direct {v0, v1, v4, v2}, Lcom/stripe/attestation/AttestationError$ErrorType;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/stripe/attestation/AttestationError$ErrorType;->REQUEST_HASH_TOO_LONG:Lcom/stripe/attestation/AttestationError$ErrorType;

    .line 35
    new-instance v0, Lcom/stripe/attestation/AttestationError$ErrorType;

    const-string v1, "TOO_MANY_REQUESTS"

    const/16 v4, 0x10

    invoke-direct {v0, v1, v4, v3}, Lcom/stripe/attestation/AttestationError$ErrorType;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/stripe/attestation/AttestationError$ErrorType;->TOO_MANY_REQUESTS:Lcom/stripe/attestation/AttestationError$ErrorType;

    .line 38
    new-instance v0, Lcom/stripe/attestation/AttestationError$ErrorType;

    const-string v1, "BACKEND_VERDICT_FAILED"

    const/16 v3, 0x11

    invoke-direct {v0, v1, v3, v2}, Lcom/stripe/attestation/AttestationError$ErrorType;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/stripe/attestation/AttestationError$ErrorType;->BACKEND_VERDICT_FAILED:Lcom/stripe/attestation/AttestationError$ErrorType;

    .line 39
    new-instance v0, Lcom/stripe/attestation/AttestationError$ErrorType;

    const-string v1, "UNKNOWN"

    const/16 v3, 0x12

    invoke-direct {v0, v1, v3, v2}, Lcom/stripe/attestation/AttestationError$ErrorType;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/stripe/attestation/AttestationError$ErrorType;->UNKNOWN:Lcom/stripe/attestation/AttestationError$ErrorType;

    invoke-static {}, Lcom/stripe/attestation/AttestationError$ErrorType;->$values()[Lcom/stripe/attestation/AttestationError$ErrorType;

    move-result-object v0

    sput-object v0, Lcom/stripe/attestation/AttestationError$ErrorType;->$VALUES:[Lcom/stripe/attestation/AttestationError$ErrorType;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/attestation/AttestationError$ErrorType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    .line 15
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 16
    iput-boolean p3, p0, Lcom/stripe/attestation/AttestationError$ErrorType;->isRetriable:Z

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/attestation/AttestationError$ErrorType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/attestation/AttestationError$ErrorType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/attestation/AttestationError$ErrorType;
    .locals 1

    const-class v0, Lcom/stripe/attestation/AttestationError$ErrorType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 40
    check-cast p0, Lcom/stripe/attestation/AttestationError$ErrorType;

    return-object p0
.end method

.method public static values()[Lcom/stripe/attestation/AttestationError$ErrorType;
    .locals 1

    sget-object v0, Lcom/stripe/attestation/AttestationError$ErrorType;->$VALUES:[Lcom/stripe/attestation/AttestationError$ErrorType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 40
    check-cast v0, [Lcom/stripe/attestation/AttestationError$ErrorType;

    return-object v0
.end method


# virtual methods
.method public final isRetriable()Z
    .locals 1

    .line 16
    iget-boolean v0, p0, Lcom/stripe/attestation/AttestationError$ErrorType;->isRetriable:Z

    return v0
.end method
