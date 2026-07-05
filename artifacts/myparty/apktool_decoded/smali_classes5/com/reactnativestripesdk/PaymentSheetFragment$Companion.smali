.class public final Lcom/reactnativestripesdk/PaymentSheetFragment$Companion;
.super Ljava/lang/Object;
.source "PaymentSheetFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/reactnativestripesdk/PaymentSheetFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J%\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0000\u00a2\u0006\u0002\u0008\u000eJ\r\u0010\u0013\u001a\u00020\u0014H\u0000\u00a2\u0006\u0002\u0008\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0000\u00a2\u0006\u0002\u0008\u0019J\u0017\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0000\u00a2\u0006\u0002\u0008\u001cJ\u0012\u0010\u001d\u001a\u00020\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0002J\u0019\u0010 \u001a\u0004\u0018\u00010!2\u0008\u0010\"\u001a\u0004\u0018\u00010\u000bH\u0000\u00a2\u0006\u0002\u0008#J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000bH\u0002J\u0019\u0010\'\u001a\u0004\u0018\u00010(2\u0008\u0010)\u001a\u0004\u0018\u00010\u000bH\u0000\u00a2\u0006\u0002\u0008*R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"
    }
    d2 = {
        "Lcom/reactnativestripesdk/PaymentSheetFragment$Companion;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "create",
        "Lcom/reactnativestripesdk/PaymentSheetFragment;",
        "context",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "arguments",
        "Landroid/os/Bundle;",
        "initPromise",
        "Lcom/facebook/react/bridge/Promise;",
        "create$stripe_stripe_react_native_release",
        "mapIntToButtonType",
        "",
        "",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;",
        "createMissingInitError",
        "Lcom/facebook/react/bridge/WritableMap;",
        "createMissingInitError$stripe_stripe_react_native_release",
        "buildGooglePayConfig",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;",
        "params",
        "buildGooglePayConfig$stripe_stripe_react_native_release",
        "buildLinkConfig",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;",
        "buildLinkConfig$stripe_stripe_react_native_release",
        "mapStringToLinkDisplay",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;",
        "value",
        "buildIntentConfiguration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;",
        "intentConfigurationParams",
        "buildIntentConfiguration$stripe_stripe_react_native_release",
        "buildIntentConfigurationMode",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;",
        "modeParams",
        "buildCustomerConfiguration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
        "bundle",
        "buildCustomerConfiguration$stripe_stripe_react_native_release",
        "stripe_stripe-react-native_release"
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

    .line 519
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/reactnativestripesdk/PaymentSheetFragment$Companion;-><init>()V

    return-void
.end method

.method private final buildIntentConfigurationMode(Landroid/os/Bundle;)Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;
    .locals 11

    .line 621
    const-string v0, "amount"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "currencyCode"

    const-string v3, "setupFutureUsage"

    if-eqz v1, :cond_1

    .line 623
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_0

    .line 627
    new-instance v4, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;

    .line 628
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-long v5, v0

    .line 630
    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/reactnativestripesdk/PaymentSheetFragmentKt;->mapToSetupFutureUse(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;

    move-result-object v8

    .line 631
    const-string v0, "captureMethod"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/reactnativestripesdk/PaymentSheetFragmentKt;->mapToCaptureMethod(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;

    move-result-object v9

    .line 632
    const-string v0, "paymentMethodOptions"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    invoke-static {p1}, Lcom/reactnativestripesdk/PaymentSheetFragmentKt;->mapToPaymentMethodOptions(Landroid/os/Bundle;)Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment$PaymentMethodOptions;

    move-result-object v10

    .line 627
    invoke-direct/range {v4 .. v10}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;-><init>(JLjava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment$PaymentMethodOptions;)V

    check-cast v4, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;

    return-object v4

    .line 624
    :cond_0
    new-instance p1, Lcom/reactnativestripesdk/utils/PaymentSheetException;

    .line 625
    const-string v0, "You must provide a value to intentConfiguration.mode.currencyCode"

    .line 624
    invoke-direct {p1, v0}, Lcom/reactnativestripesdk/utils/PaymentSheetException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 636
    :cond_1
    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/reactnativestripesdk/PaymentSheetFragmentKt;->mapToSetupFutureUse(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 640
    new-instance v1, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Setup;

    .line 641
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 640
    invoke-direct {v1, p1, v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Setup;-><init>(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;)V

    check-cast v1, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;

    return-object v1

    .line 637
    :cond_2
    new-instance p1, Lcom/reactnativestripesdk/utils/PaymentSheetException;

    .line 638
    const-string v0, "You must provide a value to intentConfiguration.mode.setupFutureUsage"

    .line 637
    invoke-direct {p1, v0}, Lcom/reactnativestripesdk/utils/PaymentSheetException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final mapStringToLinkDisplay(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;
    .locals 1

    .line 595
    const-string v0, "automatic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;->Automatic:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    return-object p1

    .line 596
    :cond_0
    const-string v0, "never"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;->Never:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    return-object p1

    .line 597
    :cond_1
    sget-object p1, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;->Automatic:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    return-object p1
.end method


# virtual methods
.method public final buildCustomerConfiguration$stripe_stripe_react_native_release(Landroid/os/Bundle;)Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/reactnativestripesdk/utils/PaymentSheetException;
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 649
    const-string v1, "customerId"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    const-string v2, ""

    if-nez v1, :cond_1

    move-object v1, v2

    :cond_1
    if-eqz p1, :cond_2

    .line 650
    const-string v3, "customerEphemeralKeySecret"

    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_2
    move-object v3, v0

    :goto_1
    if-nez v3, :cond_3

    move-object v3, v2

    :cond_3
    if-eqz p1, :cond_4

    .line 651
    const-string v4, "customerSessionClientSecret"

    invoke-virtual {p1, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_4
    move-object p1, v0

    :goto_2
    if-nez p1, :cond_5

    goto :goto_3

    :cond_5
    move-object v2, p1

    .line 652
    :goto_3
    move-object p1, v2

    check-cast p1, Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-lez v4, :cond_7

    .line 653
    move-object v4, v3

    check-cast v4, Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-gtz v4, :cond_6

    goto :goto_4

    .line 655
    :cond_6
    new-instance p1, Lcom/reactnativestripesdk/utils/PaymentSheetException;

    .line 656
    const-string v0, "`customerEphemeralKeySecret` and `customerSessionClientSecret` cannot both be set"

    .line 655
    invoke-direct {p1, v0}, Lcom/reactnativestripesdk/utils/PaymentSheetException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 658
    :cond_7
    :goto_4
    move-object v4, v1

    check-cast v4, Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-lez v5, :cond_8

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_8

    .line 659
    sget-object p1, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration$Companion;

    invoke-virtual {p1, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration$Companion;->createWithCustomerSession(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    move-result-object p1

    return-object p1

    .line 663
    :cond_8
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_9

    move-object p1, v3

    check-cast p1, Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_9

    .line 664
    new-instance p1, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    invoke-direct {p1, v1, v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1

    :cond_9
    return-object v0
.end method

.method public final buildGooglePayConfig$stripe_stripe_react_native_release(Landroid/os/Bundle;)Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;
    .locals 10

    const/4 v0, 0x0

    if-eqz p1, :cond_6

    .line 553
    invoke-virtual {p1}, Landroid/os/Bundle;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_3

    .line 557
    :cond_0
    const-string v1, "merchantCountryCode"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    if-nez v1, :cond_1

    move-object v5, v2

    goto :goto_0

    :cond_1
    move-object v5, v1

    .line 558
    :goto_0
    const-string v1, "currencyCode"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    move-object v6, v2

    goto :goto_1

    :cond_2
    move-object v6, v1

    .line 559
    :goto_1
    const-string v1, "testEnv"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    .line 560
    const-string v2, "amount"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-static {v2}, Lkotlin/text/StringsKt;->toLongOrNull(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    :cond_3
    move-object v7, v0

    .line 561
    const-string v0, "label"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 563
    invoke-static {}, Lcom/reactnativestripesdk/PaymentSheetFragment;->access$getMapIntToButtonType$cp()Ljava/util/Map;

    move-result-object v0

    const-string v2, "buttonType"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    if-nez p1, :cond_4

    .line 564
    sget-object p1, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->Pay:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    :cond_4
    move-object v9, p1

    .line 566
    new-instance v3, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;

    if-eqz v1, :cond_5

    .line 569
    sget-object p1, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;->Test:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;

    goto :goto_2

    .line 571
    :cond_5
    sget-object p1, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;->Production:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;

    :goto_2
    move-object v4, p1

    .line 566
    invoke-direct/range {v3 .. v9}, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;)V

    return-object v3

    :cond_6
    :goto_3
    return-object v0
.end method

.method public final buildIntentConfiguration$stripe_stripe_react_native_release(Landroid/os/Bundle;)Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/reactnativestripesdk/utils/PaymentSheetException;
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 606
    :cond_0
    const-string v0, "mode"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 611
    new-instance v1, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    .line 612
    invoke-direct {p0, v0}, Lcom/reactnativestripesdk/PaymentSheetFragment$Companion;->buildIntentConfigurationMode(Landroid/os/Bundle;)Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;

    move-result-object v2

    .line 614
    const-string v0, "paymentMethodTypes"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_2

    .line 615
    :cond_1
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    :cond_2
    move-object v3, p1

    const/16 v7, 0x1c

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 611
    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    .line 607
    :cond_3
    new-instance p1, Lcom/reactnativestripesdk/utils/PaymentSheetException;

    .line 608
    const-string v0, "If `intentConfiguration` is provided, `intentConfiguration.mode` is required"

    .line 607
    invoke-direct {p1, v0}, Lcom/reactnativestripesdk/utils/PaymentSheetException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final buildLinkConfig$stripe_stripe_react_native_release(Landroid/os/Bundle;)Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;
    .locals 2

    if-nez p1, :cond_0

    .line 583
    new-instance p1, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p1, v1, v0, v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    .line 586
    :cond_0
    const-string v0, "display"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/reactnativestripesdk/PaymentSheetFragment$Companion;->mapStringToLinkDisplay(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    move-result-object p1

    .line 588
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;)V

    return-object v0
.end method

.method public final create$stripe_stripe_react_native_release(Lcom/facebook/react/bridge/ReactApplicationContext;Landroid/os/Bundle;Lcom/facebook/react/bridge/Promise;)Lcom/reactnativestripesdk/PaymentSheetFragment;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initPromise"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 527
    new-instance v0, Lcom/reactnativestripesdk/PaymentSheetFragment;

    invoke-direct {v0}, Lcom/reactnativestripesdk/PaymentSheetFragment;-><init>()V

    .line 528
    invoke-static {v0, p1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->access$setContext$p(Lcom/reactnativestripesdk/PaymentSheetFragment;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 529
    invoke-static {v0, p3}, Lcom/reactnativestripesdk/PaymentSheetFragment;->access$setInitPromise$p(Lcom/reactnativestripesdk/PaymentSheetFragment;Lcom/facebook/react/bridge/Promise;)V

    .line 530
    invoke-virtual {v0, p2}, Lcom/reactnativestripesdk/PaymentSheetFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public final createMissingInitError$stripe_stripe_react_native_release()Lcom/facebook/react/bridge/WritableMap;
    .locals 2

    .line 548
    sget-object v0, Lcom/reactnativestripesdk/utils/PaymentSheetErrorType;->Failed:Lcom/reactnativestripesdk/utils/PaymentSheetErrorType;

    invoke-virtual {v0}, Lcom/reactnativestripesdk/utils/PaymentSheetErrorType;->toString()Ljava/lang/String;

    move-result-object v0

    .line 549
    const-string v1, "No payment sheet has been initialized yet. You must call `initPaymentSheet` before `presentPaymentSheet`."

    .line 547
    invoke-static {v0, v1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    return-object v0
.end method
