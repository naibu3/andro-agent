.class public final enum Lcom/stripe/android/ui/core/elements/TranslationId;
.super Ljava/lang/Enum;
.source "TranslationId.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ui/core/elements/TranslationId$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/ui/core/elements/TranslationId;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000c\u0008\u0087\u0081\u0002\u0018\u0000 \u000e2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/TranslationId;",
        "",
        "resourceId",
        "",
        "<init>",
        "(Ljava/lang/String;II)V",
        "getResourceId",
        "()I",
        "IdealBank",
        "P24Bank",
        "EpsBank",
        "FpxBank",
        "AddressName",
        "AuBecsAccountName",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/ui/core/elements/TranslationId;

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

.field public static final enum AddressName:Lcom/stripe/android/ui/core/elements/TranslationId;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "address.label.name"
    .end annotation
.end field

.field public static final enum AuBecsAccountName:Lcom/stripe/android/ui/core/elements/TranslationId;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "upe.labels.name.onAccount"
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/ui/core/elements/TranslationId$Companion;

.field public static final enum EpsBank:Lcom/stripe/android/ui/core/elements/TranslationId;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "upe.labels.eps.bank"
    .end annotation
.end field

.field public static final enum FpxBank:Lcom/stripe/android/ui/core/elements/TranslationId;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "upe.labels.fpx.bank"
    .end annotation
.end field

.field public static final enum IdealBank:Lcom/stripe/android/ui/core/elements/TranslationId;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "upe.labels.ideal.bank"
    .end annotation
.end field

.field public static final enum P24Bank:Lcom/stripe/android/ui/core/elements/TranslationId;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "upe.labels.p24.bank"
    .end annotation
.end field


# instance fields
.field private final resourceId:I


