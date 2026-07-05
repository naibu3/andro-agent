.class final enum Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;
.super Ljava/lang/Enum;
.source "NetworkingLinkSignupViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0082\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "LEGAL_DETAILS",
        "financial-connections_release"
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;

.field public static final enum LEGAL_DETAILS:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;->LEGAL_DETAILS:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;

    filled-new-array {v0}, [Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 399
    new-instance v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;

    const/4 v1, 0x0

    const-string v2, "stripe://legal-details-notice"

    const-string v3, "LEGAL_DETAILS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;->LEGAL_DETAILS:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;

    invoke-static {}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;->$values()[Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;->$VALUES:[Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    .line 398
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;->value:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;
    .locals 1

    const-class v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 400
    check-cast p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;->$VALUES:[Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 400
    check-cast v0, [Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    .line 398
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;->value:Ljava/lang/String;

    return-object v0
.end method
