.class public final synthetic Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lcordova/plugin/consent/Consent;

.field public final synthetic f$1:Lcom/google/android/ump/ConsentForm;

.field public final synthetic f$2:Lcordova/plugin/consent/ExecuteContext;


# direct methods
.method public synthetic constructor <init>(Lcordova/plugin/consent/Consent;Lcom/google/android/ump/ConsentForm;Lcordova/plugin/consent/ExecuteContext;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda1;->f$0:Lcordova/plugin/consent/Consent;

    iput-object p2, p0, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda1;->f$1:Lcom/google/android/ump/ConsentForm;

    iput-object p3, p0, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda1;->f$2:Lcordova/plugin/consent/ExecuteContext;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 0
    iget-object v0, p0, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda1;->f$0:Lcordova/plugin/consent/Consent;

    iget-object v1, p0, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda1;->f$1:Lcom/google/android/ump/ConsentForm;

    iget-object v2, p0, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda1;->f$2:Lcordova/plugin/consent/ExecuteContext;

    invoke-virtual {v0, v1, v2}, Lcordova/plugin/consent/Consent;->lambda$executeShowForm$9$cordova-plugin-consent-Consent(Lcom/google/android/ump/ConsentForm;Lcordova/plugin/consent/ExecuteContext;)V

    return-void
.end method
