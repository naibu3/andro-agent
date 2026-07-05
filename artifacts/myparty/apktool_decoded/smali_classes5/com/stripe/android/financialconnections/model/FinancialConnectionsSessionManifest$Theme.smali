.class public final enum Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;
.super Ljava/lang/Enum;
.source "FinancialConnectionsSessionManifest.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Theme"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme$Companion;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme$Serializer;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0087\u0081\u0002\u0018\u0000 \u00082\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0007\u0008B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "LIGHT",
        "DASHBOARD_LIGHT",
        "LINK_LIGHT",
        "Serializer",
        "Companion",
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

.annotation runtime Lkotlinx/serialization/Serializable;
    with = Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme$Serializer;
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

.field public static final Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme$Companion;

.field public static final enum DASHBOARD_LIGHT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "dashboard_light"
    .end annotation
.end field

.field public static final enum LIGHT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "light"
    .end annotation
.end field

.field public static final enum LINK_LIGHT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "link_light"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;
    .locals 3

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;->LIGHT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;->DASHBOARD_LIGHT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;->LINK_LIGHT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    filled-new-array {v0, v1, v2}, [Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 409
    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    const-string v1, "LIGHT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;->LIGHT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    .line 412
    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    const-string v1, "DASHBOARD_LIGHT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;->DASHBOARD_LIGHT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    .line 415
    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    const-string v1, "LINK_LIGHT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;->LINK_LIGHT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    invoke-static {}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;->$values()[Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;->$VALUES:[Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 406
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;
    .locals 1

    const-class v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 422
    check-cast p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;->$VALUES:[Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 422
    check-cast v0, [Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    return-object v0
.end method
