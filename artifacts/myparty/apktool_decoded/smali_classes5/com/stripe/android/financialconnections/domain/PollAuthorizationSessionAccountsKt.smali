.class public final Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccountsKt;
.super Ljava/lang/Object;
.source "PollAuthorizationSessionAccounts.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccountsKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u001a\u000e\u0010\t\u001a\u00020\n*\u0004\u0018\u00010\u000bH\u0002\u00a8\u0006\u000c"
    }
    d2 = {
        "toDomainException",
        "Lcom/stripe/android/core/exception/StripeException;",
        "institution",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "businessName",
        "",
        "canRetry",
        "",
        "showManualEntry",
        "toPollIntervalMs",
        "",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;",
        "financial-connections_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic access$toDomainException(Lcom/stripe/android/core/exception/StripeException;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;ZZ)Lcom/stripe/android/core/exception/StripeException;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccountsKt;->toDomainException(Lcom/stripe/android/core/exception/StripeException;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;ZZ)Lcom/stripe/android/core/exception/StripeException;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$toPollIntervalMs(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;)J
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccountsKt;->toPollIntervalMs(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;)J

    move-result-wide v0

    return-wide v0
.end method

.method private static final toDomainException(Lcom/stripe/android/core/exception/StripeException;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;ZZ)Lcom/stripe/android/core/exception/StripeException;
    .locals 2

    if-nez p1, :cond_0

    return-object p0

    .line 77
    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/core/exception/StripeException;->getStripeError()Lcom/stripe/android/core/StripeError;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/core/StripeError;->getExtraFields()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "reason"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const-string v1, "no_supported_payment_method_type_accounts_found"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 78
    new-instance p3, Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;

    .line 79
    invoke-virtual {p0}, Lcom/stripe/android/core/exception/StripeException;->getStripeError()Lcom/stripe/android/core/StripeError;

    move-result-object p4

    if-eqz p4, :cond_2

    invoke-virtual {p4}, Lcom/stripe/android/core/StripeError;->getExtraFields()Ljava/util/Map;

    move-result-object p4

    if-eqz p4, :cond_2

    const-string v0, "total_accounts_count"

    invoke-interface {p4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    if-eqz p4, :cond_2

    invoke-static {p4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p4

    goto :goto_1

    :cond_2
    const/4 p4, 0x0

    :goto_1
    if-nez p2, :cond_3

    .line 82
    const-string p2, ""

    .line 78
    :cond_3
    invoke-direct {p3, p4, p1, p2, p0}, Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;-><init>(ILcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Lcom/stripe/android/core/exception/StripeException;)V

    check-cast p3, Lcom/stripe/android/core/exception/StripeException;

    return-object p3

    .line 86
    :cond_4
    new-instance p2, Lcom/stripe/android/financialconnections/exception/AccountLoadError;

    invoke-direct {p2, p4, p3, p1, p0}, Lcom/stripe/android/financialconnections/exception/AccountLoadError;-><init>(ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/core/exception/StripeException;)V

    check-cast p2, Lcom/stripe/android/core/exception/StripeException;

    return-object p2
.end method

.method private static final toPollIntervalMs(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;)J
    .locals 3

    .line 95
    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const-wide/high16 v0, 0x3ffc000000000000L    # 1.75

    sget-object v2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, v2}, Lkotlin/time/DurationKt;->toDuration(DLkotlin/time/DurationUnit;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    move-result-wide v0

    if-nez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    .line 96
    :cond_0
    sget-object v2, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccountsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->ordinal()I

    move-result p0

    aget p0, v2, p0

    :goto_0
    const/4 v2, 0x1

    if-eq p0, v2, :cond_2

    const/4 v2, 0x2

    if-eq p0, v2, :cond_2

    const/4 v2, 0x3

    if-eq p0, v2, :cond_2

    const/4 v2, 0x4

    if-eq p0, v2, :cond_2

    const/4 v2, 0x5

    if-eq p0, v2, :cond_1

    return-wide v0

    .line 107
    :cond_1
    sget-object p0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    sget-object p0, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, p0}, Lkotlin/time/DurationKt;->toDuration(DLkotlin/time/DurationUnit;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    move-result-wide v0

    return-wide v0

    :cond_2
    const-wide/16 v0, 0x0

    return-wide v0
.end method
