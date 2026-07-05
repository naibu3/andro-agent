.class public final Lcom/stripe/android/model/ConsumerPaymentDetails$Card;
.super Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;
.source "ConsumerPaymentDetails.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/ConsumerPaymentDetails;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Card"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/ConsumerPaymentDetails$Card$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nConsumerPaymentDetails.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsumerPaymentDetails.kt\ncom/stripe/android/model/ConsumerPaymentDetails$Card\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n1557#2:132\n1628#2,3:133\n774#2:136\n865#2,2:137\n*S KotlinDebug\n*F\n+ 1 ConsumerPaymentDetails.kt\ncom/stripe/android/model/ConsumerPaymentDetails$Card\n*L\n64#1:132\n64#1:133,3\n65#1:136\n65#1:137,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008*\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 F2\u00020\u0001:\u0001FBw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0006H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u000cH\u00c6\u0003J\t\u00105\u001a\u00020\u000cH\u00c6\u0003J\t\u00106\u001a\u00020\u000fH\u00c6\u0003J\u000f\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0011H\u00c6\u0003J\t\u00108\u001a\u00020\u0013H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\u008d\u0001\u0010:\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0003H\u00c6\u0001J\u0006\u0010;\u001a\u00020\u000cJ\u0013\u0010<\u001a\u00020\u00062\u0008\u0010=\u001a\u0004\u0018\u00010>H\u00d6\u0003J\t\u0010?\u001a\u00020\u000cH\u00d6\u0001J\t\u0010@\u001a\u00020\u0003H\u00d6\u0001J\u0016\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u000cR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u001aR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0018R\u0016\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0011\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0017\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\u0018R\u0011\u0010)\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010\u001aR\u0011\u0010+\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010\u001aR\u0017\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010%\u00a8\u0006G"
    }
    d2 = {
        "Lcom/stripe/android/model/ConsumerPaymentDetails$Card;",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "id",
        "",
        "last4",
        "isDefault",
        "",
        "nickname",
        "billingAddress",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;",
        "billingEmailAddress",
        "expiryYear",
        "",
        "expiryMonth",
        "brand",
        "Lcom/stripe/android/model/CardBrand;",
        "networks",
        "",
        "cvcCheck",
        "Lcom/stripe/android/model/CvcCheck;",
        "funding",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;Ljava/lang/String;IILcom/stripe/android/model/CardBrand;Ljava/util/List;Lcom/stripe/android/model/CvcCheck;Ljava/lang/String;)V",
        "getId",
        "()Ljava/lang/String;",
        "getLast4",
        "()Z",
        "getNickname",
        "getBillingAddress",
        "()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;",
        "getBillingEmailAddress",
        "getExpiryYear",
        "()I",
        "getExpiryMonth",
        "getBrand",
        "()Lcom/stripe/android/model/CardBrand;",
        "getNetworks",
        "()Ljava/util/List;",
        "getCvcCheck",
        "()Lcom/stripe/android/model/CvcCheck;",
        "getFunding",
        "requiresCardDetailsRecollection",
        "getRequiresCardDetailsRecollection",
        "isExpired",
        "availableNetworks",
        "getAvailableNetworks",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "copy",
        "describeContents",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
        "Companion",
        "payments-model_release"
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
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$Card;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/model/ConsumerPaymentDetails$Card$Companion;

.field public static final TYPE:Ljava/lang/String; = "card"


# instance fields
.field private final billingAddress:Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

.field private final billingEmailAddress:Ljava/lang/String;

.field private final brand:Lcom/stripe/android/model/CardBrand;

.field private final cvcCheck:Lcom/stripe/android/model/CvcCheck;

.field private final expiryMonth:I

.field private final expiryYear:I

.field private final funding:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final isDefault:Z

.field private final last4:Ljava/lang/String;

