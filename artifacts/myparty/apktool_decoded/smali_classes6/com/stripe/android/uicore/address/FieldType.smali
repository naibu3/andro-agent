.class public enum Lcom/stripe/android/uicore/address/FieldType;
.super Ljava/lang/Enum;
.source "TransformAddressToElement.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/address/FieldType$Companion;,
        Lcom/stripe/android/uicore/address/FieldType$PostalCode;,
        Lcom/stripe/android/uicore/address/FieldType$SortingCode;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/uicore/address/FieldType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0081\u0002\u0018\u0000 \u001b2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bB#\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u0018\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/stripe/android/uicore/address/FieldType;",
        "",
        "serializedValue",
        "",
        "identifierSpec",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "defaultLabel",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V",
        "getSerializedValue",
        "()Ljava/lang/String;",
        "getIdentifierSpec",
        "()Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "getDefaultLabel",
        "()I",
        "AddressLine1",
        "AddressLine2",
        "Locality",
        "DependentLocality",
        "PostalCode",
        "SortingCode",
        "AdministrativeArea",
        "Name",
        "capitalization",
        "Landroidx/compose/ui/text/input/KeyboardCapitalization;",
        "capitalization-IUNYP9k",
        "Companion",
        "stripe-ui-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlinx/serialization/Serializable;
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/stripe/android/uicore/address/FieldType;

.field private static final $cachedSerializer$delegate:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Lkotlinx/serialization/KSerializer<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final enum AddressLine1:Lcom/stripe/android/uicore/address/FieldType;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "addressLine1"
    .end annotation
.end field

.field public static final enum AddressLine2:Lcom/stripe/android/uicore/address/FieldType;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "addressLine2"
    .end annotation
.end field

.field public static final enum AdministrativeArea:Lcom/stripe/android/uicore/address/FieldType;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "administrativeArea"
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/uicore/address/FieldType$Companion;

.field public static final enum DependentLocality:Lcom/stripe/android/uicore/address/FieldType;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "dependentLocality"
    .end annotation
.end field

.field public static final enum Locality:Lcom/stripe/android/uicore/address/FieldType;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "locality"
    .end annotation
.end field

.field public static final enum Name:Lcom/stripe/android/uicore/address/FieldType;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "name"
    .end annotation
.end field

.field public static final enum PostalCode:Lcom/stripe/android/uicore/address/FieldType;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "postalCode"
    .end annotation
.end field

.field public static final enum SortingCode:Lcom/stripe/android/uicore/address/FieldType;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "sortingCode"
    .end annotation
.end field


# instance fields
.field private final defaultLabel:I

.field private final identifierSpec:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private final serializedValue:Ljava/lang/String;


