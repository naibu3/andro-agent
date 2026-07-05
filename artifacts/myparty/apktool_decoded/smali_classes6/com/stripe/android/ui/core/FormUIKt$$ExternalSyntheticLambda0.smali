.class public final synthetic Lcom/stripe/android/ui/core/FormUIKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/uicore/elements/FormElement;

.field public final synthetic f$1:I

.field public final synthetic f$2:I

.field public final synthetic f$3:Z

.field public final synthetic f$4:Z

.field public final synthetic f$5:Ljava/util/Set;

.field public final synthetic f$6:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field public final synthetic f$7:I


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/uicore/elements/FormElement;IIZZLjava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/ui/core/FormUIKt$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/uicore/elements/FormElement;

    iput p2, p0, Lcom/stripe/android/ui/core/FormUIKt$$ExternalSyntheticLambda0;->f$1:I

    iput p3, p0, Lcom/stripe/android/ui/core/FormUIKt$$ExternalSyntheticLambda0;->f$2:I

    iput-boolean p4, p0, Lcom/stripe/android/ui/core/FormUIKt$$ExternalSyntheticLambda0;->f$3:Z

    iput-boolean p5, p0, Lcom/stripe/android/ui/core/FormUIKt$$ExternalSyntheticLambda0;->f$4:Z

    iput-object p6, p0, Lcom/stripe/android/ui/core/FormUIKt$$ExternalSyntheticLambda0;->f$5:Ljava/util/Set;

    iput-object p7, p0, Lcom/stripe/android/ui/core/FormUIKt$$ExternalSyntheticLambda0;->f$6:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iput p8, p0, Lcom/stripe/android/ui/core/FormUIKt$$ExternalSyntheticLambda0;->f$7:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 0
    iget-object v0, p0, Lcom/stripe/android/ui/core/FormUIKt$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/uicore/elements/FormElement;

    iget v1, p0, Lcom/stripe/android/ui/core/FormUIKt$$ExternalSyntheticLambda0;->f$1:I

    iget v2, p0, Lcom/stripe/android/ui/core/FormUIKt$$ExternalSyntheticLambda0;->f$2:I

    iget-boolean v3, p0, Lcom/stripe/android/ui/core/FormUIKt$$ExternalSyntheticLambda0;->f$3:Z

    iget-boolean v4, p0, Lcom/stripe/android/ui/core/FormUIKt$$ExternalSyntheticLambda0;->f$4:Z

    iget-object v5, p0, Lcom/stripe/android/ui/core/FormUIKt$$ExternalSyntheticLambda0;->f$5:Ljava/util/Set;

    iget-object v6, p0, Lcom/stripe/android/ui/core/FormUIKt$$ExternalSyntheticLambda0;->f$6:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iget v7, p0, Lcom/stripe/android/ui/core/FormUIKt$$ExternalSyntheticLambda0;->f$7:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/stripe/android/ui/core/FormUIKt;->$r8$lambda$ds6VSJcgO--OUAZMqOQz9bwP3Ts(Lcom/stripe/android/uicore/elements/FormElement;IIZZLjava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
