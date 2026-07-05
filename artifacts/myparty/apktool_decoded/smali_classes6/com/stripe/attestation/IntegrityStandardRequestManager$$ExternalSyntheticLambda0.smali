.class public final synthetic Lcom/stripe/attestation/IntegrityStandardRequestManager$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lcom/stripe/attestation/IntegrityStandardRequestManager;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/attestation/IntegrityStandardRequestManager;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/attestation/IntegrityStandardRequestManager$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/attestation/IntegrityStandardRequestManager;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/attestation/IntegrityStandardRequestManager$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/attestation/IntegrityStandardRequestManager;

    invoke-static {v0}, Lcom/stripe/attestation/IntegrityStandardRequestManager;->$r8$lambda$IriHsaRhNuyC6FHuQ7cqhnmNsbE(Lcom/stripe/attestation/IntegrityStandardRequestManager;)Lcom/google/android/play/core/integrity/StandardIntegrityManager;

    move-result-object v0

    return-object v0
.end method
