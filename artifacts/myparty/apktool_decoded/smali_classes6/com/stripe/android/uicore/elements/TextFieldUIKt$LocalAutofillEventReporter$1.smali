.class final synthetic Lcom/stripe/android/uicore/elements/TextFieldUIKt$LocalAutofillEventReporter$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "TextFieldUI.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/TextFieldUIKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/jvm/functions/Function1<",
        "-",
        "Ljava/lang/String;",
        "+",
        "Lkotlin/Unit;",
        ">;>;"
    }
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
.field public static final INSTANCE:Lcom/stripe/android/uicore/elements/TextFieldUIKt$LocalAutofillEventReporter$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$LocalAutofillEventReporter$1;

    invoke-direct {v0}, Lcom/stripe/android/uicore/elements/TextFieldUIKt$LocalAutofillEventReporter$1;-><init>()V

    sput-object v0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$LocalAutofillEventReporter$1;->INSTANCE:Lcom/stripe/android/uicore/elements/TextFieldUIKt$LocalAutofillEventReporter$1;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const-class v2, Lcom/stripe/android/uicore/elements/TextFieldUIKt;

    const-string v4, "defaultAutofillEventReporter()Lkotlin/jvm/functions/Function1;"

    const/4 v5, 0x1

    const/4 v1, 0x0

    const-string v3, "defaultAutofillEventReporter"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 84
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/TextFieldUIKt$LocalAutofillEventReporter$1;->invoke()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 84
    invoke-static {}, Lcom/stripe/android/uicore/elements/TextFieldUIKt;->access$defaultAutofillEventReporter()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method
