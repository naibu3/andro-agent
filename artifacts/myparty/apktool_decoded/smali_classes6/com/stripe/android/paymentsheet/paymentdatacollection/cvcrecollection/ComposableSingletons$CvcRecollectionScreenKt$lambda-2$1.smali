.class final Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/ComposableSingletons$CvcRecollectionScreenKt$lambda-2$1;
.super Ljava/lang/Object;
.source "CvcRecollectionScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/ComposableSingletons$CvcRecollectionScreenKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCvcRecollectionScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CvcRecollectionScreen.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/ComposableSingletons$CvcRecollectionScreenKt$lambda-2$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,295:1\n1225#2,6:296\n*S KotlinDebug\n*F\n+ 1 CvcRecollectionScreen.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/ComposableSingletons$CvcRecollectionScreenKt$lambda-2$1\n*L\n283#1:296,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/ComposableSingletons$CvcRecollectionScreenKt$lambda-2$1;


# direct methods
.method public static synthetic $r8$lambda$VXM2ZRoSHHlUQSl28NtBXwo_fs0(Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionViewAction;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/ComposableSingletons$CvcRecollectionScreenKt$lambda-2$1;->invoke$lambda$1$lambda$0(Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionViewAction;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/ComposableSingletons$CvcRecollectionScreenKt$lambda-2$1;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/ComposableSingletons$CvcRecollectionScreenKt$lambda-2$1;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/ComposableSingletons$CvcRecollectionScreenKt$lambda-2$1;->INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/ComposableSingletons$CvcRecollectionScreenKt$lambda-2$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0(Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionViewAction;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 275
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/ComposableSingletons$CvcRecollectionScreenKt$lambda-2$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 9

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 276
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 284
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 276
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.ComposableSingletons$CvcRecollectionScreenKt.lambda-2.<anonymous> (CvcRecollectionScreen.kt:275)"

    const v2, -0x67a9cdd5

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 279
    :cond_2
    new-instance v5, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;

    .line 280
    const-string p2, ""

    .line 281
    sget-object v0, Lcom/stripe/android/model/CardBrand;->Visa:Lcom/stripe/android/model/CardBrand;

    .line 279
    invoke-direct {v5, p2, v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;-><init>(Ljava/lang/String;Lcom/stripe/android/model/CardBrand;)V

    const p2, -0x239fd9fa

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 296
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p2

    .line 297
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne p2, v0, :cond_3

    .line 298
    new-instance p2, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/ComposableSingletons$CvcRecollectionScreenKt$lambda-2$1$$ExternalSyntheticLambda0;

    invoke-direct {p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/ComposableSingletons$CvcRecollectionScreenKt$lambda-2$1$$ExternalSyntheticLambda0;-><init>()V

    .line 299
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 283
    :cond_3
    move-object v6, p2

    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/16 v8, 0xdb6

    .line 276
    const-string v3, "4242"

    const/4 v4, 0x0

    move-object v7, p1

    invoke-static/range {v3 .. v8}, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionScreenKt;->CvcRecollectionScreen(Ljava/lang/String;ZLcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_4
    return-void
.end method
