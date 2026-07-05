.class public final Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType$Companion;
.super Ljava/lang/Object;
.source "QTransactionType.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType$Companion;",
        "",
        "()V",
        "fromType",
        "Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;",
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

    invoke-direct {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromType$sdk_release(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "intro_renewed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 19
    :cond_0
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->IntroRenewed:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    goto :goto_1

    .line 14
    :sswitch_1
    const-string v0, "subscription_started"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 15
    :cond_1
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->SubscriptionStarted:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    goto :goto_1

    .line 14
    :sswitch_2
    const-string v0, "trial_started"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    .line 17
    :cond_2
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->TrialStarted:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    goto :goto_1

    .line 14
    :sswitch_3
    const-string v0, "intro_started"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    .line 18
    :cond_3
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->IntroStarted:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    goto :goto_1

    .line 14
    :sswitch_4
    const-string v0, "subscription_renewed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    .line 16
    :cond_4
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->SubscriptionRenewed:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    goto :goto_1

    .line 14
    :sswitch_5
    const-string v0, "non_consumable_purchase"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    .line 20
    :cond_5
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->NonConsumablePurchase:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    goto :goto_1

    .line 21
    :goto_0
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->Unknown:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    :goto_1
    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x7d22d915 -> :sswitch_5
        -0x3da4c536 -> :sswitch_4
        -0x3870de52 -> :sswitch_3
        -0x358a7fa8 -> :sswitch_2
        0x1028d35f -> :sswitch_1
        0x79c18919 -> :sswitch_0
    .end sparse-switch
.end method
