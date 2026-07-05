.class public final Lcom/stripe/android/link/injection/NativeLinkModule$Companion;
.super Ljava/lang/Object;
.source "NativeLinkModule.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/injection/NativeLinkModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNativeLinkModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeLinkModule.kt\ncom/stripe/android/link/injection/NativeLinkModule$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,249:1\n1#2:250\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0007J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u000fH\u0007J\u0008\u0010\u0010\u001a\u00020\u0011H\u0007J\u0012\u0010\u0012\u001a\u00020\r2\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u0014H\u0007J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007J\u0008\u0010\u0017\u001a\u00020\u000fH\u0007J\u000e\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019H\u0007J\u0008\u0010\u001b\u001a\u00020\u0014H\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u0008\u0010 \u001a\u00020\u0014H\u0007J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0007J\u0008\u0010%\u001a\u00020&H\u0007J\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0007J \u0010+\u001a\u0012\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030,2\u0006\u0010-\u001a\u00020.H\u0007J\u0014\u0010/\u001a\u0004\u0018\u0001002\u0008\u0008\u0001\u00101\u001a\u00020\u001aH\u0007J\u0008\u00102\u001a\u000203H\u0007\u00a8\u00064"
    }
    d2 = {
        "Lcom/stripe/android/link/injection/NativeLinkModule$Companion;",
        "",
        "<init>",
        "()V",
        "providesLinkAccountHolder",
        "Lcom/stripe/android/link/account/LinkAccountHolder;",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "linkAccountInfo",
        "Lcom/stripe/android/link/LinkAccountUpdate$Value;",
        "provideConsumersApiService",
        "Lcom/stripe/android/repository/ConsumersApiService;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "provideDurationProvider",
        "Lcom/stripe/android/core/utils/DurationProvider;",
        "provideLogger",
        "enableLogging",
        "",
        "provideLocale",
        "Ljava/util/Locale;",
        "ioContext",
        "provideProductUsageTokens",
        "",
        "",
        "providesEnableLogging",
        "providePaymentConfiguration",
        "Lcom/stripe/android/PaymentConfiguration;",
        "appContext",
        "Landroid/content/Context;",
        "provideAllowsManualConfirmation",
        "provideLinkConfirmationHandlerFactory",
        "Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;",
        "factory",
        "Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$Factory;",
        "provideEventReporterMode",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;",
        "provideIntegrityStandardRequestManager",
        "Lcom/stripe/attestation/IntegrityRequestManager;",
        "context",
        "Landroid/app/Application;",
        "providesLinkPassthroughConfirmationDefinition",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;",
        "linkAccountManager",
        "Lcom/stripe/android/link/account/DefaultLinkAccountManager;",
        "providesAnalyticEventCallback",
        "Lcom/stripe/android/paymentelement/AnalyticEventCallback;",
        "paymentElementCallbackIdentifier",
        "provideAutocompleteLauncher",
        "Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;",
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
.field static final synthetic $$INSTANCE:Lcom/stripe/android/link/injection/NativeLinkModule$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/injection/NativeLinkModule$Companion;

    invoke-direct {v0}, Lcom/stripe/android/link/injection/NativeLinkModule$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/link/injection/NativeLinkModule$Companion;->$$INSTANCE:Lcom/stripe/android/link/injection/NativeLinkModule$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ioContext()Lkotlin/coroutines/CoroutineContext;
    .locals 1
    .annotation runtime Lcom/stripe/android/core/injection/IOContext;
    .end annotation

    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 184
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    return-object v0
.end method

.method public final provideAllowsManualConfirmation()Z
    .locals 1
    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ALLOWS_MANUAL_CONFIRMATION"
    .end annotation

    const/4 v0, 0x1

    return v0
.end method

.method public final provideAutocompleteLauncher()Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;
    .locals 2
    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 244
    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;

    .line 245
    sget-object v1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext$Link;->INSTANCE:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext$Link;

    check-cast v1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;

    .line 244
    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;)V

    return-object v0
.end method

