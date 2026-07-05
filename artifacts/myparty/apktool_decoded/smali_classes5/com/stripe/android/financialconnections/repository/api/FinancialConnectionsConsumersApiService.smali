.class public interface abstract Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService;
.super Ljava/lang/Object;
.source "FinancialConnectionsConsumersApiService.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008a\u0018\u0000 \t2\u00020\u0001:\u0001\tJ&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService;",
        "",
        "postConsumerSession",
        "Lcom/stripe/android/model/ConsumerSessionLookup;",
        "email",
        "",
        "clientSecret",
        "requestSurface",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Companion",
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
.field public static final Companion:Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService$Companion;->$$INSTANCE:Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService$Companion;

    sput-object v0, Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService;->Companion:Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService$Companion;

    return-void
.end method


# virtual methods
.method public abstract postConsumerSession(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ConsumerSessionLookup;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
