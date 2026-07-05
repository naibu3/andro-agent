.class public interface abstract Lcom/stripe/android/stripe3ds2/security/DiffieHellmanKeyGenerator;
.super Ljava/lang/Object;
.source "DiffieHellmanKeyGenerator.kt"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008f\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH&\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/security/DiffieHellmanKeyGenerator;",
        "Ljava/io/Serializable;",
        "generate",
        "Ljavax/crypto/SecretKey;",
        "acsPublicKey",
        "Ljava/security/interfaces/ECPublicKey;",
        "sdkPrivateKey",
        "Ljava/security/interfaces/ECPrivateKey;",
        "agreementInfo",
        "",
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


# virtual methods
.method public abstract generate(Ljava/security/interfaces/ECPublicKey;Ljava/security/interfaces/ECPrivateKey;Ljava/lang/String;)Ljavax/crypto/SecretKey;
.end method
