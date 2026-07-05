.class public final Lcom/stripe/android/financialconnections/domain/StartVerification;
.super Ljava/lang/Object;
.source "StartVerification.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u0010\nJ \u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\tH\u0086@\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/StartVerification;",
        "",
        "consumerSessionRepository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;)V",
        "sms",
        "Lcom/stripe/android/model/ConsumerSession;",
        "consumerSessionClientSecret",
        "",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "email",
        "businessName",
        "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/StartVerification;->consumerSessionRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;

    return-void
.end method


# virtual methods
.method public final email(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
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

    .line 25
    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/StartVerification;->consumerSessionRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;

    .line 27
    sget-object v4, Lcom/stripe/android/model/CustomEmailType;->NETWORKED_CONNECTIONS_OTP_EMAIL:Lcom/stripe/android/model/CustomEmailType;

    .line 29
    sget-object v3, Lcom/stripe/android/model/VerificationType;->EMAIL:Lcom/stripe/android/model/VerificationType;

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    .line 25
    invoke-interface/range {v0 .. v5}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;->startConsumerVerification(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/VerificationType;Lcom/stripe/android/model/CustomEmailType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final sms(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ConsumerSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/StartVerification;->consumerSessionRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;

    .line 19
    sget-object v3, Lcom/stripe/android/model/VerificationType;->SMS:Lcom/stripe/android/model/VerificationType;

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    move-object v5, p2

    .line 15
    invoke-interface/range {v0 .. v5}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;->startConsumerVerification(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/VerificationType;Lcom/stripe/android/model/CustomEmailType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
