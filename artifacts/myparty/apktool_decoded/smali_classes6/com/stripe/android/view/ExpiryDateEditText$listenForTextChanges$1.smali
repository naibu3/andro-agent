.class public final Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;
.super Lcom/stripe/android/view/StripeTextWatcher;
.source "ExpiryDateEditText.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/ExpiryDateEditText;->listenForTextChanges()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nExpiryDateEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpiryDateEditText.kt\ncom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,329:1\n434#2:330\n507#2,5:331\n*S KotlinDebug\n*F\n+ 1 ExpiryDateEditText.kt\ncom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1\n*L\n126#1:330\n126#1:331,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J*\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J*\u0010\u0012\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J\u0012\u0010\u0014\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0008R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "com/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1",
        "Lcom/stripe/android/view/StripeTextWatcher;",
        "latestChangeStart",
        "",
        "latestInsertionSize",
        "expirationDate",
        "Lcom/stripe/android/model/ExpirationDate$Unvalidated;",
        "newCursorPosition",
        "Ljava/lang/Integer;",
        "formattedDate",
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
.field private expirationDate:Lcom/stripe/android/model/ExpirationDate$Unvalidated;

.field private formattedDate:Ljava/lang/String;

.field private latestChangeStart:I

.field private latestInsertionSize:I

.field private newCursorPosition:Ljava/lang/Integer;

.field final synthetic this$0:Lcom/stripe/android/view/ExpiryDateEditText;


