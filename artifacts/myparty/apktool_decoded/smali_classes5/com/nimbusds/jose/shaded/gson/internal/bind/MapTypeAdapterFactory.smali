.class public final Lcom/nimbusds/jose/shaded/gson/internal/bind/MapTypeAdapterFactory;
.super Ljava/lang/Object;
.source "MapTypeAdapterFactory.java"

# interfaces
.implements Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nimbusds/jose/shaded/gson/internal/bind/MapTypeAdapterFactory$Adapter;
    }
.end annotation


# instance fields
.field final complexMapKeySerialization:Z

.field private final constructorConstructor:Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;


# direct methods
.method public constructor <init>(Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;Z)V
    .locals 0

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 121
    iput-object p1, p0, Lcom/nimbusds/jose/shaded/gson/internal/bind/MapTypeAdapterFactory;->constructorConstructor:Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;

    .line 122
    iput-boolean p2, p0, Lcom/nimbusds/jose/shaded/gson/internal/bind/MapTypeAdapterFactory;->complexMapKeySerialization:Z

    return-void
.end method

.method private getKeyAdapter(Lcom/nimbusds/jose/shaded/gson/Gson;Ljava/lang/reflect/Type;)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/shaded/gson/Gson;",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lcom/nimbusds/jose/shaded/gson/TypeAdapter<",
            "*>;"
        }
    .end annotation

    .line 149
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq p2, v0, :cond_1

    const-class v0, Ljava/lang/Boolean;

    if-ne p2, v0, :cond_0

    goto :goto_0

    .line 151
    :cond_0
    invoke-static {p2}, Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/nimbusds/jose/shaded/gson/Gson;->getAdapter(Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    move-result-object p1

    return-object p1

    .line 150
    :cond_1
    :goto_0
    sget-object p1, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->BOOLEAN_AS_STRING:Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    return-object p1
.end method


# virtual methods
.method public create(Lcom/nimbusds/jose/shaded/gson/Gson;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/nimbusds/jose/shaded/gson/Gson;",
            "Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken<",
            "TT;>;)",
            "Lcom/nimbusds/jose/shaded/gson/TypeAdapter<",
            "TT;>;"
        }
    .end annotation

    .line 127
    invoke-virtual {p2}, Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 129
    invoke-virtual {p2}, Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object v1

    .line 130
    const-class v2, Ljava/util/Map;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 134
    :cond_0
    invoke-static {v0, v1}, Lcom/nimbusds/jose/shaded/gson/internal/$Gson$Types;->getMapKeyAndValueTypes(Ljava/lang/reflect/Type;Ljava/lang/Class;)[Ljava/lang/reflect/Type;

    move-result-object v0

    const/4 v1, 0x0

    .line 135
    aget-object v2, v0, v1

    invoke-direct {p0, p1, v2}, Lcom/nimbusds/jose/shaded/gson/internal/bind/MapTypeAdapterFactory;->getKeyAdapter(Lcom/nimbusds/jose/shaded/gson/Gson;Ljava/lang/reflect/Type;)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    move-result-object v7

    const/4 v2, 0x1

    .line 136
    aget-object v3, v0, v2

    invoke-static {v3}, Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/nimbusds/jose/shaded/gson/Gson;->getAdapter(Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    move-result-object v9

    .line 137
    iget-object v3, p0, Lcom/nimbusds/jose/shaded/gson/internal/bind/MapTypeAdapterFactory;->constructorConstructor:Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;

    invoke-virtual {v3, p2}, Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;->get(Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Lcom/nimbusds/jose/shaded/gson/internal/ObjectConstructor;

    move-result-object v10

    .line 141
    new-instance v3, Lcom/nimbusds/jose/shaded/gson/internal/bind/MapTypeAdapterFactory$Adapter;

    aget-object v6, v0, v1

    aget-object v8, v0, v2

    move-object v4, p0

    move-object v5, p1

    invoke-direct/range {v3 .. v10}, Lcom/nimbusds/jose/shaded/gson/internal/bind/MapTypeAdapterFactory$Adapter;-><init>(Lcom/nimbusds/jose/shaded/gson/internal/bind/MapTypeAdapterFactory;Lcom/nimbusds/jose/shaded/gson/Gson;Ljava/lang/reflect/Type;Lcom/nimbusds/jose/shaded/gson/TypeAdapter;Ljava/lang/reflect/Type;Lcom/nimbusds/jose/shaded/gson/TypeAdapter;Lcom/nimbusds/jose/shaded/gson/internal/ObjectConstructor;)V

    return-object v3
.end method
