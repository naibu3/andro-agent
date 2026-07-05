.class public final Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$Creator;
.super Ljava/lang/Object;
.source "BillingDetailsCollectionConfiguration.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration;
    .locals 6

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-eqz v4, :cond_1

    move v4, v2

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_2

    :cond_2
    move v2, v3

    :goto_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$AddressCollectionMode;->valueOf(Ljava/lang/String;)Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$AddressCollectionMode;

    move-result-object p1

    invoke-direct {v0, v1, v4, v2, p1}, Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration;-><init>(ZZZLcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$AddressCollectionMode;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration;
    .locals 0

    new-array p1, p1, [Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$Creator;->newArray(I)[Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration;

    move-result-object p1

    return-object p1
.end method
