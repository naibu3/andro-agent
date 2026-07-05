.class public final enum Lcom/stripe/android/core/model/StripeFilePurpose;
.super Ljava/lang/Enum;
.source "StripeFilePurpose.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/core/model/StripeFilePurpose$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/core/model/StripeFilePurpose;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000e\u0008\u0086\u0081\u0002\u0018\u0000 \u00102\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u00020\u00038G\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/core/model/StripeFilePurpose;",
        "",
        "code",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getCode",
        "()Ljava/lang/String;",
        "BusinessIcon",
        "BusinessLogo",
        "CustomerSignature",
        "DisputeEvidence",
        "IdentityDocument",
        "PciDocument",
        "TaxDocumentUserUpload",
        "IdentityPrivate",
        "Companion",
        "stripe-core_release"
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/core/model/StripeFilePurpose;

.field public static final enum BusinessIcon:Lcom/stripe/android/core/model/StripeFilePurpose;

.field public static final enum BusinessLogo:Lcom/stripe/android/core/model/StripeFilePurpose;

.field public static final Companion:Lcom/stripe/android/core/model/StripeFilePurpose$Companion;

.field public static final enum CustomerSignature:Lcom/stripe/android/core/model/StripeFilePurpose;

.field public static final enum DisputeEvidence:Lcom/stripe/android/core/model/StripeFilePurpose;

.field public static final enum IdentityDocument:Lcom/stripe/android/core/model/StripeFilePurpose;

.field public static final enum IdentityPrivate:Lcom/stripe/android/core/model/StripeFilePurpose;

.field public static final enum PciDocument:Lcom/stripe/android/core/model/StripeFilePurpose;

.field public static final enum TaxDocumentUserUpload:Lcom/stripe/android/core/model/StripeFilePurpose;


