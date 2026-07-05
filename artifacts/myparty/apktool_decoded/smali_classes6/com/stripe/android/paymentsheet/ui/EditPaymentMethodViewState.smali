.class public final Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;
.super Ljava/lang/Object;
.source "EditPaymentMethodViewState.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008!\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0081\u0008\u0018\u00002\u00020\u0001:\u00011B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\r\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\t\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0007H\u00c6\u0003J\t\u0010%\u001a\u00020\tH\u00c6\u0003J\t\u0010&\u001a\u00020\u000bH\u00c6\u0003J\u000f\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\rH\u00c6\u0003J\t\u0010(\u001a\u00020\tH\u00c6\u0003J\t\u0010)\u001a\u00020\tH\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003Jk\u0010+\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\t2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010,\u001a\u00020\t2\u0008\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020/H\u00d6\u0001J\t\u00100\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001aR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u0018\u00a8\u00062"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;",
        "",
        "status",
        "Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;",
        "last4",
        "",
        "displayName",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "canUpdate",
        "",
        "selectedBrand",
        "Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;",
        "availableBrands",
        "",
        "canRemove",
        "confirmRemoval",
        "error",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/CardBrandChoice;Ljava/util/List;ZZLcom/stripe/android/core/strings/ResolvableString;)V",
        "getStatus",
        "()Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;",
        "getLast4",
        "()Ljava/lang/String;",
        "getDisplayName",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "getCanUpdate",
        "()Z",
        "getSelectedBrand",
        "()Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;",
        "getAvailableBrands",
        "()Ljava/util/List;",
        "getCanRemove",
        "getConfirmRemoval",
        "getError",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "Status",
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
.field private final availableBrands:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;",
            ">;"
        }
    .end annotation
.end field

.field private final canRemove:Z

.field private final canUpdate:Z

.field private final confirmRemoval:Z

.field private final displayName:Lcom/stripe/android/core/strings/ResolvableString;

.field private final error:Lcom/stripe/android/core/strings/ResolvableString;

.field private final last4:Ljava/lang/String;

.field private final selectedBrand:Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

.field private final status:Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/CardBrandChoice;Ljava/util/List;ZZLcom/stripe/android/core/strings/ResolvableString;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            "Z",
            "Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;",
            ">;ZZ",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ")V"
        }
    .end annotation

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "last4"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "displayName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedBrand"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "availableBrands"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->status:Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;

    .line 7
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->last4:Ljava/lang/String;

    .line 8
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->displayName:Lcom/stripe/android/core/strings/ResolvableString;

    .line 9
    iput-boolean p4, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->canUpdate:Z

    .line 10
    iput-object p5, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->selectedBrand:Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    .line 11
    iput-object p6, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->availableBrands:Ljava/util/List;

    .line 12
    iput-boolean p7, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->canRemove:Z

    .line 13
    iput-boolean p8, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->confirmRemoval:Z

    .line 14
    iput-object p9, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->error:Lcom/stripe/android/core/strings/ResolvableString;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/CardBrandChoice;Ljava/util/List;ZZLcom/stripe/android/core/strings/ResolvableString;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p10

    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    move v10, v1

    goto :goto_0

    :cond_0
    move/from16 v10, p8

    :goto_0
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    move-object v11, v0

    goto :goto_1

    :cond_1
    move-object/from16 v11, p9

    :goto_1
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move/from16 v9, p7

    .line 5
    invoke-direct/range {v2 .. v11}, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;-><init>(Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/CardBrandChoice;Ljava/util/List;ZZLcom/stripe/android/core/strings/ResolvableString;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/CardBrandChoice;Ljava/util/List;ZZLcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->status:Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->last4:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->displayName:Lcom/stripe/android/core/strings/ResolvableString;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-boolean p4, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->canUpdate:Z

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->selectedBrand:Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->availableBrands:Ljava/util/List;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-boolean p7, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->canRemove:Z

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-boolean p8, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->confirmRemoval:Z

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->error:Lcom/stripe/android/core/strings/ResolvableString;

    :cond_8
    move p10, p8

    move-object p11, p9

    move-object p8, p6

    move p9, p7

    move p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->copy(Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/CardBrandChoice;Ljava/util/List;ZZLcom/stripe/android/core/strings/ResolvableString;)Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->status:Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->last4:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->displayName:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->canUpdate:Z

    return v0
.end method

.method public final component5()Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->selectedBrand:Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->availableBrands:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->canRemove:Z

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->confirmRemoval:Z

    return v0
.end method

.method public final component9()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->error:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/CardBrandChoice;Ljava/util/List;ZZLcom/stripe/android/core/strings/ResolvableString;)Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            "Z",
            "Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;",
            ">;ZZ",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ")",
            "Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;"
        }
    .end annotation

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "last4"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "displayName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedBrand"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "availableBrands"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;-><init>(Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/CardBrandChoice;Ljava/util/List;ZZLcom/stripe/android/core/strings/ResolvableString;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->status:Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->status:Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->last4:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->last4:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->displayName:Lcom/stripe/android/core/strings/ResolvableString;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->displayName:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->canUpdate:Z

    iget-boolean v3, p1, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->canUpdate:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->selectedBrand:Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->selectedBrand:Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->availableBrands:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->availableBrands:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->canRemove:Z

    iget-boolean v3, p1, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->canRemove:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->confirmRemoval:Z

    iget-boolean v3, p1, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->confirmRemoval:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->error:Lcom/stripe/android/core/strings/ResolvableString;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->error:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getAvailableBrands()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;",
            ">;"
        }
    .end annotation

    .line 11
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->availableBrands:Ljava/util/List;

    return-object v0
.end method

.method public final getCanRemove()Z
    .locals 1

    .line 12
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->canRemove:Z

    return v0
.end method

.method public final getCanUpdate()Z
    .locals 1

    .line 9
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->canUpdate:Z

    return v0
.end method

.method public final getConfirmRemoval()Z
    .locals 1

    .line 13
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->confirmRemoval:Z

    return v0
.end method

.method public final getDisplayName()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->displayName:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final getError()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->error:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final getLast4()Ljava/lang/String;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->last4:Ljava/lang/String;

    return-object v0
.end method

.method public final getSelectedBrand()Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->selectedBrand:Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    return-object v0
.end method

.method public final getStatus()Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->status:Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->status:Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->last4:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->displayName:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->canUpdate:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->selectedBrand:Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->availableBrands:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->canRemove:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->confirmRemoval:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->error:Lcom/stripe/android/core/strings/ResolvableString;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->status:Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->last4:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->displayName:Lcom/stripe/android/core/strings/ResolvableString;

    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->canUpdate:Z

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->selectedBrand:Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->availableBrands:Ljava/util/List;

    iget-boolean v6, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->canRemove:Z

    iget-boolean v7, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->confirmRemoval:Z

    iget-object v8, p0, Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;->error:Lcom/stripe/android/core/strings/ResolvableString;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "EditPaymentMethodViewState(status="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v9, ", last4="

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", displayName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", canUpdate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", selectedBrand="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", availableBrands="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", canRemove="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", confirmRemoval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", error="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
