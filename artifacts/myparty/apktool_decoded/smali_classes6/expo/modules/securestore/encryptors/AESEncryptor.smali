.class public final Lexpo/modules/securestore/encryptors/AESEncryptor;
.super Ljava/lang/Object;
.source "AESEncryptor.kt"

# interfaces
.implements Lexpo/modules/securestore/encryptors/KeyBasedEncryptor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/securestore/encryptors/AESEncryptor$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lexpo/modules/securestore/encryptors/KeyBasedEncryptor<",
        "Ljava/security/KeyStore$SecretKeyEntry;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 !2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0008H\u0017J6\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0002\u0010\u0016J%\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0000\u00a2\u0006\u0002\u0008\u001cJ6\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0002\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lexpo/modules/securestore/encryptors/AESEncryptor;",
        "Lexpo/modules/securestore/encryptors/KeyBasedEncryptor;",
        "Ljava/security/KeyStore$SecretKeyEntry;",
        "<init>",
        "()V",
        "getKeyStoreAlias",
        "",
        "options",
        "Lexpo/modules/securestore/SecureStoreOptions;",
        "getExtendedKeyStoreAlias",
        "requireAuthentication",
        "",
        "initializeKeyStoreEntry",
        "keyStore",
        "Ljava/security/KeyStore;",
        "createEncryptedItem",
        "Lorg/json/JSONObject;",
        "plaintextValue",
        "keyStoreEntry",
        "authenticationPrompt",
        "authenticationHelper",
        "Lexpo/modules/securestore/AuthenticationHelper;",
        "(Ljava/lang/String;Ljava/security/KeyStore$SecretKeyEntry;ZLjava/lang/String;Lexpo/modules/securestore/AuthenticationHelper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createEncryptedItemWithCipher",
        "cipher",
        "Ljavax/crypto/Cipher;",
        "gcmSpec",
        "Ljavax/crypto/spec/GCMParameterSpec;",
        "createEncryptedItemWithCipher$expo_secure_store_release",
        "decryptItem",
        "key",
        "encryptedItem",
        "(Ljava/lang/String;Lorg/json/JSONObject;Ljava/security/KeyStore$SecretKeyEntry;Lexpo/modules/securestore/SecureStoreOptions;Lexpo/modules/securestore/AuthenticationHelper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Companion",
        "expo-secure-store_release"
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
.field public static final AES_CIPHER:Ljava/lang/String; = "AES/GCM/NoPadding"

.field public static final AES_KEY_SIZE_BITS:I = 0x100

.field private static final CIPHERTEXT_PROPERTY:Ljava/lang/String; = "ct"

.field public static final Companion:Lexpo/modules/securestore/encryptors/AESEncryptor$Companion;

.field private static final GCM_AUTHENTICATION_TAG_LENGTH_PROPERTY:Ljava/lang/String; = "tlen"

.field public static final IV_PROPERTY:Ljava/lang/String; = "iv"

.field private static final MIN_GCM_AUTHENTICATION_TAG_LENGTH:I = 0x60

