.class public final Lcom/stripe/android/financialconnections/features/success/SuccessPreviewParameterProvider;
.super Ljava/lang/Object;
.source "SuccessPreviewParameterProvider.kt"

# interfaces
.implements Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider<",
        "Lcom/stripe/android/financialconnections/features/success/SuccessState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\t\u001a\u00020\u0002H\u0002J\u0008\u0010\n\u001a\u00020\u0002H\u0002R\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/success/SuccessPreviewParameterProvider;",
        "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;",
        "Lcom/stripe/android/financialconnections/features/success/SuccessState;",
        "<init>",
        "()V",
        "values",
        "Lkotlin/sequences/Sequence;",
        "getValues",
        "()Lkotlin/sequences/Sequence;",
        "canonical",
        "customMessage",
        "financial-connections_release"
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
.field private final values:Lkotlin/sequences/Sequence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/sequences/Sequence<",
            "Lcom/stripe/android/financialconnections/features/success/SuccessState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    .line 12
    new-array v0, v0, [Lcom/stripe/android/financialconnections/features/success/SuccessState;

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/success/SuccessPreviewParameterProvider;->canonical()Lcom/stripe/android/financialconnections/features/success/SuccessState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 13
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/success/SuccessPreviewParameterProvider;->customMessage()Lcom/stripe/android/financialconnections/features/success/SuccessState;

    move-result-object v2

    aput-object v2, v0, v1

    .line 11
    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->sequenceOf([Ljava/lang/Object;)Lkotlin/sequences/Sequence;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/financialconnections/features/success/SuccessPreviewParameterProvider;->values:Lkotlin/sequences/Sequence;

    return-void
.end method

.method private final canonical()Lcom/stripe/android/financialconnections/features/success/SuccessState;
    .locals 13

    .line 16
    new-instance v0, Lcom/stripe/android/financialconnections/features/success/SuccessState;

    .line 17
    new-instance v1, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 20
    new-instance v2, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;

    sget v3, Lcom/stripe/android/financialconnections/R$string;->stripe_success_pane_title:I

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-direct {v2, v3, v4, v5, v4}, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 21
    new-instance v6, Lcom/stripe/android/financialconnections/ui/TextResource$PluralId;

    .line 22
    sget v7, Lcom/stripe/android/financialconnections/R$string;->stripe_success_pane_desc_singular:I

    .line 23
    sget v8, Lcom/stripe/android/financialconnections/R$string;->stripe_success_pane_desc_plural:I

    const/16 v11, 0x8

    const/4 v12, 0x0

    const/4 v9, 0x3

    const/4 v10, 0x0

    .line 21
    invoke-direct/range {v6 .. v12}, Lcom/stripe/android/financialconnections/ui/TextResource$PluralId;-><init>(IIILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 18
    new-instance v3, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;

    .line 20
    check-cast v2, Lcom/stripe/android/financialconnections/ui/TextResource;

    .line 21
    check-cast v6, Lcom/stripe/android/financialconnections/ui/TextResource;

    const/4 v4, 0x0

    .line 18
    const-string v5, "Stripe"

    invoke-direct {v3, v5, v2, v6, v4}, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;Z)V

    .line 17
    invoke-direct {v1, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    check-cast v1, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 29
    sget-object v2, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    check-cast v2, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/features/success/SuccessState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;)V

    return-object v0
.end method

.method private final customMessage()Lcom/stripe/android/financialconnections/features/success/SuccessState;
    .locals 7

    .line 32
    new-instance v0, Lcom/stripe/android/financialconnections/features/success/SuccessState;

    .line 33
    new-instance v1, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 36
    new-instance v2, Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    const-string v3, "Success"

    check-cast v3, Ljava/lang/CharSequence;

    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/ui/TextResource$Text;-><init>(Ljava/lang/CharSequence;)V

    .line 37
    new-instance v3, Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    .line 38
    const-string v4, "You can expect micro-deposits to account \u2022\u2022\u2022\u20221234 in 1-2 days and an email with further instructions."

    check-cast v4, Ljava/lang/CharSequence;

    .line 37
    invoke-direct {v3, v4}, Lcom/stripe/android/financialconnections/ui/TextResource$Text;-><init>(Ljava/lang/CharSequence;)V

    .line 34
    new-instance v4, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;

    .line 36
    check-cast v2, Lcom/stripe/android/financialconnections/ui/TextResource;

    .line 37
    check-cast v3, Lcom/stripe/android/financialconnections/ui/TextResource;

    const/4 v5, 0x0

    .line 34
    const-string v6, "Stripe"

    invoke-direct {v4, v6, v2, v3, v5}, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;Z)V

    .line 33
    invoke-direct {v1, v4}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    check-cast v1, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 44
    sget-object v2, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    check-cast v2, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 32
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/features/success/SuccessState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;)V

    return-object v0
.end method


# virtual methods
.method public getValues()Lkotlin/sequences/Sequence;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/sequences/Sequence<",
            "Lcom/stripe/android/financialconnections/features/success/SuccessState;",
            ">;"
        }
    .end annotation

    .line 11
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/success/SuccessPreviewParameterProvider;->values:Lkotlin/sequences/Sequence;

    return-object v0
.end method
