.class public final Lcom/stripe/hcaptcha/HCaptcha;
.super Lcom/stripe/hcaptcha/task/Task;
.source "HCaptcha.kt"

# interfaces
.implements Lcom/stripe/hcaptcha/IHCaptcha;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/hcaptcha/HCaptcha$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/hcaptcha/task/Task<",
        "Lcom/stripe/hcaptcha/HCaptchaTokenResponse;",
        ">;",
        "Lcom/stripe/hcaptcha/IHCaptcha;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \u00122\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0012B\u0019\u0008\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000c\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0008\u0010\u000f\u001a\u00020\u0000H\u0016J\u0008\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/hcaptcha/HCaptcha;",
        "Lcom/stripe/hcaptcha/task/Task;",
        "Lcom/stripe/hcaptcha/HCaptchaTokenResponse;",
        "Lcom/stripe/hcaptcha/IHCaptcha;",
        "activity",
        "Landroidx/fragment/app/FragmentActivity;",
        "internalConfig",
        "Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;",
        "<init>",
        "(Landroidx/fragment/app/FragmentActivity;Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;)V",
        "captchaVerifier",
        "Lcom/stripe/hcaptcha/IHCaptchaVerifier;",
        "setup",
        "config",
        "Lcom/stripe/hcaptcha/config/HCaptchaConfig;",
        "verifyWithHCaptcha",
        "reset",
        "",
        "Companion",
        "hcaptcha_release"
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
.field public static final Companion:Lcom/stripe/hcaptcha/HCaptcha$Companion;


# instance fields
.field private final activity:Landroidx/fragment/app/FragmentActivity;

.field private captchaVerifier:Lcom/stripe/hcaptcha/IHCaptchaVerifier;

.field private final internalConfig:Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;


