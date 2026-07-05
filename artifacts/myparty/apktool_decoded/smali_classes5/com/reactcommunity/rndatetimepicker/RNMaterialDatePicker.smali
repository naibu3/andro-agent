.class public final Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;
.super Ljava/lang/Object;
.source "RNMaterialDatePicker.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker$Listeners;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001:\u0001\"B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0008\u0010\u0016\u001a\u00020\u0015H\u0002J\u0008\u0010\u0017\u001a\u00020\u0015H\u0002J\u0008\u0010\u0018\u001a\u00020\u0015H\u0002J\u0008\u0010\u0019\u001a\u00020\u0015H\u0002J\u0008\u0010\u001a\u001a\u00020\u0015H\u0002J\u0008\u0010\u001b\u001a\u00020\u0015H\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0008\u0010\u001f\u001a\u00020\u0015H\u0002J\u0008\u0010 \u001a\u00020\u0015H\u0002J\u0008\u0010!\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\u000c\u0012\n \u0013*\u0004\u0018\u00010\u00100\u00100\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"
    }
    d2 = {
        "Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;",
        "",
        "args",
        "Landroid/os/Bundle;",
        "promise",
        "Lcom/facebook/react/bridge/Promise;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "reactContext",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "<init>",
        "(Landroid/os/Bundle;Lcom/facebook/react/bridge/Promise;Landroidx/fragment/app/FragmentManager;Lcom/facebook/react/bridge/ReactApplicationContext;)V",
        "promiseResolved",
        "",
        "datePicker",
        "Lcom/google/android/material/datepicker/MaterialDatePicker;",
        "",
        "builder",
        "Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;",
        "kotlin.jvm.PlatformType",
        "open",
        "",
        "createDatePicker",
        "setInitialDate",
        "setTitle",
        "setInputMode",
        "setConstraints",
        "setFullscreen",
        "obtainMaterialThemeOverlayId",
        "",
        "resId",
        "addListeners",
        "show",
        "setButtons",
        "Listeners",
        "react-native-community_datetimepicker_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final args:Landroid/os/Bundle;

.field private builder:Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/material/datepicker/MaterialDatePicker$Builder<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private datePicker:Lcom/google/android/material/datepicker/MaterialDatePicker;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/material/datepicker/MaterialDatePicker<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final fragmentManager:Landroidx/fragment/app/FragmentManager;

.field private final promise:Lcom/facebook/react/bridge/Promise;

.field private promiseResolved:Z

.field private final reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;


# direct methods
.method public constructor <init>(Landroid/os/Bundle;Lcom/facebook/react/bridge/Promise;Landroidx/fragment/app/FragmentManager;Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->args:Landroid/os/Bundle;

    .line 22
    iput-object p2, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->promise:Lcom/facebook/react/bridge/Promise;

    .line 23
    iput-object p3, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->fragmentManager:Landroidx/fragment/app/FragmentManager;

    .line 24
    iput-object p4, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 28
    invoke-static {}, Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;->datePicker()Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;

    move-result-object p1

    const-string p2, "datePicker(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->builder:Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;

    return-void
.end method

.method public static final synthetic access$getArgs$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;)Landroid/os/Bundle;
    .locals 0

    .line 20
    iget-object p0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->args:Landroid/os/Bundle;

    return-object p0
.end method

.method public static final synthetic access$getPromise$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;)Lcom/facebook/react/bridge/Promise;
    .locals 0

    .line 20
    iget-object p0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->promise:Lcom/facebook/react/bridge/Promise;

    return-object p0
.end method

.method public static final synthetic access$getPromiseResolved$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;)Z
    .locals 0

    .line 20
    iget-boolean p0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->promiseResolved:Z

    return p0
.end method

.method public static final synthetic access$getReactContext$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    .line 20
    iget-object p0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-object p0
.end method

.method public static final synthetic access$setPromiseResolved$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;Z)V
    .locals 0

    .line 20
    iput-boolean p1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->promiseResolved:Z

    return-void
.end method

