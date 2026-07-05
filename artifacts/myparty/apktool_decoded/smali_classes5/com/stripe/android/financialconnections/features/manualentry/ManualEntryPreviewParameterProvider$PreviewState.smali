.class public final Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;
.super Ljava/lang/Object;
.source "ManualEntryPreviewParameterProvider.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PreviewState"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0019\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015JZ\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\u0008\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\tH\u00d6\u0001J\t\u0010&\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0011R\u0015\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\u0008\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0015R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\u0008\u0018\u0010\u0015\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;",
        "",
        "state",
        "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;",
        "routing",
        "",
        "account",
        "accountConfirm",
        "routingError",
        "",
        "accountError",
        "accountConfirmError",
        "<init>",
        "(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V",
        "getState",
        "()Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;",
        "getRouting",
        "()Ljava/lang/String;",
        "getAccount",
        "getAccountConfirm",
        "getRoutingError",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getAccountError",
        "getAccountConfirmError",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
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
.field public static final $stable:I


# instance fields
.field private final account:Ljava/lang/String;

.field private final accountConfirm:Ljava/lang/String;

.field private final accountConfirmError:Ljava/lang/Integer;

.field private final accountError:Ljava/lang/Integer;

.field private final routing:Ljava/lang/String;

.field private final routingError:Ljava/lang/Integer;

.field private final state:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "routing"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "account"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accountConfirm"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->state:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    .line 101
    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->routing:Ljava/lang/String;

    .line 102
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->account:Ljava/lang/String;

    .line 103
    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->accountConfirm:Ljava/lang/String;

    .line 104
    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->routingError:Ljava/lang/Integer;

    .line 105
    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->accountError:Ljava/lang/Integer;

    .line 106
    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->accountConfirmError:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x2

    .line 99
    const-string v0, ""

    if-eqz p9, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p9, p8, 0x10

    const/4 v0, 0x0

    if-eqz p9, :cond_3

    move-object p5, v0

    :cond_3
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_4

    move-object p6, v0

    :cond_4
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_5

    move-object p8, v0

    goto :goto_0

    :cond_5
    move-object p8, p7

    :goto_0
    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p8}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;-><init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->state:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->routing:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->account:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->accountConfirm:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->routingError:Ljava/lang/Integer;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->accountError:Ljava/lang/Integer;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->accountConfirmError:Ljava/lang/Integer;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->copy(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->state:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->routing:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->account:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->accountConfirm:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->routingError:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component6()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->accountError:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component7()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->accountConfirmError:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;
    .locals 9

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "routing"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "account"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accountConfirm"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;-><init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->state:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->state:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->routing:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->routing:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->account:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->account:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->accountConfirm:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->accountConfirm:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->routingError:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->routingError:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->accountError:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->accountError:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->accountConfirmError:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->accountConfirmError:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAccount()Ljava/lang/String;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->account:Ljava/lang/String;

    return-object v0
.end method

.method public final getAccountConfirm()Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->accountConfirm:Ljava/lang/String;

    return-object v0
.end method

.method public final getAccountConfirmError()Ljava/lang/Integer;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->accountConfirmError:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getAccountError()Ljava/lang/Integer;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->accountError:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getRouting()Ljava/lang/String;
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->routing:Ljava/lang/String;

    return-object v0
.end method

.method public final getRoutingError()Ljava/lang/Integer;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->routingError:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getState()Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->state:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->state:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->routing:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->account:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->accountConfirm:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->routingError:Ljava/lang/Integer;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->accountError:Ljava/lang/Integer;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->accountConfirmError:Ljava/lang/Integer;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->state:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->routing:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->account:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->accountConfirm:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->routingError:Ljava/lang/Integer;

    iget-object v5, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->accountError:Ljava/lang/Integer;

    iget-object v6, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;->accountConfirmError:Ljava/lang/Integer;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "PreviewState(state="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v7, ", routing="

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", account="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", accountConfirm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", routingError="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", accountError="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", accountConfirmError="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
