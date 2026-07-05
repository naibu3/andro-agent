.class public final Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState$Companion;
.super Ljava/lang/Object;
.source "QEntitlementRenewState.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState$Companion$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\u0008\u0007J\u0015\u0010\u0008\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0000\u00a2\u0006\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState$Companion;",
        "",
        "()V",
        "fromProductRenewState",
        "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;",
        "renewState",
        "Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;",
        "fromProductRenewState$sdk_release",
        "fromType",
        "type",
        "",
        "fromType$sdk_release",
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

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromProductRenewState$sdk_release(Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;)Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;
    .locals 1

    const-string v0, "renewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    sget-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    .line 29
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;->Unknown:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    goto :goto_0

    .line 28
    :cond_0
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;->BillingIssue:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    goto :goto_0

    .line 27
    :cond_1
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;->Canceled:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    goto :goto_0

    .line 26
    :cond_2
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;->WillRenew:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    goto :goto_0

    .line 25
    :cond_3
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;->NonRenewable:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    :goto_0
    return-object p1
.end method

.method public final fromType$sdk_release(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "will_renew"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 16
    :cond_0
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;->WillRenew:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    goto :goto_1

    .line 14
    :sswitch_1
    const-string v0, "canceled"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 17
    :cond_1
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;->Canceled:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    goto :goto_1

    .line 14
    :sswitch_2
    const-string v0, "non_renewable"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 15
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;->NonRenewable:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    goto :goto_1

    .line 14
    :sswitch_3
    const-string v0, "billing_issue"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    .line 18
    :cond_2
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;->BillingIssue:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    goto :goto_1

    .line 19
    :cond_3
    :goto_0
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;->Unknown:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    :goto_1
    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x46f4d9eb -> :sswitch_3
        -0x1bd5258b -> :sswitch_2
        -0x7577b67 -> :sswitch_1
        0x2ae777e0 -> :sswitch_0
    .end sparse-switch
.end method
