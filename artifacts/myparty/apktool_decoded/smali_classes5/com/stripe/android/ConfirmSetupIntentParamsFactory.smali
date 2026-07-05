.class public final Lcom/stripe/android/ConfirmSetupIntentParamsFactory;
.super Lcom/stripe/android/ConfirmStripeIntentParamsFactory;
.source "ConfirmStripeIntentParamsFactory.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/android/ConfirmStripeIntentParamsFactory<",
        "Lcom/stripe/android/model/ConfirmSetupIntentParams;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J,\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J$\u0010\t\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/ConfirmSetupIntentParamsFactory;",
        "Lcom/stripe/android/ConfirmStripeIntentParamsFactory;",
        "Lcom/stripe/android/model/ConfirmSetupIntentParams;",
        "clientSecret",
        "",
        "intent",
        "Lcom/stripe/android/model/SetupIntent;",
        "<init>",
        "(Ljava/lang/String;Lcom/stripe/android/model/SetupIntent;)V",
        "create",
        "paymentMethodId",
        "paymentMethodType",
        "Lcom/stripe/android/model/PaymentMethod$Type;",
        "optionsParams",
        "Lcom/stripe/android/model/PaymentMethodOptionsParams;",
        "extraParams",
        "Lcom/stripe/android/model/PaymentMethodExtraParams;",
        "createParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final clientSecret:Ljava/lang/String;

.field private final intent:Lcom/stripe/android/model/SetupIntent;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/model/SetupIntent;)V
    .locals 1

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 109
    invoke-direct {p0, v0}, Lcom/stripe/android/ConfirmStripeIntentParamsFactory;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 107
    iput-object p1, p0, Lcom/stripe/android/ConfirmSetupIntentParamsFactory;->clientSecret:Ljava/lang/String;

    .line 108
    iput-object p2, p0, Lcom/stripe/android/ConfirmSetupIntentParamsFactory;->intent:Lcom/stripe/android/model/SetupIntent;

    return-void
.end method


# virtual methods
.method public create(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;)Lcom/stripe/android/model/ConfirmSetupIntentParams;
    .locals 8

    const-string p2, "createParams"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    sget-object v0, Lcom/stripe/android/model/ConfirmSetupIntentParams;->Companion:Lcom/stripe/android/model/ConfirmSetupIntentParams$Companion;

    .line 133
    iget-object v2, p0, Lcom/stripe/android/ConfirmSetupIntentParamsFactory;->clientSecret:Ljava/lang/String;

    if-eqz p3, :cond_0

    .line 134
    invoke-static {p3}, Lcom/stripe/android/ConfirmStripeIntentParamsFactoryKt;->access$extractSetAsDefaultPaymentMethodFromExtraParams(Lcom/stripe/android/model/PaymentMethodExtraParams;)Ljava/lang/Boolean;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    move-object v5, p2

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    .line 131
    invoke-static/range {v0 .. v7}, Lcom/stripe/android/model/ConfirmSetupIntentParams$Companion;->createWithSetAsDefaultPaymentMethod$payments_core_release$default(Lcom/stripe/android/model/ConfirmSetupIntentParams$Companion;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Ljava/lang/String;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/stripe/android/model/ConfirmSetupIntentParams;

    move-result-object p1

    return-object p1
.end method

.method public create(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;)Lcom/stripe/android/model/ConfirmSetupIntentParams;
    .locals 9

    const-string p3, "paymentMethodId"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "paymentMethodType"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    sget-object v0, Lcom/stripe/android/model/ConfirmSetupIntentParams;->Companion:Lcom/stripe/android/model/ConfirmSetupIntentParams$Companion;

    .line 119
    iget-object v2, p0, Lcom/stripe/android/ConfirmSetupIntentParamsFactory;->clientSecret:Ljava/lang/String;

    .line 120
    iget-object p3, p0, Lcom/stripe/android/ConfirmSetupIntentParamsFactory;->intent:Lcom/stripe/android/model/SetupIntent;

    check-cast p3, Lcom/stripe/android/model/StripeIntent;

    invoke-static {p3, p2}, Lcom/stripe/android/ConfirmStripeIntentParamsFactoryKt;->access$mandateData(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/PaymentMethod$Type;)Lcom/stripe/android/model/MandateDataParams;

    move-result-object v3

    if-eqz p4, :cond_0

    .line 121
    invoke-static {p4}, Lcom/stripe/android/ConfirmStripeIntentParamsFactoryKt;->access$extractSetAsDefaultPaymentMethodFromExtraParams(Lcom/stripe/android/model/PaymentMethodExtraParams;)Ljava/lang/Boolean;

    move-result-object p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    move-object v5, p3

    .line 122
    iget-object v6, p2, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    .line 117
    invoke-static/range {v0 .. v8}, Lcom/stripe/android/model/ConfirmSetupIntentParams$Companion;->createWithSetAsDefaultPaymentMethod$payments_core_release$default(Lcom/stripe/android/model/ConfirmSetupIntentParams$Companion;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/ConfirmSetupIntentParams;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic create(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;)Lcom/stripe/android/model/ConfirmStripeIntentParams;
    .locals 0

    .line 106
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/ConfirmSetupIntentParamsFactory;->create(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;)Lcom/stripe/android/model/ConfirmSetupIntentParams;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/ConfirmStripeIntentParams;

    return-object p1
.end method

.method public bridge synthetic create(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;)Lcom/stripe/android/model/ConfirmStripeIntentParams;
    .locals 0

    .line 106
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/ConfirmSetupIntentParamsFactory;->create(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;)Lcom/stripe/android/model/ConfirmSetupIntentParams;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/ConfirmStripeIntentParams;

    return-object p1
.end method
