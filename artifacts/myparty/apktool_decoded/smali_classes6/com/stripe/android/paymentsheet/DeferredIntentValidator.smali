.class public final Lcom/stripe/android/paymentsheet/DeferredIntentValidator;
.super Ljava/lang/Object;
.source "DeferredIntentValidator.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/DeferredIntentValidator$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeferredIntentValidator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeferredIntentValidator.kt\ncom/stripe/android/paymentsheet/DeferredIntentValidator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,163:1\n1734#2,3:164\n*S KotlinDebug\n*F\n+ 1 DeferredIntentValidator.kt\ncom/stripe/android/paymentsheet/DeferredIntentValidator\n*L\n151#1:164,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000f2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0002J3\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0019\u0010\u0016\u001a\u0015\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017\u00a2\u0006\u0002\u0008\u0019H\u0002J\u001a\u0010\u001a\u001a\u00020\n2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/DeferredIntentValidator;",
        "",
        "<init>",
        "()V",
        "validate",
        "Lcom/stripe/android/model/StripeIntent;",
        "stripeIntent",
        "intentConfiguration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;",
        "allowsManualConfirmation",
        "",
        "validatePaymentMethod",
        "",
        "intent",
        "paymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
        "isSimilarPaymentMethod",
        "providedPaymentMethod",
        "attachedPaymentMethod",
        "isSameFingerprint",
        "firstPaymentMethod",
        "secondPaymentMethod",
        "fingerprintProvider",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "validatePaymentMethodOptionsSetupFutureUsage",
        "paramsPaymentMethodOptionsJsonString",
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


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/DeferredIntentValidator;


