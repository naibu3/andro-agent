.class public final enum Lcom/nimbusds/jose/shaded/gson/Strictness;
.super Ljava/lang/Enum;
.source "Strictness.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/nimbusds/jose/shaded/gson/Strictness;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/nimbusds/jose/shaded/gson/Strictness;

.field public static final enum LEGACY_STRICT:Lcom/nimbusds/jose/shaded/gson/Strictness;

.field public static final enum LENIENT:Lcom/nimbusds/jose/shaded/gson/Strictness;

.field public static final enum STRICT:Lcom/nimbusds/jose/shaded/gson/Strictness;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 21
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/Strictness;

    const-string v1, "LENIENT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/nimbusds/jose/shaded/gson/Strictness;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nimbusds/jose/shaded/gson/Strictness;->LENIENT:Lcom/nimbusds/jose/shaded/gson/Strictness;

    .line 24
    new-instance v1, Lcom/nimbusds/jose/shaded/gson/Strictness;

    const-string v2, "LEGACY_STRICT"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/nimbusds/jose/shaded/gson/Strictness;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/nimbusds/jose/shaded/gson/Strictness;->LEGACY_STRICT:Lcom/nimbusds/jose/shaded/gson/Strictness;

    .line 27
    new-instance v2, Lcom/nimbusds/jose/shaded/gson/Strictness;

    const-string v3, "STRICT"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/nimbusds/jose/shaded/gson/Strictness;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/nimbusds/jose/shaded/gson/Strictness;->STRICT:Lcom/nimbusds/jose/shaded/gson/Strictness;

    .line 19
    filled-new-array {v0, v1, v2}, [Lcom/nimbusds/jose/shaded/gson/Strictness;

    move-result-object v0

    sput-object v0, Lcom/nimbusds/jose/shaded/gson/Strictness;->$VALUES:[Lcom/nimbusds/jose/shaded/gson/Strictness;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 19
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/nimbusds/jose/shaded/gson/Strictness;
    .locals 1

    .line 19
    const-class v0, Lcom/nimbusds/jose/shaded/gson/Strictness;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/nimbusds/jose/shaded/gson/Strictness;

    return-object p0
.end method

.method public static values()[Lcom/nimbusds/jose/shaded/gson/Strictness;
    .locals 1

    .line 19
    sget-object v0, Lcom/nimbusds/jose/shaded/gson/Strictness;->$VALUES:[Lcom/nimbusds/jose/shaded/gson/Strictness;

    invoke-virtual {v0}, [Lcom/nimbusds/jose/shaded/gson/Strictness;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/nimbusds/jose/shaded/gson/Strictness;

    return-object v0
.end method
