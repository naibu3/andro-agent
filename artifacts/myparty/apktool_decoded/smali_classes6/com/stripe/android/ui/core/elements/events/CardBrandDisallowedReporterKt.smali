.class public final Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporterKt;
.super Ljava/lang/Object;
.source "CardBrandDisallowedReporter.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u001c\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00018\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "LocalCardBrandDisallowedReporter",
        "Landroidx/compose/runtime/ProvidableCompositionLocal;",
        "Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;",
        "getLocalCardBrandDisallowedReporter",
        "()Landroidx/compose/runtime/ProvidableCompositionLocal;",
        "payments-ui-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final LocalCardBrandDisallowedReporter:Landroidx/compose/runtime/ProvidableCompositionLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/ProvidableCompositionLocal<",
            "Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$FuhRy5V_NxD1z1w3uvYgDwUaOl0()Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;
    .locals 1

    invoke-static {}, Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporterKt;->LocalCardBrandDisallowedReporter$lambda$0()Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 1

    .line 14
    new-instance v0, Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporterKt$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporterKt$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v0}, Landroidx/compose/runtime/CompositionLocalKt;->staticCompositionLocalOf(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporterKt;->LocalCardBrandDisallowedReporter:Landroidx/compose/runtime/ProvidableCompositionLocal;

    return-void
.end method

.method private static final LocalCardBrandDisallowedReporter$lambda$0()Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;
    .locals 1

    .line 15
    sget-object v0, Lcom/stripe/android/ui/core/elements/events/EmptyCardBrandDisallowedReporter;->INSTANCE:Lcom/stripe/android/ui/core/elements/events/EmptyCardBrandDisallowedReporter;

    check-cast v0, Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;

    return-object v0
.end method

.method public static final getLocalCardBrandDisallowedReporter()Landroidx/compose/runtime/ProvidableCompositionLocal;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/ProvidableCompositionLocal<",
            "Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;",
            ">;"
        }
    .end annotation

    .line 13
    sget-object v0, Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporterKt;->LocalCardBrandDisallowedReporter:Landroidx/compose/runtime/ProvidableCompositionLocal;

    return-object v0
.end method
