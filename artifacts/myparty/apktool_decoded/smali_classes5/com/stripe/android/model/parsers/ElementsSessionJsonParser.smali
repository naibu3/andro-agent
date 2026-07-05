.class public final Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;
.super Ljava/lang/Object;
.source "ElementsSessionJsonParser.kt"

# interfaces
.implements Lcom/stripe/android/core/model/parsers/ModelJsonParser;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/parsers/ElementsSessionJsonParser$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
        "Lcom/stripe/android/model/ElementsSession;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nElementsSessionJsonParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElementsSessionJsonParser.kt\ncom/stripe/android/model/parsers/ElementsSessionJsonParser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,513:1\n1#2:514\n1#2:527\n1#2:540\n1#2:553\n295#3,2:515\n1611#3,9:517\n1863#3:526\n1864#3:528\n1620#3:529\n1611#3,9:530\n1863#3:539\n1864#3:541\n1620#3:542\n1611#3,9:543\n1863#3:552\n1864#3:554\n1620#3:555\n295#3,2:556\n295#3,2:561\n295#3,2:565\n32#4,2:558\n32#4:560\n33#4:563\n32#4:564\n33#4:567\n*S KotlinDebug\n*F\n+ 1 ElementsSessionJsonParser.kt\ncom/stripe/android/model/parsers/ElementsSessionJsonParser\n*L\n225#1:527\n263#1:540\n272#1:553\n189#1:515,2\n225#1:517,9\n225#1:526\n225#1:528\n225#1:529\n263#1:530,9\n263#1:539\n263#1:541\n263#1:542\n272#1:543,9\n272#1:552\n272#1:554\n272#1:555\n335#1:556,2\n418#1:561,2\n438#1:565,2\n397#1:558,2\n415#1:560\n415#1:563\n435#1:564\n435#1:567\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u0000 42\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u00014B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0012\u0010\u000c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016JD\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0012H\u0002J\u001c\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0002J\u0018\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0002J\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010 \u001a\u00020\u0006H\u0002J\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\"0\u001c2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\"0\u001c2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0014\u0010$\u001a\u0004\u0018\u00010%2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0014\u0010&\u001a\u0004\u0018\u00010\'2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010(\u001a\u00020)2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0014\u0010*\u001a\u0004\u0018\u00010+2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001c\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060/2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001c\u00100\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00060/2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001c\u00102\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00120/2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"
    }
    d2 = {
        "Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser;",
        "Lcom/stripe/android/model/ElementsSession;",
        "params",
        "Lcom/stripe/android/model/ElementsSessionParams;",
        "isLiveMode",
        "",
        "timeProvider",
        "Lkotlin/Function0;",
        "",
        "<init>",
        "(Lcom/stripe/android/model/ElementsSessionParams;ZLkotlin/jvm/functions/Function0;)V",
        "parse",
        "json",
        "Lorg/json/JSONObject;",
        "parseStripeIntent",
        "Lcom/stripe/android/model/StripeIntent;",
        "elementsSessionId",
        "",
        "paymentMethodPreference",
        "orderedPaymentMethodTypes",
        "Lorg/json/JSONArray;",
        "unactivatedPaymentMethodTypes",
        "linkFundingSources",
        "countryCode",
        "parseLinkSettings",
        "Lcom/stripe/android/model/ElementsSession$LinkSettings;",
        "parseCustomPaymentMethods",
        "",
        "Lcom/stripe/android/model/ElementsSession$CustomPaymentMethod;",
        "parseCustomer",
        "Lcom/stripe/android/model/ElementsSession$Customer;",
        "enableLinkInSpm",
        "parsePaymentMethodsWithLinkDetails",
        "Lcom/stripe/android/model/PaymentMethod;",
        "parsePaymentMethods",
        "parseCustomerSession",
        "Lcom/stripe/android/model/ElementsSession$Customer$Session;",
        "parseComponents",
        "Lcom/stripe/android/model/ElementsSession$Customer$Components;",
        "parsePaymentElementComponent",
        "Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;",
        "parseCustomerSheetComponent",
        "Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;",
        "parseCardBrandChoice",
        "Lcom/stripe/android/model/ElementsSession$CardBrandChoice;",
        "parseLinkFlags",
        "",
        "parseSessionFlags",
        "Lcom/stripe/android/model/ElementsSession$Flag;",
        "parseExperimentAssignments",
        "Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;",
        "Companion",
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


# static fields
.field public static final $stable:I

.field private static final ARB_ID:Ljava/lang/String; = "arb_id"

.field private static final CUSTOM_PAYMENT_METHOD_JSON_PARSER:Lcom/stripe/android/model/parsers/CustomPaymentMethodJsonParser;

.field public static final Companion:Lcom/stripe/android/model/parsers/ElementsSessionJsonParser$Companion;

.field private static final FIELD_CARD_BRAND_CHOICE:Ljava/lang/String; = "card_brand_choice"

.field private static final FIELD_COMPONENTS:Ljava/lang/String; = "components"

.field private static final FIELD_COUNTRY_CODE:Ljava/lang/String; = "country_code"

.field private static final FIELD_CUSTOMER:Ljava/lang/String; = "customer"

.field private static final FIELD_CUSTOMER_API_KEY:Ljava/lang/String; = "api_key"

.field private static final FIELD_CUSTOMER_API_KEY_EXPIRY:Ljava/lang/String; = "api_key_expiry"

.field private static final FIELD_CUSTOMER_ID:Ljava/lang/String; = "id"

.field private static final FIELD_CUSTOMER_LIVE_MODE:Ljava/lang/String; = "livemode"

.field private static final FIELD_CUSTOMER_NAME:Ljava/lang/String; = "customer"

.field private static final FIELD_CUSTOMER_PAYMENT_METHODS:Ljava/lang/String; = "payment_methods"

.field private static final FIELD_CUSTOMER_PAYMENT_METHODS_WITH_LINK_DETAILS:Ljava/lang/String; = "payment_methods_with_link_details"

.field private static final FIELD_CUSTOMER_SESSION:Ljava/lang/String; = "customer_session"

.field private static final FIELD_CUSTOMER_SHEET:Ljava/lang/String; = "customer_sheet"

.field private static final FIELD_CUSTOM_PAYMENT_METHODS_DATA:Ljava/lang/String; = "custom_payment_method_data"

.field private static final FIELD_DEFAULT_PAYMENT_METHOD:Ljava/lang/String; = "default_payment_method"

.field private static final FIELD_DISABLE_LINK_SIGNUP:Ljava/lang/String; = "link_mobile_disable_signup"

.field private static final FIELD_ELEMENTS_SESSION_ID:Ljava/lang/String; = "session_id"

.field private static final FIELD_ELIGIBLE:Ljava/lang/String; = "eligible"

.field private static final FIELD_ENABLED:Ljava/lang/String; = "enabled"

.field private static final FIELD_EXPERIMENTS_ASSIGNMENTS:Ljava/lang/String; = "experiment_assignments"

.field private static final FIELD_EXPERIMENTS_DATA:Ljava/lang/String; = "experiments_data"

.field private static final FIELD_EXTERNAL_PAYMENT_METHOD_DATA:Ljava/lang/String; = "external_payment_method_data"

.field private static final FIELD_FEATURES:Ljava/lang/String; = "features"

.field private static final FIELD_FLAGS:Ljava/lang/String; = "flags"

.field public static final FIELD_GOOGLE_PAY_PREFERENCE:Ljava/lang/String; = "google_pay_preference"

.field private static final FIELD_LINK_ENABLE_DISPLAYABLE_DEFAULT_VALUES_IN_ECE:Ljava/lang/String; = "link_enable_displayable_default_values_in_ece"

.field private static final FIELD_LINK_FUNDING_SOURCES:Ljava/lang/String; = "link_funding_sources"

.field private static final FIELD_LINK_MOBILE_DISABLE_RUX_IN_FLOW_CONTROLLER:Ljava/lang/String; = "link_mobile_disable_rux_in_flow_controller"

.field private static final FIELD_LINK_MOBILE_SKIP_WALLET_IN_FLOW_CONTROLLER:Ljava/lang/String; = "link_mobile_skip_wallet_in_flow_controller"

.field private static final FIELD_LINK_MODE:Ljava/lang/String; = "link_mode"

.field private static final FIELD_LINK_PASSTHROUGH_MODE_ENABLED:Ljava/lang/String; = "link_passthrough_mode_enabled"

.field private static final FIELD_LINK_SETTINGS:Ljava/lang/String; = "link_settings"

.field private static final FIELD_LINK_SIGN_UP_OPT_IN_FEATURE_ENABLED:Ljava/lang/String; = "link_sign_up_opt_in_feature_enabled"

.field private static final FIELD_LINK_SIGN_UP_OPT_IN_INITIAL_VALUE:Ljava/lang/String; = "link_sign_up_opt_in_initial_value"

.field private static final FIELD_LINK_SUPPRESS_2FA_MODAL:Ljava/lang/String; = "link_mobile_suppress_2fa_modal"

.field private static final FIELD_MERCHANT_COUNTRY:Ljava/lang/String; = "merchant_country"

.field private static final FIELD_MOBILE_PAYMENT_ELEMENT:Ljava/lang/String; = "mobile_payment_element"

.field private static final FIELD_OBJECT:Ljava/lang/String; = "object"

.field private static final FIELD_ORDERED_PAYMENT_METHOD_TYPES:Ljava/lang/String; = "ordered_payment_method_types"

.field private static final FIELD_ORDERED_PAYMENT_METHOD_TYPESAND_WALLETS:Ljava/lang/String; = "ordered_payment_method_types_and_wallets"

.field private static final FIELD_PASSIVE_CAPTCHA:Ljava/lang/String; = "passive_captcha"

.field private static final FIELD_PAYMENT_METHOD_ALLOW_REDISPLAY_OVERRIDE:Ljava/lang/String; = "payment_method_save_allow_redisplay_override"

.field private static final FIELD_PAYMENT_METHOD_PREFERENCE:Ljava/lang/String; = "payment_method_preference"

.field private static final FIELD_PAYMENT_METHOD_REMOVE:Ljava/lang/String; = "payment_method_remove"

.field private static final FIELD_PAYMENT_METHOD_REMOVE_LAST:Ljava/lang/String; = "payment_method_remove_last"

.field private static final FIELD_PAYMENT_METHOD_SAVE:Ljava/lang/String; = "payment_method_save"

.field private static final FIELD_PAYMENT_METHOD_SET_AS_DEFAULT:Ljava/lang/String; = "payment_method_set_as_default"

.field private static final FIELD_PAYMENT_METHOD_SPECS:Ljava/lang/String; = "payment_method_specs"

.field private static final FIELD_PAYMENT_METHOD_SYNC_DEFAULT:Ljava/lang/String; = "payment_method_sync_default"

.field private static final FIELD_PAYMENT_METHOD_TYPES:Ljava/lang/String; = "payment_method_types"

.field private static final FIELD_PREFERRED_NETWORKS:Ljava/lang/String; = "preferred_networks"

.field private static final FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES:Ljava/lang/String; = "unactivated_payment_method_types"

.field private static final FIELD_USE_LINK_ATTESTATION_ENDPOINTS:Ljava/lang/String; = "link_mobile_use_attestation_endpoints"

.field private static final VALUE_ENABLED:Ljava/lang/String; = "enabled"


# instance fields
.field private final isLiveMode:Z

.field private final params:Lcom/stripe/android/model/ElementsSessionParams;

.field private final timeProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$K9kERfY4QzAcCBNcNg3sA0Q66Is()J
    .locals 2

    invoke-static {}, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->_init_$lambda$0()J

    move-result-wide v0

    return-wide v0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->Companion:Lcom/stripe/android/model/parsers/ElementsSessionJsonParser$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->$stable:I

    .line 510
    new-instance v0, Lcom/stripe/android/model/parsers/CustomPaymentMethodJsonParser;

    invoke-direct {v0}, Lcom/stripe/android/model/parsers/CustomPaymentMethodJsonParser;-><init>()V

    sput-object v0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->CUSTOM_PAYMENT_METHOD_JSON_PARSER:Lcom/stripe/android/model/parsers/CustomPaymentMethodJsonParser;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/ElementsSessionParams;ZLkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ElementsSessionParams;",
            "Z",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->params:Lcom/stripe/android/model/ElementsSessionParams;

    .line 20
    iput-boolean p2, p0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->isLiveMode:Z

    .line 21
    iput-object p3, p0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->timeProvider:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/model/ElementsSessionParams;ZLkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 21
    new-instance p3, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser$$ExternalSyntheticLambda0;

    invoke-direct {p3}, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser$$ExternalSyntheticLambda0;-><init>()V

    .line 18
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;-><init>(Lcom/stripe/android/model/ElementsSessionParams;ZLkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method private static final _init_$lambda$0()J
    .locals 2

    .line 22
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method private final parseCardBrandChoice(Lorg/json/JSONObject;)Lcom/stripe/android/model/ElementsSession$CardBrandChoice;
    .locals 6

    .line 377
    const-string v0, "card_brand_choice"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 378
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    .line 380
    const-string v1, "preferred_networks"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 381
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v3

    move v4, v2

    :goto_0
    if-ge v4, v3, :cond_2

    .line 382
    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 383
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 388
    :cond_2
    new-instance v1, Lcom/stripe/android/model/ElementsSession$CardBrandChoice;

    .line 389
    const-string v3, "eligible"

    invoke-virtual {p1, v3, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    .line 390
    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    .line 388
    invoke-direct {v1, p1, v0}, Lcom/stripe/android/model/ElementsSession$CardBrandChoice;-><init>(ZLjava/util/List;)V

    return-object v1
.end method

.method private final parseComponents(Lorg/json/JSONObject;)Lcom/stripe/android/model/ElementsSession$Customer$Components;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 305
    :cond_0
    const-string v1, "mobile_payment_element"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->parsePaymentElementComponent(Lorg/json/JSONObject;)Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;

    move-result-object v1

    .line 306
    const-string v2, "customer_sheet"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->parseCustomerSheetComponent(Lorg/json/JSONObject;)Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v0

    .line 309
    :cond_1
    new-instance v0, Lcom/stripe/android/model/ElementsSession$Customer$Components;

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/model/ElementsSession$Customer$Components;-><init>(Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;)V

    return-object v0
.end method

.method private final parseCustomPaymentMethods(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ElementsSession$CustomPaymentMethod;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 222
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    .line 225
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 517
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 526
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    move-object v2, v0

    check-cast v2, Lkotlin/collections/IntIterator;

    invoke-virtual {v2}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v2

    .line 226
    sget-object v3, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->CUSTOM_PAYMENT_METHOD_JSON_PARSER:Lcom/stripe/android/model/parsers/CustomPaymentMethodJsonParser;

    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    const-string v4, "optJSONObject(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Lcom/stripe/android/model/parsers/CustomPaymentMethodJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/ElementsSession$CustomPaymentMethod;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 525
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 529
    :cond_2
    check-cast v1, Ljava/util/List;

    return-object v1
.end method

.method private final parseCustomer(Lorg/json/JSONObject;Z)Lcom/stripe/android/model/ElementsSession$Customer;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    if-eqz p2, :cond_1

    .line 241
    invoke-direct {p0, p1}, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->parsePaymentMethodsWithLinkDetails(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object p2

    goto :goto_0

    .line 243
    :cond_1
    invoke-direct {p0, p1}, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->parsePaymentMethods(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object p2

    .line 246
    :goto_0
    const-string v1, "customer_session"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->parseCustomerSession(Lorg/json/JSONObject;)Lcom/stripe/android/model/ElementsSession$Customer$Session;

    move-result-object v1

    if-nez v1, :cond_2

    return-object v0

    .line 249
    :cond_2
    const-string v2, "default_payment_method"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 250
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v2, p1

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    move-object v0, p1

    .line 253
    :cond_3
    new-instance p1, Lcom/stripe/android/model/ElementsSession$Customer;

    invoke-direct {p1, p2, v0, v1}, Lcom/stripe/android/model/ElementsSession$Customer;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/model/ElementsSession$Customer$Session;)V

    return-object p1
.end method

.method private final parseCustomerSession(Lorg/json/JSONObject;)Lcom/stripe/android/model/ElementsSession$Customer$Session;
    .locals 9

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 283
    :cond_0
    const-string v1, "id"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    return-object v0

    .line 284
    :cond_1
    const-string v1, "livemode"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v4

    .line 285
    const-string v1, "api_key"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_2

    return-object v0

    .line 286
    :cond_2
    const-string v1, "api_key_expiry"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v6

    .line 287
    const-string v1, "customer"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_3

    return-object v0

    .line 288
    :cond_3
    const-string v1, "components"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->parseComponents(Lorg/json/JSONObject;)Lcom/stripe/android/model/ElementsSession$Customer$Components;

    move-result-object v8

    if-nez v8, :cond_4

    return-object v0

    .line 290
    :cond_4
    new-instance v2, Lcom/stripe/android/model/ElementsSession$Customer$Session;

    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/model/ElementsSession$Customer$Session;-><init>(Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;Lcom/stripe/android/model/ElementsSession$Customer$Components;)V

    return-object v2
.end method

.method private final parseCustomerSheetComponent(Lorg/json/JSONObject;)Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;
    .locals 4

    if-nez p1, :cond_0

    .line 353
    sget-object p1, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Disabled;->INSTANCE:Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Disabled;

    check-cast p1, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;

    return-object p1

    .line 356
    :cond_0
    const-string v0, "enabled"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 359
    const-string v1, "features"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-nez p1, :cond_1

    .line 360
    sget-object p1, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Disabled;->INSTANCE:Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Disabled;

    check-cast p1, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;

    return-object p1

    .line 362
    :cond_1
    const-string v1, "payment_method_remove"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 363
    const-string v2, "payment_method_remove_last"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 364
    const-string v3, "payment_method_sync_default"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 366
    new-instance v3, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;

    .line 367
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    .line 368
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 369
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    .line 366
    invoke-direct {v3, v1, v2, p1}, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;-><init>(ZZZ)V

    check-cast v3, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;

    return-object v3

    .line 372
    :cond_2
    sget-object p1, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Disabled;->INSTANCE:Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Disabled;

    check-cast p1, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;

    return-object p1
.end method

.method private final parseExperimentAssignments(Lorg/json/JSONObject;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Ljava/util/Map<",
            "Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 434
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v0, Ljava/util/Map;

    .line 435
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    const-string v2, "keys(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 564
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 436
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    .line 437
    invoke-static {}, Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    .line 565
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;

    .line 438
    invoke-virtual {v6}, Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;->getExperimentValue()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    check-cast v5, Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;

    if-eqz v5, :cond_0

    .line 440
    instance-of v2, v3, Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 441
    invoke-interface {v0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 446
    :cond_3
    invoke-static {v0}, Lkotlin/collections/MapsKt;->toMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method private final parseLinkFlags(Lorg/json/JSONObject;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 395
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v0, Ljava/util/Map;

    .line 397
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    const-string v2, "keys(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 558
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 398
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    .line 400
    instance-of v4, v3, Ljava/lang/Boolean;

    if-eqz v4, :cond_0

    .line 401
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 405
    :cond_1
    invoke-static {v0}, Lkotlin/collections/MapsKt;->toMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method private final parseLinkSettings(Lorg/json/JSONObject;Lorg/json/JSONArray;)Lcom/stripe/android/model/ElementsSession$LinkSettings;
    .locals 18

    move-object/from16 v0, p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 173
    const-string v3, "link_mobile_disable_signup"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    if-ne v3, v1, :cond_0

    move v9, v1

    goto :goto_0

    :cond_0
    move v9, v2

    :goto_0
    if-eqz v0, :cond_1

    .line 174
    const-string v3, "link_passthrough_mode_enabled"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    if-ne v3, v1, :cond_1

    move v6, v1

    goto :goto_1

    :cond_1
    move v6, v2

    :goto_1
    if-eqz v0, :cond_2

    .line 175
    const-string v3, "link_mobile_use_attestation_endpoints"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    if-ne v3, v1, :cond_2

    move v11, v1

    goto :goto_2

    :cond_2
    move v11, v2

    :goto_2
    if-eqz v0, :cond_3

    .line 176
    const-string v3, "link_mobile_disable_rux_in_flow_controller"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    if-ne v3, v1, :cond_3

    move v13, v1

    goto :goto_3

    :cond_3
    move v13, v2

    :goto_3
    if-eqz v0, :cond_4

    .line 177
    const-string v3, "link_mobile_suppress_2fa_modal"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    if-ne v3, v1, :cond_4

    move v12, v1

    goto :goto_4

    :cond_4
    move v12, v2

    :goto_4
    if-eqz v0, :cond_5

    .line 179
    const-string v3, "link_enable_displayable_default_values_in_ece"

    .line 178
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    if-ne v3, v1, :cond_5

    move v14, v1

    goto :goto_5

    :cond_5
    move v14, v2

    :goto_5
    if-eqz v0, :cond_6

    .line 182
    const-string v3, "link_mobile_skip_wallet_in_flow_controller"

    .line 181
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    if-ne v3, v1, :cond_6

    move v15, v1

    goto :goto_6

    :cond_6
    move v15, v2

    :goto_6
    if-eqz v0, :cond_7

    .line 185
    const-string v3, "link_sign_up_opt_in_feature_enabled"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    if-ne v3, v1, :cond_7

    move/from16 v16, v1

    goto :goto_7

    :cond_7
    move/from16 v16, v2

    :goto_7
    if-eqz v0, :cond_8

    .line 186
    const-string v3, "link_sign_up_opt_in_initial_value"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    if-ne v3, v1, :cond_8

    move/from16 v17, v1

    goto :goto_8

    :cond_8
    move/from16 v17, v2

    :goto_8
    const/4 v1, 0x0

    if-eqz v0, :cond_b

    .line 188
    const-string v2, "link_mode"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_b

    .line 189
    invoke-static {}, Lcom/stripe/android/model/LinkMode;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .line 515
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/stripe/android/model/LinkMode;

    .line 189
    invoke-virtual {v5}, Lcom/stripe/android/model/LinkMode;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    goto :goto_9

    :cond_a
    move-object v4, v1

    .line 516
    :goto_9
    check-cast v4, Lcom/stripe/android/model/LinkMode;

    move-object v7, v4

    goto :goto_a

    :cond_b
    move-object v7, v1

    :goto_a
    if-eqz v0, :cond_c

    .line 193
    invoke-direct/range {p0 .. p1}, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->parseLinkFlags(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v2

    if-nez v2, :cond_d

    .line 194
    :cond_c
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v2

    :cond_d
    move-object v8, v2

    .line 196
    sget-object v2, Lcom/stripe/android/core/utils/FeatureFlags;->INSTANCE:Lcom/stripe/android/core/utils/FeatureFlags;

    invoke-virtual {v2}, Lcom/stripe/android/core/utils/FeatureFlags;->getInstantDebitsIncentives()Lcom/stripe/android/core/utils/FeatureFlag;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/core/utils/FeatureFlag;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_f

    if-eqz v0, :cond_e

    .line 197
    const-string v2, "link_consumer_incentive"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_b

    :cond_e
    move-object v0, v1

    :goto_b
    if-eqz v0, :cond_f

    .line 198
    sget-object v1, Lcom/stripe/android/model/parsers/LinkConsumerIncentiveJsonParser;->INSTANCE:Lcom/stripe/android/model/parsers/LinkConsumerIncentiveJsonParser;

    invoke-virtual {v1, v0}, Lcom/stripe/android/model/parsers/LinkConsumerIncentiveJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/LinkConsumerIncentive;

    move-result-object v1

    :cond_f
    move-object v10, v1

    .line 203
    new-instance v4, Lcom/stripe/android/model/ElementsSession$LinkSettings;

    .line 204
    sget-object v0, Lcom/stripe/android/core/model/parsers/ModelJsonParser;->Companion:Lcom/stripe/android/core/model/parsers/ModelJsonParser$Companion;

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Lcom/stripe/android/core/model/parsers/ModelJsonParser$Companion;->jsonArrayToList(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v5

    .line 203
    invoke-direct/range {v4 .. v17}, Lcom/stripe/android/model/ElementsSession$LinkSettings;-><init>(Ljava/util/List;ZLcom/stripe/android/model/LinkMode;Ljava/util/Map;ZLcom/stripe/android/model/LinkConsumerIncentive;ZZZZZZZ)V

    return-object v4
.end method

.method private final parsePaymentElementComponent(Lorg/json/JSONObject;)Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;
    .locals 13

    if-nez p1, :cond_0

    .line 319
    sget-object p1, Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement$Disabled;->INSTANCE:Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement$Disabled;

    check-cast p1, Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;

    return-object p1

    .line 322
    :cond_0
    const-string v0, "enabled"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 325
    const-string v1, "features"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-nez p1, :cond_1

    .line 326
    sget-object p1, Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement$Disabled;->INSTANCE:Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement$Disabled;

    check-cast p1, Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;

    return-object p1

    .line 328
    :cond_1
    const-string v1, "payment_method_save"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 329
    const-string v2, "payment_method_remove"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 330
    const-string v3, "payment_method_remove_last"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 331
    const-string v4, "payment_method_set_as_default"

    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 333
    const-string v5, "payment_method_save_allow_redisplay_override"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 335
    invoke-static {}, Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .line 556
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;

    .line 336
    invoke-virtual {v7}, Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;->getValue()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    goto :goto_0

    :cond_3
    const/4 v6, 0x0

    .line 335
    :goto_0
    move-object v11, v6

    check-cast v11, Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;

    .line 340
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    .line 341
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    .line 342
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    .line 343
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    .line 339
    new-instance v7, Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement$Enabled;

    invoke-direct/range {v7 .. v12}, Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement$Enabled;-><init>(ZZZLcom/stripe/android/model/PaymentMethod$AllowRedisplay;Z)V

    check-cast v7, Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;

    return-object v7

    .line 347
    :cond_4
    sget-object p1, Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement$Disabled;->INSTANCE:Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement$Disabled;

    check-cast p1, Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;

    return-object p1
.end method

.method private final parsePaymentMethods(Lorg/json/JSONObject;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;"
        }
    .end annotation

    .line 270
    const-string v0, "payment_methods"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    .line 272
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 543
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 552
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Lkotlin/collections/IntIterator;

    invoke-virtual {v2}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v2

    .line 273
    new-instance v3, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;

    invoke-direct {v3}, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;-><init>()V

    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    const-string v4, "optJSONObject(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethod;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 551
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 555
    :cond_1
    check-cast v1, Ljava/util/List;

    return-object v1

    .line 275
    :cond_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final parsePaymentMethodsWithLinkDetails(Lorg/json/JSONObject;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;"
        }
    .end annotation

    .line 261
    const-string v0, "payment_methods_with_link_details"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    .line 263
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 530
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 539
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Lkotlin/collections/IntIterator;

    invoke-virtual {v2}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v2

    .line 264
    sget-object v3, Lcom/stripe/android/model/parsers/PaymentMethodWithLinkDetailsJsonParser;->INSTANCE:Lcom/stripe/android/model/parsers/PaymentMethodWithLinkDetailsJsonParser;

    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    const-string v4, "optJSONObject(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Lcom/stripe/android/model/parsers/PaymentMethodWithLinkDetailsJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethod;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 538
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 542
    :cond_1
    check-cast v1, Ljava/util/List;

    return-object v1

    .line 266
    :cond_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final parseSessionFlags(Lorg/json/JSONObject;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Ljava/util/Map<",
            "Lcom/stripe/android/model/ElementsSession$Flag;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 413
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v0, Ljava/util/Map;

    .line 415
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    const-string v2, "keys(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 560
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 416
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    .line 417
    invoke-static {}, Lcom/stripe/android/model/ElementsSession$Flag;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    .line 561
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/stripe/android/model/ElementsSession$Flag;

    .line 418
    invoke-virtual {v6}, Lcom/stripe/android/model/ElementsSession$Flag;->getFlagValue()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    check-cast v5, Lcom/stripe/android/model/ElementsSession$Flag;

    if-eqz v5, :cond_0

    .line 420
    instance-of v2, v3, Ljava/lang/Boolean;

    if-eqz v2, :cond_0

    .line 421
    invoke-interface {v0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 426
    :cond_3
    invoke-static {v0}, Lkotlin/collections/MapsKt;->toMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method private final parseStripeIntent(Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent;
    .locals 1

    if-eqz p2, :cond_0

    .line 118
    iget-object v0, p0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->params:Lcom/stripe/android/model/ElementsSessionParams;

    invoke-interface {v0}, Lcom/stripe/android/model/ElementsSessionParams;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p2

    if-nez p2, :cond_1

    :cond_0
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    :cond_1
    if-eqz p3, :cond_2

    .line 121
    const-string v0, "payment_method_types"

    .line 120
    invoke-virtual {p2, v0, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 126
    :cond_2
    const-string p3, "unactivated_payment_method_types"

    .line 125
    invoke-virtual {p2, p3, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 130
    const-string p3, "link_funding_sources"

    .line 129
    invoke-virtual {p2, p3, p5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 134
    const-string p3, "country_code"

    .line 133
    invoke-virtual {p2, p3, p6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 138
    iget-object p3, p0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->params:Lcom/stripe/android/model/ElementsSessionParams;

    .line 139
    instance-of p4, p3, Lcom/stripe/android/model/ElementsSessionParams$PaymentIntentType;

    if-eqz p4, :cond_3

    .line 140
    new-instance p1, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;

    invoke-direct {p1}, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;-><init>()V

    invoke-virtual {p1, p2}, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentIntent;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/StripeIntent;

    return-object p1

    .line 142
    :cond_3
    instance-of p4, p3, Lcom/stripe/android/model/ElementsSessionParams$SetupIntentType;

    if-eqz p4, :cond_4

    .line 143
    new-instance p1, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;

    invoke-direct {p1}, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;-><init>()V

    invoke-virtual {p1, p2}, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/SetupIntent;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/StripeIntent;

    return-object p1

    .line 145
    :cond_4
    instance-of p4, p3, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;

    if-eqz p4, :cond_7

    .line 146
    check-cast p3, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;

    invoke-virtual {p3}, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->getDeferredIntentParams()Lcom/stripe/android/model/DeferredIntentParams;

    move-result-object p3

    invoke-virtual {p3}, Lcom/stripe/android/model/DeferredIntentParams;->getMode()Lcom/stripe/android/model/DeferredIntentParams$Mode;

    move-result-object p3

    .line 147
    instance-of p4, p3, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;

    if-eqz p4, :cond_5

    .line 148
    new-instance p3, Lcom/stripe/android/model/parsers/DeferredPaymentIntentJsonParser;

    .line 150
    iget-object p4, p0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->params:Lcom/stripe/android/model/ElementsSessionParams;

    check-cast p4, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;

    invoke-virtual {p4}, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->getDeferredIntentParams()Lcom/stripe/android/model/DeferredIntentParams;

    move-result-object p4

    invoke-virtual {p4}, Lcom/stripe/android/model/DeferredIntentParams;->getMode()Lcom/stripe/android/model/DeferredIntentParams$Mode;

    move-result-object p4

    check-cast p4, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;

    .line 151
    iget-boolean p5, p0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->isLiveMode:Z

    .line 152
    iget-object p6, p0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->timeProvider:Lkotlin/jvm/functions/Function0;

    .line 148
    invoke-direct {p3, p1, p4, p5, p6}, Lcom/stripe/android/model/parsers/DeferredPaymentIntentJsonParser;-><init>(Ljava/lang/String;Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;ZLkotlin/jvm/functions/Function0;)V

    .line 153
    invoke-virtual {p3, p2}, Lcom/stripe/android/model/parsers/DeferredPaymentIntentJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentIntent;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/StripeIntent;

    return-object p1

    .line 155
    :cond_5
    instance-of p3, p3, Lcom/stripe/android/model/DeferredIntentParams$Mode$Setup;

    if-eqz p3, :cond_6

    .line 156
    new-instance p3, Lcom/stripe/android/model/parsers/DeferredSetupIntentJsonParser;

    .line 158
    iget-object p4, p0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->params:Lcom/stripe/android/model/ElementsSessionParams;

    check-cast p4, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;

    invoke-virtual {p4}, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->getDeferredIntentParams()Lcom/stripe/android/model/DeferredIntentParams;

    move-result-object p4

    invoke-virtual {p4}, Lcom/stripe/android/model/DeferredIntentParams;->getMode()Lcom/stripe/android/model/DeferredIntentParams$Mode;

    move-result-object p4

    check-cast p4, Lcom/stripe/android/model/DeferredIntentParams$Mode$Setup;

    .line 159
    iget-boolean p5, p0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->isLiveMode:Z

    .line 160
    iget-object p6, p0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->timeProvider:Lkotlin/jvm/functions/Function0;

    .line 156
    invoke-direct {p3, p1, p4, p5, p6}, Lcom/stripe/android/model/parsers/DeferredSetupIntentJsonParser;-><init>(Ljava/lang/String;Lcom/stripe/android/model/DeferredIntentParams$Mode$Setup;ZLkotlin/jvm/functions/Function0;)V

    .line 161
    invoke-virtual {p3, p2}, Lcom/stripe/android/model/parsers/DeferredSetupIntentJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/SetupIntent;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/StripeIntent;

    return-object p1

    .line 146
    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 138
    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public bridge synthetic parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeModel;
    .locals 0

    .line 18
    invoke-virtual {p0, p1}, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/ElementsSession;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/model/StripeModel;

    return-object p1
.end method

.method public parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/ElementsSession;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    const-string v1, "json"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    sget-object v1, Lcom/stripe/android/core/model/StripeJsonUtils;->INSTANCE:Lcom/stripe/android/core/model/StripeJsonUtils;

    .line 28
    sget-object v2, Lcom/stripe/android/core/model/StripeJsonUtils;->INSTANCE:Lcom/stripe/android/core/model/StripeJsonUtils;

    const-string v3, "payment_method_preference"

    invoke-virtual {v2, v7, v3}, Lcom/stripe/android/core/model/StripeJsonUtils;->optMap(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    .line 27
    invoke-virtual {v1, v2}, Lcom/stripe/android/core/model/StripeJsonUtils;->mapToJsonObject(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v2

    .line 30
    const-string v1, "object"

    invoke-static {v2, v1}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v8, 0x0

    if-eqz v2, :cond_c

    .line 32
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_5

    .line 36
    :cond_0
    const-string v1, "country_code"

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 37
    const-string v1, "unactivated_payment_method_types"

    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 38
    const-string v1, "payment_method_specs"

    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v11, v1

    goto :goto_0

    :cond_1
    move-object v11, v8

    .line 39
    :goto_0
    const-string v1, "external_payment_method_data"

    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v12, v1

    goto :goto_1

    :cond_2
    move-object v12, v8

    .line 42
    :goto_1
    const-string v1, "ordered_payment_method_types"

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 45
    sget-object v1, Lcom/stripe/android/core/model/parsers/ModelJsonParser;->Companion:Lcom/stripe/android/core/model/parsers/ModelJsonParser$Companion;

    const-string v5, "ordered_payment_method_types_and_wallets"

    invoke-virtual {v7, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/stripe/android/core/model/parsers/ModelJsonParser$Companion;->jsonArrayToList(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v14

    .line 47
    const-string v1, "flags"

    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-direct {v0, v1}, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->parseSessionFlags(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_4

    :cond_3
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    :cond_4
    move-object v15, v1

    .line 49
    const-string v1, "session_id"

    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 51
    const-string v5, "customer"

    invoke-virtual {v7, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 52
    sget-object v9, Lcom/stripe/android/model/ElementsSession$Flag;->ELEMENTS_ENABLE_LINK_SPM:Lcom/stripe/android/model/ElementsSession$Flag;

    invoke-interface {v15, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    const/4 v10, 0x1

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    invoke-static {v9, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    .line 50
    invoke-direct {v0, v5, v9}, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->parseCustomer(Lorg/json/JSONObject;Z)Lcom/stripe/android/model/ElementsSession$Customer;

    move-result-object v17

    .line 55
    const-string v5, "link_settings"

    invoke-virtual {v7, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v9

    if-eqz v9, :cond_5

    .line 56
    const-string v5, "link_funding_sources"

    invoke-virtual {v9, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    goto :goto_2

    :cond_5
    move-object v5, v8

    .line 64
    :goto_2
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 58
    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->parseStripeIntent(Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent;

    move-result-object v13

    .line 68
    const-string v2, "experiments_data"

    invoke-virtual {v7, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_8

    .line 70
    const-string v3, "arb_id"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "optString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    const-string v4, "experiment_assignments"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 72
    invoke-direct {v0, v2}, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->parseExperimentAssignments(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v2

    if-nez v2, :cond_7

    .line 73
    :cond_6
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v2

    .line 69
    :cond_7
    new-instance v4, Lcom/stripe/android/model/ElementsSession$ExperimentsData;

    invoke-direct {v4, v3, v2}, Lcom/stripe/android/model/ElementsSession$ExperimentsData;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    move-object/from16 v16, v4

    goto :goto_3

    :cond_8
    move-object/from16 v16, v8

    .line 77
    :goto_3
    const-string v2, "custom_payment_method_data"

    invoke-virtual {v7, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->parseCustomPaymentMethods(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v22

    .line 79
    invoke-direct/range {p0 .. p1}, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->parseCardBrandChoice(Lorg/json/JSONObject;)Lcom/stripe/android/model/ElementsSession$CardBrandChoice;

    move-result-object v19

    .line 80
    const-string v2, "google_pay_preference"

    invoke-virtual {v7, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 82
    const-string v3, "merchant_country"

    invoke-virtual {v7, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 84
    const-string v3, "passive_captcha"

    invoke-virtual {v7, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_9

    .line 85
    new-instance v4, Lcom/stripe/android/model/parsers/PassiveCaptchaJsonParser;

    invoke-direct {v4}, Lcom/stripe/android/model/parsers/PassiveCaptchaJsonParser;-><init>()V

    invoke-virtual {v4, v3}, Lcom/stripe/android/model/parsers/PassiveCaptchaJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/PassiveCaptchaParams;

    move-result-object v3

    move-object/from16 v24, v3

    goto :goto_4

    :cond_9
    move-object/from16 v24, v8

    :goto_4
    if-eqz v13, :cond_c

    .line 90
    invoke-direct {v0, v9, v5}, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->parseLinkSettings(Lorg/json/JSONObject;Lorg/json/JSONArray;)Lcom/stripe/android/model/ElementsSession$LinkSettings;

    move-result-object v3

    .line 96
    const-string v4, "disabled"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    xor-int/lit8 v20, v2, 0x1

    .line 102
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_a

    move-object v8, v1

    :cond_a
    if-nez v8, :cond_b

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v8

    const-string v1, "toString(...)"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_b
    move-object/from16 v23, v8

    .line 89
    new-instance v9, Lcom/stripe/android/model/ElementsSession;

    const/16 v25, 0x800

    const/16 v26, 0x0

    const/16 v21, 0x0

    move-object v10, v3

    invoke-direct/range {v9 .. v26}, Lcom/stripe/android/model/ElementsSession;-><init>(Lcom/stripe/android/model/ElementsSession$LinkSettings;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Ljava/util/List;Ljava/util/Map;Lcom/stripe/android/model/ElementsSession$ExperimentsData;Lcom/stripe/android/model/ElementsSession$Customer;Ljava/lang/String;Lcom/stripe/android/model/ElementsSession$CardBrandChoice;ZLjava/lang/Throwable;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/model/PassiveCaptchaParams;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9

    :cond_c
    :goto_5
    return-object v8
.end method
