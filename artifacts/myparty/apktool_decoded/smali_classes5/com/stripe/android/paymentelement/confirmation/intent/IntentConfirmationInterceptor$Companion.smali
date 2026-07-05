.class public final Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$Companion;
.super Ljava/lang/Object;
.source "IntentConfirmationInterceptor.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$Companion;",
        "",
        "<init>",
        "()V",
        "createIntentCallback",
        "Lcom/stripe/android/paymentsheet/CreateIntentCallback;",
        "getCreateIntentCallback",
        "()Lcom/stripe/android/paymentsheet/CreateIntentCallback;",
        "setCreateIntentCallback",
        "(Lcom/stripe/android/paymentsheet/CreateIntentCallback;)V",
        "COMPLETE_WITHOUT_CONFIRMING_INTENT",
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
.field static final synthetic $$INSTANCE:Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$Companion;

.field public static final COMPLETE_WITHOUT_CONFIRMING_INTENT:Ljava/lang/String; = "COMPLETE_WITHOUT_CONFIRMING_INTENT"

.field private static createIntentCallback:Lcom/stripe/android/paymentsheet/CreateIntentCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$Companion;

    invoke-direct {v0}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$Companion;->$$INSTANCE:Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCreateIntentCallback()Lcom/stripe/android/paymentsheet/CreateIntentCallback;
    .locals 1

    .line 108
    sget-object v0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$Companion;->createIntentCallback:Lcom/stripe/android/paymentsheet/CreateIntentCallback;

    return-object v0
.end method

.method public final setCreateIntentCallback(Lcom/stripe/android/paymentsheet/CreateIntentCallback;)V
    .locals 0

    .line 108
    sput-object p1, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$Companion;->createIntentCallback:Lcom/stripe/android/paymentsheet/CreateIntentCallback;

    return-void
.end method
