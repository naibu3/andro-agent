.class public final Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadSucceeded;
.super Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;
.source "PaymentSheetEvent.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LoadSucceeded"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u00a3\u0001\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u000e\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\u000eX\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u000eX\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u001fR\u0014\u0010\u0010\u001a\u00020\u000eX\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u001fR\u0014\u0010\u0011\u001a\u00020\u000eX\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001fR\u0014\u0010!\u001a\u00020\u0008X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\"\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010&0%X\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u001a\u0010)\u001a\u00020\u0008*\u0004\u0018\u00010\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010+R\u0018\u0010)\u001a\u00020\u0008*\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010,\u00a8\u0006-"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadSucceeded;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;",
        "paymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "initializationMode",
        "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
        "orderedLpms",
        "",
        "",
        "duration",
        "Lkotlin/time/Duration;",
        "linkMode",
        "Lcom/stripe/android/model/LinkMode;",
        "linkEnabled",
        "",
        "isDeferred",
        "isSpt",
        "googlePaySupported",
        "linkDisplay",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;",
        "financialConnectionsAvailability",
        "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;",
        "requireCvcRecollection",
        "hasDefaultPaymentMethod",
        "setAsDefaultEnabled",
        "setupFutureUsage",
        "Lcom/stripe/android/model/StripeIntent$Usage;",
        "paymentMethodOptionsSetupFutureUsage",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Ljava/util/List;Lkotlin/time/Duration;Lcom/stripe/android/model/LinkMode;ZZZZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/model/StripeIntent$Usage;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getLinkEnabled",
        "()Z",
        "getGooglePaySupported",
        "eventName",
        "getEventName",
        "()Ljava/lang/String;",
        "additionalParams",
        "",
        "",
        "getAdditionalParams",
        "()Ljava/util/Map;",
        "defaultAnalyticsValue",
        "getDefaultAnalyticsValue",
        "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Ljava/lang/String;",
        "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;)Ljava/lang/String;",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final additionalParams:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final eventName:Ljava/lang/String;

.field private final googlePaySupported:Z

.field private final isDeferred:Z

.field private final isSpt:Z

