.class public final Lcom/stripe/android/financialconnections/utils/HostedAuthUrlBuilder;
.super Ljava/lang/Object;
.source "HostedAuthUrlBuilder.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHostedAuthUrlBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HostedAuthUrlBuilder.kt\ncom/stripe/android/financialconnections/utils/HostedAuthUrlBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J&\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\nJD\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0008\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0010H\u0002\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/utils/HostedAuthUrlBuilder;",
        "",
        "<init>",
        "()V",
        "create",
        "",
        "args",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;",
        "hostedAuthUrl",
        "prefillDetails",
        "Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;",
        "isInstantDebits",
        "",
        "linkMode",
        "Lcom/stripe/android/model/LinkMode;",
        "billingDetails",
        "Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;",
        "incentiveEligibilitySession",
        "Lcom/stripe/android/model/IncentiveEligibilitySession;",
        "makeBillingDetailsQueryParams",
        "billingAddress",
        "financial-connections-core_release"
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
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/utils/HostedAuthUrlBuilder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/utils/HostedAuthUrlBuilder;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/utils/HostedAuthUrlBuilder;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/utils/HostedAuthUrlBuilder;->INSTANCE:Lcom/stripe/android/financialconnections/utils/HostedAuthUrlBuilder;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final create(Ljava/lang/String;ZLcom/stripe/android/model/LinkMode;Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;Lcom/stripe/android/model/IncentiveEligibilitySession;)Ljava/lang/String;
    .locals 9

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 v0, 0x1

    .line 42
    new-array v1, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    if-eqz p2, :cond_4

    .line 46
    const-string p2, "return_payment_method=true"

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    const-string p2, "expand_payment_method=true"

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p6, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    .line 48
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "instantDebitsIncentive="

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p3, :cond_2

    .line 49
    invoke-virtual {p3}, Lcom/stripe/android/model/LinkMode;->getValue()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "link_mode="

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    if-eqz p4, :cond_3

    .line 50
    sget-object p2, Lcom/stripe/android/financialconnections/utils/HostedAuthUrlBuilder;->INSTANCE:Lcom/stripe/android/financialconnections/utils/HostedAuthUrlBuilder;

    invoke-direct {p2, p4}, Lcom/stripe/android/financialconnections/utils/HostedAuthUrlBuilder;->makeBillingDetailsQueryParams(Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    if-eqz p6, :cond_4

    .line 51
    invoke-interface {p6}, Lcom/stripe/android/model/IncentiveEligibilitySession;->getId()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "incentiveEligibilitySession="

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    if-eqz p5, :cond_7

    .line 55
    invoke-virtual {p5}, Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;->getEmail()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_5

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "email="

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    :cond_5
    invoke-virtual {p5}, Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;->getPhone()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "linkMobilePhone="

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 57
    :cond_6
    invoke-virtual {p5}, Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;->getPhoneCountryCode()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_7

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "linkMobilePhoneCountry="

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    :cond_7
    const-string p2, "launched_by=android_sdk"

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    const-string p1, "&"

    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic create$default(Lcom/stripe/android/financialconnections/utils/HostedAuthUrlBuilder;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;Ljava/lang/String;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 18
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;->getElementsSessionContext()Lcom/stripe/android/financialconnections/ElementsSessionContext;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/ElementsSessionContext;->getPrefillDetails()Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;

    move-result-object p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    .line 15
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/utils/HostedAuthUrlBuilder;->create(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;Ljava/lang/String;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final makeBillingDetailsQueryParams(Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;)Ljava/lang/String;
    .locals 1

    .line 68
    const-string v0, "billingDetails"

    invoke-static {p1}, Lcom/stripe/android/financialconnections/utils/BillingDetailsExtensionsKt;->toApiParams(Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;)Ljava/util/Map;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    .line 67
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 70
    sget-object v0, Lcom/stripe/android/core/networking/QueryStringFactory;->INSTANCE:Lcom/stripe/android/core/networking/QueryStringFactory;

    invoke-virtual {v0, p1}, Lcom/stripe/android/core/networking/QueryStringFactory;->createFromParamsWithEmptyValues(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final create(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;Ljava/lang/String;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;)Ljava/lang/String;
    .locals 8

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-static {p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgsKt;->getFlowType(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;)Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;->ForInstantDebits:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move v3, v0

    .line 23
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;->getElementsSessionContext()Lcom/stripe/android/financialconnections/ElementsSessionContext;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ElementsSessionContext;->getLinkMode()Lcom/stripe/android/model/LinkMode;

    move-result-object v0

    move-object v4, v0

    goto :goto_1

    :cond_1
    move-object v4, v1

    .line 24
    :goto_1
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;->getElementsSessionContext()Lcom/stripe/android/financialconnections/ElementsSessionContext;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ElementsSessionContext;->getBillingDetails()Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;

    move-result-object v0

    move-object v5, v0

    goto :goto_2

    :cond_2
    move-object v5, v1

    .line 26
    :goto_2
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;->getElementsSessionContext()Lcom/stripe/android/financialconnections/ElementsSessionContext;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/ElementsSessionContext;->getIncentiveEligibilitySession()Lcom/stripe/android/model/IncentiveEligibilitySession;

    move-result-object v1

    :cond_3
    move-object v2, p2

    move-object v6, p3

    move-object v7, v1

    move-object v1, p0

    .line 20
    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/financialconnections/utils/HostedAuthUrlBuilder;->create(Ljava/lang/String;ZLcom/stripe/android/model/LinkMode;Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;Lcom/stripe/android/model/IncentiveEligibilitySession;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
