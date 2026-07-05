.class public final Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;
.super Ljava/lang/Object;
.source "BillingDetailsEntry.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\u0008\u001a\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000c\u001a\u00020\rJ\u001a\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\r2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\rJ\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\rH\u0002J\u0019\u0010\u0015\u001a\u00020\t*\u0004\u0018\u00010\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0082\u0004J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\t2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\u0012\u001a\u00020\t*\u0004\u0018\u00010\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0014\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;",
        "",
        "billingDetailsFormState",
        "Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;)V",
        "getBillingDetailsFormState",
        "()Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;",
        "hasChanged",
        "",
        "billingDetails",
        "Lcom/stripe/android/model/PaymentMethod$BillingDetails;",
        "billingDetailsCollectionConfiguration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;",
        "contactInformationChanged",
        "configuration",
        "isComplete",
        "contactInfoComplete",
        "isValid",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z",
        "nullableNeq",
        "",
        "other",
        "component1",
        "copy",
        "equals",
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
.field private final billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lcom/stripe/android/uicore/forms/FormFieldEntry;->$stable:I

    sget v1, Lcom/stripe/android/uicore/forms/FormFieldEntry;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/stripe/android/uicore/forms/FormFieldEntry;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/stripe/android/uicore/forms/FormFieldEntry;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/stripe/android/uicore/forms/FormFieldEntry;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/stripe/android/uicore/forms/FormFieldEntry;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/stripe/android/uicore/forms/FormFieldEntry;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/stripe/android/uicore/forms/FormFieldEntry;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/stripe/android/uicore/forms/FormFieldEntry;->$stable:I

    or-int/2addr v0, v1

    sput v0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;)V
    .locals 1

    const-string v0, "billingDetailsFormState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    return-void
.end method