.field public static final NAME:Ljava/lang/String; = "aes"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lexpo/modules/securestore/encryptors/AESEncryptor$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lexpo/modules/securestore/encryptors/AESEncryptor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lexpo/modules/securestore/encryptors/AESEncryptor;->Companion:Lexpo/modules/securestore/encryptors/AESEncryptor$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic createEncryptedItem(Ljava/lang/String;Ljava/security/KeyStore$Entry;ZLjava/lang/String;Lexpo/modules/securestore/AuthenticationHelper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 33
    check-cast p2, Ljava/security/KeyStore$SecretKeyEntry;

    invoke-virtual/range {p0 .. p6}, Lexpo/modules/securestore/encryptors/AESEncryptor;->createEncryptedItem(Ljava/lang/String;Ljava/security/KeyStore$SecretKeyEntry;ZLjava/lang/String;Lexpo/modules/securestore/AuthenticationHelper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createEncryptedItem(Ljava/lang/String;Ljava/security/KeyStore$SecretKeyEntry;ZLjava/lang/String;Lexpo/modules/securestore/AuthenticationHelper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/security/KeyStore$SecretKeyEntry;",
            "Z",
            "Ljava/lang/String;",
            "Lexpo/modules/securestore/AuthenticationHelper;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lorg/json/JSONObject;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/crypto/IllegalBlockSizeException;,
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    instance-of v0, p6, Lexpo/modules/securestore/encryptors/AESEncryptor$createEncryptedItem$1;

    if-eqz v0, :cond_0

    move-object v0, p6

    check-cast v0, Lexpo/modules/securestore/encryptors/AESEncryptor$createEncryptedItem$1;

    iget v1, v0, Lexpo/modules/securestore/encryptors/AESEncryptor$createEncryptedItem$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p6, v0, Lexpo/modules/securestore/encryptors/AESEncryptor$createEncryptedItem$1;->label:I

    sub-int/2addr p6, v2

    iput p6, v0, Lexpo/modules/securestore/encryptors/AESEncryptor$createEncryptedItem$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lexpo/modules/securestore/encryptors/AESEncryptor$createEncryptedItem$1;

    invoke-direct {v0, p0, p6}, Lexpo/modules/securestore/encryptors/AESEncryptor$createEncryptedItem$1;-><init>(Lexpo/modules/securestore/encryptors/AESEncryptor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p6, v0, Lexpo/modules/securestore/encryptors/AESEncryptor$createEncryptedItem$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 75
    iget v2, v0, Lexpo/modules/securestore/encryptors/AESEncryptor$createEncryptedItem$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lexpo/modules/securestore/encryptors/AESEncryptor$createEncryptedItem$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljavax/crypto/spec/GCMParameterSpec;

    iget-object p2, v0, Lexpo/modules/securestore/encryptors/AESEncryptor$createEncryptedItem$1;->L$0:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    invoke-static {p6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v4, p2

    move-object p2, p1

    move-object p1, v4

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 83
    invoke-virtual {p2}, Ljava/security/KeyStore$SecretKeyEntry;->getSecretKey()Ljavax/crypto/SecretKey;

    move-result-object p2

    .line 84
    const-string p6, "AES/GCM/NoPadding"

    invoke-static {p6}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object p6

    .line 85
    check-cast p2, Ljava/security/Key;

    invoke-virtual {p6, v3, p2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 87
    invoke-virtual {p6}, Ljavax/crypto/Cipher;->getParameters()Ljava/security/AlgorithmParameters;

    move-result-object p2

    const-class v2, Ljavax/crypto/spec/GCMParameterSpec;

    invoke-virtual {p2, v2}, Ljava/security/AlgorithmParameters;->getParameterSpec(Ljava/lang/Class;)Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object p2

    check-cast p2, Ljavax/crypto/spec/GCMParameterSpec;

    .line 88
    invoke-static {p6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput-object p1, v0, Lexpo/modules/securestore/encryptors/AESEncryptor$createEncryptedItem$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lexpo/modules/securestore/encryptors/AESEncryptor$createEncryptedItem$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lexpo/modules/securestore/encryptors/AESEncryptor$createEncryptedItem$1;->label:I

    invoke-virtual {p5, p6, p3, p4, v0}, Lexpo/modules/securestore/AuthenticationHelper;->authenticateCipher(Ljavax/crypto/Cipher;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p6

    if-ne p6, v1, :cond_3

    return-object v1

    .line 75
    :cond_3
    :goto_1
    check-cast p6, Ljavax/crypto/Cipher;

    .line 90
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p6, p2}, Lexpo/modules/securestore/encryptors/AESEncryptor;->createEncryptedItemWithCipher$expo_secure_store_release(Ljava/lang/String;Ljavax/crypto/Cipher;Ljavax/crypto/spec/GCMParameterSpec;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final createEncryptedItemWithCipher$expo_secure_store_release(Ljava/lang/String;Ljavax/crypto/Cipher;Ljavax/crypto/spec/GCMParameterSpec;)Lorg/json/JSONObject;
    .locals 2

    const-string v0, "plaintextValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cipher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gcmSpec"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v1, "UTF_8"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string v0, "getBytes(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    invoke-virtual {p2, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    const/4 p2, 0x2

    .line 100
    invoke-static {p1, p2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1

    .line 101
    invoke-virtual {p3}, Ljavax/crypto/spec/GCMParameterSpec;->getIV()[B

    move-result-object v0

    invoke-static {v0, p2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p2

    .line 102
    invoke-virtual {p3}, Ljavax/crypto/spec/GCMParameterSpec;->getTLen()I

    move-result p3

    .line 104
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 105
    const-string v1, "ct"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    .line 106
    const-string v0, "iv"

    invoke-virtual {p1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    .line 107
    const-string p2, "tlen"

    invoke-virtual {p1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object p1

    const-string p2, "put(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic decryptItem(Ljava/lang/String;Lorg/json/JSONObject;Ljava/security/KeyStore$Entry;Lexpo/modules/securestore/SecureStoreOptions;Lexpo/modules/securestore/AuthenticationHelper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 33
    check-cast p3, Ljava/security/KeyStore$SecretKeyEntry;

    invoke-virtual/range {p0 .. p6}, Lexpo/modules/securestore/encryptors/AESEncryptor;->decryptItem(Ljava/lang/String;Lorg/json/JSONObject;Ljava/security/KeyStore$SecretKeyEntry;Lexpo/modules/securestore/SecureStoreOptions;Lexpo/modules/securestore/AuthenticationHelper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public decryptItem(Ljava/lang/String;Lorg/json/JSONObject;Ljava/security/KeyStore$SecretKeyEntry;Lexpo/modules/securestore/SecureStoreOptions;Lexpo/modules/securestore/AuthenticationHelper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            "Ljava/security/KeyStore$SecretKeyEntry;",
            "Lexpo/modules/securestore/SecureStoreOptions;",
            "Lexpo/modules/securestore/AuthenticationHelper;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Lorg/json/JSONException;
        }
    .end annotation

    instance-of v0, p6, Lexpo/modules/securestore/encryptors/AESEncryptor$decryptItem$1;

    if-eqz v0, :cond_0

    move-object v0, p6

    check-cast v0, Lexpo/modules/securestore/encryptors/AESEncryptor$decryptItem$1;

    iget v1, v0, Lexpo/modules/securestore/encryptors/AESEncryptor$decryptItem$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p6, v0, Lexpo/modules/securestore/encryptors/AESEncryptor$decryptItem$1;->label:I

    sub-int/2addr p6, v2

    iput p6, v0, Lexpo/modules/securestore/encryptors/AESEncryptor$decryptItem$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lexpo/modules/securestore/encryptors/AESEncryptor$decryptItem$1;

    invoke-direct {v0, p0, p6}, Lexpo/modules/securestore/encryptors/AESEncryptor$decryptItem$1;-><init>(Lexpo/modules/securestore/encryptors/AESEncryptor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p6, v0, Lexpo/modules/securestore/encryptors/AESEncryptor$decryptItem$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 110
    iget v2, v0, Lexpo/modules/securestore/encryptors/AESEncryptor$decryptItem$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lexpo/modules/securestore/encryptors/AESEncryptor$decryptItem$1;->L$0:Ljava/lang/Object;

    check-cast p1, [B

    invoke-static {p6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 118
    const-string p6, "ct"

    invoke-virtual {p2, p6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p6

    .line 119
    const-string v2, "iv"

    invoke-virtual {p2, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 120
    const-string v4, "tlen"

    invoke-virtual {p2, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    const/4 v5, 0x0

    .line 121
    invoke-static {p6, v5}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p6

    .line 122
    invoke-static {v2, v5}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v2

    .line 123
    new-instance v5, Ljavax/crypto/spec/GCMParameterSpec;

    invoke-direct {v5, v4, v2}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[B)V

    .line 124
    const-string v2, "AES/GCM/NoPadding"

    invoke-static {v2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v2

    .line 125
    const-string v6, "requireAuthentication"

    invoke-virtual {p2, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result p2

    const/16 v6, 0x60

    if-lt v4, v6, :cond_4

    .line 130
    invoke-virtual {p3}, Ljava/security/KeyStore$SecretKeyEntry;->getSecretKey()Ljavax/crypto/SecretKey;

    move-result-object p1

    check-cast p1, Ljava/security/Key;

    check-cast v5, Ljava/security/spec/AlgorithmParameterSpec;

    const/4 p3, 0x2

    invoke-virtual {v2, p3, p1, v5}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 131
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p4}, Lexpo/modules/securestore/SecureStoreOptions;->getAuthenticationPrompt()Ljava/lang/String;

    move-result-object p1

    iput-object p6, v0, Lexpo/modules/securestore/encryptors/AESEncryptor$decryptItem$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lexpo/modules/securestore/encryptors/AESEncryptor$decryptItem$1;->label:I

    invoke-virtual {p5, v2, p2, p1, v0}, Lexpo/modules/securestore/AuthenticationHelper;->authenticateCipher(Ljavax/crypto/Cipher;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v7, p6

    move-object p6, p1

    move-object p1, v7

    .line 110
    :goto_1
    check-cast p6, Ljavax/crypto/Cipher;

    .line 132
    invoke-virtual {p6, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    const-string p2, "doFinal(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string p3, "UTF_8"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Ljava/lang/String;

    invoke-direct {p3, p1, p2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object p3

    .line 128
    :cond_4
    new-instance v0, Lexpo/modules/securestore/DecryptException;

    invoke-virtual {p4}, Lexpo/modules/securestore/SecureStoreOptions;->getKeychainService()Ljava/lang/String;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    const-string v1, "Authentication tag length must be at least 96 bits long"

    const/4 v4, 0x0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lexpo/modules/securestore/DecryptException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public getExtendedKeyStoreAlias(Lexpo/modules/securestore/SecureStoreOptions;Z)Ljava/lang/String;
    .locals 1

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 46
    const-string p2, "keystoreAuthenticated"

    goto :goto_0

    .line 48
    :cond_0
    const-string p2, "keystoreUnauthenticated"

    .line 50
    :goto_0
    invoke-virtual {p0, p1}, Lexpo/modules/securestore/encryptors/AESEncryptor;->getKeyStoreAlias(Lexpo/modules/securestore/SecureStoreOptions;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v0, ":"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getKeyStoreAlias(Lexpo/modules/securestore/SecureStoreOptions;)Ljava/lang/String;
    .locals 2

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-virtual {p1}, Lexpo/modules/securestore/SecureStoreOptions;->getKeychainService()Ljava/lang/String;

    move-result-object p1

    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AES/GCM/NoPadding:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic initializeKeyStoreEntry(Ljava/security/KeyStore;Lexpo/modules/securestore/SecureStoreOptions;)Ljava/security/KeyStore$Entry;
    .locals 0

    .line 33
    invoke-virtual {p0, p1, p2}, Lexpo/modules/securestore/encryptors/AESEncryptor;->initializeKeyStoreEntry(Ljava/security/KeyStore;Lexpo/modules/securestore/SecureStoreOptions;)Ljava/security/KeyStore$SecretKeyEntry;

    move-result-object p1

    check-cast p1, Ljava/security/KeyStore$Entry;

    return-object p1
.end method

.method public initializeKeyStoreEntry(Ljava/security/KeyStore;Lexpo/modules/securestore/SecureStoreOptions;)Ljava/security/KeyStore$SecretKeyEntry;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    const-string v0, "keyStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-virtual {p2}, Lexpo/modules/securestore/SecureStoreOptions;->getRequireAuthentication()Z

    move-result v0

    invoke-virtual {p0, p2, v0}, Lexpo/modules/securestore/encryptors/AESEncryptor;->getExtendedKeyStoreAlias(Lexpo/modules/securestore/SecureStoreOptions;Z)Ljava/lang/String;

    move-result-object v0

    .line 59
    new-instance v1, Landroid/security/keystore/KeyGenParameterSpec$Builder;

    const/4 v2, 0x3

    invoke-direct {v1, v0, v2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;-><init>(Ljava/lang/String;I)V

    const/16 v2, 0x100

    .line 60
    invoke-virtual {v1, v2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setKeySize(I)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v1

    const/4 v2, 0x1

    .line 61
    new-array v3, v2, [Ljava/lang/String;

    const-string v4, "GCM"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v3}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setBlockModes([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v1

    .line 62
    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "NoPadding"

    aput-object v3, v2, v5

    invoke-virtual {v1, v2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setEncryptionPaddings([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v1

    .line 63
    invoke-virtual {p2}, Lexpo/modules/securestore/SecureStoreOptions;->getRequireAuthentication()Z

    move-result p2

    invoke-virtual {v1, p2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setUserAuthenticationRequired(Z)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object p2

    .line 64
    invoke-virtual {p2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->build()Landroid/security/keystore/KeyGenParameterSpec;

    move-result-object p2

    const-string v1, "build(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/security/spec/AlgorithmParameterSpec;

    .line 66
    const-string v1, "AES"

    invoke-virtual {p1}, Ljava/security/KeyStore;->getProvider()Ljava/security/Provider;

    move-result-object v2

    invoke-static {v1, v2}, Ljavax/crypto/KeyGenerator;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/KeyGenerator;

    move-result-object v1

    .line 67
    invoke-virtual {v1, p2}, Ljavax/crypto/KeyGenerator;->init(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 70
    invoke-virtual {v1}, Ljavax/crypto/KeyGenerator;->generateKey()Ljavax/crypto/SecretKey;

    const/4 p2, 0x0

    .line 71
    invoke-virtual {p1, v0, p2}, Ljava/security/KeyStore;->getEntry(Ljava/lang/String;Ljava/security/KeyStore$ProtectionParameter;)Ljava/security/KeyStore$Entry;

    move-result-object p1

    instance-of v0, p1, Ljava/security/KeyStore$SecretKeyEntry;

    if-eqz v0, :cond_0

    move-object p2, p1

    check-cast p2, Ljava/security/KeyStore$SecretKeyEntry;

    :cond_0
    if-eqz p2, :cond_1

    return-object p2

    .line 72
    :cond_1
    new-instance p1, Ljava/security/UnrecoverableEntryException;

    const-string p2, "Could not retrieve the newly generated secret key entry"

    invoke-direct {p1, p2}, Ljava/security/UnrecoverableEntryException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
