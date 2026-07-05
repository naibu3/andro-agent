.class public Lcom/nimbusds/jose/util/Resource;
.super Ljava/lang/Object;
.source "Resource.java"


# annotations
.annotation runtime Lcom/nimbusds/jose/shaded/jcip/Immutable;
.end annotation


# instance fields
.field private final content:Ljava/lang/String;

.field private final contentType:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/nimbusds/jose/util/Resource;->content:Ljava/lang/String;

    .line 56
    iput-object p2, p0, Lcom/nimbusds/jose/util/Resource;->contentType:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getContent()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/nimbusds/jose/util/Resource;->content:Ljava/lang/String;

    return-object v0
.end method

.method public getContentType()Ljava/lang/String;
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/nimbusds/jose/util/Resource;->contentType:Ljava/lang/String;

    return-object v0
.end method
