.class public final Lcom/stripe/android/hcaptcha/HCaptchaInterfaceKt;
.super Ljava/lang/Object;
.source "HCaptchaInterface.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHCaptchaInterface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HCaptchaInterface.kt\ncom/stripe/android/hcaptcha/HCaptchaInterfaceKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,56:1\n426#2,11:57\n*S KotlinDebug\n*F\n+ 1 HCaptchaInterface.kt\ncom/stripe/android/hcaptcha/HCaptchaInterfaceKt\n*L\n29#1:57,11\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0087@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "performPassiveHCaptcha",
        "",
        "activity",
        "Landroidx/fragment/app/FragmentActivity;",
        "siteKey",
        "rqdata",
        "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "payments-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final performPassiveHCaptcha(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/FragmentActivity;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 58
    new-instance v0, Lkotlinx/coroutines/CancellableContinuationImpl;

    invoke-static/range {p3 .. p3}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/CancellableContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 64
    invoke-virtual {v0}, Lkotlinx/coroutines/CancellableContinuationImpl;->initCancellability()V

    .line 65
    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CancellableContinuation;

    .line 30
    sget-object v2, Lcom/stripe/hcaptcha/HCaptcha;->Companion:Lcom/stripe/hcaptcha/HCaptcha$Companion;

    const/4 v3, 0x2

    const/4 v4, 0x0

    move-object/from16 v5, p0

    invoke-static {v2, v5, v4, v3, v4}, Lcom/stripe/hcaptcha/HCaptcha$Companion;->getClient$default(Lcom/stripe/hcaptcha/HCaptcha$Companion;Landroidx/fragment/app/FragmentActivity;Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;ILjava/lang/Object;)Lcom/stripe/hcaptcha/HCaptcha;

    move-result-object v2

    .line 31
    new-instance v3, Lcom/stripe/android/hcaptcha/HCaptchaInterfaceKt$performPassiveHCaptcha$2$hcaptcha$1$1;

    invoke-direct {v3, v1}, Lcom/stripe/android/hcaptcha/HCaptchaInterfaceKt$performPassiveHCaptcha$2$hcaptcha$1$1;-><init>(Lkotlinx/coroutines/CancellableContinuation;)V

    check-cast v3, Lcom/stripe/hcaptcha/task/OnSuccessListener;

    invoke-virtual {v2, v3}, Lcom/stripe/hcaptcha/HCaptcha;->addOnSuccessListener(Lcom/stripe/hcaptcha/task/OnSuccessListener;)Lcom/stripe/hcaptcha/task/Task;

    .line 36
    new-instance v3, Lcom/stripe/android/hcaptcha/HCaptchaInterfaceKt$performPassiveHCaptcha$2$hcaptcha$1$2;

    invoke-direct {v3, v1}, Lcom/stripe/android/hcaptcha/HCaptchaInterfaceKt$performPassiveHCaptcha$2$hcaptcha$1$2;-><init>(Lkotlinx/coroutines/CancellableContinuation;)V

    check-cast v3, Lcom/stripe/hcaptcha/task/OnFailureListener;

    invoke-virtual {v2, v3}, Lcom/stripe/hcaptcha/HCaptcha;->addOnFailureListener(Lcom/stripe/hcaptcha/task/OnFailureListener;)Lcom/stripe/hcaptcha/task/Task;

    .line 45
    sget-object v17, Lcom/stripe/hcaptcha/config/HCaptchaSize;->INVISIBLE:Lcom/stripe/hcaptcha/config/HCaptchaSize;

    .line 46
    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/CharSequence;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object/from16 v10, p2

    goto :goto_1

    :cond_1
    :goto_0
    move-object v10, v4

    .line 43
    :goto_1
    new-instance v5, Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    sget-object v1, Lcom/stripe/android/hcaptcha/HCaptchaInterfaceKt$performPassiveHCaptcha$2$config$1;->INSTANCE:Lcom/stripe/android/hcaptcha/HCaptchaInterfaceKt$performPassiveHCaptcha$2$config$1;

    move-object/from16 v22, v1

    check-cast v22, Lkotlin/jvm/functions/Function2;

    const v26, 0x2f7e2

    const/16 v27, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x1

    move-object/from16 v6, p1

    invoke-direct/range {v5 .. v27}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;-><init>(Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/hcaptcha/config/HCaptchaSize;Lcom/stripe/hcaptcha/config/HCaptchaOrientation;Lcom/stripe/hcaptcha/config/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 53
    invoke-virtual {v2, v5}, Lcom/stripe/hcaptcha/HCaptcha;->setup(Lcom/stripe/hcaptcha/config/HCaptchaConfig;)Lcom/stripe/hcaptcha/HCaptcha;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/hcaptcha/HCaptcha;->verifyWithHCaptcha()Lcom/stripe/hcaptcha/HCaptcha;

    .line 66
    invoke-virtual {v0}, Lkotlinx/coroutines/CancellableContinuationImpl;->getResult()Ljava/lang/Object;

    move-result-object v0

    .line 57
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_2

    invoke-static/range {p3 .. p3}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_2
    return-object v0
.end method
