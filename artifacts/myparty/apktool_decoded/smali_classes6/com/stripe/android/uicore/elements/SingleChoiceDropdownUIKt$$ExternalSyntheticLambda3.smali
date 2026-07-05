.class public final synthetic Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Ljava/lang/String;

.field public final synthetic f$1:Ljava/lang/Integer;

.field public final synthetic f$2:Z

.field public final synthetic f$3:J

.field public final synthetic f$4:Z

.field public final synthetic f$5:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$6:I

.field public final synthetic f$7:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Integer;ZJZLkotlin/jvm/functions/Function0;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda3;->f$0:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda3;->f$1:Ljava/lang/Integer;

    iput-boolean p3, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda3;->f$2:Z

    iput-wide p4, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda3;->f$3:J

    iput-boolean p6, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda3;->f$4:Z

    iput-object p7, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda3;->f$5:Lkotlin/jvm/functions/Function0;

    iput p8, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda3;->f$6:I

    iput p9, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda3;->f$7:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 0
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda3;->f$0:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda3;->f$1:Ljava/lang/Integer;

    iget-boolean v2, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda3;->f$2:Z

    iget-wide v3, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda3;->f$3:J

    iget-boolean v5, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda3;->f$4:Z

    iget-object v6, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda3;->f$5:Lkotlin/jvm/functions/Function0;

    iget v7, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda3;->f$6:I

    iget v8, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$$ExternalSyntheticLambda3;->f$7:I

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt;->$r8$lambda$TNucSs_iFY76jqSudH3oBu-tW44(Ljava/lang/String;Ljava/lang/Integer;ZJZLkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
