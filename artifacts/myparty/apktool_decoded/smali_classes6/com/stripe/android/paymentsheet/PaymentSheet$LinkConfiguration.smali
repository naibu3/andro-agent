.class public final Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;
.super Ljava/lang/Object;
.source "PaymentSheet.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentSheet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LinkConfiguration"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Builder;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B!\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008B\u0013\u0008\u0017\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\tJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00058@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\r\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;",
        "Landroid/os/Parcelable;",
        "display",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;",
        "collectMissingBillingDetailsForExistingPaymentMethods",
        "",
        "allowUserEmailEdits",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;ZZ)V",
        "(Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;)V",
        "getDisplay$paymentsheet_release",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;",
        "getCollectMissingBillingDetailsForExistingPaymentMethods$paymentsheet_release",
        "()Z",
        "getAllowUserEmailEdits$paymentsheet_release",
        "shouldDisplay",
        "getShouldDisplay$paymentsheet_release",
        "describeContents",
        "",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
        "Builder",
        "Display",
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
            "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final allowUserEmailEdits:Z

.field private final collectMissingBillingDetailsForExistingPaymentMethods:Z

.field private final display:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Creator;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;)V
    .locals 1

    const-string v0, "display"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 3161
    invoke-direct {p0, p1, v0, v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;ZZ)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3160
    sget-object p1, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;->Automatic:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    .line 3158
    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;ZZ)V
    .locals 1

    const-string v0, "display"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3152
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3153
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->display:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    .line 3154
    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->collectMissingBillingDetailsForExistingPaymentMethods:Z

    .line 3155
    iput-boolean p3, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->allowUserEmailEdits:Z

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->display:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->display:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->collectMissingBillingDetailsForExistingPaymentMethods:Z

    iget-boolean v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->collectMissingBillingDetailsForExistingPaymentMethods:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->allowUserEmailEdits:Z

    iget-boolean p1, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->allowUserEmailEdits:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAllowUserEmailEdits$paymentsheet_release()Z
    .locals 1

    .line 3155
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->allowUserEmailEdits:Z

    return v0
.end method

.method public final getCollectMissingBillingDetailsForExistingPaymentMethods$paymentsheet_release()Z
    .locals 1

    .line 3154
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->collectMissingBillingDetailsForExistingPaymentMethods:Z

    return v0
.end method

.method public final getDisplay$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;
    .locals 1

    .line 3153
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->display:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    return-object v0
.end method

.method public final getShouldDisplay$paymentsheet_release()Z
    .locals 2

    .line 3168
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->display:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->display:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->collectMissingBillingDetailsForExistingPaymentMethods:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->allowUserEmailEdits:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->display:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->collectMissingBillingDetailsForExistingPaymentMethods:Z

    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->allowUserEmailEdits:Z

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "LinkConfiguration(display="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", collectMissingBillingDetailsForExistingPaymentMethods="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", allowUserEmailEdits="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->display:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->collectMissingBillingDetailsForExistingPaymentMethods:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->allowUserEmailEdits:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
