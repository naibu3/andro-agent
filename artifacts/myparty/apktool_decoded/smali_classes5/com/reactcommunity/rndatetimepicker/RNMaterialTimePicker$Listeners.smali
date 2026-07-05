.class final Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker$Listeners;
.super Ljava/lang/Object;
.source "RNMaterialTimePicker.kt"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/content/DialogInterface$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "Listeners"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0008\u0010\u000c\u001a\u00020\rH\u0002\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker$Listeners;",
        "Landroid/view/View$OnClickListener;",
        "Landroid/content/DialogInterface$OnDismissListener;",
        "<init>",
        "(Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;)V",
        "onDismiss",
        "",
        "dialog",
        "Landroid/content/DialogInterface;",
        "onClick",
        "v",
        "Landroid/view/View;",
        "createNewCalendar",
        "Ljava/util/Calendar;",
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
.field final synthetic this$0:Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;


# direct methods
.method public constructor <init>(Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 112
    iput-object p1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker$Listeners;->this$0:Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final createNewCalendar()Ljava/util/Calendar;
    .locals 9

    .line 140
    new-instance v0, Lcom/reactcommunity/rndatetimepicker/RNDate;

    iget-object v1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker$Listeners;->this$0:Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;

    invoke-static {v1}, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->access$getArgs$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;)Landroid/os/Bundle;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/reactcommunity/rndatetimepicker/RNDate;-><init>(Landroid/os/Bundle;)V

    .line 143
    iget-object v1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker$Listeners;->this$0:Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;

    invoke-static {v1}, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->access$getArgs$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;)Landroid/os/Bundle;

    move-result-object v1

    .line 142
    invoke-static {v1}, Lcom/reactcommunity/rndatetimepicker/Common;->getTimeZone(Landroid/os/Bundle;)Ljava/util/TimeZone;

    move-result-object v1

    .line 141
    invoke-static {v1}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v2

    .line 147
    invoke-virtual {v0}, Lcom/reactcommunity/rndatetimepicker/RNDate;->year()I

    move-result v3

    invoke-virtual {v0}, Lcom/reactcommunity/rndatetimepicker/RNDate;->month()I

    move-result v4

    invoke-virtual {v0}, Lcom/reactcommunity/rndatetimepicker/RNDate;->day()I

    move-result v5

    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker$Listeners;->this$0:Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;

    invoke-static {v0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->access$getTimePicker$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;)Lcom/google/android/material/timepicker/MaterialTimePicker;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/android/material/timepicker/MaterialTimePicker;->getHour()I

    move-result v6

    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker$Listeners;->this$0:Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;

    invoke-static {v0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->access$getTimePicker$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;)Lcom/google/android/material/timepicker/MaterialTimePicker;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/android/material/timepicker/MaterialTimePicker;->getMinute()I

    move-result v7

    const/4 v8, 0x0

    invoke-virtual/range {v2 .. v8}, Ljava/util/Calendar;->set(IIIIII)V

    const/16 v0, 0xe

    const/4 v1, 0x0

    .line 150
    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 152
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v2
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    iget-object p1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker$Listeners;->this$0:Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;

    invoke-static {p1}, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->access$getPromiseResolved$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker$Listeners;->this$0:Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;

    invoke-static {p1}, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->access$getReactContext$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactApplicationContext;->hasActiveReactInstance()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 125
    :cond_0
    invoke-direct {p0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker$Listeners;->createNewCalendar()Ljava/util/Calendar;

    move-result-object p1

    .line 126
    new-instance v0, Lcom/facebook/react/bridge/WritableNativeMap;

    invoke-direct {v0}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 128
    const-string v1, "action"

    const-string v2, "dateSetAction"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/bridge/WritableNativeMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    long-to-double v1, v1

    const-string v3, "timestamp"

    invoke-virtual {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableNativeMap;->putDouble(Ljava/lang/String;D)V

    .line 132
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/util/TimeZone;->getOffset(J)I

    move-result p1

    int-to-double v1, p1

    const/16 p1, 0x3e8

    int-to-double v3, p1

    div-double/2addr v1, v3

    const/16 p1, 0x3c

    int-to-double v3, p1

    div-double/2addr v1, v3

    .line 130
    const-string p1, "utcOffset"

    invoke-virtual {v0, p1, v1, v2}, Lcom/facebook/react/bridge/WritableNativeMap;->putDouble(Ljava/lang/String;D)V

    .line 135
    iget-object p1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker$Listeners;->this$0:Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;

    invoke-static {p1}, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->access$getPromise$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;)Lcom/facebook/react/bridge/Promise;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 136
    iget-object p1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker$Listeners;->this$0:Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->access$setPromiseResolved$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    const-string v0, "dialog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    iget-object p1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker$Listeners;->this$0:Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;

    invoke-static {p1}, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->access$getPromiseResolved$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker$Listeners;->this$0:Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;

    invoke-static {p1}, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->access$getReactContext$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactApplicationContext;->hasActiveReactInstance()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 116
    :cond_0
    new-instance p1, Lcom/facebook/react/bridge/WritableNativeMap;

    invoke-direct {p1}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    check-cast p1, Lcom/facebook/react/bridge/WritableMap;

    .line 117
    const-string v0, "action"

    const-string v1, "dismissedAction"

    invoke-interface {p1, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker$Listeners;->this$0:Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;

    invoke-static {v0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->access$getPromise$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;)Lcom/facebook/react/bridge/Promise;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 119
    iget-object p1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker$Listeners;->this$0:Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->access$setPromiseResolved$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;Z)V

    :cond_1
    :goto_0
    return-void
.end method
