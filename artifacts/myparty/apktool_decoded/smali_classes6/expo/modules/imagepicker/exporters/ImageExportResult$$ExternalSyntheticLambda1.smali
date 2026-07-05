.class public final synthetic Lexpo/modules/imagepicker/exporters/ImageExportResult$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Landroid/content/ContentResolver;

.field public final synthetic f$1:Lexpo/modules/imagepicker/exporters/ImageExportResult;


# direct methods
.method public synthetic constructor <init>(Landroid/content/ContentResolver;Lexpo/modules/imagepicker/exporters/ImageExportResult;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lexpo/modules/imagepicker/exporters/ImageExportResult$$ExternalSyntheticLambda1;->f$0:Landroid/content/ContentResolver;

    iput-object p2, p0, Lexpo/modules/imagepicker/exporters/ImageExportResult$$ExternalSyntheticLambda1;->f$1:Lexpo/modules/imagepicker/exporters/ImageExportResult;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lexpo/modules/imagepicker/exporters/ImageExportResult$$ExternalSyntheticLambda1;->f$0:Landroid/content/ContentResolver;

    iget-object v1, p0, Lexpo/modules/imagepicker/exporters/ImageExportResult$$ExternalSyntheticLambda1;->f$1:Lexpo/modules/imagepicker/exporters/ImageExportResult;

    invoke-static {v0, v1}, Lexpo/modules/imagepicker/exporters/ImageExportResult;->$r8$lambda$7Cem1Y_keHChYG3-Jlru7ospVe4(Landroid/content/ContentResolver;Lexpo/modules/imagepicker/exporters/ImageExportResult;)Ljava/io/ByteArrayOutputStream;

    move-result-object v0

    return-object v0
.end method
