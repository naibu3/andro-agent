.class public final Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;
.super Ljava/lang/Object;
.source "DeferredIntentParams.kt"

# interfaces
.implements Lcom/stripe/android/model/DeferredIntentParams$Mode;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/DeferredIntentParams$Mode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Payment"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J?\u0010\u001d\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020!2\u0008\u0010\"\u001a\u0004\u0018\u00010#H\u00d6\u0003J\t\u0010$\u001a\u00020\u001fH\u00d6\u0001J\t\u0010%\u001a\u00020\u0005H\u00d6\u0001J\u0016\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0010\u00a8\u0006+"
    }
    d2 = {
        "Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;",
        "Lcom/stripe/android/model/DeferredIntentParams$Mode;",
        "amount",
        "",
        "currency",
        "",
        "setupFutureUsage",
        "Lcom/stripe/android/model/StripeIntent$Usage;",
        "captureMethod",
        "Lcom/stripe/android/model/PaymentIntent$CaptureMethod;",
        "paymentMethodOptionsJsonString",
        "<init>",
        "(JLjava/lang/String;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/PaymentIntent$CaptureMethod;Ljava/lang/String;)V",
        "getAmount",
        "()J",
        "getCurrency",
        "()Ljava/lang/String;",
        "getSetupFutureUsage",
        "()Lcom/stripe/android/model/StripeIntent$Usage;",
        "getCaptureMethod",
        "()Lcom/stripe/android/model/PaymentIntent$CaptureMethod;",
        "getPaymentMethodOptionsJsonString",
        "code",
        "getCode",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
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
            "Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final amount:J

.field private final captureMethod:Lcom/stripe/android/model/PaymentIntent$CaptureMethod;

.field private final currency:Ljava/lang/String;

.field private final paymentMethodOptionsJsonString:Ljava/lang/String;

.field private final setupFutureUsage:Lcom/stripe/android/model/StripeIntent$Usage;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment$Creator;

    invoke-direct {v0}, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->$stable:I

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/PaymentIntent$CaptureMethod;Ljava/lang/String;)V
    .locals 1

    const-string v0, "currency"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "captureMethod"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-wide p1, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->amount:J

    .line 28
    iput-object p3, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->currency:Ljava/lang/String;

    .line 29
    iput-object p4, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->setupFutureUsage:Lcom/stripe/android/model/StripeIntent$Usage;

    .line 30
    iput-object p5, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->captureMethod:Lcom/stripe/android/model/PaymentIntent$CaptureMethod;

    .line 31
    iput-object p6, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->paymentMethodOptionsJsonString:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;JLjava/lang/String;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/PaymentIntent$CaptureMethod;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-wide p1, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->amount:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->currency:Ljava/lang/String;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    iget-object p4, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->setupFutureUsage:Lcom/stripe/android/model/StripeIntent$Usage;

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    iget-object p5, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->captureMethod:Lcom/stripe/android/model/PaymentIntent$CaptureMethod;

    :cond_3
    move-object v5, p5

    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_4

    iget-object p6, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->paymentMethodOptionsJsonString:Ljava/lang/String;

    :cond_4
    move-object v0, p0

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->copy(JLjava/lang/String;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/PaymentIntent$CaptureMethod;Ljava/lang/String;)Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->amount:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/model/StripeIntent$Usage;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->setupFutureUsage:Lcom/stripe/android/model/StripeIntent$Usage;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/model/PaymentIntent$CaptureMethod;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->captureMethod:Lcom/stripe/android/model/PaymentIntent$CaptureMethod;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->paymentMethodOptionsJsonString:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(JLjava/lang/String;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/PaymentIntent$CaptureMethod;Ljava/lang/String;)Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;
    .locals 8

    const-string v0, "currency"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "captureMethod"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;-><init>(JLjava/lang/String;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/PaymentIntent$CaptureMethod;Ljava/lang/String;)V

    return-object v1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;

    iget-wide v3, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->amount:J

    iget-wide v5, p1, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->amount:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->currency:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->currency:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->setupFutureUsage:Lcom/stripe/android/model/StripeIntent$Usage;

    iget-object v3, p1, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->setupFutureUsage:Lcom/stripe/android/model/StripeIntent$Usage;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->captureMethod:Lcom/stripe/android/model/PaymentIntent$CaptureMethod;

    iget-object v3, p1, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->captureMethod:Lcom/stripe/android/model/PaymentIntent$CaptureMethod;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->paymentMethodOptionsJsonString:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->paymentMethodOptionsJsonString:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAmount()J
    .locals 2

    .line 27
    iget-wide v0, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->amount:J

    return-wide v0
.end method

.method public final getCaptureMethod()Lcom/stripe/android/model/PaymentIntent$CaptureMethod;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->captureMethod:Lcom/stripe/android/model/PaymentIntent$CaptureMethod;

    return-object v0
.end method

.method public getCode()Ljava/lang/String;
    .locals 1

    .line 33
    const-string v0, "payment"

    return-object v0
.end method

.method public getCurrency()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final getPaymentMethodOptionsJsonString()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->paymentMethodOptionsJsonString:Ljava/lang/String;

    return-object v0
.end method

.method public getSetupFutureUsage()Lcom/stripe/android/model/StripeIntent$Usage;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->setupFutureUsage:Lcom/stripe/android/model/StripeIntent$Usage;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->amount:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->currency:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->setupFutureUsage:Lcom/stripe/android/model/StripeIntent$Usage;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/model/StripeIntent$Usage;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->captureMethod:Lcom/stripe/android/model/PaymentIntent$CaptureMethod;

    invoke-virtual {v1}, Lcom/stripe/android/model/PaymentIntent$CaptureMethod;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->paymentMethodOptionsJsonString:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-wide v0, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->amount:J

    iget-object v2, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->currency:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->setupFutureUsage:Lcom/stripe/android/model/StripeIntent$Usage;

    iget-object v4, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->captureMethod:Lcom/stripe/android/model/PaymentIntent$CaptureMethod;

    iget-object v5, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->paymentMethodOptionsJsonString:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Payment(amount="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", currency="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", setupFutureUsage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", captureMethod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", paymentMethodOptionsJsonString="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->amount:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object p2, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->currency:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->setupFutureUsage:Lcom/stripe/android/model/StripeIntent$Usage;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Lcom/stripe/android/model/StripeIntent$Usage;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_0
    iget-object p2, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->captureMethod:Lcom/stripe/android/model/PaymentIntent$CaptureMethod;

    invoke-virtual {p2}, Lcom/stripe/android/model/PaymentIntent$CaptureMethod;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->paymentMethodOptionsJsonString:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
