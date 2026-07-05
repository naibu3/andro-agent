.class public final enum Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;
.super Ljava/lang/Enum;
.source "ShippingInfoWidget.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/view/ShippingInfoWidget;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CustomizableShippingField"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Line1",
        "Line2",
        "City",
        "PostalCode",
        "State",
        "Phone",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

.field public static final enum City:Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

.field public static final enum Line1:Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

.field public static final enum Line2:Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

.field public static final enum Phone:Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

.field public static final enum PostalCode:Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

.field public static final enum State:Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;
    .locals 6

    sget-object v0, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;->Line1:Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

    sget-object v1, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;->Line2:Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

    sget-object v2, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;->City:Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

    sget-object v3, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;->PostalCode:Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

    sget-object v4, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;->State:Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

    sget-object v5, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;->Phone:Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

    filled-new-array/range {v0 .. v5}, [Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 113
    new-instance v0, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

    const-string v1, "Line1"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;->Line1:Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

    .line 114
    new-instance v0, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

    const-string v1, "Line2"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;->Line2:Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

    .line 115
    new-instance v0, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

    const-string v1, "City"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;->City:Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

    .line 116
    new-instance v0, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

    const-string v1, "PostalCode"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;->PostalCode:Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

    .line 117
    new-instance v0, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

    const-string v1, "State"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;->State:Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

    .line 118
    new-instance v0, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

    const-string v1, "Phone"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;->Phone:Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

    invoke-static {}, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;->$values()[Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;->$VALUES:[Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 112
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;
    .locals 1

    const-class v0, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 119
    check-cast p0, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;
    .locals 1

    sget-object v0, Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;->$VALUES:[Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 119
    check-cast v0, [Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;

    return-object v0
.end method
