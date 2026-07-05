.class final Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AuthenticationHelper.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/securestore/AuthenticationHelper;->openAuthenticationPrompt(Ljavax/crypto/Cipher;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Landroidx/biometric/BiometricPrompt$AuthenticationResult;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/biometric/BiometricPrompt$AuthenticationResult;",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "expo.modules.securestore.AuthenticationHelper$openAuthenticationPrompt$2"
    f = "AuthenticationHelper.kt"
    i = {}
    l = {
        0x33
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $authenticationPrompt:Lexpo/modules/securestore/AuthenticationPrompt;

.field final synthetic $cipher:Ljavax/crypto/Cipher;

.field label:I


# direct methods
.method constructor <init>(Lexpo/modules/securestore/AuthenticationPrompt;Ljavax/crypto/Cipher;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/securestore/AuthenticationPrompt;",
            "Ljavax/crypto/Cipher;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$2;->$authenticationPrompt:Lexpo/modules/securestore/AuthenticationPrompt;

    iput-object p2, p0, Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$2;->$cipher:Ljavax/crypto/Cipher;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$2;

    iget-object v0, p0, Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$2;->$authenticationPrompt:Lexpo/modules/securestore/AuthenticationPrompt;

    iget-object v1, p0, Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$2;->$cipher:Ljavax/crypto/Cipher;

    invoke-direct {p1, v0, v1, p2}, Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$2;-><init>(Lexpo/modules/securestore/AuthenticationPrompt;Ljavax/crypto/Cipher;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/biometric/BiometricPrompt$AuthenticationResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 50
    iget v1, p0, Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 51
    iget-object p1, p0, Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$2;->$authenticationPrompt:Lexpo/modules/securestore/AuthenticationPrompt;

    iget-object v1, p0, Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$2;->$cipher:Ljavax/crypto/Cipher;

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lexpo/modules/securestore/AuthenticationHelper$openAuthenticationPrompt$2;->label:I

    invoke-virtual {p1, v1, v3}, Lexpo/modules/securestore/AuthenticationPrompt;->authenticate(Ljavax/crypto/Cipher;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Landroidx/biometric/BiometricPrompt$AuthenticationResult;

    if-eqz p1, :cond_3

    return-object p1

    .line 52
    :cond_3
    new-instance p1, Lexpo/modules/securestore/AuthenticationException;

    const-string v0, "Couldn\'t get the authentication result"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2, v1, v2}, Lexpo/modules/securestore/AuthenticationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
.end method
