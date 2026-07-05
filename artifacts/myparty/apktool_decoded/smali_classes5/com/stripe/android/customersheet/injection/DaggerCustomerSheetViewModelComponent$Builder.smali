.class final Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;
.super Ljava/lang/Object;
.source "DaggerCustomerSheetViewModelComponent.java"

# interfaces
.implements Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Builder"
.end annotation


# instance fields
.field private application:Landroid/app/Application;

.field private configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

.field private integrationType:Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;

.field private savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

.field private statusBarColor:Ljava/lang/Integer;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent-IA;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic application(Landroid/app/Application;)Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;
    .locals 0

    .line 78
    invoke-virtual {p0, p1}, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;->application(Landroid/app/Application;)Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public application(Landroid/app/Application;)Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;
    .locals 0

    .line 91
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;->application:Landroid/app/Application;

    return-object p0
.end method

.method public build()Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent;
    .locals 10

    .line 121
    iget-object v0, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;->application:Landroid/app/Application;

    const-class v1, Landroid/app/Application;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 122
    iget-object v0, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    const-class v1, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 123
    iget-object v0, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;->integrationType:Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;

    const-class v1, Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 124
    iget-object v0, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-class v1, Landroidx/lifecycle/SavedStateHandle;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 125
    new-instance v2, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;

    new-instance v3, Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule;

    invoke-direct {v3}, Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule;-><init>()V

    iget-object v4, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;->application:Landroid/app/Application;

    iget-object v5, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    iget-object v6, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;->statusBarColor:Ljava/lang/Integer;

    iget-object v7, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;->integrationType:Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;

    iget-object v8, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v9}, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;-><init>(Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule;Landroid/app/Application;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Ljava/lang/Integer;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent-IA;)V

    return-object v2
.end method

.method public bridge synthetic configuration(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;)Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;
    .locals 0

    .line 78
    invoke-virtual {p0, p1}, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;->configuration(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;)Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public configuration(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;)Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;
    .locals 0

    .line 97
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    return-object p0
.end method

.method public bridge synthetic integrationType(Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;)Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;
    .locals 0

    .line 78
    invoke-virtual {p0, p1}, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;->integrationType(Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;)Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public integrationType(Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;)Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;
    .locals 0

    .line 109
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;->integrationType:Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;

    return-object p0
.end method

.method public bridge synthetic savedStateHandle(Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;
    .locals 0

    .line 78
    invoke-virtual {p0, p1}, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;->savedStateHandle(Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public savedStateHandle(Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;
    .locals 0

    .line 115
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/SavedStateHandle;

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    return-object p0
.end method

.method public bridge synthetic statusBarColor(Ljava/lang/Integer;)Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;
    .locals 0

    .line 78
    invoke-virtual {p0, p1}, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;->statusBarColor(Ljava/lang/Integer;)Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public statusBarColor(Ljava/lang/Integer;)Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;->statusBarColor:Ljava/lang/Integer;

    return-object p0
.end method
