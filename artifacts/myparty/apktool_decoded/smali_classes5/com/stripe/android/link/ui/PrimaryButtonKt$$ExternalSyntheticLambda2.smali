.class public final synthetic Lcom/stripe/android/link/ui/PrimaryButtonKt$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Landroidx/compose/ui/Modifier;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Lcom/stripe/android/link/ui/PrimaryButtonState;

.field public final synthetic f$3:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$4:Ljava/lang/Integer;

.field public final synthetic f$5:Ljava/lang/Integer;

.field public final synthetic f$6:I

.field public final synthetic f$7:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/stripe/android/link/ui/PrimaryButtonState;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;Ljava/lang/Integer;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$$ExternalSyntheticLambda2;->f$0:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$$ExternalSyntheticLambda2;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$$ExternalSyntheticLambda2;->f$2:Lcom/stripe/android/link/ui/PrimaryButtonState;

    iput-object p4, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$$ExternalSyntheticLambda2;->f$3:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$$ExternalSyntheticLambda2;->f$4:Ljava/lang/Integer;

    iput-object p6, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$$ExternalSyntheticLambda2;->f$5:Ljava/lang/Integer;

    iput p7, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$$ExternalSyntheticLambda2;->f$6:I

    iput p8, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$$ExternalSyntheticLambda2;->f$7:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 0
    iget-object v0, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$$ExternalSyntheticLambda2;->f$0:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$$ExternalSyntheticLambda2;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$$ExternalSyntheticLambda2;->f$2:Lcom/stripe/android/link/ui/PrimaryButtonState;

    iget-object v3, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$$ExternalSyntheticLambda2;->f$3:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$$ExternalSyntheticLambda2;->f$4:Ljava/lang/Integer;

    iget-object v5, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$$ExternalSyntheticLambda2;->f$5:Ljava/lang/Integer;

    iget v6, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$$ExternalSyntheticLambda2;->f$6:I

    iget v7, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$$ExternalSyntheticLambda2;->f$7:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/stripe/android/link/ui/PrimaryButtonKt;->$r8$lambda$qfSMa0MKKbVD2hRffCSRbuix0EU(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/stripe/android/link/ui/PrimaryButtonState;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;Ljava/lang/Integer;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
