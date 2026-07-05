.class final Lcom/nimbusds/jose/shaded/gson/internal/bind/TreeTypeAdapter$SingleTypeFactory;
.super Ljava/lang/Object;
.source "TreeTypeAdapter.java"

# interfaces
.implements Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nimbusds/jose/shaded/gson/internal/bind/TreeTypeAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "SingleTypeFactory"
.end annotation


# instance fields
.field private final deserializer:Lcom/nimbusds/jose/shaded/gson/JsonDeserializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nimbusds/jose/shaded/gson/JsonDeserializer<",
            "*>;"
        }
    .end annotation
.end field

.field private final exactType:Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken<",
            "*>;"
        }
    .end annotation
.end field

.field private final hierarchyType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final matchRawType:Z

.field private final serializer:Lcom/nimbusds/jose/shaded/gson/JsonSerializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nimbusds/jose/shaded/gson/JsonSerializer<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Object;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;ZLjava/lang/Class;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken<",
            "*>;Z",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 160
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 161
    instance-of v0, p1, Lcom/nimbusds/jose/shaded/gson/JsonSerializer;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/nimbusds/jose/shaded/gson/JsonSerializer;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iput-object v0, p0, Lcom/nimbusds/jose/shaded/gson/internal/bind/TreeTypeAdapter$SingleTypeFactory;->serializer:Lcom/nimbusds/jose/shaded/gson/JsonSerializer;

    .line 163
    instance-of v2, p1, Lcom/nimbusds/jose/shaded/gson/JsonDeserializer;

    if-eqz v2, :cond_1

    move-object v1, p1

    check-cast v1, Lcom/nimbusds/jose/shaded/gson/JsonDeserializer;

    :cond_1
    iput-object v1, p0, Lcom/nimbusds/jose/shaded/gson/internal/bind/TreeTypeAdapter$SingleTypeFactory;->deserializer:Lcom/nimbusds/jose/shaded/gson/JsonDeserializer;

    if-nez v0, :cond_3

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 p1, 0x1

    .line 164
    :goto_2
    invoke-static {p1}, Lcom/nimbusds/jose/shaded/gson/internal/$Gson$Preconditions;->checkArgument(Z)V

    .line 165
    iput-object p2, p0, Lcom/nimbusds/jose/shaded/gson/internal/bind/TreeTypeAdapter$SingleTypeFactory;->exactType:Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;

    .line 166
    iput-boolean p3, p0, Lcom/nimbusds/jose/shaded/gson/internal/bind/TreeTypeAdapter$SingleTypeFactory;->matchRawType:Z

    .line 167
    iput-object p4, p0, Lcom/nimbusds/jose/shaded/gson/internal/bind/TreeTypeAdapter$SingleTypeFactory;->hierarchyType:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public create(Lcom/nimbusds/jose/shaded/gson/Gson;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;
    .locals 7
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

    .line 174
    iget-object v0, p0, Lcom/nimbusds/jose/shaded/gson/internal/bind/TreeTypeAdapter$SingleTypeFactory;->exactType:Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;

    if-eqz v0, :cond_2

    .line 175
    invoke-virtual {v0, p2}, Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/nimbusds/jose/shaded/gson/internal/bind/TreeTypeAdapter$SingleTypeFactory;->matchRawType:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/nimbusds/jose/shaded/gson/internal/bind/TreeTypeAdapter$SingleTypeFactory;->exactType:Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;

    invoke-virtual {v0}, Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {p2}, Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    goto :goto_1

    .line 176
    :cond_2
    iget-object v0, p0, Lcom/nimbusds/jose/shaded/gson/internal/bind/TreeTypeAdapter$SingleTypeFactory;->hierarchyType:Ljava/lang/Class;

    invoke-virtual {p2}, Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    :goto_1
    if-eqz v0, :cond_3

    .line 178
    new-instance v1, Lcom/nimbusds/jose/shaded/gson/internal/bind/TreeTypeAdapter;

    iget-object v2, p0, Lcom/nimbusds/jose/shaded/gson/internal/bind/TreeTypeAdapter$SingleTypeFactory;->serializer:Lcom/nimbusds/jose/shaded/gson/JsonSerializer;

    iget-object v3, p0, Lcom/nimbusds/jose/shaded/gson/internal/bind/TreeTypeAdapter$SingleTypeFactory;->deserializer:Lcom/nimbusds/jose/shaded/gson/JsonDeserializer;

    move-object v6, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Lcom/nimbusds/jose/shaded/gson/internal/bind/TreeTypeAdapter;-><init>(Lcom/nimbusds/jose/shaded/gson/JsonSerializer;Lcom/nimbusds/jose/shaded/gson/JsonDeserializer;Lcom/nimbusds/jose/shaded/gson/Gson;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;)V

    return-object v1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method
