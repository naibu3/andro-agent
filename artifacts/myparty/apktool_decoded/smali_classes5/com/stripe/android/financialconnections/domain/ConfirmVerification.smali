.class public final Lcom/stripe/android/financialconnections/domain/ConfirmVerification;
.super Ljava/lang/Object;
.source "ConfirmVerification.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError;,
        Lcom/stripe/android/financialconnections/domain/ConfirmVerification$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0010B\u0011\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u0010\u000bJ\u001e\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\r\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/ConfirmVerification;",
        "",
        "consumerSessionRepository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;)V",
        "sms",
        "Lcom/stripe/android/model/ConsumerSession;",
        "consumerSessionClientSecret",
        "",
        "verificationCode",
        "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "email",
        "toDomainException",
        "",
        "Lcom/stripe/android/model/VerificationType;",
        "OTPError",
        "financial-connections_release"
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
.field private final consumerSessionRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "consumerSessionRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification;->consumerSessionRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;

    return-void
.end method

.method private final toDomainException(Ljava/lang/Throwable;Lcom/stripe/android/model/VerificationType;)Ljava/lang/Throwable;
    .locals 2

    .line 47
    instance-of v0, p1, Lcom/stripe/android/core/exception/StripeException;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/core/exception/StripeException;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/core/exception/StripeException;->getStripeError()Lcom/stripe/android/core/StripeError;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/core/StripeError;->getCode()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    const-string v0, ""

    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_2

    :sswitch_0
    const-string v1, "consumer_verification_max_attempts_exceeded"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_2

    :sswitch_1
    const-string p2, "consumer_verification_code_invalid"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    goto :goto_2

    .line 48
    :cond_3
    new-instance p1, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError;

    sget-object p2, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;->CODE_INVALID:Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;

    invoke-direct {p1, v0, p2}, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;)V

    check-cast p1, Ljava/lang/Throwable;

    return-object p1

    .line 47
    :sswitch_2
    const-string v1, "consumer_verification_expired"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_2

    :sswitch_3
    const-string v1, "consumer_session_expired"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_2

    .line 51
    :cond_4
    sget-object p1, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Lcom/stripe/android/model/VerificationType;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/4 p2, 0x1

    if-eq p1, p2, :cond_6

    const/4 p2, 0x2

    if-ne p1, p2, :cond_5

    .line 53
    new-instance p1, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError;

    sget-object p2, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;->SMS_CODE_EXPIRED:Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;

    invoke-direct {p1, v0, p2}, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;)V

    goto :goto_1

    .line 51
    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 52
    :cond_6
    new-instance p1, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError;

    sget-object p2, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;->EMAIL_CODE_EXPIRED:Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;

    invoke-direct {p1, v0, p2}, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;)V

    .line 51
    :goto_1
    check-cast p1, Ljava/lang/Throwable;

    :goto_2
    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4792f7cd -> :sswitch_3
        -0x2c565a56 -> :sswitch_2
        -0x1aa3a9c0 -> :sswitch_1
        0x56699bd6 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final email(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ConsumerSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$email$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$email$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$email$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$email$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$email$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$email$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$email$1;-><init>(Lcom/stripe/android/financialconnections/domain/ConfirmVerification;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$email$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 27
    iget v2, v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$email$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$email$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/domain/ConfirmVerification;

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 30
    :try_start_1
    sget-object p3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 31
    iget-object p3, p0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification;->consumerSessionRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;

    .line 34
    sget-object v2, Lcom/stripe/android/model/VerificationType;->EMAIL:Lcom/stripe/android/model/VerificationType;

    .line 31
    iput-object p0, v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$email$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$email$1;->label:I

    invoke-interface {p3, p1, p2, v2, v0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;->confirmConsumerVerification(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/VerificationType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    .line 27
    :goto_1
    :try_start_2
    check-cast p3, Lcom/stripe/android/model/ConsumerSession;

    .line 30
    invoke-static {p3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catchall_1
    move-exception p2

    move-object p1, p0

    :goto_2
    sget-object p3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 36
    :goto_3
    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p3

    if-nez p3, :cond_4

    check-cast p2, Lcom/stripe/android/model/ConsumerSession;

    return-object p2

    .line 38
    :cond_4
    sget-object p2, Lcom/stripe/android/model/VerificationType;->EMAIL:Lcom/stripe/android/model/VerificationType;

    invoke-direct {p1, p3, p2}, Lcom/stripe/android/financialconnections/domain/ConfirmVerification;->toDomainException(Ljava/lang/Throwable;Lcom/stripe/android/model/VerificationType;)Ljava/lang/Throwable;

    move-result-object p1

    throw p1
.end method

.method public final sms(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ConsumerSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$sms$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$sms$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$sms$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$sms$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$sms$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$sms$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$sms$1;-><init>(Lcom/stripe/android/financialconnections/domain/ConfirmVerification;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$sms$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 13
    iget v2, v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$sms$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$sms$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/domain/ConfirmVerification;

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 16
    :try_start_1
    sget-object p3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 17
    iget-object p3, p0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification;->consumerSessionRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;

    .line 20
    sget-object v2, Lcom/stripe/android/model/VerificationType;->SMS:Lcom/stripe/android/model/VerificationType;

    .line 17
    iput-object p0, v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$sms$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$sms$1;->label:I

    invoke-interface {p3, p1, p2, v2, v0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;->confirmConsumerVerification(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/VerificationType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    .line 13
    :goto_1
    :try_start_2
    check-cast p3, Lcom/stripe/android/model/ConsumerSession;

    .line 16
    invoke-static {p3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catchall_1
    move-exception p2

    move-object p1, p0

    :goto_2
    sget-object p3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 22
    :goto_3
    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p3

    if-nez p3, :cond_4

    check-cast p2, Lcom/stripe/android/model/ConsumerSession;

    return-object p2

    .line 24
    :cond_4
    sget-object p2, Lcom/stripe/android/model/VerificationType;->SMS:Lcom/stripe/android/model/VerificationType;

    invoke-direct {p1, p3, p2}, Lcom/stripe/android/financialconnections/domain/ConfirmVerification;->toDomainException(Ljava/lang/Throwable;Lcom/stripe/android/model/VerificationType;)Ljava/lang/Throwable;

    move-result-object p1

    throw p1
.end method
