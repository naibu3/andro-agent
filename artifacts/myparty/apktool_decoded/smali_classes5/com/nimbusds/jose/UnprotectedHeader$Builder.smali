.class public Lcom/nimbusds/jose/UnprotectedHeader$Builder;
.super Ljava/lang/Object;
.source "UnprotectedHeader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nimbusds/jose/UnprotectedHeader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private final params:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 125
    invoke-static {}, Lcom/nimbusds/jose/util/JSONObjectUtils;->newJSONObject()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/nimbusds/jose/UnprotectedHeader$Builder;->params:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public build()Lcom/nimbusds/jose/UnprotectedHeader;
    .locals 3

    .line 173
    new-instance v0, Lcom/nimbusds/jose/UnprotectedHeader;

    iget-object v1, p0, Lcom/nimbusds/jose/UnprotectedHeader$Builder;->params:Ljava/util/Map;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/nimbusds/jose/UnprotectedHeader;-><init>(Ljava/util/Map;Lcom/nimbusds/jose/UnprotectedHeader$1;)V

    return-object v0
.end method

.method public keyID(Ljava/lang/String;)Lcom/nimbusds/jose/UnprotectedHeader$Builder;
    .locals 2

    .line 145
    iget-object v0, p0, Lcom/nimbusds/jose/UnprotectedHeader$Builder;->params:Ljava/util/Map;

    const-string v1, "kid"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public param(Ljava/lang/String;Ljava/lang/Object;)Lcom/nimbusds/jose/UnprotectedHeader$Builder;
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/nimbusds/jose/UnprotectedHeader$Builder;->params:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