.field private final linkEnabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Ljava/util/List;Lkotlin/time/Duration;Lcom/stripe/android/model/LinkMode;ZZZZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/model/StripeIntent$Usage;Z)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/time/Duration;",
            "Lcom/stripe/android/model/LinkMode;",
            "ZZZZ",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;",
            "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;",
            "Z",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Lcom/stripe/android/model/StripeIntent$Usage;",
            "Z)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p13

    move-object/from16 v4, p14

    const-string v5, "initializationMode"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "orderedLpms"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "linkDisplay"

    move-object/from16 v6, p10

    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    .line 103
    invoke-direct {v0, v5}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    move/from16 v7, p6

    .line 92
    iput-boolean v7, v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadSucceeded;->linkEnabled:Z

    move/from16 v7, p7

    .line 93
    iput-boolean v7, v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadSucceeded;->isDeferred:Z

    move/from16 v7, p8

    .line 94
    iput-boolean v7, v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadSucceeded;->isSpt:Z

    move/from16 v7, p9

    .line 95
    iput-boolean v7, v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadSucceeded;->googlePaySupported:Z

    .line 104
    const-string v7, "mc_load_succeeded"

    iput-object v7, v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadSucceeded;->eventName:Ljava/lang/String;

    .line 105
    invoke-static {}, Lkotlin/collections/MapsKt;->createMapBuilder()Ljava/util/Map;

    move-result-object v7

    if-eqz p4, :cond_0

    .line 106
    invoke-virtual/range {p4 .. p4}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide v8

    invoke-static {v8, v9}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEventKt;->access$getAsSeconds-LRDsOJo(J)F

    move-result v8

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    goto :goto_0

    :cond_0
    move-object v8, v5

    :goto_0
    const-string v9, "duration"

    invoke-interface {v7, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    const-string v8, "selected_lpm"

    invoke-direct/range {p0 .. p1}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadSucceeded;->getDefaultAnalyticsValue(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v7, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    const-string v8, "intent_type"

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadSucceeded;->getDefaultAnalyticsValue(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v8, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    move-object v9, v2

    check-cast v9, Ljava/lang/Iterable;

    const-string v1, ","

    move-object v10, v1

    check-cast v10, Ljava/lang/CharSequence;

    const/16 v16, 0x3e

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v9 .. v17}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ordered_lpms"

    invoke-interface {v7, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    const-string v1, "require_cvc_recollection"

    invoke-static/range {p12 .. p12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v7, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    const-string v1, "fc_sdk_availability"

    invoke-static/range {p11 .. p11}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEventKt;->access$toAnalyticsParam(Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v7, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    const-string v1, "payment_method_options_setup_future_usage"

    invoke-static/range {p16 .. p16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v7, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p15, :cond_1

    .line 113
    invoke-virtual/range {p15 .. p15}, Lcom/stripe/android/model/StripeIntent$Usage;->getCode()Ljava/lang/String;

    move-result-object v5

    :cond_1
    const-string v1, "setup_future_usage"

    invoke-interface {v7, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p5, :cond_2

    .line 115
    const-string v1, "link_mode"

    invoke-static/range {p5 .. p5}, Lcom/stripe/android/model/LinkModeKt;->getAnalyticsValue(Lcom/stripe/android/model/LinkMode;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v7, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-eqz v4, :cond_3

    .line 117
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 118
    const-string v2, "set_as_default_enabled"

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v7, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    :cond_3
    const-string v1, "link_display"

    invoke-virtual {v6}, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;->getAnalyticsValue$paymentsheet_release()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v7, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x1

    .line 121
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    if-eqz v3, :cond_4

    .line 122
    const-string v1, "has_default_payment_method"

    invoke-interface {v7, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    :cond_4
    invoke-static {v7}, Lkotlin/collections/MapsKt;->build(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadSucceeded;->additionalParams:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Ljava/util/List;Lkotlin/time/Duration;Lcom/stripe/android/model/LinkMode;ZZZZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/model/StripeIntent$Usage;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 20

    move/from16 v0, p17

    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    move v14, v1

    goto :goto_0

    :cond_0
    move/from16 v14, p12

    :goto_0
    and-int/lit16 v1, v0, 0x1000

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v15, v2

    goto :goto_1

    :cond_1
    move-object/from16 v15, p13

    :goto_1
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_2

    move-object/from16 v16, v2

    goto :goto_2

    :cond_2
    move-object/from16 v16, p14

    :goto_2
    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_3

    move-object/from16 v17, v2

    goto :goto_3

    :cond_3
    move-object/from16 v17, p15

    :goto_3
    const/16 v19, 0x0

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move/from16 v18, p16

    .line 86
    invoke-direct/range {v2 .. v19}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadSucceeded;-><init>(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Ljava/util/List;Lkotlin/time/Duration;Lcom/stripe/android/model/LinkMode;ZZZZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/model/StripeIntent$Usage;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Ljava/util/List;Lkotlin/time/Duration;Lcom/stripe/android/model/LinkMode;ZZZZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/model/StripeIntent$Usage;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p16}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadSucceeded;-><init>(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Ljava/util/List;Lkotlin/time/Duration;Lcom/stripe/android/model/LinkMode;ZZZZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/model/StripeIntent$Usage;Z)V

    return-void
.end method

.method private final getDefaultAnalyticsValue(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Ljava/lang/String;
    .locals 1

    .line 128
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    if-eqz v0, :cond_0

    const-string p1, "google_pay"

    return-object p1

    .line 129
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    if-eqz v0, :cond_1

    const-string p1, "link"

    return-object p1

    .line 130
    :cond_1
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    if-eqz v0, :cond_4

    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    if-eqz p1, :cond_3

    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    return-object p1

    :cond_3
    :goto_0
    const-string p1, "saved"

    return-object p1

    .line 131
    :cond_4
    const-string p1, "none"

    return-object p1
.end method

.method private final getDefaultAnalyticsValue(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;)Ljava/lang/String;
    .locals 1

    .line 136
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$DeferredIntent;

    if-eqz v0, :cond_2

    .line 137
    check-cast p1, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$DeferredIntent;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$DeferredIntent;->getIntentConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;->getMode()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;

    move-result-object p1

    .line 138
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;

    if-eqz v0, :cond_0

    const-string p1, "deferred_payment_intent"

    return-object p1

    .line 139
    :cond_0
    instance-of p1, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Setup;

    if-eqz p1, :cond_1

    const-string p1, "deferred_setup_intent"

    return-object p1

    .line 137
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 142
    :cond_2
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$PaymentIntent;

    if-eqz v0, :cond_3

    const-string p1, "payment_intent"

    return-object p1

    .line 143
    :cond_3
    instance-of p1, p1, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$SetupIntent;

    if-eqz p1, :cond_4

    const-string p1, "setup_intent"

    return-object p1

    .line 135
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method protected getAdditionalParams()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 105
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadSucceeded;->additionalParams:Ljava/util/Map;

    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadSucceeded;->eventName:Ljava/lang/String;

    return-object v0
.end method

.method protected getGooglePaySupported()Z
    .locals 1

    .line 95
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadSucceeded;->googlePaySupported:Z

    return v0
.end method

.method protected getLinkEnabled()Z
    .locals 1

    .line 92
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadSucceeded;->linkEnabled:Z

    return v0
.end method

.method protected isDeferred()Z
    .locals 1

    .line 93
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadSucceeded;->isDeferred:Z

    return v0
.end method

.method protected isSpt()Z
    .locals 1

    .line 94
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadSucceeded;->isSpt:Z

    return v0
.end method
