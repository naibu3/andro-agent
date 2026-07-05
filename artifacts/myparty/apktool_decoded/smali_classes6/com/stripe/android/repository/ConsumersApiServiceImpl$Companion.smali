.class public final Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;
.super Ljava/lang/Object;
.source "ConsumersApiService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/repository/ConsumersApiServiceImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0015\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u0007R\u0014\u0010\u000c\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0007R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;",
        "",
        "<init>",
        "()V",
        "consumerAccountsSignUpUrl",
        "",
        "getConsumerAccountsSignUpUrl$payments_model_release",
        "()Ljava/lang/String;",
        "consumerMobileSignUpUrl",
        "getConsumerMobileSignUpUrl$payments_model_release",
        "consumerSessionLookupUrl",
        "getConsumerSessionLookupUrl$payments_model_release",
        "mobileConsumerSessionLookupUrl",
        "getMobileConsumerSessionLookupUrl$payments_model_release",
        "startConsumerVerificationUrl",
        "getStartConsumerVerificationUrl$payments_model_release",
        "confirmConsumerVerificationUrl",
        "getConfirmConsumerVerificationUrl$payments_model_release",
        "attachLinkConsumerToLinkAccountSession",
        "getAttachLinkConsumerToLinkAccountSession$payments_model_release",
        "createPaymentDetails",
        "createLinkAccountSession",
        "sharePaymentDetails",
        "updateAvailableIncentivesUrl",
        "getApiUrl",
        "path",
        "payments-model_release"
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

    .line 431
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$getApiUrl(Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 431
    invoke-direct {p0, p1}, Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;->getApiUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final getApiUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 496
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "https://api.stripe.com/v1/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final getAttachLinkConsumerToLinkAccountSession$payments_model_release()Ljava/lang/String;
    .locals 1

    .line 472
    invoke-static {}, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->access$getAttachLinkConsumerToLinkAccountSession$cp()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getConfirmConsumerVerificationUrl$payments_model_release()Ljava/lang/String;
    .locals 1

    .line 466
    invoke-static {}, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->access$getConfirmConsumerVerificationUrl$cp()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getConsumerAccountsSignUpUrl$payments_model_release()Ljava/lang/String;
    .locals 1

    .line 436
    invoke-static {}, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->access$getConsumerAccountsSignUpUrl$cp()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getConsumerMobileSignUpUrl$payments_model_release()Ljava/lang/String;
    .locals 1

    .line 442
    invoke-static {}, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->access$getConsumerMobileSignUpUrl$cp()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getConsumerSessionLookupUrl$payments_model_release()Ljava/lang/String;
    .locals 1

    .line 448
    invoke-static {}, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->access$getConsumerSessionLookupUrl$cp()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getMobileConsumerSessionLookupUrl$payments_model_release()Ljava/lang/String;
    .locals 1

    .line 454
    invoke-static {}, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->access$getMobileConsumerSessionLookupUrl$cp()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getStartConsumerVerificationUrl$payments_model_release()Ljava/lang/String;
    .locals 1

    .line 460
    invoke-static {}, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->access$getStartConsumerVerificationUrl$cp()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
