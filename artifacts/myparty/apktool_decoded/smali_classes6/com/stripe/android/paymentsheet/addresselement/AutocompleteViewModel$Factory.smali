.class public final Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;
.super Ljava/lang/Object;
.source "AutocompleteViewModel.kt"

# interfaces
.implements Landroidx/lifecycle/ViewModelProvider$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory$Type;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0016B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001f\u0008\u0016\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0004\u0010\u000bB\u0011\u0008\u0016\u0012\u0006\u0010\t\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0004\u0010\rJ-\u0010\u000e\u001a\u0002H\u000f\"\u0008\u0008\u0000\u0010\u000f*\u00020\u00102\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u0002H\u000f0\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;",
        "Landroidx/lifecycle/ViewModelProvider$Factory;",
        "type",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory$Type;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory$Type;)V",
        "autoCompleteViewModelSubcomponentBuilderProvider",
        "Ljavax/inject/Provider;",
        "Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent$Builder;",
        "args",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;",
        "(Ljavax/inject/Provider;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;)V",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;",
        "(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;)V",
        "create",
        "T",
        "Landroidx/lifecycle/ViewModel;",
        "modelClass",
        "Ljava/lang/Class;",
        "extras",
        "Landroidx/lifecycle/viewmodel/CreationExtras;",
        "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;",
        "Type",
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
.field private final type:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory$Type;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;)V
    .locals 1

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 216
    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory$Type$Isolated;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory$Type$Isolated;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;)V

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory$Type;

    .line 215
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory$Type;)V

    return-void
.end method

.method private constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory$Type;)V
    .locals 0

    .line 197
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 198
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;->type:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory$Type;

    return-void
.end method

.method public constructor <init>(Ljavax/inject/Provider;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent$Builder;",
            ">;",
            "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;",
            ")V"
        }
    .end annotation

    const-string v0, "autoCompleteViewModelSubcomponentBuilderProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory$Type$WithinAddressElement;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory$Type$WithinAddressElement;-><init>(Ljavax/inject/Provider;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;)V

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory$Type;

    .line 209
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory$Type;)V

    return-void
.end method


# virtual methods
.method public create(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/ViewModel;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Landroidx/lifecycle/viewmodel/CreationExtras;",
            ")TT;"
        }
    .end annotation

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;->type:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory$Type;

    invoke-interface {v0, p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory$Type;->create(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;

    move-result-object p1

    return-object p1
.end method
