.class public final synthetic Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda4;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/uicore/elements/SectionController;

.field public final synthetic f$1:Lcom/stripe/android/uicore/elements/TextFieldController;

.field public final synthetic f$10:I

.field public final synthetic f$11:I

.field public final synthetic f$2:Lcom/stripe/android/uicore/elements/PhoneNumberController;

.field public final synthetic f$3:Lcom/stripe/android/uicore/elements/TextFieldController;

.field public final synthetic f$4:Z

.field public final synthetic f$5:Lcom/stripe/android/link/ui/signup/SignUpState;

.field public final synthetic f$6:Z

.field public final synthetic f$7:Z

.field public final synthetic f$8:Ljava/lang/String;

.field public final synthetic f$9:Landroidx/compose/ui/Modifier;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/uicore/elements/SectionController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/TextFieldController;ZLcom/stripe/android/link/ui/signup/SignUpState;ZZLjava/lang/String;Landroidx/compose/ui/Modifier;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda4;->f$0:Lcom/stripe/android/uicore/elements/SectionController;

    iput-object p2, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda4;->f$1:Lcom/stripe/android/uicore/elements/TextFieldController;

    iput-object p3, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda4;->f$2:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iput-object p4, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda4;->f$3:Lcom/stripe/android/uicore/elements/TextFieldController;

    iput-boolean p5, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda4;->f$4:Z

    iput-object p6, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda4;->f$5:Lcom/stripe/android/link/ui/signup/SignUpState;

    iput-boolean p7, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda4;->f$6:Z

    iput-boolean p8, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda4;->f$7:Z

    iput-object p9, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda4;->f$8:Ljava/lang/String;

    iput-object p10, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda4;->f$9:Landroidx/compose/ui/Modifier;

    iput p11, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda4;->f$10:I

    iput p12, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda4;->f$11:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 0
    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda4;->f$0:Lcom/stripe/android/uicore/elements/SectionController;

    iget-object v1, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda4;->f$1:Lcom/stripe/android/uicore/elements/TextFieldController;

    iget-object v2, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda4;->f$2:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iget-object v3, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda4;->f$3:Lcom/stripe/android/uicore/elements/TextFieldController;

    iget-boolean v4, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda4;->f$4:Z

    iget-object v5, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda4;->f$5:Lcom/stripe/android/link/ui/signup/SignUpState;

    iget-boolean v6, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda4;->f$6:Z

    iget-boolean v7, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda4;->f$7:Z

    iget-object v8, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda4;->f$8:Ljava/lang/String;

    iget-object v9, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda4;->f$9:Landroidx/compose/ui/Modifier;

    iget v10, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda4;->f$10:I

    iget v11, p0, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt$$ExternalSyntheticLambda4;->f$11:I

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    invoke-static/range {v0 .. v13}, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt;->$r8$lambda$g-p4Nh-KdJTgkQMiu2d3xgxaJEQ(Lcom/stripe/android/uicore/elements/SectionController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/TextFieldController;ZLcom/stripe/android/link/ui/signup/SignUpState;ZZLjava/lang/String;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
