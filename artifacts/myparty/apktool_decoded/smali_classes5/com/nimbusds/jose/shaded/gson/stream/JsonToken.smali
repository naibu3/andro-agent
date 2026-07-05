.class public final enum Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;
.super Ljava/lang/Enum;
.source "JsonToken.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

.field public static final enum BEGIN_ARRAY:Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

.field public static final enum BEGIN_OBJECT:Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

.field public static final enum BOOLEAN:Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

.field public static final enum END_ARRAY:Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

.field public static final enum END_DOCUMENT:Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

.field public static final enum END_OBJECT:Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

.field public static final enum NAME:Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

.field public static final enum NULL:Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

.field public static final enum NUMBER:Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

.field public static final enum STRING:Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 31
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    const-string v1, "BEGIN_ARRAY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;->BEGIN_ARRAY:Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    .line 37
    new-instance v1, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    const-string v2, "END_ARRAY"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;->END_ARRAY:Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    .line 43
    new-instance v2, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    const-string v3, "BEGIN_OBJECT"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;->BEGIN_OBJECT:Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    .line 49
    new-instance v3, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    const-string v4, "END_OBJECT"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;->END_OBJECT:Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    .line 55
    new-instance v4, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    const-string v5, "NAME"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;->NAME:Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    .line 58
    new-instance v5, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    const-string v6, "STRING"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;->STRING:Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    .line 63
    new-instance v6, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    const-string v7, "NUMBER"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;->NUMBER:Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    .line 66
    new-instance v7, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    const-string v8, "BOOLEAN"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9}, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;->BOOLEAN:Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    .line 69
    new-instance v8, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    const-string v9, "NULL"

    const/16 v10, 0x8

    invoke-direct {v8, v9, v10}, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;-><init>(Ljava/lang/String;I)V

    sput-object v8, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;->NULL:Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    .line 75
    new-instance v9, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    const-string v10, "END_DOCUMENT"

    const/16 v11, 0x9

    invoke-direct {v9, v10, v11}, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;->END_DOCUMENT:Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    .line 25
    filled-new-array/range {v0 .. v9}, [Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    move-result-object v0

    sput-object v0, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;->$VALUES:[Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 25
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;
    .locals 1

    .line 25
    const-class v0, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    return-object p0
.end method

.method public static values()[Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;
    .locals 1

    .line 25
    sget-object v0, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;->$VALUES:[Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    invoke-virtual {v0}, [Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    return-object v0
.end method
