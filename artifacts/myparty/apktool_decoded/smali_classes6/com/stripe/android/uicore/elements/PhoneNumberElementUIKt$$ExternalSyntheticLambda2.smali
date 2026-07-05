.class public final synthetic Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Lcom/stripe/android/uicore/elements/PhoneNumberController;

.field public final synthetic f$10:I

.field public final synthetic f$11:I

.field public final synthetic f$2:Landroidx/compose/ui/Modifier;

.field public final synthetic f$3:Lkotlin/jvm/functions/Function2;

.field public final synthetic f$4:Z

.field public final synthetic f$5:Ljava/lang/Integer;

.field public final synthetic f$6:Z

.field public final synthetic f$7:Z

.field public final synthetic f$8:Landroidx/compose/ui/focus/FocusRequester;

.field public final synthetic f$9:I


# direct methods
.method public synthetic constructor <init>(ZLcom/stripe/android/uicore/elements/PhoneNumberController;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLjava/lang/Integer;ZZLandroidx/compose/ui/focus/FocusRequester;III)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$$ExternalSyntheticLambda2;->f$0:Z

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$$ExternalSyntheticLambda2;->f$1:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$$ExternalSyntheticLambda2;->f$2:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$$ExternalSyntheticLambda2;->f$3:Lkotlin/jvm/functions/Function2;

    iput-boolean p5, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$$ExternalSyntheticLambda2;->f$4:Z

    iput-object p6, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$$ExternalSyntheticLambda2;->f$5:Ljava/lang/Integer;

    iput-boolean p7, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$$ExternalSyntheticLambda2;->f$6:Z

    iput-boolean p8, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$$ExternalSyntheticLambda2;->f$7:Z

    iput-object p9, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$$ExternalSyntheticLambda2;->f$8:Landroidx/compose/ui/focus/FocusRequester;

    iput p10, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$$ExternalSyntheticLambda2;->f$9:I

    iput p11, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$$ExternalSyntheticLambda2;->f$10:I

    iput p12, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$$ExternalSyntheticLambda2;->f$11:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 0
    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$$ExternalSyntheticLambda2;->f$0:Z

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$$ExternalSyntheticLambda2;->f$1:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$$ExternalSyntheticLambda2;->f$2:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$$ExternalSyntheticLambda2;->f$3:Lkotlin/jvm/functions/Function2;

    iget-boolean v4, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$$ExternalSyntheticLambda2;->f$4:Z

    iget-object v5, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$$ExternalSyntheticLambda2;->f$5:Ljava/lang/Integer;

    iget-boolean v6, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$$ExternalSyntheticLambda2;->f$6:Z

    iget-boolean v7, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$$ExternalSyntheticLambda2;->f$7:Z

    iget-object v8, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$$ExternalSyntheticLambda2;->f$8:Landroidx/compose/ui/focus/FocusRequester;

    iget v9, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$$ExternalSyntheticLambda2;->f$9:I

    iget v10, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$$ExternalSyntheticLambda2;->f$10:I

    iget v11, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$$ExternalSyntheticLambda2;->f$11:I

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    invoke-static/range {v0 .. v13}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->$r8$lambda$-FoUswhvvxSyh9c24x_FkR5Vfa0(ZLcom/stripe/android/uicore/elements/PhoneNumberController;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLjava/lang/Integer;ZZLandroidx/compose/ui/focus/FocusRequester;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
