.class public final Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;
.super Ljava/lang/Object;
.source "PaymentOptionsStateFactory.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPaymentOptionsStateFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentOptionsStateFactory.kt\ncom/stripe/android/paymentsheet/PaymentOptionsStateFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,107:1\n1#2:108\n1557#3:109\n1628#3,3:110\n*S KotlinDebug\n*F\n+ 1 PaymentOptionsStateFactory.kt\ncom/stripe/android/paymentsheet/PaymentOptionsStateFactory\n*L\n27#1:109\n27#1:110,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JX\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u001a\u0010\u000c\u001a\u0016\u0012\u000c\u0012\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0004\u0012\u00020\u00100\r2\u0006\u0010\u0011\u001a\u00020\n2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u000eJ \u0010\u0013\u001a\u0004\u0018\u00010\u00062\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\\\u0010\u0017\u001a\u00020\u00182\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u001a\u0010\u000c\u001a\u0016\u0012\u000c\u0012\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0004\u0012\u00020\u00100\r2\u0006\u0010\u0011\u001a\u00020\n2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;",
        "",
        "<init>",
        "()V",
        "createPaymentOptionsList",
        "",
        "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
        "paymentMethods",
        "Lcom/stripe/android/model/PaymentMethod;",
        "showGooglePay",
        "",
        "showLink",
        "nameProvider",
        "Lkotlin/Function1;",
        "",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "isCbcEligible",
        "defaultPaymentMethodId",
        "getSelectedItem",
        "items",
        "currentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "create",
        "Lcom/stripe/android/paymentsheet/PaymentOptionsState;",
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

.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;->INSTANCE:Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Ljava/util/List;ZZLcom/stripe/android/paymentsheet/model/PaymentSelection;Lkotlin/jvm/functions/Function1;ZLjava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentOptionsState;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;ZZ",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "+",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;Z",
            "Ljava/lang/String;",
            ")",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsState;"
        }
    .end annotation

    const-string v0, "paymentMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameProvider"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p5

    move v6, p6

    move-object v7, p7

    .line 57
    invoke-virtual/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;->createPaymentOptionsList(Ljava/util/List;ZZLkotlin/jvm/functions/Function1;ZLjava/lang/String;)Ljava/util/List;

    move-result-object p1

    .line 66
    invoke-virtual {p0, p1, p4}, Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;->getSelectedItem(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    move-result-object p2

    .line 68
    new-instance p3, Lcom/stripe/android/paymentsheet/PaymentOptionsState;

    invoke-direct {p3, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentOptionsState;-><init>(Ljava/util/List;Lcom/stripe/android/paymentsheet/PaymentOptionsItem;)V

    return-object p3
.end method

.method public final createPaymentOptionsList(Ljava/util/List;ZZLkotlin/jvm/functions/Function1;ZLjava/lang/String;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;ZZ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "+",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;Z",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
            ">;"
        }
    .end annotation

    const-string v0, "paymentMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    .line 24
    new-array v0, v0, [Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$AddCard;->INSTANCE:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$AddCard;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 25
    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$GooglePay;->INSTANCE:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$GooglePay;

    const/4 v3, 0x0

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    const/4 p2, 0x1

    aput-object v1, v0, p2

    .line 26
    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$Link;->INSTANCE:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$Link;

    if-eqz p3, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v3

    :goto_1
    const/4 p3, 0x2

    aput-object v1, v0, p3

    .line 23
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/util/Collection;

    .line 27
    check-cast p1, Ljava/lang/Iterable;

    .line 109
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 110
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 111
    check-cast v1, Lcom/stripe/android/model/PaymentMethod;

    .line 28
    new-instance v4, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;

    .line 29
    sget-object v5, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->Companion:Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod$Companion;

    .line 30
    iget-object v6, v1, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    if-eqz v6, :cond_2

    iget-object v6, v6, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    goto :goto_3

    :cond_2
    move-object v6, v3

    :goto_3
    invoke-interface {p4, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/stripe/android/core/strings/ResolvableString;

    .line 33
    iget-object v7, v1, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    if-eqz v7, :cond_3

    iget-object v7, v1, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {v7, p6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    move v7, p2

    goto :goto_4

    :cond_3
    move v7, v2

    .line 29
    :goto_4
    invoke-virtual {v5, v6, v1, p5, v7}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod$Companion;->create(Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/model/PaymentMethod;ZZ)Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object v1

    .line 28
    invoke-direct {v4, v1}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;-><init>(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)V

    .line 111
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 112
    :cond_4
    check-cast v0, Ljava/util/List;

    .line 109
    check-cast v0, Ljava/lang/Iterable;

    .line 23
    invoke-static {p3, v0}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final getSelectedItem(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/paymentsheet/PaymentOptionsItem;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
            ">;",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ")",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 44
    invoke-static {p1, p2}, Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactoryKt;->access$findSelectedItem(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
