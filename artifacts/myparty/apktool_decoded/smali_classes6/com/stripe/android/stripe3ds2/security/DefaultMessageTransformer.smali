.class public final Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;
.super Ljava/lang/Object;
.source "DefaultMessageTransformer.kt"

# interfaces
.implements Lcom/stripe/android/stripe3ds2/security/MessageTransformer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0080\u0008\u0018\u0000 02\u00020\u0001:\u00010B!\u0008\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008B\u0011\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0001\u00a2\u0006\u0002\u0008\u0015J\u001d\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0001\u00a2\u0006\u0002\u0008\u0017J\u0015\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000bH\u0001\u00a2\u0006\u0002\u0008\u001bJ\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u000bH\u0002J\u001d\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0001\u00a2\u0006\u0002\u0008\"J\u001d\u0010#\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0001\u00a2\u0006\u0002\u0008$J\t\u0010%\u001a\u00020\u0003H\u00c2\u0003J\t\u0010&\u001a\u00020\u0005H\u00c2\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c2\u0003J,\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u00c0\u0001\u00a2\u0006\u0002\u0008)J\u0013\u0010*\u001a\u00020\u00032\u0008\u0010+\u001a\u0004\u0018\u00010,H\u00d6\u0003J\t\u0010-\u001a\u00020.H\u00d6\u0001J\t\u0010/\u001a\u00020\u000bH\u00d6\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00061"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;",
        "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;",
        "isLiveMode",
        "",
        "counterSdkToAcs",
        "",
        "counterAcsToSdk",
        "<init>",
        "(ZBB)V",
        "(Z)V",
        "encrypt",
        "",
        "challengeRequest",
        "Lorg/json/JSONObject;",
        "secretKey",
        "Ljavax/crypto/SecretKey;",
        "decrypt",
        "message",
        "validateAcsToSdkCounter",
        "",
        "cres",
        "validateAcsToSdkCounter$3ds2sdk_release",
        "decryptMessage",
        "decryptMessage$3ds2sdk_release",
        "createEncryptionHeader",
        "Lcom/nimbusds/jose/JWEHeader;",
        "keyId",
        "createEncryptionHeader$3ds2sdk_release",
        "isValidPayloadPart",
        "part",
        "getDecryptionKey",
        "",
        "encryptionMethod",
        "Lcom/nimbusds/jose/EncryptionMethod;",
        "getDecryptionKey$3ds2sdk_release",
        "getEncryptionKey",
        "getEncryptionKey$3ds2sdk_release",
        "component1",
        "component2",
        "component3",
        "copy",
        "copy$3ds2sdk_release",
        "equals",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "Companion",
        "3ds2sdk_release"
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
.field public static final BITS_IN_BYTE:I = 0x8

.field public static final Companion:Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer$Companion;

.field private static final ENCRYPTION_METHOD:Lcom/nimbusds/jose/EncryptionMethod;

.field public static final FIELD_ACS_COUNTER_ACS_TO_SDK:Ljava/lang/String; = "acsCounterAtoS"

.field public static final FIELD_SDK_COUNTER_SDK_TO_ACS:Ljava/lang/String; = "sdkCounterStoA"


# instance fields
.field private counterAcsToSdk:B

.field private counterSdkToAcs:B

.field private final isLiveMode:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->Companion:Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer$Companion;

    .line 230
    sget-object v0, Lcom/nimbusds/jose/EncryptionMethod;->A128CBC_HS256:Lcom/nimbusds/jose/EncryptionMethod;

    sput-object v0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->ENCRYPTION_METHOD:Lcom/nimbusds/jose/EncryptionMethod;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    const/4 v0, 0x0

    .line 39
    invoke-direct {p0, p1, v0, v0}, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;-><init>(ZBB)V

    return-void
.end method

.method public constructor <init>(ZBB)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-boolean p1, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->isLiveMode:Z

    .line 33
    iput-byte p2, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterSdkToAcs:B

    .line 34
    iput-byte p3, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterAcsToSdk:B

    return-void
.end method

.method private final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->isLiveMode:Z

    return v0
.end method

.method private final component2()B
    .locals 1

    iget-byte v0, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterSdkToAcs:B

    return v0
.end method

.method private final component3()B
    .locals 1

    iget-byte v0, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterAcsToSdk:B

    return v0
.end method

.method public static synthetic copy$3ds2sdk_release$default(Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;ZBBILjava/lang/Object;)Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-boolean p1, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->isLiveMode:Z

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-byte p2, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterSdkToAcs:B

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-byte p3, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterAcsToSdk:B

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->copy$3ds2sdk_release(ZBB)Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;

    move-result-object p0

    return-object p0
