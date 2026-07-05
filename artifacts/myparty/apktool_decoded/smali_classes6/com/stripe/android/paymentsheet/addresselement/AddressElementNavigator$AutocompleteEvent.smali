.class public interface abstract Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator$AutocompleteEvent;
.super Ljava/lang/Object;
.source "AddressElementNavigator.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "AutocompleteEvent"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator$AutocompleteEvent$Companion;,
        Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator$AutocompleteEvent$OnBack;,
        Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator$AutocompleteEvent$OnEnterManually;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u0000 \u00082\u00020\u0001:\u0003\u0006\u0007\u0008R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u0082\u0001\u0002\t\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator$AutocompleteEvent;",
        "Landroid/os/Parcelable;",
        "addressDetails",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
        "getAddressDetails",
        "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
        "OnBack",
        "OnEnterManually",
        "Companion",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator$AutocompleteEvent$OnBack;",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator$AutocompleteEvent$OnEnterManually;",
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
.field public static final Companion:Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator$AutocompleteEvent$Companion;

.field public static final KEY:Ljava/lang/String; = "AutocompleteEvent"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator$AutocompleteEvent$Companion;->$$INSTANCE:Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator$AutocompleteEvent$Companion;

    sput-object v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator$AutocompleteEvent;->Companion:Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator$AutocompleteEvent$Companion;

    return-void
.end method


# virtual methods
.method public abstract getAddressDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;
.end method
