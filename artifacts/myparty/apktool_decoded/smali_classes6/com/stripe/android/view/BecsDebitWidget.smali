.class public final Lcom/stripe/android/view/BecsDebitWidget;
.super Landroid/widget/FrameLayout;
.source "BecsDebitWidget.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBecsDebitWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BecsDebitWidget.kt\ncom/stripe/android/view/BecsDebitWidget\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,230:1\n1863#2:231\n1864#2:258\n1863#2:259\n1864#2:286\n58#3,23:232\n93#3,3:255\n58#3,23:260\n93#3,3:283\n1#4:287\n52#5,9:288\n*S KotlinDebug\n*F\n+ 1 BecsDebitWidget.kt\ncom/stripe/android/view/BecsDebitWidget\n*L\n77#1:231\n77#1:258\n151#1:259\n151#1:286\n78#1:232,23\n78#1:255,3\n152#1:260,23\n152#1:283,3\n174#1:288,9\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\"B1\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0008\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\u001c2\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002R\u001b\u0010\u000c\u001a\u00020\r8@X\u0080\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u001aR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lcom/stripe/android/view/BecsDebitWidget;",
        "Landroid/widget/FrameLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "companyName",
        "",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;)V",
        "viewBinding",
        "Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;",
        "getViewBinding$payments_core_release",
        "()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;",
        "viewBinding$delegate",
        "Lkotlin/Lazy;",
        "validParamsCallback",
        "Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;",
        "getValidParamsCallback",
        "()Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;",
        "setValidParamsCallback",
        "(Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;)V",
        "isInputValid",
        "",
        "()Z",
        "verifyCompanyName",
        "",
        "applyAttributes",
        "params",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "getParams",
        "()Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "ValidParamsCallback",
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
.field private validParamsCallback:Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;

.field private final viewBinding$delegate:Lkotlin/Lazy;


