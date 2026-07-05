.class public final Lcom/stripe/android/uicore/address/schemas/CnAddressSchemaDefinition;
.super Ljava/lang/Object;
.source "CnAddressSchemaDefinition.kt"

# interfaces
.implements Lcom/stripe/android/uicore/address/AddressSchemaDefinition;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/uicore/address/schemas/CnAddressSchemaDefinition;",
        "Lcom/stripe/android/uicore/address/AddressSchemaDefinition;",
        "<init>",
        "()V",
        "countryCode",
        "",
        "getCountryCode",
        "()Ljava/lang/String;",
        "schemaElements",
        "",
        "Lcom/stripe/android/uicore/address/CountryAddressSchema;",
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


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/uicore/address/schemas/CnAddressSchemaDefinition;

.field private static final countryCode:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/uicore/address/schemas/CnAddressSchemaDefinition;

    invoke-direct {v0}, Lcom/stripe/android/uicore/address/schemas/CnAddressSchemaDefinition;-><init>()V

    sput-object v0, Lcom/stripe/android/uicore/address/schemas/CnAddressSchemaDefinition;->INSTANCE:Lcom/stripe/android/uicore/address/schemas/CnAddressSchemaDefinition;

    .line 12
    const-string v0, "CN"

    sput-object v0, Lcom/stripe/android/uicore/address/schemas/CnAddressSchemaDefinition;->countryCode:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCountryCode()Ljava/lang/String;
    .locals 1

    .line 12
    sget-object v0, Lcom/stripe/android/uicore/address/schemas/CnAddressSchemaDefinition;->countryCode:Ljava/lang/String;

    return-object v0
.end method

.method public schemaElements()Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/address/CountryAddressSchema;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x6

    .line 15
    new-array v0, v0, [Lcom/stripe/android/uicore/address/CountryAddressSchema;

    new-instance v1, Lcom/stripe/android/uicore/address/CountryAddressSchema;

    .line 16
    sget-object v2, Lcom/stripe/android/uicore/address/FieldType;->PostalCode:Lcom/stripe/android/uicore/address/FieldType;

    .line 19
    sget-object v6, Lcom/stripe/android/uicore/address/NameType;->Postal:Lcom/stripe/android/uicore/address/NameType;

    .line 18
    new-instance v3, Lcom/stripe/android/uicore/address/FieldSchema;

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/uicore/address/FieldSchema;-><init>(ZLjava/util/ArrayList;Lcom/stripe/android/uicore/address/NameType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x1

    .line 15
    invoke-direct {v1, v2, v4, v3}, Lcom/stripe/android/uicore/address/CountryAddressSchema;-><init>(Lcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 23
    new-instance v1, Lcom/stripe/android/uicore/address/CountryAddressSchema;

    .line 24
    sget-object v3, Lcom/stripe/android/uicore/address/FieldType;->AdministrativeArea:Lcom/stripe/android/uicore/address/FieldType;

    .line 27
    sget-object v8, Lcom/stripe/android/uicore/address/NameType;->Province:Lcom/stripe/android/uicore/address/NameType;

    .line 26
    new-instance v5, Lcom/stripe/android/uicore/address/FieldSchema;

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v5 .. v10}, Lcom/stripe/android/uicore/address/FieldSchema;-><init>(ZLjava/util/ArrayList;Lcom/stripe/android/uicore/address/NameType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 23
    invoke-direct {v1, v3, v4, v5}, Lcom/stripe/android/uicore/address/CountryAddressSchema;-><init>(Lcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;)V

    aput-object v1, v0, v4

    .line 31
    new-instance v1, Lcom/stripe/android/uicore/address/CountryAddressSchema;

    .line 32
    sget-object v3, Lcom/stripe/android/uicore/address/FieldType;->Locality:Lcom/stripe/android/uicore/address/FieldType;

    .line 35
    sget-object v8, Lcom/stripe/android/uicore/address/NameType;->City:Lcom/stripe/android/uicore/address/NameType;

    .line 34
    new-instance v5, Lcom/stripe/android/uicore/address/FieldSchema;

    invoke-direct/range {v5 .. v10}, Lcom/stripe/android/uicore/address/FieldSchema;-><init>(ZLjava/util/ArrayList;Lcom/stripe/android/uicore/address/NameType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 31
    invoke-direct {v1, v3, v4, v5}, Lcom/stripe/android/uicore/address/CountryAddressSchema;-><init>(Lcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;)V

    const/4 v3, 0x2

    aput-object v1, v0, v3

    .line 39
    new-instance v1, Lcom/stripe/android/uicore/address/CountryAddressSchema;

    .line 40
    sget-object v3, Lcom/stripe/android/uicore/address/FieldType;->DependentLocality:Lcom/stripe/android/uicore/address/FieldType;

    .line 43
    sget-object v8, Lcom/stripe/android/uicore/address/NameType;->District:Lcom/stripe/android/uicore/address/NameType;

    .line 42
    new-instance v5, Lcom/stripe/android/uicore/address/FieldSchema;

    invoke-direct/range {v5 .. v10}, Lcom/stripe/android/uicore/address/FieldSchema;-><init>(ZLjava/util/ArrayList;Lcom/stripe/android/uicore/address/NameType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 39
    invoke-direct {v1, v3, v2, v5}, Lcom/stripe/android/uicore/address/CountryAddressSchema;-><init>(Lcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;)V

    const/4 v3, 0x3

    aput-object v1, v0, v3

    .line 47
    new-instance v1, Lcom/stripe/android/uicore/address/CountryAddressSchema;

    .line 48
    sget-object v3, Lcom/stripe/android/uicore/address/FieldType;->AddressLine1:Lcom/stripe/android/uicore/address/FieldType;

    const/4 v5, 0x0

    .line 47
    invoke-direct {v1, v3, v4, v5}, Lcom/stripe/android/uicore/address/CountryAddressSchema;-><init>(Lcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;)V

    const/4 v3, 0x4

    aput-object v1, v0, v3

    .line 52
    new-instance v1, Lcom/stripe/android/uicore/address/CountryAddressSchema;

    .line 53
    sget-object v3, Lcom/stripe/android/uicore/address/FieldType;->AddressLine2:Lcom/stripe/android/uicore/address/FieldType;

    .line 52
    invoke-direct {v1, v3, v2, v5}, Lcom/stripe/android/uicore/address/CountryAddressSchema;-><init>(Lcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;)V

    const/4 v2, 0x5

    aput-object v1, v0, v2

    .line 14
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
