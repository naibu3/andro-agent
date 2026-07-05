.class public final Lcom/stripe/android/paymentsheet/repositories/DuplicatePaymentMethodDetachFailureException;
.super Ljava/lang/Exception;
.source "DuplicatePaymentMethodDetachFailureException.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/repositories/DuplicatePaymentMethodDetachFailureException$DuplicateDetachFailure;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDuplicatePaymentMethodDetachFailureException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DuplicatePaymentMethodDetachFailureException.kt\ncom/stripe/android/paymentsheet/repositories/DuplicatePaymentMethodDetachFailureException\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,18:1\n1557#2:19\n1628#2,3:20\n*S KotlinDebug\n*F\n+ 1 DuplicatePaymentMethodDetachFailureException.kt\ncom/stripe/android/paymentsheet/repositories/DuplicatePaymentMethodDetachFailureException\n*L\n7#1:19\n7#1:20,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u000eB\u0015\u0012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/repositories/DuplicatePaymentMethodDetachFailureException;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "failures",
        "",
        "Lcom/stripe/android/paymentsheet/repositories/DuplicatePaymentMethodDetachFailureException$DuplicateDetachFailure;",
        "<init>",
        "(Ljava/util/List;)V",
        "getFailures",
        "()Ljava/util/List;",
        "message",
        "",
        "getMessage",
        "()Ljava/lang/String;",
        "DuplicateDetachFailure",
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
.field private final failures:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/repositories/DuplicatePaymentMethodDetachFailureException$DuplicateDetachFailure;",
            ">;"
        }
    .end annotation
.end field

.field private final message:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/repositories/DuplicatePaymentMethodDetachFailureException$DuplicateDetachFailure;",
            ">;)V"
        }
    .end annotation

    const-string v0, "failures"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/repositories/DuplicatePaymentMethodDetachFailureException;->failures:Ljava/util/List;

    .line 7
    check-cast p1, Ljava/lang/Iterable;

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 20
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 21
    check-cast v1, Lcom/stripe/android/paymentsheet/repositories/DuplicatePaymentMethodDetachFailureException$DuplicateDetachFailure;

    .line 8
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/repositories/DuplicatePaymentMethodDetachFailureException$DuplicateDetachFailure;->getPaymentMethodId()Ljava/lang/String;

    move-result-object v2

    .line 9
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/repositories/DuplicatePaymentMethodDetachFailureException$DuplicateDetachFailure;->getException()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "Unknown reason"

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "\n - (paymentMethodId: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", reason: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 21
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 22
    :cond_1
    check-cast v0, Ljava/util/List;

    .line 19
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Failed to detach the following duplicates:"

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 6
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/repositories/DuplicatePaymentMethodDetachFailureException;->message:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getFailures()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/repositories/DuplicatePaymentMethodDetachFailureException$DuplicateDetachFailure;",
            ">;"
        }
    .end annotation

    .line 4
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/repositories/DuplicatePaymentMethodDetachFailureException;->failures:Ljava/util/List;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/repositories/DuplicatePaymentMethodDetachFailureException;->message:Ljava/lang/String;

    return-object v0
.end method
