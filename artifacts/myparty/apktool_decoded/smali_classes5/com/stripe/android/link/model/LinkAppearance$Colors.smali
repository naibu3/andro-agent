.class public final Lcom/stripe/android/link/model/LinkAppearance$Colors;
.super Ljava/lang/Object;
.source "LinkAppearance.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/model/LinkAppearance;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Colors"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/model/LinkAppearance$Colors$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\u000cJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000cR\u0013\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\u0008\u0007\u0010\u0008R\u0013\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\u0008\n\u0010\u0008\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/link/model/LinkAppearance$Colors;",
        "Landroid/os/Parcelable;",
        "primary",
        "Landroidx/compose/ui/graphics/Color;",
        "borderSelected",
        "<init>",
        "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getPrimary-0d7_KjU",
        "()J",
        "J",
        "getBorderSelected-0d7_KjU",
        "describeContents",
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
            "Lcom/stripe/android/link/model/LinkAppearance$Colors;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/link/model/LinkAppearance$Colors$Companion;


# instance fields
.field private final borderSelected:J

.field private final primary:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/link/model/LinkAppearance$Colors$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/model/LinkAppearance$Colors$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/model/LinkAppearance$Colors;->Companion:Lcom/stripe/android/link/model/LinkAppearance$Colors$Companion;

    new-instance v0, Lcom/stripe/android/link/model/LinkAppearance$Colors$Creator;

    invoke-direct {v0}, Lcom/stripe/android/link/model/LinkAppearance$Colors$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/link/model/LinkAppearance$Colors;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/link/model/LinkAppearance$Colors;->$stable:I

    return-void
.end method

.method private constructor <init>(JJ)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-wide p1, p0, Lcom/stripe/android/link/model/LinkAppearance$Colors;->primary:J

    .line 41
    iput-wide p3, p0, Lcom/stripe/android/link/model/LinkAppearance$Colors;->borderSelected:J

    return-void
.end method

.method public synthetic constructor <init>(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/link/model/LinkAppearance$Colors;-><init>(JJ)V

    return-void
.end method


# virtual methods
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
    instance-of v1, p1, Lcom/stripe/android/link/model/LinkAppearance$Colors;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/link/model/LinkAppearance$Colors;

    iget-wide v3, p0, Lcom/stripe/android/link/model/LinkAppearance$Colors;->primary:J

    iget-wide v5, p1, Lcom/stripe/android/link/model/LinkAppearance$Colors;->primary:J

    invoke-static {v3, v4, v5, v6}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/stripe/android/link/model/LinkAppearance$Colors;->borderSelected:J

    iget-wide v5, p1, Lcom/stripe/android/link/model/LinkAppearance$Colors;->borderSelected:J

    invoke-static {v3, v4, v5, v6}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getBorderSelected-0d7_KjU()J
    .locals 2

    .line 41
    iget-wide v0, p0, Lcom/stripe/android/link/model/LinkAppearance$Colors;->borderSelected:J

    return-wide v0
.end method

.method public final getPrimary-0d7_KjU()J
    .locals 2

    .line 40
    iget-wide v0, p0, Lcom/stripe/android/link/model/LinkAppearance$Colors;->primary:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/stripe/android/link/model/LinkAppearance$Colors;->primary:J

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/Color;->hashCode-impl(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/stripe/android/link/model/LinkAppearance$Colors;->borderSelected:J

    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/Color;->hashCode-impl(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-wide v0, p0, Lcom/stripe/android/link/model/LinkAppearance$Colors;->primary:J

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/Color;->toString-impl(J)Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Lcom/stripe/android/link/model/LinkAppearance$Colors;->borderSelected:J

    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/Color;->toString-impl(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Colors(primary="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", borderSelected="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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

    sget-object v0, Lcom/stripe/android/link/model/LinkAppearance$ColorParceler;->INSTANCE:Lcom/stripe/android/link/model/LinkAppearance$ColorParceler;

    iget-wide v1, p0, Lcom/stripe/android/link/model/LinkAppearance$Colors;->primary:J

    invoke-virtual {v0, v1, v2, p1, p2}, Lcom/stripe/android/link/model/LinkAppearance$ColorParceler;->write-ek8zF_U(JLandroid/os/Parcel;I)V

    sget-object v0, Lcom/stripe/android/link/model/LinkAppearance$ColorParceler;->INSTANCE:Lcom/stripe/android/link/model/LinkAppearance$ColorParceler;

    iget-wide v1, p0, Lcom/stripe/android/link/model/LinkAppearance$Colors;->borderSelected:J

    invoke-virtual {v0, v1, v2, p1, p2}, Lcom/stripe/android/link/model/LinkAppearance$ColorParceler;->write-ek8zF_U(JLandroid/os/Parcel;I)V

    return-void
.end method
