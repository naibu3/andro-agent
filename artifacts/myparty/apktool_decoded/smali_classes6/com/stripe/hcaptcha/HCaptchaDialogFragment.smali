.class public final Lcom/stripe/hcaptcha/HCaptchaDialogFragment;
.super Landroidx/fragment/app/DialogFragment;
.source "HCaptchaDialogFragment.kt"

# interfaces
.implements Lcom/stripe/hcaptcha/IHCaptchaVerifier;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/hcaptcha/HCaptchaDialogFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHCaptchaDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HCaptchaDialogFragment.kt\ncom/stripe/hcaptcha/HCaptchaDialogFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,303:1\n1#2:304\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0012\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0008\u0010\u0017\u001a\u00020\u000eH\u0016J\u0008\u0010\u0018\u001a\u00020\u000eH\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0008\u0010\u001c\u001a\u00020\u000eH\u0002J\u0008\u0010\u001d\u001a\u00020\u000eH\u0016J\u0008\u0010\u001e\u001a\u00020\u000eH\u0016J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\'H\u0016J\u0008\u0010(\u001a\u00020\u000eH\u0016J\"\u0010)\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010*\u001a\u00020+H\u0002J\u0018\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00122\u0006\u0010*\u001a\u00020+H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00060"
    }
    d2 = {
        "Lcom/stripe/hcaptcha/HCaptchaDialogFragment;",
        "Landroidx/fragment/app/DialogFragment;",
        "Lcom/stripe/hcaptcha/IHCaptchaVerifier;",
        "<init>",
        "()V",
        "webViewHelper",
        "Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;",
        "loadingContainer",
        "Landroid/widget/LinearLayout;",
        "defaultDimAmount",
        "",
        "readyForInteraction",
        "",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onCreateView",
        "Landroid/view/View;",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
        "onDestroy",
        "onStart",
        "onCancel",
        "dialogInterface",
        "Landroid/content/DialogInterface;",
        "hideLoadingContainer",
        "onLoaded",
        "onOpen",
        "onFailure",
        "exception",
        "Lcom/stripe/hcaptcha/HCaptchaException;",
        "onSuccess",
        "result",
        "",
        "startVerification",
        "activity",
        "Landroidx/fragment/app/FragmentActivity;",
        "reset",
        "prepareRootView",
        "config",
        "Lcom/stripe/hcaptcha/config/HCaptchaConfig;",
        "prepareWebView",
        "Lcom/stripe/hcaptcha/webview/HCaptchaWebView;",
        "rootView",
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
.field public static final Companion:Lcom/stripe/hcaptcha/HCaptchaDialogFragment$Companion;

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private defaultDimAmount:F

.field private loadingContainer:Landroid/widget/LinearLayout;

.field private readyForInteraction:Z

.field private webViewHelper:Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;


# direct methods
.method public static synthetic $r8$lambda$M9T74ACQOVxR5QuqTziSlJq-DAQ(Lcom/stripe/hcaptcha/HCaptchaDialogFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->prepareWebView$lambda$12(Lcom/stripe/hcaptcha/HCaptchaDialogFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$XvfaCJZ0CuCvef9bUkrJ_ER8PmA(Lcom/stripe/hcaptcha/HCaptchaDialogFragment;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->prepareRootView$lambda$10(Lcom/stripe/hcaptcha/HCaptchaDialogFragment;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Landroid/view/View;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->Companion:Lcom/stripe/hcaptcha/HCaptchaDialogFragment$Companion;

    .line 282
    const-string v0, "HCaptchaDialogFragment"

    sput-object v0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Landroidx/fragment/app/DialogFragment;-><init>()V

    const v0, 0x3f19999a    # 0.6f

    .line 41
    iput v0, p0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->defaultDimAmount:F

    return-void
.end method

.method private final hideLoadingContainer()V
    .locals 4

    .line 149
    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->webViewHelper:Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;->getConfig$hcaptcha_release()Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->getLoading()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 150
    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->loadingContainer:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 151
    invoke-virtual {v0}, Landroid/widget/LinearLayout;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const-wide/16 v2, 0xc8

    invoke-virtual {v1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    .line 152
    new-instance v2, Lcom/stripe/hcaptcha/HCaptchaDialogFragment$hideLoadingContainer$1$1;

    invoke-direct {v2, v0}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment$hideLoadingContainer$1$1;-><init>(Landroid/widget/LinearLayout;)V

    check-cast v2, Landroid/animation/Animator$AnimatorListener;

    .line 151
    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    return-void

    .line 161
    :cond_0
    invoke-virtual {p0}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x2

    .line 162
    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 163
    iget v1, p0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->defaultDimAmount:F

    invoke-virtual {v0, v1}, Landroid/view/Window;->setDimAmount(F)V

    :cond_1
    return-void
.end method

.method public static final newInstance(Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;Lcom/stripe/hcaptcha/HCaptchaStateListener;)Lcom/stripe/hcaptcha/HCaptchaDialogFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->Companion:Lcom/stripe/hcaptcha/HCaptchaDialogFragment$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment$Companion;->newInstance(Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;Lcom/stripe/hcaptcha/HCaptchaStateListener;)Lcom/stripe/hcaptcha/HCaptchaDialogFragment;

    move-result-object p0

    return-object p0
.end method

.method private final prepareRootView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/stripe/hcaptcha/config/HCaptchaConfig;)Landroid/view/View;
    .locals 2

    .line 237
    sget v0, Lcom/stripe/hcaptcha/R$layout;->stripe_hcaptcha_fragment:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    .line 238
    invoke-virtual {p1, p2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 239
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 241
    new-instance p2, Lcom/stripe/hcaptcha/HCaptchaDialogFragment$$ExternalSyntheticLambda0;

    invoke-direct {p2, p0, p3}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/hcaptcha/HCaptchaDialogFragment;Lcom/stripe/hcaptcha/config/HCaptchaConfig;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    return-object p1
.end method

.method private static final prepareRootView$lambda$10(Lcom/stripe/hcaptcha/HCaptchaDialogFragment;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 p2, 0x4

    const/4 v0, 0x0

    if-ne p3, p2, :cond_1

    .line 242
    invoke-virtual {p4}, Landroid/view/KeyEvent;->getAction()I

    move-result p2

    if-nez p2, :cond_1

    .line 247
    iget-boolean p2, p0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->readyForInteraction:Z

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->getLoading()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p0, 0x1

    return p0

    .line 252
    :cond_0
    iget-object p0, p0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->webViewHelper:Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;

    if-eqz p0, :cond_1

    new-instance p1, Lcom/stripe/hcaptcha/HCaptchaException;

    sget-object p2, Lcom/stripe/hcaptcha/HCaptchaError;->CHALLENGE_CLOSED:Lcom/stripe/hcaptcha/HCaptchaError;

    const/4 p3, 0x2

    const/4 p4, 0x0

    invoke-direct {p1, p2, p4, p3, p4}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lcom/stripe/hcaptcha/HCaptchaError;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, p1}, Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;->shouldRetry(Lcom/stripe/hcaptcha/HCaptchaException;)Z

    move-result p0

    return p0

    :cond_1
    return v0
.end method

.method private final prepareWebView(Landroid/view/View;Lcom/stripe/hcaptcha/config/HCaptchaConfig;)Lcom/stripe/hcaptcha/webview/HCaptchaWebView;
    .locals 1

    .line 259
    sget v0, Lcom/stripe/hcaptcha/R$id;->webView:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/stripe/hcaptcha/webview/HCaptchaWebView;

    .line 261
    invoke-virtual {p2}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->getLoading()Z

    move-result p2

    if-nez p2, :cond_0

    .line 262
    new-instance p2, Lcom/stripe/hcaptcha/HCaptchaDialogFragment$$ExternalSyntheticLambda1;

    invoke-direct {p2, p0}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/hcaptcha/HCaptchaDialogFragment;)V

    invoke-virtual {p1, p2}, Lcom/stripe/hcaptcha/webview/HCaptchaWebView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 274
    :cond_0
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object p1
.end method

.method private static final prepareWebView$lambda$12(Lcom/stripe/hcaptcha/HCaptchaDialogFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    iget-boolean v0, p0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->readyForInteraction:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 264
    invoke-virtual {p0}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 265
    invoke-virtual {p0, p2}, Landroidx/fragment/app/FragmentActivity;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    const/4 p0, 0x1

    return p0

    .line 270
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 3

    const-string v0, "dialogInterface"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    invoke-super {p0, p1}, Landroidx/fragment/app/DialogFragment;->onCancel(Landroid/content/DialogInterface;)V

    .line 145
    new-instance p1, Lcom/stripe/hcaptcha/HCaptchaException;

    sget-object v0, Lcom/stripe/hcaptcha/HCaptchaError;->CHALLENGE_CLOSED:Lcom/stripe/hcaptcha/HCaptchaError;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {p1, v0, v1, v2, v1}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lcom/stripe/hcaptcha/HCaptchaError;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, p1}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->onFailure(Lcom/stripe/hcaptcha/HCaptchaException;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 45
    invoke-super {p0, p1}, Landroidx/fragment/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x2

    .line 46
    sget v0, Lcom/stripe/hcaptcha/R$style;->StripeHCaptchaDialogTheme:I

    invoke-virtual {p0, p1, v0}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->setStyle(II)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 12

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x2

    const/4 v0, 0x0

    .line 57
    :try_start_0
    invoke-virtual {p0}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    if-nez v1, :cond_0

    .line 59
    invoke-virtual {p0}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->dismiss()V

    return-object v0

    .line 63
    :cond_0
    sget-object v2, Lcom/stripe/hcaptcha/HCaptchaCompat;->INSTANCE:Lcom/stripe/hcaptcha/HCaptchaCompat;

    invoke-virtual {v2, v1}, Lcom/stripe/hcaptcha/HCaptchaCompat;->getStateListener(Landroid/os/Bundle;)Lcom/stripe/hcaptcha/HCaptchaStateListener;

    move-result-object v9
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_6
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Landroid/view/InflateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v9, :cond_1

    .line 65
    :try_start_1
    invoke-virtual {p0}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->dismiss()V

    return-object v0

    .line 69
    :cond_1
    sget-object v2, Lcom/stripe/hcaptcha/HCaptchaCompat;->INSTANCE:Lcom/stripe/hcaptcha/HCaptchaCompat;

    invoke-virtual {v2, v1}, Lcom/stripe/hcaptcha/HCaptchaCompat;->getConfig(Landroid/os/Bundle;)Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    move-result-object v6

    if-nez v6, :cond_2

    .line 71
    invoke-virtual {p0}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->dismiss()V

    .line 72
    invoke-virtual {v9}, Lcom/stripe/hcaptcha/HCaptchaStateListener;->getOnFailure()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    new-instance p2, Lcom/stripe/hcaptcha/HCaptchaException;

    sget-object v1, Lcom/stripe/hcaptcha/HCaptchaError;->ERROR:Lcom/stripe/hcaptcha/HCaptchaError;

    invoke-direct {p2, v1, v0, p3, v0}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lcom/stripe/hcaptcha/HCaptchaError;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    .line 76
    :cond_2
    sget-object v2, Lcom/stripe/hcaptcha/HCaptchaCompat;->INSTANCE:Lcom/stripe/hcaptcha/HCaptchaCompat;

    invoke-virtual {v2, v1}, Lcom/stripe/hcaptcha/HCaptchaCompat;->getInternalConfig(Landroid/os/Bundle;)Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;

    move-result-object v7

    if-nez v7, :cond_3

    .line 78
    invoke-virtual {p0}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->dismiss()V

    .line 79
    invoke-virtual {v9}, Lcom/stripe/hcaptcha/HCaptchaStateListener;->getOnFailure()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    new-instance p2, Lcom/stripe/hcaptcha/HCaptchaException;

    sget-object v1, Lcom/stripe/hcaptcha/HCaptchaError;->ERROR:Lcom/stripe/hcaptcha/HCaptchaError;

    invoke-direct {p2, v1, v0, p3, v0}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lcom/stripe/hcaptcha/HCaptchaError;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    .line 83
    :cond_3
    invoke-direct {p0, p1, p2, v6}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->prepareRootView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/stripe/hcaptcha/config/HCaptchaConfig;)Landroid/view/View;

    move-result-object p1

    .line 84
    invoke-direct {p0, p1, v6}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->prepareWebView(Landroid/view/View;Lcom/stripe/hcaptcha/config/HCaptchaConfig;)Lcom/stripe/hcaptcha/webview/HCaptchaWebView;

    move-result-object p2

    .line 86
    sget v1, Lcom/stripe/hcaptcha/R$id;->loadingContainer:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroid/widget/LinearLayout;

    .line 87
    invoke-virtual {v6}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->getLoading()Z

    move-result v3

    const/4 v11, 0x0

    if-eqz v3, :cond_4

    move v3, v11

    goto :goto_0

    :cond_4
    const/16 v3, 0x8

    :goto_0
    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 86
    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->loadingContainer:Landroid/widget/LinearLayout;

    .line 90
    new-instance v3, Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;

    .line 91
    new-instance v4, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v4, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 92
    invoke-virtual {p0}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->requireContext()Landroid/content/Context;

    move-result-object v5

    const-string v1, "requireContext(...)"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    move-object v8, p0

    check-cast v8, Lcom/stripe/hcaptcha/IHCaptchaVerifier;

    .line 97
    move-object v10, p2

    check-cast v10, Landroid/webkit/WebView;

    .line 90
    invoke-direct/range {v3 .. v10}, Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;-><init>(Landroid/os/Handler;Landroid/content/Context;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;Lcom/stripe/hcaptcha/IHCaptchaVerifier;Lcom/stripe/hcaptcha/HCaptchaStateListener;Landroid/webkit/WebView;)V

    iput-object v3, p0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->webViewHelper:Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;

    .line 100
    iput-boolean v11, p0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->readyForInteraction:Z
    :try_end_1
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_7
    .catch Landroid/os/BadParcelableException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Landroid/view/InflateException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p1

    :catch_0
    move-object v9, v0

    .line 114
    :catch_1
    invoke-virtual {p0}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->dismiss()V

    if-eqz v9, :cond_5

    .line 115
    invoke-virtual {v9}, Lcom/stripe/hcaptcha/HCaptchaStateListener;->getOnFailure()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    if-eqz p1, :cond_5

    new-instance p2, Lcom/stripe/hcaptcha/HCaptchaException;

    sget-object v1, Lcom/stripe/hcaptcha/HCaptchaError;->ERROR:Lcom/stripe/hcaptcha/HCaptchaError;

    invoke-direct {p2, v1, v0, p3, v0}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lcom/stripe/hcaptcha/HCaptchaError;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catch_2
    move-object v9, v0

    .line 111
    :catch_3
    invoke-virtual {p0}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->dismiss()V

    if-eqz v9, :cond_5

    .line 112
    invoke-virtual {v9}, Lcom/stripe/hcaptcha/HCaptchaStateListener;->getOnFailure()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    if-eqz p1, :cond_5

    new-instance p2, Lcom/stripe/hcaptcha/HCaptchaException;

    sget-object v1, Lcom/stripe/hcaptcha/HCaptchaError;->ERROR:Lcom/stripe/hcaptcha/HCaptchaError;

    invoke-direct {p2, v1, v0, p3, v0}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lcom/stripe/hcaptcha/HCaptchaError;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catch_4
    move-object v9, v0

    .line 108
    :catch_5
    invoke-virtual {p0}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->dismiss()V

    if-eqz v9, :cond_5

    .line 109
    invoke-virtual {v9}, Lcom/stripe/hcaptcha/HCaptchaStateListener;->getOnFailure()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    if-eqz p1, :cond_5

    new-instance p2, Lcom/stripe/hcaptcha/HCaptchaException;

    sget-object v1, Lcom/stripe/hcaptcha/HCaptchaError;->ERROR:Lcom/stripe/hcaptcha/HCaptchaError;

    invoke-direct {p2, v1, v0, p3, v0}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lcom/stripe/hcaptcha/HCaptchaError;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catch_6
    move-object v9, v0

    .line 105
    :catch_7
    invoke-virtual {p0}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->dismiss()V

    if-eqz v9, :cond_5

    .line 106
    invoke-virtual {v9}, Lcom/stripe/hcaptcha/HCaptchaStateListener;->getOnFailure()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    if-eqz p1, :cond_5

    new-instance p2, Lcom/stripe/hcaptcha/HCaptchaException;

    sget-object v1, Lcom/stripe/hcaptcha/HCaptchaError;->ERROR:Lcom/stripe/hcaptcha/HCaptchaError;

    invoke-direct {p2, v1, v0, p3, v0}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lcom/stripe/hcaptcha/HCaptchaError;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    :goto_1
    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    .line 121
    invoke-super {p0}, Landroidx/fragment/app/DialogFragment;->onDestroy()V

    .line 122
    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->webViewHelper:Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;->destroy()V

    :cond_0
    return-void
.end method

.method public onFailure(Lcom/stripe/hcaptcha/HCaptchaException;)V
    .locals 3

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->webViewHelper:Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;->shouldRetry(Lcom/stripe/hcaptcha/HCaptchaException;)Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v1, v2

    .line 186
    :cond_0
    invoke-virtual {p0}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez v1, :cond_1

    .line 187
    invoke-virtual {p0}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->dismissAllowingStateLoss()V

    .line 190
    :cond_1
    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->webViewHelper:Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;

    if-eqz v0, :cond_3

    if-eqz v1, :cond_2

    .line 192
    invoke-virtual {v0}, Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;->resetAndExecute()V

    return-void

    .line 194
    :cond_2
    invoke-virtual {v0}, Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;->getListener$hcaptcha_release()Lcom/stripe/hcaptcha/HCaptchaStateListener;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/HCaptchaStateListener;->getOnFailure()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-void
.end method

.method public onLoaded()V
    .locals 2

    .line 169
    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->webViewHelper:Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;->getConfig$hcaptcha_release()Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->getSize()Lcom/stripe/hcaptcha/config/HCaptchaSize;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lcom/stripe/hcaptcha/config/HCaptchaSize;->INVISIBLE:Lcom/stripe/hcaptcha/config/HCaptchaSize;

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    .line 171
    iput-boolean v0, p0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->readyForInteraction:Z

    .line 172
    invoke-direct {p0}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->hideLoadingContainer()V

    :cond_1
    return-void
.end method

.method public onOpen()V
    .locals 2

    .line 177
    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->webViewHelper:Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;->getConfig$hcaptcha_release()Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->getSize()Lcom/stripe/hcaptcha/config/HCaptchaSize;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lcom/stripe/hcaptcha/config/HCaptchaSize;->INVISIBLE:Lcom/stripe/hcaptcha/config/HCaptchaSize;

    if-ne v0, v1, :cond_1

    .line 178
    invoke-direct {p0}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->hideLoadingContainer()V

    :cond_1
    const/4 v0, 0x1

    .line 180
    iput-boolean v0, p0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->readyForInteraction:Z

    .line 181
    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->webViewHelper:Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;->getListener$hcaptcha_release()Lcom/stripe/hcaptcha/HCaptchaStateListener;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/HCaptchaStateListener;->getOnOpen()Lkotlin/jvm/functions/Function0;

    :cond_2
    return-void
.end method

.method public onStart()V
    .locals 4

    .line 126
    invoke-super {p0}, Landroidx/fragment/app/DialogFragment;->onStart()V

    .line 128
    invoke-virtual {p0}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 129
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 130
    :goto_0
    iget-object v2, p0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->webViewHelper:Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    .line 132
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    const/4 v3, 0x0

    invoke-direct {v0, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    check-cast v0, Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 133
    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    iput v0, p0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->defaultDimAmount:F

    .line 134
    invoke-virtual {v2}, Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;->getConfig$hcaptcha_release()Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->getLoading()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x2

    .line 136
    invoke-virtual {v1, v0}, Landroid/view/Window;->clearFlags(I)V

    const/4 v0, 0x0

    .line 137
    invoke-virtual {v1, v0}, Landroid/view/Window;->setDimAmount(F)V

    :cond_1
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 37
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->onSuccess(Ljava/lang/String;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/String;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    invoke-virtual {p0}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 201
    invoke-virtual {p0}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->dismissAllowingStateLoss()V

    .line 203
    :cond_0
    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->webViewHelper:Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;->getListener$hcaptcha_release()Lcom/stripe/hcaptcha/HCaptchaStateListener;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/HCaptchaStateListener;->getOnSuccess()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public reset()V
    .locals 1

    .line 224
    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->webViewHelper:Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;

    if-eqz v0, :cond_0

    .line 225
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;->reset()V

    .line 227
    :cond_0
    invoke-virtual {p0}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 228
    invoke-virtual {p0}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->dismissAllowingStateLoss()V

    :cond_1
    return-void
.end method

.method public startVerification(Landroidx/fragment/app/FragmentActivity;)V
    .locals 4

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 207
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    const-string v0, "getSupportFragmentManager(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    sget-object v0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->TAG:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 210
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    return-void

    .line 215
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1, v0}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 219
    :catch_0
    iget-object p1, p0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->webViewHelper:Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;->getListener$hcaptcha_release()Lcom/stripe/hcaptcha/HCaptchaStateListener;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/stripe/hcaptcha/HCaptchaStateListener;->getOnFailure()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance v0, Lcom/stripe/hcaptcha/HCaptchaException;

    sget-object v1, Lcom/stripe/hcaptcha/HCaptchaError;->ERROR:Lcom/stripe/hcaptcha/HCaptchaError;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2, v3}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lcom/stripe/hcaptcha/HCaptchaError;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
