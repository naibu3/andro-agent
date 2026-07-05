.class public final Lcom/stripe/android/ui/core/elements/SimpleDropdownConfig;
.super Ljava/lang/Object;
.source "SimpleDropdownConfig.kt"

# interfaces
.implements Lcom/stripe/android/uicore/elements/DropdownConfig;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSimpleDropdownConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleDropdownConfig.kt\ncom/stripe/android/ui/core/elements/SimpleDropdownConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,26:1\n1557#2:27\n1628#2,3:28\n1557#2:31\n1628#2,3:32\n295#2,2:35\n*S KotlinDebug\n*F\n+ 1 SimpleDropdownConfig.kt\ncom/stripe/android/ui/core/elements/SimpleDropdownConfig\n*L\n14#1:27\n14#1:28,3\n16#1:31\n16#1:32,3\n22#1:35,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u0018\u001a\u00020\u000cH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u000cX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0011\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/SimpleDropdownConfig;",
        "Lcom/stripe/android/uicore/elements/DropdownConfig;",
        "label",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "items",
        "",
        "Lcom/stripe/android/ui/core/elements/DropdownItemSpec;",
        "<init>",
        "(Lcom/stripe/android/core/strings/ResolvableString;Ljava/util/List;)V",
        "getLabel",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "debugLabel",
        "",
        "getDebugLabel",
        "()Ljava/lang/String;",
        "rawItems",
        "getRawItems",
        "()Ljava/util/List;",
        "displayItems",
        "getDisplayItems",
        "getSelectedItemLabel",
        "index",
        "",
        "convertFromRaw",
        "rawValue",
        "payments-ui-core_release"
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
.field private final debugLabel:Ljava/lang/String;

.field private final displayItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/DropdownItemSpec;",
            ">;"
        }
    .end annotation
.end field

.field private final label:Lcom/stripe/android/core/strings/ResolvableString;

.field private final rawItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/core/strings/ResolvableString;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/DropdownItemSpec;",
            ">;)V"
        }
    .end annotation

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/SimpleDropdownConfig;->label:Lcom/stripe/android/core/strings/ResolvableString;

    .line 10
    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/SimpleDropdownConfig;->items:Ljava/util/List;

    .line 12
    const-string p1, "simple_dropdown"

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/SimpleDropdownConfig;->debugLabel:Ljava/lang/String;

    .line 14
    check-cast p2, Ljava/lang/Iterable;

    .line 27
    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p2, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast p1, Ljava/util/Collection;

    .line 28
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 29
    check-cast v1, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    .line 14
    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;->getApiValue()Ljava/lang/String;

    move-result-object v1

    .line 29
    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 30
    :cond_0
    check-cast p1, Ljava/util/List;

    .line 14
    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/SimpleDropdownConfig;->rawItems:Ljava/util/List;

    .line 16
    iget-object p1, p0, Lcom/stripe/android/ui/core/elements/SimpleDropdownConfig;->items:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    .line 31
    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    check-cast p2, Ljava/util/Collection;

    .line 32
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 33
    check-cast v0, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    .line 16
    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;->getDisplayText()Ljava/lang/String;

    move-result-object v0

    .line 33
    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 34
    :cond_1
    check-cast p2, Ljava/util/List;

    .line 16
    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/SimpleDropdownConfig;->displayItems:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public convertFromRaw(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SimpleDropdownConfig;->items:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 35
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    .line 22
    invoke-virtual {v2}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;->getApiValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    if-eqz v1, :cond_2

    .line 23
    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;->getDisplayText()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    return-object p1

    .line 24
    :cond_2
    iget-object p1, p0, Lcom/stripe/android/ui/core/elements/SimpleDropdownConfig;->items:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;->getDisplayText()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getDebugLabel()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SimpleDropdownConfig;->debugLabel:Ljava/lang/String;

    return-object v0
.end method

.method public getDisableDropdownWithSingleElement()Z
    .locals 1

    .line 7
    invoke-static {p0}, Lcom/stripe/android/uicore/elements/DropdownConfig$DefaultImpls;->getDisableDropdownWithSingleElement(Lcom/stripe/android/uicore/elements/DropdownConfig;)Z

    move-result v0

    return v0
.end method

.method public getDisplayItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 16
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SimpleDropdownConfig;->displayItems:Ljava/util/List;

    return-object v0
.end method

.method public getLabel()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SimpleDropdownConfig;->label:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public getMode()Lcom/stripe/android/uicore/elements/DropdownConfig$Mode;
    .locals 1

    .line 7
    invoke-static {p0}, Lcom/stripe/android/uicore/elements/DropdownConfig$DefaultImpls;->getMode(Lcom/stripe/android/uicore/elements/DropdownConfig;)Lcom/stripe/android/uicore/elements/DropdownConfig$Mode;

    move-result-object v0

    return-object v0
.end method

.method public getRawItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 14
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SimpleDropdownConfig;->rawItems:Ljava/util/List;

    return-object v0
.end method

.method public getSelectedItemLabel(I)Ljava/lang/String;
    .locals 1

    .line 18
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/SimpleDropdownConfig;->getDisplayItems()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method
