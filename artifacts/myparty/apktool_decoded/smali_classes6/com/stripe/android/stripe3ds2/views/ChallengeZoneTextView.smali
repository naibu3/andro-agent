.class public final Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;
.super Landroid/widget/LinearLayout;
.source "ChallengeZoneTextView.kt"

# interfaces
.implements Lcom/stripe/android/stripe3ds2/views/FormField;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nChallengeZoneTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChallengeZoneTextView.kt\ncom/stripe/android/stripe3ds2/views/ChallengeZoneTextView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\'\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0014J\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0014J\u0010\u0010\u001c\u001a\u00020\u00182\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001eR\u0014\u0010\u000b\u001a\u00020\u000cX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;",
        "Landroid/widget/LinearLayout;",
        "Lcom/stripe/android/stripe3ds2/views/FormField;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "infoLabel",
        "Lcom/google/android/material/textfield/TextInputLayout;",
        "getInfoLabel$3ds2sdk_release",
        "()Lcom/google/android/material/textfield/TextInputLayout;",
        "textEntryView",
        "Lcom/google/android/material/textfield/TextInputEditText;",
        "getTextEntryView$3ds2sdk_release",
        "()Lcom/google/android/material/textfield/TextInputEditText;",
        "userEntry",
        "",
        "getUserEntry",
        "()Ljava/lang/String;",
        "setTextEntryLabel",
        "",
        "label",
        "setText",
        "text",
        "setTextBoxCustomization",
        "textBoxCustomization",
        "Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;",
        "3ds2sdk_release"
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
.field private final infoLabel:Lcom/google/android/material/textfield/TextInputLayout;

.field private final textEntryView:Lcom/google/android/material/textfield/TextInputEditText;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 29
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    .line 30
    move-object p2, p0

    check-cast p2, Landroid/view/ViewGroup;

    const/4 p3, 0x1

    .line 28
    invoke-static {p1, p2, p3}, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneTextViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneTextViewBinding;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    iget-object p2, p1, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneTextViewBinding;->label:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;->infoLabel:Lcom/google/android/material/textfield/TextInputLayout;

    .line 34
    iget-object p1, p1, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneTextViewBinding;->textEntry:Lcom/google/android/material/textfield/TextInputEditText;

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;->textEntryView:Lcom/google/android/material/textfield/TextInputEditText;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 15
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final getInfoLabel$3ds2sdk_release()Lcom/google/android/material/textfield/TextInputLayout;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;->infoLabel:Lcom/google/android/material/textfield/TextInputLayout;

    return-object v0
.end method

.method public final getTextEntryView$3ds2sdk_release()Lcom/google/android/material/textfield/TextInputEditText;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;->textEntryView:Lcom/google/android/material/textfield/TextInputEditText;

    return-object v0
.end method

.method public getUserEntry()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;->textEntryView:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string v0, ""

    :cond_1
    return-object v0
.end method

.method public final setText(Ljava/lang/String;)V
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;->textEntryView:Lcom/google/android/material/textfield/TextInputEditText;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/TextInputEditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTextBoxCustomization(Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;)V
    .locals 3

    if-nez p1, :cond_0

    goto :goto_1

    .line 50
    :cond_0
    invoke-interface {p1}, Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;->getTextColor()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 51
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;->textEntryView:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/google/android/material/textfield/TextInputEditText;->setTextColor(I)V

    .line 54
    :cond_1
    invoke-interface {p1}, Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;->getTextFontSize()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-lez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x2

    if-eqz v0, :cond_3

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 55
    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;->textEntryView:Lcom/google/android/material/textfield/TextInputEditText;

    int-to-float v0, v0

    invoke-virtual {v2, v1, v0}, Lcom/google/android/material/textfield/TextInputEditText;->setTextSize(IF)V

    .line 58
    :cond_3
    invoke-interface {p1}, Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;->getCornerRadius()I

    move-result v0

    if-ltz v0, :cond_4

    .line 59
    invoke-interface {p1}, Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;->getCornerRadius()I

    move-result v0

    int-to-float v0, v0

    .line 60
    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;->infoLabel:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v2, v0, v0, v0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxCornerRadii(FFFF)V

    .line 63
    :cond_4
    invoke-interface {p1}, Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;->getBorderColor()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 64
    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;->infoLabel:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v2, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxBackgroundMode(I)V

    .line 65
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;->infoLabel:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxStrokeColor(I)V

    .line 68
    :cond_5
    invoke-interface {p1}, Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;->getHintTextColor()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 69
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;->infoLabel:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setDefaultHintTextColor(Landroid/content/res/ColorStateList;)V

    :cond_6
    :goto_1
    return-void
.end method

.method public final setTextEntryLabel(Ljava/lang/String;)V
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;->infoLabel:Lcom/google/android/material/textfield/TextInputLayout;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method
