.class public final Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;
.super Ljava/lang/Object;
.source "AutocompleteLauncher.kt"

# interfaces
.implements Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivityLauncher;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u000c0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivityLauncher;",
        "appearanceContext",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;)V",
        "activityLauncher",
        "Landroidx/activity/result/ActivityResultLauncher;",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;",
        "registeredAutocompleteListeners",
        "",
        "",
        "Ljava/lang/ref/WeakReference;",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncherResultHandler;",
        "register",
        "",
        "activityResultCaller",
        "Landroidx/activity/result/ActivityResultCaller;",
        "lifecycleOwner",
        "Landroidx/lifecycle/LifecycleOwner;",
        "launch",
        "country",
        "googlePlacesApiKey",
        "resultHandler",
        "Factory",
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
.field public static final $stable:I = 0x8


# instance fields
.field private activityLauncher:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;",
            ">;"
        }
    .end annotation
.end field

.field private final appearanceContext:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;

.field private final registeredAutocompleteListeners:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncherResultHandler;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$l3XhYZtWWprMgAxvHk2pOpNHSIg(Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;->register$lambda$0(Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;)V
    .locals 1

    const-string v0, "appearanceContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 139
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;->appearanceContext:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;

    .line 144
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast p1, Ljava/util/Map;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;->registeredAutocompleteListeners:Ljava/util/Map;

    return-void
.end method

.method public static final synthetic access$getActivityLauncher$p(Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;)Landroidx/activity/result/ActivityResultLauncher;
    .locals 0

    .line 138
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;->activityLauncher:Landroidx/activity/result/ActivityResultLauncher;

    return-object p0
.end method

.method public static final synthetic access$setActivityLauncher$p(Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;Landroidx/activity/result/ActivityResultLauncher;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;->activityLauncher:Landroidx/activity/result/ActivityResultLauncher;

    return-void
.end method

.method private static final register$lambda$0(Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result;)V
    .locals 3

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;->registeredAutocompleteListeners:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncherResultHandler;

    if-eqz v0, :cond_2

    .line 152
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result$EnterManually;

    if-eqz v1, :cond_0

    new-instance v1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher$Result$EnterManually;

    .line 153
    move-object v2, p1

    check-cast v2, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result$EnterManually;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result$EnterManually;->getAddressDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v2

    .line 152
    invoke-direct {v1, v2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher$Result$EnterManually;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V

    check-cast v1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher$Result;

    goto :goto_0

    .line 155
    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result$Address;

    if-eqz v1, :cond_1

    new-instance v1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher$Result$OnBack;

    .line 156
    move-object v2, p1

    check-cast v2, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result$Address;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result$Address;->getAddressDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v2

    .line 155
    invoke-direct {v1, v2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher$Result$OnBack;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V

    check-cast v1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher$Result;

    .line 150
    :goto_0
    invoke-interface {v0, v1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncherResultHandler;->onAutocompleteLauncherResult(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher$Result;)V

    goto :goto_1

    .line 151
    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 160
    :cond_2
    :goto_1
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;->registeredAutocompleteListeners:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public launch(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncherResultHandler;)V
    .locals 3

    const-string v0, "country"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googlePlacesApiKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultHandler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;->registeredAutocompleteListeners:Ljava/util/Map;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    iget-object p3, p0, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;->activityLauncher:Landroidx/activity/result/ActivityResultLauncher;

    if-eqz p3, :cond_0

    .line 183
    new-instance v1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;

    .line 187
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;->appearanceContext:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;

    .line 183
    invoke-direct {v1, v0, p1, p2, v2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;)V

    .line 182
    invoke-virtual {p3, v1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public register(Landroidx/activity/result/ActivityResultCaller;Landroidx/lifecycle/LifecycleOwner;)V
    .locals 2

    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    sget-object v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract;->INSTANCE:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract;

    check-cast v0, Landroidx/activity/result/contract/ActivityResultContract;

    .line 147
    new-instance v1, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;)V

    invoke-interface {p1, v0, v1}, Landroidx/activity/result/ActivityResultCaller;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;->activityLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 163
    invoke-interface {p2}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object p1

    .line 164
    new-instance p2, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher$register$2;

    invoke-direct {p2, p0}, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher$register$2;-><init>(Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;)V

    check-cast p2, Landroidx/lifecycle/LifecycleObserver;

    .line 163
    invoke-virtual {p1, p2}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    return-void
.end method
