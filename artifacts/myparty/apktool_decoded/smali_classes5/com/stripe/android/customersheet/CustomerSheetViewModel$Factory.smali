.class public final Lcom/stripe/android/customersheet/CustomerSheetViewModel$Factory;
.super Ljava/lang/Object;
.source "CustomerSheetViewModel.kt"

# interfaces
.implements Landroidx/lifecycle/ViewModelProvider$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/CustomerSheetViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J-\u0010\u0006\u001a\u0002H\u0007\"\u0008\u0008\u0000\u0010\u0007*\u00020\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u0002H\u00070\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerSheetViewModel$Factory;",
        "Landroidx/lifecycle/ViewModelProvider$Factory;",
        "args",
        "Lcom/stripe/android/customersheet/CustomerSheetContract$Args;",
        "<init>",
        "(Lcom/stripe/android/customersheet/CustomerSheetContract$Args;)V",
        "create",
        "T",
        "Landroidx/lifecycle/ViewModel;",
        "modelClass",
        "Ljava/lang/Class;",
        "extras",
        "Landroidx/lifecycle/viewmodel/CreationExtras;",
        "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;",
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
.field private final args:Lcom/stripe/android/customersheet/CustomerSheetContract$Args;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/customersheet/CustomerSheetContract$Args;)V
    .locals 1

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1325
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1326
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$Factory;->args:Lcom/stripe/android/customersheet/CustomerSheetContract$Args;

    return-void
.end method


# virtual methods
.method public create(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/ViewModel;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Landroidx/lifecycle/viewmodel/CreationExtras;",
            ")TT;"
        }
    .end annotation

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "extras"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1331
    invoke-static {}, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent;->builder()Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;

    move-result-object p1

    .line 1332
    invoke-static {p2}, Lcom/stripe/android/core/utils/CreationExtrasKtxKt;->requireApplication(Landroidx/lifecycle/viewmodel/CreationExtras;)Landroid/app/Application;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;->application(Landroid/app/Application;)Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;

    move-result-object p1

    .line 1333
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$Factory;->args:Lcom/stripe/android/customersheet/CustomerSheetContract$Args;

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->getConfiguration()Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;->configuration(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;)Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;

    move-result-object p1

    .line 1334
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$Factory;->args:Lcom/stripe/android/customersheet/CustomerSheetContract$Args;

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->getIntegrationType()Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;->integrationType(Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;)Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;

    move-result-object p1

    .line 1335
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$Factory;->args:Lcom/stripe/android/customersheet/CustomerSheetContract$Args;

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->getStatusBarColor()Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;->statusBarColor(Ljava/lang/Integer;)Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;

    move-result-object p1

    .line 1336
    invoke-static {p2}, Landroidx/lifecycle/SavedStateHandleSupport;->createSavedStateHandle(Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/SavedStateHandle;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;->savedStateHandle(Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;

    move-result-object p1

    .line 1337
    invoke-interface {p1}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;->build()Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent;

    move-result-object p1

    .line 1339
    invoke-interface {p1}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent;->getViewModel()Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type T of com.stripe.android.customersheet.CustomerSheetViewModel.Factory.create"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/lifecycle/ViewModel;

    return-object p1
.end method
