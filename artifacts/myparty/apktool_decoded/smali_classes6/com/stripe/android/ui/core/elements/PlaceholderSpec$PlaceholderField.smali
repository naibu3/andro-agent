.class public final enum Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;
.super Ljava/lang/Enum;
.source "PlaceholderSpec.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/ui/core/elements/PlaceholderSpec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "PlaceholderField"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000b\u0008\u0087\u0081\u0002\u0018\u0000 \u000b2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Name",
        "Email",
        "Phone",
        "BillingAddress",
        "BillingAddressWithoutCountry",
        "SepaMandate",
        "Unknown",
        "Companion",
        "payments-ui-core_release"
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

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

.field public static final enum BillingAddress:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "billing_address"
    .end annotation
.end field

.field public static final enum BillingAddressWithoutCountry:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "billing_address_without_country"
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField$Companion;

.field public static final enum Email:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "email"
    .end annotation
.end field

.field public static final enum Name:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "name"
    .end annotation
.end field

.field public static final enum Phone:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "phone"
    .end annotation
.end field

.field public static final enum SepaMandate:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "sepa_mandate"
    .end annotation
.end field

.field public static final enum Unknown:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "unknown"
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$DX3rVG1DI9lYpj6VfZjGCzA9-3s()Lkotlinx/serialization/KSerializer;
    .locals 1

    invoke-static {}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->_init_$_anonymous_()Lkotlinx/serialization/KSerializer;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic $values()[Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;
    .locals 7

    sget-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->Name:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    sget-object v1, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->Email:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    sget-object v2, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->Phone:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    sget-object v3, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->BillingAddress:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    sget-object v4, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->BillingAddressWithoutCountry:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    sget-object v5, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->SepaMandate:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    sget-object v6, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->Unknown:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    filled-new-array/range {v0 .. v6}, [Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 21
    new-instance v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    const-string v1, "Name"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->Name:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    .line 24
    new-instance v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    const-string v1, "Email"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->Email:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    .line 27
    new-instance v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    const-string v1, "Phone"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->Phone:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    .line 30
    new-instance v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    const-string v1, "BillingAddress"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->BillingAddress:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    .line 33
    new-instance v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    const-string v1, "BillingAddressWithoutCountry"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->BillingAddressWithoutCountry:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    .line 36
    new-instance v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    const-string v1, "SepaMandate"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->SepaMandate:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    .line 39
    new-instance v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    const-string v1, "Unknown"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->Unknown:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    invoke-static {}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->$values()[Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->$VALUES:[Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->Companion:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField$Companion;

    .line 18
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    new-instance v1, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 18
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic _init_$_anonymous_()Lkotlinx/serialization/KSerializer;
    .locals 11

    .line 18
    invoke-static {}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->values()[Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    move-result-object v0

    check-cast v0, [Ljava/lang/Enum;

    const/4 v1, 0x7

    new-array v2, v1, [Ljava/lang/String;

    const-string v3, "name"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "email"

    const/4 v5, 0x1

    aput-object v3, v2, v5

    const-string v3, "phone"

    const/4 v6, 0x2

    aput-object v3, v2, v6

    const-string v3, "billing_address"

    const/4 v7, 0x3

    aput-object v3, v2, v7

    const-string v3, "billing_address_without_country"

    const/4 v8, 0x4

    aput-object v3, v2, v8

    const-string v3, "sepa_mandate"

    const/4 v9, 0x5

    aput-object v3, v2, v9

    const-string v3, "unknown"

    const/4 v10, 0x6

    aput-object v3, v2, v10

    new-array v1, v1, [[Ljava/lang/annotation/Annotation;

    const/4 v3, 0x0

    aput-object v3, v1, v4

    aput-object v3, v1, v5

    aput-object v3, v1, v6

    aput-object v3, v1, v7

    aput-object v3, v1, v8

    aput-object v3, v1, v9

    aput-object v3, v1, v10

    const-string v4, "com.stripe.android.ui.core.elements.PlaceholderSpec.PlaceholderField"

    invoke-static {v4, v0, v2, v1, v3}, Lkotlinx/serialization/internal/EnumsKt;->createAnnotatedEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lkotlinx/serialization/KSerializer;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Lkotlin/Lazy;
    .locals 1

    .line 18
    sget-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-object v0
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;
    .locals 1

    const-class v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 41
    check-cast p0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->$VALUES:[Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 41
    check-cast v0, [Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    return-object v0
.end method