.method private final contactInfoComplete(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;)Z
    .locals 3

    .line 84
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getCollectsName$paymentsheet_release()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getName()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->isValid(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    .line 90
    :goto_0
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getCollectsEmail$paymentsheet_release()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 91
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getEmail()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->isValid(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v1

    .line 96
    :goto_1
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getCollectsPhone$paymentsheet_release()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 97
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getPhone()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->isValid(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z

    move-result p1

    goto :goto_2

    :cond_2
    move p1, v1

    :goto_2
    if-eqz v0, :cond_3

    if-eqz v2, :cond_3

    if-eqz p1, :cond_3

    return v1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method private final contactInformationChanged(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Z
    .locals 5

    .line 43
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getCollectsName$paymentsheet_release()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    .line 44
    iget-object v0, p2, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->name:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getName()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object v3

    invoke-direct {p0, v0, v3}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->nullableNeq(Ljava/lang/String;Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z

    move-result v0

    goto :goto_1

    :cond_1
    move v0, v2

    .line 49
    :goto_1
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getCollectsEmail$paymentsheet_release()Z

    move-result v3

    if-eqz v3, :cond_3

    if-eqz p2, :cond_2

    .line 50
    iget-object v3, p2, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->email:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object v3, v1

    :goto_2
    iget-object v4, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getEmail()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object v4

    invoke-direct {p0, v3, v4}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->nullableNeq(Ljava/lang/String;Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z

    move-result v3

    goto :goto_3

    :cond_3
    move v3, v2

    .line 55
    :goto_3
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getCollectsPhone$paymentsheet_release()Z

    move-result p1

    if-eqz p1, :cond_5

    if-eqz p2, :cond_4

    .line 56
    iget-object v1, p2, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->phone:Ljava/lang/String;

    :cond_4
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getPhone()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object p1

    invoke-direct {p0, v1, p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->nullableNeq(Ljava/lang/String;Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z

    move-result p1

    goto :goto_4

    :cond_5
    move p1, v2

    :goto_4
    if-nez v0, :cond_7

    if-nez v3, :cond_7

    if-eqz p1, :cond_6

    goto :goto_5

    :cond_6
    return v2

    :cond_7
    :goto_5
    const/4 p1, 0x1

    return p1
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->copy(Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;)Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;

    move-result-object p0

    return-object p0
.end method

.method private final isValid(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z
    .locals 0

    if-eqz p1, :cond_0

    .line 105
    invoke-virtual {p1}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->isComplete()Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private final nullableNeq(Ljava/lang/String;Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z
    .locals 1

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1

    .line 109
    :cond_0
    const-string v0, ""

    if-nez p1, :cond_1

    move-object p1, v0

    :cond_1
    invoke-virtual {p2}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    move-object v0, p2

    :goto_0
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;)Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;
    .locals 1

    const-string v0, "billingDetailsFormState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;-><init>(Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getBillingDetailsFormState()Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    return-object v0
.end method

.method public final hasChanged(Lcom/stripe/android/model/PaymentMethod$BillingDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;)Z
    .locals 5

    const-string v0, "billingDetailsCollectionConfiguration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0, p2, p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->contactInformationChanged(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Z

    move-result v0

    .line 20
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;

    move-result-object p2

    sget-object v1, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;->ordinal()I

    move-result p2

    aget p2, v1, p2

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq p2, v3, :cond_8

    const/4 v4, 0x2

    if-eq p2, v4, :cond_7

    const/4 v4, 0x3

    if-ne p2, v4, :cond_6

    if-eqz p1, :cond_0

    .line 27
    iget-object p2, p1, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->address:Lcom/stripe/android/model/Address;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/stripe/android/model/Address;->getPostalCode()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, v2

    :goto_0
    iget-object v4, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getPostalCode()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object v4

    invoke-direct {p0, p2, v4}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->nullableNeq(Ljava/lang/String;Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z

    move-result p2

    if-nez p2, :cond_b

    if-eqz p1, :cond_1

    .line 28
    iget-object p2, p1, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->address:Lcom/stripe/android/model/Address;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/stripe/android/model/Address;->getCountry()Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, v2

    :goto_1
    iget-object v4, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getCountry()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object v4

    invoke-direct {p0, p2, v4}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->nullableNeq(Ljava/lang/String;Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z

    move-result p2

    if-nez p2, :cond_b

    if-eqz p1, :cond_2

    .line 29
    iget-object p2, p1, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->address:Lcom/stripe/android/model/Address;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/stripe/android/model/Address;->getLine1()Ljava/lang/String;

    move-result-object p2

    goto :goto_2

    :cond_2
    move-object p2, v2

    :goto_2
    iget-object v4, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getLine1()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object v4

    invoke-direct {p0, p2, v4}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->nullableNeq(Ljava/lang/String;Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z

    move-result p2

    if-nez p2, :cond_b

    if-eqz p1, :cond_3

    .line 30
    iget-object p2, p1, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->address:Lcom/stripe/android/model/Address;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lcom/stripe/android/model/Address;->getLine2()Ljava/lang/String;

    move-result-object p2

    goto :goto_3

    :cond_3
    move-object p2, v2

    :goto_3
    iget-object v4, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getLine2()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object v4

    invoke-direct {p0, p2, v4}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->nullableNeq(Ljava/lang/String;Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z

    move-result p2

    if-nez p2, :cond_b

    if-eqz p1, :cond_4

    .line 31
    iget-object p2, p1, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->address:Lcom/stripe/android/model/Address;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lcom/stripe/android/model/Address;->getCity()Ljava/lang/String;

    move-result-object p2

    goto :goto_4

    :cond_4
    move-object p2, v2

    :goto_4
    iget-object v4, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getCity()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object v4

    invoke-direct {p0, p2, v4}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->nullableNeq(Ljava/lang/String;Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z

    move-result p2

    if-nez p2, :cond_b

    if-eqz p1, :cond_5

    .line 32
    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->address:Lcom/stripe/android/model/Address;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/stripe/android/model/Address;->getState()Ljava/lang/String;

    move-result-object v2

    :cond_5
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getState()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object p1

    invoke-direct {p0, v2, p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->nullableNeq(Ljava/lang/String;Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_6

    .line 20
    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    move p1, v1

    goto :goto_7

    :cond_8
    if-eqz p1, :cond_9

    .line 22
    iget-object p2, p1, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->address:Lcom/stripe/android/model/Address;

    if-eqz p2, :cond_9

    invoke-virtual {p2}, Lcom/stripe/android/model/Address;->getPostalCode()Ljava/lang/String;

    move-result-object p2

    goto :goto_5

    :cond_9
    move-object p2, v2

    :goto_5
    iget-object v4, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getPostalCode()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object v4

    invoke-direct {p0, p2, v4}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->nullableNeq(Ljava/lang/String;Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z

    move-result p2

    if-nez p2, :cond_b

    if-eqz p1, :cond_a

    .line 23
    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->address:Lcom/stripe/android/model/Address;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lcom/stripe/android/model/Address;->getCountry()Ljava/lang/String;

    move-result-object v2

    :cond_a
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getCountry()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object p1

    invoke-direct {p0, v2, p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->nullableNeq(Ljava/lang/String;Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z

    move-result p1

    if-eqz p1, :cond_7

    :cond_b
    :goto_6
    move p1, v3

    :goto_7
    if-nez v0, :cond_d

    if-eqz p1, :cond_c

    goto :goto_8

    :cond_c
    return v1

    :cond_d
    :goto_8
    return v3
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->hashCode()I

    move-result v0

    return v0
.end method

.method public final isComplete(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;)Z
    .locals 4

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->contactInfoComplete(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;)Z

    move-result v0

    .line 66
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;

    move-result-object p1

    sget-object v1, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p1, v2, :cond_2

    const/4 v3, 0x2

    if-eq p1, v3, :cond_1

    const/4 v3, 0x3

    if-ne p1, v3, :cond_0

    .line 74
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getCountry()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->isValid(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getState()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->isValid(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 75
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getPostalCode()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->isValid(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getLine1()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->isValid(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 76
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getCity()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->isValid(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    .line 66
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    move p1, v2

    goto :goto_1

    .line 68
    :cond_2
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getCountry()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->isValid(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getPostalCode()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->isValid(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    move p1, v1

    :goto_1
    if-eqz v0, :cond_4

    if-eqz p1, :cond_4

    return v2

    :cond_4
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->billingDetailsFormState:Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "BillingDetailsEntry(billingDetailsFormState="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
