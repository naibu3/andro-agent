.class public final Lcom/nimbusds/jose/JWSObjectJSON$Signature;
.super Ljava/lang/Object;
.source "JWSObjectJSON.java"


# annotations
.annotation runtime Lcom/nimbusds/jose/shaded/jcip/Immutable;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nimbusds/jose/JWSObjectJSON;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Signature"
.end annotation


# instance fields
.field private final header:Lcom/nimbusds/jose/JWSHeader;

.field private final payload:Lcom/nimbusds/jose/Payload;

.field private final signature:Lcom/nimbusds/jose/util/Base64URL;

.field private final unprotectedHeader:Lcom/nimbusds/jose/UnprotectedHeader;

.field private final verified:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method private constructor <init>(Lcom/nimbusds/jose/Payload;Lcom/nimbusds/jose/JWSHeader;Lcom/nimbusds/jose/UnprotectedHeader;Lcom/nimbusds/jose/util/Base64URL;)V
    .locals 2

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/nimbusds/jose/JWSObjectJSON$Signature;->verified:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 104
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    iput-object p1, p0, Lcom/nimbusds/jose/JWSObjectJSON$Signature;->payload:Lcom/nimbusds/jose/Payload;

    .line 107
    iput-object p2, p0, Lcom/nimbusds/jose/JWSObjectJSON$Signature;->header:Lcom/nimbusds/jose/JWSHeader;

    .line 108
    iput-object p3, p0, Lcom/nimbusds/jose/JWSObjectJSON$Signature;->unprotectedHeader:Lcom/nimbusds/jose/UnprotectedHeader;

    .line 110
    invoke-static {p4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    iput-object p4, p0, Lcom/nimbusds/jose/JWSObjectJSON$Signature;->signature:Lcom/nimbusds/jose/util/Base64URL;

    return-void
.end method

.method synthetic constructor <init>(Lcom/nimbusds/jose/Payload;Lcom/nimbusds/jose/JWSHeader;Lcom/nimbusds/jose/UnprotectedHeader;Lcom/nimbusds/jose/util/Base64URL;Lcom/nimbusds/jose/JWSObjectJSON$1;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nimbusds/jose/JWSObjectJSON$Signature;-><init>(Lcom/nimbusds/jose/Payload;Lcom/nimbusds/jose/JWSHeader;Lcom/nimbusds/jose/UnprotectedHeader;Lcom/nimbusds/jose/util/Base64URL;)V

    return-void
.end method

.method static synthetic access$100(Lcom/nimbusds/jose/JWSObjectJSON$Signature;)Ljava/util/Map;
    .locals 0

    .line 54
    invoke-direct {p0}, Lcom/nimbusds/jose/JWSObjectJSON$Signature;->toJSONObject()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private toJSONObject()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 153
    invoke-static {}, Lcom/nimbusds/jose/util/JSONObjectUtils;->newJSONObject()Ljava/util/Map;

    move-result-object v0

    .line 155
    iget-object v1, p0, Lcom/nimbusds/jose/JWSObjectJSON$Signature;->header:Lcom/nimbusds/jose/JWSHeader;

    if-eqz v1, :cond_0

    .line 156
    invoke-virtual {v1}, Lcom/nimbusds/jose/JWSHeader;->toBase64URL()Lcom/nimbusds/jose/util/Base64URL;

    move-result-object v1

    invoke-virtual {v1}, Lcom/nimbusds/jose/util/Base64URL;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "protected"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    :cond_0
    iget-object v1, p0, Lcom/nimbusds/jose/JWSObjectJSON$Signature;->unprotectedHeader:Lcom/nimbusds/jose/UnprotectedHeader;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/nimbusds/jose/UnprotectedHeader;->getIncludedParams()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 160
    iget-object v1, p0, Lcom/nimbusds/jose/JWSObjectJSON$Signature;->unprotectedHeader:Lcom/nimbusds/jose/UnprotectedHeader;

    invoke-virtual {v1}, Lcom/nimbusds/jose/UnprotectedHeader;->toJSONObject()Ljava/util/Map;

    move-result-object v1

    const-string v2, "header"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    :cond_1
    iget-object v1, p0, Lcom/nimbusds/jose/JWSObjectJSON$Signature;->signature:Lcom/nimbusds/jose/util/Base64URL;

    invoke-virtual {v1}, Lcom/nimbusds/jose/util/Base64URL;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "signature"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public getHeader()Lcom/nimbusds/jose/JWSHeader;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/nimbusds/jose/JWSObjectJSON$Signature;->header:Lcom/nimbusds/jose/JWSHeader;

    return-object v0
.end method

.method public getSignature()Lcom/nimbusds/jose/util/Base64URL;
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/nimbusds/jose/JWSObjectJSON$Signature;->signature:Lcom/nimbusds/jose/util/Base64URL;

    return-object v0
.end method

.method public getUnprotectedHeader()Lcom/nimbusds/jose/UnprotectedHeader;
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/nimbusds/jose/JWSObjectJSON$Signature;->unprotectedHeader:Lcom/nimbusds/jose/UnprotectedHeader;

    return-object v0
.end method

.method public isVerified()Z
    .locals 1

    .line 194
    iget-object v0, p0, Lcom/nimbusds/jose/JWSObjectJSON$Signature;->verified:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public toJWSObject()Lcom/nimbusds/jose/JWSObject;
    .locals 4

    .line 178
    :try_start_0
    new-instance v0, Lcom/nimbusds/jose/JWSObject;

    iget-object v1, p0, Lcom/nimbusds/jose/JWSObjectJSON$Signature;->header:Lcom/nimbusds/jose/JWSHeader;

    invoke-virtual {v1}, Lcom/nimbusds/jose/JWSHeader;->toBase64URL()Lcom/nimbusds/jose/util/Base64URL;

    move-result-object v1

    iget-object v2, p0, Lcom/nimbusds/jose/JWSObjectJSON$Signature;->payload:Lcom/nimbusds/jose/Payload;

    invoke-virtual {v2}, Lcom/nimbusds/jose/Payload;->toBase64URL()Lcom/nimbusds/jose/util/Base64URL;

    move-result-object v2

    iget-object v3, p0, Lcom/nimbusds/jose/JWSObjectJSON$Signature;->signature:Lcom/nimbusds/jose/util/Base64URL;

    invoke-direct {v0, v1, v2, v3}, Lcom/nimbusds/jose/JWSObject;-><init>(Lcom/nimbusds/jose/util/Base64URL;Lcom/nimbusds/jose/util/Base64URL;Lcom/nimbusds/jose/util/Base64URL;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 180
    :catch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public declared-synchronized verify(Lcom/nimbusds/jose/JWSVerifier;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;
        }
    .end annotation

    monitor-enter p0

    .line 212
    :try_start_0
    iget-object v0, p0, Lcom/nimbusds/jose/JWSObjectJSON$Signature;->verified:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p0}, Lcom/nimbusds/jose/JWSObjectJSON$Signature;->toJWSObject()Lcom/nimbusds/jose/JWSObject;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/nimbusds/jose/JWSObject;->verify(Lcom/nimbusds/jose/JWSVerifier;)Z

    move-result p1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catch Lcom/nimbusds/jose/JOSEException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 221
    :try_start_1
    iget-object p1, p0, Lcom/nimbusds/jose/JWSObjectJSON$Signature;->verified:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 218
    :try_start_2
    new-instance v0, Lcom/nimbusds/jose/JOSEException;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/nimbusds/jose/JOSEException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p1

    .line 214
    throw p1

    :goto_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
