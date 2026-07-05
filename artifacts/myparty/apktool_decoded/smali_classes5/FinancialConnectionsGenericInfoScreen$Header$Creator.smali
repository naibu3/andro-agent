.class public final LFinancialConnectionsGenericInfoScreen$Header$Creator;
.super Ljava/lang/Object;
.source "FinancialConnectionsGenericInfoScreen.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LFinancialConnectionsGenericInfoScreen$Header;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "LFinancialConnectionsGenericInfoScreen$Header;",
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
.method public final createFromParcel(Landroid/os/Parcel;)LFinancialConnectionsGenericInfoScreen$Header;
    .locals 6

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LFinancialConnectionsGenericInfoScreen$Header;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    move-object v3, v4

    goto :goto_0

    :cond_0
    sget-object v3, Lcom/stripe/android/financialconnections/model/Image;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    :goto_0
    check-cast v3, Lcom/stripe/android/financialconnections/model/Image;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    if-nez v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LAlignment;->valueOf(Ljava/lang/String;)LAlignment;

    move-result-object v4

    :goto_1
    invoke-direct {v0, v1, v2, v3, v4}, LFinancialConnectionsGenericInfoScreen$Header;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;LAlignment;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LFinancialConnectionsGenericInfoScreen$Header$Creator;->createFromParcel(Landroid/os/Parcel;)LFinancialConnectionsGenericInfoScreen$Header;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[LFinancialConnectionsGenericInfoScreen$Header;
    .locals 0

    new-array p1, p1, [LFinancialConnectionsGenericInfoScreen$Header;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LFinancialConnectionsGenericInfoScreen$Header$Creator;->newArray(I)[LFinancialConnectionsGenericInfoScreen$Header;

    move-result-object p1

    return-object p1
.end method
