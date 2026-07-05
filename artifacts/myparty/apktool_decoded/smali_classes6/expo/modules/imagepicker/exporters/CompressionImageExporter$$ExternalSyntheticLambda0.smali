.class public final synthetic Lexpo/modules/imagepicker/exporters/CompressionImageExporter$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Ljava/io/File;

.field public final synthetic f$1:Landroid/graphics/Bitmap;

.field public final synthetic f$2:Landroid/graphics/Bitmap$CompressFormat;

.field public final synthetic f$3:Lexpo/modules/imagepicker/exporters/CompressionImageExporter;


# direct methods
.method public synthetic constructor <init>(Ljava/io/File;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;Lexpo/modules/imagepicker/exporters/CompressionImageExporter;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$$ExternalSyntheticLambda0;->f$0:Ljava/io/File;

    iput-object p2, p0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$$ExternalSyntheticLambda0;->f$1:Landroid/graphics/Bitmap;

    iput-object p3, p0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$$ExternalSyntheticLambda0;->f$2:Landroid/graphics/Bitmap$CompressFormat;

    iput-object p4, p0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$$ExternalSyntheticLambda0;->f$3:Lexpo/modules/imagepicker/exporters/CompressionImageExporter;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 0
    iget-object v0, p0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$$ExternalSyntheticLambda0;->f$0:Ljava/io/File;

    iget-object v1, p0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$$ExternalSyntheticLambda0;->f$1:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$$ExternalSyntheticLambda0;->f$2:Landroid/graphics/Bitmap$CompressFormat;

    iget-object v3, p0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$$ExternalSyntheticLambda0;->f$3:Lexpo/modules/imagepicker/exporters/CompressionImageExporter;

    invoke-static {v0, v1, v2, v3}, Lexpo/modules/imagepicker/exporters/CompressionImageExporter;->$r8$lambda$v5YD9M_-pN-puIW-nCt2Wk3_ZNI(Ljava/io/File;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;Lexpo/modules/imagepicker/exporters/CompressionImageExporter;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
