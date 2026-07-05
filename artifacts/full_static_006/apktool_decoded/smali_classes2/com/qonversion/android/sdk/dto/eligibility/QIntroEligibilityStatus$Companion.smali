.class public final Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus$Companion;
.super Ljava/lang/Object;
.source "QIntroEligibilityStatus.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus$Companion$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus$Companion;",
        "",
        "()V",
        "fromProductType",
        "Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;",
        "productType",
        "Lcom/qonversion/android/sdk/dto/products/QProductType;",
        "fromType",
        "type",
        "",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromProductType(Lcom/qonversion/android/sdk/dto/products/QProductType;)Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;
    .locals 1

    const-string v0, "productType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    sget-object v0, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/products/QProductType;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    .line 26
    sget-object p1, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->Unknown:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 25
    :cond_1
    sget-object p1, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->NonIntroOrTrialProduct:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    goto :goto_0

    .line 24
    :cond_2
    sget-object p1, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->Ineligible:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    goto :goto_0

    .line 23
    :cond_3
    sget-object p1, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->Eligible:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    :goto_0
    return-object p1
.end method

.method public final fromType(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;
    .locals 2

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x3e7994b2

    if-eq v0, v1, :cond_3

    const v1, 0x5d2e28f

    if-eq v0, v1, :cond_2

    const v1, 0x36f97fa9

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "intro_or_trial_eligible"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 15
    :cond_1
    sget-object p1, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->Eligible:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    goto :goto_1

    .line 13
    :cond_2
    const-string v0, "non_intro_or_trial_product"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 14
    sget-object p1, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->NonIntroOrTrialProduct:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    goto :goto_1

    .line 13
    :cond_3
    const-string v0, "intro_or_trial_ineligible"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 17
    :cond_4
    :goto_0
    sget-object p1, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->Unknown:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    goto :goto_1

    .line 16
    :cond_5
    sget-object p1, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->Ineligible:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    :goto_1
    return-object p1
.end method
