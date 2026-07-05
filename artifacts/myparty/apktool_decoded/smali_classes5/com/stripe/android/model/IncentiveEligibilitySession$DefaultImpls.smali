.class public final Lcom/stripe/android/model/IncentiveEligibilitySession$DefaultImpls;
.super Ljava/lang/Object;
.source "IncentiveEligibilitySession.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/IncentiveEligibilitySession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static toParamMap(Lcom/stripe/android/model/IncentiveEligibilitySession;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/IncentiveEligibilitySession;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 26
    instance-of v0, p0, Lcom/stripe/android/model/IncentiveEligibilitySession$PaymentIntent;

    if-eqz v0, :cond_0

    const-string v0, "financial_incentive[payment_intent]"

    goto :goto_0

    .line 27
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/model/IncentiveEligibilitySession$SetupIntent;

    if-eqz v0, :cond_1

    const-string v0, "financial_incentive[setup_intent]"

    goto :goto_0

    .line 28
    :cond_1
    instance-of v0, p0, Lcom/stripe/android/model/IncentiveEligibilitySession$DeferredIntent;

    if-eqz v0, :cond_2

    const-string v0, "financial_incentive[elements_session_id]"

    .line 31
    :goto_0
    invoke-interface {p0}, Lcom/stripe/android/model/IncentiveEligibilitySession;->getId()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    .line 25
    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
