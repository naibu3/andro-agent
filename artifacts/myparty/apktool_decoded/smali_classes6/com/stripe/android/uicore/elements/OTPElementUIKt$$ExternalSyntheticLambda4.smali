.class public final synthetic Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda4;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Ljava/lang/String;

.field public final synthetic f$1:Z

.field public final synthetic f$10:I

.field public final synthetic f$2:Landroidx/compose/ui/text/TextStyle;

.field public final synthetic f$3:Lcom/stripe/android/uicore/elements/OTPElement;

.field public final synthetic f$4:I

.field public final synthetic f$5:Landroidx/compose/ui/focus/FocusManager;

.field public final synthetic f$6:Landroidx/compose/ui/Modifier;

.field public final synthetic f$7:Z

.field public final synthetic f$8:Lcom/stripe/android/uicore/elements/OTPElementColors;

.field public final synthetic f$9:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ZLandroidx/compose/ui/text/TextStyle;Lcom/stripe/android/uicore/elements/OTPElement;ILandroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/Modifier;ZLcom/stripe/android/uicore/elements/OTPElementColors;Ljava/lang/String;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda4;->f$0:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda4;->f$1:Z

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda4;->f$2:Landroidx/compose/ui/text/TextStyle;

    iput-object p4, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda4;->f$3:Lcom/stripe/android/uicore/elements/OTPElement;

    iput p5, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda4;->f$4:I

    iput-object p6, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda4;->f$5:Landroidx/compose/ui/focus/FocusManager;

    iput-object p7, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda4;->f$6:Landroidx/compose/ui/Modifier;

    iput-boolean p8, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda4;->f$7:Z

    iput-object p9, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda4;->f$8:Lcom/stripe/android/uicore/elements/OTPElementColors;

    iput-object p10, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda4;->f$9:Ljava/lang/String;

    iput p11, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda4;->f$10:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 0
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda4;->f$0:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda4;->f$1:Z

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda4;->f$2:Landroidx/compose/ui/text/TextStyle;

    iget-object v3, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda4;->f$3:Lcom/stripe/android/uicore/elements/OTPElement;

    iget v4, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda4;->f$4:I

    iget-object v5, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda4;->f$5:Landroidx/compose/ui/focus/FocusManager;

    iget-object v6, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda4;->f$6:Landroidx/compose/ui/Modifier;

    iget-boolean v7, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda4;->f$7:Z

    iget-object v8, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda4;->f$8:Lcom/stripe/android/uicore/elements/OTPElementColors;

    iget-object v9, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda4;->f$9:Ljava/lang/String;

    iget v10, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda4;->f$10:I

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-static/range {v0 .. v12}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->$r8$lambda$VzOIy7r0rVTf91so2BSG3-0OX_M(Ljava/lang/String;ZLandroidx/compose/ui/text/TextStyle;Lcom/stripe/android/uicore/elements/OTPElement;ILandroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/Modifier;ZLcom/stripe/android/uicore/elements/OTPElementColors;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