.field private final networks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final nickname:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->Companion:Lcom/stripe/android/model/ConsumerPaymentDetails$Card$Companion;

    new-instance v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card$Creator;

    invoke-direct {v0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;Ljava/lang/String;IILcom/stripe/android/model/CardBrand;Ljava/util/List;Lcom/stripe/android/model/CvcCheck;Ljava/lang/String;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;",
            "Ljava/lang/String;",
            "II",
            "Lcom/stripe/android/model/CardBrand;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/model/CvcCheck;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    move-object/from16 v10, p11

    move-object/from16 v11, p12

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "last4"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "brand"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networks"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cvcCheck"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "funding"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    const-string v3, "card"

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    .line 44
    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 32
    iput-object p1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->id:Ljava/lang/String;

    .line 33
    iput-object p2, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->last4:Ljava/lang/String;

    .line 34
    iput-boolean v2, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->isDefault:Z

    .line 35
    iput-object v4, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->nickname:Ljava/lang/String;

    .line 36
    iput-object v5, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->billingAddress:Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    .line 37
    iput-object v6, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->billingEmailAddress:Ljava/lang/String;

    move/from16 v1, p7

    .line 38
    iput v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryYear:I

    move/from16 v1, p8

    .line 39
    iput v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryMonth:I

    .line 40
    iput-object v8, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->brand:Lcom/stripe/android/model/CardBrand;

    .line 41
    iput-object v9, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->networks:Ljava/util/List;

    .line 42
    iput-object v10, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->cvcCheck:Lcom/stripe/android/model/CvcCheck;

    .line 43
    iput-object v11, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->funding:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;Ljava/lang/String;IILcom/stripe/android/model/CardBrand;Ljava/util/List;Lcom/stripe/android/model/CvcCheck;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p14, p13, 0x10

    const/4 v0, 0x0

    if-eqz p14, :cond_0

    move-object p5, v0

    :cond_0
    and-int/lit8 p13, p13, 0x20

    if-eqz p13, :cond_1

    move-object p13, p12

    move-object p12, p11

    move-object p11, p10

    move-object p10, p9

    move p9, p8

    move p8, p7

    move-object p7, v0

    goto :goto_0

    :cond_1
    move-object p13, p12

    move-object p12, p11

    move-object p11, p10

    move-object p10, p9

    move p9, p8

    move p8, p7

    move-object p7, p6

    :goto_0
    move-object p6, p5

    move-object p5, p4

    move p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 31
    invoke-direct/range {p1 .. p13}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;Ljava/lang/String;IILcom/stripe/android/model/CardBrand;Ljava/util/List;Lcom/stripe/android/model/CvcCheck;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/ConsumerPaymentDetails$Card;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;Ljava/lang/String;IILcom/stripe/android/model/CardBrand;Ljava/util/List;Lcom/stripe/android/model/CvcCheck;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/ConsumerPaymentDetails$Card;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->last4:Ljava/lang/String;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-boolean p3, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->isDefault:Z

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->nickname:Ljava/lang/String;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->billingAddress:Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->billingEmailAddress:Ljava/lang/String;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget p7, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryYear:I

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget p8, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryMonth:I

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->brand:Lcom/stripe/android/model/CardBrand;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->networks:Ljava/util/List;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->cvcCheck:Lcom/stripe/android/model/CvcCheck;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->funding:Ljava/lang/String;

    :cond_b
    move-object p13, p11

    move-object p14, p12

    move-object p11, p9

    move-object p12, p10

    move p9, p7

    move p10, p8

    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->copy(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;Ljava/lang/String;IILcom/stripe/android/model/CardBrand;Ljava/util/List;Lcom/stripe/android/model/CvcCheck;Ljava/lang/String;)Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->networks:Ljava/util/List;

    return-object v0
.end method

.method public final component11()Lcom/stripe/android/model/CvcCheck;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->cvcCheck:Lcom/stripe/android/model/CvcCheck;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->funding:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->last4:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->isDefault:Z

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->nickname:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->billingAddress:Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->billingEmailAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryYear:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryMonth:I

    return v0
.end method

.method public final component9()Lcom/stripe/android/model/CardBrand;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->brand:Lcom/stripe/android/model/CardBrand;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;Ljava/lang/String;IILcom/stripe/android/model/CardBrand;Ljava/util/List;Lcom/stripe/android/model/CvcCheck;Ljava/lang/String;)Lcom/stripe/android/model/ConsumerPaymentDetails$Card;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;",
            "Ljava/lang/String;",
            "II",
            "Lcom/stripe/android/model/CardBrand;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/model/CvcCheck;",
            "Ljava/lang/String;",
            ")",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$Card;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "last4"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "brand"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networks"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cvcCheck"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "funding"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    move-object v2, p1

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v1 .. v13}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;Ljava/lang/String;IILcom/stripe/android/model/CardBrand;Ljava/util/List;Lcom/stripe/android/model/CvcCheck;Ljava/lang/String;)V

    return-object v1
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
    instance-of v1, p1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->last4:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->last4:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->isDefault:Z

    iget-boolean v3, p1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->isDefault:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->nickname:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->nickname:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->billingAddress:Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    iget-object v3, p1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->billingAddress:Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->billingEmailAddress:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->billingEmailAddress:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryYear:I

    iget v3, p1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryYear:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryMonth:I

    iget v3, p1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryMonth:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->brand:Lcom/stripe/android/model/CardBrand;

    iget-object v3, p1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->brand:Lcom/stripe/android/model/CardBrand;

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->networks:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->networks:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->cvcCheck:Lcom/stripe/android/model/CvcCheck;

    iget-object v3, p1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->cvcCheck:Lcom/stripe/android/model/CvcCheck;

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->funding:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->funding:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getAvailableNetworks()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/CardBrand;",
            ">;"
        }
    .end annotation

    .line 63
    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->networks:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 132
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 133
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 134
    check-cast v2, Ljava/lang/String;

    .line 64
    sget-object v3, Lcom/stripe/android/model/CardBrand;->Companion:Lcom/stripe/android/model/CardBrand$Companion;

    invoke-virtual {v3, v2}, Lcom/stripe/android/model/CardBrand$Companion;->fromCode(Ljava/lang/String;)Lcom/stripe/android/model/CardBrand;

    move-result-object v2

    .line 134
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 135
    :cond_0
    check-cast v1, Ljava/util/List;

    .line 132
    check-cast v1, Ljava/lang/Iterable;

    .line 136
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 137
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/model/CardBrand;

    .line 65
    sget-object v4, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    if-eq v3, v4, :cond_1

    .line 137
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 138
    :cond_2
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getBillingAddress()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->billingAddress:Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    return-object v0
.end method

