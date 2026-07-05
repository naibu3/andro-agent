.class public interface abstract Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;
.super Ljava/lang/Object;
.source "ConsumerSessionRepository.kt"

# interfaces
.implements Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008`\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;",
        "Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;",
        "storeNewConsumerSession",
        "",
        "consumerSession",
        "Lcom/stripe/android/model/ConsumerSession;",
        "publishableKey",
        "",
        "updateConsumerSession",
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


# virtual methods
.method public abstract storeNewConsumerSession(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;)V
.end method

.method public abstract updateConsumerSession(Lcom/stripe/android/model/ConsumerSession;)V
.end method
