.class public final Lcom/stripe/android/model/PaymentMethod$Builder;
.super Ljava/lang/Object;
.source "PaymentMethod.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/PaymentMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010,\u001a\u00020\u00002\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0015\u0010-\u001a\u00020\u00002\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010.J\u000e\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u001c\u00100\u001a\u00020\u00002\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014J\u0010\u00101\u001a\u00020\u00002\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cJ\u0010\u00102\u001a\u00020\u00002\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u00103\u001a\u00020\u00002\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u00104\u001a\u00020\u00002\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0010\u00105\u001a\u00020\u00002\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0010\u00106\u001a\u00020\u00002\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0005J\u0010\u00107\u001a\u00020\u00002\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0010\u00108\u001a\u00020\u00002\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0010\u00109\u001a\u00020\u00002\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0010\u0010:\u001a\u00020\u00002\u0008\u0010 \u001a\u0004\u0018\u00010!J\u0010\u0010;\u001a\u00020\u00002\u0008\u0010\"\u001a\u0004\u0018\u00010#J\u0010\u0010<\u001a\u00020\u00002\u0008\u0010$\u001a\u0004\u0018\u00010%J\u0010\u0010=\u001a\u00020\u00002\u0008\u0010&\u001a\u0004\u0018\u00010\'J\u0010\u0010>\u001a\u00020\u00002\u0008\u0010(\u001a\u0004\u0018\u00010)J\u0010\u0010?\u001a\u00020\u00002\u0008\u0010*\u001a\u0004\u0018\u00010+J\u0010\u0010@\u001a\u00020\u00002\u0008\u0010\r\u001a\u0004\u0018\u00010\u0005J\u0006\u0010A\u001a\u00020BR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0008R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"
    }
    d2 = {
        "Lcom/stripe/android/model/PaymentMethod$Builder;",
        "",
        "<init>",
        "()V",
        "id",
        "",
        "created",
        "",
        "Ljava/lang/Long;",
        "liveMode",
        "",
        "type",
        "Lcom/stripe/android/model/PaymentMethod$Type;",
        "code",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "billingDetails",
        "Lcom/stripe/android/model/PaymentMethod$BillingDetails;",
        "allowRedisplay",
        "Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;",
        "metadata",
        "",
        "customerId",
        "card",
        "Lcom/stripe/android/model/PaymentMethod$Card;",
        "cardPresent",
        "Lcom/stripe/android/model/PaymentMethod$CardPresent;",
        "ideal",
        "Lcom/stripe/android/model/PaymentMethod$Ideal;",
        "fpx",
        "Lcom/stripe/android/model/PaymentMethod$Fpx;",
        "sepaDebit",
        "Lcom/stripe/android/model/PaymentMethod$SepaDebit;",
        "auBecsDebit",
        "Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;",
        "bacsDebit",
        "Lcom/stripe/android/model/PaymentMethod$BacsDebit;",
        "sofort",
        "Lcom/stripe/android/model/PaymentMethod$Sofort;",
        "netbanking",
        "Lcom/stripe/android/model/PaymentMethod$Netbanking;",
        "usBankAccount",
        "Lcom/stripe/android/model/PaymentMethod$USBankAccount;",
        "upi",
        "Lcom/stripe/android/model/PaymentMethod$Upi;",
        "setId",
        "setCreated",
        "(Ljava/lang/Long;)Lcom/stripe/android/model/PaymentMethod$Builder;",
        "setLiveMode",
        "setMetadata",
        "setType",
        "setBillingDetails",
        "setAllowRedisplay",
        "setCard",
        "setCardPresent",
        "setCustomerId",
        "setIdeal",
        "setFpx",
        "setSepaDebit",
        "setAuBecsDebit",
        "setBacsDebit",
        "setSofort",
        "setNetbanking",
        "setUSBankAccount",
        "setUpi",
        "setCode",
        "build",
        "Lcom/stripe/android/model/PaymentMethod;",
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
.field public static final $stable:I = 0x8


# instance fields
.field private allowRedisplay:Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;

.field private auBecsDebit:Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;

.field private bacsDebit:Lcom/stripe/android/model/PaymentMethod$BacsDebit;

.field private billingDetails:Lcom/stripe/android/model/PaymentMethod$BillingDetails;

.field private card:Lcom/stripe/android/model/PaymentMethod$Card;

.field private cardPresent:Lcom/stripe/android/model/PaymentMethod$CardPresent;

.field private code:Ljava/lang/String;

.field private created:Ljava/lang/Long;

.field private customerId:Ljava/lang/String;

.field private fpx:Lcom/stripe/android/model/PaymentMethod$Fpx;

.field private id:Ljava/lang/String;

.field private ideal:Lcom/stripe/android/model/PaymentMethod$Ideal;

.field private liveMode:Z

.field private metadata:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private netbanking:Lcom/stripe/android/model/PaymentMethod$Netbanking;

.field private sepaDebit:Lcom/stripe/android/model/PaymentMethod$SepaDebit;

.field private sofort:Lcom/stripe/android/model/PaymentMethod$Sofort;

.field private type:Lcom/stripe/android/model/PaymentMethod$Type;

.field private upi:Lcom/stripe/android/model/PaymentMethod$Upi;

.field private usBankAccount:Lcom/stripe/android/model/PaymentMethod$USBankAccount;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 588
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final build()Lcom/stripe/android/model/PaymentMethod;
    .locals 25

    move-object/from16 v0, p0

    .line 692
    iget-object v2, v0, Lcom/stripe/android/model/PaymentMethod$Builder;->id:Ljava/lang/String;

    .line 693
    iget-object v3, v0, Lcom/stripe/android/model/PaymentMethod$Builder;->created:Ljava/lang/Long;

    .line 694
    iget-boolean v4, v0, Lcom/stripe/android/model/PaymentMethod$Builder;->liveMode:Z

    .line 695
    iget-object v6, v0, Lcom/stripe/android/model/PaymentMethod$Builder;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 696
    iget-object v5, v0, Lcom/stripe/android/model/PaymentMethod$Builder;->code:Ljava/lang/String;

    .line 697
    iget-object v7, v0, Lcom/stripe/android/model/PaymentMethod$Builder;->billingDetails:Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    .line 698
    iget-object v1, v0, Lcom/stripe/android/model/PaymentMethod$Builder;->allowRedisplay:Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;

    .line 699
    iget-object v8, v0, Lcom/stripe/android/model/PaymentMethod$Builder;->customerId:Ljava/lang/String;

    .line 700
    iget-object v9, v0, Lcom/stripe/android/model/PaymentMethod$Builder;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    .line 701
    iget-object v10, v0, Lcom/stripe/android/model/PaymentMethod$Builder;->cardPresent:Lcom/stripe/android/model/PaymentMethod$CardPresent;

    .line 702
    iget-object v11, v0, Lcom/stripe/android/model/PaymentMethod$Builder;->fpx:Lcom/stripe/android/model/PaymentMethod$Fpx;

    .line 703
    iget-object v12, v0, Lcom/stripe/android/model/PaymentMethod$Builder;->ideal:Lcom/stripe/android/model/PaymentMethod$Ideal;

    .line 704
    iget-object v13, v0, Lcom/stripe/android/model/PaymentMethod$Builder;->sepaDebit:Lcom/stripe/android/model/PaymentMethod$SepaDebit;

    .line 705
    iget-object v14, v0, Lcom/stripe/android/model/PaymentMethod$Builder;->auBecsDebit:Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;

    .line 706
    iget-object v15, v0, Lcom/stripe/android/model/PaymentMethod$Builder;->bacsDebit:Lcom/stripe/android/model/PaymentMethod$BacsDebit;

    move-object/from16 v22, v1

    .line 707
    iget-object v1, v0, Lcom/stripe/android/model/PaymentMethod$Builder;->sofort:Lcom/stripe/android/model/PaymentMethod$Sofort;

    move-object/from16 v16, v1

    .line 708
    iget-object v1, v0, Lcom/stripe/android/model/PaymentMethod$Builder;->netbanking:Lcom/stripe/android/model/PaymentMethod$Netbanking;

    move-object/from16 v18, v1

    .line 709
    iget-object v1, v0, Lcom/stripe/android/model/PaymentMethod$Builder;->usBankAccount:Lcom/stripe/android/model/PaymentMethod$USBankAccount;

    move-object/from16 v19, v1

    .line 691
    new-instance v1, Lcom/stripe/android/model/PaymentMethod;

    const v23, 0xc8000

    const/16 v24, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v1 .. v24}, Lcom/stripe/android/model/PaymentMethod;-><init>(Ljava/lang/String;Ljava/lang/Long;ZLjava/lang/String;Lcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Card;Lcom/stripe/android/model/PaymentMethod$CardPresent;Lcom/stripe/android/model/PaymentMethod$Fpx;Lcom/stripe/android/model/PaymentMethod$Ideal;Lcom/stripe/android/model/PaymentMethod$SepaDebit;Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;Lcom/stripe/android/model/PaymentMethod$BacsDebit;Lcom/stripe/android/model/PaymentMethod$Sofort;Lcom/stripe/android/model/PaymentMethod$Upi;Lcom/stripe/android/model/PaymentMethod$Netbanking;Lcom/stripe/android/model/PaymentMethod$USBankAccount;Lcom/stripe/android/model/LinkPaymentDetails;ZLcom/stripe/android/model/PaymentMethod$AllowRedisplay;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final setAllowRedisplay(Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;)Lcom/stripe/android/model/PaymentMethod$Builder;
    .locals 1

    .line 634
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/PaymentMethod$Builder;

    .line 635
    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethod$Builder;->allowRedisplay:Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;

    return-object p0
.end method

.method public final setAuBecsDebit(Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;)Lcom/stripe/android/model/PaymentMethod$Builder;
    .locals 1

    .line 662
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/PaymentMethod$Builder;

    .line 663
    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethod$Builder;->auBecsDebit:Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;

    return-object p0
.end method

.method public final setBacsDebit(Lcom/stripe/android/model/PaymentMethod$BacsDebit;)Lcom/stripe/android/model/PaymentMethod$Builder;
    .locals 1

    .line 666
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/PaymentMethod$Builder;

    .line 667
    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethod$Builder;->bacsDebit:Lcom/stripe/android/model/PaymentMethod$BacsDebit;

    return-object p0
.end method

.method public final setBillingDetails(Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Lcom/stripe/android/model/PaymentMethod$Builder;
    .locals 1

    .line 630
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/PaymentMethod$Builder;

    .line 631
    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethod$Builder;->billingDetails:Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    return-object p0
.end method

.method public final setCard(Lcom/stripe/android/model/PaymentMethod$Card;)Lcom/stripe/android/model/PaymentMethod$Builder;
    .locals 1

    .line 638
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/PaymentMethod$Builder;

    .line 639
    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethod$Builder;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    return-object p0
.end method

.method public final setCardPresent(Lcom/stripe/android/model/PaymentMethod$CardPresent;)Lcom/stripe/android/model/PaymentMethod$Builder;
    .locals 1

    .line 642
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/PaymentMethod$Builder;

    .line 643
    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethod$Builder;->cardPresent:Lcom/stripe/android/model/PaymentMethod$CardPresent;

    return-object p0
.end method

.method public final setCode(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$Builder;
    .locals 1

    .line 686
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/PaymentMethod$Builder;

    .line 687
    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethod$Builder;->code:Ljava/lang/String;

    return-object p0
.end method

.method public final setCreated(Ljava/lang/Long;)Lcom/stripe/android/model/PaymentMethod$Builder;
    .locals 1

    .line 614
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/PaymentMethod$Builder;

    .line 615
    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethod$Builder;->created:Ljava/lang/Long;

    return-object p0
.end method

.method public final setCustomerId(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$Builder;
    .locals 1

    .line 646
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/PaymentMethod$Builder;

    .line 647
    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethod$Builder;->customerId:Ljava/lang/String;

    return-object p0
.end method

.method public final setFpx(Lcom/stripe/android/model/PaymentMethod$Fpx;)Lcom/stripe/android/model/PaymentMethod$Builder;
    .locals 1

    .line 654
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/PaymentMethod$Builder;

    .line 655
    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethod$Builder;->fpx:Lcom/stripe/android/model/PaymentMethod$Fpx;

    return-object p0
.end method

.method public final setId(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$Builder;
    .locals 1

    .line 610
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/PaymentMethod$Builder;

    .line 611
    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethod$Builder;->id:Ljava/lang/String;

    return-object p0
.end method

.method public final setIdeal(Lcom/stripe/android/model/PaymentMethod$Ideal;)Lcom/stripe/android/model/PaymentMethod$Builder;
    .locals 1

    .line 650
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/PaymentMethod$Builder;

    .line 651
    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethod$Builder;->ideal:Lcom/stripe/android/model/PaymentMethod$Ideal;

    return-object p0
.end method

.method public final setLiveMode(Z)Lcom/stripe/android/model/PaymentMethod$Builder;
    .locals 1

    .line 618
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/PaymentMethod$Builder;

    .line 619
    iput-boolean p1, p0, Lcom/stripe/android/model/PaymentMethod$Builder;->liveMode:Z

    return-object p0
.end method

.method public final setMetadata(Ljava/util/Map;)Lcom/stripe/android/model/PaymentMethod$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/model/PaymentMethod$Builder;"
        }
    .end annotation

    .line 622
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/PaymentMethod$Builder;

    .line 623
    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethod$Builder;->metadata:Ljava/util/Map;

    return-object p0
.end method

.method public final setNetbanking(Lcom/stripe/android/model/PaymentMethod$Netbanking;)Lcom/stripe/android/model/PaymentMethod$Builder;
    .locals 1

    .line 674
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/PaymentMethod$Builder;

    .line 675
    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethod$Builder;->netbanking:Lcom/stripe/android/model/PaymentMethod$Netbanking;

    return-object p0
.end method

.method public final setSepaDebit(Lcom/stripe/android/model/PaymentMethod$SepaDebit;)Lcom/stripe/android/model/PaymentMethod$Builder;
    .locals 1

    .line 658
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/PaymentMethod$Builder;

    .line 659
    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethod$Builder;->sepaDebit:Lcom/stripe/android/model/PaymentMethod$SepaDebit;

    return-object p0
.end method

.method public final setSofort(Lcom/stripe/android/model/PaymentMethod$Sofort;)Lcom/stripe/android/model/PaymentMethod$Builder;
    .locals 1

    .line 670
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/PaymentMethod$Builder;

    .line 671
    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethod$Builder;->sofort:Lcom/stripe/android/model/PaymentMethod$Sofort;

    return-object p0
.end method

.method public final setType(Lcom/stripe/android/model/PaymentMethod$Type;)Lcom/stripe/android/model/PaymentMethod$Builder;
    .locals 1

    .line 626
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/PaymentMethod$Builder;

    .line 627
    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethod$Builder;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    return-object p0
.end method

.method public final setUSBankAccount(Lcom/stripe/android/model/PaymentMethod$USBankAccount;)Lcom/stripe/android/model/PaymentMethod$Builder;
    .locals 1

    .line 678
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/PaymentMethod$Builder;

    .line 679
    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethod$Builder;->usBankAccount:Lcom/stripe/android/model/PaymentMethod$USBankAccount;

    return-object p0
.end method

.method public final setUpi(Lcom/stripe/android/model/PaymentMethod$Upi;)Lcom/stripe/android/model/PaymentMethod$Builder;
    .locals 1

    .line 682
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/PaymentMethod$Builder;

    .line 683
    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethod$Builder;->upi:Lcom/stripe/android/model/PaymentMethod$Upi;

    return-object p0
.end method
