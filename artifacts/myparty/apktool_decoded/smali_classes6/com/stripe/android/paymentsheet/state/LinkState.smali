.class public final Lcom/stripe/android/paymentsheet/state/LinkState;
.super Ljava/lang/Object;
.source "LinkState.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0081\u0008\u0018\u00002\u00020\u0001:\u0001\"B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J)\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006#"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/state/LinkState;",
        "Landroid/os/Parcelable;",
        "configuration",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "loginState",
        "Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;",
        "signupMode",
        "Lcom/stripe/android/link/ui/inline/LinkSignupMode;",
        "<init>",
        "(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;Lcom/stripe/android/link/ui/inline/LinkSignupMode;)V",
        "getConfiguration",
        "()Lcom/stripe/android/link/LinkConfiguration;",
        "getLoginState",
        "()Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;",
        "getSignupMode",
        "()Lcom/stripe/android/link/ui/inline/LinkSignupMode;",
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
        "LoginState",
        "paymentsheet_release"
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
            "Lcom/stripe/android/paymentsheet/state/LinkState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final configuration:Lcom/stripe/android/link/LinkConfiguration;

.field private final loginState:Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

.field private final signupMode:Lcom/stripe/android/link/ui/inline/LinkSignupMode;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/state/LinkState$Creator;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/state/LinkState$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/paymentsheet/state/LinkState;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentsheet/state/LinkState;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;Lcom/stripe/android/link/ui/inline/LinkSignupMode;)V
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loginState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    .line 11
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->loginState:Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    .line 12
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->signupMode:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/state/LinkState;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;Lcom/stripe/android/link/ui/inline/LinkSignupMode;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/state/LinkState;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->loginState:Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->signupMode:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/state/LinkState;->copy(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;Lcom/stripe/android/link/ui/inline/LinkSignupMode;)Lcom/stripe/android/paymentsheet/state/LinkState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/link/LinkConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->loginState:Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/link/ui/inline/LinkSignupMode;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->signupMode:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;Lcom/stripe/android/link/ui/inline/LinkSignupMode;)Lcom/stripe/android/paymentsheet/state/LinkState;
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loginState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/state/LinkState;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/state/LinkState;-><init>(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;Lcom/stripe/android/link/ui/inline/LinkSignupMode;)V

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
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/state/LinkState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/state/LinkState;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/state/LinkState;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->loginState:Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/state/LinkState;->loginState:Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->signupMode:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/state/LinkState;->signupMode:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getConfiguration()Lcom/stripe/android/link/LinkConfiguration;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    return-object v0
.end method

.method public final getLoginState()Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->loginState:Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    return-object v0
.end method

.method public final getSignupMode()Lcom/stripe/android/link/ui/inline/LinkSignupMode;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->signupMode:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkConfiguration;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->loginState:Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->signupMode:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/link/ui/inline/LinkSignupMode;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->loginState:Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->signupMode:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "LinkState(configuration="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", loginState="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", signupMode="

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
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/link/LinkConfiguration;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->loginState:Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->signupMode:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Lcom/stripe/android/link/ui/inline/LinkSignupMode;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
