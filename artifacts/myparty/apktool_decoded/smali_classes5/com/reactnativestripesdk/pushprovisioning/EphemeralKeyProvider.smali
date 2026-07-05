.class public final Lcom/reactnativestripesdk/pushprovisioning/EphemeralKeyProvider;
.super Ljava/lang/Object;
.source "EphemeralKeyProvider.kt"

# interfaces
.implements Lcom/stripe/android/pushProvisioning/PushProvisioningEphemeralKeyProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativestripesdk/pushprovisioning/EphemeralKeyProvider$CREATOR;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u0011\u0008\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0008J\u0008\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/reactnativestripesdk/pushprovisioning/EphemeralKeyProvider;",
        "Lcom/stripe/android/pushProvisioning/PushProvisioningEphemeralKeyProvider;",
        "ephemeralKey",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "parcel",
        "Landroid/os/Parcel;",
        "(Landroid/os/Parcel;)V",
        "describeContents",
        "",
        "writeToParcel",
        "",
        "dest",
        "flags",
        "createEphemeralKey",
        "apiVersion",
        "keyUpdateListener",
        "Lcom/stripe/android/pushProvisioning/EphemeralKeyUpdateListener;",
        "CREATOR",
        "stripe_stripe-react-native_release"
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

.field public static final CREATOR:Lcom/reactnativestripesdk/pushprovisioning/EphemeralKeyProvider$CREATOR;


# instance fields
.field private final ephemeralKey:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/reactnativestripesdk/pushprovisioning/EphemeralKeyProvider$CREATOR;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/reactnativestripesdk/pushprovisioning/EphemeralKeyProvider$CREATOR;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/reactnativestripesdk/pushprovisioning/EphemeralKeyProvider;->CREATOR:Lcom/reactnativestripesdk/pushprovisioning/EphemeralKeyProvider$CREATOR;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    invoke-direct {p0, p1}, Lcom/reactnativestripesdk/pushprovisioning/EphemeralKeyProvider;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Parcel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/reactnativestripesdk/pushprovisioning/EphemeralKeyProvider;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "ephemeralKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/reactnativestripesdk/pushprovisioning/EphemeralKeyProvider;->ephemeralKey:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public createEphemeralKey(Ljava/lang/String;Lcom/stripe/android/pushProvisioning/EphemeralKeyUpdateListener;)V
    .locals 1

    const-string v0, "apiVersion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "keyUpdateListener"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    iget-object p1, p0, Lcom/reactnativestripesdk/pushprovisioning/EphemeralKeyProvider;->ephemeralKey:Ljava/lang/String;

    invoke-interface {p2, p1}, Lcom/stripe/android/pushProvisioning/EphemeralKeyUpdateListener;->onKeyUpdate(Ljava/lang/String;)V

    return-void
.end method

.method public describeContents()I
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/reactnativestripesdk/pushprovisioning/EphemeralKeyProvider;->hashCode()I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    iget-object p2, p0, Lcom/reactnativestripesdk/pushprovisioning/EphemeralKeyProvider;->ephemeralKey:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
