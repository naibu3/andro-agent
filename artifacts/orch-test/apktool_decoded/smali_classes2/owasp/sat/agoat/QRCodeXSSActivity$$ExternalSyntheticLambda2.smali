.class public final synthetic Lowasp/sat/agoat/QRCodeXSSActivity$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lcom/google/zxing/Result;

.field public final synthetic f$1:Landroid/webkit/WebView;

.field public final synthetic f$2:Lowasp/sat/agoat/QRCodeXSSActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/google/zxing/Result;Landroid/webkit/WebView;Lowasp/sat/agoat/QRCodeXSSActivity;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lowasp/sat/agoat/QRCodeXSSActivity$$ExternalSyntheticLambda2;->f$0:Lcom/google/zxing/Result;

    iput-object p2, p0, Lowasp/sat/agoat/QRCodeXSSActivity$$ExternalSyntheticLambda2;->f$1:Landroid/webkit/WebView;

    iput-object p3, p0, Lowasp/sat/agoat/QRCodeXSSActivity$$ExternalSyntheticLambda2;->f$2:Lowasp/sat/agoat/QRCodeXSSActivity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 0
    iget-object v0, p0, Lowasp/sat/agoat/QRCodeXSSActivity$$ExternalSyntheticLambda2;->f$0:Lcom/google/zxing/Result;

    iget-object v1, p0, Lowasp/sat/agoat/QRCodeXSSActivity$$ExternalSyntheticLambda2;->f$1:Landroid/webkit/WebView;

    iget-object v2, p0, Lowasp/sat/agoat/QRCodeXSSActivity$$ExternalSyntheticLambda2;->f$2:Lowasp/sat/agoat/QRCodeXSSActivity;

    invoke-static {v0, v1, v2}, Lowasp/sat/agoat/QRCodeXSSActivity;->$r8$lambda$JQLvoihB8g4oqQlDamxnC47ScWA(Lcom/google/zxing/Result;Landroid/webkit/WebView;Lowasp/sat/agoat/QRCodeXSSActivity;)V

    return-void
.end method
