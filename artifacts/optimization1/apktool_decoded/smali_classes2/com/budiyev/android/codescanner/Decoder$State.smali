.class public final enum Lcom/budiyev/android/codescanner/Decoder$State;
.super Ljava/lang/Enum;
.source "Decoder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/budiyev/android/codescanner/Decoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/budiyev/android/codescanner/Decoder$State;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/budiyev/android/codescanner/Decoder$State;

.field public static final enum DECODED:Lcom/budiyev/android/codescanner/Decoder$State;

.field public static final enum DECODING:Lcom/budiyev/android/codescanner/Decoder$State;

.field public static final enum IDLE:Lcom/budiyev/android/codescanner/Decoder$State;

.field public static final enum INITIALIZED:Lcom/budiyev/android/codescanner/Decoder$State;

.field public static final enum STOPPED:Lcom/budiyev/android/codescanner/Decoder$State;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 158
    new-instance v0, Lcom/budiyev/android/codescanner/Decoder$State;

    const-string v1, "INITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/budiyev/android/codescanner/Decoder$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/budiyev/android/codescanner/Decoder$State;->INITIALIZED:Lcom/budiyev/android/codescanner/Decoder$State;

    .line 159
    new-instance v0, Lcom/budiyev/android/codescanner/Decoder$State;

    const-string v1, "IDLE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/budiyev/android/codescanner/Decoder$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/budiyev/android/codescanner/Decoder$State;->IDLE:Lcom/budiyev/android/codescanner/Decoder$State;

    .line 160
    new-instance v0, Lcom/budiyev/android/codescanner/Decoder$State;

    const-string v1, "DECODING"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/budiyev/android/codescanner/Decoder$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/budiyev/android/codescanner/Decoder$State;->DECODING:Lcom/budiyev/android/codescanner/Decoder$State;

    .line 161
    new-instance v0, Lcom/budiyev/android/codescanner/Decoder$State;

    const-string v1, "DECODED"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/budiyev/android/codescanner/Decoder$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/budiyev/android/codescanner/Decoder$State;->DECODED:Lcom/budiyev/android/codescanner/Decoder$State;

    .line 162
    new-instance v0, Lcom/budiyev/android/codescanner/Decoder$State;

    const-string v1, "STOPPED"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/budiyev/android/codescanner/Decoder$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/budiyev/android/codescanner/Decoder$State;->STOPPED:Lcom/budiyev/android/codescanner/Decoder$State;

    .line 157
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/budiyev/android/codescanner/Decoder$State;

    sget-object v1, Lcom/budiyev/android/codescanner/Decoder$State;->INITIALIZED:Lcom/budiyev/android/codescanner/Decoder$State;

    aput-object v1, v0, v2

    sget-object v1, Lcom/budiyev/android/codescanner/Decoder$State;->IDLE:Lcom/budiyev/android/codescanner/Decoder$State;

    aput-object v1, v0, v3

    sget-object v1, Lcom/budiyev/android/codescanner/Decoder$State;->DECODING:Lcom/budiyev/android/codescanner/Decoder$State;

    aput-object v1, v0, v4

    sget-object v1, Lcom/budiyev/android/codescanner/Decoder$State;->DECODED:Lcom/budiyev/android/codescanner/Decoder$State;

    aput-object v1, v0, v5

    sget-object v1, Lcom/budiyev/android/codescanner/Decoder$State;->STOPPED:Lcom/budiyev/android/codescanner/Decoder$State;

    aput-object v1, v0, v6

    sput-object v0, Lcom/budiyev/android/codescanner/Decoder$State;->$VALUES:[Lcom/budiyev/android/codescanner/Decoder$State;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 157
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/budiyev/android/codescanner/Decoder$State;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .line 157
    const-class v0, Lcom/budiyev/android/codescanner/Decoder$State;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/budiyev/android/codescanner/Decoder$State;

    return-object v0
.end method

.method public static values()[Lcom/budiyev/android/codescanner/Decoder$State;
    .locals 1

    .line 157
    sget-object v0, Lcom/budiyev/android/codescanner/Decoder$State;->$VALUES:[Lcom/budiyev/android/codescanner/Decoder$State;

    invoke-virtual {v0}, [Lcom/budiyev/android/codescanner/Decoder$State;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/budiyev/android/codescanner/Decoder$State;

    return-object v0
.end method