# instance fields
.field private final code:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/core/model/StripeFilePurpose;
    .locals 8

    sget-object v0, Lcom/stripe/android/core/model/StripeFilePurpose;->BusinessIcon:Lcom/stripe/android/core/model/StripeFilePurpose;

    sget-object v1, Lcom/stripe/android/core/model/StripeFilePurpose;->BusinessLogo:Lcom/stripe/android/core/model/StripeFilePurpose;

    sget-object v2, Lcom/stripe/android/core/model/StripeFilePurpose;->CustomerSignature:Lcom/stripe/android/core/model/StripeFilePurpose;

    sget-object v3, Lcom/stripe/android/core/model/StripeFilePurpose;->DisputeEvidence:Lcom/stripe/android/core/model/StripeFilePurpose;

    sget-object v4, Lcom/stripe/android/core/model/StripeFilePurpose;->IdentityDocument:Lcom/stripe/android/core/model/StripeFilePurpose;

    sget-object v5, Lcom/stripe/android/core/model/StripeFilePurpose;->PciDocument:Lcom/stripe/android/core/model/StripeFilePurpose;

    sget-object v6, Lcom/stripe/android/core/model/StripeFilePurpose;->TaxDocumentUserUpload:Lcom/stripe/android/core/model/StripeFilePurpose;

    sget-object v7, Lcom/stripe/android/core/model/StripeFilePurpose;->IdentityPrivate:Lcom/stripe/android/core/model/StripeFilePurpose;

    filled-new-array/range {v0 .. v7}, [Lcom/stripe/android/core/model/StripeFilePurpose;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 13
    new-instance v0, Lcom/stripe/android/core/model/StripeFilePurpose;

    const/4 v1, 0x0

    const-string v2, "business_icon"

    const-string v3, "BusinessIcon"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/core/model/StripeFilePurpose;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/core/model/StripeFilePurpose;->BusinessIcon:Lcom/stripe/android/core/model/StripeFilePurpose;

    .line 14
    new-instance v0, Lcom/stripe/android/core/model/StripeFilePurpose;

    const/4 v1, 0x1

    const-string v2, "business_logo"

    const-string v3, "BusinessLogo"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/core/model/StripeFilePurpose;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/core/model/StripeFilePurpose;->BusinessLogo:Lcom/stripe/android/core/model/StripeFilePurpose;

    .line 15
    new-instance v0, Lcom/stripe/android/core/model/StripeFilePurpose;

    const/4 v1, 0x2

    const-string v2, "customer_signature"

    const-string v3, "CustomerSignature"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/core/model/StripeFilePurpose;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/core/model/StripeFilePurpose;->CustomerSignature:Lcom/stripe/android/core/model/StripeFilePurpose;

    .line 16
    new-instance v0, Lcom/stripe/android/core/model/StripeFilePurpose;

    const/4 v1, 0x3

    const-string v2, "dispute_evidence"

    const-string v3, "DisputeEvidence"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/core/model/StripeFilePurpose;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/core/model/StripeFilePurpose;->DisputeEvidence:Lcom/stripe/android/core/model/StripeFilePurpose;

    .line 17
    new-instance v0, Lcom/stripe/android/core/model/StripeFilePurpose;

    const/4 v1, 0x4

    const-string v2, "identity_document"

    const-string v3, "IdentityDocument"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/core/model/StripeFilePurpose;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/core/model/StripeFilePurpose;->IdentityDocument:Lcom/stripe/android/core/model/StripeFilePurpose;

    .line 18
    new-instance v0, Lcom/stripe/android/core/model/StripeFilePurpose;

    const/4 v1, 0x5

    const-string v2, "pci_document"

    const-string v3, "PciDocument"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/core/model/StripeFilePurpose;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/core/model/StripeFilePurpose;->PciDocument:Lcom/stripe/android/core/model/StripeFilePurpose;

    .line 19
    new-instance v0, Lcom/stripe/android/core/model/StripeFilePurpose;

    const/4 v1, 0x6

    const-string v2, "tax_document_user_upload"

    const-string v3, "TaxDocumentUserUpload"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/core/model/StripeFilePurpose;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/core/model/StripeFilePurpose;->TaxDocumentUserUpload:Lcom/stripe/android/core/model/StripeFilePurpose;

    .line 20
    new-instance v0, Lcom/stripe/android/core/model/StripeFilePurpose;

    const/4 v1, 0x7

    const-string v2, "identity_private"

    const-string v3, "IdentityPrivate"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/core/model/StripeFilePurpose;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/core/model/StripeFilePurpose;->IdentityPrivate:Lcom/stripe/android/core/model/StripeFilePurpose;

    invoke-static {}, Lcom/stripe/android/core/model/StripeFilePurpose;->$values()[Lcom/stripe/android/core/model/StripeFilePurpose;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/core/model/StripeFilePurpose;->$VALUES:[Lcom/stripe/android/core/model/StripeFilePurpose;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/core/model/StripeFilePurpose;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/stripe/android/core/model/StripeFilePurpose$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/core/model/StripeFilePurpose$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/core/model/StripeFilePurpose;->Companion:Lcom/stripe/android/core/model/StripeFilePurpose$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 12
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/core/model/StripeFilePurpose;->code:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/core/model/StripeFilePurpose;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/core/model/StripeFilePurpose;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/core/model/StripeFilePurpose;
    .locals 1

    const-class v0, Lcom/stripe/android/core/model/StripeFilePurpose;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 28
    check-cast p0, Lcom/stripe/android/core/model/StripeFilePurpose;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/core/model/StripeFilePurpose;
    .locals 1

    sget-object v0, Lcom/stripe/android/core/model/StripeFilePurpose;->$VALUES:[Lcom/stripe/android/core/model/StripeFilePurpose;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 28
    check-cast v0, [Lcom/stripe/android/core/model/StripeFilePurpose;

    return-object v0
.end method


# virtual methods
.method public final getCode()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/stripe/android/core/model/StripeFilePurpose;->code:Ljava/lang/String;

    return-object v0
.end method
