.class public final Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider;
.super Ljava/lang/Object;
.source "ManualEntryPreviewParameterProvider.kt"

# interfaces
.implements Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider<",
        "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\t\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\r\u001a\u00020\u0002H\u0002J\u0008\u0010\u000e\u001a\u00020\u0002H\u0002J\u0008\u0010\u000f\u001a\u00020\u0002H\u0002J\u0008\u0010\u0010\u001a\u00020\u0002H\u0002J\u0008\u0010\u0011\u001a\u00020\u0002H\u0002R\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider;",
        "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;",
        "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;",
        "<init>",
        "()V",
        "values",
        "Lkotlin/sequences/Sequence;",
        "getValues",
        "()Lkotlin/sequences/Sequence;",
        "count",
        "",
        "getCount",
        "()I",
        "loading",
        "failure",
        "canonical",
        "testMode",
        "fieldFailure",
        "PreviewState",
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
            "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;",
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

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x5

    .line 14
    new-array v0, v0, [Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider;->canonical()Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 15
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider;->loading()Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    .line 16
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider;->failure()Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    .line 17
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider;->fieldFailure()Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    .line 18
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider;->testMode()Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;

    move-result-object v2

    aput-object v2, v0, v1

    .line 13
    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->sequenceOf([Ljava/lang/Object;)Lkotlin/sequences/Sequence;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider;->values:Lkotlin/sequences/Sequence;

    return-void
.end method

.method private final canonical()Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;
    .locals 10

    .line 54
    new-instance v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;

    .line 55
    new-instance v1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    .line 56
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 57
    new-instance v3, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5, v5}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;-><init>(ZZZ)V

    .line 56
    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 63
    sget-object v3, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    check-cast v3, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 55
    invoke-direct {v1, v2, v3}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;)V

    const/16 v8, 0x7e

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 54
    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;-><init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final failure()Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;
    .locals 12

    .line 37
    new-instance v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;

    .line 38
    new-instance v1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    .line 39
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 40
    new-instance v3, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5, v5}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;-><init>(ZZZ)V

    .line 39
    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 46
    new-instance v3, Lcom/stripe/android/financialconnections/presentation/Async$Fail;

    .line 47
    new-instance v4, Lcom/stripe/android/core/exception/APIException;

    const/16 v10, 0x17

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v8, "Test bank accounts cannot be used in live mode"

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Lcom/stripe/android/core/exception/APIException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v4, Ljava/lang/Throwable;

    .line 46
    invoke-direct {v3, v4}, Lcom/stripe/android/financialconnections/presentation/Async$Fail;-><init>(Ljava/lang/Throwable;)V

    check-cast v3, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 38
    invoke-direct {v1, v2, v3}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;)V

    const/16 v8, 0x7e

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    .line 37
    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;-><init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final fieldFailure()Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;
    .locals 11

    .line 82
    sget v0, Lcom/stripe/android/financialconnections/R$string;->stripe_validation_no_us_routing:I

    .line 84
    sget v1, Lcom/stripe/android/financialconnections/R$string;->stripe_validation_no_us_routing:I

    .line 86
    sget v2, Lcom/stripe/android/financialconnections/R$string;->stripe_validation_no_us_routing:I

    .line 87
    new-instance v4, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    .line 88
    new-instance v3, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 89
    new-instance v5, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-direct {v5, v6, v7, v7}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;-><init>(ZZZ)V

    .line 88
    invoke-direct {v3, v5}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    check-cast v3, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 95
    sget-object v5, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    check-cast v5, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 87
    invoke-direct {v4, v3, v5}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;)V

    .line 80
    new-instance v3, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;

    .line 82
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 84
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    .line 86
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    .line 80
    const-string v5, "123456789"

    const-string v6, "123456789"

    const-string v7, "123456789"

    invoke-direct/range {v3 .. v10}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;-><init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-object v3
.end method

.method private final loading()Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;
    .locals 10

    .line 24
    new-instance v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;

    .line 25
    new-instance v1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    .line 26
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 27
    new-instance v3, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-direct {v3, v5, v4, v4}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;-><init>(ZZZ)V

    .line 26
    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 33
    new-instance v3, Lcom/stripe/android/financialconnections/presentation/Async$Loading;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v5, v4}, Lcom/stripe/android/financialconnections/presentation/Async$Loading;-><init>(Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v3, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 25
    invoke-direct {v1, v2, v3}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;)V

    const/16 v8, 0x7e

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 24
    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;-><init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final testMode()Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;
    .locals 10

    .line 67
    new-instance v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;

    .line 68
    new-instance v1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    .line 69
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 70
    new-instance v3, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5, v4}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;-><init>(ZZZ)V

    .line 69
    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 76
    sget-object v3, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    check-cast v3, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 68
    invoke-direct {v1, v2, v3}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;)V

    const/16 v8, 0x7e

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 67
    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;-><init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 22
    invoke-super {p0}, Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;->getCount()I

    move-result v0

    return v0
.end method

.method public getValues()Lkotlin/sequences/Sequence;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/sequences/Sequence<",
            "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;",
            ">;"
        }
    .end annotation

    .line 13
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider;->values:Lkotlin/sequences/Sequence;

    return-object v0
.end method
