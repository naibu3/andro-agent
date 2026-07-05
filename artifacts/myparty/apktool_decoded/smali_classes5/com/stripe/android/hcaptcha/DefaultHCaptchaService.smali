.class public final Lcom/stripe/android/hcaptcha/DefaultHCaptchaService;
.super Ljava/lang/Object;
.source "DefaultHCaptchaService.kt"

# interfaces
.implements Lcom/stripe/android/hcaptcha/HCaptchaService;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0096@\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/hcaptcha/DefaultHCaptchaService;",
        "Lcom/stripe/android/hcaptcha/HCaptchaService;",
        "hCaptchaProvider",
        "Lcom/stripe/android/hcaptcha/HCaptchaProvider;",
        "<init>",
        "(Lcom/stripe/android/hcaptcha/HCaptchaProvider;)V",
        "performPassiveHCaptcha",
        "Lcom/stripe/android/hcaptcha/HCaptchaService$Result;",
        "activity",
        "Landroidx/fragment/app/FragmentActivity;",
        "siteKey",
        "",
        "rqData",
        "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "payments-core_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final hCaptchaProvider:Lcom/stripe/android/hcaptcha/HCaptchaProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/hcaptcha/HCaptchaProvider;)V
    .locals 1

    const-string v0, "hCaptchaProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/stripe/android/hcaptcha/DefaultHCaptchaService;->hCaptchaProvider:Lcom/stripe/android/hcaptcha/HCaptchaProvider;

    return-void
.end method


# virtual methods
.method public performPassiveHCaptcha(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/FragmentActivity;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/hcaptcha/HCaptchaService$Result;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 23
    new-instance v0, Lkotlin/coroutines/SafeContinuation;

    invoke-static/range {p4 .. p4}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    invoke-direct {v0, v1}, Lkotlin/coroutines/SafeContinuation;-><init>(Lkotlin/coroutines/Continuation;)V

    move-object v1, v0

    check-cast v1, Lkotlin/coroutines/Continuation;

    move-object/from16 v2, p0

    .line 24
    iget-object v3, v2, Lcom/stripe/android/hcaptcha/DefaultHCaptchaService;->hCaptchaProvider:Lcom/stripe/android/hcaptcha/HCaptchaProvider;

    move-object/from16 v4, p1

    invoke-interface {v3, v4}, Lcom/stripe/android/hcaptcha/HCaptchaProvider;->get(Landroidx/fragment/app/FragmentActivity;)Lcom/stripe/hcaptcha/HCaptcha;

    move-result-object v3

    .line 25
    new-instance v4, Lcom/stripe/android/hcaptcha/DefaultHCaptchaService$performPassiveHCaptcha$2$hcaptcha$1$1;

    invoke-direct {v4, v1}, Lcom/stripe/android/hcaptcha/DefaultHCaptchaService$performPassiveHCaptcha$2$hcaptcha$1$1;-><init>(Lkotlin/coroutines/Continuation;)V

    check-cast v4, Lcom/stripe/hcaptcha/task/OnSuccessListener;

    invoke-virtual {v3, v4}, Lcom/stripe/hcaptcha/HCaptcha;->addOnSuccessListener(Lcom/stripe/hcaptcha/task/OnSuccessListener;)Lcom/stripe/hcaptcha/task/Task;

    .line 30
    new-instance v4, Lcom/stripe/android/hcaptcha/DefaultHCaptchaService$performPassiveHCaptcha$2$hcaptcha$1$2;

    invoke-direct {v4, v1}, Lcom/stripe/android/hcaptcha/DefaultHCaptchaService$performPassiveHCaptcha$2$hcaptcha$1$2;-><init>(Lkotlin/coroutines/Continuation;)V

    check-cast v4, Lcom/stripe/hcaptcha/task/OnFailureListener;

    invoke-virtual {v3, v4}, Lcom/stripe/hcaptcha/HCaptcha;->addOnFailureListener(Lcom/stripe/hcaptcha/task/OnFailureListener;)Lcom/stripe/hcaptcha/task/Task;

    .line 39
    sget-object v17, Lcom/stripe/hcaptcha/config/HCaptchaSize;->INVISIBLE:Lcom/stripe/hcaptcha/config/HCaptchaSize;

    .line 37
    new-instance v5, Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    sget-object v1, Lcom/stripe/android/hcaptcha/DefaultHCaptchaService$performPassiveHCaptcha$2$config$1;->INSTANCE:Lcom/stripe/android/hcaptcha/DefaultHCaptchaService$performPassiveHCaptcha$2$config$1;

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

    move-object/from16 v6, p2

    move-object/from16 v10, p3

    invoke-direct/range {v5 .. v27}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;-><init>(Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/hcaptcha/config/HCaptchaSize;Lcom/stripe/hcaptcha/config/HCaptchaOrientation;Lcom/stripe/hcaptcha/config/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 47
    invoke-virtual {v3, v5}, Lcom/stripe/hcaptcha/HCaptcha;->setup(Lcom/stripe/hcaptcha/config/HCaptchaConfig;)Lcom/stripe/hcaptcha/HCaptcha;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/hcaptcha/HCaptcha;->verifyWithHCaptcha()Lcom/stripe/hcaptcha/HCaptcha;

    .line 23
    invoke-virtual {v0}, Lkotlin/coroutines/SafeContinuation;->getOrThrow()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static/range {p4 .. p4}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    return-object v0
.end method
