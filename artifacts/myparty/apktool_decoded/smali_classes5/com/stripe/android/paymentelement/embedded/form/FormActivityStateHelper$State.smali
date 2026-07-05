.class public final Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;
.super Ljava/lang/Object;
.source "FormActivityStateHelper.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "State"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JS\u0010\u001d\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u00052\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020#H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u000f\u00a8\u0006$"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;",
        "",
        "primaryButtonLabel",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "isEnabled",
        "",
        "processingState",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;",
        "isProcessing",
        "shouldDisplayLockIcon",
        "error",
        "mandateText",
        "<init>",
        "(Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;ZZLcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;)V",
        "getPrimaryButtonLabel",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "()Z",
        "getProcessingState",
        "()Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;",
        "getShouldDisplayLockIcon",
        "getError",
        "getMandateText",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final error:Lcom/stripe/android/core/strings/ResolvableString;

.field private final isEnabled:Z

.field private final isProcessing:Z

.field private final mandateText:Lcom/stripe/android/core/strings/ResolvableString;

.field private final primaryButtonLabel:Lcom/stripe/android/core/strings/ResolvableString;

.field private final processingState:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;

.field private final shouldDisplayLockIcon:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;ZZLcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;)V
    .locals 1

    const-string v0, "primaryButtonLabel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "processingState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->primaryButtonLabel:Lcom/stripe/android/core/strings/ResolvableString;

    .line 38
    iput-boolean p2, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->isEnabled:Z

    .line 39
    iput-object p3, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->processingState:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;

    .line 40
    iput-boolean p4, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->isProcessing:Z

    .line 41
    iput-boolean p5, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->shouldDisplayLockIcon:Z

    .line 42
    iput-object p6, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->error:Lcom/stripe/android/core/strings/ResolvableString;

    .line 43
    iput-object p7, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->mandateText:Lcom/stripe/android/core/strings/ResolvableString;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;ZZLcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x20

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p6, v0

    :cond_0
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_1

    move-object p8, v0

    goto :goto_0

    :cond_1
    move-object p8, p7

    :goto_0
    move-object p7, p6

    move p6, p5

    move p5, p4

    move-object p4, p3

    move p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 36
    invoke-direct/range {p1 .. p8}, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;-><init>(Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;ZZLcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;ZZLcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Object;)Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->primaryButtonLabel:Lcom/stripe/android/core/strings/ResolvableString;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-boolean p2, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->isEnabled:Z

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->processingState:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-boolean p4, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->isProcessing:Z

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-boolean p5, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->shouldDisplayLockIcon:Z

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->error:Lcom/stripe/android/core/strings/ResolvableString;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->mandateText:Lcom/stripe/android/core/strings/ResolvableString;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move p6, p4

    move p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->copy(Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;ZZLcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;)Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->primaryButtonLabel:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->isEnabled:Z

    return v0
.end method

.method public final component3()Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->processingState:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->isProcessing:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->shouldDisplayLockIcon:Z

    return v0
.end method

.method public final component6()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->error:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final component7()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->mandateText:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;ZZLcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;)Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;
    .locals 9

    const-string v0, "primaryButtonLabel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "processingState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;-><init>(Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;ZZLcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->primaryButtonLabel:Lcom/stripe/android/core/strings/ResolvableString;

    iget-object v3, p1, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->primaryButtonLabel:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->isEnabled:Z

    iget-boolean v3, p1, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->isEnabled:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->processingState:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;

    iget-object v3, p1, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->processingState:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->isProcessing:Z

    iget-boolean v3, p1, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->isProcessing:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->shouldDisplayLockIcon:Z

    iget-boolean v3, p1, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->shouldDisplayLockIcon:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->error:Lcom/stripe/android/core/strings/ResolvableString;

    iget-object v3, p1, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->error:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->mandateText:Lcom/stripe/android/core/strings/ResolvableString;

    iget-object p1, p1, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->mandateText:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getError()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->error:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final getMandateText()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->mandateText:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final getPrimaryButtonLabel()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->primaryButtonLabel:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final getProcessingState()Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->processingState:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;

    return-object v0
.end method

.method public final getShouldDisplayLockIcon()Z
    .locals 1

    .line 41
    iget-boolean v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->shouldDisplayLockIcon:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->primaryButtonLabel:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->isEnabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->processingState:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->isProcessing:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->shouldDisplayLockIcon:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->error:Lcom/stripe/android/core/strings/ResolvableString;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->mandateText:Lcom/stripe/android/core/strings/ResolvableString;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public final isEnabled()Z
    .locals 1

    .line 38
    iget-boolean v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->isEnabled:Z

    return v0
.end method

.method public final isProcessing()Z
    .locals 1

    .line 40
    iget-boolean v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->isProcessing:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->primaryButtonLabel:Lcom/stripe/android/core/strings/ResolvableString;

    iget-boolean v1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->isEnabled:Z

    iget-object v2, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->processingState:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;

    iget-boolean v3, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->isProcessing:Z

    iget-boolean v4, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->shouldDisplayLockIcon:Z

    iget-object v5, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->error:Lcom/stripe/android/core/strings/ResolvableString;

    iget-object v6, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->mandateText:Lcom/stripe/android/core/strings/ResolvableString;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "State(primaryButtonLabel="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v7, ", isEnabled="

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", processingState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isProcessing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shouldDisplayLockIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", error="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mandateText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
