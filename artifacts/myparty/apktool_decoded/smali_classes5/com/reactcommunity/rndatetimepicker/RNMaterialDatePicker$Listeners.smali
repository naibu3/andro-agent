.class final Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker$Listeners;
.super Ljava/lang/Object;
.source "RNMaterialDatePicker.kt"

# interfaces
.implements Lcom/google/android/material/datepicker/MaterialPickerOnPositiveButtonClickListener;
.implements Landroid/content/DialogInterface$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "Listeners"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/material/datepicker/MaterialPickerOnPositiveButtonClickListener<",
        "Ljava/lang/Long;",
        ">;",
        "Landroid/content/DialogInterface$OnDismissListener;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0082\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker$Listeners;",
        "Lcom/google/android/material/datepicker/MaterialPickerOnPositiveButtonClickListener;",
        "",
        "Landroid/content/DialogInterface$OnDismissListener;",
        "<init>",
        "(Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;)V",
        "onDismiss",
        "",
        "dialog",
        "Landroid/content/DialogInterface;",
        "onPositiveButtonClick",
        "selection",
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
.field final synthetic this$0:Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;


# direct methods
.method public constructor <init>(Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 146
    iput-object p1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker$Listeners;->this$0:Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final createNewCalendar(J)Ljava/util/Calendar;
    .locals 2

    .line 175
    new-instance v0, Lcom/reactcommunity/rndatetimepicker/RNDate;

    iget-object v1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker$Listeners;->this$0:Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;

    invoke-static {v1}, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->access$getArgs$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;)Landroid/os/Bundle;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/reactcommunity/rndatetimepicker/RNDate;-><init>(Landroid/os/Bundle;)V

    .line 178
    iget-object v1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker$Listeners;->this$0:Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;

    invoke-static {v1}, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->access$getArgs$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;)Landroid/os/Bundle;

    move-result-object v1

    .line 177
    invoke-static {v1}, Lcom/reactcommunity/rndatetimepicker/Common;->getTimeZone(Landroid/os/Bundle;)Ljava/util/TimeZone;

    move-result-object v1

    .line 176
    invoke-static {v1}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v1

    .line 182
    invoke-virtual {v1, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    const/16 p1, 0xb

    .line 184
    invoke-virtual {v0}, Lcom/reactcommunity/rndatetimepicker/RNDate;->hour()I

    move-result p2

    invoke-virtual {v1, p1, p2}, Ljava/util/Calendar;->set(II)V

    const/16 p1, 0xc

    .line 185
    invoke-virtual {v0}, Lcom/reactcommunity/rndatetimepicker/RNDate;->minute()I

    move-result p2

    invoke-virtual {v1, p1, p2}, Ljava/util/Calendar;->set(II)V

    const/16 p1, 0xd

    const/4 p2, 0x0

    .line 186
    invoke-virtual {v1, p1, p2}, Ljava/util/Calendar;->set(II)V

    const/16 p1, 0xe

    .line 187
    invoke-virtual {v1, p1, p2}, Ljava/util/Calendar;->set(II)V

    .line 189
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v1
.end method


# virtual methods
.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    const-string v0, "dialog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    iget-object p1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker$Listeners;->this$0:Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;

    invoke-static {p1}, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->access$getPromiseResolved$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker$Listeners;->this$0:Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;

    invoke-static {p1}, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->access$getReactContext$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactApplicationContext;->hasActiveReactInstance()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 151
    :cond_0
    new-instance p1, Lcom/facebook/react/bridge/WritableNativeMap;

    invoke-direct {p1}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 152
    const-string v0, "action"

    const-string v1, "dismissedAction"

    invoke-virtual {p1, v0, v1}, Lcom/facebook/react/bridge/WritableNativeMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker$Listeners;->this$0:Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;

    invoke-static {v0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->access$getPromise$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;)Lcom/facebook/react/bridge/Promise;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 154
    iget-object p1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker$Listeners;->this$0:Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->access$setPromiseResolved$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onPositiveButtonClick(J)V
    .locals 4

    .line 158
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker$Listeners;->this$0:Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;

    invoke-static {v0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->access$getPromiseResolved$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker$Listeners;->this$0:Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;

    invoke-static {v0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->access$getReactContext$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactApplicationContext;->hasActiveReactInstance()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 160
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker$Listeners;->createNewCalendar(J)Ljava/util/Calendar;

    move-result-object p1

    .line 161
    new-instance p2, Lcom/facebook/react/bridge/WritableNativeMap;

    invoke-direct {p2}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 163
    const-string v0, "action"

    const-string v1, "dateSetAction"

    invoke-virtual {p2, v0, v1}, Lcom/facebook/react/bridge/WritableNativeMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    long-to-double v0, v0

    const-string v2, "timestamp"

    invoke-virtual {p2, v2, v0, v1}, Lcom/facebook/react/bridge/WritableNativeMap;->putDouble(Ljava/lang/String;D)V

    .line 167
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/TimeZone;->getOffset(J)I

    move-result p1

    int-to-double v0, p1

    const/16 p1, 0x3e8

    int-to-double v2, p1

    div-double/2addr v0, v2

    const/16 p1, 0x3c

    int-to-double v2, p1

    div-double/2addr v0, v2

    .line 165
    const-string p1, "utcOffset"

    invoke-virtual {p2, p1, v0, v1}, Lcom/facebook/react/bridge/WritableNativeMap;->putDouble(Ljava/lang/String;D)V

    .line 170
    iget-object p1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker$Listeners;->this$0:Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;

    invoke-static {p1}, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->access$getPromise$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;)Lcom/facebook/react/bridge/Promise;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 171
    iget-object p1, p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker$Listeners;->this$0:Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;->access$setPromiseResolved$p(Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public bridge synthetic onPositiveButtonClick(Ljava/lang/Object;)V
    .locals 2

    .line 146
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker$Listeners;->onPositiveButtonClick(J)V

    return-void
.end method
