.class public final Lcom/stripe/android/ui/core/elements/UpiElement;
.super Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;
.source "UpiElement.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u00020\tX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0016\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/UpiElement;",
        "Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;",
        "controller",
        "Lcom/stripe/android/uicore/elements/InputController;",
        "<init>",
        "(Lcom/stripe/android/uicore/elements/InputController;)V",
        "getController",
        "()Lcom/stripe/android/uicore/elements/InputController;",
        "allowsUserInteraction",
        "",
        "getAllowsUserInteraction",
        "()Z",
        "mandateText",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "getMandateText",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "identifier",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "getIdentifier",
        "()Lcom/stripe/android/uicore/elements/IdentifierSpec;",
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

.field private final controller:Lcom/stripe/android/uicore/elements/InputController;

.field private final identifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private final mandateText:Lcom/stripe/android/core/strings/ResolvableString;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/stripe/android/ui/core/elements/UpiElement;-><init>(Lcom/stripe/android/uicore/elements/InputController;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/InputController;)V
    .locals 1

    const-string v0, "controller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getVpa()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    .line 12
    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/UpiElement;->controller:Lcom/stripe/android/uicore/elements/InputController;

    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Lcom/stripe/android/ui/core/elements/UpiElement;->allowsUserInteraction:Z

    .line 19
    sget-object p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getVpa()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/UpiElement;->identifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/uicore/elements/InputController;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 12
    new-instance v0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    .line 13
    new-instance p1, Lcom/stripe/android/ui/core/elements/UpiConfig;

    invoke-direct {p1}, Lcom/stripe/android/ui/core/elements/UpiConfig;-><init>()V

    move-object v1, p1

    check-cast v1, Lcom/stripe/android/uicore/elements/TextFieldConfig;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 12
    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;-><init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v0

    check-cast p1, Lcom/stripe/android/uicore/elements/InputController;

    .line 11
    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/ui/core/elements/UpiElement;-><init>(Lcom/stripe/android/uicore/elements/InputController;)V

    return-void
.end method


# virtual methods
.method public getAllowsUserInteraction()Z
    .locals 1

    .line 16
    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/UpiElement;->allowsUserInteraction:Z

    return v0
.end method

.method public getController()Lcom/stripe/android/uicore/elements/InputController;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/UpiElement;->controller:Lcom/stripe/android/uicore/elements/InputController;

    return-object v0
.end method

.method public getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/UpiElement;->identifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public getMandateText()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/UpiElement;->mandateText:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method
