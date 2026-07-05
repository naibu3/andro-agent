.class public interface abstract Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher$Result;
.super Ljava/lang/Object;
.source "AutocompleteLauncher.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Result"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher$Result$EnterManually;,
        Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher$Result$OnBack;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u0082\u0001\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher$Result;",
        "Landroid/os/Parcelable;",
        "addressDetails",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
        "getAddressDetails",
        "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
        "EnterManually",
        "OnBack",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher$Result$EnterManually;",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher$Result$OnBack;",
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


# virtual methods
.method public abstract getAddressDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;
.end method
