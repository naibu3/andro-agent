.class public final Lcom/stripe/android/model/AccountParams;
.super Lcom/stripe/android/model/TokenParams;
.source "AccountParams.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/AccountParams$BusinessType;,
        Lcom/stripe/android/model/AccountParams$BusinessTypeParams;,
        Lcom/stripe/android/model/AccountParams$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u0000 \u001f2\u00020\u0001:\u0003\u001d\u001e\u001fB\u001d\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003H\u00c2\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c2\u0003J$\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c0\u0001\u00a2\u0006\u0002\u0008\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\nH\u00d6\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006 "
    }
    d2 = {
        "Lcom/stripe/android/model/AccountParams;",
        "Lcom/stripe/android/model/TokenParams;",
        "tosShownAndAccepted",
        "",
        "businessTypeParams",
        "Lcom/stripe/android/model/AccountParams$BusinessTypeParams;",
        "<init>",
        "(ZLcom/stripe/android/model/AccountParams$BusinessTypeParams;)V",
        "typeDataParams",
        "",
        "",
        "",
        "getTypeDataParams",
        "()Ljava/util/Map;",
        "component1",
        "component2",
        "copy",
        "copy$payments_core_release",
        "describeContents",
        "",
        "equals",
        "other",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
        "BusinessType",
        "BusinessTypeParams",
        "Companion",
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
            "Lcom/stripe/android/model/AccountParams;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/model/AccountParams$Companion;

.field private static final PARAM_BUSINESS_TYPE:Ljava/lang/String; = "business_type"

.field private static final PARAM_TOS_SHOWN_AND_ACCEPTED:Ljava/lang/String; = "tos_shown_and_accepted"


# instance fields
.field private final businessTypeParams:Lcom/stripe/android/model/AccountParams$BusinessTypeParams;

.field private final tosShownAndAccepted:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/model/AccountParams$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/model/AccountParams$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/AccountParams;->Companion:Lcom/stripe/android/model/AccountParams$Companion;

    new-instance v0, Lcom/stripe/android/model/AccountParams$Creator;

    invoke-direct {v0}, Lcom/stripe/android/model/AccountParams$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/model/AccountParams;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/model/AccountParams;->$stable:I

    return-void
.end method

.method public constructor <init>(ZLcom/stripe/android/model/AccountParams$BusinessTypeParams;)V
    .locals 3

    .line 25
    sget-object v0, Lcom/stripe/android/model/Token$Type;->Account:Lcom/stripe/android/model/Token$Type;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {p0, v0, v1, v2, v1}, Lcom/stripe/android/model/TokenParams;-><init>(Lcom/stripe/android/model/Token$Type;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 22
    iput-boolean p1, p0, Lcom/stripe/android/model/AccountParams;->tosShownAndAccepted:Z

    .line 24
    iput-object p2, p0, Lcom/stripe/android/model/AccountParams;->businessTypeParams:Lcom/stripe/android/model/AccountParams$BusinessTypeParams;

    return-void
.end method

.method public synthetic constructor <init>(ZLcom/stripe/android/model/AccountParams$BusinessTypeParams;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 14
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/model/AccountParams;-><init>(ZLcom/stripe/android/model/AccountParams$BusinessTypeParams;)V

    return-void
.end method

.method private final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/model/AccountParams;->tosShownAndAccepted:Z

    return v0
.end method

.method private final component2()Lcom/stripe/android/model/AccountParams$BusinessTypeParams;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/AccountParams;->businessTypeParams:Lcom/stripe/android/model/AccountParams$BusinessTypeParams;

    return-object v0
.end method

.method public static synthetic copy$payments_core_release$default(Lcom/stripe/android/model/AccountParams;ZLcom/stripe/android/model/AccountParams$BusinessTypeParams;ILjava/lang/Object;)Lcom/stripe/android/model/AccountParams;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-boolean p1, p0, Lcom/stripe/android/model/AccountParams;->tosShownAndAccepted:Z

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/model/AccountParams;->businessTypeParams:Lcom/stripe/android/model/AccountParams$BusinessTypeParams;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/model/AccountParams;->copy$payments_core_release(ZLcom/stripe/android/model/AccountParams$BusinessTypeParams;)Lcom/stripe/android/model/AccountParams;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Z)Lcom/stripe/android/model/AccountParams;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/model/AccountParams;->Companion:Lcom/stripe/android/model/AccountParams$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/model/AccountParams$Companion;->create(Z)Lcom/stripe/android/model/AccountParams;

    move-result-object p0

    return-object p0
.end method

.method public static final create(ZLcom/stripe/android/model/AccountParams$BusinessType;)Lcom/stripe/android/model/AccountParams;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/model/AccountParams;->Companion:Lcom/stripe/android/model/AccountParams$Companion;

    invoke-virtual {v0, p0, p1}, Lcom/stripe/android/model/AccountParams$Companion;->create(ZLcom/stripe/android/model/AccountParams$BusinessType;)Lcom/stripe/android/model/AccountParams;

    move-result-object p0

    return-object p0
.end method

.method public static final create(ZLcom/stripe/android/model/AccountParams$BusinessTypeParams$Company;)Lcom/stripe/android/model/AccountParams;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/model/AccountParams;->Companion:Lcom/stripe/android/model/AccountParams$Companion;

    invoke-virtual {v0, p0, p1}, Lcom/stripe/android/model/AccountParams$Companion;->create(ZLcom/stripe/android/model/AccountParams$BusinessTypeParams$Company;)Lcom/stripe/android/model/AccountParams;

    move-result-object p0

    return-object p0
.end method

.method public static final create(ZLcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual;)Lcom/stripe/android/model/AccountParams;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/model/AccountParams;->Companion:Lcom/stripe/android/model/AccountParams$Companion;

    invoke-virtual {v0, p0, p1}, Lcom/stripe/android/model/AccountParams$Companion;->create(ZLcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual;)Lcom/stripe/android/model/AccountParams;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy$payments_core_release(ZLcom/stripe/android/model/AccountParams$BusinessTypeParams;)Lcom/stripe/android/model/AccountParams;
    .locals 1

    new-instance v0, Lcom/stripe/android/model/AccountParams;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/model/AccountParams;-><init>(ZLcom/stripe/android/model/AccountParams$BusinessTypeParams;)V

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
    instance-of v1, p1, Lcom/stripe/android/model/AccountParams;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/AccountParams;

    iget-boolean v1, p0, Lcom/stripe/android/model/AccountParams;->tosShownAndAccepted:Z

    iget-boolean v3, p1, Lcom/stripe/android/model/AccountParams;->tosShownAndAccepted:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/model/AccountParams;->businessTypeParams:Lcom/stripe/android/model/AccountParams$BusinessTypeParams;

    iget-object p1, p1, Lcom/stripe/android/model/AccountParams;->businessTypeParams:Lcom/stripe/android/model/AccountParams$BusinessTypeParams;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public getTypeDataParams()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 27
    iget-boolean v0, p0, Lcom/stripe/android/model/AccountParams;->tosShownAndAccepted:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "tos_shown_and_accepted"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 29
    iget-object v1, p0, Lcom/stripe/android/model/AccountParams;->businessTypeParams:Lcom/stripe/android/model/AccountParams$BusinessTypeParams;

    if-eqz v1, :cond_0

    const/4 v2, 0x2

    .line 31
    new-array v2, v2, [Lkotlin/Pair;

    invoke-virtual {v1}, Lcom/stripe/android/model/AccountParams$BusinessTypeParams;->getType$payments_core_release()Lcom/stripe/android/model/AccountParams$BusinessType;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/model/AccountParams$BusinessType;->getCode()Ljava/lang/String;

    move-result-object v3

    const-string v4, "business_type"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 32
    invoke-virtual {v1}, Lcom/stripe/android/model/AccountParams$BusinessTypeParams;->getType$payments_core_release()Lcom/stripe/android/model/AccountParams$BusinessType;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/model/AccountParams$BusinessType;->getCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/stripe/android/model/AccountParams$BusinessTypeParams;->toParamMap()Ljava/util/Map;

    move-result-object v1

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v2, v3

    .line 30
    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    .line 34
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    .line 28
    :cond_1
    invoke-static {v0, v1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/stripe/android/model/AccountParams;->tosShownAndAccepted:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/AccountParams;->businessTypeParams:Lcom/stripe/android/model/AccountParams$BusinessTypeParams;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/model/AccountParams$BusinessTypeParams;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-boolean v0, p0, Lcom/stripe/android/model/AccountParams;->tosShownAndAccepted:Z

    iget-object v1, p0, Lcom/stripe/android/model/AccountParams;->businessTypeParams:Lcom/stripe/android/model/AccountParams$BusinessTypeParams;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "AccountParams(tosShownAndAccepted="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", businessTypeParams="

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

    iget-boolean v0, p0, Lcom/stripe/android/model/AccountParams;->tosShownAndAccepted:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/model/AccountParams;->businessTypeParams:Lcom/stripe/android/model/AccountParams$BusinessTypeParams;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
