.class public abstract Lcom/stripe/android/model/SourceParams$TypeData;
.super Ljava/lang/Object;
.source "SourceParams.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/SourceParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "TypeData"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/SourceParams$TypeData$Bancontact;,
        Lcom/stripe/android/model/SourceParams$TypeData$Card;,
        Lcom/stripe/android/model/SourceParams$TypeData$Eps;,
        Lcom/stripe/android/model/SourceParams$TypeData$Giropay;,
        Lcom/stripe/android/model/SourceParams$TypeData$Ideal;,
        Lcom/stripe/android/model/SourceParams$TypeData$Masterpass;,
        Lcom/stripe/android/model/SourceParams$TypeData$SepaDebit;,
        Lcom/stripe/android/model/SourceParams$TypeData$Sofort;,
        Lcom/stripe/android/model/SourceParams$TypeData$ThreeDSecure;,
        Lcom/stripe/android/model/SourceParams$TypeData$VisaCheckout;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSourceParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SourceParams.kt\ncom/stripe/android/model/SourceParams$TypeData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1161:1\n1797#2,2:1162\n1799#2:1165\n1#3:1164\n*S KotlinDebug\n*F\n+ 1 SourceParams.kt\ncom/stripe/android/model/SourceParams$TypeData\n*L\n946#1:1162,2\n946#1:1165\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u00002\u00020\u0001:\n\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u000f0\u000fR\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R&\u0010\u0008\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n0\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u0082\u0001\n\u001a\u001b\u001c\u001d\u001e\u001f !\"#\u00a8\u0006$"
    }
    d2 = {
        "Lcom/stripe/android/model/SourceParams$TypeData;",
        "Landroid/os/Parcelable;",
        "<init>",
        "()V",
        "type",
        "",
        "getType",
        "()Ljava/lang/String;",
        "params",
        "",
        "Lkotlin/Pair;",
        "",
        "getParams",
        "()Ljava/util/List;",
        "createParams",
        "",
        "Card",
        "Eps",
        "Giropay",
        "Ideal",
        "Masterpass",
        "Sofort",
        "SepaDebit",
        "ThreeDSecure",
        "VisaCheckout",
        "Bancontact",
        "Lcom/stripe/android/model/SourceParams$TypeData$Bancontact;",
        "Lcom/stripe/android/model/SourceParams$TypeData$Card;",
        "Lcom/stripe/android/model/SourceParams$TypeData$Eps;",
        "Lcom/stripe/android/model/SourceParams$TypeData$Giropay;",
        "Lcom/stripe/android/model/SourceParams$TypeData$Ideal;",
        "Lcom/stripe/android/model/SourceParams$TypeData$Masterpass;",
        "Lcom/stripe/android/model/SourceParams$TypeData$SepaDebit;",
        "Lcom/stripe/android/model/SourceParams$TypeData$Sofort;",
        "Lcom/stripe/android/model/SourceParams$TypeData$ThreeDSecure;",
        "Lcom/stripe/android/model/SourceParams$TypeData$VisaCheckout;",
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


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 940
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/model/SourceParams$TypeData;-><init>()V

    return-void
.end method


# virtual methods
.method public final createParams()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 946
    invoke-virtual {p0}, Lcom/stripe/android/model/SourceParams$TypeData;->getParams()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 947
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    .line 1163
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/Pair;

    .line 948
    invoke-virtual {v2}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v2}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 950
    invoke-static {v4, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    :cond_0
    if-nez v3, :cond_1

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v3

    .line 949
    :cond_1
    invoke-static {v1, v3}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    goto :goto_0

    .line 952
    :cond_2
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    move-object v1, v3

    :goto_1
    if-eqz v1, :cond_4

    .line 954
    invoke-virtual {p0}, Lcom/stripe/android/model/SourceParams$TypeData;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 953
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    :cond_4
    if-nez v3, :cond_5

    .line 956
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_5
    return-object v3
.end method

.method public abstract getParams()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract getType()Ljava/lang/String;
.end method
