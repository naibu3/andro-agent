.class public final synthetic Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/core/strings/ResolvableString;

.field public final synthetic f$1:J

.field public final synthetic f$2:Z

.field public final synthetic f$3:Z

.field public final synthetic f$4:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$5:Ljava/lang/String;

.field public final synthetic f$6:I


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/core/strings/ResolvableString;JZZLkotlin/jvm/functions/Function0;Ljava/lang/String;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/core/strings/ResolvableString;

    iput-wide p2, p0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$$ExternalSyntheticLambda0;->f$1:J

    iput-boolean p4, p0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$$ExternalSyntheticLambda0;->f$2:Z

    iput-boolean p5, p0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$$ExternalSyntheticLambda0;->f$3:Z

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$$ExternalSyntheticLambda0;->f$4:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$$ExternalSyntheticLambda0;->f$5:Ljava/lang/String;

    iput p8, p0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$$ExternalSyntheticLambda0;->f$6:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/core/strings/ResolvableString;

    iget-wide v1, p0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$$ExternalSyntheticLambda0;->f$1:J

    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$$ExternalSyntheticLambda0;->f$2:Z

    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$$ExternalSyntheticLambda0;->f$3:Z

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$$ExternalSyntheticLambda0;->f$4:Lkotlin/jvm/functions/Function0;

    iget-object v6, p0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$$ExternalSyntheticLambda0;->f$5:Ljava/lang/String;

    iget v7, p0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$$ExternalSyntheticLambda0;->f$6:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt;->$r8$lambda$wq83wMHEGj_MjFAEcon4R8njrW0(Lcom/stripe/android/core/strings/ResolvableString;JZZLkotlin/jvm/functions/Function0;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
