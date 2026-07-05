.class public final synthetic Lcom/stripe/android/financialconnections/features/common/VerificationSectionKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Landroidx/compose/ui/focus/FocusRequester;

.field public final synthetic f$1:Lcom/stripe/android/uicore/elements/OTPElement;

.field public final synthetic f$2:Z

.field public final synthetic f$3:Ljava/lang/Throwable;

.field public final synthetic f$4:Landroidx/compose/ui/Modifier;

.field public final synthetic f$5:I

.field public final synthetic f$6:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/focus/FocusRequester;Lcom/stripe/android/uicore/elements/OTPElement;ZLjava/lang/Throwable;Landroidx/compose/ui/Modifier;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/common/VerificationSectionKt$$ExternalSyntheticLambda0;->f$0:Landroidx/compose/ui/focus/FocusRequester;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/common/VerificationSectionKt$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/uicore/elements/OTPElement;

    iput-boolean p3, p0, Lcom/stripe/android/financialconnections/features/common/VerificationSectionKt$$ExternalSyntheticLambda0;->f$2:Z

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/common/VerificationSectionKt$$ExternalSyntheticLambda0;->f$3:Ljava/lang/Throwable;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/common/VerificationSectionKt$$ExternalSyntheticLambda0;->f$4:Landroidx/compose/ui/Modifier;

    iput p6, p0, Lcom/stripe/android/financialconnections/features/common/VerificationSectionKt$$ExternalSyntheticLambda0;->f$5:I

    iput p7, p0, Lcom/stripe/android/financialconnections/features/common/VerificationSectionKt$$ExternalSyntheticLambda0;->f$6:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/common/VerificationSectionKt$$ExternalSyntheticLambda0;->f$0:Landroidx/compose/ui/focus/FocusRequester;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/common/VerificationSectionKt$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/uicore/elements/OTPElement;

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/features/common/VerificationSectionKt$$ExternalSyntheticLambda0;->f$2:Z

    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/common/VerificationSectionKt$$ExternalSyntheticLambda0;->f$3:Ljava/lang/Throwable;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/features/common/VerificationSectionKt$$ExternalSyntheticLambda0;->f$4:Landroidx/compose/ui/Modifier;

    iget v5, p0, Lcom/stripe/android/financialconnections/features/common/VerificationSectionKt$$ExternalSyntheticLambda0;->f$5:I

    iget v6, p0, Lcom/stripe/android/financialconnections/features/common/VerificationSectionKt$$ExternalSyntheticLambda0;->f$6:I

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lcom/stripe/android/financialconnections/features/common/VerificationSectionKt;->$r8$lambda$KbIbFfiGaEbFtH54irUEfPDzm3k(Landroidx/compose/ui/focus/FocusRequester;Lcom/stripe/android/uicore/elements/OTPElement;ZLjava/lang/Throwable;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
