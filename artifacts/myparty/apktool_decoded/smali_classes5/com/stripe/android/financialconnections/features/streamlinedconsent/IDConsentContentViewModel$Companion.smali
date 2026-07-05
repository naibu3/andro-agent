.class public final Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$Companion;
.super Ljava/lang/Object;
.source "IDConsentContentViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nIDConsentContentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IDConsentContentViewModel.kt\ncom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$Companion\n+ 2 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,124:1\n35#2:125\n77#2,2:126\n*S KotlinDebug\n*F\n+ 1 IDConsentContentViewModel.kt\ncom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$Companion\n*L\n110#1:125\n111#1:126,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$Companion;",
        "",
        "<init>",
        "()V",
        "PANE",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "factory",
        "Landroidx/lifecycle/ViewModelProvider$Factory;",
        "parentComponent",
        "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;",
        "financial-connections_release"
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
.method public static synthetic $r8$lambda$Jorpuuhzc9qf6gWLi0-cXYigSSE(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$Companion;->factory$lambda$1$lambda$0(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;

    move-result-object p0

    return-object p0
.end method

.method private constructor <init>()V
    .locals 0

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$Companion;-><init>()V

    return-void
.end method

.method private static final factory$lambda$1$lambda$0(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;
    .locals 6

    const-string v0, "$this$initializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    invoke-interface {p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;->getIdConsentContentViewModelFactory()Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$Factory;

    move-result-object p0

    new-instance v0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$Factory;->create(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;)Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final factory(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 2

    const-string v0, "parentComponent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    new-instance v0, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;

    invoke-direct {v0}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;-><init>()V

    .line 111
    new-instance v1, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$Companion$$ExternalSyntheticLambda0;

    invoke-direct {v1, p1}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$Companion$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;)V

    .line 126
    const-class p1, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;

    invoke-static {p1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object p1

    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;->addInitializer(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V

    .line 125
    invoke-virtual {v0}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;->build()Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object p1

    return-object p1
.end method
