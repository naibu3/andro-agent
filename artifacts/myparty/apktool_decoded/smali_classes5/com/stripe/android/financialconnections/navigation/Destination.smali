.class public abstract Lcom/stripe/android/financialconnections/navigation/Destination;
.super Ljava/lang/Object;
.source "Destination.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/navigation/Destination$AccountPicker;,
        Lcom/stripe/android/financialconnections/navigation/Destination$AccountUpdateRequired;,
        Lcom/stripe/android/financialconnections/navigation/Destination$AttachLinkedPaymentAccount;,
        Lcom/stripe/android/financialconnections/navigation/Destination$BankAuthRepair;,
        Lcom/stripe/android/financialconnections/navigation/Destination$Companion;,
        Lcom/stripe/android/financialconnections/navigation/Destination$Consent;,
        Lcom/stripe/android/financialconnections/navigation/Destination$Error;,
        Lcom/stripe/android/financialconnections/navigation/Destination$Exit;,
        Lcom/stripe/android/financialconnections/navigation/Destination$IDConsentContent;,
        Lcom/stripe/android/financialconnections/navigation/Destination$InstitutionPicker;,
        Lcom/stripe/android/financialconnections/navigation/Destination$LinkAccountPicker;,
        Lcom/stripe/android/financialconnections/navigation/Destination$LinkLogin;,
        Lcom/stripe/android/financialconnections/navigation/Destination$LinkStepUpVerification;,
        Lcom/stripe/android/financialconnections/navigation/Destination$ManualEntry;,
        Lcom/stripe/android/financialconnections/navigation/Destination$ManualEntrySuccess;,
        Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkLoginWarmup;,
        Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkSignup;,
        Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkVerification;,
        Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingSaveToLinkVerification;,
        Lcom/stripe/android/financialconnections/navigation/Destination$Notice;,
        Lcom/stripe/android/financialconnections/navigation/Destination$PartnerAuth;,
        Lcom/stripe/android/financialconnections/navigation/Destination$PartnerAuthDrawer;,
        Lcom/stripe/android/financialconnections/navigation/Destination$Reset;,
        Lcom/stripe/android/financialconnections/navigation/Destination$Success;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Destination.kt\ncom/stripe/android/financialconnections/navigation/Destination\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,283:1\n1225#2,6:284\n1225#2,6:290\n1557#3:296\n1628#3,3:297\n1279#3,2:300\n1293#3,4:302\n81#4:306\n107#4,2:307\n*S KotlinDebug\n*F\n+ 1 Destination.kt\ncom/stripe/android/financialconnections/navigation/Destination\n*L\n72#1:284,6\n74#1:290,6\n64#1:296\n64#1:297,3\n64#1:300,2\n64#1:302,4\n72#1:306\n72#1:307,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0008\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u00081\u0018\u0000 <2\u00020\u0001:\u0018%&\'()*+,-./0123456789:;<BB\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\n\u00a2\u0006\u0002\u0008\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u001e\u001a\u00020\u000c2\u0006\u0010\u001f\u001a\u00020\u000bH\u0007\u00a2\u0006\u0002\u0010 J)\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#2\u0016\u0008\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030$H\u0086\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\'\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\n\u00a2\u0006\u0002\u0008\rX\u0084\u0004\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u00038FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001b\u0010\u0011\u0082\u0001\u0017=>?@ABCDEFGHIJKLMNOPQRS\u00a8\u0006T\u00b2\u0006\n\u0010U\u001a\u00020\u0005X\u008a\u008e\u0002"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/navigation/Destination;",
        "",
        "route",
        "",
        "logPaneLaunched",
        "",
        "extraArgs",
        "",
        "Landroidx/navigation/NamedNavArgument;",
        "composable",
        "Lkotlin/Function1;",
        "Landroidx/navigation/NavBackStackEntry;",
        "",
        "Landroidx/compose/runtime/Composable;",
        "<init>",
        "(Ljava/lang/String;ZLjava/util/List;Lkotlin/jvm/functions/Function3;)V",
        "getRoute",
        "()Ljava/lang/String;",
        "getLogPaneLaunched",
        "()Z",
        "getComposable",
        "()Lkotlin/jvm/functions/Function3;",
        "Lkotlin/jvm/functions/Function3;",
        "arguments",
        "getArguments",
        "()Ljava/util/List;",
        "fullRoute",
        "getFullRoute",
        "fullRoute$delegate",
        "Lkotlin/Lazy;",
        "Composable",
        "navBackStackEntry",
        "(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V",
        "invoke",
        "referrer",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "",
        "InstitutionPicker",
        "Consent",
        "IDConsentContent",
        "PartnerAuthDrawer",
        "PartnerAuth",
        "AccountPicker",
        "Success",
        "ManualEntry",
        "AttachLinkedPaymentAccount",
        "NetworkingLinkSignup",
        "LinkLogin",
        "NetworkingLinkLoginWarmup",
        "NetworkingLinkVerification",
        "NetworkingSaveToLinkVerification",
        "LinkAccountPicker",
        "LinkStepUpVerification",
        "Reset",
        "Exit",
        "Notice",
        "AccountUpdateRequired",
        "Error",
        "BankAuthRepair",
        "ManualEntrySuccess",
        "Companion",
        "Lcom/stripe/android/financialconnections/navigation/Destination$AccountPicker;",
        "Lcom/stripe/android/financialconnections/navigation/Destination$AccountUpdateRequired;",
        "Lcom/stripe/android/financialconnections/navigation/Destination$AttachLinkedPaymentAccount;",
        "Lcom/stripe/android/financialconnections/navigation/Destination$BankAuthRepair;",
        "Lcom/stripe/android/financialconnections/navigation/Destination$Consent;",
        "Lcom/stripe/android/financialconnections/navigation/Destination$Error;",
        "Lcom/stripe/android/financialconnections/navigation/Destination$Exit;",
        "Lcom/stripe/android/financialconnections/navigation/Destination$IDConsentContent;",
        "Lcom/stripe/android/financialconnections/navigation/Destination$InstitutionPicker;",
        "Lcom/stripe/android/financialconnections/navigation/Destination$LinkAccountPicker;",
        "Lcom/stripe/android/financialconnections/navigation/Destination$LinkLogin;",
        "Lcom/stripe/android/financialconnections/navigation/Destination$LinkStepUpVerification;",
        "Lcom/stripe/android/financialconnections/navigation/Destination$ManualEntry;",
        "Lcom/stripe/android/financialconnections/navigation/Destination$ManualEntrySuccess;",
        "Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkLoginWarmup;",
        "Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkSignup;",
        "Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkVerification;",
        "Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingSaveToLinkVerification;",
        "Lcom/stripe/android/financialconnections/navigation/Destination$Notice;",
        "Lcom/stripe/android/financialconnections/navigation/Destination$PartnerAuth;",
        "Lcom/stripe/android/financialconnections/navigation/Destination$PartnerAuthDrawer;",
        "Lcom/stripe/android/financialconnections/navigation/Destination$Reset;",
        "Lcom/stripe/android/financialconnections/navigation/Destination$Success;",
        "financial-connections_release",
        "paneLaunchedTriggered"
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

