.class public final Lcom/stripe/android/customersheet/CustomerSheetContract$Args;
.super Ljava/lang/Object;
.source "CustomerSheetContract.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/CustomerSheetContract;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Args"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/CustomerSheetContract$Args$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0081\u0008\u0018\u0000 #2\u00020\u0001:\u0001#B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ.\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0007J\u0013\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006$"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerSheetContract$Args;",
        "Landroid/os/Parcelable;",
        "integrationType",
        "Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;",
        "configuration",
        "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
        "statusBarColor",
        "",
        "<init>",
        "(Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Ljava/lang/Integer;)V",
        "getIntegrationType",
        "()Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;",
        "getConfiguration",
        "()Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
        "getStatusBarColor",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "component1",
        "component2",
        "component3",
        "copy",
        "(Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Ljava/lang/Integer;)Lcom/stripe/android/customersheet/CustomerSheetContract$Args;",
        "describeContents",
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
            "Lcom/stripe/android/customersheet/CustomerSheetContract$Args;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/customersheet/CustomerSheetContract$Args$Companion;


# instance fields
.field private final configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

.field private final integrationType:Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;

.field private final statusBarColor:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/customersheet/CustomerSheetContract$Args$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->Companion:Lcom/stripe/android/customersheet/CustomerSheetContract$Args$Companion;

    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args$Creator;

    invoke-direct {v0}, Lcom/stripe/android/customersheet/CustomerSheetContract$Args$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "integrationType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->integrationType:Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;

    .line 27
    iput-object p2, p0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    .line 28
    iput-object p3, p0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->statusBarColor:Ljava/lang/Integer;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/customersheet/CustomerSheetContract$Args;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/stripe/android/customersheet/CustomerSheetContract$Args;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->integrationType:Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->statusBarColor:Ljava/lang/Integer;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->copy(Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Ljava/lang/Integer;)Lcom/stripe/android/customersheet/CustomerSheetContract$Args;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->integrationType:Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/customersheet/CustomerSheet$Configuration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->statusBarColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Ljava/lang/Integer;)Lcom/stripe/android/customersheet/CustomerSheetContract$Args;
    .locals 1

    const-string v0, "integrationType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;-><init>(Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Ljava/lang/Integer;)V

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
    instance-of v1, p1, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->integrationType:Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;

    iget-object v3, p1, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->integrationType:Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    iget-object v3, p1, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->statusBarColor:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->statusBarColor:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getConfiguration()Lcom/stripe/android/customersheet/CustomerSheet$Configuration;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    return-object v0
.end method

.method public final getIntegrationType()Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->integrationType:Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;

    return-object v0
.end method

.method public final getStatusBarColor()Ljava/lang/Integer;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->statusBarColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->integrationType:Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->statusBarColor:Ljava/lang/Integer;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->integrationType:Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    iget-object v2, p0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->statusBarColor:Ljava/lang/Integer;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Args(integrationType="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", configuration="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", statusBarColor="

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

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->integrationType:Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->statusBarColor:Ljava/lang/Integer;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_0
.end method
