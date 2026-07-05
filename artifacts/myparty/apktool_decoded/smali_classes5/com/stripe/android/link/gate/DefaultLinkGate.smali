.class public final Lcom/stripe/android/link/gate/DefaultLinkGate;
.super Ljava/lang/Object;
.source "DefaultLinkGate.kt"

# interfaces
.implements Lcom/stripe/android/link/gate/LinkGate;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/gate/DefaultLinkGate$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\tR\u0014\u0010\u000c\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\t\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/link/gate/DefaultLinkGate;",
        "Lcom/stripe/android/link/gate/LinkGate;",
        "configuration",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "<init>",
        "(Lcom/stripe/android/link/LinkConfiguration;)V",
        "useNativeLink",
        "",
        "getUseNativeLink",
        "()Z",
        "useAttestationEndpoints",
        "getUseAttestationEndpoints",
        "suppress2faModal",
        "getSuppress2faModal",
        "useInlineOtpInWalletButtons",
        "getUseInlineOtpInWalletButtons",
        "showRuxInFlowController",
        "getShowRuxInFlowController",
        "Factory",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final configuration:Lcom/stripe/android/link/LinkConfiguration;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/LinkConfiguration;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Lcom/stripe/android/link/gate/DefaultLinkGate;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    return-void
.end method


# virtual methods
.method public getShowRuxInFlowController()Z
    .locals 1

    .line 44
    invoke-virtual {p0}, Lcom/stripe/android/link/gate/DefaultLinkGate;->getUseNativeLink()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/link/gate/DefaultLinkGate;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkConfiguration;->getDisableRuxInFlowController()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getSuppress2faModal()Z
    .locals 1

    .line 37
    invoke-virtual {p0}, Lcom/stripe/android/link/gate/DefaultLinkGate;->getUseNativeLink()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/link/gate/DefaultLinkGate;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkConfiguration;->getSuppress2faModal()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public getUseAttestationEndpoints()Z
    .locals 2

    .line 25
    iget-object v0, p0, Lcom/stripe/android/link/gate/DefaultLinkGate;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkConfiguration;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v0

    invoke-interface {v0}, Lcom/stripe/android/model/StripeIntent;->isLiveMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 26
    iget-object v0, p0, Lcom/stripe/android/link/gate/DefaultLinkGate;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkConfiguration;->getUseAttestationEndpointsForLink()Z

    move-result v0

    return v0

    .line 28
    :cond_0
    sget-object v0, Lcom/stripe/android/core/utils/FeatureFlags;->INSTANCE:Lcom/stripe/android/core/utils/FeatureFlags;

    invoke-virtual {v0}, Lcom/stripe/android/core/utils/FeatureFlags;->getNativeLinkAttestationEnabled()Lcom/stripe/android/core/utils/FeatureFlag;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/core/utils/FeatureFlag;->getValue()Lcom/stripe/android/core/utils/FeatureFlag$Flag;

    move-result-object v0

    .line 29
    sget-object v1, Lcom/stripe/android/core/utils/FeatureFlag$Flag$Disabled;->INSTANCE:Lcom/stripe/android/core/utils/FeatureFlag$Flag$Disabled;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 30
    :cond_1
    sget-object v1, Lcom/stripe/android/core/utils/FeatureFlag$Flag$Enabled;->INSTANCE:Lcom/stripe/android/core/utils/FeatureFlag$Flag$Enabled;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v0, 0x1

    return v0

    .line 31
    :cond_2
    sget-object v1, Lcom/stripe/android/core/utils/FeatureFlag$Flag$NotSet;->INSTANCE:Lcom/stripe/android/core/utils/FeatureFlag$Flag$NotSet;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/stripe/android/link/gate/DefaultLinkGate;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkConfiguration;->getUseAttestationEndpointsForLink()Z

    move-result v0

    return v0

    .line 28
    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public getUseInlineOtpInWalletButtons()Z
    .locals 1

    .line 41
    sget-object v0, Lcom/stripe/android/core/utils/FeatureFlags;->INSTANCE:Lcom/stripe/android/core/utils/FeatureFlags;

    invoke-virtual {v0}, Lcom/stripe/android/core/utils/FeatureFlags;->getShowInlineOtpInWalletButtons()Lcom/stripe/android/core/utils/FeatureFlag;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/core/utils/FeatureFlag;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/link/gate/DefaultLinkGate;->getUseNativeLink()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getUseNativeLink()Z
    .locals 2

    .line 13
    iget-object v0, p0, Lcom/stripe/android/link/gate/DefaultLinkGate;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkConfiguration;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v0

    invoke-interface {v0}, Lcom/stripe/android/model/StripeIntent;->isLiveMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 14
    invoke-virtual {p0}, Lcom/stripe/android/link/gate/DefaultLinkGate;->getUseAttestationEndpoints()Z

    move-result v0

    return v0

    .line 16
    :cond_0
    sget-object v0, Lcom/stripe/android/core/utils/FeatureFlags;->INSTANCE:Lcom/stripe/android/core/utils/FeatureFlags;

    invoke-virtual {v0}, Lcom/stripe/android/core/utils/FeatureFlags;->getNativeLinkEnabled()Lcom/stripe/android/core/utils/FeatureFlag;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/core/utils/FeatureFlag;->getValue()Lcom/stripe/android/core/utils/FeatureFlag$Flag;

    move-result-object v0

    .line 17
    sget-object v1, Lcom/stripe/android/core/utils/FeatureFlag$Flag$Disabled;->INSTANCE:Lcom/stripe/android/core/utils/FeatureFlag$Flag$Disabled;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 18
    :cond_1
    sget-object v1, Lcom/stripe/android/core/utils/FeatureFlag$Flag$Enabled;->INSTANCE:Lcom/stripe/android/core/utils/FeatureFlag$Flag$Enabled;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v0, 0x1

    return v0

    .line 19
    :cond_2
    sget-object v1, Lcom/stripe/android/core/utils/FeatureFlag$Flag$NotSet;->INSTANCE:Lcom/stripe/android/core/utils/FeatureFlag$Flag$NotSet;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/stripe/android/link/gate/DefaultLinkGate;->getUseAttestationEndpoints()Z

    move-result v0

    return v0

    .line 16
    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
