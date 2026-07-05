.class public final Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent;
.super Ljava/lang/Object;
.source "DaggerPassiveChallengeComponent.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent$Builder;,
        Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent$PassiveChallengeComponentImpl;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/stripe/android/challenge/PassiveChallengeComponent$Builder;
    .locals 2

    .line 30
    new-instance v0, Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent$Builder;-><init>(Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent-IA;)V

    return-object v0
.end method
