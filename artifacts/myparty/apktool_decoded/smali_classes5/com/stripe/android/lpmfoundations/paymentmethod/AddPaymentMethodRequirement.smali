.class public abstract enum Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;
.super Ljava/lang/Enum;
.source "AddPaymentMethodRequirement.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement$FinancialConnectionsSdk;,
        Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement$InstantDebits;,
        Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement$LinkCardBrand;,
        Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement$MerchantSupportsDelayedPaymentMethods;,
        Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement$ShippingAddress;,
        Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement$Unsupported;,
        Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement$UnsupportedForSetup;,
        Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement$ValidUsBankVerificationMethod;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Unsupported",
        "UnsupportedForSetup",
        "ShippingAddress",
        "MerchantSupportsDelayedPaymentMethods",
        "FinancialConnectionsSdk",
        "ValidUsBankVerificationMethod",
        "InstantDebits",
        "LinkCardBrand",
        "isMetBy",
        "",
        "metadata",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
        "code",
        "",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

.field public static final enum FinancialConnectionsSdk:Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

.field public static final enum InstantDebits:Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

.field public static final enum LinkCardBrand:Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

.field public static final enum MerchantSupportsDelayedPaymentMethods:Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

.field public static final enum ShippingAddress:Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

.field public static final enum Unsupported:Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

.field public static final enum UnsupportedForSetup:Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

.field public static final enum ValidUsBankVerificationMethod:Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;
    .locals 8

    sget-object v0, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;->Unsupported:Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

    sget-object v1, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;->UnsupportedForSetup:Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

    sget-object v2, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;->ShippingAddress:Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

    sget-object v3, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;->MerchantSupportsDelayedPaymentMethods:Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

    sget-object v4, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;->FinancialConnectionsSdk:Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

    sget-object v5, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;->ValidUsBankVerificationMethod:Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

    sget-object v6, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;->InstantDebits:Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

    sget-object v7, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;->LinkCardBrand:Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

    filled-new-array/range {v0 .. v7}, [Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 10
    new-instance v0, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement$Unsupported;

    const-string v1, "Unsupported"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement$Unsupported;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;->Unsupported:Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

    .line 15
    new-instance v0, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement$UnsupportedForSetup;

    const-string v1, "UnsupportedForSetup"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement$UnsupportedForSetup;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;->UnsupportedForSetup:Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

    .line 22
    new-instance v0, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement$ShippingAddress;

    const-string v1, "ShippingAddress"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement$ShippingAddress;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;->ShippingAddress:Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

    .line 37
    new-instance v0, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement$MerchantSupportsDelayedPaymentMethods;

    const-string v1, "MerchantSupportsDelayedPaymentMethods"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement$MerchantSupportsDelayedPaymentMethods;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;->MerchantSupportsDelayedPaymentMethods:Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

    .line 44
    new-instance v0, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement$FinancialConnectionsSdk;

    const-string v1, "FinancialConnectionsSdk"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement$FinancialConnectionsSdk;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;->FinancialConnectionsSdk:Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

    .line 51
    new-instance v0, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement$ValidUsBankVerificationMethod;

    const-string v1, "ValidUsBankVerificationMethod"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement$ValidUsBankVerificationMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;->ValidUsBankVerificationMethod:Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

    .line 69
    new-instance v0, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement$InstantDebits;

    const-string v1, "InstantDebits"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement$InstantDebits;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;->InstantDebits:Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

    .line 78
    new-instance v0, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement$LinkCardBrand;

    const-string v1, "LinkCardBrand"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement$LinkCardBrand;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;->LinkCardBrand:Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

    invoke-static {}, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;->$values()[Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;->$VALUES:[Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 8
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;
    .locals 1

    const-class v0, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 87
    check-cast p0, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;
    .locals 1

    sget-object v0, Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;->$VALUES:[Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 87
    check-cast v0, [Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;

    return-object v0
.end method


# virtual methods
.method public abstract isMetBy(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Ljava/lang/String;)Z
.end method
