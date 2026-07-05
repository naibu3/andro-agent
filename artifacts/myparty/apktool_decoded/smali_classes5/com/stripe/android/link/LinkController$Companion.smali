.class public final Lcom/stripe/android/link/LinkController$Companion;
.super Ljava/lang/Object;
.source "LinkController.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/LinkController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0087\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkController$Companion;",
        "",
        "<init>",
        "()V",
        "create",
        "Lcom/stripe/android/link/LinkController;",
        "application",
        "Landroid/app/Application;",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 553
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/link/LinkController$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Landroid/app/Application;Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/link/LinkController;
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 561
    invoke-static {}, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent;->factory()Lcom/stripe/android/link/injection/LinkControllerComponent$Factory;

    move-result-object v0

    .line 565
    const-string v1, "LinkController"

    .line 562
    invoke-interface {v0, p1, p2, v1}, Lcom/stripe/android/link/injection/LinkControllerComponent$Factory;->build(Landroid/app/Application;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)Lcom/stripe/android/link/injection/LinkControllerComponent;

    move-result-object p1

    .line 567
    invoke-interface {p1}, Lcom/stripe/android/link/injection/LinkControllerComponent;->getLinkController()Lcom/stripe/android/link/LinkController;

    move-result-object p1

    return-object p1
.end method
