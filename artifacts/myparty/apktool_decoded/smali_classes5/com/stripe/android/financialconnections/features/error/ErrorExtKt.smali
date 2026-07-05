.class public final Lcom/stripe/android/financialconnections/features/error/ErrorExtKt;
.super Ljava/lang/Object;
.source "ErrorExt.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "toAttestationErrorIfApplicable",
        "",
        "sdkPrefillDetails",
        "Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;",
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
.method public static final toAttestationErrorIfApplicable(Ljava/lang/Throwable;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;)Ljava/lang/Throwable;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    instance-of v0, p0, Lcom/stripe/android/core/exception/APIException;

    const-string v1, "An unknown error occurred"

    if-eqz v0, :cond_3

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/core/exception/APIException;

    invoke-virtual {v0}, Lcom/stripe/android/core/exception/APIException;->getStripeError()Lcom/stripe/android/core/StripeError;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/stripe/android/core/StripeError;->getCode()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v3, "link_failed_to_attest_request"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 18
    sget-object p0, Lcom/stripe/attestation/AttestationError$ErrorType;->BACKEND_VERDICT_FAILED:Lcom/stripe/attestation/AttestationError$ErrorType;

    .line 19
    invoke-virtual {v0}, Lcom/stripe/android/core/exception/APIException;->getStripeError()Lcom/stripe/android/core/StripeError;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/stripe/android/core/StripeError;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v2

    .line 17
    :cond_2
    :goto_1
    new-instance v2, Lcom/stripe/android/financialconnections/features/error/FinancialConnectionsAttestationError;

    .line 21
    check-cast v0, Ljava/lang/Throwable;

    .line 17
    invoke-direct {v2, p0, p1, v1, v0}, Lcom/stripe/android/financialconnections/features/error/FinancialConnectionsAttestationError;-><init>(Lcom/stripe/attestation/AttestationError$ErrorType;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast v2, Ljava/lang/Throwable;

    return-object v2

    .line 24
    :cond_3
    instance-of v0, p0, Lcom/stripe/attestation/AttestationError;

    if-eqz v0, :cond_5

    .line 26
    move-object v0, p0

    check-cast v0, Lcom/stripe/attestation/AttestationError;

    invoke-virtual {v0}, Lcom/stripe/attestation/AttestationError;->getErrorType()Lcom/stripe/attestation/AttestationError$ErrorType;

    move-result-object v2

    .line 27
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_4

    goto :goto_2

    :cond_4
    move-object v1, p0

    .line 25
    :goto_2
    new-instance p0, Lcom/stripe/android/financialconnections/features/error/FinancialConnectionsAttestationError;

    .line 29
    check-cast v0, Ljava/lang/Throwable;

    .line 25
    invoke-direct {p0, v2, p1, v1, v0}, Lcom/stripe/android/financialconnections/features/error/FinancialConnectionsAttestationError;-><init>(Lcom/stripe/attestation/AttestationError$ErrorType;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast p0, Ljava/lang/Throwable;

    :cond_5
    return-object p0
.end method
