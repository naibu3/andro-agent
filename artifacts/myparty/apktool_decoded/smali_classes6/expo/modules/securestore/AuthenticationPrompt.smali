.class public final Lexpo/modules/securestore/AuthenticationPrompt;
.super Ljava/lang/Object;
.source "AuthenticationPrompt.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lexpo/modules/securestore/AuthenticationPrompt;",
        "",
        "currentActivity",
        "Landroidx/fragment/app/FragmentActivity;",
        "context",
        "Landroid/content/Context;",
        "title",
        "",
        "<init>",
        "(Landroidx/fragment/app/FragmentActivity;Landroid/content/Context;Ljava/lang/String;)V",
        "executor",
        "Ljava/util/concurrent/Executor;",
        "promptInfo",
        "Landroidx/biometric/BiometricPrompt$PromptInfo;",
        "authenticate",
        "Landroidx/biometric/BiometricPrompt$AuthenticationResult;",
        "cipher",
        "Ljavax/crypto/Cipher;",
        "(Ljavax/crypto/Cipher;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "convertErrorCode",
        "code",
        "",
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


# instance fields
.field private final currentActivity:Landroidx/fragment/app/FragmentActivity;

.field private executor:Ljava/util/concurrent/Executor;

.field private promptInfo:Landroidx/biometric/BiometricPrompt$PromptInfo;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/FragmentActivity;Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    const-string v0, "currentActivity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lexpo/modules/securestore/AuthenticationPrompt;->currentActivity:Landroidx/fragment/app/FragmentActivity;

    .line 15
    invoke-static {p2}, Landroidx/core/content/ContextCompat;->getMainExecutor(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object p1

    const-string v0, "getMainExecutor(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lexpo/modules/securestore/AuthenticationPrompt;->executor:Ljava/util/concurrent/Executor;

    .line 16
    new-instance p1, Landroidx/biometric/BiometricPrompt$PromptInfo$Builder;

    invoke-direct {p1}, Landroidx/biometric/BiometricPrompt$PromptInfo$Builder;-><init>()V

    .line 17
    check-cast p3, Ljava/lang/CharSequence;

    invoke-virtual {p1, p3}, Landroidx/biometric/BiometricPrompt$PromptInfo$Builder;->setTitle(Ljava/lang/CharSequence;)Landroidx/biometric/BiometricPrompt$PromptInfo$Builder;

    move-result-object p1

    const/high16 p3, 0x1040000

    .line 18
    invoke-virtual {p2, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Landroidx/biometric/BiometricPrompt$PromptInfo$Builder;->setNegativeButtonText(Ljava/lang/CharSequence;)Landroidx/biometric/BiometricPrompt$PromptInfo$Builder;

    move-result-object p1

    .line 19
    invoke-virtual {p1}, Landroidx/biometric/BiometricPrompt$PromptInfo$Builder;->build()Landroidx/biometric/BiometricPrompt$PromptInfo;

    move-result-object p1

    const-string p2, "build(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lexpo/modules/securestore/AuthenticationPrompt;->promptInfo:Landroidx/biometric/BiometricPrompt$PromptInfo;

    return-void
.end method

.method public static final synthetic access$convertErrorCode(Lexpo/modules/securestore/AuthenticationPrompt;I)Ljava/lang/String;
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lexpo/modules/securestore/AuthenticationPrompt;->convertErrorCode(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final convertErrorCode(I)Ljava/lang/String;
    .locals 2

    .line 44
    const-string v0, "User canceled the authentication"

    packed-switch p1, :pswitch_data_0

    .line 57
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unknown error (code: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v0, ")"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 50
    :pswitch_1
    const-string p1, "No device credential"

    return-object p1

    :pswitch_2
    return-object v0

    .line 47
    :pswitch_3
    const-string p1, "Hardware not present"

    return-object p1

    .line 49
    :pswitch_4
    const-string p1, "No biometrics enrolled"

    return-object p1

    :pswitch_5
    return-object v0

    .line 52
    :pswitch_6
    const-string p1, "Lockout permanent"

    return-object p1

    .line 56
    :pswitch_7
    const-string p1, "Vendor error"

    return-object p1

    .line 51
    :pswitch_8
    const-string p1, "Lockout"

    return-object p1

    .line 53
    :pswitch_9
    const-string p1, "No space"

    return-object p1

    .line 54
    :pswitch_a
    const-string p1, "Timeout"

    return-object p1

    .line 55
    :pswitch_b
    const-string p1, "Unable to process"

    return-object p1

    .line 48
    :pswitch_c
    const-string p1, "Hardware unavailable"

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public final authenticate(Ljavax/crypto/Cipher;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/crypto/Cipher;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/biometric/BiometricPrompt$AuthenticationResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 22
    new-instance v0, Lkotlin/coroutines/SafeContinuation;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    invoke-direct {v0, v1}, Lkotlin/coroutines/SafeContinuation;-><init>(Lkotlin/coroutines/Continuation;)V

    move-object v1, v0

    check-cast v1, Lkotlin/coroutines/Continuation;

    .line 23
    new-instance v2, Landroidx/biometric/BiometricPrompt;

    .line 24
    iget-object v3, p0, Lexpo/modules/securestore/AuthenticationPrompt;->currentActivity:Landroidx/fragment/app/FragmentActivity;

    .line 25
    iget-object v4, p0, Lexpo/modules/securestore/AuthenticationPrompt;->executor:Ljava/util/concurrent/Executor;

    .line 26
    new-instance v5, Lexpo/modules/securestore/AuthenticationPrompt$authenticate$2$1;

    invoke-direct {v5, p0, v1}, Lexpo/modules/securestore/AuthenticationPrompt$authenticate$2$1;-><init>(Lexpo/modules/securestore/AuthenticationPrompt;Lkotlin/coroutines/Continuation;)V

    check-cast v5, Landroidx/biometric/BiometricPrompt$AuthenticationCallback;

    .line 23
    invoke-direct {v2, v3, v4, v5}, Landroidx/biometric/BiometricPrompt;-><init>(Landroidx/fragment/app/FragmentActivity;Ljava/util/concurrent/Executor;Landroidx/biometric/BiometricPrompt$AuthenticationCallback;)V

    .line 40
    iget-object v1, p0, Lexpo/modules/securestore/AuthenticationPrompt;->promptInfo:Landroidx/biometric/BiometricPrompt$PromptInfo;

    new-instance v3, Landroidx/biometric/BiometricPrompt$CryptoObject;

    invoke-direct {v3, p1}, Landroidx/biometric/BiometricPrompt$CryptoObject;-><init>(Ljavax/crypto/Cipher;)V

    invoke-virtual {v2, v1, v3}, Landroidx/biometric/BiometricPrompt;->authenticate(Landroidx/biometric/BiometricPrompt$PromptInfo;Landroidx/biometric/BiometricPrompt$CryptoObject;)V

    .line 22
    invoke-virtual {v0}, Lkotlin/coroutines/SafeContinuation;->getOrThrow()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    return-object p1
.end method
