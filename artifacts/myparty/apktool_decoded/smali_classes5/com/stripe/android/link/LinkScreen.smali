.class public abstract Lcom/stripe/android/link/LinkScreen;
.super Ljava/lang/Object;
.source "LinkScreen.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/LinkScreen$Companion;,
        Lcom/stripe/android/link/LinkScreen$Loading;,
        Lcom/stripe/android/link/LinkScreen$PaymentMethod;,
        Lcom/stripe/android/link/LinkScreen$SignUp;,
        Lcom/stripe/android/link/LinkScreen$UpdateCard;,
        Lcom/stripe/android/link/LinkScreen$Verification;,
        Lcom/stripe/android/link/LinkScreen$Wallet;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLinkScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkScreen.kt\ncom/stripe/android/link/LinkScreen\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,97:1\n1557#2:98\n1628#2,3:99\n1279#2,2:102\n1293#2,4:104\n*S KotlinDebug\n*F\n+ 1 LinkScreen.kt\ncom/stripe/android/link/LinkScreen\n*L\n17#1:98\n17#1:99,3\n17#1:102,2\n17#1:104,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u0000 \u00152\u00020\u0001:\u0007\u000f\u0010\u0011\u0012\u0013\u0014\u0015B!\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\u00038FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000c\u0010\n\u0082\u0001\u0006\u0016\u0017\u0018\u0019\u001a\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkScreen;",
        "",
        "baseRoute",
        "",
        "args",
        "",
        "Landroidx/navigation/NamedNavArgument;",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;)V",
        "getBaseRoute",
        "()Ljava/lang/String;",
        "route",
        "getRoute",
        "route$delegate",
        "Lkotlin/Lazy;",
        "Loading",
        "Verification",
        "Wallet",
        "PaymentMethod",
        "SignUp",
        "UpdateCard",
        "Companion",
        "Lcom/stripe/android/link/LinkScreen$Loading;",
        "Lcom/stripe/android/link/LinkScreen$PaymentMethod;",
        "Lcom/stripe/android/link/LinkScreen$SignUp;",
        "Lcom/stripe/android/link/LinkScreen$UpdateCard;",
        "Lcom/stripe/android/link/LinkScreen$Verification;",
        "Lcom/stripe/android/link/LinkScreen$Wallet;",
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

.field public static final Companion:Lcom/stripe/android/link/LinkScreen$Companion;

.field public static final EXTRA_BILLING_UPDATE_CVC:Ljava/lang/String; = "billing_update_cvc"

.field public static final EXTRA_IS_BILLING_UPDATE_FLOW:Ljava/lang/String; = "is_billing_update_flow"

.field public static final EXTRA_PAYMENT_DETAILS:Ljava/lang/String; = "payment_details"


# instance fields
.field private final args:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/navigation/NamedNavArgument;",
            ">;"
        }
    .end annotation
.end field

.field private final baseRoute:Ljava/lang/String;

.field private final route$delegate:Lkotlin/Lazy;


# direct methods
.method public static synthetic $r8$lambda$ueQ0hww3gsepEQq1ZfQk-2cvElY(Lcom/stripe/android/link/LinkScreen;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/LinkScreen;->route_delegate$lambda$2(Lcom/stripe/android/link/LinkScreen;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/link/LinkScreen$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/LinkScreen$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/LinkScreen;->Companion:Lcom/stripe/android/link/LinkScreen$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/link/LinkScreen;->$stable:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroidx/navigation/NamedNavArgument;",
            ">;)V"
        }
    .end annotation

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/stripe/android/link/LinkScreen;->baseRoute:Ljava/lang/String;

    .line 13
    iput-object p2, p0, Lcom/stripe/android/link/LinkScreen;->args:Ljava/util/List;

    .line 16
    new-instance p1, Lcom/stripe/android/link/LinkScreen$$ExternalSyntheticLambda0;

    invoke-direct {p1, p0}, Lcom/stripe/android/link/LinkScreen$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/link/LinkScreen;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/LinkScreen;->route$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 13
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    :cond_0
    const/4 p3, 0x0

    .line 11
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/link/LinkScreen;-><init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/LinkScreen;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method private static final route_delegate$lambda$2(Lcom/stripe/android/link/LinkScreen;)Ljava/lang/String;
    .locals 7

    .line 17
    iget-object v0, p0, Lcom/stripe/android/link/LinkScreen;->args:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 98
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 99
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 100
    check-cast v3, Landroidx/navigation/NamedNavArgument;

    .line 17
    invoke-virtual {v3}, Landroidx/navigation/NamedNavArgument;->getName()Ljava/lang/String;

    move-result-object v3

    .line 100
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 101
    :cond_0
    check-cast v1, Ljava/util/List;

    .line 98
    check-cast v1, Ljava/lang/Iterable;

    .line 102
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v2

    const/16 v3, 0x10

    invoke-static {v2, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 104
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 105
    move-object v3, v0

    check-cast v3, Ljava/util/Map;

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    .line 17
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "{"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "}"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 105
    invoke-interface {v3, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 107
    :cond_1
    check-cast v0, Ljava/util/Map;

    .line 18
    iget-object p0, p0, Lcom/stripe/android/link/LinkScreen;->baseRoute:Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/stripe/android/link/LinkScreenKt;->access$appendParamValues(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected final getBaseRoute()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/stripe/android/link/LinkScreen;->baseRoute:Ljava/lang/String;

    return-object v0
.end method

.method public final getRoute()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/stripe/android/link/LinkScreen;->route$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
