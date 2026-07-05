.class public final Lcom/stripe/android/uicore/address/schemas/GyAddressSchemaDefinition;
.super Ljava/lang/Object;
.source "GyAddressSchemaDefinition.kt"

# interfaces
.implements Lcom/stripe/android/uicore/address/AddressSchemaDefinition;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/uicore/address/schemas/GyAddressSchemaDefinition;",
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

.field public static final INSTANCE:Lcom/stripe/android/uicore/address/schemas/GyAddressSchemaDefinition;

.field private static final countryCode:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/uicore/address/schemas/GyAddressSchemaDefinition;

    invoke-direct {v0}, Lcom/stripe/android/uicore/address/schemas/GyAddressSchemaDefinition;-><init>()V

    sput-object v0, Lcom/stripe/android/uicore/address/schemas/GyAddressSchemaDefinition;->INSTANCE:Lcom/stripe/android/uicore/address/schemas/GyAddressSchemaDefinition;

    .line 12
    const-string v0, "GY"

    sput-object v0, Lcom/stripe/android/uicore/address/schemas/GyAddressSchemaDefinition;->countryCode:Ljava/lang/String;

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
    sget-object v0, Lcom/stripe/android/uicore/address/schemas/GyAddressSchemaDefinition;->countryCode:Ljava/lang/String;

    return-object v0
.end method

.method public schemaElements()Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/address/CountryAddressSchema;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x3

    .line 15
    new-array v0, v0, [Lcom/stripe/android/uicore/address/CountryAddressSchema;

    new-instance v1, Lcom/stripe/android/uicore/address/CountryAddressSchema;

    .line 16
    sget-object v2, Lcom/stripe/android/uicore/address/FieldType;->AddressLine1:Lcom/stripe/android/uicore/address/FieldType;

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 15
    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/address/CountryAddressSchema;-><init>(Lcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 20
    new-instance v1, Lcom/stripe/android/uicore/address/CountryAddressSchema;

    .line 21
    sget-object v5, Lcom/stripe/android/uicore/address/FieldType;->AddressLine2:Lcom/stripe/android/uicore/address/FieldType;

    .line 20
    invoke-direct {v1, v5, v2, v4}, Lcom/stripe/android/uicore/address/CountryAddressSchema;-><init>(Lcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;)V

    aput-object v1, v0, v3

    .line 25
    new-instance v1, Lcom/stripe/android/uicore/address/CountryAddressSchema;

    .line 26
    sget-object v2, Lcom/stripe/android/uicore/address/FieldType;->Locality:Lcom/stripe/android/uicore/address/FieldType;

    .line 29
    sget-object v7, Lcom/stripe/android/uicore/address/NameType;->City:Lcom/stripe/android/uicore/address/NameType;

    .line 28
    new-instance v4, Lcom/stripe/android/uicore/address/FieldSchema;

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/uicore/address/FieldSchema;-><init>(ZLjava/util/ArrayList;Lcom/stripe/android/uicore/address/NameType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 25
    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/address/CountryAddressSchema;-><init>(Lcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;)V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 14
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
