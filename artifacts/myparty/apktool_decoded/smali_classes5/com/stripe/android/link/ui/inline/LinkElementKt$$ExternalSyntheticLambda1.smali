.class public final synthetic Lcom/stripe/android/link/ui/inline/LinkElementKt$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/link/ui/inline/UserInput;

.field public final synthetic f$1:Lcom/stripe/android/link/LinkConfigurationCoordinator;

.field public final synthetic f$2:Lcom/stripe/android/link/LinkConfiguration;

.field public final synthetic f$3:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

.field public final synthetic f$4:Z

.field public final synthetic f$5:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$6:Landroidx/compose/ui/Modifier;

.field public final synthetic f$7:I

.field public final synthetic f$8:I


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/link/ui/inline/UserInput;Lcom/stripe/android/link/LinkConfigurationCoordinator;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/ui/inline/LinkSignupMode;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/ui/inline/LinkElementKt$$ExternalSyntheticLambda1;->f$0:Lcom/stripe/android/link/ui/inline/UserInput;

    iput-object p2, p0, Lcom/stripe/android/link/ui/inline/LinkElementKt$$ExternalSyntheticLambda1;->f$1:Lcom/stripe/android/link/LinkConfigurationCoordinator;

    iput-object p3, p0, Lcom/stripe/android/link/ui/inline/LinkElementKt$$ExternalSyntheticLambda1;->f$2:Lcom/stripe/android/link/LinkConfiguration;

    iput-object p4, p0, Lcom/stripe/android/link/ui/inline/LinkElementKt$$ExternalSyntheticLambda1;->f$3:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    iput-boolean p5, p0, Lcom/stripe/android/link/ui/inline/LinkElementKt$$ExternalSyntheticLambda1;->f$4:Z

    iput-object p6, p0, Lcom/stripe/android/link/ui/inline/LinkElementKt$$ExternalSyntheticLambda1;->f$5:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lcom/stripe/android/link/ui/inline/LinkElementKt$$ExternalSyntheticLambda1;->f$6:Landroidx/compose/ui/Modifier;

    iput p8, p0, Lcom/stripe/android/link/ui/inline/LinkElementKt$$ExternalSyntheticLambda1;->f$7:I

    iput p9, p0, Lcom/stripe/android/link/ui/inline/LinkElementKt$$ExternalSyntheticLambda1;->f$8:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 0
    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/LinkElementKt$$ExternalSyntheticLambda1;->f$0:Lcom/stripe/android/link/ui/inline/UserInput;

    iget-object v1, p0, Lcom/stripe/android/link/ui/inline/LinkElementKt$$ExternalSyntheticLambda1;->f$1:Lcom/stripe/android/link/LinkConfigurationCoordinator;

    iget-object v2, p0, Lcom/stripe/android/link/ui/inline/LinkElementKt$$ExternalSyntheticLambda1;->f$2:Lcom/stripe/android/link/LinkConfiguration;

    iget-object v3, p0, Lcom/stripe/android/link/ui/inline/LinkElementKt$$ExternalSyntheticLambda1;->f$3:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    iget-boolean v4, p0, Lcom/stripe/android/link/ui/inline/LinkElementKt$$ExternalSyntheticLambda1;->f$4:Z

    iget-object v5, p0, Lcom/stripe/android/link/ui/inline/LinkElementKt$$ExternalSyntheticLambda1;->f$5:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lcom/stripe/android/link/ui/inline/LinkElementKt$$ExternalSyntheticLambda1;->f$6:Landroidx/compose/ui/Modifier;

    iget v7, p0, Lcom/stripe/android/link/ui/inline/LinkElementKt$$ExternalSyntheticLambda1;->f$7:I

    iget v8, p0, Lcom/stripe/android/link/ui/inline/LinkElementKt$$ExternalSyntheticLambda1;->f$8:I

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, Lcom/stripe/android/link/ui/inline/LinkElementKt;->$r8$lambda$ihJSv62BMsW6DlgkWJ_y2sVO_D8(Lcom/stripe/android/link/ui/inline/UserInput;Lcom/stripe/android/link/LinkConfigurationCoordinator;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/ui/inline/LinkSignupMode;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
