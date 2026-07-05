.class final Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent$Builder;
.super Ljava/lang/Object;
.source "DaggerPassiveChallengeComponent.java"

# interfaces
.implements Lcom/stripe/android/challenge/PassiveChallengeComponent$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Builder"
.end annotation


# instance fields
.field private passiveCaptchaParams:Lcom/stripe/android/model/PassiveCaptchaParams;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent-IA;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/stripe/android/challenge/PassiveChallengeComponent;
    .locals 3

    .line 44
    iget-object v0, p0, Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent$Builder;->passiveCaptchaParams:Lcom/stripe/android/model/PassiveCaptchaParams;

    const-class v1, Lcom/stripe/android/model/PassiveCaptchaParams;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 45
    new-instance v0, Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent$PassiveChallengeComponentImpl;

    iget-object v1, p0, Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent$Builder;->passiveCaptchaParams:Lcom/stripe/android/model/PassiveCaptchaParams;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent$PassiveChallengeComponentImpl;-><init>(Lcom/stripe/android/model/PassiveCaptchaParams;Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent-IA;)V

    return-object v0
.end method

.method public passiveCaptchaParams(Lcom/stripe/android/model/PassiveCaptchaParams;)Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent$Builder;
    .locals 0

    .line 38
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/PassiveCaptchaParams;

    iput-object p1, p0, Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent$Builder;->passiveCaptchaParams:Lcom/stripe/android/model/PassiveCaptchaParams;

    return-object p0
.end method

.method public bridge synthetic passiveCaptchaParams(Lcom/stripe/android/model/PassiveCaptchaParams;)Lcom/stripe/android/challenge/PassiveChallengeComponent$Builder;
    .locals 0

    .line 33
    invoke-virtual {p0, p1}, Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent$Builder;->passiveCaptchaParams(Lcom/stripe/android/model/PassiveCaptchaParams;)Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent$Builder;

    move-result-object p1

    return-object p1
.end method
