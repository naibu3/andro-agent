.class public final Lcom/stripe/android/link/injection/LinkViewModelModule;
.super Ljava/lang/Object;
.source "LinkViewModelModule.kt"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003Jr\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0008\u0008\u0001\u0010\u001e\u001a\u00020\u001fH\u0007\u00a8\u0006 "
    }
    d2 = {
        "Lcom/stripe/android/link/injection/LinkViewModelModule;",
        "",
        "<init>",
        "()V",
        "provideLinkActivityViewModel",
        "Lcom/stripe/android/link/LinkActivityViewModel;",
        "component",
        "Lcom/stripe/android/link/injection/NativeLinkComponent;",
        "defaultConfirmationHandlerFactory",
        "Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$Factory;",
        "linkAccountManager",
        "Lcom/stripe/android/link/account/LinkAccountManager;",
        "linkAccountHolder",
        "Lcom/stripe/android/link/account/LinkAccountHolder;",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "linkConfiguration",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "linkAttestationCheck",
        "Lcom/stripe/android/link/attestation/LinkAttestationCheck;",
        "linkConfirmationHandlerFactory",
        "Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;",
        "navigationManager",
        "Lcom/stripe/android/uicore/navigation/NavigationManager;",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "linkLaunchMode",
        "Lcom/stripe/android/link/LinkLaunchMode;",
        "autocompleteLauncher",
        "Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;",
        "linkExpressMode",
        "Lcom/stripe/android/link/LinkExpressMode;",
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
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/link/injection/LinkViewModelModule;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/injection/LinkViewModelModule;

    invoke-direct {v0}, Lcom/stripe/android/link/injection/LinkViewModelModule;-><init>()V

    sput-object v0, Lcom/stripe/android/link/injection/LinkViewModelModule;->INSTANCE:Lcom/stripe/android/link/injection/LinkViewModelModule;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final provideLinkActivityViewModel(Lcom/stripe/android/link/injection/NativeLinkComponent;Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$Factory;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/account/LinkAccountHolder;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/attestation/LinkAttestationCheck;Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;Lcom/stripe/android/uicore/navigation/NavigationManager;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;Lcom/stripe/android/link/LinkExpressMode;)Lcom/stripe/android/link/LinkActivityViewModel;
    .locals 17
    .param p13    # Lcom/stripe/android/link/LinkExpressMode;
        .annotation runtime Ljavax/inject/Named;
            value = "link_express_mode"
        .end annotation
    .end param
    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    move-object/from16 v0, p2

    move-object/from16 v1, p12

    const-string v2, "component"

    move-object/from16 v4, p1

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "defaultConfirmationHandlerFactory"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "linkAccountManager"

    move-object/from16 v7, p3

    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "linkAccountHolder"

    move-object/from16 v8, p4

    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "eventReporter"

    move-object/from16 v9, p5

    invoke-static {v9, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "linkConfiguration"

    move-object/from16 v10, p6

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "linkAttestationCheck"

    move-object/from16 v11, p7

    invoke-static {v11, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "linkConfirmationHandlerFactory"

    move-object/from16 v6, p8

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "navigationManager"

    move-object/from16 v14, p9

    invoke-static {v14, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "savedStateHandle"

    move-object/from16 v12, p10

    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "linkLaunchMode"

    move-object/from16 v15, p11

    invoke-static {v15, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "autocompleteLauncher"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "linkExpressMode"

    move-object/from16 v13, p13

    invoke-static {v13, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    new-instance v3, Lcom/stripe/android/link/LinkActivityViewModel;

    .line 41
    move-object v5, v0

    check-cast v5, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;

    .line 52
    move-object/from16 v16, v1

    check-cast v16, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivityLauncher;

    .line 39
    invoke-direct/range {v3 .. v16}, Lcom/stripe/android/link/LinkActivityViewModel;-><init>(Lcom/stripe/android/link/injection/NativeLinkComponent;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/account/LinkAccountHolder;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/attestation/LinkAttestationCheck;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivityLauncher;)V

    return-object v3
.end method
