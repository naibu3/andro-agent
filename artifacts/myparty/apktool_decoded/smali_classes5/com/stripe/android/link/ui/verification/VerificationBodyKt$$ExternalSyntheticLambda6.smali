.class public final synthetic Lcom/stripe/android/link/ui/verification/VerificationBodyKt$$ExternalSyntheticLambda6;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/link/ui/verification/VerificationViewState;

.field public final synthetic f$1:Landroidx/compose/ui/focus/FocusManager;

.field public final synthetic f$2:Landroidx/compose/ui/platform/SoftwareKeyboardController;

.field public final synthetic f$3:Landroidx/compose/ui/focus/FocusRequester;

.field public final synthetic f$4:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$5:Landroid/content/Context;

.field public final synthetic f$6:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$7:I


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/link/ui/verification/VerificationViewState;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;Landroidx/compose/ui/focus/FocusRequester;Lkotlin/jvm/functions/Function0;Landroid/content/Context;Lkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/ui/verification/VerificationBodyKt$$ExternalSyntheticLambda6;->f$0:Lcom/stripe/android/link/ui/verification/VerificationViewState;

    iput-object p2, p0, Lcom/stripe/android/link/ui/verification/VerificationBodyKt$$ExternalSyntheticLambda6;->f$1:Landroidx/compose/ui/focus/FocusManager;

    iput-object p3, p0, Lcom/stripe/android/link/ui/verification/VerificationBodyKt$$ExternalSyntheticLambda6;->f$2:Landroidx/compose/ui/platform/SoftwareKeyboardController;

    iput-object p4, p0, Lcom/stripe/android/link/ui/verification/VerificationBodyKt$$ExternalSyntheticLambda6;->f$3:Landroidx/compose/ui/focus/FocusRequester;

    iput-object p5, p0, Lcom/stripe/android/link/ui/verification/VerificationBodyKt$$ExternalSyntheticLambda6;->f$4:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lcom/stripe/android/link/ui/verification/VerificationBodyKt$$ExternalSyntheticLambda6;->f$5:Landroid/content/Context;

    iput-object p7, p0, Lcom/stripe/android/link/ui/verification/VerificationBodyKt$$ExternalSyntheticLambda6;->f$6:Lkotlin/jvm/functions/Function0;

    iput p8, p0, Lcom/stripe/android/link/ui/verification/VerificationBodyKt$$ExternalSyntheticLambda6;->f$7:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 0
    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationBodyKt$$ExternalSyntheticLambda6;->f$0:Lcom/stripe/android/link/ui/verification/VerificationViewState;

    iget-object v1, p0, Lcom/stripe/android/link/ui/verification/VerificationBodyKt$$ExternalSyntheticLambda6;->f$1:Landroidx/compose/ui/focus/FocusManager;

    iget-object v2, p0, Lcom/stripe/android/link/ui/verification/VerificationBodyKt$$ExternalSyntheticLambda6;->f$2:Landroidx/compose/ui/platform/SoftwareKeyboardController;

    iget-object v3, p0, Lcom/stripe/android/link/ui/verification/VerificationBodyKt$$ExternalSyntheticLambda6;->f$3:Landroidx/compose/ui/focus/FocusRequester;

    iget-object v4, p0, Lcom/stripe/android/link/ui/verification/VerificationBodyKt$$ExternalSyntheticLambda6;->f$4:Lkotlin/jvm/functions/Function0;

    iget-object v5, p0, Lcom/stripe/android/link/ui/verification/VerificationBodyKt$$ExternalSyntheticLambda6;->f$5:Landroid/content/Context;

    iget-object v6, p0, Lcom/stripe/android/link/ui/verification/VerificationBodyKt$$ExternalSyntheticLambda6;->f$6:Lkotlin/jvm/functions/Function0;

    iget v7, p0, Lcom/stripe/android/link/ui/verification/VerificationBodyKt$$ExternalSyntheticLambda6;->f$7:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/stripe/android/link/ui/verification/VerificationBodyKt;->$r8$lambda$uoPUrPI1kvg50cPnPovu_lSGs_M(Lcom/stripe/android/link/ui/verification/VerificationViewState;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;Landroidx/compose/ui/focus/FocusRequester;Lkotlin/jvm/functions/Function0;Landroid/content/Context;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
