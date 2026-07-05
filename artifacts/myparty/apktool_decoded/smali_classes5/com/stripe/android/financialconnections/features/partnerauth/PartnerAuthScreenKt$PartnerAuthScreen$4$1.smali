.class final synthetic Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$4$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "PartnerAuthScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt;->PartnerAuthScreen(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZLandroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;",
        "Lkotlin/Unit;",
        ">;"
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


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-class v3, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    const-string v5, "onWebAuthFlowFinished(Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;)V"

    const/4 v6, 0x0

    const/4 v1, 0x1

    const-string v4, "onWebAuthFlowFinished"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 29
    check-cast p1, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$4$1;->invoke(Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$4$1;->receiver:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    invoke-virtual {v0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->onWebAuthFlowFinished(Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;)V

    return-void
.end method
