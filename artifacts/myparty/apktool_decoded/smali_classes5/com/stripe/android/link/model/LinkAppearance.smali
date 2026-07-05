.class public final Lcom/stripe/android/link/model/LinkAppearance;
.super Ljava/lang/Object;
.source "LinkAppearance.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/model/LinkAppearance$ColorParceler;,
        Lcom/stripe/android/link/model/LinkAppearance$Colors;,
        Lcom/stripe/android/link/model/LinkAppearance$PrimaryButton;,
        Lcom/stripe/android/link/model/LinkAppearance$Style;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001:\u0004\u0019\u001a\u001b\u001cB-\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/link/model/LinkAppearance;",
        "Landroid/os/Parcelable;",
        "lightColors",
        "Lcom/stripe/android/link/model/LinkAppearance$Colors;",
        "darkColors",
        "style",
        "Lcom/stripe/android/link/model/LinkAppearance$Style;",
        "primaryButton",
        "Lcom/stripe/android/link/model/LinkAppearance$PrimaryButton;",
        "<init>",
        "(Lcom/stripe/android/link/model/LinkAppearance$Colors;Lcom/stripe/android/link/model/LinkAppearance$Colors;Lcom/stripe/android/link/model/LinkAppearance$Style;Lcom/stripe/android/link/model/LinkAppearance$PrimaryButton;)V",
        "getLightColors",
        "()Lcom/stripe/android/link/model/LinkAppearance$Colors;",
        "getDarkColors",
        "getStyle",
        "()Lcom/stripe/android/link/model/LinkAppearance$Style;",
        "getPrimaryButton",
        "()Lcom/stripe/android/link/model/LinkAppearance$PrimaryButton;",
        "describeContents",
        "",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
        "Colors",
        "Style",
        "PrimaryButton",
        "ColorParceler",
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
            "Lcom/stripe/android/link/model/LinkAppearance;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final darkColors:Lcom/stripe/android/link/model/LinkAppearance$Colors;

.field private final lightColors:Lcom/stripe/android/link/model/LinkAppearance$Colors;

.field private final primaryButton:Lcom/stripe/android/link/model/LinkAppearance$PrimaryButton;

