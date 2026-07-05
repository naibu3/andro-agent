.class public final Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;
.super Ljava/lang/Object;
.source "PlacesClientProxy.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0087\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JN\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0014\u0008\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00140\u00132\u000e\u0008\u0002\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u001f\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u001eR&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u0006\u0010\u0003\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\n\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;",
        "",
        "<init>",
        "()V",
        "override",
        "Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;",
        "getOverride$annotations",
        "getOverride",
        "()Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;",
        "setOverride",
        "(Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;)V",
        "create",
        "context",
        "Landroid/content/Context;",
        "googlePlacesApiKey",
        "",
        "isPlacesAvailable",
        "Lcom/stripe/android/uicore/elements/IsPlacesAvailable;",
        "clientFactory",
        "Lkotlin/Function1;",
        "Lcom/google/android/libraries/places/api/net/PlacesClient;",
        "initializer",
        "Lkotlin/Function0;",
        "",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "getPlacesPoweredByGoogleDrawable",
        "",
        "isSystemDarkTheme",
        "",
        "(ZLcom/stripe/android/uicore/elements/IsPlacesAvailable;)Ljava/lang/Integer;",
        "payments-ui-core_release"
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
.field static final synthetic $$INSTANCE:Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;

.field private static volatile override:Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;


# direct methods
.method public static synthetic $r8$lambda$BVpOPOZQOmXVsktjxayTes2Nr_g(Landroid/content/Context;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;->create$lambda$1(Landroid/content/Context;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$TspwmhDmeQPhk0tzfMeJtF-A9QM(Landroid/content/Context;Landroid/content/Context;)Lcom/google/android/libraries/places/api/net/PlacesClient;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;->create$lambda$0(Landroid/content/Context;Landroid/content/Context;)Lcom/google/android/libraries/places/api/net/PlacesClient;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;->$$INSTANCE:Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic create$default(Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/payments/core/analytics/ErrorReporter;ILjava/lang/Object;)Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;
    .locals 7

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    .line 48
    new-instance p3, Lcom/stripe/android/uicore/elements/DefaultIsPlacesAvailable;

    invoke-direct {p3}, Lcom/stripe/android/uicore/elements/DefaultIsPlacesAvailable;-><init>()V

    check-cast p3, Lcom/stripe/android/uicore/elements/IsPlacesAvailable;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p7, 0x8

    if-eqz p3, :cond_1

    .line 49
    new-instance p4, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion$$ExternalSyntheticLambda0;

    invoke-direct {p4, p1}, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion$$ExternalSyntheticLambda0;-><init>(Landroid/content/Context;)V

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p7, 0x10

    if-eqz p3, :cond_2

    .line 50
    new-instance p5, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion$$ExternalSyntheticLambda1;

    invoke-direct {p5, p1, p2}, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion$$ExternalSyntheticLambda1;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p5

    move-object v6, p6

    .line 45
    invoke-virtual/range {v0 .. v6}, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;->create(Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;

    move-result-object p0

    return-object p0
.end method

.method private static final create$lambda$0(Landroid/content/Context;Landroid/content/Context;)Lcom/google/android/libraries/places/api/net/PlacesClient;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    invoke-static {p0}, Lcom/google/android/libraries/places/api/Places;->createClient(Landroid/content/Context;)Lcom/google/android/libraries/places/api/net/PlacesClient;

    move-result-object p0

    return-object p0
.end method

.method private static final create$lambda$1(Landroid/content/Context;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 50
    invoke-static {p0, p1}, Lcom/google/android/libraries/places/api/Places;->initialize(Landroid/content/Context;Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic getOverride$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getPlacesPoweredByGoogleDrawable$default(Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;ZLcom/stripe/android/uicore/elements/IsPlacesAvailable;ILjava/lang/Object;)Ljava/lang/Integer;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 68
    new-instance p2, Lcom/stripe/android/uicore/elements/DefaultIsPlacesAvailable;

    invoke-direct {p2}, Lcom/stripe/android/uicore/elements/DefaultIsPlacesAvailable;-><init>()V

    check-cast p2, Lcom/stripe/android/uicore/elements/IsPlacesAvailable;

    .line 66
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;->getPlacesPoweredByGoogleDrawable(ZLcom/stripe/android/uicore/elements/IsPlacesAvailable;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/uicore/elements/IsPlacesAvailable;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/content/Context;",
            "+",
            "Lcom/google/android/libraries/places/api/net/PlacesClient;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            ")",
            "Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googlePlacesApiKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "isPlacesAvailable"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "clientFactory"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "initializer"

    invoke-static {p5, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "errorReporter"

    invoke-static {p6, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    invoke-interface {p3}, Lcom/stripe/android/uicore/elements/IsPlacesAvailable;->invoke()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 54
    sget-object p2, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;->override:Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;

    if-nez p2, :cond_0

    move-object p2, p0

    check-cast p2, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;

    .line 55
    invoke-interface {p5}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 56
    new-instance p2, Lcom/stripe/android/ui/core/elements/autocomplete/DefaultPlacesClientProxy;

    .line 57
    invoke-interface {p4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/libraries/places/api/net/PlacesClient;

    .line 56
    invoke-direct {p2, p1, p6}, Lcom/stripe/android/ui/core/elements/autocomplete/DefaultPlacesClientProxy;-><init>(Lcom/google/android/libraries/places/api/net/PlacesClient;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V

    .line 54
    check-cast p2, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;

    :cond_0
    return-object p2

    .line 62
    :cond_1
    new-instance p1, Lcom/stripe/android/ui/core/elements/autocomplete/UnsupportedPlacesClientProxy;

    invoke-direct {p1, p6}, Lcom/stripe/android/ui/core/elements/autocomplete/UnsupportedPlacesClientProxy;-><init>(Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V

    check-cast p1, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;

    return-object p1
.end method

.method public final getOverride()Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;
    .locals 1

    .line 41
    sget-object v0, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;->override:Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;

    return-object v0
.end method

.method public final getPlacesPoweredByGoogleDrawable(ZLcom/stripe/android/uicore/elements/IsPlacesAvailable;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "isPlacesAvailable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    invoke-interface {p2}, Lcom/stripe/android/uicore/elements/IsPlacesAvailable;->invoke()Z

    move-result p2

    if-eqz p2, :cond_1

    if-eqz p1, :cond_0

    .line 72
    sget p1, Lcom/google/android/libraries/places/R$drawable;->places_powered_by_google_dark:I

    goto :goto_0

    .line 74
    :cond_0
    sget p1, Lcom/google/android/libraries/places/R$drawable;->places_powered_by_google_light:I

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final setOverride(Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;)V
    .locals 0

    .line 41
    sput-object p1, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;->override:Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;

    return-void
.end method
