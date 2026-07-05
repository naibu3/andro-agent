.class public final Lcom/stripe/android/link/LinkController$Presenter;
.super Ljava/lang/Object;
.source "LinkController.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/LinkController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Presenter"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0008\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\tJ\u0012\u0010\u0011\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0007J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0008\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkController$Presenter;",
        "",
        "coordinator",
        "Lcom/stripe/android/link/LinkControllerCoordinator;",
        "interactor",
        "Lcom/stripe/android/link/LinkControllerInteractor;",
        "<init>",
        "(Lcom/stripe/android/link/LinkControllerCoordinator;Lcom/stripe/android/link/LinkControllerInteractor;)V",
        "paymentSelectionHint",
        "",
        "getPaymentSelectionHint",
        "()Ljava/lang/String;",
        "setPaymentSelectionHint",
        "(Ljava/lang/String;)V",
        "presentPaymentMethods",
        "",
        "email",
        "authenticate",
        "authenticateExistingConsumer",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final coordinator:Lcom/stripe/android/link/LinkControllerCoordinator;

.field private final interactor:Lcom/stripe/android/link/LinkControllerInteractor;

.field private paymentSelectionHint:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/LinkControllerCoordinator;Lcom/stripe/android/link/LinkControllerInteractor;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "coordinator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interactor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 261
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 262
    iput-object p1, p0, Lcom/stripe/android/link/LinkController$Presenter;->coordinator:Lcom/stripe/android/link/LinkControllerCoordinator;

    .line 263
    iput-object p2, p0, Lcom/stripe/android/link/LinkController$Presenter;->interactor:Lcom/stripe/android/link/LinkControllerInteractor;

    return-void
.end method


# virtual methods
.method public final authenticate(Ljava/lang/String;)V
    .locals 2

    .line 307
    iget-object v0, p0, Lcom/stripe/android/link/LinkController$Presenter;->interactor:Lcom/stripe/android/link/LinkControllerInteractor;

    .line 308
    iget-object v1, p0, Lcom/stripe/android/link/LinkController$Presenter;->coordinator:Lcom/stripe/android/link/LinkControllerCoordinator;

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkControllerCoordinator;->getLinkActivityResultLauncher()Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v1

    .line 307
    invoke-virtual {v0, v1, p1}, Lcom/stripe/android/link/LinkControllerInteractor;->authenticate(Landroidx/activity/result/ActivityResultLauncher;Ljava/lang/String;)V

    return-void
.end method

.method public final authenticateExistingConsumer(Ljava/lang/String;)V
    .locals 2

    const-string v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 332
    iget-object v0, p0, Lcom/stripe/android/link/LinkController$Presenter;->interactor:Lcom/stripe/android/link/LinkControllerInteractor;

    .line 333
    iget-object v1, p0, Lcom/stripe/android/link/LinkController$Presenter;->coordinator:Lcom/stripe/android/link/LinkControllerCoordinator;

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkControllerCoordinator;->getLinkActivityResultLauncher()Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v1

    .line 332
    invoke-virtual {v0, v1, p1}, Lcom/stripe/android/link/LinkControllerInteractor;->authenticateExistingConsumer(Landroidx/activity/result/ActivityResultLauncher;Ljava/lang/String;)V

    return-void
.end method

.method public final getPaymentSelectionHint()Ljava/lang/String;
    .locals 1

    .line 265
    iget-object v0, p0, Lcom/stripe/android/link/LinkController$Presenter;->paymentSelectionHint:Ljava/lang/String;

    return-object v0
.end method

.method public final presentPaymentMethods(Ljava/lang/String;)V
    .locals 3

    .line 282
    iget-object v0, p0, Lcom/stripe/android/link/LinkController$Presenter;->interactor:Lcom/stripe/android/link/LinkControllerInteractor;

    .line 283
    iget-object v1, p0, Lcom/stripe/android/link/LinkController$Presenter;->coordinator:Lcom/stripe/android/link/LinkControllerCoordinator;

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkControllerCoordinator;->getLinkActivityResultLauncher()Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v1

    .line 285
    iget-object v2, p0, Lcom/stripe/android/link/LinkController$Presenter;->paymentSelectionHint:Ljava/lang/String;

    .line 282
    invoke-virtual {v0, v1, p1, v2}, Lcom/stripe/android/link/LinkControllerInteractor;->presentPaymentMethods(Landroidx/activity/result/ActivityResultLauncher;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final setPaymentSelectionHint(Ljava/lang/String;)V
    .locals 0

    .line 265
    iput-object p1, p0, Lcom/stripe/android/link/LinkController$Presenter;->paymentSelectionHint:Ljava/lang/String;

    return-void
.end method
