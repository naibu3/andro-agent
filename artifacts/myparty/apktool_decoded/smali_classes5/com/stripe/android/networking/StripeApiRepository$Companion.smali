.class public final Lcom/stripe/android/networking/StripeApiRepository$Companion;
.super Ljava/lang/Object;
.source "StripeApiRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/networking/StripeApiRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStripeApiRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeApiRepository.kt\ncom/stripe/android/networking/StripeApiRepository$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2298:1\n1#2:2299\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008O\n\u0002\u0010\u0011\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0002\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00082\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0015\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\u0008\u0015J\u0015\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\u0008$J\u0015\u0010%\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\u0008&J\u0015\u0010\'\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\u0008(J\u0015\u0010)\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\u0008*J\u0015\u0010+\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\u0008,J\u0015\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\u0008/J\u0015\u00100\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\u00081J\u0015\u00102\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\u00083J\u0015\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\u00086J\u001d\u00107\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\u00089J\u0015\u0010:\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\u0008<J\u0015\u0010=\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\u0008>J\u0015\u0010?\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\u0008@J\u0015\u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\u0008CJ\u001d\u0010D\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\u0008FJ\u001d\u0010G\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\u0008HJ\u0015\u0010I\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\u0008KJ\u0015\u0010L\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\u0008MJ\u0015\u0010N\u001a\u00020\u00052\u0006\u0010O\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\u0008PJ\u0015\u0010Q\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u0005H\u0000\u00a2\u0006\u0002\u0008RJ\u0015\u0010S\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\u0008TJ)\u0010U\u001a\u00020\u00052\u0006\u0010V\u001a\u00020\u00052\u0012\u0010W\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00010X\"\u00020\u0001H\u0002\u00a2\u0006\u0002\u0010YJ\u0010\u0010U\u001a\u00020\u00052\u0006\u0010V\u001a\u00020\u0005H\u0002J\u0010\u0010Z\u001a\u00020\u00052\u0006\u0010V\u001a\u00020\u0005H\u0002J\u0010\u0010[\u001a\u00020\u00052\u0006\u0010V\u001a\u00020\u0005H\u0002J(\u0010\\\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050]0\u00082\u000c\u0010^\u001a\u0008\u0012\u0004\u0012\u00020\u00050]H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00058@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00058@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00058@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00058@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00058@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u00058@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\rR\u0014\u0010\u0018\u001a\u00020\u00058@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\rR\u0014\u0010\u001a\u001a\u00020\u00058@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\rR\u0014\u0010\u001c\u001a\u00020\u00058@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\rR\u0014\u0010\u001e\u001a\u00020\u00058@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\r\u00a8\u0006_"
    }
    d2 = {
        "Lcom/stripe/android/networking/StripeApiRepository$Companion;",
        "",
        "<init>",
        "()V",
        "DNS_CACHE_TTL_PROPERTY_NAME",
        "",
        "PAYMENT_USER_AGENT",
        "createVerificationParam",
        "",
        "verificationId",
        "userOneTimeCode",
        "tokensUrl",
        "getTokensUrl$payments_core_release",
        "()Ljava/lang/String;",
        "sourcesUrl",
        "getSourcesUrl$payments_core_release",
        "paymentMethodsUrl",
        "getPaymentMethodsUrl$payments_core_release",
        "logoutConsumerUrl",
        "getLogoutConsumerUrl$payments_core_release",
        "consumerPaymentDetailsUrl",
        "getConsumerPaymentDetailsUrl$payments_core_release",
        "listConsumerPaymentDetailsUrl",
        "getListConsumerPaymentDetailsUrl$payments_core_release",
        "listShippingAddresses",
        "getListShippingAddresses$payments_core_release",
        "sharePaymentDetailsUrl",
        "getSharePaymentDetailsUrl$payments_core_release",
        "deferredFinancialConnectionsSessionUrl",
        "getDeferredFinancialConnectionsSessionUrl$payments_core_release",
        "mobileCardElementConfigUrl",
        "getMobileCardElementConfigUrl$payments_core_release",
        "getConsumerPaymentDetailsUrl",
        "paymentDetailsId",
        "getRetrievePaymentIntentUrl",
        "paymentIntentId",
        "getRetrievePaymentIntentUrl$payments_core_release",
        "getRefreshPaymentIntentUrl",
        "getRefreshPaymentIntentUrl$payments_core_release",
        "getRefreshSetupIntentUrl",
        "getRefreshSetupIntentUrl$payments_core_release",
        "getConfirmPaymentIntentUrl",
        "getConfirmPaymentIntentUrl$payments_core_release",
        "getCancelPaymentIntentSourceUrl",
        "getCancelPaymentIntentSourceUrl$payments_core_release",
        "getRetrieveSetupIntentUrl",
        "setupIntentId",
        "getRetrieveSetupIntentUrl$payments_core_release",
        "getConfirmSetupIntentUrl",
        "getConfirmSetupIntentUrl$payments_core_release",
        "getCancelSetupIntentSourceUrl",
        "getCancelSetupIntentSourceUrl$payments_core_release",
        "getAddCustomerSourceUrl",
        "customerId",
        "getAddCustomerSourceUrl$payments_core_release",
        "getDeleteCustomerSourceUrl",
        "sourceId",
        "getDeleteCustomerSourceUrl$payments_core_release",
        "getAttachPaymentMethodUrl",
        "paymentMethodId",
        "getAttachPaymentMethodUrl$payments_core_release",
        "getRetrieveCustomerUrl",
        "getRetrieveCustomerUrl$payments_core_release",
        "getRetrieveSourceApiUrl",
        "getRetrieveSourceApiUrl$payments_core_release",
        "getRetrieveTokenApiUrl",
        "tokenId",
        "getRetrieveTokenApiUrl$payments_core_release",
        "getAttachFinancialConnectionsSessionToPaymentIntentUrl",
        "financialConnectionsSessionId",
        "getAttachFinancialConnectionsSessionToPaymentIntentUrl$payments_core_release",
        "getAttachFinancialConnectionsSessionToSetupIntentUrl",
        "getAttachFinancialConnectionsSessionToSetupIntentUrl$payments_core_release",
        "getVerifyMicrodepositsOnPaymentIntentUrl",
        "clientSecret",
        "getVerifyMicrodepositsOnPaymentIntentUrl$payments_core_release",
        "getVerifyMicrodepositsOnSetupIntentUrl",
        "getVerifyMicrodepositsOnSetupIntentUrl$payments_core_release",
        "getIssuingCardPinUrl",
        "cardId",
        "getIssuingCardPinUrl$payments_core_release",
        "getPaymentMethodUrl",
        "getPaymentMethodUrl$payments_core_release",
        "getSetDefaultPaymentMethodUrl",
        "getSetDefaultPaymentMethodUrl$payments_core_release",
        "getApiUrl",
        "path",
        "args",
        "",
        "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;",
        "getEdgeUrl",
        "getMerchantUiUrl",
        "createExpandParam",
        "",
        "expandFields",
        "payments-core_release"
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

    .line 1963
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$createExpandParam(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/util/List;)Ljava/util/Map;
    .locals 0

    .line 1963
    invoke-direct {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->createExpandParam(Ljava/util/List;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$createVerificationParam(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    .locals 0

    .line 1963
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->createVerificationParam(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getApiUrl(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1963
    invoke-direct {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final varargs synthetic access$getApiUrl(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1963
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getEdgeUrl(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1963
    invoke-direct {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getEdgeUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final createExpandParam(Ljava/util/List;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 2292
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    .line 2293
    const-string v0, "expand"

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    :cond_1
    if-nez v1, :cond_2

    .line 2294
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v1
.end method

.method private final createVerificationParam(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 1972
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "id"

    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 1973
    const-string p1, "one_time_code"

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v0, p2

    .line 1971
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method private final getApiUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 2280
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "https://api.stripe.com/v1/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final varargs getApiUrl(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 2276
    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    array-length v1, p2

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    array-length v1, p2

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {v0, p1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "format(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final getEdgeUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 2284
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "https://api.stripe.com/edge-internal/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final getMerchantUiUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 2288
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "https://merchant-ui-api.stripe.com/elements/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final synthetic getAddCustomerSourceUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "customerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2136
    const-string v0, "customers/%s/sources"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getAttachFinancialConnectionsSessionToPaymentIntentUrl$payments_core_release(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "paymentIntentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "financialConnectionsSessionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2195
    const-string v0, "payment_intents/%s/link_account_sessions/%s/attach"

    .line 2197
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    .line 2194
    invoke-direct {p0, v0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getAttachFinancialConnectionsSessionToSetupIntentUrl$payments_core_release(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "setupIntentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "financialConnectionsSessionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2212
    const-string v0, "setup_intents/%s/link_account_sessions/%s/attach"

    .line 2214
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    .line 2211
    invoke-direct {p0, v0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getAttachPaymentMethodUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "paymentMethodId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2154
    const-string v0, "payment_methods/%s/attach"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getCancelPaymentIntentSourceUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "paymentIntentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2100
    const-string v0, "payment_intents/%s/source_cancel"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getCancelSetupIntentSourceUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "setupIntentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2127
    const-string v0, "setup_intents/%s/source_cancel"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getConfirmPaymentIntentUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "paymentIntentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2091
    const-string v0, "payment_intents/%s/confirm"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getConfirmSetupIntentUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "setupIntentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2118
    const-string v0, "setup_intents/%s/confirm"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getConsumerPaymentDetailsUrl$payments_core_release()Ljava/lang/String;
    .locals 1

    .line 2010
    const-string v0, "consumers/payment_details"

    invoke-direct {p0, v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic getConsumerPaymentDetailsUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "paymentDetailsId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2049
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "consumers/payment_details/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getDeferredFinancialConnectionsSessionUrl$payments_core_release()Ljava/lang/String;
    .locals 1

    .line 2038
    const-string v0, "connections/link_account_sessions_for_deferred_payment"

    invoke-direct {p0, v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic getDeleteCustomerSourceUrl$payments_core_release(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "customerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2145
    const-string v0, "customers/%s/sources/%s"

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getIssuingCardPinUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "cardId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2252
    const-string v0, "issuing/cards/%s/pin"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getListConsumerPaymentDetailsUrl$payments_core_release()Ljava/lang/String;
    .locals 1

    .line 2017
    const-string v0, "consumers/payment_details/list"

    invoke-direct {p0, v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic getListShippingAddresses$payments_core_release()Ljava/lang/String;
    .locals 1

    .line 2024
    const-string v0, "consumers/shipping_addresses/list"

    invoke-direct {p0, v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic getLogoutConsumerUrl$payments_core_release()Ljava/lang/String;
    .locals 1

    .line 2003
    const-string v0, "consumers/sessions/log_out"

    invoke-direct {p0, v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getMobileCardElementConfigUrl$payments_core_release()Ljava/lang/String;
    .locals 1

    .line 2041
    const-string v0, "mobile-card-element-config"

    invoke-direct {p0, v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getMerchantUiUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic getPaymentMethodUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "paymentMethodId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2262
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "payment_methods/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getPaymentMethodsUrl$payments_core_release()Ljava/lang/String;
    .locals 1

    .line 1996
    const-string v0, "payment_methods"

    invoke-direct {p0, v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic getRefreshPaymentIntentUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "paymentIntentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2070
    const-string v0, "payment_intents/%s/refresh"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getRefreshSetupIntentUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "paymentIntentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2082
    const-string v0, "setup_intents/%s/refresh"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getRetrieveCustomerUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "customerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2163
    const-string v0, "customers/%s"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getRetrievePaymentIntentUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "paymentIntentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2058
    const-string v0, "payment_intents/%s"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getRetrieveSetupIntentUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "setupIntentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2109
    const-string v0, "setup_intents/%s"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getRetrieveSourceApiUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2172
    const-string v0, "sources/%s"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getRetrieveTokenApiUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "tokenId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2181
    const-string v0, "tokens/%s"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getSetDefaultPaymentMethodUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "customerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2272
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "elements/customers/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v0, "/set_default_payment_method"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getSharePaymentDetailsUrl$payments_core_release()Ljava/lang/String;
    .locals 1

    .line 2031
    const-string v0, "consumers/payment_details/share"

    invoke-direct {p0, v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic getSourcesUrl$payments_core_release()Ljava/lang/String;
    .locals 1

    .line 1989
    const-string v0, "sources"

    invoke-direct {p0, v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic getTokensUrl$payments_core_release()Ljava/lang/String;
    .locals 1

    .line 1982
    const-string v0, "tokens"

    invoke-direct {p0, v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic getVerifyMicrodepositsOnPaymentIntentUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2227
    const-string v0, "payment_intents/%s/verify_microdeposits"

    .line 2228
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 2226
    invoke-direct {p0, v0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getVerifyMicrodepositsOnSetupIntentUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2241
    const-string v0, "setup_intents/%s/verify_microdeposits"

    .line 2242
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 2240
    invoke-direct {p0, v0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getApiUrl(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
