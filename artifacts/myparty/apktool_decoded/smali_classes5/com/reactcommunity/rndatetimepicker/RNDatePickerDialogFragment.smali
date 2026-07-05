.class public Lcom/reactcommunity/rndatetimepicker/RNDatePickerDialogFragment;
.super Landroidx/fragment/app/DialogFragment;
.source "RNDatePickerDialogFragment.java"


# instance fields
.field private instance:Landroid/app/DatePickerDialog;

.field private mOnDateSetListener:Landroid/app/DatePickerDialog$OnDateSetListener;

.field private mOnDismissListener:Landroid/content/DialogInterface$OnDismissListener;

.field private mOnNeutralButtonActionListener:Landroid/content/DialogInterface$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Landroidx/fragment/app/DialogFragment;-><init>()V

    return-void
.end method

.method private createDialog(Landroid/os/Bundle;)Landroid/app/DatePickerDialog;
    .locals 10

    .line 96
    invoke-virtual {p0}, Lcom/reactcommunity/rndatetimepicker/RNDatePickerDialogFragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    .line 97
    iget-object v1, p0, Lcom/reactcommunity/rndatetimepicker/RNDatePickerDialogFragment;->mOnDateSetListener:Landroid/app/DatePickerDialog$OnDateSetListener;

    invoke-static {p1, v0, v1}, Lcom/reactcommunity/rndatetimepicker/RNDatePickerDialogFragment;->getDialog(Landroid/os/Bundle;Landroid/content/Context;Landroid/app/DatePickerDialog$OnDateSetListener;)Landroid/app/DatePickerDialog;

    move-result-object v1

    if-eqz p1, :cond_1

    .line 100
    iget-object v2, p0, Lcom/reactcommunity/rndatetimepicker/RNDatePickerDialogFragment;->mOnNeutralButtonActionListener:Landroid/content/DialogInterface$OnClickListener;

    invoke-static {p1, v1, v2}, Lcom/reactcommunity/rndatetimepicker/Common;->setButtonTitles(Landroid/os/Bundle;Landroid/app/AlertDialog;Landroid/content/DialogInterface$OnClickListener;)V

    if-eqz v0, :cond_1

    .line 102
    invoke-static {p1}, Lcom/reactcommunity/rndatetimepicker/Common;->getDisplayDate(Landroid/os/Bundle;)Lcom/reactcommunity/rndatetimepicker/RNDatePickerDisplay;

    move-result-object v2

    .line 103
    sget-object v3, Lcom/reactcommunity/rndatetimepicker/RNDatePickerDisplay;->SPINNER:Lcom/reactcommunity/rndatetimepicker/RNDatePickerDisplay;

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 104
    :goto_0
    invoke-static {v0, v1, p1, v2}, Lcom/reactcommunity/rndatetimepicker/Common;->setButtonTextColor(Landroid/content/Context;Landroid/app/AlertDialog;Landroid/os/Bundle;Z)Landroid/content/DialogInterface$OnShowListener;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/app/DatePickerDialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 108
    :cond_1
    invoke-virtual {v1}, Landroid/app/DatePickerDialog;->getDatePicker()Landroid/widget/DatePicker;

    move-result-object v8

    .line 109
    invoke-static {p1}, Lcom/reactcommunity/rndatetimepicker/Common;->minDateWithTimeZone(Landroid/os/Bundle;)J

    move-result-wide v4

    .line 110
    invoke-static {p1}, Lcom/reactcommunity/rndatetimepicker/Common;->maxDateWithTimeZone(Landroid/os/Bundle;)J

    move-result-wide v6

    .line 112
    const-string v0, "minimumDate"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 113
    invoke-virtual {v8, v4, v5}, Landroid/widget/DatePicker;->setMinDate(J)V

    goto :goto_1

    :cond_2
    const-wide v2, -0x20251fe2401L

    .line 117
    invoke-virtual {v8, v2, v3}, Landroid/widget/DatePicker;->setMinDate(J)V

    .line 120
    :goto_1
    const-string v2, "maximumDate"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 121
    invoke-virtual {v8, v6, v7}, Landroid/widget/DatePicker;->setMaxDate(J)V

    .line 125
    :cond_3
    const-string v3, "firstDayOfWeek"

    invoke-virtual {p1, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 126
    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    .line 127
    invoke-virtual {v8, v3}, Landroid/widget/DatePicker;->setFirstDayOfWeek(I)V

    .line 130
    :cond_4
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v9, 0x1a

    if-lt v3, v9, :cond_6

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 131
    :cond_5
    new-instance v2, Lcom/reactcommunity/rndatetimepicker/RNDatePickerDialogFragment$$ExternalSyntheticLambda0;

    move-object v3, p1

    invoke-direct/range {v2 .. v8}, Lcom/reactcommunity/rndatetimepicker/RNDatePickerDialogFragment$$ExternalSyntheticLambda0;-><init>(Landroid/os/Bundle;JJLandroid/widget/DatePicker;)V

    invoke-virtual {v8, v2}, Landroid/widget/DatePicker;->setOnDateChangedListener(Landroid/widget/DatePicker$OnDateChangedListener;)V

    goto :goto_2

    :cond_6
    move-object v3, p1

    .line 142
    :goto_2
    const-string p1, "testID"

    invoke-virtual {v3, p1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 143
    invoke-virtual {v3, p1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v8, p1}, Landroid/widget/DatePicker;->setTag(Ljava/lang/Object;)V

    :cond_7
    return-object v1
.end method

.method static getDialog(Landroid/os/Bundle;Landroid/content/Context;Landroid/app/DatePickerDialog$OnDateSetListener;)Landroid/app/DatePickerDialog;
    .locals 9

    .line 63
    new-instance v0, Lcom/reactcommunity/rndatetimepicker/RNDate;

    invoke-direct {v0, p0}, Lcom/reactcommunity/rndatetimepicker/RNDate;-><init>(Landroid/os/Bundle;)V

    .line 64
    invoke-virtual {v0}, Lcom/reactcommunity/rndatetimepicker/RNDate;->year()I

    move-result v4

    .line 65
    invoke-virtual {v0}, Lcom/reactcommunity/rndatetimepicker/RNDate;->month()I

    move-result v5

    .line 66
    invoke-virtual {v0}, Lcom/reactcommunity/rndatetimepicker/RNDate;->day()I

    move-result v6

    .line 68
    invoke-static {p0}, Lcom/reactcommunity/rndatetimepicker/Common;->getDisplayDate(Landroid/os/Bundle;)Lcom/reactcommunity/rndatetimepicker/RNDatePickerDisplay;

    move-result-object v0

    if-eqz p0, :cond_0

    const/4 v1, 0x0

    .line 70
    const-string v2, "display"

    invoke-virtual {p0, v2, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 71
    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/reactcommunity/rndatetimepicker/RNDatePickerDisplay;->valueOf(Ljava/lang/String;)Lcom/reactcommunity/rndatetimepicker/RNDatePickerDisplay;

    move-result-object v0

    :cond_0
    move-object v7, v0

    .line 74
    sget-object p0, Lcom/reactcommunity/rndatetimepicker/RNDatePickerDisplay;->SPINNER:Lcom/reactcommunity/rndatetimepicker/RNDatePickerDisplay;

    if-ne v7, p0, :cond_1

    .line 75
    new-instance v1, Lcom/reactcommunity/rndatetimepicker/RNDismissableDatePickerDialog;

    sget v3, Lcom/reactcommunity/rndatetimepicker/R$style;->SpinnerDatePickerDialog:I

    move-object v2, p1

    move-object v8, v7

    move v7, v6

    move v6, v5

    move v5, v4

    move-object v4, p2

    invoke-direct/range {v1 .. v8}, Lcom/reactcommunity/rndatetimepicker/RNDismissableDatePickerDialog;-><init>(Landroid/content/Context;ILandroid/app/DatePickerDialog$OnDateSetListener;IIILcom/reactcommunity/rndatetimepicker/RNDatePickerDisplay;)V

    return-object v1

    :cond_1
    move-object v2, p1

    move-object v3, p2

    .line 85
    new-instance v1, Lcom/reactcommunity/rndatetimepicker/RNDismissableDatePickerDialog;

    invoke-direct/range {v1 .. v7}, Lcom/reactcommunity/rndatetimepicker/RNDismissableDatePickerDialog;-><init>(Landroid/content/Context;Landroid/app/DatePickerDialog$OnDateSetListener;IIILcom/reactcommunity/rndatetimepicker/RNDatePickerDisplay;)V

    return-object v1
.end method

.method static synthetic lambda$createDialog$0(Landroid/os/Bundle;JJLandroid/widget/DatePicker;Landroid/widget/DatePicker;III)V
    .locals 7

    .line 132
    invoke-static {p0}, Lcom/reactcommunity/rndatetimepicker/Common;->getTimeZone(Landroid/os/Bundle;)Ljava/util/TimeZone;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v4, 0x0

    move v1, p7

    move v2, p8

    move/from16 v3, p9

    .line 133
    invoke-virtual/range {v0 .. v6}, Ljava/util/Calendar;->set(IIIIII)V

    .line 134
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide p6

    invoke-static {p6, p7, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p0

    invoke-static {p0, p1, p3, p4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p0

    .line 135
    invoke-virtual {v0, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 136
    invoke-virtual {p5}, Landroid/widget/DatePicker;->getYear()I

    move-result p0

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Ljava/util/Calendar;->get(I)I

    move-result p2

    const/4 p3, 0x5

    const/4 p4, 0x2

    if-ne p0, p2, :cond_1

    invoke-virtual {p5}, Landroid/widget/DatePicker;->getMonth()I

    move-result p0

    invoke-virtual {v0, p4}, Ljava/util/Calendar;->get(I)I

    move-result p2

    if-ne p0, p2, :cond_1

    invoke-virtual {p5}, Landroid/widget/DatePicker;->getDayOfMonth()I

    move-result p0

    invoke-virtual {v0, p3}, Ljava/util/Calendar;->get(I)I

    move-result p2

    if-eq p0, p2, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 137
    :cond_1
    :goto_0
    invoke-virtual {v0, p1}, Ljava/util/Calendar;->get(I)I

    move-result p0

    invoke-virtual {v0, p4}, Ljava/util/Calendar;->get(I)I

    move-result p1

    invoke-virtual {v0, p3}, Ljava/util/Calendar;->get(I)I

    move-result p2

    invoke-virtual {p5, p0, p1, p2}, Landroid/widget/DatePicker;->updateDate(III)V

    return-void
.end method


# virtual methods
.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 0

    .line 48
    invoke-virtual {p0}, Lcom/reactcommunity/rndatetimepicker/RNDatePickerDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    .line 49
    invoke-direct {p0, p1}, Lcom/reactcommunity/rndatetimepicker/RNDatePickerDialogFragment;->createDialog(Landroid/os/Bundle;)Landroid/app/DatePickerDialog;

    move-result-object p1

    iput-object p1, p0, Lcom/reactcommunity/rndatetimepicker/RNDatePickerDialogFragment;->instance:Landroid/app/DatePickerDialog;

    return-object p1
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 151
    invoke-super {p0, p1}, Landroidx/fragment/app/DialogFragment;->onDismiss(Landroid/content/DialogInterface;)V

    .line 152
    iget-object v0, p0, Lcom/reactcommunity/rndatetimepicker/RNDatePickerDialogFragment;->mOnDismissListener:Landroid/content/DialogInterface$OnDismissListener;

    if-eqz v0, :cond_0

    .line 153
    invoke-interface {v0, p1}, Landroid/content/DialogInterface$OnDismissListener;->onDismiss(Landroid/content/DialogInterface;)V

    :cond_0
    return-void
.end method

.method setOnDateSetListener(Landroid/app/DatePickerDialog$OnDateSetListener;)V
    .locals 0

    .line 158
    iput-object p1, p0, Lcom/reactcommunity/rndatetimepicker/RNDatePickerDialogFragment;->mOnDateSetListener:Landroid/app/DatePickerDialog$OnDateSetListener;

    return-void
.end method

.method setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 0

    .line 162
    iput-object p1, p0, Lcom/reactcommunity/rndatetimepicker/RNDatePickerDialogFragment;->mOnDismissListener:Landroid/content/DialogInterface$OnDismissListener;

    return-void
.end method

.method setOnNeutralButtonActionListener(Landroid/content/DialogInterface$OnClickListener;)V
    .locals 0

    .line 166
    iput-object p1, p0, Lcom/reactcommunity/rndatetimepicker/RNDatePickerDialogFragment;->mOnNeutralButtonActionListener:Landroid/content/DialogInterface$OnClickListener;

    return-void
.end method

.method public update(Landroid/os/Bundle;)V
    .locals 3

    .line 54
    new-instance v0, Lcom/reactcommunity/rndatetimepicker/RNDate;

    invoke-direct {v0, p1}, Lcom/reactcommunity/rndatetimepicker/RNDate;-><init>(Landroid/os/Bundle;)V

    .line 55
    iget-object p1, p0, Lcom/reactcommunity/rndatetimepicker/RNDatePickerDialogFragment;->instance:Landroid/app/DatePickerDialog;

    invoke-virtual {v0}, Lcom/reactcommunity/rndatetimepicker/RNDate;->year()I

    move-result v1

    invoke-virtual {v0}, Lcom/reactcommunity/rndatetimepicker/RNDate;->month()I

    move-result v2

    invoke-virtual {v0}, Lcom/reactcommunity/rndatetimepicker/RNDate;->day()I

    move-result v0

    invoke-virtual {p1, v1, v2, v0}, Landroid/app/DatePickerDialog;->updateDate(III)V

    return-void
.end method
