.class final Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/ComposableSingletons$BacsMandateConfirmationFormKt$lambda-1$1;
.super Ljava/lang/Object;
.source "BacsMandateConfirmationForm.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/ComposableSingletons$BacsMandateConfirmationFormKt;
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
    value = "SMAP\nBacsMandateConfirmationForm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BacsMandateConfirmationForm.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/bacs/ComposableSingletons$BacsMandateConfirmationFormKt$lambda-1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,266:1\n1225#2,6:267\n*S KotlinDebug\n*F\n+ 1 BacsMandateConfirmationForm.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/bacs/ComposableSingletons$BacsMandateConfirmationFormKt$lambda-1$1\n*L\n259#1:267,6\n*E\n"
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
.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/ComposableSingletons$BacsMandateConfirmationFormKt$lambda-1$1;


# direct methods
.method public static synthetic $r8$lambda$UbK5U3Jw2tKl2nEZjmMmx8iGDDw(Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationViewAction;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/ComposableSingletons$BacsMandateConfirmationFormKt$lambda-1$1;->invoke$lambda$1$lambda$0(Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationViewAction;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/ComposableSingletons$BacsMandateConfirmationFormKt$lambda-1$1;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/ComposableSingletons$BacsMandateConfirmationFormKt$lambda-1$1;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/ComposableSingletons$BacsMandateConfirmationFormKt$lambda-1$1;->INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/ComposableSingletons$BacsMandateConfirmationFormKt$lambda-1$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0(Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationViewAction;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 259
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 238
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/ComposableSingletons$BacsMandateConfirmationFormKt$lambda-1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 12

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    .line 239
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 260
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 239
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.ComposableSingletons$BacsMandateConfirmationFormKt.lambda-1.<anonymous> (BacsMandateConfirmationForm.kt:238)"

    const v4, -0x164e4dd7

    invoke-static {v4, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 245
    :cond_2
    sget v0, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_bacs_notice_default_payer:I

    invoke-static {v0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v9

    .line 247
    sget v0, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_bacs_guarantee_format:I

    .line 248
    sget v1, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_bacs_guarantee_url:I

    invoke-static {v1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v1

    .line 249
    sget v2, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_bacs_guarantee:I

    invoke-static {v2}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v4, 0x4

    .line 246
    invoke-static {v0, v1, v2, v4, v2}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v11

    .line 252
    sget v0, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_bacs_support_address_format:I

    .line 253
    sget v1, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_bacs_support_default_address_line_one:I

    invoke-static {v1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v1

    .line 254
    sget v5, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_bacs_support_default_address_line_two:I

    invoke-static {v5}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v5

    .line 255
    sget v6, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_bacs_support_default_email:I

    invoke-static {v6}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v6

    .line 256
    sget v7, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_bacs_support_default_email:I

    invoke-static {v7}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v7

    filled-new-array {v1, v5, v6, v7}, [Ljava/lang/Object;

    move-result-object v1

    .line 251
    invoke-static {v0, v1, v2, v4, v2}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v10

    .line 240
    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationViewState;

    .line 242
    const-string v7, "10-88-00"

    .line 241
    const-string v8, "00012345"

    .line 240
    const-string v5, "email@email.com"

    const-string v6, "John Doe"

    move-object v4, v0

    invoke-direct/range {v4 .. v11}, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationViewState;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;)V

    const v1, -0x130b158f

    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 267
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .line 268
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_3

    .line 269
    new-instance v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/ComposableSingletons$BacsMandateConfirmationFormKt$lambda-1$1$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/ComposableSingletons$BacsMandateConfirmationFormKt$lambda-1$1$$ExternalSyntheticLambda0;-><init>()V

    .line 270
    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 259
    :cond_3
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/16 v4, 0x30

    const/4 v5, 0x4

    const/4 v2, 0x0

    move-object v3, p1

    .line 239
    invoke-static/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationFormKt;->BacsMandateConfirmationFormView(Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_4
    return-void
.end method
