.class public final Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;
.super Ljava/lang/Object;
.source "AddressLauncher.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAddressLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressLauncher.kt\ncom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,261:1\n1#2:262\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010\u0006\u001a\u00020\u00002\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0014\u0010\u0008\u001a\u00020\u00002\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tJ\u0010\u0010\u000b\u001a\u00020\u00002\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u00002\u0008\u0010\u000e\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000f\u001a\u00020\u00002\u0008\u0010\u000f\u001a\u0004\u0018\u00010\nJ\u0014\u0010\u0010\u001a\u00020\u00002\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\n0\tJ\u0012\u0010\u0011\u001a\u00020\u00002\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;",
        "",
        "<init>",
        "()V",
        "appearance",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;",
        "address",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
        "allowedCountries",
        "",
        "",
        "buttonTitle",
        "additionalFields",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;",
        "title",
        "googlePlacesApiKey",
        "autocompleteCountries",
        "billingAddress",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;",
        "build",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;",
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
.field public static final $stable:I = 0x8


# instance fields
.field private additionalFields:Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;

.field private address:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

.field private allowedCountries:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private appearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

.field private autocompleteCountries:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private billingAddress:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

.field private buttonTitle:Ljava/lang/String;

.field private googlePlacesApiKey:Ljava/lang/String;

.field private title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 155
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 156
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;-><init>()V

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->appearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    .line 158
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->allowedCountries:Ljava/util/Set;

    .line 163
    invoke-static {}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementDefaultsKt;->getAUTOCOMPLETE_DEFAULT_COUNTRIES()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->autocompleteCountries:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final additionalFields(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;)Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;
    .locals 1

    const-string v0, "additionalFields"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->additionalFields:Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;

    return-object p0
.end method

.method public final address(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;
    .locals 1

    .line 170
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->address:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    return-object p0
.end method

.method public final allowedCountries(Ljava/util/Set;)Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;"
        }
    .end annotation

    const-string v0, "allowedCountries"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->allowedCountries:Ljava/util/Set;

    return-object p0
.end method

.method public final appearance(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;)Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;
    .locals 1

    const-string v0, "appearance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->appearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    return-object p0
.end method

.method public final autocompleteCountries(Ljava/util/Set;)Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;"
        }
    .end annotation

    const-string v0, "autocompleteCountries"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 188
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->autocompleteCountries:Ljava/util/Set;

    return-object p0
.end method

.method public final billingAddress(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;)Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;
    .locals 1

    .line 192
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->billingAddress:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    return-object p0
.end method

.method public final build()Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;
    .locals 10

    .line 194
    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;

    .line 195
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->appearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    .line 196
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->address:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    .line 197
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->allowedCountries:Ljava/util/Set;

    .line 198
    iget-object v4, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->buttonTitle:Ljava/lang/String;

    .line 199
    iget-object v5, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->additionalFields:Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;

    .line 200
    iget-object v6, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->title:Ljava/lang/String;

    .line 201
    iget-object v7, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->googlePlacesApiKey:Ljava/lang/String;

    .line 202
    iget-object v8, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->autocompleteCountries:Ljava/util/Set;

    .line 203
    iget-object v9, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->billingAddress:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    .line 194
    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;)V

    return-object v0
.end method

.method public final buttonTitle(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;
    .locals 1

    .line 176
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->buttonTitle:Ljava/lang/String;

    return-object p0
.end method

.method public final googlePlacesApiKey(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;
    .locals 1

    .line 185
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->googlePlacesApiKey:Ljava/lang/String;

    return-object p0
.end method

.method public final title(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;
    .locals 1

    .line 182
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->title:Ljava/lang/String;

    return-object p0
.end method
