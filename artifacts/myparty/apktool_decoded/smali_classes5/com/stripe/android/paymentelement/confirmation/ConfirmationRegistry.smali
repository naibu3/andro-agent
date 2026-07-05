.class public final Lcom/stripe/android/paymentelement/confirmation/ConfirmationRegistry;
.super Ljava/lang/Object;
.source "ConfirmationRegistry.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nConfirmationRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfirmationRegistry.kt\ncom/stripe/android/paymentelement/confirmation/ConfirmationRegistry\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,22:1\n1053#2:23\n1557#2:24\n1628#2,3:25\n*S KotlinDebug\n*F\n+ 1 ConfirmationRegistry.kt\ncom/stripe/android/paymentelement/confirmation/ConfirmationRegistry\n*L\n15#1:23\n17#1:24\n17#1:25,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B%\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u00040\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J$\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u00080\u00032\u0006\u0010\t\u001a\u00020\nR$\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationRegistry;",
        "",
        "confirmationDefinitions",
        "",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;",
        "<init>",
        "(Ljava/util/List;)V",
        "createConfirmationMediators",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator;",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
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
.field private final confirmationDefinitions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition<",
            "****>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition<",
            "****>;>;)V"
        }
    .end annotation

    const-string v0, "confirmationDefinitions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationRegistry;->confirmationDefinitions:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final createConfirmationMediators(Landroidx/lifecycle/SavedStateHandle;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/SavedStateHandle;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator<",
            "****>;>;"
        }
    .end annotation

    const-string v0, "savedStateHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationRegistry;->confirmationDefinitions:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 23
    new-instance v1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationRegistry$createConfirmationMediators$$inlined$sortedBy$1;

    invoke-direct {v1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationRegistry$createConfirmationMediators$$inlined$sortedBy$1;-><init>()V

    check-cast v1, Ljava/util/Comparator;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 24
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 25
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 26
    check-cast v2, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;

    .line 18
    new-instance v3, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator;

    invoke-direct {v3, p1, v2}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator;-><init>(Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;)V

    .line 26
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 27
    :cond_0
    check-cast v1, Ljava/util/List;

    return-object v1
.end method