.method private final addListeners()V
    .locals 3

    .line 122
    new-instance v0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker$Listeners;

    invoke-direct {v0, p0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker$Listeners;-><init>(Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;)V

    .line 123
    iget-object v1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->datePicker:Lcom/google/android/material/datepicker/MaterialDatePicker;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v2, v0

    check-cast v2, Lcom/google/android/material/datepicker/MaterialPickerOnPositiveButtonClickListener;

    invoke-virtual {v1, v2}, Lcom/google/android/material/datepicker/MaterialDatePicker;->addOnPositiveButtonClickListener(Lcom/google/android/material/datepicker/MaterialPickerOnPositiveButtonClickListener;)Z

    .line 124
    iget-object v1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->datePicker:Lcom/google/android/material/datepicker/MaterialDatePicker;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Landroid/content/DialogInterface$OnDismissListener;

    invoke-virtual {v1, v0}, Lcom/google/android/material/datepicker/MaterialDatePicker;->addOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)Z

    return-void
.end method

.method private final createDatePicker()V
    .locals 1

    .line 37
    invoke-direct {p0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->setInitialDate()V

    .line 38
    invoke-direct {p0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->setTitle()V

    .line 39
    invoke-direct {p0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->setInputMode()V

    .line 40
    invoke-direct {p0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->setButtons()V

    .line 41
    invoke-direct {p0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->setConstraints()V

    .line 42
    invoke-direct {p0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->setFullscreen()V

    .line 44
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->builder:Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;->build()Lcom/google/android/material/datepicker/MaterialDatePicker;

    move-result-object v0

    iput-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->datePicker:Lcom/google/android/material/datepicker/MaterialDatePicker;

    return-void
.end method

.method private final obtainMaterialThemeOverlayId(I)I
    .locals 3

    .line 112
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactApplicationContext;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 116
    :cond_0
    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    const/4 v2, 0x1

    .line 117
    invoke-virtual {v0, p1, v1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 118
    iget p1, v1, Landroid/util/TypedValue;->resourceId:I

    return p1

    .line 112
    :cond_1
    :goto_0
    move-object v0, p0

    check-cast v0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;

    return p1
.end method

.method private final setButtons()V
    .locals 4

    .line 132
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->args:Landroid/os/Bundle;

    const-string v1, "dialogButtons"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 134
    :cond_0
    const-string v1, "negative"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    .line 135
    const-string v2, "positive"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 137
    const-string v2, "label"

    if-eqz v1, :cond_1

    .line 138
    iget-object v3, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->builder:Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v3, v1}, Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;->setNegativeButtonText(Ljava/lang/CharSequence;)Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;

    :cond_1
    if-eqz v0, :cond_2

    .line 142
    iget-object v1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->builder:Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v1, v0}, Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;->setPositiveButtonText(Ljava/lang/CharSequence;)Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;

    :cond_2
    :goto_0
    return-void
.end method

.method private final setConstraints()V
    .locals 4

    .line 78
    new-instance v0, Lcom/google/android/material/datepicker/CalendarConstraints$Builder;

    invoke-direct {v0}, Lcom/google/android/material/datepicker/CalendarConstraints$Builder;-><init>()V

    .line 80
    iget-object v1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->args:Landroid/os/Bundle;

    const-string v2, "firstDayOfWeek"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 81
    iget-object v1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->args:Landroid/os/Bundle;

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/datepicker/CalendarConstraints$Builder;->setFirstDayOfWeek(I)Lcom/google/android/material/datepicker/CalendarConstraints$Builder;

    .line 84
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    .line 86
    iget-object v2, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->args:Landroid/os/Bundle;

    const-string v3, "minimumDate"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 87
    iget-object v2, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->args:Landroid/os/Bundle;

    invoke-static {v2}, Lcom/reactcommunity/rndatetimepicker/Common;->minDateWithTimeZone(Landroid/os/Bundle;)J

    move-result-wide v2

    .line 88
    invoke-static {v2, v3}, Lcom/google/android/material/datepicker/DateValidatorPointForward;->from(J)Lcom/google/android/material/datepicker/DateValidatorPointForward;

    move-result-object v2

    const-string v3, "from(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 91
    :cond_1
    iget-object v2, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->args:Landroid/os/Bundle;

    const-string v3, "maximumDate"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 92
    iget-object v2, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->args:Landroid/os/Bundle;

    invoke-static {v2}, Lcom/reactcommunity/rndatetimepicker/Common;->maxDateWithTimeZone(Landroid/os/Bundle;)J

    move-result-wide v2

    .line 93
    invoke-static {v2, v3}, Lcom/google/android/material/datepicker/DateValidatorPointBackward;->before(J)Lcom/google/android/material/datepicker/DateValidatorPointBackward;

    move-result-object v2

    const-string v3, "before(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    :cond_2
    invoke-static {v1}, Lcom/google/android/material/datepicker/CompositeDateValidator;->allOf(Ljava/util/List;)Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/datepicker/CalendarConstraints$Builder;->setValidator(Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;)Lcom/google/android/material/datepicker/CalendarConstraints$Builder;

    .line 97
    iget-object v1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->builder:Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/CalendarConstraints$Builder;->build()Lcom/google/android/material/datepicker/CalendarConstraints;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;->setCalendarConstraints(Lcom/google/android/material/datepicker/CalendarConstraints;)Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;

    return-void
.end method

.method private final setFullscreen()V
    .locals 2

    .line 101
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->args:Landroid/os/Bundle;

    const-string v1, "fullscreen"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 103
    sget v0, Lcom/google/android/material/R$attr;->materialCalendarFullscreenTheme:I

    invoke-direct {p0, v0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->obtainMaterialThemeOverlayId(I)I

    move-result v0

    .line 104
    iget-object v1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->builder:Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;

    invoke-virtual {v1, v0}, Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;->setTheme(I)Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;

    return-void

    .line 106
    :cond_0
    sget v0, Lcom/google/android/material/R$attr;->materialCalendarTheme:I

    invoke-direct {p0, v0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->obtainMaterialThemeOverlayId(I)I

    move-result v0

    .line 107
    iget-object v1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->builder:Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;

    invoke-virtual {v1, v0}, Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;->setTheme(I)Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;

    return-void
.end method

.method private final setInitialDate()V
    .locals 2

    .line 48
    new-instance v0, Lcom/reactcommunity/rndatetimepicker/RNDate;

    iget-object v1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->args:Landroid/os/Bundle;

    invoke-direct {v0, v1}, Lcom/reactcommunity/rndatetimepicker/RNDate;-><init>(Landroid/os/Bundle;)V

    .line 49
    iget-object v1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->builder:Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;

    invoke-virtual {v0}, Lcom/reactcommunity/rndatetimepicker/RNDate;->timestamp()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;->setSelection(Ljava/lang/Object;)Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;

    return-void
.end method

.method private final setInputMode()V
    .locals 3

    .line 60
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->args:Landroid/os/Bundle;

    const-string v1, "initialInputMode"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 67
    :cond_0
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->args:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toUpperCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    invoke-static {v0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;->valueOf(Ljava/lang/String;)Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;

    move-result-object v0

    .line 70
    sget-object v1, Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;->KEYBOARD:Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;

    if-ne v0, v1, :cond_1

    .line 71
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->builder:Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;->setInputMode(I)Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;

    return-void

    .line 73
    :cond_1
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->builder:Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;

    invoke-virtual {v0, v2}, Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;->setInputMode(I)Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;

    return-void

    .line 61
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->builder:Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;

    invoke-virtual {v0, v2}, Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;->setInputMode(I)Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;

    return-void
.end method

.method private final setTitle()V
    .locals 3

    .line 53
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->args:Landroid/os/Bundle;

    const-string v1, "title"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 54
    check-cast v0, Ljava/lang/CharSequence;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 55
    :cond_0
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->builder:Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;

    iget-object v2, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->args:Landroid/os/Bundle;

    invoke-virtual {v2, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;->setTitleText(Ljava/lang/CharSequence;)Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;

    :cond_1
    :goto_0
    return-void
.end method

.method private final show()V
    .locals 3

    .line 128
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->datePicker:Lcom/google/android/material/datepicker/MaterialDatePicker;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->fragmentManager:Landroidx/fragment/app/FragmentManager;

    const-string v2, "RNCMaterialDatePicker"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/material/datepicker/MaterialDatePicker;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final open()V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->createDatePicker()V

    .line 32
    invoke-direct {p0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->addListeners()V

    .line 33
    invoke-direct {p0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->show()V

    return-void
.end method
