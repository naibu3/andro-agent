.class public final Lcom/stripe/android/link/LinkActivityViewModel$Companion;
.super Ljava/lang/Object;
.source "LinkActivityViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/LinkActivityViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLinkActivityViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkActivityViewModel.kt\ncom/stripe/android/link/LinkActivityViewModel$Companion\n+ 2 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,419:1\n35#2:420\n77#2,2:421\n*S KotlinDebug\n*F\n+ 1 LinkActivityViewModel.kt\ncom/stripe/android/link/LinkActivityViewModel$Companion\n*L\n388#1:420\n389#1:421,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkActivityViewModel$Companion;",
        "",
        "<init>",
        "()V",
        "factory",
        "Landroidx/lifecycle/ViewModelProvider$Factory;",
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
.method public static synthetic $r8$lambda$J3PoEZiQVZv4vrShcua4Ua1FVFc(Lcom/stripe/android/link/NativeLinkArgs;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/LinkActivityViewModel$Companion;->factory$lambda$3$lambda$2$lambda$1(Lcom/stripe/android/link/NativeLinkArgs;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$ozEhpFLwt6rKtiJD9e4ukwGDenQ(Landroidx/lifecycle/SavedStateHandle;Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/link/LinkActivityViewModel;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/LinkActivityViewModel$Companion;->factory$lambda$3$lambda$2(Landroidx/lifecycle/SavedStateHandle;Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/link/LinkActivityViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$yCL0Ft9j0C3Ln0oi6dDdFU7zgr8(Lcom/stripe/android/link/NativeLinkArgs;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/LinkActivityViewModel$Companion;->factory$lambda$3$lambda$2$lambda$0(Lcom/stripe/android/link/NativeLinkArgs;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private constructor <init>()V
    .locals 0

    .line 387
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/link/LinkActivityViewModel$Companion;-><init>()V

    return-void
.end method

.method public static synthetic factory$default(Lcom/stripe/android/link/LinkActivityViewModel$Companion;Landroidx/lifecycle/SavedStateHandle;ILjava/lang/Object;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 388
    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/link/LinkActivityViewModel$Companion;->factory(Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object p0

    return-object p0
.end method

.method private static final factory$lambda$3$lambda$2(Landroidx/lifecycle/SavedStateHandle;Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/link/LinkActivityViewModel;
    .locals 3

    const-string v0, "$this$initializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_0

    .line 390
    invoke-static {p1}, Landroidx/lifecycle/SavedStateHandleSupport;->createSavedStateHandle(Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/SavedStateHandle;

    move-result-object p0

    .line 391
    :cond_0
    sget-object v0, Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;->APPLICATION_KEY:Landroidx/lifecycle/viewmodel/CreationExtras$Key;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/viewmodel/CreationExtras;->get(Landroidx/lifecycle/viewmodel/CreationExtras$Key;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.app.Application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/app/Application;

    .line 392
    sget-object v0, Lcom/stripe/android/link/LinkActivity;->Companion:Lcom/stripe/android/link/LinkActivity$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/link/LinkActivity$Companion;->getArgs$paymentsheet_release(Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/link/NativeLinkArgs;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 394
    invoke-static {}, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent;->builder()Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;

    move-result-object v1

    .line 395
    invoke-virtual {v0}, Lcom/stripe/android/link/NativeLinkArgs;->getConfiguration()Lcom/stripe/android/link/LinkConfiguration;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;->configuration(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;

    move-result-object v1

    .line 396
    new-instance v2, Lcom/stripe/android/link/LinkActivityViewModel$Companion$$ExternalSyntheticLambda0;

    invoke-direct {v2, v0}, Lcom/stripe/android/link/LinkActivityViewModel$Companion$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/link/NativeLinkArgs;)V

    invoke-interface {v1, v2}, Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;->publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;

    move-result-object v1

    .line 397
    new-instance v2, Lcom/stripe/android/link/LinkActivityViewModel$Companion$$ExternalSyntheticLambda1;

    invoke-direct {v2, v0}, Lcom/stripe/android/link/LinkActivityViewModel$Companion$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/link/NativeLinkArgs;)V

    invoke-interface {v1, v2}, Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;->stripeAccountIdProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;

    move-result-object v1

    .line 398
    invoke-virtual {v0}, Lcom/stripe/android/link/NativeLinkArgs;->getPaymentElementCallbackIdentifier()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;->paymentElementCallbackIdentifier(Ljava/lang/String;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;

    move-result-object v1

    .line 399
    invoke-interface {v1, p0}, Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;->savedStateHandle(Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;

    move-result-object p0

    .line 400
    move-object v1, p1

    check-cast v1, Landroid/content/Context;

    invoke-interface {p0, v1}, Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;->context(Landroid/content/Context;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;

    move-result-object p0

    .line 401
    invoke-interface {p0, p1}, Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;->application(Landroid/app/Application;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;

    move-result-object p0

    .line 402
    invoke-virtual {v0}, Lcom/stripe/android/link/NativeLinkArgs;->getLinkExpressMode()Lcom/stripe/android/link/LinkExpressMode;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;->linkExpressMode(Lcom/stripe/android/link/LinkExpressMode;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;

    move-result-object p0

    .line 403
    invoke-virtual {v0}, Lcom/stripe/android/link/NativeLinkArgs;->getLaunchMode()Lcom/stripe/android/link/LinkLaunchMode;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;->linkLaunchMode(Lcom/stripe/android/link/LinkLaunchMode;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;

    move-result-object p0

    .line 404
    invoke-virtual {v0}, Lcom/stripe/android/link/NativeLinkArgs;->getLinkAccountInfo()Lcom/stripe/android/link/LinkAccountUpdate$Value;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;->linkAccountUpdate(Lcom/stripe/android/link/LinkAccountUpdate$Value;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;

    move-result-object p0

    .line 405
    invoke-interface {p0}, Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;->build()Lcom/stripe/android/link/injection/NativeLinkComponent;

    move-result-object p0

    .line 406
    invoke-interface {p0}, Lcom/stripe/android/link/injection/NativeLinkComponent;->getViewModel()Lcom/stripe/android/link/LinkActivityViewModel;

    move-result-object p0

    return-object p0

    .line 392
    :cond_1
    new-instance p0, Lcom/stripe/android/link/NoArgsException;

    invoke-direct {p0}, Lcom/stripe/android/link/NoArgsException;-><init>()V

    throw p0
.end method

.method private static final factory$lambda$3$lambda$2$lambda$0(Lcom/stripe/android/link/NativeLinkArgs;)Ljava/lang/String;
    .locals 0

    .line 396
    invoke-virtual {p0}, Lcom/stripe/android/link/NativeLinkArgs;->getPublishableKey()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final factory$lambda$3$lambda$2$lambda$1(Lcom/stripe/android/link/NativeLinkArgs;)Ljava/lang/String;
    .locals 0

    .line 397
    invoke-virtual {p0}, Lcom/stripe/android/link/NativeLinkArgs;->getStripeAccountId()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final factory(Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 2

    .line 420
    new-instance v0, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;

    invoke-direct {v0}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;-><init>()V

    .line 389
    new-instance v1, Lcom/stripe/android/link/LinkActivityViewModel$Companion$$ExternalSyntheticLambda2;

    invoke-direct {v1, p1}, Lcom/stripe/android/link/LinkActivityViewModel$Companion$$ExternalSyntheticLambda2;-><init>(Landroidx/lifecycle/SavedStateHandle;)V

    .line 421
    const-class p1, Lcom/stripe/android/link/LinkActivityViewModel;

    invoke-static {p1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object p1

    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;->addInitializer(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V

    .line 420
    invoke-virtual {v0}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;->build()Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object p1

    return-object p1
.end method
