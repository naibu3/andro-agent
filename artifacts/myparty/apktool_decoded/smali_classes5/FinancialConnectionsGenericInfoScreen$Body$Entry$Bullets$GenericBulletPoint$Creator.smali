.class public final LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint$Creator;
.super Ljava/lang/Object;
.source "FinancialConnectionsGenericInfoScreen.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint;",
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
.method public final createFromParcel(Landroid/os/Parcel;)LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint;
    .locals 4

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    sget-object v2, Lcom/stripe/android/financialconnections/model/Image;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    :goto_0
    check-cast v2, Lcom/stripe/android/financialconnections/model/Image;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint$Creator;->createFromParcel(Landroid/os/Parcel;)LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint;
    .locals 0

    new-array p1, p1, [LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint$Creator;->newArray(I)[LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint;

    move-result-object p1

    return-object p1
.end method
