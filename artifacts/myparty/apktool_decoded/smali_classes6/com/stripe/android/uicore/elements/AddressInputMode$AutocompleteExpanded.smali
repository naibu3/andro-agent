.class public final Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;
.super Lcom/stripe/android/uicore/elements/AddressInputMode;
.source "AddressInputMode.kt"

# interfaces
.implements Lcom/stripe/android/uicore/address/AutocompleteCapableInputMode;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/AddressInputMode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AutocompleteExpanded"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0008H\u00c6\u0003J\u000f\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u00c6\u0003JK\u0010\u001d\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0010\u0008\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u00c6\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020!2\u0008\u0010\"\u001a\u0004\u0018\u00010#H\u00d6\u0003J\t\u0010$\u001a\u00020\u001fH\u00d6\u0001J\t\u0010%\u001a\u00020\u0004H\u00d6\u0001J\u0016\u0010&\u001a\u00020\u000c2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u0008X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\u0008X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0014R\u001a\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006*"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;",
        "Lcom/stripe/android/uicore/elements/AddressInputMode;",
        "Lcom/stripe/android/uicore/address/AutocompleteCapableInputMode;",
        "googleApiKey",
        "",
        "autocompleteCountries",
        "",
        "phoneNumberConfig",
        "Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;",
        "nameConfig",
        "onNavigation",
        "Lkotlin/Function0;",
        "",
        "<init>",
        "(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lkotlin/jvm/functions/Function0;)V",
        "getGoogleApiKey",
        "()Ljava/lang/String;",
        "getAutocompleteCountries",
        "()Ljava/util/Set;",
        "getPhoneNumberConfig",
        "()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;",
        "getNameConfig",
        "getOnNavigation",
        "()Lkotlin/jvm/functions/Function0;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "describeContents",
        "",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
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

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;",
            ">;"
        }
    .end annotation
.end field


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

.field private final googleApiKey:Ljava/lang/String;

.field private final nameConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

.field private final onNavigation:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final phoneNumberConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded$Creator;

    invoke-direct {v0}, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->$stable:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;",
            "Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "phoneNumberConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameConfig"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigation"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 31
    invoke-direct {p0, v0}, Lcom/stripe/android/uicore/elements/AddressInputMode;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 26
    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->googleApiKey:Ljava/lang/String;

    .line 27
    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->autocompleteCountries:Ljava/util/Set;

    .line 28
    iput-object p3, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->phoneNumberConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    .line 29
    iput-object p4, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->nameConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    .line 30
    iput-object p5, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->onNavigation:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->googleApiKey:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->autocompleteCountries:Ljava/util/Set;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->phoneNumberConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->nameConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->onNavigation:Lkotlin/jvm/functions/Function0;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->copy(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->googleApiKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->autocompleteCountries:Ljava/util/Set;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->phoneNumberConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->nameConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    return-object v0
.end method

.method public final component5()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->onNavigation:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;",
            "Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;"
        }
    .end annotation

    const-string v0, "phoneNumberConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameConfig"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigation"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;-><init>(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lkotlin/jvm/functions/Function0;)V

    return-object v1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->googleApiKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->googleApiKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->autocompleteCountries:Ljava/util/Set;

    iget-object v3, p1, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->autocompleteCountries:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->phoneNumberConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iget-object v3, p1, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->phoneNumberConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->nameConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iget-object v3, p1, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->nameConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->onNavigation:Lkotlin/jvm/functions/Function0;

    iget-object p1, p1, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->onNavigation:Lkotlin/jvm/functions/Function0;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public getAutocompleteCountries()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 27
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->autocompleteCountries:Ljava/util/Set;

    return-object v0
.end method

.method public getGoogleApiKey()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->googleApiKey:Ljava/lang/String;

    return-object v0
.end method

.method public getNameConfig()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->nameConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    return-object v0
.end method

.method public getOnNavigation()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 30
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->onNavigation:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public getPhoneNumberConfig()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->phoneNumberConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->googleApiKey:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->autocompleteCountries:Ljava/util/Set;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->phoneNumberConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->nameConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->onNavigation:Lkotlin/jvm/functions/Function0;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public supportsAutoComplete(Ljava/lang/String;Z)Z
    .locals 0

    .line 23
    invoke-static {p0, p1, p2}, Lcom/stripe/android/uicore/address/AutocompleteCapableInputMode$DefaultImpls;->supportsAutoComplete(Lcom/stripe/android/uicore/address/AutocompleteCapableInputMode;Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->googleApiKey:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->autocompleteCountries:Ljava/util/Set;

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->phoneNumberConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iget-object v3, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->nameConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iget-object v4, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->onNavigation:Lkotlin/jvm/functions/Function0;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "AutocompleteExpanded(googleApiKey="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, ", autocompleteCountries="

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", phoneNumberConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", nameConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", onNavigation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->googleApiKey:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->autocompleteCountries:Ljava/util/Set;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    :goto_1
    iget-object p2, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->phoneNumberConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-virtual {p2}, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->nameConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-virtual {p2}, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;->onNavigation:Lkotlin/jvm/functions/Function0;

    check-cast p2, Ljava/io/Serializable;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    return-void
.end method