.method public getBillingEmailAddress()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->billingEmailAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final getBrand()Lcom/stripe/android/model/CardBrand;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->brand:Lcom/stripe/android/model/CardBrand;

    return-object v0
.end method

.method public final getCvcCheck()Lcom/stripe/android/model/CvcCheck;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->cvcCheck:Lcom/stripe/android/model/CvcCheck;

    return-object v0
.end method

.method public final getExpiryMonth()I
    .locals 1

    .line 39
    iget v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryMonth:I

    return v0
.end method

.method public final getExpiryYear()I
    .locals 1

    .line 38
    iget v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryYear:I

    return v0
.end method

.method public final getFunding()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->funding:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getLast4()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->last4:Ljava/lang/String;

    return-object v0
.end method

.method public final getNetworks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 41
    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->networks:Ljava/util/List;

    return-object v0
.end method

.method public getNickname()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->nickname:Ljava/lang/String;

    return-object v0
.end method

.method public final getRequiresCardDetailsRecollection()Z
    .locals 1

    .line 54
    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->isExpired()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->cvcCheck:Lcom/stripe/android/model/CvcCheck;

    invoke-virtual {v0}, Lcom/stripe/android/model/CvcCheck;->getRequiresRecollection()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->last4:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->isDefault:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->nickname:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->billingAddress:Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->billingEmailAddress:Ljava/lang/String;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryYear:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryMonth:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->brand:Lcom/stripe/android/model/CardBrand;

    invoke-virtual {v1}, Lcom/stripe/android/model/CardBrand;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->networks:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->cvcCheck:Lcom/stripe/android/model/CvcCheck;

    invoke-virtual {v1}, Lcom/stripe/android/model/CvcCheck;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->funding:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public isDefault()Z
    .locals 1

    .line 34
    iget-boolean v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->isDefault:Z

    return v0
.end method

.method public final isExpired()Z
    .locals 2

    .line 58
    iget v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryMonth:I

    .line 59
    iget v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryYear:I

    .line 57
    invoke-static {v0, v1}, Lcom/stripe/android/core/utils/DateUtils;->isExpiryDataValid(II)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->last4:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->isDefault:Z

    iget-object v3, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->nickname:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->billingAddress:Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    iget-object v5, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->billingEmailAddress:Ljava/lang/String;

    iget v6, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryYear:I

    iget v7, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryMonth:I

    iget-object v8, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->brand:Lcom/stripe/android/model/CardBrand;

    iget-object v9, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->networks:Ljava/util/List;

    iget-object v10, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->cvcCheck:Lcom/stripe/android/model/CvcCheck;

    iget-object v11, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->funding:Ljava/lang/String;

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "Card(id="

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v12, ", last4="

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isDefault="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", nickname="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", billingAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", billingEmailAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", expiryYear="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", expiryMonth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", brand="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", networks="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cvcCheck="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", funding="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->last4:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->isDefault:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->nickname:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->billingAddress:Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    if-nez v0, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object p2, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->billingEmailAddress:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryYear:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryMonth:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->brand:Lcom/stripe/android/model/CardBrand;

    invoke-virtual {p2}, Lcom/stripe/android/model/CardBrand;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->networks:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object p2, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->cvcCheck:Lcom/stripe/android/model/CvcCheck;

    invoke-virtual {p2}, Lcom/stripe/android/model/CvcCheck;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->funding:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