# direct methods
.method public static synthetic $r8$lambda$GYkHW5LCALRTTTVnECkQoRv0LY4()Lkotlinx/serialization/KSerializer;
    .locals 1

    invoke-static {}, Lcom/stripe/android/ui/core/elements/TranslationId;->_init_$_anonymous_()Lkotlinx/serialization/KSerializer;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic $values()[Lcom/stripe/android/ui/core/elements/TranslationId;
    .locals 6

    sget-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->IdealBank:Lcom/stripe/android/ui/core/elements/TranslationId;

    sget-object v1, Lcom/stripe/android/ui/core/elements/TranslationId;->P24Bank:Lcom/stripe/android/ui/core/elements/TranslationId;

    sget-object v2, Lcom/stripe/android/ui/core/elements/TranslationId;->EpsBank:Lcom/stripe/android/ui/core/elements/TranslationId;

    sget-object v3, Lcom/stripe/android/ui/core/elements/TranslationId;->FpxBank:Lcom/stripe/android/ui/core/elements/TranslationId;

    sget-object v4, Lcom/stripe/android/ui/core/elements/TranslationId;->AddressName:Lcom/stripe/android/ui/core/elements/TranslationId;

    sget-object v5, Lcom/stripe/android/ui/core/elements/TranslationId;->AuBecsAccountName:Lcom/stripe/android/ui/core/elements/TranslationId;

    filled-new-array/range {v0 .. v5}, [Lcom/stripe/android/ui/core/elements/TranslationId;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 15
    new-instance v0, Lcom/stripe/android/ui/core/elements/TranslationId;

    const/4 v1, 0x0

    sget v2, Lcom/stripe/android/ui/core/R$string;->stripe_ideal_bank:I

    const-string v3, "IdealBank"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/TranslationId;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->IdealBank:Lcom/stripe/android/ui/core/elements/TranslationId;

    .line 18
    new-instance v0, Lcom/stripe/android/ui/core/elements/TranslationId;

    const/4 v1, 0x1

    sget v2, Lcom/stripe/android/ui/core/R$string;->stripe_p24_bank:I

    const-string v3, "P24Bank"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/TranslationId;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->P24Bank:Lcom/stripe/android/ui/core/elements/TranslationId;

    .line 21
    new-instance v0, Lcom/stripe/android/ui/core/elements/TranslationId;

    const/4 v1, 0x2

    sget v2, Lcom/stripe/android/ui/core/R$string;->stripe_eps_bank:I

    const-string v3, "EpsBank"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/TranslationId;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->EpsBank:Lcom/stripe/android/ui/core/elements/TranslationId;

    .line 24
    new-instance v0, Lcom/stripe/android/ui/core/elements/TranslationId;

    const/4 v1, 0x3

    sget v2, Lcom/stripe/android/ui/core/R$string;->stripe_fpx_bank:I

    const-string v3, "FpxBank"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/TranslationId;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->FpxBank:Lcom/stripe/android/ui/core/elements/TranslationId;

    .line 27
    new-instance v0, Lcom/stripe/android/ui/core/elements/TranslationId;

    const/4 v1, 0x4

    sget v2, Lcom/stripe/android/core/R$string;->stripe_address_label_full_name:I

    const-string v3, "AddressName"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/TranslationId;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->AddressName:Lcom/stripe/android/ui/core/elements/TranslationId;

    .line 30
    new-instance v0, Lcom/stripe/android/ui/core/elements/TranslationId;

    const/4 v1, 0x5

    sget v2, Lcom/stripe/android/R$string;->stripe_au_becs_account_name:I

    const-string v3, "AuBecsAccountName"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/TranslationId;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->AuBecsAccountName:Lcom/stripe/android/ui/core/elements/TranslationId;

    invoke-static {}, Lcom/stripe/android/ui/core/elements/TranslationId;->$values()[Lcom/stripe/android/ui/core/elements/TranslationId;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->$VALUES:[Lcom/stripe/android/ui/core/elements/TranslationId;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/stripe/android/ui/core/elements/TranslationId$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/ui/core/elements/TranslationId$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->Companion:Lcom/stripe/android/ui/core/elements/TranslationId$Companion;

    .line 10
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    new-instance v1, Lcom/stripe/android/ui/core/elements/TranslationId$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/stripe/android/ui/core/elements/TranslationId$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 12
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/stripe/android/ui/core/elements/TranslationId;->resourceId:I

    return-void
.end method

.method private static final synthetic _init_$_anonymous_()Lkotlinx/serialization/KSerializer;
    .locals 10

    .line 10
    invoke-static {}, Lcom/stripe/android/ui/core/elements/TranslationId;->values()[Lcom/stripe/android/ui/core/elements/TranslationId;

    move-result-object v0

    check-cast v0, [Ljava/lang/Enum;

    const/4 v1, 0x6

    new-array v2, v1, [Ljava/lang/String;

    const-string v3, "upe.labels.ideal.bank"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "upe.labels.p24.bank"

    const/4 v5, 0x1

    aput-object v3, v2, v5

    const-string v3, "upe.labels.eps.bank"

    const/4 v6, 0x2

    aput-object v3, v2, v6

    const-string v3, "upe.labels.fpx.bank"

    const/4 v7, 0x3

    aput-object v3, v2, v7

    const-string v3, "address.label.name"

    const/4 v8, 0x4

    aput-object v3, v2, v8

    const-string v3, "upe.labels.name.onAccount"

    const/4 v9, 0x5

    aput-object v3, v2, v9

    new-array v1, v1, [[Ljava/lang/annotation/Annotation;

    const/4 v3, 0x0

    aput-object v3, v1, v4

    aput-object v3, v1, v5

    aput-object v3, v1, v6

    aput-object v3, v1, v7

    aput-object v3, v1, v8

    aput-object v3, v1, v9

    const-string v4, "com.stripe.android.ui.core.elements.TranslationId"

    invoke-static {v4, v0, v2, v1, v3}, Lkotlinx/serialization/internal/EnumsKt;->createAnnotatedEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lkotlinx/serialization/KSerializer;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Lkotlin/Lazy;
    .locals 1

    .line 10
    sget-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-object v0
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/ui/core/elements/TranslationId;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/ui/core/elements/TranslationId;
    .locals 1

    const-class v0, Lcom/stripe/android/ui/core/elements/TranslationId;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 31
    check-cast p0, Lcom/stripe/android/ui/core/elements/TranslationId;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/ui/core/elements/TranslationId;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->$VALUES:[Lcom/stripe/android/ui/core/elements/TranslationId;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 31
    check-cast v0, [Lcom/stripe/android/ui/core/elements/TranslationId;

    return-object v0
.end method


# virtual methods
.method public final getResourceId()I
    .locals 1

    .line 12
    iget v0, p0, Lcom/stripe/android/ui/core/elements/TranslationId;->resourceId:I

    return v0
.end method
