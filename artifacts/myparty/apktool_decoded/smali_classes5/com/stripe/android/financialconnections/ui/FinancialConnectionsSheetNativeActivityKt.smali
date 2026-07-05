.class public final Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;
.super Ljava/lang/Object;
.source "FinancialConnectionsSheetNativeActivity.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0013\u001a\u00020\u000f*\u00020\u0014H\u0000\"\u001a\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0004\"\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0004\"\u001a\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u0004\"\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0015"
    }
    d2 = {
        "LocalNavHostController",
        "Landroidx/compose/runtime/ProvidableCompositionLocal;",
        "Landroidx/navigation/NavHostController;",
        "getLocalNavHostController",
        "()Landroidx/compose/runtime/ProvidableCompositionLocal;",
        "LocalTestMode",
        "",
        "getLocalTestMode",
        "LocalImageLoader",
        "Lcom/stripe/android/uicore/image/StripeImageLoader;",
        "getLocalImageLoader",
        "LocalTopAppBarHost",
        "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarHost;",
        "getLocalTopAppBarHost",
        "theme",
        "Lcom/stripe/android/financialconnections/ui/theme/Theme;",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;",
        "getTheme",
        "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;)Lcom/stripe/android/financialconnections/ui/theme/Theme;",
        "toLocalTheme",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;",
        "financial-connections_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final LocalImageLoader:Landroidx/compose/runtime/ProvidableCompositionLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/ProvidableCompositionLocal<",
            "Lcom/stripe/android/uicore/image/StripeImageLoader;",
            ">;"
        }
    .end annotation
.end field

.field private static final LocalNavHostController:Landroidx/compose/runtime/ProvidableCompositionLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/ProvidableCompositionLocal<",
            "Landroidx/navigation/NavHostController;",
            ">;"
        }
    .end annotation
.end field

.field private static final LocalTestMode:Landroidx/compose/runtime/ProvidableCompositionLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/ProvidableCompositionLocal<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private static final LocalTopAppBarHost:Landroidx/compose/runtime/ProvidableCompositionLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/ProvidableCompositionLocal<",
            "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarHost;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$0OV4W-65BLSY5DUvbknvVb8C7kA()Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarHost;
    .locals 1

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->LocalTopAppBarHost$lambda$3()Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarHost;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$8IEDJYYdVl4VFN2PiKpaaieMEpg()Lcom/stripe/android/uicore/image/StripeImageLoader;
    .locals 1

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->LocalImageLoader$lambda$2()Lcom/stripe/android/uicore/image/StripeImageLoader;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$XMM_cqG9t3_akxqm_mYc1cG5diU()Z
    .locals 1

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->LocalTestMode$lambda$1()Z

    move-result v0

    return v0
.end method

.method public static synthetic $r8$lambda$hVpa0nT8LH0D-7xK4NYrxr4yPc4()Landroidx/navigation/NavHostController;
    .locals 1

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->LocalNavHostController$lambda$0()Landroidx/navigation/NavHostController;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 1

    .line 273
    new-instance v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v0}, Landroidx/compose/runtime/CompositionLocalKt;->staticCompositionLocalOf(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->LocalNavHostController:Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 277
    new-instance v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt$$ExternalSyntheticLambda1;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt$$ExternalSyntheticLambda1;-><init>()V

    invoke-static {v0}, Landroidx/compose/runtime/CompositionLocalKt;->staticCompositionLocalOf(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->LocalTestMode:Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 281
    new-instance v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt$$ExternalSyntheticLambda2;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt$$ExternalSyntheticLambda2;-><init>()V

    invoke-static {v0}, Landroidx/compose/runtime/CompositionLocalKt;->staticCompositionLocalOf(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->LocalImageLoader:Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 285
    new-instance v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt$$ExternalSyntheticLambda3;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt$$ExternalSyntheticLambda3;-><init>()V

    invoke-static {v0}, Landroidx/compose/runtime/CompositionLocalKt;->staticCompositionLocalOf(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->LocalTopAppBarHost:Landroidx/compose/runtime/ProvidableCompositionLocal;

    return-void
.end method

.method private static final LocalImageLoader$lambda$2()Lcom/stripe/android/uicore/image/StripeImageLoader;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    .line 282
    const-string v1, "No ImageLoader provided"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final LocalNavHostController$lambda$0()Landroidx/navigation/NavHostController;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    .line 274
    const-string v1, "No NavHostController provided"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final LocalTestMode$lambda$1()Z
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    .line 278
    const-string v1, "No TestMode provided"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final LocalTopAppBarHost$lambda$3()Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarHost;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    .line 286
    const-string v1, "No TopAppBarHost provided"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final synthetic access$getTheme(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;)Lcom/stripe/android/financialconnections/ui/theme/Theme;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->getTheme(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;)Lcom/stripe/android/financialconnections/ui/theme/Theme;

    move-result-object p0

    return-object p0
.end method

.method public static final getLocalImageLoader()Landroidx/compose/runtime/ProvidableCompositionLocal;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/ProvidableCompositionLocal<",
            "Lcom/stripe/android/uicore/image/StripeImageLoader;",
            ">;"
        }
    .end annotation

    .line 281
    sget-object v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->LocalImageLoader:Landroidx/compose/runtime/ProvidableCompositionLocal;

    return-object v0
.end method

.method public static final getLocalNavHostController()Landroidx/compose/runtime/ProvidableCompositionLocal;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/ProvidableCompositionLocal<",
            "Landroidx/navigation/NavHostController;",
            ">;"
        }
    .end annotation

    .line 273
    sget-object v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->LocalNavHostController:Landroidx/compose/runtime/ProvidableCompositionLocal;

    return-object v0
.end method

.method public static final getLocalTestMode()Landroidx/compose/runtime/ProvidableCompositionLocal;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/ProvidableCompositionLocal<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 277
    sget-object v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->LocalTestMode:Landroidx/compose/runtime/ProvidableCompositionLocal;

    return-object v0
.end method

.method public static final getLocalTopAppBarHost()Landroidx/compose/runtime/ProvidableCompositionLocal;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/ProvidableCompositionLocal<",
            "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarHost;",
            ">;"
        }
    .end annotation

    .line 285
    sget-object v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->LocalTopAppBarHost:Landroidx/compose/runtime/ProvidableCompositionLocal;

    return-object v0
.end method

.method private static final getTheme(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;)Lcom/stripe/android/financialconnections/ui/theme/Theme;
    .locals 0

    .line 323
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;->getInitialSyncResponse()Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getTheme()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->toLocalTheme(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;)Lcom/stripe/android/financialconnections/ui/theme/Theme;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    sget-object p0, Lcom/stripe/android/financialconnections/ui/theme/Theme;->Companion:Lcom/stripe/android/financialconnections/ui/theme/Theme$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ui/theme/Theme$Companion;->getDefault()Lcom/stripe/android/financialconnections/ui/theme/Theme;

    move-result-object p0

    return-object p0
.end method

.method public static final toLocalTheme(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;)Lcom/stripe/android/financialconnections/ui/theme/Theme;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 326
    sget-object v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    .line 332
    sget-object p0, Lcom/stripe/android/financialconnections/ui/theme/Theme;->LinkLight:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    return-object p0

    .line 326
    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 329
    :cond_1
    sget-object p0, Lcom/stripe/android/financialconnections/ui/theme/Theme;->DefaultLight:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    return-object p0
.end method
