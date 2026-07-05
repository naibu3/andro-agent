.class public interface abstract Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent;
.super Ljava/lang/Object;
.source "CustomerSheetViewModelComponent.kt"


# annotations
.annotation runtime Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelScope;
.end annotation

.annotation runtime Ldagger/Component;
    modules = {
        Lcom/stripe/android/paymentelement/confirmation/injection/DefaultConfirmationModule;,
        Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule;,
        Lcom/stripe/android/payments/core/injection/StripeRepositoryModule;,
        Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008a\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent;",
        "",
        "viewModel",
        "Lcom/stripe/android/customersheet/CustomerSheetViewModel;",
        "getViewModel",
        "()Lcom/stripe/android/customersheet/CustomerSheetViewModel;",
        "Builder",
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


# virtual methods
.method public abstract getViewModel()Lcom/stripe/android/customersheet/CustomerSheetViewModel;
.end method
