.class public final synthetic Lcom/stripe/android/financialconnections/features/common/LoadingContentKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Z


# direct methods
.method public synthetic constructor <init>(ZZ)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt$$ExternalSyntheticLambda0;->f$0:Z

    iput-boolean p2, p0, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt$$ExternalSyntheticLambda0;->f$1:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 0
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt$$ExternalSyntheticLambda0;->f$0:Z

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt$$ExternalSyntheticLambda0;->f$1:Z

    invoke-static {v0, v1}, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt;->$r8$lambda$8O0NUpNUd8wIrH1SSC7Pqd1-fhI(ZZ)Landroidx/compose/runtime/MutableState;

    move-result-object v0

    return-object v0
.end method
