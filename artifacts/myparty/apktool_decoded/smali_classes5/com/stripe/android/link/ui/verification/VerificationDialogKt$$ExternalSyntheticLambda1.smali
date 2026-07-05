.class public final synthetic Lcom/stripe/android/link/ui/verification/VerificationDialogKt$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Landroidx/compose/ui/Modifier;

.field public final synthetic f$1:Lcom/stripe/android/link/model/LinkAccount;

.field public final synthetic f$2:Lcom/stripe/android/link/model/LinkAppearance;

.field public final synthetic f$3:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$4:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$5:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$6:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$7:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/model/LinkAppearance;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$$ExternalSyntheticLambda1;->f$0:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$$ExternalSyntheticLambda1;->f$1:Lcom/stripe/android/link/model/LinkAccount;

    iput-object p3, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$$ExternalSyntheticLambda1;->f$2:Lcom/stripe/android/link/model/LinkAppearance;

    iput-object p4, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$$ExternalSyntheticLambda1;->f$3:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$$ExternalSyntheticLambda1;->f$4:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$$ExternalSyntheticLambda1;->f$5:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$$ExternalSyntheticLambda1;->f$6:Lkotlin/jvm/functions/Function1;

    iput p8, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$$ExternalSyntheticLambda1;->f$7:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 0
    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$$ExternalSyntheticLambda1;->f$0:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$$ExternalSyntheticLambda1;->f$1:Lcom/stripe/android/link/model/LinkAccount;

    iget-object v2, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$$ExternalSyntheticLambda1;->f$2:Lcom/stripe/android/link/model/LinkAppearance;

    iget-object v3, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$$ExternalSyntheticLambda1;->f$3:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$$ExternalSyntheticLambda1;->f$4:Lkotlin/jvm/functions/Function0;

    iget-object v5, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$$ExternalSyntheticLambda1;->f$5:Lkotlin/jvm/functions/Function0;

    iget-object v6, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$$ExternalSyntheticLambda1;->f$6:Lkotlin/jvm/functions/Function1;

    iget v7, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$$ExternalSyntheticLambda1;->f$7:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/stripe/android/link/ui/verification/VerificationDialogKt;->$r8$lambda$2Ne_ApPRgpC6Al5-9FbI_j4mAUo(Landroidx/compose/ui/Modifier;Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/model/LinkAppearance;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
