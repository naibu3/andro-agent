.class public final Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$Init;
.super Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;
.source "CustomerSheetEvent.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Init"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$Init$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0008\u001a\u00020\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\"\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$Init;",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;",
        "configuration",
        "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
        "integrationType",
        "Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;",
        "<init>",
        "(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;)V",
        "eventName",
        "",
        "getEventName",
        "()Ljava/lang/String;",
        "additionalParams",
        "",
        "",
        "getAdditionalParams",
        "()Ljava/util/Map;",
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
.field private final configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

.field private final eventName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;)V
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "integrationType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 19
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    iput-object p1, p0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$Init;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    .line 20
    sget-object p1, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$Init$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/4 p2, 0x1

    if-eq p1, p2, :cond_1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_0

    .line 22
    const-string p1, "cs_init_with_customer_adapter"

    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 21
    :cond_1
    const-string p1, "cs_init_with_customer_session"

    .line 20
    :goto_0
    iput-object p1, p0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$Init;->eventName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAdditionalParams()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x8

    .line 27
    new-array v0, v0, [Lkotlin/Pair;

    iget-object v1, p0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$Init;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getGooglePayEnabled()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "google_pay_enabled"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 28
    iget-object v1, p0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$Init;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getDefaultBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->isFilledOut$paymentsheet_release()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v3, "default_billing_details"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    .line 29
    iget-object v1, p0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$Init;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getAppearance()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    move-result-object v1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lcom/stripe/android/common/analytics/AnalyticsKtxKt;->toAnalyticsMap$default(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;ZILjava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "appearance"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 31
    iget-object v1, p0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$Init;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getAllowsRemovalOfLastSavedPaymentMethod$paymentsheet_release()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 30
    const-string v2, "allows_removal_of_last_saved_payment_method"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 32
    iget-object v1, p0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$Init;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getPaymentMethodOrder$paymentsheet_release()Ljava/util/List;

    move-result-object v1

    const-string v2, "payment_method_order"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 34
    iget-object v1, p0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$Init;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v1

    invoke-static {v1}, Lcom/stripe/android/common/analytics/AnalyticsKtxKt;->toAnalyticsMap(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;)Ljava/util/Map;

    move-result-object v1

    .line 33
    const-string v2, "billing_details_collection_configuration"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    .line 36
    iget-object v1, p0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$Init;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getPreferredNetworks()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/stripe/android/common/analytics/AnalyticsKtxKt;->toAnalyticsValue(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "preferred_networks"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    .line 37
    iget-object v1, p0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$Init;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getCardBrandAcceptance$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    move-result-object v1

    invoke-static {v1}, Lcom/stripe/android/common/analytics/AnalyticsKtxKt;->toAnalyticsValue(Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "card_brand_acceptance"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    .line 26
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 40
    const-string v1, "cs_config"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 39
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$Init;->eventName:Ljava/lang/String;

    return-object v0
.end method