# direct methods
.method constructor <init>(Lcom/stripe/android/view/ExpiryDateEditText;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->this$0:Lcom/stripe/android/view/ExpiryDateEditText;

    .line 104
    invoke-direct {p0}, Lcom/stripe/android/view/StripeTextWatcher;-><init>()V

    .line 107
    sget-object p1, Lcom/stripe/android/model/ExpirationDate$Unvalidated;->Companion:Lcom/stripe/android/model/ExpirationDate$Unvalidated$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/model/ExpirationDate$Unvalidated$Companion;->getEMPTY()Lcom/stripe/android/model/ExpirationDate$Unvalidated;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->expirationDate:Lcom/stripe/android/model/ExpirationDate$Unvalidated;

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 6

    .line 183
    iget-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->formattedDate:Ljava/lang/String;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 184
    iget-object v1, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->this$0:Lcom/stripe/android/view/ExpiryDateEditText;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v1, p1}, Lcom/stripe/android/view/ExpiryDateEditText;->setTextSilent$payments_core_release(Ljava/lang/CharSequence;)V

    .line 185
    iget-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->newCursorPosition:Ljava/lang/Integer;

    if-eqz p1, :cond_0

    iget-object v1, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->this$0:Lcom/stripe/android/view/ExpiryDateEditText;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    .line 186
    invoke-virtual {v1}, Lcom/stripe/android/view/ExpiryDateEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {p1, v0, v2}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result p1

    invoke-virtual {v1, p1}, Lcom/stripe/android/view/ExpiryDateEditText;->setSelection(I)V

    .line 195
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->expirationDate:Lcom/stripe/android/model/ExpirationDate$Unvalidated;

    invoke-virtual {p1}, Lcom/stripe/android/model/ExpirationDate$Unvalidated;->getMonth()Ljava/lang/String;

    move-result-object p1

    .line 196
    iget-object v1, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->expirationDate:Lcom/stripe/android/model/ExpirationDate$Unvalidated;

    invoke-virtual {v1}, Lcom/stripe/android/model/ExpirationDate$Unvalidated;->getYear()Ljava/lang/String;

    move-result-object v1

    .line 197
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    iget-object v2, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->expirationDate:Lcom/stripe/android/model/ExpirationDate$Unvalidated;

    invoke-virtual {v2}, Lcom/stripe/android/model/ExpirationDate$Unvalidated;->isMonthValid()Z

    move-result v2

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_0

    :cond_1
    move v2, v0

    .line 203
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    if-ne v5, v4, :cond_3

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    if-ne v5, v4, :cond_3

    .line 204
    iget-object v2, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->this$0:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v2}, Lcom/stripe/android/view/ExpiryDateEditText;->isDateValid()Z

    move-result v2

    .line 205
    iget-object v4, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->this$0:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-static {v4, p1, v1}, Lcom/stripe/android/view/ExpiryDateEditText;->access$isDateValid(Lcom/stripe/android/view/ExpiryDateEditText;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    invoke-static {v4, p1}, Lcom/stripe/android/view/ExpiryDateEditText;->access$setDateValid$p(Lcom/stripe/android/view/ExpiryDateEditText;Z)V

    .line 208
    iget-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->this$0:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/ExpiryDateEditText;->isDateValid()Z

    move-result p1

    xor-int/2addr p1, v3

    if-nez v2, :cond_2

    .line 209
    iget-object v1, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->this$0:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/ExpiryDateEditText;->isDateValid()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 210
    iget-object v1, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->this$0:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/ExpiryDateEditText;->getCompletionCallback$payments_core_release()Lkotlin/jvm/functions/Function0;

    move-result-object v1

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_2
    move v2, p1

    goto :goto_1

    .line 213
    :cond_3
    iget-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->this$0:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-static {p1, v0}, Lcom/stripe/android/view/ExpiryDateEditText;->access$setDateValid$p(Lcom/stripe/android/view/ExpiryDateEditText;Z)V

    .line 216
    :goto_1
    iget-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->this$0:Lcom/stripe/android/view/ExpiryDateEditText;

    .line 217
    invoke-virtual {p1}, Lcom/stripe/android/view/ExpiryDateEditText;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 218
    iget-object v4, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->expirationDate:Lcom/stripe/android/model/ExpirationDate$Unvalidated;

    invoke-virtual {v4}, Lcom/stripe/android/model/ExpirationDate$Unvalidated;->isPartialEntry$payments_core_release()Z

    move-result v4

    if-eqz v4, :cond_4

    .line 219
    sget v4, Lcom/stripe/android/uicore/R$string;->stripe_incomplete_expiry_date:I

    goto :goto_2

    .line 220
    :cond_4
    iget-object v4, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->expirationDate:Lcom/stripe/android/model/ExpirationDate$Unvalidated;

    invoke-virtual {v4}, Lcom/stripe/android/model/ExpirationDate$Unvalidated;->isMonthValid()Z

    move-result v4

    if-nez v4, :cond_5

    .line 221
    sget v4, Lcom/stripe/android/uicore/R$string;->stripe_invalid_expiry_month:I

    goto :goto_2

    .line 223
    :cond_5
    sget v4, Lcom/stripe/android/uicore/R$string;->stripe_invalid_expiry_year:I

    .line 217
    :goto_2
    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 216
    invoke-virtual {p1, v1}, Lcom/stripe/android/view/ExpiryDateEditText;->setErrorMessage(Ljava/lang/String;)V

    .line 228
    iget-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->this$0:Lcom/stripe/android/view/ExpiryDateEditText;

    if-eqz v2, :cond_7

    .line 229
    iget-object v1, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->expirationDate:Lcom/stripe/android/model/ExpirationDate$Unvalidated;

    invoke-virtual {v1}, Lcom/stripe/android/model/ExpirationDate$Unvalidated;->isPartialEntry$payments_core_release()Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->expirationDate:Lcom/stripe/android/model/ExpirationDate$Unvalidated;

    invoke-virtual {v1}, Lcom/stripe/android/model/ExpirationDate$Unvalidated;->isComplete$payments_core_release()Z

    move-result v1

    if-eqz v1, :cond_7

    :cond_6
    move v0, v3

    .line 228
    :cond_7
    invoke-virtual {p1, v0}, Lcom/stripe/android/view/ExpiryDateEditText;->setShouldShowError(Z)V

    const/4 p1, 0x0

    .line 231
    iput-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->formattedDate:Ljava/lang/String;

    .line 232
    iput-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->newCursorPosition:Ljava/lang/Integer;

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 118
    iput p2, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->latestChangeStart:I

    .line 119
    iput p4, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->latestInsertionSize:I

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 3

    if-eqz p1, :cond_0

    .line 125
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    const-string p1, ""

    .line 330
    :cond_1
    check-cast p1, Ljava/lang/CharSequence;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    check-cast p2, Ljava/lang/Appendable;

    .line 331
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p3

    const/4 p4, 0x0

    move v0, p4

    :goto_1
    if-ge v0, p3, :cond_3

    .line 332
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    .line 126
    invoke-static {v1}, Ljava/lang/Character;->isDigit(C)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 333
    invoke-interface {p2, v1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 335
    :cond_3
    check-cast p2, Ljava/lang/StringBuilder;

    .line 330
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 128
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    const/4 p3, 0x2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_4

    iget p2, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->latestChangeStart:I

    if-nez p2, :cond_4

    .line 129
    iget p2, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->latestInsertionSize:I

    if-ne p2, v0, :cond_4

    .line 131
    invoke-virtual {p1, p4}, Ljava/lang/String;->charAt(I)C

    move-result p2

    const/16 p4, 0x30

    if-eq p2, p4, :cond_5

    const/16 p4, 0x31

    if-eq p2, p4, :cond_5

    .line 137
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p4, "0"

    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 138
    iget p2, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->latestInsertionSize:I

    add-int/2addr p2, v0

    iput p2, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->latestInsertionSize:I

    goto :goto_2

    .line 140
    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    if-ne p2, p3, :cond_5

    .line 141
    iget p2, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->latestChangeStart:I

    if-ne p2, p3, :cond_5

    .line 142
    iget p2, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->latestInsertionSize:I

    if-nez p2, :cond_5

    .line 148
    invoke-virtual {p1, p4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const-string p2, "substring(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    :cond_5
    :goto_2
    sget-object p2, Lcom/stripe/android/model/ExpirationDate$Unvalidated;->Companion:Lcom/stripe/android/model/ExpirationDate$Unvalidated$Companion;

    invoke-virtual {p2, p1}, Lcom/stripe/android/model/ExpirationDate$Unvalidated$Companion;->create(Ljava/lang/String;)Lcom/stripe/android/model/ExpirationDate$Unvalidated;

    move-result-object p2

    .line 154
    iput-object p2, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->expirationDate:Lcom/stripe/android/model/ExpirationDate$Unvalidated;

    .line 157
    invoke-virtual {p2}, Lcom/stripe/android/model/ExpirationDate$Unvalidated;->isMonthValid()Z

    move-result p4

    .line 161
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    invoke-virtual {p2}, Lcom/stripe/android/model/ExpirationDate$Unvalidated;->getMonth()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 164
    invoke-virtual {p2}, Lcom/stripe/android/model/ExpirationDate$Unvalidated;->getMonth()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v1, p3, :cond_6

    iget v1, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->latestInsertionSize:I

    if-lez v1, :cond_6

    if-nez p4, :cond_7

    .line 165
    :cond_6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-le p1, p3, :cond_8

    .line 167
    :cond_7
    iget-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->this$0:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-static {p1}, Lcom/stripe/android/view/ExpiryDateEditText;->access$getSeparator$p(Lcom/stripe/android/view/ExpiryDateEditText;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    :cond_8
    invoke-virtual {p2}, Lcom/stripe/android/model/ExpirationDate$Unvalidated;->getYear()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "toString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    iget-object p2, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->this$0:Lcom/stripe/android/view/ExpiryDateEditText;

    .line 174
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p3

    .line 175
    iget p4, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->latestChangeStart:I

    .line 176
    iget v0, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->latestInsertionSize:I

    .line 177
    iget-object v1, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->this$0:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-static {v1}, Lcom/stripe/android/view/ExpiryDateEditText;->access$getDateDigitsLength$p(Lcom/stripe/android/view/ExpiryDateEditText;)I

    move-result v1

    iget-object v2, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->this$0:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-static {v2}, Lcom/stripe/android/view/ExpiryDateEditText;->access$getSeparator$p(Lcom/stripe/android/view/ExpiryDateEditText;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v1, v2

    .line 173
    invoke-virtual {p2, p3, p4, v0, v1}, Lcom/stripe/android/view/ExpiryDateEditText;->updateSelectionIndex$payments_core_release(IIII)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->newCursorPosition:Ljava/lang/Integer;

    .line 179
    iput-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;->formattedDate:Ljava/lang/String;

    return-void
.end method
