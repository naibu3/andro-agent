.class public final Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher$Factory;
.super Ljava/lang/Object;
.source "AutocompleteLauncher.kt"

# interfaces
.implements Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivityLauncher$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\t\u0008\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher$Factory;",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivityLauncher$Factory;",
        "<init>",
        "()V",
        "create",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivityLauncher;",
        "appearanceContext",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;",
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

.method public constructor <init>()V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 192
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;)Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivityLauncher;
    .locals 1

    const-string v0, "appearanceContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;)V

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivityLauncher;

    return-object v0
.end method
