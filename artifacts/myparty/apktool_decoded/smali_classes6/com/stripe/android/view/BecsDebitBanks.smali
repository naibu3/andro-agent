.class public final Lcom/stripe/android/view/BecsDebitBanks;
.super Ljava/lang/Object;
.source "BecsDebitBanks.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/BecsDebitBanks$Bank;,
        Lcom/stripe/android/view/BecsDebitBanks$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBecsDebitBanks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BecsDebitBanks.kt\ncom/stripe/android/view/BecsDebitBanks\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n1#2:63\n295#3,2:64\n*S KotlinDebug\n*F\n+ 1 BecsDebitBanks.kt\ncom/stripe/android/view/BecsDebitBanks\n*L\n27#1:64,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000 \u00122\u00020\u0001:\u0002\u0011\u0012B\u001f\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008B\u001b\u0008\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u000bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/view/BecsDebitBanks;",
        "",
        "banks",
        "",
        "Lcom/stripe/android/view/BecsDebitBanks$Bank;",
        "shouldIncludeTestBank",
        "",
        "<init>",
        "(Ljava/util/List;Z)V",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;Z)V",
        "getBanks$payments_core_release",
        "()Ljava/util/List;",
        "byPrefix",
        "bsb",
        "",
        "Bank",
        "Companion",
        "payments-core_release"
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

.field private static final Companion:Lcom/stripe/android/view/BecsDebitBanks$Companion;

.field private static final STRIPE_TEST_BANK:Lcom/stripe/android/view/BecsDebitBanks$Bank;


# instance fields
.field private final banks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/view/BecsDebitBanks$Bank;",
            ">;"
        }
    .end annotation
.end field

.field private final shouldIncludeTestBank:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/view/BecsDebitBanks$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/view/BecsDebitBanks$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/view/BecsDebitBanks;->Companion:Lcom/stripe/android/view/BecsDebitBanks$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/view/BecsDebitBanks;->$stable:I

    .line 56
    new-instance v0, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    .line 57
    const-string v1, "00"

    .line 58
    const-string v2, "Stripe Test Bank"

    .line 56
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/stripe/android/view/BecsDebitBanks;->STRIPE_TEST_BANK:Lcom/stripe/android/view/BecsDebitBanks$Bank;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    sget-object v0, Lcom/stripe/android/view/BecsDebitBanks;->Companion:Lcom/stripe/android/view/BecsDebitBanks$Companion;

    invoke-static {v0, p1}, Lcom/stripe/android/view/BecsDebitBanks$Companion;->access$createBanksData(Lcom/stripe/android/view/BecsDebitBanks$Companion;Landroid/content/Context;)Ljava/util/List;

    move-result-object p1

    .line 19
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/view/BecsDebitBanks;-><init>(Ljava/util/List;Z)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    .line 16
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/view/BecsDebitBanks;-><init>(Landroid/content/Context;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/view/BecsDebitBanks$Bank;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "banks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/stripe/android/view/BecsDebitBanks;->banks:Ljava/util/List;

    .line 14
    iput-boolean p2, p0, Lcom/stripe/android/view/BecsDebitBanks;->shouldIncludeTestBank:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    .line 12
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/view/BecsDebitBanks;-><init>(Ljava/util/List;Z)V

    return-void
.end method


# virtual methods
.method public final byPrefix(Ljava/lang/String;)Lcom/stripe/android/view/BecsDebitBanks$Bank;
    .locals 6

    const-string v0, "bsb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    iget-object v0, p0, Lcom/stripe/android/view/BecsDebitBanks;->banks:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    .line 26
    sget-object v1, Lcom/stripe/android/view/BecsDebitBanks;->STRIPE_TEST_BANK:Lcom/stripe/android/view/BecsDebitBanks$Bank;

    iget-boolean v2, p0, Lcom/stripe/android/view/BecsDebitBanks;->shouldIncludeTestBank:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 64
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    .line 28
    invoke-virtual {v2}, Lcom/stripe/android/view/BecsDebitBanks$Bank;->getPrefix()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-static {p1, v2, v4, v5, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v3, v1

    .line 65
    :cond_2
    check-cast v3, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    return-object v3
.end method

.method public final getBanks$payments_core_release()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/view/BecsDebitBanks$Bank;",
            ">;"
        }
    .end annotation

    .line 13
    iget-object v0, p0, Lcom/stripe/android/view/BecsDebitBanks;->banks:Ljava/util/List;

    return-object v0
.end method
