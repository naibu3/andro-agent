.class public final Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;
.super Ljava/lang/Object;
.source "UpdateCardScreenState.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0007H\u00c6\u0003J\t\u0010+\u001a\u00020\tH\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010/\u001a\u00020\tH\u00c6\u0003Ja\u00100\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u000f\u001a\u00020\tH\u00c6\u0001J\u0013\u00101\u001a\u00020\t2\u0008\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00103\u001a\u000204H\u00d6\u0001J\t\u00105\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0013\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010\u0018R\u0011\u0010!\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\u0018R\u0011\u0010\"\u001a\u00020#8F\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010%R\u0011\u0010&\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010\u0018\u00a8\u00066"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;",
        "",
        "paymentDetailsId",
        "",
        "billingDetailsUpdateFlow",
        "Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;",
        "primaryButtonLabel",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "isDefault",
        "",
        "cardUpdateParams",
        "Lcom/stripe/android/paymentsheet/CardUpdateParams;",
        "preferredCardBrand",
        "Lcom/stripe/android/model/CardBrand;",
        "error",
        "processing",
        "<init>",
        "(Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/CardUpdateParams;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/core/strings/ResolvableString;Z)V",
        "getPaymentDetailsId",
        "()Ljava/lang/String;",
        "getBillingDetailsUpdateFlow",
        "()Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;",
        "getPrimaryButtonLabel",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "()Z",
        "getCardUpdateParams",
        "()Lcom/stripe/android/paymentsheet/CardUpdateParams;",
        "getPreferredCardBrand",
        "()Lcom/stripe/android/model/CardBrand;",
        "getError",
        "getProcessing",
        "readyToSubmit",
        "getReadyToSubmit",
        "isBillingDetailsUpdateFlow",
        "primaryButtonState",
        "Lcom/stripe/android/link/ui/PrimaryButtonState;",
        "getPrimaryButtonState",
        "()Lcom/stripe/android/link/ui/PrimaryButtonState;",
        "shouldShowDefaultTag",
        "getShouldShowDefaultTag",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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


# instance fields
.field private final billingDetailsUpdateFlow:Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;

.field private final cardUpdateParams:Lcom/stripe/android/paymentsheet/CardUpdateParams;

.field private final error:Lcom/stripe/android/core/strings/ResolvableString;

.field private final isDefault:Z

.field private final paymentDetailsId:Ljava/lang/String;

.field private final preferredCardBrand:Lcom/stripe/android/model/CardBrand;

.field private final primaryButtonLabel:Lcom/stripe/android/core/strings/ResolvableString;

.field private final processing:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/CardUpdateParams;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/core/strings/ResolvableString;Z)V
    .locals 1

    const-string v0, "paymentDetailsId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryButtonLabel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->paymentDetailsId:Ljava/lang/String;

    .line 13
    iput-object p2, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->billingDetailsUpdateFlow:Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;

    .line 14
    iput-object p3, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->primaryButtonLabel:Lcom/stripe/android/core/strings/ResolvableString;

    .line 15
    iput-boolean p4, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->isDefault:Z

    .line 16
    iput-object p5, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->cardUpdateParams:Lcom/stripe/android/paymentsheet/CardUpdateParams;

    .line 17
    iput-object p6, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->preferredCardBrand:Lcom/stripe/android/model/CardBrand;

    .line 18
    iput-object p7, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->error:Lcom/stripe/android/core/strings/ResolvableString;

    .line 19
    iput-boolean p8, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->processing:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/CardUpdateParams;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/core/strings/ResolvableString;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p10, p9, 0x2

    const/4 v0, 0x0

    if-eqz p10, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p10, p9, 0x8

    const/4 v1, 0x0

    if-eqz p10, :cond_1

    move p4, v1

    :cond_1
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_2

    move-object p5, v0

    :cond_2
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_3

    move-object p6, v0

    :cond_3
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_4

    move-object p7, v0

    :cond_4
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_5

    move p9, v1

    goto :goto_0

    :cond_5
    move p9, p8

    :goto_0
    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 11
    invoke-direct/range {p1 .. p9}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;-><init>(Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/CardUpdateParams;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/core/strings/ResolvableString;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/CardUpdateParams;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/core/strings/ResolvableString;ZILjava/lang/Object;)Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->paymentDetailsId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->billingDetailsUpdateFlow:Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->primaryButtonLabel:Lcom/stripe/android/core/strings/ResolvableString;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-boolean p4, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->isDefault:Z

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->cardUpdateParams:Lcom/stripe/android/paymentsheet/CardUpdateParams;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->preferredCardBrand:Lcom/stripe/android/model/CardBrand;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->error:Lcom/stripe/android/core/strings/ResolvableString;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-boolean p8, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->processing:Z

    :cond_7
    move-object p9, p7

    move p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->copy(Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/CardUpdateParams;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/core/strings/ResolvableString;Z)Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    move-result-object p0

    return-object p0
.end method

