.class public final enum Lcom/stripe/android/ui/core/elements/Capitalization;
.super Ljava/lang/Enum;
.source "SimpleTextSpec.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ui/core/elements/Capitalization$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/ui/core/elements/Capitalization;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0087\u0081\u0002\u0018\u0000 \u00082\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0008B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/Capitalization;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "None",
        "Characters",
        "Words",
        "Sentences",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/ui/core/elements/Capitalization;

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

.field public static final enum Characters:Lcom/stripe/android/ui/core/elements/Capitalization;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "characters"
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/ui/core/elements/Capitalization$Companion;

.field public static final enum None:Lcom/stripe/android/ui/core/elements/Capitalization;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "none"
    .end annotation
.end field

.field public static final enum Sentences:Lcom/stripe/android/ui/core/elements/Capitalization;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "sentences"
    .end annotation
.end field

.field public static final enum Words:Lcom/stripe/android/ui/core/elements/Capitalization;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "words"
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$KzmdjS8In7xUZ2EUbopgB2S2Wpk()Lkotlinx/serialization/KSerializer;
    .locals 1

    invoke-static {}, Lcom/stripe/android/ui/core/elements/Capitalization;->_init_$_anonymous_()Lkotlinx/serialization/KSerializer;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic $values()[Lcom/stripe/android/ui/core/elements/Capitalization;
    .locals 4

    sget-object v0, Lcom/stripe/android/ui/core/elements/Capitalization;->None:Lcom/stripe/android/ui/core/elements/Capitalization;

    sget-object v1, Lcom/stripe/android/ui/core/elements/Capitalization;->Characters:Lcom/stripe/android/ui/core/elements/Capitalization;

    sget-object v2, Lcom/stripe/android/ui/core/elements/Capitalization;->Words:Lcom/stripe/android/ui/core/elements/Capitalization;

    sget-object v3, Lcom/stripe/android/ui/core/elements/Capitalization;->Sentences:Lcom/stripe/android/ui/core/elements/Capitalization;

    filled-new-array {v0, v1, v2, v3}, [Lcom/stripe/android/ui/core/elements/Capitalization;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 17
    new-instance v0, Lcom/stripe/android/ui/core/elements/Capitalization;

    const-string v1, "None"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/Capitalization;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/Capitalization;->None:Lcom/stripe/android/ui/core/elements/Capitalization;

    .line 20
    new-instance v0, Lcom/stripe/android/ui/core/elements/Capitalization;

    const-string v1, "Characters"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/Capitalization;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/Capitalization;->Characters:Lcom/stripe/android/ui/core/elements/Capitalization;

    .line 23
    new-instance v0, Lcom/stripe/android/ui/core/elements/Capitalization;

    const-string v1, "Words"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/Capitalization;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/Capitalization;->Words:Lcom/stripe/android/ui/core/elements/Capitalization;

    .line 26
    new-instance v0, Lcom/stripe/android/ui/core/elements/Capitalization;

    const-string v1, "Sentences"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/Capitalization;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/Capitalization;->Sentences:Lcom/stripe/android/ui/core/elements/Capitalization;

    invoke-static {}, Lcom/stripe/android/ui/core/elements/Capitalization;->$values()[Lcom/stripe/android/ui/core/elements/Capitalization;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/Capitalization;->$VALUES:[Lcom/stripe/android/ui/core/elements/Capitalization;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/Capitalization;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/stripe/android/ui/core/elements/Capitalization$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/ui/core/elements/Capitalization$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/Capitalization;->Companion:Lcom/stripe/android/ui/core/elements/Capitalization$Companion;

    .line 15
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    new-instance v1, Lcom/stripe/android/ui/core/elements/Capitalization$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/stripe/android/ui/core/elements/Capitalization$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/Capitalization;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 15
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic _init_$_anonymous_()Lkotlinx/serialization/KSerializer;
    .locals 8

    .line 15
    invoke-static {}, Lcom/stripe/android/ui/core/elements/Capitalization;->values()[Lcom/stripe/android/ui/core/elements/Capitalization;

    move-result-object v0

    check-cast v0, [Ljava/lang/Enum;

    const/4 v1, 0x4

    new-array v2, v1, [Ljava/lang/String;

    const-string v3, "none"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "characters"

    const/4 v5, 0x1

    aput-object v3, v2, v5

    const-string v3, "words"

    const/4 v6, 0x2

    aput-object v3, v2, v6

    const-string v3, "sentences"

    const/4 v7, 0x3

    aput-object v3, v2, v7

    new-array v1, v1, [[Ljava/lang/annotation/Annotation;

    const/4 v3, 0x0

    aput-object v3, v1, v4

    aput-object v3, v1, v5

    aput-object v3, v1, v6

    aput-object v3, v1, v7

    const-string v4, "com.stripe.android.ui.core.elements.Capitalization"

    invoke-static {v4, v0, v2, v1, v3}, Lkotlinx/serialization/internal/EnumsKt;->createAnnotatedEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lkotlinx/serialization/KSerializer;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Lkotlin/Lazy;
    .locals 1

    .line 15
    sget-object v0, Lcom/stripe/android/ui/core/elements/Capitalization;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-object v0
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/ui/core/elements/Capitalization;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/ui/core/elements/Capitalization;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/ui/core/elements/Capitalization;
    .locals 1

    const-class v0, Lcom/stripe/android/ui/core/elements/Capitalization;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 28
    check-cast p0, Lcom/stripe/android/ui/core/elements/Capitalization;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/ui/core/elements/Capitalization;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/elements/Capitalization;->$VALUES:[Lcom/stripe/android/ui/core/elements/Capitalization;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 28
    check-cast v0, [Lcom/stripe/android/ui/core/elements/Capitalization;

    return-object v0
.end method
