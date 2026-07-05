.class public final Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;
.super Lcom/stripe/android/stripe3ds2/init/ui/BaseCustomization;
.source "StripeTextBoxCustomization.java"

# interfaces
.implements Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private mBorderColor:Ljava/lang/String;

.field private mBorderWidth:I

.field private mCornerRadius:I

.field private mHintTextColor:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 15
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization$1;

    invoke-direct {v0}, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization$1;-><init>()V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/init/ui/BaseCustomization;-><init>()V

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 38
    invoke-direct {p0, p1}, Lcom/stripe/android/stripe3ds2/init/ui/BaseCustomization;-><init>(Landroid/os/Parcel;)V

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mBorderWidth:I

    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mBorderColor:Ljava/lang/String;

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mCornerRadius:I

    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mHintTextColor:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization-IA;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method private typedEquals(Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;)Z
    .locals 2

    .line 95
    iget v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mBorderWidth:I

    iget v1, p1, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mBorderWidth:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mBorderColor:Ljava/lang/String;

    iget-object v1, p1, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mBorderColor:Ljava/lang/String;

    .line 96
    invoke-static {v0, v1}, Lcom/stripe/android/stripe3ds2/utils/ObjectUtils;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mCornerRadius:I

    iget v1, p1, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mCornerRadius:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mHintTextColor:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mHintTextColor:Ljava/lang/String;

    .line 98
    invoke-static {v0, p1}, Lcom/stripe/android/stripe3ds2/utils/ObjectUtils;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p0, p1, :cond_1

    .line 90
    instance-of v0, p1, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;

    .line 91
    invoke-direct {p0, p1}, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->typedEquals(Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public getBorderColor()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mBorderColor:Ljava/lang/String;

    return-object v0
.end method

.method public getBorderWidth()I
    .locals 1

    .line 53
    iget v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mBorderWidth:I

    return v0
.end method

.method public getCornerRadius()I
    .locals 1

    .line 74
    iget v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mCornerRadius:I

    return v0
.end method

.method public getHintTextColor()Ljava/lang/String;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mHintTextColor:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 103
    iget v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mBorderWidth:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mBorderColor:Ljava/lang/String;

    iget v2, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mCornerRadius:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mHintTextColor:Ljava/lang/String;

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/stripe3ds2/utils/ObjectUtils;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public setBorderColor(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/stripe3ds2/exceptions/InvalidInputException;
        }
    .end annotation

    .line 58
    invoke-static {p1}, Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;->requireValidColor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mBorderColor:Ljava/lang/String;

    return-void
.end method

.method public setBorderWidth(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/stripe3ds2/exceptions/InvalidInputException;
        }
    .end annotation

    .line 48
    invoke-static {p1}, Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;->requireValidDimension(I)I

    move-result p1

    iput p1, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mBorderWidth:I

    return-void
.end method

.method public setCornerRadius(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/stripe3ds2/exceptions/InvalidInputException;
        }
    .end annotation

    .line 69
    invoke-static {p1}, Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;->requireValidDimension(I)I

    move-result p1

    iput p1, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mCornerRadius:I

    return-void
.end method

.method public setHintTextColor(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/stripe3ds2/exceptions/InvalidInputException;
        }
    .end annotation

    .line 79
    invoke-static {p1}, Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;->requireValidColor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mHintTextColor:Ljava/lang/String;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 113
    invoke-super {p0, p1, p2}, Lcom/stripe/android/stripe3ds2/init/ui/BaseCustomization;->writeToParcel(Landroid/os/Parcel;I)V

    .line 114
    iget p2, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mBorderWidth:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 115
    iget-object p2, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mBorderColor:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 116
    iget p2, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mCornerRadius:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 117
    iget-object p2, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;->mHintTextColor:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
