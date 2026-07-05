.class public final Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Companion;
.super Ljava/lang/Object;
.source "ConsentViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nConsentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsentViewModel.kt\ncom/stripe/android/financialconnections/features/consent/ConsentViewModel$Companion\n+ 2 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,237:1\n35#2:238\n77#2,2:239\n*S KotlinDebug\n*F\n+ 1 ConsentViewModel.kt\ncom/stripe/android/financialconnections/features/consent/ConsentViewModel$Companion\n*L\n224#1:238\n225#1:239,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Companion;",
        "",
        "<init>",
        "()V",
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
.method public static synthetic $r8$lambda$IuJ9kUdXTFX9alxcgAXXDcRAOHE(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Companion;->factory$lambda$1$lambda$0(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;

    move-result-object p0

    return-object p0
.end method

.method private constructor <init>()V
    .locals 0

    .line 221
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Companion;-><init>()V

    return-void
.end method

.method private static final factory$lambda$1$lambda$0(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;
    .locals 7

    const-string v0, "$this$initializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    invoke-interface {p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;->getConsentViewModelFactory()Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Factory;

    move-result-object p0

    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/features/consent/ConsentState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Ljava/util/List;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Factory;->create(Lcom/stripe/android/financialconnections/features/consent/ConsentState;)Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final factory(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 2

    const-string v0, "parentComponent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 238
    new-instance v0, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;

    invoke-direct {v0}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;-><init>()V

    .line 225
    new-instance v1, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Companion$$ExternalSyntheticLambda0;

    invoke-direct {v1, p1}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Companion$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;)V

    .line 239
    const-class p1, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;

    invoke-static {p1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object p1

    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;->addInitializer(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V

    .line 238
    invoke-virtual {v0}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;->build()Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object p1

    return-object p1
.end method
