.class public final Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;
.super Lcom/stripe/android/uicore/elements/AddressInputMode;
.source "AddressInputMode.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/AddressInputMode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "NoAutocomplete"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;",
        "Lcom/stripe/android/uicore/elements/AddressInputMode;",
        "phoneNumberConfig",
        "Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;",
        "nameConfig",
        "<init>",
        "(Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;)V",
        "getPhoneNumberConfig",
        "()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;",
        "getNameConfig",
        "component1",
        "component2",
        "copy",
        "describeContents",
        "",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
        "stripe-ui-core_release"
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

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final nameConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

.field private final phoneNumberConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete$Creator;

    invoke-direct {v0}, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;-><init>(Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;)V
    .locals 1

    const-string v0, "phoneNumberConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 40
    invoke-direct {p0, v0}, Lcom/stripe/android/uicore/elements/AddressInputMode;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 36
    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;->phoneNumberConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    .line 38
    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;->nameConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 37
    sget-object p1, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->HIDDEN:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 39
    sget-object p2, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->HIDDEN:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    .line 35
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;-><init>(Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;ILjava/lang/Object;)Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;->phoneNumberConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;->nameConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;->copy(Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;)Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;->phoneNumberConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;->nameConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;)Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;
    .locals 1

    const-string v0, "phoneNumberConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;-><init>(Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;)V

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;->phoneNumberConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iget-object v3, p1, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;->phoneNumberConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;->nameConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iget-object p1, p1, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;->nameConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public getNameConfig()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;->nameConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    return-object v0
.end method

.method public getPhoneNumberConfig()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;->phoneNumberConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;->phoneNumberConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;->nameConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;->phoneNumberConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;->nameConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "NoAutocomplete(phoneNumberConfig="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", nameConfig="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;->phoneNumberConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-virtual {p2}, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;->nameConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-virtual {p2}, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
