.class public final Lcom/nimbusds/jose/shaded/gson/JsonNull;
.super Lcom/nimbusds/jose/shaded/gson/JsonElement;
.source "JsonNull.java"


# static fields
.field public static final INSTANCE:Lcom/nimbusds/jose/shaded/gson/JsonNull;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/JsonNull;

    invoke-direct {v0}, Lcom/nimbusds/jose/shaded/gson/JsonNull;-><init>()V

    sput-object v0, Lcom/nimbusds/jose/shaded/gson/JsonNull;->INSTANCE:Lcom/nimbusds/jose/shaded/gson/JsonNull;

    return-void
.end method

.method public constructor <init>()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 40
    invoke-direct {p0}, Lcom/nimbusds/jose/shaded/gson/JsonElement;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic deepCopy()Lcom/nimbusds/jose/shaded/gson/JsonElement;
    .locals 1

    .line 26
    invoke-virtual {p0}, Lcom/nimbusds/jose/shaded/gson/JsonNull;->deepCopy()Lcom/nimbusds/jose/shaded/gson/JsonNull;

    move-result-object v0

    return-object v0
.end method

.method public deepCopy()Lcom/nimbusds/jose/shaded/gson/JsonNull;
    .locals 1

    .line 51
    sget-object v0, Lcom/nimbusds/jose/shaded/gson/JsonNull;->INSTANCE:Lcom/nimbusds/jose/shaded/gson/JsonNull;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    .line 63
    instance-of p1, p1, Lcom/nimbusds/jose/shaded/gson/JsonNull;

    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 57
    const-class v0, Lcom/nimbusds/jose/shaded/gson/JsonNull;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
