.class public final synthetic Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda8;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lcom/google/android/ump/ConsentInformation$OnConsentInfoUpdateFailureListener;


# instance fields
.field public final synthetic f$0:Lcordova/plugin/consent/ExecuteContext;


# direct methods
.method public synthetic constructor <init>(Lcordova/plugin/consent/ExecuteContext;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda8;->f$0:Lcordova/plugin/consent/ExecuteContext;

    return-void
.end method


# virtual methods
.method public final onConsentInfoUpdateFailure(Lcom/google/android/ump/FormError;)V
    .locals 1

    .line 0
    iget-object v0, p0, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda8;->f$0:Lcordova/plugin/consent/ExecuteContext;

    invoke-static {v0, p1}, Lcordova/plugin/consent/Consent;->lambda$executeRequestInfoUpdate$0(Lcordova/plugin/consent/ExecuteContext;Lcom/google/android/ump/FormError;)V

    return-void
.end method
