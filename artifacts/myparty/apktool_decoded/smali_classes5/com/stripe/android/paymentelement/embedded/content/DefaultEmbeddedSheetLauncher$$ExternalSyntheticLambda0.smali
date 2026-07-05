.class public final synthetic Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;

.field public final synthetic f$1:Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;

    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;

    check-cast p1, Lcom/stripe/android/paymentelement/embedded/form/FormResult;

    invoke-static {v0, v1, p1}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->$r8$lambda$pXIVVjTLZbbtaQI-SYu0MO8KROo(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;Lcom/stripe/android/paymentelement/embedded/form/FormResult;)V

    return-void
.end method
