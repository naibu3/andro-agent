.class public final Lcom/stripe/android/paymentsheet/state/WalletsState$Companion;
.super Ljava/lang/Object;
.source "WalletsState.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/state/WalletsState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/state/WalletsState$Companion$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWalletsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletsState.kt\ncom/stripe/android/paymentsheet/state/WalletsState$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003Ju\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u00072\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00132\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0016\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/state/WalletsState$Companion;",
        "",
        "<init>",
        "()V",
        "create",
        "Lcom/stripe/android/paymentsheet/state/WalletsState;",
        "isLinkAvailable",
        "",
        "linkEmail",
        "",
        "isGooglePayReady",
        "googlePayButtonType",
        "Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;",
        "buttonsEnabled",
        "paymentMethodTypes",
        "",
        "googlePayLauncherConfig",
        "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;",
        "onGooglePayPressed",
        "Lkotlin/Function0;",
        "",
        "onLinkPressed",
        "isSetupIntent",
        "(Ljava/lang/Boolean;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/model/GooglePayButtonType;ZLjava/util/List;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)Lcom/stripe/android/paymentsheet/state/WalletsState;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/state/WalletsState$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Boolean;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/model/GooglePayButtonType;ZLjava/util/List;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)Lcom/stripe/android/paymentsheet/state/WalletsState;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;",
            "Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;Z)",
            "Lcom/stripe/android/paymentsheet/state/WalletsState;"
        }
    .end annotation

    const-string v0, "googlePayButtonType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodTypes"

    move-object v1, p6

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onGooglePayPressed"

    move-object/from16 v6, p8

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLinkPressed"

    move-object/from16 v7, p9

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 45
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz p1, :cond_0

    .line 47
    new-instance p1, Lcom/stripe/android/paymentsheet/state/WalletsState$Link;

    .line 48
    sget-object v4, Lcom/stripe/android/link/ui/LinkButtonState;->Companion:Lcom/stripe/android/link/ui/LinkButtonState$Companion;

    invoke-virtual {v4, p2, v3, v2}, Lcom/stripe/android/link/ui/LinkButtonState$Companion;->create(Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Z)Lcom/stripe/android/link/ui/LinkButtonState;

    move-result-object p2

    .line 47
    invoke-direct {p1, p2}, Lcom/stripe/android/paymentsheet/state/WalletsState$Link;-><init>(Lcom/stripe/android/link/ui/LinkButtonState;)V

    goto :goto_0

    :cond_0
    move-object p1, v3

    :goto_0
    if-eqz p7, :cond_1

    .line 59
    invoke-virtual/range {p7 .. p7}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;->getAllowCreditCards()Z

    move-result v2

    :cond_1
    if-eqz p7, :cond_4

    .line 62
    new-instance p2, Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;

    .line 63
    invoke-virtual/range {p7 .. p7}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;->getBillingAddressConfig()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;->isRequired()Z

    move-result v4

    .line 64
    invoke-virtual/range {p7 .. p7}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;->getBillingAddressConfig()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;->getFormat()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig$Format;

    move-result-object v5

    sget-object v8, Lcom/stripe/android/paymentsheet/state/WalletsState$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v5}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig$Format;->ordinal()I

    move-result v5

    aget v5, v8, v5

    if-eq v5, v0, :cond_3

    const/4 v0, 0x2

    if-ne v5, v0, :cond_2

    .line 69
    sget-object v0, Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;->Full:Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;

    goto :goto_1

    .line 64
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 66
    :cond_3
    sget-object v0, Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;->Min:Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;

    .line 72
    :goto_1
    invoke-virtual/range {p7 .. p7}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;->getBillingAddressConfig()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;->isPhoneNumberRequired()Z

    move-result v5

    .line 62
    invoke-direct {p2, v4, v0, v5}, Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;-><init>(ZLcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;Z)V

    goto :goto_2

    :cond_4
    move-object p2, v3

    .line 58
    :goto_2
    new-instance v0, Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;

    invoke-direct {v0, p4, v2, p2}, Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;-><init>(Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;ZLcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;)V

    if-eqz p3, :cond_5

    goto :goto_3

    :cond_5
    move-object v0, v3

    :goto_3
    if-nez p1, :cond_7

    if-eqz v0, :cond_6

    goto :goto_4

    :cond_6
    return-object v3

    .line 78
    :cond_7
    :goto_4
    new-instance v1, Lcom/stripe/android/paymentsheet/state/WalletsState;

    .line 82
    invoke-static {p6}, Lkotlin/collections/CollectionsKt;->singleOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    sget-object p3, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object p3, p3, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    if-nez p10, :cond_8

    .line 83
    sget p2, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_or_pay_with_card:I

    :goto_5
    move-object v2, p1

    move v5, p2

    move v4, p5

    move-object v3, v0

    goto :goto_6

    .line 84
    :cond_8
    invoke-static {p6}, Lkotlin/collections/CollectionsKt;->singleOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_9

    if-nez p10, :cond_9

    .line 85
    sget p2, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_or_pay_using:I

    goto :goto_5

    .line 86
    :cond_9
    invoke-static {p6}, Lkotlin/collections/CollectionsKt;->singleOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    sget-object p3, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object p3, p3, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_a

    if-eqz p10, :cond_a

    .line 87
    sget p2, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_or_use_a_card:I

    goto :goto_5

    .line 89
    :cond_a
    sget p2, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_or_use:I

    goto :goto_5

    .line 78
    :goto_6
    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/state/WalletsState;-><init>(Lcom/stripe/android/paymentsheet/state/WalletsState$Link;Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;ZILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    return-object v1
.end method
