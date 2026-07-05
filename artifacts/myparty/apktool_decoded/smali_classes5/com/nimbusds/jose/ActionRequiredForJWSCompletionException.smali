.class public Lcom/nimbusds/jose/ActionRequiredForJWSCompletionException;
.super Lcom/nimbusds/jose/JOSEException;
.source "ActionRequiredForJWSCompletionException.java"


# instance fields
.field private final completableSigning:Lcom/nimbusds/jose/CompletableJWSObjectSigning;

.field private final option:Lcom/nimbusds/jose/JWSSignerOption;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/nimbusds/jose/JWSSignerOption;Lcom/nimbusds/jose/CompletableJWSObjectSigning;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Lcom/nimbusds/jose/JOSEException;-><init>(Ljava/lang/String;)V

    .line 53
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nimbusds/jose/JWSSignerOption;

    iput-object p1, p0, Lcom/nimbusds/jose/ActionRequiredForJWSCompletionException;->option:Lcom/nimbusds/jose/JWSSignerOption;

    .line 54
    invoke-static {p3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nimbusds/jose/CompletableJWSObjectSigning;

    iput-object p1, p0, Lcom/nimbusds/jose/ActionRequiredForJWSCompletionException;->completableSigning:Lcom/nimbusds/jose/CompletableJWSObjectSigning;

    return-void
.end method


# virtual methods
.method public getCompletableJWSObjectSigning()Lcom/nimbusds/jose/CompletableJWSObjectSigning;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/nimbusds/jose/ActionRequiredForJWSCompletionException;->completableSigning:Lcom/nimbusds/jose/CompletableJWSObjectSigning;

    return-object v0
.end method

.method public getTriggeringOption()Lcom/nimbusds/jose/JWSSignerOption;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/nimbusds/jose/ActionRequiredForJWSCompletionException;->option:Lcom/nimbusds/jose/JWSSignerOption;

    return-object v0
.end method
