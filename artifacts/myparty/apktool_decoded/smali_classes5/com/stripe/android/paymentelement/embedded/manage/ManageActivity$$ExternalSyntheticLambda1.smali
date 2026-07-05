.class public final synthetic Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

.field public final synthetic f$1:Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;

.field public final synthetic f$2:Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;

.field public final synthetic f$3:I


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$$ExternalSyntheticLambda1;->f$0:Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$$ExternalSyntheticLambda1;->f$1:Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;

    iput-object p3, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$$ExternalSyntheticLambda1;->f$2:Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;

    iput p4, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$$ExternalSyntheticLambda1;->f$3:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$$ExternalSyntheticLambda1;->f$0:Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$$ExternalSyntheticLambda1;->f$1:Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;

    iget-object v2, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$$ExternalSyntheticLambda1;->f$2:Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;

    iget v3, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$$ExternalSyntheticLambda1;->f$3:I

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->$r8$lambda$1woncNfXaMDIlVo-o8QhQ2mPbIo(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
