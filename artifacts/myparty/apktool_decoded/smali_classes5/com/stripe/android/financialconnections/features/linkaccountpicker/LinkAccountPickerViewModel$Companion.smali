.class public final Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Companion;
.super Ljava/lang/Object;
.source "LinkAccountPickerViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLinkAccountPickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkAccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Companion\n+ 2 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,538:1\n35#2:539\n77#2,2:540\n*S KotlinDebug\n*F\n+ 1 LinkAccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Companion\n*L\n445#1:539\n446#1:540,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Companion;",
        "",
        "<init>",
        "()V",
        "PANE",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "getPANE$financial_connections_release",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
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
.method public static synthetic $r8$lambda$3mJkBWmo7CRe8wcrn4SYnEpbdZQ(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Companion;->factory$lambda$1$lambda$0(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;

    move-result-object p0

    return-object p0
.end method

.method private constructor <init>()V
    .locals 0

    .line 440
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Companion;-><init>()V

    return-void
.end method

.method private static final factory$lambda$1$lambda$0(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;
    .locals 6

    const-string v0, "$this$initializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 447
    invoke-interface {p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;->getLinkAccountPickerViewModelFactory()Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Factory;

    move-result-object p0

    new-instance v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Factory;->create(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;)Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final factory(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 2

    const-string v0, "parentComponent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 539
    new-instance v0, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;

    invoke-direct {v0}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;-><init>()V

    .line 446
    new-instance v1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Companion$$ExternalSyntheticLambda0;

    invoke-direct {v1, p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Companion$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;)V

    .line 540
    const-class p1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;

    invoke-static {p1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object p1

    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;->addInitializer(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V

    .line 539
    invoke-virtual {v0}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;->build()Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object p1

    return-object p1
.end method

.method public final getPANE$financial_connections_release()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    .line 442
    invoke-static {}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->access$getPANE$cp()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v0

    return-object v0
.end method