.method private final getReadyToSubmit()Z
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->cardUpdateParams:Lcom/stripe/android/paymentsheet/CardUpdateParams;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->paymentDetailsId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->billingDetailsUpdateFlow:Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->primaryButtonLabel:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->isDefault:Z

    return v0
.end method

.method public final component5()Lcom/stripe/android/paymentsheet/CardUpdateParams;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->cardUpdateParams:Lcom/stripe/android/paymentsheet/CardUpdateParams;

    return-object v0
.end method

.method public final component6()Lcom/stripe/android/model/CardBrand;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->preferredCardBrand:Lcom/stripe/android/model/CardBrand;

    return-object v0
.end method

.method public final component7()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->error:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->processing:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/CardUpdateParams;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/core/strings/ResolvableString;Z)Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;
    .locals 10

    const-string v0, "paymentDetailsId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryButtonLabel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;-><init>(Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/CardUpdateParams;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/core/strings/ResolvableString;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    iget-object v1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->paymentDetailsId:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->paymentDetailsId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->billingDetailsUpdateFlow:Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;

    iget-object v3, p1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->billingDetailsUpdateFlow:Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->primaryButtonLabel:Lcom/stripe/android/core/strings/ResolvableString;

    iget-object v3, p1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->primaryButtonLabel:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->isDefault:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->isDefault:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->cardUpdateParams:Lcom/stripe/android/paymentsheet/CardUpdateParams;

    iget-object v3, p1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->cardUpdateParams:Lcom/stripe/android/paymentsheet/CardUpdateParams;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->preferredCardBrand:Lcom/stripe/android/model/CardBrand;

    iget-object v3, p1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->preferredCardBrand:Lcom/stripe/android/model/CardBrand;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->error:Lcom/stripe/android/core/strings/ResolvableString;

    iget-object v3, p1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->error:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->processing:Z

    iget-boolean p1, p1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->processing:Z

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getBillingDetailsUpdateFlow()Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->billingDetailsUpdateFlow:Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;

    return-object v0
.end method

.method public final getCardUpdateParams()Lcom/stripe/android/paymentsheet/CardUpdateParams;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->cardUpdateParams:Lcom/stripe/android/paymentsheet/CardUpdateParams;

    return-object v0
.end method

.method public final getError()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->error:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final getPaymentDetailsId()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->paymentDetailsId:Ljava/lang/String;

    return-object v0
.end method

.method public final getPreferredCardBrand()Lcom/stripe/android/model/CardBrand;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->preferredCardBrand:Lcom/stripe/android/model/CardBrand;

    return-object v0
.end method

.method public final getPrimaryButtonLabel()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->primaryButtonLabel:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final getPrimaryButtonState()Lcom/stripe/android/link/ui/PrimaryButtonState;
    .locals 1

    .line 30
    invoke-direct {p0}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->getReadyToSubmit()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/stripe/android/link/ui/PrimaryButtonState;->Disabled:Lcom/stripe/android/link/ui/PrimaryButtonState;

    return-object v0

    .line 31
    :cond_0
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->processing:Z

    if-eqz v0, :cond_1

    sget-object v0, Lcom/stripe/android/link/ui/PrimaryButtonState;->Processing:Lcom/stripe/android/link/ui/PrimaryButtonState;

    return-object v0

    .line 32
    :cond_1
    sget-object v0, Lcom/stripe/android/link/ui/PrimaryButtonState;->Enabled:Lcom/stripe/android/link/ui/PrimaryButtonState;

    return-object v0
.end method

.method public final getProcessing()Z
    .locals 1

    .line 19
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->processing:Z

    return v0
.end method

.method public final getShouldShowDefaultTag()Z
    .locals 1

    .line 36
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->isDefault:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->isBillingDetailsUpdateFlow()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->paymentDetailsId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->billingDetailsUpdateFlow:Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->primaryButtonLabel:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->isDefault:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->cardUpdateParams:Lcom/stripe/android/paymentsheet/CardUpdateParams;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/CardUpdateParams;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->preferredCardBrand:Lcom/stripe/android/model/CardBrand;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/stripe/android/model/CardBrand;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->error:Lcom/stripe/android/core/strings/ResolvableString;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->processing:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isBillingDetailsUpdateFlow()Z
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->billingDetailsUpdateFlow:Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isDefault()Z
    .locals 1

    .line 15
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->isDefault:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->paymentDetailsId:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->billingDetailsUpdateFlow:Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;

    iget-object v2, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->primaryButtonLabel:Lcom/stripe/android/core/strings/ResolvableString;

    iget-boolean v3, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->isDefault:Z

    iget-object v4, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->cardUpdateParams:Lcom/stripe/android/paymentsheet/CardUpdateParams;

    iget-object v5, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->preferredCardBrand:Lcom/stripe/android/model/CardBrand;

    iget-object v6, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->error:Lcom/stripe/android/core/strings/ResolvableString;

    iget-boolean v7, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->processing:Z

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "UpdateCardScreenState(paymentDetailsId="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v8, ", billingDetailsUpdateFlow="

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", primaryButtonLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isDefault="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cardUpdateParams="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", preferredCardBrand="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", error="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", processing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
