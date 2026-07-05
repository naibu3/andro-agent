.class Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor$4;
.super Ljava/lang/Object;
.source "ConstructorConstructor.java"

# interfaces
.implements Lcom/nimbusds/jose/shaded/gson/internal/ObjectConstructor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;->get(Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Lcom/nimbusds/jose/shaded/gson/internal/ObjectConstructor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/nimbusds/jose/shaded/gson/internal/ObjectConstructor<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;

.field final synthetic val$message:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;Ljava/lang/String;)V
    .locals 0

    .line 170
    iput-object p1, p0, Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor$4;->this$0:Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;

    iput-object p2, p0, Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor$4;->val$message:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public construct()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 173
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/JsonIOException;

    iget-object v1, p0, Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor$4;->val$message:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/nimbusds/jose/shaded/gson/JsonIOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
