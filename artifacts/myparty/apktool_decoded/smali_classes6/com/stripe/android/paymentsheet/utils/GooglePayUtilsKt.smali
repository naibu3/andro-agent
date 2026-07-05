.class public final Lcom/stripe/android/paymentsheet/utils/GooglePayUtilsKt;
.super Ljava/lang/Object;
.source "GooglePayUtils.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/utils/GooglePayUtilsKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u001a\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "asGooglePayButtonType",
        "Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;",
        "getAsGooglePayButtonType",
        "(Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;)Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;",
        "paymentsheet_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final getAsGooglePayButtonType(Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;)Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    .line 7
    :cond_0
    sget-object v0, Lcom/stripe/android/paymentsheet/utils/GooglePayUtilsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->ordinal()I

    move-result p0

    aget p0, v0, p0

    :goto_0
    packed-switch p0, :pswitch_data_0

    :pswitch_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 14
    :pswitch_1
    sget-object p0, Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;->Plain:Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;

    return-object p0

    .line 13
    :pswitch_2
    sget-object p0, Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;->Subscribe:Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;

    return-object p0

    .line 12
    :pswitch_3
    sget-object p0, Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;->Order:Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;

    return-object p0

    .line 11
    :pswitch_4
    sget-object p0, Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;->Donate:Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;

    return-object p0

    .line 10
    :pswitch_5
    sget-object p0, Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;->Checkout:Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;

    return-object p0

    .line 9
    :pswitch_6
    sget-object p0, Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;->Book:Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;

    return-object p0

    .line 8
    :pswitch_7
    sget-object p0, Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;->Buy:Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;

    return-object p0

    .line 16
    :pswitch_8
    sget-object p0, Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;->Pay:Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_8
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_8
    .end packed-switch
.end method
