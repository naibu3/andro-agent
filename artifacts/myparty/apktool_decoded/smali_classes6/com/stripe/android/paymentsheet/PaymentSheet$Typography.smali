.class public final Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;
.super Ljava/lang/Object;
.source "PaymentSheet.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentSheet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Typography"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Companion;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u0000 &2\u00020\u0001:\u0003$%&B%\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tB\u001d\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J.\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0005J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;",
        "Landroid/os/Parcelable;",
        "sizeScaleFactor",
        "",
        "fontResId",
        "",
        "custom",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;",
        "<init>",
        "(FLjava/lang/Integer;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;)V",
        "(FLjava/lang/Integer;)V",
        "getSizeScaleFactor",
        "()F",
        "getFontResId",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getCustom",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;",
        "component1",
        "component2",
        "component3",
        "copy",
        "(FLjava/lang/Integer;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;)Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;",
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
        "Custom",
        "Font",
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
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Companion;

.field private static final default:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;


# instance fields
.field private final custom:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;

.field private final fontResId:Ljava/lang/Integer;

.field private final sizeScaleFactor:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Companion;

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Creator;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2362
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    .line 2363
    sget-object v1, Lcom/stripe/android/uicore/StripeThemeDefaults;->INSTANCE:Lcom/stripe/android/uicore/StripeThemeDefaults;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getTypography()Lcom/stripe/android/uicore/StripeTypography;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeTypography;->getFontSizeMultiplier()F

    move-result v1

    .line 2364
    sget-object v2, Lcom/stripe/android/uicore/StripeThemeDefaults;->INSTANCE:Lcom/stripe/android/uicore/StripeThemeDefaults;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getTypography()Lcom/stripe/android/uicore/StripeTypography;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/StripeTypography;->getFontFamily()Ljava/lang/Integer;

    move-result-object v2

    .line 2362
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;-><init>(FLjava/lang/Integer;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->default:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    return-void
.end method

.method public constructor <init>(FLjava/lang/Integer;)V
    .locals 3

    .line 2325
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2322
    invoke-direct {p0, p1, p2, v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;-><init>(FLjava/lang/Integer;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;)V

    return-void
.end method

.method public constructor <init>(FLjava/lang/Integer;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;)V
    .locals 1

    const-string v0, "custom"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2291
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2296
    iput p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->sizeScaleFactor:F

    .line 2301
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->fontResId:Ljava/lang/Integer;

    .line 2308
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->custom:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;

    return-void
.end method

.method public static final synthetic access$getDefault$cp()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;
    .locals 1

    .line 2290
    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->default:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;FLjava/lang/Integer;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->sizeScaleFactor:F

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->fontResId:Ljava/lang/Integer;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->custom:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->copy(FLjava/lang/Integer;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;)Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->sizeScaleFactor:F

    return v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->fontResId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->custom:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;

    return-object v0
.end method

.method public final copy(FLjava/lang/Integer;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;)Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;
    .locals 1

    const-string v0, "custom"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;-><init>(FLjava/lang/Integer;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;)V

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
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->sizeScaleFactor:F

    iget v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->sizeScaleFactor:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->fontResId:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->fontResId:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->custom:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->custom:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCustom()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;
    .locals 1

    .line 2308
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->custom:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;

    return-object v0
.end method

.method public final getFontResId()Ljava/lang/Integer;
    .locals 1

    .line 2301
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->fontResId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getSizeScaleFactor()F
    .locals 1

    .line 2296
    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->sizeScaleFactor:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->sizeScaleFactor:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->fontResId:Ljava/lang/Integer;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->custom:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->sizeScaleFactor:F

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->fontResId:Ljava/lang/Integer;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->custom:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Typography(sizeScaleFactor="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", fontResId="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", custom="

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

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->sizeScaleFactor:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->fontResId:Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->custom:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