.field private final style:Lcom/stripe/android/link/model/LinkAppearance$Style;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/model/LinkAppearance$Creator;

    invoke-direct {v0}, Lcom/stripe/android/link/model/LinkAppearance$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/link/model/LinkAppearance;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/model/LinkAppearance$Colors;Lcom/stripe/android/link/model/LinkAppearance$Colors;Lcom/stripe/android/link/model/LinkAppearance$Style;Lcom/stripe/android/link/model/LinkAppearance$PrimaryButton;)V
    .locals 1

    const-string v0, "lightColors"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "darkColors"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryButton"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/stripe/android/link/model/LinkAppearance;->lightColors:Lcom/stripe/android/link/model/LinkAppearance$Colors;

    .line 25
    iput-object p2, p0, Lcom/stripe/android/link/model/LinkAppearance;->darkColors:Lcom/stripe/android/link/model/LinkAppearance$Colors;

    .line 26
    iput-object p3, p0, Lcom/stripe/android/link/model/LinkAppearance;->style:Lcom/stripe/android/link/model/LinkAppearance$Style;

    .line 27
    iput-object p4, p0, Lcom/stripe/android/link/model/LinkAppearance;->primaryButton:Lcom/stripe/android/link/model/LinkAppearance$PrimaryButton;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/link/model/LinkAppearance$Colors;Lcom/stripe/android/link/model/LinkAppearance$Colors;Lcom/stripe/android/link/model/LinkAppearance$Style;Lcom/stripe/android/link/model/LinkAppearance$PrimaryButton;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 24
    sget-object p1, Lcom/stripe/android/link/model/LinkAppearance$Colors;->Companion:Lcom/stripe/android/link/model/LinkAppearance$Colors$Companion;

    const/4 p6, 0x0

    invoke-virtual {p1, p6}, Lcom/stripe/android/link/model/LinkAppearance$Colors$Companion;->default(Z)Lcom/stripe/android/link/model/LinkAppearance$Colors;

    move-result-object p1

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    .line 25
    sget-object p2, Lcom/stripe/android/link/model/LinkAppearance$Colors;->Companion:Lcom/stripe/android/link/model/LinkAppearance$Colors$Companion;

    const/4 p6, 0x1

    invoke-virtual {p2, p6}, Lcom/stripe/android/link/model/LinkAppearance$Colors$Companion;->default(Z)Lcom/stripe/android/link/model/LinkAppearance$Colors;

    move-result-object p2

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 27
    new-instance p4, Lcom/stripe/android/link/model/LinkAppearance$PrimaryButton;

    const/4 p5, 0x3

    const/4 p6, 0x0

    invoke-direct {p4, p6, p6, p5, p6}, Lcom/stripe/android/link/model/LinkAppearance$PrimaryButton;-><init>(Ljava/lang/Float;Ljava/lang/Float;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 23
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/link/model/LinkAppearance;-><init>(Lcom/stripe/android/link/model/LinkAppearance$Colors;Lcom/stripe/android/link/model/LinkAppearance$Colors;Lcom/stripe/android/link/model/LinkAppearance$Style;Lcom/stripe/android/link/model/LinkAppearance$PrimaryButton;)V

    return-void
.end method


# virtual methods
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
    instance-of v1, p1, Lcom/stripe/android/link/model/LinkAppearance;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/link/model/LinkAppearance;

    iget-object v1, p0, Lcom/stripe/android/link/model/LinkAppearance;->lightColors:Lcom/stripe/android/link/model/LinkAppearance$Colors;

    iget-object v3, p1, Lcom/stripe/android/link/model/LinkAppearance;->lightColors:Lcom/stripe/android/link/model/LinkAppearance$Colors;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/link/model/LinkAppearance;->darkColors:Lcom/stripe/android/link/model/LinkAppearance$Colors;

    iget-object v3, p1, Lcom/stripe/android/link/model/LinkAppearance;->darkColors:Lcom/stripe/android/link/model/LinkAppearance$Colors;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/link/model/LinkAppearance;->style:Lcom/stripe/android/link/model/LinkAppearance$Style;

    iget-object v3, p1, Lcom/stripe/android/link/model/LinkAppearance;->style:Lcom/stripe/android/link/model/LinkAppearance$Style;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/link/model/LinkAppearance;->primaryButton:Lcom/stripe/android/link/model/LinkAppearance$PrimaryButton;

    iget-object p1, p1, Lcom/stripe/android/link/model/LinkAppearance;->primaryButton:Lcom/stripe/android/link/model/LinkAppearance$PrimaryButton;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getDarkColors()Lcom/stripe/android/link/model/LinkAppearance$Colors;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/stripe/android/link/model/LinkAppearance;->darkColors:Lcom/stripe/android/link/model/LinkAppearance$Colors;

    return-object v0
.end method

.method public final getLightColors()Lcom/stripe/android/link/model/LinkAppearance$Colors;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/stripe/android/link/model/LinkAppearance;->lightColors:Lcom/stripe/android/link/model/LinkAppearance$Colors;

    return-object v0
.end method

.method public final getPrimaryButton()Lcom/stripe/android/link/model/LinkAppearance$PrimaryButton;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/stripe/android/link/model/LinkAppearance;->primaryButton:Lcom/stripe/android/link/model/LinkAppearance$PrimaryButton;

    return-object v0
.end method

.method public final getStyle()Lcom/stripe/android/link/model/LinkAppearance$Style;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/stripe/android/link/model/LinkAppearance;->style:Lcom/stripe/android/link/model/LinkAppearance$Style;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/link/model/LinkAppearance;->lightColors:Lcom/stripe/android/link/model/LinkAppearance$Colors;

    invoke-virtual {v0}, Lcom/stripe/android/link/model/LinkAppearance$Colors;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/model/LinkAppearance;->darkColors:Lcom/stripe/android/link/model/LinkAppearance$Colors;

    invoke-virtual {v1}, Lcom/stripe/android/link/model/LinkAppearance$Colors;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/model/LinkAppearance;->style:Lcom/stripe/android/link/model/LinkAppearance$Style;

    invoke-virtual {v1}, Lcom/stripe/android/link/model/LinkAppearance$Style;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/model/LinkAppearance;->primaryButton:Lcom/stripe/android/link/model/LinkAppearance$PrimaryButton;

    invoke-virtual {v1}, Lcom/stripe/android/link/model/LinkAppearance$PrimaryButton;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/stripe/android/link/model/LinkAppearance;->lightColors:Lcom/stripe/android/link/model/LinkAppearance$Colors;

    iget-object v1, p0, Lcom/stripe/android/link/model/LinkAppearance;->darkColors:Lcom/stripe/android/link/model/LinkAppearance$Colors;

    iget-object v2, p0, Lcom/stripe/android/link/model/LinkAppearance;->style:Lcom/stripe/android/link/model/LinkAppearance$Style;

    iget-object v3, p0, Lcom/stripe/android/link/model/LinkAppearance;->primaryButton:Lcom/stripe/android/link/model/LinkAppearance$PrimaryButton;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "LinkAppearance(lightColors="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", darkColors="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", primaryButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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

    iget-object v0, p0, Lcom/stripe/android/link/model/LinkAppearance;->lightColors:Lcom/stripe/android/link/model/LinkAppearance$Colors;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/link/model/LinkAppearance$Colors;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/link/model/LinkAppearance;->darkColors:Lcom/stripe/android/link/model/LinkAppearance$Colors;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/link/model/LinkAppearance$Colors;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/link/model/LinkAppearance;->style:Lcom/stripe/android/link/model/LinkAppearance$Style;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/link/model/LinkAppearance$Style;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/link/model/LinkAppearance;->primaryButton:Lcom/stripe/android/link/model/LinkAppearance$PrimaryButton;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/link/model/LinkAppearance$PrimaryButton;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
