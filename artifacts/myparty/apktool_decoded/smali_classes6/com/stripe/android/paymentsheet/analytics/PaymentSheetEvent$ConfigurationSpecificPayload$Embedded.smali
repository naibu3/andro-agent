.class public final Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;
.super Ljava/lang/Object;
.source "PaymentSheetEvent.kt"

# interfaces
.implements Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Embedded"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c2\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\nH\u00d6\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload;",
        "isRowSelectionImmediateAction",
        "",
        "configuration",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;",
        "<init>",
        "(ZLcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;)V",
        "payload",
        "",
        "",
        "",
        "getPayload",
        "()Ljava/util/Map;",
        "component1",
        "component2",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final configuration:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;

.field private final isRowSelectionImmediateAction:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ZLcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;)V
    .locals 1

    const-string v0, "configuration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;->isRowSelectionImmediateAction:Z

    .line 46
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;->configuration:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;

    return-void
.end method

.method private final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;->isRowSelectionImmediateAction:Z

    return v0
.end method

.method private final component2()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;->configuration:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;ZLcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-boolean p1, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;->isRowSelectionImmediateAction:Z

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;->configuration:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;->copy(ZLcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;)Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy(ZLcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;)Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;
    .locals 1

    const-string v0, "configuration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;-><init>(ZLcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;->isRowSelectionImmediateAction:Z

    iget-boolean v3, p1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;->isRowSelectionImmediateAction:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;->configuration:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;->configuration:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public getPayload()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 49
    invoke-static {}, Lkotlin/collections/MapsKt;->createMapBuilder()Ljava/util/Map;

    move-result-object v0

    .line 52
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;->configuration:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;

    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;->getFormSheetAction$paymentsheet_release()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$FormSheetAction;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$FormSheetAction;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    .line 54
    const-string v1, "confirm"

    goto :goto_0

    .line 52
    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 53
    :cond_1
    const-string v1, "continue"

    .line 50
    :goto_0
    const-string v2, "form_sheet_action"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;->isRowSelectionImmediateAction:Z

    if-eqz v1, :cond_2

    const-string v1, "immediate_action"

    goto :goto_1

    :cond_2
    const-string v1, "default"

    .line 57
    :goto_1
    const-string v2, "row_selection_behavior"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;->configuration:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;

    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;->getEmbeddedViewDisplaysMandateText$paymentsheet_release()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "embedded_view_displays_mandate_text"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    invoke-static {v0}, Lkotlin/collections/MapsKt;->build(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;->isRowSelectionImmediateAction:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;->configuration:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;

    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;->isRowSelectionImmediateAction:Z

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;->configuration:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Embedded(isRowSelectionImmediateAction="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", configuration="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
