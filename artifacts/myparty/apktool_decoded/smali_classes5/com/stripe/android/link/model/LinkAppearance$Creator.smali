.class public final Lcom/stripe/android/link/model/LinkAppearance$Creator;
.super Ljava/lang/Object;
.source "LinkAppearance.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/model/LinkAppearance;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/stripe/android/link/model/LinkAppearance;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/stripe/android/link/model/LinkAppearance;
    .locals 5

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/link/model/LinkAppearance;

    sget-object v1, Lcom/stripe/android/link/model/LinkAppearance$Colors;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/link/model/LinkAppearance$Colors;

    sget-object v2, Lcom/stripe/android/link/model/LinkAppearance$Colors;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/link/model/LinkAppearance$Colors;

    sget-object v3, Lcom/stripe/android/link/model/LinkAppearance$Style;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/link/model/LinkAppearance$Style;

    sget-object v4, Lcom/stripe/android/link/model/LinkAppearance$PrimaryButton;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v4, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/model/LinkAppearance$PrimaryButton;

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/stripe/android/link/model/LinkAppearance;-><init>(Lcom/stripe/android/link/model/LinkAppearance$Colors;Lcom/stripe/android/link/model/LinkAppearance$Colors;Lcom/stripe/android/link/model/LinkAppearance$Style;Lcom/stripe/android/link/model/LinkAppearance$PrimaryButton;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/model/LinkAppearance$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/stripe/android/link/model/LinkAppearance;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/stripe/android/link/model/LinkAppearance;
    .locals 0

    new-array p1, p1, [Lcom/stripe/android/link/model/LinkAppearance;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/model/LinkAppearance$Creator;->newArray(I)[Lcom/stripe/android/link/model/LinkAppearance;

    move-result-object p1

    return-object p1
.end method
