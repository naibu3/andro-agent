.class public interface abstract Lcom/nimbusds/jose/shaded/gson/JsonSerializer;
.super Ljava/lang/Object;
.source "JsonSerializer.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract serialize(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/nimbusds/jose/shaded/gson/JsonSerializationContext;)Lcom/nimbusds/jose/shaded/gson/JsonElement;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/reflect/Type;",
            "Lcom/nimbusds/jose/shaded/gson/JsonSerializationContext;",
            ")",
            "Lcom/nimbusds/jose/shaded/gson/JsonElement;"
        }
    .end annotation
.end method
