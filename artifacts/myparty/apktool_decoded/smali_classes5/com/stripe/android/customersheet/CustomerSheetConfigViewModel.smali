.class public final Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "CustomerSheetConfigViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel$Companion;,
        Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0002\r\u000eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "<init>",
        "(Landroidx/lifecycle/SavedStateHandle;)V",
        "value",
        "Lcom/stripe/android/customersheet/CustomerSheetConfigureRequest;",
        "configureRequest",
        "getConfigureRequest",
        "()Lcom/stripe/android/customersheet/CustomerSheetConfigureRequest;",
        "setConfigureRequest",
        "(Lcom/stripe/android/customersheet/CustomerSheetConfigureRequest;)V",
        "Factory",
        "Companion",
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
.field public static final $stable:I

.field private static final CUSTOMER_SHEET_CONFIGURE_REQUEST_KEY:Ljava/lang/String; = "CustomerSheetConfigureRequest"

.field private static final Companion:Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel$Companion;


# instance fields
.field private final savedStateHandle:Landroidx/lifecycle/SavedStateHandle;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel;->Companion:Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/SavedStateHandle;)V
    .locals 1

    const-string v0, "savedStateHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    return-void
.end method


# virtual methods
.method public final getConfigureRequest()Lcom/stripe/android/customersheet/CustomerSheetConfigureRequest;
    .locals 2

    .line 16
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "CustomerSheetConfigureRequest"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheetConfigureRequest;

    return-object v0
.end method

.method public final setConfigureRequest(Lcom/stripe/android/customersheet/CustomerSheetConfigureRequest;)V
    .locals 2

    .line 14
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "CustomerSheetConfigureRequest"

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
