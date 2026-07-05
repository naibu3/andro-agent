.class Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization$1;
.super Ljava/lang/Object;
.source "StripeToolbarCustomization.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;
    .locals 2

    .line 19
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;-><init>(Landroid/os/Parcel;Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization-IA;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 16
    invoke-virtual {p0, p1}, Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization$1;->createFromParcel(Landroid/os/Parcel;)Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;
    .locals 0

    .line 24
    new-array p1, p1, [Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 16
    invoke-virtual {p0, p1}, Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization$1;->newArray(I)[Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;

    move-result-object p1

    return-object p1
.end method
