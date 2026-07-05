.class public Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;
.super Ljava/lang/Object;
.source "KeyRevocation.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nimbusds/jose/jwk/KeyRevocation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Reason"
.end annotation


# static fields
.field public static final COMPROMISED:Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;

.field public static final SUPERSEDED:Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;

.field public static final UNSPECIFIED:Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 50
    new-instance v0, Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;

    const-string v1, "unspecified"

    invoke-direct {v0, v1}, Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;->UNSPECIFIED:Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;

    .line 56
    new-instance v0, Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;

    const-string v1, "compromised"

    invoke-direct {v0, v1}, Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;->COMPROMISED:Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;

    .line 62
    new-instance v0, Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;

    const-string v1, "superseded"

    invoke-direct {v0, v1}, Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;->SUPERSEDED:Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;->value:Ljava/lang/String;

    return-void
.end method

.method public static parse(Ljava/lang/String;)Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;
    .locals 2

    .line 118
    sget-object v0, Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;->UNSPECIFIED:Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;

    invoke-virtual {v0}, Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 120
    :cond_0
    sget-object v0, Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;->COMPROMISED:Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;

    invoke-virtual {v0}, Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    .line 122
    :cond_1
    sget-object v0, Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;->SUPERSEDED:Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;

    invoke-virtual {v0}, Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    .line 125
    :cond_2
    new-instance v0, Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;

    invoke-direct {v0, p0}, Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 99
    :cond_0
    instance-of v0, p1, Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 100
    :cond_1
    check-cast p1, Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;

    .line 101
    invoke-virtual {p0}, Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;->value:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 106
    invoke-virtual {p0}, Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 93
    invoke-virtual {p0}, Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;->getValue()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
