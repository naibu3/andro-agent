.class public interface abstract Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;
.super Ljava/lang/Object;
.source "CustomerSheetViewModelComponent.kt"


# annotations
.annotation runtime Ldagger/Component$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008g\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0019\u0010\u0006\u001a\u00020\u00002\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\'\u00a2\u0006\u0002\u0010\u0008J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u000cH\'J\u0008\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;",
        "",
        "application",
        "Landroid/app/Application;",
        "configuration",
        "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
        "statusBarColor",
        "",
        "(Ljava/lang/Integer;)Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;",
        "integrationType",
        "Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "build",
        "Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent;",
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
.method public abstract application(Landroid/app/Application;)Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract build()Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent;
.end method

.method public abstract configuration(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;)Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract integrationType(Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;)Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract savedStateHandle(Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract statusBarColor(Ljava/lang/Integer;)Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/inject/Named;
            value = "STATUS_BAR_COLOR"
        .end annotation
    .end param
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method
