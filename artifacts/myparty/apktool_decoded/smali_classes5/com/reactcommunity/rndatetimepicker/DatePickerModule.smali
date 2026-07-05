.class public Lcom/reactcommunity/rndatetimepicker/DatePickerModule;
.super Lcom/reactcommunity/rndatetimepicker/NativeModuleDatePickerSpec;
.source "DatePickerModule.java"


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "RNCDatePicker"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactcommunity/rndatetimepicker/DatePickerModule$DatePickerDialogListener;
    }
.end annotation


# static fields
.field public static final NAME:Ljava/lang/String; = "RNCDatePicker"
    .annotation runtime Lcom/facebook/react/common/annotations/VisibleForTesting;
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$ihq8TB5RrPEIMM1T4V3dpO4YEnI(Lcom/reactcommunity/rndatetimepicker/DatePickerModule;Landroidx/fragment/app/FragmentManager;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/reactcommunity/rndatetimepicker/DatePickerModule;->lambda$open$0(Landroidx/fragment/app/FragmentManager;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Lcom/reactcommunity/rndatetimepicker/NativeModuleDatePickerSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-void
.end method

.method static synthetic access$000(Lcom/reactcommunity/rndatetimepicker/DatePickerModule;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    .line 34
    invoke-virtual {p0}, Lcom/reactcommunity/rndatetimepicker/DatePickerModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$100(Lcom/reactcommunity/rndatetimepicker/DatePickerModule;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    .line 34
    invoke-virtual {p0}, Lcom/reactcommunity/rndatetimepicker/DatePickerModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lcom/reactcommunity/rndatetimepicker/DatePickerModule;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    .line 34
    invoke-virtual {p0}, Lcom/reactcommunity/rndatetimepicker/DatePickerModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p0

    return-object p0
.end method

.method private synthetic lambda$open$0(Landroidx/fragment/app/FragmentManager;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 3

    .line 146
    const-string v0, "RNCDatePicker"

    invoke-virtual {p1, v0}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v1

    check-cast v1, Lcom/reactcommunity/rndatetimepicker/RNDatePickerDialogFragment;

    .line 148
    invoke-static {p2}, Lcom/reactcommunity/rndatetimepicker/Common;->createDatePickerArguments(Lcom/facebook/react/bridge/ReadableMap;)Landroid/os/Bundle;

    move-result-object p2

    if-eqz v1, :cond_0

    .line 151
    invoke-virtual {v1, p2}, Lcom/reactcommunity/rndatetimepicker/RNDatePickerDialogFragment;->update(Landroid/os/Bundle;)V

    return-void

    .line 155
    :cond_0
    new-instance v1, Lcom/reactcommunity/rndatetimepicker/RNDatePickerDialogFragment;

    invoke-direct {v1}, Lcom/reactcommunity/rndatetimepicker/RNDatePickerDialogFragment;-><init>()V

    .line 157
    invoke-virtual {v1, p2}, Lcom/reactcommunity/rndatetimepicker/RNDatePickerDialogFragment;->setArguments(Landroid/os/Bundle;)V

    .line 159
    new-instance v2, Lcom/reactcommunity/rndatetimepicker/DatePickerModule$DatePickerDialogListener;

    invoke-direct {v2, p0, p3, p2}, Lcom/reactcommunity/rndatetimepicker/DatePickerModule$DatePickerDialogListener;-><init>(Lcom/reactcommunity/rndatetimepicker/DatePickerModule;Lcom/facebook/react/bridge/Promise;Landroid/os/Bundle;)V

    .line 160
    invoke-virtual {v1, v2}, Lcom/reactcommunity/rndatetimepicker/RNDatePickerDialogFragment;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 161
    invoke-virtual {v1, v2}, Lcom/reactcommunity/rndatetimepicker/RNDatePickerDialogFragment;->setOnDateSetListener(Landroid/app/DatePickerDialog$OnDateSetListener;)V

    .line 162
    invoke-virtual {v1, v2}, Lcom/reactcommunity/rndatetimepicker/RNDatePickerDialogFragment;->setOnNeutralButtonActionListener(Landroid/content/DialogInterface$OnClickListener;)V

    .line 163
    invoke-virtual {v1, p1, v0}, Lcom/reactcommunity/rndatetimepicker/RNDatePickerDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public dismiss(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 101
    invoke-virtual {p0}, Lcom/reactcommunity/rndatetimepicker/DatePickerModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/FragmentActivity;

    .line 102
    const-string v1, "RNCDatePicker"

    invoke-static {v0, v1, p1}, Lcom/reactcommunity/rndatetimepicker/Common;->dismissDialog(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 46
    const-string v0, "RNCDatePicker"

    return-object v0
.end method

.method public open(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 134
    invoke-virtual {p0}, Lcom/reactcommunity/rndatetimepicker/DatePickerModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/FragmentActivity;

    if-nez v0, :cond_0

    .line 136
    const-string p1, "E_NO_ACTIVITY"

    const-string v0, "Tried to open a DatePicker dialog while not attached to an Activity"

    invoke-interface {p2, p1, v0}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 142
    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    .line 144
    new-instance v1, Lcom/reactcommunity/rndatetimepicker/DatePickerModule$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, v0, p1, p2}, Lcom/reactcommunity/rndatetimepicker/DatePickerModule$$ExternalSyntheticLambda0;-><init>(Lcom/reactcommunity/rndatetimepicker/DatePickerModule;Landroidx/fragment/app/FragmentManager;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V

    invoke-static {v1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method
