.class Lcom/reactcommunity/rndatetimepicker/TimePickerModule$TimePickerDialogListener;
.super Ljava/lang/Object;
.source "TimePickerModule.java"

# interfaces
.implements Landroid/app/TimePickerDialog$OnTimeSetListener;
.implements Landroid/content/DialogInterface$OnDismissListener;
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/reactcommunity/rndatetimepicker/TimePickerModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "TimePickerDialogListener"
.end annotation


# instance fields
.field private final mArgs:Landroid/os/Bundle;

.field private final mPromise:Lcom/facebook/react/bridge/Promise;

.field private mPromiseResolved:Z

.field final synthetic this$0:Lcom/reactcommunity/rndatetimepicker/TimePickerModule;


# direct methods
.method public constructor <init>(Lcom/reactcommunity/rndatetimepicker/TimePickerModule;Lcom/facebook/react/bridge/Promise;Landroid/os/Bundle;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/reactcommunity/rndatetimepicker/TimePickerModule$TimePickerDialogListener;->this$0:Lcom/reactcommunity/rndatetimepicker/TimePickerModule;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 54
    iput-boolean p1, p0, Lcom/reactcommunity/rndatetimepicker/TimePickerModule$TimePickerDialogListener;->mPromiseResolved:Z

    .line 57
    iput-object p2, p0, Lcom/reactcommunity/rndatetimepicker/TimePickerModule$TimePickerDialogListener;->mPromise:Lcom/facebook/react/bridge/Promise;

    .line 58
    iput-object p3, p0, Lcom/reactcommunity/rndatetimepicker/TimePickerModule$TimePickerDialogListener;->mArgs:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 91
    iget-boolean p1, p0, Lcom/reactcommunity/rndatetimepicker/TimePickerModule$TimePickerDialogListener;->mPromiseResolved:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/reactcommunity/rndatetimepicker/TimePickerModule$TimePickerDialogListener;->this$0:Lcom/reactcommunity/rndatetimepicker/TimePickerModule;

    invoke-static {p1}, Lcom/reactcommunity/rndatetimepicker/TimePickerModule;->access$200(Lcom/reactcommunity/rndatetimepicker/TimePickerModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactApplicationContext;->hasActiveReactInstance()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 92
    new-instance p1, Lcom/facebook/react/bridge/WritableNativeMap;

    invoke-direct {p1}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 93
    const-string p2, "action"

    const-string v0, "neutralButtonAction"

    invoke-interface {p1, p2, v0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    iget-object p2, p0, Lcom/reactcommunity/rndatetimepicker/TimePickerModule$TimePickerDialogListener;->mPromise:Lcom/facebook/react/bridge/Promise;

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 95
    iput-boolean p1, p0, Lcom/reactcommunity/rndatetimepicker/TimePickerModule$TimePickerDialogListener;->mPromiseResolved:Z

    :cond_0
    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .line 81
    iget-boolean p1, p0, Lcom/reactcommunity/rndatetimepicker/TimePickerModule$TimePickerDialogListener;->mPromiseResolved:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/reactcommunity/rndatetimepicker/TimePickerModule$TimePickerDialogListener;->this$0:Lcom/reactcommunity/rndatetimepicker/TimePickerModule;

    invoke-static {p1}, Lcom/reactcommunity/rndatetimepicker/TimePickerModule;->access$100(Lcom/reactcommunity/rndatetimepicker/TimePickerModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactApplicationContext;->hasActiveReactInstance()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 82
    new-instance p1, Lcom/facebook/react/bridge/WritableNativeMap;

    invoke-direct {p1}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 83
    const-string v0, "action"

    const-string v1, "dismissedAction"

    invoke-interface {p1, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/TimePickerModule$TimePickerDialogListener;->mPromise:Lcom/facebook/react/bridge/Promise;

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 85
    iput-boolean p1, p0, Lcom/reactcommunity/rndatetimepicker/TimePickerModule$TimePickerDialogListener;->mPromiseResolved:Z

    :cond_0
    return-void
.end method

.method public onTimeSet(Landroid/widget/TimePicker;II)V
    .locals 8

    .line 63
    iget-boolean p1, p0, Lcom/reactcommunity/rndatetimepicker/TimePickerModule$TimePickerDialogListener;->mPromiseResolved:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/reactcommunity/rndatetimepicker/TimePickerModule$TimePickerDialogListener;->this$0:Lcom/reactcommunity/rndatetimepicker/TimePickerModule;

    invoke-static {p1}, Lcom/reactcommunity/rndatetimepicker/TimePickerModule;->access$000(Lcom/reactcommunity/rndatetimepicker/TimePickerModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactApplicationContext;->hasActiveReactInstance()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 64
    new-instance p1, Lcom/reactcommunity/rndatetimepicker/RNDate;

    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/TimePickerModule$TimePickerDialogListener;->mArgs:Landroid/os/Bundle;

    invoke-direct {p1, v0}, Lcom/reactcommunity/rndatetimepicker/RNDate;-><init>(Landroid/os/Bundle;)V

    .line 65
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/TimePickerModule$TimePickerDialogListener;->mArgs:Landroid/os/Bundle;

    invoke-static {v0}, Lcom/reactcommunity/rndatetimepicker/Common;->getTimeZone(Landroid/os/Bundle;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v1

    .line 66
    invoke-virtual {p1}, Lcom/reactcommunity/rndatetimepicker/RNDate;->year()I

    move-result v2

    invoke-virtual {p1}, Lcom/reactcommunity/rndatetimepicker/RNDate;->month()I

    move-result v3

    invoke-virtual {p1}, Lcom/reactcommunity/rndatetimepicker/RNDate;->day()I

    move-result v4

    const/4 v7, 0x0

    move v5, p2

    move v6, p3

    invoke-virtual/range {v1 .. v7}, Ljava/util/Calendar;->set(IIIIII)V

    const/16 p1, 0xe

    const/4 p2, 0x0

    .line 67
    invoke-virtual {v1, p1, p2}, Ljava/util/Calendar;->set(II)V

    .line 69
    new-instance p1, Lcom/facebook/react/bridge/WritableNativeMap;

    invoke-direct {p1}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 70
    const-string p2, "action"

    const-string p3, "timeSetAction"

    invoke-interface {p1, p2, p3}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide p2

    long-to-double p2, p2

    const-string v0, "timestamp"

    invoke-interface {p1, v0, p2, p3}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 72
    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;

    move-result-object p2

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Ljava/util/TimeZone;->getOffset(J)I

    move-result p2

    div-int/lit16 p2, p2, 0x3e8

    div-int/lit8 p2, p2, 0x3c

    int-to-double p2, p2

    const-string v0, "utcOffset"

    invoke-interface {p1, v0, p2, p3}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 74
    iget-object p2, p0, Lcom/reactcommunity/rndatetimepicker/TimePickerModule$TimePickerDialogListener;->mPromise:Lcom/facebook/react/bridge/Promise;

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 75
    iput-boolean p1, p0, Lcom/reactcommunity/rndatetimepicker/TimePickerModule$TimePickerDialogListener;->mPromiseResolved:Z

    :cond_0
    return-void
.end method
