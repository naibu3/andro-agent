.class public final Lcom/stripe/android/link/account/DefaultLinkAuth;
.super Ljava/lang/Object;
.source "DefaultLinkAuth.kt"

# interfaces
.implements Lcom/stripe/android/link/account/LinkAuth;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\t\u0008\u0001\u0018\u00002\u00020\u0001B3\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0001\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ8\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0002\u0010\u0016J0\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0096@\u00a2\u0006\u0002\u0010\u001dJ@\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@\u00a2\u0006\u0004\u0008!\u0010\u0016J:\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0082@\u00a2\u0006\u0004\u0008#\u0010\u001dJ\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u000bH\u0002J\u0019\u0010)\u001a\u00020\u000f*\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001fH\u0002\u00a2\u0006\u0002\u0010*J\u000c\u0010)\u001a\u00020\u000f*\u00020\'H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010+\u001a\u00020\u001b*\u00020\'8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010,R\u0018\u0010-\u001a\u00020\u001b*\u00020\'8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010,R\u0018\u0010.\u001a\u00020\u001b*\u00020\'8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010,R\u0018\u0010/\u001a\u00020\u001b*\u00020\'8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008/\u0010,\u00a8\u00060"
    }
    d2 = {
        "Lcom/stripe/android/link/account/DefaultLinkAuth;",
        "Lcom/stripe/android/link/account/LinkAuth;",
        "linkGate",
        "Lcom/stripe/android/link/gate/LinkGate;",
        "linkAccountManager",
        "Lcom/stripe/android/link/account/LinkAccountManager;",
        "integrityRequestManager",
        "Lcom/stripe/attestation/IntegrityRequestManager;",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "applicationId",
        "",
        "<init>",
        "(Lcom/stripe/android/link/gate/LinkGate;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/attestation/IntegrityRequestManager;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Ljava/lang/String;)V",
        "signUp",
        "Lcom/stripe/android/link/account/LinkAuthResult;",
        "email",
        "phoneNumber",
        "country",
        "name",
        "consentAction",
        "Lcom/stripe/android/link/ui/inline/SignUpConsentAction;",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/SignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "lookUp",
        "emailSource",
        "Lcom/stripe/android/model/EmailSource;",
        "startSession",
        "",
        "customerId",
        "(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "mobileSignUp",
        "Lkotlin/Result;",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "mobileSignUp-hUnOzRk",
        "mobileLookUp",
        "mobileLookUp-yxL6bBk",
        "reportError",
        "",
        "error",
        "",
        "operation",
        "toLinkAuthResult",
        "(Ljava/lang/Object;)Lcom/stripe/android/link/account/LinkAuthResult;",
        "isAttestationError",
        "(Ljava/lang/Throwable;)Z",
        "isIntegrityManagerError",
        "isBackendAttestationError",
        "isAccountError",
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
.field private final applicationId:Ljava/lang/String;

.field private final errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

.field private final integrityRequestManager:Lcom/stripe/attestation/IntegrityRequestManager;

.field private final linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

.field private final linkGate:Lcom/stripe/android/link/gate/LinkGate;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/gate/LinkGate;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/attestation/IntegrityRequestManager;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Ljava/lang/String;)V
    .locals 1
    .param p5    # Ljava/lang/String;
        .annotation runtime Ljavax/inject/Named;
            value = "application_id"
        .end annotation
    .end param
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "linkGate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "integrityRequestManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationId"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/stripe/android/link/account/DefaultLinkAuth;->linkGate:Lcom/stripe/android/link/gate/LinkGate;

    .line 18
    iput-object p2, p0, Lcom/stripe/android/link/account/DefaultLinkAuth;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    .line 19
    iput-object p3, p0, Lcom/stripe/android/link/account/DefaultLinkAuth;->integrityRequestManager:Lcom/stripe/attestation/IntegrityRequestManager;

    .line 20
    iput-object p4, p0, Lcom/stripe/android/link/account/DefaultLinkAuth;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 21
    iput-object p5, p0, Lcom/stripe/android/link/account/DefaultLinkAuth;->applicationId:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$mobileLookUp-yxL6bBk(Lcom/stripe/android/link/account/DefaultLinkAuth;Ljava/lang/String;Lcom/stripe/android/model/EmailSource;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 16
    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/link/account/DefaultLinkAuth;->mobileLookUp-yxL6bBk(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$mobileSignUp-hUnOzRk(Lcom/stripe/android/link/account/DefaultLinkAuth;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/SignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 16
    invoke-direct/range {p0 .. p6}, Lcom/stripe/android/link/account/DefaultLinkAuth;->mobileSignUp-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/SignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final isAccountError(Ljava/lang/Throwable;)Z
    .locals 1

    .line 177
    instance-of v0, p1, Lcom/stripe/android/core/exception/APIException;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/stripe/android/core/exception/APIException;

    invoke-virtual {p1}, Lcom/stripe/android/core/exception/APIException;->getStripeError()Lcom/stripe/android/core/StripeError;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/core/StripeError;->getCode()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string v0, "link_consumer_details_not_available"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private final isAttestationError(Ljava/lang/Throwable;)Z
    .locals 1

    .line 164
    invoke-direct {p0, p1}, Lcom/stripe/android/link/account/DefaultLinkAuth;->isIntegrityManagerError(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Lcom/stripe/android/link/account/DefaultLinkAuth;->isBackendAttestationError(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private final isBackendAttestationError(Ljava/lang/Throwable;)Z
    .locals 1

    .line 172
    instance-of v0, p1, Lcom/stripe/android/core/exception/APIException;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/stripe/android/core/exception/APIException;

    invoke-virtual {p1}, Lcom/stripe/android/core/exception/APIException;->getStripeError()Lcom/stripe/android/core/StripeError;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/core/StripeError;->getCode()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string v0, "link_failed_to_attest_request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private final isIntegrityManagerError(Ljava/lang/Throwable;)Z
    .locals 0

    .line 168
    instance-of p1, p1, Lcom/stripe/attestation/AttestationError;

    return p1
.end method

.method private final mobileLookUp-yxL6bBk(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/EmailSource;",
            "Z",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p5, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;

    iget v1, v0, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p5, v0, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;->label:I

    sub-int/2addr p5, v2

    iput p5, v0, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;

    invoke-direct {v0, p0, p5}, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;-><init>(Lcom/stripe/android/link/account/DefaultLinkAuth;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v8, v0

    iget-object p5, v8, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 96
    iget v1, v8, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v8, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/account/DefaultLinkAuth;

    :try_start_0
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p5, Lkotlin/Result;

    invoke-virtual {p5}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    move-object p2, v0

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean p3, v8, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;->Z$0:Z

    iget-object p1, v8, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;->L$4:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/account/DefaultLinkAuth;

    iget-object p2, v8, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;->L$3:Ljava/lang/Object;

    move-object p4, p2

    check-cast p4, Ljava/lang/String;

    iget-object p2, v8, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;->L$2:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/model/EmailSource;

    iget-object v1, v8, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v3, v8, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/link/account/DefaultLinkAuth;

    :try_start_1
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p5, Lkotlin/Result;

    invoke-virtual {p5}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v6, v3

    move-object v3, p2

    move-object p2, v6

    move v6, p3

    move p3, v2

    move-object v2, v1

    :goto_1
    move-object v7, p4

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p2, v0

    move-object p1, v3

    goto/16 :goto_5

    :cond_3
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 102
    :try_start_2
    sget-object p5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object p5, p0

    check-cast p5, Lcom/stripe/android/link/account/DefaultLinkAuth;

    .line 103
    iget-object p5, p0, Lcom/stripe/android/link/account/DefaultLinkAuth;->integrityRequestManager:Lcom/stripe/attestation/IntegrityRequestManager;

    iput-object p0, v8, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;->L$0:Ljava/lang/Object;

    iput-object p1, v8, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;->L$1:Ljava/lang/Object;

    iput-object p2, v8, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;->L$2:Ljava/lang/Object;

    iput-object p4, v8, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;->L$3:Ljava/lang/Object;

    iput-object p0, v8, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;->L$4:Ljava/lang/Object;

    iput-boolean p3, v8, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;->Z$0:Z

    iput v3, v8, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;->label:I

    invoke-static {p5, v4, v8, v3, v4}, Lcom/stripe/attestation/IntegrityRequestManager$DefaultImpls;->requestToken-gIAlu-s$default(Lcom/stripe/attestation/IntegrityRequestManager;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-ne p5, v0, :cond_4

    goto :goto_3

    :cond_4
    move-object v3, p2

    move v6, p3

    move p3, v2

    move-object p2, p0

    move-object v2, p1

    move-object p1, p2

    goto :goto_1

    :goto_2
    :try_start_3
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p5, Ljava/lang/String;

    .line 104
    iget-object v1, p1, Lcom/stripe/android/link/account/DefaultLinkAuth;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    .line 108
    iget-object v5, p1, Lcom/stripe/android/link/account/DefaultLinkAuth;->applicationId:Ljava/lang/String;

    .line 104
    iput-object p2, v8, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;->L$0:Ljava/lang/Object;

    iput-object v4, v8, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;->L$1:Ljava/lang/Object;

    iput-object v4, v8, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;->L$2:Ljava/lang/Object;

    iput-object v4, v8, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;->L$3:Ljava/lang/Object;

    iput-object v4, v8, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;->L$4:Ljava/lang/Object;

    iput p3, v8, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileLookUp$1;->label:I

    move-object v4, p5

    invoke-interface/range {v1 .. v8}, Lcom/stripe/android/link/account/LinkAccountManager;->mobileLookupConsumer-bMdYcbs(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne p1, v0, :cond_5

    :goto_3
    return-object v0

    :cond_5
    move-object v9, p2

    move-object p2, p1

    move-object p1, v9

    .line 111
    :goto_4
    :try_start_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lcom/stripe/android/link/model/LinkAccount;

    .line 102
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_6

    :catchall_2
    move-exception v0

    move-object p1, v0

    move-object v9, p2

    move-object p2, p1

    move-object p1, v9

    goto :goto_5

    :catchall_3
    move-exception v0

    move-object p2, v0

    move-object p1, p0

    :goto_5
    sget-object p3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 112
    :goto_6
    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p3

    if-eqz p3, :cond_6

    .line 113
    const-string p4, "lookup"

    invoke-direct {p1, p3, p4}, Lcom/stripe/android/link/account/DefaultLinkAuth;->reportError(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_6
    return-object p2
.end method

.method private final mobileSignUp-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/SignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/link/ui/inline/SignUpConsentAction;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p6

    instance-of v1, v0, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;

    iget v2, v1, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;-><init>(Lcom/stripe/android/link/account/DefaultLinkAuth;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v10, v1

    iget-object v0, v10, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 73
    iget v2, v10, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v10, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/account/DefaultLinkAuth;

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v10, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->L$6:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/account/DefaultLinkAuth;

    iget-object v2, v10, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->L$5:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/link/ui/inline/SignUpConsentAction;

    iget-object v4, v10, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->L$4:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v6, v10, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->L$3:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v7, v10, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->L$2:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v8, v10, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->L$1:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v10, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lcom/stripe/android/link/account/DefaultLinkAuth;

    :try_start_1
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v11, v7

    move-object v7, v4

    move-object v4, v11

    move-object v11, v9

    move-object v9, v2

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object p1, v9

    goto/16 :goto_4

    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 80
    :try_start_2
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/link/account/DefaultLinkAuth;

    .line 81
    iget-object v0, p0, Lcom/stripe/android/link/account/DefaultLinkAuth;->integrityRequestManager:Lcom/stripe/attestation/IntegrityRequestManager;

    iput-object p0, v10, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->L$0:Ljava/lang/Object;

    iput-object p1, v10, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->L$1:Ljava/lang/Object;

    iput-object p2, v10, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->L$2:Ljava/lang/Object;

    iput-object p3, v10, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->L$3:Ljava/lang/Object;

    move-object/from16 v7, p4

    iput-object v7, v10, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->L$4:Ljava/lang/Object;

    move-object/from16 v8, p5

    iput-object v8, v10, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->L$5:Ljava/lang/Object;

    iput-object p0, v10, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->L$6:Ljava/lang/Object;

    iput v4, v10, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->label:I

    invoke-static {v0, v5, v10, v4, v5}, Lcom/stripe/attestation/IntegrityRequestManager$DefaultImpls;->requestToken-gIAlu-s$default(Lcom/stripe/attestation/IntegrityRequestManager;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-ne v0, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v11, p0

    move-object v4, p2

    move-object v6, p3

    move-object v9, v8

    move-object v8, p1

    move-object p1, v11

    :goto_1
    :try_start_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/String;

    .line 82
    iget-object v2, p1, Lcom/stripe/android/link/account/DefaultLinkAuth;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    .line 89
    iget-object p1, p1, Lcom/stripe/android/link/account/DefaultLinkAuth;->applicationId:Ljava/lang/String;

    .line 82
    iput-object v11, v10, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->L$0:Ljava/lang/Object;

    iput-object v5, v10, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->L$1:Ljava/lang/Object;

    iput-object v5, v10, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->L$2:Ljava/lang/Object;

    iput-object v5, v10, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->L$3:Ljava/lang/Object;

    iput-object v5, v10, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->L$4:Ljava/lang/Object;

    iput-object v5, v10, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->L$5:Ljava/lang/Object;

    iput-object v5, v10, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->L$6:Ljava/lang/Object;

    iput v3, v10, Lcom/stripe/android/link/account/DefaultLinkAuth$mobileSignUp$1;->label:I

    move-object v5, v6

    move-object v6, v7

    move-object v3, v8

    move-object v8, p1

    move-object v7, v0

    invoke-interface/range {v2 .. v10}, Lcom/stripe/android/link/account/LinkAccountManager;->mobileSignUp-eH_QyT8(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/SignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne v0, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object p1, v11

    .line 90
    :goto_3
    :try_start_4
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lcom/stripe/android/link/model/LinkAccount;

    .line 80
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_5

    :catchall_2
    move-exception v0

    move-object p1, v11

    goto :goto_4

    :catchall_3
    move-exception v0

    move-object p1, p0

    :goto_4
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 91
    :goto_5
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 92
    const-string v2, "signup"

    invoke-direct {p1, v1, v2}, Lcom/stripe/android/link/account/DefaultLinkAuth;->reportError(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_6
    return-object v0
.end method

.method private final reportError(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 3

    .line 119
    invoke-direct {p0, p1}, Lcom/stripe/android/link/account/DefaultLinkAuth;->isBackendAttestationError(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 120
    sget-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->LINK_NATIVE_FAILED_TO_ATTEST_REQUEST:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    goto :goto_0

    .line 122
    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/link/account/DefaultLinkAuth;->isIntegrityManagerError(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 123
    sget-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->LINK_NATIVE_FAILED_TO_GET_INTEGRITY_TOKEN:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 127
    :goto_0
    iget-object v1, p0, Lcom/stripe/android/link/account/DefaultLinkAuth;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 128
    check-cast v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    .line 129
    new-instance v2, Lcom/stripe/android/link/LinkEventException;

    invoke-direct {v2, p1}, Lcom/stripe/android/link/LinkEventException;-><init>(Ljava/lang/Throwable;)V

    check-cast v2, Lcom/stripe/android/core/exception/StripeException;

    .line 131
    const-string p1, "operation"

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    .line 130
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 127
    invoke-interface {v1, v0, v2, p1}, Lcom/stripe/android/payments/core/analytics/ErrorReporter;->report(Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;)V

    :cond_1
    return-void
.end method

.method private final toLinkAuthResult(Ljava/lang/Object;)Lcom/stripe/android/link/account/LinkAuthResult;
    .locals 1

    .line 137
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 138
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lcom/stripe/android/link/model/LinkAccount;

    if-eqz p1, :cond_0

    .line 140
    new-instance v0, Lcom/stripe/android/link/account/LinkAuthResult$Success;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/account/LinkAuthResult$Success;-><init>(Lcom/stripe/android/link/model/LinkAccount;)V

    check-cast v0, Lcom/stripe/android/link/account/LinkAuthResult;

    return-object v0

    .line 142
    :cond_0
    sget-object p1, Lcom/stripe/android/link/account/LinkAuthResult$NoLinkAccountFound;->INSTANCE:Lcom/stripe/android/link/account/LinkAuthResult$NoLinkAccountFound;

    check-cast p1, Lcom/stripe/android/link/account/LinkAuthResult;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    .line 139
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 144
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 145
    :cond_1
    invoke-direct {p0, v0}, Lcom/stripe/android/link/account/DefaultLinkAuth;->toLinkAuthResult(Ljava/lang/Throwable;)Lcom/stripe/android/link/account/LinkAuthResult;

    move-result-object p1

    .line 144
    :goto_0
    check-cast p1, Lcom/stripe/android/link/account/LinkAuthResult;

    return-object p1
.end method

.method private final toLinkAuthResult(Ljava/lang/Throwable;)Lcom/stripe/android/link/account/LinkAuthResult;
    .locals 1

    .line 151
    invoke-direct {p0, p1}, Lcom/stripe/android/link/account/DefaultLinkAuth;->isAttestationError(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 152
    new-instance v0, Lcom/stripe/android/link/account/LinkAuthResult$AttestationFailed;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/account/LinkAuthResult$AttestationFailed;-><init>(Ljava/lang/Throwable;)V

    check-cast v0, Lcom/stripe/android/link/account/LinkAuthResult;

    return-object v0

    .line 154
    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/link/account/DefaultLinkAuth;->isAccountError(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 155
    new-instance v0, Lcom/stripe/android/link/account/LinkAuthResult$AccountError;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/account/LinkAuthResult$AccountError;-><init>(Ljava/lang/Throwable;)V

    check-cast v0, Lcom/stripe/android/link/account/LinkAuthResult;

    return-object v0

    .line 158
    :cond_1
    new-instance v0, Lcom/stripe/android/link/account/LinkAuthResult$Error;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/account/LinkAuthResult$Error;-><init>(Ljava/lang/Throwable;)V

    check-cast v0, Lcom/stripe/android/link/account/LinkAuthResult;

    return-object v0
.end method


# virtual methods
.method public lookUp(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/EmailSource;",
            "Z",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/account/LinkAuthResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p5, Lcom/stripe/android/link/account/DefaultLinkAuth$lookUp$1;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lcom/stripe/android/link/account/DefaultLinkAuth$lookUp$1;

    iget v1, v0, Lcom/stripe/android/link/account/DefaultLinkAuth$lookUp$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p5, v0, Lcom/stripe/android/link/account/DefaultLinkAuth$lookUp$1;->label:I

    sub-int/2addr p5, v2

    iput p5, v0, Lcom/stripe/android/link/account/DefaultLinkAuth$lookUp$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/DefaultLinkAuth$lookUp$1;

    invoke-direct {v0, p0, p5}, Lcom/stripe/android/link/account/DefaultLinkAuth$lookUp$1;-><init>(Lcom/stripe/android/link/account/DefaultLinkAuth;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v6, v0

    iget-object p5, v6, Lcom/stripe/android/link/account/DefaultLinkAuth$lookUp$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 50
    iget v1, v6, Lcom/stripe/android/link/account/DefaultLinkAuth$lookUp$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_2

    :cond_1
    iget-object p1, v6, Lcom/stripe/android/link/account/DefaultLinkAuth$lookUp$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/account/DefaultLinkAuth;

    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p5, Lkotlin/Result;

    invoke-virtual {p5}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    move-object v1, p0

    goto :goto_3

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 56
    iget-object p5, p0, Lcom/stripe/android/link/account/DefaultLinkAuth;->linkGate:Lcom/stripe/android/link/gate/LinkGate;

    invoke-interface {p5}, Lcom/stripe/android/link/gate/LinkGate;->getUseAttestationEndpoints()Z

    move-result p5

    if-eqz p5, :cond_5

    .line 57
    iput-object p0, v6, Lcom/stripe/android/link/account/DefaultLinkAuth$lookUp$1;->L$0:Ljava/lang/Object;

    iput v3, v6, Lcom/stripe/android/link/account/DefaultLinkAuth$lookUp$1;->label:I

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/link/account/DefaultLinkAuth;->mobileLookUp-yxL6bBk(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_1

    :cond_4
    move-object p2, p1

    goto :goto_2

    :cond_5
    move-object v1, p0

    move v4, p3

    move-object v5, p4

    .line 64
    iget-object p2, v1, Lcom/stripe/android/link/account/DefaultLinkAuth;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    iput-object v1, v6, Lcom/stripe/android/link/account/DefaultLinkAuth$lookUp$1;->L$0:Ljava/lang/Object;

    iput v2, v6, Lcom/stripe/android/link/account/DefaultLinkAuth$lookUp$1;->label:I

    invoke-interface {p2, p1, v4, v5, v6}, Lcom/stripe/android/link/account/LinkAccountManager;->lookupConsumer-BWLJW6A(Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_6

    :goto_1
    return-object v0

    :cond_6
    :goto_2
    move-object p1, v1

    .line 70
    :goto_3
    invoke-direct {p1, p2}, Lcom/stripe/android/link/account/DefaultLinkAuth;->toLinkAuthResult(Ljava/lang/Object;)Lcom/stripe/android/link/account/LinkAuthResult;

    move-result-object p1

    return-object p1
.end method

.method public signUp(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/SignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/link/ui/inline/SignUpConsentAction;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/account/LinkAuthResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p6, Lcom/stripe/android/link/account/DefaultLinkAuth$signUp$1;

    if-eqz v0, :cond_0

    move-object v0, p6

    check-cast v0, Lcom/stripe/android/link/account/DefaultLinkAuth$signUp$1;

    iget v1, v0, Lcom/stripe/android/link/account/DefaultLinkAuth$signUp$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p6, v0, Lcom/stripe/android/link/account/DefaultLinkAuth$signUp$1;->label:I

    sub-int/2addr p6, v2

    iput p6, v0, Lcom/stripe/android/link/account/DefaultLinkAuth$signUp$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/DefaultLinkAuth$signUp$1;

    invoke-direct {v0, p0, p6}, Lcom/stripe/android/link/account/DefaultLinkAuth$signUp$1;-><init>(Lcom/stripe/android/link/account/DefaultLinkAuth;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v7, v0

    iget-object p6, v7, Lcom/stripe/android/link/account/DefaultLinkAuth$signUp$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 23
    iget v1, v7, Lcom/stripe/android/link/account/DefaultLinkAuth$signUp$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_2

    :cond_1
    iget-object p1, v7, Lcom/stripe/android/link/account/DefaultLinkAuth$signUp$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/account/DefaultLinkAuth;

    invoke-static {p6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p6, Lkotlin/Result;

    invoke-virtual {p6}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    move-object p3, p2

    move-object p2, p0

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 30
    iget-object p6, p0, Lcom/stripe/android/link/account/DefaultLinkAuth;->linkGate:Lcom/stripe/android/link/gate/LinkGate;

    invoke-interface {p6}, Lcom/stripe/android/link/gate/LinkGate;->getUseAttestationEndpoints()Z

    move-result p6

    if-eqz p6, :cond_4

    .line 31
    iput-object p0, v7, Lcom/stripe/android/link/account/DefaultLinkAuth$signUp$1;->L$0:Ljava/lang/Object;

    iput v3, v7, Lcom/stripe/android/link/account/DefaultLinkAuth$signUp$1;->label:I

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/link/account/DefaultLinkAuth;->mobileSignUp-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/SignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    move-object p2, v1

    if-ne p1, v0, :cond_5

    goto :goto_1

    :cond_4
    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object p2, p0

    .line 39
    iget-object v1, p2, Lcom/stripe/android/link/account/DefaultLinkAuth;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    iput-object p2, v7, Lcom/stripe/android/link/account/DefaultLinkAuth$signUp$1;->L$0:Ljava/lang/Object;

    iput v2, v7, Lcom/stripe/android/link/account/DefaultLinkAuth$signUp$1;->label:I

    move-object v2, p1

    invoke-interface/range {v1 .. v7}, Lcom/stripe/android/link/account/LinkAccountManager;->signUp-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/SignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    move-object p3, p1

    move-object p1, p2

    .line 47
    :goto_2
    invoke-direct {p1, p3}, Lcom/stripe/android/link/account/DefaultLinkAuth;->toLinkAuthResult(Ljava/lang/Object;)Lcom/stripe/android/link/account/LinkAuthResult;

    move-result-object p1

    return-object p1
.end method
