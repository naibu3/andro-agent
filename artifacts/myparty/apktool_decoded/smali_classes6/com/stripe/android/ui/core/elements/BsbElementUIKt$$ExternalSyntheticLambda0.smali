.class public final synthetic Lcom/stripe/android/ui/core/elements/BsbElementUIKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Lcom/stripe/android/ui/core/elements/BsbElement;

.field public final synthetic f$2:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field public final synthetic f$3:Landroidx/compose/ui/Modifier;

.field public final synthetic f$4:I

.field public final synthetic f$5:I


# direct methods
.method public synthetic constructor <init>(ZLcom/stripe/android/ui/core/elements/BsbElement;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$$ExternalSyntheticLambda0;->f$0:Z

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/ui/core/elements/BsbElement;

    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$$ExternalSyntheticLambda0;->f$2:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iput-object p4, p0, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$$ExternalSyntheticLambda0;->f$3:Landroidx/compose/ui/Modifier;

    iput p5, p0, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$$ExternalSyntheticLambda0;->f$4:I

    iput p6, p0, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$$ExternalSyntheticLambda0;->f$5:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$$ExternalSyntheticLambda0;->f$0:Z

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/ui/core/elements/BsbElement;

    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$$ExternalSyntheticLambda0;->f$2:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iget-object v3, p0, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$$ExternalSyntheticLambda0;->f$3:Landroidx/compose/ui/Modifier;

    iget v4, p0, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$$ExternalSyntheticLambda0;->f$4:I

    iget v5, p0, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$$ExternalSyntheticLambda0;->f$5:I

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/stripe/android/ui/core/elements/BsbElementUIKt;->$r8$lambda$lv8R3dM8h-YeA__UsRKfvta8ZBw(ZLcom/stripe/android/ui/core/elements/BsbElement;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
