.class public abstract Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result;
.super Ljava/lang/Object;
.source "AutocompleteContract.kt"

# interfaces
.implements Lcom/stripe/android/view/ActivityStarter$Result;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Result"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result$Address;,
        Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result$EnterManually;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u000c\u001a\u00020\rH\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u0004\u0018\u00010\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000b\u0082\u0001\u0002\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result;",
        "Lcom/stripe/android/view/ActivityStarter$Result;",
        "<init>",
        "()V",
        "id",
        "",
        "getId",
        "()Ljava/lang/String;",
        "addressDetails",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
        "getAddressDetails",
        "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
        "toBundle",
        "Landroid/os/Bundle;",
        "EnterManually",
        "Address",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result$Address;",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result$EnterManually;",
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
.field public static final $stable:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getAddressDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;
.end method

.method public abstract getId()Ljava/lang/String;
.end method

.method public toBundle()Landroid/os/Bundle;
    .locals 3

    const/4 v0, 0x1

    .line 55
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "com.stripe.android.paymentsheet.addresselement.AutocompleteContract.extra_result"

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
