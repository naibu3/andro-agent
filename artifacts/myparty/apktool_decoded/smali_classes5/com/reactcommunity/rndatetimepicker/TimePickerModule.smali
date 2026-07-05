.class public Lcom/reactcommunity/rndatetimepicker/TimePickerModule;
.super Lcom/reactcommunity/rndatetimepicker/NativeModuleTimePickerSpec;
.source "TimePickerModule.java"


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "RNCTimePicker"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactcommunity/rndatetimepicker/TimePickerModule$TimePickerDialogListener;
    }
.end annotation


# static fields
.field public static final NAME:Ljava/lang/String; = "RNCTimePicker"
    .annotation runtime Lcom/facebook/react/common/annotations/VisibleForTesting;
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$DgmihTKqzN0L-6kHw7qLGJza094(Lcom/reactcommunity/rndatetimepicker/TimePickerModule;Landroidx/fragment/app/FragmentManager;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/reactcommunity/rndatetimepicker/TimePickerModule;->lambda$open$0(Landroidx/fragment/app/FragmentManager;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Lcom/reactcommunity/rndatetimepicker/NativeModuleTimePickerSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-void
.end method

.method static synthetic access$000(Lcom/reactcommunity/rndatetimepicker/TimePickerModule;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    .line 36
    invoke-virtual {p0}, Lcom/reactcommunity/rndatetimepicker/TimePickerModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$100(Lcom/reactcommunity/rndatetimepicker/TimePickerModule;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    .line 36
    invoke-virtual {p0}, Lcom/reactcommunity/rndatetimepicker/TimePickerModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lcom/reactcommunity/rndatetimepicker/TimePickerModule;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    .line 36
    invoke-virtual {p0}, Lcom/reactcommunity/rndatetimepicker/TimePickerModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p0

    return-object p0
.end method

.method private synthetic lambda$open$0(Landroidx/fragment/app/FragmentManager;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 3

    .line 121
    const-string v0, "RNCTimePicker"

    invoke-virtual {p1, v0}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v1

    check-cast v1, Lcom/reactcommunity/rndatetimepicker/RNTimePickerDialogFragment;

    .line 123
    invoke-static {p2}, Lcom/reactcommunity/rndatetimepicker/Common;->createTimePickerArguments(Lcom/facebook/react/bridge/ReadableMap;)Landroid/os/Bundle;

    move-result-object p2

    if-eqz v1, :cond_0

    .line 126
    invoke-virtual {v1, p2}, Lcom/reactcommunity/rndatetimepicker/RNTimePickerDialogFragment;->update(Landroid/os/Bundle;)V

    return-void

    .line 130
    :cond_0
    new-instance v1, Lcom/reactcommunity/rndatetimepicker/RNTimePickerDialogFragment;

    invoke-direct {v1}, Lcom/reactcommunity/rndatetimepicker/RNTimePickerDialogFragment;-><init>()V

    .line 132
    invoke-virtual {v1, p2}, Lcom/reactcommunity/rndatetimepicker/RNTimePickerDialogFragment;->setArguments(Landroid/os/Bundle;)V

    .line 134
    new-instance v2, Lcom/reactcommunity/rndatetimepicker/TimePickerModule$TimePickerDialogListener;

    invoke-direct {v2, p0, p3, p2}, Lcom/reactcommunity/rndatetimepicker/TimePickerModule$TimePickerDialogListener;-><init>(Lcom/reactcommunity/rndatetimepicker/TimePickerModule;Lcom/facebook/react/bridge/Promise;Landroid/os/Bundle;)V

    .line 135
    invoke-virtual {v1, v2}, Lcom/reactcommunity/rndatetimepicker/RNTimePickerDialogFragment;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 136
    invoke-virtual {v1, v2}, Lcom/reactcommunity/rndatetimepicker/RNTimePickerDialogFragment;->setOnTimeSetListener(Landroid/app/TimePickerDialog$OnTimeSetListener;)V

    .line 137
    invoke-virtual {v1, v2}, Lcom/reactcommunity/rndatetimepicker/RNTimePickerDialogFragment;->setOnNeutralButtonActionListener(Landroid/content/DialogInterface$OnClickListener;)V

    .line 138
    invoke-virtual {v1, p1, v0}, Lcom/reactcommunity/rndatetimepicker/RNTimePickerDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public dismiss(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 102
    invoke-virtual {p0}, Lcom/reactcommunity/rndatetimepicker/TimePickerModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/FragmentActivity;

    .line 103
    const-string v1, "RNCTimePicker"

    invoke-static {v0, v1, p1}, Lcom/reactcommunity/rndatetimepicker/Common;->dismissDialog(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 48
    const-string v0, "RNCTimePicker"

    return-object v0
.end method

.method public open(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 108
    invoke-virtual {p0}, Lcom/reactcommunity/rndatetimepicker/TimePickerModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/FragmentActivity;

    if-nez v0, :cond_0

    .line 110
    const-string p1, "E_NO_ACTIVITY"

    const-string v0, "Tried to open a TimePicker dialog while not attached to an Activity"

    invoke-interface {p2, p1, v0}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 117
    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    .line 119
    new-instance v1, Lcom/reactcommunity/rndatetimepicker/TimePickerModule$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, v0, p1, p2}, Lcom/reactcommunity/rndatetimepicker/TimePickerModule$$ExternalSyntheticLambda0;-><init>(Lcom/reactcommunity/rndatetimepicker/TimePickerModule;Landroidx/fragment/app/FragmentManager;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V

    invoke-static {v1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method
