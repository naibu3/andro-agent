.class public final Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$Companion;
.super Ljava/lang/Object;
.source "NoticeSheetViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNoticeSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoticeSheetViewModel.kt\ncom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$Companion\n+ 2 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,167:1\n35#2:168\n77#2,2:169\n*S KotlinDebug\n*F\n+ 1 NoticeSheetViewModel.kt\ncom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$Companion\n*L\n103#1:168\n104#1:169,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$Companion;",
        "",
        "<init>",
        "()V",
        "factory",
        "Landroidx/lifecycle/ViewModelProvider$Factory;",
        "parentComponent",
        "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;",
        "arguments",
        "Landroid/os/Bundle;",
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
.method public static synthetic $r8$lambda$mmrepnr59VFvgcsnjvqkOIwXddA(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Landroid/os/Bundle;Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$Companion;->factory$lambda$1$lambda$0(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Landroid/os/Bundle;Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;

    move-result-object p0

    return-object p0
.end method

.method private constructor <init>()V
    .locals 0

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$Companion;-><init>()V

    return-void
.end method

.method private static final factory$lambda$1$lambda$0(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Landroid/os/Bundle;Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;
    .locals 1

    const-string v0, "$this$initializer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    invoke-interface {p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;->getNoticeSheetViewModelFactory()Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$Factory;

    move-result-object p0

    new-instance p2, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;

    invoke-direct {p2, p1}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;-><init>(Landroid/os/Bundle;)V

    invoke-interface {p0, p2}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$Factory;->create(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final factory(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Landroid/os/Bundle;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 2

    const-string v0, "parentComponent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    new-instance v0, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;

    invoke-direct {v0}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;-><init>()V

    .line 104
    new-instance v1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$Companion$$ExternalSyntheticLambda0;

    invoke-direct {v1, p1, p2}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$Companion$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Landroid/os/Bundle;)V

    .line 169
    const-class p1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;

    invoke-static {p1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object p1

    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;->addInitializer(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V

    .line 168
    invoke-virtual {v0}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;->build()Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object p1

    return-object p1
.end method
