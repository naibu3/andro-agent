.class public final Lexpo/modules/securestore/AuthenticationHelper;
.super Ljava/lang/Object;
.source "AuthenticationHelper.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/securestore/AuthenticationHelper$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082@\u00a2\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Lexpo/modules/securestore/AuthenticationHelper;",
        "",
        "context",
        "Landroid/content/Context;",
        "moduleRegistry",
        "Lexpo/modules/core/ModuleRegistry;",
        "<init>",
        "(Landroid/content/Context;Lexpo/modules/core/ModuleRegistry;)V",
        "isAuthenticating",
        "",
        "authenticateCipher",
        "Ljavax/crypto/Cipher;",
        "cipher",
        "requiresAuthentication",
        "title",
        "",
        "(Ljavax/crypto/Cipher;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "openAuthenticationPrompt",
        "Landroidx/biometric/BiometricPrompt$AuthenticationResult;",
        "(Ljavax/crypto/Cipher;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "assertBiometricsSupport",
        "",
        "getCurrentActivity",
        "Landroid/app/Activity;",
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
.field public static final Companion:Lexpo/modules/securestore/AuthenticationHelper$Companion;

.field public static final REQUIRE_AUTHENTICATION_PROPERTY:Ljava/lang/String; = "requireAuthentication"


# instance fields
.field private final context:Landroid/content/Context;

.field private isAuthenticating:Z

.field private final moduleRegistry:Lexpo/modules/core/ModuleRegistry;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lexpo/modules/securestore/AuthenticationHelper$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lexpo/modules/securestore/AuthenticationHelper$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lexpo/modules/securestore/AuthenticationHelper;->Companion:Lexpo/modules/securestore/AuthenticationHelper$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lexpo/modules/core/ModuleRegistry;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moduleRegistry"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lexpo/modules/securestore/AuthenticationHelper;->context:Landroid/content/Context;

    .line 18
    iput-object p2, p0, Lexpo/modules/securestore/AuthenticationHelper;->moduleRegistry:Lexpo/modules/core/ModuleRegistry;

    return-void
.end method

