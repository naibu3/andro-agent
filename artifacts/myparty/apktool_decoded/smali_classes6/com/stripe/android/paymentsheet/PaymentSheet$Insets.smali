.class public final Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;
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
    name = "Insets"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/PaymentSheet$Insets$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008B9\u0008\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0001\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u000c\u0012\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0007\u0010\u0010B\u0019\u0008\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0013B%\u0008\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0001\u0010\u0014\u001a\u00020\u000c\u0012\u0008\u0008\u0001\u0010\u0015\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0007\u0010\u0016J\u0006\u0010\u001c\u001a\u00020\u000cJ\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0018\u00a8\u0006#"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;",
        "Landroid/os/Parcelable;",
        "startDp",
        "",
        "topDp",
        "endDp",
        "bottomDp",
        "<init>",
        "(FFFF)V",
        "context",
        "Landroid/content/Context;",
        "startRes",
        "",
        "topRes",
        "endRes",
        "bottomRes",
        "(Landroid/content/Context;IIII)V",
        "horizontalDp",
        "verticalDp",
        "(FF)V",
        "horizontalRes",
        "verticalRes",
        "(Landroid/content/Context;II)V",
        "getStartDp",
        "()F",
        "getTopDp",
        "getEndDp",
        "getBottomDp",
        "describeContents",
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
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets$Companion;

.field private static final defaultFormInsetValues:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

.field private static final defaultTextFieldInsets:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;


# instance fields
.field private final bottomDp:F

.field private final endDp:F

.field private final startDp:F

.field private final topDp:F


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets$Companion;

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets$Creator;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->$stable:I

    .line 2621
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    const/4 v1, 0x0

    const/high16 v2, 0x42200000    # 40.0f

    const/high16 v3, 0x41a00000    # 20.0f

    invoke-direct {v0, v3, v1, v3, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;-><init>(FFFF)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->defaultFormInsetValues:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    .line 2628
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    .line 2629
    sget-object v1, Lcom/stripe/android/uicore/StripeThemeDefaults;->INSTANCE:Lcom/stripe/android/uicore/StripeThemeDefaults;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getTextFieldInsets()Lcom/stripe/android/uicore/FormInsets;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/FormInsets;->getStart()F

    move-result v1

    .line 2630
    sget-object v2, Lcom/stripe/android/uicore/StripeThemeDefaults;->INSTANCE:Lcom/stripe/android/uicore/StripeThemeDefaults;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getTextFieldInsets()Lcom/stripe/android/uicore/FormInsets;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/FormInsets;->getTop()F

    move-result v2

    .line 2631
    sget-object v3, Lcom/stripe/android/uicore/StripeThemeDefaults;->INSTANCE:Lcom/stripe/android/uicore/StripeThemeDefaults;

    invoke-virtual {v3}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getTextFieldInsets()Lcom/stripe/android/uicore/FormInsets;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/uicore/FormInsets;->getEnd()F

    move-result v3

    .line 2632
    sget-object v4, Lcom/stripe/android/uicore/StripeThemeDefaults;->INSTANCE:Lcom/stripe/android/uicore/StripeThemeDefaults;

    invoke-virtual {v4}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getTextFieldInsets()Lcom/stripe/android/uicore/FormInsets;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/uicore/FormInsets;->getBottom()F

    move-result v4

    .line 2628
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;-><init>(FFFF)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->defaultTextFieldInsets:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    return-void
.end method

.method public constructor <init>(FF)V
    .locals 0

    .line 2602
    invoke-direct {p0, p1, p2, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;-><init>(FFFF)V

    return-void
.end method

.method public constructor <init>(FFFF)V
    .locals 0

    .line 2580
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2581
    iput p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->startDp:F

    .line 2582
    iput p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->topDp:F

    .line 2583
    iput p3, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->endDp:F

    .line 2584
    iput p4, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->bottomDp:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;II)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2614
    invoke-static {p1, p2}, Lcom/stripe/android/uicore/StripeThemeKt;->getRawValueFromDimenResource(Landroid/content/Context;I)F

    move-result v0

    .line 2615
    invoke-static {p1, p3}, Lcom/stripe/android/uicore/StripeThemeKt;->getRawValueFromDimenResource(Landroid/content/Context;I)F

    move-result v1

    .line 2616
    invoke-static {p1, p2}, Lcom/stripe/android/uicore/StripeThemeKt;->getRawValueFromDimenResource(Landroid/content/Context;I)F

    move-result p2

    .line 2617
    invoke-static {p1, p3}, Lcom/stripe/android/uicore/StripeThemeKt;->getRawValueFromDimenResource(Landroid/content/Context;I)F

    move-result p1

    .line 2613
    invoke-direct {p0, v0, v1, p2, p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;-><init>(FFFF)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;IIII)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2593
    invoke-static {p1, p2}, Lcom/stripe/android/uicore/StripeThemeKt;->getRawValueFromDimenResource(Landroid/content/Context;I)F

    move-result p2

    .line 2594
    invoke-static {p1, p3}, Lcom/stripe/android/uicore/StripeThemeKt;->getRawValueFromDimenResource(Landroid/content/Context;I)F

    move-result p3

    .line 2595
    invoke-static {p1, p4}, Lcom/stripe/android/uicore/StripeThemeKt;->getRawValueFromDimenResource(Landroid/content/Context;I)F

    move-result p4

    .line 2596
    invoke-static {p1, p5}, Lcom/stripe/android/uicore/StripeThemeKt;->getRawValueFromDimenResource(Landroid/content/Context;I)F

    move-result p1

    .line 2592
    invoke-direct {p0, p2, p3, p4, p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;-><init>(FFFF)V

    return-void
.end method

.method public static final synthetic access$getDefaultFormInsetValues$cp()Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;
    .locals 1

    .line 2578
    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->defaultFormInsetValues:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    return-object v0
.end method

.method public static final synthetic access$getDefaultTextFieldInsets$cp()Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;
    .locals 1

    .line 2578
    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->defaultTextFieldInsets:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

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
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->startDp:F

    iget v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->startDp:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->topDp:F

    iget v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->topDp:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->endDp:F

    iget v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->endDp:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->bottomDp:F

    iget p1, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->bottomDp:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBottomDp()F
    .locals 1

    .line 2584
    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->bottomDp:F

    return v0
.end method

.method public final getEndDp()F
    .locals 1

    .line 2583
    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->endDp:F

    return v0
.end method

.method public final getStartDp()F
    .locals 1

    .line 2581
    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->startDp:F

    return v0
.end method

.method public final getTopDp()F
    .locals 1

    .line 2582
    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->topDp:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->startDp:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->topDp:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->endDp:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->bottomDp:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->startDp:F

    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->topDp:F

    iget v2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->endDp:F

    iget v3, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->bottomDp:F

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Insets(startDp="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", topDp="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endDp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bottomDp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->startDp:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->topDp:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->endDp:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->bottomDp:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    return-void
.end method
