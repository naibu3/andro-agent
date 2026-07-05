.class public final Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;
.super Ljava/lang/Object;
.source "CollectBankAccountResultInternal.kt"

# interfaces
.implements Lcom/stripe/android/core/model/StripeModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;,
        Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u0002\"#B%\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J-\u0010\u0013\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006$"
    }
    d2 = {
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;",
        "Lcom/stripe/android/core/model/StripeModel;",
        "intent",
        "Lcom/stripe/android/model/StripeIntent;",
        "usBankAccountData",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;",
        "instantDebitsData",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;",
        "<init>",
        "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;)V",
        "getIntent",
        "()Lcom/stripe/android/model/StripeIntent;",
        "getUsBankAccountData",
        "()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;",
        "getInstantDebitsData",
        "()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;",
        "component1",
        "component2",
        "component3",
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
        "USBankAccountData",
        "InstantDebitsData",
        "payments-core_release"
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
            "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final instantDebitsData:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;

.field private final intent:Lcom/stripe/android/model/StripeIntent;

.field private final usBankAccountData:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$Creator;

    invoke-direct {v0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->intent:Lcom/stripe/android/model/StripeIntent;

    .line 42
    iput-object p2, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->usBankAccountData:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;

    .line 43
    iput-object p3, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->instantDebitsData:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;ILjava/lang/Object;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->intent:Lcom/stripe/android/model/StripeIntent;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->usBankAccountData:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->instantDebitsData:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->copy(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/model/StripeIntent;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->intent:Lcom/stripe/android/model/StripeIntent;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->usBankAccountData:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->instantDebitsData:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;
    .locals 1

    new-instance v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;-><init>(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;)V

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
    instance-of v1, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;

    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->intent:Lcom/stripe/android/model/StripeIntent;

    iget-object v3, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->intent:Lcom/stripe/android/model/StripeIntent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->usBankAccountData:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;

    iget-object v3, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->usBankAccountData:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->instantDebitsData:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;

    iget-object p1, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->instantDebitsData:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getInstantDebitsData()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->instantDebitsData:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;

    return-object v0
.end method

.method public final getIntent()Lcom/stripe/android/model/StripeIntent;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->intent:Lcom/stripe/android/model/StripeIntent;

    return-object v0
.end method

.method public final getUsBankAccountData()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->usBankAccountData:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->intent:Lcom/stripe/android/model/StripeIntent;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->usBankAccountData:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->instantDebitsData:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->intent:Lcom/stripe/android/model/StripeIntent;

    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->usBankAccountData:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;

    iget-object v2, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->instantDebitsData:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "CollectBankAccountResponseInternal(intent="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", usBankAccountData="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", instantDebitsData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->intent:Lcom/stripe/android/model/StripeIntent;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->usBankAccountData:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->instantDebitsData:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