.method public final provideConsumersApiService(Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/repository/ConsumersApiService;
    .locals 10
    .param p2    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    sget-object v0, Lcom/stripe/android/Stripe;->Companion:Lcom/stripe/android/Stripe$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/Stripe$Companion;->getAppInfo()Lcom/stripe/android/core/AppInfo;

    move-result-object v0

    .line 158
    sget-object v1, Lcom/stripe/android/Stripe;->API_VERSION:Ljava/lang/String;

    .line 159
    new-instance v2, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p1

    move-object v3, p2

    invoke-direct/range {v2 .. v9}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;-><init>(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/ConnectionFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;ILcom/stripe/android/core/Logger;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 155
    new-instance p1, Lcom/stripe/android/repository/ConsumersApiServiceImpl;

    .line 159
    check-cast v2, Lcom/stripe/android/core/networking/StripeNetworkClient;

    .line 157
    const-string p2, "AndroidBindings/21.22.2"

    .line 155
    invoke-direct {p1, v2, v1, p2, v0}, Lcom/stripe/android/repository/ConsumersApiServiceImpl;-><init>(Lcom/stripe/android/core/networking/StripeNetworkClient;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/AppInfo;)V

    check-cast p1, Lcom/stripe/android/repository/ConsumersApiService;

    return-object p1
.end method

.method public final provideDurationProvider()Lcom/stripe/android/core/utils/DurationProvider;
    .locals 1
    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 168
    sget-object v0, Lcom/stripe/android/core/utils/DefaultDurationProvider;->Companion:Lcom/stripe/android/core/utils/DefaultDurationProvider$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/core/utils/DefaultDurationProvider$Companion;->getInstance()Lcom/stripe/android/core/utils/DefaultDurationProvider;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/core/utils/DurationProvider;

    return-object v0
.end method

.method public final provideEventReporterMode()Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;
    .locals 1
    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 215
    sget-object v0, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;->Custom:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    return-object v0
.end method

.method public final provideIntegrityStandardRequestManager(Landroid/app/Application;)Lcom/stripe/attestation/IntegrityRequestManager;
    .locals 1
    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    invoke-static {p1}, Lcom/stripe/android/link/injection/IntegrityRequestManagerModuleKt;->createIntegrityStandardRequestManager(Landroid/app/Application;)Lcom/stripe/attestation/IntegrityRequestManager;

    move-result-object p1

    return-object p1
.end method

.method public final provideLinkConfirmationHandlerFactory(Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$Factory;)Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;
    .locals 1
    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "factory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 211
    check-cast p1, Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;

    return-object p1
.end method

.method public final provideLocale()Ljava/util/Locale;
    .locals 3
    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 179
    invoke-static {}, Landroidx/core/os/LocaleListCompat;->getAdjustedDefault()Landroidx/core/os/LocaleListCompat;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/core/os/LocaleListCompat;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/core/os/LocaleListCompat;->get(I)Ljava/util/Locale;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v2
.end method

.method public final provideLogger(Z)Lcom/stripe/android/core/Logger;
    .locals 1
    .param p1    # Z
        .annotation runtime Ljavax/inject/Named;
            value = "enableLogging"
        .end annotation
    .end param
    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 174
    sget-object v0, Lcom/stripe/android/core/Logger;->Companion:Lcom/stripe/android/core/Logger$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/core/Logger$Companion;->getInstance(Z)Lcom/stripe/android/core/Logger;

    move-result-object p1

    return-object p1
.end method

.method public final providePaymentConfiguration(Landroid/content/Context;)Lcom/stripe/android/PaymentConfiguration;
    .locals 1
    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    sget-object v0, Lcom/stripe/android/PaymentConfiguration;->Companion:Lcom/stripe/android/PaymentConfiguration$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/PaymentConfiguration$Companion;->getInstance(Landroid/content/Context;)Lcom/stripe/android/PaymentConfiguration;

    move-result-object p1

    return-object p1
.end method

.method public final provideProductUsageTokens()Ljava/util/Set;
    .locals 1
    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "productUsage"
    .end annotation

    .line 189
    const-string v0, "PaymentSheet"

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final providesAnalyticEventCallback(Ljava/lang/String;)Lcom/stripe/android/paymentelement/AnalyticEventCallback;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackIdentifier;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "paymentElementCallbackIdentifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 239
    sget-object v0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;->INSTANCE:Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;->get(Ljava/lang/String;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->getAnalyticEventCallback()Lcom/stripe/android/paymentelement/AnalyticEventCallback;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final providesEnableLogging()Z
    .locals 1
    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "enableLogging"
    .end annotation

    const/4 v0, 0x0

    return v0
.end method

.method public final providesLinkAccountHolder(Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/link/LinkAccountUpdate$Value;)Lcom/stripe/android/link/account/LinkAccountHolder;
    .locals 1
    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "savedStateHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    new-instance v0, Lcom/stripe/android/link/account/LinkAccountHolder;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/account/LinkAccountHolder;-><init>(Landroidx/lifecycle/SavedStateHandle;)V

    .line 147
    invoke-virtual {v0, p2}, Lcom/stripe/android/link/account/LinkAccountHolder;->set(Lcom/stripe/android/link/LinkAccountUpdate$Value;)V

    return-object v0
.end method

.method public final providesLinkPassthroughConfirmationDefinition(Lcom/stripe/android/link/account/DefaultLinkAccountManager;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/multibindings/IntoSet;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/account/DefaultLinkAccountManager;",
            ")",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition<",
            "****>;"
        }
    .end annotation

    const-string v0, "linkAccountManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 229
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/link/LinkPassthroughConfirmationDefinition;

    .line 230
    check-cast p1, Lcom/stripe/android/link/account/LinkAccountManager;

    .line 229
    invoke-direct {v0, p1}, Lcom/stripe/android/paymentelement/confirmation/link/LinkPassthroughConfirmationDefinition;-><init>(Lcom/stripe/android/link/account/LinkAccountManager;)V

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;

    return-object v0
.end method
