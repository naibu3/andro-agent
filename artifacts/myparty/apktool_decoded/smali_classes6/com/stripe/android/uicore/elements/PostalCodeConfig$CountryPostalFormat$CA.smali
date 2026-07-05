.class public final Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$CA;
.super Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;
.source "PostalCodeConfig.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CA"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$CA;",
        "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;",
        "<init>",
        "()V",
        "stripe-ui-core_release"
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
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$CA;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$CA;

    invoke-direct {v0}, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$CA;-><init>()V

    sput-object v0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$CA;->INSTANCE:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$CA;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 103
    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "[a-zA-Z]\\d[a-zA-Z][\\s-]?\\d[a-zA-Z]\\d"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x6

    .line 100
    invoke-direct {p0, v2, v2, v0, v1}, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;-><init>(IILkotlin/text/Regex;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
