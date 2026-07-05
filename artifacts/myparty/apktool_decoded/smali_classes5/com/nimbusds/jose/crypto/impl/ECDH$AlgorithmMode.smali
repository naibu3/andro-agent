.class public final enum Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;
.super Ljava/lang/Enum;
.source "ECDH.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nimbusds/jose/crypto/impl/ECDH;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AlgorithmMode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;

.field public static final enum DIRECT:Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;

.field public static final enum KW:Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;


# direct methods
.method private static synthetic $values()[Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;
    .locals 2

    .line 54
    sget-object v0, Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;->DIRECT:Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;

    sget-object v1, Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;->KW:Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;

    filled-new-array {v0, v1}, [Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 59
    new-instance v0, Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;

    const-string v1, "DIRECT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;->DIRECT:Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;

    .line 65
    new-instance v0, Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;

    const-string v1, "KW"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;->KW:Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;

    .line 54
    invoke-static {}, Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;->$values()[Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;

    move-result-object v0

    sput-object v0, Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;->$VALUES:[Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 54
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;
    .locals 1

    .line 54
    const-class v0, Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;

    return-object p0
.end method

.method public static values()[Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;
    .locals 1

    .line 54
    sget-object v0, Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;->$VALUES:[Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;

    invoke-virtual {v0}, [Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/nimbusds/jose/crypto/impl/ECDH$AlgorithmMode;

    return-object v0
.end method