# direct methods
.method public static synthetic $r8$lambda$MZwF4I1tAMy8AIHfxfqDsFtMoVw(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/DeferredIntentValidator;->isSimilarPaymentMethod$lambda$9(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$PkPhePkVLmuzdEdTEt3Vwz60gw0(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/DeferredIntentValidator;->isSimilarPaymentMethod$lambda$11(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$mMumlABEJmmFpcWovwHYnWzUTs0(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/DeferredIntentValidator;->isSimilarPaymentMethod$lambda$10(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$okDiih_hXtMwNOzy17GCehiPD1k(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/DeferredIntentValidator;->isSimilarPaymentMethod$lambda$8(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$saElxHVkSXtEOBjgVJ35p2Onyh4(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/DeferredIntentValidator;->isSimilarPaymentMethod$lambda$12(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/DeferredIntentValidator;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/DeferredIntentValidator;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/DeferredIntentValidator;->INSTANCE:Lcom/stripe/android/paymentsheet/DeferredIntentValidator;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final isSameFingerprint(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lkotlin/jvm/functions/Function1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 133
    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 134
    invoke-interface {p3, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 140
    :cond_0
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method private final isSimilarPaymentMethod(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethod;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p2, :cond_7

    .line 103
    iget-object v1, p1, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v2, p2, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    if-eq v1, v2, :cond_0

    goto :goto_1

    .line 108
    :cond_0
    iget-object v1, p1, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    if-nez v1, :cond_1

    const/4 v1, -0x1

    goto :goto_0

    :cond_1
    sget-object v2, Lcom/stripe/android/paymentsheet/DeferredIntentValidator$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Lcom/stripe/android/model/PaymentMethod$Type;->ordinal()I

    move-result v1

    aget v1, v2, v1

    :goto_0
    const/4 v2, 0x1

    if-eq v1, v2, :cond_6

    const/4 v2, 0x2

    if-eq v1, v2, :cond_5

    const/4 v2, 0x3

    if-eq v1, v2, :cond_4

    const/4 v2, 0x4

    if-eq v1, v2, :cond_3

    const/4 v2, 0x5

    if-eq v1, v2, :cond_2

    return v0

    .line 121
    :cond_2
    new-instance v0, Lcom/stripe/android/paymentsheet/DeferredIntentValidator$$ExternalSyntheticLambda4;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/DeferredIntentValidator$$ExternalSyntheticLambda4;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lcom/stripe/android/paymentsheet/DeferredIntentValidator;->isSameFingerprint(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lkotlin/jvm/functions/Function1;)Z

    move-result p1

    return p1

    .line 118
    :cond_3
    new-instance v0, Lcom/stripe/android/paymentsheet/DeferredIntentValidator$$ExternalSyntheticLambda3;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/DeferredIntentValidator$$ExternalSyntheticLambda3;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lcom/stripe/android/paymentsheet/DeferredIntentValidator;->isSameFingerprint(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lkotlin/jvm/functions/Function1;)Z

    move-result p1

    return p1

    .line 115
    :cond_4
    new-instance v0, Lcom/stripe/android/paymentsheet/DeferredIntentValidator$$ExternalSyntheticLambda2;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/DeferredIntentValidator$$ExternalSyntheticLambda2;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lcom/stripe/android/paymentsheet/DeferredIntentValidator;->isSameFingerprint(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lkotlin/jvm/functions/Function1;)Z

    move-result p1

    return p1

    .line 112
    :cond_5
    new-instance v0, Lcom/stripe/android/paymentsheet/DeferredIntentValidator$$ExternalSyntheticLambda1;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/DeferredIntentValidator$$ExternalSyntheticLambda1;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lcom/stripe/android/paymentsheet/DeferredIntentValidator;->isSameFingerprint(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lkotlin/jvm/functions/Function1;)Z

    move-result p1

    return p1

    .line 109
    :cond_6
    new-instance v0, Lcom/stripe/android/paymentsheet/DeferredIntentValidator$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/DeferredIntentValidator$$ExternalSyntheticLambda0;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lcom/stripe/android/paymentsheet/DeferredIntentValidator;->isSameFingerprint(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lkotlin/jvm/functions/Function1;)Z

    move-result p1

    return p1

    :cond_7
    :goto_1
    return v0
.end method

.method private static final isSimilarPaymentMethod$lambda$10(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/String;
    .locals 1

    const-string v0, "$this$isSameFingerprint"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    iget-object p0, p0, Lcom/stripe/android/model/PaymentMethod;->auBecsDebit:Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;

    if-eqz p0, :cond_0

    iget-object p0, p0, Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;->fingerprint:Ljava/lang/String;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final isSimilarPaymentMethod$lambda$11(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/String;
    .locals 1

    const-string v0, "$this$isSameFingerprint"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    iget-object p0, p0, Lcom/stripe/android/model/PaymentMethod;->bacsDebit:Lcom/stripe/android/model/PaymentMethod$BacsDebit;

    if-eqz p0, :cond_0

    iget-object p0, p0, Lcom/stripe/android/model/PaymentMethod$BacsDebit;->fingerprint:Ljava/lang/String;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final isSimilarPaymentMethod$lambda$12(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/String;
    .locals 1

    const-string v0, "$this$isSameFingerprint"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    iget-object p0, p0, Lcom/stripe/android/model/PaymentMethod;->sepaDebit:Lcom/stripe/android/model/PaymentMethod$SepaDebit;

    if-eqz p0, :cond_0

    iget-object p0, p0, Lcom/stripe/android/model/PaymentMethod$SepaDebit;->fingerprint:Ljava/lang/String;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final isSimilarPaymentMethod$lambda$8(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/String;
    .locals 1

    const-string v0, "$this$isSameFingerprint"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    iget-object p0, p0, Lcom/stripe/android/model/PaymentMethod;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    if-eqz p0, :cond_0

    iget-object p0, p0, Lcom/stripe/android/model/PaymentMethod$Card;->fingerprint:Ljava/lang/String;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final isSimilarPaymentMethod$lambda$9(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/String;
    .locals 1

    const-string v0, "$this$isSameFingerprint"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    iget-object p0, p0, Lcom/stripe/android/model/PaymentMethod;->usBankAccount:Lcom/stripe/android/model/PaymentMethod$USBankAccount;

    if-eqz p0, :cond_0

    iget-object p0, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->fingerprint:Ljava/lang/String;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private final validatePaymentMethodOptionsSetupFutureUsage(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;)Z
    .locals 7

    if-eqz p1, :cond_0

    .line 148
    sget-object v0, Lcom/stripe/android/core/model/StripeJsonUtils;->INSTANCE:Lcom/stripe/android/core/model/StripeJsonUtils;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/core/model/StripeJsonUtils;->jsonObjectToMap(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object p1

    if-nez p1, :cond_1

    .line 149
    :cond_0
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p1

    .line 151
    :cond_1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 164
    instance-of v0, p1, Ljava/util/Collection;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    .line 165
    :cond_2
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 151
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 152
    instance-of v3, v0, Ljava/util/Map;

    const/4 v4, 0x0

    if-eqz v3, :cond_4

    check-cast v0, Ljava/util/Map;

    goto :goto_0

    :cond_4
    move-object v0, v4

    :goto_0
    const-string v3, "setup_future_usage"

    if-eqz v0, :cond_5

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_5
    move-object v0, v4

    :goto_1
    instance-of v5, v0, Ljava/lang/String;

    if-eqz v5, :cond_6

    check-cast v0, Ljava/lang/String;

    goto :goto_2

    :cond_6
    move-object v0, v4

    .line 153
    :goto_2
    invoke-interface {p2}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethodOptions()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Ljava/util/Map;

    if-eqz v6, :cond_7

    check-cast v5, Ljava/util/Map;

    goto :goto_3

    :cond_7
    move-object v5, v4

    :goto_3
    if-eqz v5, :cond_8

    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 154
    :cond_8
    invoke-interface {p2}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethodTypes()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 155
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_4

    :cond_9
    move v0, v1

    :goto_4
    if-nez v0, :cond_3

    const/4 p1, 0x0

    return p1

    :cond_a
    return v1
.end method


# virtual methods
.method public final validate(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Z)Lcom/stripe/android/model/StripeIntent;
    .locals 7

    const-string v0, "stripeIntent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intentConfiguration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-static {p2}, Lcom/stripe/android/paymentsheet/IntentConfigurationKtxKt;->toDeferredIntentParams(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;)Lcom/stripe/android/model/DeferredIntentParams;

    move-result-object p2

    .line 26
    instance-of v0, p1, Lcom/stripe/android/model/PaymentIntent;

    const-string v1, ")."

    const/4 v2, 0x0

    if-eqz v0, :cond_9

    .line 27
    invoke-virtual {p2}, Lcom/stripe/android/model/DeferredIntentParams;->getMode()Lcom/stripe/android/model/DeferredIntentParams$Mode;

    move-result-object p2

    instance-of v0, p2, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;

    goto :goto_0

    :cond_0
    move-object p2, v2

    :goto_0
    if-eqz p2, :cond_8

    .line 32
    invoke-virtual {p2}, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->getCurrency()Ljava/lang/String;

    move-result-object v0

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "toLowerCase(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p1

    check-cast v4, Lcom/stripe/android/model/PaymentIntent;

    invoke-virtual {v4}, Lcom/stripe/android/model/PaymentIntent;->getCurrency()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    move-object v5, v2

    :goto_1
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 33
    invoke-virtual {v4}, Lcom/stripe/android/model/PaymentIntent;->getCurrency()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    sget-object p3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, p3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    :cond_2
    invoke-virtual {p2}, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->getCurrency()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, p2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Your PaymentIntent currency ("

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string p3, ") does not match the PaymentSheet.IntentConfiguration currency ("

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 32
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 38
    :cond_3
    invoke-virtual {p2}, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->getSetupFutureUsage()Lcom/stripe/android/model/StripeIntent$Usage;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/DeferredIntentValidatorKt;->access$isNull(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v4}, Lcom/stripe/android/model/PaymentIntent;->getSetupFutureUsage()Lcom/stripe/android/model/StripeIntent$Usage;

    move-result-object v2

    invoke-static {v2}, Lcom/stripe/android/paymentsheet/DeferredIntentValidatorKt;->access$isNull(Ljava/lang/Object;)Z

    move-result v2

    if-ne v0, v2, :cond_7

    .line 48
    invoke-virtual {v4}, Lcom/stripe/android/model/PaymentIntent;->getConfirmationMethod()Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;->Manual:Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;

    if-ne v0, v1, :cond_5

    if-eqz p3, :cond_4

    goto :goto_2

    .line 49
    :cond_4
    invoke-virtual {v4}, Lcom/stripe/android/model/PaymentIntent;->getConfirmationMethod()Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Your PaymentIntent confirmationMethod ("

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p2, ") can only be used with PaymentSheet.FlowController."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 48
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 55
    :cond_5
    :goto_2
    invoke-virtual {p2}, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->getPaymentMethodOptionsJsonString()Ljava/lang/String;

    move-result-object p3

    .line 54
    invoke-direct {p0, p3, p1}, Lcom/stripe/android/paymentsheet/DeferredIntentValidator;->validatePaymentMethodOptionsSetupFutureUsage(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;)Z

    move-result p3

    if-eqz p3, :cond_6

    return-object p1

    .line 60
    :cond_6
    invoke-virtual {v4}, Lcom/stripe/android/model/PaymentIntent;->getPaymentMethodOptions()Ljava/util/Map;

    move-result-object p1

    .line 62
    invoke-virtual {p2}, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->getPaymentMethodOptionsJsonString()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Your PaymentIntent payment_method_options setup_future_usage values ("

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p3, " do not match the values provided in PaymentSheet.IntentConfiguration.Mode.Payment.PaymentMethodOptions ("

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p2, ")"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 53
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 39
    :cond_7
    invoke-virtual {v4}, Lcom/stripe/android/model/PaymentIntent;->getSetupFutureUsage()Lcom/stripe/android/model/StripeIntent$Usage;

    move-result-object p1

    .line 41
    invoke-virtual {p2}, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->getSetupFutureUsage()Lcom/stripe/android/model/StripeIntent$Usage;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Your PaymentIntent setupFutureUsage ("

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p3, ") does not match the PaymentSheet.IntentConfiguration setupFutureUsage ("

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 38
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 27
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "You returned a PaymentIntent client secret but used a PaymentSheet.IntentConfiguration in setup mode."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 65
    :cond_9
    instance-of p3, p1, Lcom/stripe/android/model/SetupIntent;

    if-eqz p3, :cond_d

    .line 66
    invoke-virtual {p2}, Lcom/stripe/android/model/DeferredIntentParams;->getMode()Lcom/stripe/android/model/DeferredIntentParams$Mode;

    move-result-object p2

    instance-of p3, p2, Lcom/stripe/android/model/DeferredIntentParams$Mode$Setup;

    if-eqz p3, :cond_a

    move-object v2, p2

    check-cast v2, Lcom/stripe/android/model/DeferredIntentParams$Mode$Setup;

    :cond_a
    if-eqz v2, :cond_c

    .line 71
    invoke-virtual {v2}, Lcom/stripe/android/model/DeferredIntentParams$Mode$Setup;->getSetupFutureUsage()Lcom/stripe/android/model/StripeIntent$Usage;

    move-result-object p2

    invoke-static {p2}, Lcom/stripe/android/paymentsheet/DeferredIntentValidatorKt;->access$isNull(Ljava/lang/Object;)Z

    move-result p2

    move-object p3, p1

    check-cast p3, Lcom/stripe/android/model/SetupIntent;

    invoke-virtual {p3}, Lcom/stripe/android/model/SetupIntent;->getUsage()Lcom/stripe/android/model/StripeIntent$Usage;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/DeferredIntentValidatorKt;->access$isNull(Ljava/lang/Object;)Z

    move-result v0

    if-ne p2, v0, :cond_b

    return-object p1

    .line 72
    :cond_b
    invoke-virtual {p3}, Lcom/stripe/android/model/SetupIntent;->getUsage()Lcom/stripe/android/model/StripeIntent$Usage;

    move-result-object p1

    .line 73
    invoke-virtual {p3}, Lcom/stripe/android/model/SetupIntent;->getUsage()Lcom/stripe/android/model/StripeIntent$Usage;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Your SetupIntent usage ("

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p3, ") does not match the PaymentSheet.IntentConfiguration usage ("

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 71
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 66
    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "You returned a SetupIntent client secret but used a PaymentSheet.IntentConfiguration in payment mode."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 25
    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final validatePaymentMethod(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/PaymentMethod;)V
    .locals 2

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethod"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethodId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    if-eqz v0, :cond_3

    .line 89
    iget-object v1, p2, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 90
    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    invoke-direct {p0, p2, p1}, Lcom/stripe/android/paymentsheet/DeferredIntentValidator;->isSimilarPaymentMethod(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethod;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    .line 93
    :cond_2
    iget-object p1, p2, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Your payment method ("

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v0, ") attached to the intent does not match the provided payment method ("

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p2, ")!"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 87
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    :goto_1
    return-void
.end method
