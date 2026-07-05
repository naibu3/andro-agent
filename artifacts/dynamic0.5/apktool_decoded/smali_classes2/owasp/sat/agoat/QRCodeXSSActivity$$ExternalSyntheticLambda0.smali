.class public final synthetic Lowasp/sat/agoat/QRCodeXSSActivity$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lcom/budiyev/android/codescanner/DecodeCallback;


# instance fields
.field public final synthetic f$0:Lowasp/sat/agoat/QRCodeXSSActivity;

.field public final synthetic f$1:Landroid/webkit/WebView;


# direct methods
.method public synthetic constructor <init>(Lowasp/sat/agoat/QRCodeXSSActivity;Landroid/webkit/WebView;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lowasp/sat/agoat/QRCodeXSSActivity$$ExternalSyntheticLambda0;->f$0:Lowasp/sat/agoat/QRCodeXSSActivity;

    iput-object p2, p0, Lowasp/sat/agoat/QRCodeXSSActivity$$ExternalSyntheticLambda0;->f$1:Landroid/webkit/WebView;

    return-void
.end method


# virtual methods
.method public final onDecoded(Lcom/google/zxing/Result;)V
    .locals 2

    .line 0
    iget-object v0, p0, Lowasp/sat/agoat/QRCodeXSSActivity$$ExternalSyntheticLambda0;->f$0:Lowasp/sat/agoat/QRCodeXSSActivity;

    iget-object v1, p0, Lowasp/sat/agoat/QRCodeXSSActivity$$ExternalSyntheticLambda0;->f$1:Landroid/webkit/WebView;

    invoke-static {v0, v1, p1}, Lowasp/sat/agoat/QRCodeXSSActivity;->$r8$lambda$fcNeA8-U58eGK8neKV4MAeIHYcA(Lowasp/sat/agoat/QRCodeXSSActivity;Landroid/webkit/WebView;Lcom/google/zxing/Result;)V

    return-void
.end method
