.class public final Lcom/stripe/android/customersheet/CustomerSheetContract$Args$Creator;
.super Ljava/lang/Object;
.source "CustomerSheetContract.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/CustomerSheetContract$Args;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/stripe/android/customersheet/CustomerSheetContract$Args;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/stripe/android/customersheet/CustomerSheetContract$Args;
    .locals 4

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;->valueOf(Ljava/lang/String;)Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-nez v3, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :goto_0
    invoke-direct {v0, v1, v2, p1}, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;-><init>(Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetContract$Args$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/stripe/android/customersheet/CustomerSheetContract$Args;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/stripe/android/customersheet/CustomerSheetContract$Args;
    .locals 0

    new-array p1, p1, [Lcom/stripe/android/customersheet/CustomerSheetContract$Args;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetContract$Args$Creator;->newArray(I)[Lcom/stripe/android/customersheet/CustomerSheetContract$Args;

    move-result-object p1

    return-object p1
.end method
