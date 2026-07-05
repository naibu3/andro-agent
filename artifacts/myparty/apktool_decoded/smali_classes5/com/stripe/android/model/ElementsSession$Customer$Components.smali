.class public final Lcom/stripe/android/model/ElementsSession$Customer$Components;
.super Ljava/lang/Object;
.source "ElementsSession.kt"

# interfaces
.implements Lcom/stripe/android/core/model/StripeModel;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/ElementsSession$Customer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Components"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;,
        Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/stripe/android/model/ElementsSession$Customer$Components;",
        "Lcom/stripe/android/core/model/StripeModel;",
        "mobilePaymentElement",
        "Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;",
        "customerSheet",
        "Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;",
        "<init>",
        "(Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;)V",
        "getMobilePaymentElement",
        "()Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;",
        "getCustomerSheet",
        "()Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;",
        "component1",
        "component2",
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
        "MobilePaymentElement",
        "CustomerSheet",
        "payments-core_release"
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
            "Lcom/stripe/android/model/ElementsSession$Customer$Components;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final customerSheet:Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;

.field private final mobilePaymentElement:Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/model/ElementsSession$Customer$Components$Creator;

    invoke-direct {v0}, Lcom/stripe/android/model/ElementsSession$Customer$Components$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/model/ElementsSession$Customer$Components;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;)V
    .locals 1

    const-string v0, "mobilePaymentElement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerSheet"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 151
    iput-object p1, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components;->mobilePaymentElement:Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;

    .line 152
    iput-object p2, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components;->customerSheet:Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/ElementsSession$Customer$Components;Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;ILjava/lang/Object;)Lcom/stripe/android/model/ElementsSession$Customer$Components;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components;->mobilePaymentElement:Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components;->customerSheet:Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/model/ElementsSession$Customer$Components;->copy(Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;)Lcom/stripe/android/model/ElementsSession$Customer$Components;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components;->mobilePaymentElement:Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components;->customerSheet:Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;)Lcom/stripe/android/model/ElementsSession$Customer$Components;
    .locals 1

    const-string v0, "mobilePaymentElement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerSheet"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/model/ElementsSession$Customer$Components;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/model/ElementsSession$Customer$Components;-><init>(Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;)V

    return-object v0
.end method

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
    instance-of v1, p1, Lcom/stripe/android/model/ElementsSession$Customer$Components;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/ElementsSession$Customer$Components;

    iget-object v1, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components;->mobilePaymentElement:Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;

    iget-object v3, p1, Lcom/stripe/android/model/ElementsSession$Customer$Components;->mobilePaymentElement:Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components;->customerSheet:Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;

    iget-object p1, p1, Lcom/stripe/android/model/ElementsSession$Customer$Components;->customerSheet:Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getCustomerSheet()Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components;->customerSheet:Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;

    return-object v0
.end method

.method public final getMobilePaymentElement()Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;
    .locals 1

    .line 151
    iget-object v0, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components;->mobilePaymentElement:Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components;->mobilePaymentElement:Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components;->customerSheet:Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components;->mobilePaymentElement:Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;

    iget-object v1, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components;->customerSheet:Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Components(mobilePaymentElement="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", customerSheet="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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

    iget-object v0, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components;->mobilePaymentElement:Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components;->customerSheet:Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