.method public static final synthetic access$openAuthenticationPrompt(Lexpo/modules/securestore/AuthenticationHelper;Ljavax/crypto/Cipher;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 16
    invoke-direct {p0, p1, p2, p3}, Lexpo/modules/securestore/AuthenticationHelper;->openAuthenticationPrompt(Ljavax/crypto/Cipher;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final getCurrentActivity()Landroid/app/Activity;
    .locals 2

    .line 82
    iget-object v0, p0, Lexpo/modules/securestore/AuthenticationHelper;->moduleRegistry:Lexpo/modules/core/ModuleRegistry;

    const-class v1, Lexpo/modules/core/interfaces/ActivityProvider;

    invoke-virtual {v0, v1}, Lexpo/modules/core/ModuleRegistry;->getModule(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getModule(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lexpo/modules/core/interfaces/ActivityProvider;

    .line 83
    invoke-interface {v0}, Lexpo/modules/core/interfaces/ActivityProvider;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method private final openAuthenticationPrompt(Ljavax/crypto/Cipher;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/crypto/Cipher;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/biometric/BiometricPrompt$AuthenticationResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$1;

    iget v1, v0, Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$1;

    invoke-direct {v0, p0, p3}, Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$1;-><init>(Lexpo/modules/securestore/AuthenticationHelper;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 30
    iget v2, v0, Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 37
    iget-boolean p3, p0, Lexpo/modules/securestore/AuthenticationHelper;->isAuthenticating:Z

    const/4 v2, 0x2

    const/4 v5, 0x0

    if-nez p3, :cond_6

    .line 41
    iput-boolean v4, p0, Lexpo/modules/securestore/AuthenticationHelper;->isAuthenticating:Z

    .line 44
    :try_start_1
    invoke-virtual {p0}, Lexpo/modules/securestore/AuthenticationHelper;->assertBiometricsSupport()V

    .line 45
    invoke-direct {p0}, Lexpo/modules/securestore/AuthenticationHelper;->getCurrentActivity()Landroid/app/Activity;

    move-result-object p3

    instance-of v6, p3, Landroidx/fragment/app/FragmentActivity;

    if-eqz v6, :cond_3

    check-cast p3, Landroidx/fragment/app/FragmentActivity;

    goto :goto_1

    :cond_3
    move-object p3, v5

    :goto_1
    if-eqz p3, :cond_5

    .line 48
    new-instance v2, Lexpo/modules/securestore/AuthenticationPrompt;

    iget-object v6, p0, Lexpo/modules/securestore/AuthenticationHelper;->context:Landroid/content/Context;

    invoke-direct {v2, p3, v6, p2}, Lexpo/modules/securestore/AuthenticationPrompt;-><init>(Landroidx/fragment/app/FragmentActivity;Landroid/content/Context;Ljava/lang/String;)V

    .line 50
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object p2

    invoke-virtual {p2}, Lkotlinx/coroutines/MainCoroutineDispatcher;->getImmediate()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object p2

    check-cast p2, Lkotlin/coroutines/CoroutineContext;

    new-instance p3, Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$2;

    invoke-direct {p3, v2, p1, v5}, Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$2;-><init>(Lexpo/modules/securestore/AuthenticationPrompt;Ljavax/crypto/Cipher;Lkotlin/coroutines/Continuation;)V

    check-cast p3, Lkotlin/jvm/functions/Function2;

    iput v4, v0, Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$1;->label:I

    invoke-static {p2, p3, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p3, v1, :cond_4

    return-object v1

    .line 55
    :cond_4
    :goto_2
    iput-boolean v3, p0, Lexpo/modules/securestore/AuthenticationHelper;->isAuthenticating:Z

    return-object p3

    .line 46
    :cond_5
    :try_start_2
    new-instance p1, Lexpo/modules/securestore/AuthenticationException;

    const-string p2, "Cannot display biometric prompt when the app is not in the foreground"

    invoke-direct {p1, p2, v5, v2, v5}, Lexpo/modules/securestore/AuthenticationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 55
    :goto_3
    iput-boolean v3, p0, Lexpo/modules/securestore/AuthenticationHelper;->isAuthenticating:Z

    throw p1

    .line 38
    :cond_6
    new-instance p1, Lexpo/modules/securestore/AuthenticationException;

    const-string p2, "Authentication is already in progress"

    invoke-direct {p1, p2, v5, v2, v5}, Lexpo/modules/securestore/AuthenticationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
.end method


# virtual methods
.method public final assertBiometricsSupport()V
    .locals 5

    .line 60
    iget-object v0, p0, Lexpo/modules/securestore/AuthenticationHelper;->context:Landroid/content/Context;

    invoke-static {v0}, Landroidx/biometric/BiometricManager;->from(Landroid/content/Context;)Landroidx/biometric/BiometricManager;

    move-result-object v0

    const-string v1, "from(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0xf

    .line 62
    invoke-virtual {v0, v1}, Landroidx/biometric/BiometricManager;->canAuthenticate(I)I

    move-result v0

    const/4 v2, -0x2

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eq v0, v2, :cond_4

    const/4 v2, -0x1

    if-eq v0, v2, :cond_3

    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    if-eq v0, v1, :cond_1

    const/16 v1, 0xb

    if-eq v0, v1, :cond_0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_2

    return-void

    .line 67
    :cond_0
    new-instance v0, Lexpo/modules/securestore/AuthenticationException;

    const-string v1, "No biometrics are currently enrolled"

    invoke-direct {v0, v1, v4, v3, v4}, Lexpo/modules/securestore/AuthenticationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0

    .line 70
    :cond_1
    new-instance v0, Lexpo/modules/securestore/AuthenticationException;

    const-string v1, "An update is required before the biometrics can be used"

    invoke-direct {v0, v1, v4, v3, v4}, Lexpo/modules/securestore/AuthenticationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0

    .line 64
    :cond_2
    new-instance v0, Lexpo/modules/securestore/AuthenticationException;

    const-string v1, "No hardware available for biometric authentication. Use expo-local-authentication to check if the device supports it"

    invoke-direct {v0, v1, v4, v3, v4}, Lexpo/modules/securestore/AuthenticationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0

    .line 76
    :cond_3
    new-instance v0, Lexpo/modules/securestore/AuthenticationException;

    const-string v1, "Biometric authentication status is unknown"

    invoke-direct {v0, v1, v4, v3, v4}, Lexpo/modules/securestore/AuthenticationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0

    .line 73
    :cond_4
    new-instance v0, Lexpo/modules/securestore/AuthenticationException;

    const-string v1, "Biometric authentication is unsupported"

    invoke-direct {v0, v1, v4, v3, v4}, Lexpo/modules/securestore/AuthenticationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final authenticateCipher(Ljavax/crypto/Cipher;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/crypto/Cipher;",
            "Z",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljavax/crypto/Cipher;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lexpo/modules/securestore/AuthenticationHelper$authenticateCipher$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lexpo/modules/securestore/AuthenticationHelper$authenticateCipher$1;

    iget v1, v0, Lexpo/modules/securestore/AuthenticationHelper$authenticateCipher$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lexpo/modules/securestore/AuthenticationHelper$authenticateCipher$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lexpo/modules/securestore/AuthenticationHelper$authenticateCipher$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lexpo/modules/securestore/AuthenticationHelper$authenticateCipher$1;

    invoke-direct {v0, p0, p4}, Lexpo/modules/securestore/AuthenticationHelper$authenticateCipher$1;-><init>(Lexpo/modules/securestore/AuthenticationHelper;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lexpo/modules/securestore/AuthenticationHelper$authenticateCipher$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 22
    iget v2, v0, Lexpo/modules/securestore/AuthenticationHelper$authenticateCipher$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    if-eqz p2, :cond_5

    .line 24
    iput v3, v0, Lexpo/modules/securestore/AuthenticationHelper$authenticateCipher$1;->label:I

    invoke-direct {p0, p1, p3, v0}, Lexpo/modules/securestore/AuthenticationHelper;->openAuthenticationPrompt(Ljavax/crypto/Cipher;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p4, Landroidx/biometric/BiometricPrompt$AuthenticationResult;

    invoke-virtual {p4}, Landroidx/biometric/BiometricPrompt$AuthenticationResult;->getCryptoObject()Landroidx/biometric/BiometricPrompt$CryptoObject;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroidx/biometric/BiometricPrompt$CryptoObject;->getCipher()Ljavax/crypto/Cipher;

    move-result-object p1

    if-eqz p1, :cond_4

    return-object p1

    .line 25
    :cond_4
    new-instance p1, Lexpo/modules/securestore/AuthenticationException;

    const-string p2, "Couldn\'t get cipher from authentication result"

    const/4 p3, 0x2

    const/4 p4, 0x0

    invoke-direct {p1, p2, p4, p3, p4}, Lexpo/modules/securestore/AuthenticationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :cond_5
    return-object p1
.end method
