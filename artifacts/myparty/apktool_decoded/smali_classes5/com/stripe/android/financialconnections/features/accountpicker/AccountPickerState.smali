.class public final Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
.super Ljava/lang/Object;
.source "AccountPickerViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;,
        Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;,
        Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u0081\u0008\u0018\u00002\u00020\u0001:\u0003,-.B]\u0012\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0003\u0012\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0008H\u00c6\u0003J\u000f\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0003H\u00c6\u0003J\u000f\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J_\u0010&\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00032\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001J\u0013\u0010\'\u001a\u00020\u00082\u0008\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020*H\u00d6\u0001J\t\u0010+\u001a\u00020\rH\u00d6\u0001R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0013R\u0017\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u0016R\u0011\u0010\u001e\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\u0016\u00a8\u0006/"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;",
        "",
        "institution",
        "Lcom/stripe/android/financialconnections/presentation/Async;",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "payload",
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;",
        "canRetry",
        "",
        "selectAccounts",
        "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
        "selectedIds",
        "",
        "",
        "viewEffect",
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ZLcom/stripe/android/financialconnections/presentation/Async;Ljava/util/Set;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;)V",
        "getInstitution",
        "()Lcom/stripe/android/financialconnections/presentation/Async;",
        "getPayload",
        "getCanRetry",
        "()Z",
        "getSelectAccounts",
        "getSelectedIds",
        "()Ljava/util/Set;",
        "getViewEffect",
        "()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;",
        "submitLoading",
        "getSubmitLoading",
        "submitEnabled",
        "getSubmitEnabled",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "Payload",
        "SelectionMode",
        "ViewEffect",
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
.field private final canRetry:Z

.field private final institution:Lcom/stripe/android/financialconnections/presentation/Async;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            ">;"
        }
    .end annotation
.end field

.field private final payload:Lcom/stripe/android/financialconnections/presentation/Async;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;",
            ">;"
        }
    .end annotation
.end field

.field private final selectAccounts:Lcom/stripe/android/financialconnections/presentation/Async;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
            ">;"
        }
    .end annotation
.end field

.field private final selectedIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final viewEffect:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ZLcom/stripe/android/financialconnections/presentation/Async;Ljava/util/Set;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ZLcom/stripe/android/financialconnections/presentation/Async;Ljava/util/Set;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            ">;",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;",
            ">;Z",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;",
            ")V"
        }
    .end annotation

    const-string v0, "institution"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectAccounts"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedIds"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 409
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 410
    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->institution:Lcom/stripe/android/financialconnections/presentation/Async;

    .line 411
    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    .line 412
    iput-boolean p3, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->canRetry:Z

    .line 413
    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectAccounts:Lcom/stripe/android/financialconnections/presentation/Async;

    .line 414
    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectedIds:Ljava/util/Set;

    .line 415
    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->viewEffect:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ZLcom/stripe/android/financialconnections/presentation/Async;Ljava/util/Set;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    .line 410
    sget-object p1, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    check-cast p1, Lcom/stripe/android/financialconnections/presentation/Async;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    .line 411
    sget-object p2, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    check-cast p2, Lcom/stripe/android/financialconnections/presentation/Async;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    const/4 p3, 0x1

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    .line 413
    sget-object p4, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    check-cast p4, Lcom/stripe/android/financialconnections/presentation/Async;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    .line 414
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p5

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    const/4 p6, 0x0

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    .line 409
    invoke-direct/range {p2 .. p8}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ZLcom/stripe/android/financialconnections/presentation/Async;Ljava/util/Set;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ZLcom/stripe/android/financialconnections/presentation/Async;Ljava/util/Set;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->institution:Lcom/stripe/android/financialconnections/presentation/Async;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-boolean p3, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->canRetry:Z

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectAccounts:Lcom/stripe/android/financialconnections/presentation/Async;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectedIds:Ljava/util/Set;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->viewEffect:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->copy(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ZLcom/stripe/android/financialconnections/presentation/Async;Ljava/util/Set;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/presentation/Async;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->institution:Lcom/stripe/android/financialconnections/presentation/Async;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/financialconnections/presentation/Async;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->canRetry:Z

    return v0
.end method

.method public final component4()Lcom/stripe/android/financialconnections/presentation/Async;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectAccounts:Lcom/stripe/android/financialconnections/presentation/Async;

    return-object v0
.end method

.method public final component5()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectedIds:Ljava/util/Set;

    return-object v0
.end method

.method public final component6()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->viewEffect:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ZLcom/stripe/android/financialconnections/presentation/Async;Ljava/util/Set;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            ">;",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;",
            ">;Z",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;",
            ")",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;"
        }
    .end annotation

    const-string v0, "institution"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectAccounts"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedIds"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ZLcom/stripe/android/financialconnections/presentation/Async;Ljava/util/Set;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->institution:Lcom/stripe/android/financialconnections/presentation/Async;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->institution:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->canRetry:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->canRetry:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectAccounts:Lcom/stripe/android/financialconnections/presentation/Async;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectAccounts:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectedIds:Ljava/util/Set;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectedIds:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->viewEffect:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->viewEffect:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getCanRetry()Z
    .locals 1

    .line 412
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->canRetry:Z

    return v0
.end method

.method public final getInstitution()Lcom/stripe/android/financialconnections/presentation/Async;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            ">;"
        }
    .end annotation

    .line 410
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->institution:Lcom/stripe/android/financialconnections/presentation/Async;

    return-object v0
.end method

.method public final getPayload()Lcom/stripe/android/financialconnections/presentation/Async;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;",
            ">;"
        }
    .end annotation

    .line 411
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    return-object v0
.end method

.method public final getSelectAccounts()Lcom/stripe/android/financialconnections/presentation/Async;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
            ">;"
        }
    .end annotation

    .line 413
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectAccounts:Lcom/stripe/android/financialconnections/presentation/Async;

    return-object v0
.end method

.method public final getSelectedIds()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 414
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectedIds:Ljava/util/Set;

    return-object v0
.end method

.method public final getSubmitEnabled()Z
    .locals 1

    .line 422
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectedIds:Ljava/util/Set;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final getSubmitLoading()Z
    .locals 1

    .line 419
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    instance-of v0, v0, Lcom/stripe/android/financialconnections/presentation/Async$Loading;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectAccounts:Lcom/stripe/android/financialconnections/presentation/Async;

    instance-of v0, v0, Lcom/stripe/android/financialconnections/presentation/Async$Loading;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final getViewEffect()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;
    .locals 1

    .line 415
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->viewEffect:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->institution:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/presentation/Async;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/presentation/Async;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->canRetry:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectAccounts:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/presentation/Async;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectedIds:Ljava/util/Set;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->viewEffect:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->institution:Lcom/stripe/android/financialconnections/presentation/Async;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->canRetry:Z

    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectAccounts:Lcom/stripe/android/financialconnections/presentation/Async;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectedIds:Ljava/util/Set;

    iget-object v5, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->viewEffect:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "AccountPickerState(institution="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, ", payload="

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", canRetry="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", selectAccounts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", selectedIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", viewEffect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
