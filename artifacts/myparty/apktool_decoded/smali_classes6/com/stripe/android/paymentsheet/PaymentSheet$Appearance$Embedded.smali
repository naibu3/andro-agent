.class public final Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;
.super Ljava/lang/Object;
.source "PaymentSheet.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Embedded"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Builder;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Companion;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0003\u001a\u001b\u001cB/\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\t\u0010\nB\u0011\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\t\u0010\u000bJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0008\u001a\u0004\u0018\u00010\u0007X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0011\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;",
        "Landroid/os/Parcelable;",
        "style",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;",
        "paymentMethodIconMargins",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;",
        "titleFont",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;",
        "subtitleFont",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;)V",
        "(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;)V",
        "getStyle$paymentsheet_release",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;",
        "getPaymentMethodIconMargins$paymentsheet_release",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;",
        "getTitleFont$paymentsheet_release",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;",
        "getSubtitleFont$paymentsheet_release",
        "describeContents",
        "",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
        "Companion",
        "RowStyle",
        "Builder",
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
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Companion;

.field private static final default:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;


# instance fields
.field private final paymentMethodIconMargins:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

.field private final style:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;

.field private final subtitleFont:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

.field private final titleFont:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Companion;

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Creator;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1345
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;

    .line 1346
    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithRadio;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithRadio$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithRadio$Companion;->getDefault()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithRadio;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;

    .line 1345
    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->default:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1337
    invoke-direct {p0, p1, v0, v0, v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1328
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1329
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->style:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;

    .line 1330
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->paymentMethodIconMargins:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    .line 1331
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->titleFont:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

    .line 1332
    iput-object p4, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->subtitleFont:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

    return-void
.end method

.method public static final synthetic access$getDefault$cp()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;
    .locals 1

    .line 1325
    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->default:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;

    return-object v0
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
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->style:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->style:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->paymentMethodIconMargins:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->paymentMethodIconMargins:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->titleFont:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->titleFont:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->subtitleFont:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->subtitleFont:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getPaymentMethodIconMargins$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;
    .locals 1

    .line 1330
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->paymentMethodIconMargins:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    return-object v0
.end method

.method public final getStyle$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;
    .locals 1

    .line 1329
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->style:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;

    return-object v0
.end method

.method public final getSubtitleFont$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;
    .locals 1

    .line 1332
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->subtitleFont:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

    return-object v0
.end method

.method public final getTitleFont$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;
    .locals 1

    .line 1331
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->titleFont:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->style:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->paymentMethodIconMargins:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->titleFont:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->subtitleFont:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->style:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->paymentMethodIconMargins:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->titleFont:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->subtitleFont:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Embedded(style="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", paymentMethodIconMargins="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", titleFont="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", subtitleFont="

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
    .locals 3

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->style:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->paymentMethodIconMargins:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->titleFont:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->subtitleFont:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

    if-nez v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
