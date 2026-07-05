.class public final Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigatorSheetState;
.super Ljava/lang/Object;
.source "BottomSheetNavigation.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u00020\t8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u00020\r8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u000f\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigatorSheetState;",
        "",
        "sheetState",
        "Landroidx/compose/material/ModalBottomSheetState;",
        "<init>",
        "(Landroidx/compose/material/ModalBottomSheetState;)V",
        "getSheetState$financial_connections_release",
        "()Landroidx/compose/material/ModalBottomSheetState;",
        "isVisible",
        "",
        "isVisible$financial_connections_release",
        "()Z",
        "currentValue",
        "Landroidx/compose/material/ModalBottomSheetValue;",
        "getCurrentValue$financial_connections_release",
        "()Landroidx/compose/material/ModalBottomSheetValue;",
        "targetValue",
        "getTargetValue$financial_connections_release",
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
.field private final sheetState:Landroidx/compose/material/ModalBottomSheetState;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/material/ModalBottomSheetState;)V
    .locals 1

    const-string v0, "sheetState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigatorSheetState;->sheetState:Landroidx/compose/material/ModalBottomSheetState;

    return-void
.end method


# virtual methods
.method public final getCurrentValue$financial_connections_release()Landroidx/compose/material/ModalBottomSheetValue;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigatorSheetState;->sheetState:Landroidx/compose/material/ModalBottomSheetState;

    invoke-virtual {v0}, Landroidx/compose/material/ModalBottomSheetState;->getCurrentValue()Landroidx/compose/material/ModalBottomSheetValue;

    move-result-object v0

    return-object v0
.end method

.method public final getSheetState$financial_connections_release()Landroidx/compose/material/ModalBottomSheetState;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigatorSheetState;->sheetState:Landroidx/compose/material/ModalBottomSheetState;

    return-object v0
.end method

.method public final getTargetValue$financial_connections_release()Landroidx/compose/material/ModalBottomSheetValue;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigatorSheetState;->sheetState:Landroidx/compose/material/ModalBottomSheetState;

    invoke-virtual {v0}, Landroidx/compose/material/ModalBottomSheetState;->getTargetValue()Landroidx/compose/material/ModalBottomSheetValue;

    move-result-object v0

    return-object v0
.end method

.method public final isVisible$financial_connections_release()Z
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigatorSheetState;->sheetState:Landroidx/compose/material/ModalBottomSheetState;

    invoke-virtual {v0}, Landroidx/compose/material/ModalBottomSheetState;->isVisible()Z

    move-result v0

    return v0
.end method
