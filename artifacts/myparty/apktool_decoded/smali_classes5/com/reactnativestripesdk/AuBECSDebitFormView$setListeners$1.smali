.class public final Lcom/reactnativestripesdk/AuBECSDebitFormView$setListeners$1;
.super Ljava/lang/Object;
.source "AuBECSDebitFormView.kt"

# interfaces
.implements Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativestripesdk/AuBECSDebitFormView;->setListeners()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAuBECSDebitFormView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuBECSDebitFormView.kt\ncom/reactnativestripesdk/AuBECSDebitFormView$setListeners$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/reactnativestripesdk/AuBECSDebitFormView$setListeners$1",
        "Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;",
        "onInputChanged",
        "",
        "isValid",
        "",
        "stripe_stripe-react-native_release"
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
.field final synthetic this$0:Lcom/reactnativestripesdk/AuBECSDebitFormView;


# direct methods
.method constructor <init>(Lcom/reactnativestripesdk/AuBECSDebitFormView;)V
    .locals 0

    iput-object p1, p0, Lcom/reactnativestripesdk/AuBECSDebitFormView$setListeners$1;->this$0:Lcom/reactnativestripesdk/AuBECSDebitFormView;

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInputChanged(Z)V
    .locals 1

    .line 115
    iget-object p1, p0, Lcom/reactnativestripesdk/AuBECSDebitFormView$setListeners$1;->this$0:Lcom/reactnativestripesdk/AuBECSDebitFormView;

    invoke-static {p1}, Lcom/reactnativestripesdk/AuBECSDebitFormView;->access$getBecsDebitWidget$p(Lcom/reactnativestripesdk/AuBECSDebitFormView;)Lcom/stripe/android/view/BecsDebitWidget;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "becsDebitWidget"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p1}, Lcom/stripe/android/view/BecsDebitWidget;->getParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/reactnativestripesdk/AuBECSDebitFormView$setListeners$1;->this$0:Lcom/reactnativestripesdk/AuBECSDebitFormView;

    invoke-virtual {v0, p1}, Lcom/reactnativestripesdk/AuBECSDebitFormView;->onFormChanged(Lcom/stripe/android/model/PaymentMethodCreateParams;)V

    :cond_1
    return-void
.end method
