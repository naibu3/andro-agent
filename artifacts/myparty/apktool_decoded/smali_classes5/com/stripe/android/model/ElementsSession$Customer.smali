.class public final Lcom/stripe/android/model/ElementsSession$Customer;
.super Ljava/lang/Object;
.source "ElementsSession.kt"

# interfaces
.implements Lcom/stripe/android/core/model/StripeModel;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/ElementsSession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Customer"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/ElementsSession$Customer$Components;,
        Lcom/stripe/android/model/ElementsSession$Customer$Session;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u0002\"#B\'\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0008H\u00c6\u0003J/\u0010\u0014\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0006H\u00d6\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006$"
    }
    d2 = {
        "Lcom/stripe/android/model/ElementsSession$Customer;",
        "Lcom/stripe/android/core/model/StripeModel;",
        "paymentMethods",
        "",
        "Lcom/stripe/android/model/PaymentMethod;",
        "defaultPaymentMethod",
        "",
        "session",
        "Lcom/stripe/android/model/ElementsSession$Customer$Session;",
        "<init>",
        "(Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/model/ElementsSession$Customer$Session;)V",
        "getPaymentMethods",
        "()Ljava/util/List;",
        "getDefaultPaymentMethod",
        "()Ljava/lang/String;",
        "getSession",
        "()Lcom/stripe/android/model/ElementsSession$Customer$Session;",
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
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
        "Session",
        "Components",
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
            "Lcom/stripe/android/model/ElementsSession$Customer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final defaultPaymentMethod:Ljava/lang/String;

.field private final paymentMethods:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private final session:Lcom/stripe/android/model/ElementsSession$Customer$Session;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/model/ElementsSession$Customer$Creator;

    invoke-direct {v0}, Lcom/stripe/android/model/ElementsSession$Customer$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/model/ElementsSession$Customer;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/model/ElementsSession$Customer;->$stable:I

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/model/ElementsSession$Customer$Session;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/ElementsSession$Customer$Session;",
            ")V"
        }
    .end annotation

    const-string v0, "paymentMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "session"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 133
    iput-object p1, p0, Lcom/stripe/android/model/ElementsSession$Customer;->paymentMethods:Ljava/util/List;

    .line 134
    iput-object p2, p0, Lcom/stripe/android/model/ElementsSession$Customer;->defaultPaymentMethod:Ljava/lang/String;

    .line 135
    iput-object p3, p0, Lcom/stripe/android/model/ElementsSession$Customer;->session:Lcom/stripe/android/model/ElementsSession$Customer$Session;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/ElementsSession$Customer;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/model/ElementsSession$Customer$Session;ILjava/lang/Object;)Lcom/stripe/android/model/ElementsSession$Customer;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/model/ElementsSession$Customer;->paymentMethods:Ljava/util/List;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/model/ElementsSession$Customer;->defaultPaymentMethod:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/stripe/android/model/ElementsSession$Customer;->session:Lcom/stripe/android/model/ElementsSession$Customer$Session;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/model/ElementsSession$Customer;->copy(Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/model/ElementsSession$Customer$Session;)Lcom/stripe/android/model/ElementsSession$Customer;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/model/ElementsSession$Customer;->paymentMethods:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ElementsSession$Customer;->defaultPaymentMethod:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/model/ElementsSession$Customer$Session;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ElementsSession$Customer;->session:Lcom/stripe/android/model/ElementsSession$Customer$Session;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/model/ElementsSession$Customer$Session;)Lcom/stripe/android/model/ElementsSession$Customer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/ElementsSession$Customer$Session;",
            ")",
            "Lcom/stripe/android/model/ElementsSession$Customer;"
        }
    .end annotation

    const-string v0, "paymentMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "session"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/model/ElementsSession$Customer;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/model/ElementsSession$Customer;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/model/ElementsSession$Customer$Session;)V

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
    instance-of v1, p1, Lcom/stripe/android/model/ElementsSession$Customer;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/ElementsSession$Customer;

    iget-object v1, p0, Lcom/stripe/android/model/ElementsSession$Customer;->paymentMethods:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/model/ElementsSession$Customer;->paymentMethods:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/model/ElementsSession$Customer;->defaultPaymentMethod:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/ElementsSession$Customer;->defaultPaymentMethod:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/model/ElementsSession$Customer;->session:Lcom/stripe/android/model/ElementsSession$Customer$Session;

    iget-object p1, p1, Lcom/stripe/android/model/ElementsSession$Customer;->session:Lcom/stripe/android/model/ElementsSession$Customer$Session;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getDefaultPaymentMethod()Ljava/lang/String;
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/stripe/android/model/ElementsSession$Customer;->defaultPaymentMethod:Ljava/lang/String;

    return-object v0
.end method

.method public final getPaymentMethods()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;"
        }
    .end annotation

    .line 133
    iget-object v0, p0, Lcom/stripe/android/model/ElementsSession$Customer;->paymentMethods:Ljava/util/List;

    return-object v0
.end method

.method public final getSession()Lcom/stripe/android/model/ElementsSession$Customer$Session;
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/stripe/android/model/ElementsSession$Customer;->session:Lcom/stripe/android/model/ElementsSession$Customer$Session;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/model/ElementsSession$Customer;->paymentMethods:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/ElementsSession$Customer;->defaultPaymentMethod:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/ElementsSession$Customer;->session:Lcom/stripe/android/model/ElementsSession$Customer$Session;

    invoke-virtual {v1}, Lcom/stripe/android/model/ElementsSession$Customer$Session;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/model/ElementsSession$Customer;->paymentMethods:Ljava/util/List;

    iget-object v1, p0, Lcom/stripe/android/model/ElementsSession$Customer;->defaultPaymentMethod:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/model/ElementsSession$Customer;->session:Lcom/stripe/android/model/ElementsSession$Customer$Session;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Customer(paymentMethods="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", defaultPaymentMethod="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", session="

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
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/ElementsSession$Customer;->paymentMethods:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/model/PaymentMethod;

    invoke-virtual {v1, p1, p2}, Lcom/stripe/android/model/PaymentMethod;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/model/ElementsSession$Customer;->defaultPaymentMethod:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/ElementsSession$Customer;->session:Lcom/stripe/android/model/ElementsSession$Customer$Session;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/ElementsSession$Customer$Session;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
