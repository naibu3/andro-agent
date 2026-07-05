.class final Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2$1;
.super Ljava/lang/Object;
.source "SignUpScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

.field final synthetic $emailFocusRequester:Landroidx/compose/ui/focus/FocusRequester;

.field final synthetic $signUpScreenState:Lcom/stripe/android/link/ui/signup/SignUpScreenState;


# direct methods
.method constructor <init>(Lcom/stripe/android/link/ui/signup/SignUpScreenState;Lcom/stripe/android/uicore/elements/TextFieldController;Landroidx/compose/ui/focus/FocusRequester;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2$1;->$signUpScreenState:Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    iput-object p2, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2$1;->$emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iput-object p3, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2$1;->$emailFocusRequester:Landroidx/compose/ui/focus/FocusRequester;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 115
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 116
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 122
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 116
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.link.ui.signup.SignUpBody.<anonymous>.<anonymous> (SignUpScreen.kt:115)"

    const v2, 0x70357fbe

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 117
    :cond_2
    iget-object p2, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2$1;->$signUpScreenState:Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    invoke-virtual {p2}, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->getCanEditForm()Z

    move-result v0

    .line 118
    iget-object p2, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2$1;->$signUpScreenState:Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    invoke-virtual {p2}, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->getCanEditEmail()Z

    move-result v1

    .line 119
    iget-object v2, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2$1;->$emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

    .line 120
    iget-object p2, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2$1;->$signUpScreenState:Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    invoke-virtual {p2}, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->getSignUpState()Lcom/stripe/android/link/ui/signup/SignUpState;

    move-result-object v3

    .line 121
    iget-object v4, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2$1;->$emailFocusRequester:Landroidx/compose/ui/focus/FocusRequester;

    const/16 v6, 0x6000

    const/4 v7, 0x0

    move-object v5, p1

    .line 116
    invoke-static/range {v0 .. v7}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt;->EmailCollectionSection(ZZLcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    return-void
.end method
