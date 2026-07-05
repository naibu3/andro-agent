.class public final enum Lcom/budiyev/android/codescanner/ButtonPosition;
.super Ljava/lang/Enum;
.source "ButtonPosition.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/budiyev/android/codescanner/ButtonPosition;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/budiyev/android/codescanner/ButtonPosition;

.field public static final enum BOTTOM_END:Lcom/budiyev/android/codescanner/ButtonPosition;

.field public static final enum BOTTOM_START:Lcom/budiyev/android/codescanner/ButtonPosition;

.field public static final enum TOP_END:Lcom/budiyev/android/codescanner/ButtonPosition;

.field public static final enum TOP_START:Lcom/budiyev/android/codescanner/ButtonPosition;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 12
    new-instance v0, Lcom/budiyev/android/codescanner/ButtonPosition;

    const-string v1, "TOP_START"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/budiyev/android/codescanner/ButtonPosition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/budiyev/android/codescanner/ButtonPosition;->TOP_START:Lcom/budiyev/android/codescanner/ButtonPosition;

    .line 13
    new-instance v0, Lcom/budiyev/android/codescanner/ButtonPosition;

    const-string v1, "TOP_END"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/budiyev/android/codescanner/ButtonPosition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/budiyev/android/codescanner/ButtonPosition;->TOP_END:Lcom/budiyev/android/codescanner/ButtonPosition;

    .line 14
    new-instance v0, Lcom/budiyev/android/codescanner/ButtonPosition;

    const-string v1, "BOTTOM_START"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/budiyev/android/codescanner/ButtonPosition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/budiyev/android/codescanner/ButtonPosition;->BOTTOM_START:Lcom/budiyev/android/codescanner/ButtonPosition;

    .line 15
    new-instance v0, Lcom/budiyev/android/codescanner/ButtonPosition;

    const-string v1, "BOTTOM_END"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/budiyev/android/codescanner/ButtonPosition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/budiyev/android/codescanner/ButtonPosition;->BOTTOM_END:Lcom/budiyev/android/codescanner/ButtonPosition;

    .line 11
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/budiyev/android/codescanner/ButtonPosition;

    sget-object v1, Lcom/budiyev/android/codescanner/ButtonPosition;->TOP_START:Lcom/budiyev/android/codescanner/ButtonPosition;

    aput-object v1, v0, v2

    sget-object v1, Lcom/budiyev/android/codescanner/ButtonPosition;->TOP_END:Lcom/budiyev/android/codescanner/ButtonPosition;

    aput-object v1, v0, v3

    sget-object v1, Lcom/budiyev/android/codescanner/ButtonPosition;->BOTTOM_START:Lcom/budiyev/android/codescanner/ButtonPosition;

    aput-object v1, v0, v4

    sget-object v1, Lcom/budiyev/android/codescanner/ButtonPosition;->BOTTOM_END:Lcom/budiyev/android/codescanner/ButtonPosition;

    aput-object v1, v0, v5

    sput-object v0, Lcom/budiyev/android/codescanner/ButtonPosition;->$VALUES:[Lcom/budiyev/android/codescanner/ButtonPosition;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 11
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/budiyev/android/codescanner/ButtonPosition;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .line 11
    const-class v0, Lcom/budiyev/android/codescanner/ButtonPosition;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/budiyev/android/codescanner/ButtonPosition;

    return-object v0
.end method

.method public static values()[Lcom/budiyev/android/codescanner/ButtonPosition;
    .locals 1

    .line 11
    sget-object v0, Lcom/budiyev/android/codescanner/ButtonPosition;->$VALUES:[Lcom/budiyev/android/codescanner/ButtonPosition;

    invoke-virtual {v0}, [Lcom/budiyev/android/codescanner/ButtonPosition;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/budiyev/android/codescanner/ButtonPosition;

    return-object v0
.end method
