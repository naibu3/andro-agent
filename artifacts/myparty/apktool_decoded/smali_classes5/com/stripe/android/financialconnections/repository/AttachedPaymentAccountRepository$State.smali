.class public final Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository$State;
.super Ljava/lang/Object;
.source "AttachedPaymentAccountRepository.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "State"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000b\u0010\u0008\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository$State;",
        "Landroid/os/Parcelable;",
        "attachedPaymentAccount",
        "Lcom/stripe/android/financialconnections/model/PaymentAccountParams;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/model/PaymentAccountParams;)V",
        "getAttachedPaymentAccount",
        "()Lcom/stripe/android/financialconnections/model/PaymentAccountParams;",
        "component1",
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
        "financial-connections_release"
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
            "Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository$State;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final attachedPaymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccountParams;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository$State$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository$State$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository$State;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository$State;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository$State;-><init>(Lcom/stripe/android/financialconnections/model/PaymentAccountParams;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/model/PaymentAccountParams;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository$State;->attachedPaymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccountParams;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/model/PaymentAccountParams;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 28
    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository$State;-><init>(Lcom/stripe/android/financialconnections/model/PaymentAccountParams;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository$State;Lcom/stripe/android/financialconnections/model/PaymentAccountParams;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository$State;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository$State;->attachedPaymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccountParams;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository$State;->copy(Lcom/stripe/android/financialconnections/model/PaymentAccountParams;)Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository$State;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/model/PaymentAccountParams;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository$State;->attachedPaymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccountParams;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/model/PaymentAccountParams;)Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository$State;
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository$State;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository$State;-><init>(Lcom/stripe/android/financialconnections/model/PaymentAccountParams;)V

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository$State;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository$State;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository$State;->attachedPaymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccountParams;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository$State;->attachedPaymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccountParams;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getAttachedPaymentAccount()Lcom/stripe/android/financialconnections/model/PaymentAccountParams;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository$State;->attachedPaymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccountParams;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository$State;->attachedPaymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccountParams;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/PaymentAccountParams;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository$State;->attachedPaymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccountParams;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "State(attachedPaymentAccount="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository$State;->attachedPaymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccountParams;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
