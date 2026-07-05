.class public final Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent;
.super Ljava/lang/Object;
.source "DaggerAutocompleteViewModelFactoryComponent.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$Factory;,
        Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static factory()Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelFactoryComponent$Factory;
    .locals 2

    .line 49
    new-instance v0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$Factory;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$Factory;-><init>(Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent-IA;)V

    return-object v0
.end method
