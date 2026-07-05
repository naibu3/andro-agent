.class public final Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;
.super Ljava/lang/Object;
.source "AutocompleteAddressInteractor.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Config"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B)\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;",
        "",
        "googlePlacesApiKey",
        "",
        "autocompleteCountries",
        "",
        "isPlacesAvailable",
        "",
        "<init>",
        "(Ljava/lang/String;Ljava/util/Set;Z)V",
        "getGooglePlacesApiKey",
        "()Ljava/lang/String;",
        "getAutocompleteCountries",
        "()Ljava/util/Set;",
        "()Z",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final autocompleteCountries:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final googlePlacesApiKey:Ljava/lang/String;

.field private final isPlacesAvailable:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Set;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "autocompleteCountries"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;->googlePlacesApiKey:Ljava/lang/String;

    .line 16
    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;->autocompleteCountries:Ljava/util/Set;

    .line 17
    iput-boolean p3, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;->isPlacesAvailable:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/Set;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 17
    new-instance p3, Lcom/stripe/android/uicore/elements/DefaultIsPlacesAvailable;

    invoke-direct {p3}, Lcom/stripe/android/uicore/elements/DefaultIsPlacesAvailable;-><init>()V

    invoke-virtual {p3}, Lcom/stripe/android/uicore/elements/DefaultIsPlacesAvailable;->invoke()Z

    move-result p3

    .line 14
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;-><init>(Ljava/lang/String;Ljava/util/Set;Z)V

    return-void
.end method


# virtual methods
.method public final getAutocompleteCountries()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 16
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;->autocompleteCountries:Ljava/util/Set;

    return-object v0
.end method

.method public final getGooglePlacesApiKey()Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;->googlePlacesApiKey:Ljava/lang/String;

    return-object v0
.end method

.method public final isPlacesAvailable()Z
    .locals 1

    .line 17
    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;->isPlacesAvailable:Z

    return v0
.end method
