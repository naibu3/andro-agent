.class public final synthetic Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter$WhenMappings;
.super Ljava/lang/Object;
.source "DefaultEventReporter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "WhenMappings"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/stripe/android/paymentsheet/analytics/EventReporter$CardBrandChoiceEventSource;->values()[Lcom/stripe/android/paymentsheet/analytics/EventReporter$CardBrandChoiceEventSource;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/stripe/android/paymentsheet/analytics/EventReporter$CardBrandChoiceEventSource;->Edit:Lcom/stripe/android/paymentsheet/analytics/EventReporter$CardBrandChoiceEventSource;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/analytics/EventReporter$CardBrandChoiceEventSource;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v1, Lcom/stripe/android/paymentsheet/analytics/EventReporter$CardBrandChoiceEventSource;->Add:Lcom/stripe/android/paymentsheet/analytics/EventReporter$CardBrandChoiceEventSource;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/analytics/EventReporter$CardBrandChoiceEventSource;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    sput-object v0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter$WhenMappings;->$EnumSwitchMapping$0:[I

    return-void
.end method
