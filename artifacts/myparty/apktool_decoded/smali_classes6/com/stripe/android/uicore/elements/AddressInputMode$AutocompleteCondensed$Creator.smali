.class public final Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteCondensed$Creator;
.super Ljava/lang/Object;
.source "AddressInputMode.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteCondensed;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteCondensed;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteCondensed;
    .locals 7

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashSet;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-eq v3, v0, :cond_1

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_1
    move-object v3, v0

    check-cast v3, Ljava/util/Set;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->valueOf(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-result-object v4

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->valueOf(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-result-object v5

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lkotlin/jvm/functions/Function0;

    new-instance v1, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteCondensed;

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteCondensed;-><init>(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lkotlin/jvm/functions/Function0;)V

    return-object v1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteCondensed$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteCondensed;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteCondensed;
    .locals 0

    new-array p1, p1, [Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteCondensed;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteCondensed$Creator;->newArray(I)[Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteCondensed;

    move-result-object p1

    return-object p1
.end method
