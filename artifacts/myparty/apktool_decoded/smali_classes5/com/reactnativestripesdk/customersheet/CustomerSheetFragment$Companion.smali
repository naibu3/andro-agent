.class public final Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;
.super Ljava/lang/Object;
.source "CustomerSheetFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0007H\u0000\u00a2\u0006\u0002\u0008\u0008J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0000\u00a2\u0006\u0002\u0008\rJ\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000cH\u0000\u00a2\u0006\u0002\u0008\u0010J9\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u000cH\u0000\u00a2\u0006\u0002\u0008\u0019J\u0017\u0010\u001a\u001a\u00020\u00072\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0000\u00a2\u0006\u0002\u0008\u001dJ\"\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!2\u0008\u0010\"\u001a\u0004\u0018\u00010#H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"
    }
    d2 = {
        "Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "createMissingInitError",
        "Lcom/facebook/react/bridge/WritableMap;",
        "createMissingInitError$stripe_stripe_react_native_release",
        "createDefaultBillingDetails",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;",
        "bundle",
        "Landroid/os/Bundle;",
        "createDefaultBillingDetails$stripe_stripe_react_native_release",
        "createBillingDetailsCollectionConfiguration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;",
        "createBillingDetailsCollectionConfiguration$stripe_stripe_react_native_release",
        "createCustomerAdapter",
        "Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;",
        "context",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "customerId",
        "customerEphemeralKeySecret",
        "setupIntentClientSecret",
        "customerAdapterOverrideParams",
        "createCustomerAdapter$stripe_stripe_react_native_release",
        "createPaymentOptionResult",
        "selection",
        "Lcom/stripe/android/customersheet/PaymentOptionSelection;",
        "createPaymentOptionResult$stripe_stripe_react_native_release",
        "buildResult",
        "label",
        "drawable",
        "Landroid/graphics/drawable/Drawable;",
        "paymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
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
.method public static synthetic $r8$lambda$k9EqX9u947TCYfPFc7y1yvpTPhc(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/customersheet/CustomerAdapter$Result;
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;->createCustomerAdapter$lambda$0(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/customersheet/CustomerAdapter$Result;

    move-result-object p0

    return-object p0
.end method

.method private constructor <init>()V
    .locals 0

    .line 281
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$createCustomerAdapter$suspendConversion0(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 281
    invoke-static {p0, p1}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;->createCustomerAdapter$suspendConversion0(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$createCustomerAdapter$suspendConversion1(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 281
    invoke-static {p0, p1}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;->createCustomerAdapter$suspendConversion1(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final buildResult(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lcom/stripe/android/model/PaymentMethod;)Lcom/facebook/react/bridge/WritableMap;
    .locals 3

    .line 397
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    const-string v1, "createMap(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 399
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v1

    .line 400
    const-string v2, "label"

    invoke-interface {v1, v2, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 401
    invoke-static {p2}, Lcom/reactnativestripesdk/PaymentSheetFragmentKt;->getBitmapFromDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-static {p1}, Lcom/reactnativestripesdk/PaymentSheetFragmentKt;->getBase64FromBitmap(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "image"

    invoke-interface {v1, p2, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 399
    const-string p1, "also(...)"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 403
    const-string p1, "paymentOption"

    check-cast v1, Lcom/facebook/react/bridge/ReadableMap;

    invoke-interface {v0, p1, v1}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    if-eqz p3, :cond_0

    .line 405
    invoke-static {p3}, Lcom/reactnativestripesdk/utils/MappersKt;->mapFromPaymentMethod(Lcom/stripe/android/model/PaymentMethod;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/bridge/ReadableMap;

    const-string p2, "paymentMethod"

    invoke-interface {v0, p2, p1}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    :cond_0
    return-object v0
.end method

.method private static final createCustomerAdapter$lambda$0(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/customersheet/CustomerAdapter$Result;
    .locals 2

    .line 323
    sget-object v0, Lcom/stripe/android/customersheet/CustomerAdapter$Result;->Companion:Lcom/stripe/android/customersheet/CustomerAdapter$Result$Companion;

    .line 324
    sget-object v1, Lcom/stripe/android/customersheet/CustomerEphemeralKey;->Companion:Lcom/stripe/android/customersheet/CustomerEphemeralKey$Companion;

    invoke-virtual {v1, p0, p1}, Lcom/stripe/android/customersheet/CustomerEphemeralKey$Companion;->create(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/customersheet/CustomerEphemeralKey;

    move-result-object p0

    .line 323
    invoke-virtual {v0, p0}, Lcom/stripe/android/customersheet/CustomerAdapter$Result$Companion;->success(Ljava/lang/Object;)Lcom/stripe/android/customersheet/CustomerAdapter$Result;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic createCustomerAdapter$suspendConversion0(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 334
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic createCustomerAdapter$suspendConversion1(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 344
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final createBillingDetailsCollectionConfiguration$stripe_stripe_react_native_release(Landroid/os/Bundle;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;
    .locals 7

    const-string v0, "bundle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 307
    new-instance v1, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    .line 308
    const-string v0, "name"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/reactnativestripesdk/PaymentSheetFragmentKt;->mapToCollectionMode(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;

    move-result-object v2

    .line 309
    const-string v0, "phone"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/reactnativestripesdk/PaymentSheetFragmentKt;->mapToCollectionMode(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;

    move-result-object v3

    .line 310
    const-string v0, "email"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/reactnativestripesdk/PaymentSheetFragmentKt;->mapToCollectionMode(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;

    move-result-object v4

    .line 311
    const-string v0, "address"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/reactnativestripesdk/PaymentSheetFragmentKt;->mapToAddressCollectionMode(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;

    move-result-object v5

    .line 312
    const-string v0, "attachDefaultsToPaymentMethod"

    const/4 v6, 0x0

    invoke-virtual {p1, v0, v6}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v6

    .line 307
    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;Z)V

    return-object v1
.end method

.method public final createCustomerAdapter$stripe_stripe_react_native_release(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;
    .locals 9

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerEphemeralKeySecret"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 322
    new-instance v0, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion$$ExternalSyntheticLambda0;

    invoke-direct {v0, p2, p3}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion$$ExternalSyntheticLambda0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p4, :cond_0

    .line 332
    sget-object v1, Lcom/stripe/android/customersheet/CustomerAdapter;->Companion:Lcom/stripe/android/customersheet/CustomerAdapter$Companion;

    .line 333
    move-object v2, p1

    check-cast v2, Landroid/content/Context;

    .line 334
    new-instance p2, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion$createCustomerAdapter$customerAdapter$1;

    invoke-direct {p2, v0}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion$createCustomerAdapter$customerAdapter$1;-><init>(Lkotlin/jvm/functions/Function0;)V

    move-object v3, p2

    check-cast v3, Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;

    .line 332
    new-instance p2, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion$createCustomerAdapter$customerAdapter$2;

    invoke-direct {p2, p4}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion$createCustomerAdapter$customerAdapter$2;-><init>(Ljava/lang/String;)V

    move-object v4, p2

    check-cast v4, Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/customersheet/CustomerAdapter$Companion;->create$default(Lcom/stripe/android/customersheet/CustomerAdapter$Companion;Landroid/content/Context;Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/customersheet/CustomerAdapter;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, v0

    .line 342
    sget-object v0, Lcom/stripe/android/customersheet/CustomerAdapter;->Companion:Lcom/stripe/android/customersheet/CustomerAdapter$Companion;

    .line 343
    move-object v1, p1

    check-cast v1, Landroid/content/Context;

    .line 344
    new-instance p3, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion$createCustomerAdapter$customerAdapter$3;

    invoke-direct {p3, p2}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion$createCustomerAdapter$customerAdapter$3;-><init>(Lkotlin/jvm/functions/Function0;)V

    move-object v2, p3

    check-cast v2, Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 342
    invoke-static/range {v0 .. v6}, Lcom/stripe/android/customersheet/CustomerAdapter$Companion;->create$default(Lcom/stripe/android/customersheet/CustomerAdapter$Companion;Landroid/content/Context;Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/customersheet/CustomerAdapter;

    move-result-object p2

    :goto_0
    move-object v2, p2

    .line 349
    new-instance v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;

    const/4 p2, 0x0

    if-eqz p5, :cond_1

    .line 353
    const-string p3, "fetchPaymentMethods"

    invoke-virtual {p5, p3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p3

    move v3, p3

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    if-eqz p5, :cond_2

    .line 355
    const-string p3, "attachPaymentMethod"

    invoke-virtual {p5, p3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p3

    move v4, p3

    goto :goto_2

    :cond_2
    move v4, p2

    :goto_2
    if-eqz p5, :cond_3

    .line 357
    const-string p3, "detachPaymentMethod"

    invoke-virtual {p5, p3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p3

    move v5, p3

    goto :goto_3

    :cond_3
    move v5, p2

    :goto_3
    if-eqz p5, :cond_4

    .line 359
    const-string p3, "setSelectedPaymentOption"

    invoke-virtual {p5, p3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p3

    move v6, p3

    goto :goto_4

    :cond_4
    move v6, p2

    :goto_4
    if-eqz p5, :cond_5

    .line 361
    const-string p3, "fetchSelectedPaymentOption"

    invoke-virtual {p5, p3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p3

    move v7, p3

    goto :goto_5

    :cond_5
    move v7, p2

    :goto_5
    if-eqz p5, :cond_6

    .line 363
    const-string p2, "setupIntentClientSecretForCustomerAttach"

    invoke-virtual {p5, p2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p2

    :cond_6
    move-object v1, p1

    move v8, p2

    .line 349
    invoke-direct/range {v0 .. v8}, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/stripe/android/customersheet/CustomerAdapter;ZZZZZZ)V

    return-object v0
.end method

.method public final createDefaultBillingDetails$stripe_stripe_react_native_release(Landroid/os/Bundle;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;
    .locals 9

    const-string v0, "bundle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 288
    const-string v0, "address"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 290
    new-instance v1, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 291
    const-string v3, "city"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    if-eqz v0, :cond_1

    .line 292
    const-string v4, "country"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, v2

    :goto_1
    if-eqz v0, :cond_2

    .line 293
    const-string v5, "line1"

    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :cond_2
    move-object v5, v2

    :goto_2
    if-eqz v0, :cond_3

    .line 294
    const-string v6, "line2"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_3

    :cond_3
    move-object v6, v2

    :goto_3
    if-eqz v0, :cond_4

    .line 295
    const-string v7, "postalCode"

    invoke-virtual {v0, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto :goto_4

    :cond_4
    move-object v7, v2

    :goto_4
    if-eqz v0, :cond_5

    .line 296
    const-string v2, "state"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_5
    move-object v8, v7

    move-object v7, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v8

    .line 290
    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    .line 300
    const-string v2, "email"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 301
    const-string v3, "name"

    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 302
    const-string v4, "phone"

    invoke-virtual {p1, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 298
    invoke-direct {v0, v1, v2, v3, p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final createMissingInitError$stripe_stripe_react_native_release()Lcom/facebook/react/bridge/WritableMap;
    .locals 2

    .line 285
    sget-object v0, Lcom/reactnativestripesdk/utils/ErrorType;->Failed:Lcom/reactnativestripesdk/utils/ErrorType;

    invoke-virtual {v0}, Lcom/reactnativestripesdk/utils/ErrorType;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "No customer sheet has been initialized yet."

    invoke-static {v0, v1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    return-object v0
.end method

.method public final createPaymentOptionResult$stripe_stripe_react_native_release(Lcom/stripe/android/customersheet/PaymentOptionSelection;)Lcom/facebook/react/bridge/WritableMap;
    .locals 2

    .line 369
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    const-string v1, "createMap(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 372
    instance-of v1, p1, Lcom/stripe/android/customersheet/PaymentOptionSelection$GooglePay;

    if-eqz v1, :cond_0

    .line 374
    check-cast p1, Lcom/stripe/android/customersheet/PaymentOptionSelection$GooglePay;

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/PaymentOptionSelection$GooglePay;->getPaymentOption()Lcom/stripe/android/paymentsheet/model/PaymentOption;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/model/PaymentOption;->getLabel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/PaymentOptionSelection$GooglePay;->getPaymentOption()Lcom/stripe/android/paymentsheet/model/PaymentOption;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentOption;->icon()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;->buildResult(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lcom/stripe/android/model/PaymentMethod;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    return-object p1

    .line 377
    :cond_0
    instance-of v1, p1, Lcom/stripe/android/customersheet/PaymentOptionSelection$PaymentMethod;

    if-eqz v1, :cond_1

    .line 380
    check-cast p1, Lcom/stripe/android/customersheet/PaymentOptionSelection$PaymentMethod;

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/PaymentOptionSelection$PaymentMethod;->getPaymentOption()Lcom/stripe/android/paymentsheet/model/PaymentOption;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/model/PaymentOption;->getLabel()Ljava/lang/String;

    move-result-object v0

    .line 381
    invoke-virtual {p1}, Lcom/stripe/android/customersheet/PaymentOptionSelection$PaymentMethod;->getPaymentOption()Lcom/stripe/android/paymentsheet/model/PaymentOption;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/model/PaymentOption;->icon()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 382
    invoke-virtual {p1}, Lcom/stripe/android/customersheet/PaymentOptionSelection$PaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    .line 379
    invoke-direct {p0, v0, v1, p1}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;->buildResult(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lcom/stripe/android/model/PaymentMethod;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    return-object p1

    :cond_1
    if-nez p1, :cond_2

    return-object v0

    .line 371
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
