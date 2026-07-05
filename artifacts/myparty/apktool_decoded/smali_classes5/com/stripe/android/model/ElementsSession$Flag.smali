.class public final enum Lcom/stripe/android/model/ElementsSession$Flag;
.super Ljava/lang/Enum;
.source "ElementsSession.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/ElementsSession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Flag"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/model/ElementsSession$Flag;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0087\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/model/ElementsSession$Flag;",
        "",
        "flagValue",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getFlagValue",
        "()Ljava/lang/String;",
        "ELEMENTS_DISABLE_FC_LITE",
        "ELEMENTS_PREFER_FC_LITE",
        "ELEMENTS_DISABLE_LINK_GLOBAL_HOLDBACK_LOOKUP",
        "ELEMENTS_ENABLE_LINK_SPM",
        "ELEMENTS_ENABLE_PASSIVE_CAPTCHA",
        "payments-core_release"
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/model/ElementsSession$Flag;

.field public static final enum ELEMENTS_DISABLE_FC_LITE:Lcom/stripe/android/model/ElementsSession$Flag;

.field public static final enum ELEMENTS_DISABLE_LINK_GLOBAL_HOLDBACK_LOOKUP:Lcom/stripe/android/model/ElementsSession$Flag;

.field public static final enum ELEMENTS_ENABLE_LINK_SPM:Lcom/stripe/android/model/ElementsSession$Flag;

.field public static final enum ELEMENTS_ENABLE_PASSIVE_CAPTCHA:Lcom/stripe/android/model/ElementsSession$Flag;

.field public static final enum ELEMENTS_PREFER_FC_LITE:Lcom/stripe/android/model/ElementsSession$Flag;


# instance fields
.field private final flagValue:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/model/ElementsSession$Flag;
    .locals 5

    sget-object v0, Lcom/stripe/android/model/ElementsSession$Flag;->ELEMENTS_DISABLE_FC_LITE:Lcom/stripe/android/model/ElementsSession$Flag;

    sget-object v1, Lcom/stripe/android/model/ElementsSession$Flag;->ELEMENTS_PREFER_FC_LITE:Lcom/stripe/android/model/ElementsSession$Flag;

    sget-object v2, Lcom/stripe/android/model/ElementsSession$Flag;->ELEMENTS_DISABLE_LINK_GLOBAL_HOLDBACK_LOOKUP:Lcom/stripe/android/model/ElementsSession$Flag;

    sget-object v3, Lcom/stripe/android/model/ElementsSession$Flag;->ELEMENTS_ENABLE_LINK_SPM:Lcom/stripe/android/model/ElementsSession$Flag;

    sget-object v4, Lcom/stripe/android/model/ElementsSession$Flag;->ELEMENTS_ENABLE_PASSIVE_CAPTCHA:Lcom/stripe/android/model/ElementsSession$Flag;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/stripe/android/model/ElementsSession$Flag;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 193
    new-instance v0, Lcom/stripe/android/model/ElementsSession$Flag;

    const/4 v1, 0x0

    const-string v2, "elements_disable_fc_lite"

    const-string v3, "ELEMENTS_DISABLE_FC_LITE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/ElementsSession$Flag;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/ElementsSession$Flag;->ELEMENTS_DISABLE_FC_LITE:Lcom/stripe/android/model/ElementsSession$Flag;

    .line 194
    new-instance v0, Lcom/stripe/android/model/ElementsSession$Flag;

    const/4 v1, 0x1

    const-string v2, "elements_prefer_fc_lite"

    const-string v3, "ELEMENTS_PREFER_FC_LITE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/ElementsSession$Flag;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/ElementsSession$Flag;->ELEMENTS_PREFER_FC_LITE:Lcom/stripe/android/model/ElementsSession$Flag;

    .line 195
    new-instance v0, Lcom/stripe/android/model/ElementsSession$Flag;

    const/4 v1, 0x2

    const-string v2, "elements_disable_link_global_holdback_lookup"

    const-string v3, "ELEMENTS_DISABLE_LINK_GLOBAL_HOLDBACK_LOOKUP"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/ElementsSession$Flag;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/ElementsSession$Flag;->ELEMENTS_DISABLE_LINK_GLOBAL_HOLDBACK_LOOKUP:Lcom/stripe/android/model/ElementsSession$Flag;

    .line 196
    new-instance v0, Lcom/stripe/android/model/ElementsSession$Flag;

    const/4 v1, 0x3

    const-string v2, "elements_enable_link_spm"

    const-string v3, "ELEMENTS_ENABLE_LINK_SPM"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/ElementsSession$Flag;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/ElementsSession$Flag;->ELEMENTS_ENABLE_LINK_SPM:Lcom/stripe/android/model/ElementsSession$Flag;

    .line 197
    new-instance v0, Lcom/stripe/android/model/ElementsSession$Flag;

    const/4 v1, 0x4

    const-string v2, "elements_enable_passive_captcha"

    const-string v3, "ELEMENTS_ENABLE_PASSIVE_CAPTCHA"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/ElementsSession$Flag;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/ElementsSession$Flag;->ELEMENTS_ENABLE_PASSIVE_CAPTCHA:Lcom/stripe/android/model/ElementsSession$Flag;

    invoke-static {}, Lcom/stripe/android/model/ElementsSession$Flag;->$values()[Lcom/stripe/android/model/ElementsSession$Flag;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/ElementsSession$Flag;->$VALUES:[Lcom/stripe/android/model/ElementsSession$Flag;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/ElementsSession$Flag;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    .line 192
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/model/ElementsSession$Flag;->flagValue:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/model/ElementsSession$Flag;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/model/ElementsSession$Flag;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/model/ElementsSession$Flag;
    .locals 1

    const-class v0, Lcom/stripe/android/model/ElementsSession$Flag;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 198
    check-cast p0, Lcom/stripe/android/model/ElementsSession$Flag;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/model/ElementsSession$Flag;
    .locals 1

    sget-object v0, Lcom/stripe/android/model/ElementsSession$Flag;->$VALUES:[Lcom/stripe/android/model/ElementsSession$Flag;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 198
    check-cast v0, [Lcom/stripe/android/model/ElementsSession$Flag;

    return-object v0
.end method


# virtual methods
.method public final getFlagValue()Ljava/lang/String;
    .locals 1

    .line 192
    iget-object v0, p0, Lcom/stripe/android/model/ElementsSession$Flag;->flagValue:Ljava/lang/String;

    return-object v0
.end method
