.class public final synthetic Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Landroidx/compose/runtime/State;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/runtime/State;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1$$ExternalSyntheticLambda0;->f$0:Landroidx/compose/runtime/State;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1$$ExternalSyntheticLambda0;->f$0:Landroidx/compose/runtime/State;

    check-cast p1, Landroidx/compose/material/ModalBottomSheetValue;

    invoke-static {v0, p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1;->$r8$lambda$nee2HWh4QZ2GVMGFxSKnNl-pQEY(Landroidx/compose/runtime/State;Landroidx/compose/material/ModalBottomSheetValue;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
