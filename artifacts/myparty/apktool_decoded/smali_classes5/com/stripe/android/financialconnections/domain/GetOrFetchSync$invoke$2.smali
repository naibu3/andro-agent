.class final synthetic Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$invoke$2;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "GetOrFetchSync.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;->invoke(Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
        "Ljava/lang/Boolean;",
        ">;"
    }
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
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-class v3, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;

    const-string v5, "shouldReFetch(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)Z"

    const/4 v6, 0x0

    const/4 v1, 0x1

    const-string v4, "shouldReFetch"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$invoke$2;->receiver:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;

    invoke-interface {v0, p1}, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;->shouldReFetch(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 27
    check-cast p1, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$invoke$2;->invoke(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
