.class public final enum Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;
.super Ljava/lang/Enum;
.source "RNMaterialInputMode.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;

.field public static final enum DEFAULT:Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;

.field public static final enum KEYBOARD:Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;


# direct methods
.method private static synthetic $values()[Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;
    .locals 2

    .line 3
    sget-object v0, Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;->DEFAULT:Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;

    sget-object v1, Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;->KEYBOARD:Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;

    filled-new-array {v0, v1}, [Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 4
    new-instance v0, Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;->DEFAULT:Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;

    .line 5
    new-instance v0, Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;

    const-string v1, "KEYBOARD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;->KEYBOARD:Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;

    .line 3
    invoke-static {}, Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;->$values()[Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;

    move-result-object v0

    sput-object v0, Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;->$VALUES:[Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;
    .locals 1

    .line 3
    const-class v0, Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;

    return-object p0
.end method

.method public static values()[Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;
    .locals 1

    .line 3
    sget-object v0, Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;->$VALUES:[Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;

    invoke-virtual {v0}, [Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/reactcommunity/rndatetimepicker/RNMaterialInputMode;

    return-object v0
.end method
