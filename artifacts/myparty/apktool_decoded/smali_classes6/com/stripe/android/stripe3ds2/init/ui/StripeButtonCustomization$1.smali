.class Lcom/stripe/android/stripe3ds2/init/ui/StripeButtonCustomization$1;
.super Ljava/lang/Object;
.source "StripeButtonCustomization.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/stripe3ds2/init/ui/StripeButtonCustomization;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/stripe/android/stripe3ds2/init/ui/StripeButtonCustomization;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/stripe/android/stripe3ds2/init/ui/StripeButtonCustomization;
    .locals 2

    .line 20
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/ui/StripeButtonCustomization;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/stripe/android/stripe3ds2/init/ui/StripeButtonCustomization;-><init>(Landroid/os/Parcel;Lcom/stripe/android/stripe3ds2/init/ui/StripeButtonCustomization-IA;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 17
    invoke-virtual {p0, p1}, Lcom/stripe/android/stripe3ds2/init/ui/StripeButtonCustomization$1;->createFromParcel(Landroid/os/Parcel;)Lcom/stripe/android/stripe3ds2/init/ui/StripeButtonCustomization;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/stripe/android/stripe3ds2/init/ui/StripeButtonCustomization;
    .locals 0

    .line 25
    new-array p1, p1, [Lcom/stripe/android/stripe3ds2/init/ui/StripeButtonCustomization;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 17
    invoke-virtual {p0, p1}, Lcom/stripe/android/stripe3ds2/init/ui/StripeButtonCustomization$1;->newArray(I)[Lcom/stripe/android/stripe3ds2/init/ui/StripeButtonCustomization;

    move-result-object p1

    return-object p1
.end method
