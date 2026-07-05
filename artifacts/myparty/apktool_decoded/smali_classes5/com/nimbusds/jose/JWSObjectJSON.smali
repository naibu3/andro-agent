.class public Lcom/nimbusds/jose/JWSObjectJSON;
.super Lcom/nimbusds/jose/JOSEObjectJSON;
.source "JWSObjectJSON.java"


# annotations
.annotation runtime Lcom/nimbusds/jose/shaded/jcip/ThreadSafe;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nimbusds/jose/JWSObjectJSON$Signature;,
        Lcom/nimbusds/jose/JWSObjectJSON$State;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final signatures:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/nimbusds/jose/JWSObjectJSON$Signature;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/nimbusds/jose/Payload;)V
    .locals 1

    .line 267
    invoke-direct {p0, p1}, Lcom/nimbusds/jose/JOSEObjectJSON;-><init>(Lcom/nimbusds/jose/Payload;)V

    .line 256
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/nimbusds/jose/JWSObjectJSON;->signatures:Ljava/util/List;

    .line 268
    const-string v0, "The payload must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Lcom/nimbusds/jose/Payload;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/Payload;",
            "Ljava/util/List<",
            "Lcom/nimbusds/jose/JWSObjectJSON$Signature;",
            ">;)V"
        }
    .end annotation

    .line 282
    const-string v0, "The payload must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nimbusds/jose/Payload;

    invoke-direct {p0, p1}, Lcom/nimbusds/jose/JOSEObjectJSON;-><init>(Lcom/nimbusds/jose/Payload;)V

    .line 256
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/nimbusds/jose/JWSObjectJSON;->signatures:Ljava/util/List;

    .line 284
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 288
    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void

    .line 285
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "At least one signature required"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static parse(Ljava/lang/String;)Lcom/nimbusds/jose/JWSObjectJSON;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 546
    invoke-static {p0}, Lcom/nimbusds/jose/util/JSONObjectUtils;->parse(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    invoke-static {p0}, Lcom/nimbusds/jose/JWSObjectJSON;->parse(Ljava/util/Map;)Lcom/nimbusds/jose/JWSObjectJSON;

    move-result-object p0

    return-object p0
.end method

.method public static parse(Ljava/util/Map;)Lcom/nimbusds/jose/JWSObjectJSON;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/nimbusds/jose/JWSObjectJSON;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 465
    const-string v0, "payload"

    invoke-static {p0, v0}, Lcom/nimbusds/jose/util/JSONObjectUtils;->getBase64URL(Ljava/util/Map;Ljava/lang/String;)Lcom/nimbusds/jose/util/Base64URL;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    .line 471
    new-instance v3, Lcom/nimbusds/jose/Payload;

    invoke-direct {v3, v0}, Lcom/nimbusds/jose/Payload;-><init>(Lcom/nimbusds/jose/util/Base64URL;)V

    .line 474
    const-string v0, "signature"

    invoke-static {p0, v0}, Lcom/nimbusds/jose/util/JSONObjectUtils;->getBase64URL(Ljava/util/Map;Ljava/lang/String;)Lcom/nimbusds/jose/util/Base64URL;

    move-result-object v6

    if-eqz v6, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    .line 478
    :goto_0
    new-instance v8, Ljava/util/LinkedList;

    invoke-direct {v8}, Ljava/util/LinkedList;-><init>()V

    .line 480
    const-string v9, "header"

    const-string v4, "signatures"

    if-eqz v2, :cond_2

    move-object v2, v4

    .line 482
    invoke-static {p0}, Lcom/nimbusds/jose/JWSObjectJSON;->parseJWSHeader(Ljava/util/Map;)Lcom/nimbusds/jose/JWSHeader;

    move-result-object v4

    .line 484
    invoke-static {p0, v9}, Lcom/nimbusds/jose/util/JSONObjectUtils;->getJSONObject(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/nimbusds/jose/UnprotectedHeader;->parse(Ljava/util/Map;)Lcom/nimbusds/jose/UnprotectedHeader;

    move-result-object v5

    .line 488
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_1

    .line 493
    :try_start_0
    invoke-static {v4, v5}, Lcom/nimbusds/jose/HeaderValidation;->ensureDisjoint(Lcom/nimbusds/jose/Header;Lcom/nimbusds/jose/UnprotectedHeader;)V
    :try_end_0
    .catch Lcom/nimbusds/jose/IllegalHeaderException; {:try_start_0 .. :try_end_0} :catch_0

    .line 498
    new-instance v2, Lcom/nimbusds/jose/JWSObjectJSON$Signature;

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/nimbusds/jose/JWSObjectJSON$Signature;-><init>(Lcom/nimbusds/jose/Payload;Lcom/nimbusds/jose/JWSHeader;Lcom/nimbusds/jose/UnprotectedHeader;Lcom/nimbusds/jose/util/Base64URL;Lcom/nimbusds/jose/JWSObjectJSON$1;)V

    invoke-interface {v8, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :catch_0
    move-exception v0

    move-object p0, v0

    .line 495
    new-instance v0, Ljava/text/ParseException;

    invoke-virtual {p0}, Lcom/nimbusds/jose/IllegalHeaderException;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, v1}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v0

    .line 489
    :cond_1
    new-instance p0, Ljava/text/ParseException;

    const-string v0, "The \"signatures\" member must not be present in flattened JWS JSON serialization"

    invoke-direct {p0, v0, v1}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p0

    :cond_2
    move-object v2, v4

    .line 501
    invoke-static {p0, v2}, Lcom/nimbusds/jose/util/JSONObjectUtils;->getJSONObjectArray(Ljava/util/Map;Ljava/lang/String;)[Ljava/util/Map;

    move-result-object p0

    if-eqz p0, :cond_5

    .line 502
    array-length v2, p0

    if-eqz v2, :cond_5

    .line 506
    array-length v10, p0

    move v11, v1

    :goto_1
    if-ge v11, v10, :cond_4

    aget-object v2, p0, v11

    .line 508
    invoke-static {v2}, Lcom/nimbusds/jose/JWSObjectJSON;->parseJWSHeader(Ljava/util/Map;)Lcom/nimbusds/jose/JWSHeader;

    move-result-object v4

    .line 510
    invoke-static {v2, v9}, Lcom/nimbusds/jose/util/JSONObjectUtils;->getJSONObject(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    invoke-static {v5}, Lcom/nimbusds/jose/UnprotectedHeader;->parse(Ljava/util/Map;)Lcom/nimbusds/jose/UnprotectedHeader;

    move-result-object v5

    .line 513
    :try_start_1
    invoke-static {v4, v5}, Lcom/nimbusds/jose/HeaderValidation;->ensureDisjoint(Lcom/nimbusds/jose/Header;Lcom/nimbusds/jose/UnprotectedHeader;)V
    :try_end_1
    .catch Lcom/nimbusds/jose/IllegalHeaderException; {:try_start_1 .. :try_end_1} :catch_1

    .line 518
    invoke-static {v2, v0}, Lcom/nimbusds/jose/util/JSONObjectUtils;->getBase64URL(Ljava/util/Map;Ljava/lang/String;)Lcom/nimbusds/jose/util/Base64URL;

    move-result-object v6

    if-eqz v6, :cond_3

    .line 524
    new-instance v2, Lcom/nimbusds/jose/JWSObjectJSON$Signature;

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/nimbusds/jose/JWSObjectJSON$Signature;-><init>(Lcom/nimbusds/jose/Payload;Lcom/nimbusds/jose/JWSHeader;Lcom/nimbusds/jose/UnprotectedHeader;Lcom/nimbusds/jose/util/Base64URL;Lcom/nimbusds/jose/JWSObjectJSON$1;)V

    invoke-interface {v8, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 521
    :cond_3
    new-instance p0, Ljava/text/ParseException;

    const-string v0, "Missing \"signature\" member"

    invoke-direct {p0, v0, v1}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p0

    :catch_1
    move-exception v0

    move-object p0, v0

    .line 515
    new-instance v0, Ljava/text/ParseException;

    invoke-virtual {p0}, Lcom/nimbusds/jose/IllegalHeaderException;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, v1}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v0

    .line 528
    :cond_4
    :goto_2
    new-instance p0, Lcom/nimbusds/jose/JWSObjectJSON;

    invoke-direct {p0, v3, v8}, Lcom/nimbusds/jose/JWSObjectJSON;-><init>(Lcom/nimbusds/jose/Payload;Ljava/util/List;)V

    return-object p0

    .line 503
    :cond_5
    new-instance p0, Ljava/text/ParseException;

    const-string v0, "The \"signatures\" member must be present in general JSON Serialization"

    invoke-direct {p0, v0, v1}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p0

    .line 468
    :cond_6
    new-instance p0, Ljava/text/ParseException;

    const-string v0, "Missing payload"

    invoke-direct {p0, v0, v1}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p0
.end method

.method private static parseJWSHeader(Ljava/util/Map;)Lcom/nimbusds/jose/JWSHeader;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/nimbusds/jose/JWSHeader;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 431
    const-string v0, "protected"

    invoke-static {p0, v0}, Lcom/nimbusds/jose/util/JSONObjectUtils;->getBase64URL(Ljava/util/Map;Ljava/lang/String;)Lcom/nimbusds/jose/util/Base64URL;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    .line 438
    :try_start_0
    invoke-static {p0}, Lcom/nimbusds/jose/JWSHeader;->parse(Lcom/nimbusds/jose/util/Base64URL;)Lcom/nimbusds/jose/JWSHeader;

    move-result-object p0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 440
    const-string v1, "Not a JWS header"

    invoke-virtual {p0}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 442
    new-instance p0, Ljava/text/ParseException;

    const-string v1, "Missing JWS \"alg\" parameter in protected header (required by this library)"

    invoke-direct {p0, v1, v0}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p0

    .line 444
    :cond_0
    throw p0

    .line 434
    :cond_1
    new-instance p0, Ljava/text/ParseException;

    const-string v1, "Missing protected header (required by this library)"

    invoke-direct {p0, v1, v0}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p0
.end method


# virtual methods
.method public getSignatures()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/nimbusds/jose/JWSObjectJSON$Signature;",
            ">;"
        }
    .end annotation

    .line 300
    iget-object v0, p0, Lcom/nimbusds/jose/JWSObjectJSON;->signatures:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getState()Lcom/nimbusds/jose/JWSObjectJSON$State;
    .locals 2

    .line 365
    invoke-virtual {p0}, Lcom/nimbusds/jose/JWSObjectJSON;->getSignatures()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 366
    sget-object v0, Lcom/nimbusds/jose/JWSObjectJSON$State;->UNSIGNED:Lcom/nimbusds/jose/JWSObjectJSON$State;

    return-object v0

    .line 369
    :cond_0
    invoke-virtual {p0}, Lcom/nimbusds/jose/JWSObjectJSON;->getSignatures()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nimbusds/jose/JWSObjectJSON$Signature;

    .line 370
    invoke-virtual {v1}, Lcom/nimbusds/jose/JWSObjectJSON$Signature;->isVerified()Z

    move-result v1

    if-nez v1, :cond_1

    .line 371
    sget-object v0, Lcom/nimbusds/jose/JWSObjectJSON$State;->SIGNED:Lcom/nimbusds/jose/JWSObjectJSON$State;

    return-object v0

    .line 375
    :cond_2
    sget-object v0, Lcom/nimbusds/jose/JWSObjectJSON$State;->VERIFIED:Lcom/nimbusds/jose/JWSObjectJSON$State;

    return-object v0
.end method

.method public serializeFlattened()Ljava/lang/String;
    .locals 1

    .line 424
    invoke-virtual {p0}, Lcom/nimbusds/jose/JWSObjectJSON;->toFlattenedJSONObject()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/nimbusds/jose/util/JSONObjectUtils;->toJSONString(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public serializeGeneral()Ljava/lang/String;
    .locals 1

    .line 418
    invoke-virtual {p0}, Lcom/nimbusds/jose/JWSObjectJSON;->toGeneralJSONObject()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/nimbusds/jose/util/JSONObjectUtils;->toJSONString(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized sign(Lcom/nimbusds/jose/JWSHeader;Lcom/nimbusds/jose/JWSSigner;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;
        }
    .end annotation

    monitor-enter p0

    const/4 v0, 0x0

    .line 320
    :try_start_0
    invoke-virtual {p0, p1, v0, p2}, Lcom/nimbusds/jose/JWSObjectJSON;->sign(Lcom/nimbusds/jose/JWSHeader;Lcom/nimbusds/jose/UnprotectedHeader;Lcom/nimbusds/jose/JWSSigner;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 321
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized sign(Lcom/nimbusds/jose/JWSHeader;Lcom/nimbusds/jose/UnprotectedHeader;Lcom/nimbusds/jose/JWSSigner;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;
        }
    .end annotation

    monitor-enter p0

    .line 346
    :try_start_0
    invoke-static {p1, p2}, Lcom/nimbusds/jose/HeaderValidation;->ensureDisjoint(Lcom/nimbusds/jose/Header;Lcom/nimbusds/jose/UnprotectedHeader;)V
    :try_end_0
    .catch Lcom/nimbusds/jose/IllegalHeaderException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 351
    :try_start_1
    new-instance v0, Lcom/nimbusds/jose/JWSObject;

    invoke-virtual {p0}, Lcom/nimbusds/jose/JWSObjectJSON;->getPayload()Lcom/nimbusds/jose/Payload;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/nimbusds/jose/JWSObject;-><init>(Lcom/nimbusds/jose/JWSHeader;Lcom/nimbusds/jose/Payload;)V

    .line 352
    invoke-virtual {v0, p3}, Lcom/nimbusds/jose/JWSObject;->sign(Lcom/nimbusds/jose/JWSSigner;)V

    .line 354
    iget-object p3, p0, Lcom/nimbusds/jose/JWSObjectJSON;->signatures:Ljava/util/List;

    new-instance v1, Lcom/nimbusds/jose/JWSObjectJSON$Signature;

    invoke-virtual {p0}, Lcom/nimbusds/jose/JWSObjectJSON;->getPayload()Lcom/nimbusds/jose/Payload;

    move-result-object v2

    invoke-virtual {v0}, Lcom/nimbusds/jose/JWSObject;->getSignature()Lcom/nimbusds/jose/util/Base64URL;

    move-result-object v5

    const/4 v6, 0x0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Lcom/nimbusds/jose/JWSObjectJSON$Signature;-><init>(Lcom/nimbusds/jose/Payload;Lcom/nimbusds/jose/JWSHeader;Lcom/nimbusds/jose/UnprotectedHeader;Lcom/nimbusds/jose/util/Base64URL;Lcom/nimbusds/jose/JWSObjectJSON$1;)V

    invoke-interface {p3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 355
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    .line 348
    :try_start_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Lcom/nimbusds/jose/IllegalHeaderException;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :goto_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public toFlattenedJSONObject()Ljava/util/Map;
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

    .line 405
    iget-object v0, p0, Lcom/nimbusds/jose/JWSObjectJSON;->signatures:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 409
    invoke-static {}, Lcom/nimbusds/jose/util/JSONObjectUtils;->newJSONObject()Ljava/util/Map;

    move-result-object v0

    .line 410
    invoke-virtual {p0}, Lcom/nimbusds/jose/JWSObjectJSON;->getPayload()Lcom/nimbusds/jose/Payload;

    move-result-object v1

    invoke-virtual {v1}, Lcom/nimbusds/jose/Payload;->toBase64URL()Lcom/nimbusds/jose/util/Base64URL;

    move-result-object v1

    invoke-virtual {v1}, Lcom/nimbusds/jose/util/Base64URL;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "payload"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    invoke-virtual {p0}, Lcom/nimbusds/jose/JWSObjectJSON;->getSignatures()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nimbusds/jose/JWSObjectJSON$Signature;

    invoke-static {v1}, Lcom/nimbusds/jose/JWSObjectJSON$Signature;->access$100(Lcom/nimbusds/jose/JWSObjectJSON$Signature;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object v0

    .line 406
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The flattened JWS JSON serialization requires exactly one signature"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public toGeneralJSONObject()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 382
    iget-object v0, p0, Lcom/nimbusds/jose/JWSObjectJSON;->signatures:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_1

    .line 386
    invoke-static {}, Lcom/nimbusds/jose/util/JSONObjectUtils;->newJSONObject()Ljava/util/Map;

    move-result-object v0

    .line 387
    invoke-virtual {p0}, Lcom/nimbusds/jose/JWSObjectJSON;->getPayload()Lcom/nimbusds/jose/Payload;

    move-result-object v1

    invoke-virtual {v1}, Lcom/nimbusds/jose/Payload;->toBase64URL()Lcom/nimbusds/jose/util/Base64URL;

    move-result-object v1

    invoke-virtual {v1}, Lcom/nimbusds/jose/util/Base64URL;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "payload"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    invoke-static {}, Lcom/nimbusds/jose/util/JSONArrayUtils;->newJSONArray()Ljava/util/List;

    move-result-object v1

    .line 391
    invoke-virtual {p0}, Lcom/nimbusds/jose/JWSObjectJSON;->getSignatures()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/nimbusds/jose/JWSObjectJSON$Signature;

    .line 392
    invoke-static {v3}, Lcom/nimbusds/jose/JWSObjectJSON$Signature;->access$100(Lcom/nimbusds/jose/JWSObjectJSON$Signature;)Ljava/util/Map;

    move-result-object v3

    .line 393
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 396
    :cond_0
    const-string v2, "signatures"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    .line 383
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The general JWS JSON serialization requires at least one signature"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
