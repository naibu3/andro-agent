.class public final Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;
.super Ljava/lang/Object;
.source "ManualEntryFormState.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nManualEntryFormState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManualEntryFormState.kt\ncom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B+\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t8F\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u0013\u0010\u000c\u001a\u0004\u0018\u00010\t8F\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;",
        "",
        "routing",
        "",
        "account",
        "accountConfirm",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "routingError",
        "",
        "getRoutingError",
        "()Ljava/lang/Integer;",
        "accountError",
        "getAccountError",
        "accountConfirmError",
        "getAccountConfirmError",
        "isValid",
        "",
        "()Z",
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

.field private final routing:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;->routing:Ljava/lang/String;

    .line 11
    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;->account:Ljava/lang/String;

    .line 12
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;->accountConfirm:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    .line 9
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getAccountConfirmError()Ljava/lang/Integer;
    .locals 3

    .line 21
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;->account:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;->accountConfirm:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 22
    sget-object v0, Lcom/stripe/android/financialconnections/features/manualentry/Validator;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/Validator;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;->account:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;->accountConfirm:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/stripe/android/financialconnections/features/manualentry/Validator;->getAccountConfirmIdOrNull(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getAccountError()Ljava/lang/Integer;
    .locals 2

    .line 18
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;->account:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/stripe/android/financialconnections/features/manualentry/Validator;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/Validator;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;->account:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/stripe/android/financialconnections/features/manualentry/Validator;->getAccountErrorIdOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getRoutingError()Ljava/lang/Integer;
    .locals 2

    .line 15
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;->routing:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/stripe/android/financialconnections/features/manualentry/Validator;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/Validator;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;->routing:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/stripe/android/financialconnections/features/manualentry/Validator;->getRoutingErrorIdOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final isValid()Z
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;->routing:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;->account:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;->accountConfirm:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 29
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;->getRoutingError()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_0

    .line 30
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;->getAccountError()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_0

    .line 31
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;->getAccountConfirmError()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
