.class Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor$1;
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

.field final synthetic val$type:Ljava/lang/reflect/Type;

.field final synthetic val$typeCreator:Lcom/nimbusds/jose/shaded/gson/InstanceCreator;


# direct methods
.method constructor <init>(Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;Lcom/nimbusds/jose/shaded/gson/InstanceCreator;Ljava/lang/reflect/Type;)V
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor$1;->this$0:Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;

    iput-object p2, p0, Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor$1;->val$typeCreator:Lcom/nimbusds/jose/shaded/gson/InstanceCreator;

    iput-object p3, p0, Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor$1;->val$type:Ljava/lang/reflect/Type;

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

    .line 109
    iget-object v0, p0, Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor$1;->val$typeCreator:Lcom/nimbusds/jose/shaded/gson/InstanceCreator;

    iget-object v1, p0, Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor$1;->val$type:Ljava/lang/reflect/Type;

    invoke-interface {v0, v1}, Lcom/nimbusds/jose/shaded/gson/InstanceCreator;->createInstance(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
