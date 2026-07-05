.class public final Lcom/stripe/android/core/utils/FeatureFlag;
.super Ljava/lang/Object;
.source "FeatureFlags.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/core/utils/FeatureFlag$Flag;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\tJ\u0006\u0010\u0013\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0012\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\nR\u0011\u0010\u000b\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\r\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/core/utils/FeatureFlag;",
        "",
        "name",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "getName",
        "()Ljava/lang/String;",
        "overrideEnabledValue",
        "",
        "Ljava/lang/Boolean;",
        "isEnabled",
        "()Z",
        "value",
        "Lcom/stripe/android/core/utils/FeatureFlag$Flag;",
        "getValue",
        "()Lcom/stripe/android/core/utils/FeatureFlag$Flag;",
        "setEnabled",
        "",
        "reset",
        "Flag",
        "stripe-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final name:Ljava/lang/String;

.field private overrideEnabledValue:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/stripe/android/core/utils/FeatureFlag;->name:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/stripe/android/core/utils/FeatureFlag;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue()Lcom/stripe/android/core/utils/FeatureFlag$Flag;
    .locals 1

    .line 35
    sget-object v0, Lcom/stripe/android/core/utils/FeatureFlag$Flag$NotSet;->INSTANCE:Lcom/stripe/android/core/utils/FeatureFlag$Flag$NotSet;

    check-cast v0, Lcom/stripe/android/core/utils/FeatureFlag$Flag;

    return-object v0
.end method

.method public final isEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final reset()V
    .locals 1

    const/4 v0, 0x0

    .line 49
    iput-object v0, p0, Lcom/stripe/android/core/utils/FeatureFlag;->overrideEnabledValue:Ljava/lang/Boolean;

    return-void
.end method

.method public final setEnabled(Z)V
    .locals 0

    .line 45
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/core/utils/FeatureFlag;->overrideEnabledValue:Ljava/lang/Boolean;

    return-void
.end method