.field public static final Companion:Lcom/stripe/android/financialconnections/navigation/Destination$Companion;

.field public static final KEY_NEXT_PANE_ON_DISABLE_NETWORKING:Ljava/lang/String; = "next_pane_on_disable_networking"

.field public static final KEY_REFERRER:Ljava/lang/String; = "referrer"


# instance fields
.field private final arguments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/navigation/NamedNavArgument;",
            ">;"
        }
    .end annotation
.end field

.field private final composable:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/navigation/NavBackStackEntry;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final fullRoute$delegate:Lkotlin/Lazy;

.field private final logPaneLaunched:Z

.field private final route:Ljava/lang/String;


# direct methods
.method public static synthetic $r8$lambda$5QOEdQl3vzdHb2LHP78ij_hd6hg(Landroidx/navigation/NavArgumentBuilder;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/navigation/Destination;->arguments$lambda$0(Landroidx/navigation/NavArgumentBuilder;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$OjfI7RxZPPnuP5kDr-DKZ5FFOyk(Lcom/stripe/android/financialconnections/navigation/Destination;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/navigation/Destination;->fullRoute_delegate$lambda$3(Lcom/stripe/android/financialconnections/navigation/Destination;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$ex56Oa7jvyLdAC69DQFTkS0hfXs()Landroidx/compose/runtime/MutableState;
    .locals 1

    invoke-static {}, Lcom/stripe/android/financialconnections/navigation/Destination;->Composable$lambda$5$lambda$4()Landroidx/compose/runtime/MutableState;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$h1pb0StcJt_FjXEmUi7NTjVvPRk(Lcom/stripe/android/financialconnections/navigation/Destination;Landroidx/navigation/NavBackStackEntry;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/navigation/Destination;->Composable$lambda$9(Lcom/stripe/android/financialconnections/navigation/Destination;Landroidx/navigation/NavBackStackEntry;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/navigation/Destination$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/navigation/Destination$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/navigation/Destination;->Companion:Lcom/stripe/android/financialconnections/navigation/Destination$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/navigation/Destination;->$stable:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ZLjava/util/List;Lkotlin/jvm/functions/Function3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List<",
            "Landroidx/navigation/NamedNavArgument;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/navigation/NavBackStackEntry;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/stripe/android/financialconnections/navigation/Destination;->route:Ljava/lang/String;

    .line 51
    iput-boolean p2, p0, Lcom/stripe/android/financialconnections/navigation/Destination;->logPaneLaunched:Z

    .line 53
    iput-object p4, p0, Lcom/stripe/android/financialconnections/navigation/Destination;->composable:Lkotlin/jvm/functions/Function3;

    .line 57
    new-instance p1, Lcom/stripe/android/financialconnections/navigation/Destination$$ExternalSyntheticLambda0;

    invoke-direct {p1}, Lcom/stripe/android/financialconnections/navigation/Destination$$ExternalSyntheticLambda0;-><init>()V

    const-string p2, "referrer"

    invoke-static {p2, p1}, Landroidx/navigation/NamedNavArgumentKt;->navArgument(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Landroidx/navigation/NamedNavArgument;

    move-result-object p1

    .line 56
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    .line 61
    check-cast p3, Ljava/lang/Iterable;

    .line 56
    invoke-static {p1, p3}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/financialconnections/navigation/Destination;->arguments:Ljava/util/List;

    .line 63
    new-instance p1, Lcom/stripe/android/financialconnections/navigation/Destination$$ExternalSyntheticLambda1;

    invoke-direct {p1, p0}, Lcom/stripe/android/financialconnections/navigation/Destination$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/financialconnections/navigation/Destination;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/financialconnections/navigation/Destination;->fullRoute$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLjava/util/List;Lkotlin/jvm/functions/Function3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    .line 52
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p3

    :cond_0
    move-object v3, p3

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v4, p4

    .line 49
    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/navigation/Destination;-><init>(Ljava/lang/String;ZLjava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLjava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/navigation/Destination;-><init>(Ljava/lang/String;ZLjava/util/List;Lkotlin/jvm/functions/Function3;)V

    return-void
.end method

.method private static final Composable$lambda$5$lambda$4()Landroidx/compose/runtime/MutableState;
    .locals 3

    const/4 v0, 0x0

    .line 72
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v0

    return-object v0
.end method

.method private static final Composable$lambda$6(Landroidx/compose/runtime/MutableState;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 72
    check-cast p0, Landroidx/compose/runtime/State;

    .line 306
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final Composable$lambda$7(Landroidx/compose/runtime/MutableState;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    .line 72
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 307
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final Composable$lambda$9(Lcom/stripe/android/financialconnections/navigation/Destination;Landroidx/navigation/NavBackStackEntry;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p2

    invoke-virtual {p0, p1, p3, p2}, Lcom/stripe/android/financialconnections/navigation/Destination;->Composable(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic access$Composable$lambda$7(Landroidx/compose/runtime/MutableState;Z)V
    .locals 0

    .line 49
    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/navigation/Destination;->Composable$lambda$7(Landroidx/compose/runtime/MutableState;Z)V

    return-void
.end method

.method private static final arguments$lambda$0(Landroidx/navigation/NavArgumentBuilder;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$navArgument"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    sget-object v0, Landroidx/navigation/NavType;->StringType:Landroidx/navigation/NavType;

    invoke-virtual {p0, v0}, Landroidx/navigation/NavArgumentBuilder;->setType(Landroidx/navigation/NavType;)V

    const/4 v0, 0x1

    .line 59
    invoke-virtual {p0, v0}, Landroidx/navigation/NavArgumentBuilder;->setNullable(Z)V

    .line 60
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final fullRoute_delegate$lambda$3(Lcom/stripe/android/financialconnections/navigation/Destination;)Ljava/lang/String;
    .locals 7

    .line 64
    iget-object v0, p0, Lcom/stripe/android/financialconnections/navigation/Destination;->arguments:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 296
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 297
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 298
    check-cast v3, Landroidx/navigation/NamedNavArgument;

    .line 64
    invoke-virtual {v3}, Landroidx/navigation/NamedNavArgument;->getName()Ljava/lang/String;

    move-result-object v3

    .line 298
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 299
    :cond_0
    check-cast v1, Ljava/util/List;

    .line 296
    check-cast v1, Ljava/lang/Iterable;

    .line 300
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v2

    const/16 v3, 0x10

    invoke-static {v2, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 302
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 303
    move-object v3, v0

    check-cast v3, Ljava/util/Map;

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    .line 64
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "{"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "}"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 303
    invoke-interface {v3, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 305
    :cond_1
    check-cast v0, Ljava/util/Map;

    .line 65
    iget-object p0, p0, Lcom/stripe/android/financialconnections/navigation/Destination;->route:Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/stripe/android/financialconnections/navigation/DestinationKt;->appendParamValues(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic invoke$default(Lcom/stripe/android/financialconnections/navigation/Destination;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 90
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p2

    .line 88
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/navigation/Destination;->invoke(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: invoke"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final Composable(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V
    .locals 9

    const-string v0, "navBackStackEntry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x5dc06752

    .line 69
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v5

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_1

    invoke-interface {v5, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr p2, v1

    :cond_3
    and-int/lit8 v1, p2, 0x13

    const/16 v2, 0x12

    if-ne v1, v2, :cond_5

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_3

    .line 83
    :cond_4
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_4

    .line 69
    :cond_5
    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.navigation.Destination.Composable (Destination.kt:68)"

    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_6
    const/4 v0, 0x0

    .line 70
    invoke-static {v5, v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModelKt;->parentViewModel(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    move-result-object v8

    new-array v1, v0, [Ljava/lang/Object;

    const v0, 0x774179d1

    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 284
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .line 285
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_7

    .line 286
    new-instance v0, Lcom/stripe/android/financialconnections/navigation/Destination$$ExternalSyntheticLambda2;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/navigation/Destination$$ExternalSyntheticLambda2;-><init>()V

    .line 287
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 72
    :cond_7
    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function0;

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/16 v6, 0xc00

    const/4 v7, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/MutableState;

    const v1, 0x77417f3d

    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 73
    invoke-static {v0}, Lcom/stripe/android/financialconnections/navigation/Destination;->Composable$lambda$6(Landroidx/compose/runtime/MutableState;)Z

    move-result v1

    if-nez v1, :cond_a

    .line 74
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    const v2, 0x774186d4

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v5, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v5, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    .line 290
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_8

    .line 291
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_9

    .line 74
    :cond_8
    new-instance v2, Lcom/stripe/android/financialconnections/navigation/Destination$Composable$1$1;

    const/4 v3, 0x0

    invoke-direct {v2, p1, v8, v0, v3}, Lcom/stripe/android/financialconnections/navigation/Destination$Composable$1$1;-><init>(Landroidx/navigation/NavBackStackEntry;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    move-object v3, v2

    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 293
    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 74
    :cond_9
    check-cast v3, Lkotlin/jvm/functions/Function2;

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v0, 0x6

    invoke-static {v1, v3, v5, v0}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    :cond_a
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 82
    iget-object v0, p0, Lcom/stripe/android/financialconnections/navigation/Destination;->composable:Lkotlin/jvm/functions/Function3;

    and-int/lit8 p2, p2, 0xe

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p1, v5, p2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p2

    if-eqz p2, :cond_b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 83
    :cond_b
    :goto_4
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p2

    if-eqz p2, :cond_c

    new-instance v0, Lcom/stripe/android/financialconnections/navigation/Destination$$ExternalSyntheticLambda3;

    invoke-direct {v0, p0, p1, p3}, Lcom/stripe/android/financialconnections/navigation/Destination$$ExternalSyntheticLambda3;-><init>(Lcom/stripe/android/financialconnections/navigation/Destination;Landroidx/navigation/NavBackStackEntry;I)V

    invoke-interface {p2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_c
    return-void
.end method

.method public final getArguments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/navigation/NamedNavArgument;",
            ">;"
        }
    .end annotation

    .line 56
    iget-object v0, p0, Lcom/stripe/android/financialconnections/navigation/Destination;->arguments:Ljava/util/List;

    return-object v0
.end method

.method protected final getComposable()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/navigation/NavBackStackEntry;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 53
    iget-object v0, p0, Lcom/stripe/android/financialconnections/navigation/Destination;->composable:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method

.method public final getFullRoute()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/stripe/android/financialconnections/navigation/Destination;->fullRoute$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getLogPaneLaunched()Z
    .locals 1

    .line 51
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/navigation/Destination;->logPaneLaunched:Z

    return v0
.end method

.method protected final getRoute()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/stripe/android/financialconnections/navigation/Destination;->route:Ljava/lang/String;

    return-object v0
.end method

.method public final invoke(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "referrer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "extraArgs"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    iget-object v1, p0, Lcom/stripe/android/financialconnections/navigation/Destination;->route:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/stripe/android/financialconnections/navigation/DestinationKt;->appendParamValues(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
