.class public final Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;
.super Ljava/lang/Object;
.source "AdministrativeAreaConfig.kt"

# interfaces
.implements Lcom/stripe/android/uicore/elements/DropdownConfig;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAdministrativeAreaConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdministrativeAreaConfig.kt\ncom/stripe/android/uicore/elements/AdministrativeAreaConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,128:1\n1557#2:129\n1628#2,3:130\n1557#2:133\n1628#2,3:134\n*S KotlinDebug\n*F\n+ 1 AdministrativeAreaConfig.kt\ncom/stripe/android/uicore/elements/AdministrativeAreaConfig\n*L\n11#1:129\n11#1:130,3\n12#1:133\n12#1:134,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u001a\u001a\u00020\u00082\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00082\u0006\u0010\u001e\u001a\u00020\u0008H\u0016R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000e\u001a\u00020\u0008X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0017\u00a8\u0006 "
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;",
        "Lcom/stripe/android/uicore/elements/DropdownConfig;",
        "country",
        "Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;",
        "<init>",
        "(Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;)V",
        "shortAdministrativeAreaNames",
        "",
        "",
        "fullAdministrativeAreaNames",
        "mode",
        "Lcom/stripe/android/uicore/elements/DropdownConfig$Mode$Full;",
        "getMode",
        "()Lcom/stripe/android/uicore/elements/DropdownConfig$Mode$Full;",
        "debugLabel",
        "getDebugLabel",
        "()Ljava/lang/String;",
        "label",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "getLabel",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
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
        "Country",
        "stripe-ui-core_release"
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

.field private final fullAdministrativeAreaNames:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final label:Lcom/stripe/android/core/strings/ResolvableString;

.field private final mode:Lcom/stripe/android/uicore/elements/DropdownConfig$Mode$Full;

.field private final rawItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final shortAdministrativeAreaNames:Ljava/util/List;
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

.method public constructor <init>(Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;)V
    .locals 4

    const-string v0, "country"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;->getAdministrativeAreas()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 129
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 130
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 131
    check-cast v3, Lkotlin/Pair;

    .line 11
    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 131
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 132
    :cond_0
    check-cast v1, Ljava/util/List;

    .line 11
    iput-object v1, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->shortAdministrativeAreaNames:Ljava/util/List;

    .line 12
    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;->getAdministrativeAreas()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 133
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 134
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 135
    check-cast v2, Lkotlin/Pair;

    .line 12
    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 135
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 136
    :cond_1
    check-cast v1, Ljava/util/List;

    .line 12
    iput-object v1, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->fullAdministrativeAreaNames:Ljava/util/List;

    .line 14
    new-instance v0, Lcom/stripe/android/uicore/elements/DropdownConfig$Mode$Full;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Lcom/stripe/android/uicore/elements/DropdownConfig$Mode$Full;-><init>(Z)V

    iput-object v0, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->mode:Lcom/stripe/android/uicore/elements/DropdownConfig$Mode$Full;

    .line 15
    const-string v0, "administrativeArea"

    iput-object v0, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->debugLabel:Ljava/lang/String;

    .line 17
    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;->getLabel()I

    move-result p1

    new-array v0, v2, [Ljava/lang/Object;

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-static {p1, v0, v3, v2, v3}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->label:Lcom/stripe/android/core/strings/ResolvableString;

    .line 19
    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->shortAdministrativeAreaNames:Ljava/util/List;

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->rawItems:Ljava/util/List;

    .line 21
    iput-object v1, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->displayItems:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public convertFromRaw(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->shortAdministrativeAreaNames:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 27
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->fullAdministrativeAreaNames:Ljava/util/List;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->shortAdministrativeAreaNames:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    .line 29
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->fullAdministrativeAreaNames:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public getDebugLabel()Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->debugLabel:Ljava/lang/String;

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

    .line 21
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->displayItems:Ljava/util/List;

    return-object v0
.end method

.method public getLabel()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->label:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public getMode()Lcom/stripe/android/uicore/elements/DropdownConfig$Mode$Full;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->mode:Lcom/stripe/android/uicore/elements/DropdownConfig$Mode$Full;

    return-object v0
.end method

.method public bridge synthetic getMode()Lcom/stripe/android/uicore/elements/DropdownConfig$Mode;
    .locals 1

    .line 7
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->getMode()Lcom/stripe/android/uicore/elements/DropdownConfig$Mode$Full;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/uicore/elements/DropdownConfig$Mode;

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

    .line 19
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->rawItems:Ljava/util/List;

    return-object v0
.end method

.method public getSelectedItemLabel(I)Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;->fullAdministrativeAreaNames:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method
