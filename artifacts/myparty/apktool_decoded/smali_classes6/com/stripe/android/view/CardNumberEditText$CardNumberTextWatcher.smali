.class final Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;
.super Lcom/stripe/android/view/StripeTextWatcher;
.source "CardNumberEditText.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/view/CardNumberEditText;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "CardNumberTextWatcher"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J*\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0016J*\u0010\u0016\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0012\u0010\u0018\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eH\u0002J(\u0010\r\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u000cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0008R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001c\u00a8\u0006%"
    }
    d2 = {
        "Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;",
        "Lcom/stripe/android/view/StripeTextWatcher;",
        "<init>",
        "(Lcom/stripe/android/view/CardNumberEditText;)V",
        "latestChangeStart",
        "",
        "latestInsertionSize",
        "newCursorPosition",
        "Ljava/lang/Integer;",
        "formattedNumber",
        "",
        "beforeCardNumber",
        "Lcom/stripe/android/cards/CardNumber$Unvalidated;",
        "isPastedPan",
        "",
        "beforeTextChanged",
        "",
        "s",
        "",
        "start",
        "count",
        "after",
        "onTextChanged",
        "before",
        "afterTextChanged",
        "Landroid/text/Editable;",
        "shouldUpdateAfterChange",
        "getShouldUpdateAfterChange",
        "()Z",
        "digitsAdded",
        "getDigitsAdded",
        "isComplete",
        "wasCardNumberValid",
        "startPosition",
        "previousCount",
        "currentCount",
        "cardNumber",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private beforeCardNumber:Lcom/stripe/android/cards/CardNumber$Unvalidated;

.field private formattedNumber:Ljava/lang/String;

.field private isPastedPan:Z

.field private latestChangeStart:I

.field private latestInsertionSize:I

.field private newCursorPosition:Ljava/lang/Integer;

.field final synthetic this$0:Lcom/stripe/android/view/CardNumberEditText;


# direct methods
.method public constructor <init>(Lcom/stripe/android/view/CardNumberEditText;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 341
    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-direct {p0}, Lcom/stripe/android/view/StripeTextWatcher;-><init>()V

    .line 348
    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->access$getUnvalidatedCardNumber(Lcom/stripe/android/view/CardNumberEditText;)Lcom/stripe/android/cards/CardNumber$Unvalidated;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->beforeCardNumber:Lcom/stripe/android/cards/CardNumber$Unvalidated;

    return-void
.end method

.method private final getDigitsAdded()Z
    .locals 2

    .line 431
    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {v0}, Lcom/stripe/android/view/CardNumberEditText;->access$getUnvalidatedCardNumber(Lcom/stripe/android/view/CardNumberEditText;)Lcom/stripe/android/cards/CardNumber$Unvalidated;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getLength()I

    move-result v0

    iget-object v1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->beforeCardNumber:Lcom/stripe/android/cards/CardNumber$Unvalidated;

    invoke-virtual {v1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getLength()I

    move-result v1

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private final getShouldUpdateAfterChange()Z
    .locals 1

    .line 425
    invoke-direct {p0}, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->getDigitsAdded()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardNumberEditText;->isLastKeyDelete$payments_core_release()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->formattedNumber:Ljava/lang/String;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private final isComplete(Z)Z
    .locals 0

    if-nez p1, :cond_1

    .line 439
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->access$getUnvalidatedCardNumber(Lcom/stripe/android/view/CardNumberEditText;)Lcom/stripe/android/cards/CardNumber$Unvalidated;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->isMaxLength()Z

    move-result p1

    if-nez p1, :cond_0

    .line 440
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->access$isValid(Lcom/stripe/android/view/CardNumberEditText;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->getAccountRangeService()Lcom/stripe/android/cards/CardAccountRangeService;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/cards/CardAccountRangeService;->getAccountRange()Lcom/stripe/android/model/AccountRange;

    move-result-object p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private final isPastedPan(IIILcom/stripe/android/cards/CardNumber$Unvalidated;)Z
    .locals 0

    if-le p3, p2, :cond_0

    if-nez p1, :cond_0

    .line 455
    invoke-virtual {p4}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getNormalized()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/16 p2, 0xe

    if-lt p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    .line 387
    invoke-direct {p0}, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->getShouldUpdateAfterChange()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 388
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    iget-object v1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->formattedNumber:Ljava/lang/String;

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/CardNumberEditText;->setTextSilent$payments_core_release(Ljava/lang/CharSequence;)V

    .line 389
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->newCursorPosition:Ljava/lang/Integer;

    if-eqz p1, :cond_0

    iget-object v1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    .line 390
    invoke-virtual {v1}, Lcom/stripe/android/view/CardNumberEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {p1, v0, v2}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result p1

    invoke-virtual {v1, p1}, Lcom/stripe/android/view/CardNumberEditText;->setSelection(I)V

    :cond_0
    const/4 p1, 0x0

    .line 394
    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->formattedNumber:Ljava/lang/String;

    .line 395
    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->newCursorPosition:Ljava/lang/Integer;

    .line 397
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->access$getUnvalidatedCardNumber(Lcom/stripe/android/view/CardNumberEditText;)Lcom/stripe/android/cards/CardNumber$Unvalidated;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getLength()I

    move-result p1

    iget-object v1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardNumberEditText;->getPanLength$payments_core_release()I

    move-result v1

    const/4 v2, 0x1

    if-ne p1, v1, :cond_3

    .line 398
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->isCardNumberValid()Z

    move-result p1

    .line 399
    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {v0}, Lcom/stripe/android/view/CardNumberEditText;->access$isValid(Lcom/stripe/android/view/CardNumberEditText;)Z

    move-result v1

    invoke-static {v0, v1}, Lcom/stripe/android/view/CardNumberEditText;->access$setCardNumberValid$p(Lcom/stripe/android/view/CardNumberEditText;Z)V

    .line 400
    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {v0}, Lcom/stripe/android/view/CardNumberEditText;->access$isValid(Lcom/stripe/android/view/CardNumberEditText;)Z

    move-result v1

    xor-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardNumberEditText;->setShouldShowError(Z)V

    .line 402
    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardNumberEditText;->getAccountRangeService()Lcom/stripe/android/cards/CardAccountRangeService;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/cards/CardAccountRangeService;->getAccountRange()Lcom/stripe/android/model/AccountRange;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {v0}, Lcom/stripe/android/view/CardNumberEditText;->access$getUnvalidatedCardNumber(Lcom/stripe/android/view/CardNumberEditText;)Lcom/stripe/android/cards/CardNumber$Unvalidated;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->isValidLuhn()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 404
    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardNumberEditText;->onCardMetadataLoadedTooSlow$payments_core_release()V

    .line 407
    :cond_1
    invoke-direct {p0, p1}, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->isComplete(Z)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 408
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->getCompletionCallback$payments_core_release()Lkotlin/jvm/functions/Function0;

    move-result-object p1

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_2
    return-void

    .line 410
    :cond_3
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->access$getUnvalidatedCardNumber(Lcom/stripe/android/view/CardNumberEditText;)Lcom/stripe/android/cards/CardNumber$Unvalidated;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardNumberEditText;->getPanLength$payments_core_release()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->isPartialEntry(I)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 411
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->access$getUnvalidatedCardNumber(Lcom/stripe/android/view/CardNumberEditText;)Lcom/stripe/android/cards/CardNumber$Unvalidated;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->isPossibleCardBrand()Z

    move-result p1

    if-nez p1, :cond_4

    .line 414
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->access$isValid(Lcom/stripe/android/view/CardNumberEditText;)Z

    move-result v0

    invoke-static {p1, v0}, Lcom/stripe/android/view/CardNumberEditText;->access$setCardNumberValid$p(Lcom/stripe/android/view/CardNumberEditText;Z)V

    .line 415
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1, v2}, Lcom/stripe/android/view/CardNumberEditText;->setShouldShowError(Z)V

    return-void

    .line 417
    :cond_4
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->access$isValid(Lcom/stripe/android/view/CardNumberEditText;)Z

    move-result v1

    invoke-static {p1, v1}, Lcom/stripe/android/view/CardNumberEditText;->access$setCardNumberValid$p(Lcom/stripe/android/view/CardNumberEditText;Z)V

    .line 420
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1, v0}, Lcom/stripe/android/view/CardNumberEditText;->setShouldShowError(Z)V

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    const/4 p1, 0x0

    .line 353
    iput-boolean p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->isPastedPan:Z

    .line 354
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->access$getUnvalidatedCardNumber(Lcom/stripe/android/view/CardNumberEditText;)Lcom/stripe/android/cards/CardNumber$Unvalidated;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->beforeCardNumber:Lcom/stripe/android/cards/CardNumber$Unvalidated;

    .line 356
    iput p2, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->latestChangeStart:I

    .line 357
    iput p4, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->latestInsertionSize:I

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    .line 361
    new-instance v0, Lcom/stripe/android/cards/CardNumber$Unvalidated;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    const-string p1, ""

    :cond_1
    invoke-direct {v0, p1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;-><init>(Ljava/lang/String;)V

    .line 362
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->getAccountRangeService()Lcom/stripe/android/cards/CardAccountRangeService;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/stripe/android/cards/CardAccountRangeService;->onCardNumberChanged(Lcom/stripe/android/cards/CardNumber$Unvalidated;)V

    .line 364
    invoke-direct {p0, p2, p3, p4, v0}, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->isPastedPan(IIILcom/stripe/android/cards/CardNumber$Unvalidated;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->isPastedPan:Z

    if-eqz p1, :cond_2

    .line 367
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getLength()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getFormatted(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/CardNumberEditText;->updateLengthFilter$payments_core_release(I)V

    .line 370
    :cond_2
    iget-boolean p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->isPastedPan:Z

    if-eqz p1, :cond_3

    .line 371
    invoke-virtual {v0}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getLength()I

    move-result p1

    goto :goto_1

    .line 373
    :cond_3
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->getPanLength$payments_core_release()I

    move-result p1

    .line 374
    :goto_1
    iget-object p2, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    .line 375
    invoke-virtual {v0, p1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getFormatted(I)Ljava/lang/String;

    move-result-object p3

    .line 377
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p4

    .line 378
    iget v0, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->latestChangeStart:I

    .line 379
    iget v1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->latestInsertionSize:I

    .line 376
    invoke-virtual {p2, p4, v0, v1, p1}, Lcom/stripe/android/view/CardNumberEditText;->calculateCursorPosition$payments_core_release(IIII)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->newCursorPosition:Ljava/lang/Integer;

    .line 382
    iput-object p3, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->formattedNumber:Ljava/lang/String;

    return-void
.end method
