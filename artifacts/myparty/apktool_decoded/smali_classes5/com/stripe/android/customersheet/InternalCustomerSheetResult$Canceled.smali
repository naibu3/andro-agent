.class public final Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;
.super Lcom/stripe/android/customersheet/InternalCustomerSheetResult;
.source "InternalCustomerSheetResult.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/InternalCustomerSheetResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Canceled"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\r\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;",
        "Lcom/stripe/android/customersheet/InternalCustomerSheetResult;",
        "paymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V",
        "getPaymentSelection",
        "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "toPublicResult",
        "Lcom/stripe/android/customersheet/CustomerSheetResult;",
        "paymentOptionFactory",
        "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;",
        "component1",
        "copy",
        "describeContents",
        "",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
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

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled$Creator;

    invoke-direct {v0}, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V
    .locals 1

    const/4 v0, 0x0

    .line 40
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/InternalCustomerSheetResult;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 39
    iput-object p1, p0, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;->paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ILjava/lang/Object;)Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;->paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;->copy(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/paymentsheet/model/PaymentSelection;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;->paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;
    .locals 1

    new-instance v0, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;

    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;-><init>(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;

    iget-object v1, p0, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;->paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    iget-object p1, p1, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;->paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;->paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;->paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection;->hashCode()I

    move-result v0

    return v0
.end method

.method public toPublicResult(Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;)Lcom/stripe/android/customersheet/CustomerSheetResult;
    .locals 4

    const-string v0, "paymentOptionFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetResult$Canceled;

    .line 45
    iget-object v1, p0, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;->paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    if-eqz v1, :cond_0

    sget-object v2, Lcom/stripe/android/customersheet/CustomerSheet;->Companion:Lcom/stripe/android/customersheet/CustomerSheet$Companion;

    const/4 v3, 0x1

    invoke-virtual {v2, v1, p1, v3}, Lcom/stripe/android/customersheet/CustomerSheet$Companion;->toPaymentOptionSelection$paymentsheet_release(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Z)Lcom/stripe/android/customersheet/PaymentOptionSelection;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 44
    :goto_0
    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/CustomerSheetResult$Canceled;-><init>(Lcom/stripe/android/customersheet/PaymentOptionSelection;)V

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheetResult;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;->paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Canceled(paymentSelection="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;->paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
