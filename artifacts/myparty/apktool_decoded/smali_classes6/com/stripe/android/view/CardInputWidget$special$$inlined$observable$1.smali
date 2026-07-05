.class public final Lcom/stripe/android/view/CardInputWidget$special$$inlined$observable$1;
.super Lkotlin/properties/ObservableProperty;
.source "Delegates.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/CardInputWidget;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/properties/ObservableProperty<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n+ 2 CardInputWidget.kt\ncom/stripe/android/view/CardInputWidget\n*L\n1#1,34:1\n299#2,19:35\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\u0008\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014\u00a2\u0006\u0002\u0010\u0008\u00a8\u0006\t\u00b8\u0006\u0000"
    }
    d2 = {
        "kotlin/properties/Delegates$observable$1",
        "Lkotlin/properties/ObservableProperty;",
        "afterChange",
        "",
        "property",
        "Lkotlin/reflect/KProperty;",
        "oldValue",
        "newValue",
        "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V",
        "kotlin-stdlib"
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
.field final synthetic this$0:Lcom/stripe/android/view/CardInputWidget;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lcom/stripe/android/view/CardInputWidget;)V
    .locals 0

    iput-object p2, p0, Lcom/stripe/android/view/CardInputWidget$special$$inlined$observable$1;->this$0:Lcom/stripe/android/view/CardInputWidget;

    .line 33
    invoke-direct {p0, p1}, Lkotlin/properties/ObservableProperty;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected afterChange(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/KProperty<",
            "*>;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    .line 36
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget$special$$inlined$observable$1;->this$0:Lcom/stripe/android/view/CardInputWidget;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeEditText$payments_core_release()Lcom/stripe/android/view/PostalCodeEditText;

    move-result-object p1

    const/4 p3, 0x1

    invoke-virtual {p1, p3}, Lcom/stripe/android/view/PostalCodeEditText;->setEnabled(Z)V

    .line 37
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget$special$$inlined$observable$1;->this$0:Lcom/stripe/android/view/CardInputWidget;

    invoke-static {p1}, Lcom/stripe/android/view/CardInputWidget;->access$getPostalCodeTextInputLayout$p(Lcom/stripe/android/view/CardInputWidget;)Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/material/textfield/TextInputLayout;->setVisibility(I)V

    .line 39
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget$special$$inlined$observable$1;->this$0:Lcom/stripe/android/view/CardInputWidget;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardInputWidget;->getCvcEditText$payments_core_release()Lcom/stripe/android/view/CvcEditText;

    move-result-object p1

    const/4 p2, 0x5

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/CvcEditText;->setImeOptions(I)V

    .line 42
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget$special$$inlined$observable$1;->this$0:Lcom/stripe/android/view/CardInputWidget;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeEditText$payments_core_release()Lcom/stripe/android/view/PostalCodeEditText;

    move-result-object p1

    iget-object p2, p0, Lcom/stripe/android/view/CardInputWidget$special$$inlined$observable$1;->this$0:Lcom/stripe/android/view/CardInputWidget;

    invoke-static {p2}, Lcom/stripe/android/view/CardInputWidget;->access$getCardValidTextWatcher$p(Lcom/stripe/android/view/CardInputWidget;)Lcom/stripe/android/view/CardInputWidget$cardValidTextWatcher$1;

    move-result-object p2

    check-cast p2, Landroid/text/TextWatcher;

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/PostalCodeEditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 43
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget$special$$inlined$observable$1;->this$0:Lcom/stripe/android/view/CardInputWidget;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeEditText$payments_core_release()Lcom/stripe/android/view/PostalCodeEditText;

    move-result-object p1

    iget-object p2, p0, Lcom/stripe/android/view/CardInputWidget$special$$inlined$observable$1;->this$0:Lcom/stripe/android/view/CardInputWidget;

    invoke-static {p2}, Lcom/stripe/android/view/CardInputWidget;->access$getCardValidTextWatcher$p(Lcom/stripe/android/view/CardInputWidget;)Lcom/stripe/android/view/CardInputWidget$cardValidTextWatcher$1;

    move-result-object p2

    check-cast p2, Landroid/text/TextWatcher;

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/PostalCodeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_0

    .line 45
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget$special$$inlined$observable$1;->this$0:Lcom/stripe/android/view/CardInputWidget;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeEditText$payments_core_release()Lcom/stripe/android/view/PostalCodeEditText;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/PostalCodeEditText;->setEnabled(Z)V

    .line 46
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget$special$$inlined$observable$1;->this$0:Lcom/stripe/android/view/CardInputWidget;

    invoke-static {p1}, Lcom/stripe/android/view/CardInputWidget;->access$getPostalCodeTextInputLayout$p(Lcom/stripe/android/view/CardInputWidget;)Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Lcom/google/android/material/textfield/TextInputLayout;->setVisibility(I)V

    .line 48
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget$special$$inlined$observable$1;->this$0:Lcom/stripe/android/view/CardInputWidget;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardInputWidget;->getCvcEditText$payments_core_release()Lcom/stripe/android/view/CvcEditText;

    move-result-object p1

    const/4 p2, 0x6

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/CvcEditText;->setImeOptions(I)V

    .line 50
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget$special$$inlined$observable$1;->this$0:Lcom/stripe/android/view/CardInputWidget;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeEditText$payments_core_release()Lcom/stripe/android/view/PostalCodeEditText;

    move-result-object p1

    iget-object p2, p0, Lcom/stripe/android/view/CardInputWidget$special$$inlined$observable$1;->this$0:Lcom/stripe/android/view/CardInputWidget;

    invoke-static {p2}, Lcom/stripe/android/view/CardInputWidget;->access$getCardValidTextWatcher$p(Lcom/stripe/android/view/CardInputWidget;)Lcom/stripe/android/view/CardInputWidget$cardValidTextWatcher$1;

    move-result-object p2

    check-cast p2, Landroid/text/TextWatcher;

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/PostalCodeEditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 52
    :goto_0
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget$special$$inlined$observable$1;->this$0:Lcom/stripe/android/view/CardInputWidget;

    invoke-static {p1}, Lcom/stripe/android/view/CardInputWidget;->access$updatePostalRequired(Lcom/stripe/android/view/CardInputWidget;)V

    return-void
.end method
