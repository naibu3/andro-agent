.class public final synthetic Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda9;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Lcom/stripe/android/uicore/elements/TextFieldController;

.field public final synthetic f$2:Lcom/stripe/android/link/ui/signup/SignUpState;

.field public final synthetic f$3:I

.field public final synthetic f$4:Landroidx/compose/ui/focus/FocusRequester;

.field public final synthetic f$5:Z

.field public final synthetic f$6:Lkotlin/jvm/functions/Function2;

.field public final synthetic f$7:I

.field public final synthetic f$8:I


# direct methods
.method public synthetic constructor <init>(ZLcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;ILandroidx/compose/ui/focus/FocusRequester;ZLkotlin/jvm/functions/Function2;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda9;->f$0:Z

    iput-object p2, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda9;->f$1:Lcom/stripe/android/uicore/elements/TextFieldController;

    iput-object p3, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda9;->f$2:Lcom/stripe/android/link/ui/signup/SignUpState;

    iput p4, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda9;->f$3:I

    iput-object p5, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda9;->f$4:Landroidx/compose/ui/focus/FocusRequester;

    iput-boolean p6, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda9;->f$5:Z

    iput-object p7, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda9;->f$6:Lkotlin/jvm/functions/Function2;

    iput p8, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda9;->f$7:I

    iput p9, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda9;->f$8:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 0
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda9;->f$0:Z

    iget-object v1, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda9;->f$1:Lcom/stripe/android/uicore/elements/TextFieldController;

    iget-object v2, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda9;->f$2:Lcom/stripe/android/link/ui/signup/SignUpState;

    iget v3, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda9;->f$3:I

    iget-object v4, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda9;->f$4:Landroidx/compose/ui/focus/FocusRequester;

    iget-boolean v5, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda9;->f$5:Z

    iget-object v6, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda9;->f$6:Lkotlin/jvm/functions/Function2;

    iget v7, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda9;->f$7:I

    iget v8, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda9;->f$8:I

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt;->$r8$lambda$F1LNoxcX0Kp1Ce1I4MYlCdYPag4(ZLcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;ILandroidx/compose/ui/focus/FocusRequester;ZLkotlin/jvm/functions/Function2;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