# direct methods
.method public static synthetic $r8$lambda$7kakBZX3wNbMFpZWxJ8eTgNqfOw(Lcom/stripe/android/view/BecsDebitWidget;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/view/BecsDebitWidget;->_init_$lambda$4(Lcom/stripe/android/view/BecsDebitWidget;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$D7J1XK8OgxdzllMBQ9-Pw9WpvT8(Lcom/stripe/android/view/BecsDebitWidget;Lcom/stripe/android/view/BecsDebitBanks$Bank;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/view/BecsDebitWidget;->_init_$lambda$3(Lcom/stripe/android/view/BecsDebitWidget;Lcom/stripe/android/view/BecsDebitBanks$Bank;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$RiGEMgmimS2isBocTWQgt-7yIEA(Landroid/content/Context;Lcom/stripe/android/view/BecsDebitWidget;)Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/view/BecsDebitWidget;->viewBinding_delegate$lambda$0(Landroid/content/Context;Lcom/stripe/android/view/BecsDebitWidget;)Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/view/BecsDebitWidget;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/view/BecsDebitWidget;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/view/BecsDebitWidget;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;)V
    .locals 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "companyName"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 37
    new-instance p3, Lcom/stripe/android/view/BecsDebitWidget$$ExternalSyntheticLambda0;

    invoke-direct {p3, p1, p0}, Lcom/stripe/android/view/BecsDebitWidget$$ExternalSyntheticLambda0;-><init>(Landroid/content/Context;Lcom/stripe/android/view/BecsDebitWidget;)V

    invoke-static {p3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/view/BecsDebitWidget;->viewBinding$delegate:Lkotlin/Lazy;

    .line 47
    new-instance p1, Lcom/stripe/android/view/BecsDebitWidget$validParamsCallback$1;

    invoke-direct {p1}, Lcom/stripe/android/view/BecsDebitWidget$validParamsCallback$1;-><init>()V

    check-cast p1, Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;

    iput-object p1, p0, Lcom/stripe/android/view/BecsDebitWidget;->validParamsCallback:Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;

    .line 67
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1a

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-lt p1, p3, :cond_0

    .line 68
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->nameEditText:Lcom/stripe/android/view/StripeEditText;

    new-array p3, v0, [Ljava/lang/String;

    const-string v2, "name"

    aput-object v2, p3, v1

    invoke-virtual {p1, p3}, Lcom/stripe/android/view/StripeEditText;->setAutofillHints([Ljava/lang/String;)V

    .line 69
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->emailEditText:Lcom/stripe/android/view/EmailEditText;

    new-array p3, v0, [Ljava/lang/String;

    const-string v2, "emailAddress"

    aput-object v2, p3, v1

    invoke-virtual {p1, p3}, Lcom/stripe/android/view/EmailEditText;->setAutofillHints([Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x4

    .line 73
    new-array p1, p1, [Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object p3

    iget-object p3, p3, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->nameEditText:Lcom/stripe/android/view/StripeEditText;

    aput-object p3, p1, v1

    .line 74
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object p3

    iget-object p3, p3, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->emailEditText:Lcom/stripe/android/view/EmailEditText;

    aput-object p3, p1, v0

    .line 75
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object p3

    iget-object p3, p3, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->bsbEditText:Lcom/stripe/android/view/BecsDebitBsbEditText;

    const/4 v2, 0x2

    aput-object p3, p1, v2

    .line 76
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object p3

    iget-object p3, p3, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->accountNumberEditText:Lcom/stripe/android/view/BecsDebitAccountNumberEditText;

    const/4 v3, 0x3

    aput-object p3, p1, v3

    .line 72
    invoke-static {p1}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 231
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/stripe/android/view/StripeEditText;

    .line 78
    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p3, Landroid/widget/TextView;

    .line 254
    new-instance v3, Lcom/stripe/android/view/BecsDebitWidget$_init_$lambda$2$$inlined$doAfterTextChanged$1;

    invoke-direct {v3, p0}, Lcom/stripe/android/view/BecsDebitWidget$_init_$lambda$2$$inlined$doAfterTextChanged$1;-><init>(Lcom/stripe/android/view/BecsDebitWidget;)V

    .line 255
    check-cast v3, Landroid/text/TextWatcher;

    invoke-virtual {p3, v3}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_0

    .line 83
    :cond_1
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->bsbEditText:Lcom/stripe/android/view/BecsDebitBsbEditText;

    new-instance p3, Lcom/stripe/android/view/BecsDebitWidget$$ExternalSyntheticLambda1;

    invoke-direct {p3, p0}, Lcom/stripe/android/view/BecsDebitWidget$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/view/BecsDebitWidget;)V

    invoke-virtual {p1, p3}, Lcom/stripe/android/view/BecsDebitBsbEditText;->setOnBankChangedCallback(Lkotlin/jvm/functions/Function1;)V

    .line 117
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->bsbEditText:Lcom/stripe/android/view/BecsDebitBsbEditText;

    new-instance p3, Lcom/stripe/android/view/BecsDebitWidget$$ExternalSyntheticLambda2;

    invoke-direct {p3, p0}, Lcom/stripe/android/view/BecsDebitWidget$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/view/BecsDebitWidget;)V

    invoke-virtual {p1, p3}, Lcom/stripe/android/view/BecsDebitBsbEditText;->setOnCompletedCallback(Lkotlin/jvm/functions/Function0;)V

    .line 122
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->emailEditText:Lcom/stripe/android/view/EmailEditText;

    .line 123
    new-instance p3, Lcom/stripe/android/view/BackUpFieldDeleteListener;

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object v3

    iget-object v3, v3, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->nameEditText:Lcom/stripe/android/view/StripeEditText;

    const-string v4, "nameEditText"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p3, v3}, Lcom/stripe/android/view/BackUpFieldDeleteListener;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    check-cast p3, Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;

    .line 122
    invoke-virtual {p1, p3}, Lcom/stripe/android/view/EmailEditText;->setDeleteEmptyListener(Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V

    .line 125
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->bsbEditText:Lcom/stripe/android/view/BecsDebitBsbEditText;

    .line 126
    new-instance p3, Lcom/stripe/android/view/BackUpFieldDeleteListener;

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object v3

    iget-object v3, v3, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->emailEditText:Lcom/stripe/android/view/EmailEditText;

    const-string v4, "emailEditText"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lcom/stripe/android/view/StripeEditText;

    invoke-direct {p3, v3}, Lcom/stripe/android/view/BackUpFieldDeleteListener;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    check-cast p3, Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;

    .line 125
    invoke-virtual {p1, p3}, Lcom/stripe/android/view/BecsDebitBsbEditText;->setDeleteEmptyListener(Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V

    .line 128
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->accountNumberEditText:Lcom/stripe/android/view/BecsDebitAccountNumberEditText;

    .line 129
    new-instance p3, Lcom/stripe/android/view/BackUpFieldDeleteListener;

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object v3

    iget-object v3, v3, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->bsbEditText:Lcom/stripe/android/view/BecsDebitBsbEditText;

    const-string v4, "bsbEditText"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lcom/stripe/android/view/StripeEditText;

    invoke-direct {p3, v3}, Lcom/stripe/android/view/BackUpFieldDeleteListener;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    check-cast p3, Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;

    .line 128
    invoke-virtual {p1, p3}, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;->setDeleteEmptyListener(Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V

    .line 132
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->nameEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    .line 133
    sget v3, Lcom/stripe/android/R$string;->stripe_becs_widget_name_required:I

    .line 132
    invoke-virtual {p3, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage$payments_core_release(Ljava/lang/String;)V

    .line 135
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->nameEditText:Lcom/stripe/android/view/StripeEditText;

    .line 136
    new-instance p3, Lcom/stripe/android/view/ErrorListener;

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object v3

    iget-object v3, v3, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->nameTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v4, "nameTextInputLayout"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p3, v3}, Lcom/stripe/android/view/ErrorListener;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    check-cast p3, Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;

    .line 135
    invoke-virtual {p1, p3}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    .line 139
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->emailEditText:Lcom/stripe/android/view/EmailEditText;

    .line 140
    new-instance p3, Lcom/stripe/android/view/ErrorListener;

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object v3

    iget-object v3, v3, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->emailTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v4, "emailTextInputLayout"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p3, v3}, Lcom/stripe/android/view/ErrorListener;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    check-cast p3, Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;

    .line 139
    invoke-virtual {p1, p3}, Lcom/stripe/android/view/EmailEditText;->setErrorMessageListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    .line 143
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->bsbEditText:Lcom/stripe/android/view/BecsDebitBsbEditText;

    .line 144
    new-instance p3, Lcom/stripe/android/view/ErrorListener;

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object v3

    iget-object v3, v3, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->bsbTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v4, "bsbTextInputLayout"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p3, v3}, Lcom/stripe/android/view/ErrorListener;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    check-cast p3, Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;

    .line 143
    invoke-virtual {p1, p3}, Lcom/stripe/android/view/BecsDebitBsbEditText;->setErrorMessageListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    .line 147
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->accountNumberEditText:Lcom/stripe/android/view/BecsDebitAccountNumberEditText;

    .line 148
    new-instance p3, Lcom/stripe/android/view/ErrorListener;

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object v3

    iget-object v3, v3, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->accountNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v4, "accountNumberTextInputLayout"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p3, v3}, Lcom/stripe/android/view/ErrorListener;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    check-cast p3, Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;

    .line 147
    invoke-virtual {p1, p3}, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;->setErrorMessageListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    .line 151
    new-array p1, v2, [Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object p3

    iget-object p3, p3, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->nameEditText:Lcom/stripe/android/view/StripeEditText;

    aput-object p3, p1, v1

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object p3

    iget-object p3, p3, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->emailEditText:Lcom/stripe/android/view/EmailEditText;

    aput-object p3, p1, v0

    invoke-static {p1}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 259
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/stripe/android/view/StripeEditText;

    .line 152
    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v0, p3

    check-cast v0, Landroid/widget/TextView;

    .line 282
    new-instance v1, Lcom/stripe/android/view/BecsDebitWidget$_init_$lambda$6$$inlined$doAfterTextChanged$1;

    invoke-direct {v1, p3}, Lcom/stripe/android/view/BecsDebitWidget$_init_$lambda$6$$inlined$doAfterTextChanged$1;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    .line 283
    check-cast v1, Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_1

    .line 157
    :cond_2
    move-object p1, p4

    check-cast p1, Ljava/lang/CharSequence;

    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    const/4 p4, 0x0

    :goto_2
    if-eqz p4, :cond_4

    .line 158
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->mandateAcceptanceTextView:Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;

    invoke-virtual {p1, p4}, Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;->setCompanyName(Ljava/lang/String;)V

    .line 160
    :cond_4
    invoke-direct {p0, p2}, Lcom/stripe/android/view/BecsDebitWidget;->applyAttributes(Landroid/util/AttributeSet;)V

    .line 162
    invoke-direct {p0}, Lcom/stripe/android/view/BecsDebitWidget;->verifyCompanyName()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 34
    const-string p4, ""

    .line 30
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/view/BecsDebitWidget;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;)V

    return-void
.end method

.method private static final _init_$lambda$3(Lcom/stripe/android/view/BecsDebitWidget;Lcom/stripe/android/view/BecsDebitBanks$Bank;)Lkotlin/Unit;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 85
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object v1

    iget-object v1, v1, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->bsbTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p1}, Lcom/stripe/android/view/BecsDebitBanks$Bank;->getName()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setHelperText(Ljava/lang/CharSequence;)V

    .line 86
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object v1

    iget-object v1, v1, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->bsbTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setHelperTextEnabled(Z)V

    goto :goto_0

    .line 88
    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object v1

    iget-object v1, v1, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->bsbTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHelperText(Ljava/lang/CharSequence;)V

    .line 89
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object v1

    iget-object v1, v1, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->bsbTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setHelperTextEnabled(Z)V

    .line 92
    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object p0

    iget-object p0, p0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->accountNumberEditText:Lcom/stripe/android/view/BecsDebitAccountNumberEditText;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/stripe/android/view/BecsDebitBanks$Bank;->getPrefix()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 v0, 0x2

    invoke-static {p1, v0}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    :cond_1
    if-eqz v0, :cond_c

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result p1

    const/16 v1, 0x600

    const/16 v2, 0x9

    if-eq p1, v1, :cond_b

    const/16 v1, 0x601

    if-eq p1, v1, :cond_a

    const/16 v1, 0x603

    if-eq p1, v1, :cond_8

    const/16 v1, 0x606

    if-eq p1, v1, :cond_6

    const/16 v1, 0x608

    if-eq p1, v1, :cond_5

    const/16 v1, 0x6dc

    if-eq p1, v1, :cond_4

    const/16 v1, 0x6f8

    if-eq p1, v1, :cond_2

    goto :goto_1

    :cond_2
    const-string p1, "80"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x4

    goto :goto_2

    :cond_4
    const-string p1, "73"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_1

    :cond_5
    const-string p1, "08"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto :goto_1

    :cond_6
    const-string p1, "06"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_1

    :cond_7
    const/16 v2, 0x8

    goto :goto_2

    :cond_8
    const-string p1, "03"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_1

    :cond_9
    const/4 v2, 0x6

    goto :goto_2

    :cond_a
    const-string p1, "01"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto :goto_1

    :cond_b
    const-string p1, "00"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    :cond_c
    :goto_1
    const/4 v2, 0x5

    :cond_d
    :goto_2
    invoke-virtual {p0, v2}, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;->setMinLength(I)V

    .line 115
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final _init_$lambda$4(Lcom/stripe/android/view/BecsDebitWidget;)Lkotlin/Unit;
    .locals 0

    .line 118
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object p0

    iget-object p0, p0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->accountNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->requestFocus()Z

    .line 119
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic access$isInputValid(Lcom/stripe/android/view/BecsDebitWidget;)Z
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/stripe/android/view/BecsDebitWidget;->isInputValid()Z

    move-result p0

    return p0
.end method

.method private final applyAttributes(Landroid/util/AttributeSet;)V
    .locals 3

    .line 174
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    sget-object v1, Lcom/stripe/android/R$styleable;->BecsDebitWidget:[I

    const-string v2, "BecsDebitWidget"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 295
    invoke-virtual {v0, p1, v1, v2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 179
    sget v0, Lcom/stripe/android/R$styleable;->BecsDebitWidget_companyName:I

    .line 178
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 181
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object v1

    iget-object v1, v1, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->mandateAcceptanceTextView:Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;

    invoke-virtual {v1, v0}, Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;->setCompanyName(Ljava/lang/String;)V

    .line 295
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private final isInputValid()Z
    .locals 4

    .line 55
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->nameEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v0

    .line 56
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object v1

    iget-object v1, v1, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->emailEditText:Lcom/stripe/android/view/EmailEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/EmailEditText;->getEmail()Ljava/lang/String;

    move-result-object v1

    .line 57
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object v2

    iget-object v2, v2, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->bsbEditText:Lcom/stripe/android/view/BecsDebitBsbEditText;

    invoke-virtual {v2}, Lcom/stripe/android/view/BecsDebitBsbEditText;->getBsb$payments_core_release()Ljava/lang/String;

    move-result-object v2

    .line 58
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object v3

    iget-object v3, v3, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->accountNumberEditText:Lcom/stripe/android/view/BecsDebitAccountNumberEditText;

    invoke-virtual {v3}, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;->getAccountNumber()Ljava/lang/String;

    move-result-object v3

    .line 61
    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    check-cast v1, Ljava/lang/CharSequence;

    if-eqz v1, :cond_3

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast v2, Ljava/lang/CharSequence;

    if-eqz v2, :cond_3

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 62
    :cond_1
    check-cast v3, Ljava/lang/CharSequence;

    if-eqz v3, :cond_3

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    return v0

    :cond_3
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private final verifyCompanyName()V
    .locals 2

    .line 166
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->mandateAcceptanceTextView:Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;

    invoke-virtual {v0}, Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;->isValid$payments_core_release()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "A company name is required to render a BecsDebitWidget."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final viewBinding_delegate$lambda$0(Landroid/content/Context;Lcom/stripe/android/view/BecsDebitWidget;)Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;
    .locals 0

    .line 39
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p0

    .line 40
    check-cast p1, Landroid/view/ViewGroup;

    .line 38
    invoke-static {p0, p1}, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object p0

    const-string p1, "inflate(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public final getParams()Lcom/stripe/android/model/PaymentMethodCreateParams;
    .locals 12

    .line 192
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->nameEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v4

    .line 193
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->emailEditText:Lcom/stripe/android/view/EmailEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/EmailEditText;->getEmail()Ljava/lang/String;

    move-result-object v3

    .line 194
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->bsbEditText:Lcom/stripe/android/view/BecsDebitBsbEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/BecsDebitBsbEditText;->getBsb$payments_core_release()Ljava/lang/String;

    move-result-object v0

    .line 195
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object v1

    iget-object v1, v1, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->accountNumberEditText:Lcom/stripe/android/view/BecsDebitAccountNumberEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;->getAccountNumber()Ljava/lang/String;

    move-result-object v1

    .line 197
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object v2

    iget-object v2, v2, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->nameEditText:Lcom/stripe/android/view/StripeEditText;

    move-object v5, v4

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v5}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v6

    invoke-virtual {v2, v6}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    .line 198
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object v2

    iget-object v2, v2, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->emailEditText:Lcom/stripe/android/view/EmailEditText;

    move-object v6, v3

    check-cast v6, Ljava/lang/CharSequence;

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v6, :cond_1

    invoke-static {v6}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_0

    :cond_0
    move v9, v7

    goto :goto_1

    :cond_1
    :goto_0
    move v9, v8

    :goto_1
    invoke-virtual {v2, v9}, Lcom/stripe/android/view/EmailEditText;->setShouldShowError(Z)V

    .line 199
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object v2

    iget-object v2, v2, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->bsbEditText:Lcom/stripe/android/view/BecsDebitBsbEditText;

    move-object v9, v0

    check-cast v9, Ljava/lang/CharSequence;

    if-eqz v9, :cond_3

    invoke-static {v9}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_2

    goto :goto_2

    :cond_2
    move v10, v7

    goto :goto_3

    :cond_3
    :goto_2
    move v10, v8

    :goto_3
    invoke-virtual {v2, v10}, Lcom/stripe/android/view/BecsDebitBsbEditText;->setShouldShowError(Z)V

    .line 200
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object v2

    iget-object v2, v2, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->accountNumberEditText:Lcom/stripe/android/view/BecsDebitAccountNumberEditText;

    move-object v10, v1

    check-cast v10, Ljava/lang/CharSequence;

    if-eqz v10, :cond_4

    invoke-static {v10}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_5

    :cond_4
    move v7, v8

    :cond_5
    invoke-virtual {v2, v7}, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;->setShouldShowError(Z)V

    .line 202
    invoke-static {v5}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_9

    if-eqz v6, :cond_9

    invoke-static {v6}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_4

    :cond_6
    if-eqz v9, :cond_9

    invoke-static {v9}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_4

    :cond_7
    if-eqz v10, :cond_9

    .line 203
    invoke-static {v10}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    .line 208
    :cond_8
    sget-object v8, Lcom/stripe/android/model/PaymentMethodCreateParams;->Companion:Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;

    .line 209
    new-instance v9, Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;

    invoke-direct {v9, v0, v1}, Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    new-instance v1, Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    const/16 v6, 0x9

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/model/PaymentMethod$BillingDetails;-><init>(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v10, 0xc

    const/4 v11, 0x0

    move-object v5, v8

    const/4 v8, 0x0

    move-object v6, v9

    const/4 v9, 0x0

    move-object v7, v1

    .line 208
    invoke-static/range {v5 .. v11}, Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;->create$default(Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v0

    return-object v0

    :cond_9
    :goto_4
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getValidParamsCallback()Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/stripe/android/view/BecsDebitWidget;->validParamsCallback:Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;

    return-object v0
.end method

.method public final getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/stripe/android/view/BecsDebitWidget;->viewBinding$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    return-object v0
.end method

.method public final setValidParamsCallback(Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    iput-object p1, p0, Lcom/stripe/android/view/BecsDebitWidget;->validParamsCallback:Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;

    return-void
.end method
