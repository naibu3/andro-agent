.class public final Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;
.super Ljava/lang/Object;
.source "EmbeddedConfigurationHandler.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ConfigurationCache"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;",
        "Landroid/os/Parcelable;",
        "arguments",
        "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;",
        "resultState",
        "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;",
        "<init>",
        "(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;)V",
        "getArguments",
        "()Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;",
        "getResultState",
        "()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;",
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
        "Companion",
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
            "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache$Companion;

.field public static final KEY:Ljava/lang/String; = "ConfigurationCache"


# instance fields
.field private final arguments:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;

.field private final resultState:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;->Companion:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache$Companion;

    new-instance v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache$Creator;

    invoke-direct {v0}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;)V
    .locals 1

    const-string v0, "arguments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 145
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;->arguments:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;

    .line 146
    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;->resultState:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;ILjava/lang/Object;)Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;->arguments:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;->resultState:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;->copy(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;)Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;->arguments:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;->resultState:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;)Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;
    .locals 1

    const-string v0, "arguments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;-><init>(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;)V

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
    instance-of v1, p1, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;->arguments:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;

    iget-object v3, p1, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;->arguments:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;->resultState:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;

    iget-object p1, p1, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;->resultState:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getArguments()Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;
    .locals 1

    .line 145
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;->arguments:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;

    return-object v0
.end method

.method public final getResultState()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;->resultState:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;->arguments:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;

    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;->resultState:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;->arguments:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;->resultState:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ConfigurationCache(arguments="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", resultState="

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
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;->arguments:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;->resultState:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
