.class public final Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType$Companion$listFrom$$inlined$compareBy$1;
.super Ljava/lang/Object;
.source "Comparisons.kt"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType$Companion;->listFrom(Lcom/stripe/android/model/ElementsSession;ZLcom/stripe/android/paymentsheet/state/LinkState;Z)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$3\n+ 2 WalletType.kt\ncom/stripe/android/lpmfoundations/paymentmethod/WalletType$Companion\n*L\n1#1,112:1\n45#2:113\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $comparator:Ljava/util/Comparator;

.field final synthetic $walletByIndex$inlined:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/util/Comparator;Ljava/util/Map;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType$Companion$listFrom$$inlined$compareBy$1;->$comparator:Ljava/util/Comparator;

    iput-object p2, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType$Companion$listFrom$$inlined$compareBy$1;->$walletByIndex$inlined:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation

    .line 112
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType$Companion$listFrom$$inlined$compareBy$1;->$comparator:Ljava/util/Comparator;

    check-cast p1, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;

    .line 113
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType$Companion$listFrom$$inlined$compareBy$1;->$walletByIndex$inlined:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    .line 112
    check-cast p2, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;

    .line 113
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType$Companion$listFrom$$inlined$compareBy$1;->$walletByIndex$inlined:Ljava/util/Map;

    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    .line 112
    invoke-interface {v0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
