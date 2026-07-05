.class public final enum Lcom/stripe/android/link/ui/LinkTermsType;
.super Ljava/lang/Enum;
.source "LinkTerms.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/link/ui/LinkTermsType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/LinkTermsType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "InlineOptionalWithPhoneFirst",
        "InlineOptional",
        "Inline",
        "InlineWithDefaultOptIn",
        "Full",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/link/ui/LinkTermsType;

.field public static final enum Full:Lcom/stripe/android/link/ui/LinkTermsType;

.field public static final enum Inline:Lcom/stripe/android/link/ui/LinkTermsType;

.field public static final enum InlineOptional:Lcom/stripe/android/link/ui/LinkTermsType;

.field public static final enum InlineOptionalWithPhoneFirst:Lcom/stripe/android/link/ui/LinkTermsType;

.field public static final enum InlineWithDefaultOptIn:Lcom/stripe/android/link/ui/LinkTermsType;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/link/ui/LinkTermsType;
    .locals 5

    sget-object v0, Lcom/stripe/android/link/ui/LinkTermsType;->InlineOptionalWithPhoneFirst:Lcom/stripe/android/link/ui/LinkTermsType;

    sget-object v1, Lcom/stripe/android/link/ui/LinkTermsType;->InlineOptional:Lcom/stripe/android/link/ui/LinkTermsType;

    sget-object v2, Lcom/stripe/android/link/ui/LinkTermsType;->Inline:Lcom/stripe/android/link/ui/LinkTermsType;

    sget-object v3, Lcom/stripe/android/link/ui/LinkTermsType;->InlineWithDefaultOptIn:Lcom/stripe/android/link/ui/LinkTermsType;

    sget-object v4, Lcom/stripe/android/link/ui/LinkTermsType;->Full:Lcom/stripe/android/link/ui/LinkTermsType;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/stripe/android/link/ui/LinkTermsType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 19
    new-instance v0, Lcom/stripe/android/link/ui/LinkTermsType;

    const-string v1, "InlineOptionalWithPhoneFirst"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/link/ui/LinkTermsType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/link/ui/LinkTermsType;->InlineOptionalWithPhoneFirst:Lcom/stripe/android/link/ui/LinkTermsType;

    .line 20
    new-instance v0, Lcom/stripe/android/link/ui/LinkTermsType;

    const-string v1, "InlineOptional"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/link/ui/LinkTermsType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/link/ui/LinkTermsType;->InlineOptional:Lcom/stripe/android/link/ui/LinkTermsType;

    .line 21
    new-instance v0, Lcom/stripe/android/link/ui/LinkTermsType;

    const-string v1, "Inline"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/link/ui/LinkTermsType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/link/ui/LinkTermsType;->Inline:Lcom/stripe/android/link/ui/LinkTermsType;

    .line 22
    new-instance v0, Lcom/stripe/android/link/ui/LinkTermsType;

    const-string v1, "InlineWithDefaultOptIn"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/link/ui/LinkTermsType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/link/ui/LinkTermsType;->InlineWithDefaultOptIn:Lcom/stripe/android/link/ui/LinkTermsType;

    .line 23
    new-instance v0, Lcom/stripe/android/link/ui/LinkTermsType;

    const-string v1, "Full"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/link/ui/LinkTermsType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/link/ui/LinkTermsType;->Full:Lcom/stripe/android/link/ui/LinkTermsType;

    invoke-static {}, Lcom/stripe/android/link/ui/LinkTermsType;->$values()[Lcom/stripe/android/link/ui/LinkTermsType;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/ui/LinkTermsType;->$VALUES:[Lcom/stripe/android/link/ui/LinkTermsType;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/ui/LinkTermsType;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/link/ui/LinkTermsType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/link/ui/LinkTermsType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/link/ui/LinkTermsType;
    .locals 1

    const-class v0, Lcom/stripe/android/link/ui/LinkTermsType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 24
    check-cast p0, Lcom/stripe/android/link/ui/LinkTermsType;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/link/ui/LinkTermsType;
    .locals 1

    sget-object v0, Lcom/stripe/android/link/ui/LinkTermsType;->$VALUES:[Lcom/stripe/android/link/ui/LinkTermsType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 24
    check-cast v0, [Lcom/stripe/android/link/ui/LinkTermsType;

    return-object v0
.end method
