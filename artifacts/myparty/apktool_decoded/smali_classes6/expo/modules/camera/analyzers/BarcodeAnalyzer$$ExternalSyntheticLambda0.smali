.class public final synthetic Lexpo/modules/camera/analyzers/BarcodeAnalyzer$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lexpo/modules/camera/analyzers/BarcodeAnalyzer;

.field public final synthetic f$1:Landroidx/camera/core/ImageProxy;


# direct methods
.method public synthetic constructor <init>(Lexpo/modules/camera/analyzers/BarcodeAnalyzer;Landroidx/camera/core/ImageProxy;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lexpo/modules/camera/analyzers/BarcodeAnalyzer$$ExternalSyntheticLambda0;->f$0:Lexpo/modules/camera/analyzers/BarcodeAnalyzer;

    iput-object p2, p0, Lexpo/modules/camera/analyzers/BarcodeAnalyzer$$ExternalSyntheticLambda0;->f$1:Landroidx/camera/core/ImageProxy;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lexpo/modules/camera/analyzers/BarcodeAnalyzer$$ExternalSyntheticLambda0;->f$0:Lexpo/modules/camera/analyzers/BarcodeAnalyzer;

    iget-object v1, p0, Lexpo/modules/camera/analyzers/BarcodeAnalyzer$$ExternalSyntheticLambda0;->f$1:Landroidx/camera/core/ImageProxy;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, p1}, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;->$r8$lambda$Ql1VUZlTRcStAR_uTeqTeYEz8rw(Lexpo/modules/camera/analyzers/BarcodeAnalyzer;Landroidx/camera/core/ImageProxy;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
