.class public abstract Lcom/stripe/android/uicore/elements/AddressInputMode;
.super Ljava/lang/Object;
.source "AddressInputMode.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteCondensed;,
        Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;,
        Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0003\n\u000b\u000cB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u0012\u0010\u0008\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u0007\u0082\u0001\u0003\r\u000e\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/AddressInputMode;",
        "Landroid/os/Parcelable;",
        "<init>",
        "()V",
        "phoneNumberConfig",
        "Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;",
        "getPhoneNumberConfig",
        "()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;",
        "nameConfig",
        "getNameConfig",
        "AutocompleteCondensed",
        "AutocompleteExpanded",
        "NoAutocomplete",
        "Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteCondensed;",
        "Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;",
        "Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;",
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


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/uicore/elements/AddressInputMode;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getNameConfig()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;
.end method

.method public abstract getPhoneNumberConfig()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;
.end method
