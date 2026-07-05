.class public abstract enum Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;
.super Ljava/lang/Enum;
.source "ContactInformationCollectionMode.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode$Email;,
        Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode$Name;,
        Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode$Phone;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH&J\u001e\u0010\u000b\u001a\u00020\u000c2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH&J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nj\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Name",
        "Phone",
        "Email",
        "collectionMode",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;",
        "configuration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;",
        "formElement",
        "Lcom/stripe/android/uicore/elements/FormElement;",
        "initialValues",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "",
        "isAllowed",
        "",
        "isRequired",
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
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;

.field public static final enum Email:Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;

.field public static final enum Name:Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;

.field public static final enum Phone:Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;
    .locals 3

    sget-object v0, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;->Name:Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;

    sget-object v1, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;->Phone:Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;

    sget-object v2, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;->Email:Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;

    filled-new-array {v0, v1, v2}, [Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 11
    new-instance v0, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode$Name;

    const-string v1, "Name"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode$Name;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;->Name:Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;

    .line 20
    new-instance v0, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode$Phone;

    const-string v1, "Phone"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode$Phone;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;->Phone:Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;

    .line 29
    new-instance v0, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode$Email;

    const-string v1, "Email"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode$Email;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;->Email:Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;

    invoke-static {}, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;->$values()[Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;->$VALUES:[Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 10
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;
    .locals 1

    const-class v0, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 54
    check-cast p0, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;
    .locals 1

    sget-object v0, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;->$VALUES:[Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 54
    check-cast v0, [Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;

    return-object v0
.end method


# virtual methods
.method public abstract collectionMode(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;
.end method

.method public abstract formElement(Ljava/util/Map;)Lcom/stripe/android/uicore/elements/FormElement;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/uicore/elements/FormElement;"
        }
    .end annotation
.end method

.method public final isAllowed(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;)Z
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    invoke-virtual {p0, p1}, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;->collectionMode(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;

    move-result-object p1

    .line 47
    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;->Never:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final isRequired(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;)Z
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    invoke-virtual {p0, p1}, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;->collectionMode(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;

    move-result-object p1

    .line 52
    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;->Always:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
