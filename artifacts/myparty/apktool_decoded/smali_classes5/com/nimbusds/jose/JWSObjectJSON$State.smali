.class public final enum Lcom/nimbusds/jose/JWSObjectJSON$State;
.super Ljava/lang/Enum;
.source "JWSObjectJSON.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nimbusds/jose/JWSObjectJSON;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/nimbusds/jose/JWSObjectJSON$State;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/nimbusds/jose/JWSObjectJSON$State;

.field public static final enum SIGNED:Lcom/nimbusds/jose/JWSObjectJSON$State;

.field public static final enum UNSIGNED:Lcom/nimbusds/jose/JWSObjectJSON$State;

.field public static final enum VERIFIED:Lcom/nimbusds/jose/JWSObjectJSON$State;


# direct methods
.method private static synthetic $values()[Lcom/nimbusds/jose/JWSObjectJSON$State;
    .locals 3

    .line 230
    sget-object v0, Lcom/nimbusds/jose/JWSObjectJSON$State;->UNSIGNED:Lcom/nimbusds/jose/JWSObjectJSON$State;

    sget-object v1, Lcom/nimbusds/jose/JWSObjectJSON$State;->SIGNED:Lcom/nimbusds/jose/JWSObjectJSON$State;

    sget-object v2, Lcom/nimbusds/jose/JWSObjectJSON$State;->VERIFIED:Lcom/nimbusds/jose/JWSObjectJSON$State;

    filled-new-array {v0, v1, v2}, [Lcom/nimbusds/jose/JWSObjectJSON$State;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 236
    new-instance v0, Lcom/nimbusds/jose/JWSObjectJSON$State;

    const-string v1, "UNSIGNED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/nimbusds/jose/JWSObjectJSON$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nimbusds/jose/JWSObjectJSON$State;->UNSIGNED:Lcom/nimbusds/jose/JWSObjectJSON$State;

    .line 243
    new-instance v0, Lcom/nimbusds/jose/JWSObjectJSON$State;

    const-string v1, "SIGNED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/nimbusds/jose/JWSObjectJSON$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nimbusds/jose/JWSObjectJSON$State;->SIGNED:Lcom/nimbusds/jose/JWSObjectJSON$State;

    .line 249
    new-instance v0, Lcom/nimbusds/jose/JWSObjectJSON$State;

    const-string v1, "VERIFIED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/nimbusds/jose/JWSObjectJSON$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nimbusds/jose/JWSObjectJSON$State;->VERIFIED:Lcom/nimbusds/jose/JWSObjectJSON$State;

    .line 230
    invoke-static {}, Lcom/nimbusds/jose/JWSObjectJSON$State;->$values()[Lcom/nimbusds/jose/JWSObjectJSON$State;

    move-result-object v0

    sput-object v0, Lcom/nimbusds/jose/JWSObjectJSON$State;->$VALUES:[Lcom/nimbusds/jose/JWSObjectJSON$State;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 230
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/nimbusds/jose/JWSObjectJSON$State;
    .locals 1

    .line 230
    const-class v0, Lcom/nimbusds/jose/JWSObjectJSON$State;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/nimbusds/jose/JWSObjectJSON$State;

    return-object p0
.end method

.method public static values()[Lcom/nimbusds/jose/JWSObjectJSON$State;
    .locals 1

    .line 230
    sget-object v0, Lcom/nimbusds/jose/JWSObjectJSON$State;->$VALUES:[Lcom/nimbusds/jose/JWSObjectJSON$State;

    invoke-virtual {v0}, [Lcom/nimbusds/jose/JWSObjectJSON$State;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/nimbusds/jose/JWSObjectJSON$State;

    return-object v0
.end method
