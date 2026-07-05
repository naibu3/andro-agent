.class public final Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$Companion;
.super Ljava/lang/Object;
.source "PaymentMethodViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPaymentMethodViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodViewModel.kt\ncom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$Companion\n+ 2 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,215:1\n35#2:216\n77#2,2:217\n*S KotlinDebug\n*F\n+ 1 PaymentMethodViewModel.kt\ncom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$Companion\n*L\n173#1:216\n174#1:217,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000b\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$Companion;",
        "",
        "<init>",
        "()V",
        "factory",
        "Landroidx/lifecycle/ViewModelProvider$Factory;",
        "parentComponent",
        "Lcom/stripe/android/link/injection/NativeLinkComponent;",
        "linkAccount",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "dismissWithResult",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/link/LinkActivityResult;",
        "",
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
.method public static synthetic $r8$lambda$kbJ1tK2sfo2585Qmznj7J3lUfsE(Lcom/stripe/android/link/injection/NativeLinkComponent;Lcom/stripe/android/link/model/LinkAccount;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$Companion;->factory$lambda$1$lambda$0(Lcom/stripe/android/link/injection/NativeLinkComponent;Lcom/stripe/android/link/model/LinkAccount;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;

    move-result-object p0

    return-object p0
.end method

.method private constructor <init>()V
    .locals 0

    .line 167
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$Companion;-><init>()V

    return-void
.end method

.method private static final factory$lambda$1$lambda$0(Lcom/stripe/android/link/injection/NativeLinkComponent;Lcom/stripe/android/link/model/LinkAccount;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;
    .locals 20

    const-string v0, "$this$initializer"

    move-object/from16 v1, p3

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    invoke-interface/range {p0 .. p0}, Lcom/stripe/android/link/injection/NativeLinkComponent;->getConfiguration()Lcom/stripe/android/link/LinkConfiguration;

    move-result-object v2

    .line 178
    invoke-interface/range {p0 .. p0}, Lcom/stripe/android/link/injection/NativeLinkComponent;->getLinkAccountManager()Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object v4

    .line 179
    new-instance v0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;

    .line 180
    invoke-interface/range {p0 .. p0}, Lcom/stripe/android/link/injection/NativeLinkComponent;->getLinkConfirmationHandlerFactory()Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;

    move-result-object v1

    .line 181
    invoke-interface/range {p0 .. p0}, Lcom/stripe/android/link/injection/NativeLinkComponent;->getViewModel()Lcom/stripe/android/link/LinkActivityViewModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/link/LinkActivityViewModel;->getConfirmationHandler()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

    move-result-object v3

    .line 180
    invoke-interface {v1, v3}, Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;->create(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;)Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;

    move-result-object v1

    .line 183
    invoke-interface/range {p0 .. p0}, Lcom/stripe/android/link/injection/NativeLinkComponent;->getLinkAccountManager()Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object v3

    .line 184
    invoke-interface/range {p0 .. p0}, Lcom/stripe/android/link/injection/NativeLinkComponent;->getDismissalCoordinator()Lcom/stripe/android/link/LinkDismissalCoordinator;

    move-result-object v5

    .line 185
    invoke-interface/range {p0 .. p0}, Lcom/stripe/android/link/injection/NativeLinkComponent;->getLinkLaunchMode()Lcom/stripe/android/link/LinkLaunchMode;

    move-result-object v6

    .line 179
    invoke-direct {v0, v1, v3, v5, v6}, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;-><init>(Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/LinkDismissalCoordinator;Lcom/stripe/android/link/LinkLaunchMode;)V

    .line 187
    sget-object v7, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->Companion:Lcom/stripe/android/paymentsheet/DefaultFormHelper$Companion;

    .line 188
    invoke-interface/range {p0 .. p0}, Lcom/stripe/android/link/injection/NativeLinkComponent;->getViewModel()Lcom/stripe/android/link/LinkActivityViewModel;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/ViewModel;

    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v8

    .line 189
    invoke-interface/range {p0 .. p0}, Lcom/stripe/android/link/injection/NativeLinkComponent;->getCardAccountRangeRepositoryFactory()Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;

    move-result-object v9

    .line 190
    sget-object v1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->Companion:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata$Companion;

    .line 191
    invoke-interface/range {p0 .. p0}, Lcom/stripe/android/link/injection/NativeLinkComponent;->getConfiguration()Lcom/stripe/android/link/LinkConfiguration;

    move-result-object v3

    move-object/from16 v5, p1

    .line 190
    invoke-virtual {v1, v3, v5}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata$Companion;->createForNativeLink$paymentsheet_release(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/model/LinkAccount;)Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v11

    .line 194
    invoke-interface/range {p0 .. p0}, Lcom/stripe/android/link/injection/NativeLinkComponent;->getEventReporter()Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    move-result-object v12

    .line 195
    invoke-interface/range {p0 .. p0}, Lcom/stripe/android/link/injection/NativeLinkComponent;->getViewModel()Lcom/stripe/android/link/LinkActivityViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkActivityViewModel;->getSavedStateHandle()Landroidx/lifecycle/SavedStateHandle;

    move-result-object v13

    .line 197
    new-instance v1, Lcom/stripe/android/paymentsheet/addresselement/PaymentElementAutocompleteAddressInteractor$Factory;

    .line 198
    invoke-interface/range {p0 .. p0}, Lcom/stripe/android/link/injection/NativeLinkComponent;->getAutocompleteLauncher()Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;

    move-result-object v3

    .line 199
    new-instance v14, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;

    .line 200
    invoke-interface/range {p0 .. p0}, Lcom/stripe/android/link/injection/NativeLinkComponent;->getConfiguration()Lcom/stripe/android/link/LinkConfiguration;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/link/LinkConfiguration;->getGooglePlacesApiKey()Ljava/lang/String;

    move-result-object v15

    .line 201
    invoke-static {}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementDefaultsKt;->getAUTOCOMPLETE_DEFAULT_COUNTRIES()Ljava/util/Set;

    move-result-object v16

    const/16 v18, 0x4

    const/16 v19, 0x0

    const/16 v17, 0x0

    .line 199
    invoke-direct/range {v14 .. v19}, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;-><init>(Ljava/lang/String;Ljava/util/Set;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 197
    invoke-direct {v1, v3, v14}, Lcom/stripe/android/paymentsheet/addresselement/PaymentElementAutocompleteAddressInteractor$Factory;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;)V

    move-object v10, v1

    check-cast v10, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;

    .line 187
    invoke-virtual/range {v7 .. v13}, Lcom/stripe/android/paymentsheet/DefaultFormHelper$Companion;->create(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/paymentsheet/FormHelper;

    move-result-object v7

    .line 205
    invoke-interface/range {p0 .. p0}, Lcom/stripe/android/link/injection/NativeLinkComponent;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object v6

    .line 206
    invoke-interface/range {p0 .. p0}, Lcom/stripe/android/link/injection/NativeLinkComponent;->getDismissalCoordinator()Lcom/stripe/android/link/LinkDismissalCoordinator;

    move-result-object v8

    .line 207
    invoke-interface/range {p0 .. p0}, Lcom/stripe/android/link/injection/NativeLinkComponent;->getLinkLaunchMode()Lcom/stripe/android/link/LinkLaunchMode;

    move-result-object v9

    .line 175
    new-instance v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;

    .line 179
    check-cast v0, Lcom/stripe/android/link/confirmation/CompleteLinkFlow;

    move-object/from16 v10, p2

    move-object v3, v5

    move-object v5, v0

    .line 175
    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;-><init>(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/confirmation/CompleteLinkFlow;Lcom/stripe/android/core/Logger;Lcom/stripe/android/paymentsheet/FormHelper;Lcom/stripe/android/link/LinkDismissalCoordinator;Lcom/stripe/android/link/LinkLaunchMode;Lkotlin/jvm/functions/Function1;)V

    return-object v1
.end method


# virtual methods
.method public final factory(Lcom/stripe/android/link/injection/NativeLinkComponent;Lcom/stripe/android/link/model/LinkAccount;Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/injection/NativeLinkComponent;",
            "Lcom/stripe/android/link/model/LinkAccount;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/LinkActivityResult;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/lifecycle/ViewModelProvider$Factory;"
        }
    .end annotation

    const-string v0, "parentComponent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccount"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dismissWithResult"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 216
    new-instance v0, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;

    invoke-direct {v0}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;-><init>()V

    .line 174
    new-instance v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$Companion$$ExternalSyntheticLambda0;

    invoke-direct {v1, p1, p2, p3}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$Companion$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/link/injection/NativeLinkComponent;Lcom/stripe/android/link/model/LinkAccount;Lkotlin/jvm/functions/Function1;)V

    .line 217
    const-class p1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;

    invoke-static {p1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object p1

    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;->addInitializer(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V

    .line 216
    invoke-virtual {v0}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;->build()Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object p1

    return-object p1
.end method
