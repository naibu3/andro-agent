.class public final synthetic Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda15;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/link/LinkControllerInteractor;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Lkotlin/jvm/functions/Function2;

.field public final synthetic f$3:Landroidx/activity/result/ActivityResultLauncher;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/link/LinkControllerInteractor;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/activity/result/ActivityResultLauncher;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda15;->f$0:Lcom/stripe/android/link/LinkControllerInteractor;

    iput-object p2, p0, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda15;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda15;->f$2:Lkotlin/jvm/functions/Function2;

    iput-object p4, p0, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda15;->f$3:Landroidx/activity/result/ActivityResultLauncher;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 0
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda15;->f$0:Lcom/stripe/android/link/LinkControllerInteractor;

    iget-object v1, p0, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda15;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda15;->f$2:Lkotlin/jvm/functions/Function2;

    iget-object v3, p0, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda15;->f$3:Landroidx/activity/result/ActivityResultLauncher;

    check-cast p1, Lcom/stripe/android/link/LinkConfiguration;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/stripe/android/link/LinkControllerInteractor;->$r8$lambda$FkQATjN1bZhLOXBPIeBKe1KGJtA(Lcom/stripe/android/link/LinkControllerInteractor;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/activity/result/ActivityResultLauncher;Lcom/stripe/android/link/LinkConfiguration;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
