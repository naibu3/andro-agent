.class public final Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Companion;
.super Ljava/lang/Object;
.source "NetworkingLinkVerificationViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNetworkingLinkVerificationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkingLinkVerificationViewModel.kt\ncom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Companion\n+ 2 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,199:1\n35#2:200\n77#2,2:201\n*S KotlinDebug\n*F\n+ 1 NetworkingLinkVerificationViewModel.kt\ncom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Companion\n*L\n174#1:200\n175#1:201,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u0014\u0010\u0008\u001a\u00020\tX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Companion;",
        "",
        "<init>",
        "()V",
        "factory",
        "Landroidx/lifecycle/ViewModelProvider$Factory;",
        "parentComponent",
        "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;",
        "PANE",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "getPANE$financial_connections_release",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
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
.method public static synthetic $r8$lambda$d7zz_0JvEphD2421y0aeXgzlOYE(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Companion;->factory$lambda$1$lambda$0(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;

    move-result-object p0

    return-object p0
.end method

.method private constructor <init>()V
    .locals 0

    .line 171
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Companion;-><init>()V

    return-void
.end method

.method private static final factory$lambda$1$lambda$0(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;
    .locals 2

    const-string v0, "$this$initializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    invoke-interface {p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;->getNetworkingLinkVerificationViewModelFactory()Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Factory;

    move-result-object p0

    .line 177
    new-instance p1, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p1, v0, v0, v1, v0}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 176
    invoke-interface {p0, p1}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Factory;->create(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;)Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final factory(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 2

    const-string v0, "parentComponent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    new-instance v0, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;

    invoke-direct {v0}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;-><init>()V

    .line 175
    new-instance v1, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Companion$$ExternalSyntheticLambda0;

    invoke-direct {v1, p1}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Companion$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;)V

    .line 201
    const-class p1, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;

    invoke-static {p1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object p1

    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;->addInitializer(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V

    .line 200
    invoke-virtual {v0}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;->build()Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object p1

    return-object p1
.end method

.method public final getPANE$financial_connections_release()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    .line 182
    invoke-static {}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->access$getPANE$cp()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v0

    return-object v0
.end method
