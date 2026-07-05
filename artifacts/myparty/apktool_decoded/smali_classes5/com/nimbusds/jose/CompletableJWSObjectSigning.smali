.class public interface abstract Lcom/nimbusds/jose/CompletableJWSObjectSigning;
.super Ljava/lang/Object;
.source "CompletableJWSObjectSigning.java"


# virtual methods
.method public abstract complete()Lcom/nimbusds/jose/util/Base64URL;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;
        }
    .end annotation
.end method

.method public abstract getInitializedSignature()Ljava/security/Signature;
.end method
