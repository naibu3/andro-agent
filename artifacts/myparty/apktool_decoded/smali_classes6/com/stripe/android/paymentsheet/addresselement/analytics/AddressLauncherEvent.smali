.class public abstract Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent;
.super Ljava/lang/Object;
.source "AddressLauncherEvent.kt"

# interfaces
.implements Lcom/stripe/android/core/networking/AnalyticsEvent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent$Companion;,
        Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent$Completed;,
        Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent$Show;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u0000 \u000c2\u00020\u0001:\u0003\n\u000b\u000cB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u0082\u0001\u0002\r\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent;",
        "Lcom/stripe/android/core/networking/AnalyticsEvent;",
        "<init>",
        "()V",
        "additionalParams",
        "",
        "",
        "",
        "getAdditionalParams",
        "()Ljava/util/Map;",
        "Show",
        "Completed",
        "Companion",
        "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent$Completed;",
        "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent$Show;",
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
.field public static final $stable:I = 0x0

.field public static final Companion:Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent$Companion;

.field public static final FIELD_ADDRESS_COUNTRY_CODE:Ljava/lang/String; = "address_country_code"

.field public static final FIELD_ADDRESS_DATA_BLOB:Ljava/lang/String; = "address_data_blob"

.field public static final FIELD_AUTO_COMPLETE_RESULT_SELECTED:Ljava/lang/String; = "auto_complete_result_selected"

.field public static final FIELD_EDIT_DISTANCE:Ljava/lang/String; = "edit_distance"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent;->Companion:Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getAdditionalParams()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method
