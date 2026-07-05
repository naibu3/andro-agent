.class public final Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;
.super Ljava/lang/Object;
.source "RNMaterialTimePicker.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker$Listeners;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001:\u0001\u001cB\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0008\u0010\u0014\u001a\u00020\u0013H\u0002J\u0008\u0010\u0015\u001a\u00020\u0013H\u0002J\u0008\u0010\u0016\u001a\u00020\u0013H\u0002J\u0008\u0010\u0017\u001a\u00020\u0013H\u0002J\u0008\u0010\u0018\u001a\u00020\u0013H\u0002J\u0008\u0010\u0019\u001a\u00020\u0013H\u0002J\u0008\u0010\u001a\u001a\u00020\u0013H\u0002J\u0008\u0010\u001b\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;",
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
        "timePicker",
        "Lcom/google/android/material/timepicker/MaterialTimePicker;",
        "builder",
        "Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;",
        "open",
        "",
        "createTimePicker",
        "setInitialDate",
        "setTitle",
        "setInputMode",
        "setButtons",
        "setTimeFormat",
        "addListeners",
        "show",
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

.field private builder:Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;

.field private final fragmentManager:Landroidx/fragment/app/FragmentManager;

.field private final promise:Lcom/facebook/react/bridge/Promise;

.field private promiseResolved:Z

.field private final reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private timePicker:Lcom/google/android/material/timepicker/MaterialTimePicker;


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

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->args:Landroid/os/Bundle;

    .line 18
    iput-object p2, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->promise:Lcom/facebook/react/bridge/Promise;

    .line 19
    iput-object p3, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->fragmentManager:Landroidx/fragment/app/FragmentManager;

    .line 20
    iput-object p4, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 24
    new-instance p1, Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;

    invoke-direct {p1}, Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;-><init>()V

    iput-object p1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->builder:Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;

    return-void
.end method

.method public static final synthetic access$getArgs$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;)Landroid/os/Bundle;
    .locals 0

    .line 16
    iget-object p0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->args:Landroid/os/Bundle;

    return-object p0
.end method

.method public static final synthetic access$getPromise$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;)Lcom/facebook/react/bridge/Promise;
    .locals 0

    .line 16
    iget-object p0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->promise:Lcom/facebook/react/bridge/Promise;

    return-object p0
.end method

.method public static final synthetic access$getPromiseResolved$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;)Z
    .locals 0

    .line 16
    iget-boolean p0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->promiseResolved:Z

    return p0
.end method

.method public static final synthetic access$getReactContext$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    .line 16
    iget-object p0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-object p0
.end method

.method public static final synthetic access$getTimePicker$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;)Lcom/google/android/material/timepicker/MaterialTimePicker;
    .locals 0

    .line 16
    iget-object p0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->timePicker:Lcom/google/android/material/timepicker/MaterialTimePicker;

    return-object p0
.end method

.method public static final synthetic access$setPromiseResolved$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;Z)V
    .locals 0

    .line 16
    iput-boolean p1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->promiseResolved:Z

    return-void
.end method

.method private final addListeners()V
    .locals 3

    .line 103
    new-instance v0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker$Listeners;

    invoke-direct {v0, p0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker$Listeners;-><init>(Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;)V

    .line 104
    iget-object v1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->timePicker:Lcom/google/android/material/timepicker/MaterialTimePicker;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v2, v0

    check-cast v2, Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v2}, Lcom/google/android/material/timepicker/MaterialTimePicker;->addOnPositiveButtonClickListener(Landroid/view/View$OnClickListener;)Z

    .line 105
    iget-object v1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->timePicker:Lcom/google/android/material/timepicker/MaterialTimePicker;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Landroid/content/DialogInterface$OnDismissListener;

    invoke-virtual {v1, v0}, Lcom/google/android/material/timepicker/MaterialTimePicker;->addOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)Z

    return-void
.end method

