.class public final synthetic Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Lcom/stripe/android/core/strings/ResolvableString;

.field public final synthetic f$2:Lcom/stripe/android/uicore/elements/SingleChoiceDropdownItem;

.field public final synthetic f$3:Ljava/util/List;

.field public final synthetic f$4:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$5:J

.field public final synthetic f$6:J

.field public final synthetic f$7:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$8:I


# direct methods
.method public synthetic constructor <init>(ZLcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/elements/SingleChoiceDropdownItem;Ljava/util/List;Lkotlin/jvm/functions/Function1;JJLkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda0;->f$0:Z

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/core/strings/ResolvableString;

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda0;->f$2:Lcom/stripe/android/uicore/elements/SingleChoiceDropdownItem;

    iput-object p4, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda0;->f$3:Ljava/util/List;

    iput-object p5, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda0;->f$4:Lkotlin/jvm/functions/Function1;

    iput-wide p6, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda0;->f$5:J

    iput-wide p8, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda0;->f$6:J

    iput-object p10, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda0;->f$7:Lkotlin/jvm/functions/Function0;

    iput p11, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda0;->f$8:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 0
    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda0;->f$0:Z

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/core/strings/ResolvableString;

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda0;->f$2:Lcom/stripe/android/uicore/elements/SingleChoiceDropdownItem;

    iget-object v3, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda0;->f$3:Ljava/util/List;

    iget-object v4, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda0;->f$4:Lkotlin/jvm/functions/Function1;

    iget-wide v5, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda0;->f$5:J

    iget-wide v7, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda0;->f$6:J

    iget-object v9, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda0;->f$7:Lkotlin/jvm/functions/Function0;

    iget v10, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda0;->f$8:I

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-static/range {v0 .. v12}, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt;->$r8$lambda$zqdhQvwohW2Chkp8fxyjpQbD2Lw(ZLcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/elements/SingleChoiceDropdownItem;Ljava/util/List;Lkotlin/jvm/functions/Function1;JJLkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
