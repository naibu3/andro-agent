.class public final Lcom/stripe/android/financialconnections/features/error/ErrorPreviewParameterProvider;
.super Ljava/lang/Object;
.source "ErrorPreviewParameterProvider.kt"

# interfaces
.implements Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider<",
        "Lcom/stripe/android/financialconnections/features/error/ErrorState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\t\u001a\u00020\u0002H\u0002J\u0008\u0010\n\u001a\u00020\u0002H\u0002J\u0008\u0010\u000b\u001a\u00020\u0002H\u0002J\u0008\u0010\u000c\u001a\u00020\u0002H\u0002J\u0008\u0010\r\u001a\u00020\u0002H\u0002J\u0008\u0010\u000e\u001a\u00020\u000fH\u0002R\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/error/ErrorPreviewParameterProvider;",
        "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;",
        "Lcom/stripe/android/financialconnections/features/error/ErrorState;",
        "<init>",
        "()V",
        "values",
        "Lkotlin/sequences/Sequence;",
        "getValues",
        "()Lkotlin/sequences/Sequence;",
        "loading",
        "unclassified",
        "unclassifiedWithManualEntry",
        "expectedDowntime",
        "unexpectedDowntime",
        "institution",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
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
.field private final values:Lkotlin/sequences/Sequence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/sequences/Sequence<",
            "Lcom/stripe/android/financialconnections/features/error/ErrorState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x5

    .line 14
    new-array v0, v0, [Lcom/stripe/android/financialconnections/features/error/ErrorState;

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/error/ErrorPreviewParameterProvider;->loading()Lcom/stripe/android/financialconnections/features/error/ErrorState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 15
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/error/ErrorPreviewParameterProvider;->unclassified()Lcom/stripe/android/financialconnections/features/error/ErrorState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    .line 16
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/error/ErrorPreviewParameterProvider;->unclassifiedWithManualEntry()Lcom/stripe/android/financialconnections/features/error/ErrorState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    .line 17
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/error/ErrorPreviewParameterProvider;->expectedDowntime()Lcom/stripe/android/financialconnections/features/error/ErrorState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    .line 18
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/error/ErrorPreviewParameterProvider;->unexpectedDowntime()Lcom/stripe/android/financialconnections/features/error/ErrorState;

    move-result-object v2

    aput-object v2, v0, v1

    .line 13
    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->sequenceOf([Ljava/lang/Object;)Lkotlin/sequences/Sequence;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/financialconnections/features/error/ErrorPreviewParameterProvider;->values:Lkotlin/sequences/Sequence;

    return-void
.end method

.method private final expectedDowntime()Lcom/stripe/android/financialconnections/features/error/ErrorState;
    .locals 12

    .line 45
    new-instance v0, Lcom/stripe/android/financialconnections/features/error/ErrorState;

    .line 46
    new-instance v1, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 48
    new-instance v2, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;

    .line 49
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/error/ErrorPreviewParameterProvider;->institution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v3

    .line 53
    new-instance v4, Lcom/stripe/android/core/exception/APIException;

    const/16 v10, 0x1f

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Lcom/stripe/android/core/exception/APIException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v8, v4

    check-cast v8, Lcom/stripe/android/core/exception/StripeException;

    const/4 v4, 0x1

    const/4 v5, 0x1

    const-wide/16 v6, 0x2710

    .line 48
    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZZJLcom/stripe/android/core/exception/StripeException;)V

    .line 47
    new-instance v3, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;

    .line 48
    check-cast v2, Ljava/lang/Throwable;

    .line 47
    invoke-direct {v3, v2, v4, v4}, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;-><init>(Ljava/lang/Throwable;ZZ)V

    .line 46
    invoke-direct {v1, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    check-cast v1, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 45
    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/error/ErrorState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;)V

    return-object v0
.end method

.method private final institution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;
    .locals 9

    .line 75
    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    const/4 v7, 0x0

    .line 78
    const-string v8, "Random Institution url"

    const/4 v1, 0x0

    .line 75
    const-string v2, "3"

    const/4 v3, 0x0

    const-string v4, "Random Institution"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;-><init>(ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;)V

    return-object v0
.end method

.method private final loading()Lcom/stripe/android/financialconnections/features/error/ErrorState;
    .locals 4

    .line 21
    new-instance v0, Lcom/stripe/android/financialconnections/features/error/ErrorState;

    .line 22
    new-instance v1, Lcom/stripe/android/financialconnections/presentation/Async$Loading;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v2}, Lcom/stripe/android/financialconnections/presentation/Async$Loading;-><init>(Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 21
    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/error/ErrorState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;)V

    return-object v0
.end method

.method private final unclassified()Lcom/stripe/android/financialconnections/features/error/ErrorState;
    .locals 6

    .line 25
    new-instance v0, Lcom/stripe/android/financialconnections/features/error/ErrorState;

    .line 26
    new-instance v1, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 28
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "An unknown error occurred."

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 27
    new-instance v3, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;

    .line 28
    check-cast v2, Ljava/lang/Throwable;

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 27
    invoke-direct {v3, v2, v4, v5}, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;-><init>(Ljava/lang/Throwable;ZZ)V

    .line 26
    invoke-direct {v1, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    check-cast v1, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 25
    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/error/ErrorState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;)V

    return-object v0
.end method

.method private final unclassifiedWithManualEntry()Lcom/stripe/android/financialconnections/features/error/ErrorState;
    .locals 5

    .line 35
    new-instance v0, Lcom/stripe/android/financialconnections/features/error/ErrorState;

    .line 36
    new-instance v1, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 38
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "An unknown error occurred."

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 37
    new-instance v3, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;

    .line 38
    check-cast v2, Ljava/lang/Throwable;

    const/4 v4, 0x1

    .line 37
    invoke-direct {v3, v2, v4, v4}, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;-><init>(Ljava/lang/Throwable;ZZ)V

    .line 36
    invoke-direct {v1, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    check-cast v1, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 35
    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/error/ErrorState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;)V

    return-object v0
.end method

.method private final unexpectedDowntime()Lcom/stripe/android/financialconnections/features/error/ErrorState;
    .locals 12

    .line 61
    new-instance v0, Lcom/stripe/android/financialconnections/features/error/ErrorState;

    .line 62
    new-instance v1, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 64
    new-instance v2, Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;

    .line 65
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/error/ErrorPreviewParameterProvider;->institution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v3

    .line 67
    new-instance v4, Lcom/stripe/android/core/exception/APIException;

    const/16 v10, 0x1f

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Lcom/stripe/android/core/exception/APIException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v4, Lcom/stripe/android/core/exception/StripeException;

    const/4 v5, 0x1

    .line 64
    invoke-direct {v2, v3, v5, v4}, Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZLcom/stripe/android/core/exception/StripeException;)V

    .line 63
    new-instance v3, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;

    .line 64
    check-cast v2, Ljava/lang/Throwable;

    .line 63
    invoke-direct {v3, v2, v5, v5}, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;-><init>(Ljava/lang/Throwable;ZZ)V

    .line 62
    invoke-direct {v1, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    check-cast v1, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 61
    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/error/ErrorState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;)V

    return-object v0
.end method


# virtual methods
.method public getValues()Lkotlin/sequences/Sequence;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/sequences/Sequence<",
            "Lcom/stripe/android/financialconnections/features/error/ErrorState;",
            ">;"
        }
    .end annotation

    .line 13
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/error/ErrorPreviewParameterProvider;->values:Lkotlin/sequences/Sequence;

    return-object v0
.end method