# direct methods
.method public static synthetic $r8$lambda$1TB-kZkXHQmC144MwBvT6ajuAhA(Lcom/stripe/hcaptcha/HCaptcha;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/hcaptcha/HCaptcha;->setup$lambda$0(Lcom/stripe/hcaptcha/HCaptcha;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$ET6X6wu3VC5jxATRkWzrtul0EGU(Lcom/stripe/hcaptcha/HCaptcha;Lcom/stripe/hcaptcha/HCaptchaException;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/hcaptcha/HCaptcha;->setup$lambda$2(Lcom/stripe/hcaptcha/HCaptcha;Lcom/stripe/hcaptcha/HCaptchaException;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$axZtnPOVcpWnhLV6nau5KNJAug8(Lcom/stripe/hcaptcha/HCaptcha;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/hcaptcha/HCaptcha;->setup$lambda$1(Lcom/stripe/hcaptcha/HCaptcha;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/hcaptcha/HCaptcha$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/hcaptcha/HCaptcha$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/hcaptcha/HCaptcha;->Companion:Lcom/stripe/hcaptcha/HCaptcha$Companion;

    return-void
.end method

.method private constructor <init>(Landroidx/fragment/app/FragmentActivity;Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Lcom/stripe/hcaptcha/task/Task;-><init>()V

    .line 72
    iput-object p1, p0, Lcom/stripe/hcaptcha/HCaptcha;->activity:Landroidx/fragment/app/FragmentActivity;

    .line 73
    iput-object p2, p0, Lcom/stripe/hcaptcha/HCaptcha;->internalConfig:Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/fragment/app/FragmentActivity;Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/hcaptcha/HCaptcha;-><init>(Landroidx/fragment/app/FragmentActivity;Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;)V

    return-void
.end method

.method private static final setup$lambda$0(Lcom/stripe/hcaptcha/HCaptcha;)Lkotlin/Unit;
    .locals 0

    .line 79
    invoke-virtual {p0}, Lcom/stripe/hcaptcha/HCaptcha;->captchaOpened()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final setup$lambda$1(Lcom/stripe/hcaptcha/HCaptcha;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Ljava/lang/String;)Lkotlin/Unit;
    .locals 2

    const-string v0, "token"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    invoke-virtual {p1}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->getTokenExpiration-UwyO8pc()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/stripe/hcaptcha/HCaptcha;->scheduleCaptchaExpired-LRDsOJo(J)V

    .line 82
    new-instance p1, Lcom/stripe/hcaptcha/HCaptchaTokenResponse;

    invoke-virtual {p0}, Lcom/stripe/hcaptcha/HCaptcha;->getHandler()Landroid/os/Handler;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lcom/stripe/hcaptcha/HCaptchaTokenResponse;-><init>(Ljava/lang/String;Landroid/os/Handler;)V

    invoke-virtual {p0, p1}, Lcom/stripe/hcaptcha/HCaptcha;->setResult(Ljava/lang/Object;)V

    .line 83
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final setup$lambda$2(Lcom/stripe/hcaptcha/HCaptcha;Lcom/stripe/hcaptcha/HCaptchaException;)Lkotlin/Unit;
    .locals 1

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    invoke-virtual {p0, p1}, Lcom/stripe/hcaptcha/HCaptcha;->setException(Lcom/stripe/hcaptcha/HCaptchaException;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public reset()V
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptcha;->captchaVerifier:Lcom/stripe/hcaptcha/IHCaptchaVerifier;

    if-eqz v0, :cond_0

    .line 116
    invoke-interface {v0}, Lcom/stripe/hcaptcha/IHCaptchaVerifier;->reset()V

    const/4 v0, 0x0

    .line 117
    iput-object v0, p0, Lcom/stripe/hcaptcha/HCaptcha;->captchaVerifier:Lcom/stripe/hcaptcha/IHCaptchaVerifier;

    :cond_0
    return-void
.end method

.method public setup(Lcom/stripe/hcaptcha/config/HCaptchaConfig;)Lcom/stripe/hcaptcha/HCaptcha;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "config"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    new-instance v2, Lcom/stripe/hcaptcha/HCaptchaStateListener;

    new-instance v3, Lcom/stripe/hcaptcha/HCaptcha$$ExternalSyntheticLambda0;

    invoke-direct {v3, v0}, Lcom/stripe/hcaptcha/HCaptcha$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/hcaptcha/HCaptcha;)V

    new-instance v4, Lcom/stripe/hcaptcha/HCaptcha$$ExternalSyntheticLambda1;

    invoke-direct {v4, v0, v1}, Lcom/stripe/hcaptcha/HCaptcha$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/hcaptcha/HCaptcha;Lcom/stripe/hcaptcha/config/HCaptchaConfig;)V

    new-instance v5, Lcom/stripe/hcaptcha/HCaptcha$$ExternalSyntheticLambda2;

    invoke-direct {v5, v0}, Lcom/stripe/hcaptcha/HCaptcha$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/hcaptcha/HCaptcha;)V

    invoke-direct {v2, v3, v4, v5}, Lcom/stripe/hcaptcha/HCaptchaStateListener;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 88
    :try_start_0
    invoke-virtual {v1}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->getHideDialog()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 90
    new-instance v3, Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;

    .line 91
    iget-object v4, v0, Lcom/stripe/hcaptcha/HCaptcha;->activity:Landroidx/fragment/app/FragmentActivity;

    check-cast v4, Landroid/app/Activity;

    .line 92
    sget-object v13, Lcom/stripe/hcaptcha/config/HCaptchaSize;->INVISIBLE:Lcom/stripe/hcaptcha/config/HCaptchaSize;
    :try_end_0
    .catch Landroid/util/AndroidRuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    const v22, 0x7f7fb

    const/16 v23, 0x0

    move-object v5, v2

    const/4 v2, 0x0

    move-object v6, v3

    const/4 v3, 0x0

    move-object v7, v4

    const/4 v4, 0x0

    move-object v8, v5

    const/4 v5, 0x0

    move-object v9, v6

    const/4 v6, 0x0

    move-object v10, v7

    const/4 v7, 0x0

    move-object v11, v8

    const/4 v8, 0x0

    move-object v12, v9

    const/4 v9, 0x0

    move-object v14, v10

    const/4 v10, 0x0

    move-object v15, v11

    const/4 v11, 0x0

    move-object/from16 v16, v12

    const/4 v12, 0x0

    move-object/from16 v17, v14

    const/4 v14, 0x0

    move-object/from16 v18, v15

    const/4 v15, 0x0

    move-object/from16 v19, v16

    const/16 v16, 0x0

    move-object/from16 v20, v17

    const/16 v17, 0x0

    move-object/from16 v21, v18

    const/16 v18, 0x0

    move-object/from16 v24, v19

    move-object/from16 v25, v20

    const-wide/16 v19, 0x0

    move-object/from16 v26, v21

    const/16 v21, 0x0

    move-object/from16 v28, v24

    move-object/from16 v29, v25

    move-object/from16 v27, v26

    :try_start_1
    invoke-static/range {v1 .. v23}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->copy-ZIzw2bI$default(Lcom/stripe/hcaptcha/config/HCaptchaConfig;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/hcaptcha/config/HCaptchaSize;Lcom/stripe/hcaptcha/config/HCaptchaOrientation;Lcom/stripe/hcaptcha/config/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;JZILjava/lang/Object;)Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    move-result-object v1

    .line 93
    iget-object v2, v0, Lcom/stripe/hcaptcha/HCaptcha;->internalConfig:Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;
    :try_end_1
    .catch Landroid/util/AndroidRuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    move-object/from16 v15, v27

    move-object/from16 v6, v28

    move-object/from16 v14, v29

    .line 90
    :try_start_2
    invoke-direct {v6, v14, v1, v2, v15}, Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;-><init>(Landroid/app/Activity;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;Lcom/stripe/hcaptcha/HCaptchaStateListener;)V

    move-object v3, v6

    check-cast v3, Lcom/stripe/hcaptcha/IHCaptchaVerifier;

    goto :goto_0

    :catch_0
    move-object/from16 v15, v27

    goto :goto_1

    :cond_0
    move-object v15, v2

    .line 97
    sget-object v2, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->Companion:Lcom/stripe/hcaptcha/HCaptchaDialogFragment$Companion;

    iget-object v3, v0, Lcom/stripe/hcaptcha/HCaptcha;->internalConfig:Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;

    invoke-virtual {v2, v1, v3, v15}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment$Companion;->newInstance(Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;Lcom/stripe/hcaptcha/HCaptchaStateListener;)Lcom/stripe/hcaptcha/HCaptchaDialogFragment;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/stripe/hcaptcha/IHCaptchaVerifier;

    .line 88
    :goto_0
    iput-object v3, v0, Lcom/stripe/hcaptcha/HCaptcha;->captchaVerifier:Lcom/stripe/hcaptcha/IHCaptchaVerifier;
    :try_end_2
    .catch Landroid/util/AndroidRuntimeException; {:try_start_2 .. :try_end_2} :catch_2

    return-object v0

    :catch_1
    move-object v15, v2

    .line 100
    :catch_2
    :goto_1
    invoke-virtual {v15}, Lcom/stripe/hcaptcha/HCaptchaStateListener;->getOnFailure()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    new-instance v2, Lcom/stripe/hcaptcha/HCaptchaException;

    sget-object v3, Lcom/stripe/hcaptcha/HCaptchaError;->ERROR:Lcom/stripe/hcaptcha/HCaptchaError;

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-direct {v2, v3, v5, v4, v5}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lcom/stripe/hcaptcha/HCaptchaError;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public verifyWithHCaptcha()Lcom/stripe/hcaptcha/HCaptcha;
    .locals 3

    .line 106
    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptcha;->captchaVerifier:Lcom/stripe/hcaptcha/IHCaptchaVerifier;

    if-eqz v0, :cond_0

    .line 109
    invoke-virtual {p0}, Lcom/stripe/hcaptcha/HCaptcha;->getHandler()Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 110
    iget-object v1, p0, Lcom/stripe/hcaptcha/HCaptcha;->activity:Landroidx/fragment/app/FragmentActivity;

    invoke-interface {v0, v1}, Lcom/stripe/hcaptcha/IHCaptchaVerifier;->startVerification(Landroidx/fragment/app/FragmentActivity;)V

    return-object p0

    .line 108
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "verifyWithHCaptcha must not be called before setup."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