.end method

.method private final isValidPayloadPart(Ljava/lang/String;)Z
    .locals 4

    .line 162
    const-string v0, "="

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 163
    check-cast p1, Ljava/lang/CharSequence;

    const-string v0, " "

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 164
    const-string v0, "+"

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 165
    const-string v0, "\n"

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 166
    const-string v0, "/"

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method


# virtual methods
.method public final copy$3ds2sdk_release(ZBB)Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;
    .locals 1

    new-instance v0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;-><init>(ZBB)V

    return-object v0
.end method

.method public final createEncryptionHeader$3ds2sdk_release(Ljava/lang/String;)Lcom/nimbusds/jose/JWEHeader;
    .locals 3

    const-string v0, "keyId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    new-instance v0, Lcom/nimbusds/jose/JWEHeader$Builder;

    sget-object v1, Lcom/nimbusds/jose/JWEAlgorithm;->DIR:Lcom/nimbusds/jose/JWEAlgorithm;

    sget-object v2, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->ENCRYPTION_METHOD:Lcom/nimbusds/jose/EncryptionMethod;

    invoke-direct {v0, v1, v2}, Lcom/nimbusds/jose/JWEHeader$Builder;-><init>(Lcom/nimbusds/jose/JWEAlgorithm;Lcom/nimbusds/jose/EncryptionMethod;)V

    .line 156
    invoke-virtual {v0, p1}, Lcom/nimbusds/jose/JWEHeader$Builder;->keyID(Ljava/lang/String;)Lcom/nimbusds/jose/JWEHeader$Builder;

    move-result-object p1

    .line 157
    invoke-virtual {p1}, Lcom/nimbusds/jose/JWEHeader$Builder;->build()Lcom/nimbusds/jose/JWEHeader;

    move-result-object p1

    const-string v0, "build(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public decrypt(Ljava/lang/String;Ljavax/crypto/SecretKey;)Lorg/json/JSONObject;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;,
            Lcom/nimbusds/jose/JOSEException;,
            Lorg/json/JSONException;,
            Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "secretKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->decryptMessage$3ds2sdk_release(Ljava/lang/String;Ljavax/crypto/SecretKey;)Lorg/json/JSONObject;

    move-result-object p1

    .line 92
    invoke-virtual {p0, p1}, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->validateAcsToSdkCounter$3ds2sdk_release(Lorg/json/JSONObject;)V

    .line 94
    iget-byte p2, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterAcsToSdk:B

    add-int/lit8 p2, p2, 0x1

    int-to-byte p2, p2

    iput-byte p2, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterAcsToSdk:B

    if-eqz p2, :cond_0

    return-object p1

    .line 96
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "ACS to SDK counter is zero"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final decryptMessage$3ds2sdk_release(Ljava/lang/String;Ljavax/crypto/SecretKey;)Lorg/json/JSONObject;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;,
            Lcom/nimbusds/jose/JOSEException;,
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "secretKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    invoke-static {p1}, Lcom/nimbusds/jose/JWEObject;->parse(Ljava/lang/String;)Lcom/nimbusds/jose/JWEObject;

    move-result-object p1

    .line 138
    invoke-virtual {p1}, Lcom/nimbusds/jose/JWEObject;->getHeader()Lcom/nimbusds/jose/JWEHeader;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nimbusds/jose/JWEHeader;->getEncryptionMethod()Lcom/nimbusds/jose/EncryptionMethod;

    move-result-object v0

    const-string v1, "getEncryptionMethod(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, v0}, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->getDecryptionKey$3ds2sdk_release(Ljavax/crypto/SecretKey;Lcom/nimbusds/jose/EncryptionMethod;)[B

    move-result-object p2

    .line 139
    new-instance v0, Lcom/nimbusds/jose/crypto/DirectDecrypter;

    invoke-direct {v0, p2}, Lcom/nimbusds/jose/crypto/DirectDecrypter;-><init>([B)V

    check-cast v0, Lcom/nimbusds/jose/JWEDecrypter;

    invoke-virtual {p1, v0}, Lcom/nimbusds/jose/JWEObject;->decrypt(Lcom/nimbusds/jose/JWEDecrypter;)V

    .line 141
    invoke-virtual {p1}, Lcom/nimbusds/jose/JWEObject;->getHeader()Lcom/nimbusds/jose/JWEHeader;

    move-result-object p2

    invoke-virtual {p2}, Lcom/nimbusds/jose/JWEHeader;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "toString(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->isValidPayloadPart(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 142
    invoke-virtual {p1}, Lcom/nimbusds/jose/JWEObject;->getIV()Lcom/nimbusds/jose/util/Base64URL;

    move-result-object p2

    invoke-virtual {p2}, Lcom/nimbusds/jose/util/Base64URL;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->isValidPayloadPart(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 143
    invoke-virtual {p1}, Lcom/nimbusds/jose/JWEObject;->getCipherText()Lcom/nimbusds/jose/util/Base64URL;

    move-result-object p2

    invoke-virtual {p2}, Lcom/nimbusds/jose/util/Base64URL;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->isValidPayloadPart(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 144
    invoke-virtual {p1}, Lcom/nimbusds/jose/JWEObject;->getAuthTag()Lcom/nimbusds/jose/util/Base64URL;

    move-result-object p2

    invoke-virtual {p2}, Lcom/nimbusds/jose/util/Base64URL;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->isValidPayloadPart(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 150
    new-instance p2, Lorg/json/JSONObject;

    invoke-virtual {p1}, Lcom/nimbusds/jose/JWEObject;->getPayload()Lcom/nimbusds/jose/Payload;

    move-result-object p1

    invoke-virtual {p1}, Lcom/nimbusds/jose/Payload;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    return-object p2

    .line 147
    :cond_0
    new-instance p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    sget-object p2, Lcom/stripe/android/stripe3ds2/transactions/ProtocolError;->DataDecryptionFailure:Lcom/stripe/android/stripe3ds2/transactions/ProtocolError;

    const-string v0, "Invalid encryption."

    invoke-direct {p1, p2, v0}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;-><init>(Lcom/stripe/android/stripe3ds2/transactions/ProtocolError;Ljava/lang/String;)V

    throw p1
.end method

.method public encrypt(Lorg/json/JSONObject;Ljavax/crypto/SecretKey;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;,
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "challengeRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "secretKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    const-string v0, "acsTransID"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    invoke-virtual {p0, v0}, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->createEncryptionHeader$3ds2sdk_release(Ljava/lang/String;)Lcom/nimbusds/jose/JWEHeader;

    move-result-object v0

    .line 59
    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    iget-byte v2, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterSdkToAcs:B

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    const-string v4, "%03d"

    invoke-static {v1, v4, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "format(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    const-string v2, "sdkCounterStoA"

    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 61
    new-instance v1, Lcom/nimbusds/jose/JWEObject;

    .line 63
    new-instance v2, Lcom/nimbusds/jose/Payload;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lcom/nimbusds/jose/Payload;-><init>(Ljava/lang/String;)V

    .line 61
    invoke-direct {v1, v0, v2}, Lcom/nimbusds/jose/JWEObject;-><init>(Lcom/nimbusds/jose/JWEHeader;Lcom/nimbusds/jose/Payload;)V

    .line 67
    new-instance p1, Lcom/stripe/android/stripe3ds2/security/TransactionEncrypter;

    .line 68
    invoke-virtual {v0}, Lcom/nimbusds/jose/JWEHeader;->getEncryptionMethod()Lcom/nimbusds/jose/EncryptionMethod;

    move-result-object v0

    const-string v2, "getEncryptionMethod(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, v0}, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->getEncryptionKey$3ds2sdk_release(Ljavax/crypto/SecretKey;Lcom/nimbusds/jose/EncryptionMethod;)[B

    move-result-object p2

    .line 69
    iget-byte v0, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterSdkToAcs:B

    .line 67
    invoke-direct {p1, p2, v0}, Lcom/stripe/android/stripe3ds2/security/TransactionEncrypter;-><init>([BB)V

    check-cast p1, Lcom/nimbusds/jose/JWEEncrypter;

    .line 66
    invoke-virtual {v1, p1}, Lcom/nimbusds/jose/JWEObject;->encrypt(Lcom/nimbusds/jose/JWEEncrypter;)V

    .line 73
    iget-byte p1, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterSdkToAcs:B

    add-int/2addr p1, v3

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterSdkToAcs:B

    if-eqz p1, :cond_0

    .line 79
    invoke-virtual {v1}, Lcom/nimbusds/jose/JWEObject;->serialize()Ljava/lang/String;

    move-result-object p1

    const-string p2, "serialize(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 75
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "SDK to ACS counter is zero"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;

    iget-boolean v1, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->isLiveMode:Z

    iget-boolean v3, p1, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->isLiveMode:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-byte v1, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterSdkToAcs:B

    iget-byte v3, p1, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterSdkToAcs:B

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-byte v1, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterAcsToSdk:B

    iget-byte p1, p1, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterAcsToSdk:B

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getDecryptionKey$3ds2sdk_release(Ljavax/crypto/SecretKey;Lcom/nimbusds/jose/EncryptionMethod;)[B
    .locals 1

    const-string v0, "secretKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "encryptionMethod"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    invoke-interface {p1}, Ljavax/crypto/SecretKey;->getEncoded()[B

    move-result-object p1

    .line 184
    sget-object v0, Lcom/nimbusds/jose/EncryptionMethod;->A128GCM:Lcom/nimbusds/jose/EncryptionMethod;

    if-ne v0, p2, :cond_0

    .line 187
    array-length p2, p1

    sget-object v0, Lcom/nimbusds/jose/EncryptionMethod;->A128GCM:Lcom/nimbusds/jose/EncryptionMethod;

    invoke-virtual {v0}, Lcom/nimbusds/jose/EncryptionMethod;->cekBitLength()I

    move-result v0

    div-int/lit8 v0, v0, 0x8

    sub-int/2addr p2, v0

    .line 188
    array-length v0, p1

    .line 185
    invoke-static {p1, p2, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    .line 184
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object p1

    .line 190
    :cond_0
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final getEncryptionKey$3ds2sdk_release(Ljavax/crypto/SecretKey;Lcom/nimbusds/jose/EncryptionMethod;)[B
    .locals 1

    const-string v0, "secretKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "encryptionMethod"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    invoke-interface {p1}, Ljavax/crypto/SecretKey;->getEncoded()[B

    move-result-object p1

    .line 209
    sget-object v0, Lcom/nimbusds/jose/EncryptionMethod;->A128GCM:Lcom/nimbusds/jose/EncryptionMethod;

    if-ne v0, p2, :cond_0

    .line 213
    sget-object p2, Lcom/nimbusds/jose/EncryptionMethod;->A128GCM:Lcom/nimbusds/jose/EncryptionMethod;

    invoke-virtual {p2}, Lcom/nimbusds/jose/EncryptionMethod;->cekBitLength()I

    move-result p2

    div-int/lit8 p2, p2, 0x8

    const/4 v0, 0x0

    .line 210
    invoke-static {p1, v0, p2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    .line 209
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object p1

    .line 215
    :cond_0
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object p1
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->isLiveMode:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-byte v1, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterSdkToAcs:B

    invoke-static {v1}, Ljava/lang/Byte;->hashCode(B)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-byte v1, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterAcsToSdk:B

    invoke-static {v1}, Ljava/lang/Byte;->hashCode(B)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-boolean v0, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->isLiveMode:Z

    iget-byte v1, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterSdkToAcs:B

    iget-byte v2, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterAcsToSdk:B

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "DefaultMessageTransformer(isLiveMode="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", counterSdkToAcs="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", counterAcsToSdk="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final validateAcsToSdkCounter$3ds2sdk_release(Lorg/json/JSONObject;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;,
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "cres"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    iget-boolean v0, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->isLiveMode:Z

    if-nez v0, :cond_0

    goto :goto_1

    .line 113
    :cond_0
    const-string v0, "acsCounterAtoS"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 118
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v1, p0

    check-cast v1, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;

    .line 119
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "getString(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B

    move-result p1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    .line 118
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 120
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    .line 125
    iget-byte v0, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterAcsToSdk:B

    if-ne v0, p1, :cond_1

    :goto_1
    return-void

    .line 126
    :cond_1
    new-instance v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    .line 127
    sget-object v1, Lcom/stripe/android/stripe3ds2/transactions/ProtocolError;->DataDecryptionFailure:Lcom/stripe/android/stripe3ds2/transactions/ProtocolError;

    .line 128
    iget-byte v2, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterAcsToSdk:B

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Counters are not equal. SDK counter: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", ACS counter: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 126
    invoke-direct {v0, v1, p1}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;-><init>(Lcom/stripe/android/stripe3ds2/transactions/ProtocolError;Ljava/lang/String;)V

    throw v0

    .line 121
    :cond_2
    sget-object p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->Companion:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException$Companion;

    .line 122
    invoke-virtual {p1, v0}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException$Companion;->createInvalidDataElementFormat(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object p1

    throw p1

    .line 114
    :cond_3
    sget-object p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->Companion:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException$Companion;

    .line 115
    invoke-virtual {p1, v0}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException$Companion;->createRequiredDataElementMissing(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object p1

    throw p1
.end method
