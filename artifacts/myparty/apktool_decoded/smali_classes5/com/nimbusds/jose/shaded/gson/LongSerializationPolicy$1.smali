.class final enum Lcom/nimbusds/jose/shaded/gson/LongSerializationPolicy$1;
.super Lcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;
.source "LongSerializationPolicy.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4010
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 34
    invoke-direct {p0, p1, p2, v0}, Lcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;-><init>(Ljava/lang/String;ILcom/nimbusds/jose/shaded/gson/LongSerializationPolicy$1;)V

    return-void
.end method


# virtual methods
.method public serialize(Ljava/lang/Long;)Lcom/nimbusds/jose/shaded/gson/JsonElement;
    .locals 1

    if-nez p1, :cond_0

    .line 38
    sget-object p1, Lcom/nimbusds/jose/shaded/gson/JsonNull;->INSTANCE:Lcom/nimbusds/jose/shaded/gson/JsonNull;

    return-object p1

    .line 40
    :cond_0
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/JsonPrimitive;

    invoke-direct {v0, p1}, Lcom/nimbusds/jose/shaded/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    return-object v0
.end method
