.class Lcom/nimbusds/jose/shaded/gson/internal/Excluder$1;
.super Lcom/nimbusds/jose/shaded/gson/TypeAdapter;
.source "Excluder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nimbusds/jose/shaded/gson/internal/Excluder;->create(Lcom/nimbusds/jose/shaded/gson/Gson;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/nimbusds/jose/shaded/gson/TypeAdapter<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private volatile delegate:Lcom/nimbusds/jose/shaded/gson/TypeAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nimbusds/jose/shaded/gson/TypeAdapter<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

.field final synthetic val$gson:Lcom/nimbusds/jose/shaded/gson/Gson;

.field final synthetic val$skipDeserialize:Z

.field final synthetic val$skipSerialize:Z

.field final synthetic val$type:Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;


# direct methods
.method constructor <init>(Lcom/nimbusds/jose/shaded/gson/internal/Excluder;ZZLcom/nimbusds/jose/shaded/gson/Gson;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/nimbusds/jose/shaded/gson/internal/Excluder$1;->this$0:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    iput-boolean p2, p0, Lcom/nimbusds/jose/shaded/gson/internal/Excluder$1;->val$skipDeserialize:Z

    iput-boolean p3, p0, Lcom/nimbusds/jose/shaded/gson/internal/Excluder$1;->val$skipSerialize:Z

    iput-object p4, p0, Lcom/nimbusds/jose/shaded/gson/internal/Excluder$1;->val$gson:Lcom/nimbusds/jose/shaded/gson/Gson;

    iput-object p5, p0, Lcom/nimbusds/jose/shaded/gson/internal/Excluder$1;->val$type:Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;

    invoke-direct {p0}, Lcom/nimbusds/jose/shaded/gson/TypeAdapter;-><init>()V

    return-void
.end method

.method private delegate()Lcom/nimbusds/jose/shaded/gson/TypeAdapter;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/nimbusds/jose/shaded/gson/TypeAdapter<",
            "TT;>;"
        }
    .end annotation

    .line 149
    iget-object v0, p0, Lcom/nimbusds/jose/shaded/gson/internal/Excluder$1;->delegate:Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    if-eqz v0, :cond_0

    return-object v0

    .line 150
    :cond_0
    iget-object v0, p0, Lcom/nimbusds/jose/shaded/gson/internal/Excluder$1;->val$gson:Lcom/nimbusds/jose/shaded/gson/Gson;

    iget-object v1, p0, Lcom/nimbusds/jose/shaded/gson/internal/Excluder$1;->this$0:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    iget-object v2, p0, Lcom/nimbusds/jose/shaded/gson/internal/Excluder$1;->val$type:Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;

    invoke-virtual {v0, v1, v2}, Lcom/nimbusds/jose/shaded/gson/Gson;->getDelegateAdapter(Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    move-result-object v0

    iput-object v0, p0, Lcom/nimbusds/jose/shaded/gson/internal/Excluder$1;->delegate:Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    return-object v0
.end method


# virtual methods
.method public read(Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 130
    iget-boolean v0, p0, Lcom/nimbusds/jose/shaded/gson/internal/Excluder$1;->val$skipDeserialize:Z

    if-eqz v0, :cond_0

    .line 131
    invoke-virtual {p1}, Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;->skipValue()V

    const/4 p1, 0x0

    return-object p1

    .line 134
    :cond_0
    invoke-direct {p0}, Lcom/nimbusds/jose/shaded/gson/internal/Excluder$1;->delegate()Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/nimbusds/jose/shaded/gson/TypeAdapter;->read(Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public write(Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;",
            "TT;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 139
    iget-boolean v0, p0, Lcom/nimbusds/jose/shaded/gson/internal/Excluder$1;->val$skipSerialize:Z

    if-eqz v0, :cond_0

    .line 140
    invoke-virtual {p1}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->nullValue()Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;

    return-void

    .line 143
    :cond_0
    invoke-direct {p0}, Lcom/nimbusds/jose/shaded/gson/internal/Excluder$1;->delegate()Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/nimbusds/jose/shaded/gson/TypeAdapter;->write(Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;Ljava/lang/Object;)V

    return-void
.end method
