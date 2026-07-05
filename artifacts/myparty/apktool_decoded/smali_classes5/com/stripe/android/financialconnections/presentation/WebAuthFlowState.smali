.class public abstract Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;
.super Ljava/lang/Object;
.source "FinancialConnectionsSheetNativeViewModel.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Canceled;,
        Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Failed;,
        Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$InProgress;,
        Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Success;,
        Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Uninitialized;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\u0008B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\u000c\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;",
        "Landroid/os/Parcelable;",
        "<init>",
        "()V",
        "Uninitialized",
        "InProgress",
        "Success",
        "Canceled",
        "Failed",
        "Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Canceled;",
        "Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Failed;",
        "Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$InProgress;",
        "Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Success;",
        "Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Uninitialized;",
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


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 574
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;-><init>()V

    return-void
.end method
