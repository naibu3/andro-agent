.class public final Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;
.super Ljava/lang/Object;
.source "SaveForFutureUseElement.kt"

# interfaces
.implements Lcom/stripe/android/uicore/elements/FormElement;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J \u0010\u001a\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001e0\u001d0\u001c0\u001bH\u0016J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\"\u001a\u00020\u00032\u0008\u0010#\u001a\u0004\u0018\u00010$H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u00020\u0003X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\tR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006("
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;",
        "Lcom/stripe/android/uicore/elements/FormElement;",
        "initialValue",
        "",
        "merchantName",
        "",
        "<init>",
        "(ZLjava/lang/String;)V",
        "getInitialValue",
        "()Z",
        "getMerchantName",
        "()Ljava/lang/String;",
        "allowsUserInteraction",
        "getAllowsUserInteraction",
        "mandateText",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "getMandateText",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "controller",
        "Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;",
        "getController",
        "()Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;",
        "identifier",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "getIdentifier",
        "()Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "getFormFieldValueFlow",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "",
        "Lkotlin/Pair;",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "component1",
        "component2",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "",
        "toString",
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
.field private final allowsUserInteraction:Z

.field private final controller:Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;

.field private final identifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private final initialValue:Z

.field private final mandateText:Lcom/stripe/android/core/strings/ResolvableString;

.field private final merchantName:Ljava/lang/String;


# direct methods
.method public static synthetic $r8$lambda$WHWY323uzZcocEfkbKx4UnYU-P4(Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;Lcom/stripe/android/uicore/forms/FormFieldEntry;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->getFormFieldValueFlow$lambda$0(Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;Lcom/stripe/android/uicore/forms/FormFieldEntry;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;)V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-boolean p1, p0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->initialValue:Z

    .line 18
    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->merchantName:Ljava/lang/String;

    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->allowsUserInteraction:Z

    .line 23
    new-instance v0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;

    invoke-direct {v0, p2, p1}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->controller:Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;

    .line 28
    sget-object p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getSaveForFutureUse()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->identifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;ZLjava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-boolean p1, p0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->initialValue:Z

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->merchantName:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->copy(ZLjava/lang/String;)Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;

    move-result-object p0

    return-object p0
.end method

.method private static final getFormFieldValueFlow$lambda$0(Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;Lcom/stripe/android/uicore/forms/FormFieldEntry;)Ljava/util/List;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    invoke-static {p0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    .line 32
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->initialValue:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->merchantName:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ZLjava/lang/String;)Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;
    .locals 1

    new-instance v0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;-><init>(ZLjava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;

    iget-boolean v1, p0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->initialValue:Z

    iget-boolean v3, p1, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->initialValue:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->merchantName:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->merchantName:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public getAllowsUserInteraction()Z
    .locals 1

    .line 20
    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->allowsUserInteraction:Z

    return v0
.end method

.method public getController()Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->controller:Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;

    return-object v0
.end method

.method public bridge synthetic getController()Lcom/stripe/android/uicore/elements/Controller;
    .locals 1

    .line 15
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->getController()Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/uicore/elements/Controller;

    return-object v0
.end method

.method public getFormFieldValueFlow()Lkotlinx/coroutines/flow/StateFlow;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;>;>;"
        }
    .end annotation

    .line 31
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->getController()Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;->getFormFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;)V

    invoke-static {v0, v1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    return-object v0
.end method

.method public getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->identifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public final getInitialValue()Z
    .locals 1

    .line 17
    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->initialValue:Z

    return v0
.end method

.method public getMandateText()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->mandateText:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final getMerchantName()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->merchantName:Ljava/lang/String;

    return-object v0
.end method

.method public getTextFieldIdentifiers()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;"
        }
    .end annotation

    .line 15
    invoke-static {p0}, Lcom/stripe/android/uicore/elements/FormElement$DefaultImpls;->getTextFieldIdentifiers(Lcom/stripe/android/uicore/elements/FormElement;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->initialValue:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->merchantName:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->initialValue:Z

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->merchantName:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "SaveForFutureUseElement(initialValue="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", merchantName="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