.method private final createTimePicker()V
    .locals 1

    .line 33
    invoke-direct {p0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->setInitialDate()V

    .line 34
    invoke-direct {p0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->setTitle()V

    .line 35
    invoke-direct {p0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->setInputMode()V

    .line 36
    invoke-direct {p0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->setButtons()V

    .line 37
    invoke-direct {p0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->setTimeFormat()V

    .line 39
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->builder:Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;

    invoke-virtual {v0}, Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;->build()Lcom/google/android/material/timepicker/MaterialTimePicker;

    move-result-object v0

    iput-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->timePicker:Lcom/google/android/material/timepicker/MaterialTimePicker;

    return-void
.end method

.method private final setButtons()V
    .locals 4

    .line 75
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->args:Landroid/os/Bundle;

    const-string v1, "dialogButtons"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 77
    :cond_0
    const-string v1, "negative"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    .line 78
    const-string v2, "positive"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 80
    const-string v2, "label"

    if-eqz v1, :cond_1

    .line 81
    iget-object v3, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->builder:Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v3, v1}, Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;->setNegativeButtonText(Ljava/lang/CharSequence;)Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;

    :cond_1
    if-eqz v0, :cond_2

    .line 85
    iget-object v1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->builder:Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v1, v0}, Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;->setPositiveButtonText(Ljava/lang/CharSequence;)Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;

    :cond_2
    :goto_0
    return-void
.end method

.method private final setInitialDate()V
    .locals 3

    .line 43
    new-instance v0, Lcom/reactcommunity/rndatetimepicker/RNDate;

    iget-object v1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->args:Landroid/os/Bundle;

    invoke-direct {v0, v1}, Lcom/reactcommunity/rndatetimepicker/RNDate;-><init>(Landroid/os/Bundle;)V

    .line 45
    iget-object v1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->builder:Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;

    invoke-virtual {v0}, Lcom/reactcommunity/rndatetimepicker/RNDate;->hour()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;->setHour(I)Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;

    move-result-object v1

    .line 46
    invoke-virtual {v0}, Lcom/reactcommunity/rndatetimepicker/RNDate;->minute()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;->setMinute(I)Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;

    return-void
.end method

.method private final setInputMode()V
    .locals 3

    .line 57
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->args:Landroid/os/Bundle;

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

    .line 64
    :cond_0
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->args:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toUpperCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    invoke-static {v0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;->valueOf(Ljava/lang/String;)Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;

    move-result-object v0

    .line 67
    sget-object v1, Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;->KEYBOARD:Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;

    if-ne v0, v1, :cond_1

    .line 68
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->builder:Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;->setInputMode(I)Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;

    return-void

    .line 70
    :cond_1
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->builder:Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;

    invoke-virtual {v0, v2}, Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;->setInputMode(I)Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;

    return-void

    .line 58
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->builder:Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;

    invoke-virtual {v0, v2}, Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;->setInputMode(I)Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;

    return-void
.end method

.method private final setTimeFormat()V
    .locals 2

    .line 90
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->args:Landroid/os/Bundle;

    const-string v1, "is24Hour"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->builder:Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;

    invoke-virtual {v0, v1}, Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;->setTimeFormat(I)Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;

    return-void

    .line 95
    :cond_0
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 96
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->builder:Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;

    invoke-virtual {v0, v1}, Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;->setTimeFormat(I)Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;

    return-void

    .line 98
    :cond_1
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->builder:Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;->setTimeFormat(I)Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;

    return-void
.end method

.method private final setTitle()V
    .locals 3

    .line 50
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->args:Landroid/os/Bundle;

    const-string v1, "title"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 51
    check-cast v0, Ljava/lang/CharSequence;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 52
    :cond_0
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->builder:Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;

    iget-object v2, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->args:Landroid/os/Bundle;

    invoke-virtual {v2, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;->setTitleText(Ljava/lang/CharSequence;)Lcom/google/android/material/timepicker/MaterialTimePicker$Builder;

    :cond_1
    :goto_0
    return-void
.end method

.method private final show()V
    .locals 3

    .line 109
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->timePicker:Lcom/google/android/material/timepicker/MaterialTimePicker;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->fragmentManager:Landroidx/fragment/app/FragmentManager;

    const-string v2, "RNCMaterialTimePicker"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/material/timepicker/MaterialTimePicker;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final open()V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->createTimePicker()V

    .line 28
    invoke-direct {p0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->addListeners()V

    .line 29
    invoke-direct {p0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->show()V

    return-void
.end method