# direct methods
.method public static synthetic $r8$lambda$2QRsJnRmLyvQJvU0guCaG9gc0eQ()Lkotlinx/serialization/KSerializer;
    .locals 1

    invoke-static {}, Lcom/stripe/android/uicore/address/FieldType;->_init_$_anonymous_()Lkotlinx/serialization/KSerializer;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic $values()[Lcom/stripe/android/uicore/address/FieldType;
    .locals 8

    sget-object v0, Lcom/stripe/android/uicore/address/FieldType;->AddressLine1:Lcom/stripe/android/uicore/address/FieldType;

    sget-object v1, Lcom/stripe/android/uicore/address/FieldType;->AddressLine2:Lcom/stripe/android/uicore/address/FieldType;

    sget-object v2, Lcom/stripe/android/uicore/address/FieldType;->Locality:Lcom/stripe/android/uicore/address/FieldType;

    sget-object v3, Lcom/stripe/android/uicore/address/FieldType;->DependentLocality:Lcom/stripe/android/uicore/address/FieldType;

    sget-object v4, Lcom/stripe/android/uicore/address/FieldType;->PostalCode:Lcom/stripe/android/uicore/address/FieldType;

    sget-object v5, Lcom/stripe/android/uicore/address/FieldType;->SortingCode:Lcom/stripe/android/uicore/address/FieldType;

    sget-object v6, Lcom/stripe/android/uicore/address/FieldType;->AdministrativeArea:Lcom/stripe/android/uicore/address/FieldType;

    sget-object v7, Lcom/stripe/android/uicore/address/FieldType;->Name:Lcom/stripe/android/uicore/address/FieldType;

    filled-new-array/range {v0 .. v7}, [Lcom/stripe/android/uicore/address/FieldType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 10

    .line 40
    new-instance v0, Lcom/stripe/android/uicore/address/FieldType;

    .line 42
    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getLine1()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v4

    .line 43
    sget v5, Lcom/stripe/android/core/R$string;->stripe_address_label_address_line1:I

    .line 40
    const-string v1, "AddressLine1"

    const/4 v2, 0x0

    const-string v3, "addressLine1"

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/uicore/address/FieldType;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    sput-object v0, Lcom/stripe/android/uicore/address/FieldType;->AddressLine1:Lcom/stripe/android/uicore/address/FieldType;

    .line 47
    new-instance v1, Lcom/stripe/android/uicore/address/FieldType;

    .line 49
    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getLine2()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v5

    .line 50
    sget v6, Lcom/stripe/android/uicore/R$string;->stripe_address_label_address_line2:I

    .line 47
    const-string v2, "AddressLine2"

    const/4 v3, 0x1

    const-string v4, "addressLine2"

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/uicore/address/FieldType;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    sput-object v1, Lcom/stripe/android/uicore/address/FieldType;->AddressLine2:Lcom/stripe/android/uicore/address/FieldType;

    .line 54
    new-instance v2, Lcom/stripe/android/uicore/address/FieldType;

    .line 56
    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCity()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v6

    .line 57
    sget v7, Lcom/stripe/android/core/R$string;->stripe_address_label_city:I

    .line 54
    const-string v3, "Locality"

    const/4 v4, 0x2

    const-string v5, "locality"

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/uicore/address/FieldType;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    sput-object v2, Lcom/stripe/android/uicore/address/FieldType;->Locality:Lcom/stripe/android/uicore/address/FieldType;

    .line 61
    new-instance v3, Lcom/stripe/android/uicore/address/FieldType;

    .line 63
    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getDependentLocality()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v7

    .line 64
    sget v8, Lcom/stripe/android/core/R$string;->stripe_address_label_city:I

    .line 61
    const-string v4, "DependentLocality"

    const/4 v5, 0x3

    const-string v6, "dependentLocality"

    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/uicore/address/FieldType;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    sput-object v3, Lcom/stripe/android/uicore/address/FieldType;->DependentLocality:Lcom/stripe/android/uicore/address/FieldType;

    .line 67
    new-instance v0, Lcom/stripe/android/uicore/address/FieldType$PostalCode;

    const-string v1, "PostalCode"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/uicore/address/FieldType$PostalCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/uicore/address/FieldType;->PostalCode:Lcom/stripe/android/uicore/address/FieldType;

    .line 76
    new-instance v0, Lcom/stripe/android/uicore/address/FieldType$SortingCode;

    const-string v1, "SortingCode"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/uicore/address/FieldType$SortingCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/uicore/address/FieldType;->SortingCode:Lcom/stripe/android/uicore/address/FieldType;

    .line 86
    new-instance v3, Lcom/stripe/android/uicore/address/FieldType;

    .line 88
    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getState()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v7

    .line 89
    sget-object v0, Lcom/stripe/android/uicore/address/NameType;->State:Lcom/stripe/android/uicore/address/NameType;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/address/NameType;->getStringResId()I

    move-result v8

    .line 86
    const-string v4, "AdministrativeArea"

    const/4 v5, 0x6

    const-string v6, "administrativeArea"

    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/uicore/address/FieldType;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    sput-object v3, Lcom/stripe/android/uicore/address/FieldType;->AdministrativeArea:Lcom/stripe/android/uicore/address/FieldType;

    .line 93
    new-instance v4, Lcom/stripe/android/uicore/address/FieldType;

    .line 95
    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getName()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v8

    .line 96
    sget v9, Lcom/stripe/android/core/R$string;->stripe_address_label_full_name:I

    .line 93
    const-string v5, "Name"

    const/4 v6, 0x7

    const-string v7, "name"

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/uicore/address/FieldType;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    sput-object v4, Lcom/stripe/android/uicore/address/FieldType;->Name:Lcom/stripe/android/uicore/address/FieldType;

    invoke-static {}, Lcom/stripe/android/uicore/address/FieldType;->$values()[Lcom/stripe/android/uicore/address/FieldType;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/address/FieldType;->$VALUES:[Lcom/stripe/android/uicore/address/FieldType;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/address/FieldType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/stripe/android/uicore/address/FieldType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/uicore/address/FieldType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/address/FieldType;->Companion:Lcom/stripe/android/uicore/address/FieldType$Companion;

    .line 101
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    new-instance v1, Lcom/stripe/android/uicore/address/FieldType$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/stripe/android/uicore/address/FieldType$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/address/FieldType;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "I)V"
        }
    .end annotation

    .line 34
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 35
    iput-object p3, p0, Lcom/stripe/android/uicore/address/FieldType;->serializedValue:Ljava/lang/String;

    .line 36
    iput-object p4, p0, Lcom/stripe/android/uicore/address/FieldType;->identifierSpec:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    .line 37
    iput p5, p0, Lcom/stripe/android/uicore/address/FieldType;->defaultLabel:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/uicore/address/FieldType;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    return-void
.end method

.method private static final synthetic _init_$_anonymous_()Lkotlinx/serialization/KSerializer;
    .locals 12

    .line 101
    invoke-static {}, Lcom/stripe/android/uicore/address/FieldType;->values()[Lcom/stripe/android/uicore/address/FieldType;

    move-result-object v0

    check-cast v0, [Ljava/lang/Enum;

    const/16 v1, 0x8

    new-array v2, v1, [Ljava/lang/String;

    const-string v3, "addressLine1"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "addressLine2"

    const/4 v5, 0x1

    aput-object v3, v2, v5

    const-string v3, "locality"

    const/4 v6, 0x2

    aput-object v3, v2, v6

    const-string v3, "dependentLocality"

    const/4 v7, 0x3

    aput-object v3, v2, v7

    const-string v3, "postalCode"

    const/4 v8, 0x4

    aput-object v3, v2, v8

    const-string v3, "sortingCode"

    const/4 v9, 0x5

    aput-object v3, v2, v9

    const-string v3, "administrativeArea"

    const/4 v10, 0x6

    aput-object v3, v2, v10

    const-string v3, "name"

    const/4 v11, 0x7

    aput-object v3, v2, v11

    new-array v1, v1, [[Ljava/lang/annotation/Annotation;

    const/4 v3, 0x0

    aput-object v3, v1, v4

    aput-object v3, v1, v5

    aput-object v3, v1, v6

    aput-object v3, v1, v7

    aput-object v3, v1, v8

    aput-object v3, v1, v9

    aput-object v3, v1, v10

    aput-object v3, v1, v11

    const-string v4, "com.stripe.android.uicore.address.FieldType"

    invoke-static {v4, v0, v2, v1, v3}, Lkotlinx/serialization/internal/EnumsKt;->createAnnotatedEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lkotlinx/serialization/KSerializer;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Lkotlin/Lazy;
    .locals 1

    .line 32
    sget-object v0, Lcom/stripe/android/uicore/address/FieldType;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-object v0
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/uicore/address/FieldType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/uicore/address/FieldType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/uicore/address/FieldType;
    .locals 1

    const-class v0, Lcom/stripe/android/uicore/address/FieldType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 107
    check-cast p0, Lcom/stripe/android/uicore/address/FieldType;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/uicore/address/FieldType;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/address/FieldType;->$VALUES:[Lcom/stripe/android/uicore/address/FieldType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 107
    check-cast v0, [Lcom/stripe/android/uicore/address/FieldType;

    return-object v0
.end method


# virtual methods
.method public capitalization-IUNYP9k()I
    .locals 1

    .line 99
    sget-object v0, Landroidx/compose/ui/text/input/KeyboardCapitalization;->Companion:Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;->getWords-IUNYP9k()I

    move-result v0

    return v0
.end method

.method public final getDefaultLabel()I
    .locals 1

    .line 37
    iget v0, p0, Lcom/stripe/android/uicore/address/FieldType;->defaultLabel:I

    return v0
.end method

.method public final getIdentifierSpec()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/stripe/android/uicore/address/FieldType;->identifierSpec:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public final getSerializedValue()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/stripe/android/uicore/address/FieldType;->serializedValue:Ljava/lang/String;

    return-object v0
.end method
