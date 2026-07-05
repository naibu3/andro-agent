.class public final synthetic Lcom/stripe/android/uicore/elements/CheckboxFieldController$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/uicore/elements/CheckboxFieldController;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/uicore/elements/CheckboxFieldController;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/CheckboxFieldController$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/uicore/elements/CheckboxFieldController;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/CheckboxFieldController$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/uicore/elements/CheckboxFieldController;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, p1}, Lcom/stripe/android/uicore/elements/CheckboxFieldController;->$r8$lambda$vYuZ7YcGoj_y61H4b6YSWKmj-zg(Lcom/stripe/android/uicore/elements/CheckboxFieldController;Z)Lcom/stripe/android/uicore/elements/FieldError;

    move-result-object p1

    return-object p1
.end method
