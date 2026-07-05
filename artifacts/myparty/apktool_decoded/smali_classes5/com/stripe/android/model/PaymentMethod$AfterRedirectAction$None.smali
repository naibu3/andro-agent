.class public final Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$None;
.super Ljava/lang/Object;
.source "PaymentMethod.kt"

# interfaces
.implements Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "None"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c7\n\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u000e\u001a\u00020\nJ\u0013\u0010\u000f\u001a\u00020\u00052\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096D\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0006\u0010\u0003\u001a\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\t\u001a\u00020\nX\u0096D\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u000b\u0010\u0003\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$None;",
        "Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;",
        "<init>",
        "()V",
        "shouldRefresh",
        "",
        "getShouldRefresh$annotations",
        "getShouldRefresh",
        "()Z",
        "retryCount",
        "",
        "getRetryCount$annotations",
        "getRetryCount",
        "()I",
        "describeContents",
        "equals",
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
            "Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$None;",
            ">;"
        }
    .end annotation
.end field

.field public static final INSTANCE:Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$None;

.field private static final retryCount:I

.field private static final shouldRefresh:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$None;

    invoke-direct {v0}, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$None;-><init>()V

    sput-object v0, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$None;->INSTANCE:Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$None;

    const/4 v0, 0x5

    .line 572
    sput v0, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$None;->retryCount:I

    new-instance v0, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$None$Creator;

    invoke-direct {v0}, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$None$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$None;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$None;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 566
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic getRetryCount$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getShouldRefresh$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$None;

    if-nez v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$None;

    return v0
.end method

.method public getRetryCount()I
    .locals 1

    .line 571
    sget v0, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$None;->retryCount:I

    return v0
.end method

.method public getShouldRefresh()Z
    .locals 1

    .line 568
    sget-boolean v0, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$None;->shouldRefresh:Z

    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x67032789

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "None"

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
